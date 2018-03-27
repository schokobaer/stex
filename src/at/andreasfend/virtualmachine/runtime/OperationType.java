package at.andreasfend.virtualmachine.runtime;

public enum OperationType {
	
	NOP,
	
	ADD,
	SUB,
	MUL,
	DIV,
	MOD,
	
	SUBSTACK,	// inits a new substack for a coming call operation
	PARAMETER,	// creates a var in the substack
	CALL,		// opens substack
	RET,		// returns op1 and leaves substack
	JMP,		// jumps to op1
	CMP,		// if the boolean in op1 is true, then jump to op2
	BLOCK,		// creates a new sub data block
	LEAVE,		// leaves the current sub data block
	
	VAR,		// creates a new var in the current data block
	CONST,		// Deprecated -> move to compiler
	ASSIGN,		// assign a value to a var
	REF,		// Gets the reference of an var
	RREF,		// Reads the value of the reference
	WREF,		// writes to the target of the reference
	
	ARRAY,		// Inits a new Array with size of op1
	RARRAY,		// Reads from array in op1 at position op2
	WARRAY,		// puts the element op1 at position op2 of the array in target
	
	EQUALS,
	NOTEQUALS,
	BIGGER,
	SMALLER,
	AND,
	OR,
	NOT
	
}
