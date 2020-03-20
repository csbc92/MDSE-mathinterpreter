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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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
    // InternalMathAssignmentLanguage.g:117:1: ruleExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleExp ) ) )? ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:123:2: ( (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleExp ) ) )? ) )
            // InternalMathAssignmentLanguage.g:124:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleExp ) ) )? )
            {
            // InternalMathAssignmentLanguage.g:124:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleExp ) ) )? )
            // InternalMathAssignmentLanguage.g:125:3: this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleExp ) ) )?
            {

            			newCompositeNode(grammarAccess.getExpAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathAssignmentLanguage.g:133:3: ( () ( (lv_operator_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleExp ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=13 && LA1_0<=16)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:134:4: () ( (lv_operator_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleExp ) )
                    {
                    // InternalMathAssignmentLanguage.g:134:4: ()
                    // InternalMathAssignmentLanguage.g:135:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExpAccess().getExpLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMathAssignmentLanguage.g:141:4: ( (lv_operator_2_0= ruleExpOp ) )
                    // InternalMathAssignmentLanguage.g:142:5: (lv_operator_2_0= ruleExpOp )
                    {
                    // InternalMathAssignmentLanguage.g:142:5: (lv_operator_2_0= ruleExpOp )
                    // InternalMathAssignmentLanguage.g:143:6: lv_operator_2_0= ruleExpOp
                    {

                    						newCompositeNode(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_operator_2_0=ruleExpOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"dk.chcla15.mathinterpreter.MathAssignmentLanguage.ExpOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMathAssignmentLanguage.g:160:4: ( (lv_right_3_0= ruleExp ) )
                    // InternalMathAssignmentLanguage.g:161:5: (lv_right_3_0= ruleExp )
                    {
                    // InternalMathAssignmentLanguage.g:161:5: (lv_right_3_0= ruleExp )
                    // InternalMathAssignmentLanguage.g:162:6: lv_right_3_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"dk.chcla15.mathinterpreter.MathAssignmentLanguage.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleExpOp"
    // InternalMathAssignmentLanguage.g:184:1: entryRuleExpOp returns [EObject current=null] : iv_ruleExpOp= ruleExpOp EOF ;
    public final EObject entryRuleExpOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpOp = null;


        try {
            // InternalMathAssignmentLanguage.g:184:46: (iv_ruleExpOp= ruleExpOp EOF )
            // InternalMathAssignmentLanguage.g:185:2: iv_ruleExpOp= ruleExpOp EOF
            {
             newCompositeNode(grammarAccess.getExpOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpOp=ruleExpOp();

            state._fsp--;

             current =iv_ruleExpOp; 
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
    // $ANTLR end "entryRuleExpOp"


    // $ANTLR start "ruleExpOp"
    // InternalMathAssignmentLanguage.g:191:1: ruleExpOp returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) ) ;
    public final EObject ruleExpOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:197:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) ) )
            // InternalMathAssignmentLanguage.g:198:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) )
            {
            // InternalMathAssignmentLanguage.g:198:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:199:3: ( () otherlv_1= '+' )
                    {
                    // InternalMathAssignmentLanguage.g:199:3: ( () otherlv_1= '+' )
                    // InternalMathAssignmentLanguage.g:200:4: () otherlv_1= '+'
                    {
                    // InternalMathAssignmentLanguage.g:200:4: ()
                    // InternalMathAssignmentLanguage.g:201:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:213:3: ( () otherlv_3= '-' )
                    {
                    // InternalMathAssignmentLanguage.g:213:3: ( () otherlv_3= '-' )
                    // InternalMathAssignmentLanguage.g:214:4: () otherlv_3= '-'
                    {
                    // InternalMathAssignmentLanguage.g:214:4: ()
                    // InternalMathAssignmentLanguage.g:215:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMathAssignmentLanguage.g:227:3: ( () otherlv_5= '*' )
                    {
                    // InternalMathAssignmentLanguage.g:227:3: ( () otherlv_5= '*' )
                    // InternalMathAssignmentLanguage.g:228:4: () otherlv_5= '*'
                    {
                    // InternalMathAssignmentLanguage.g:228:4: ()
                    // InternalMathAssignmentLanguage.g:229:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getMultAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMathAssignmentLanguage.g:241:3: ( () otherlv_7= '/' )
                    {
                    // InternalMathAssignmentLanguage.g:241:3: ( () otherlv_7= '/' )
                    // InternalMathAssignmentLanguage.g:242:4: () otherlv_7= '/'
                    {
                    // InternalMathAssignmentLanguage.g:242:4: ()
                    // InternalMathAssignmentLanguage.g:243:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getDivAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getExpOpAccess().getSolidusKeyword_3_1());
                    			

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
    // $ANTLR end "ruleExpOp"


    // $ANTLR start "entryRulePrimary"
    // InternalMathAssignmentLanguage.g:258:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathAssignmentLanguage.g:258:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathAssignmentLanguage.g:259:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMathAssignmentLanguage.g:265:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:271:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) ) )
            // InternalMathAssignmentLanguage.g:272:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) )
            {
            // InternalMathAssignmentLanguage.g:272:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:273:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMathAssignmentLanguage.g:273:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMathAssignmentLanguage.g:274:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMathAssignmentLanguage.g:274:4: ()
                    // InternalMathAssignmentLanguage.g:275:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMathAssignmentLanguage.g:281:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMathAssignmentLanguage.g:282:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMathAssignmentLanguage.g:282:5: (lv_value_1_0= RULE_INT )
                    // InternalMathAssignmentLanguage.g:283:6: lv_value_1_0= RULE_INT
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
                    // InternalMathAssignmentLanguage.g:301:3: ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' )
                    {
                    // InternalMathAssignmentLanguage.g:301:3: ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' )
                    // InternalMathAssignmentLanguage.g:302:4: () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')'
                    {
                    // InternalMathAssignmentLanguage.g:302:4: ()
                    // InternalMathAssignmentLanguage.g:303:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParenthesisAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMathAssignmentLanguage.g:313:4: ( (lv_exp_4_0= ruleExp ) )
                    // InternalMathAssignmentLanguage.g:314:5: (lv_exp_4_0= ruleExp )
                    {
                    // InternalMathAssignmentLanguage.g:314:5: (lv_exp_4_0= ruleExp )
                    // InternalMathAssignmentLanguage.g:315:6: lv_exp_4_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_6);
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});

}