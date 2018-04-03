package at.andreasfend.stex.parser.node;

import java.util.List;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.lexer.Lexical;
import at.andreasfend.stex.lexer.Token;

public abstract class Node implements Parsable {

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
	
	protected void expected(Token t, Lexical[] expect) {
		String expStr = "";
		for (Lexical lexical : expect) {
			if(t.getLexical() == lexical)
				return;
			expStr += lexical.name() + " ";
		}
				
		throw new RuntimeException("Expected one of " + expStr + "but got " + t.getValue());
	}
	
	protected void expected(Token t, Lexical l) {
		this.expected(t, new Lexical[] {l});
	}
		
}
