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
					 
ifstatement:		'if' '(' operand ')' '{' statement+ '}' ?elseblock ;
elseblock:			'else' '{' statement+ '}' ;

trystatement:		'try' '{' statement+ '}' catchblock ;
catchblock:			'catch' '(' ID ')' '{' statement+ '}' ;

whilestatement:		'while' '(' operand ')' '{' statement+ '}' ;

throwstatement:		'throw' initialisation ';' ;
returnstatement:	'return' initialisation ';' ;

assignstatement:	assignee '=' initialisation ';' ;
varstatement:		'var' ID ('=' initialisation)? ';' ;

initialisation:		(object|array|ref|expression);
				
expression:		(functioncall|operation|operand|arrayaccess|deref);
expressionop:	(functioncall|operand|arrayaccess|deref);

operand:		(identifier|VAL);
identifier:		ID ('.' ID)* ;
arrayaccess:	identifier '[' expression ']' ;

object:				'{' objectfield (',' objectfield)* '}';
objectfield:		ID ;

array:				'[' (expression (',' expression)*)? ']' ;

functioncall:		ID '(' functioncallargs ')' ;
functioncallargs:	(expression (',' expression)*)? ;
ref:				'&' identifier;
deref:				'?' identifier;

operation:			expressionop ('+'|'-'|'*'|'/'|'%'|'=='|'!='|'>'|'<'|'in'|'and'|'or') expression
					| 'not' expression ;

assignee:			deref | identifier | arrayaccess ;


/*
object:			'{' objectfields '}' ;
objectfields:	ID '=' expression (',' ID '=' expression)* ;

array:			'[' arrayelements ']';
arrayelements:	(expression (',' expression)*)? ;

functioncall:	ID '(' functioncallparams ')' ;
functioncallparams:	(expression (',' expression)*)? ;

operation:		  (addition|subtraktion|multiplikation|division|modulo|
					isequal|isnotequal|bigger|smaller|isin);
addition:		expression '+' expression ;
subtraktion:	expression '-' expression ;
multiplikation:	expression '*' expression ;
division:		expression '/' expression ;
modulo:			expression '%' expression ;
isequal:		expression '==' expression ;
isnotequal:		expression '!=' expression ;
bigger:			expression '>' expression ;
smaller:		expression '<' expression ;
isin:			expression 'in' expression ;


operand:		  identifier
				| VAL
				| '?' identifier
				| arrayread 
				| objectread ;
identifier:		ID ('.' ID)* ;
rarraylist:		(arrayaccess)* ;
arrayread:		identifier (rarraylist | '.' ID)* arrayaccess ;
objectread:		identifier (rarraylist | '.' ID)* '.' ID ;
arrayaccess:	'[' expression ']' ;

ref:			'&' identifier ;

assignee:		  identifier
				| '?' identifier
				| arraywrite ;
arraywrite:		identifier (rarraylist | '.' ID)* arrayaccess;
*/

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
