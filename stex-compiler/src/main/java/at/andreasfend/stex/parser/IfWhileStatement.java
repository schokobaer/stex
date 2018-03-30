package at.andreasfend.stex.parser;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.stex.lexer.Lexical;
import at.andreasfend.stex.lexer.Token;

public class IfWhileStatement extends Statement {

	private List<Statement> blocks = new LinkedList<>();
	private List<Condition> conditions = new LinkedList<>();
	
	@Override
	public void parse() {
		expected(popToken(), new Lexical[] {Lexical.IF, Lexical.WHILE});
		expected(popToken(), Lexical.KlammerAuf);
		
		while(true) {
			Condition cond = new Condition();
			List<Token> tk = new LinkedList<>();
			cond.setTokens(tk);
			
			Token t = popToken();
			if(t.getLexical() == Lexical.KlammerZu)
				break;
			
			tk.add(t);
			
			while(true) {
				t = popToken();
				
				
			}
		}
		
	}
}
