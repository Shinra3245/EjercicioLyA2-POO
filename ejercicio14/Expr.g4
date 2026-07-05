grammar Expr;

root: expr EOF;

expr: EOF;

UPDATE: 'UPDATE' ;
SET: 'SET' ;
WHERE: 'WHERE' ;

COMA: ',' ;
PUNTO_COMA: ';' ;
IGUAL: '=' ;

CADENA: '\'' ~['\r\n]* '\'' ;
NUM: [0-9]+ ;
ID: [a-zA-Z_][a-zA-Z0-9_]* ;
WS: [ \t\r\n]+ -> skip ;
