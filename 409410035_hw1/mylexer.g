lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
FLOAT_TYPE  : 'float';
DOUBLE_TYPE : 'double';
LONG_TYPE  : 'long';
SHORT_TYPE  : 'short';
BOOL_TYPE : 'bool';

UNSIGNED_TYPE : 'unsigned';
SIGNED_TYPE : 'signed';
CONST_TYPE  : 'const';
VOID_TYPE : 'void';
ENUM : 'enum';

TYPEDEF : 'typedef';
EXTERN : 'extern';
RETURN : 'return';
SIZEOF : 'sizeof';
STATIC : 'static';
STRUCT : 'struct';

DO : 'do';
WHILE : 'while';
FOR : 'for';
BREAK : 'break';
CONTINUE : 'continue';
SWITCH : 'switch';
CASE : 'case';
DEFAULT : 'default';
IF : 'if';
ELSE : 'else';



/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP: '==';
LE_OP:'<=';
GE_OP:'>=';
NE_OP:'!=';
PP_OP:'++';
MM_OP:'--';
AS_OP:'=';
LT_OP : '<';
GT_OP : '>';

/*COMMON*/
PA_OP : '+=';
SA_OP : '-=';
MLA_OP : '*=';
MDA_OP : '%=';
DA_OP : '/=';

PLUS_OP : '+';
SUB_OP : '-';
MUL_OP : '*';
MOD_OP : '%';
DIV_OP : '/';



/* Bitwise */
BOA_OP : '|=';
BAA_OP : '&=';
BNA_OP : '~=';
BXA_OP : '^=';
RSA_OP : '<<=';
LSA_OP : '>>=';

BOR_OP : '|';
BAND_OP : '&';
BNOT_OP : '~';
BXOR_OP : '^';
RS_OP : '<<';
LS_OP : '>>';

/* Logical */
LOR_OP : '||';
LAND_OP : '&&';
LNOT_OP : '!';


/* SYMBOL */
SEMI : ';';
LBT : '[';
RBT : ']';
LPR : '(';
RPR : ')';
LBE : '{';
RBE : '}';
COOMA : ',';
COLON : ':';
PRE_PROCESSOR : '#';
Q : '?';
PERIOD : '.';


/* FUNC */
PRINT : 'printf';
SCAN : 'scanf';
SQRT : 'sqrt';
PUTS : 'puts';
MAIN : 'main';


STRING1 : ('"'(.)*'"') ;
STRING2 : '<' ID '.h'? '>';

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);


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
;
