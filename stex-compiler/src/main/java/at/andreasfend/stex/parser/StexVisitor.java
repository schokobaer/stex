package at.andreasfend.stex.parser;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.core.OperationType;
import at.andreasfend.stex.parser.antlr4.StexgrammarBaseVisitor;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.AssignstatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.FunctionContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.IfstatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ReturnstatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.StatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.ThrowstatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.TrystatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.VarstatementContext;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser.WhilestatementContext;

public class StexVisitor extends StexgrammarBaseVisitor<List<Instruction>> {

	private int layer = 0;
	private int tmpVarIndex = 0;

	private void print(String msg) {
		for (int i = 0; i < layer; i++) {
			msg = "  " + msg;
		}
		System.out.println(msg);
	}
	
	private String tmpVar() {
		return "_tmp" + tmpVarIndex;
	}

	@Override
	public List<Instruction> visitFunction(FunctionContext ctx) {
		
		List<Instruction> ins = new LinkedList<>();
		
		String name = ctx.getChild(0).getText();
		List<String> args = new LinkedList<>();
		{
			int i = 0;
			while(i < ctx.getChild(2).getChildCount()) {
				args.add(ctx.getChild(2).getChild(i).getText());
				i += 2;
			}
		}

		// Mark the head of the function with the metadata
		ins.add(new Instruction(OperationType.NOP, new Operand(args, Type.TMP), 
				null, name));
		
		return ins;
	}

	/*
	@Override
	public List<Instruction> visitThrowstatement(ThrowstatementContext ctx) {

		List<Instruction> ins = new LinkedList<>();
		
		ins.addAll(visitChildren(ctx.expression()));
		ins.add(new Instruction(OperationType.THROW, new Operand(tmpVar(), Type.ID), null, null));

		return ins;
	}
	*/
	/*
	@Override
	public List<Instruction> visitReturnstatement(ReturnstatementContext ctx) {
		List<Instruction> ins = new LinkedList<>();
		
		ins.addAll(visitChildren(ctx.expression()));
		ins.add(new Instruction(OperationType.RET, new Operand(tmpVar(), Type.ID), null, null));

		return ins;
	}
	*/

	@Override
	public List<Instruction> visitIfstatement(IfstatementContext ctx) {

		List<Instruction> ins = new LinkedList<>();
		
		Object endIf = new Object();
		Object startThen = new Object();
		Object startElse = new Object();
		
		// CMP
		String condition = visitChildren(ctx.operand()).get(0).getTarget();
		ins.add(new Instruction(OperationType.CMP, new Operand(condition, Type.ID), 
				new Operand(startThen, Type.TMP), null));
		
		// CMP is wrong, so go to else if exists; else to endIf
		if(ctx.elseblock() != null) {
			ins.add(new Instruction(OperationType.JMP, new Operand(startElse, Type.TMP), 
					null, null));
		}
		else {
			ins.add(new Instruction(OperationType.JMP, new Operand(endIf, Type.TMP), 
					null, null));
		}
		
		// Now mark the thenStart
		ins.add(new Instruction(OperationType.NOP, new Operand(startThen, Type.TMP), 
				null, null));
		ins.add(new Instruction(OperationType.BLOCK, null, null, null));
		
		// Make all the IfThen-Statements
		for (StatementContext stmt : ctx.statement()) {
			tmpVarIndex = 0;
			ins.addAll(visitChildren(stmt));
		}
		
		// if there is a else block -> jump to end of if
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		if(ctx.elseblock() != null) {
			ins.add(new Instruction(OperationType.JMP, new Operand(endIf, Type.TMP), 
					null, null));
		}
		
		// if there is a else block -> mark startElse and make all the Else-Statements
		if(ctx.elseblock() != null) {
			ins.add(new Instruction(OperationType.NOP, new Operand(startElse, Type.TMP), 
					null, null));
			ins.add(new Instruction(OperationType.BLOCK, null, null, null));
			// Make the If-Statements
			for (StatementContext stmt : ctx.elseblock().statement()) {
				tmpVarIndex = 0;
				ins.addAll(visitChildren(stmt));
			}
			ins.add(new Instruction(OperationType.LEAVE, null, null, null));
		}
		
		// Mark the end of the IF
		ins.add(new Instruction(OperationType.NOP, new Operand(endIf, Type.TMP), 
				null, null));
		

		return ins;
	}

	@Override
	public List<Instruction> visitTrystatement(TrystatementContext ctx) {

		List<Instruction> ins = new LinkedList<>();
		
		Object endTry = new Object();
		Object startCatch = new Object();
		
		String expId = ctx.catchblock().getChild(2).getText();
		
		// Enter Try-Block
		ins.add(new Instruction(OperationType.TRYCATCH, new Operand(startCatch, Type.TMP), 
				null, expId));
		
		// Make all the Try-Statements
		for (StatementContext stmt : ctx.statement()) {
			tmpVarIndex = 0;
			ins.addAll(visitChildren(stmt));
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
		}
		
		// Leave Catch-Block
		ins.add(new Instruction(OperationType.LEAVE, null, null, null));		
		
		return ins;
	}

	@Override
	public List<Instruction> visitWhilestatement(WhilestatementContext ctx) {

		List<Instruction> ins = new LinkedList<>(); 

		Object headWhile = new Object();
		Object bodyWhile = new Object();
		Object endWhile = new Object();
		
		
		String condition = visitChildren(ctx.operand()).get(0).getTarget();
		
		// Mark Head
		ins.add(new Instruction(OperationType.NOP, new Operand(headWhile, Type.TMP), 
				null, null));
		
		// CMP
		ins.add(new Instruction(OperationType.CMP, new Operand(condition, Type.ID), 
				new Operand(bodyWhile, Type.TMP), null));
		ins.add(new Instruction(OperationType.JMP, new Operand(endWhile, Type.TMP), 
				null, null));
		
		// Mark Body
		ins.add(new Instruction(OperationType.NOP, new Operand(bodyWhile, Type.TMP), 
				null, null));
		
		// Make While-Statements
		for (StatementContext stmt : ctx.statement()) {
			tmpVarIndex = 0;
			ins.addAll(visitChildren(stmt));
		}
		
		// Jump back to the WhileHead
		ins.add(new Instruction(OperationType.JMP, new Operand(headWhile, Type.TMP), 
				null, null));
		
		// Mark EndWhile
		ins.add(new Instruction(OperationType.NOP, new Operand(endWhile, Type.TMP), 
				null, null));
		
		return ins;
	}

	/*
	@Override
	public List<Instruction> visitVarstatement(VarstatementContext ctx) {
		List<Instruction> ins = new LinkedList<>();
		
		String target = ctx.getChild(1).getText();
		
		if(ctx.expression() != null) {
			ins.addAll(visitChildren(ctx.expression()));
			String source = tmpVar();
			ins.add(new Instruction(OperationType.VAR, new Operand(source, Type.ID), null, target));
		}
		else {
			ins.add(new Instruction(OperationType.VAR, null, null, target));
		}
		
		return ins;
	}

	@Override
	public List<Instruction> visitAssignstatement(AssignstatementContext ctx) {
		// FIXME: Alles schwamming und falsch !!
		List<Instruction> ins = new LinkedList<>();
		
		// TODO: Differ WREF, WARRAY, Identifier
		String target = ctx.assignee().identifier().getText();
		
		ins.addAll(visitChildren(ctx.expression()));
		String source = tmpVar();
		
		if(ctx.assignee().getChild(0).getText().equals("?")) {
			// RREF
			if(ctx.assignee().arrayaccess() != null) {
				// RARRAY -> result WREF
			}
			else {
				//WREF
			}
		}
		else {
			// Keine WREF
			if(ctx.assignee().arrayaccess() != null) {
				// WARRAY
				String indicator = ctx.assignee().arrayaccess().operand().getText();
				ins.add(new Instruction(OperationType.WARRAY, new Operand(source, Type.ID), 
						new Operand(indicator, Type.ID), target));
			}
			else {
				// ASSIGN
				ins.add(new Instruction(OperationType.ASSIGN, new Operand(source, Type.ID), null, target));
			}
		}
		
		

		return ins;
	}
	*/

}
