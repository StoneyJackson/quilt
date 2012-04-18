grammar QuiltDispatchBasic;

rulesheet 
	:	rule*;

rule 	:	condition+ assignment;

assignment 
	:	'=>' ID varlist?;

condition
	:	KW ID ('='|'!')  pattern;
	
pattern :	'`'ID*'`';

varlist 	:	'('(var',')*var')';

var 	:	ALPHA(ALPHA | DIGIT)* '=' ALPHA*;

KW 	:	 'authority' | 'scheme' | 'URI' | 'domain_name' | 'port' | 'ip' | 'path' | 'fragment' | 'query_string'
                 'header' | 'method';

ALPHA 	:	(('a'..'z')|('A'..'Z'));

DIGIT 	:	'0'..'9';

ID 	:	~(' ' | '\n' | '\r');
