package at.andreasfend.stex.parser.node;

import java.util.LinkedList;
import java.util.List;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.core.Operand;
import at.andreasfend.stex.core.Operand.Type;
import at.andreasfend.stex.core.OperationType;
import at.andreasfend.stex.lexer.Lexical;
import at.andreasfend.stex.lexer.Token;

public class Function extends Node {

	private String name;
	private List<String> paramList = new LinkedList<>();
	private List<ProgramCode> statements = new LinkedList<>();

	public String getName() {
		return name;
	}
	
	
	@Override
	public List<Instruction> parse() {
		this.name = popToken().getValue();
		
		parseParamList();
		parseStatements();
		
		List<Instruction> instructions = new LinkedList<>();
		
		instructions.add(new Instruction(OperationType.NOP,
				new Operand(paramList, Type.VAL), null, name));
		
		for (ProgramCode pc : statements) {
			instructions.addAll(pc.parse());
		}
		
		// Add RET if needed
		if(instructions.get(instructions.size()-1).getOp() != OperationType.RET && 
				instructions.get(instructions.size()-1).getOp() != OperationType.THROW) {
			instructions.add(new Instruction(OperationType.RET, null, null, null));
		}
		
		return instructions;
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
				paramList.add(t.getValue());
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
			
			// Check for ControlFlowStmt
			Lexical firstStmtLexical = stmt.getTokens().get(0).getLexical(); 
			if(firstStmtLexical == Lexical.IF || firstStmtLexical == Lexical.WHILE ||
					firstStmtLexical == Lexical.TRY) {
				ControlFlowStatement cstmt = new ControlFlowStatement();
				cstmt.setTokens(stTks);
				statements.add(cstmt);
			}
			else {
				statements.add(stmt);
			}
		}
		
		this.expected(popToken(), Lexical.GKlammerZu);
	}
	
	
	@Override
	public String toString() {
		String params = "";
		for (String v : paramList) {
			params += v + ",";
		}
		if(paramList.size() > 0)
			params = params.substring(0, params.length()-1);
		return name + "(" + params + ")";
	}
		
}
