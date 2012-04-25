// $ANTLR 3.4 C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g 2012-04-25 08:27:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QuiltDispatchBasicLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int ALPHA=4;
    public static final int CHAR=5;
    public static final int DIGIT=6;
    public static final int IDENT=7;
    public static final int KW=8;
    public static final int URI=9;
    public static final int WHITESPACE=10;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public QuiltDispatchBasicLexer() {} 
    public QuiltDispatchBasicLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public QuiltDispatchBasicLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:2:7: ( '!' )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:2:9: '!'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:3:7: ( '(' )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:3:9: '('
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:4:7: ( ')' )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:4:9: ')'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:5:7: ( ',' )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:5:9: ','
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:6:7: ( '=' )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:6:9: '='
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:7:7: ( '=>' )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:7:9: '=>'
            {
            match("=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:8:7: ( '`' )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:8:9: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "KW"
    public final void mKW() throws RecognitionException {
        try {
            int _type = KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:22:5: ( 'authority' | 'scheme' | 'URI' | 'domain_name' | 'port' | 'ip' | 'path' | 'fragment' | 'query_string' 'header' | 'method' )
            int alt1=10;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt1=1;
                }
                break;
            case 's':
                {
                alt1=2;
                }
                break;
            case 'U':
                {
                alt1=3;
                }
                break;
            case 'd':
                {
                alt1=4;
                }
                break;
            case 'p':
                {
                int LA1_5 = input.LA(2);

                if ( (LA1_5=='o') ) {
                    alt1=5;
                }
                else if ( (LA1_5=='a') ) {
                    alt1=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;

                }
                }
                break;
            case 'i':
                {
                alt1=6;
                }
                break;
            case 'f':
                {
                alt1=8;
                }
                break;
            case 'q':
                {
                alt1=9;
                }
                break;
            case 'm':
                {
                alt1=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:22:8: 'authority'
                    {
                    match("authority"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:22:22: 'scheme'
                    {
                    match("scheme"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:22:33: 'URI'
                    {
                    match("URI"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:22:41: 'domain_name'
                    {
                    match("domain_name"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:22:57: 'port'
                    {
                    match("port"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:22:66: 'ip'
                    {
                    match("ip"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:22:73: 'path'
                    {
                    match("path"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:22:82: 'fragment'
                    {
                    match("fragment"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:22:95: 'query_string' 'header'
                    {
                    match("query_string"); 



                    match("header"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:23:29: 'method'
                    {
                    match("method"); 



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
    // $ANTLR end "KW"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            int _type = ALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:25:8: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALPHA"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:27:8: ( ALPHA ( ALPHA | DIGIT )* )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:27:10: ALPHA ( ALPHA | DIGIT )*
            {
            mALPHA(); 


            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:27:15: ( ALPHA | DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:29:8: ( '0' .. '9' )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:31:6: (~ ( ' ' | '\\n' | '\\r' ) )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "URI"
    public final void mURI() throws RecognitionException {
        try {
            int _type = URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:33:6: ( ( CHAR )+ )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:33:8: ( CHAR )+
            {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:33:8: ( CHAR )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\u001F')||(LA3_0 >= '!' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '\uFFFF') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "URI"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:36:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:36:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:36:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | KW | ALPHA | IDENT | DIGIT | CHAR | URI | WHITESPACE )
        int alt5=14;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:16: T__12
                {
                mT__12(); 


                }
                break;
            case 3 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:22: T__13
                {
                mT__13(); 


                }
                break;
            case 4 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:28: T__14
                {
                mT__14(); 


                }
                break;
            case 5 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:34: T__15
                {
                mT__15(); 


                }
                break;
            case 6 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:40: T__16
                {
                mT__16(); 


                }
                break;
            case 7 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:46: T__17
                {
                mT__17(); 


                }
                break;
            case 8 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:52: KW
                {
                mKW(); 


                }
                break;
            case 9 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:55: ALPHA
                {
                mALPHA(); 


                }
                break;
            case 10 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:61: IDENT
                {
                mIDENT(); 


                }
                break;
            case 11 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:67: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 12 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:73: CHAR
                {
                mCHAR(); 


                }
                break;
            case 13 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:78: URI
                {
                mURI(); 


                }
                break;
            case 14 :
                // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:1:82: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\25\1\27\1\30\1\31\1\33\1\34\12\36\1\51\2\52\6\uffff\1"+
        "\54\2\uffff\1\56\1\uffff\6\56\1\64\3\56\2\uffff\1\26\1\uffff\1\56"+
        "\1\uffff\1\56\1\64\3\56\1\uffff\6\56\2\64\12\56\1\64\2\56\1\26\1"+
        "\64\1\56\1\26\1\56\1\26\1\56\1\26\1\64\1\26\1\64\4\26\1\64\7\26"+
        "\1\64";
    static final String DFA5_eofS =
        "\142\uffff";
    static final String DFA5_minS =
        "\24\0\6\uffff\1\0\2\uffff\1\0\1\uffff\12\0\2\uffff\1\11\1\uffff"+
        "\1\0\1\uffff\5\0\1\uffff\25\0\1\163\2\0\1\156\1\0\1\164\1\0\1\141"+
        "\1\0\1\162\1\0\1\155\1\151\1\145\1\156\1\0\1\147\1\150\1\145\1\141"+
        "\1\144\1\145\1\162\1\0";
    static final String DFA5_maxS =
        "\24\uffff\6\uffff\1\uffff\2\uffff\1\uffff\1\uffff\12\uffff\2\uffff"+
        "\1\40\1\uffff\1\uffff\1\uffff\5\uffff\1\uffff\25\uffff\1\163\2\uffff"+
        "\1\156\1\uffff\1\164\1\uffff\1\141\1\uffff\1\162\1\uffff\1\155\1"+
        "\151\1\145\1\156\1\uffff\1\147\1\150\1\145\1\141\1\144\1\145\1\162"+
        "\1\uffff";
    static final String DFA5_acceptS =
        "\24\uffff\1\16\1\1\1\15\1\2\1\3\1\4\1\uffff\1\5\1\7\1\uffff\1\11"+
        "\12\uffff\1\13\1\14\1\uffff\1\6\1\uffff\1\12\5\uffff\1\10\55\uffff";
    static final String DFA5_specialS =
        "\1\47\1\11\1\13\1\16\1\46\1\76\1\34\1\26\1\20\1\102\1\101\1\5\1"+
        "\70\1\62\1\57\1\52\1\10\1\17\1\66\1\32\6\uffff\1\7\2\uffff\1\35"+
        "\1\uffff\1\12\1\24\1\33\1\31\1\77\1\61\1\0\1\63\1\74\1\51\4\uffff"+
        "\1\43\1\uffff\1\23\1\3\1\30\1\100\1\60\1\uffff\1\65\1\73\1\50\1"+
        "\44\1\22\1\27\1\1\1\2\1\64\1\55\1\54\1\41\1\21\1\25\1\71\1\56\1"+
        "\53\1\42\1\15\1\75\1\67\1\uffff\1\4\1\36\1\uffff\1\72\1\uffff\1"+
        "\37\1\uffff\1\6\1\uffff\1\14\4\uffff\1\40\7\uffff\1\45}>";
    static final String[] DFA5_transitionS = {
            "\11\23\1\22\1\24\1\23\1\22\1\24\22\23\1\24\1\1\6\23\1\2\1\3"+
            "\2\23\1\4\3\23\12\21\3\23\1\5\3\23\24\20\1\11\5\20\5\23\1\6"+
            "\1\7\2\20\1\12\1\20\1\15\2\20\1\14\3\20\1\17\2\20\1\13\1\16"+
            "\1\20\1\10\7\20\uff85\23",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\uffdf\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\uffdf\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\uffdf\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\uffdf\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\35\26\1\32\uffc1"+
            "\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\uffdf\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\24\37\1\35\5\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\2\37\1\40\27\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\21\37\1\41\10\37\6\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\16\37\1\42\13\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\1\44\15\37\1\43\13\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\17\37\1\45\12\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\21\37\1\46\10\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\24\37\1\47\5\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\4\37\1\50\25\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\uffdf\26",
            "\11\26\1\53\1\24\1\26\1\53\1\24\22\26\1\24\uffdf\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\uffdf\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\uffdf\26",
            "",
            "",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\23\37\1\55\6\37\uff85\26",
            "",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\7\37\1\57\22\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\10\37\1\60\21\37\6\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\14\37\1\61\15\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\21\37\1\62\10\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\23\37\1\63\6\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\1\65\31\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\4\37\1\66\25\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\23\37\1\67\6\37\uff85\26",
            "",
            "",
            "\1\53\1\24\1\uffff\1\53\1\24\22\uffff\1\24",
            "",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\7\37\1\70\22\37\uff85\26",
            "",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\4\37\1\71\25\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\1\72\31\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\23\37\1\73\6\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\7\37\1\74\22\37\uff85\26",
            "",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\6\37\1\75\23\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\21\37\1\76\10\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\7\37\1\77\22\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\16\37\1\100\13\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\14\37\1\101\15\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\10\37\1\102\21\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\14\37\1\103\15\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\30\37\1\104\1\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\16\37\1\105\13\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\21\37\1\106\10\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\4\37\1\107\25\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\15\37\1\110\14\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\4\37\1\111\25\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\4\26\1\112\1\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\3\37\1\113\26\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\10\37\1\114\21\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\4\26\1\115\1\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\15\37\1\116\14\37\uff85\26",
            "\1\117",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\32\37\uff85\26",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\23\37\1\120\6\37\uff85\26",
            "\1\121",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\23\37\1\122\6\37\uff85\26",
            "\1\123",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\30\37\1\124\1\37\uff85\26",
            "\1\125",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\32\37\uff85\26",
            "\1\126",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\17\26\12\37\7\26"+
            "\32\37\6\26\32\37\uff85\26",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\uffdf\26",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\26\1\uffff\2\26\1\uffff\22\26\1\uffff\uffdf\26"
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | KW | ALPHA | IDENT | DIGIT | CHAR | URI | WHITESPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_37 = input.LA(1);

                        s = -1;
                        if ( ((LA5_37 >= '0' && LA5_37 <= '9')||(LA5_37 >= 'A' && LA5_37 <= 'Z')||(LA5_37 >= 'a' && LA5_37 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_37 >= '\u0000' && LA5_37 <= '\t')||(LA5_37 >= '\u000B' && LA5_37 <= '\f')||(LA5_37 >= '\u000E' && LA5_37 <= '\u001F')||(LA5_37 >= '!' && LA5_37 <= '/')||(LA5_37 >= ':' && LA5_37 <= '@')||(LA5_37 >= '[' && LA5_37 <= '`')||(LA5_37 >= '{' && LA5_37 <= '\uFFFF')) ) {s = 22;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA5_59 = input.LA(1);

                        s = -1;
                        if ( ((LA5_59 >= '0' && LA5_59 <= '9')||(LA5_59 >= 'A' && LA5_59 <= 'Z')||(LA5_59 >= 'a' && LA5_59 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_59 >= '\u0000' && LA5_59 <= '\t')||(LA5_59 >= '\u000B' && LA5_59 <= '\f')||(LA5_59 >= '\u000E' && LA5_59 <= '\u001F')||(LA5_59 >= '!' && LA5_59 <= '/')||(LA5_59 >= ':' && LA5_59 <= '@')||(LA5_59 >= '[' && LA5_59 <= '`')||(LA5_59 >= '{' && LA5_59 <= '\uFFFF')) ) {s = 22;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA5_60 = input.LA(1);

                        s = -1;
                        if ( ((LA5_60 >= '0' && LA5_60 <= '9')||(LA5_60 >= 'A' && LA5_60 <= 'Z')||(LA5_60 >= 'a' && LA5_60 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_60 >= '\u0000' && LA5_60 <= '\t')||(LA5_60 >= '\u000B' && LA5_60 <= '\f')||(LA5_60 >= '\u000E' && LA5_60 <= '\u001F')||(LA5_60 >= '!' && LA5_60 <= '/')||(LA5_60 >= ':' && LA5_60 <= '@')||(LA5_60 >= '[' && LA5_60 <= '`')||(LA5_60 >= '{' && LA5_60 <= '\uFFFF')) ) {s = 22;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA5_48 = input.LA(1);

                        s = -1;
                        if ( ((LA5_48 >= '0' && LA5_48 <= '9')||(LA5_48 >= 'A' && LA5_48 <= 'Z')||(LA5_48 >= 'a' && LA5_48 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_48 >= '\u0000' && LA5_48 <= '\t')||(LA5_48 >= '\u000B' && LA5_48 <= '\f')||(LA5_48 >= '\u000E' && LA5_48 <= '\u001F')||(LA5_48 >= '!' && LA5_48 <= '/')||(LA5_48 >= ':' && LA5_48 <= '@')||(LA5_48 >= '[' && LA5_48 <= '`')||(LA5_48 >= '{' && LA5_48 <= '\uFFFF')) ) {s = 22;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA5_75 = input.LA(1);

                        s = -1;
                        if ( ((LA5_75 >= '0' && LA5_75 <= '9')||(LA5_75 >= 'A' && LA5_75 <= 'Z')||(LA5_75 >= 'a' && LA5_75 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_75 >= '\u0000' && LA5_75 <= '\t')||(LA5_75 >= '\u000B' && LA5_75 <= '\f')||(LA5_75 >= '\u000E' && LA5_75 <= '\u001F')||(LA5_75 >= '!' && LA5_75 <= '/')||(LA5_75 >= ':' && LA5_75 <= '@')||(LA5_75 >= '[' && LA5_75 <= '`')||(LA5_75 >= '{' && LA5_75 <= '\uFFFF')) ) {s = 22;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA5_11 = input.LA(1);

                        s = -1;
                        if ( (LA5_11=='o') ) {s = 35;}

                        else if ( (LA5_11=='a') ) {s = 36;}

                        else if ( ((LA5_11 >= '0' && LA5_11 <= '9')||(LA5_11 >= 'A' && LA5_11 <= 'Z')||(LA5_11 >= 'b' && LA5_11 <= 'n')||(LA5_11 >= 'p' && LA5_11 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_11 >= '\u0000' && LA5_11 <= '\t')||(LA5_11 >= '\u000B' && LA5_11 <= '\f')||(LA5_11 >= '\u000E' && LA5_11 <= '\u001F')||(LA5_11 >= '!' && LA5_11 <= '/')||(LA5_11 >= ':' && LA5_11 <= '@')||(LA5_11 >= '[' && LA5_11 <= '`')||(LA5_11 >= '{' && LA5_11 <= '\uFFFF')) ) {s = 22;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA5_82 = input.LA(1);

                        s = -1;
                        if ( ((LA5_82 >= '0' && LA5_82 <= '9')||(LA5_82 >= 'A' && LA5_82 <= 'Z')||(LA5_82 >= 'a' && LA5_82 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_82 >= '\u0000' && LA5_82 <= '\t')||(LA5_82 >= '\u000B' && LA5_82 <= '\f')||(LA5_82 >= '\u000E' && LA5_82 <= '\u001F')||(LA5_82 >= '!' && LA5_82 <= '/')||(LA5_82 >= ':' && LA5_82 <= '@')||(LA5_82 >= '[' && LA5_82 <= '`')||(LA5_82 >= '{' && LA5_82 <= '\uFFFF')) ) {s = 22;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA5_26 = input.LA(1);

                        s = -1;
                        if ( ((LA5_26 >= '\u0000' && LA5_26 <= '\t')||(LA5_26 >= '\u000B' && LA5_26 <= '\f')||(LA5_26 >= '\u000E' && LA5_26 <= '\u001F')||(LA5_26 >= '!' && LA5_26 <= '\uFFFF')) ) {s = 22;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA5_16 = input.LA(1);

                        s = -1;
                        if ( ((LA5_16 >= '0' && LA5_16 <= '9')||(LA5_16 >= 'A' && LA5_16 <= 'Z')||(LA5_16 >= 'a' && LA5_16 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_16 >= '\u0000' && LA5_16 <= '\t')||(LA5_16 >= '\u000B' && LA5_16 <= '\f')||(LA5_16 >= '\u000E' && LA5_16 <= '\u001F')||(LA5_16 >= '!' && LA5_16 <= '/')||(LA5_16 >= ':' && LA5_16 <= '@')||(LA5_16 >= '[' && LA5_16 <= '`')||(LA5_16 >= '{' && LA5_16 <= '\uFFFF')) ) {s = 22;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA5_1 = input.LA(1);

                        s = -1;
                        if ( ((LA5_1 >= '\u0000' && LA5_1 <= '\t')||(LA5_1 >= '\u000B' && LA5_1 <= '\f')||(LA5_1 >= '\u000E' && LA5_1 <= '\u001F')||(LA5_1 >= '!' && LA5_1 <= '\uFFFF')) ) {s = 22;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA5_31 = input.LA(1);

                        s = -1;
                        if ( ((LA5_31 >= '0' && LA5_31 <= '9')||(LA5_31 >= 'A' && LA5_31 <= 'Z')||(LA5_31 >= 'a' && LA5_31 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_31 >= '\u0000' && LA5_31 <= '\t')||(LA5_31 >= '\u000B' && LA5_31 <= '\f')||(LA5_31 >= '\u000E' && LA5_31 <= '\u001F')||(LA5_31 >= '!' && LA5_31 <= '/')||(LA5_31 >= ':' && LA5_31 <= '@')||(LA5_31 >= '[' && LA5_31 <= '`')||(LA5_31 >= '{' && LA5_31 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA5_2 = input.LA(1);

                        s = -1;
                        if ( ((LA5_2 >= '\u0000' && LA5_2 <= '\t')||(LA5_2 >= '\u000B' && LA5_2 <= '\f')||(LA5_2 >= '\u000E' && LA5_2 <= '\u001F')||(LA5_2 >= '!' && LA5_2 <= '\uFFFF')) ) {s = 22;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA5_84 = input.LA(1);

                        s = -1;
                        if ( ((LA5_84 >= '0' && LA5_84 <= '9')||(LA5_84 >= 'A' && LA5_84 <= 'Z')||(LA5_84 >= 'a' && LA5_84 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_84 >= '\u0000' && LA5_84 <= '\t')||(LA5_84 >= '\u000B' && LA5_84 <= '\f')||(LA5_84 >= '\u000E' && LA5_84 <= '\u001F')||(LA5_84 >= '!' && LA5_84 <= '/')||(LA5_84 >= ':' && LA5_84 <= '@')||(LA5_84 >= '[' && LA5_84 <= '`')||(LA5_84 >= '{' && LA5_84 <= '\uFFFF')) ) {s = 22;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA5_71 = input.LA(1);

                        s = -1;
                        if ( ((LA5_71 >= '0' && LA5_71 <= '9')||(LA5_71 >= 'A' && LA5_71 <= 'Z')||(LA5_71 >= 'a' && LA5_71 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_71 >= '\u0000' && LA5_71 <= '\t')||(LA5_71 >= '\u000B' && LA5_71 <= '\f')||(LA5_71 >= '\u000E' && LA5_71 <= '\u001F')||(LA5_71 >= '!' && LA5_71 <= '/')||(LA5_71 >= ':' && LA5_71 <= '@')||(LA5_71 >= '[' && LA5_71 <= '`')||(LA5_71 >= '{' && LA5_71 <= '\uFFFF')) ) {s = 22;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA5_3 = input.LA(1);

                        s = -1;
                        if ( ((LA5_3 >= '\u0000' && LA5_3 <= '\t')||(LA5_3 >= '\u000B' && LA5_3 <= '\f')||(LA5_3 >= '\u000E' && LA5_3 <= '\u001F')||(LA5_3 >= '!' && LA5_3 <= '\uFFFF')) ) {s = 22;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA5_17 = input.LA(1);

                        s = -1;
                        if ( ((LA5_17 >= '\u0000' && LA5_17 <= '\t')||(LA5_17 >= '\u000B' && LA5_17 <= '\f')||(LA5_17 >= '\u000E' && LA5_17 <= '\u001F')||(LA5_17 >= '!' && LA5_17 <= '\uFFFF')) ) {s = 22;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA5_8 = input.LA(1);

                        s = -1;
                        if ( (LA5_8=='c') ) {s = 32;}

                        else if ( ((LA5_8 >= '0' && LA5_8 <= '9')||(LA5_8 >= 'A' && LA5_8 <= 'Z')||(LA5_8 >= 'a' && LA5_8 <= 'b')||(LA5_8 >= 'd' && LA5_8 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_8 >= '\u0000' && LA5_8 <= '\t')||(LA5_8 >= '\u000B' && LA5_8 <= '\f')||(LA5_8 >= '\u000E' && LA5_8 <= '\u001F')||(LA5_8 >= '!' && LA5_8 <= '/')||(LA5_8 >= ':' && LA5_8 <= '@')||(LA5_8 >= '[' && LA5_8 <= '`')||(LA5_8 >= '{' && LA5_8 <= '\uFFFF')) ) {s = 22;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA5_65 = input.LA(1);

                        s = -1;
                        if ( (LA5_65=='e') ) {s = 71;}

                        else if ( ((LA5_65 >= '0' && LA5_65 <= '9')||(LA5_65 >= 'A' && LA5_65 <= 'Z')||(LA5_65 >= 'a' && LA5_65 <= 'd')||(LA5_65 >= 'f' && LA5_65 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_65 >= '\u0000' && LA5_65 <= '\t')||(LA5_65 >= '\u000B' && LA5_65 <= '\f')||(LA5_65 >= '\u000E' && LA5_65 <= '\u001F')||(LA5_65 >= '!' && LA5_65 <= '/')||(LA5_65 >= ':' && LA5_65 <= '@')||(LA5_65 >= '[' && LA5_65 <= '`')||(LA5_65 >= '{' && LA5_65 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA5_57 = input.LA(1);

                        s = -1;
                        if ( (LA5_57=='m') ) {s = 65;}

                        else if ( ((LA5_57 >= '0' && LA5_57 <= '9')||(LA5_57 >= 'A' && LA5_57 <= 'Z')||(LA5_57 >= 'a' && LA5_57 <= 'l')||(LA5_57 >= 'n' && LA5_57 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_57 >= '\u0000' && LA5_57 <= '\t')||(LA5_57 >= '\u000B' && LA5_57 <= '\f')||(LA5_57 >= '\u000E' && LA5_57 <= '\u001F')||(LA5_57 >= '!' && LA5_57 <= '/')||(LA5_57 >= ':' && LA5_57 <= '@')||(LA5_57 >= '[' && LA5_57 <= '`')||(LA5_57 >= '{' && LA5_57 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA5_47 = input.LA(1);

                        s = -1;
                        if ( (LA5_47=='e') ) {s = 57;}

                        else if ( ((LA5_47 >= '0' && LA5_47 <= '9')||(LA5_47 >= 'A' && LA5_47 <= 'Z')||(LA5_47 >= 'a' && LA5_47 <= 'd')||(LA5_47 >= 'f' && LA5_47 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_47 >= '\u0000' && LA5_47 <= '\t')||(LA5_47 >= '\u000B' && LA5_47 <= '\f')||(LA5_47 >= '\u000E' && LA5_47 <= '\u001F')||(LA5_47 >= '!' && LA5_47 <= '/')||(LA5_47 >= ':' && LA5_47 <= '@')||(LA5_47 >= '[' && LA5_47 <= '`')||(LA5_47 >= '{' && LA5_47 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA5_32 = input.LA(1);

                        s = -1;
                        if ( (LA5_32=='h') ) {s = 47;}

                        else if ( ((LA5_32 >= '0' && LA5_32 <= '9')||(LA5_32 >= 'A' && LA5_32 <= 'Z')||(LA5_32 >= 'a' && LA5_32 <= 'g')||(LA5_32 >= 'i' && LA5_32 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_32 >= '\u0000' && LA5_32 <= '\t')||(LA5_32 >= '\u000B' && LA5_32 <= '\f')||(LA5_32 >= '\u000E' && LA5_32 <= '\u001F')||(LA5_32 >= '!' && LA5_32 <= '/')||(LA5_32 >= ':' && LA5_32 <= '@')||(LA5_32 >= '[' && LA5_32 <= '`')||(LA5_32 >= '{' && LA5_32 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA5_66 = input.LA(1);

                        s = -1;
                        if ( (LA5_66=='n') ) {s = 72;}

                        else if ( ((LA5_66 >= '0' && LA5_66 <= '9')||(LA5_66 >= 'A' && LA5_66 <= 'Z')||(LA5_66 >= 'a' && LA5_66 <= 'm')||(LA5_66 >= 'o' && LA5_66 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_66 >= '\u0000' && LA5_66 <= '\t')||(LA5_66 >= '\u000B' && LA5_66 <= '\f')||(LA5_66 >= '\u000E' && LA5_66 <= '\u001F')||(LA5_66 >= '!' && LA5_66 <= '/')||(LA5_66 >= ':' && LA5_66 <= '@')||(LA5_66 >= '[' && LA5_66 <= '`')||(LA5_66 >= '{' && LA5_66 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA5_7 = input.LA(1);

                        s = -1;
                        if ( (LA5_7=='u') ) {s = 29;}

                        else if ( ((LA5_7 >= '0' && LA5_7 <= '9')||(LA5_7 >= 'A' && LA5_7 <= 'Z')||(LA5_7 >= 'a' && LA5_7 <= 't')||(LA5_7 >= 'v' && LA5_7 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_7 >= '\u0000' && LA5_7 <= '\t')||(LA5_7 >= '\u000B' && LA5_7 <= '\f')||(LA5_7 >= '\u000E' && LA5_7 <= '\u001F')||(LA5_7 >= '!' && LA5_7 <= '/')||(LA5_7 >= ':' && LA5_7 <= '@')||(LA5_7 >= '[' && LA5_7 <= '`')||(LA5_7 >= '{' && LA5_7 <= '\uFFFF')) ) {s = 22;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA5_58 = input.LA(1);

                        s = -1;
                        if ( (LA5_58=='i') ) {s = 66;}

                        else if ( ((LA5_58 >= '0' && LA5_58 <= '9')||(LA5_58 >= 'A' && LA5_58 <= 'Z')||(LA5_58 >= 'a' && LA5_58 <= 'h')||(LA5_58 >= 'j' && LA5_58 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_58 >= '\u0000' && LA5_58 <= '\t')||(LA5_58 >= '\u000B' && LA5_58 <= '\f')||(LA5_58 >= '\u000E' && LA5_58 <= '\u001F')||(LA5_58 >= '!' && LA5_58 <= '/')||(LA5_58 >= ':' && LA5_58 <= '@')||(LA5_58 >= '[' && LA5_58 <= '`')||(LA5_58 >= '{' && LA5_58 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA5_49 = input.LA(1);

                        s = -1;
                        if ( (LA5_49=='a') ) {s = 58;}

                        else if ( ((LA5_49 >= '0' && LA5_49 <= '9')||(LA5_49 >= 'A' && LA5_49 <= 'Z')||(LA5_49 >= 'b' && LA5_49 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_49 >= '\u0000' && LA5_49 <= '\t')||(LA5_49 >= '\u000B' && LA5_49 <= '\f')||(LA5_49 >= '\u000E' && LA5_49 <= '\u001F')||(LA5_49 >= '!' && LA5_49 <= '/')||(LA5_49 >= ':' && LA5_49 <= '@')||(LA5_49 >= '[' && LA5_49 <= '`')||(LA5_49 >= '{' && LA5_49 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA5_34 = input.LA(1);

                        s = -1;
                        if ( (LA5_34=='m') ) {s = 49;}

                        else if ( ((LA5_34 >= '0' && LA5_34 <= '9')||(LA5_34 >= 'A' && LA5_34 <= 'Z')||(LA5_34 >= 'a' && LA5_34 <= 'l')||(LA5_34 >= 'n' && LA5_34 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_34 >= '\u0000' && LA5_34 <= '\t')||(LA5_34 >= '\u000B' && LA5_34 <= '\f')||(LA5_34 >= '\u000E' && LA5_34 <= '\u001F')||(LA5_34 >= '!' && LA5_34 <= '/')||(LA5_34 >= ':' && LA5_34 <= '@')||(LA5_34 >= '[' && LA5_34 <= '`')||(LA5_34 >= '{' && LA5_34 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA5_19 = input.LA(1);

                        s = -1;
                        if ( ((LA5_19 >= '\u0000' && LA5_19 <= '\t')||(LA5_19 >= '\u000B' && LA5_19 <= '\f')||(LA5_19 >= '\u000E' && LA5_19 <= '\u001F')||(LA5_19 >= '!' && LA5_19 <= '\uFFFF')) ) {s = 22;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA5_33 = input.LA(1);

                        s = -1;
                        if ( (LA5_33=='I') ) {s = 48;}

                        else if ( ((LA5_33 >= '0' && LA5_33 <= '9')||(LA5_33 >= 'A' && LA5_33 <= 'H')||(LA5_33 >= 'J' && LA5_33 <= 'Z')||(LA5_33 >= 'a' && LA5_33 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_33 >= '\u0000' && LA5_33 <= '\t')||(LA5_33 >= '\u000B' && LA5_33 <= '\f')||(LA5_33 >= '\u000E' && LA5_33 <= '\u001F')||(LA5_33 >= '!' && LA5_33 <= '/')||(LA5_33 >= ':' && LA5_33 <= '@')||(LA5_33 >= '[' && LA5_33 <= '`')||(LA5_33 >= '{' && LA5_33 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA5_6 = input.LA(1);

                        s = -1;
                        if ( ((LA5_6 >= '\u0000' && LA5_6 <= '\t')||(LA5_6 >= '\u000B' && LA5_6 <= '\f')||(LA5_6 >= '\u000E' && LA5_6 <= '\u001F')||(LA5_6 >= '!' && LA5_6 <= '\uFFFF')) ) {s = 22;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA5_29 = input.LA(1);

                        s = -1;
                        if ( (LA5_29=='t') ) {s = 45;}

                        else if ( ((LA5_29 >= '0' && LA5_29 <= '9')||(LA5_29 >= 'A' && LA5_29 <= 'Z')||(LA5_29 >= 'a' && LA5_29 <= 's')||(LA5_29 >= 'u' && LA5_29 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_29 >= '\u0000' && LA5_29 <= '\t')||(LA5_29 >= '\u000B' && LA5_29 <= '\f')||(LA5_29 >= '\u000E' && LA5_29 <= '\u001F')||(LA5_29 >= '!' && LA5_29 <= '/')||(LA5_29 >= ':' && LA5_29 <= '@')||(LA5_29 >= '[' && LA5_29 <= '`')||(LA5_29 >= '{' && LA5_29 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA5_76 = input.LA(1);

                        s = -1;
                        if ( (LA5_76=='t') ) {s = 80;}

                        else if ( ((LA5_76 >= '0' && LA5_76 <= '9')||(LA5_76 >= 'A' && LA5_76 <= 'Z')||(LA5_76 >= 'a' && LA5_76 <= 's')||(LA5_76 >= 'u' && LA5_76 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_76 >= '\u0000' && LA5_76 <= '\t')||(LA5_76 >= '\u000B' && LA5_76 <= '\f')||(LA5_76 >= '\u000E' && LA5_76 <= '\u001F')||(LA5_76 >= '!' && LA5_76 <= '/')||(LA5_76 >= ':' && LA5_76 <= '@')||(LA5_76 >= '[' && LA5_76 <= '`')||(LA5_76 >= '{' && LA5_76 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA5_80 = input.LA(1);

                        s = -1;
                        if ( (LA5_80=='y') ) {s = 84;}

                        else if ( ((LA5_80 >= '0' && LA5_80 <= '9')||(LA5_80 >= 'A' && LA5_80 <= 'Z')||(LA5_80 >= 'a' && LA5_80 <= 'x')||LA5_80=='z') ) {s = 31;}

                        else if ( ((LA5_80 >= '\u0000' && LA5_80 <= '\t')||(LA5_80 >= '\u000B' && LA5_80 <= '\f')||(LA5_80 >= '\u000E' && LA5_80 <= '\u001F')||(LA5_80 >= '!' && LA5_80 <= '/')||(LA5_80 >= ':' && LA5_80 <= '@')||(LA5_80 >= '[' && LA5_80 <= '`')||(LA5_80 >= '{' && LA5_80 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA5_89 = input.LA(1);

                        s = -1;
                        if ( ((LA5_89 >= '\u0000' && LA5_89 <= '\t')||(LA5_89 >= '\u000B' && LA5_89 <= '\f')||(LA5_89 >= '\u000E' && LA5_89 <= '\u001F')||(LA5_89 >= '!' && LA5_89 <= '\uFFFF')) ) {s = 22;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA5_64 = input.LA(1);

                        s = -1;
                        if ( (LA5_64=='r') ) {s = 70;}

                        else if ( ((LA5_64 >= '0' && LA5_64 <= '9')||(LA5_64 >= 'A' && LA5_64 <= 'Z')||(LA5_64 >= 'a' && LA5_64 <= 'q')||(LA5_64 >= 's' && LA5_64 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_64 >= '\u0000' && LA5_64 <= '\t')||(LA5_64 >= '\u000B' && LA5_64 <= '\f')||(LA5_64 >= '\u000E' && LA5_64 <= '\u001F')||(LA5_64 >= '!' && LA5_64 <= '/')||(LA5_64 >= ':' && LA5_64 <= '@')||(LA5_64 >= '[' && LA5_64 <= '`')||(LA5_64 >= '{' && LA5_64 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA5_70 = input.LA(1);

                        s = -1;
                        if ( (LA5_70=='i') ) {s = 76;}

                        else if ( ((LA5_70 >= '0' && LA5_70 <= '9')||(LA5_70 >= 'A' && LA5_70 <= 'Z')||(LA5_70 >= 'a' && LA5_70 <= 'h')||(LA5_70 >= 'j' && LA5_70 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_70 >= '\u0000' && LA5_70 <= '\t')||(LA5_70 >= '\u000B' && LA5_70 <= '\f')||(LA5_70 >= '\u000E' && LA5_70 <= '\u001F')||(LA5_70 >= '!' && LA5_70 <= '/')||(LA5_70 >= ':' && LA5_70 <= '@')||(LA5_70 >= '[' && LA5_70 <= '`')||(LA5_70 >= '{' && LA5_70 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA5_45 = input.LA(1);

                        s = -1;
                        if ( (LA5_45=='h') ) {s = 56;}

                        else if ( ((LA5_45 >= '0' && LA5_45 <= '9')||(LA5_45 >= 'A' && LA5_45 <= 'Z')||(LA5_45 >= 'a' && LA5_45 <= 'g')||(LA5_45 >= 'i' && LA5_45 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_45 >= '\u0000' && LA5_45 <= '\t')||(LA5_45 >= '\u000B' && LA5_45 <= '\f')||(LA5_45 >= '\u000E' && LA5_45 <= '\u001F')||(LA5_45 >= '!' && LA5_45 <= '/')||(LA5_45 >= ':' && LA5_45 <= '@')||(LA5_45 >= '[' && LA5_45 <= '`')||(LA5_45 >= '{' && LA5_45 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA5_56 = input.LA(1);

                        s = -1;
                        if ( (LA5_56=='o') ) {s = 64;}

                        else if ( ((LA5_56 >= '0' && LA5_56 <= '9')||(LA5_56 >= 'A' && LA5_56 <= 'Z')||(LA5_56 >= 'a' && LA5_56 <= 'n')||(LA5_56 >= 'p' && LA5_56 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_56 >= '\u0000' && LA5_56 <= '\t')||(LA5_56 >= '\u000B' && LA5_56 <= '\f')||(LA5_56 >= '\u000E' && LA5_56 <= '\u001F')||(LA5_56 >= '!' && LA5_56 <= '/')||(LA5_56 >= ':' && LA5_56 <= '@')||(LA5_56 >= '[' && LA5_56 <= '`')||(LA5_56 >= '{' && LA5_56 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA5_97 = input.LA(1);

                        s = -1;
                        if ( ((LA5_97 >= '\u0000' && LA5_97 <= '\t')||(LA5_97 >= '\u000B' && LA5_97 <= '\f')||(LA5_97 >= '\u000E' && LA5_97 <= '\u001F')||(LA5_97 >= '!' && LA5_97 <= '\uFFFF')) ) {s = 22;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA5_4 = input.LA(1);

                        s = -1;
                        if ( ((LA5_4 >= '\u0000' && LA5_4 <= '\t')||(LA5_4 >= '\u000B' && LA5_4 <= '\f')||(LA5_4 >= '\u000E' && LA5_4 <= '\u001F')||(LA5_4 >= '!' && LA5_4 <= '\uFFFF')) ) {s = 22;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='!') ) {s = 1;}

                        else if ( (LA5_0=='(') ) {s = 2;}

                        else if ( (LA5_0==')') ) {s = 3;}

                        else if ( (LA5_0==',') ) {s = 4;}

                        else if ( (LA5_0=='=') ) {s = 5;}

                        else if ( (LA5_0=='`') ) {s = 6;}

                        else if ( (LA5_0=='a') ) {s = 7;}

                        else if ( (LA5_0=='s') ) {s = 8;}

                        else if ( (LA5_0=='U') ) {s = 9;}

                        else if ( (LA5_0=='d') ) {s = 10;}

                        else if ( (LA5_0=='p') ) {s = 11;}

                        else if ( (LA5_0=='i') ) {s = 12;}

                        else if ( (LA5_0=='f') ) {s = 13;}

                        else if ( (LA5_0=='q') ) {s = 14;}

                        else if ( (LA5_0=='m') ) {s = 15;}

                        else if ( ((LA5_0 >= 'A' && LA5_0 <= 'T')||(LA5_0 >= 'V' && LA5_0 <= 'Z')||(LA5_0 >= 'b' && LA5_0 <= 'c')||LA5_0=='e'||(LA5_0 >= 'g' && LA5_0 <= 'h')||(LA5_0 >= 'j' && LA5_0 <= 'l')||(LA5_0 >= 'n' && LA5_0 <= 'o')||LA5_0=='r'||(LA5_0 >= 't' && LA5_0 <= 'z')) ) {s = 16;}

                        else if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {s = 17;}

                        else if ( (LA5_0=='\t'||LA5_0=='\f') ) {s = 18;}

                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\b')||LA5_0=='\u000B'||(LA5_0 >= '\u000E' && LA5_0 <= '\u001F')||(LA5_0 >= '\"' && LA5_0 <= '\'')||(LA5_0 >= '*' && LA5_0 <= '+')||(LA5_0 >= '-' && LA5_0 <= '/')||(LA5_0 >= ':' && LA5_0 <= '<')||(LA5_0 >= '>' && LA5_0 <= '@')||(LA5_0 >= '[' && LA5_0 <= '_')||(LA5_0 >= '{' && LA5_0 <= '\uFFFF')) ) {s = 19;}

                        else if ( (LA5_0=='\n'||LA5_0=='\r'||LA5_0==' ') ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA5_55 = input.LA(1);

                        s = -1;
                        if ( (LA5_55=='h') ) {s = 63;}

                        else if ( ((LA5_55 >= '0' && LA5_55 <= '9')||(LA5_55 >= 'A' && LA5_55 <= 'Z')||(LA5_55 >= 'a' && LA5_55 <= 'g')||(LA5_55 >= 'i' && LA5_55 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_55 >= '\u0000' && LA5_55 <= '\t')||(LA5_55 >= '\u000B' && LA5_55 <= '\f')||(LA5_55 >= '\u000E' && LA5_55 <= '\u001F')||(LA5_55 >= '!' && LA5_55 <= '/')||(LA5_55 >= ':' && LA5_55 <= '@')||(LA5_55 >= '[' && LA5_55 <= '`')||(LA5_55 >= '{' && LA5_55 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA5_40 = input.LA(1);

                        s = -1;
                        if ( (LA5_40=='t') ) {s = 55;}

                        else if ( ((LA5_40 >= '0' && LA5_40 <= '9')||(LA5_40 >= 'A' && LA5_40 <= 'Z')||(LA5_40 >= 'a' && LA5_40 <= 's')||(LA5_40 >= 'u' && LA5_40 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_40 >= '\u0000' && LA5_40 <= '\t')||(LA5_40 >= '\u000B' && LA5_40 <= '\f')||(LA5_40 >= '\u000E' && LA5_40 <= '\u001F')||(LA5_40 >= '!' && LA5_40 <= '/')||(LA5_40 >= ':' && LA5_40 <= '@')||(LA5_40 >= '[' && LA5_40 <= '`')||(LA5_40 >= '{' && LA5_40 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA5_15 = input.LA(1);

                        s = -1;
                        if ( (LA5_15=='e') ) {s = 40;}

                        else if ( ((LA5_15 >= '0' && LA5_15 <= '9')||(LA5_15 >= 'A' && LA5_15 <= 'Z')||(LA5_15 >= 'a' && LA5_15 <= 'd')||(LA5_15 >= 'f' && LA5_15 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_15 >= '\u0000' && LA5_15 <= '\t')||(LA5_15 >= '\u000B' && LA5_15 <= '\f')||(LA5_15 >= '\u000E' && LA5_15 <= '\u001F')||(LA5_15 >= '!' && LA5_15 <= '/')||(LA5_15 >= ':' && LA5_15 <= '@')||(LA5_15 >= '[' && LA5_15 <= '`')||(LA5_15 >= '{' && LA5_15 <= '\uFFFF')) ) {s = 22;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA5_69 = input.LA(1);

                        s = -1;
                        if ( (LA5_69=='d') ) {s = 75;}

                        else if ( ((LA5_69 >= '0' && LA5_69 <= '9')||(LA5_69 >= 'A' && LA5_69 <= 'Z')||(LA5_69 >= 'a' && LA5_69 <= 'c')||(LA5_69 >= 'e' && LA5_69 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_69 >= '\u0000' && LA5_69 <= '\t')||(LA5_69 >= '\u000B' && LA5_69 <= '\f')||(LA5_69 >= '\u000E' && LA5_69 <= '\u001F')||(LA5_69 >= '!' && LA5_69 <= '/')||(LA5_69 >= ':' && LA5_69 <= '@')||(LA5_69 >= '[' && LA5_69 <= '`')||(LA5_69 >= '{' && LA5_69 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA5_63 = input.LA(1);

                        s = -1;
                        if ( (LA5_63=='o') ) {s = 69;}

                        else if ( ((LA5_63 >= '0' && LA5_63 <= '9')||(LA5_63 >= 'A' && LA5_63 <= 'Z')||(LA5_63 >= 'a' && LA5_63 <= 'n')||(LA5_63 >= 'p' && LA5_63 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_63 >= '\u0000' && LA5_63 <= '\t')||(LA5_63 >= '\u000B' && LA5_63 <= '\f')||(LA5_63 >= '\u000E' && LA5_63 <= '\u001F')||(LA5_63 >= '!' && LA5_63 <= '/')||(LA5_63 >= ':' && LA5_63 <= '@')||(LA5_63 >= '[' && LA5_63 <= '`')||(LA5_63 >= '{' && LA5_63 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA5_62 = input.LA(1);

                        s = -1;
                        if ( (LA5_62=='y') ) {s = 68;}

                        else if ( ((LA5_62 >= '0' && LA5_62 <= '9')||(LA5_62 >= 'A' && LA5_62 <= 'Z')||(LA5_62 >= 'a' && LA5_62 <= 'x')||LA5_62=='z') ) {s = 31;}

                        else if ( ((LA5_62 >= '\u0000' && LA5_62 <= '\t')||(LA5_62 >= '\u000B' && LA5_62 <= '\f')||(LA5_62 >= '\u000E' && LA5_62 <= '\u001F')||(LA5_62 >= '!' && LA5_62 <= '/')||(LA5_62 >= ':' && LA5_62 <= '@')||(LA5_62 >= '[' && LA5_62 <= '`')||(LA5_62 >= '{' && LA5_62 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA5_68 = input.LA(1);

                        s = -1;
                        if ( (LA5_68=='_') ) {s = 74;}

                        else if ( ((LA5_68 >= '0' && LA5_68 <= '9')||(LA5_68 >= 'A' && LA5_68 <= 'Z')||(LA5_68 >= 'a' && LA5_68 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_68 >= '\u0000' && LA5_68 <= '\t')||(LA5_68 >= '\u000B' && LA5_68 <= '\f')||(LA5_68 >= '\u000E' && LA5_68 <= '\u001F')||(LA5_68 >= '!' && LA5_68 <= '/')||(LA5_68 >= ':' && LA5_68 <= '@')||(LA5_68 >= '[' && LA5_68 <= '^')||LA5_68=='`'||(LA5_68 >= '{' && LA5_68 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA5_14 = input.LA(1);

                        s = -1;
                        if ( (LA5_14=='u') ) {s = 39;}

                        else if ( ((LA5_14 >= '0' && LA5_14 <= '9')||(LA5_14 >= 'A' && LA5_14 <= 'Z')||(LA5_14 >= 'a' && LA5_14 <= 't')||(LA5_14 >= 'v' && LA5_14 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_14 >= '\u0000' && LA5_14 <= '\t')||(LA5_14 >= '\u000B' && LA5_14 <= '\f')||(LA5_14 >= '\u000E' && LA5_14 <= '\u001F')||(LA5_14 >= '!' && LA5_14 <= '/')||(LA5_14 >= ':' && LA5_14 <= '@')||(LA5_14 >= '[' && LA5_14 <= '`')||(LA5_14 >= '{' && LA5_14 <= '\uFFFF')) ) {s = 22;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;

                    case 48 : 
                        int LA5_51 = input.LA(1);

                        s = -1;
                        if ( (LA5_51=='h') ) {s = 60;}

                        else if ( ((LA5_51 >= '0' && LA5_51 <= '9')||(LA5_51 >= 'A' && LA5_51 <= 'Z')||(LA5_51 >= 'a' && LA5_51 <= 'g')||(LA5_51 >= 'i' && LA5_51 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_51 >= '\u0000' && LA5_51 <= '\t')||(LA5_51 >= '\u000B' && LA5_51 <= '\f')||(LA5_51 >= '\u000E' && LA5_51 <= '\u001F')||(LA5_51 >= '!' && LA5_51 <= '/')||(LA5_51 >= ':' && LA5_51 <= '@')||(LA5_51 >= '[' && LA5_51 <= '`')||(LA5_51 >= '{' && LA5_51 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 49 : 
                        int LA5_36 = input.LA(1);

                        s = -1;
                        if ( (LA5_36=='t') ) {s = 51;}

                        else if ( ((LA5_36 >= '0' && LA5_36 <= '9')||(LA5_36 >= 'A' && LA5_36 <= 'Z')||(LA5_36 >= 'a' && LA5_36 <= 's')||(LA5_36 >= 'u' && LA5_36 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_36 >= '\u0000' && LA5_36 <= '\t')||(LA5_36 >= '\u000B' && LA5_36 <= '\f')||(LA5_36 >= '\u000E' && LA5_36 <= '\u001F')||(LA5_36 >= '!' && LA5_36 <= '/')||(LA5_36 >= ':' && LA5_36 <= '@')||(LA5_36 >= '[' && LA5_36 <= '`')||(LA5_36 >= '{' && LA5_36 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 50 : 
                        int LA5_13 = input.LA(1);

                        s = -1;
                        if ( (LA5_13=='r') ) {s = 38;}

                        else if ( ((LA5_13 >= '0' && LA5_13 <= '9')||(LA5_13 >= 'A' && LA5_13 <= 'Z')||(LA5_13 >= 'a' && LA5_13 <= 'q')||(LA5_13 >= 's' && LA5_13 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_13 >= '\u0000' && LA5_13 <= '\t')||(LA5_13 >= '\u000B' && LA5_13 <= '\f')||(LA5_13 >= '\u000E' && LA5_13 <= '\u001F')||(LA5_13 >= '!' && LA5_13 <= '/')||(LA5_13 >= ':' && LA5_13 <= '@')||(LA5_13 >= '[' && LA5_13 <= '`')||(LA5_13 >= '{' && LA5_13 <= '\uFFFF')) ) {s = 22;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;

                    case 51 : 
                        int LA5_38 = input.LA(1);

                        s = -1;
                        if ( (LA5_38=='a') ) {s = 53;}

                        else if ( ((LA5_38 >= '0' && LA5_38 <= '9')||(LA5_38 >= 'A' && LA5_38 <= 'Z')||(LA5_38 >= 'b' && LA5_38 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_38 >= '\u0000' && LA5_38 <= '\t')||(LA5_38 >= '\u000B' && LA5_38 <= '\f')||(LA5_38 >= '\u000E' && LA5_38 <= '\u001F')||(LA5_38 >= '!' && LA5_38 <= '/')||(LA5_38 >= ':' && LA5_38 <= '@')||(LA5_38 >= '[' && LA5_38 <= '`')||(LA5_38 >= '{' && LA5_38 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 52 : 
                        int LA5_61 = input.LA(1);

                        s = -1;
                        if ( (LA5_61=='m') ) {s = 67;}

                        else if ( ((LA5_61 >= '0' && LA5_61 <= '9')||(LA5_61 >= 'A' && LA5_61 <= 'Z')||(LA5_61 >= 'a' && LA5_61 <= 'l')||(LA5_61 >= 'n' && LA5_61 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_61 >= '\u0000' && LA5_61 <= '\t')||(LA5_61 >= '\u000B' && LA5_61 <= '\f')||(LA5_61 >= '\u000E' && LA5_61 <= '\u001F')||(LA5_61 >= '!' && LA5_61 <= '/')||(LA5_61 >= ':' && LA5_61 <= '@')||(LA5_61 >= '[' && LA5_61 <= '`')||(LA5_61 >= '{' && LA5_61 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 53 : 
                        int LA5_53 = input.LA(1);

                        s = -1;
                        if ( (LA5_53=='g') ) {s = 61;}

                        else if ( ((LA5_53 >= '0' && LA5_53 <= '9')||(LA5_53 >= 'A' && LA5_53 <= 'Z')||(LA5_53 >= 'a' && LA5_53 <= 'f')||(LA5_53 >= 'h' && LA5_53 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_53 >= '\u0000' && LA5_53 <= '\t')||(LA5_53 >= '\u000B' && LA5_53 <= '\f')||(LA5_53 >= '\u000E' && LA5_53 <= '\u001F')||(LA5_53 >= '!' && LA5_53 <= '/')||(LA5_53 >= ':' && LA5_53 <= '@')||(LA5_53 >= '[' && LA5_53 <= '`')||(LA5_53 >= '{' && LA5_53 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 54 : 
                        int LA5_18 = input.LA(1);

                        s = -1;
                        if ( (LA5_18=='\t'||LA5_18=='\f') ) {s = 43;}

                        else if ( ((LA5_18 >= '\u0000' && LA5_18 <= '\b')||LA5_18=='\u000B'||(LA5_18 >= '\u000E' && LA5_18 <= '\u001F')||(LA5_18 >= '!' && LA5_18 <= '\uFFFF')) ) {s = 22;}

                        else if ( (LA5_18=='\n'||LA5_18=='\r'||LA5_18==' ') ) {s = 20;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;

                    case 55 : 
                        int LA5_73 = input.LA(1);

                        s = -1;
                        if ( (LA5_73=='n') ) {s = 78;}

                        else if ( ((LA5_73 >= '0' && LA5_73 <= '9')||(LA5_73 >= 'A' && LA5_73 <= 'Z')||(LA5_73 >= 'a' && LA5_73 <= 'm')||(LA5_73 >= 'o' && LA5_73 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_73 >= '\u0000' && LA5_73 <= '\t')||(LA5_73 >= '\u000B' && LA5_73 <= '\f')||(LA5_73 >= '\u000E' && LA5_73 <= '\u001F')||(LA5_73 >= '!' && LA5_73 <= '/')||(LA5_73 >= ':' && LA5_73 <= '@')||(LA5_73 >= '[' && LA5_73 <= '`')||(LA5_73 >= '{' && LA5_73 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 56 : 
                        int LA5_12 = input.LA(1);

                        s = -1;
                        if ( (LA5_12=='p') ) {s = 37;}

                        else if ( ((LA5_12 >= '0' && LA5_12 <= '9')||(LA5_12 >= 'A' && LA5_12 <= 'Z')||(LA5_12 >= 'a' && LA5_12 <= 'o')||(LA5_12 >= 'q' && LA5_12 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_12 >= '\u0000' && LA5_12 <= '\t')||(LA5_12 >= '\u000B' && LA5_12 <= '\f')||(LA5_12 >= '\u000E' && LA5_12 <= '\u001F')||(LA5_12 >= '!' && LA5_12 <= '/')||(LA5_12 >= ':' && LA5_12 <= '@')||(LA5_12 >= '[' && LA5_12 <= '`')||(LA5_12 >= '{' && LA5_12 <= '\uFFFF')) ) {s = 22;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;

                    case 57 : 
                        int LA5_67 = input.LA(1);

                        s = -1;
                        if ( (LA5_67=='e') ) {s = 73;}

                        else if ( ((LA5_67 >= '0' && LA5_67 <= '9')||(LA5_67 >= 'A' && LA5_67 <= 'Z')||(LA5_67 >= 'a' && LA5_67 <= 'd')||(LA5_67 >= 'f' && LA5_67 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_67 >= '\u0000' && LA5_67 <= '\t')||(LA5_67 >= '\u000B' && LA5_67 <= '\f')||(LA5_67 >= '\u000E' && LA5_67 <= '\u001F')||(LA5_67 >= '!' && LA5_67 <= '/')||(LA5_67 >= ':' && LA5_67 <= '@')||(LA5_67 >= '[' && LA5_67 <= '`')||(LA5_67 >= '{' && LA5_67 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 58 : 
                        int LA5_78 = input.LA(1);

                        s = -1;
                        if ( (LA5_78=='t') ) {s = 82;}

                        else if ( ((LA5_78 >= '0' && LA5_78 <= '9')||(LA5_78 >= 'A' && LA5_78 <= 'Z')||(LA5_78 >= 'a' && LA5_78 <= 's')||(LA5_78 >= 'u' && LA5_78 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_78 >= '\u0000' && LA5_78 <= '\t')||(LA5_78 >= '\u000B' && LA5_78 <= '\f')||(LA5_78 >= '\u000E' && LA5_78 <= '\u001F')||(LA5_78 >= '!' && LA5_78 <= '/')||(LA5_78 >= ':' && LA5_78 <= '@')||(LA5_78 >= '[' && LA5_78 <= '`')||(LA5_78 >= '{' && LA5_78 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 59 : 
                        int LA5_54 = input.LA(1);

                        s = -1;
                        if ( (LA5_54=='r') ) {s = 62;}

                        else if ( ((LA5_54 >= '0' && LA5_54 <= '9')||(LA5_54 >= 'A' && LA5_54 <= 'Z')||(LA5_54 >= 'a' && LA5_54 <= 'q')||(LA5_54 >= 's' && LA5_54 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_54 >= '\u0000' && LA5_54 <= '\t')||(LA5_54 >= '\u000B' && LA5_54 <= '\f')||(LA5_54 >= '\u000E' && LA5_54 <= '\u001F')||(LA5_54 >= '!' && LA5_54 <= '/')||(LA5_54 >= ':' && LA5_54 <= '@')||(LA5_54 >= '[' && LA5_54 <= '`')||(LA5_54 >= '{' && LA5_54 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 60 : 
                        int LA5_39 = input.LA(1);

                        s = -1;
                        if ( (LA5_39=='e') ) {s = 54;}

                        else if ( ((LA5_39 >= '0' && LA5_39 <= '9')||(LA5_39 >= 'A' && LA5_39 <= 'Z')||(LA5_39 >= 'a' && LA5_39 <= 'd')||(LA5_39 >= 'f' && LA5_39 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_39 >= '\u0000' && LA5_39 <= '\t')||(LA5_39 >= '\u000B' && LA5_39 <= '\f')||(LA5_39 >= '\u000E' && LA5_39 <= '\u001F')||(LA5_39 >= '!' && LA5_39 <= '/')||(LA5_39 >= ':' && LA5_39 <= '@')||(LA5_39 >= '[' && LA5_39 <= '`')||(LA5_39 >= '{' && LA5_39 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 61 : 
                        int LA5_72 = input.LA(1);

                        s = -1;
                        if ( (LA5_72=='_') ) {s = 77;}

                        else if ( ((LA5_72 >= '0' && LA5_72 <= '9')||(LA5_72 >= 'A' && LA5_72 <= 'Z')||(LA5_72 >= 'a' && LA5_72 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_72 >= '\u0000' && LA5_72 <= '\t')||(LA5_72 >= '\u000B' && LA5_72 <= '\f')||(LA5_72 >= '\u000E' && LA5_72 <= '\u001F')||(LA5_72 >= '!' && LA5_72 <= '/')||(LA5_72 >= ':' && LA5_72 <= '@')||(LA5_72 >= '[' && LA5_72 <= '^')||LA5_72=='`'||(LA5_72 >= '{' && LA5_72 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 62 : 
                        int LA5_5 = input.LA(1);

                        s = -1;
                        if ( (LA5_5=='>') ) {s = 26;}

                        else if ( ((LA5_5 >= '\u0000' && LA5_5 <= '\t')||(LA5_5 >= '\u000B' && LA5_5 <= '\f')||(LA5_5 >= '\u000E' && LA5_5 <= '\u001F')||(LA5_5 >= '!' && LA5_5 <= '=')||(LA5_5 >= '?' && LA5_5 <= '\uFFFF')) ) {s = 22;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;

                    case 63 : 
                        int LA5_35 = input.LA(1);

                        s = -1;
                        if ( (LA5_35=='r') ) {s = 50;}

                        else if ( ((LA5_35 >= '0' && LA5_35 <= '9')||(LA5_35 >= 'A' && LA5_35 <= 'Z')||(LA5_35 >= 'a' && LA5_35 <= 'q')||(LA5_35 >= 's' && LA5_35 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_35 >= '\u0000' && LA5_35 <= '\t')||(LA5_35 >= '\u000B' && LA5_35 <= '\f')||(LA5_35 >= '\u000E' && LA5_35 <= '\u001F')||(LA5_35 >= '!' && LA5_35 <= '/')||(LA5_35 >= ':' && LA5_35 <= '@')||(LA5_35 >= '[' && LA5_35 <= '`')||(LA5_35 >= '{' && LA5_35 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 64 : 
                        int LA5_50 = input.LA(1);

                        s = -1;
                        if ( (LA5_50=='t') ) {s = 59;}

                        else if ( ((LA5_50 >= '0' && LA5_50 <= '9')||(LA5_50 >= 'A' && LA5_50 <= 'Z')||(LA5_50 >= 'a' && LA5_50 <= 's')||(LA5_50 >= 'u' && LA5_50 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_50 >= '\u0000' && LA5_50 <= '\t')||(LA5_50 >= '\u000B' && LA5_50 <= '\f')||(LA5_50 >= '\u000E' && LA5_50 <= '\u001F')||(LA5_50 >= '!' && LA5_50 <= '/')||(LA5_50 >= ':' && LA5_50 <= '@')||(LA5_50 >= '[' && LA5_50 <= '`')||(LA5_50 >= '{' && LA5_50 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 65 : 
                        int LA5_10 = input.LA(1);

                        s = -1;
                        if ( (LA5_10=='o') ) {s = 34;}

                        else if ( ((LA5_10 >= '0' && LA5_10 <= '9')||(LA5_10 >= 'A' && LA5_10 <= 'Z')||(LA5_10 >= 'a' && LA5_10 <= 'n')||(LA5_10 >= 'p' && LA5_10 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_10 >= '\u0000' && LA5_10 <= '\t')||(LA5_10 >= '\u000B' && LA5_10 <= '\f')||(LA5_10 >= '\u000E' && LA5_10 <= '\u001F')||(LA5_10 >= '!' && LA5_10 <= '/')||(LA5_10 >= ':' && LA5_10 <= '@')||(LA5_10 >= '[' && LA5_10 <= '`')||(LA5_10 >= '{' && LA5_10 <= '\uFFFF')) ) {s = 22;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;

                    case 66 : 
                        int LA5_9 = input.LA(1);

                        s = -1;
                        if ( (LA5_9=='R') ) {s = 33;}

                        else if ( ((LA5_9 >= '0' && LA5_9 <= '9')||(LA5_9 >= 'A' && LA5_9 <= 'Q')||(LA5_9 >= 'S' && LA5_9 <= 'Z')||(LA5_9 >= 'a' && LA5_9 <= 'z')) ) {s = 31;}

                        else if ( ((LA5_9 >= '\u0000' && LA5_9 <= '\t')||(LA5_9 >= '\u000B' && LA5_9 <= '\f')||(LA5_9 >= '\u000E' && LA5_9 <= '\u001F')||(LA5_9 >= '!' && LA5_9 <= '/')||(LA5_9 >= ':' && LA5_9 <= '@')||(LA5_9 >= '[' && LA5_9 <= '`')||(LA5_9 >= '{' && LA5_9 <= '\uFFFF')) ) {s = 22;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}