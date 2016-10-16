grammar PostfixCalculator;

NUMBER:   [0-9]+;
OPERATORS: ('*'|'/'|'+'|'-'|'~');

expr: NUMBER+;
addition: expr (expr '+')+;
