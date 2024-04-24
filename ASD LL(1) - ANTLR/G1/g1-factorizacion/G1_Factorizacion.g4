grammar G1_Factorizacion;

prog: 	stat+ ;
stat:	s NEWLINE
    |	NEWLINE
    ;

s:  (a b c|d e)
    ;
a:  (|DOS b TRES)
    ;
b:  (bprima)
    ;
c:  (|SEIS a b)
    ;
d:  (b|UNO a e)
    ;
e:  (TRES)
    ;
bprima:  (|CUATRO c CINCO bprima)
    ;   
UNO : 'uno';
DOS : 'dos';
TRES : 'tres';
CUATRO : 'cuatro';
CINCO : 'cinco';
SEIS : 'seis';
NEWLINE:'\r'? '\n' ;
