package at.andreasfend.stex.core;

public enum OperationType {
	
	NOP,
	DEBUG,
	
	// Arithmetik //
	ADD,
	SUB,
	MUL,
	DIV,
	MOD,
	SIZE,
	
	// Conrol-Flow //
	SUBSTACK,	// inits a new substack for a coming call operation
	PARAMETER,	// creates a var in the substack
	CALL,		// opens substack
	RET,		// returns op1 and leaves substack
	JMP,		// jumps to op1
	CMP,		// if the boolean in op1 is true, then jump to op2
	BLOCK,		// creates a new sub data block
	LEAVE,		// leaves the current sub data block
	TRYCATCH,	// Generates a new Block, with catchPointer=op1 and expIdentifier=target
	THROW,		// Throws an Exception and goes up in the blocks/stacks until a validCatchpointer
				// is found. then generates there a new block which replaces the current. Also sets
				// the VAR of the expIdentifier as Exception
	
	// Data-Management //
	VAR,		// creates a new var in the current data block
	CONST,		// Deprecated -> move to compiler
	ASSIGN,		// assign a value to a var
	REF,		// Gets the reference of an var
	RREF,		// Reads the value of the reference
	WREF,		// writes to the target of the reference
	ARRAY,		// Inits a new Array with size of op1
	RARRAY,		// Reads from array in op1 at position op2
	WARRAY,		// puts the element op1 at position op2 of the array in target
	OBJECT,		// Inits a new Object in target
	STRUCTURE,	// Returns the Keys of an object into a string	
	
	// IO //
	READ,		// Reads a line from STDIN[256] and stores it to the target
	PRINT,		// Prints the DataUnit at op1 to STDOUT
	ERR,		// Print the DataUnit at op1 to STDERR
	
	// Converter //
	TYPE,		// Returns the integer-code of the DataType of op1
	INT,
	FLOAT,
	BOOL,
	STRING,
		
	// Logical //
	EQUALS,
	NOTEQUALS,
	BIGGER,
	SMALLER,
	AND,
	OR,
	NOT,
	IN,
	
}
