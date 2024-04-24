grammar G3_Original;

prog: 	stat+ ;
stat:	s NEWLINE
    |	NEWLINE
    ;

s:  (a b c | s UNO)
    ;
a:  (DOS b c | )
    ;
b:  (c TRES | )
    ;
c:  (CUATRO b | )
    ;

    
UNO : 'uno';
DOS : 'dos';
TRES : 'tres';
CUATRO : 'cuatro';
NEWLINE:'\r'? '\n' ;
