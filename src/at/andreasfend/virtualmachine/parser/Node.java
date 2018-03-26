package at.andreasfend.virtualmachine.parser;

import java.util.List;

import at.andreasfend.virtualmachine.lex.Lexical;
import at.andreasfend.virtualmachine.lex.Token;

public abstract class Node {

	private List<Token> tokens;
	
	
	public List<Token> getTokens() {
		return tokens;
	}
	public void setTokens(List<Token> tokens) {
		this.tokens = tokens;
	}
	
	protected Token popToken() {
		Token t = tokens.get(0);
		tokens.remove(0);
		return t;
	}
	
	protected Token peekToken() {
		return tokens.get(0);
	}
	
	protected void expected(Token t, Lexical[] expect) throws Exception {
		String expStr = "";
		for (Lexical lexical : expect) {
			if(t.getLexical() == lexical)
				return;
			expStr += lexical.name() + " ";
		}
				
		throw new Exception("Expected one of " + expStr + "but got " + t.getValue());
	}
	
	protected void expected(Token t, Lexical l) throws Exception {
		this.expected(t, new Lexical[] {l});
	}
	
	public abstract void parse() throws Exception;
	//public abstract void print();
	
}
