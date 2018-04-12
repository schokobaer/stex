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
					 |assignstatement|varstatement|voidfunction);
					 
ifstatement:		'if' '(' expression ')' '{' statement+ '}' (elseblock)? ;
elseblock:			'else' '{' statement+ '}' ;

trystatement:		'try' '{' statement+ '}' catchblock ;
catchblock:			'catch' '(' ID ')' '{' statement+ '}' ;

whilestatement:		'while' '(' expression ')' '{' statement+ '}' ;

throwstatement:		'throw' expression ';' ;
returnstatement:	'return' (expression)? ';' ;

assignstatement:	assignee '=' expression ';' ;
varstatement:		'var' ID ('=' expression)? ';' ;

voidfunction:		functioncall ';' ;

/* initialisation:		(object|array|ref|expression); */
				
expression:		(functioncall|operation|operand|arrayaccess|deref|object|array|ref);
expressionop:	(functioncall|operand|arrayaccess|deref|object|array|ref);

operand:		(identifier|value);
identifier:		ID ('.' ID)* ;
value:			(NUMBER|BOOLEAN|NULL|STRING) ;
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
COMMENT		:	'/*' .*? '*/' -> skip ;

NUMBER		:	([0-9])+ ('.' ([0-9])+ )? ;
BOOLEAN		:	('true' | 'false') ;
NULL		:	'null' ;
STRING		:	'"' (. | '\"')*? '"' ;

ID			:	([A-Z]|[a-z])+([A-Z]|[a-z]|[0-9])* ;
