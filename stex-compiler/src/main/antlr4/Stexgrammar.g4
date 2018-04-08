grammar Stexgrammar;

@header {
	package at.andreasfend.stex.parser.antlr4;
}

/**
 * Parser Rules
 */

program:	functionlist ;
functionlist:	function+ ;

function:	ID '(' paramlist ')' '{' statement+ '}' ;
paramlist:  (ID (',' ID)*)? ;

statement:			(ifstatement|trystatement|whilestatement|throwstatement|returnstatement
					 |assignstatement|varstatement);
					 
ifstatement:		'if' '(' expression ')' '{' statement+ '}' (elseblock)? ;
elseblock:			'else' '{' statement+ '}' ;

trystatement:		'try' '{' statement+ '}' catchblock ;
catchblock:			'catch' '(' ID ')' '{' statement+ '}' ;

whilestatement:		'while' '(' expression ')' '{' statement+ '}' ;

throwstatement:		'throw' expression ';' ;
returnstatement:	'return' (expression)? ';' ;

assignstatement:	assignee '=' expression ';' ;
varstatement:		'var' ID ('=' expression)? ';' ;

/* initialisation:		(object|array|ref|expression); */
				
expression:		(functioncall|operation|operand|arrayaccess|deref|object|array|ref);
expressionop:	(functioncall|operand|arrayaccess|deref|object|array|ref);

operand:		(identifier|VAL);
identifier:		ID ('.' ID)* ;
arrayaccess:	identifier '[' expression ']' ;

object:				'{' objectfield (',' objectfield)* '}';
objectfield:		ID ('=' expression)? ;

array:				'[' (expression (',' expression)*)? ']' ;

functioncall:		ID '(' functioncallargs ')' ;
functioncallargs:	(expression (',' expression)*)? ;
ref:				'&' identifier;
deref:				'?' identifier;

operation:			expressionop operationtype expression
					| notoperation ;
notoperation:		'not' expression ;
operationtype:		('+'|'-'|'*'|'/'|'%'|'=='|'!='|'>'|'<'|'in'|'and'|'or') ;

assignee:			deref | identifier | arrayaccess ;



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
