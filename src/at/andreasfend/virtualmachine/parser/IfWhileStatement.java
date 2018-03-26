package at.andreasfend.virtualmachine.parser;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.virtualmachine.lex.Lexical;
import at.andreasfend.virtualmachine.lex.Token;

public class IfWhileStatement extends Statement {

	private List<Statement> blocks = new LinkedList<>();
	private List<Condition> conditions = new LinkedList<>();
	
	@Override
	public void parse() throws Exception {
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
