package at.andreasfend.stex.parser;

import at.andreasfend.stex.lexer.Lexical;

public class Statement extends Node {

	
	
	@Override
	public void parse() {
		if(peekToken().getLexical() == Lexical.ID)
			assign();
		else if(peekToken().getLexical() == Lexical.RETURN)
			ret();
		else if(peekToken().getLexical() == Lexical.CONST)
			constant();
		else if(peekToken().getLexical() == Lexical.VAR)
			var();
		
		expected(peekToken(), new Lexical[] { Lexical.ID, Lexical.RETURN, Lexical.CONST, Lexical.VAR });
	}
	
	private void assign() {
		
	}
	
	private void ret() {
		
	}
	
	private void constant() {
		
	}
	
	private void var() {
		
	}

}
