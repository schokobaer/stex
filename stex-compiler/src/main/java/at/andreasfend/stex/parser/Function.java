package at.andreasfend.stex.parser;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.stex.lexer.Lexical;
import at.andreasfend.stex.lexer.Token;

public class Function extends Node {

	private String name;
	private List<Variable> paramList = new LinkedList<>();
	private List<Statement> statements = new LinkedList<>();

	public String getName() {
		return name;
	}
	
	public List<Variable> getParamList() {
		return paramList;
	}
	
	public List<Statement> getStatements() {
		return statements;
	}

	
	@Override
	public void parse() {
		this.name = popToken().getValue();
		
		parseParamList();
		parseStatements2();
	}
	
	private void parseParamList() {
		// Parameters
		this.expected(popToken(), Lexical.KlammerAuf);
				
		if(peekToken().getLexical() == Lexical.KlammerZu) {
			popToken();
			return;
		}
		
		Lexical[] expected = { Lexical.ID };
		boolean param = true;
		
		while(true) {
			Token t = popToken();
			this.expected(t, expected);
			
			if(param) {
				paramList.add(new Variable(t.getValue()));
				param = false;
				expected = new Lexical[] { Lexical.KOMMA, Lexical.KlammerZu };
			}
			else {
				if(t.getLexical() == Lexical.KlammerZu)
					break;
				param = true;
				expected = new Lexical[] { Lexical.ID };
			}
			
		}
	}
	
	private void parseStatements() {
		this.expected(popToken(), Lexical.GKlammerAuf);
		
		while(!getTokens().isEmpty()) {
			
			Statement st = new Statement();
			List<Token> stTokens = new LinkedList<>();
			st.setTokens(stTokens);
			boolean firstRead = false;
			boolean ifWhile = false;
			int gklammerCount = 0;
			
			if(peekToken().getLexical() == Lexical.GKlammerZu) {
				popToken();
				if(getTokens().isEmpty())
					return;
				throw new RuntimeException("Parsing error: missing '}'");
			}
			
			while(true) {
				Token t = popToken();
				if(!firstRead) {
					if(t.getLexical() == Lexical.IF ||
							t.getLexical() == Lexical.WHILE)
						ifWhile = true;
					if(t.getLexical() == Lexical.SEMICOLON)
						break;
					firstRead = true;
				}
				
				stTokens.add(t);
				
				// Normal statement
				if(!ifWhile && t.getLexical() == Lexical.SEMICOLON)
					break;
				
				if(ifWhile) {
					if(t.getLexical() == Lexical.GKlammerAuf)
						gklammerCount++;
					if(t.getLexical() == Lexical.GKlammerZu) {
						gklammerCount--;
						if(gklammerCount == 0) {
							IfWhileStatement iwSt = new IfWhileStatement();
							iwSt.setTokens(st.getTokens());
							st = iwSt;
							break;
						}
					}
				}
			}
			
			statements.add(st);
			
		}
		throw new RuntimeException("Parsing error: missing '}'");
	}
	
	private void parseStatements2() {
		this.expected(popToken(), Lexical.GKlammerAuf);
		
		while(getTokens().size() > 1) {
			Statement stmt = new Statement();
			List<Token> stTks = new LinkedList<>();
			stmt.setTokens(stTks);
			int gklammerCount = 0;
			
			while(true) {
				Token token = popToken();
				stTks.add(token);
				if(token.getLexical() == Lexical.GKlammerAuf) {
					gklammerCount++;
				}
				if(token.getLexical() == Lexical.GKlammerZu) {
					gklammerCount--;
					if(gklammerCount < 0) {
						throw new RuntimeException("} too much");
					}
					if(stTks.get(0).getLexical() == Lexical.WHILE) {
						break;
					}
					if(stTks.get(0).getLexical() == Lexical.IF) {
						// Check: when next is ELSE then skip, else break
						if(peekToken().getLexical() != Lexical.ELSE)
							break;
					}
					if(stTks.get(0).getLexical() == Lexical.TRY) {
						// Check: when next is ELSE then skip, else break
						if(peekToken().getLexical() != Lexical.CATCH)
							break;
					}
				}
				if(token.getLexical() == Lexical.SEMICOLON) {
					if(gklammerCount == 0) {
						break;
					}
				}
			}
			
			statements.add(stmt);
		}
		
		this.expected(popToken(), Lexical.GKlammerZu);
	}
	
	
	@Override
	public String toString() {
		String params = "";
		for (Variable v : paramList) {
			params += v.getName() + ",";
		}
		if(paramList.size() > 0)
			params = params.substring(0, params.length()-1);
		return name + "(" + params + ")";
	}
		
}
