grammar Expr;

root : expr EOF;

expr : EOF;

PUBLIC: 'public' ;
CLASS: 'class' ;
STATIC: 'static' ;
VOID: 'void' ;
INT: 'int' ;

LLAVE_I: '{' ;
LLAVE_D: '}' ;
PAR_I: '(' ;
PAR_D: ')' ;
CORCHETE_I: '[' ;
CORCHETE_D: ']' ;
IGUAL: '=' ;
MAS: '+' ;
PUNTO: '.' ;
PUNTO_COMA: ';' ;

CADENA: '"' ~["\r\n]* '"' ; 
NUM: [0-9]+ ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;

WS: [ \t\r\n]+ -> skip ;