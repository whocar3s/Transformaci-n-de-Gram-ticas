grammar G1_Transformada;

prog: 	stat+ ;
stat:	s NEWLINE
    |	NEWLINE
    ;

s:  (a b c | d e)
    ;
a:  (DOS b TRES | )
    ;
b:  (bprima)
    ;
c:  (SEIS a b | )
    ;
d:  (UNO a e | b)
    ;
e:  (TRES)
    ;
bprima:  (CUATRO c CINCO bprima| )
    ;   
UNO : 'uno';
DOS : 'dos';
TRES : 'tres';
CUATRO : 'cuatro';
CINCO : 'cinco';
SEIS : 'seis';
NEWLINE:'\r'? '\n' ;
