// $ANTLR 3.4 C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g 2012-04-18 08:07:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QuiltDispatchBasicLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int ALPHA=4;
    public static final int DIGIT=5;
    public static final int ID=6;
    public static final int KW=7;

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
    public String getGrammarFileName() { return "C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:2:6: ( '!' )
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:2:8: '!'
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:3:6: ( '(' )
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:3:8: '('
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:4:7: ( ')' )
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:4:9: ')'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:5:7: ( ',' )
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:5:9: ','
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:6:7: ( '=' )
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:6:9: '='
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:7:7: ( '=>' )
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:7:9: '=>'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:8:7: ( '`' )
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:8:9: '`'
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
    // $ANTLR end "T__14"

    // $ANTLR start "KW"
    public final void mKW() throws RecognitionException {
        try {
            int _type = KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:20:5: ( 'authority' | 'scheme' | 'URI' | 'domain_name' | 'port' | 'ip' | 'path' | 'fragment' | 'query_string' 'header' | 'method' )
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
                    // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:20:8: 'authority'
                    {
                    match("authority"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:20:22: 'scheme'
                    {
                    match("scheme"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:20:33: 'URI'
                    {
                    match("URI"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:20:41: 'domain_name'
                    {
                    match("domain_name"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:20:57: 'port'
                    {
                    match("port"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:20:66: 'ip'
                    {
                    match("ip"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:20:73: 'path'
                    {
                    match("path"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:20:82: 'fragment'
                    {
                    match("fragment"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:20:95: 'query_string' 'header'
                    {
                    match("query_string"); 



                    match("header"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:21:29: 'method'
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
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:23:8: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) )
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:25:8: ( '0' .. '9' )
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:27:5: (~ ( ' ' | '\\n' | '\\r' ) )
            // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:
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
    // $ANTLR end "ID"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | KW | ALPHA | DIGIT | ID )
        int alt2=11;
        int LA2_0 = input.LA(1);

        if ( (LA2_0=='!') ) {
            alt2=1;
        }
        else if ( (LA2_0=='(') ) {
            alt2=2;
        }
        else if ( (LA2_0==')') ) {
            alt2=3;
        }
        else if ( (LA2_0==',') ) {
            alt2=4;
        }
        else if ( (LA2_0=='=') ) {
            int LA2_5 = input.LA(2);

            if ( (LA2_5=='>') ) {
                alt2=6;
            }
            else {
                alt2=5;
            }
        }
        else if ( (LA2_0=='`') ) {
            alt2=7;
        }
        else if ( (LA2_0=='a') ) {
            int LA2_7 = input.LA(2);

            if ( (LA2_7=='u') ) {
                alt2=8;
            }
            else {
                alt2=9;
            }
        }
        else if ( (LA2_0=='s') ) {
            int LA2_8 = input.LA(2);

            if ( (LA2_8=='c') ) {
                alt2=8;
            }
            else {
                alt2=9;
            }
        }
        else if ( (LA2_0=='U') ) {
            int LA2_9 = input.LA(2);

            if ( (LA2_9=='R') ) {
                alt2=8;
            }
            else {
                alt2=9;
            }
        }
        else if ( (LA2_0=='d') ) {
            int LA2_10 = input.LA(2);

            if ( (LA2_10=='o') ) {
                alt2=8;
            }
            else {
                alt2=9;
            }
        }
        else if ( (LA2_0=='p') ) {
            int LA2_11 = input.LA(2);

            if ( (LA2_11=='a'||LA2_11=='o') ) {
                alt2=8;
            }
            else {
                alt2=9;
            }
        }
        else if ( (LA2_0=='i') ) {
            int LA2_12 = input.LA(2);

            if ( (LA2_12=='p') ) {
                alt2=8;
            }
            else {
                alt2=9;
            }
        }
        else if ( (LA2_0=='f') ) {
            int LA2_13 = input.LA(2);

            if ( (LA2_13=='r') ) {
                alt2=8;
            }
            else {
                alt2=9;
            }
        }
        else if ( (LA2_0=='q') ) {
            int LA2_14 = input.LA(2);

            if ( (LA2_14=='u') ) {
                alt2=8;
            }
            else {
                alt2=9;
            }
        }
        else if ( (LA2_0=='m') ) {
            int LA2_15 = input.LA(2);

            if ( (LA2_15=='e') ) {
                alt2=8;
            }
            else {
                alt2=9;
            }
        }
        else if ( ((LA2_0 >= 'A' && LA2_0 <= 'T')||(LA2_0 >= 'V' && LA2_0 <= 'Z')||(LA2_0 >= 'b' && LA2_0 <= 'c')||LA2_0=='e'||(LA2_0 >= 'g' && LA2_0 <= 'h')||(LA2_0 >= 'j' && LA2_0 <= 'l')||(LA2_0 >= 'n' && LA2_0 <= 'o')||LA2_0=='r'||(LA2_0 >= 't' && LA2_0 <= 'z')) ) {
            alt2=9;
        }
        else if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
            alt2=10;
        }
        else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\u001F')||(LA2_0 >= '\"' && LA2_0 <= '\'')||(LA2_0 >= '*' && LA2_0 <= '+')||(LA2_0 >= '-' && LA2_0 <= '/')||(LA2_0 >= ':' && LA2_0 <= '<')||(LA2_0 >= '>' && LA2_0 <= '@')||(LA2_0 >= '[' && LA2_0 <= '_')||(LA2_0 >= '{' && LA2_0 <= '\uFFFF')) ) {
            alt2=11;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }
        switch (alt2) {
            case 1 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:44: T__14
                {
                mT__14(); 


                }
                break;
            case 8 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:50: KW
                {
                mKW(); 


                }
                break;
            case 9 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:53: ALPHA
                {
                mALPHA(); 


                }
                break;
            case 10 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:59: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 11 :
                // C:\\Users\\Chuck\\git\\quilt\\QuiltDispatchBasic.g:1:65: ID
                {
                mID(); 


                }
                break;

        }

    }


 

}