// $ANTLR 3.4 myparser.g 2023-04-17 23:28:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class myparserLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public myparserLexer() {} 
    public myparserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public myparserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "myparser.g"; }

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:7:7: ( '%=' )
            // myparser.g:7:9: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:8:7: ( '*=' )
            // myparser.g:8:9: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:9:7: ( '+=' )
            // myparser.g:9:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:10:7: ( '-=' )
            // myparser.g:10:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:11:7: ( '/=' )
            // myparser.g:11:9: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "INT_TYPE"
    public final void mINT_TYPE() throws RecognitionException {
        try {
            int _type = INT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:91:11: ( 'int' )
            // myparser.g:91:13: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_TYPE"

    // $ANTLR start "FLOAT_TYPE"
    public final void mFLOAT_TYPE() throws RecognitionException {
        try {
            int _type = FLOAT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:92:13: ( 'float' )
            // myparser.g:92:15: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_TYPE"

    // $ANTLR start "DOUBLE_TYPE"
    public final void mDOUBLE_TYPE() throws RecognitionException {
        try {
            int _type = DOUBLE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:93:13: ( 'double' )
            // myparser.g:93:15: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_TYPE"

    // $ANTLR start "LONG_TYPE"
    public final void mLONG_TYPE() throws RecognitionException {
        try {
            int _type = LONG_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:94:12: ( 'long' )
            // myparser.g:94:14: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONG_TYPE"

    // $ANTLR start "SHORT_TYPE"
    public final void mSHORT_TYPE() throws RecognitionException {
        try {
            int _type = SHORT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:95:13: ( 'short' )
            // myparser.g:95:15: 'short'
            {
            match("short"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHORT_TYPE"

    // $ANTLR start "BOOL_TYPE"
    public final void mBOOL_TYPE() throws RecognitionException {
        try {
            int _type = BOOL_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:96:11: ( 'bool' )
            // myparser.g:96:13: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL_TYPE"

    // $ANTLR start "VOID_TYPE"
    public final void mVOID_TYPE() throws RecognitionException {
        try {
            int _type = VOID_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:97:11: ( 'void' )
            // myparser.g:97:13: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID_TYPE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:99:8: ( 'return' )
            // myparser.g:99:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:101:4: ( 'do' )
            // myparser.g:101:6: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:102:7: ( 'while' )
            // myparser.g:102:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:103:5: ( 'for' )
            // myparser.g:103:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:104:4: ( 'if' )
            // myparser.g:104:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:105:6: ( 'else' )
            // myparser.g:105:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "EQ_OP"
    public final void mEQ_OP() throws RecognitionException {
        try {
            int _type = EQ_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:113:6: ( '==' )
            // myparser.g:113:8: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ_OP"

    // $ANTLR start "LE_OP"
    public final void mLE_OP() throws RecognitionException {
        try {
            int _type = LE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:114:6: ( '<=' )
            // myparser.g:114:7: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE_OP"

    // $ANTLR start "GE_OP"
    public final void mGE_OP() throws RecognitionException {
        try {
            int _type = GE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:115:6: ( '>=' )
            // myparser.g:115:7: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE_OP"

    // $ANTLR start "NE_OP"
    public final void mNE_OP() throws RecognitionException {
        try {
            int _type = NE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:116:6: ( '!=' )
            // myparser.g:116:7: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NE_OP"

    // $ANTLR start "AS_OP"
    public final void mAS_OP() throws RecognitionException {
        try {
            int _type = AS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:117:6: ( '=' )
            // myparser.g:117:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS_OP"

    // $ANTLR start "LT_OP"
    public final void mLT_OP() throws RecognitionException {
        try {
            int _type = LT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:118:7: ( '<' )
            // myparser.g:118:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT_OP"

    // $ANTLR start "GT_OP"
    public final void mGT_OP() throws RecognitionException {
        try {
            int _type = GT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:119:7: ( '>' )
            // myparser.g:119:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT_OP"

    // $ANTLR start "PLUS_OP"
    public final void mPLUS_OP() throws RecognitionException {
        try {
            int _type = PLUS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:122:9: ( '+' )
            // myparser.g:122:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS_OP"

    // $ANTLR start "SUB_OP"
    public final void mSUB_OP() throws RecognitionException {
        try {
            int _type = SUB_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:123:8: ( '-' )
            // myparser.g:123:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUB_OP"

    // $ANTLR start "MUL_OP"
    public final void mMUL_OP() throws RecognitionException {
        try {
            int _type = MUL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:124:8: ( '*' )
            // myparser.g:124:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL_OP"

    // $ANTLR start "MOD_OP"
    public final void mMOD_OP() throws RecognitionException {
        try {
            int _type = MOD_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:125:8: ( '%' )
            // myparser.g:125:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD_OP"

    // $ANTLR start "DIV_OP"
    public final void mDIV_OP() throws RecognitionException {
        try {
            int _type = DIV_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:126:8: ( '/' )
            // myparser.g:126:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV_OP"

    // $ANTLR start "Address"
    public final void mAddress() throws RecognitionException {
        try {
            int _type = Address;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:127:9: ( '&' )
            // myparser.g:127:11: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Address"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:128:5: ( '!' )
            // myparser.g:128:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:133:6: ( ';' )
            // myparser.g:133:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "LPrase"
    public final void mLPrase() throws RecognitionException {
        try {
            int _type = LPrase;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:134:8: ( '(' )
            // myparser.g:134:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPrase"

    // $ANTLR start "RPrase"
    public final void mRPrase() throws RecognitionException {
        try {
            int _type = RPrase;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:135:8: ( ')' )
            // myparser.g:135:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPrase"

    // $ANTLR start "LBrace"
    public final void mLBrace() throws RecognitionException {
        try {
            int _type = LBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:136:8: ( '{' )
            // myparser.g:136:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBrace"

    // $ANTLR start "RBrace"
    public final void mRBrace() throws RecognitionException {
        try {
            int _type = RBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:137:8: ( '}' )
            // myparser.g:137:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBrace"

    // $ANTLR start "COOMA"
    public final void mCOOMA() throws RecognitionException {
        try {
            int _type = COOMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:138:7: ( ',' )
            // myparser.g:138:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COOMA"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:142:7: ( 'printf' )
            // myparser.g:142:9: 'printf'
            {
            match("printf"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "SCAN"
    public final void mSCAN() throws RecognitionException {
        try {
            int _type = SCAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:143:6: ( 'scanf' )
            // myparser.g:143:8: 'scanf'
            {
            match("scanf"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCAN"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:148:8: ( ( '\"' ( . )* '\"' ) )
            // myparser.g:148:10: ( '\"' ( . )* '\"' )
            {
            // myparser.g:148:10: ( '\"' ( . )* '\"' )
            // myparser.g:148:11: '\"' ( . )* '\"'
            {
            match('\"'); 

            // myparser.g:148:14: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"') ) {
                    alt1=2;
                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // myparser.g:148:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match('\"'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "DEC_NUM"
    public final void mDEC_NUM() throws RecognitionException {
        try {
            int _type = DEC_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:150:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
            // myparser.g:150:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
            {
            // myparser.g:150:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // myparser.g:150:12: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // myparser.g:150:18: ( '1' .. '9' ) ( DIGIT )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // myparser.g:150:28: ( DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // myparser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEC_NUM"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:152:5: ( '\\'' ( LETTER ) '\\'' )
            // myparser.g:152:7: '\\'' ( LETTER ) '\\''
            {
            match('\''); 

            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:154:4: ( ( LETTER ) ( LETTER | DIGIT )* )
            // myparser.g:154:6: ( LETTER ) ( LETTER | DIGIT )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // myparser.g:154:14: ( LETTER | DIGIT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // myparser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "FLOAT_NUM"
    public final void mFLOAT_NUM() throws RecognitionException {
        try {
            int _type = FLOAT_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:156:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // myparser.g:156:12: FLOAT_NUM1
                    {
                    mFLOAT_NUM1(); 


                    }
                    break;
                case 2 :
                    // myparser.g:156:25: FLOAT_NUM2
                    {
                    mFLOAT_NUM2(); 


                    }
                    break;
                case 3 :
                    // myparser.g:156:38: FLOAT_NUM3
                    {
                    mFLOAT_NUM3(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_NUM"

    // $ANTLR start "FLOAT_NUM1"
    public final void mFLOAT_NUM1() throws RecognitionException {
        try {
            // myparser.g:157:20: ( ( DIGIT )+ '.' ( DIGIT )* )
            // myparser.g:157:22: ( DIGIT )+ '.' ( DIGIT )*
            {
            // myparser.g:157:22: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // myparser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match('.'); 

            // myparser.g:157:33: ( DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // myparser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_NUM1"

    // $ANTLR start "FLOAT_NUM2"
    public final void mFLOAT_NUM2() throws RecognitionException {
        try {
            // myparser.g:158:20: ( '.' ( DIGIT )+ )
            // myparser.g:158:22: '.' ( DIGIT )+
            {
            match('.'); 

            // myparser.g:158:25: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // myparser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_NUM2"

    // $ANTLR start "FLOAT_NUM3"
    public final void mFLOAT_NUM3() throws RecognitionException {
        try {
            // myparser.g:159:20: ( ( DIGIT )+ )
            // myparser.g:159:22: ( DIGIT )+
            {
            // myparser.g:159:22: ( DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // myparser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_NUM3"

    // $ANTLR start "COMMENT1"
    public final void mCOMMENT1() throws RecognitionException {
        try {
            int _type = COMMENT1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:163:10: ( '//' ( . )* '\\n' )
            // myparser.g:163:12: '//' ( . )* '\\n'
            {
            match("//"); 



            // myparser.g:163:16: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n') ) {
                    alt10=2;
                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // myparser.g:163:17: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT1"

    // $ANTLR start "COMMENT2"
    public final void mCOMMENT2() throws RecognitionException {
        try {
            int _type = COMMENT2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:164:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // myparser.g:164:12: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // myparser.g:164:17: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // myparser.g:164:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match("*/"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT2"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // myparser.g:167:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // myparser.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // myparser.g:168:16: ( '0' .. '9' )
            // myparser.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myparser.g:171:5: ( ( ' ' | '\\r' | '\\t' | '\\n' )+ )
            // myparser.g:171:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
            {
            // myparser.g:171:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // myparser.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // myparser.g:1:8: ( T__52 | T__53 | T__54 | T__55 | T__56 | INT_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | SHORT_TYPE | BOOL_TYPE | VOID_TYPE | RETURN | DO | WHILE | FOR | IF | ELSE | EQ_OP | LE_OP | GE_OP | NE_OP | AS_OP | LT_OP | GT_OP | PLUS_OP | SUB_OP | MUL_OP | MOD_OP | DIV_OP | Address | NOT | SEMI | LPrase | RPrase | LBrace | RBrace | COOMA | PRINT | SCAN | STRING | DEC_NUM | CHAR | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | WS )
        int alt13=48;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // myparser.g:1:10: T__52
                {
                mT__52(); 


                }
                break;
            case 2 :
                // myparser.g:1:16: T__53
                {
                mT__53(); 


                }
                break;
            case 3 :
                // myparser.g:1:22: T__54
                {
                mT__54(); 


                }
                break;
            case 4 :
                // myparser.g:1:28: T__55
                {
                mT__55(); 


                }
                break;
            case 5 :
                // myparser.g:1:34: T__56
                {
                mT__56(); 


                }
                break;
            case 6 :
                // myparser.g:1:40: INT_TYPE
                {
                mINT_TYPE(); 


                }
                break;
            case 7 :
                // myparser.g:1:49: FLOAT_TYPE
                {
                mFLOAT_TYPE(); 


                }
                break;
            case 8 :
                // myparser.g:1:60: DOUBLE_TYPE
                {
                mDOUBLE_TYPE(); 


                }
                break;
            case 9 :
                // myparser.g:1:72: LONG_TYPE
                {
                mLONG_TYPE(); 


                }
                break;
            case 10 :
                // myparser.g:1:82: SHORT_TYPE
                {
                mSHORT_TYPE(); 


                }
                break;
            case 11 :
                // myparser.g:1:93: BOOL_TYPE
                {
                mBOOL_TYPE(); 


                }
                break;
            case 12 :
                // myparser.g:1:103: VOID_TYPE
                {
                mVOID_TYPE(); 


                }
                break;
            case 13 :
                // myparser.g:1:113: RETURN
                {
                mRETURN(); 


                }
                break;
            case 14 :
                // myparser.g:1:120: DO
                {
                mDO(); 


                }
                break;
            case 15 :
                // myparser.g:1:123: WHILE
                {
                mWHILE(); 


                }
                break;
            case 16 :
                // myparser.g:1:129: FOR
                {
                mFOR(); 


                }
                break;
            case 17 :
                // myparser.g:1:133: IF
                {
                mIF(); 


                }
                break;
            case 18 :
                // myparser.g:1:136: ELSE
                {
                mELSE(); 


                }
                break;
            case 19 :
                // myparser.g:1:141: EQ_OP
                {
                mEQ_OP(); 


                }
                break;
            case 20 :
                // myparser.g:1:147: LE_OP
                {
                mLE_OP(); 


                }
                break;
            case 21 :
                // myparser.g:1:153: GE_OP
                {
                mGE_OP(); 


                }
                break;
            case 22 :
                // myparser.g:1:159: NE_OP
                {
                mNE_OP(); 


                }
                break;
            case 23 :
                // myparser.g:1:165: AS_OP
                {
                mAS_OP(); 


                }
                break;
            case 24 :
                // myparser.g:1:171: LT_OP
                {
                mLT_OP(); 


                }
                break;
            case 25 :
                // myparser.g:1:177: GT_OP
                {
                mGT_OP(); 


                }
                break;
            case 26 :
                // myparser.g:1:183: PLUS_OP
                {
                mPLUS_OP(); 


                }
                break;
            case 27 :
                // myparser.g:1:191: SUB_OP
                {
                mSUB_OP(); 


                }
                break;
            case 28 :
                // myparser.g:1:198: MUL_OP
                {
                mMUL_OP(); 


                }
                break;
            case 29 :
                // myparser.g:1:205: MOD_OP
                {
                mMOD_OP(); 


                }
                break;
            case 30 :
                // myparser.g:1:212: DIV_OP
                {
                mDIV_OP(); 


                }
                break;
            case 31 :
                // myparser.g:1:219: Address
                {
                mAddress(); 


                }
                break;
            case 32 :
                // myparser.g:1:227: NOT
                {
                mNOT(); 


                }
                break;
            case 33 :
                // myparser.g:1:231: SEMI
                {
                mSEMI(); 


                }
                break;
            case 34 :
                // myparser.g:1:236: LPrase
                {
                mLPrase(); 


                }
                break;
            case 35 :
                // myparser.g:1:243: RPrase
                {
                mRPrase(); 


                }
                break;
            case 36 :
                // myparser.g:1:250: LBrace
                {
                mLBrace(); 


                }
                break;
            case 37 :
                // myparser.g:1:257: RBrace
                {
                mRBrace(); 


                }
                break;
            case 38 :
                // myparser.g:1:264: COOMA
                {
                mCOOMA(); 


                }
                break;
            case 39 :
                // myparser.g:1:270: PRINT
                {
                mPRINT(); 


                }
                break;
            case 40 :
                // myparser.g:1:276: SCAN
                {
                mSCAN(); 


                }
                break;
            case 41 :
                // myparser.g:1:281: STRING
                {
                mSTRING(); 


                }
                break;
            case 42 :
                // myparser.g:1:288: DEC_NUM
                {
                mDEC_NUM(); 


                }
                break;
            case 43 :
                // myparser.g:1:296: CHAR
                {
                mCHAR(); 


                }
                break;
            case 44 :
                // myparser.g:1:301: ID
                {
                mID(); 


                }
                break;
            case 45 :
                // myparser.g:1:304: FLOAT_NUM
                {
                mFLOAT_NUM(); 


                }
                break;
            case 46 :
                // myparser.g:1:314: COMMENT1
                {
                mCOMMENT1(); 


                }
                break;
            case 47 :
                // myparser.g:1:323: COMMENT2
                {
                mCOMMENT2(); 


                }
                break;
            case 48 :
                // myparser.g:1:332: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA5_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\2\56\3\uffff";
    static final String DFA5_maxS =
        "\2\71\3\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "156:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
        }
    }
    static final String DFA13_eotS =
        "\1\uffff\1\44\1\46\1\50\1\52\1\56\12\40\1\75\1\77\1\101\1\103\7"+
        "\uffff\1\40\1\uffff\2\105\20\uffff\1\40\1\110\2\40\1\114\10\40\10"+
        "\uffff\1\40\1\uffff\1\105\1\126\1\uffff\1\40\1\130\1\40\1\uffff"+
        "\11\40\1\uffff\1\40\1\uffff\1\40\1\145\2\40\1\150\1\151\2\40\1\154"+
        "\1\40\1\156\1\40\1\uffff\1\160\1\161\2\uffff\1\40\1\163\1\uffff"+
        "\1\40\1\uffff\1\165\2\uffff\1\166\1\uffff\1\167\3\uffff";
    static final String DFA13_eofS =
        "\170\uffff";
    static final String DFA13_minS =
        "\1\11\4\75\1\52\1\146\1\154\2\157\1\143\2\157\1\145\1\150\1\154"+
        "\4\75\7\uffff\1\162\1\uffff\2\56\20\uffff\1\164\1\60\1\157\1\162"+
        "\1\60\1\156\1\157\1\141\1\157\1\151\1\164\1\151\1\163\10\uffff\1"+
        "\151\1\uffff\1\56\1\60\1\uffff\1\141\1\60\1\142\1\uffff\1\147\1"+
        "\162\1\156\1\154\1\144\1\165\1\154\1\145\1\156\1\uffff\1\164\1\uffff"+
        "\1\154\1\60\1\164\1\146\2\60\1\162\1\145\1\60\1\164\1\60\1\145\1"+
        "\uffff\2\60\2\uffff\1\156\1\60\1\uffff\1\146\1\uffff\1\60\2\uffff"+
        "\1\60\1\uffff\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\175\5\75\1\156\3\157\1\150\2\157\1\145\1\150\1\154\4\75\7\uffff"+
        "\1\162\1\uffff\2\71\20\uffff\1\164\1\172\1\157\1\162\1\172\1\156"+
        "\1\157\1\141\1\157\1\151\1\164\1\151\1\163\10\uffff\1\151\1\uffff"+
        "\1\71\1\172\1\uffff\1\141\1\172\1\142\1\uffff\1\147\1\162\1\156"+
        "\1\154\1\144\1\165\1\154\1\145\1\156\1\uffff\1\164\1\uffff\1\154"+
        "\1\172\1\164\1\146\2\172\1\162\1\145\1\172\1\164\1\172\1\145\1\uffff"+
        "\2\172\2\uffff\1\156\1\172\1\uffff\1\146\1\uffff\1\172\2\uffff\1"+
        "\172\1\uffff\1\172\3\uffff";
    static final String DFA13_acceptS =
        "\24\uffff\1\37\1\41\1\42\1\43\1\44\1\45\1\46\1\uffff\1\51\2\uffff"+
        "\1\53\1\54\1\55\1\60\1\1\1\35\1\2\1\34\1\3\1\32\1\4\1\33\1\5\1\56"+
        "\1\57\1\36\15\uffff\1\23\1\27\1\24\1\30\1\25\1\31\1\26\1\40\1\uffff"+
        "\1\52\2\uffff\1\21\3\uffff\1\16\11\uffff\1\6\1\uffff\1\20\14\uffff"+
        "\1\11\2\uffff\1\13\1\14\2\uffff\1\22\1\uffff\1\7\1\uffff\1\12\1"+
        "\50\1\uffff\1\17\1\uffff\1\10\1\15\1\47";
    static final String DFA13_specialS =
        "\170\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\23\1\34\2\uffff\1\1\1\24"+
            "\1\37\1\26\1\27\1\2\1\3\1\32\1\4\1\41\1\5\1\35\11\36\1\uffff"+
            "\1\25\1\21\1\20\1\22\2\uffff\32\40\4\uffff\1\40\1\uffff\1\40"+
            "\1\13\1\40\1\10\1\17\1\7\2\40\1\6\2\40\1\11\3\40\1\33\1\40\1"+
            "\15\1\12\2\40\1\14\1\16\3\40\1\30\1\uffff\1\31",
            "\1\43",
            "\1\45",
            "\1\47",
            "\1\51",
            "\1\55\4\uffff\1\54\15\uffff\1\53",
            "\1\60\7\uffff\1\57",
            "\1\61\2\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\66\4\uffff\1\65",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\76",
            "\1\100",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "",
            "\1\41\1\uffff\12\41",
            "\1\41\1\uffff\12\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\111",
            "\1\112",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\24\40\1\113\5\40",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125",
            "",
            "\1\41\1\uffff\12\106",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\127",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "",
            "\1\144",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\146",
            "\1\147",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\152",
            "\1\153",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\155",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\157",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\162",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\164",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__52 | T__53 | T__54 | T__55 | T__56 | INT_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | SHORT_TYPE | BOOL_TYPE | VOID_TYPE | RETURN | DO | WHILE | FOR | IF | ELSE | EQ_OP | LE_OP | GE_OP | NE_OP | AS_OP | LT_OP | GT_OP | PLUS_OP | SUB_OP | MUL_OP | MOD_OP | DIV_OP | Address | NOT | SEMI | LPrase | RPrase | LBrace | RBrace | COOMA | PRINT | SCAN | STRING | DEC_NUM | CHAR | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | WS );";
        }
    }
 

}