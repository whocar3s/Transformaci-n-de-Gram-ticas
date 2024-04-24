grammar G1_Original;

prog: 	stat+ ;
stat:	s NEWLINE
    |	NEWLINE
    ;

s:  (a b c | d e)
    ;
a:  (DOS b TRES | )
    ;
b:  (b CUATRO c CINCO | )
    ;
c:  (SEIS a b | )
    ;
d:  (UNO a e | b)
    ;
e:  (TRES)
    ;
    
UNO : 'uno';
DOS : 'dos';
TRES : 'tres';
CUATRO : 'cuatro';
CINCO : 'cinco';
SEIS : 'seis';
NEWLINE:'\r'? '\n' ;
