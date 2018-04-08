package at.andreasfend.stex.parser;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.core.OperationType;
import at.andreasfend.stex.parser.antlr4.StexgrammarBaseVisitor;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ArrayContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ArrayaccessContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.AssignstatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.DerefContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ExpressionContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ExpressionopContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.FunctionContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.FunctioncallContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.FunctionlistContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.IfstatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.NotoperationContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ObjectContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ObjectfieldContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.OperationContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ProgramContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.RefContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ReturnstatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.StatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ThrowstatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.TrystatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.VarstatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.WhilestatementContext;

public class StexVisitor extends StexgrammarBaseVisitor<List<Instruction>> {

	private int tmpVarIndex = 0;

	private String tmpVar() {
		return "_tmp" + tmpVarIndex;
	}

	public Operand getExpressionOperand(ExpressionContext exp) {
		if (exp == null || exp.operand() == null)
			return null;
		Type t = exp.operand().identifier() == null ? Type.VAL : Type.ID;
		return new Operand(exp.operand().getText(), t);
	}

	public Operand getExpressionopOperand(ExpressionopContext exp) {
		if (exp == null || exp.operand() == null)
			return null;
		Type t = exp.operand().identifier() == null ? Type.VAL : Type.ID;
		return new Operand(exp.operand().getText(), t);
	}

	@Override
	public List<Instruction> visitFunctionlist(FunctionlistContext ctx) {
		List<Instruction> ins = new LinkedList<>();
		for (FunctionContext fc : ctx.function()) {
			List<Instruction> child = visitChildren(fc);
			child = visitFunction(fc);
			if(child != null)
				ins.addAll(child);
		}
		return ins;
	}
	
	@Override
	public List<Instruction> visitFunction(FunctionContext ctx) {

		List<Instruction> ins = new LinkedList<>();

		String name = ctx.getChild(0).getText();
		List<String> args = new LinkedList<>();
		{
			int i = 0;
			while (i < ctx.getChild(2).getChildCount()) {
				args.add(ctx.getChild(2).getChild(i).getText());
				i += 2;
			}
		}

		// Mark the head of the function with the metadata
		ins.add(new Instruction(OperationType.NOP, new Operand(args, Type.TMP), null, name));

		// Make all statements of the function
		List<Instruction> stmtIns = new LinkedList<>();
		int maxTmpVar = 0;
		for (StatementContext stmt : ctx.statement()) {
			tmpVarIndex = 0;
			stmtIns.addAll(visitChildren(stmt));
			if(tmpVarIndex > maxTmpVar)
				maxTmpVar = tmpVarIndex;
		}
		
		// checkMaxTmp Var
		int checkMax = 0;
		for (Instruction istr: stmtIns) {
			if(istr.getOp() != OperationType.VAR && istr.getTarget() != null &&
					istr.getTarget().startsWith("_tmp")) {
				int varIndex = Integer.parseInt(istr.getTarget().substring(4));
				if(varIndex > checkMax)
					checkMax = varIndex;
			}
		}
		maxTmpVar = checkMax;
		
		// Make the needed tmpVars
		for (int i = 0; i < maxTmpVar; i++) {
			tmpVarIndex = i;
			String target = tmpVar();
			ins.add(new Instruction(OperationType.VAR, null, null, target));
		}
		
		// Add statements
		ins.addAll(stmtIns);
		
		return ins;
	}

	@Override
	public List<Instruction> visitThrowstatement(ThrowstatementContext ctx) {

		List<Instruction> ins = new LinkedList<>();

		Operand op = getExpressionOperand(ctx.expression());
		if (op == null) {
			List<Instruction> child = visitChildren(ctx.expression());
			ins.addAll(child);
			op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
		}

		ins.add(new Instruction(OperationType.THROW, op, null, null));

		return ins;
	}

	@Override
	public List<Instruction> visitReturnstatement(ReturnstatementContext ctx) {
		List<Instruction> ins = new LinkedList<>();

		if(ctx.expression() == null) {
			ins.add(new Instruction(OperationType.RET, null, null, null));
			return ins;
		}
		
		Operand op = getExpressionOperand(ctx.expression());
		if (op == null) {
			List<Instruction> child = visitChildren(ctx.expression());
			ins.addAll(child);
			op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
		}

		ins.add(new Instruction(OperationType.RET, op, null, null));

		return ins;
	}

	@Override
	public List<Instruction> visitIfstatement(IfstatementContext ctx) {

		List<Instruction> ins = new LinkedList<>();

		Object endIf = new Object();
		Object startThen = new Object();
		Object startElse = new Object();

		// Condition
		Operand op = getExpressionOperand(ctx.expression());
		if (op == null) {
			List<Instruction> child = visitChildren(ctx.expression());
			ins.addAll(child);
			op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
		}
		
		// CMP
		ins.add(new Instruction(OperationType.CMP, op, new Operand(startThen, Type.TMP),
				null));

		// CMP is wrong, so go to else if exists; else to endIf
		if (ctx.elseblock() != null) {
			ins.add(new Instruction(OperationType.JMP, new Operand(startElse, Type.TMP), null, null));
		} else {
			ins.add(new Instruction(OperationType.JMP, new Operand(endIf, Type.TMP), null, null));
		}

		// Now mark the thenStart
		ins.add(new Instruction(OperationType.NOP, new Operand(startThen, Type.TMP), null, null));
		ins.add(new Instruction(OperationType.BLOCK, null, null, null));

		// Make all the IfThen-Statements
		int maxTmpVar = 0;
		for (StatementContext stmt : ctx.statement()) {
			tmpVarIndex = 0;
			ins.addAll(visitChildren(stmt));
			if(tmpVarIndex > maxTmpVar)
				tmpVarIndex = maxTmpVar;
		}

		// if there is a else block -> jump to end of if
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		if (ctx.elseblock() != null) {
			ins.add(new Instruction(OperationType.JMP, new Operand(endIf, Type.TMP), null, null));
		}

		// if there is a else block -> mark startElse and make all the Else-Statements
		if (ctx.elseblock() != null) {
			ins.add(new Instruction(OperationType.NOP, new Operand(startElse, Type.TMP), null, null));
			ins.add(new Instruction(OperationType.BLOCK, null, null, null));
			// Make the If-Statements
			for (StatementContext stmt : ctx.elseblock().statement()) {
				tmpVarIndex = 0;
				ins.addAll(visitChildren(stmt));
				if(tmpVarIndex > maxTmpVar)
					tmpVarIndex = maxTmpVar;
			}
			ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		}

		// Mark the end of the IF
		ins.add(new Instruction(OperationType.NOP, new Operand(endIf, Type.TMP), null, null));

		// Set the maximum of TmpVars
		tmpVarIndex = maxTmpVar;
		
		return ins;
	}

	@Override
	public List<Instruction> visitTrystatement(TrystatementContext ctx) {

		List<Instruction> ins = new LinkedList<>();

		Object endTry = new Object();
		Object startCatch = new Object();

		String expId = ctx.catchblock().getChild(2).getText();

		// Enter Try-Block
		ins.add(new Instruction(OperationType.TRYCATCH, new Operand(startCatch, Type.TMP), null, expId));

		// Make all the Try-Statements
		int maxTmpVar = 0;
		for (StatementContext stmt : ctx.statement()) {
			tmpVarIndex = 0;
			ins.addAll(visitChildren(stmt));
			if(tmpVarIndex > maxTmpVar)
				tmpVarIndex = maxTmpVar;
		}

		// Leave Try and jump to end of block
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		ins.add(new Instruction(OperationType.JMP, new Operand(endTry, Type.TMP), null, null));

		// Mark the start of the Catch-Block
		ins.add(new Instruction(OperationType.NOP, new Operand(startCatch, Type.TMP), null, null));

		// Make all the Try-Statements
		for (StatementContext stmt : ctx.catchblock().statement()) {
			tmpVarIndex = 0;
			ins.addAll(visitChildren(stmt));
			if(tmpVarIndex > maxTmpVar)
				tmpVarIndex = maxTmpVar;
		}

		// Leave Catch-Block
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));

		// Set the maximum of TmpVars
		tmpVarIndex = maxTmpVar;
		
		return ins;
	}

	@Override
	public List<Instruction> visitWhilestatement(WhilestatementContext ctx) {

		List<Instruction> ins = new LinkedList<>();

		Object headWhile = new Object();
		Object bodyWhile = new Object();
		Object endWhile = new Object();

		// Mark Head
		ins.add(new Instruction(OperationType.NOP, new Operand(headWhile, Type.TMP), null, null));

		// Condition
		Operand condition = getExpressionOperand(ctx.expression());
		if (condition == null) {
			List<Instruction> child = visitChildren(ctx.expression());
			ins.addAll(child);
			condition = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
		}
		
		// CMP
		ins.add(new Instruction(OperationType.CMP, condition, new Operand(bodyWhile, Type.TMP),
				null));
		ins.add(new Instruction(OperationType.JMP, new Operand(endWhile, Type.TMP), null, null));

		// Mark Body
		ins.add(new Instruction(OperationType.NOP, new Operand(bodyWhile, Type.TMP), null, null));

		// Make While-Statements
		int maxTmpVar = 0;
		for (StatementContext stmt : ctx.statement()) {
			tmpVarIndex = 0;
			ins.addAll(visitChildren(stmt));
			if(tmpVarIndex > maxTmpVar)
				tmpVarIndex = maxTmpVar;
		}

		// Jump back to the WhileHead
		ins.add(new Instruction(OperationType.JMP, new Operand(headWhile, Type.TMP), null, null));

		// Mark EndWhile
		ins.add(new Instruction(OperationType.NOP, new Operand(endWhile, Type.TMP), null, null));

		// Set the maximum of TmpVars
		tmpVarIndex = maxTmpVar;
		
		return ins;
	}

	@Override
	public List<Instruction> visitAssignstatement(AssignstatementContext ctx) {
		List<Instruction> ins = new LinkedList<>();
		
		Operand op = getExpressionOperand(ctx.expression());
		boolean isSimpleAssignment = true;
		if(op == null) {
			isSimpleAssignment = false;
			List<Instruction> child = visitChildren(ctx.expression());
			ins.addAll(child);
			op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
		}
		
		if(ctx.assignee().identifier() != null) {
			String target = ctx.assignee().identifier().getText();
			if(isSimpleAssignment)
				ins.add(new Instruction(OperationType.ASSIGN, op, null, target));
			else
				ins.get(ins.size()-1).setTarget(target);
		}
		else if(ctx.assignee().deref() != null) {
			String target = ctx.assignee().deref().identifier().getText();
			ins.add(new Instruction(OperationType.WREF, op, null, target));
		}
		else if(ctx.assignee().arrayaccess() != null) {
			String target = ctx.assignee().arrayaccess().identifier().getText();
			Operand index = getExpressionOperand(ctx.assignee().arrayaccess().expression());
			if(index == null) {
				List<Instruction> child = visitChildren(ctx.assignee().arrayaccess().expression());
				ins.addAll(child);
				index = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.WARRAY, op, index, target));
		}
		
		return ins;
	}
	
	@Override
	public List<Instruction> visitVarstatement(VarstatementContext ctx) {
		List<Instruction> ins = new LinkedList<>();
		
		if(ctx.expression() == null) {
			ins.add(new Instruction(OperationType.VAR, null, null, ctx.ID().getText()));
			return ins;
		}
		
		Operand op = getExpressionOperand(ctx.expression());
		if (op == null) {
			ins.add(new Instruction(OperationType.VAR, null, null, ctx.ID().getText()));
			List<Instruction> child = visitChildren(ctx.expression());
			ins.addAll(child);
			child.get(child.size() - 1).setTarget(ctx.ID().getText());
		}
		else {
			ins.add(new Instruction(OperationType.VAR, op, null, ctx.ID().getText()));
		}
				
		return ins;
	}

	@Override
	public List<Instruction> visitDeref(DerefContext ctx) { // Finished
		List<Instruction> ins = new LinkedList<>();
		Operand op = new Operand(ctx.identifier().getText(), Type.ID);
		ins.add(new Instruction(OperationType.RREF, op, null, tmpVar()));
		tmpVarIndex++;
		return ins;
	}

	@Override
	public List<Instruction> visitOperation(OperationContext ctx) { // Finished
		List<Instruction> ins = new LinkedList<>();

		if (ctx.notoperation() != null) {
			return visitChildren(ctx.notoperation());
		}

		OperationType op = OperationType.NOT;

		Operand op1 = getExpressionopOperand(ctx.expressionop());
		if (op1 == null) {
			List<Instruction> child = visitChildren(ctx.expressionop());
			ins.addAll(child);
			op1 = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
		}

		Operand op2 = getExpressionOperand(ctx.expression());
		if (op2 == null) {
			List<Instruction> child = visitChildren(ctx.expression());
			ins.addAll(child);
			op2 = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
		}

		if (ctx.operationtype().getText().equals("+")) {
			op = OperationType.ADD;
		} else if (ctx.operationtype().getText().equals("-")) {
			op = OperationType.SUB;
		} else if (ctx.operationtype().getText().equals("*")) {
			op = OperationType.MUL;
		} else if (ctx.operationtype().getText().equals("/")) {
			op = OperationType.DIV;
		} else if (ctx.operationtype().getText().equals("%")) {
			op = OperationType.MOD;
		} else if (ctx.operationtype().getText().equals("==")) {
			op = OperationType.EQUALS;
		} else if (ctx.operationtype().getText().equals("!=")) {
			op = OperationType.NOTEQUALS;
		} else if (ctx.operationtype().getText().equals(">")) {
			op = OperationType.BIGGER;
		} else if (ctx.operationtype().getText().equals("<")) {
			op = OperationType.SMALLER;
		} else if (ctx.operationtype().getText().equals("in")) {
			op = OperationType.IN;
		} else if (ctx.operationtype().getText().equals("and")) {
			op = OperationType.AND;
		} else if (ctx.operationtype().getText().equals("or")) {
			op = OperationType.OR;
		}

		ins.add(new Instruction(op, op1, op2, tmpVar()));
		tmpVarIndex++;

		return ins;
	}

	@Override
	public List<Instruction> visitNotoperation(NotoperationContext ctx) { // Finished
		List<Instruction> ins = new LinkedList<>();

		Operand op = getExpressionOperand(ctx.expression());
		if (op == null) {
			List<Instruction> child = visitChildren(ctx.expression());
			ins.addAll(child);
			op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
		}

		ins.add(new Instruction(OperationType.NOT, op, null, tmpVar()));
		tmpVarIndex++;
		return ins;
	}

	@Override
	public List<Instruction> visitArrayaccess(ArrayaccessContext ctx) { // Finished
		List<Instruction> ins = new LinkedList<>();

		Operand op1 = new Operand(ctx.identifier().getText(), Type.ID);
		Operand op2 = getExpressionOperand(ctx.expression());
		if (op2 == null) {
			List<Instruction> child = visitChildren(ctx.expression());
			ins.addAll(child);
			op2 = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
		}

		ins.add(new Instruction(OperationType.RARRAY, op1, op2, tmpVar()));
		tmpVarIndex++;
		return ins;
	}
	
	@Override
	public List<Instruction> visitFunctioncall(FunctioncallContext ctx) {
		List<Instruction> ins = new LinkedList<>();
		List<Operand> params = new LinkedList<>();
		
		String name = ctx.ID().getText();
		
		// Check for buildIn Function
		List<Instruction> insBuiltIn = visitBuiltInFunction(ctx);
		if(insBuiltIn != null)
			return insBuiltIn;
				
		// Add all Params in op
		for(ExpressionContext exp: ctx.functioncallargs().expression()) {
			Operand op = getExpressionOperand(exp);
			if(op == null) {
				List<Instruction> child = visitChildren(exp);
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			params.add(op);
		}
		
		// Create SubStack and then add all params with target i, where i = index of params
		ins.add(new Instruction(OperationType.SUBSTACK, null, null, null));
		for (int i = 0; i < params.size(); i++) {
			Operand p = params.get(i);
			ins.add(new Instruction(OperationType.PARAMETER, p, null, name + "_" + i));
		}
		
		

		ins.add(new Instruction(OperationType.CALL, new Operand(name, Type.TMP), null, tmpVar()));
		tmpVarIndex++;
		return ins;
	}
	
	public List<Instruction> visitBuiltInFunction(FunctioncallContext ctx) {
		// TODO: Check this -> SIZE, STRUCTURE, TYPE, IOs, CONVERTs
		List<Instruction> ins = new LinkedList<>();
		String name = ctx.ID().getText();
		
		if(name.equals("size") && ctx.functioncallargs().expression().size() == 1) {
			Operand op = getExpressionOperand(ctx.functioncallargs().expression(0));
			if (op == null) {
				List<Instruction> child = visitChildren(ctx.functioncallargs().expression(0));
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.SIZE, op, null, tmpVar()));
			tmpVarIndex++;
			
		}
		else if(name.equals("structure") && ctx.functioncallargs().expression().size() == 1) {
			Operand op = getExpressionOperand(ctx.functioncallargs().expression(0));
			if (op == null) {
				List<Instruction> child = visitChildren(ctx.functioncallargs().expression(0));
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.STRUCTURE, op, null, tmpVar()));
			tmpVarIndex++;
			
		}
		else if(name.equals("type") && ctx.functioncallargs().expression().size() == 1) {
			Operand op = getExpressionOperand(ctx.functioncallargs().expression(0));
			if (op == null) {
				List<Instruction> child = visitChildren(ctx.functioncallargs().expression(0));
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.TYPE, op, null, tmpVar()));
			tmpVarIndex++;
			
		}
		else if(name.equals("int") && ctx.functioncallargs().expression().size() == 1) {
			Operand op = getExpressionOperand(ctx.functioncallargs().expression(0));
			if (op == null) {
				List<Instruction> child = visitChildren(ctx.functioncallargs().expression(0));
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.INT, op, null, tmpVar()));
			tmpVarIndex++;
			
		}
		else if(name.equals("float") && ctx.functioncallargs().expression().size() == 1) {
			Operand op = getExpressionOperand(ctx.functioncallargs().expression(0));
			if (op == null) {
				List<Instruction> child = visitChildren(ctx.functioncallargs().expression(0));
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.FLOAT, op, null, tmpVar()));
			tmpVarIndex++;
			
		}
		else if(name.equals("bool") && ctx.functioncallargs().expression().size() == 1) {
			Operand op = getExpressionOperand(ctx.functioncallargs().expression(0));
			if (op == null) {
				List<Instruction> child = visitChildren(ctx.functioncallargs().expression(0));
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.BOOL, op, null, tmpVar()));
			tmpVarIndex++;
			
		}
		else if(name.equals("string") && ctx.functioncallargs().expression().size() == 1) {
			Operand op = getExpressionOperand(ctx.functioncallargs().expression(0));
			if (op == null) {
				List<Instruction> child = visitChildren(ctx.functioncallargs().expression(0));
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.STRING, op, null, tmpVar()));
			tmpVarIndex++;
			
		}
		else if(name.equals("sysread") && ctx.functioncallargs().expression().size() == 1) {
			Operand op = getExpressionOperand(ctx.functioncallargs().expression(0));
			if (op == null) {
				List<Instruction> child = visitChildren(ctx.functioncallargs().expression(0));
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.READ, op, null, tmpVar()));
			tmpVarIndex++;
			
		}
		else if(name.equals("sysprint") && ctx.functioncallargs().expression().size() == 1) {
			Operand op = getExpressionOperand(ctx.functioncallargs().expression(0));
			if (op == null) {
				List<Instruction> child = visitChildren(ctx.functioncallargs().expression(0));
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.PRINT, op, null, null));
			tmpVarIndex++;
			
		}
		else if(name.equals("syserr") && ctx.functioncallargs().expression().size() == 1) {
			Operand op = getExpressionOperand(ctx.functioncallargs().expression(0));
			if (op == null) {
				List<Instruction> child = visitChildren(ctx.functioncallargs().expression(0));
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.ERR, op, null, null));
			tmpVarIndex++;
			
		}
		
		return null;
	}
	
	@Override
	public List<Instruction> visitRef(RefContext ctx) { // Finished
		List<Instruction> ins = new LinkedList<>();

		Operand op = new Operand(ctx.identifier().getText(), Type.ID);

		ins.add(new Instruction(OperationType.REF, op, null, tmpVar()));
		tmpVarIndex++;
		return ins;
	}
	
	@Override
	public List<Instruction> visitArray(ArrayContext ctx) { // Finished
		List<Instruction> ins = new LinkedList<>();

		int size = ctx.expression().size();
		String target = tmpVar();
		tmpVarIndex++;
		
		ins.add(new Instruction(OperationType.ARRAY, new Operand(size, Type.VAL), null, target));
		
		// Add all Eleemnts
		for (int i = 0; i < ctx.expression().size(); i++) {
			ExpressionContext exp = ctx.expression().get(i);
			Operand op = getExpressionOperand(exp);
			if(op == null) {
				List<Instruction> child = visitChildren(exp);
				ins.addAll(child);
				op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
			}
			ins.add(new Instruction(OperationType.WARRAY, op, new Operand(i, Type.VAL), target));
		}
		
		// Make sure last target is real Array ID
		ins.add(new Instruction(OperationType.NOP, null, null, target));
				
		return ins;
	}
	
	@Override
	public List<Instruction> visitObject(ObjectContext ctx) {
		List<Instruction> ins = new LinkedList<>();

		String target = tmpVar();
		tmpVarIndex++;
		ins.add(new Instruction(OperationType.OBJECT, null, null, target));
		
		// Add all fields
		for (ObjectfieldContext field: ctx.objectfield()) {
			Operand op = null;
			if(field.expression() != null) {
				op = getExpressionOperand(field.expression());
				if(op == null) {
					List<Instruction> child = visitChildren(field.expression());
					ins.addAll(child);
					op = new Operand(child.get(child.size() - 1).getTarget(), Type.ID);
				}
			}
			String attr = target + "." + field.ID().getText();
			ins.add(new Instruction(OperationType.VAR, op, null, attr));
		}
		
		// Make sure last target is real Object ID
		ins.add(new Instruction(OperationType.NOP, null, null, target));
		
		return ins;
	}
	
}
