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


    // $ANTLR start "rule__ExpOp__Alternatives"
    // InternalMathAssignmentLanguage.g:152:1: rule__ExpOp__Alternatives : ( ( ( rule__ExpOp__Group_0__0 ) ) | ( ( rule__ExpOp__Group_1__0 ) ) | ( ( rule__ExpOp__Group_2__0 ) ) | ( ( rule__ExpOp__Group_3__0 ) ) );
    public final void rule__ExpOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:156:1: ( ( ( rule__ExpOp__Group_0__0 ) ) | ( ( rule__ExpOp__Group_1__0 ) ) | ( ( rule__ExpOp__Group_2__0 ) ) | ( ( rule__ExpOp__Group_3__0 ) ) )
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
                    // InternalMathAssignmentLanguage.g:157:2: ( ( rule__ExpOp__Group_0__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:157:2: ( ( rule__ExpOp__Group_0__0 ) )
                    // InternalMathAssignmentLanguage.g:158:3: ( rule__ExpOp__Group_0__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_0()); 
                    // InternalMathAssignmentLanguage.g:159:3: ( rule__ExpOp__Group_0__0 )
                    // InternalMathAssignmentLanguage.g:159:4: rule__ExpOp__Group_0__0
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
                    // InternalMathAssignmentLanguage.g:163:2: ( ( rule__ExpOp__Group_1__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:163:2: ( ( rule__ExpOp__Group_1__0 ) )
                    // InternalMathAssignmentLanguage.g:164:3: ( rule__ExpOp__Group_1__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_1()); 
                    // InternalMathAssignmentLanguage.g:165:3: ( rule__ExpOp__Group_1__0 )
                    // InternalMathAssignmentLanguage.g:165:4: rule__ExpOp__Group_1__0
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
                    // InternalMathAssignmentLanguage.g:169:2: ( ( rule__ExpOp__Group_2__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:169:2: ( ( rule__ExpOp__Group_2__0 ) )
                    // InternalMathAssignmentLanguage.g:170:3: ( rule__ExpOp__Group_2__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_2()); 
                    // InternalMathAssignmentLanguage.g:171:3: ( rule__ExpOp__Group_2__0 )
                    // InternalMathAssignmentLanguage.g:171:4: rule__ExpOp__Group_2__0
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
                    // InternalMathAssignmentLanguage.g:175:2: ( ( rule__ExpOp__Group_3__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:175:2: ( ( rule__ExpOp__Group_3__0 ) )
                    // InternalMathAssignmentLanguage.g:176:3: ( rule__ExpOp__Group_3__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_3()); 
                    // InternalMathAssignmentLanguage.g:177:3: ( rule__ExpOp__Group_3__0 )
                    // InternalMathAssignmentLanguage.g:177:4: rule__ExpOp__Group_3__0
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
    // InternalMathAssignmentLanguage.g:185:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:189:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) )
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
                    // InternalMathAssignmentLanguage.g:190:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:190:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMathAssignmentLanguage.g:191:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMathAssignmentLanguage.g:192:3: ( rule__Primary__Group_0__0 )
                    // InternalMathAssignmentLanguage.g:192:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:196:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:196:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMathAssignmentLanguage.g:197:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMathAssignmentLanguage.g:198:3: ( rule__Primary__Group_1__0 )
                    // InternalMathAssignmentLanguage.g:198:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

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
    // InternalMathAssignmentLanguage.g:206:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:210:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalMathAssignmentLanguage.g:211:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
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
    // InternalMathAssignmentLanguage.g:218:1: rule__MathExp__Group__0__Impl : ( 'result' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:222:1: ( ( 'result' ) )
            // InternalMathAssignmentLanguage.g:223:1: ( 'result' )
            {
            // InternalMathAssignmentLanguage.g:223:1: ( 'result' )
            // InternalMathAssignmentLanguage.g:224:2: 'result'
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
    // InternalMathAssignmentLanguage.g:233:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:237:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalMathAssignmentLanguage.g:238:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
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
    // InternalMathAssignmentLanguage.g:245:1: rule__MathExp__Group__1__Impl : ( 'is' ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:249:1: ( ( 'is' ) )
            // InternalMathAssignmentLanguage.g:250:1: ( 'is' )
            {
            // InternalMathAssignmentLanguage.g:250:1: ( 'is' )
            // InternalMathAssignmentLanguage.g:251:2: 'is'
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
    // InternalMathAssignmentLanguage.g:260:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:264:1: ( rule__MathExp__Group__2__Impl )
            // InternalMathAssignmentLanguage.g:265:2: rule__MathExp__Group__2__Impl
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
    // InternalMathAssignmentLanguage.g:271:1: rule__MathExp__Group__2__Impl : ( ( rule__MathExp__ExpAssignment_2 ) ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:275:1: ( ( ( rule__MathExp__ExpAssignment_2 ) ) )
            // InternalMathAssignmentLanguage.g:276:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            {
            // InternalMathAssignmentLanguage.g:276:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            // InternalMathAssignmentLanguage.g:277:2: ( rule__MathExp__ExpAssignment_2 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_2()); 
            // InternalMathAssignmentLanguage.g:278:2: ( rule__MathExp__ExpAssignment_2 )
            // InternalMathAssignmentLanguage.g:278:3: rule__MathExp__ExpAssignment_2
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
    // InternalMathAssignmentLanguage.g:287:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:291:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalMathAssignmentLanguage.g:292:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
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
    // InternalMathAssignmentLanguage.g:299:1: rule__Exp__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:303:1: ( ( rulePrimary ) )
            // InternalMathAssignmentLanguage.g:304:1: ( rulePrimary )
            {
            // InternalMathAssignmentLanguage.g:304:1: ( rulePrimary )
            // InternalMathAssignmentLanguage.g:305:2: rulePrimary
            {
             before(grammarAccess.getExpAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getExpAccess().getPrimaryParserRuleCall_0()); 

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
    // InternalMathAssignmentLanguage.g:314:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:318:1: ( rule__Exp__Group__1__Impl )
            // InternalMathAssignmentLanguage.g:319:2: rule__Exp__Group__1__Impl
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
    // InternalMathAssignmentLanguage.g:325:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )? ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:329:1: ( ( ( rule__Exp__Group_1__0 )? ) )
            // InternalMathAssignmentLanguage.g:330:1: ( ( rule__Exp__Group_1__0 )? )
            {
            // InternalMathAssignmentLanguage.g:330:1: ( ( rule__Exp__Group_1__0 )? )
            // InternalMathAssignmentLanguage.g:331:2: ( rule__Exp__Group_1__0 )?
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalMathAssignmentLanguage.g:332:2: ( rule__Exp__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=16)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:332:3: rule__Exp__Group_1__0
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
    // InternalMathAssignmentLanguage.g:341:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:345:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalMathAssignmentLanguage.g:346:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMathAssignmentLanguage.g:353:1: rule__Exp__Group_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:357:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:358:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:358:1: ( () )
            // InternalMathAssignmentLanguage.g:359:2: ()
            {
             before(grammarAccess.getExpAccess().getExpLeftAction_1_0()); 
            // InternalMathAssignmentLanguage.g:360:2: ()
            // InternalMathAssignmentLanguage.g:360:3: 
            {
            }

             after(grammarAccess.getExpAccess().getExpLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalMathAssignmentLanguage.g:368:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl rule__Exp__Group_1__2 ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:372:1: ( rule__Exp__Group_1__1__Impl rule__Exp__Group_1__2 )
            // InternalMathAssignmentLanguage.g:373:2: rule__Exp__Group_1__1__Impl rule__Exp__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Exp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__2();

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
    // InternalMathAssignmentLanguage.g:380:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__OperatorAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:384:1: ( ( ( rule__Exp__OperatorAssignment_1_1 ) ) )
            // InternalMathAssignmentLanguage.g:385:1: ( ( rule__Exp__OperatorAssignment_1_1 ) )
            {
            // InternalMathAssignmentLanguage.g:385:1: ( ( rule__Exp__OperatorAssignment_1_1 ) )
            // InternalMathAssignmentLanguage.g:386:2: ( rule__Exp__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getOperatorAssignment_1_1()); 
            // InternalMathAssignmentLanguage.g:387:2: ( rule__Exp__OperatorAssignment_1_1 )
            // InternalMathAssignmentLanguage.g:387:3: rule__Exp__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getOperatorAssignment_1_1()); 

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


    // $ANTLR start "rule__Exp__Group_1__2"
    // InternalMathAssignmentLanguage.g:395:1: rule__Exp__Group_1__2 : rule__Exp__Group_1__2__Impl ;
    public final void rule__Exp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:399:1: ( rule__Exp__Group_1__2__Impl )
            // InternalMathAssignmentLanguage.g:400:2: rule__Exp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__2__Impl();

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
    // $ANTLR end "rule__Exp__Group_1__2"


    // $ANTLR start "rule__Exp__Group_1__2__Impl"
    // InternalMathAssignmentLanguage.g:406:1: rule__Exp__Group_1__2__Impl : ( ( rule__Exp__RightAssignment_1_2 ) ) ;
    public final void rule__Exp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:410:1: ( ( ( rule__Exp__RightAssignment_1_2 ) ) )
            // InternalMathAssignmentLanguage.g:411:1: ( ( rule__Exp__RightAssignment_1_2 ) )
            {
            // InternalMathAssignmentLanguage.g:411:1: ( ( rule__Exp__RightAssignment_1_2 ) )
            // InternalMathAssignmentLanguage.g:412:2: ( rule__Exp__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_2()); 
            // InternalMathAssignmentLanguage.g:413:2: ( rule__Exp__RightAssignment_1_2 )
            // InternalMathAssignmentLanguage.g:413:3: rule__Exp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Exp__Group_1__2__Impl"


    // $ANTLR start "rule__ExpOp__Group_0__0"
    // InternalMathAssignmentLanguage.g:422:1: rule__ExpOp__Group_0__0 : rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1 ;
    public final void rule__ExpOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:426:1: ( rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1 )
            // InternalMathAssignmentLanguage.g:427:2: rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1
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
    // InternalMathAssignmentLanguage.g:434:1: rule__ExpOp__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:438:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:439:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:439:1: ( () )
            // InternalMathAssignmentLanguage.g:440:2: ()
            {
             before(grammarAccess.getExpOpAccess().getPlusAction_0_0()); 
            // InternalMathAssignmentLanguage.g:441:2: ()
            // InternalMathAssignmentLanguage.g:441:3: 
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
    // InternalMathAssignmentLanguage.g:449:1: rule__ExpOp__Group_0__1 : rule__ExpOp__Group_0__1__Impl ;
    public final void rule__ExpOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:453:1: ( rule__ExpOp__Group_0__1__Impl )
            // InternalMathAssignmentLanguage.g:454:2: rule__ExpOp__Group_0__1__Impl
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
    // InternalMathAssignmentLanguage.g:460:1: rule__ExpOp__Group_0__1__Impl : ( '+' ) ;
    public final void rule__ExpOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:464:1: ( ( '+' ) )
            // InternalMathAssignmentLanguage.g:465:1: ( '+' )
            {
            // InternalMathAssignmentLanguage.g:465:1: ( '+' )
            // InternalMathAssignmentLanguage.g:466:2: '+'
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
    // InternalMathAssignmentLanguage.g:476:1: rule__ExpOp__Group_1__0 : rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1 ;
    public final void rule__ExpOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:480:1: ( rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1 )
            // InternalMathAssignmentLanguage.g:481:2: rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1
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
    // InternalMathAssignmentLanguage.g:488:1: rule__ExpOp__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:492:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:493:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:493:1: ( () )
            // InternalMathAssignmentLanguage.g:494:2: ()
            {
             before(grammarAccess.getExpOpAccess().getMinusAction_1_0()); 
            // InternalMathAssignmentLanguage.g:495:2: ()
            // InternalMathAssignmentLanguage.g:495:3: 
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
    // InternalMathAssignmentLanguage.g:503:1: rule__ExpOp__Group_1__1 : rule__ExpOp__Group_1__1__Impl ;
    public final void rule__ExpOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:507:1: ( rule__ExpOp__Group_1__1__Impl )
            // InternalMathAssignmentLanguage.g:508:2: rule__ExpOp__Group_1__1__Impl
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
    // InternalMathAssignmentLanguage.g:514:1: rule__ExpOp__Group_1__1__Impl : ( '-' ) ;
    public final void rule__ExpOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:518:1: ( ( '-' ) )
            // InternalMathAssignmentLanguage.g:519:1: ( '-' )
            {
            // InternalMathAssignmentLanguage.g:519:1: ( '-' )
            // InternalMathAssignmentLanguage.g:520:2: '-'
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
    // InternalMathAssignmentLanguage.g:530:1: rule__ExpOp__Group_2__0 : rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1 ;
    public final void rule__ExpOp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:534:1: ( rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1 )
            // InternalMathAssignmentLanguage.g:535:2: rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1
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
    // InternalMathAssignmentLanguage.g:542:1: rule__ExpOp__Group_2__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:546:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:547:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:547:1: ( () )
            // InternalMathAssignmentLanguage.g:548:2: ()
            {
             before(grammarAccess.getExpOpAccess().getMultAction_2_0()); 
            // InternalMathAssignmentLanguage.g:549:2: ()
            // InternalMathAssignmentLanguage.g:549:3: 
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
    // InternalMathAssignmentLanguage.g:557:1: rule__ExpOp__Group_2__1 : rule__ExpOp__Group_2__1__Impl ;
    public final void rule__ExpOp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:561:1: ( rule__ExpOp__Group_2__1__Impl )
            // InternalMathAssignmentLanguage.g:562:2: rule__ExpOp__Group_2__1__Impl
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
    // InternalMathAssignmentLanguage.g:568:1: rule__ExpOp__Group_2__1__Impl : ( '*' ) ;
    public final void rule__ExpOp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:572:1: ( ( '*' ) )
            // InternalMathAssignmentLanguage.g:573:1: ( '*' )
            {
            // InternalMathAssignmentLanguage.g:573:1: ( '*' )
            // InternalMathAssignmentLanguage.g:574:2: '*'
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
    // InternalMathAssignmentLanguage.g:584:1: rule__ExpOp__Group_3__0 : rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1 ;
    public final void rule__ExpOp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:588:1: ( rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1 )
            // InternalMathAssignmentLanguage.g:589:2: rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1
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
    // InternalMathAssignmentLanguage.g:596:1: rule__ExpOp__Group_3__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:600:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:601:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:601:1: ( () )
            // InternalMathAssignmentLanguage.g:602:2: ()
            {
             before(grammarAccess.getExpOpAccess().getDivAction_3_0()); 
            // InternalMathAssignmentLanguage.g:603:2: ()
            // InternalMathAssignmentLanguage.g:603:3: 
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
    // InternalMathAssignmentLanguage.g:611:1: rule__ExpOp__Group_3__1 : rule__ExpOp__Group_3__1__Impl ;
    public final void rule__ExpOp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:615:1: ( rule__ExpOp__Group_3__1__Impl )
            // InternalMathAssignmentLanguage.g:616:2: rule__ExpOp__Group_3__1__Impl
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
    // InternalMathAssignmentLanguage.g:622:1: rule__ExpOp__Group_3__1__Impl : ( '/' ) ;
    public final void rule__ExpOp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:626:1: ( ( '/' ) )
            // InternalMathAssignmentLanguage.g:627:1: ( '/' )
            {
            // InternalMathAssignmentLanguage.g:627:1: ( '/' )
            // InternalMathAssignmentLanguage.g:628:2: '/'
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


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMathAssignmentLanguage.g:638:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:642:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMathAssignmentLanguage.g:643:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMathAssignmentLanguage.g:650:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:654:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:655:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:655:1: ( () )
            // InternalMathAssignmentLanguage.g:656:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNumberAction_0_0()); 
            // InternalMathAssignmentLanguage.g:657:2: ()
            // InternalMathAssignmentLanguage.g:657:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNumberAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMathAssignmentLanguage.g:665:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:669:1: ( rule__Primary__Group_0__1__Impl )
            // InternalMathAssignmentLanguage.g:670:2: rule__Primary__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMathAssignmentLanguage.g:676:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:680:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalMathAssignmentLanguage.g:681:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalMathAssignmentLanguage.g:681:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalMathAssignmentLanguage.g:682:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalMathAssignmentLanguage.g:683:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalMathAssignmentLanguage.g:683:3: rule__Primary__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMathAssignmentLanguage.g:692:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:696:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMathAssignmentLanguage.g:697:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMathAssignmentLanguage.g:704:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:708:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:709:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:709:1: ( () )
            // InternalMathAssignmentLanguage.g:710:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getParenthesisAction_1_0()); 
            // InternalMathAssignmentLanguage.g:711:2: ()
            // InternalMathAssignmentLanguage.g:711:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getParenthesisAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMathAssignmentLanguage.g:719:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:723:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMathAssignmentLanguage.g:724:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMathAssignmentLanguage.g:731:1: rule__Primary__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:735:1: ( ( '(' ) )
            // InternalMathAssignmentLanguage.g:736:1: ( '(' )
            {
            // InternalMathAssignmentLanguage.g:736:1: ( '(' )
            // InternalMathAssignmentLanguage.g:737:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalMathAssignmentLanguage.g:746:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:750:1: ( rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 )
            // InternalMathAssignmentLanguage.g:751:2: rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__3();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalMathAssignmentLanguage.g:758:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:762:1: ( ( ( rule__Primary__ExpAssignment_1_2 ) ) )
            // InternalMathAssignmentLanguage.g:763:1: ( ( rule__Primary__ExpAssignment_1_2 ) )
            {
            // InternalMathAssignmentLanguage.g:763:1: ( ( rule__Primary__ExpAssignment_1_2 ) )
            // InternalMathAssignmentLanguage.g:764:2: ( rule__Primary__ExpAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpAssignment_1_2()); 
            // InternalMathAssignmentLanguage.g:765:2: ( rule__Primary__ExpAssignment_1_2 )
            // InternalMathAssignmentLanguage.g:765:3: rule__Primary__ExpAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpAssignment_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__3"
    // InternalMathAssignmentLanguage.g:773:1: rule__Primary__Group_1__3 : rule__Primary__Group_1__3__Impl ;
    public final void rule__Primary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:777:1: ( rule__Primary__Group_1__3__Impl )
            // InternalMathAssignmentLanguage.g:778:2: rule__Primary__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__3__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__3"


    // $ANTLR start "rule__Primary__Group_1__3__Impl"
    // InternalMathAssignmentLanguage.g:784:1: rule__Primary__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:788:1: ( ( ')' ) )
            // InternalMathAssignmentLanguage.g:789:1: ( ')' )
            {
            // InternalMathAssignmentLanguage.g:789:1: ( ')' )
            // InternalMathAssignmentLanguage.g:790:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__Primary__Group_1__3__Impl"


    // $ANTLR start "rule__MathExp__ExpAssignment_2"
    // InternalMathAssignmentLanguage.g:800:1: rule__MathExp__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:804:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:805:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:805:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:806:3: ruleExp
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


    // $ANTLR start "rule__Exp__OperatorAssignment_1_1"
    // InternalMathAssignmentLanguage.g:815:1: rule__Exp__OperatorAssignment_1_1 : ( ruleExpOp ) ;
    public final void rule__Exp__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:819:1: ( ( ruleExpOp ) )
            // InternalMathAssignmentLanguage.g:820:2: ( ruleExpOp )
            {
            // InternalMathAssignmentLanguage.g:820:2: ( ruleExpOp )
            // InternalMathAssignmentLanguage.g:821:3: ruleExpOp
            {
             before(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpOp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Exp__OperatorAssignment_1_1"


    // $ANTLR start "rule__Exp__RightAssignment_1_2"
    // InternalMathAssignmentLanguage.g:830:1: rule__Exp__RightAssignment_1_2 : ( ruleExp ) ;
    public final void rule__Exp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:834:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:835:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:835:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:836:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Exp__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalMathAssignmentLanguage.g:845:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:849:1: ( ( RULE_INT ) )
            // InternalMathAssignmentLanguage.g:850:2: ( RULE_INT )
            {
            // InternalMathAssignmentLanguage.g:850:2: ( RULE_INT )
            // InternalMathAssignmentLanguage.g:851:3: RULE_INT
            {
             before(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Primary__ValueAssignment_0_1"


    // $ANTLR start "rule__Primary__ExpAssignment_1_2"
    // InternalMathAssignmentLanguage.g:860:1: rule__Primary__ExpAssignment_1_2 : ( ruleExp ) ;
    public final void rule__Primary__ExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:864:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:865:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:865:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:866:3: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getExpExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpExpParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Primary__ExpAssignment_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}