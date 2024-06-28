// $ANTLR 3.4 myparser.g 2023-04-17 23:28:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class myparserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AS_OP", "Address", "BOOL_TYPE", "CHAR", "COMMENT1", "COMMENT2", "COOMA", "DEC_NUM", "DIGIT", "DIV_OP", "DO", "DOUBLE_TYPE", "ELSE", "EQ_OP", "FLOAT_NUM", "FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", "FLOAT_TYPE", "FOR", "GE_OP", "GT_OP", "ID", "IF", "INT_TYPE", "LBrace", "LETTER", "LE_OP", "LONG_TYPE", "LPrase", "LT_OP", "MOD_OP", "MUL_OP", "NE_OP", "NOT", "PLUS_OP", "PRINT", "RBrace", "RETURN", "RPrase", "SCAN", "SEMI", "SHORT_TYPE", "STRING", "SUB_OP", "VOID_TYPE", "WHILE", "WS", "'%='", "'*='", "'+='", "'-='", "'/='"
    };

    public static final int EOF=-1;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int AS_OP=4;
    public static final int Address=5;
    public static final int BOOL_TYPE=6;
    public static final int CHAR=7;
    public static final int COMMENT1=8;
    public static final int COMMENT2=9;
    public static final int COOMA=10;
    public static final int DEC_NUM=11;
    public static final int DIGIT=12;
    public static final int DIV_OP=13;
    public static final int DO=14;
    public static final int DOUBLE_TYPE=15;
    public static final int ELSE=16;
    public static final int EQ_OP=17;
    public static final int FLOAT_NUM=18;
    public static final int FLOAT_NUM1=19;
    public static final int FLOAT_NUM2=20;
    public static final int FLOAT_NUM3=21;
    public static final int FLOAT_TYPE=22;
    public static final int FOR=23;
    public static final int GE_OP=24;
    public static final int GT_OP=25;
    public static final int ID=26;
    public static final int IF=27;
    public static final int INT_TYPE=28;
    public static final int LBrace=29;
    public static final int LETTER=30;
    public static final int LE_OP=31;
    public static final int LONG_TYPE=32;
    public static final int LPrase=33;
    public static final int LT_OP=34;
    public static final int MOD_OP=35;
    public static final int MUL_OP=36;
    public static final int NE_OP=37;
    public static final int NOT=38;
    public static final int PLUS_OP=39;
    public static final int PRINT=40;
    public static final int RBrace=41;
    public static final int RETURN=42;
    public static final int RPrase=43;
    public static final int SCAN=44;
    public static final int SEMI=45;
    public static final int SHORT_TYPE=46;
    public static final int STRING=47;
    public static final int SUB_OP=48;
    public static final int VOID_TYPE=49;
    public static final int WHILE=50;
    public static final int WS=51;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public myparserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public myparserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return myparserParser.tokenNames; }
    public String getGrammarFileName() { return "myparser.g"; }



    // $ANTLR start "program"
    // myparser.g:11:1: program : ( function )* ;
    public final void program() throws RecognitionException {
        try {
            // myparser.g:11:9: ( ( function )* )
            // myparser.g:11:11: ( function )*
            {
            // myparser.g:11:11: ( function )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOL_TYPE||LA1_0==DOUBLE_TYPE||LA1_0==FLOAT_TYPE||LA1_0==INT_TYPE||LA1_0==LONG_TYPE||LA1_0==SHORT_TYPE||LA1_0==VOID_TYPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // myparser.g:11:11: function
            	    {
            	    pushFollow(FOLLOW_function_in_program44);
            	    function();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "function"
    // myparser.g:13:1: function : type ID LPrase ( param_list )? RPrase block ;
    public final void function() throws RecognitionException {
        try {
            // myparser.g:13:10: ( type ID LPrase ( param_list )? RPrase block )
            // myparser.g:13:12: type ID LPrase ( param_list )? RPrase block
            {
            if ( state.backtracking==0 ) { System.out.println("declaration func() "); }

            pushFollow(FOLLOW_type_in_function55);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,ID,FOLLOW_ID_in_function57); if (state.failed) return ;

            match(input,LPrase,FOLLOW_LPrase_in_function59); if (state.failed) return ;

            // myparser.g:13:73: ( param_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==BOOL_TYPE||LA2_0==DOUBLE_TYPE||LA2_0==FLOAT_TYPE||LA2_0==INT_TYPE||LA2_0==LONG_TYPE||LA2_0==SHORT_TYPE||LA2_0==VOID_TYPE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // myparser.g:13:73: param_list
                    {
                    pushFollow(FOLLOW_param_list_in_function61);
                    param_list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,RPrase,FOLLOW_RPrase_in_function64); if (state.failed) return ;

            pushFollow(FOLLOW_block_in_function66);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "function"



    // $ANTLR start "func"
    // myparser.g:14:1: func : ID '(' ( arg_list )? ')' ';' ;
    public final void func() throws RecognitionException {
        try {
            // myparser.g:14:6: ( ID '(' ( arg_list )? ')' ';' )
            // myparser.g:14:8: ID '(' ( arg_list )? ')' ';'
            {
            if ( state.backtracking==0 ) { System.out.println("Call func() "); }

            match(input,ID,FOLLOW_ID_in_func78); if (state.failed) return ;

            match(input,LPrase,FOLLOW_LPrase_in_func80); if (state.failed) return ;

            // myparser.g:14:55: ( arg_list )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // myparser.g:14:56: arg_list
                    {
                    pushFollow(FOLLOW_arg_list_in_func83);
                    arg_list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,RPrase,FOLLOW_RPrase_in_func87); if (state.failed) return ;

            match(input,SEMI,FOLLOW_SEMI_in_func89); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func"



    // $ANTLR start "param_list"
    // myparser.g:18:1: param_list : type ID ( ',' type ID )* ;
    public final void param_list() throws RecognitionException {
        try {
            // myparser.g:18:12: ( type ID ( ',' type ID )* )
            // myparser.g:18:14: type ID ( ',' type ID )*
            {
            pushFollow(FOLLOW_type_in_param_list101);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,ID,FOLLOW_ID_in_param_list103); if (state.failed) return ;

            // myparser.g:18:22: ( ',' type ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COOMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // myparser.g:18:23: ',' type ID
            	    {
            	    match(input,COOMA,FOLLOW_COOMA_in_param_list106); if (state.failed) return ;

            	    pushFollow(FOLLOW_type_in_param_list108);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,ID,FOLLOW_ID_in_param_list110); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "param_list"



    // $ANTLR start "arg_list"
    // myparser.g:19:1: arg_list : ID ( ',' ID )* ;
    public final void arg_list() throws RecognitionException {
        try {
            // myparser.g:19:10: ( ID ( ',' ID )* )
            // myparser.g:19:12: ID ( ',' ID )*
            {
            match(input,ID,FOLLOW_ID_in_arg_list119); if (state.failed) return ;

            // myparser.g:19:15: ( ',' ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COOMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // myparser.g:19:16: ',' ID
            	    {
            	    match(input,COOMA,FOLLOW_COOMA_in_arg_list122); if (state.failed) return ;

            	    match(input,ID,FOLLOW_ID_in_arg_list125); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "arg_list"



    // $ANTLR start "statement"
    // myparser.g:23:1: statement : ( expression ';' | declaration ';' | selection_statement | while_statement | for_statement | do_while_statement | return_statement | scanf_statement | printf_statement | func | block );
    public final void statement() throws RecognitionException {
        try {
            // myparser.g:23:11: ( expression ';' | declaration ';' | selection_statement | while_statement | for_statement | do_while_statement | return_statement | scanf_statement | printf_statement | func | block )
            int alt6=11;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==AS_OP||LA6_1==DIV_OP||LA6_1==EQ_OP||(LA6_1 >= GE_OP && LA6_1 <= GT_OP)||LA6_1==LE_OP||(LA6_1 >= LT_OP && LA6_1 <= NE_OP)||LA6_1==PLUS_OP||LA6_1==SEMI||LA6_1==SUB_OP||(LA6_1 >= 52 && LA6_1 <= 56)) ) {
                    alt6=1;
                }
                else if ( (LA6_1==LPrase) ) {
                    int LA6_26 = input.LA(3);

                    if ( (synpred6_myparser()) ) {
                        alt6=1;
                    }
                    else if ( (synpred15_myparser()) ) {
                        alt6=10;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 26, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case Address:
            case DEC_NUM:
            case FLOAT_NUM:
            case NOT:
            case PLUS_OP:
            case STRING:
            case SUB_OP:
                {
                alt6=1;
                }
                break;
            case BOOL_TYPE:
            case DOUBLE_TYPE:
            case FLOAT_TYPE:
            case INT_TYPE:
            case LONG_TYPE:
            case SHORT_TYPE:
            case VOID_TYPE:
                {
                alt6=2;
                }
                break;
            case IF:
                {
                alt6=3;
                }
                break;
            case WHILE:
                {
                alt6=4;
                }
                break;
            case FOR:
                {
                alt6=5;
                }
                break;
            case DO:
                {
                alt6=6;
                }
                break;
            case RETURN:
                {
                alt6=7;
                }
                break;
            case SCAN:
                {
                alt6=8;
                }
                break;
            case PRINT:
                {
                alt6=9;
                }
                break;
            case LBrace:
                {
                alt6=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // myparser.g:23:13: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_statement137);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,SEMI,FOLLOW_SEMI_in_statement139); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // myparser.g:24:13: declaration ';'
                    {
                    pushFollow(FOLLOW_declaration_in_statement154);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,SEMI,FOLLOW_SEMI_in_statement156); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // myparser.g:25:13: selection_statement
                    {
                    pushFollow(FOLLOW_selection_statement_in_statement170);
                    selection_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // myparser.g:26:13: while_statement
                    {
                    pushFollow(FOLLOW_while_statement_in_statement184);
                    while_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // myparser.g:27:13: for_statement
                    {
                    pushFollow(FOLLOW_for_statement_in_statement199);
                    for_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // myparser.g:28:13: do_while_statement
                    {
                    pushFollow(FOLLOW_do_while_statement_in_statement214);
                    do_while_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // myparser.g:29:13: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_statement229);
                    return_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // myparser.g:30:13: scanf_statement
                    {
                    pushFollow(FOLLOW_scanf_statement_in_statement244);
                    scanf_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // myparser.g:31:13: printf_statement
                    {
                    pushFollow(FOLLOW_printf_statement_in_statement258);
                    printf_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // myparser.g:32:13: func
                    {
                    pushFollow(FOLLOW_func_in_statement272);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // myparser.g:33:13: block
                    {
                    pushFollow(FOLLOW_block_in_statement286);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "block"
    // myparser.g:35:1: block : '{' ( statement )* '}' ;
    public final void block() throws RecognitionException {
        try {
            // myparser.g:35:7: ( '{' ( statement )* '}' )
            // myparser.g:35:9: '{' ( statement )* '}'
            {
            match(input,LBrace,FOLLOW_LBrace_in_block295); if (state.failed) return ;

            // myparser.g:35:13: ( statement )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= Address && LA7_0 <= BOOL_TYPE)||LA7_0==DEC_NUM||(LA7_0 >= DO && LA7_0 <= DOUBLE_TYPE)||LA7_0==FLOAT_NUM||(LA7_0 >= FLOAT_TYPE && LA7_0 <= FOR)||(LA7_0 >= ID && LA7_0 <= LBrace)||LA7_0==LONG_TYPE||(LA7_0 >= NOT && LA7_0 <= PRINT)||LA7_0==RETURN||LA7_0==SCAN||(LA7_0 >= SHORT_TYPE && LA7_0 <= WHILE)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // myparser.g:35:13: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block297);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,RBrace,FOLLOW_RBrace_in_block300); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "selection_statement"
    // myparser.g:37:1: selection_statement : IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )? ;
    public final void selection_statement() throws RecognitionException {
        try {
            // myparser.g:37:20: ( IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )? )
            // myparser.g:37:22: IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )?
            {
            if ( state.backtracking==0 ) { System.out.println("Parsing an selection_statement "); }

            match(input,IF,FOLLOW_IF_in_selection_statement309); if (state.failed) return ;

            match(input,LPrase,FOLLOW_LPrase_in_selection_statement311); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_selection_statement313);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RPrase,FOLLOW_RPrase_in_selection_statement315); if (state.failed) return ;

            pushFollow(FOLLOW_statement_in_selection_statement317);
            statement();

            state._fsp--;
            if (state.failed) return ;

            // myparser.g:37:113: ( options {k=1; backtrack=false; } : ELSE statement )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                int LA8_1 = input.LA(2);

                if ( (true) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // myparser.g:37:146: ELSE statement
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_selection_statement332); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_selection_statement334);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "selection_statement"



    // $ANTLR start "while_statement"
    // myparser.g:40:1: while_statement : WHILE '(' expression ')' statement ;
    public final void while_statement() throws RecognitionException {
        try {
            // myparser.g:40:17: ( WHILE '(' expression ')' statement )
            // myparser.g:40:19: WHILE '(' expression ')' statement
            {
            if ( state.backtracking==0 ) { System.out.println("Parsing an WHILE statement "); }

            match(input,WHILE,FOLLOW_WHILE_in_while_statement367); if (state.failed) return ;

            match(input,LPrase,FOLLOW_LPrase_in_while_statement369); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_while_statement371);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RPrase,FOLLOW_RPrase_in_while_statement373); if (state.failed) return ;

            pushFollow(FOLLOW_statement_in_while_statement375);
            statement();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "while_statement"



    // $ANTLR start "for_statement"
    // myparser.g:42:1: for_statement : FOR '(' ( expression | declaration )? ';' ( expression )? ';' ( expression )? ')' statement ;
    public final void for_statement() throws RecognitionException {
        try {
            // myparser.g:42:15: ( FOR '(' ( expression | declaration )? ';' ( expression )? ';' ( expression )? ')' statement )
            // myparser.g:42:17: FOR '(' ( expression | declaration )? ';' ( expression )? ';' ( expression )? ')' statement
            {
            if ( state.backtracking==0 ) { System.out.println("Parsing an FOR statement "); }

            match(input,FOR,FOLLOW_FOR_in_for_statement386); if (state.failed) return ;

            match(input,LPrase,FOLLOW_LPrase_in_for_statement388); if (state.failed) return ;

            // myparser.g:42:78: ( expression | declaration )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Address||LA9_0==DEC_NUM||LA9_0==FLOAT_NUM||LA9_0==ID||(LA9_0 >= NOT && LA9_0 <= PLUS_OP)||(LA9_0 >= STRING && LA9_0 <= SUB_OP)) ) {
                alt9=1;
            }
            else if ( (LA9_0==BOOL_TYPE||LA9_0==DOUBLE_TYPE||LA9_0==FLOAT_TYPE||LA9_0==INT_TYPE||LA9_0==LONG_TYPE||LA9_0==SHORT_TYPE||LA9_0==VOID_TYPE) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // myparser.g:42:79: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement391);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // myparser.g:42:92: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_statement395);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,SEMI,FOLLOW_SEMI_in_for_statement399); if (state.failed) return ;

            // myparser.g:42:110: ( expression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Address||LA10_0==DEC_NUM||LA10_0==FLOAT_NUM||LA10_0==ID||(LA10_0 >= NOT && LA10_0 <= PLUS_OP)||(LA10_0 >= STRING && LA10_0 <= SUB_OP)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // myparser.g:42:110: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement401);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,SEMI,FOLLOW_SEMI_in_for_statement404); if (state.failed) return ;

            // myparser.g:42:126: ( expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Address||LA11_0==DEC_NUM||LA11_0==FLOAT_NUM||LA11_0==ID||(LA11_0 >= NOT && LA11_0 <= PLUS_OP)||(LA11_0 >= STRING && LA11_0 <= SUB_OP)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // myparser.g:42:126: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement406);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,RPrase,FOLLOW_RPrase_in_for_statement409); if (state.failed) return ;

            pushFollow(FOLLOW_statement_in_for_statement411);
            statement();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "for_statement"



    // $ANTLR start "do_while_statement"
    // myparser.g:44:1: do_while_statement : DO statement WHILE '(' expression ')' ';' ;
    public final void do_while_statement() throws RecognitionException {
        try {
            // myparser.g:44:20: ( DO statement WHILE '(' expression ')' ';' )
            // myparser.g:44:21: DO statement WHILE '(' expression ')' ';'
            {
            if ( state.backtracking==0 ) { System.out.println("Parsing an DO_WHILE statement "); }

            match(input,DO,FOLLOW_DO_in_do_while_statement421); if (state.failed) return ;

            pushFollow(FOLLOW_statement_in_do_while_statement423);
            statement();

            state._fsp--;
            if (state.failed) return ;

            match(input,WHILE,FOLLOW_WHILE_in_do_while_statement425); if (state.failed) return ;

            match(input,LPrase,FOLLOW_LPrase_in_do_while_statement427); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_do_while_statement429);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RPrase,FOLLOW_RPrase_in_do_while_statement431); if (state.failed) return ;

            match(input,SEMI,FOLLOW_SEMI_in_do_while_statement433); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "do_while_statement"



    // $ANTLR start "scanf_statement"
    // myparser.g:46:1: scanf_statement : SCAN '(' STRING ',' Address ID ( ',' Address ID )* ')' ';' ;
    public final void scanf_statement() throws RecognitionException {
        try {
            // myparser.g:46:17: ( SCAN '(' STRING ',' Address ID ( ',' Address ID )* ')' ';' )
            // myparser.g:46:20: SCAN '(' STRING ',' Address ID ( ',' Address ID )* ')' ';'
            {
            if ( state.backtracking==0 ) { System.out.println("Parsing an scanf_statement "); }

            match(input,SCAN,FOLLOW_SCAN_in_scanf_statement444); if (state.failed) return ;

            match(input,LPrase,FOLLOW_LPrase_in_scanf_statement446); if (state.failed) return ;

            match(input,STRING,FOLLOW_STRING_in_scanf_statement448); if (state.failed) return ;

            match(input,COOMA,FOLLOW_COOMA_in_scanf_statement450); if (state.failed) return ;

            match(input,Address,FOLLOW_Address_in_scanf_statement452); if (state.failed) return ;

            match(input,ID,FOLLOW_ID_in_scanf_statement454); if (state.failed) return ;

            // myparser.g:46:105: ( ',' Address ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COOMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // myparser.g:46:106: ',' Address ID
            	    {
            	    match(input,COOMA,FOLLOW_COOMA_in_scanf_statement457); if (state.failed) return ;

            	    match(input,Address,FOLLOW_Address_in_scanf_statement459); if (state.failed) return ;

            	    match(input,ID,FOLLOW_ID_in_scanf_statement461); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input,RPrase,FOLLOW_RPrase_in_scanf_statement465); if (state.failed) return ;

            match(input,SEMI,FOLLOW_SEMI_in_scanf_statement467); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "scanf_statement"



    // $ANTLR start "printf_statement"
    // myparser.g:48:1: printf_statement : PRINT '(' STRING ( ',' expression )* ')' ';' ;
    public final void printf_statement() throws RecognitionException {
        try {
            // myparser.g:48:18: ( PRINT '(' STRING ( ',' expression )* ')' ';' )
            // myparser.g:48:20: PRINT '(' STRING ( ',' expression )* ')' ';'
            {
            if ( state.backtracking==0 ) { System.out.println("Parsing an printf_statement "); }

            match(input,PRINT,FOLLOW_PRINT_in_printf_statement476); if (state.failed) return ;

            match(input,LPrase,FOLLOW_LPrase_in_printf_statement478); if (state.failed) return ;

            match(input,STRING,FOLLOW_STRING_in_printf_statement480); if (state.failed) return ;

            // myparser.g:48:92: ( ',' expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COOMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // myparser.g:48:93: ',' expression
            	    {
            	    match(input,COOMA,FOLLOW_COOMA_in_printf_statement483); if (state.failed) return ;

            	    pushFollow(FOLLOW_expression_in_printf_statement485);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,RPrase,FOLLOW_RPrase_in_printf_statement489); if (state.failed) return ;

            match(input,SEMI,FOLLOW_SEMI_in_printf_statement491); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "printf_statement"



    // $ANTLR start "return_statement"
    // myparser.g:51:1: return_statement : RETURN ( expression )? ';' ;
    public final void return_statement() throws RecognitionException {
        try {
            // myparser.g:51:18: ( RETURN ( expression )? ';' )
            // myparser.g:51:20: RETURN ( expression )? ';'
            {
            if ( state.backtracking==0 ) { System.out.println("Parsing an return_statement "); }

            match(input,RETURN,FOLLOW_RETURN_in_return_statement501); if (state.failed) return ;

            // myparser.g:51:82: ( expression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Address||LA14_0==DEC_NUM||LA14_0==FLOAT_NUM||LA14_0==ID||(LA14_0 >= NOT && LA14_0 <= PLUS_OP)||(LA14_0 >= STRING && LA14_0 <= SUB_OP)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // myparser.g:51:82: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement503);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,SEMI,FOLLOW_SEMI_in_return_statement506); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "return_statement"



    // $ANTLR start "declaration"
    // myparser.g:53:1: declaration : type ID ( '=' ( ID | DEC_NUM | FLOAT_NUM ) )? ( COOMA ID ( '=' ( ID | DEC_NUM | FLOAT_NUM ) )? )* ;
    public final void declaration() throws RecognitionException {
        try {
            // myparser.g:53:13: ( type ID ( '=' ( ID | DEC_NUM | FLOAT_NUM ) )? ( COOMA ID ( '=' ( ID | DEC_NUM | FLOAT_NUM ) )? )* )
            // myparser.g:53:15: type ID ( '=' ( ID | DEC_NUM | FLOAT_NUM ) )? ( COOMA ID ( '=' ( ID | DEC_NUM | FLOAT_NUM ) )? )*
            {
            if ( state.backtracking==0 ) { System.out.println("Parsing an declaration "); }

            pushFollow(FOLLOW_type_in_declaration516);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,ID,FOLLOW_ID_in_declaration518); if (state.failed) return ;

            // myparser.g:53:73: ( '=' ( ID | DEC_NUM | FLOAT_NUM ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==AS_OP) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // myparser.g:53:74: '=' ( ID | DEC_NUM | FLOAT_NUM )
                    {
                    match(input,AS_OP,FOLLOW_AS_OP_in_declaration521); if (state.failed) return ;

                    if ( input.LA(1)==DEC_NUM||input.LA(1)==FLOAT_NUM||input.LA(1)==ID ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // myparser.g:53:103: ( COOMA ID ( '=' ( ID | DEC_NUM | FLOAT_NUM ) )? )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COOMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // myparser.g:53:104: COOMA ID ( '=' ( ID | DEC_NUM | FLOAT_NUM ) )?
            	    {
            	    match(input,COOMA,FOLLOW_COOMA_in_declaration534); if (state.failed) return ;

            	    match(input,ID,FOLLOW_ID_in_declaration536); if (state.failed) return ;

            	    // myparser.g:53:112: ( '=' ( ID | DEC_NUM | FLOAT_NUM ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==AS_OP) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // myparser.g:53:113: '=' ( ID | DEC_NUM | FLOAT_NUM )
            	            {
            	            match(input,AS_OP,FOLLOW_AS_OP_in_declaration538); if (state.failed) return ;

            	            if ( input.LA(1)==DEC_NUM||input.LA(1)==FLOAT_NUM||input.LA(1)==ID ) {
            	                input.consume();
            	                state.errorRecovery=false;
            	                state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return ;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "expression"
    // myparser.g:55:1: expression : assignment ;
    public final void expression() throws RecognitionException {
        try {
            // myparser.g:55:12: ( assignment )
            // myparser.g:55:14: assignment
            {
            pushFollow(FOLLOW_assignment_in_expression559);
            assignment();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "assignment"
    // myparser.g:57:1: assignment : ( ( ID '+=' assignment ) | ( ID '*=' assignment ) | ( ID '/=' assignment ) | ( ID '%=' assignment ) | ( ID '-=' assignment ) | equality ( AS_OP assignment )? );
    public final void assignment() throws RecognitionException {
        try {
            // myparser.g:57:12: ( ( ID '+=' assignment ) | ( ID '*=' assignment ) | ( ID '/=' assignment ) | ( ID '%=' assignment ) | ( ID '-=' assignment ) | equality ( AS_OP assignment )? )
            int alt19=6;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                switch ( input.LA(2) ) {
                case 54:
                    {
                    alt19=1;
                    }
                    break;
                case 53:
                    {
                    alt19=2;
                    }
                    break;
                case 56:
                    {
                    alt19=3;
                    }
                    break;
                case 52:
                    {
                    alt19=4;
                    }
                    break;
                case 55:
                    {
                    alt19=5;
                    }
                    break;
                case EOF:
                case AS_OP:
                case COOMA:
                case DIV_OP:
                case EQ_OP:
                case GE_OP:
                case GT_OP:
                case LE_OP:
                case LPrase:
                case LT_OP:
                case MOD_OP:
                case MUL_OP:
                case NE_OP:
                case PLUS_OP:
                case RPrase:
                case SEMI:
                case SUB_OP:
                    {
                    alt19=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA19_0==Address||LA19_0==DEC_NUM||LA19_0==FLOAT_NUM||(LA19_0 >= NOT && LA19_0 <= PLUS_OP)||(LA19_0 >= STRING && LA19_0 <= SUB_OP)) ) {
                alt19=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // myparser.g:57:14: ( ID '+=' assignment )
                    {
                    // myparser.g:57:14: ( ID '+=' assignment )
                    // myparser.g:57:15: ID '+=' assignment
                    {
                    match(input,ID,FOLLOW_ID_in_assignment569); if (state.failed) return ;

                    match(input,54,FOLLOW_54_in_assignment571); if (state.failed) return ;

                    pushFollow(FOLLOW_assignment_in_assignment573);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    if ( state.backtracking==0 ) { System.out.println("Parsing an += "); }

                    }
                    break;
                case 2 :
                    // myparser.g:58:15: ( ID '*=' assignment )
                    {
                    // myparser.g:58:15: ( ID '*=' assignment )
                    // myparser.g:58:16: ID '*=' assignment
                    {
                    match(input,ID,FOLLOW_ID_in_assignment593); if (state.failed) return ;

                    match(input,53,FOLLOW_53_in_assignment595); if (state.failed) return ;

                    pushFollow(FOLLOW_assignment_in_assignment597);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    if ( state.backtracking==0 ) { System.out.println("Parsing an *= "); }

                    }
                    break;
                case 3 :
                    // myparser.g:59:15: ( ID '/=' assignment )
                    {
                    // myparser.g:59:15: ( ID '/=' assignment )
                    // myparser.g:59:16: ID '/=' assignment
                    {
                    match(input,ID,FOLLOW_ID_in_assignment617); if (state.failed) return ;

                    match(input,56,FOLLOW_56_in_assignment619); if (state.failed) return ;

                    pushFollow(FOLLOW_assignment_in_assignment621);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    if ( state.backtracking==0 ) { System.out.println("Parsing an /= "); }

                    }
                    break;
                case 4 :
                    // myparser.g:60:15: ( ID '%=' assignment )
                    {
                    // myparser.g:60:15: ( ID '%=' assignment )
                    // myparser.g:60:16: ID '%=' assignment
                    {
                    match(input,ID,FOLLOW_ID_in_assignment641); if (state.failed) return ;

                    match(input,52,FOLLOW_52_in_assignment643); if (state.failed) return ;

                    pushFollow(FOLLOW_assignment_in_assignment645);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    if ( state.backtracking==0 ) { System.out.println("Parsing an %= "); }

                    }
                    break;
                case 5 :
                    // myparser.g:61:15: ( ID '-=' assignment )
                    {
                    // myparser.g:61:15: ( ID '-=' assignment )
                    // myparser.g:61:16: ID '-=' assignment
                    {
                    match(input,ID,FOLLOW_ID_in_assignment665); if (state.failed) return ;

                    match(input,55,FOLLOW_55_in_assignment667); if (state.failed) return ;

                    pushFollow(FOLLOW_assignment_in_assignment669);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    if ( state.backtracking==0 ) { System.out.println("Parsing an -= "); }

                    }
                    break;
                case 6 :
                    // myparser.g:62:15: equality ( AS_OP assignment )?
                    {
                    pushFollow(FOLLOW_equality_in_assignment688);
                    equality();

                    state._fsp--;
                    if (state.failed) return ;

                    // myparser.g:62:24: ( AS_OP assignment )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==AS_OP) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // myparser.g:62:26: AS_OP assignment
                            {
                            match(input,AS_OP,FOLLOW_AS_OP_in_assignment692); if (state.failed) return ;

                            pushFollow(FOLLOW_assignment_in_assignment694);
                            assignment();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "equality"
    // myparser.g:64:1: equality : relational ( ( EQ_OP | NE_OP ) relational )* ;
    public final void equality() throws RecognitionException {
        try {
            // myparser.g:64:10: ( relational ( ( EQ_OP | NE_OP ) relational )* )
            // myparser.g:64:12: relational ( ( EQ_OP | NE_OP ) relational )*
            {
            pushFollow(FOLLOW_relational_in_equality706);
            relational();

            state._fsp--;
            if (state.failed) return ;

            // myparser.g:64:23: ( ( EQ_OP | NE_OP ) relational )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EQ_OP||LA20_0==NE_OP) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // myparser.g:64:25: ( EQ_OP | NE_OP ) relational
            	    {
            	    if ( input.LA(1)==EQ_OP||input.LA(1)==NE_OP ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relational_in_equality720);
            	    relational();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) { System.out.println("Parsing an equality Operators"); }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "equality"



    // $ANTLR start "relational"
    // myparser.g:66:1: relational : additive ( ( GE_OP | GT_OP | LE_OP | LT_OP ) additive )* ;
    public final void relational() throws RecognitionException {
        try {
            // myparser.g:66:12: ( additive ( ( GE_OP | GT_OP | LE_OP | LT_OP ) additive )* )
            // myparser.g:66:14: additive ( ( GE_OP | GT_OP | LE_OP | LT_OP ) additive )*
            {
            pushFollow(FOLLOW_additive_in_relational734);
            additive();

            state._fsp--;
            if (state.failed) return ;

            // myparser.g:66:23: ( ( GE_OP | GT_OP | LE_OP | LT_OP ) additive )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= GE_OP && LA21_0 <= GT_OP)||LA21_0==LE_OP||LA21_0==LT_OP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // myparser.g:66:25: ( GE_OP | GT_OP | LE_OP | LT_OP ) additive
            	    {
            	    if ( (input.LA(1) >= GE_OP && input.LA(1) <= GT_OP)||input.LA(1)==LE_OP||input.LA(1)==LT_OP ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additive_in_relational756);
            	    additive();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) { System.out.println("Parsing an compare Operators"); }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relational"



    // $ANTLR start "additive"
    // myparser.g:68:1: additive : multiplicative ( ( PLUS_OP | SUB_OP ) multiplicative )* ;
    public final void additive() throws RecognitionException {
        try {
            // myparser.g:68:10: ( multiplicative ( ( PLUS_OP | SUB_OP ) multiplicative )* )
            // myparser.g:68:12: multiplicative ( ( PLUS_OP | SUB_OP ) multiplicative )*
            {
            pushFollow(FOLLOW_multiplicative_in_additive769);
            multiplicative();

            state._fsp--;
            if (state.failed) return ;

            // myparser.g:68:27: ( ( PLUS_OP | SUB_OP ) multiplicative )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==PLUS_OP||LA22_0==SUB_OP) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // myparser.g:68:29: ( PLUS_OP | SUB_OP ) multiplicative
            	    {
            	    if ( input.LA(1)==PLUS_OP||input.LA(1)==SUB_OP ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicative_in_additive783);
            	    multiplicative();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) { System.out.println("Parsing an additive Operators"); }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "additive"



    // $ANTLR start "multiplicative"
    // myparser.g:70:1: multiplicative : unary ( ( MUL_OP | MOD_OP | DIV_OP ) unary )* ;
    public final void multiplicative() throws RecognitionException {
        try {
            // myparser.g:70:16: ( unary ( ( MUL_OP | MOD_OP | DIV_OP ) unary )* )
            // myparser.g:70:18: unary ( ( MUL_OP | MOD_OP | DIV_OP ) unary )*
            {
            pushFollow(FOLLOW_unary_in_multiplicative796);
            unary();

            state._fsp--;
            if (state.failed) return ;

            // myparser.g:70:24: ( ( MUL_OP | MOD_OP | DIV_OP ) unary )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==DIV_OP||(LA23_0 >= MOD_OP && LA23_0 <= MUL_OP)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // myparser.g:70:26: ( MUL_OP | MOD_OP | DIV_OP ) unary
            	    {
            	    if ( input.LA(1)==DIV_OP||(input.LA(1) >= MOD_OP && input.LA(1) <= MUL_OP) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_multiplicative814);
            	    unary();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) { System.out.println("Parsing an multiplicative Operators"); }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multiplicative"



    // $ANTLR start "unary"
    // myparser.g:72:1: unary : ( ( PLUS_OP | SUB_OP | NOT | Address ) )? primary ;
    public final void unary() throws RecognitionException {
        try {
            // myparser.g:72:7: ( ( ( PLUS_OP | SUB_OP | NOT | Address ) )? primary )
            // myparser.g:72:9: ( ( PLUS_OP | SUB_OP | NOT | Address ) )? primary
            {
            // myparser.g:72:9: ( ( PLUS_OP | SUB_OP | NOT | Address ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Address||(LA24_0 >= NOT && LA24_0 <= PLUS_OP)||LA24_0==SUB_OP) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // myparser.g:72:11: ( PLUS_OP | SUB_OP | NOT | Address )
                    {
                    if ( input.LA(1)==Address||(input.LA(1) >= NOT && input.LA(1) <= PLUS_OP)||input.LA(1)==SUB_OP ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    if ( state.backtracking==0 ) { System.out.println("Parsing an  unary Operators"); }

                    }
                    break;

            }


            pushFollow(FOLLOW_primary_in_unary849);
            primary();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "unary"



    // $ANTLR start "primary"
    // myparser.g:74:1: primary : ( DEC_NUM | FLOAT_NUM | STRING | ID ( LPrase expression RPrase )? );
    public final void primary() throws RecognitionException {
        try {
            // myparser.g:74:9: ( DEC_NUM | FLOAT_NUM | STRING | ID ( LPrase expression RPrase )? )
            int alt26=4;
            switch ( input.LA(1) ) {
            case DEC_NUM:
                {
                alt26=1;
                }
                break;
            case FLOAT_NUM:
                {
                alt26=2;
                }
                break;
            case STRING:
                {
                alt26=3;
                }
                break;
            case ID:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // myparser.g:74:11: DEC_NUM
                    {
                    match(input,DEC_NUM,FOLLOW_DEC_NUM_in_primary858); if (state.failed) return ;

                    if ( state.backtracking==0 ) { System.out.println("DEC_NUM");}

                    }
                    break;
                case 2 :
                    // myparser.g:75:11: FLOAT_NUM
                    {
                    match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_primary872); if (state.failed) return ;

                    if ( state.backtracking==0 ) { System.out.println("FLOAT_NUM");}

                    }
                    break;
                case 3 :
                    // myparser.g:76:11: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primary886); if (state.failed) return ;

                    if ( state.backtracking==0 ) { System.out.println("STRING");}

                    }
                    break;
                case 4 :
                    // myparser.g:77:11: ID ( LPrase expression RPrase )?
                    {
                    match(input,ID,FOLLOW_ID_in_primary899); if (state.failed) return ;

                    // myparser.g:77:14: ( LPrase expression RPrase )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==LPrase) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // myparser.g:77:16: LPrase expression RPrase
                            {
                            match(input,LPrase,FOLLOW_LPrase_in_primary903); if (state.failed) return ;

                            pushFollow(FOLLOW_expression_in_primary905);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            match(input,RPrase,FOLLOW_RPrase_in_primary907); if (state.failed) return ;

                            if ( state.backtracking==0 ) { System.out.println("ID");}

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primary"



    // $ANTLR start "type"
    // myparser.g:79:1: type : ( INT_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | SHORT_TYPE | BOOL_TYPE | VOID_TYPE );
    public final void type() throws RecognitionException {
        try {
            // myparser.g:79:5: ( INT_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | SHORT_TYPE | BOOL_TYPE | VOID_TYPE )
            int alt27=7;
            switch ( input.LA(1) ) {
            case INT_TYPE:
                {
                alt27=1;
                }
                break;
            case FLOAT_TYPE:
                {
                alt27=2;
                }
                break;
            case DOUBLE_TYPE:
                {
                alt27=3;
                }
                break;
            case LONG_TYPE:
                {
                alt27=4;
                }
                break;
            case SHORT_TYPE:
                {
                alt27=5;
                }
                break;
            case BOOL_TYPE:
                {
                alt27=6;
                }
                break;
            case VOID_TYPE:
                {
                alt27=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // myparser.g:79:7: INT_TYPE
                    {
                    match(input,INT_TYPE,FOLLOW_INT_TYPE_in_type919); if (state.failed) return ;

                    if ( state.backtracking==0 ) { System.out.println("TYPE INT");}

                    }
                    break;
                case 2 :
                    // myparser.g:80:9: FLOAT_TYPE
                    {
                    match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_type932); if (state.failed) return ;

                    if ( state.backtracking==0 ) { System.out.println("TYPE FLOAT");}

                    }
                    break;
                case 3 :
                    // myparser.g:81:9: DOUBLE_TYPE
                    {
                    match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_type945); if (state.failed) return ;

                    if ( state.backtracking==0 ) { System.out.println("TYPE DOUBLE");}

                    }
                    break;
                case 4 :
                    // myparser.g:82:9: LONG_TYPE
                    {
                    match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_type958); if (state.failed) return ;

                    if ( state.backtracking==0 ) { System.out.println("TYPE LONG");}

                    }
                    break;
                case 5 :
                    // myparser.g:83:9: SHORT_TYPE
                    {
                    match(input,SHORT_TYPE,FOLLOW_SHORT_TYPE_in_type971); if (state.failed) return ;

                    if ( state.backtracking==0 ) { System.out.println("TYPE SHORT");}

                    }
                    break;
                case 6 :
                    // myparser.g:84:9: BOOL_TYPE
                    {
                    match(input,BOOL_TYPE,FOLLOW_BOOL_TYPE_in_type984); if (state.failed) return ;

                    if ( state.backtracking==0 ) { System.out.println("TYPE BOOL");}

                    }
                    break;
                case 7 :
                    // myparser.g:85:9: VOID_TYPE
                    {
                    match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type997); if (state.failed) return ;

                    if ( state.backtracking==0 ) { System.out.println("TYPE VOID");}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "type"

    // $ANTLR start synpred6_myparser
    public final void synpred6_myparser_fragment() throws RecognitionException {
        // myparser.g:23:13: ( expression ';' )
        // myparser.g:23:13: expression ';'
        {
        pushFollow(FOLLOW_expression_in_synpred6_myparser137);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred6_myparser139); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_myparser

    // $ANTLR start synpred15_myparser
    public final void synpred15_myparser_fragment() throws RecognitionException {
        // myparser.g:32:13: ( func )
        // myparser.g:32:13: func
        {
        pushFollow(FOLLOW_func_in_synpred15_myparser272);
        func();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_myparser

    // Delegated rules

    public final boolean synpred15_myparser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_myparser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_myparser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_myparser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_function_in_program44 = new BitSet(new long[]{0x0002400110408042L});
    public static final BitSet FOLLOW_type_in_function55 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_function57 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPrase_in_function59 = new BitSet(new long[]{0x0002480110408040L});
    public static final BitSet FOLLOW_param_list_in_function61 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPrase_in_function64 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_block_in_function66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_func78 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPrase_in_func80 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_arg_list_in_func83 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPrase_in_func87 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_func89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_param_list101 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_param_list103 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COOMA_in_param_list106 = new BitSet(new long[]{0x0002400110408040L});
    public static final BitSet FOLLOW_type_in_param_list108 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_param_list110 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_arg_list119 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COOMA_in_arg_list122 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_arg_list125 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_statement137 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_statement139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_statement154 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_statement156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_statement_in_statement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scanf_statement_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printf_statement_in_statement258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_statement272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBrace_in_block295 = new BitSet(new long[]{0x0007D7C13CC4C860L});
    public static final BitSet FOLLOW_statement_in_block297 = new BitSet(new long[]{0x0007D7C13CC4C860L});
    public static final BitSet FOLLOW_RBrace_in_block300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement309 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPrase_in_selection_statement311 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_expression_in_selection_statement313 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPrase_in_selection_statement315 = new BitSet(new long[]{0x0007D5C13CC4C860L});
    public static final BitSet FOLLOW_statement_in_selection_statement317 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement332 = new BitSet(new long[]{0x0007D5C13CC4C860L});
    public static final BitSet FOLLOW_statement_in_selection_statement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement367 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPrase_in_while_statement369 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_expression_in_while_statement371 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPrase_in_while_statement373 = new BitSet(new long[]{0x0007D5C13CC4C860L});
    public static final BitSet FOLLOW_statement_in_while_statement375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_statement386 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPrase_in_for_statement388 = new BitSet(new long[]{0x0003E0C114448860L});
    public static final BitSet FOLLOW_expression_in_for_statement391 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_declaration_in_for_statement395 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement399 = new BitSet(new long[]{0x0001A0C004040820L});
    public static final BitSet FOLLOW_expression_in_for_statement401 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement404 = new BitSet(new long[]{0x000188C004040820L});
    public static final BitSet FOLLOW_expression_in_for_statement406 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPrase_in_for_statement409 = new BitSet(new long[]{0x0007D5C13CC4C860L});
    public static final BitSet FOLLOW_statement_in_for_statement411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_do_while_statement421 = new BitSet(new long[]{0x0007D5C13CC4C860L});
    public static final BitSet FOLLOW_statement_in_do_while_statement423 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_WHILE_in_do_while_statement425 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPrase_in_do_while_statement427 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_expression_in_do_while_statement429 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPrase_in_do_while_statement431 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_do_while_statement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCAN_in_scanf_statement444 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPrase_in_scanf_statement446 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_STRING_in_scanf_statement448 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COOMA_in_scanf_statement450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Address_in_scanf_statement452 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_scanf_statement454 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_COOMA_in_scanf_statement457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Address_in_scanf_statement459 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_scanf_statement461 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_RPrase_in_scanf_statement465 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_scanf_statement467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_printf_statement476 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPrase_in_printf_statement478 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_STRING_in_printf_statement480 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_COOMA_in_printf_statement483 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_expression_in_printf_statement485 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_RPrase_in_printf_statement489 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_printf_statement491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_statement501 = new BitSet(new long[]{0x0001A0C004040820L});
    public static final BitSet FOLLOW_expression_in_return_statement503 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_return_statement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration516 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_declaration518 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_AS_OP_in_declaration521 = new BitSet(new long[]{0x0000000004040800L});
    public static final BitSet FOLLOW_set_in_declaration523 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COOMA_in_declaration534 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_declaration536 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_AS_OP_in_declaration538 = new BitSet(new long[]{0x0000000004040800L});
    public static final BitSet FOLLOW_set_in_declaration540 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_assignment_in_expression559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment569 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_assignment571 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_assignment_in_assignment573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment593 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_assignment595 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_assignment_in_assignment597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment617 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_assignment619 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_assignment_in_assignment621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment641 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_assignment643 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_assignment_in_assignment645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment665 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_assignment667 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_assignment_in_assignment669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equality_in_assignment688 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AS_OP_in_assignment692 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_assignment_in_assignment694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relational_in_equality706 = new BitSet(new long[]{0x0000002000020002L});
    public static final BitSet FOLLOW_set_in_equality710 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_relational_in_equality720 = new BitSet(new long[]{0x0000002000020002L});
    public static final BitSet FOLLOW_additive_in_relational734 = new BitSet(new long[]{0x0000000483000002L});
    public static final BitSet FOLLOW_set_in_relational738 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_additive_in_relational756 = new BitSet(new long[]{0x0000000483000002L});
    public static final BitSet FOLLOW_multiplicative_in_additive769 = new BitSet(new long[]{0x0001008000000002L});
    public static final BitSet FOLLOW_set_in_additive773 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_multiplicative_in_additive783 = new BitSet(new long[]{0x0001008000000002L});
    public static final BitSet FOLLOW_unary_in_multiplicative796 = new BitSet(new long[]{0x0000001800002002L});
    public static final BitSet FOLLOW_set_in_multiplicative800 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_unary_in_multiplicative814 = new BitSet(new long[]{0x0000001800002002L});
    public static final BitSet FOLLOW_set_in_unary829 = new BitSet(new long[]{0x0000800004040800L});
    public static final BitSet FOLLOW_primary_in_unary849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_NUM_in_primary858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_NUM_in_primary872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary899 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_LPrase_in_primary903 = new BitSet(new long[]{0x000180C004040820L});
    public static final BitSet FOLLOW_expression_in_primary905 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPrase_in_primary907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_type919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_type932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_type945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_type958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_TYPE_in_type971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_TYPE_in_type984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_TYPE_in_type997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred6_myparser137 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred6_myparser139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_synpred15_myparser272 = new BitSet(new long[]{0x0000000000000002L});

}