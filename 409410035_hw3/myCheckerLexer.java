// $ANTLR 3.4 myChecker.g 2023-05-12 20:43:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class myCheckerLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public myCheckerLexer() {} 
    public myCheckerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public myCheckerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "myChecker.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:2:7: ( '!' )
            // myChecker.g:2:9: '!'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:3:7: ( '!=' )
            // myChecker.g:3:9: '!='
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:4:7: ( '%' )
            // myChecker.g:4:9: '%'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:5:7: ( '%=' )
            // myChecker.g:5:9: '%='
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:6:7: ( '&&' )
            // myChecker.g:6:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:7:7: ( '&' )
            // myChecker.g:7:9: '&'
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:8:7: ( '&=' )
            // myChecker.g:8:9: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:9:7: ( '(' )
            // myChecker.g:9:9: '('
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:10:7: ( ')' )
            // myChecker.g:10:9: ')'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:11:7: ( '*' )
            // myChecker.g:11:9: '*'
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:12:7: ( '*=' )
            // myChecker.g:12:9: '*='
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:13:7: ( '+' )
            // myChecker.g:13:9: '+'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:14:7: ( '++' )
            // myChecker.g:14:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:15:7: ( '+=' )
            // myChecker.g:15:9: '+='
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:16:7: ( '-' )
            // myChecker.g:16:9: '-'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:17:7: ( '--' )
            // myChecker.g:17:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:18:7: ( '-=' )
            // myChecker.g:18:9: '-='
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:19:7: ( '/' )
            // myChecker.g:19:9: '/'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:20:7: ( '/=' )
            // myChecker.g:20:9: '/='
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:21:7: ( ':' )
            // myChecker.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:22:7: ( ';' )
            // myChecker.g:22:9: ';'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:23:7: ( '<' )
            // myChecker.g:23:9: '<'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:24:7: ( '<<' )
            // myChecker.g:24:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:25:7: ( '<<=' )
            // myChecker.g:25:9: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:26:7: ( '<=' )
            // myChecker.g:26:9: '<='
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:27:7: ( '=' )
            // myChecker.g:27:9: '='
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:28:7: ( '==' )
            // myChecker.g:28:9: '=='
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:29:7: ( '>' )
            // myChecker.g:29:9: '>'
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:30:7: ( '>=' )
            // myChecker.g:30:9: '>='
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:31:7: ( '>>' )
            // myChecker.g:31:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:32:7: ( '>>=' )
            // myChecker.g:32:9: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:33:7: ( '?' )
            // myChecker.g:33:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:34:7: ( '^' )
            // myChecker.g:34:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:35:7: ( '^=' )
            // myChecker.g:35:9: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:36:7: ( 'do' )
            // myChecker.g:36:9: 'do'
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:37:7: ( 'for' )
            // myChecker.g:37:9: 'for'
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:38:7: ( 'while' )
            // myChecker.g:38:9: 'while'
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:39:7: ( '{' )
            // myChecker.g:39:9: '{'
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:40:7: ( '|' )
            // myChecker.g:40:9: '|'
            {
            match('|'); 

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
            // myChecker.g:41:7: ( '|=' )
            // myChecker.g:41:9: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:42:7: ( '||' )
            // myChecker.g:42:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:43:7: ( '}' )
            // myChecker.g:43:9: '}'
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:44:7: ( '~' )
            // myChecker.g:44:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:606:6: ( 'float' )
            // myChecker.g:606:7: 'float'
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
    // $ANTLR end "FLOAT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:607:4: ( 'int' )
            // myChecker.g:607:5: 'int'
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
    // $ANTLR end "INT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:608:5: ( 'char' )
            // myChecker.g:608:7: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:609:8: ( 'bool' )
            // myChecker.g:609:10: 'bool'
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
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "MAIN"
    public final void mMAIN() throws RecognitionException {
        try {
            int _type = MAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:610:5: ( 'main' )
            // myChecker.g:610:7: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAIN"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:611:5: ( 'void' )
            // myChecker.g:611:7: 'void'
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
    // $ANTLR end "VOID"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:612:3: ( 'if' )
            // myChecker.g:612:5: 'if'
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
            // myChecker.g:613:5: ( 'else' )
            // myChecker.g:613:7: 'else'
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

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:615:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // myChecker.g:615:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // myChecker.g:615:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // myChecker.g:
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
            	    break loop1;
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
    // $ANTLR end "Identifier"

    // $ANTLR start "Integer_constant"
    public final void mInteger_constant() throws RecognitionException {
        try {
            int _type = Integer_constant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:616:17: ( ( '0' .. '9' )+ )
            // myChecker.g:616:18: ( '0' .. '9' )+
            {
            // myChecker.g:616:18: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // myChecker.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Integer_constant"

    // $ANTLR start "Floating_point_constant"
    public final void mFloating_point_constant() throws RecognitionException {
        try {
            int _type = Floating_point_constant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:617:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // myChecker.g:617:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // myChecker.g:617:25: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // myChecker.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('.'); 

            // myChecker.g:617:39: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // myChecker.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Floating_point_constant"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:619:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // myChecker.g:619:4: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // myChecker.g:620:8: ( '/*' ( . )* '*/' )
            // myChecker.g:620:9: '/*' ( . )* '*/'
            {
            match("/*"); 



            // myChecker.g:620:14: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // myChecker.g:620:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // myChecker.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | FLOAT | INT | CHAR | BOOLEAN | MAIN | VOID | IF | ELSE | Identifier | Integer_constant | Floating_point_constant | WS | COMMENT )
        int alt6=56;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // myChecker.g:1:10: T__17
                {
                mT__17(); 


                }
                break;
            case 2 :
                // myChecker.g:1:16: T__18
                {
                mT__18(); 


                }
                break;
            case 3 :
                // myChecker.g:1:22: T__19
                {
                mT__19(); 


                }
                break;
            case 4 :
                // myChecker.g:1:28: T__20
                {
                mT__20(); 


                }
                break;
            case 5 :
                // myChecker.g:1:34: T__21
                {
                mT__21(); 


                }
                break;
            case 6 :
                // myChecker.g:1:40: T__22
                {
                mT__22(); 


                }
                break;
            case 7 :
                // myChecker.g:1:46: T__23
                {
                mT__23(); 


                }
                break;
            case 8 :
                // myChecker.g:1:52: T__24
                {
                mT__24(); 


                }
                break;
            case 9 :
                // myChecker.g:1:58: T__25
                {
                mT__25(); 


                }
                break;
            case 10 :
                // myChecker.g:1:64: T__26
                {
                mT__26(); 


                }
                break;
            case 11 :
                // myChecker.g:1:70: T__27
                {
                mT__27(); 


                }
                break;
            case 12 :
                // myChecker.g:1:76: T__28
                {
                mT__28(); 


                }
                break;
            case 13 :
                // myChecker.g:1:82: T__29
                {
                mT__29(); 


                }
                break;
            case 14 :
                // myChecker.g:1:88: T__30
                {
                mT__30(); 


                }
                break;
            case 15 :
                // myChecker.g:1:94: T__31
                {
                mT__31(); 


                }
                break;
            case 16 :
                // myChecker.g:1:100: T__32
                {
                mT__32(); 


                }
                break;
            case 17 :
                // myChecker.g:1:106: T__33
                {
                mT__33(); 


                }
                break;
            case 18 :
                // myChecker.g:1:112: T__34
                {
                mT__34(); 


                }
                break;
            case 19 :
                // myChecker.g:1:118: T__35
                {
                mT__35(); 


                }
                break;
            case 20 :
                // myChecker.g:1:124: T__36
                {
                mT__36(); 


                }
                break;
            case 21 :
                // myChecker.g:1:130: T__37
                {
                mT__37(); 


                }
                break;
            case 22 :
                // myChecker.g:1:136: T__38
                {
                mT__38(); 


                }
                break;
            case 23 :
                // myChecker.g:1:142: T__39
                {
                mT__39(); 


                }
                break;
            case 24 :
                // myChecker.g:1:148: T__40
                {
                mT__40(); 


                }
                break;
            case 25 :
                // myChecker.g:1:154: T__41
                {
                mT__41(); 


                }
                break;
            case 26 :
                // myChecker.g:1:160: T__42
                {
                mT__42(); 


                }
                break;
            case 27 :
                // myChecker.g:1:166: T__43
                {
                mT__43(); 


                }
                break;
            case 28 :
                // myChecker.g:1:172: T__44
                {
                mT__44(); 


                }
                break;
            case 29 :
                // myChecker.g:1:178: T__45
                {
                mT__45(); 


                }
                break;
            case 30 :
                // myChecker.g:1:184: T__46
                {
                mT__46(); 


                }
                break;
            case 31 :
                // myChecker.g:1:190: T__47
                {
                mT__47(); 


                }
                break;
            case 32 :
                // myChecker.g:1:196: T__48
                {
                mT__48(); 


                }
                break;
            case 33 :
                // myChecker.g:1:202: T__49
                {
                mT__49(); 


                }
                break;
            case 34 :
                // myChecker.g:1:208: T__50
                {
                mT__50(); 


                }
                break;
            case 35 :
                // myChecker.g:1:214: T__51
                {
                mT__51(); 


                }
                break;
            case 36 :
                // myChecker.g:1:220: T__52
                {
                mT__52(); 


                }
                break;
            case 37 :
                // myChecker.g:1:226: T__53
                {
                mT__53(); 


                }
                break;
            case 38 :
                // myChecker.g:1:232: T__54
                {
                mT__54(); 


                }
                break;
            case 39 :
                // myChecker.g:1:238: T__55
                {
                mT__55(); 


                }
                break;
            case 40 :
                // myChecker.g:1:244: T__56
                {
                mT__56(); 


                }
                break;
            case 41 :
                // myChecker.g:1:250: T__57
                {
                mT__57(); 


                }
                break;
            case 42 :
                // myChecker.g:1:256: T__58
                {
                mT__58(); 


                }
                break;
            case 43 :
                // myChecker.g:1:262: T__59
                {
                mT__59(); 


                }
                break;
            case 44 :
                // myChecker.g:1:268: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 45 :
                // myChecker.g:1:274: INT
                {
                mINT(); 


                }
                break;
            case 46 :
                // myChecker.g:1:278: CHAR
                {
                mCHAR(); 


                }
                break;
            case 47 :
                // myChecker.g:1:283: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 48 :
                // myChecker.g:1:291: MAIN
                {
                mMAIN(); 


                }
                break;
            case 49 :
                // myChecker.g:1:296: VOID
                {
                mVOID(); 


                }
                break;
            case 50 :
                // myChecker.g:1:301: IF
                {
                mIF(); 


                }
                break;
            case 51 :
                // myChecker.g:1:304: ELSE
                {
                mELSE(); 


                }
                break;
            case 52 :
                // myChecker.g:1:309: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 53 :
                // myChecker.g:1:320: Integer_constant
                {
                mInteger_constant(); 


                }
                break;
            case 54 :
                // myChecker.g:1:337: Floating_point_constant
                {
                mFloating_point_constant(); 


                }
                break;
            case 55 :
                // myChecker.g:1:361: WS
                {
                mWS(); 


                }
                break;
            case 56 :
                // myChecker.g:1:364: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\42\1\44\1\47\2\uffff\1\51\1\54\1\57\1\62\2\uffff\1\65"+
        "\1\67\1\72\1\uffff\1\74\3\36\1\uffff\1\103\2\uffff\6\36\1\uffff"+
        "\1\113\23\uffff\1\116\5\uffff\1\120\3\uffff\1\121\3\36\3\uffff\1"+
        "\36\1\126\5\36\7\uffff\1\134\2\36\1\137\1\uffff\5\36\1\uffff\2\36"+
        "\1\uffff\1\147\1\150\1\151\1\152\1\153\1\154\1\155\7\uffff";
    static final String DFA6_eofS =
        "\156\uffff";
    static final String DFA6_minS =
        "\1\11\2\75\1\46\2\uffff\1\75\1\53\1\55\1\52\2\uffff\1\74\2\75\1"+
        "\uffff\1\75\1\157\1\154\1\150\1\uffff\1\75\2\uffff\1\146\1\150\1"+
        "\157\1\141\1\157\1\154\1\uffff\1\56\23\uffff\1\75\5\uffff\1\75\3"+
        "\uffff\1\60\1\162\1\157\1\151\3\uffff\1\164\1\60\1\141\1\157\2\151"+
        "\1\163\7\uffff\1\60\1\141\1\154\1\60\1\uffff\1\162\1\154\1\156\1"+
        "\144\1\145\1\uffff\1\164\1\145\1\uffff\7\60\7\uffff";
    static final String DFA6_maxS =
        "\1\176\3\75\2\uffff\4\75\2\uffff\2\75\1\76\1\uffff\1\75\2\157\1"+
        "\150\1\uffff\1\174\2\uffff\1\156\1\150\1\157\1\141\1\157\1\154\1"+
        "\uffff\1\71\23\uffff\1\75\5\uffff\1\75\3\uffff\1\172\1\162\1\157"+
        "\1\151\3\uffff\1\164\1\172\1\141\1\157\2\151\1\163\7\uffff\1\172"+
        "\1\141\1\154\1\172\1\uffff\1\162\1\154\1\156\1\144\1\145\1\uffff"+
        "\1\164\1\145\1\uffff\7\172\7\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\10\1\11\4\uffff\1\24\1\25\3\uffff\1\40\4\uffff\1\46\1"+
        "\uffff\1\52\1\53\6\uffff\1\64\1\uffff\1\67\1\2\1\1\1\4\1\3\1\5\1"+
        "\7\1\6\1\13\1\12\1\15\1\16\1\14\1\20\1\21\1\17\1\23\1\70\1\22\1"+
        "\uffff\1\31\1\26\1\33\1\32\1\35\1\uffff\1\34\1\42\1\41\4\uffff\1"+
        "\50\1\51\1\47\7\uffff\1\65\1\66\1\30\1\27\1\37\1\36\1\43\4\uffff"+
        "\1\62\5\uffff\1\44\2\uffff\1\55\7\uffff\1\56\1\57\1\60\1\61\1\63"+
        "\1\54\1\45";
    static final String DFA6_specialS =
        "\156\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\1\3\uffff\1\2\1\3\1\uffff"+
            "\1\4\1\5\1\6\1\7\1\uffff\1\10\1\uffff\1\11\12\37\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\uffff\32\36\3\uffff\1\20\1\36\1\uffff\1"+
            "\36\1\32\1\31\1\21\1\35\1\22\2\36\1\30\3\36\1\33\10\36\1\34"+
            "\1\23\3\36\1\24\1\25\1\26\1\27",
            "\1\41",
            "\1\43",
            "\1\45\26\uffff\1\46",
            "",
            "",
            "\1\50",
            "\1\52\21\uffff\1\53",
            "\1\55\17\uffff\1\56",
            "\1\61\22\uffff\1\60",
            "",
            "",
            "\1\63\1\64",
            "\1\66",
            "\1\70\1\71",
            "",
            "\1\73",
            "\1\75",
            "\1\77\2\uffff\1\76",
            "\1\100",
            "",
            "\1\101\76\uffff\1\102",
            "",
            "",
            "\1\105\7\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\114\1\uffff\12\37",
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
            "",
            "",
            "",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "\1\125",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\135",
            "\1\136",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | FLOAT | INT | CHAR | BOOLEAN | MAIN | VOID | IF | ELSE | Identifier | Integer_constant | Floating_point_constant | WS | COMMENT );";
        }
    }
 

}