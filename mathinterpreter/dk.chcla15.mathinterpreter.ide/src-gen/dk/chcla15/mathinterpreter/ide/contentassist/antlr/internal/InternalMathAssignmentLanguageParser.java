package dk.chcla15.mathinterpreter.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.chcla15.mathinterpreter.services.MathAssignmentLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathAssignmentLanguageParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MathAssignmentLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMathExp"
    // InternalMathAssignmentLanguage.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:54:1: ( ruleMathExp EOF )
            // InternalMathAssignmentLanguage.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathAssignmentLanguage.g:62:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:66:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:67:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:67:2: ( ( rule__MathExp__Group__0 ) )
            // InternalMathAssignmentLanguage.g:68:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:69:3: ( rule__MathExp__Group__0 )
            // InternalMathAssignmentLanguage.g:69:4: rule__MathExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMathAssignmentLanguage.g:78:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:79:1: ( ruleExp EOF )
            // InternalMathAssignmentLanguage.g:80:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathAssignmentLanguage.g:87:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:91:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:92:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:92:2: ( ( rule__Exp__Group__0 ) )
            // InternalMathAssignmentLanguage.g:93:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:94:3: ( rule__Exp__Group__0 )
            // InternalMathAssignmentLanguage.g:94:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleExpOp"
    // InternalMathAssignmentLanguage.g:103:1: entryRuleExpOp : ruleExpOp EOF ;
    public final void entryRuleExpOp() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:104:1: ( ruleExpOp EOF )
            // InternalMathAssignmentLanguage.g:105:1: ruleExpOp EOF
            {
             before(grammarAccess.getExpOpRule()); 
            pushFollow(FOLLOW_1);
            ruleExpOp();

            state._fsp--;

             after(grammarAccess.getExpOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpOp"


    // $ANTLR start "ruleExpOp"
    // InternalMathAssignmentLanguage.g:112:1: ruleExpOp : ( ( rule__ExpOp__Alternatives ) ) ;
    public final void ruleExpOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:116:2: ( ( ( rule__ExpOp__Alternatives ) ) )
            // InternalMathAssignmentLanguage.g:117:2: ( ( rule__ExpOp__Alternatives ) )
            {
            // InternalMathAssignmentLanguage.g:117:2: ( ( rule__ExpOp__Alternatives ) )
            // InternalMathAssignmentLanguage.g:118:3: ( rule__ExpOp__Alternatives )
            {
             before(grammarAccess.getExpOpAccess().getAlternatives()); 
            // InternalMathAssignmentLanguage.g:119:3: ( rule__ExpOp__Alternatives )
            // InternalMathAssignmentLanguage.g:119:4: rule__ExpOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpOp"


    // $ANTLR start "entryRulePrimary"
    // InternalMathAssignmentLanguage.g:128:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:129:1: ( rulePrimary EOF )
            // InternalMathAssignmentLanguage.g:130:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathAssignmentLanguage.g:137:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:141:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMathAssignmentLanguage.g:142:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMathAssignmentLanguage.g:142:2: ( ( rule__Primary__Alternatives ) )
            // InternalMathAssignmentLanguage.g:143:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMathAssignmentLanguage.g:144:3: ( rule__Primary__Alternatives )
            // InternalMathAssignmentLanguage.g:144:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMathAssignmentLanguage.g:153:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:154:1: ( ruleParenthesis EOF )
            // InternalMathAssignmentLanguage.g:155:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMathAssignmentLanguage.g:162:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:166:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:167:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:167:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalMathAssignmentLanguage.g:168:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:169:3: ( rule__Parenthesis__Group__0 )
            // InternalMathAssignmentLanguage.g:169:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMathAssignmentLanguage.g:178:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:179:1: ( ruleNumber EOF )
            // InternalMathAssignmentLanguage.g:180:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathAssignmentLanguage.g:187:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:191:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalMathAssignmentLanguage.g:192:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalMathAssignmentLanguage.g:192:2: ( ( rule__Number__ValueAssignment ) )
            // InternalMathAssignmentLanguage.g:193:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalMathAssignmentLanguage.g:194:3: ( rule__Number__ValueAssignment )
            // InternalMathAssignmentLanguage.g:194:4: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__ExpOp__Alternatives"
    // InternalMathAssignmentLanguage.g:202:1: rule__ExpOp__Alternatives : ( ( ( rule__ExpOp__Group_0__0 ) ) | ( ( rule__ExpOp__Group_1__0 ) ) | ( ( rule__ExpOp__Group_2__0 ) ) | ( ( rule__ExpOp__Group_3__0 ) ) );
    public final void rule__ExpOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:206:1: ( ( ( rule__ExpOp__Group_0__0 ) ) | ( ( rule__ExpOp__Group_1__0 ) ) | ( ( rule__ExpOp__Group_2__0 ) ) | ( ( rule__ExpOp__Group_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
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
                    // InternalMathAssignmentLanguage.g:207:2: ( ( rule__ExpOp__Group_0__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:207:2: ( ( rule__ExpOp__Group_0__0 ) )
                    // InternalMathAssignmentLanguage.g:208:3: ( rule__ExpOp__Group_0__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_0()); 
                    // InternalMathAssignmentLanguage.g:209:3: ( rule__ExpOp__Group_0__0 )
                    // InternalMathAssignmentLanguage.g:209:4: rule__ExpOp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:213:2: ( ( rule__ExpOp__Group_1__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:213:2: ( ( rule__ExpOp__Group_1__0 ) )
                    // InternalMathAssignmentLanguage.g:214:3: ( rule__ExpOp__Group_1__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_1()); 
                    // InternalMathAssignmentLanguage.g:215:3: ( rule__ExpOp__Group_1__0 )
                    // InternalMathAssignmentLanguage.g:215:4: rule__ExpOp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMathAssignmentLanguage.g:219:2: ( ( rule__ExpOp__Group_2__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:219:2: ( ( rule__ExpOp__Group_2__0 ) )
                    // InternalMathAssignmentLanguage.g:220:3: ( rule__ExpOp__Group_2__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_2()); 
                    // InternalMathAssignmentLanguage.g:221:3: ( rule__ExpOp__Group_2__0 )
                    // InternalMathAssignmentLanguage.g:221:4: rule__ExpOp__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMathAssignmentLanguage.g:225:2: ( ( rule__ExpOp__Group_3__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:225:2: ( ( rule__ExpOp__Group_3__0 ) )
                    // InternalMathAssignmentLanguage.g:226:3: ( rule__ExpOp__Group_3__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_3()); 
                    // InternalMathAssignmentLanguage.g:227:3: ( rule__ExpOp__Group_3__0 )
                    // InternalMathAssignmentLanguage.g:227:4: rule__ExpOp__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMathAssignmentLanguage.g:235:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParenthesis ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:239:1: ( ( ruleNumber ) | ( ruleParenthesis ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:240:2: ( ruleNumber )
                    {
                    // InternalMathAssignmentLanguage.g:240:2: ( ruleNumber )
                    // InternalMathAssignmentLanguage.g:241:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:246:2: ( ruleParenthesis )
                    {
                    // InternalMathAssignmentLanguage.g:246:2: ( ruleParenthesis )
                    // InternalMathAssignmentLanguage.g:247:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalMathAssignmentLanguage.g:256:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:260:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalMathAssignmentLanguage.g:261:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MathExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0"


    // $ANTLR start "rule__MathExp__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:268:1: rule__MathExp__Group__0__Impl : ( 'result' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:272:1: ( ( 'result' ) )
            // InternalMathAssignmentLanguage.g:273:1: ( 'result' )
            {
            // InternalMathAssignmentLanguage.g:273:1: ( 'result' )
            // InternalMathAssignmentLanguage.g:274:2: 'result'
            {
             before(grammarAccess.getMathExpAccess().getResultKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getResultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0__Impl"


    // $ANTLR start "rule__MathExp__Group__1"
    // InternalMathAssignmentLanguage.g:283:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:287:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalMathAssignmentLanguage.g:288:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MathExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1"


    // $ANTLR start "rule__MathExp__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:295:1: rule__MathExp__Group__1__Impl : ( 'is' ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:299:1: ( ( 'is' ) )
            // InternalMathAssignmentLanguage.g:300:1: ( 'is' )
            {
            // InternalMathAssignmentLanguage.g:300:1: ( 'is' )
            // InternalMathAssignmentLanguage.g:301:2: 'is'
            {
             before(grammarAccess.getMathExpAccess().getIsKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1__Impl"


    // $ANTLR start "rule__MathExp__Group__2"
    // InternalMathAssignmentLanguage.g:310:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:314:1: ( rule__MathExp__Group__2__Impl )
            // InternalMathAssignmentLanguage.g:315:2: rule__MathExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2"


    // $ANTLR start "rule__MathExp__Group__2__Impl"
    // InternalMathAssignmentLanguage.g:321:1: rule__MathExp__Group__2__Impl : ( ( rule__MathExp__ExpAssignment_2 ) ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:325:1: ( ( ( rule__MathExp__ExpAssignment_2 ) ) )
            // InternalMathAssignmentLanguage.g:326:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            {
            // InternalMathAssignmentLanguage.g:326:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            // InternalMathAssignmentLanguage.g:327:2: ( rule__MathExp__ExpAssignment_2 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_2()); 
            // InternalMathAssignmentLanguage.g:328:2: ( rule__MathExp__ExpAssignment_2 )
            // InternalMathAssignmentLanguage.g:328:3: rule__MathExp__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalMathAssignmentLanguage.g:337:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:341:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalMathAssignmentLanguage.g:342:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:349:1: rule__Exp__Group__0__Impl : ( ( rule__Exp__LeftAssignment_0 ) ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:353:1: ( ( ( rule__Exp__LeftAssignment_0 ) ) )
            // InternalMathAssignmentLanguage.g:354:1: ( ( rule__Exp__LeftAssignment_0 ) )
            {
            // InternalMathAssignmentLanguage.g:354:1: ( ( rule__Exp__LeftAssignment_0 ) )
            // InternalMathAssignmentLanguage.g:355:2: ( rule__Exp__LeftAssignment_0 )
            {
             before(grammarAccess.getExpAccess().getLeftAssignment_0()); 
            // InternalMathAssignmentLanguage.g:356:2: ( rule__Exp__LeftAssignment_0 )
            // InternalMathAssignmentLanguage.g:356:3: rule__Exp__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalMathAssignmentLanguage.g:364:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:368:1: ( rule__Exp__Group__1__Impl )
            // InternalMathAssignmentLanguage.g:369:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:375:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )? ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:379:1: ( ( ( rule__Exp__Group_1__0 )? ) )
            // InternalMathAssignmentLanguage.g:380:1: ( ( rule__Exp__Group_1__0 )? )
            {
            // InternalMathAssignmentLanguage.g:380:1: ( ( rule__Exp__Group_1__0 )? )
            // InternalMathAssignmentLanguage.g:381:2: ( rule__Exp__Group_1__0 )?
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalMathAssignmentLanguage.g:382:2: ( rule__Exp__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=16)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:382:3: rule__Exp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalMathAssignmentLanguage.g:391:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:395:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalMathAssignmentLanguage.g:396:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalMathAssignmentLanguage.g:403:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__OperatorAssignment_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:407:1: ( ( ( rule__Exp__OperatorAssignment_1_0 ) ) )
            // InternalMathAssignmentLanguage.g:408:1: ( ( rule__Exp__OperatorAssignment_1_0 ) )
            {
            // InternalMathAssignmentLanguage.g:408:1: ( ( rule__Exp__OperatorAssignment_1_0 ) )
            // InternalMathAssignmentLanguage.g:409:2: ( rule__Exp__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); 
            // InternalMathAssignmentLanguage.g:410:2: ( rule__Exp__OperatorAssignment_1_0 )
            // InternalMathAssignmentLanguage.g:410:3: rule__Exp__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalMathAssignmentLanguage.g:418:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:422:1: ( rule__Exp__Group_1__1__Impl )
            // InternalMathAssignmentLanguage.g:423:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalMathAssignmentLanguage.g:429:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:433:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalMathAssignmentLanguage.g:434:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalMathAssignmentLanguage.g:434:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalMathAssignmentLanguage.g:435:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalMathAssignmentLanguage.g:436:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalMathAssignmentLanguage.g:436:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_0__0"
    // InternalMathAssignmentLanguage.g:445:1: rule__ExpOp__Group_0__0 : rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1 ;
    public final void rule__ExpOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:449:1: ( rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1 )
            // InternalMathAssignmentLanguage.g:450:2: rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpOp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__0"


    // $ANTLR start "rule__ExpOp__Group_0__0__Impl"
    // InternalMathAssignmentLanguage.g:457:1: rule__ExpOp__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:461:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:462:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:462:1: ( () )
            // InternalMathAssignmentLanguage.g:463:2: ()
            {
             before(grammarAccess.getExpOpAccess().getPlusAction_0_0()); 
            // InternalMathAssignmentLanguage.g:464:2: ()
            // InternalMathAssignmentLanguage.g:464:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getPlusAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_0__1"
    // InternalMathAssignmentLanguage.g:472:1: rule__ExpOp__Group_0__1 : rule__ExpOp__Group_0__1__Impl ;
    public final void rule__ExpOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:476:1: ( rule__ExpOp__Group_0__1__Impl )
            // InternalMathAssignmentLanguage.g:477:2: rule__ExpOp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__1"


    // $ANTLR start "rule__ExpOp__Group_0__1__Impl"
    // InternalMathAssignmentLanguage.g:483:1: rule__ExpOp__Group_0__1__Impl : ( '+' ) ;
    public final void rule__ExpOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:487:1: ( ( '+' ) )
            // InternalMathAssignmentLanguage.g:488:1: ( '+' )
            {
            // InternalMathAssignmentLanguage.g:488:1: ( '+' )
            // InternalMathAssignmentLanguage.g:489:2: '+'
            {
             before(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_1__0"
    // InternalMathAssignmentLanguage.g:499:1: rule__ExpOp__Group_1__0 : rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1 ;
    public final void rule__ExpOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:503:1: ( rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1 )
            // InternalMathAssignmentLanguage.g:504:2: rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ExpOp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__0"


    // $ANTLR start "rule__ExpOp__Group_1__0__Impl"
    // InternalMathAssignmentLanguage.g:511:1: rule__ExpOp__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:515:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:516:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:516:1: ( () )
            // InternalMathAssignmentLanguage.g:517:2: ()
            {
             before(grammarAccess.getExpOpAccess().getMinusAction_1_0()); 
            // InternalMathAssignmentLanguage.g:518:2: ()
            // InternalMathAssignmentLanguage.g:518:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getMinusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_1__1"
    // InternalMathAssignmentLanguage.g:526:1: rule__ExpOp__Group_1__1 : rule__ExpOp__Group_1__1__Impl ;
    public final void rule__ExpOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:530:1: ( rule__ExpOp__Group_1__1__Impl )
            // InternalMathAssignmentLanguage.g:531:2: rule__ExpOp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__1"


    // $ANTLR start "rule__ExpOp__Group_1__1__Impl"
    // InternalMathAssignmentLanguage.g:537:1: rule__ExpOp__Group_1__1__Impl : ( '-' ) ;
    public final void rule__ExpOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:541:1: ( ( '-' ) )
            // InternalMathAssignmentLanguage.g:542:1: ( '-' )
            {
            // InternalMathAssignmentLanguage.g:542:1: ( '-' )
            // InternalMathAssignmentLanguage.g:543:2: '-'
            {
             before(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_2__0"
    // InternalMathAssignmentLanguage.g:553:1: rule__ExpOp__Group_2__0 : rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1 ;
    public final void rule__ExpOp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:557:1: ( rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1 )
            // InternalMathAssignmentLanguage.g:558:2: rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpOp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__0"


    // $ANTLR start "rule__ExpOp__Group_2__0__Impl"
    // InternalMathAssignmentLanguage.g:565:1: rule__ExpOp__Group_2__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:569:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:570:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:570:1: ( () )
            // InternalMathAssignmentLanguage.g:571:2: ()
            {
             before(grammarAccess.getExpOpAccess().getMultAction_2_0()); 
            // InternalMathAssignmentLanguage.g:572:2: ()
            // InternalMathAssignmentLanguage.g:572:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getMultAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_2__1"
    // InternalMathAssignmentLanguage.g:580:1: rule__ExpOp__Group_2__1 : rule__ExpOp__Group_2__1__Impl ;
    public final void rule__ExpOp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:584:1: ( rule__ExpOp__Group_2__1__Impl )
            // InternalMathAssignmentLanguage.g:585:2: rule__ExpOp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__1"


    // $ANTLR start "rule__ExpOp__Group_2__1__Impl"
    // InternalMathAssignmentLanguage.g:591:1: rule__ExpOp__Group_2__1__Impl : ( '*' ) ;
    public final void rule__ExpOp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:595:1: ( ( '*' ) )
            // InternalMathAssignmentLanguage.g:596:1: ( '*' )
            {
            // InternalMathAssignmentLanguage.g:596:1: ( '*' )
            // InternalMathAssignmentLanguage.g:597:2: '*'
            {
             before(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_3__0"
    // InternalMathAssignmentLanguage.g:607:1: rule__ExpOp__Group_3__0 : rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1 ;
    public final void rule__ExpOp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:611:1: ( rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1 )
            // InternalMathAssignmentLanguage.g:612:2: rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpOp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__0"


    // $ANTLR start "rule__ExpOp__Group_3__0__Impl"
    // InternalMathAssignmentLanguage.g:619:1: rule__ExpOp__Group_3__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:623:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:624:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:624:1: ( () )
            // InternalMathAssignmentLanguage.g:625:2: ()
            {
             before(grammarAccess.getExpOpAccess().getDivAction_3_0()); 
            // InternalMathAssignmentLanguage.g:626:2: ()
            // InternalMathAssignmentLanguage.g:626:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getDivAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_3__1"
    // InternalMathAssignmentLanguage.g:634:1: rule__ExpOp__Group_3__1 : rule__ExpOp__Group_3__1__Impl ;
    public final void rule__ExpOp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:638:1: ( rule__ExpOp__Group_3__1__Impl )
            // InternalMathAssignmentLanguage.g:639:2: rule__ExpOp__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__1"


    // $ANTLR start "rule__ExpOp__Group_3__1__Impl"
    // InternalMathAssignmentLanguage.g:645:1: rule__ExpOp__Group_3__1__Impl : ( '/' ) ;
    public final void rule__ExpOp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:649:1: ( ( '/' ) )
            // InternalMathAssignmentLanguage.g:650:1: ( '/' )
            {
            // InternalMathAssignmentLanguage.g:650:1: ( '/' )
            // InternalMathAssignmentLanguage.g:651:2: '/'
            {
             before(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalMathAssignmentLanguage.g:661:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:665:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalMathAssignmentLanguage.g:666:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:673:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:677:1: ( ( '(' ) )
            // InternalMathAssignmentLanguage.g:678:1: ( '(' )
            {
            // InternalMathAssignmentLanguage.g:678:1: ( '(' )
            // InternalMathAssignmentLanguage.g:679:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalMathAssignmentLanguage.g:688:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:692:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalMathAssignmentLanguage.g:693:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:700:1: rule__Parenthesis__Group__1__Impl : ( ( rule__Parenthesis__ExpAssignment_1 ) ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:704:1: ( ( ( rule__Parenthesis__ExpAssignment_1 ) ) )
            // InternalMathAssignmentLanguage.g:705:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            {
            // InternalMathAssignmentLanguage.g:705:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            // InternalMathAssignmentLanguage.g:706:2: ( rule__Parenthesis__ExpAssignment_1 )
            {
             before(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 
            // InternalMathAssignmentLanguage.g:707:2: ( rule__Parenthesis__ExpAssignment_1 )
            // InternalMathAssignmentLanguage.g:707:3: rule__Parenthesis__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalMathAssignmentLanguage.g:715:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:719:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalMathAssignmentLanguage.g:720:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalMathAssignmentLanguage.g:726:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:730:1: ( ( ')' ) )
            // InternalMathAssignmentLanguage.g:731:1: ( ')' )
            {
            // InternalMathAssignmentLanguage.g:731:1: ( ')' )
            // InternalMathAssignmentLanguage.g:732:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__MathExp__ExpAssignment_2"
    // InternalMathAssignmentLanguage.g:742:1: rule__MathExp__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:746:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:747:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:747:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:748:3: ruleExp
            {
             before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__ExpAssignment_2"


    // $ANTLR start "rule__Exp__LeftAssignment_0"
    // InternalMathAssignmentLanguage.g:757:1: rule__Exp__LeftAssignment_0 : ( rulePrimary ) ;
    public final void rule__Exp__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:761:1: ( ( rulePrimary ) )
            // InternalMathAssignmentLanguage.g:762:2: ( rulePrimary )
            {
            // InternalMathAssignmentLanguage.g:762:2: ( rulePrimary )
            // InternalMathAssignmentLanguage.g:763:3: rulePrimary
            {
             before(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__LeftAssignment_0"


    // $ANTLR start "rule__Exp__OperatorAssignment_1_0"
    // InternalMathAssignmentLanguage.g:772:1: rule__Exp__OperatorAssignment_1_0 : ( ruleExpOp ) ;
    public final void rule__Exp__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:776:1: ( ( ruleExpOp ) )
            // InternalMathAssignmentLanguage.g:777:2: ( ruleExpOp )
            {
            // InternalMathAssignmentLanguage.g:777:2: ( ruleExpOp )
            // InternalMathAssignmentLanguage.g:778:3: ruleExpOp
            {
             before(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpOp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__OperatorAssignment_1_0"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalMathAssignmentLanguage.g:787:1: rule__Exp__RightAssignment_1_1 : ( ruleExp ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:791:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:792:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:792:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:793:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__Parenthesis__ExpAssignment_1"
    // InternalMathAssignmentLanguage.g:802:1: rule__Parenthesis__ExpAssignment_1 : ( ruleExp ) ;
    public final void rule__Parenthesis__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:806:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:807:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:807:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:808:3: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__ExpAssignment_1"


    // $ANTLR start "rule__Number__ValueAssignment"
    // InternalMathAssignmentLanguage.g:817:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:821:1: ( ( RULE_INT ) )
            // InternalMathAssignmentLanguage.g:822:2: ( RULE_INT )
            {
            // InternalMathAssignmentLanguage.g:822:2: ( RULE_INT )
            // InternalMathAssignmentLanguage.g:823:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});

}