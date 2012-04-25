// $ANTLR 3.4 C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g 2012-04-25 08:27:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QuiltDispatchBasicParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA", "CHAR", "DIGIT", "IDENT", "KW", "URI", "WHITESPACE", "'!'", "'('", "')'", "','", "'='", "'=>'", "'`'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public QuiltDispatchBasicParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public QuiltDispatchBasicParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return QuiltDispatchBasicParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g"; }



    // $ANTLR start "rulesheet"
    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:3:1: rulesheet : ( rule )* ;
    public final void rulesheet() throws RecognitionException {
        try {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:4:2: ( ( rule )* )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:4:4: ( rule )*
            {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:4:4: ( rule )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KW) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:4:4: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_rulesheet12);
            	    rule();

            	    state._fsp--;


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
    // $ANTLR end "rulesheet"



    // $ANTLR start "rule"
    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:6:1: rule : ( condition )+ assignment ;
    public final void rule() throws RecognitionException {
        try {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:6:7: ( ( condition )+ assignment )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:6:9: ( condition )+ assignment
            {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:6:9: ( condition )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KW) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:6:9: condition
            	    {
            	    pushFollow(FOLLOW_condition_in_rule22);
            	    condition();

            	    state._fsp--;


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


            pushFollow(FOLLOW_assignment_in_rule25);
            assignment();

            state._fsp--;


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
    // $ANTLR end "rule"



    // $ANTLR start "assignment"
    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:8:1: assignment : '=>' URI ( varlist )? ;
    public final void assignment() throws RecognitionException {
        try {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:9:2: ( '=>' URI ( varlist )? )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:9:4: '=>' URI ( varlist )?
            {
            match(input,16,FOLLOW_16_in_assignment35); 

            match(input,URI,FOLLOW_URI_in_assignment37); 

            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:9:13: ( varlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:9:13: varlist
                    {
                    pushFollow(FOLLOW_varlist_in_assignment39);
                    varlist();

                    state._fsp--;


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
    // $ANTLR end "assignment"



    // $ANTLR start "condition"
    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:11:1: condition : KW URI ( '=' | '!' ) pattern ;
    public final void condition() throws RecognitionException {
        try {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:12:2: ( KW URI ( '=' | '!' ) pattern )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:12:4: KW URI ( '=' | '!' ) pattern
            {
            match(input,KW,FOLLOW_KW_in_condition49); 

            match(input,URI,FOLLOW_URI_in_condition51); 

            if ( input.LA(1)==11||input.LA(1)==15 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_pattern_in_condition60);
            pattern();

            state._fsp--;


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
    // $ANTLR end "condition"



    // $ANTLR start "pattern"
    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:14:1: pattern : '`' ( CHAR )* '`' ;
    public final void pattern() throws RecognitionException {
        try {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:14:9: ( '`' ( CHAR )* '`' )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:14:11: '`' ( CHAR )* '`'
            {
            match(input,17,FOLLOW_17_in_pattern69); 

            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:14:14: ( CHAR )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CHAR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:14:14: CHAR
            	    {
            	    match(input,CHAR,FOLLOW_CHAR_in_pattern70); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_pattern72); 

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
    // $ANTLR end "pattern"



    // $ANTLR start "varlist"
    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:16:1: varlist : '(' ( var ',' )* var ')' ;
    public final void varlist() throws RecognitionException {
        try {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:17:2: ( '(' ( var ',' )* var ')' )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:17:4: '(' ( var ',' )* var ')'
            {
            match(input,12,FOLLOW_12_in_varlist83); 

            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:17:7: ( var ',' )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:17:8: var ','
            	    {
            	    pushFollow(FOLLOW_var_in_varlist85);
            	    var();

            	    state._fsp--;


            	    match(input,14,FOLLOW_14_in_varlist86); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            pushFollow(FOLLOW_var_in_varlist89);
            var();

            state._fsp--;


            match(input,13,FOLLOW_13_in_varlist90); 

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
    // $ANTLR end "varlist"



    // $ANTLR start "var"
    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:19:1: var : IDENT '=' ( ALPHA )* ;
    public final void var() throws RecognitionException {
        try {
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:19:5: ( IDENT '=' ( ALPHA )* )
            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:19:7: IDENT '=' ( ALPHA )*
            {
            match(input,IDENT,FOLLOW_IDENT_in_var98); 

            match(input,15,FOLLOW_15_in_var100); 

            // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:19:17: ( ALPHA )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ALPHA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Chuck\\git\\quilt\\dispatcher\\QuiltDispatchBasic.g:19:17: ALPHA
            	    {
            	    match(input,ALPHA,FOLLOW_ALPHA_in_var102); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "var"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\1\7\1\17\2\4\2\uffff";
    static final String DFA5_maxS =
        "\1\7\1\17\2\16\2\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\10\uffff\1\4\1\5",
            "\1\3\10\uffff\1\4\1\5",
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
            return "()* loopback of 17:7: ( var ',' )*";
        }
    }
 

    public static final BitSet FOLLOW_rule_in_rulesheet12 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_condition_in_rule22 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_assignment_in_rule25 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_assignment35 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_URI_in_assignment37 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_varlist_in_assignment39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_in_condition49 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_URI_in_condition51 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_set_in_condition53 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_pattern_in_condition60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_pattern69 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_CHAR_in_pattern70 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_pattern72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_varlist83 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_var_in_varlist85 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_varlist86 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_var_in_varlist89 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_varlist90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_var98 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_var100 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ALPHA_in_var102 = new BitSet(new long[]{0x0000000000000012L});

}