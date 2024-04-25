grammar G3_Transformada;

prog: 	stat+ ;
stat:	s NEWLINE
    |	NEWLINE
    ;

s:  (a b c sprima)
    ;
a:  (DOS b c | )
    ;
b:  (c TRES | )
    ;
c:  (CUATRO b | )
    ;
sprima: (UNO sprima | )
    ;

    
UNO : 'uno';
DOS : 'dos';
TRES : 'tres';
CUATRO : 'cuatro';
NEWLINE:'\r'? '\n' ;
