grammar Expr;

root: expr EOF;

expr: EOF;

NMAP: 'nmap' ;
SS: 'ss' ;
SUDO: 'sudo' ;
TCPDUMP: 'tcpdump' ;
CURL: 'curl' ;
DIG: 'dig' ;
JOURNALCTL: 'journalctl' ;
GREP: 'grep' ;
UFW: 'ufw' ;

FLAG_SV: '-sV' ;
FLAG_SN: '-sn' ;
FLAG_TULN: '-tuln' ;
FLAG_I: '-i' ;
FLAG_C: '-c' ;
FLAG_HEAD: '-I' ;
FLAG_SINCE: '--since' ;

MX: 'MX' ;
DENY: 'deny' ;
FROM: 'from' ;
TODAY: 'today' ;

SLASH: '/' ;
DOT: '.' ;

CADENA: '"' ~["\r\n]* '"' ;
NUM: [0-9]+ ;
ID: [a-zA-Z_][a-zA-Z0-9_]* ;
WS: [ \t\r\n]+ -> skip ;
