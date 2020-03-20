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
    // InternalMathAssignmentLanguage.g:87:1: ruleExp : ( rulePlusMinusExp ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:91:2: ( ( rulePlusMinusExp ) )
            // InternalMathAssignmentLanguage.g:92:2: ( rulePlusMinusExp )
            {
            // InternalMathAssignmentLanguage.g:92:2: ( rulePlusMinusExp )
            // InternalMathAssignmentLanguage.g:93:3: rulePlusMinusExp
            {
             before(grammarAccess.getExpAccess().getPlusMinusExpParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getPlusMinusExpParserRuleCall()); 

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


    // $ANTLR start "entryRulePlusMinusExp"
    // InternalMathAssignmentLanguage.g:103:1: entryRulePlusMinusExp : rulePlusMinusExp EOF ;
    public final void entryRulePlusMinusExp() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:104:1: ( rulePlusMinusExp EOF )
            // InternalMathAssignmentLanguage.g:105:1: rulePlusMinusExp EOF
            {
             before(grammarAccess.getPlusMinusExpRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinusExp();

            state._fsp--;

             after(grammarAccess.getPlusMinusExpRule()); 
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
    // $ANTLR end "entryRulePlusMinusExp"


    // $ANTLR start "rulePlusMinusExp"
    // InternalMathAssignmentLanguage.g:112:1: rulePlusMinusExp : ( ( rule__PlusMinusExp__Group__0 ) ) ;
    public final void rulePlusMinusExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:116:2: ( ( ( rule__PlusMinusExp__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:117:2: ( ( rule__PlusMinusExp__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:117:2: ( ( rule__PlusMinusExp__Group__0 ) )
            // InternalMathAssignmentLanguage.g:118:3: ( rule__PlusMinusExp__Group__0 )
            {
             before(grammarAccess.getPlusMinusExpAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:119:3: ( rule__PlusMinusExp__Group__0 )
            // InternalMathAssignmentLanguage.g:119:4: rule__PlusMinusExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusExpAccess().getGroup()); 

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
    // $ANTLR end "rulePlusMinusExp"


    // $ANTLR start "entryRuleMulOrDivExp"
    // InternalMathAssignmentLanguage.g:128:1: entryRuleMulOrDivExp : ruleMulOrDivExp EOF ;
    public final void entryRuleMulOrDivExp() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:129:1: ( ruleMulOrDivExp EOF )
            // InternalMathAssignmentLanguage.g:130:1: ruleMulOrDivExp EOF
            {
             before(grammarAccess.getMulOrDivExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMulOrDivExp();

            state._fsp--;

             after(grammarAccess.getMulOrDivExpRule()); 
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
    // $ANTLR end "entryRuleMulOrDivExp"


    // $ANTLR start "ruleMulOrDivExp"
    // InternalMathAssignmentLanguage.g:137:1: ruleMulOrDivExp : ( ( rule__MulOrDivExp__Group__0 ) ) ;
    public final void ruleMulOrDivExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:141:2: ( ( ( rule__MulOrDivExp__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:142:2: ( ( rule__MulOrDivExp__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:142:2: ( ( rule__MulOrDivExp__Group__0 ) )
            // InternalMathAssignmentLanguage.g:143:3: ( rule__MulOrDivExp__Group__0 )
            {
             before(grammarAccess.getMulOrDivExpAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:144:3: ( rule__MulOrDivExp__Group__0 )
            // InternalMathAssignmentLanguage.g:144:4: rule__MulOrDivExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDivExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivExpAccess().getGroup()); 

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
    // $ANTLR end "ruleMulOrDivExp"


    // $ANTLR start "entryRuleMultDivOp"
    // InternalMathAssignmentLanguage.g:153:1: entryRuleMultDivOp : ruleMultDivOp EOF ;
    public final void entryRuleMultDivOp() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:154:1: ( ruleMultDivOp EOF )
            // InternalMathAssignmentLanguage.g:155:1: ruleMultDivOp EOF
            {
             before(grammarAccess.getMultDivOpRule()); 
            pushFollow(FOLLOW_1);
            ruleMultDivOp();

            state._fsp--;

             after(grammarAccess.getMultDivOpRule()); 
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
    // $ANTLR end "entryRuleMultDivOp"


    // $ANTLR start "ruleMultDivOp"
    // InternalMathAssignmentLanguage.g:162:1: ruleMultDivOp : ( ( rule__MultDivOp__Alternatives ) ) ;
    public final void ruleMultDivOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:166:2: ( ( ( rule__MultDivOp__Alternatives ) ) )
            // InternalMathAssignmentLanguage.g:167:2: ( ( rule__MultDivOp__Alternatives ) )
            {
            // InternalMathAssignmentLanguage.g:167:2: ( ( rule__MultDivOp__Alternatives ) )
            // InternalMathAssignmentLanguage.g:168:3: ( rule__MultDivOp__Alternatives )
            {
             before(grammarAccess.getMultDivOpAccess().getAlternatives()); 
            // InternalMathAssignmentLanguage.g:169:3: ( rule__MultDivOp__Alternatives )
            // InternalMathAssignmentLanguage.g:169:4: rule__MultDivOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultDivOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultDivOpAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMultDivOp"


    // $ANTLR start "entryRulePlusMinusOp"
    // InternalMathAssignmentLanguage.g:178:1: entryRulePlusMinusOp : rulePlusMinusOp EOF ;
    public final void entryRulePlusMinusOp() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:179:1: ( rulePlusMinusOp EOF )
            // InternalMathAssignmentLanguage.g:180:1: rulePlusMinusOp EOF
            {
             before(grammarAccess.getPlusMinusOpRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinusOp();

            state._fsp--;

             after(grammarAccess.getPlusMinusOpRule()); 
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
    // $ANTLR end "entryRulePlusMinusOp"


    // $ANTLR start "rulePlusMinusOp"
    // InternalMathAssignmentLanguage.g:187:1: rulePlusMinusOp : ( ( rule__PlusMinusOp__Alternatives ) ) ;
    public final void rulePlusMinusOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:191:2: ( ( ( rule__PlusMinusOp__Alternatives ) ) )
            // InternalMathAssignmentLanguage.g:192:2: ( ( rule__PlusMinusOp__Alternatives ) )
            {
            // InternalMathAssignmentLanguage.g:192:2: ( ( rule__PlusMinusOp__Alternatives ) )
            // InternalMathAssignmentLanguage.g:193:3: ( rule__PlusMinusOp__Alternatives )
            {
             before(grammarAccess.getPlusMinusOpAccess().getAlternatives()); 
            // InternalMathAssignmentLanguage.g:194:3: ( rule__PlusMinusOp__Alternatives )
            // InternalMathAssignmentLanguage.g:194:4: rule__PlusMinusOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusOpAccess().getAlternatives()); 

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
    // $ANTLR end "rulePlusMinusOp"


    // $ANTLR start "entryRulePrimary"
    // InternalMathAssignmentLanguage.g:203:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:204:1: ( rulePrimary EOF )
            // InternalMathAssignmentLanguage.g:205:1: rulePrimary EOF
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
    // InternalMathAssignmentLanguage.g:212:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:216:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMathAssignmentLanguage.g:217:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMathAssignmentLanguage.g:217:2: ( ( rule__Primary__Alternatives ) )
            // InternalMathAssignmentLanguage.g:218:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMathAssignmentLanguage.g:219:3: ( rule__Primary__Alternatives )
            // InternalMathAssignmentLanguage.g:219:4: rule__Primary__Alternatives
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


    // $ANTLR start "rule__MultDivOp__Alternatives"
    // InternalMathAssignmentLanguage.g:227:1: rule__MultDivOp__Alternatives : ( ( ( rule__MultDivOp__Group_0__0 ) ) | ( ( rule__MultDivOp__Group_1__0 ) ) );
    public final void rule__MultDivOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:231:1: ( ( ( rule__MultDivOp__Group_0__0 ) ) | ( ( rule__MultDivOp__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:232:2: ( ( rule__MultDivOp__Group_0__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:232:2: ( ( rule__MultDivOp__Group_0__0 ) )
                    // InternalMathAssignmentLanguage.g:233:3: ( rule__MultDivOp__Group_0__0 )
                    {
                     before(grammarAccess.getMultDivOpAccess().getGroup_0()); 
                    // InternalMathAssignmentLanguage.g:234:3: ( rule__MultDivOp__Group_0__0 )
                    // InternalMathAssignmentLanguage.g:234:4: rule__MultDivOp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultDivOp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultDivOpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:238:2: ( ( rule__MultDivOp__Group_1__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:238:2: ( ( rule__MultDivOp__Group_1__0 ) )
                    // InternalMathAssignmentLanguage.g:239:3: ( rule__MultDivOp__Group_1__0 )
                    {
                     before(grammarAccess.getMultDivOpAccess().getGroup_1()); 
                    // InternalMathAssignmentLanguage.g:240:3: ( rule__MultDivOp__Group_1__0 )
                    // InternalMathAssignmentLanguage.g:240:4: rule__MultDivOp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultDivOp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultDivOpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MultDivOp__Alternatives"


    // $ANTLR start "rule__PlusMinusOp__Alternatives"
    // InternalMathAssignmentLanguage.g:248:1: rule__PlusMinusOp__Alternatives : ( ( ( rule__PlusMinusOp__Group_0__0 ) ) | ( ( rule__PlusMinusOp__Group_1__0 ) ) );
    public final void rule__PlusMinusOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:252:1: ( ( ( rule__PlusMinusOp__Group_0__0 ) ) | ( ( rule__PlusMinusOp__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:253:2: ( ( rule__PlusMinusOp__Group_0__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:253:2: ( ( rule__PlusMinusOp__Group_0__0 ) )
                    // InternalMathAssignmentLanguage.g:254:3: ( rule__PlusMinusOp__Group_0__0 )
                    {
                     before(grammarAccess.getPlusMinusOpAccess().getGroup_0()); 
                    // InternalMathAssignmentLanguage.g:255:3: ( rule__PlusMinusOp__Group_0__0 )
                    // InternalMathAssignmentLanguage.g:255:4: rule__PlusMinusOp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinusOp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusOpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:259:2: ( ( rule__PlusMinusOp__Group_1__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:259:2: ( ( rule__PlusMinusOp__Group_1__0 ) )
                    // InternalMathAssignmentLanguage.g:260:3: ( rule__PlusMinusOp__Group_1__0 )
                    {
                     before(grammarAccess.getPlusMinusOpAccess().getGroup_1()); 
                    // InternalMathAssignmentLanguage.g:261:3: ( rule__PlusMinusOp__Group_1__0 )
                    // InternalMathAssignmentLanguage.g:261:4: rule__PlusMinusOp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinusOp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusOpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusMinusOp__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMathAssignmentLanguage.g:269:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:273:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) )
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
                    // InternalMathAssignmentLanguage.g:274:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:274:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMathAssignmentLanguage.g:275:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMathAssignmentLanguage.g:276:3: ( rule__Primary__Group_0__0 )
                    // InternalMathAssignmentLanguage.g:276:4: rule__Primary__Group_0__0
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
                    // InternalMathAssignmentLanguage.g:280:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:280:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMathAssignmentLanguage.g:281:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMathAssignmentLanguage.g:282:3: ( rule__Primary__Group_1__0 )
                    // InternalMathAssignmentLanguage.g:282:4: rule__Primary__Group_1__0
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
    // InternalMathAssignmentLanguage.g:290:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:294:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalMathAssignmentLanguage.g:295:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
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
    // InternalMathAssignmentLanguage.g:302:1: rule__MathExp__Group__0__Impl : ( 'result' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:306:1: ( ( 'result' ) )
            // InternalMathAssignmentLanguage.g:307:1: ( 'result' )
            {
            // InternalMathAssignmentLanguage.g:307:1: ( 'result' )
            // InternalMathAssignmentLanguage.g:308:2: 'result'
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
    // InternalMathAssignmentLanguage.g:317:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:321:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalMathAssignmentLanguage.g:322:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
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
    // InternalMathAssignmentLanguage.g:329:1: rule__MathExp__Group__1__Impl : ( 'is' ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:333:1: ( ( 'is' ) )
            // InternalMathAssignmentLanguage.g:334:1: ( 'is' )
            {
            // InternalMathAssignmentLanguage.g:334:1: ( 'is' )
            // InternalMathAssignmentLanguage.g:335:2: 'is'
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
    // InternalMathAssignmentLanguage.g:344:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:348:1: ( rule__MathExp__Group__2__Impl )
            // InternalMathAssignmentLanguage.g:349:2: rule__MathExp__Group__2__Impl
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
    // InternalMathAssignmentLanguage.g:355:1: rule__MathExp__Group__2__Impl : ( ( rule__MathExp__ExpAssignment_2 ) ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:359:1: ( ( ( rule__MathExp__ExpAssignment_2 ) ) )
            // InternalMathAssignmentLanguage.g:360:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            {
            // InternalMathAssignmentLanguage.g:360:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            // InternalMathAssignmentLanguage.g:361:2: ( rule__MathExp__ExpAssignment_2 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_2()); 
            // InternalMathAssignmentLanguage.g:362:2: ( rule__MathExp__ExpAssignment_2 )
            // InternalMathAssignmentLanguage.g:362:3: rule__MathExp__ExpAssignment_2
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


    // $ANTLR start "rule__PlusMinusExp__Group__0"
    // InternalMathAssignmentLanguage.g:371:1: rule__PlusMinusExp__Group__0 : rule__PlusMinusExp__Group__0__Impl rule__PlusMinusExp__Group__1 ;
    public final void rule__PlusMinusExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:375:1: ( rule__PlusMinusExp__Group__0__Impl rule__PlusMinusExp__Group__1 )
            // InternalMathAssignmentLanguage.g:376:2: rule__PlusMinusExp__Group__0__Impl rule__PlusMinusExp__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PlusMinusExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusExp__Group__1();

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
    // $ANTLR end "rule__PlusMinusExp__Group__0"


    // $ANTLR start "rule__PlusMinusExp__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:383:1: rule__PlusMinusExp__Group__0__Impl : ( ruleMulOrDivExp ) ;
    public final void rule__PlusMinusExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:387:1: ( ( ruleMulOrDivExp ) )
            // InternalMathAssignmentLanguage.g:388:1: ( ruleMulOrDivExp )
            {
            // InternalMathAssignmentLanguage.g:388:1: ( ruleMulOrDivExp )
            // InternalMathAssignmentLanguage.g:389:2: ruleMulOrDivExp
            {
             before(grammarAccess.getPlusMinusExpAccess().getMulOrDivExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDivExp();

            state._fsp--;

             after(grammarAccess.getPlusMinusExpAccess().getMulOrDivExpParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusMinusExp__Group__0__Impl"


    // $ANTLR start "rule__PlusMinusExp__Group__1"
    // InternalMathAssignmentLanguage.g:398:1: rule__PlusMinusExp__Group__1 : rule__PlusMinusExp__Group__1__Impl ;
    public final void rule__PlusMinusExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:402:1: ( rule__PlusMinusExp__Group__1__Impl )
            // InternalMathAssignmentLanguage.g:403:2: rule__PlusMinusExp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusExp__Group__1__Impl();

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
    // $ANTLR end "rule__PlusMinusExp__Group__1"


    // $ANTLR start "rule__PlusMinusExp__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:409:1: rule__PlusMinusExp__Group__1__Impl : ( ( rule__PlusMinusExp__Group_1__0 )* ) ;
    public final void rule__PlusMinusExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:413:1: ( ( ( rule__PlusMinusExp__Group_1__0 )* ) )
            // InternalMathAssignmentLanguage.g:414:1: ( ( rule__PlusMinusExp__Group_1__0 )* )
            {
            // InternalMathAssignmentLanguage.g:414:1: ( ( rule__PlusMinusExp__Group_1__0 )* )
            // InternalMathAssignmentLanguage.g:415:2: ( rule__PlusMinusExp__Group_1__0 )*
            {
             before(grammarAccess.getPlusMinusExpAccess().getGroup_1()); 
            // InternalMathAssignmentLanguage.g:416:2: ( rule__PlusMinusExp__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:416:3: rule__PlusMinusExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PlusMinusExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPlusMinusExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusMinusExp__Group__1__Impl"


    // $ANTLR start "rule__PlusMinusExp__Group_1__0"
    // InternalMathAssignmentLanguage.g:425:1: rule__PlusMinusExp__Group_1__0 : rule__PlusMinusExp__Group_1__0__Impl rule__PlusMinusExp__Group_1__1 ;
    public final void rule__PlusMinusExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:429:1: ( rule__PlusMinusExp__Group_1__0__Impl rule__PlusMinusExp__Group_1__1 )
            // InternalMathAssignmentLanguage.g:430:2: rule__PlusMinusExp__Group_1__0__Impl rule__PlusMinusExp__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__PlusMinusExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusExp__Group_1__1();

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
    // $ANTLR end "rule__PlusMinusExp__Group_1__0"


    // $ANTLR start "rule__PlusMinusExp__Group_1__0__Impl"
    // InternalMathAssignmentLanguage.g:437:1: rule__PlusMinusExp__Group_1__0__Impl : ( () ) ;
    public final void rule__PlusMinusExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:441:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:442:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:442:1: ( () )
            // InternalMathAssignmentLanguage.g:443:2: ()
            {
             before(grammarAccess.getPlusMinusExpAccess().getExpLeftAction_1_0()); 
            // InternalMathAssignmentLanguage.g:444:2: ()
            // InternalMathAssignmentLanguage.g:444:3: 
            {
            }

             after(grammarAccess.getPlusMinusExpAccess().getExpLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusExp__Group_1__0__Impl"


    // $ANTLR start "rule__PlusMinusExp__Group_1__1"
    // InternalMathAssignmentLanguage.g:452:1: rule__PlusMinusExp__Group_1__1 : rule__PlusMinusExp__Group_1__1__Impl rule__PlusMinusExp__Group_1__2 ;
    public final void rule__PlusMinusExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:456:1: ( rule__PlusMinusExp__Group_1__1__Impl rule__PlusMinusExp__Group_1__2 )
            // InternalMathAssignmentLanguage.g:457:2: rule__PlusMinusExp__Group_1__1__Impl rule__PlusMinusExp__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__PlusMinusExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusExp__Group_1__2();

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
    // $ANTLR end "rule__PlusMinusExp__Group_1__1"


    // $ANTLR start "rule__PlusMinusExp__Group_1__1__Impl"
    // InternalMathAssignmentLanguage.g:464:1: rule__PlusMinusExp__Group_1__1__Impl : ( ( rule__PlusMinusExp__OperatorAssignment_1_1 ) ) ;
    public final void rule__PlusMinusExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:468:1: ( ( ( rule__PlusMinusExp__OperatorAssignment_1_1 ) ) )
            // InternalMathAssignmentLanguage.g:469:1: ( ( rule__PlusMinusExp__OperatorAssignment_1_1 ) )
            {
            // InternalMathAssignmentLanguage.g:469:1: ( ( rule__PlusMinusExp__OperatorAssignment_1_1 ) )
            // InternalMathAssignmentLanguage.g:470:2: ( rule__PlusMinusExp__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getPlusMinusExpAccess().getOperatorAssignment_1_1()); 
            // InternalMathAssignmentLanguage.g:471:2: ( rule__PlusMinusExp__OperatorAssignment_1_1 )
            // InternalMathAssignmentLanguage.g:471:3: rule__PlusMinusExp__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusExp__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusExpAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__PlusMinusExp__Group_1__1__Impl"


    // $ANTLR start "rule__PlusMinusExp__Group_1__2"
    // InternalMathAssignmentLanguage.g:479:1: rule__PlusMinusExp__Group_1__2 : rule__PlusMinusExp__Group_1__2__Impl ;
    public final void rule__PlusMinusExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:483:1: ( rule__PlusMinusExp__Group_1__2__Impl )
            // InternalMathAssignmentLanguage.g:484:2: rule__PlusMinusExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusExp__Group_1__2__Impl();

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
    // $ANTLR end "rule__PlusMinusExp__Group_1__2"


    // $ANTLR start "rule__PlusMinusExp__Group_1__2__Impl"
    // InternalMathAssignmentLanguage.g:490:1: rule__PlusMinusExp__Group_1__2__Impl : ( ( rule__PlusMinusExp__RightAssignment_1_2 ) ) ;
    public final void rule__PlusMinusExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:494:1: ( ( ( rule__PlusMinusExp__RightAssignment_1_2 ) ) )
            // InternalMathAssignmentLanguage.g:495:1: ( ( rule__PlusMinusExp__RightAssignment_1_2 ) )
            {
            // InternalMathAssignmentLanguage.g:495:1: ( ( rule__PlusMinusExp__RightAssignment_1_2 ) )
            // InternalMathAssignmentLanguage.g:496:2: ( rule__PlusMinusExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getPlusMinusExpAccess().getRightAssignment_1_2()); 
            // InternalMathAssignmentLanguage.g:497:2: ( rule__PlusMinusExp__RightAssignment_1_2 )
            // InternalMathAssignmentLanguage.g:497:3: rule__PlusMinusExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusExp__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusExpAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__PlusMinusExp__Group_1__2__Impl"


    // $ANTLR start "rule__MulOrDivExp__Group__0"
    // InternalMathAssignmentLanguage.g:506:1: rule__MulOrDivExp__Group__0 : rule__MulOrDivExp__Group__0__Impl rule__MulOrDivExp__Group__1 ;
    public final void rule__MulOrDivExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:510:1: ( rule__MulOrDivExp__Group__0__Impl rule__MulOrDivExp__Group__1 )
            // InternalMathAssignmentLanguage.g:511:2: rule__MulOrDivExp__Group__0__Impl rule__MulOrDivExp__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MulOrDivExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDivExp__Group__1();

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
    // $ANTLR end "rule__MulOrDivExp__Group__0"


    // $ANTLR start "rule__MulOrDivExp__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:518:1: rule__MulOrDivExp__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDivExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:522:1: ( ( rulePrimary ) )
            // InternalMathAssignmentLanguage.g:523:1: ( rulePrimary )
            {
            // InternalMathAssignmentLanguage.g:523:1: ( rulePrimary )
            // InternalMathAssignmentLanguage.g:524:2: rulePrimary
            {
             before(grammarAccess.getMulOrDivExpAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivExpAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__MulOrDivExp__Group__0__Impl"


    // $ANTLR start "rule__MulOrDivExp__Group__1"
    // InternalMathAssignmentLanguage.g:533:1: rule__MulOrDivExp__Group__1 : rule__MulOrDivExp__Group__1__Impl ;
    public final void rule__MulOrDivExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:537:1: ( rule__MulOrDivExp__Group__1__Impl )
            // InternalMathAssignmentLanguage.g:538:2: rule__MulOrDivExp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDivExp__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDivExp__Group__1"


    // $ANTLR start "rule__MulOrDivExp__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:544:1: rule__MulOrDivExp__Group__1__Impl : ( ( rule__MulOrDivExp__Group_1__0 )* ) ;
    public final void rule__MulOrDivExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:548:1: ( ( ( rule__MulOrDivExp__Group_1__0 )* ) )
            // InternalMathAssignmentLanguage.g:549:1: ( ( rule__MulOrDivExp__Group_1__0 )* )
            {
            // InternalMathAssignmentLanguage.g:549:1: ( ( rule__MulOrDivExp__Group_1__0 )* )
            // InternalMathAssignmentLanguage.g:550:2: ( rule__MulOrDivExp__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivExpAccess().getGroup_1()); 
            // InternalMathAssignmentLanguage.g:551:2: ( rule__MulOrDivExp__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:551:3: rule__MulOrDivExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MulOrDivExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMulOrDivExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MulOrDivExp__Group__1__Impl"


    // $ANTLR start "rule__MulOrDivExp__Group_1__0"
    // InternalMathAssignmentLanguage.g:560:1: rule__MulOrDivExp__Group_1__0 : rule__MulOrDivExp__Group_1__0__Impl rule__MulOrDivExp__Group_1__1 ;
    public final void rule__MulOrDivExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:564:1: ( rule__MulOrDivExp__Group_1__0__Impl rule__MulOrDivExp__Group_1__1 )
            // InternalMathAssignmentLanguage.g:565:2: rule__MulOrDivExp__Group_1__0__Impl rule__MulOrDivExp__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__MulOrDivExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDivExp__Group_1__1();

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
    // $ANTLR end "rule__MulOrDivExp__Group_1__0"


    // $ANTLR start "rule__MulOrDivExp__Group_1__0__Impl"
    // InternalMathAssignmentLanguage.g:572:1: rule__MulOrDivExp__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDivExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:576:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:577:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:577:1: ( () )
            // InternalMathAssignmentLanguage.g:578:2: ()
            {
             before(grammarAccess.getMulOrDivExpAccess().getExpLeftAction_1_0()); 
            // InternalMathAssignmentLanguage.g:579:2: ()
            // InternalMathAssignmentLanguage.g:579:3: 
            {
            }

             after(grammarAccess.getMulOrDivExpAccess().getExpLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDivExp__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDivExp__Group_1__1"
    // InternalMathAssignmentLanguage.g:587:1: rule__MulOrDivExp__Group_1__1 : rule__MulOrDivExp__Group_1__1__Impl rule__MulOrDivExp__Group_1__2 ;
    public final void rule__MulOrDivExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:591:1: ( rule__MulOrDivExp__Group_1__1__Impl rule__MulOrDivExp__Group_1__2 )
            // InternalMathAssignmentLanguage.g:592:2: rule__MulOrDivExp__Group_1__1__Impl rule__MulOrDivExp__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__MulOrDivExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDivExp__Group_1__2();

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
    // $ANTLR end "rule__MulOrDivExp__Group_1__1"


    // $ANTLR start "rule__MulOrDivExp__Group_1__1__Impl"
    // InternalMathAssignmentLanguage.g:599:1: rule__MulOrDivExp__Group_1__1__Impl : ( ( rule__MulOrDivExp__OperatorAssignment_1_1 ) ) ;
    public final void rule__MulOrDivExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:603:1: ( ( ( rule__MulOrDivExp__OperatorAssignment_1_1 ) ) )
            // InternalMathAssignmentLanguage.g:604:1: ( ( rule__MulOrDivExp__OperatorAssignment_1_1 ) )
            {
            // InternalMathAssignmentLanguage.g:604:1: ( ( rule__MulOrDivExp__OperatorAssignment_1_1 ) )
            // InternalMathAssignmentLanguage.g:605:2: ( rule__MulOrDivExp__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivExpAccess().getOperatorAssignment_1_1()); 
            // InternalMathAssignmentLanguage.g:606:2: ( rule__MulOrDivExp__OperatorAssignment_1_1 )
            // InternalMathAssignmentLanguage.g:606:3: rule__MulOrDivExp__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDivExp__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivExpAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__MulOrDivExp__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDivExp__Group_1__2"
    // InternalMathAssignmentLanguage.g:614:1: rule__MulOrDivExp__Group_1__2 : rule__MulOrDivExp__Group_1__2__Impl ;
    public final void rule__MulOrDivExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:618:1: ( rule__MulOrDivExp__Group_1__2__Impl )
            // InternalMathAssignmentLanguage.g:619:2: rule__MulOrDivExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDivExp__Group_1__2__Impl();

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
    // $ANTLR end "rule__MulOrDivExp__Group_1__2"


    // $ANTLR start "rule__MulOrDivExp__Group_1__2__Impl"
    // InternalMathAssignmentLanguage.g:625:1: rule__MulOrDivExp__Group_1__2__Impl : ( ( rule__MulOrDivExp__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDivExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:629:1: ( ( ( rule__MulOrDivExp__RightAssignment_1_2 ) ) )
            // InternalMathAssignmentLanguage.g:630:1: ( ( rule__MulOrDivExp__RightAssignment_1_2 ) )
            {
            // InternalMathAssignmentLanguage.g:630:1: ( ( rule__MulOrDivExp__RightAssignment_1_2 ) )
            // InternalMathAssignmentLanguage.g:631:2: ( rule__MulOrDivExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivExpAccess().getRightAssignment_1_2()); 
            // InternalMathAssignmentLanguage.g:632:2: ( rule__MulOrDivExp__RightAssignment_1_2 )
            // InternalMathAssignmentLanguage.g:632:3: rule__MulOrDivExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDivExp__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivExpAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__MulOrDivExp__Group_1__2__Impl"


    // $ANTLR start "rule__MultDivOp__Group_0__0"
    // InternalMathAssignmentLanguage.g:641:1: rule__MultDivOp__Group_0__0 : rule__MultDivOp__Group_0__0__Impl rule__MultDivOp__Group_0__1 ;
    public final void rule__MultDivOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:645:1: ( rule__MultDivOp__Group_0__0__Impl rule__MultDivOp__Group_0__1 )
            // InternalMathAssignmentLanguage.g:646:2: rule__MultDivOp__Group_0__0__Impl rule__MultDivOp__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__MultDivOp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultDivOp__Group_0__1();

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
    // $ANTLR end "rule__MultDivOp__Group_0__0"


    // $ANTLR start "rule__MultDivOp__Group_0__0__Impl"
    // InternalMathAssignmentLanguage.g:653:1: rule__MultDivOp__Group_0__0__Impl : ( () ) ;
    public final void rule__MultDivOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:657:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:658:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:658:1: ( () )
            // InternalMathAssignmentLanguage.g:659:2: ()
            {
             before(grammarAccess.getMultDivOpAccess().getMultAction_0_0()); 
            // InternalMathAssignmentLanguage.g:660:2: ()
            // InternalMathAssignmentLanguage.g:660:3: 
            {
            }

             after(grammarAccess.getMultDivOpAccess().getMultAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDivOp__Group_0__0__Impl"


    // $ANTLR start "rule__MultDivOp__Group_0__1"
    // InternalMathAssignmentLanguage.g:668:1: rule__MultDivOp__Group_0__1 : rule__MultDivOp__Group_0__1__Impl ;
    public final void rule__MultDivOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:672:1: ( rule__MultDivOp__Group_0__1__Impl )
            // InternalMathAssignmentLanguage.g:673:2: rule__MultDivOp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultDivOp__Group_0__1__Impl();

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
    // $ANTLR end "rule__MultDivOp__Group_0__1"


    // $ANTLR start "rule__MultDivOp__Group_0__1__Impl"
    // InternalMathAssignmentLanguage.g:679:1: rule__MultDivOp__Group_0__1__Impl : ( '*' ) ;
    public final void rule__MultDivOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:683:1: ( ( '*' ) )
            // InternalMathAssignmentLanguage.g:684:1: ( '*' )
            {
            // InternalMathAssignmentLanguage.g:684:1: ( '*' )
            // InternalMathAssignmentLanguage.g:685:2: '*'
            {
             before(grammarAccess.getMultDivOpAccess().getAsteriskKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMultDivOpAccess().getAsteriskKeyword_0_1()); 

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
    // $ANTLR end "rule__MultDivOp__Group_0__1__Impl"


    // $ANTLR start "rule__MultDivOp__Group_1__0"
    // InternalMathAssignmentLanguage.g:695:1: rule__MultDivOp__Group_1__0 : rule__MultDivOp__Group_1__0__Impl rule__MultDivOp__Group_1__1 ;
    public final void rule__MultDivOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:699:1: ( rule__MultDivOp__Group_1__0__Impl rule__MultDivOp__Group_1__1 )
            // InternalMathAssignmentLanguage.g:700:2: rule__MultDivOp__Group_1__0__Impl rule__MultDivOp__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__MultDivOp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultDivOp__Group_1__1();

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
    // $ANTLR end "rule__MultDivOp__Group_1__0"


    // $ANTLR start "rule__MultDivOp__Group_1__0__Impl"
    // InternalMathAssignmentLanguage.g:707:1: rule__MultDivOp__Group_1__0__Impl : ( () ) ;
    public final void rule__MultDivOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:711:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:712:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:712:1: ( () )
            // InternalMathAssignmentLanguage.g:713:2: ()
            {
             before(grammarAccess.getMultDivOpAccess().getDivAction_1_0()); 
            // InternalMathAssignmentLanguage.g:714:2: ()
            // InternalMathAssignmentLanguage.g:714:3: 
            {
            }

             after(grammarAccess.getMultDivOpAccess().getDivAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDivOp__Group_1__0__Impl"


    // $ANTLR start "rule__MultDivOp__Group_1__1"
    // InternalMathAssignmentLanguage.g:722:1: rule__MultDivOp__Group_1__1 : rule__MultDivOp__Group_1__1__Impl ;
    public final void rule__MultDivOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:726:1: ( rule__MultDivOp__Group_1__1__Impl )
            // InternalMathAssignmentLanguage.g:727:2: rule__MultDivOp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultDivOp__Group_1__1__Impl();

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
    // $ANTLR end "rule__MultDivOp__Group_1__1"


    // $ANTLR start "rule__MultDivOp__Group_1__1__Impl"
    // InternalMathAssignmentLanguage.g:733:1: rule__MultDivOp__Group_1__1__Impl : ( '/' ) ;
    public final void rule__MultDivOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:737:1: ( ( '/' ) )
            // InternalMathAssignmentLanguage.g:738:1: ( '/' )
            {
            // InternalMathAssignmentLanguage.g:738:1: ( '/' )
            // InternalMathAssignmentLanguage.g:739:2: '/'
            {
             before(grammarAccess.getMultDivOpAccess().getSolidusKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMultDivOpAccess().getSolidusKeyword_1_1()); 

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
    // $ANTLR end "rule__MultDivOp__Group_1__1__Impl"


    // $ANTLR start "rule__PlusMinusOp__Group_0__0"
    // InternalMathAssignmentLanguage.g:749:1: rule__PlusMinusOp__Group_0__0 : rule__PlusMinusOp__Group_0__0__Impl rule__PlusMinusOp__Group_0__1 ;
    public final void rule__PlusMinusOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:753:1: ( rule__PlusMinusOp__Group_0__0__Impl rule__PlusMinusOp__Group_0__1 )
            // InternalMathAssignmentLanguage.g:754:2: rule__PlusMinusOp__Group_0__0__Impl rule__PlusMinusOp__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__PlusMinusOp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusOp__Group_0__1();

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
    // $ANTLR end "rule__PlusMinusOp__Group_0__0"


    // $ANTLR start "rule__PlusMinusOp__Group_0__0__Impl"
    // InternalMathAssignmentLanguage.g:761:1: rule__PlusMinusOp__Group_0__0__Impl : ( () ) ;
    public final void rule__PlusMinusOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:765:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:766:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:766:1: ( () )
            // InternalMathAssignmentLanguage.g:767:2: ()
            {
             before(grammarAccess.getPlusMinusOpAccess().getPlusAction_0_0()); 
            // InternalMathAssignmentLanguage.g:768:2: ()
            // InternalMathAssignmentLanguage.g:768:3: 
            {
            }

             after(grammarAccess.getPlusMinusOpAccess().getPlusAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusOp__Group_0__0__Impl"


    // $ANTLR start "rule__PlusMinusOp__Group_0__1"
    // InternalMathAssignmentLanguage.g:776:1: rule__PlusMinusOp__Group_0__1 : rule__PlusMinusOp__Group_0__1__Impl ;
    public final void rule__PlusMinusOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:780:1: ( rule__PlusMinusOp__Group_0__1__Impl )
            // InternalMathAssignmentLanguage.g:781:2: rule__PlusMinusOp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusOp__Group_0__1__Impl();

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
    // $ANTLR end "rule__PlusMinusOp__Group_0__1"


    // $ANTLR start "rule__PlusMinusOp__Group_0__1__Impl"
    // InternalMathAssignmentLanguage.g:787:1: rule__PlusMinusOp__Group_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinusOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:791:1: ( ( '+' ) )
            // InternalMathAssignmentLanguage.g:792:1: ( '+' )
            {
            // InternalMathAssignmentLanguage.g:792:1: ( '+' )
            // InternalMathAssignmentLanguage.g:793:2: '+'
            {
             before(grammarAccess.getPlusMinusOpAccess().getPlusSignKeyword_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlusMinusOpAccess().getPlusSignKeyword_0_1()); 

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
    // $ANTLR end "rule__PlusMinusOp__Group_0__1__Impl"


    // $ANTLR start "rule__PlusMinusOp__Group_1__0"
    // InternalMathAssignmentLanguage.g:803:1: rule__PlusMinusOp__Group_1__0 : rule__PlusMinusOp__Group_1__0__Impl rule__PlusMinusOp__Group_1__1 ;
    public final void rule__PlusMinusOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:807:1: ( rule__PlusMinusOp__Group_1__0__Impl rule__PlusMinusOp__Group_1__1 )
            // InternalMathAssignmentLanguage.g:808:2: rule__PlusMinusOp__Group_1__0__Impl rule__PlusMinusOp__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__PlusMinusOp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusOp__Group_1__1();

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
    // $ANTLR end "rule__PlusMinusOp__Group_1__0"


    // $ANTLR start "rule__PlusMinusOp__Group_1__0__Impl"
    // InternalMathAssignmentLanguage.g:815:1: rule__PlusMinusOp__Group_1__0__Impl : ( () ) ;
    public final void rule__PlusMinusOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:819:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:820:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:820:1: ( () )
            // InternalMathAssignmentLanguage.g:821:2: ()
            {
             before(grammarAccess.getPlusMinusOpAccess().getMinusAction_1_0()); 
            // InternalMathAssignmentLanguage.g:822:2: ()
            // InternalMathAssignmentLanguage.g:822:3: 
            {
            }

             after(grammarAccess.getPlusMinusOpAccess().getMinusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusOp__Group_1__0__Impl"


    // $ANTLR start "rule__PlusMinusOp__Group_1__1"
    // InternalMathAssignmentLanguage.g:830:1: rule__PlusMinusOp__Group_1__1 : rule__PlusMinusOp__Group_1__1__Impl ;
    public final void rule__PlusMinusOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:834:1: ( rule__PlusMinusOp__Group_1__1__Impl )
            // InternalMathAssignmentLanguage.g:835:2: rule__PlusMinusOp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusOp__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusMinusOp__Group_1__1"


    // $ANTLR start "rule__PlusMinusOp__Group_1__1__Impl"
    // InternalMathAssignmentLanguage.g:841:1: rule__PlusMinusOp__Group_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinusOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:845:1: ( ( '-' ) )
            // InternalMathAssignmentLanguage.g:846:1: ( '-' )
            {
            // InternalMathAssignmentLanguage.g:846:1: ( '-' )
            // InternalMathAssignmentLanguage.g:847:2: '-'
            {
             before(grammarAccess.getPlusMinusOpAccess().getHyphenMinusKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlusMinusOpAccess().getHyphenMinusKeyword_1_1()); 

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
    // $ANTLR end "rule__PlusMinusOp__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMathAssignmentLanguage.g:857:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:861:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMathAssignmentLanguage.g:862:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMathAssignmentLanguage.g:869:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:873:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:874:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:874:1: ( () )
            // InternalMathAssignmentLanguage.g:875:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNumberAction_0_0()); 
            // InternalMathAssignmentLanguage.g:876:2: ()
            // InternalMathAssignmentLanguage.g:876:3: 
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
    // InternalMathAssignmentLanguage.g:884:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:888:1: ( rule__Primary__Group_0__1__Impl )
            // InternalMathAssignmentLanguage.g:889:2: rule__Primary__Group_0__1__Impl
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
    // InternalMathAssignmentLanguage.g:895:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:899:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalMathAssignmentLanguage.g:900:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalMathAssignmentLanguage.g:900:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalMathAssignmentLanguage.g:901:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalMathAssignmentLanguage.g:902:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalMathAssignmentLanguage.g:902:3: rule__Primary__ValueAssignment_0_1
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
    // InternalMathAssignmentLanguage.g:911:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:915:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMathAssignmentLanguage.g:916:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
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
    // InternalMathAssignmentLanguage.g:923:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:927:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:928:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:928:1: ( () )
            // InternalMathAssignmentLanguage.g:929:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getParenthesisAction_1_0()); 
            // InternalMathAssignmentLanguage.g:930:2: ()
            // InternalMathAssignmentLanguage.g:930:3: 
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
    // InternalMathAssignmentLanguage.g:938:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:942:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMathAssignmentLanguage.g:943:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalMathAssignmentLanguage.g:950:1: rule__Primary__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:954:1: ( ( '(' ) )
            // InternalMathAssignmentLanguage.g:955:1: ( '(' )
            {
            // InternalMathAssignmentLanguage.g:955:1: ( '(' )
            // InternalMathAssignmentLanguage.g:956:2: '('
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
    // InternalMathAssignmentLanguage.g:965:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:969:1: ( rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 )
            // InternalMathAssignmentLanguage.g:970:2: rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMathAssignmentLanguage.g:977:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:981:1: ( ( ( rule__Primary__ExpAssignment_1_2 ) ) )
            // InternalMathAssignmentLanguage.g:982:1: ( ( rule__Primary__ExpAssignment_1_2 ) )
            {
            // InternalMathAssignmentLanguage.g:982:1: ( ( rule__Primary__ExpAssignment_1_2 ) )
            // InternalMathAssignmentLanguage.g:983:2: ( rule__Primary__ExpAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpAssignment_1_2()); 
            // InternalMathAssignmentLanguage.g:984:2: ( rule__Primary__ExpAssignment_1_2 )
            // InternalMathAssignmentLanguage.g:984:3: rule__Primary__ExpAssignment_1_2
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
    // InternalMathAssignmentLanguage.g:992:1: rule__Primary__Group_1__3 : rule__Primary__Group_1__3__Impl ;
    public final void rule__Primary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:996:1: ( rule__Primary__Group_1__3__Impl )
            // InternalMathAssignmentLanguage.g:997:2: rule__Primary__Group_1__3__Impl
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
    // InternalMathAssignmentLanguage.g:1003:1: rule__Primary__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1007:1: ( ( ')' ) )
            // InternalMathAssignmentLanguage.g:1008:1: ( ')' )
            {
            // InternalMathAssignmentLanguage.g:1008:1: ( ')' )
            // InternalMathAssignmentLanguage.g:1009:2: ')'
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
    // InternalMathAssignmentLanguage.g:1019:1: rule__MathExp__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1023:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:1024:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:1024:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:1025:3: ruleExp
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


    // $ANTLR start "rule__PlusMinusExp__OperatorAssignment_1_1"
    // InternalMathAssignmentLanguage.g:1034:1: rule__PlusMinusExp__OperatorAssignment_1_1 : ( rulePlusMinusOp ) ;
    public final void rule__PlusMinusExp__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1038:1: ( ( rulePlusMinusOp ) )
            // InternalMathAssignmentLanguage.g:1039:2: ( rulePlusMinusOp )
            {
            // InternalMathAssignmentLanguage.g:1039:2: ( rulePlusMinusOp )
            // InternalMathAssignmentLanguage.g:1040:3: rulePlusMinusOp
            {
             before(grammarAccess.getPlusMinusExpAccess().getOperatorPlusMinusOpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusOp();

            state._fsp--;

             after(grammarAccess.getPlusMinusExpAccess().getOperatorPlusMinusOpParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PlusMinusExp__OperatorAssignment_1_1"


    // $ANTLR start "rule__PlusMinusExp__RightAssignment_1_2"
    // InternalMathAssignmentLanguage.g:1049:1: rule__PlusMinusExp__RightAssignment_1_2 : ( ruleMulOrDivExp ) ;
    public final void rule__PlusMinusExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1053:1: ( ( ruleMulOrDivExp ) )
            // InternalMathAssignmentLanguage.g:1054:2: ( ruleMulOrDivExp )
            {
            // InternalMathAssignmentLanguage.g:1054:2: ( ruleMulOrDivExp )
            // InternalMathAssignmentLanguage.g:1055:3: ruleMulOrDivExp
            {
             before(grammarAccess.getPlusMinusExpAccess().getRightMulOrDivExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDivExp();

            state._fsp--;

             after(grammarAccess.getPlusMinusExpAccess().getRightMulOrDivExpParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__PlusMinusExp__RightAssignment_1_2"


    // $ANTLR start "rule__MulOrDivExp__OperatorAssignment_1_1"
    // InternalMathAssignmentLanguage.g:1064:1: rule__MulOrDivExp__OperatorAssignment_1_1 : ( ruleMultDivOp ) ;
    public final void rule__MulOrDivExp__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1068:1: ( ( ruleMultDivOp ) )
            // InternalMathAssignmentLanguage.g:1069:2: ( ruleMultDivOp )
            {
            // InternalMathAssignmentLanguage.g:1069:2: ( ruleMultDivOp )
            // InternalMathAssignmentLanguage.g:1070:3: ruleMultDivOp
            {
             before(grammarAccess.getMulOrDivExpAccess().getOperatorMultDivOpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultDivOp();

            state._fsp--;

             after(grammarAccess.getMulOrDivExpAccess().getOperatorMultDivOpParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MulOrDivExp__OperatorAssignment_1_1"


    // $ANTLR start "rule__MulOrDivExp__RightAssignment_1_2"
    // InternalMathAssignmentLanguage.g:1079:1: rule__MulOrDivExp__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDivExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1083:1: ( ( rulePrimary ) )
            // InternalMathAssignmentLanguage.g:1084:2: ( rulePrimary )
            {
            // InternalMathAssignmentLanguage.g:1084:2: ( rulePrimary )
            // InternalMathAssignmentLanguage.g:1085:3: rulePrimary
            {
             before(grammarAccess.getMulOrDivExpAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivExpAccess().getRightPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MulOrDivExp__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalMathAssignmentLanguage.g:1094:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1098:1: ( ( RULE_INT ) )
            // InternalMathAssignmentLanguage.g:1099:2: ( RULE_INT )
            {
            // InternalMathAssignmentLanguage.g:1099:2: ( RULE_INT )
            // InternalMathAssignmentLanguage.g:1100:3: RULE_INT
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
    // InternalMathAssignmentLanguage.g:1109:1: rule__Primary__ExpAssignment_1_2 : ( ruleExp ) ;
    public final void rule__Primary__ExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1113:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:1114:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:1114:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:1115:3: ruleExp
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});

}