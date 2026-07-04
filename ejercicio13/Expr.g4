grammar Expr;

root: expr EOF;

expr: EOF;

CREATE: 'CREATE' ;
TABLE: 'TABLE' ;
PRIMARY: 'PRIMARY' ;
KEY: 'KEY' ;
NOT: 'NOT' ;
NULL: 'NULL' ;
SERIAL: 'SERIAL' ;
VARCHAR: 'VARCHAR' ;
INTEGER: 'INTEGER' ;
DATE: 'DATE' ;
INSERT: 'INSERT' ;
INTO: 'INTO' ;
VALUES: 'VALUES' ;
SELECT: 'SELECT' ;
FROM: 'FROM' ;
INNER: 'INNER' ;
JOIN: 'JOIN' ;
ON: 'ON' ;
WHERE: 'WHERE' ;

PAR_I: '(' ;
PAR_D: ')' ;
COMA: ',' ;
PUNTO_COMA: ';' ;
PUNTO: '.' ;
IGUAL: '=' ;

CADENA: '\'' ~['\r\n]* '\'' ;
NUM: [0-9]+ ;
ID: [a-zA-Z_][a-zA-Z0-9_]* ;
WS: [ \t\r\n]+ -> skip ;