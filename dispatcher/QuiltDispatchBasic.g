grammar QuiltDispatchBasic;

rulesheet 
	:	rule*;

rule 	:	condition+ assignment;

assignment 
	:	'=>' URI varlist?;

condition
	:	KW URI ('='|'!')  pattern;
	
pattern :	'`'CHAR*'`';

varlist 	
	:	'('(var',')*var')';

var	:	IDENT '=' ALPHA*;


KW 	:	 'authority' | 'scheme' | 'URI' | 'domain_name' | 'port' | 'ip' | 'path' | 'fragment' | 'query_string'
                 'header' | 'method';
                 
ALPHA 	:	(('a'..'z')|('A'..'Z'));

IDENT 	:	ALPHA(ALPHA | DIGIT)*;

DIGIT 	:	'0'..'9';

CHAR	:	~(' ' | '\n' | '\r');

URI 	:	CHAR+;

WHITESPACE 
	: ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; };
