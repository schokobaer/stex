package at.andreasfend.stex.parser.node;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.core.OperationType;
import at.andreasfend.stex.lexer.Lexical;
import at.andreasfend.stex.lexer.Token;

public class Statement extends Node implements ProgramCode {

	@Override
	public List<Instruction> parse() {
		if (peekToken().getLexical() == Lexical.RETURN) {
			return retStmt();
		} else if (peekToken().getLexical() == Lexical.THROW) {
			return throwStmt();
		} else if (peekToken().getLexical() == Lexical.VAR) {
			return varStmt();
		} else {
			return assignStmt();
		}

	}

	private List<Instruction> retStmt() {
		List<Instruction> instructions = new LinkedList<>();
		popToken();
		Expression exp = parseExpression();
		Operand op = null;
		if (exp != null) {
			instructions.addAll(exp.parse());
			op = new Operand(instructions.get(instructions.size() - 1).getTarget(), Type.ID);
		}
		instructions.add(new Instruction(OperationType.RET, op, null, null));
		return instructions;
	}

	private List<Instruction> throwStmt() {
		List<Instruction> instructions = new LinkedList<>();
		popToken();
		Expression exp = parseExpression();
		Operand op = new Operand(null, Type.VAL);
		if (exp != null) {
			instructions.addAll(exp.parse());
			op = new Operand(instructions.get(instructions.size() - 1).getTarget(), Type.ID);
		}
		instructions.add(new Instruction(OperationType.THROW, op, null, null));
		return instructions;
	}

	private List<Instruction> varStmt() {
		List<Instruction> instructions = new LinkedList<>();
		popToken();
		Token token = popToken();
		expected(token, Lexical.ID);
		String id = popToken().getValue();

		token = popToken();
		if (token.getLexical() == Lexical.SEMICOLON) {
			instructions.add(new Instruction(OperationType.VAR, null, null, id));
			return instructions;
		}

		expected(token, Lexical.EQUALS);

		Expression exp = parseExpression();
		if (exp == null) {
			// Expected Expresssion
		}
		instructions.addAll(exp.parse());
		Operand op = new Operand(instructions.get(instructions.size() - 1).getTarget(), Type.ID);
		instructions.add(new Instruction(OperationType.VAR, op, null, id));
		return instructions;
	}
	
	private List<Instruction> assignStmt() {
		return new LinkedList<>();
	}

	private Expression parseExpression() {
		List<Token> tokens = new LinkedList<>();
		while (peekToken().getLexical() != Lexical.SEMICOLON) {
			tokens.add(popToken());
		}
		if (tokens.size() == 0)
			return null;
		return new Expression(tokens);
	}

}
