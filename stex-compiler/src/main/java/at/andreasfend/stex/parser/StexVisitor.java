package at.andreasfend.stex.parser;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.stex.core.Instruction;
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

	@Override
	public List<Instruction> visitFunction(FunctionContext ctx) {
		String name = ctx.getChild(0).getText();
		List<String> args = new LinkedList<>();
		{
			int i = 0;
			while(i < ctx.getChild(2).getChildCount()) {
				args.add(ctx.getChild(2).getChild(i).getText());
				i += 2;
			}
		}

		print("FunctionHead: " + name + "(" + args + ")");

		layer++;
		for (StatementContext stmt : ctx.statement()) {
			visitChildren(stmt);
		}
		layer--;

		return new LinkedList<>();
	}

	@Override
	public List<Instruction> visitThrowstatement(ThrowstatementContext ctx) {

		layer++;
		visitChildren(ctx);
		layer--;

		print("Throw");

		return new LinkedList<>();
	}

	@Override
	public List<Instruction> visitReturnstatement(ReturnstatementContext ctx) {
		layer++;
		visitChildren(ctx);
		layer--;

		print("Return");

		return new LinkedList<>();
	}

	@Override
	public List<Instruction> visitIfstatement(IfstatementContext ctx) {

		print("IfHead:");

		layer++;
		visitChildren(ctx.conditionlist());
		layer--;

		print("IfBody {");

		layer++;
		for (StatementContext stmt : ctx.statement())
			visitChildren(stmt);
		layer--;

		print("}");

		if (ctx.elseblock() != null) {
			print("Else {");
			layer++;
			visitChildren(ctx.elseblock());
			layer--;
			print("}");
		}

		return new LinkedList<>();
	}

	@Override
	public List<Instruction> visitTrystatement(TrystatementContext ctx) {

		print("Try {");

		layer++;
		for (StatementContext stmt : ctx.statement())
			visitChildren(stmt);
		layer--;

		print("}");

		String exp = ctx.catchblock().getChild(2).getText();
		print("Catch (" + exp + "){");
		layer++;
		for (StatementContext stmt : ctx.catchblock().statement())
			visitChildren(stmt);
		layer--;
		print("}");

		return new LinkedList<>();
	}

	@Override
	public List<Instruction> visitWhilestatement(WhilestatementContext ctx) {

		print("WhileHead:");

		layer++;
		visitChildren(ctx.conditionlist());
		layer--;

		print("WhileBody {");

		layer++;
		for (StatementContext stmt : ctx.statement())
			visitChildren(stmt);
		layer--;

		print("}");

		return new LinkedList<>();
	}

	@Override
	public List<Instruction> visitVarstatement(VarstatementContext ctx) {
		String name = ctx.getChild(1).getText();
		print("Var " + name);

		if (ctx.expression() != null) {
			layer++;
			visitChildren(ctx.expression());
			layer--;
		}

		print(name + " = ");

		return new LinkedList<>();
	}

	@Override
	public List<Instruction> visitAssignstatement(AssignstatementContext ctx) {
		String name = ctx.getChild(0).getText();

		layer++;
		visitChildren(ctx.expression());
		layer--;

		print(name + " = ");

		return new LinkedList<>();
	}

}
