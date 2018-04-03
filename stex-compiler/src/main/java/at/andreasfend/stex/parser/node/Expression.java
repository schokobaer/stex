package at.andreasfend.stex.parser.node;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.lexer.Token;

public class Expression extends Node {

	public Expression(List<Token> tokens) {
		super();
		setTokens(getTokens());
	}
	
	@Override
	public List<Instruction> parse() {
		// TODO Auto-generated method stub
		return new LinkedList<>();
	}

}
