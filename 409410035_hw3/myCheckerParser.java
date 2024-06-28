// $ANTLR 3.4 myChecker.g 2023-05-12 20:43:44

    // import packages here.
    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class myCheckerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "CHAR", "COMMENT", "ELSE", "FLOAT", "Floating_point_constant", "IF", "INT", "Identifier", "Integer_constant", "MAIN", "VOID", "WS", "'!'", "'!='", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "'-'", "'--'", "'-='", "'/'", "'/='", "':'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'>>='", "'?'", "'^'", "'^='", "'do'", "'for'", "'while'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int BOOLEAN=4;
    public static final int CHAR=5;
    public static final int COMMENT=6;
    public static final int ELSE=7;
    public static final int FLOAT=8;
    public static final int Floating_point_constant=9;
    public static final int IF=10;
    public static final int INT=11;
    public static final int Identifier=12;
    public static final int Integer_constant=13;
    public static final int MAIN=14;
    public static final int VOID=15;
    public static final int WS=16;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public myCheckerParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public myCheckerParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return myCheckerParser.tokenNames; }
    public String getGrammarFileName() { return "myChecker.g"; }


        boolean TRACEON = false;
       
    	
        public enum TypeInfo {
            Integer,
    		Float,
    		Char,
    		Bool,
    		Error
        } 
    	
    	HashMap<String,TypeInfo> symtab = new HashMap<String,TypeInfo>();




    // $ANTLR start "program"
    // myChecker.g:24:1: program : VOID MAIN '(' ')' '{' statements '}' ;
    public final void program() throws RecognitionException {
        try {
            // myChecker.g:25:2: ( VOID MAIN '(' ')' '{' statements '}' )
            // myChecker.g:25:4: VOID MAIN '(' ')' '{' statements '}'
            {
            match(input,VOID,FOLLOW_VOID_in_program23); 

            match(input,MAIN,FOLLOW_MAIN_in_program25); 

            match(input,24,FOLLOW_24_in_program27); 

            match(input,25,FOLLOW_25_in_program29); 

            match(input,54,FOLLOW_54_in_program31); 

            pushFollow(FOLLOW_statements_in_program33);
            statements();

            state._fsp--;


            match(input,58,FOLLOW_58_in_program35); 

             if (TRACEON) System.out.println("VOID MAIN () {statements}"); 

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



    // $ANTLR start "type"
    // myChecker.g:30:1: type returns [TypeInfo attr_type] : ( INT | FLOAT | BOOLEAN | CHAR );
    public final TypeInfo type() throws RecognitionException {
        TypeInfo attr_type = null;


        try {
            // myChecker.g:31:2: ( INT | FLOAT | BOOLEAN | CHAR )
            int alt1=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt1=1;
                }
                break;
            case FLOAT:
                {
                alt1=2;
                }
                break;
            case BOOLEAN:
                {
                alt1=3;
                }
                break;
            case CHAR:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // myChecker.g:31:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_type58); 

                     if (TRACEON) System.out.println("type: INT");     attr_type = TypeInfo.Integer; 

                    }
                    break;
                case 2 :
                    // myChecker.g:32:4: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_type69); 

                     if (TRACEON) System.out.println("type: FLOAT");   attr_type = TypeInfo.Float; 

                    }
                    break;
                case 3 :
                    // myChecker.g:33:4: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type78); 

                     if (TRACEON) System.out.println("type: BOOLEAN"); attr_type = TypeInfo.Char; 

                    }
                    break;
                case 4 :
                    // myChecker.g:34:4: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_type85); 

                     if (TRACEON) System.out.println("type: CHAR");    attr_type = TypeInfo.Bool; 

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
        return attr_type;
    }
    // $ANTLR end "type"



    // $ANTLR start "statements"
    // myChecker.g:37:1: statements : ( statement statements |);
    public final void statements() throws RecognitionException {
        try {
            // myChecker.g:38:2: ( statement statements |)
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= BOOLEAN && LA2_0 <= CHAR)||LA2_0==FLOAT||(LA2_0 >= IF && LA2_0 <= Identifier)||LA2_0==24||LA2_0==29||LA2_0==32||(LA2_0 >= 51 && LA2_0 <= 53)) ) {
                alt2=1;
            }
            else if ( (LA2_0==58) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // myChecker.g:38:4: statement statements
                    {
                    pushFollow(FOLLOW_statement_in_statements101);
                    statement();

                    state._fsp--;


                    pushFollow(FOLLOW_statements_in_statements103);
                    statements();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // myChecker.g:39:3: 
                    {
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
    // $ANTLR end "statements"


    public static class logical_expr_return extends ParserRuleReturnScope {
        public TypeInfo attr_type;
    };


    // $ANTLR start "logical_expr"
    // myChecker.g:42:2: logical_expr returns [TypeInfo attr_type] : (a= relation_expr ( '&&' b= relation_expr | '||' c= relation_expr )* | '!' d= relation_expr );
    public final myCheckerParser.logical_expr_return logical_expr() throws RecognitionException {
        myCheckerParser.logical_expr_return retval = new myCheckerParser.logical_expr_return();
        retval.start = input.LT(1);


        myCheckerParser.relation_expr_return a =null;

        myCheckerParser.relation_expr_return b =null;

        myCheckerParser.relation_expr_return c =null;

        myCheckerParser.relation_expr_return d =null;


        try {
            // myChecker.g:43:5: (a= relation_expr ( '&&' b= relation_expr | '||' c= relation_expr )* | '!' d= relation_expr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Floating_point_constant||(LA4_0 >= Identifier && LA4_0 <= Integer_constant)||LA4_0==24||LA4_0==31) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // myChecker.g:43:7: a= relation_expr ( '&&' b= relation_expr | '||' c= relation_expr )*
                    {
                    pushFollow(FOLLOW_relation_expr_in_logical_expr129);
                    a=relation_expr();

                    state._fsp--;


                    retval.attr_type = (a!=null?a.attr_type:null); 

                    // myChecker.g:44:5: ( '&&' b= relation_expr | '||' c= relation_expr )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==21) ) {
                            alt3=1;
                        }
                        else if ( (LA3_0==57) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // myChecker.g:44:7: '&&' b= relation_expr
                    	    {
                    	    match(input,21,FOLLOW_21_in_logical_expr139); 

                    	    pushFollow(FOLLOW_relation_expr_in_logical_expr147);
                    	    b=relation_expr();

                    	    state._fsp--;


                    	     
                    	    				if ((a!=null?a.attr_type:null) != (b!=null?b.attr_type:null)) {
                    	    					System.out.println("Error! " + 
                    	    										(a!=null?((Token)a.start):null).getLine() +
                    	    										": Type mismatch for the operator && in an expression.");
                    	    					retval.attr_type = TypeInfo.Error;
                    	    				} else {
                    	    					retval.attr_type = TypeInfo.Bool;
                    	    				}
                    	    			

                    	    }
                    	    break;
                    	case 2 :
                    	    // myChecker.g:55:5: '||' c= relation_expr
                    	    {
                    	    match(input,57,FOLLOW_57_in_logical_expr159); 

                    	    pushFollow(FOLLOW_relation_expr_in_logical_expr165);
                    	    c=relation_expr();

                    	    state._fsp--;


                    	     
                    	    				if ((a!=null?a.attr_type:null) != (c!=null?c.attr_type:null)) {
                    	    					System.out.println("Error! " + 
                    	    										(a!=null?((Token)a.start):null).getLine() +
                    	    										": Type mismatch for the operator || in an expression.");
                    	    					retval.attr_type = TypeInfo.Error;
                    	    				} else {
                    	    					retval.attr_type = TypeInfo.Bool;
                    	    				}
                    	            	

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // myChecker.g:67:4: '!' d= relation_expr
                    {
                    match(input,17,FOLLOW_17_in_logical_expr183); 

                    pushFollow(FOLLOW_relation_expr_in_logical_expr190);
                    d=relation_expr();

                    state._fsp--;



                    			if ((d!=null?d.attr_type:null) != TypeInfo.Bool) {
                    					System.out.println("Error! " + 
                    										(d!=null?((Token)d.start):null).getLine() +
                    										": Type mismatch for the operator ! in an expression.");
                    					retval.attr_type = TypeInfo.Error;
                    				} else {
                    					retval.attr_type = TypeInfo.Bool;
                    				}
                    		

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_expr"


    public static class relation_expr_return extends ParserRuleReturnScope {
        public TypeInfo attr_type;
    };


    // $ANTLR start "relation_expr"
    // myChecker.g:82:1: relation_expr returns [TypeInfo attr_type] : a= bitwise_expr ( '==' b= bitwise_expr | '!=' c= bitwise_expr | '<=' d= bitwise_expr | '>=' e= bitwise_expr | '<' f= bitwise_expr | '>' g= bitwise_expr )* ;
    public final myCheckerParser.relation_expr_return relation_expr() throws RecognitionException {
        myCheckerParser.relation_expr_return retval = new myCheckerParser.relation_expr_return();
        retval.start = input.LT(1);


        myCheckerParser.bitwise_expr_return a =null;

        myCheckerParser.bitwise_expr_return b =null;

        myCheckerParser.bitwise_expr_return c =null;

        myCheckerParser.bitwise_expr_return d =null;

        myCheckerParser.bitwise_expr_return e =null;

        myCheckerParser.bitwise_expr_return f =null;

        myCheckerParser.bitwise_expr_return g =null;


        try {
            // myChecker.g:83:2: (a= bitwise_expr ( '==' b= bitwise_expr | '!=' c= bitwise_expr | '<=' d= bitwise_expr | '>=' e= bitwise_expr | '<' f= bitwise_expr | '>' g= bitwise_expr )* )
            // myChecker.g:84:3: a= bitwise_expr ( '==' b= bitwise_expr | '!=' c= bitwise_expr | '<=' d= bitwise_expr | '>=' e= bitwise_expr | '<' f= bitwise_expr | '>' g= bitwise_expr )*
            {
            pushFollow(FOLLOW_bitwise_expr_in_relation_expr222);
            a=bitwise_expr();

            state._fsp--;


             retval.attr_type = (a!=null?a.attr_type:null);

            // myChecker.g:85:4: ( '==' b= bitwise_expr | '!=' c= bitwise_expr | '<=' d= bitwise_expr | '>=' e= bitwise_expr | '<' f= bitwise_expr | '>' g= bitwise_expr )*
            loop5:
            do {
                int alt5=7;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    alt5=1;
                    }
                    break;
                case 18:
                    {
                    alt5=2;
                    }
                    break;
                case 41:
                    {
                    alt5=3;
                    }
                    break;
                case 45:
                    {
                    alt5=4;
                    }
                    break;
                case 38:
                    {
                    alt5=5;
                    }
                    break;
                case 44:
                    {
                    alt5=6;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // myChecker.g:85:6: '==' b= bitwise_expr
            	    {
            	    match(input,43,FOLLOW_43_in_relation_expr231); 

            	    pushFollow(FOLLOW_bitwise_expr_in_relation_expr237);
            	    b=bitwise_expr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (b!=null?b.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator == in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;
            	    		  } else {
            	    			  retval.attr_type = TypeInfo.Bool;
            	    		  }
            	            

            	    }
            	    break;
            	case 2 :
            	    // myChecker.g:95:6: '!=' c= bitwise_expr
            	    {
            	    match(input,18,FOLLOW_18_in_relation_expr251); 

            	    pushFollow(FOLLOW_bitwise_expr_in_relation_expr257);
            	    c=bitwise_expr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (c!=null?c.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator != in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;;
            	    		  } else {
            	    			  retval.attr_type = TypeInfo.Bool;
            	    		  }
            	            

            	    }
            	    break;
            	case 3 :
            	    // myChecker.g:105:5: '<=' d= bitwise_expr
            	    {
            	    match(input,41,FOLLOW_41_in_relation_expr270); 

            	    pushFollow(FOLLOW_bitwise_expr_in_relation_expr276);
            	    d=bitwise_expr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (d!=null?d.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator <= in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;
            	    		  } else {
            	    			  retval.attr_type = TypeInfo.Bool;
            	    		  }
            	            

            	    }
            	    break;
            	case 4 :
            	    // myChecker.g:115:5: '>=' e= bitwise_expr
            	    {
            	    match(input,45,FOLLOW_45_in_relation_expr289); 

            	    pushFollow(FOLLOW_bitwise_expr_in_relation_expr295);
            	    e=bitwise_expr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (e!=null?e.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator >= in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;
            	    		  } else {
            	    			  retval.attr_type = TypeInfo.Bool;
            	    		  }
            	            

            	    }
            	    break;
            	case 5 :
            	    // myChecker.g:125:5: '<' f= bitwise_expr
            	    {
            	    match(input,38,FOLLOW_38_in_relation_expr308); 

            	    pushFollow(FOLLOW_bitwise_expr_in_relation_expr314);
            	    f=bitwise_expr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (f!=null?f.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator < in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;
            	    		  } else {
            	    			  retval.attr_type = TypeInfo.Bool;
            	    		  }
            	            

            	    }
            	    break;
            	case 6 :
            	    // myChecker.g:135:5: '>' g= bitwise_expr
            	    {
            	    match(input,44,FOLLOW_44_in_relation_expr327); 

            	    pushFollow(FOLLOW_bitwise_expr_in_relation_expr333);
            	    g=bitwise_expr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (g!=null?g.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator > in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;
            	    		  } else {
            	    			  retval.attr_type = TypeInfo.Bool;
            	    		  }
            	            

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relation_expr"


    public static class bitwise_expr_return extends ParserRuleReturnScope {
        public TypeInfo attr_type;
    };


    // $ANTLR start "bitwise_expr"
    // myChecker.g:149:2: bitwise_expr returns [TypeInfo attr_type] : a= arith_expression ( '>>' b= arith_expression | '<<' c= arith_expression | '&' d= arith_expression | '^' e= arith_expression | '~' f= arith_expression | '|' g= arith_expression )* ;
    public final myCheckerParser.bitwise_expr_return bitwise_expr() throws RecognitionException {
        myCheckerParser.bitwise_expr_return retval = new myCheckerParser.bitwise_expr_return();
        retval.start = input.LT(1);


        myCheckerParser.arith_expression_return a =null;

        myCheckerParser.arith_expression_return b =null;

        myCheckerParser.arith_expression_return c =null;

        myCheckerParser.arith_expression_return d =null;

        myCheckerParser.arith_expression_return e =null;

        myCheckerParser.arith_expression_return f =null;

        myCheckerParser.arith_expression_return g =null;


        try {
            // myChecker.g:150:3: (a= arith_expression ( '>>' b= arith_expression | '<<' c= arith_expression | '&' d= arith_expression | '^' e= arith_expression | '~' f= arith_expression | '|' g= arith_expression )* )
            // myChecker.g:150:5: a= arith_expression ( '>>' b= arith_expression | '<<' c= arith_expression | '&' d= arith_expression | '^' e= arith_expression | '~' f= arith_expression | '|' g= arith_expression )*
            {
            pushFollow(FOLLOW_arith_expression_in_bitwise_expr371);
            a=arith_expression();

            state._fsp--;


             retval.attr_type = (a!=null?a.attr_type:null); 

            // myChecker.g:151:3: ( '>>' b= arith_expression | '<<' c= arith_expression | '&' d= arith_expression | '^' e= arith_expression | '~' f= arith_expression | '|' g= arith_expression )*
            loop6:
            do {
                int alt6=7;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    alt6=1;
                    }
                    break;
                case 39:
                    {
                    alt6=2;
                    }
                    break;
                case 22:
                    {
                    alt6=3;
                    }
                    break;
                case 49:
                    {
                    alt6=4;
                    }
                    break;
                case 59:
                    {
                    alt6=5;
                    }
                    break;
                case 55:
                    {
                    alt6=6;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // myChecker.g:151:5: '>>' b= arith_expression
            	    {
            	    match(input,46,FOLLOW_46_in_bitwise_expr379); 

            	    pushFollow(FOLLOW_arith_expression_in_bitwise_expr385);
            	    b=arith_expression();

            	    state._fsp--;



            	    			   if ((a!=null?a.attr_type:null) !=  TypeInfo.Integer || (b!=null?b.attr_type:null) != TypeInfo.Integer)  {
            	    					System.out.println("Error! " + 
            	    										(a!=null?((Token)a.start):null).getLine() +
            	    										": Type mismatch for the operator >> in an expression both side need to be integer.");
            	    					retval.attr_type = TypeInfo.Error;
            	    				}
            	    			

            	    }
            	    break;
            	case 2 :
            	    // myChecker.g:160:5: '<<' c= arith_expression
            	    {
            	    match(input,39,FOLLOW_39_in_bitwise_expr396); 

            	    pushFollow(FOLLOW_arith_expression_in_bitwise_expr402);
            	    c=arith_expression();

            	    state._fsp--;



            	    				 if ((a!=null?a.attr_type:null) !=  TypeInfo.Integer || (c!=null?c.attr_type:null) != TypeInfo.Integer)  {
            	    					System.out.println("Error! " + 
            	    										(a!=null?((Token)a.start):null).getLine() +
            	    										": Type mismatch for the operator << in an expression both side need to be integer.");
            	    					retval.attr_type = TypeInfo.Error;
            	    				}
            	    			

            	    }
            	    break;
            	case 3 :
            	    // myChecker.g:169:5: '&' d= arith_expression
            	    {
            	    match(input,22,FOLLOW_22_in_bitwise_expr413); 

            	    pushFollow(FOLLOW_arith_expression_in_bitwise_expr419);
            	    d=arith_expression();

            	    state._fsp--;


            	      
            	    			    if ((a!=null?a.attr_type:null) !=  TypeInfo.Integer || (d!=null?d.attr_type:null) != TypeInfo.Integer)  {
            	    					System.out.println("Error! " + 
            	    										(a!=null?((Token)a.start):null).getLine() +
            	    										": Type mismatch for the operator & in an expression both side need to be integer.");
            	    					retval.attr_type = TypeInfo.Error;
            	    				}
            	    			

            	    }
            	    break;
            	case 4 :
            	    // myChecker.g:178:5: '^' e= arith_expression
            	    {
            	    match(input,49,FOLLOW_49_in_bitwise_expr430); 

            	    pushFollow(FOLLOW_arith_expression_in_bitwise_expr436);
            	    e=arith_expression();

            	    state._fsp--;


            	     
            	    				if ((a!=null?a.attr_type:null) !=  TypeInfo.Integer || (e!=null?e.attr_type:null) != TypeInfo.Integer)  {
            	    					System.out.println("Error! " + 
            	    										(a!=null?((Token)a.start):null).getLine() +
            	    										": Type mismatch for the operator ^ in an expression both side need to be integer.");
            	    					retval.attr_type = TypeInfo.Error;
            	    				}
            	            	

            	    }
            	    break;
            	case 5 :
            	    // myChecker.g:187:5: '~' f= arith_expression
            	    {
            	    match(input,59,FOLLOW_59_in_bitwise_expr447); 

            	    pushFollow(FOLLOW_arith_expression_in_bitwise_expr453);
            	    f=arith_expression();

            	    state._fsp--;


            	     
            	    				if ((a!=null?a.attr_type:null) !=  TypeInfo.Integer || (f!=null?f.attr_type:null) != TypeInfo.Integer)  {
            	    					System.out.println("Error! " + 
            	    										(a!=null?((Token)a.start):null).getLine() +
            	    										": Type mismatch for the operator ~ in an expression both side need to be integer.");
            	    					retval.attr_type = TypeInfo.Error;
            	    				}
            	            	

            	    }
            	    break;
            	case 6 :
            	    // myChecker.g:196:5: '|' g= arith_expression
            	    {
            	    match(input,55,FOLLOW_55_in_bitwise_expr464); 

            	    pushFollow(FOLLOW_arith_expression_in_bitwise_expr470);
            	    g=arith_expression();

            	    state._fsp--;


            	     
            	    				if ((a!=null?a.attr_type:null) !=  TypeInfo.Integer || (g!=null?g.attr_type:null) != TypeInfo.Integer)  {
            	    					System.out.println("Error! " + 
            	    										(a!=null?((Token)a.start):null).getLine() +
            	    										": Type mismatch for the operator | in an expression both side need to be integer.");
            	    					retval.attr_type = TypeInfo.Error;
            	    				}
            	            	

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bitwise_expr"


    public static class arith_expression_return extends ParserRuleReturnScope {
        public TypeInfo attr_type;
    };


    // $ANTLR start "arith_expression"
    // myChecker.g:211:1: arith_expression returns [TypeInfo attr_type] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
    public final myCheckerParser.arith_expression_return arith_expression() throws RecognitionException {
        myCheckerParser.arith_expression_return retval = new myCheckerParser.arith_expression_return();
        retval.start = input.LT(1);


        myCheckerParser.multExpr_return a =null;

        myCheckerParser.multExpr_return b =null;

        myCheckerParser.multExpr_return c =null;


        try {
            // myChecker.g:212:2: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
            // myChecker.g:212:4: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_arith_expression504);
            a=multExpr();

            state._fsp--;


             retval.attr_type = (a!=null?a.attr_type:null); 

            // myChecker.g:213:7: ( '+' b= multExpr | '-' c= multExpr )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }
                else if ( (LA7_0==31) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // myChecker.g:213:9: '+' b= multExpr
            	    {
            	    match(input,28,FOLLOW_28_in_arith_expression516); 

            	    pushFollow(FOLLOW_multExpr_in_arith_expression522);
            	    b=multExpr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (b!=null?b.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator + in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;
            	    		  }
            	            

            	    }
            	    break;
            	case 2 :
            	    // myChecker.g:221:6: '-' c= multExpr
            	    {
            	    match(input,31,FOLLOW_31_in_arith_expression536); 

            	    pushFollow(FOLLOW_multExpr_in_arith_expression542);
            	    c=multExpr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (c!=null?c.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator + in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;
            	    		  }
            	            

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arith_expression"


    public static class multExpr_return extends ParserRuleReturnScope {
        public TypeInfo attr_type;
    };


    // $ANTLR start "multExpr"
    // myChecker.g:232:1: multExpr returns [TypeInfo attr_type] : a= signExpr ( '*' b= signExpr | '/' c= signExpr | '%' d= signExpr )* ;
    public final myCheckerParser.multExpr_return multExpr() throws RecognitionException {
        myCheckerParser.multExpr_return retval = new myCheckerParser.multExpr_return();
        retval.start = input.LT(1);


        myCheckerParser.signExpr_return a =null;

        myCheckerParser.signExpr_return b =null;

        myCheckerParser.signExpr_return c =null;

        myCheckerParser.signExpr_return d =null;


        try {
            // myChecker.g:233:2: (a= signExpr ( '*' b= signExpr | '/' c= signExpr | '%' d= signExpr )* )
            // myChecker.g:233:4: a= signExpr ( '*' b= signExpr | '/' c= signExpr | '%' d= signExpr )*
            {
            pushFollow(FOLLOW_signExpr_in_multExpr574);
            a=signExpr();

            state._fsp--;


             retval.attr_type = (a!=null?a.attr_type:null); 

            // myChecker.g:234:7: ( '*' b= signExpr | '/' c= signExpr | '%' d= signExpr )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt8=1;
                    }
                    break;
                case 34:
                    {
                    alt8=2;
                    }
                    break;
                case 19:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // myChecker.g:234:9: '*' b= signExpr
            	    {
            	    match(input,26,FOLLOW_26_in_multExpr586); 

            	    pushFollow(FOLLOW_signExpr_in_multExpr592);
            	    b=signExpr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (b!=null?b.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator * in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;
            	    		  }
            	            

            	    }
            	    break;
            	case 2 :
            	    // myChecker.g:242:9: '/' c= signExpr
            	    {
            	    match(input,34,FOLLOW_34_in_multExpr608); 

            	    pushFollow(FOLLOW_signExpr_in_multExpr614);
            	    c=signExpr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (c!=null?c.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator / in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;
            	    		  }
            	            

            	    }
            	    break;
            	case 3 :
            	    // myChecker.g:250:6: '%' d= signExpr
            	    {
            	    match(input,19,FOLLOW_19_in_multExpr627); 

            	    pushFollow(FOLLOW_signExpr_in_multExpr633);
            	    d=signExpr();

            	    state._fsp--;


            	     if ((a!=null?a.attr_type:null) != (d!=null?d.attr_type:null)) {
            	    			  System.out.println("Error! " + 
            	    				                 (a!=null?((Token)a.start):null).getLine() +
            	    						         ": Type mismatch for the operator % in an expression.");
            	    		      retval.attr_type = TypeInfo.Error;
            	    		  }
            	            

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class signExpr_return extends ParserRuleReturnScope {
        public TypeInfo attr_type;
    };


    // $ANTLR start "signExpr"
    // myChecker.g:261:1: signExpr returns [TypeInfo attr_type] : ( primaryExpr | '-' primaryExpr );
    public final myCheckerParser.signExpr_return signExpr() throws RecognitionException {
        myCheckerParser.signExpr_return retval = new myCheckerParser.signExpr_return();
        retval.start = input.LT(1);


        TypeInfo primaryExpr1 =null;

        TypeInfo primaryExpr2 =null;


        try {
            // myChecker.g:262:2: ( primaryExpr | '-' primaryExpr )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Floating_point_constant||(LA9_0 >= Identifier && LA9_0 <= Integer_constant)||LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // myChecker.g:262:4: primaryExpr
                    {
                    pushFollow(FOLLOW_primaryExpr_in_signExpr660);
                    primaryExpr1=primaryExpr();

                    state._fsp--;


                     retval.attr_type = primaryExpr1; 

                    }
                    break;
                case 2 :
                    // myChecker.g:263:4: '-' primaryExpr
                    {
                    match(input,31,FOLLOW_31_in_signExpr667); 

                    pushFollow(FOLLOW_primaryExpr_in_signExpr669);
                    primaryExpr2=primaryExpr();

                    state._fsp--;


                     retval.attr_type = primaryExpr2; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signExpr"



    // $ANTLR start "primaryExpr"
    // myChecker.g:265:1: primaryExpr returns [TypeInfo attr_type] : ( Integer_constant | Floating_point_constant | Identifier | '(' logical_expr ')' );
    public final TypeInfo primaryExpr() throws RecognitionException {
        TypeInfo attr_type = null;


        Token Identifier3=null;
        myCheckerParser.logical_expr_return logical_expr4 =null;


        try {
            // myChecker.g:266:2: ( Integer_constant | Floating_point_constant | Identifier | '(' logical_expr ')' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case Integer_constant:
                {
                alt10=1;
                }
                break;
            case Floating_point_constant:
                {
                alt10=2;
                }
                break;
            case Identifier:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // myChecker.g:266:4: Integer_constant
                    {
                    match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr686); 

                     attr_type = TypeInfo.Integer; 

                    }
                    break;
                case 2 :
                    // myChecker.g:267:4: Floating_point_constant
                    {
                    match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr700); 

                     attr_type = TypeInfo.Float; 

                    }
                    break;
                case 3 :
                    // myChecker.g:268:4: Identifier
                    {
                    Identifier3=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr707); 

                     attr_type = symtab.get((Identifier3!=null?Identifier3.getText():null));

                    }
                    break;
                case 4 :
                    // myChecker.g:269:4: '(' logical_expr ')'
                    {
                    match(input,24,FOLLOW_24_in_primaryExpr718); 

                    pushFollow(FOLLOW_logical_expr_in_primaryExpr720);
                    logical_expr4=logical_expr();

                    state._fsp--;


                    match(input,25,FOLLOW_25_in_primaryExpr722); 

                     attr_type = (logical_expr4!=null?logical_expr4.attr_type:null); 

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
        return attr_type;
    }
    // $ANTLR end "primaryExpr"



    // $ANTLR start "assginExpr"
    // myChecker.g:271:1: assginExpr returns [TypeInfo attr_type] : ( Identifier '++' | Identifier '--' | Identifier '=' logical_expr | Identifier '+=' logical_expr | Identifier '-=' logical_expr | Identifier '*=' logical_expr | Identifier '/=' logical_expr | Identifier '%=' logical_expr | Identifier '<<=' logical_expr | Identifier '>>=' logical_expr | Identifier '|=' logical_expr | Identifier '&=' logical_expr | Identifier '^=' logical_expr );
    public final TypeInfo assginExpr() throws RecognitionException {
        TypeInfo attr_type = null;


        Token Identifier5=null;
        Token Identifier6=null;
        Token Identifier7=null;
        Token Identifier9=null;
        Token Identifier11=null;
        Token Identifier13=null;
        Token Identifier15=null;
        Token Identifier17=null;
        Token Identifier19=null;
        Token Identifier21=null;
        Token Identifier23=null;
        Token Identifier25=null;
        Token Identifier27=null;
        myCheckerParser.logical_expr_return logical_expr8 =null;

        myCheckerParser.logical_expr_return logical_expr10 =null;

        myCheckerParser.logical_expr_return logical_expr12 =null;

        myCheckerParser.logical_expr_return logical_expr14 =null;

        myCheckerParser.logical_expr_return logical_expr16 =null;

        myCheckerParser.logical_expr_return logical_expr18 =null;

        myCheckerParser.logical_expr_return logical_expr20 =null;

        myCheckerParser.logical_expr_return logical_expr22 =null;

        myCheckerParser.logical_expr_return logical_expr24 =null;

        myCheckerParser.logical_expr_return logical_expr26 =null;

        myCheckerParser.logical_expr_return logical_expr28 =null;


        try {
            // myChecker.g:272:2: ( Identifier '++' | Identifier '--' | Identifier '=' logical_expr | Identifier '+=' logical_expr | Identifier '-=' logical_expr | Identifier '*=' logical_expr | Identifier '/=' logical_expr | Identifier '%=' logical_expr | Identifier '<<=' logical_expr | Identifier '>>=' logical_expr | Identifier '|=' logical_expr | Identifier '&=' logical_expr | Identifier '^=' logical_expr )
            int alt11=13;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Identifier) ) {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt11=1;
                    }
                    break;
                case 32:
                    {
                    alt11=2;
                    }
                    break;
                case 42:
                    {
                    alt11=3;
                    }
                    break;
                case 30:
                    {
                    alt11=4;
                    }
                    break;
                case 33:
                    {
                    alt11=5;
                    }
                    break;
                case 27:
                    {
                    alt11=6;
                    }
                    break;
                case 35:
                    {
                    alt11=7;
                    }
                    break;
                case 20:
                    {
                    alt11=8;
                    }
                    break;
                case 40:
                    {
                    alt11=9;
                    }
                    break;
                case 47:
                    {
                    alt11=10;
                    }
                    break;
                case 56:
                    {
                    alt11=11;
                    }
                    break;
                case 23:
                    {
                    alt11=12;
                    }
                    break;
                case 50:
                    {
                    alt11=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // myChecker.g:273:2: Identifier '++'
                    {
                    Identifier5=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr743); 

                     attr_type = symtab.get((Identifier5!=null?Identifier5.getText():null)); 

                    match(input,29,FOLLOW_29_in_assginExpr748); 

                     if (attr_type != TypeInfo.Integer) {
                    			  System.out.println("Error! " + 
                    				                Identifier5.getLine() +
                    						         ": Type mismatch for the operator ++ in an expression. Must be Integer");
                    		      attr_type = TypeInfo.Error;
                    		  }
                            

                    }
                    break;
                case 2 :
                    // myChecker.g:281:3: Identifier '--'
                    {
                    Identifier6=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr753); 

                     attr_type = symtab.get((Identifier6!=null?Identifier6.getText():null)); 

                    match(input,32,FOLLOW_32_in_assginExpr757); 

                     if (attr_type != TypeInfo.Integer) {
                    			  System.out.println("Error! " + 
                    				                 Identifier6.getLine() +
                    						         ": Type mismatch for the operator -- in an expression. Must be Integer");
                    		      attr_type = TypeInfo.Error;
                    		  }
                            

                    }
                    break;
                case 3 :
                    // myChecker.g:288:7: Identifier '=' logical_expr
                    {
                    Identifier7=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr766); 

                     attr_type = symtab.get((Identifier7!=null?Identifier7.getText():null)); 

                    match(input,42,FOLLOW_42_in_assginExpr770); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr772);
                    logical_expr8=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier7!=null?Identifier7.getText():null))) {
                    	       attr_type = symtab.get((Identifier7!=null?Identifier7.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr8!=null?((Token)logical_expr8.start):null).getLine() +
                    						         ": Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr8!=null?logical_expr8.attr_type:null)) {
                               System.out.println("Error! " + 
                    				              (logical_expr8!=null?((Token)logical_expr8.start):null).getLine() +
                    						      ": Type mismatch for the two side operands in an assignment statement.");
                    		   attr_type = TypeInfo.Error;
                           }
                    	 

                    }
                    break;
                case 4 :
                    // myChecker.g:308:3: Identifier '+=' logical_expr
                    {
                    Identifier9=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr781); 

                     attr_type = symtab.get((Identifier9!=null?Identifier9.getText():null)); 

                    match(input,30,FOLLOW_30_in_assginExpr785); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr787);
                    logical_expr10=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier9!=null?Identifier9.getText():null))) {
                    	       attr_type = symtab.get((Identifier9!=null?Identifier9.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr10!=null?((Token)logical_expr10.start):null).getLine() +
                    						         ":  Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr10!=null?logical_expr10.attr_type:null)) {
                               System.out.println("Error! " + 
                    				              (logical_expr10!=null?((Token)logical_expr10.start):null).getLine() +
                    						      ": Type mismatch for the two side operands in an assignment statement.");
                    		   attr_type = TypeInfo.Error;
                           }
                    	 

                    }
                    break;
                case 5 :
                    // myChecker.g:328:4: Identifier '-=' logical_expr
                    {
                    Identifier11=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr797); 

                     attr_type = symtab.get((Identifier11!=null?Identifier11.getText():null)); 

                    match(input,33,FOLLOW_33_in_assginExpr801); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr803);
                    logical_expr12=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier11!=null?Identifier11.getText():null))) {
                    	       attr_type = symtab.get((Identifier11!=null?Identifier11.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr12!=null?((Token)logical_expr12.start):null).getLine() +
                    						         ":  Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr12!=null?logical_expr12.attr_type:null)) {
                               System.out.println("Error! " + 
                    				              (logical_expr12!=null?((Token)logical_expr12.start):null).getLine() +
                    						      ": Type mismatch for the two side operands in an assignment statement.");
                    		   attr_type = TypeInfo.Error;
                           }
                    	 

                    }
                    break;
                case 6 :
                    // myChecker.g:348:4: Identifier '*=' logical_expr
                    {
                    Identifier13=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr813); 

                     attr_type = symtab.get((Identifier13!=null?Identifier13.getText():null)); 

                    match(input,27,FOLLOW_27_in_assginExpr817); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr819);
                    logical_expr14=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier13!=null?Identifier13.getText():null))) {
                    	       attr_type = symtab.get((Identifier13!=null?Identifier13.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr14!=null?((Token)logical_expr14.start):null).getLine() +
                    						         ":  Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr14!=null?logical_expr14.attr_type:null)) {
                               System.out.println("Error! " + 
                    				              (logical_expr14!=null?((Token)logical_expr14.start):null).getLine() +
                    						      ": Type mismatch for the two side operands in an assignment statement.");
                    		   attr_type = TypeInfo.Error;
                           }
                    	 

                    }
                    break;
                case 7 :
                    // myChecker.g:368:4: Identifier '/=' logical_expr
                    {
                    Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr829); 

                     attr_type = symtab.get((Identifier15!=null?Identifier15.getText():null)); 

                    match(input,35,FOLLOW_35_in_assginExpr833); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr835);
                    logical_expr16=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier15!=null?Identifier15.getText():null))) {
                    	       attr_type = symtab.get((Identifier15!=null?Identifier15.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr16!=null?((Token)logical_expr16.start):null).getLine() +
                    						         ":  Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr16!=null?logical_expr16.attr_type:null)) {
                               System.out.println("Error! " + 
                    				              (logical_expr16!=null?((Token)logical_expr16.start):null).getLine() +
                    						      ": Type mismatch for the two side operands in an assignment statement.");
                    		   attr_type = TypeInfo.Error;
                           }
                    	

                    }
                    break;
                case 8 :
                    // myChecker.g:388:4: Identifier '%=' logical_expr
                    {
                    Identifier17=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr846); 

                     attr_type = symtab.get((Identifier17!=null?Identifier17.getText():null)); 

                    match(input,20,FOLLOW_20_in_assginExpr850); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr852);
                    logical_expr18=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier17!=null?Identifier17.getText():null))) {
                    	       attr_type = symtab.get((Identifier17!=null?Identifier17.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr18!=null?((Token)logical_expr18.start):null).getLine() +
                    						         ": Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr18!=null?logical_expr18.attr_type:null)) {
                               System.out.println("Error! " + 
                    				              (logical_expr18!=null?((Token)logical_expr18.start):null).getLine() +
                    						      ": Type mismatch for the two side operands in an assignment statement.");
                    		   attr_type = TypeInfo.Error;
                           }
                    	

                    }
                    break;
                case 9 :
                    // myChecker.g:408:4: Identifier '<<=' logical_expr
                    {
                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr863); 

                     attr_type = symtab.get((Identifier19!=null?Identifier19.getText():null)); 

                    match(input,40,FOLLOW_40_in_assginExpr867); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr869);
                    logical_expr20=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier19!=null?Identifier19.getText():null))) {
                    	       attr_type = symtab.get((Identifier19!=null?Identifier19.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr20!=null?((Token)logical_expr20.start):null).getLine() +
                    						         ": Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr20!=null?logical_expr20.attr_type:null)  || attr_type != TypeInfo.Integer) {
                               System.out.println("Error! " + 
                    				              (logical_expr20!=null?((Token)logical_expr20.start):null).getLine() +
                    						      ": Type mismatch for the two side operands, both of them must be integer type in the assignment statement.");
                    		   attr_type = TypeInfo.Error;
                           }
                    	 

                    }
                    break;
                case 10 :
                    // myChecker.g:428:7: Identifier '>>=' logical_expr
                    {
                    Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr882); 

                     attr_type = symtab.get((Identifier21!=null?Identifier21.getText():null)); 

                    match(input,47,FOLLOW_47_in_assginExpr886); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr888);
                    logical_expr22=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier21!=null?Identifier21.getText():null))) {
                    	       attr_type = symtab.get((Identifier21!=null?Identifier21.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr22!=null?((Token)logical_expr22.start):null).getLine() +
                    						         ": Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr22!=null?logical_expr22.attr_type:null)  || attr_type != TypeInfo.Integer) {
                               System.out.println("Error! " + 
                    				              (logical_expr22!=null?((Token)logical_expr22.start):null).getLine() +
                    						      ": Type mismatch for the two side operands, both of them must be integer type in the assignment statement.");
                    		   attr_type = TypeInfo.Error;
                           }
                    	

                    }
                    break;
                case 11 :
                    // myChecker.g:448:6: Identifier '|=' logical_expr
                    {
                    Identifier23=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr901); 

                     attr_type = symtab.get((Identifier23!=null?Identifier23.getText():null)); 

                    match(input,56,FOLLOW_56_in_assginExpr905); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr907);
                    logical_expr24=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier23!=null?Identifier23.getText():null))) {
                    	       attr_type = symtab.get((Identifier23!=null?Identifier23.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr24!=null?((Token)logical_expr24.start):null).getLine() +
                    						         ": Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr24!=null?logical_expr24.attr_type:null)  || attr_type != TypeInfo.Integer) {
                               System.out.println("Error! " + 
                    				              (logical_expr24!=null?((Token)logical_expr24.start):null).getLine() +
                    						      ": Type mismatch for the two side operands, both of them must be integer type in the assignment statement.");
                    		   attr_type = TypeInfo.Error;
                           }
                    	

                    }
                    break;
                case 12 :
                    // myChecker.g:468:6: Identifier '&=' logical_expr
                    {
                    Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr920); 

                     attr_type = symtab.get((Identifier25!=null?Identifier25.getText():null)); 

                    match(input,23,FOLLOW_23_in_assginExpr924); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr926);
                    logical_expr26=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier25!=null?Identifier25.getText():null))) {
                    	       attr_type = symtab.get((Identifier25!=null?Identifier25.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr26!=null?((Token)logical_expr26.start):null).getLine() +
                    						         ": Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr26!=null?logical_expr26.attr_type:null)  || attr_type != TypeInfo.Integer) {
                               System.out.println("Error! " + 
                    				              (logical_expr26!=null?((Token)logical_expr26.start):null).getLine() +
                    						      ": Type mismatch for the two side operands, both of them must be integer type in the assignment statement.");
                    		   attr_type = TypeInfo.Error;
                           }
                    	

                    }
                    break;
                case 13 :
                    // myChecker.g:488:6: Identifier '^=' logical_expr
                    {
                    Identifier27=(Token)match(input,Identifier,FOLLOW_Identifier_in_assginExpr939); 

                     attr_type = symtab.get((Identifier27!=null?Identifier27.getText():null)); 

                    match(input,50,FOLLOW_50_in_assginExpr943); 

                    pushFollow(FOLLOW_logical_expr_in_assginExpr945);
                    logical_expr28=logical_expr();

                    state._fsp--;



                    	   if (symtab.containsKey((Identifier27!=null?Identifier27.getText():null))) {
                    	       attr_type = symtab.get((Identifier27!=null?Identifier27.getText():null));
                    	   } else {
                               /* Add codes to report and handle this error */
                    		    System.out.println("Error! " + 
                    				                 (logical_expr28!=null?((Token)logical_expr28.start):null).getLine() +
                    						         ": Undeclared identifier.");
                    	       attr_type = TypeInfo.Error;
                    		  
                    	   }
                    		
                    	   if (attr_type != (logical_expr28!=null?logical_expr28.attr_type:null)  || attr_type != TypeInfo.Integer) {
                               System.out.println("Error! " + 
                    				              (logical_expr28!=null?((Token)logical_expr28.start):null).getLine() +
                    						      ": Type mismatch for the two side operands, both of them must be integer type in the assignment statement.");
                    		   attr_type = TypeInfo.Error;
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
        return attr_type;
    }
    // $ANTLR end "assginExpr"



    // $ANTLR start "statement"
    // myChecker.g:511:1: statement returns [TypeInfo attr_type] : ( assginExpr ';' | IF '(' logical_expr ')' if_then_statements | ternary_expr | type Identifier ( '=' value= logical_expr )? ';' | '++' Identifier ';' | '--' Identifier ';' | while_statement | for_statement | do_while_statement );
    public final TypeInfo statement() throws RecognitionException {
        TypeInfo attr_type = null;


        Token Identifier30=null;
        Token Identifier31=null;
        Token Identifier32=null;
        myCheckerParser.logical_expr_return value =null;

        TypeInfo type29 =null;


        try {
            // myChecker.g:512:2: ( assginExpr ';' | IF '(' logical_expr ')' if_then_statements | ternary_expr | type Identifier ( '=' value= logical_expr )? ';' | '++' Identifier ';' | '--' Identifier ';' | while_statement | for_statement | do_while_statement )
            int alt13=9;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt13=1;
                }
                break;
            case IF:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            case BOOLEAN:
            case CHAR:
            case FLOAT:
            case INT:
                {
                alt13=4;
                }
                break;
            case 29:
                {
                alt13=5;
                }
                break;
            case 32:
                {
                alt13=6;
                }
                break;
            case 53:
                {
                alt13=7;
                }
                break;
            case 52:
                {
                alt13=8;
                }
                break;
            case 51:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // myChecker.g:512:5: assginExpr ';'
                    {
                    pushFollow(FOLLOW_assginExpr_in_statement971);
                    assginExpr();

                    state._fsp--;


                    match(input,37,FOLLOW_37_in_statement974); 

                    }
                    break;
                case 2 :
                    // myChecker.g:513:4: IF '(' logical_expr ')' if_then_statements
                    {
                    match(input,IF,FOLLOW_IF_in_statement979); 

                    match(input,24,FOLLOW_24_in_statement981); 

                    pushFollow(FOLLOW_logical_expr_in_statement983);
                    logical_expr();

                    state._fsp--;


                    match(input,25,FOLLOW_25_in_statement985); 

                    pushFollow(FOLLOW_if_then_statements_in_statement987);
                    if_then_statements();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // myChecker.g:514:4: ternary_expr
                    {
                    pushFollow(FOLLOW_ternary_expr_in_statement992);
                    ternary_expr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // myChecker.g:515:4: type Identifier ( '=' value= logical_expr )? ';'
                    {
                    pushFollow(FOLLOW_type_in_statement997);
                    type29=type();

                    state._fsp--;


                    Identifier30=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement999); 

                    // myChecker.g:515:20: ( '=' value= logical_expr )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==42) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // myChecker.g:515:22: '=' value= logical_expr
                            {
                            match(input,42,FOLLOW_42_in_statement1003); 

                            pushFollow(FOLLOW_logical_expr_in_statement1009);
                            value=logical_expr();

                            state._fsp--;



                            		if (type29 != (value!=null?value.attr_type:null)) { 
                            			System.out.println("Error! " + 
                            				              (value!=null?((Token)value.start):null).getLine() +
                            						      ": Type mismatch for the two side operands in an assignment statement.");
                            		    attr_type = TypeInfo.Error;
                            		}

                            	

                            }
                            break;

                    }


                    match(input,37,FOLLOW_37_in_statement1015); 


                    	   if (TRACEON) System.out.println("declarations: type Identifier : declarations");
                    	 
                      	   if (symtab.containsKey((Identifier30!=null?Identifier30.getText():null))) {
                    		   System.out.println("Error! " + 
                    				              Identifier30.getLine() + 
                    							  ": Redeclared identifier.");
                    	   } else {
                    		   /* Add ID and its attr_type into the symbol table. */
                    		   symtab.put((Identifier30!=null?Identifier30.getText():null), type29);
                    	   }
                    	 

                    }
                    break;
                case 5 :
                    // myChecker.g:536:4: '++' Identifier ';'
                    {
                    match(input,29,FOLLOW_29_in_statement1028); 

                    Identifier31=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement1030); 

                     
                    		attr_type = symtab.get((Identifier31!=null?Identifier31.getText():null));
                    		if (attr_type != TypeInfo.Integer) {
                    			  System.out.println("Error! " + 
                    				                Identifier31.getLine() +
                    						         ": Type mismatch for the operator ++ in an expression. Must be Integer");
                    		      attr_type = TypeInfo.Error;
                    		  }
                            

                    match(input,37,FOLLOW_37_in_statement1033); 

                    }
                    break;
                case 6 :
                    // myChecker.g:545:4: '--' Identifier ';'
                    {
                    match(input,32,FOLLOW_32_in_statement1038); 

                    Identifier32=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement1040); 

                     
                    		attr_type = symtab.get((Identifier32!=null?Identifier32.getText():null));
                    		if (attr_type != TypeInfo.Integer) {
                    			  System.out.println("Error! " + 
                    				                Identifier32.getLine() +
                    						         ": Type mismatch for the operator -- in an expression. Must be Integer");
                    		      attr_type = TypeInfo.Error;
                    		  }
                            

                    match(input,37,FOLLOW_37_in_statement1043); 

                    }
                    break;
                case 7 :
                    // myChecker.g:554:4: while_statement
                    {
                    pushFollow(FOLLOW_while_statement_in_statement1048);
                    while_statement();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // myChecker.g:555:4: for_statement
                    {
                    pushFollow(FOLLOW_for_statement_in_statement1053);
                    for_statement();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // myChecker.g:556:4: do_while_statement
                    {
                    pushFollow(FOLLOW_do_while_statement_in_statement1058);
                    do_while_statement();

                    state._fsp--;


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
        return attr_type;
    }
    // $ANTLR end "statement"



    // $ANTLR start "ternary_expr"
    // myChecker.g:561:1: ternary_expr returns [TypeInfo attr_type] : '(' a= logical_expr ')' '?' ( logical_expr ) ':' ( logical_expr ) ';' ;
    public final TypeInfo ternary_expr() throws RecognitionException {
        TypeInfo attr_type = null;


        myCheckerParser.logical_expr_return a =null;


        try {
            // myChecker.g:561:42: ( '(' a= logical_expr ')' '?' ( logical_expr ) ':' ( logical_expr ) ';' )
            // myChecker.g:562:2: '(' a= logical_expr ')' '?' ( logical_expr ) ':' ( logical_expr ) ';'
            {
            match(input,24,FOLLOW_24_in_ternary_expr1074); 

            pushFollow(FOLLOW_logical_expr_in_ternary_expr1080);
            a=logical_expr();

            state._fsp--;



            		if ((a!=null?a.attr_type:null) != TypeInfo.Bool) {
            			System.out.println("Error! " + (a!=null?((Token)a.start):null).getLine()+ ": Type need to be boolean in condition part");
            			attr_type = TypeInfo.Error;
            		} else {
            			attr_type = TypeInfo.Bool;
            		}
            	

            match(input,25,FOLLOW_25_in_ternary_expr1087); 

            match(input,48,FOLLOW_48_in_ternary_expr1089); 

            // myChecker.g:571:11: ( logical_expr )
            // myChecker.g:571:12: logical_expr
            {
            pushFollow(FOLLOW_logical_expr_in_ternary_expr1093);
            logical_expr();

            state._fsp--;


            }


            match(input,36,FOLLOW_36_in_ternary_expr1097); 

            // myChecker.g:571:32: ( logical_expr )
            // myChecker.g:571:33: logical_expr
            {
            pushFollow(FOLLOW_logical_expr_in_ternary_expr1101);
            logical_expr();

            state._fsp--;


            }


            match(input,37,FOLLOW_37_in_ternary_expr1105); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return attr_type;
    }
    // $ANTLR end "ternary_expr"



    // $ANTLR start "if_then_statements"
    // myChecker.g:574:1: if_then_statements : ( statement | '{' statements '}' ( ELSE ( IF '(' logical_expr ')' )? '{' statements '}' )? );
    public final void if_then_statements() throws RecognitionException {
        try {
            // myChecker.g:575:2: ( statement | '{' statements '}' ( ELSE ( IF '(' logical_expr ')' )? '{' statements '}' )? )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= BOOLEAN && LA16_0 <= CHAR)||LA16_0==FLOAT||(LA16_0 >= IF && LA16_0 <= Identifier)||LA16_0==24||LA16_0==29||LA16_0==32||(LA16_0 >= 51 && LA16_0 <= 53)) ) {
                alt16=1;
            }
            else if ( (LA16_0==54) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // myChecker.g:575:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_if_then_statements1116);
                    statement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // myChecker.g:576:4: '{' statements '}' ( ELSE ( IF '(' logical_expr ')' )? '{' statements '}' )?
                    {
                    match(input,54,FOLLOW_54_in_if_then_statements1121); 

                    pushFollow(FOLLOW_statements_in_if_then_statements1123);
                    statements();

                    state._fsp--;


                    match(input,58,FOLLOW_58_in_if_then_statements1125); 

                    // myChecker.g:576:23: ( ELSE ( IF '(' logical_expr ')' )? '{' statements '}' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==ELSE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // myChecker.g:576:24: ELSE ( IF '(' logical_expr ')' )? '{' statements '}'
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_if_then_statements1128); 

                            // myChecker.g:576:29: ( IF '(' logical_expr ')' )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==IF) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // myChecker.g:576:32: IF '(' logical_expr ')'
                                    {
                                    match(input,IF,FOLLOW_IF_in_if_then_statements1133); 

                                    match(input,24,FOLLOW_24_in_if_then_statements1135); 

                                    pushFollow(FOLLOW_logical_expr_in_if_then_statements1137);
                                    logical_expr();

                                    state._fsp--;


                                    match(input,25,FOLLOW_25_in_if_then_statements1139); 

                                    }
                                    break;

                            }


                            match(input,54,FOLLOW_54_in_if_then_statements1143); 

                            pushFollow(FOLLOW_statements_in_if_then_statements1145);
                            statements();

                            state._fsp--;


                            match(input,58,FOLLOW_58_in_if_then_statements1147); 

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
    // $ANTLR end "if_then_statements"



    // $ANTLR start "while_statement"
    // myChecker.g:579:1: while_statement : 'while' '(' logical_expr ')' '{' ( statements ) '}' ;
    public final void while_statement() throws RecognitionException {
        myCheckerParser.logical_expr_return logical_expr33 =null;


        try {
            // myChecker.g:579:17: ( 'while' '(' logical_expr ')' '{' ( statements ) '}' )
            // myChecker.g:579:19: 'while' '(' logical_expr ')' '{' ( statements ) '}'
            {
              if (TRACEON) System.out.println("Parsing an WHILE statement "); 

            match(input,53,FOLLOW_53_in_while_statement1161); 

            match(input,24,FOLLOW_24_in_while_statement1163); 

            pushFollow(FOLLOW_logical_expr_in_while_statement1165);
            logical_expr33=logical_expr();

            state._fsp--;



            		if ((logical_expr33!=null?logical_expr33.attr_type:null) != TypeInfo.Bool) {
            				System.out.println("Error! " + (logical_expr33!=null?((Token)logical_expr33.start):null).getLine()+ ": Type need to be boolean in condition part"); 
            		} 
            	

            match(input,25,FOLLOW_25_in_while_statement1172); 

            match(input,54,FOLLOW_54_in_while_statement1174); 

            // myChecker.g:585:10: ( statements )
            // myChecker.g:585:11: statements
            {
            pushFollow(FOLLOW_statements_in_while_statement1177);
            statements();

            state._fsp--;


            }


            match(input,58,FOLLOW_58_in_while_statement1180); 

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
    // myChecker.g:587:1: for_statement : 'for' '(' ( Identifier '=' logical_expr )? ';' (y= logical_expr )? ';' ( assginExpr )? ')' '{' ( statements ) '}' ;
    public final void for_statement() throws RecognitionException {
        myCheckerParser.logical_expr_return y =null;


        try {
            // myChecker.g:587:15: ( 'for' '(' ( Identifier '=' logical_expr )? ';' (y= logical_expr )? ';' ( assginExpr )? ')' '{' ( statements ) '}' )
            // myChecker.g:587:17: 'for' '(' ( Identifier '=' logical_expr )? ';' (y= logical_expr )? ';' ( assginExpr )? ')' '{' ( statements ) '}'
            {
             if (TRACEON) System.out.println("Parsing an FOR statement "); 

            match(input,52,FOLLOW_52_in_for_statement1196); 

            match(input,24,FOLLOW_24_in_for_statement1198); 

            // myChecker.g:588:16: ( Identifier '=' logical_expr )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Identifier) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // myChecker.g:588:17: Identifier '=' logical_expr
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_for_statement1202); 

                    match(input,42,FOLLOW_42_in_for_statement1204); 

                    pushFollow(FOLLOW_logical_expr_in_for_statement1206);
                    logical_expr();

                    state._fsp--;


                    }
                    break;

            }


            match(input,37,FOLLOW_37_in_for_statement1211); 

            // myChecker.g:589:5: (y= logical_expr )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Floating_point_constant||(LA18_0 >= Identifier && LA18_0 <= Integer_constant)||LA18_0==17||LA18_0==24||LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // myChecker.g:589:6: y= logical_expr
                    {
                    pushFollow(FOLLOW_logical_expr_in_for_statement1223);
                    y=logical_expr();

                    state._fsp--;



                    					if ((y!=null?y.attr_type:null) != TypeInfo.Bool) {
                    						System.out.println("Error! " + (y!=null?((Token)y.start):null).getLine()+ ": Type need to be boolean in condition part"); 
                    					} 
                    				

                    }
                    break;

            }


            match(input,37,FOLLOW_37_in_for_statement1238); 

            // myChecker.g:595:11: ( assginExpr )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Identifier) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // myChecker.g:595:12: assginExpr
                    {
                    pushFollow(FOLLOW_assginExpr_in_for_statement1242);
                    assginExpr();

                    state._fsp--;


                    }
                    break;

            }


            match(input,25,FOLLOW_25_in_for_statement1246); 

            match(input,54,FOLLOW_54_in_for_statement1248); 

            // myChecker.g:595:33: ( statements )
            // myChecker.g:595:34: statements
            {
            pushFollow(FOLLOW_statements_in_for_statement1251);
            statements();

            state._fsp--;


            }


            match(input,58,FOLLOW_58_in_for_statement1254); 

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
    // myChecker.g:597:1: do_while_statement : 'do' '{' ( statements ) '}' 'while' '(' logical_expr ')' ';' ;
    public final void do_while_statement() throws RecognitionException {
        myCheckerParser.logical_expr_return logical_expr34 =null;


        try {
            // myChecker.g:597:20: ( 'do' '{' ( statements ) '}' 'while' '(' logical_expr ')' ';' )
            // myChecker.g:597:21: 'do' '{' ( statements ) '}' 'while' '(' logical_expr ')' ';'
            {
             if (TRACEON)  System.out.println("Parsing an DO_WHILE statement "); 

            match(input,51,FOLLOW_51_in_do_while_statement1264); 

            match(input,54,FOLLOW_54_in_do_while_statement1266); 

            // myChecker.g:597:102: ( statements )
            // myChecker.g:597:103: statements
            {
            pushFollow(FOLLOW_statements_in_do_while_statement1269);
            statements();

            state._fsp--;


            }


            match(input,58,FOLLOW_58_in_do_while_statement1272); 

            match(input,53,FOLLOW_53_in_do_while_statement1274); 

            match(input,24,FOLLOW_24_in_do_while_statement1276); 

            pushFollow(FOLLOW_logical_expr_in_do_while_statement1278);
            logical_expr34=logical_expr();

            state._fsp--;



            		if ((logical_expr34!=null?logical_expr34.attr_type:null) != TypeInfo.Bool) {
            				System.out.println("Error! " + (logical_expr34!=null?((Token)logical_expr34.start):null).getLine()+ ": Type need to be boolean in condition part"); 
            		} 
            	

            match(input,25,FOLLOW_25_in_do_while_statement1285); 

            match(input,37,FOLLOW_37_in_do_while_statement1287); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_VOID_in_program23 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MAIN_in_program25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_program27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_program29 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_program31 = new BitSet(new long[]{0x0438000121001D30L});
    public static final BitSet FOLLOW_statements_in_program33 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_program35 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_type78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements101 = new BitSet(new long[]{0x0038000121001D30L});
    public static final BitSet FOLLOW_statements_in_statements103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_expr_in_logical_expr129 = new BitSet(new long[]{0x0200000000200002L});
    public static final BitSet FOLLOW_21_in_logical_expr139 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_relation_expr_in_logical_expr147 = new BitSet(new long[]{0x0200000000200002L});
    public static final BitSet FOLLOW_57_in_logical_expr159 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_relation_expr_in_logical_expr165 = new BitSet(new long[]{0x0200000000200002L});
    public static final BitSet FOLLOW_17_in_logical_expr183 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_relation_expr_in_logical_expr190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwise_expr_in_relation_expr222 = new BitSet(new long[]{0x00003A4000040002L});
    public static final BitSet FOLLOW_43_in_relation_expr231 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_bitwise_expr_in_relation_expr237 = new BitSet(new long[]{0x00003A4000040002L});
    public static final BitSet FOLLOW_18_in_relation_expr251 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_bitwise_expr_in_relation_expr257 = new BitSet(new long[]{0x00003A4000040002L});
    public static final BitSet FOLLOW_41_in_relation_expr270 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_bitwise_expr_in_relation_expr276 = new BitSet(new long[]{0x00003A4000040002L});
    public static final BitSet FOLLOW_45_in_relation_expr289 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_bitwise_expr_in_relation_expr295 = new BitSet(new long[]{0x00003A4000040002L});
    public static final BitSet FOLLOW_38_in_relation_expr308 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_bitwise_expr_in_relation_expr314 = new BitSet(new long[]{0x00003A4000040002L});
    public static final BitSet FOLLOW_44_in_relation_expr327 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_bitwise_expr_in_relation_expr333 = new BitSet(new long[]{0x00003A4000040002L});
    public static final BitSet FOLLOW_arith_expression_in_bitwise_expr371 = new BitSet(new long[]{0x0882408000400002L});
    public static final BitSet FOLLOW_46_in_bitwise_expr379 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_arith_expression_in_bitwise_expr385 = new BitSet(new long[]{0x0882408000400002L});
    public static final BitSet FOLLOW_39_in_bitwise_expr396 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_arith_expression_in_bitwise_expr402 = new BitSet(new long[]{0x0882408000400002L});
    public static final BitSet FOLLOW_22_in_bitwise_expr413 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_arith_expression_in_bitwise_expr419 = new BitSet(new long[]{0x0882408000400002L});
    public static final BitSet FOLLOW_49_in_bitwise_expr430 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_arith_expression_in_bitwise_expr436 = new BitSet(new long[]{0x0882408000400002L});
    public static final BitSet FOLLOW_59_in_bitwise_expr447 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_arith_expression_in_bitwise_expr453 = new BitSet(new long[]{0x0882408000400002L});
    public static final BitSet FOLLOW_55_in_bitwise_expr464 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_arith_expression_in_bitwise_expr470 = new BitSet(new long[]{0x0882408000400002L});
    public static final BitSet FOLLOW_multExpr_in_arith_expression504 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_28_in_arith_expression516 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_multExpr_in_arith_expression522 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_31_in_arith_expression536 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_multExpr_in_arith_expression542 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_signExpr_in_multExpr574 = new BitSet(new long[]{0x0000000404080002L});
    public static final BitSet FOLLOW_26_in_multExpr586 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_signExpr_in_multExpr592 = new BitSet(new long[]{0x0000000404080002L});
    public static final BitSet FOLLOW_34_in_multExpr608 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_signExpr_in_multExpr614 = new BitSet(new long[]{0x0000000404080002L});
    public static final BitSet FOLLOW_19_in_multExpr627 = new BitSet(new long[]{0x0000000081003200L});
    public static final BitSet FOLLOW_signExpr_in_multExpr633 = new BitSet(new long[]{0x0000000404080002L});
    public static final BitSet FOLLOW_primaryExpr_in_signExpr660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_signExpr667 = new BitSet(new long[]{0x0000000001003200L});
    public static final BitSet FOLLOW_primaryExpr_in_signExpr669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_constant_in_primaryExpr686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primaryExpr707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_primaryExpr718 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_primaryExpr720 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_primaryExpr722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr743 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_assginExpr748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr753 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_assginExpr757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr766 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_assginExpr770 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr781 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_assginExpr785 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr797 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_assginExpr801 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr813 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_assginExpr817 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr829 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_assginExpr833 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr846 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_assginExpr850 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr863 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_assginExpr867 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr882 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_assginExpr886 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr901 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_assginExpr905 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr920 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_assginExpr924 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assginExpr939 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_assginExpr943 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_assginExpr945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assginExpr_in_statement971 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_statement974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement979 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement981 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_statement983 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement985 = new BitSet(new long[]{0x0078000121001D30L});
    public static final BitSet FOLLOW_if_then_statements_in_statement987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternary_expr_in_statement992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_statement997 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Identifier_in_statement999 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_42_in_statement1003 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_statement1009 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_statement1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_statement1028 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Identifier_in_statement1030 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_statement1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_statement1038 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Identifier_in_statement1040 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_statement1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_statement_in_statement1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ternary_expr1074 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_ternary_expr1080 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ternary_expr1087 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ternary_expr1089 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_ternary_expr1093 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ternary_expr1097 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_ternary_expr1101 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ternary_expr1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_if_then_statements1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_if_then_statements1121 = new BitSet(new long[]{0x0438000121001D30L});
    public static final BitSet FOLLOW_statements_in_if_then_statements1123 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_if_then_statements1125 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ELSE_in_if_then_statements1128 = new BitSet(new long[]{0x0040000000000400L});
    public static final BitSet FOLLOW_IF_in_if_then_statements1133 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_if_then_statements1135 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_if_then_statements1137 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_if_then_statements1139 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_if_then_statements1143 = new BitSet(new long[]{0x0438000121001D30L});
    public static final BitSet FOLLOW_statements_in_if_then_statements1145 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_if_then_statements1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_while_statement1161 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_while_statement1163 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_while_statement1165 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_while_statement1172 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_while_statement1174 = new BitSet(new long[]{0x0438000121001D30L});
    public static final BitSet FOLLOW_statements_in_while_statement1177 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_while_statement1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_for_statement1196 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_for_statement1198 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_Identifier_in_for_statement1202 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_for_statement1204 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_for_statement1206 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_for_statement1211 = new BitSet(new long[]{0x0000002081023200L});
    public static final BitSet FOLLOW_logical_expr_in_for_statement1223 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_for_statement1238 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_assginExpr_in_for_statement1242 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_for_statement1246 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_for_statement1248 = new BitSet(new long[]{0x0438000121001D30L});
    public static final BitSet FOLLOW_statements_in_for_statement1251 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_for_statement1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_do_while_statement1264 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_do_while_statement1266 = new BitSet(new long[]{0x0438000121001D30L});
    public static final BitSet FOLLOW_statements_in_do_while_statement1269 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_do_while_statement1272 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_do_while_statement1274 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_do_while_statement1276 = new BitSet(new long[]{0x0000000081023200L});
    public static final BitSet FOLLOW_logical_expr_in_do_while_statement1278 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_do_while_statement1285 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_do_while_statement1287 = new BitSet(new long[]{0x0000000000000002L});

}