package at.andreasfend.stex.parser;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.stex.lexer.Lexical;
import at.andreasfend.stex.lexer.Token;
import at.andreasfend.stex.parser.node.Function;

public class Parser {

	/**
	 * Program: 
	 *     {Function}*
	 *     ;
	 * 
	 * Function:
	 *     ID '(' Parameter ')' '{' Statements '}'
	 *     ;
	 *     
	 * Parameter:
	 *     (Empty)
	 *     ID
	 *     ID {',' ID}*
	 *     ;
	 * @throws Exception 
	 */
	
	
	public List<Function> parse(List<Token> tokens) {
		List<Function> functions = new LinkedList<>();
		
		while(tokens.size() > 0) {
			Function f = findFunction(tokens);
			f.parse();
			functions.add(f);
		}
		
		return functions;
	}
	
	private Function findFunction(List<Token> tokens) {
		Function n = new Function();
		List<Token> entrys = new LinkedList<>();
		
		n.setTokens(entrys);
		
		if(tokens.get(0).getLexical() != Lexical.ID) {
			throw new RuntimeException("Invalid Token");
		}
		entrys.add(tokens.get(0));
		tokens.remove(0);
		
		int gklammerCounter = 0;
		boolean foundFirstGKlammer = false;
		while(!tokens.isEmpty()) {
			Token t = tokens.get(0);
			entrys.add(t);
			tokens.remove(0);
			
			if(t.getLexical() == Lexical.GKlammerAuf) {
				if(!foundFirstGKlammer)
					foundFirstGKlammer = true;
				gklammerCounter++;
			}
			if(t.getLexical() == Lexical.GKlammerZu) {
				gklammerCounter--;
				if(gklammerCounter == 0)
					break;
			}
		}
				
		return n;
	}
	
	
}
