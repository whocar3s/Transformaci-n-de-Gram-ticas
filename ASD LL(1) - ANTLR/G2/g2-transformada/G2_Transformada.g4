grammar G2_Transformada;

prog: 	stat+ ;
stat:	s NEWLINE
    |	NEWLINE
    ;

s:  (b UNO|DOS c| )
    ;
a:  (s TRES b c|CUATRO| )
    ;
b:  (a CINCO c SEIS|)
    ;
c:  (SIETE b| )
    ;

    
UNO : 'uno';
DOS : 'dos';
TRES : 'tres';
CUATRO : 'cuatro';
CINCO : 'cinco';
SEIS : 'seis';
SIETE : 'siete';
NEWLINE:'\r'? '\n' ;
