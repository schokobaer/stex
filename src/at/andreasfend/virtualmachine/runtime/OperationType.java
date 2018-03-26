package at.andreasfend.virtualmachine.runtime;

public enum OperationType {
	
	NOP,
	
	ADD,
	SUB,
	MUL,
	DIV,
	MOD,
	
	SUBSTACK,
	PARAMETER,
	CALL,
	RET,
	JMP,
	CMP,
	BLOCK,
	LEAVE,
	
	VAR,
	CONST,
	ASSIGN,
	
	EQUALS,
	NOTEQUALS,
	BIGGER,
	SMALLER,
	AND,
	OR,
	NOT
	
}
