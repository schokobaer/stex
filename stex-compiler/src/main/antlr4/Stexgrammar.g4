grammar Stexgrammar;

@header {
	package at.andreasfend.stex.parser.antlr4;
}

/**
 * Parser Rules
 */

program:	function+ ;

function:	ID '(' paramlist ')' '{' statement+ '}' ;
paramlist:  (ID (',' ID)*)? ;

statement:			(ifstatement|trystatement|whilestatement|throwstatement|returnstatement
					 |assignstatement|varstatement);
ifstatement:		'if' '(' conditionlist ')' '{' statement+ '}' ?elseblock ;
elseblock:			'else' '{' statement+ '}' ;
trystatement:		'try' '{' statement+ '}' catchblock ;
catchblock:			'catch' '(' ID ')' '{' statement+ '}' ;
whilestatement:		'while' '(' conditionlist ')' '{' statement+ '}' ;
throwstatement:		'throw' expression ';' ;
returnstatement:	'return' expression ';' ;
assignstatement:	assignee '=' expression ';' ;
varstatement:		'var' ID ('=' expression)? ';' ;

conditionlist:	condition+ ;
condition:		  expression
				| condition 'and' condition
				| condition 'or' condition
				| 'not' expression;
				
expression:		(object|array|functioncall|operation|operand|ref);
object:			'{' (ID '=' expression (',' ID '=' expression)*)? '}' ;
array:			'[' (expression (',' expression)*)? ']';
functioncall:	ID '(' (ID (',' ID)*)? ')' ;
operation:		  operand '+' operand ('+' operand)*
				| operand '-' operand ('-' operand)*
				| operand '*' operand ('*' operand)*
				| operand '/' operand ('/' operand)*
				| operand '%' operand ('%' operand)*
				| operand '==' operand
				| operand '!=' operand
				| operand '>' operand
				| operand '<' operand
				| operand 'in' operand;
operand:		  ID
				| VAL
				| '?' ID
				| arrayread ;
arrayread:		ID '[' expression ']' ;
ref:			'&' ID ;

assignee:		  ID
				| '?' ID
				| arraywrite ;
arraywrite:		ID '[' expression ']' assignee? ;

/*
 * Lexer Rules
 */
WHITESPACE	:	[ \t\r\n]+ -> skip ;

VAL			:	(
				  ([0-9])+(.([0-9])+)?([0-9])+(.([0-9])+)? 
				| ('true'|'false')
				| 'null'
				| '"'([^'\"']|'"')*'"'
				);
/*VAL			:	 ([0-9])+(.([0-9])+)?([0-9])+(.([0-9])+)? ; */
ID			:	([A-Z]|[a-z])+([A-Z]|[a-z]|[0-9])* ;
