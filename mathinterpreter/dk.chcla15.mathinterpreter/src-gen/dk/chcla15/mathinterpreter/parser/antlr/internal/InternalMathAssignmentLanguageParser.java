package dk.chcla15.mathinterpreter.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.chcla15.mathinterpreter.services.MathAssignmentLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathAssignmentLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMathAssignmentLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathAssignmentLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathAssignmentLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathAssignmentLanguage.g"; }



     	private MathAssignmentLanguageGrammarAccess grammarAccess;

        public InternalMathAssignmentLanguageParser(TokenStream input, MathAssignmentLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathAssignmentLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMathAssignmentLanguage.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathAssignmentLanguage.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathAssignmentLanguage.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathAssignmentLanguage.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:77:2: ( (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalMathAssignmentLanguage.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalMathAssignmentLanguage.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            // InternalMathAssignmentLanguage.g:79:3: otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getIsKeyword_1());
            		
            // InternalMathAssignmentLanguage.g:87:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMathAssignmentLanguage.g:88:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMathAssignmentLanguage.g:88:4: (lv_exp_2_0= ruleExp )
            // InternalMathAssignmentLanguage.g:89:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.chcla15.mathinterpreter.MathAssignmentLanguage.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMathAssignmentLanguage.g:110:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathAssignmentLanguage.g:110:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathAssignmentLanguage.g:111:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathAssignmentLanguage.g:117:1: ruleExp returns [EObject current=null] : this_PlusMinusExp_0= rulePlusMinusExp ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_PlusMinusExp_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:123:2: (this_PlusMinusExp_0= rulePlusMinusExp )
            // InternalMathAssignmentLanguage.g:124:2: this_PlusMinusExp_0= rulePlusMinusExp
            {

            		newCompositeNode(grammarAccess.getExpAccess().getPlusMinusExpParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PlusMinusExp_0=rulePlusMinusExp();

            state._fsp--;


            		current = this_PlusMinusExp_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePlusMinusExp"
    // InternalMathAssignmentLanguage.g:135:1: entryRulePlusMinusExp returns [EObject current=null] : iv_rulePlusMinusExp= rulePlusMinusExp EOF ;
    public final EObject entryRulePlusMinusExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusExp = null;


        try {
            // InternalMathAssignmentLanguage.g:135:53: (iv_rulePlusMinusExp= rulePlusMinusExp EOF )
            // InternalMathAssignmentLanguage.g:136:2: iv_rulePlusMinusExp= rulePlusMinusExp EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusExpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinusExp=rulePlusMinusExp();

            state._fsp--;

             current =iv_rulePlusMinusExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusMinusExp"


    // $ANTLR start "rulePlusMinusExp"
    // InternalMathAssignmentLanguage.g:142:1: rulePlusMinusExp returns [EObject current=null] : (this_MulOrDivExp_0= ruleMulOrDivExp ( () ( (lv_operator_2_0= rulePlusMinusOp ) ) ( (lv_right_3_0= ruleMulOrDivExp ) ) )* ) ;
    public final EObject rulePlusMinusExp() throws RecognitionException {
        EObject current = null;

        EObject this_MulOrDivExp_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:148:2: ( (this_MulOrDivExp_0= ruleMulOrDivExp ( () ( (lv_operator_2_0= rulePlusMinusOp ) ) ( (lv_right_3_0= ruleMulOrDivExp ) ) )* ) )
            // InternalMathAssignmentLanguage.g:149:2: (this_MulOrDivExp_0= ruleMulOrDivExp ( () ( (lv_operator_2_0= rulePlusMinusOp ) ) ( (lv_right_3_0= ruleMulOrDivExp ) ) )* )
            {
            // InternalMathAssignmentLanguage.g:149:2: (this_MulOrDivExp_0= ruleMulOrDivExp ( () ( (lv_operator_2_0= rulePlusMinusOp ) ) ( (lv_right_3_0= ruleMulOrDivExp ) ) )* )
            // InternalMathAssignmentLanguage.g:150:3: this_MulOrDivExp_0= ruleMulOrDivExp ( () ( (lv_operator_2_0= rulePlusMinusOp ) ) ( (lv_right_3_0= ruleMulOrDivExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusExpAccess().getMulOrDivExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_MulOrDivExp_0=ruleMulOrDivExp();

            state._fsp--;


            			current = this_MulOrDivExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathAssignmentLanguage.g:158:3: ( () ( (lv_operator_2_0= rulePlusMinusOp ) ) ( (lv_right_3_0= ruleMulOrDivExp ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:159:4: () ( (lv_operator_2_0= rulePlusMinusOp ) ) ( (lv_right_3_0= ruleMulOrDivExp ) )
            	    {
            	    // InternalMathAssignmentLanguage.g:159:4: ()
            	    // InternalMathAssignmentLanguage.g:160:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusMinusExpAccess().getExpLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMathAssignmentLanguage.g:166:4: ( (lv_operator_2_0= rulePlusMinusOp ) )
            	    // InternalMathAssignmentLanguage.g:167:5: (lv_operator_2_0= rulePlusMinusOp )
            	    {
            	    // InternalMathAssignmentLanguage.g:167:5: (lv_operator_2_0= rulePlusMinusOp )
            	    // InternalMathAssignmentLanguage.g:168:6: lv_operator_2_0= rulePlusMinusOp
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusExpAccess().getOperatorPlusMinusOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=rulePlusMinusOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.chcla15.mathinterpreter.MathAssignmentLanguage.PlusMinusOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMathAssignmentLanguage.g:185:4: ( (lv_right_3_0= ruleMulOrDivExp ) )
            	    // InternalMathAssignmentLanguage.g:186:5: (lv_right_3_0= ruleMulOrDivExp )
            	    {
            	    // InternalMathAssignmentLanguage.g:186:5: (lv_right_3_0= ruleMulOrDivExp )
            	    // InternalMathAssignmentLanguage.g:187:6: lv_right_3_0= ruleMulOrDivExp
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusExpAccess().getRightMulOrDivExpParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_right_3_0=ruleMulOrDivExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.chcla15.mathinterpreter.MathAssignmentLanguage.MulOrDivExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusMinusExp"


    // $ANTLR start "entryRuleMulOrDivExp"
    // InternalMathAssignmentLanguage.g:209:1: entryRuleMulOrDivExp returns [EObject current=null] : iv_ruleMulOrDivExp= ruleMulOrDivExp EOF ;
    public final EObject entryRuleMulOrDivExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDivExp = null;


        try {
            // InternalMathAssignmentLanguage.g:209:52: (iv_ruleMulOrDivExp= ruleMulOrDivExp EOF )
            // InternalMathAssignmentLanguage.g:210:2: iv_ruleMulOrDivExp= ruleMulOrDivExp EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDivExp=ruleMulOrDivExp();

            state._fsp--;

             current =iv_ruleMulOrDivExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDivExp"


    // $ANTLR start "ruleMulOrDivExp"
    // InternalMathAssignmentLanguage.g:216:1: ruleMulOrDivExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleMultDivOp ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDivExp() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:222:2: ( (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleMultDivOp ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMathAssignmentLanguage.g:223:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleMultDivOp ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMathAssignmentLanguage.g:223:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleMultDivOp ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMathAssignmentLanguage.g:224:3: this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleMultDivOp ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivExpAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathAssignmentLanguage.g:232:3: ( () ( (lv_operator_2_0= ruleMultDivOp ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:233:4: () ( (lv_operator_2_0= ruleMultDivOp ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMathAssignmentLanguage.g:233:4: ()
            	    // InternalMathAssignmentLanguage.g:234:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivExpAccess().getExpLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMathAssignmentLanguage.g:240:4: ( (lv_operator_2_0= ruleMultDivOp ) )
            	    // InternalMathAssignmentLanguage.g:241:5: (lv_operator_2_0= ruleMultDivOp )
            	    {
            	    // InternalMathAssignmentLanguage.g:241:5: (lv_operator_2_0= ruleMultDivOp )
            	    // InternalMathAssignmentLanguage.g:242:6: lv_operator_2_0= ruleMultDivOp
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivExpAccess().getOperatorMultDivOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleMultDivOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.chcla15.mathinterpreter.MathAssignmentLanguage.MultDivOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMathAssignmentLanguage.g:259:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMathAssignmentLanguage.g:260:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMathAssignmentLanguage.g:260:5: (lv_right_3_0= rulePrimary )
            	    // InternalMathAssignmentLanguage.g:261:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivExpAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.chcla15.mathinterpreter.MathAssignmentLanguage.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDivExp"


    // $ANTLR start "entryRuleMultDivOp"
    // InternalMathAssignmentLanguage.g:283:1: entryRuleMultDivOp returns [EObject current=null] : iv_ruleMultDivOp= ruleMultDivOp EOF ;
    public final EObject entryRuleMultDivOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDivOp = null;


        try {
            // InternalMathAssignmentLanguage.g:283:50: (iv_ruleMultDivOp= ruleMultDivOp EOF )
            // InternalMathAssignmentLanguage.g:284:2: iv_ruleMultDivOp= ruleMultDivOp EOF
            {
             newCompositeNode(grammarAccess.getMultDivOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultDivOp=ruleMultDivOp();

            state._fsp--;

             current =iv_ruleMultDivOp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultDivOp"


    // $ANTLR start "ruleMultDivOp"
    // InternalMathAssignmentLanguage.g:290:1: ruleMultDivOp returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) ;
    public final EObject ruleMultDivOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:296:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) )
            // InternalMathAssignmentLanguage.g:297:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            {
            // InternalMathAssignmentLanguage.g:297:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:298:3: ( () otherlv_1= '*' )
                    {
                    // InternalMathAssignmentLanguage.g:298:3: ( () otherlv_1= '*' )
                    // InternalMathAssignmentLanguage.g:299:4: () otherlv_1= '*'
                    {
                    // InternalMathAssignmentLanguage.g:299:4: ()
                    // InternalMathAssignmentLanguage.g:300:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMultDivOpAccess().getMultAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getMultDivOpAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:312:3: ( () otherlv_3= '/' )
                    {
                    // InternalMathAssignmentLanguage.g:312:3: ( () otherlv_3= '/' )
                    // InternalMathAssignmentLanguage.g:313:4: () otherlv_3= '/'
                    {
                    // InternalMathAssignmentLanguage.g:313:4: ()
                    // InternalMathAssignmentLanguage.g:314:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMultDivOpAccess().getDivAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMultDivOpAccess().getSolidusKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultDivOp"


    // $ANTLR start "entryRulePlusMinusOp"
    // InternalMathAssignmentLanguage.g:329:1: entryRulePlusMinusOp returns [EObject current=null] : iv_rulePlusMinusOp= rulePlusMinusOp EOF ;
    public final EObject entryRulePlusMinusOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusOp = null;


        try {
            // InternalMathAssignmentLanguage.g:329:52: (iv_rulePlusMinusOp= rulePlusMinusOp EOF )
            // InternalMathAssignmentLanguage.g:330:2: iv_rulePlusMinusOp= rulePlusMinusOp EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusOpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinusOp=rulePlusMinusOp();

            state._fsp--;

             current =iv_rulePlusMinusOp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusMinusOp"


    // $ANTLR start "rulePlusMinusOp"
    // InternalMathAssignmentLanguage.g:336:1: rulePlusMinusOp returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject rulePlusMinusOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:342:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalMathAssignmentLanguage.g:343:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalMathAssignmentLanguage.g:343:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:344:3: ( () otherlv_1= '+' )
                    {
                    // InternalMathAssignmentLanguage.g:344:3: ( () otherlv_1= '+' )
                    // InternalMathAssignmentLanguage.g:345:4: () otherlv_1= '+'
                    {
                    // InternalMathAssignmentLanguage.g:345:4: ()
                    // InternalMathAssignmentLanguage.g:346:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPlusMinusOpAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlusMinusOpAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:358:3: ( () otherlv_3= '-' )
                    {
                    // InternalMathAssignmentLanguage.g:358:3: ( () otherlv_3= '-' )
                    // InternalMathAssignmentLanguage.g:359:4: () otherlv_3= '-'
                    {
                    // InternalMathAssignmentLanguage.g:359:4: ()
                    // InternalMathAssignmentLanguage.g:360:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPlusMinusOpAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlusMinusOpAccess().getHyphenMinusKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusMinusOp"


    // $ANTLR start "entryRulePrimary"
    // InternalMathAssignmentLanguage.g:375:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathAssignmentLanguage.g:375:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathAssignmentLanguage.g:376:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathAssignmentLanguage.g:382:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:388:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) ) )
            // InternalMathAssignmentLanguage.g:389:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) )
            {
            // InternalMathAssignmentLanguage.g:389:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:390:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMathAssignmentLanguage.g:390:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMathAssignmentLanguage.g:391:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMathAssignmentLanguage.g:391:4: ()
                    // InternalMathAssignmentLanguage.g:392:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMathAssignmentLanguage.g:398:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMathAssignmentLanguage.g:399:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMathAssignmentLanguage.g:399:5: (lv_value_1_0= RULE_INT )
                    // InternalMathAssignmentLanguage.g:400:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:418:3: ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' )
                    {
                    // InternalMathAssignmentLanguage.g:418:3: ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' )
                    // InternalMathAssignmentLanguage.g:419:4: () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')'
                    {
                    // InternalMathAssignmentLanguage.g:419:4: ()
                    // InternalMathAssignmentLanguage.g:420:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParenthesisAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMathAssignmentLanguage.g:430:4: ( (lv_exp_4_0= ruleExp ) )
                    // InternalMathAssignmentLanguage.g:431:5: (lv_exp_4_0= ruleExp )
                    {
                    // InternalMathAssignmentLanguage.g:431:5: (lv_exp_4_0= ruleExp )
                    // InternalMathAssignmentLanguage.g:432:6: lv_exp_4_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_exp_4_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_4_0,
                    							"dk.chcla15.mathinterpreter.MathAssignmentLanguage.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});

}