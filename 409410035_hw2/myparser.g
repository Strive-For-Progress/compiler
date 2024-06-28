grammar myparser;

options {
  language = Java;
  backtrack = true;
  k = 2;
}



program : function* ;

function : { System.out.println("declaration func() "); }type ID LPrase param_list? RPrase block   ;
func : { System.out.println("Call func() "); } ID '(' (arg_list)? ')' ';'  ;



param_list : type ID (',' type ID)*;
arg_list : ID (','  ID)*;



statement : expression ';' 
          | declaration ';'
          | selection_statement
          | while_statement 
          | for_statement 
          | do_while_statement 
          | return_statement 
          | scanf_statement
          | printf_statement
          | func
          | block ;

block : '{' statement* '}';

selection_statement: { System.out.println("Parsing an selection_statement "); } IF '(' expression ')' statement (options {k=1; backtrack=false;}:ELSE statement)? ;
             
      
while_statement : { System.out.println("Parsing an WHILE statement "); } WHILE '(' expression ')' statement ;

for_statement : { System.out.println("Parsing an FOR statement "); } FOR '(' (expression | declaration)? ';' expression? ';' expression? ')' statement ;

do_while_statement :{ System.out.println("Parsing an DO_WHILE statement "); } DO statement WHILE '(' expression ')' ';' ;

scanf_statement :  { System.out.println("Parsing an scanf_statement "); }SCAN '(' STRING ',' Address ID (',' Address ID)* ')' ';';

printf_statement : { System.out.println("Parsing an printf_statement "); }PRINT '(' STRING (',' expression)* ')' ';';


return_statement : { System.out.println("Parsing an return_statement "); }RETURN expression? ';' ;

declaration : { System.out.println("Parsing an declaration "); }type ID ('=' (ID|DEC_NUM|FLOAT_NUM))? (COOMA ID('=' (ID|DEC_NUM|FLOAT_NUM))?)* ;

expression : assignment ;

assignment : (ID '+=' assignment) { System.out.println("Parsing an += "); }
            | (ID '*=' assignment) { System.out.println("Parsing an *= "); }
            | (ID '/=' assignment) { System.out.println("Parsing an /= "); }
            | (ID '%=' assignment) { System.out.println("Parsing an \%= "); }
            | (ID '-=' assignment) { System.out.println("Parsing an -= "); }
            | equality ( AS_OP assignment )? ;

equality : relational ( ( EQ_OP | NE_OP ) relational { System.out.println("Parsing an equality Operators"); } )* ;

relational : additive ( ( GE_OP | GT_OP | LE_OP | LT_OP ) additive { System.out.println("Parsing an compare Operators"); })* ;

additive : multiplicative ( ( PLUS_OP | SUB_OP ) multiplicative { System.out.println("Parsing an additive Operators"); })* ;

multiplicative : unary ( ( MUL_OP | MOD_OP | DIV_OP ) unary { System.out.println("Parsing an multiplicative Operators"); })* ;

unary : ( (PLUS_OP | SUB_OP | NOT | Address) { System.out.println("Parsing an  unary Operators"); })? primary ;

primary : DEC_NUM { System.out.println("DEC_NUM");}
        | FLOAT_NUM { System.out.println("FLOAT_NUM");}
        | STRING{ System.out.println("STRING");}
        | ID ( LPrase expression RPrase { System.out.println("ID");})? ;

type: INT_TYPE { System.out.println("TYPE INT");} 
      | FLOAT_TYPE { System.out.println("TYPE FLOAT");} 
      | DOUBLE_TYPE { System.out.println("TYPE DOUBLE");} 
      | LONG_TYPE { System.out.println("TYPE LONG");} 
      | SHORT_TYPE { System.out.println("TYPE SHORT");} 
      | BOOL_TYPE { System.out.println("TYPE BOOL");} 
      | VOID_TYPE { System.out.println("TYPE VOID");} 
      ;

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'int';
FLOAT_TYPE  : 'float';
DOUBLE_TYPE : 'double';
LONG_TYPE  : 'long';
SHORT_TYPE  : 'short';
BOOL_TYPE : 'bool';
VOID_TYPE : 'void';

RETURN : 'return';

DO : 'do';
WHILE : 'while';
FOR : 'for';
IF : 'if';
ELSE : 'else';



/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP: '==';
LE_OP:'<=';
GE_OP:'>=';
NE_OP:'!=';
AS_OP:'=';
LT_OP : '<';
GT_OP : '>';

/*COMMON*/
PLUS_OP : '+';
SUB_OP : '-';
MUL_OP : '*';
MOD_OP : '%';
DIV_OP : '/';
Address	: '&';
NOT : '!';



/* SYMBOL */
SEMI : ';';
LPrase : '(';
RPrase : ')';
LBrace : '{';
RBrace : '}';
COOMA : ',';


/* FUNC */
PRINT : 'printf';
SCAN : 'scanf';




STRING : ('"'(.)*'"') ;

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

CHAR: '\'' (LETTER) '\'';

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';


fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t'|'\n')+
      {skip();}
;