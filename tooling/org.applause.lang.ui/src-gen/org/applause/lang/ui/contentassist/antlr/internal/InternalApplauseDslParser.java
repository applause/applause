package org.applause.lang.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.applause.lang.services.ApplauseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'datatype'", "'entity'", "'{'", "'}'", "'extends'", "'platform'", "'typemapping'", "'->'", "'datasource'", "'baseUrl'", "':'", "'resource'", "'('", "')'", "','", "'http://'", "'/'", "'.'", "'abstract'", "'[]'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalApplauseDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalApplauseDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalApplauseDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g"; }


     
     	private ApplauseDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ApplauseDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:61:1: ( ruleModel EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:69:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:73:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:75:1: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:76:1: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)||LA1_0==20||LA1_0==23||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:76:2: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNamedElement"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:88:1: entryRuleNamedElement : ruleNamedElement EOF ;
    public final void entryRuleNamedElement() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:89:1: ( ruleNamedElement EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:90:1: ruleNamedElement EOF
            {
             before(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_ruleNamedElement_in_entryRuleNamedElement122);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getNamedElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedElement129); 

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
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:97:1: ruleNamedElement : ( ( rule__NamedElement__Alternatives ) ) ;
    public final void ruleNamedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:101:2: ( ( ( rule__NamedElement__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:102:1: ( ( rule__NamedElement__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:102:1: ( ( rule__NamedElement__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:103:1: ( rule__NamedElement__Alternatives )
            {
             before(grammarAccess.getNamedElementAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:104:1: ( rule__NamedElement__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:104:2: rule__NamedElement__Alternatives
            {
            pushFollow(FOLLOW_rule__NamedElement__Alternatives_in_ruleNamedElement155);
            rule__NamedElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamedElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleType"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:117:1: ( ruleType EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType182);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType189); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:130:1: ( ( rule__Type__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:132:1: ( rule__Type__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType215);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:144:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:145:1: ( ruleDataType EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:146:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType242);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType249); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:153:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:157:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:158:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:158:1: ( ( rule__DataType__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:159:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:160:1: ( rule__DataType__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:160:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType275);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:172:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:173:1: ( ruleEntity EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:174:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity302);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity309); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:181:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:185:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:186:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:186:1: ( ( rule__Entity__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:187:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:188:1: ( rule__Entity__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:188:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity335);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:200:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:201:1: ( ruleAttribute EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:202:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute362);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute369); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:209:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:213:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:214:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:214:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:215:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:216:1: ( rule__Attribute__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:216:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute395);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRulePlatform"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:228:1: entryRulePlatform : rulePlatform EOF ;
    public final void entryRulePlatform() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:229:1: ( rulePlatform EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:230:1: rulePlatform EOF
            {
             before(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform422);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getPlatformRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform429); 

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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:237:1: rulePlatform : ( ( rule__Platform__Group__0 ) ) ;
    public final void rulePlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:241:2: ( ( ( rule__Platform__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:242:1: ( ( rule__Platform__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:242:1: ( ( rule__Platform__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:243:1: ( rule__Platform__Group__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:244:1: ( rule__Platform__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:244:2: rule__Platform__Group__0
            {
            pushFollow(FOLLOW_rule__Platform__Group__0_in_rulePlatform455);
            rule__Platform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGroup()); 

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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRulePlatformMapping"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:256:1: entryRulePlatformMapping : rulePlatformMapping EOF ;
    public final void entryRulePlatformMapping() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:257:1: ( rulePlatformMapping EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:258:1: rulePlatformMapping EOF
            {
             before(grammarAccess.getPlatformMappingRule()); 
            pushFollow(FOLLOW_rulePlatformMapping_in_entryRulePlatformMapping482);
            rulePlatformMapping();

            state._fsp--;

             after(grammarAccess.getPlatformMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatformMapping489); 

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
    // $ANTLR end "entryRulePlatformMapping"


    // $ANTLR start "rulePlatformMapping"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:265:1: rulePlatformMapping : ( ruleTypeMapping ) ;
    public final void rulePlatformMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:269:2: ( ( ruleTypeMapping ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:270:1: ( ruleTypeMapping )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:270:1: ( ruleTypeMapping )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:271:1: ruleTypeMapping
            {
             before(grammarAccess.getPlatformMappingAccess().getTypeMappingParserRuleCall()); 
            pushFollow(FOLLOW_ruleTypeMapping_in_rulePlatformMapping515);
            ruleTypeMapping();

            state._fsp--;

             after(grammarAccess.getPlatformMappingAccess().getTypeMappingParserRuleCall()); 

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
    // $ANTLR end "rulePlatformMapping"


    // $ANTLR start "entryRuleTypeMapping"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:284:1: entryRuleTypeMapping : ruleTypeMapping EOF ;
    public final void entryRuleTypeMapping() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:285:1: ( ruleTypeMapping EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:286:1: ruleTypeMapping EOF
            {
             before(grammarAccess.getTypeMappingRule()); 
            pushFollow(FOLLOW_ruleTypeMapping_in_entryRuleTypeMapping541);
            ruleTypeMapping();

            state._fsp--;

             after(grammarAccess.getTypeMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMapping548); 

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
    // $ANTLR end "entryRuleTypeMapping"


    // $ANTLR start "ruleTypeMapping"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:293:1: ruleTypeMapping : ( ( rule__TypeMapping__Group__0 ) ) ;
    public final void ruleTypeMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:297:2: ( ( ( rule__TypeMapping__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:298:1: ( ( rule__TypeMapping__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:298:1: ( ( rule__TypeMapping__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:299:1: ( rule__TypeMapping__Group__0 )
            {
             before(grammarAccess.getTypeMappingAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:300:1: ( rule__TypeMapping__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:300:2: rule__TypeMapping__Group__0
            {
            pushFollow(FOLLOW_rule__TypeMapping__Group__0_in_ruleTypeMapping574);
            rule__TypeMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeMappingAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeMapping"


    // $ANTLR start "entryRuleDataSource"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:312:1: entryRuleDataSource : ruleDataSource EOF ;
    public final void entryRuleDataSource() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:313:1: ( ruleDataSource EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:314:1: ruleDataSource EOF
            {
             before(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_ruleDataSource_in_entryRuleDataSource601);
            ruleDataSource();

            state._fsp--;

             after(grammarAccess.getDataSourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSource608); 

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
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:321:1: ruleDataSource : ( ( rule__DataSource__Group__0 ) ) ;
    public final void ruleDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:325:2: ( ( ( rule__DataSource__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:326:1: ( ( rule__DataSource__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:326:1: ( ( rule__DataSource__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:327:1: ( rule__DataSource__Group__0 )
            {
             before(grammarAccess.getDataSourceAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:328:1: ( rule__DataSource__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:328:2: rule__DataSource__Group__0
            {
            pushFollow(FOLLOW_rule__DataSource__Group__0_in_ruleDataSource634);
            rule__DataSource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getGroup()); 

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
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleDataSourceAccessMethod"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:340:1: entryRuleDataSourceAccessMethod : ruleDataSourceAccessMethod EOF ;
    public final void entryRuleDataSourceAccessMethod() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:341:1: ( ruleDataSourceAccessMethod EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:342:1: ruleDataSourceAccessMethod EOF
            {
             before(grammarAccess.getDataSourceAccessMethodRule()); 
            pushFollow(FOLLOW_ruleDataSourceAccessMethod_in_entryRuleDataSourceAccessMethod661);
            ruleDataSourceAccessMethod();

            state._fsp--;

             after(grammarAccess.getDataSourceAccessMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceAccessMethod668); 

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
    // $ANTLR end "entryRuleDataSourceAccessMethod"


    // $ANTLR start "ruleDataSourceAccessMethod"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:349:1: ruleDataSourceAccessMethod : ( ( rule__DataSourceAccessMethod__Group__0 ) ) ;
    public final void ruleDataSourceAccessMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:353:2: ( ( ( rule__DataSourceAccessMethod__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:354:1: ( ( rule__DataSourceAccessMethod__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:354:1: ( ( rule__DataSourceAccessMethod__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:355:1: ( rule__DataSourceAccessMethod__Group__0 )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:356:1: ( rule__DataSourceAccessMethod__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:356:2: rule__DataSourceAccessMethod__Group__0
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__0_in_ruleDataSourceAccessMethod694);
            rule__DataSourceAccessMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccessMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleDataSourceAccessMethod"


    // $ANTLR start "entryRuleRESTSpecification"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:368:1: entryRuleRESTSpecification : ruleRESTSpecification EOF ;
    public final void entryRuleRESTSpecification() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:369:1: ( ruleRESTSpecification EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:370:1: ruleRESTSpecification EOF
            {
             before(grammarAccess.getRESTSpecificationRule()); 
            pushFollow(FOLLOW_ruleRESTSpecification_in_entryRuleRESTSpecification721);
            ruleRESTSpecification();

            state._fsp--;

             after(grammarAccess.getRESTSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTSpecification728); 

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
    // $ANTLR end "entryRuleRESTSpecification"


    // $ANTLR start "ruleRESTSpecification"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:377:1: ruleRESTSpecification : ( ( rule__RESTSpecification__Group__0 ) ) ;
    public final void ruleRESTSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:381:2: ( ( ( rule__RESTSpecification__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:382:1: ( ( rule__RESTSpecification__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:382:1: ( ( rule__RESTSpecification__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:383:1: ( rule__RESTSpecification__Group__0 )
            {
             before(grammarAccess.getRESTSpecificationAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:384:1: ( rule__RESTSpecification__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:384:2: rule__RESTSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group__0_in_ruleRESTSpecification754);
            rule__RESTSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRESTSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleRESTSpecification"


    // $ANTLR start "entryRuleDataSourceBodySpecification"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:396:1: entryRuleDataSourceBodySpecification : ruleDataSourceBodySpecification EOF ;
    public final void entryRuleDataSourceBodySpecification() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:397:1: ( ruleDataSourceBodySpecification EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:398:1: ruleDataSourceBodySpecification EOF
            {
             before(grammarAccess.getDataSourceBodySpecificationRule()); 
            pushFollow(FOLLOW_ruleDataSourceBodySpecification_in_entryRuleDataSourceBodySpecification781);
            ruleDataSourceBodySpecification();

            state._fsp--;

             after(grammarAccess.getDataSourceBodySpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceBodySpecification788); 

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
    // $ANTLR end "entryRuleDataSourceBodySpecification"


    // $ANTLR start "ruleDataSourceBodySpecification"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:405:1: ruleDataSourceBodySpecification : ( ( rule__DataSourceBodySpecification__BodycontentsAssignment ) ) ;
    public final void ruleDataSourceBodySpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:409:2: ( ( ( rule__DataSourceBodySpecification__BodycontentsAssignment ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:410:1: ( ( rule__DataSourceBodySpecification__BodycontentsAssignment ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:410:1: ( ( rule__DataSourceBodySpecification__BodycontentsAssignment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:411:1: ( rule__DataSourceBodySpecification__BodycontentsAssignment )
            {
             before(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsAssignment()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:412:1: ( rule__DataSourceBodySpecification__BodycontentsAssignment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:412:2: rule__DataSourceBodySpecification__BodycontentsAssignment
            {
            pushFollow(FOLLOW_rule__DataSourceBodySpecification__BodycontentsAssignment_in_ruleDataSourceBodySpecification814);
            rule__DataSourceBodySpecification__BodycontentsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsAssignment()); 

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
    // $ANTLR end "ruleDataSourceBodySpecification"


    // $ANTLR start "entryRuleParameter"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:424:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:425:1: ( ruleParameter EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:426:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter841);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter848); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:433:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:437:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:438:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:438:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:439:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:440:1: ( rule__Parameter__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:440:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter874);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRESTURL"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:452:1: entryRuleRESTURL : ruleRESTURL EOF ;
    public final void entryRuleRESTURL() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:453:1: ( ruleRESTURL EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:454:1: ruleRESTURL EOF
            {
             before(grammarAccess.getRESTURLRule()); 
            pushFollow(FOLLOW_ruleRESTURL_in_entryRuleRESTURL901);
            ruleRESTURL();

            state._fsp--;

             after(grammarAccess.getRESTURLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTURL908); 

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
    // $ANTLR end "entryRuleRESTURL"


    // $ANTLR start "ruleRESTURL"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:461:1: ruleRESTURL : ( ( rule__RESTURL__Alternatives ) ) ;
    public final void ruleRESTURL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:465:2: ( ( ( rule__RESTURL__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:466:1: ( ( rule__RESTURL__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:466:1: ( ( rule__RESTURL__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:467:1: ( rule__RESTURL__Alternatives )
            {
             before(grammarAccess.getRESTURLAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:468:1: ( rule__RESTURL__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:468:2: rule__RESTURL__Alternatives
            {
            pushFollow(FOLLOW_rule__RESTURL__Alternatives_in_ruleRESTURL934);
            rule__RESTURL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRESTURLAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRESTURL"


    // $ANTLR start "entryRuleAbsoluteRESTURL"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:480:1: entryRuleAbsoluteRESTURL : ruleAbsoluteRESTURL EOF ;
    public final void entryRuleAbsoluteRESTURL() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:481:1: ( ruleAbsoluteRESTURL EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:482:1: ruleAbsoluteRESTURL EOF
            {
             before(grammarAccess.getAbsoluteRESTURLRule()); 
            pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_entryRuleAbsoluteRESTURL961);
            ruleAbsoluteRESTURL();

            state._fsp--;

             after(grammarAccess.getAbsoluteRESTURLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteRESTURL968); 

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
    // $ANTLR end "entryRuleAbsoluteRESTURL"


    // $ANTLR start "ruleAbsoluteRESTURL"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:489:1: ruleAbsoluteRESTURL : ( ( rule__AbsoluteRESTURL__Group__0 ) ) ;
    public final void ruleAbsoluteRESTURL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:493:2: ( ( ( rule__AbsoluteRESTURL__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:494:1: ( ( rule__AbsoluteRESTURL__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:494:1: ( ( rule__AbsoluteRESTURL__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:495:1: ( rule__AbsoluteRESTURL__Group__0 )
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:496:1: ( rule__AbsoluteRESTURL__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:496:2: rule__AbsoluteRESTURL__Group__0
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__0_in_ruleAbsoluteRESTURL994);
            rule__AbsoluteRESTURL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteRESTURLAccess().getGroup()); 

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
    // $ANTLR end "ruleAbsoluteRESTURL"


    // $ANTLR start "entryRuleRelativeRESTURL"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:508:1: entryRuleRelativeRESTURL : ruleRelativeRESTURL EOF ;
    public final void entryRuleRelativeRESTURL() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:509:1: ( ruleRelativeRESTURL EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:510:1: ruleRelativeRESTURL EOF
            {
             before(grammarAccess.getRelativeRESTURLRule()); 
            pushFollow(FOLLOW_ruleRelativeRESTURL_in_entryRuleRelativeRESTURL1021);
            ruleRelativeRESTURL();

            state._fsp--;

             after(grammarAccess.getRelativeRESTURLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeRESTURL1028); 

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
    // $ANTLR end "entryRuleRelativeRESTURL"


    // $ANTLR start "ruleRelativeRESTURL"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:517:1: ruleRelativeRESTURL : ( ( rule__RelativeRESTURL__Group__0 ) ) ;
    public final void ruleRelativeRESTURL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:521:2: ( ( ( rule__RelativeRESTURL__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:522:1: ( ( rule__RelativeRESTURL__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:522:1: ( ( rule__RelativeRESTURL__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:523:1: ( rule__RelativeRESTURL__Group__0 )
            {
             before(grammarAccess.getRelativeRESTURLAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:524:1: ( rule__RelativeRESTURL__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:524:2: rule__RelativeRESTURL__Group__0
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__0_in_ruleRelativeRESTURL1054);
            rule__RelativeRESTURL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeRESTURLAccess().getGroup()); 

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
    // $ANTLR end "ruleRelativeRESTURL"


    // $ANTLR start "entryRuleUrlFragment"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:536:1: entryRuleUrlFragment : ruleUrlFragment EOF ;
    public final void entryRuleUrlFragment() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:537:1: ( ruleUrlFragment EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:538:1: ruleUrlFragment EOF
            {
             before(grammarAccess.getUrlFragmentRule()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_entryRuleUrlFragment1081);
            ruleUrlFragment();

            state._fsp--;

             after(grammarAccess.getUrlFragmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlFragment1088); 

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
    // $ANTLR end "entryRuleUrlFragment"


    // $ANTLR start "ruleUrlFragment"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:545:1: ruleUrlFragment : ( ( rule__UrlFragment__Alternatives ) ) ;
    public final void ruleUrlFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:549:2: ( ( ( rule__UrlFragment__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:550:1: ( ( rule__UrlFragment__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:550:1: ( ( rule__UrlFragment__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:551:1: ( rule__UrlFragment__Alternatives )
            {
             before(grammarAccess.getUrlFragmentAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:552:1: ( rule__UrlFragment__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:552:2: rule__UrlFragment__Alternatives
            {
            pushFollow(FOLLOW_rule__UrlFragment__Alternatives_in_ruleUrlFragment1114);
            rule__UrlFragment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUrlFragmentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUrlFragment"


    // $ANTLR start "entryRuleUrlPathFragment"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:564:1: entryRuleUrlPathFragment : ruleUrlPathFragment EOF ;
    public final void entryRuleUrlPathFragment() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:565:1: ( ruleUrlPathFragment EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:566:1: ruleUrlPathFragment EOF
            {
             before(grammarAccess.getUrlPathFragmentRule()); 
            pushFollow(FOLLOW_ruleUrlPathFragment_in_entryRuleUrlPathFragment1141);
            ruleUrlPathFragment();

            state._fsp--;

             after(grammarAccess.getUrlPathFragmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlPathFragment1148); 

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
    // $ANTLR end "entryRuleUrlPathFragment"


    // $ANTLR start "ruleUrlPathFragment"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:573:1: ruleUrlPathFragment : ( ( rule__UrlPathFragment__NameAssignment ) ) ;
    public final void ruleUrlPathFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:577:2: ( ( ( rule__UrlPathFragment__NameAssignment ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:578:1: ( ( rule__UrlPathFragment__NameAssignment ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:578:1: ( ( rule__UrlPathFragment__NameAssignment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:579:1: ( rule__UrlPathFragment__NameAssignment )
            {
             before(grammarAccess.getUrlPathFragmentAccess().getNameAssignment()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:580:1: ( rule__UrlPathFragment__NameAssignment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:580:2: rule__UrlPathFragment__NameAssignment
            {
            pushFollow(FOLLOW_rule__UrlPathFragment__NameAssignment_in_ruleUrlPathFragment1174);
            rule__UrlPathFragment__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUrlPathFragmentAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleUrlPathFragment"


    // $ANTLR start "entryRuleVariable"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:592:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:593:1: ( ruleVariable EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:594:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1201);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1208); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:601:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:605:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:606:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:606:1: ( ( rule__Variable__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:607:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:608:1: ( rule__Variable__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:608:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable1234);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:620:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:621:1: ( ruleQualifiedName EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:622:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1261);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1268); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:629:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:633:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:634:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:634:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:635:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:636:1: ( rule__QualifiedName__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:636:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1294);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleRESTVerb"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:649:1: ruleRESTVerb : ( ( rule__RESTVerb__Alternatives ) ) ;
    public final void ruleRESTVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:653:1: ( ( ( rule__RESTVerb__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:654:1: ( ( rule__RESTVerb__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:654:1: ( ( rule__RESTVerb__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:655:1: ( rule__RESTVerb__Alternatives )
            {
             before(grammarAccess.getRESTVerbAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:656:1: ( rule__RESTVerb__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:656:2: rule__RESTVerb__Alternatives
            {
            pushFollow(FOLLOW_rule__RESTVerb__Alternatives_in_ruleRESTVerb1331);
            rule__RESTVerb__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRESTVerbAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRESTVerb"


    // $ANTLR start "rule__NamedElement__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:667:1: rule__NamedElement__Alternatives : ( ( ruleType ) | ( rulePlatform ) | ( ruleDataSource ) );
    public final void rule__NamedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:671:1: ( ( ruleType ) | ( rulePlatform ) | ( ruleDataSource ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 33:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:672:1: ( ruleType )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:672:1: ( ruleType )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:673:1: ruleType
                    {
                     before(grammarAccess.getNamedElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__NamedElement__Alternatives1366);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:678:6: ( rulePlatform )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:678:6: ( rulePlatform )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:679:1: rulePlatform
                    {
                     before(grammarAccess.getNamedElementAccess().getPlatformParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePlatform_in_rule__NamedElement__Alternatives1383);
                    rulePlatform();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getPlatformParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:684:6: ( ruleDataSource )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:684:6: ( ruleDataSource )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:685:1: ruleDataSource
                    {
                     before(grammarAccess.getNamedElementAccess().getDataSourceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDataSource_in_rule__NamedElement__Alternatives1400);
                    ruleDataSource();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getDataSourceParserRuleCall_2()); 

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
    // $ANTLR end "rule__NamedElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:695:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:699:1: ( ( ruleDataType ) | ( ruleEntity ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16||LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:700:1: ( ruleDataType )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:700:1: ( ruleDataType )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:701:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives1432);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:706:6: ( ruleEntity )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:706:6: ( ruleEntity )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:707:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives1449);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__RESTURL__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:717:1: rule__RESTURL__Alternatives : ( ( ruleAbsoluteRESTURL ) | ( ruleRelativeRESTURL ) );
    public final void rule__RESTURL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:721:1: ( ( ruleAbsoluteRESTURL ) | ( ruleRelativeRESTURL ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==31) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:722:1: ( ruleAbsoluteRESTURL )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:722:1: ( ruleAbsoluteRESTURL )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:723:1: ruleAbsoluteRESTURL
                    {
                     before(grammarAccess.getRESTURLAccess().getAbsoluteRESTURLParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_rule__RESTURL__Alternatives1481);
                    ruleAbsoluteRESTURL();

                    state._fsp--;

                     after(grammarAccess.getRESTURLAccess().getAbsoluteRESTURLParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:728:6: ( ruleRelativeRESTURL )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:728:6: ( ruleRelativeRESTURL )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:729:1: ruleRelativeRESTURL
                    {
                     before(grammarAccess.getRESTURLAccess().getRelativeRESTURLParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelativeRESTURL_in_rule__RESTURL__Alternatives1498);
                    ruleRelativeRESTURL();

                    state._fsp--;

                     after(grammarAccess.getRESTURLAccess().getRelativeRESTURLParserRuleCall_1()); 

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
    // $ANTLR end "rule__RESTURL__Alternatives"


    // $ANTLR start "rule__UrlFragment__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:739:1: rule__UrlFragment__Alternatives : ( ( ruleUrlPathFragment ) | ( ruleVariable ) );
    public final void rule__UrlFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:743:1: ( ( ruleUrlPathFragment ) | ( ruleVariable ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:744:1: ( ruleUrlPathFragment )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:744:1: ( ruleUrlPathFragment )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:745:1: ruleUrlPathFragment
                    {
                     before(grammarAccess.getUrlFragmentAccess().getUrlPathFragmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUrlPathFragment_in_rule__UrlFragment__Alternatives1530);
                    ruleUrlPathFragment();

                    state._fsp--;

                     after(grammarAccess.getUrlFragmentAccess().getUrlPathFragmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:750:6: ( ruleVariable )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:750:6: ( ruleVariable )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:751:1: ruleVariable
                    {
                     before(grammarAccess.getUrlFragmentAccess().getVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__UrlFragment__Alternatives1547);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getUrlFragmentAccess().getVariableParserRuleCall_1()); 

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
    // $ANTLR end "rule__UrlFragment__Alternatives"


    // $ANTLR start "rule__RESTVerb__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:761:1: rule__RESTVerb__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__RESTVerb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:765:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:766:1: ( ( 'GET' ) )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:766:1: ( ( 'GET' ) )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:767:1: ( 'GET' )
                    {
                     before(grammarAccess.getRESTVerbAccess().getGETEnumLiteralDeclaration_0()); 
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:768:1: ( 'GET' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:768:3: 'GET'
                    {
                    match(input,11,FOLLOW_11_in_rule__RESTVerb__Alternatives1580); 

                    }

                     after(grammarAccess.getRESTVerbAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:773:6: ( ( 'POST' ) )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:773:6: ( ( 'POST' ) )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:774:1: ( 'POST' )
                    {
                     before(grammarAccess.getRESTVerbAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:775:1: ( 'POST' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:775:3: 'POST'
                    {
                    match(input,12,FOLLOW_12_in_rule__RESTVerb__Alternatives1601); 

                    }

                     after(grammarAccess.getRESTVerbAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:780:6: ( ( 'PUT' ) )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:780:6: ( ( 'PUT' ) )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:781:1: ( 'PUT' )
                    {
                     before(grammarAccess.getRESTVerbAccess().getPUTEnumLiteralDeclaration_2()); 
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:782:1: ( 'PUT' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:782:3: 'PUT'
                    {
                    match(input,13,FOLLOW_13_in_rule__RESTVerb__Alternatives1622); 

                    }

                     after(grammarAccess.getRESTVerbAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:787:6: ( ( 'DELETE' ) )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:787:6: ( ( 'DELETE' ) )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:788:1: ( 'DELETE' )
                    {
                     before(grammarAccess.getRESTVerbAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:789:1: ( 'DELETE' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:789:3: 'DELETE'
                    {
                    match(input,14,FOLLOW_14_in_rule__RESTVerb__Alternatives1643); 

                    }

                     after(grammarAccess.getRESTVerbAccess().getDELETEEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__RESTVerb__Alternatives"


    // $ANTLR start "rule__DataType__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:801:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:805:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:806:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01676);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__01679);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:813:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:817:1: ( ( 'datatype' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:818:1: ( 'datatype' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:818:1: ( 'datatype' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:819:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__DataType__Group__0__Impl1707); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

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
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:832:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:836:1: ( rule__DataType__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:837:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__11738);
            rule__DataType__Group__1__Impl();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:843:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:847:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:848:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:848:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:849:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:850:1: ( rule__DataType__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:850:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl1765);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:864:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:868:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:869:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01799);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01802);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:876:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__AbstractAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:880:1: ( ( ( rule__Entity__AbstractAssignment_0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:881:1: ( ( rule__Entity__AbstractAssignment_0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:881:1: ( ( rule__Entity__AbstractAssignment_0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:882:1: ( rule__Entity__AbstractAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getAbstractAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:883:1: ( rule__Entity__AbstractAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:883:2: rule__Entity__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__AbstractAssignment_0_in_rule__Entity__Group__0__Impl1829);
                    rule__Entity__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getAbstractAssignment_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:893:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:897:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:898:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11860);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11863);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:905:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:909:1: ( ( 'entity' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:910:1: ( 'entity' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:910:1: ( 'entity' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:911:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__1__Impl1891); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:924:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:928:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:929:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21922);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21925);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:936:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:940:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:941:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:941:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:942:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:943:1: ( rule__Entity__NameAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:943:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1952);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:953:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:957:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:958:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31982);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31985);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:965:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:969:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:970:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:970:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:971:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:972:1: ( rule__Entity__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:972:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl2012);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:982:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:986:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:987:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42043);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42046);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:994:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:998:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:999:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:999:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1000:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__4__Impl2074); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1013:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1017:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1018:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52105);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52108);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1025:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__AttributesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1029:1: ( ( ( rule__Entity__AttributesAssignment_5 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1030:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1030:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1031:1: ( rule__Entity__AttributesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1032:1: ( rule__Entity__AttributesAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1032:2: rule__Entity__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_5_in_rule__Entity__Group__5__Impl2135);
            	    rule__Entity__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1042:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1046:1: ( rule__Entity__Group__6__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1047:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62166);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1053:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1057:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1058:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1058:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1059:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__6__Impl2194); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1086:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1090:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1091:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02239);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02242);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1098:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1102:1: ( ( 'extends' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1103:1: ( 'extends' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1103:1: ( 'extends' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1104:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group_3__0__Impl2270); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1117:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1121:1: ( rule__Entity__Group_3__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1122:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12301);
            rule__Entity__Group_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1128:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1132:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1133:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1133:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1134:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1135:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1135:2: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl2328);
            rule__Entity__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1149:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1153:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1154:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02362);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02365);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1161:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1165:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1166:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1166:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1167:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1168:1: ( rule__Attribute__TypeAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1168:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl2392);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1178:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1182:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1183:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12422);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12425);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1190:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ManyAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1194:1: ( ( ( rule__Attribute__ManyAssignment_1 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1195:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1195:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1196:1: ( rule__Attribute__ManyAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1197:1: ( rule__Attribute__ManyAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1197:2: rule__Attribute__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__1__Impl2452);
                    rule__Attribute__ManyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1207:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1211:1: ( rule__Attribute__Group__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1212:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22483);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1218:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1222:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1223:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1223:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1224:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1225:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1225:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2510);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Platform__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1241:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1245:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1246:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__02546);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__02549);
            rule__Platform__Group__1();

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
    // $ANTLR end "rule__Platform__Group__0"


    // $ANTLR start "rule__Platform__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1253:1: rule__Platform__Group__0__Impl : ( 'platform' ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1257:1: ( ( 'platform' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1258:1: ( 'platform' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1258:1: ( 'platform' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1259:1: 'platform'
            {
             before(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Platform__Group__0__Impl2577); 
             after(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 

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
    // $ANTLR end "rule__Platform__Group__0__Impl"


    // $ANTLR start "rule__Platform__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1272:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1276:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1277:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__12608);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__12611);
            rule__Platform__Group__2();

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
    // $ANTLR end "rule__Platform__Group__1"


    // $ANTLR start "rule__Platform__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1284:1: rule__Platform__Group__1__Impl : ( ( rule__Platform__NameAssignment_1 ) ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1288:1: ( ( ( rule__Platform__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1289:1: ( ( rule__Platform__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1289:1: ( ( rule__Platform__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1290:1: ( rule__Platform__NameAssignment_1 )
            {
             before(grammarAccess.getPlatformAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1291:1: ( rule__Platform__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1291:2: rule__Platform__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Platform__NameAssignment_1_in_rule__Platform__Group__1__Impl2638);
            rule__Platform__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Platform__Group__1__Impl"


    // $ANTLR start "rule__Platform__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1301:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1305:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1306:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__22668);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__22671);
            rule__Platform__Group__3();

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
    // $ANTLR end "rule__Platform__Group__2"


    // $ANTLR start "rule__Platform__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1313:1: rule__Platform__Group__2__Impl : ( '{' ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1317:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1318:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1318:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1319:1: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Platform__Group__2__Impl2699); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Platform__Group__2__Impl"


    // $ANTLR start "rule__Platform__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1332:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl rule__Platform__Group__4 ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1336:1: ( rule__Platform__Group__3__Impl rule__Platform__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1337:2: rule__Platform__Group__3__Impl rule__Platform__Group__4
            {
            pushFollow(FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__32730);
            rule__Platform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__4_in_rule__Platform__Group__32733);
            rule__Platform__Group__4();

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
    // $ANTLR end "rule__Platform__Group__3"


    // $ANTLR start "rule__Platform__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1344:1: rule__Platform__Group__3__Impl : ( ( rule__Platform__MappingsAssignment_3 )* ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1348:1: ( ( ( rule__Platform__MappingsAssignment_3 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1349:1: ( ( rule__Platform__MappingsAssignment_3 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1349:1: ( ( rule__Platform__MappingsAssignment_3 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1350:1: ( rule__Platform__MappingsAssignment_3 )*
            {
             before(grammarAccess.getPlatformAccess().getMappingsAssignment_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1351:1: ( rule__Platform__MappingsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1351:2: rule__Platform__MappingsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Platform__MappingsAssignment_3_in_rule__Platform__Group__3__Impl2760);
            	    rule__Platform__MappingsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPlatformAccess().getMappingsAssignment_3()); 

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
    // $ANTLR end "rule__Platform__Group__3__Impl"


    // $ANTLR start "rule__Platform__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1361:1: rule__Platform__Group__4 : rule__Platform__Group__4__Impl ;
    public final void rule__Platform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1365:1: ( rule__Platform__Group__4__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1366:2: rule__Platform__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group__4__Impl_in_rule__Platform__Group__42791);
            rule__Platform__Group__4__Impl();

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
    // $ANTLR end "rule__Platform__Group__4"


    // $ANTLR start "rule__Platform__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1372:1: rule__Platform__Group__4__Impl : ( '}' ) ;
    public final void rule__Platform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1376:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1377:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1377:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1378:1: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Platform__Group__4__Impl2819); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Platform__Group__4__Impl"


    // $ANTLR start "rule__TypeMapping__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1401:1: rule__TypeMapping__Group__0 : rule__TypeMapping__Group__0__Impl rule__TypeMapping__Group__1 ;
    public final void rule__TypeMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1405:1: ( rule__TypeMapping__Group__0__Impl rule__TypeMapping__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1406:2: rule__TypeMapping__Group__0__Impl rule__TypeMapping__Group__1
            {
            pushFollow(FOLLOW_rule__TypeMapping__Group__0__Impl_in_rule__TypeMapping__Group__02860);
            rule__TypeMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMapping__Group__1_in_rule__TypeMapping__Group__02863);
            rule__TypeMapping__Group__1();

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
    // $ANTLR end "rule__TypeMapping__Group__0"


    // $ANTLR start "rule__TypeMapping__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1413:1: rule__TypeMapping__Group__0__Impl : ( 'typemapping' ) ;
    public final void rule__TypeMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1417:1: ( ( 'typemapping' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1418:1: ( 'typemapping' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1418:1: ( 'typemapping' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1419:1: 'typemapping'
            {
             before(grammarAccess.getTypeMappingAccess().getTypemappingKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__TypeMapping__Group__0__Impl2891); 
             after(grammarAccess.getTypeMappingAccess().getTypemappingKeyword_0()); 

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
    // $ANTLR end "rule__TypeMapping__Group__0__Impl"


    // $ANTLR start "rule__TypeMapping__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1432:1: rule__TypeMapping__Group__1 : rule__TypeMapping__Group__1__Impl rule__TypeMapping__Group__2 ;
    public final void rule__TypeMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1436:1: ( rule__TypeMapping__Group__1__Impl rule__TypeMapping__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1437:2: rule__TypeMapping__Group__1__Impl rule__TypeMapping__Group__2
            {
            pushFollow(FOLLOW_rule__TypeMapping__Group__1__Impl_in_rule__TypeMapping__Group__12922);
            rule__TypeMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMapping__Group__2_in_rule__TypeMapping__Group__12925);
            rule__TypeMapping__Group__2();

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
    // $ANTLR end "rule__TypeMapping__Group__1"


    // $ANTLR start "rule__TypeMapping__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1444:1: rule__TypeMapping__Group__1__Impl : ( ( rule__TypeMapping__TypeAssignment_1 ) ) ;
    public final void rule__TypeMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1448:1: ( ( ( rule__TypeMapping__TypeAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1449:1: ( ( rule__TypeMapping__TypeAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1449:1: ( ( rule__TypeMapping__TypeAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1450:1: ( rule__TypeMapping__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeMappingAccess().getTypeAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1451:1: ( rule__TypeMapping__TypeAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1451:2: rule__TypeMapping__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeMapping__TypeAssignment_1_in_rule__TypeMapping__Group__1__Impl2952);
            rule__TypeMapping__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeMappingAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__TypeMapping__Group__1__Impl"


    // $ANTLR start "rule__TypeMapping__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1461:1: rule__TypeMapping__Group__2 : rule__TypeMapping__Group__2__Impl rule__TypeMapping__Group__3 ;
    public final void rule__TypeMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1465:1: ( rule__TypeMapping__Group__2__Impl rule__TypeMapping__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1466:2: rule__TypeMapping__Group__2__Impl rule__TypeMapping__Group__3
            {
            pushFollow(FOLLOW_rule__TypeMapping__Group__2__Impl_in_rule__TypeMapping__Group__22982);
            rule__TypeMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMapping__Group__3_in_rule__TypeMapping__Group__22985);
            rule__TypeMapping__Group__3();

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
    // $ANTLR end "rule__TypeMapping__Group__2"


    // $ANTLR start "rule__TypeMapping__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1473:1: rule__TypeMapping__Group__2__Impl : ( '->' ) ;
    public final void rule__TypeMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1477:1: ( ( '->' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1478:1: ( '->' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1478:1: ( '->' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1479:1: '->'
            {
             before(grammarAccess.getTypeMappingAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__TypeMapping__Group__2__Impl3013); 
             after(grammarAccess.getTypeMappingAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__TypeMapping__Group__2__Impl"


    // $ANTLR start "rule__TypeMapping__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1492:1: rule__TypeMapping__Group__3 : rule__TypeMapping__Group__3__Impl ;
    public final void rule__TypeMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1496:1: ( rule__TypeMapping__Group__3__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1497:2: rule__TypeMapping__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeMapping__Group__3__Impl_in_rule__TypeMapping__Group__33044);
            rule__TypeMapping__Group__3__Impl();

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
    // $ANTLR end "rule__TypeMapping__Group__3"


    // $ANTLR start "rule__TypeMapping__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1503:1: rule__TypeMapping__Group__3__Impl : ( ( rule__TypeMapping__SimpleNameAssignment_3 ) ) ;
    public final void rule__TypeMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1507:1: ( ( ( rule__TypeMapping__SimpleNameAssignment_3 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1508:1: ( ( rule__TypeMapping__SimpleNameAssignment_3 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1508:1: ( ( rule__TypeMapping__SimpleNameAssignment_3 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1509:1: ( rule__TypeMapping__SimpleNameAssignment_3 )
            {
             before(grammarAccess.getTypeMappingAccess().getSimpleNameAssignment_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1510:1: ( rule__TypeMapping__SimpleNameAssignment_3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1510:2: rule__TypeMapping__SimpleNameAssignment_3
            {
            pushFollow(FOLLOW_rule__TypeMapping__SimpleNameAssignment_3_in_rule__TypeMapping__Group__3__Impl3071);
            rule__TypeMapping__SimpleNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeMappingAccess().getSimpleNameAssignment_3()); 

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
    // $ANTLR end "rule__TypeMapping__Group__3__Impl"


    // $ANTLR start "rule__DataSource__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1528:1: rule__DataSource__Group__0 : rule__DataSource__Group__0__Impl rule__DataSource__Group__1 ;
    public final void rule__DataSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1532:1: ( rule__DataSource__Group__0__Impl rule__DataSource__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1533:2: rule__DataSource__Group__0__Impl rule__DataSource__Group__1
            {
            pushFollow(FOLLOW_rule__DataSource__Group__0__Impl_in_rule__DataSource__Group__03109);
            rule__DataSource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__1_in_rule__DataSource__Group__03112);
            rule__DataSource__Group__1();

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
    // $ANTLR end "rule__DataSource__Group__0"


    // $ANTLR start "rule__DataSource__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1540:1: rule__DataSource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__DataSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1544:1: ( ( 'datasource' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1545:1: ( 'datasource' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1545:1: ( 'datasource' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1546:1: 'datasource'
            {
             before(grammarAccess.getDataSourceAccess().getDatasourceKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__DataSource__Group__0__Impl3140); 
             after(grammarAccess.getDataSourceAccess().getDatasourceKeyword_0()); 

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
    // $ANTLR end "rule__DataSource__Group__0__Impl"


    // $ANTLR start "rule__DataSource__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1559:1: rule__DataSource__Group__1 : rule__DataSource__Group__1__Impl rule__DataSource__Group__2 ;
    public final void rule__DataSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1563:1: ( rule__DataSource__Group__1__Impl rule__DataSource__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1564:2: rule__DataSource__Group__1__Impl rule__DataSource__Group__2
            {
            pushFollow(FOLLOW_rule__DataSource__Group__1__Impl_in_rule__DataSource__Group__13171);
            rule__DataSource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__2_in_rule__DataSource__Group__13174);
            rule__DataSource__Group__2();

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
    // $ANTLR end "rule__DataSource__Group__1"


    // $ANTLR start "rule__DataSource__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1571:1: rule__DataSource__Group__1__Impl : ( ( rule__DataSource__NameAssignment_1 ) ) ;
    public final void rule__DataSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1575:1: ( ( ( rule__DataSource__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1576:1: ( ( rule__DataSource__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1576:1: ( ( rule__DataSource__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1577:1: ( rule__DataSource__NameAssignment_1 )
            {
             before(grammarAccess.getDataSourceAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1578:1: ( rule__DataSource__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1578:2: rule__DataSource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataSource__NameAssignment_1_in_rule__DataSource__Group__1__Impl3201);
            rule__DataSource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataSource__Group__1__Impl"


    // $ANTLR start "rule__DataSource__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1588:1: rule__DataSource__Group__2 : rule__DataSource__Group__2__Impl rule__DataSource__Group__3 ;
    public final void rule__DataSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1592:1: ( rule__DataSource__Group__2__Impl rule__DataSource__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1593:2: rule__DataSource__Group__2__Impl rule__DataSource__Group__3
            {
            pushFollow(FOLLOW_rule__DataSource__Group__2__Impl_in_rule__DataSource__Group__23231);
            rule__DataSource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__3_in_rule__DataSource__Group__23234);
            rule__DataSource__Group__3();

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
    // $ANTLR end "rule__DataSource__Group__2"


    // $ANTLR start "rule__DataSource__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1600:1: rule__DataSource__Group__2__Impl : ( '{' ) ;
    public final void rule__DataSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1604:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1605:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1605:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1606:1: '{'
            {
             before(grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__DataSource__Group__2__Impl3262); 
             after(grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DataSource__Group__2__Impl"


    // $ANTLR start "rule__DataSource__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1619:1: rule__DataSource__Group__3 : rule__DataSource__Group__3__Impl rule__DataSource__Group__4 ;
    public final void rule__DataSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1623:1: ( rule__DataSource__Group__3__Impl rule__DataSource__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1624:2: rule__DataSource__Group__3__Impl rule__DataSource__Group__4
            {
            pushFollow(FOLLOW_rule__DataSource__Group__3__Impl_in_rule__DataSource__Group__33293);
            rule__DataSource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__4_in_rule__DataSource__Group__33296);
            rule__DataSource__Group__4();

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
    // $ANTLR end "rule__DataSource__Group__3"


    // $ANTLR start "rule__DataSource__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1631:1: rule__DataSource__Group__3__Impl : ( 'baseUrl' ) ;
    public final void rule__DataSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1635:1: ( ( 'baseUrl' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1636:1: ( 'baseUrl' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1636:1: ( 'baseUrl' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1637:1: 'baseUrl'
            {
             before(grammarAccess.getDataSourceAccess().getBaseUrlKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__DataSource__Group__3__Impl3324); 
             after(grammarAccess.getDataSourceAccess().getBaseUrlKeyword_3()); 

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
    // $ANTLR end "rule__DataSource__Group__3__Impl"


    // $ANTLR start "rule__DataSource__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1650:1: rule__DataSource__Group__4 : rule__DataSource__Group__4__Impl rule__DataSource__Group__5 ;
    public final void rule__DataSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1654:1: ( rule__DataSource__Group__4__Impl rule__DataSource__Group__5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1655:2: rule__DataSource__Group__4__Impl rule__DataSource__Group__5
            {
            pushFollow(FOLLOW_rule__DataSource__Group__4__Impl_in_rule__DataSource__Group__43355);
            rule__DataSource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__5_in_rule__DataSource__Group__43358);
            rule__DataSource__Group__5();

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
    // $ANTLR end "rule__DataSource__Group__4"


    // $ANTLR start "rule__DataSource__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1662:1: rule__DataSource__Group__4__Impl : ( ':' ) ;
    public final void rule__DataSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1666:1: ( ( ':' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1667:1: ( ':' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1667:1: ( ':' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1668:1: ':'
            {
             before(grammarAccess.getDataSourceAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__DataSource__Group__4__Impl3386); 
             after(grammarAccess.getDataSourceAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__DataSource__Group__4__Impl"


    // $ANTLR start "rule__DataSource__Group__5"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1681:1: rule__DataSource__Group__5 : rule__DataSource__Group__5__Impl rule__DataSource__Group__6 ;
    public final void rule__DataSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1685:1: ( rule__DataSource__Group__5__Impl rule__DataSource__Group__6 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1686:2: rule__DataSource__Group__5__Impl rule__DataSource__Group__6
            {
            pushFollow(FOLLOW_rule__DataSource__Group__5__Impl_in_rule__DataSource__Group__53417);
            rule__DataSource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__6_in_rule__DataSource__Group__53420);
            rule__DataSource__Group__6();

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
    // $ANTLR end "rule__DataSource__Group__5"


    // $ANTLR start "rule__DataSource__Group__5__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1693:1: rule__DataSource__Group__5__Impl : ( ( rule__DataSource__BaseUrlAssignment_5 ) ) ;
    public final void rule__DataSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1697:1: ( ( ( rule__DataSource__BaseUrlAssignment_5 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1698:1: ( ( rule__DataSource__BaseUrlAssignment_5 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1698:1: ( ( rule__DataSource__BaseUrlAssignment_5 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1699:1: ( rule__DataSource__BaseUrlAssignment_5 )
            {
             before(grammarAccess.getDataSourceAccess().getBaseUrlAssignment_5()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1700:1: ( rule__DataSource__BaseUrlAssignment_5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1700:2: rule__DataSource__BaseUrlAssignment_5
            {
            pushFollow(FOLLOW_rule__DataSource__BaseUrlAssignment_5_in_rule__DataSource__Group__5__Impl3447);
            rule__DataSource__BaseUrlAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getBaseUrlAssignment_5()); 

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
    // $ANTLR end "rule__DataSource__Group__5__Impl"


    // $ANTLR start "rule__DataSource__Group__6"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1710:1: rule__DataSource__Group__6 : rule__DataSource__Group__6__Impl rule__DataSource__Group__7 ;
    public final void rule__DataSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1714:1: ( rule__DataSource__Group__6__Impl rule__DataSource__Group__7 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1715:2: rule__DataSource__Group__6__Impl rule__DataSource__Group__7
            {
            pushFollow(FOLLOW_rule__DataSource__Group__6__Impl_in_rule__DataSource__Group__63477);
            rule__DataSource__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__7_in_rule__DataSource__Group__63480);
            rule__DataSource__Group__7();

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
    // $ANTLR end "rule__DataSource__Group__6"


    // $ANTLR start "rule__DataSource__Group__6__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1722:1: rule__DataSource__Group__6__Impl : ( 'resource' ) ;
    public final void rule__DataSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1726:1: ( ( 'resource' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1727:1: ( 'resource' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1727:1: ( 'resource' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1728:1: 'resource'
            {
             before(grammarAccess.getDataSourceAccess().getResourceKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__DataSource__Group__6__Impl3508); 
             after(grammarAccess.getDataSourceAccess().getResourceKeyword_6()); 

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
    // $ANTLR end "rule__DataSource__Group__6__Impl"


    // $ANTLR start "rule__DataSource__Group__7"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1741:1: rule__DataSource__Group__7 : rule__DataSource__Group__7__Impl rule__DataSource__Group__8 ;
    public final void rule__DataSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1745:1: ( rule__DataSource__Group__7__Impl rule__DataSource__Group__8 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1746:2: rule__DataSource__Group__7__Impl rule__DataSource__Group__8
            {
            pushFollow(FOLLOW_rule__DataSource__Group__7__Impl_in_rule__DataSource__Group__73539);
            rule__DataSource__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__8_in_rule__DataSource__Group__73542);
            rule__DataSource__Group__8();

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
    // $ANTLR end "rule__DataSource__Group__7"


    // $ANTLR start "rule__DataSource__Group__7__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1753:1: rule__DataSource__Group__7__Impl : ( ':' ) ;
    public final void rule__DataSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1757:1: ( ( ':' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1758:1: ( ':' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1758:1: ( ':' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1759:1: ':'
            {
             before(grammarAccess.getDataSourceAccess().getColonKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__DataSource__Group__7__Impl3570); 
             after(grammarAccess.getDataSourceAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__DataSource__Group__7__Impl"


    // $ANTLR start "rule__DataSource__Group__8"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1772:1: rule__DataSource__Group__8 : rule__DataSource__Group__8__Impl rule__DataSource__Group__9 ;
    public final void rule__DataSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1776:1: ( rule__DataSource__Group__8__Impl rule__DataSource__Group__9 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1777:2: rule__DataSource__Group__8__Impl rule__DataSource__Group__9
            {
            pushFollow(FOLLOW_rule__DataSource__Group__8__Impl_in_rule__DataSource__Group__83601);
            rule__DataSource__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__9_in_rule__DataSource__Group__83604);
            rule__DataSource__Group__9();

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
    // $ANTLR end "rule__DataSource__Group__8"


    // $ANTLR start "rule__DataSource__Group__8__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1784:1: rule__DataSource__Group__8__Impl : ( ( rule__DataSource__ResourceTypeAssignment_8 ) ) ;
    public final void rule__DataSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1788:1: ( ( ( rule__DataSource__ResourceTypeAssignment_8 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1789:1: ( ( rule__DataSource__ResourceTypeAssignment_8 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1789:1: ( ( rule__DataSource__ResourceTypeAssignment_8 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1790:1: ( rule__DataSource__ResourceTypeAssignment_8 )
            {
             before(grammarAccess.getDataSourceAccess().getResourceTypeAssignment_8()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1791:1: ( rule__DataSource__ResourceTypeAssignment_8 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1791:2: rule__DataSource__ResourceTypeAssignment_8
            {
            pushFollow(FOLLOW_rule__DataSource__ResourceTypeAssignment_8_in_rule__DataSource__Group__8__Impl3631);
            rule__DataSource__ResourceTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getResourceTypeAssignment_8()); 

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
    // $ANTLR end "rule__DataSource__Group__8__Impl"


    // $ANTLR start "rule__DataSource__Group__9"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1801:1: rule__DataSource__Group__9 : rule__DataSource__Group__9__Impl rule__DataSource__Group__10 ;
    public final void rule__DataSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1805:1: ( rule__DataSource__Group__9__Impl rule__DataSource__Group__10 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1806:2: rule__DataSource__Group__9__Impl rule__DataSource__Group__10
            {
            pushFollow(FOLLOW_rule__DataSource__Group__9__Impl_in_rule__DataSource__Group__93661);
            rule__DataSource__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__10_in_rule__DataSource__Group__93664);
            rule__DataSource__Group__10();

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
    // $ANTLR end "rule__DataSource__Group__9"


    // $ANTLR start "rule__DataSource__Group__9__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1813:1: rule__DataSource__Group__9__Impl : ( ( rule__DataSource__MethodsAssignment_9 )* ) ;
    public final void rule__DataSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1817:1: ( ( ( rule__DataSource__MethodsAssignment_9 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1818:1: ( ( rule__DataSource__MethodsAssignment_9 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1818:1: ( ( rule__DataSource__MethodsAssignment_9 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1819:1: ( rule__DataSource__MethodsAssignment_9 )*
            {
             before(grammarAccess.getDataSourceAccess().getMethodsAssignment_9()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1820:1: ( rule__DataSource__MethodsAssignment_9 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1820:2: rule__DataSource__MethodsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__DataSource__MethodsAssignment_9_in_rule__DataSource__Group__9__Impl3691);
            	    rule__DataSource__MethodsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDataSourceAccess().getMethodsAssignment_9()); 

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
    // $ANTLR end "rule__DataSource__Group__9__Impl"


    // $ANTLR start "rule__DataSource__Group__10"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1830:1: rule__DataSource__Group__10 : rule__DataSource__Group__10__Impl ;
    public final void rule__DataSource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1834:1: ( rule__DataSource__Group__10__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1835:2: rule__DataSource__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__DataSource__Group__10__Impl_in_rule__DataSource__Group__103722);
            rule__DataSource__Group__10__Impl();

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
    // $ANTLR end "rule__DataSource__Group__10"


    // $ANTLR start "rule__DataSource__Group__10__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1841:1: rule__DataSource__Group__10__Impl : ( '}' ) ;
    public final void rule__DataSource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1845:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1846:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1846:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1847:1: '}'
            {
             before(grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_18_in_rule__DataSource__Group__10__Impl3750); 
             after(grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__DataSource__Group__10__Impl"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1882:1: rule__DataSourceAccessMethod__Group__0 : rule__DataSourceAccessMethod__Group__0__Impl rule__DataSourceAccessMethod__Group__1 ;
    public final void rule__DataSourceAccessMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1886:1: ( rule__DataSourceAccessMethod__Group__0__Impl rule__DataSourceAccessMethod__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1887:2: rule__DataSourceAccessMethod__Group__0__Impl rule__DataSourceAccessMethod__Group__1
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__0__Impl_in_rule__DataSourceAccessMethod__Group__03803);
            rule__DataSourceAccessMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__1_in_rule__DataSourceAccessMethod__Group__03806);
            rule__DataSourceAccessMethod__Group__1();

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__0"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1894:1: rule__DataSourceAccessMethod__Group__0__Impl : ( ( rule__DataSourceAccessMethod__NameAssignment_0 ) ) ;
    public final void rule__DataSourceAccessMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1898:1: ( ( ( rule__DataSourceAccessMethod__NameAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1899:1: ( ( rule__DataSourceAccessMethod__NameAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1899:1: ( ( rule__DataSourceAccessMethod__NameAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1900:1: ( rule__DataSourceAccessMethod__NameAssignment_0 )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getNameAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1901:1: ( rule__DataSourceAccessMethod__NameAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1901:2: rule__DataSourceAccessMethod__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__NameAssignment_0_in_rule__DataSourceAccessMethod__Group__0__Impl3833);
            rule__DataSourceAccessMethod__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccessMethodAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__0__Impl"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1911:1: rule__DataSourceAccessMethod__Group__1 : rule__DataSourceAccessMethod__Group__1__Impl rule__DataSourceAccessMethod__Group__2 ;
    public final void rule__DataSourceAccessMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1915:1: ( rule__DataSourceAccessMethod__Group__1__Impl rule__DataSourceAccessMethod__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1916:2: rule__DataSourceAccessMethod__Group__1__Impl rule__DataSourceAccessMethod__Group__2
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__1__Impl_in_rule__DataSourceAccessMethod__Group__13863);
            rule__DataSourceAccessMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__2_in_rule__DataSourceAccessMethod__Group__13866);
            rule__DataSourceAccessMethod__Group__2();

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__1"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1923:1: rule__DataSourceAccessMethod__Group__1__Impl : ( '(' ) ;
    public final void rule__DataSourceAccessMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1927:1: ( ( '(' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1928:1: ( '(' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1928:1: ( '(' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1929:1: '('
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__DataSourceAccessMethod__Group__1__Impl3894); 
             after(grammarAccess.getDataSourceAccessMethodAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__1__Impl"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1942:1: rule__DataSourceAccessMethod__Group__2 : rule__DataSourceAccessMethod__Group__2__Impl rule__DataSourceAccessMethod__Group__3 ;
    public final void rule__DataSourceAccessMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1946:1: ( rule__DataSourceAccessMethod__Group__2__Impl rule__DataSourceAccessMethod__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1947:2: rule__DataSourceAccessMethod__Group__2__Impl rule__DataSourceAccessMethod__Group__3
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__2__Impl_in_rule__DataSourceAccessMethod__Group__23925);
            rule__DataSourceAccessMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__3_in_rule__DataSourceAccessMethod__Group__23928);
            rule__DataSourceAccessMethod__Group__3();

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__2"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1954:1: rule__DataSourceAccessMethod__Group__2__Impl : ( ( rule__DataSourceAccessMethod__Group_2__0 )? ) ;
    public final void rule__DataSourceAccessMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1958:1: ( ( ( rule__DataSourceAccessMethod__Group_2__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1959:1: ( ( rule__DataSourceAccessMethod__Group_2__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1959:1: ( ( rule__DataSourceAccessMethod__Group_2__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1960:1: ( rule__DataSourceAccessMethod__Group_2__0 )?
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getGroup_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1961:1: ( rule__DataSourceAccessMethod__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1961:2: rule__DataSourceAccessMethod__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2__0_in_rule__DataSourceAccessMethod__Group__2__Impl3955);
                    rule__DataSourceAccessMethod__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSourceAccessMethodAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__2__Impl"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1971:1: rule__DataSourceAccessMethod__Group__3 : rule__DataSourceAccessMethod__Group__3__Impl rule__DataSourceAccessMethod__Group__4 ;
    public final void rule__DataSourceAccessMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1975:1: ( rule__DataSourceAccessMethod__Group__3__Impl rule__DataSourceAccessMethod__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1976:2: rule__DataSourceAccessMethod__Group__3__Impl rule__DataSourceAccessMethod__Group__4
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__3__Impl_in_rule__DataSourceAccessMethod__Group__33986);
            rule__DataSourceAccessMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__4_in_rule__DataSourceAccessMethod__Group__33989);
            rule__DataSourceAccessMethod__Group__4();

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__3"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1983:1: rule__DataSourceAccessMethod__Group__3__Impl : ( ')' ) ;
    public final void rule__DataSourceAccessMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1987:1: ( ( ')' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1988:1: ( ')' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1988:1: ( ')' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1989:1: ')'
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__DataSourceAccessMethod__Group__3__Impl4017); 
             after(grammarAccess.getDataSourceAccessMethodAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__3__Impl"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2002:1: rule__DataSourceAccessMethod__Group__4 : rule__DataSourceAccessMethod__Group__4__Impl rule__DataSourceAccessMethod__Group__5 ;
    public final void rule__DataSourceAccessMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2006:1: ( rule__DataSourceAccessMethod__Group__4__Impl rule__DataSourceAccessMethod__Group__5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2007:2: rule__DataSourceAccessMethod__Group__4__Impl rule__DataSourceAccessMethod__Group__5
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__4__Impl_in_rule__DataSourceAccessMethod__Group__44048);
            rule__DataSourceAccessMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__5_in_rule__DataSourceAccessMethod__Group__44051);
            rule__DataSourceAccessMethod__Group__5();

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__4"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2014:1: rule__DataSourceAccessMethod__Group__4__Impl : ( ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )? ) ;
    public final void rule__DataSourceAccessMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2018:1: ( ( ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2019:1: ( ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2019:1: ( ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2020:1: ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )?
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyAssignment_4()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2021:1: ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2021:2: rule__DataSourceAccessMethod__ReturnsManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__DataSourceAccessMethod__ReturnsManyAssignment_4_in_rule__DataSourceAccessMethod__Group__4__Impl4078);
                    rule__DataSourceAccessMethod__ReturnsManyAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyAssignment_4()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__4__Impl"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__5"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2031:1: rule__DataSourceAccessMethod__Group__5 : rule__DataSourceAccessMethod__Group__5__Impl ;
    public final void rule__DataSourceAccessMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2035:1: ( rule__DataSourceAccessMethod__Group__5__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2036:2: rule__DataSourceAccessMethod__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__5__Impl_in_rule__DataSourceAccessMethod__Group__54109);
            rule__DataSourceAccessMethod__Group__5__Impl();

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__5"


    // $ANTLR start "rule__DataSourceAccessMethod__Group__5__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2042:1: rule__DataSourceAccessMethod__Group__5__Impl : ( ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 ) ) ;
    public final void rule__DataSourceAccessMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2046:1: ( ( ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2047:1: ( ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2047:1: ( ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2048:1: ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getRestSpecificationAssignment_5()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2049:1: ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2049:2: rule__DataSourceAccessMethod__RestSpecificationAssignment_5
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__RestSpecificationAssignment_5_in_rule__DataSourceAccessMethod__Group__5__Impl4136);
            rule__DataSourceAccessMethod__RestSpecificationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccessMethodAccess().getRestSpecificationAssignment_5()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group__5__Impl"


    // $ANTLR start "rule__DataSourceAccessMethod__Group_2__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2071:1: rule__DataSourceAccessMethod__Group_2__0 : rule__DataSourceAccessMethod__Group_2__0__Impl rule__DataSourceAccessMethod__Group_2__1 ;
    public final void rule__DataSourceAccessMethod__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2075:1: ( rule__DataSourceAccessMethod__Group_2__0__Impl rule__DataSourceAccessMethod__Group_2__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2076:2: rule__DataSourceAccessMethod__Group_2__0__Impl rule__DataSourceAccessMethod__Group_2__1
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2__0__Impl_in_rule__DataSourceAccessMethod__Group_2__04178);
            rule__DataSourceAccessMethod__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2__1_in_rule__DataSourceAccessMethod__Group_2__04181);
            rule__DataSourceAccessMethod__Group_2__1();

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group_2__0"


    // $ANTLR start "rule__DataSourceAccessMethod__Group_2__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2083:1: rule__DataSourceAccessMethod__Group_2__0__Impl : ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 ) ) ;
    public final void rule__DataSourceAccessMethod__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2087:1: ( ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2088:1: ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2088:1: ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2089:1: ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersAssignment_2_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2090:1: ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2090:2: rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0_in_rule__DataSourceAccessMethod__Group_2__0__Impl4208);
            rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersAssignment_2_0()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group_2__0__Impl"


    // $ANTLR start "rule__DataSourceAccessMethod__Group_2__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2100:1: rule__DataSourceAccessMethod__Group_2__1 : rule__DataSourceAccessMethod__Group_2__1__Impl ;
    public final void rule__DataSourceAccessMethod__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2104:1: ( rule__DataSourceAccessMethod__Group_2__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2105:2: rule__DataSourceAccessMethod__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2__1__Impl_in_rule__DataSourceAccessMethod__Group_2__14238);
            rule__DataSourceAccessMethod__Group_2__1__Impl();

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group_2__1"


    // $ANTLR start "rule__DataSourceAccessMethod__Group_2__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2111:1: rule__DataSourceAccessMethod__Group_2__1__Impl : ( ( rule__DataSourceAccessMethod__Group_2_1__0 )* ) ;
    public final void rule__DataSourceAccessMethod__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2115:1: ( ( ( rule__DataSourceAccessMethod__Group_2_1__0 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2116:1: ( ( rule__DataSourceAccessMethod__Group_2_1__0 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2116:1: ( ( rule__DataSourceAccessMethod__Group_2_1__0 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2117:1: ( rule__DataSourceAccessMethod__Group_2_1__0 )*
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getGroup_2_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2118:1: ( rule__DataSourceAccessMethod__Group_2_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2118:2: rule__DataSourceAccessMethod__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2_1__0_in_rule__DataSourceAccessMethod__Group_2__1__Impl4265);
            	    rule__DataSourceAccessMethod__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDataSourceAccessMethodAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group_2__1__Impl"


    // $ANTLR start "rule__DataSourceAccessMethod__Group_2_1__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2132:1: rule__DataSourceAccessMethod__Group_2_1__0 : rule__DataSourceAccessMethod__Group_2_1__0__Impl rule__DataSourceAccessMethod__Group_2_1__1 ;
    public final void rule__DataSourceAccessMethod__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2136:1: ( rule__DataSourceAccessMethod__Group_2_1__0__Impl rule__DataSourceAccessMethod__Group_2_1__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2137:2: rule__DataSourceAccessMethod__Group_2_1__0__Impl rule__DataSourceAccessMethod__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2_1__0__Impl_in_rule__DataSourceAccessMethod__Group_2_1__04300);
            rule__DataSourceAccessMethod__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2_1__1_in_rule__DataSourceAccessMethod__Group_2_1__04303);
            rule__DataSourceAccessMethod__Group_2_1__1();

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group_2_1__0"


    // $ANTLR start "rule__DataSourceAccessMethod__Group_2_1__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2144:1: rule__DataSourceAccessMethod__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__DataSourceAccessMethod__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2148:1: ( ( ',' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2149:1: ( ',' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2149:1: ( ',' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2150:1: ','
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getCommaKeyword_2_1_0()); 
            match(input,29,FOLLOW_29_in_rule__DataSourceAccessMethod__Group_2_1__0__Impl4331); 
             after(grammarAccess.getDataSourceAccessMethodAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group_2_1__0__Impl"


    // $ANTLR start "rule__DataSourceAccessMethod__Group_2_1__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2163:1: rule__DataSourceAccessMethod__Group_2_1__1 : rule__DataSourceAccessMethod__Group_2_1__1__Impl ;
    public final void rule__DataSourceAccessMethod__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2167:1: ( rule__DataSourceAccessMethod__Group_2_1__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2168:2: rule__DataSourceAccessMethod__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2_1__1__Impl_in_rule__DataSourceAccessMethod__Group_2_1__14362);
            rule__DataSourceAccessMethod__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group_2_1__1"


    // $ANTLR start "rule__DataSourceAccessMethod__Group_2_1__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2174:1: rule__DataSourceAccessMethod__Group_2_1__1__Impl : ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 ) ) ;
    public final void rule__DataSourceAccessMethod__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2178:1: ( ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2179:1: ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2179:1: ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2180:1: ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersAssignment_2_1_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2181:1: ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2181:2: rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1_in_rule__DataSourceAccessMethod__Group_2_1__1__Impl4389);
            rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersAssignment_2_1_1()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__Group_2_1__1__Impl"


    // $ANTLR start "rule__RESTSpecification__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2195:1: rule__RESTSpecification__Group__0 : rule__RESTSpecification__Group__0__Impl rule__RESTSpecification__Group__1 ;
    public final void rule__RESTSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2199:1: ( rule__RESTSpecification__Group__0__Impl rule__RESTSpecification__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2200:2: rule__RESTSpecification__Group__0__Impl rule__RESTSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group__0__Impl_in_rule__RESTSpecification__Group__04423);
            rule__RESTSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTSpecification__Group__1_in_rule__RESTSpecification__Group__04426);
            rule__RESTSpecification__Group__1();

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
    // $ANTLR end "rule__RESTSpecification__Group__0"


    // $ANTLR start "rule__RESTSpecification__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2207:1: rule__RESTSpecification__Group__0__Impl : ( ( rule__RESTSpecification__VerbAssignment_0 ) ) ;
    public final void rule__RESTSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2211:1: ( ( ( rule__RESTSpecification__VerbAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2212:1: ( ( rule__RESTSpecification__VerbAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2212:1: ( ( rule__RESTSpecification__VerbAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2213:1: ( rule__RESTSpecification__VerbAssignment_0 )
            {
             before(grammarAccess.getRESTSpecificationAccess().getVerbAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2214:1: ( rule__RESTSpecification__VerbAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2214:2: rule__RESTSpecification__VerbAssignment_0
            {
            pushFollow(FOLLOW_rule__RESTSpecification__VerbAssignment_0_in_rule__RESTSpecification__Group__0__Impl4453);
            rule__RESTSpecification__VerbAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRESTSpecificationAccess().getVerbAssignment_0()); 

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
    // $ANTLR end "rule__RESTSpecification__Group__0__Impl"


    // $ANTLR start "rule__RESTSpecification__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2224:1: rule__RESTSpecification__Group__1 : rule__RESTSpecification__Group__1__Impl rule__RESTSpecification__Group__2 ;
    public final void rule__RESTSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2228:1: ( rule__RESTSpecification__Group__1__Impl rule__RESTSpecification__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2229:2: rule__RESTSpecification__Group__1__Impl rule__RESTSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group__1__Impl_in_rule__RESTSpecification__Group__14483);
            rule__RESTSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTSpecification__Group__2_in_rule__RESTSpecification__Group__14486);
            rule__RESTSpecification__Group__2();

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
    // $ANTLR end "rule__RESTSpecification__Group__1"


    // $ANTLR start "rule__RESTSpecification__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2236:1: rule__RESTSpecification__Group__1__Impl : ( ( rule__RESTSpecification__PathAssignment_1 ) ) ;
    public final void rule__RESTSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2240:1: ( ( ( rule__RESTSpecification__PathAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2241:1: ( ( rule__RESTSpecification__PathAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2241:1: ( ( rule__RESTSpecification__PathAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2242:1: ( rule__RESTSpecification__PathAssignment_1 )
            {
             before(grammarAccess.getRESTSpecificationAccess().getPathAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2243:1: ( rule__RESTSpecification__PathAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2243:2: rule__RESTSpecification__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__RESTSpecification__PathAssignment_1_in_rule__RESTSpecification__Group__1__Impl4513);
            rule__RESTSpecification__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRESTSpecificationAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__RESTSpecification__Group__1__Impl"


    // $ANTLR start "rule__RESTSpecification__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2253:1: rule__RESTSpecification__Group__2 : rule__RESTSpecification__Group__2__Impl ;
    public final void rule__RESTSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2257:1: ( rule__RESTSpecification__Group__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2258:2: rule__RESTSpecification__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group__2__Impl_in_rule__RESTSpecification__Group__24543);
            rule__RESTSpecification__Group__2__Impl();

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
    // $ANTLR end "rule__RESTSpecification__Group__2"


    // $ANTLR start "rule__RESTSpecification__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2264:1: rule__RESTSpecification__Group__2__Impl : ( ( rule__RESTSpecification__Group_2__0 )? ) ;
    public final void rule__RESTSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2268:1: ( ( ( rule__RESTSpecification__Group_2__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2269:1: ( ( rule__RESTSpecification__Group_2__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2269:1: ( ( rule__RESTSpecification__Group_2__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2270:1: ( rule__RESTSpecification__Group_2__0 )?
            {
             before(grammarAccess.getRESTSpecificationAccess().getGroup_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2271:1: ( rule__RESTSpecification__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2271:2: rule__RESTSpecification__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RESTSpecification__Group_2__0_in_rule__RESTSpecification__Group__2__Impl4570);
                    rule__RESTSpecification__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRESTSpecificationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__RESTSpecification__Group__2__Impl"


    // $ANTLR start "rule__RESTSpecification__Group_2__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2287:1: rule__RESTSpecification__Group_2__0 : rule__RESTSpecification__Group_2__0__Impl rule__RESTSpecification__Group_2__1 ;
    public final void rule__RESTSpecification__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2291:1: ( rule__RESTSpecification__Group_2__0__Impl rule__RESTSpecification__Group_2__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2292:2: rule__RESTSpecification__Group_2__0__Impl rule__RESTSpecification__Group_2__1
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group_2__0__Impl_in_rule__RESTSpecification__Group_2__04607);
            rule__RESTSpecification__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTSpecification__Group_2__1_in_rule__RESTSpecification__Group_2__04610);
            rule__RESTSpecification__Group_2__1();

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
    // $ANTLR end "rule__RESTSpecification__Group_2__0"


    // $ANTLR start "rule__RESTSpecification__Group_2__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2299:1: rule__RESTSpecification__Group_2__0__Impl : ( '{' ) ;
    public final void rule__RESTSpecification__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2303:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2304:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2304:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2305:1: '{'
            {
             before(grammarAccess.getRESTSpecificationAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__RESTSpecification__Group_2__0__Impl4638); 
             after(grammarAccess.getRESTSpecificationAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__RESTSpecification__Group_2__0__Impl"


    // $ANTLR start "rule__RESTSpecification__Group_2__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2318:1: rule__RESTSpecification__Group_2__1 : rule__RESTSpecification__Group_2__1__Impl rule__RESTSpecification__Group_2__2 ;
    public final void rule__RESTSpecification__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2322:1: ( rule__RESTSpecification__Group_2__1__Impl rule__RESTSpecification__Group_2__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2323:2: rule__RESTSpecification__Group_2__1__Impl rule__RESTSpecification__Group_2__2
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group_2__1__Impl_in_rule__RESTSpecification__Group_2__14669);
            rule__RESTSpecification__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTSpecification__Group_2__2_in_rule__RESTSpecification__Group_2__14672);
            rule__RESTSpecification__Group_2__2();

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
    // $ANTLR end "rule__RESTSpecification__Group_2__1"


    // $ANTLR start "rule__RESTSpecification__Group_2__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2330:1: rule__RESTSpecification__Group_2__1__Impl : ( ( rule__RESTSpecification__BodyAssignment_2_1 ) ) ;
    public final void rule__RESTSpecification__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2334:1: ( ( ( rule__RESTSpecification__BodyAssignment_2_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2335:1: ( ( rule__RESTSpecification__BodyAssignment_2_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2335:1: ( ( rule__RESTSpecification__BodyAssignment_2_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2336:1: ( rule__RESTSpecification__BodyAssignment_2_1 )
            {
             before(grammarAccess.getRESTSpecificationAccess().getBodyAssignment_2_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2337:1: ( rule__RESTSpecification__BodyAssignment_2_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2337:2: rule__RESTSpecification__BodyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RESTSpecification__BodyAssignment_2_1_in_rule__RESTSpecification__Group_2__1__Impl4699);
            rule__RESTSpecification__BodyAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRESTSpecificationAccess().getBodyAssignment_2_1()); 

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
    // $ANTLR end "rule__RESTSpecification__Group_2__1__Impl"


    // $ANTLR start "rule__RESTSpecification__Group_2__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2347:1: rule__RESTSpecification__Group_2__2 : rule__RESTSpecification__Group_2__2__Impl ;
    public final void rule__RESTSpecification__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2351:1: ( rule__RESTSpecification__Group_2__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2352:2: rule__RESTSpecification__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group_2__2__Impl_in_rule__RESTSpecification__Group_2__24729);
            rule__RESTSpecification__Group_2__2__Impl();

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
    // $ANTLR end "rule__RESTSpecification__Group_2__2"


    // $ANTLR start "rule__RESTSpecification__Group_2__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2358:1: rule__RESTSpecification__Group_2__2__Impl : ( '}' ) ;
    public final void rule__RESTSpecification__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2362:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2363:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2363:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2364:1: '}'
            {
             before(grammarAccess.getRESTSpecificationAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__RESTSpecification__Group_2__2__Impl4757); 
             after(grammarAccess.getRESTSpecificationAccess().getRightCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__RESTSpecification__Group_2__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2383:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2387:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2388:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04794);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04797);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2395:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2399:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2400:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2400:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2401:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2402:1: ( rule__Parameter__TypeAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2402:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl4824);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2412:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2416:1: ( rule__Parameter__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2417:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14854);
            rule__Parameter__Group__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2423:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2427:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2428:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2428:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2429:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2430:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2430:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4881);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__AbsoluteRESTURL__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2444:1: rule__AbsoluteRESTURL__Group__0 : rule__AbsoluteRESTURL__Group__0__Impl rule__AbsoluteRESTURL__Group__1 ;
    public final void rule__AbsoluteRESTURL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2448:1: ( rule__AbsoluteRESTURL__Group__0__Impl rule__AbsoluteRESTURL__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2449:2: rule__AbsoluteRESTURL__Group__0__Impl rule__AbsoluteRESTURL__Group__1
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__0__Impl_in_rule__AbsoluteRESTURL__Group__04915);
            rule__AbsoluteRESTURL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__1_in_rule__AbsoluteRESTURL__Group__04918);
            rule__AbsoluteRESTURL__Group__1();

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group__0"


    // $ANTLR start "rule__AbsoluteRESTURL__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2456:1: rule__AbsoluteRESTURL__Group__0__Impl : ( () ) ;
    public final void rule__AbsoluteRESTURL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2460:1: ( ( () ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2461:1: ( () )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2461:1: ( () )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2462:1: ()
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getAbsoluteRESTURLAction_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2463:1: ()
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2465:1: 
            {
            }

             after(grammarAccess.getAbsoluteRESTURLAccess().getAbsoluteRESTURLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteRESTURL__Group__0__Impl"


    // $ANTLR start "rule__AbsoluteRESTURL__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2475:1: rule__AbsoluteRESTURL__Group__1 : rule__AbsoluteRESTURL__Group__1__Impl rule__AbsoluteRESTURL__Group__2 ;
    public final void rule__AbsoluteRESTURL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2479:1: ( rule__AbsoluteRESTURL__Group__1__Impl rule__AbsoluteRESTURL__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2480:2: rule__AbsoluteRESTURL__Group__1__Impl rule__AbsoluteRESTURL__Group__2
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__1__Impl_in_rule__AbsoluteRESTURL__Group__14976);
            rule__AbsoluteRESTURL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__2_in_rule__AbsoluteRESTURL__Group__14979);
            rule__AbsoluteRESTURL__Group__2();

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group__1"


    // $ANTLR start "rule__AbsoluteRESTURL__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2487:1: rule__AbsoluteRESTURL__Group__1__Impl : ( 'http://' ) ;
    public final void rule__AbsoluteRESTURL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2491:1: ( ( 'http://' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2492:1: ( 'http://' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2492:1: ( 'http://' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2493:1: 'http://'
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getHttpKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__AbsoluteRESTURL__Group__1__Impl5007); 
             after(grammarAccess.getAbsoluteRESTURLAccess().getHttpKeyword_1()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group__1__Impl"


    // $ANTLR start "rule__AbsoluteRESTURL__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2506:1: rule__AbsoluteRESTURL__Group__2 : rule__AbsoluteRESTURL__Group__2__Impl rule__AbsoluteRESTURL__Group__3 ;
    public final void rule__AbsoluteRESTURL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2510:1: ( rule__AbsoluteRESTURL__Group__2__Impl rule__AbsoluteRESTURL__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2511:2: rule__AbsoluteRESTURL__Group__2__Impl rule__AbsoluteRESTURL__Group__3
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__2__Impl_in_rule__AbsoluteRESTURL__Group__25038);
            rule__AbsoluteRESTURL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__3_in_rule__AbsoluteRESTURL__Group__25041);
            rule__AbsoluteRESTURL__Group__3();

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group__2"


    // $ANTLR start "rule__AbsoluteRESTURL__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2518:1: rule__AbsoluteRESTURL__Group__2__Impl : ( ( rule__AbsoluteRESTURL__HostAssignment_2 ) ) ;
    public final void rule__AbsoluteRESTURL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2522:1: ( ( ( rule__AbsoluteRESTURL__HostAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2523:1: ( ( rule__AbsoluteRESTURL__HostAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2523:1: ( ( rule__AbsoluteRESTURL__HostAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2524:1: ( rule__AbsoluteRESTURL__HostAssignment_2 )
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getHostAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2525:1: ( rule__AbsoluteRESTURL__HostAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2525:2: rule__AbsoluteRESTURL__HostAssignment_2
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__HostAssignment_2_in_rule__AbsoluteRESTURL__Group__2__Impl5068);
            rule__AbsoluteRESTURL__HostAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteRESTURLAccess().getHostAssignment_2()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group__2__Impl"


    // $ANTLR start "rule__AbsoluteRESTURL__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2535:1: rule__AbsoluteRESTURL__Group__3 : rule__AbsoluteRESTURL__Group__3__Impl rule__AbsoluteRESTURL__Group__4 ;
    public final void rule__AbsoluteRESTURL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2539:1: ( rule__AbsoluteRESTURL__Group__3__Impl rule__AbsoluteRESTURL__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2540:2: rule__AbsoluteRESTURL__Group__3__Impl rule__AbsoluteRESTURL__Group__4
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__3__Impl_in_rule__AbsoluteRESTURL__Group__35098);
            rule__AbsoluteRESTURL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__4_in_rule__AbsoluteRESTURL__Group__35101);
            rule__AbsoluteRESTURL__Group__4();

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group__3"


    // $ANTLR start "rule__AbsoluteRESTURL__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2547:1: rule__AbsoluteRESTURL__Group__3__Impl : ( ( rule__AbsoluteRESTURL__Group_3__0 )? ) ;
    public final void rule__AbsoluteRESTURL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2551:1: ( ( ( rule__AbsoluteRESTURL__Group_3__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2552:1: ( ( rule__AbsoluteRESTURL__Group_3__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2552:1: ( ( rule__AbsoluteRESTURL__Group_3__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2553:1: ( rule__AbsoluteRESTURL__Group_3__0 )?
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getGroup_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2554:1: ( rule__AbsoluteRESTURL__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2554:2: rule__AbsoluteRESTURL__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_3__0_in_rule__AbsoluteRESTURL__Group__3__Impl5128);
                    rule__AbsoluteRESTURL__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbsoluteRESTURLAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group__3__Impl"


    // $ANTLR start "rule__AbsoluteRESTURL__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2564:1: rule__AbsoluteRESTURL__Group__4 : rule__AbsoluteRESTURL__Group__4__Impl ;
    public final void rule__AbsoluteRESTURL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2568:1: ( rule__AbsoluteRESTURL__Group__4__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2569:2: rule__AbsoluteRESTURL__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__4__Impl_in_rule__AbsoluteRESTURL__Group__45159);
            rule__AbsoluteRESTURL__Group__4__Impl();

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group__4"


    // $ANTLR start "rule__AbsoluteRESTURL__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2575:1: rule__AbsoluteRESTURL__Group__4__Impl : ( ( rule__AbsoluteRESTURL__Group_4__0 )* ) ;
    public final void rule__AbsoluteRESTURL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2579:1: ( ( ( rule__AbsoluteRESTURL__Group_4__0 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2580:1: ( ( rule__AbsoluteRESTURL__Group_4__0 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2580:1: ( ( rule__AbsoluteRESTURL__Group_4__0 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2581:1: ( rule__AbsoluteRESTURL__Group_4__0 )*
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getGroup_4()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2582:1: ( rule__AbsoluteRESTURL__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2582:2: rule__AbsoluteRESTURL__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_4__0_in_rule__AbsoluteRESTURL__Group__4__Impl5186);
            	    rule__AbsoluteRESTURL__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAbsoluteRESTURLAccess().getGroup_4()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group__4__Impl"


    // $ANTLR start "rule__AbsoluteRESTURL__Group_3__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2602:1: rule__AbsoluteRESTURL__Group_3__0 : rule__AbsoluteRESTURL__Group_3__0__Impl rule__AbsoluteRESTURL__Group_3__1 ;
    public final void rule__AbsoluteRESTURL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2606:1: ( rule__AbsoluteRESTURL__Group_3__0__Impl rule__AbsoluteRESTURL__Group_3__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2607:2: rule__AbsoluteRESTURL__Group_3__0__Impl rule__AbsoluteRESTURL__Group_3__1
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_3__0__Impl_in_rule__AbsoluteRESTURL__Group_3__05227);
            rule__AbsoluteRESTURL__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_3__1_in_rule__AbsoluteRESTURL__Group_3__05230);
            rule__AbsoluteRESTURL__Group_3__1();

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group_3__0"


    // $ANTLR start "rule__AbsoluteRESTURL__Group_3__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2614:1: rule__AbsoluteRESTURL__Group_3__0__Impl : ( ':' ) ;
    public final void rule__AbsoluteRESTURL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2618:1: ( ( ':' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2619:1: ( ':' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2619:1: ( ':' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2620:1: ':'
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getColonKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__AbsoluteRESTURL__Group_3__0__Impl5258); 
             after(grammarAccess.getAbsoluteRESTURLAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group_3__0__Impl"


    // $ANTLR start "rule__AbsoluteRESTURL__Group_3__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2633:1: rule__AbsoluteRESTURL__Group_3__1 : rule__AbsoluteRESTURL__Group_3__1__Impl ;
    public final void rule__AbsoluteRESTURL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2637:1: ( rule__AbsoluteRESTURL__Group_3__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2638:2: rule__AbsoluteRESTURL__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_3__1__Impl_in_rule__AbsoluteRESTURL__Group_3__15289);
            rule__AbsoluteRESTURL__Group_3__1__Impl();

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group_3__1"


    // $ANTLR start "rule__AbsoluteRESTURL__Group_3__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2644:1: rule__AbsoluteRESTURL__Group_3__1__Impl : ( ( rule__AbsoluteRESTURL__PortAssignment_3_1 ) ) ;
    public final void rule__AbsoluteRESTURL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2648:1: ( ( ( rule__AbsoluteRESTURL__PortAssignment_3_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2649:1: ( ( rule__AbsoluteRESTURL__PortAssignment_3_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2649:1: ( ( rule__AbsoluteRESTURL__PortAssignment_3_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2650:1: ( rule__AbsoluteRESTURL__PortAssignment_3_1 )
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getPortAssignment_3_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2651:1: ( rule__AbsoluteRESTURL__PortAssignment_3_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2651:2: rule__AbsoluteRESTURL__PortAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__PortAssignment_3_1_in_rule__AbsoluteRESTURL__Group_3__1__Impl5316);
            rule__AbsoluteRESTURL__PortAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteRESTURLAccess().getPortAssignment_3_1()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group_3__1__Impl"


    // $ANTLR start "rule__AbsoluteRESTURL__Group_4__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2665:1: rule__AbsoluteRESTURL__Group_4__0 : rule__AbsoluteRESTURL__Group_4__0__Impl rule__AbsoluteRESTURL__Group_4__1 ;
    public final void rule__AbsoluteRESTURL__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2669:1: ( rule__AbsoluteRESTURL__Group_4__0__Impl rule__AbsoluteRESTURL__Group_4__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2670:2: rule__AbsoluteRESTURL__Group_4__0__Impl rule__AbsoluteRESTURL__Group_4__1
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_4__0__Impl_in_rule__AbsoluteRESTURL__Group_4__05350);
            rule__AbsoluteRESTURL__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_4__1_in_rule__AbsoluteRESTURL__Group_4__05353);
            rule__AbsoluteRESTURL__Group_4__1();

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group_4__0"


    // $ANTLR start "rule__AbsoluteRESTURL__Group_4__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2677:1: rule__AbsoluteRESTURL__Group_4__0__Impl : ( '/' ) ;
    public final void rule__AbsoluteRESTURL__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2681:1: ( ( '/' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2682:1: ( '/' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2682:1: ( '/' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2683:1: '/'
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getSolidusKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__AbsoluteRESTURL__Group_4__0__Impl5381); 
             after(grammarAccess.getAbsoluteRESTURLAccess().getSolidusKeyword_4_0()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group_4__0__Impl"


    // $ANTLR start "rule__AbsoluteRESTURL__Group_4__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2696:1: rule__AbsoluteRESTURL__Group_4__1 : rule__AbsoluteRESTURL__Group_4__1__Impl ;
    public final void rule__AbsoluteRESTURL__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2700:1: ( rule__AbsoluteRESTURL__Group_4__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2701:2: rule__AbsoluteRESTURL__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_4__1__Impl_in_rule__AbsoluteRESTURL__Group_4__15412);
            rule__AbsoluteRESTURL__Group_4__1__Impl();

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group_4__1"


    // $ANTLR start "rule__AbsoluteRESTURL__Group_4__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2707:1: rule__AbsoluteRESTURL__Group_4__1__Impl : ( ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 ) ) ;
    public final void rule__AbsoluteRESTURL__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2711:1: ( ( ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2712:1: ( ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2712:1: ( ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2713:1: ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 )
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getFragmentsAssignment_4_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2714:1: ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2714:2: rule__AbsoluteRESTURL__FragmentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__FragmentsAssignment_4_1_in_rule__AbsoluteRESTURL__Group_4__1__Impl5439);
            rule__AbsoluteRESTURL__FragmentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteRESTURLAccess().getFragmentsAssignment_4_1()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__Group_4__1__Impl"


    // $ANTLR start "rule__RelativeRESTURL__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2728:1: rule__RelativeRESTURL__Group__0 : rule__RelativeRESTURL__Group__0__Impl rule__RelativeRESTURL__Group__1 ;
    public final void rule__RelativeRESTURL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2732:1: ( rule__RelativeRESTURL__Group__0__Impl rule__RelativeRESTURL__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2733:2: rule__RelativeRESTURL__Group__0__Impl rule__RelativeRESTURL__Group__1
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__0__Impl_in_rule__RelativeRESTURL__Group__05473);
            rule__RelativeRESTURL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__1_in_rule__RelativeRESTURL__Group__05476);
            rule__RelativeRESTURL__Group__1();

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
    // $ANTLR end "rule__RelativeRESTURL__Group__0"


    // $ANTLR start "rule__RelativeRESTURL__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2740:1: rule__RelativeRESTURL__Group__0__Impl : ( () ) ;
    public final void rule__RelativeRESTURL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2744:1: ( ( () ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2745:1: ( () )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2745:1: ( () )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2746:1: ()
            {
             before(grammarAccess.getRelativeRESTURLAccess().getRelativeRESTURLAction_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2747:1: ()
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2749:1: 
            {
            }

             after(grammarAccess.getRelativeRESTURLAccess().getRelativeRESTURLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeRESTURL__Group__0__Impl"


    // $ANTLR start "rule__RelativeRESTURL__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2759:1: rule__RelativeRESTURL__Group__1 : rule__RelativeRESTURL__Group__1__Impl rule__RelativeRESTURL__Group__2 ;
    public final void rule__RelativeRESTURL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2763:1: ( rule__RelativeRESTURL__Group__1__Impl rule__RelativeRESTURL__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2764:2: rule__RelativeRESTURL__Group__1__Impl rule__RelativeRESTURL__Group__2
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__1__Impl_in_rule__RelativeRESTURL__Group__15534);
            rule__RelativeRESTURL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__2_in_rule__RelativeRESTURL__Group__15537);
            rule__RelativeRESTURL__Group__2();

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
    // $ANTLR end "rule__RelativeRESTURL__Group__1"


    // $ANTLR start "rule__RelativeRESTURL__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2771:1: rule__RelativeRESTURL__Group__1__Impl : ( '/' ) ;
    public final void rule__RelativeRESTURL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2775:1: ( ( '/' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2776:1: ( '/' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2776:1: ( '/' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2777:1: '/'
            {
             before(grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__RelativeRESTURL__Group__1__Impl5565); 
             after(grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_1()); 

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
    // $ANTLR end "rule__RelativeRESTURL__Group__1__Impl"


    // $ANTLR start "rule__RelativeRESTURL__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2790:1: rule__RelativeRESTURL__Group__2 : rule__RelativeRESTURL__Group__2__Impl rule__RelativeRESTURL__Group__3 ;
    public final void rule__RelativeRESTURL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2794:1: ( rule__RelativeRESTURL__Group__2__Impl rule__RelativeRESTURL__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2795:2: rule__RelativeRESTURL__Group__2__Impl rule__RelativeRESTURL__Group__3
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__2__Impl_in_rule__RelativeRESTURL__Group__25596);
            rule__RelativeRESTURL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__3_in_rule__RelativeRESTURL__Group__25599);
            rule__RelativeRESTURL__Group__3();

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
    // $ANTLR end "rule__RelativeRESTURL__Group__2"


    // $ANTLR start "rule__RelativeRESTURL__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2802:1: rule__RelativeRESTURL__Group__2__Impl : ( ( rule__RelativeRESTURL__FragmentsAssignment_2 ) ) ;
    public final void rule__RelativeRESTURL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2806:1: ( ( ( rule__RelativeRESTURL__FragmentsAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2807:1: ( ( rule__RelativeRESTURL__FragmentsAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2807:1: ( ( rule__RelativeRESTURL__FragmentsAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2808:1: ( rule__RelativeRESTURL__FragmentsAssignment_2 )
            {
             before(grammarAccess.getRelativeRESTURLAccess().getFragmentsAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2809:1: ( rule__RelativeRESTURL__FragmentsAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2809:2: rule__RelativeRESTURL__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__FragmentsAssignment_2_in_rule__RelativeRESTURL__Group__2__Impl5626);
            rule__RelativeRESTURL__FragmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelativeRESTURLAccess().getFragmentsAssignment_2()); 

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
    // $ANTLR end "rule__RelativeRESTURL__Group__2__Impl"


    // $ANTLR start "rule__RelativeRESTURL__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2819:1: rule__RelativeRESTURL__Group__3 : rule__RelativeRESTURL__Group__3__Impl ;
    public final void rule__RelativeRESTURL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2823:1: ( rule__RelativeRESTURL__Group__3__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2824:2: rule__RelativeRESTURL__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__3__Impl_in_rule__RelativeRESTURL__Group__35656);
            rule__RelativeRESTURL__Group__3__Impl();

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
    // $ANTLR end "rule__RelativeRESTURL__Group__3"


    // $ANTLR start "rule__RelativeRESTURL__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2830:1: rule__RelativeRESTURL__Group__3__Impl : ( ( rule__RelativeRESTURL__Group_3__0 )* ) ;
    public final void rule__RelativeRESTURL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2834:1: ( ( ( rule__RelativeRESTURL__Group_3__0 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2835:1: ( ( rule__RelativeRESTURL__Group_3__0 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2835:1: ( ( rule__RelativeRESTURL__Group_3__0 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2836:1: ( rule__RelativeRESTURL__Group_3__0 )*
            {
             before(grammarAccess.getRelativeRESTURLAccess().getGroup_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2837:1: ( rule__RelativeRESTURL__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2837:2: rule__RelativeRESTURL__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RelativeRESTURL__Group_3__0_in_rule__RelativeRESTURL__Group__3__Impl5683);
            	    rule__RelativeRESTURL__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRelativeRESTURLAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RelativeRESTURL__Group__3__Impl"


    // $ANTLR start "rule__RelativeRESTURL__Group_3__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2855:1: rule__RelativeRESTURL__Group_3__0 : rule__RelativeRESTURL__Group_3__0__Impl rule__RelativeRESTURL__Group_3__1 ;
    public final void rule__RelativeRESTURL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2859:1: ( rule__RelativeRESTURL__Group_3__0__Impl rule__RelativeRESTURL__Group_3__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2860:2: rule__RelativeRESTURL__Group_3__0__Impl rule__RelativeRESTURL__Group_3__1
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group_3__0__Impl_in_rule__RelativeRESTURL__Group_3__05722);
            rule__RelativeRESTURL__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeRESTURL__Group_3__1_in_rule__RelativeRESTURL__Group_3__05725);
            rule__RelativeRESTURL__Group_3__1();

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
    // $ANTLR end "rule__RelativeRESTURL__Group_3__0"


    // $ANTLR start "rule__RelativeRESTURL__Group_3__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2867:1: rule__RelativeRESTURL__Group_3__0__Impl : ( '/' ) ;
    public final void rule__RelativeRESTURL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2871:1: ( ( '/' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2872:1: ( '/' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2872:1: ( '/' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2873:1: '/'
            {
             before(grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__RelativeRESTURL__Group_3__0__Impl5753); 
             after(grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_3_0()); 

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
    // $ANTLR end "rule__RelativeRESTURL__Group_3__0__Impl"


    // $ANTLR start "rule__RelativeRESTURL__Group_3__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2886:1: rule__RelativeRESTURL__Group_3__1 : rule__RelativeRESTURL__Group_3__1__Impl ;
    public final void rule__RelativeRESTURL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2890:1: ( rule__RelativeRESTURL__Group_3__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2891:2: rule__RelativeRESTURL__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group_3__1__Impl_in_rule__RelativeRESTURL__Group_3__15784);
            rule__RelativeRESTURL__Group_3__1__Impl();

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
    // $ANTLR end "rule__RelativeRESTURL__Group_3__1"


    // $ANTLR start "rule__RelativeRESTURL__Group_3__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2897:1: rule__RelativeRESTURL__Group_3__1__Impl : ( ( rule__RelativeRESTURL__FragmentsAssignment_3_1 ) ) ;
    public final void rule__RelativeRESTURL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2901:1: ( ( ( rule__RelativeRESTURL__FragmentsAssignment_3_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2902:1: ( ( rule__RelativeRESTURL__FragmentsAssignment_3_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2902:1: ( ( rule__RelativeRESTURL__FragmentsAssignment_3_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2903:1: ( rule__RelativeRESTURL__FragmentsAssignment_3_1 )
            {
             before(grammarAccess.getRelativeRESTURLAccess().getFragmentsAssignment_3_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2904:1: ( rule__RelativeRESTURL__FragmentsAssignment_3_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2904:2: rule__RelativeRESTURL__FragmentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__FragmentsAssignment_3_1_in_rule__RelativeRESTURL__Group_3__1__Impl5811);
            rule__RelativeRESTURL__FragmentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeRESTURLAccess().getFragmentsAssignment_3_1()); 

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
    // $ANTLR end "rule__RelativeRESTURL__Group_3__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2918:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2922:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2923:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__05845);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__05848);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2930:1: rule__Variable__Group__0__Impl : ( ':' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2934:1: ( ( ':' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2935:1: ( ':' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2935:1: ( ':' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2936:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Variable__Group__0__Impl5876); 
             after(grammarAccess.getVariableAccess().getColonKeyword_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2949:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2953:1: ( rule__Variable__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2954:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__15907);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2960:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__ParameterReferenceAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2964:1: ( ( ( rule__Variable__ParameterReferenceAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2965:1: ( ( rule__Variable__ParameterReferenceAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2965:1: ( ( rule__Variable__ParameterReferenceAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2966:1: ( rule__Variable__ParameterReferenceAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getParameterReferenceAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2967:1: ( rule__Variable__ParameterReferenceAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2967:2: rule__Variable__ParameterReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__ParameterReferenceAssignment_1_in_rule__Variable__Group__1__Impl5934);
            rule__Variable__ParameterReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getParameterReferenceAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2981:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2985:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2986:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05968);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05971);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2993:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2997:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2998:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2998:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2999:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5998); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3010:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3014:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3015:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16027);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3021:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3025:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3026:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3026:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3027:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3028:1: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3028:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6054);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3042:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3046:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3047:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06089);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06092);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3054:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3058:1: ( ( '.' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3059:1: ( '.' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3059:1: ( '.' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3060:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__QualifiedName__Group_1__0__Impl6120); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3073:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3077:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3078:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16151);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3084:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3088:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3089:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3089:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3090:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6178); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3106:1: rule__Model__ElementsAssignment : ( ruleNamedElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3110:1: ( ( ruleNamedElement ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3111:1: ( ruleNamedElement )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3111:1: ( ruleNamedElement )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3112:1: ruleNamedElement
            {
             before(grammarAccess.getModelAccess().getElementsNamedElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNamedElement_in_rule__Model__ElementsAssignment6216);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsNamedElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3121:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3125:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3126:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3126:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3127:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_16247); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Entity__AbstractAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3136:1: rule__Entity__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Entity__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3140:1: ( ( ( 'abstract' ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3141:1: ( ( 'abstract' ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3141:1: ( ( 'abstract' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3142:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3143:1: ( 'abstract' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3144:1: 'abstract'
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__Entity__AbstractAssignment_06283); 
             after(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 

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
    // $ANTLR end "rule__Entity__AbstractAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3159:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3163:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3164:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3164:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3165:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_26322); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_3_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3174:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3178:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3179:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3179:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3180:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3181:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3182:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_16357); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_5"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3193:1: rule__Entity__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3197:1: ( ( ruleAttribute ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3198:1: ( ruleAttribute )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3198:1: ( ruleAttribute )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3199:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_56392);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_5"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3208:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3212:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3213:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3213:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3214:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3215:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3216:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_06427); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__ManyAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3227:1: rule__Attribute__ManyAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__Attribute__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3231:1: ( ( ( '[]' ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3232:1: ( ( '[]' ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3232:1: ( ( '[]' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3233:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3234:1: ( '[]' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3235:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Attribute__ManyAssignment_16467); 
             after(grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Attribute__ManyAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3250:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3254:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3255:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3255:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3256:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_26506); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Platform__NameAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3265:1: rule__Platform__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Platform__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3269:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3270:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3270:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3271:1: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Platform__NameAssignment_16537); 
             after(grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Platform__NameAssignment_1"


    // $ANTLR start "rule__Platform__MappingsAssignment_3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3280:1: rule__Platform__MappingsAssignment_3 : ( rulePlatformMapping ) ;
    public final void rule__Platform__MappingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3284:1: ( ( rulePlatformMapping ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3285:1: ( rulePlatformMapping )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3285:1: ( rulePlatformMapping )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3286:1: rulePlatformMapping
            {
             before(grammarAccess.getPlatformAccess().getMappingsPlatformMappingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePlatformMapping_in_rule__Platform__MappingsAssignment_36568);
            rulePlatformMapping();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getMappingsPlatformMappingParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Platform__MappingsAssignment_3"


    // $ANTLR start "rule__TypeMapping__TypeAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3295:1: rule__TypeMapping__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeMapping__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3299:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3300:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3300:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3301:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeMappingAccess().getTypeDataTypeCrossReference_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3302:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3303:1: RULE_ID
            {
             before(grammarAccess.getTypeMappingAccess().getTypeDataTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeMapping__TypeAssignment_16603); 
             after(grammarAccess.getTypeMappingAccess().getTypeDataTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTypeMappingAccess().getTypeDataTypeCrossReference_1_0()); 

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
    // $ANTLR end "rule__TypeMapping__TypeAssignment_1"


    // $ANTLR start "rule__TypeMapping__SimpleNameAssignment_3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3314:1: rule__TypeMapping__SimpleNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__TypeMapping__SimpleNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3318:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3319:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3319:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3320:1: RULE_ID
            {
             before(grammarAccess.getTypeMappingAccess().getSimpleNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeMapping__SimpleNameAssignment_36638); 
             after(grammarAccess.getTypeMappingAccess().getSimpleNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__TypeMapping__SimpleNameAssignment_3"


    // $ANTLR start "rule__DataSource__NameAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3329:1: rule__DataSource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3333:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3334:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3334:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3335:1: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSource__NameAssignment_16669); 
             after(grammarAccess.getDataSourceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataSource__NameAssignment_1"


    // $ANTLR start "rule__DataSource__BaseUrlAssignment_5"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3344:1: rule__DataSource__BaseUrlAssignment_5 : ( ruleAbsoluteRESTURL ) ;
    public final void rule__DataSource__BaseUrlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3348:1: ( ( ruleAbsoluteRESTURL ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3349:1: ( ruleAbsoluteRESTURL )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3349:1: ( ruleAbsoluteRESTURL )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3350:1: ruleAbsoluteRESTURL
            {
             before(grammarAccess.getDataSourceAccess().getBaseUrlAbsoluteRESTURLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_rule__DataSource__BaseUrlAssignment_56700);
            ruleAbsoluteRESTURL();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getBaseUrlAbsoluteRESTURLParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__DataSource__BaseUrlAssignment_5"


    // $ANTLR start "rule__DataSource__ResourceTypeAssignment_8"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3359:1: rule__DataSource__ResourceTypeAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__DataSource__ResourceTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3363:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3364:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3364:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3365:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceAccess().getResourceTypeEntityCrossReference_8_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3366:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3367:1: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getResourceTypeEntityIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSource__ResourceTypeAssignment_86735); 
             after(grammarAccess.getDataSourceAccess().getResourceTypeEntityIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getDataSourceAccess().getResourceTypeEntityCrossReference_8_0()); 

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
    // $ANTLR end "rule__DataSource__ResourceTypeAssignment_8"


    // $ANTLR start "rule__DataSource__MethodsAssignment_9"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3378:1: rule__DataSource__MethodsAssignment_9 : ( ruleDataSourceAccessMethod ) ;
    public final void rule__DataSource__MethodsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3382:1: ( ( ruleDataSourceAccessMethod ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3383:1: ( ruleDataSourceAccessMethod )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3383:1: ( ruleDataSourceAccessMethod )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3384:1: ruleDataSourceAccessMethod
            {
             before(grammarAccess.getDataSourceAccess().getMethodsDataSourceAccessMethodParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleDataSourceAccessMethod_in_rule__DataSource__MethodsAssignment_96770);
            ruleDataSourceAccessMethod();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getMethodsDataSourceAccessMethodParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__DataSource__MethodsAssignment_9"


    // $ANTLR start "rule__DataSourceAccessMethod__NameAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3393:1: rule__DataSourceAccessMethod__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DataSourceAccessMethod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3397:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3398:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3398:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3399:1: RULE_ID
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSourceAccessMethod__NameAssignment_06801); 
             after(grammarAccess.getDataSourceAccessMethodAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__NameAssignment_0"


    // $ANTLR start "rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3408:1: rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 : ( ruleParameter ) ;
    public final void rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3412:1: ( ( ruleParameter ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3413:1: ( ruleParameter )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3413:1: ( ruleParameter )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3414:1: ruleParameter
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_06832);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0"


    // $ANTLR start "rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3423:1: rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 : ( ruleParameter ) ;
    public final void rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3427:1: ( ( ruleParameter ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3428:1: ( ruleParameter )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3428:1: ( ruleParameter )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3429:1: ruleParameter
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_16863);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1"


    // $ANTLR start "rule__DataSourceAccessMethod__ReturnsManyAssignment_4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3438:1: rule__DataSourceAccessMethod__ReturnsManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__DataSourceAccessMethod__ReturnsManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3442:1: ( ( ( '[]' ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3443:1: ( ( '[]' ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3443:1: ( ( '[]' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3444:1: ( '[]' )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3445:1: ( '[]' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3446:1: '[]'
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__DataSourceAccessMethod__ReturnsManyAssignment_46899); 
             after(grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

            }

             after(grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__ReturnsManyAssignment_4"


    // $ANTLR start "rule__DataSourceAccessMethod__RestSpecificationAssignment_5"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3461:1: rule__DataSourceAccessMethod__RestSpecificationAssignment_5 : ( ruleRESTSpecification ) ;
    public final void rule__DataSourceAccessMethod__RestSpecificationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3465:1: ( ( ruleRESTSpecification ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3466:1: ( ruleRESTSpecification )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3466:1: ( ruleRESTSpecification )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3467:1: ruleRESTSpecification
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getRestSpecificationRESTSpecificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRESTSpecification_in_rule__DataSourceAccessMethod__RestSpecificationAssignment_56938);
            ruleRESTSpecification();

            state._fsp--;

             after(grammarAccess.getDataSourceAccessMethodAccess().getRestSpecificationRESTSpecificationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__DataSourceAccessMethod__RestSpecificationAssignment_5"


    // $ANTLR start "rule__RESTSpecification__VerbAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3476:1: rule__RESTSpecification__VerbAssignment_0 : ( ruleRESTVerb ) ;
    public final void rule__RESTSpecification__VerbAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3480:1: ( ( ruleRESTVerb ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3481:1: ( ruleRESTVerb )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3481:1: ( ruleRESTVerb )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3482:1: ruleRESTVerb
            {
             before(grammarAccess.getRESTSpecificationAccess().getVerbRESTVerbEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRESTVerb_in_rule__RESTSpecification__VerbAssignment_06969);
            ruleRESTVerb();

            state._fsp--;

             after(grammarAccess.getRESTSpecificationAccess().getVerbRESTVerbEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__RESTSpecification__VerbAssignment_0"


    // $ANTLR start "rule__RESTSpecification__PathAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3491:1: rule__RESTSpecification__PathAssignment_1 : ( ruleRESTURL ) ;
    public final void rule__RESTSpecification__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3495:1: ( ( ruleRESTURL ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3496:1: ( ruleRESTURL )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3496:1: ( ruleRESTURL )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3497:1: ruleRESTURL
            {
             before(grammarAccess.getRESTSpecificationAccess().getPathRESTURLParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRESTURL_in_rule__RESTSpecification__PathAssignment_17000);
            ruleRESTURL();

            state._fsp--;

             after(grammarAccess.getRESTSpecificationAccess().getPathRESTURLParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RESTSpecification__PathAssignment_1"


    // $ANTLR start "rule__RESTSpecification__BodyAssignment_2_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3506:1: rule__RESTSpecification__BodyAssignment_2_1 : ( ruleDataSourceBodySpecification ) ;
    public final void rule__RESTSpecification__BodyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3510:1: ( ( ruleDataSourceBodySpecification ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3511:1: ( ruleDataSourceBodySpecification )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3511:1: ( ruleDataSourceBodySpecification )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3512:1: ruleDataSourceBodySpecification
            {
             before(grammarAccess.getRESTSpecificationAccess().getBodyDataSourceBodySpecificationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDataSourceBodySpecification_in_rule__RESTSpecification__BodyAssignment_2_17031);
            ruleDataSourceBodySpecification();

            state._fsp--;

             after(grammarAccess.getRESTSpecificationAccess().getBodyDataSourceBodySpecificationParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__RESTSpecification__BodyAssignment_2_1"


    // $ANTLR start "rule__DataSourceBodySpecification__BodycontentsAssignment"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3521:1: rule__DataSourceBodySpecification__BodycontentsAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DataSourceBodySpecification__BodycontentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3525:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3526:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3526:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3527:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsParameterCrossReference_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3528:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3529:1: RULE_ID
            {
             before(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsParameterIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSourceBodySpecification__BodycontentsAssignment7066); 
             after(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsParameterIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsParameterCrossReference_0()); 

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
    // $ANTLR end "rule__DataSourceBodySpecification__BodycontentsAssignment"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3540:1: rule__Parameter__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3544:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3545:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3545:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3546:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3547:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3548:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_07105); 
             after(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3559:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3563:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3564:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3564:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3565:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_17140); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__AbsoluteRESTURL__HostAssignment_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3574:1: rule__AbsoluteRESTURL__HostAssignment_2 : ( ruleUrlFragment ) ;
    public final void rule__AbsoluteRESTURL__HostAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3578:1: ( ( ruleUrlFragment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3579:1: ( ruleUrlFragment )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3579:1: ( ruleUrlFragment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3580:1: ruleUrlFragment
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getHostUrlFragmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_rule__AbsoluteRESTURL__HostAssignment_27171);
            ruleUrlFragment();

            state._fsp--;

             after(grammarAccess.getAbsoluteRESTURLAccess().getHostUrlFragmentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__HostAssignment_2"


    // $ANTLR start "rule__AbsoluteRESTURL__PortAssignment_3_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3589:1: rule__AbsoluteRESTURL__PortAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__AbsoluteRESTURL__PortAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3593:1: ( ( RULE_INT ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3594:1: ( RULE_INT )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3594:1: ( RULE_INT )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3595:1: RULE_INT
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getPortINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AbsoluteRESTURL__PortAssignment_3_17202); 
             after(grammarAccess.getAbsoluteRESTURLAccess().getPortINTTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__PortAssignment_3_1"


    // $ANTLR start "rule__AbsoluteRESTURL__FragmentsAssignment_4_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3604:1: rule__AbsoluteRESTURL__FragmentsAssignment_4_1 : ( ruleUrlFragment ) ;
    public final void rule__AbsoluteRESTURL__FragmentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3608:1: ( ( ruleUrlFragment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3609:1: ( ruleUrlFragment )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3609:1: ( ruleUrlFragment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3610:1: ruleUrlFragment
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_rule__AbsoluteRESTURL__FragmentsAssignment_4_17233);
            ruleUrlFragment();

            state._fsp--;

             after(grammarAccess.getAbsoluteRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__AbsoluteRESTURL__FragmentsAssignment_4_1"


    // $ANTLR start "rule__RelativeRESTURL__FragmentsAssignment_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3619:1: rule__RelativeRESTURL__FragmentsAssignment_2 : ( ruleUrlFragment ) ;
    public final void rule__RelativeRESTURL__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3623:1: ( ( ruleUrlFragment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3624:1: ( ruleUrlFragment )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3624:1: ( ruleUrlFragment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3625:1: ruleUrlFragment
            {
             before(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_rule__RelativeRESTURL__FragmentsAssignment_27264);
            ruleUrlFragment();

            state._fsp--;

             after(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RelativeRESTURL__FragmentsAssignment_2"


    // $ANTLR start "rule__RelativeRESTURL__FragmentsAssignment_3_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3634:1: rule__RelativeRESTURL__FragmentsAssignment_3_1 : ( ruleUrlFragment ) ;
    public final void rule__RelativeRESTURL__FragmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3638:1: ( ( ruleUrlFragment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3639:1: ( ruleUrlFragment )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3639:1: ( ruleUrlFragment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3640:1: ruleUrlFragment
            {
             before(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_rule__RelativeRESTURL__FragmentsAssignment_3_17295);
            ruleUrlFragment();

            state._fsp--;

             after(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RelativeRESTURL__FragmentsAssignment_3_1"


    // $ANTLR start "rule__UrlPathFragment__NameAssignment"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3649:1: rule__UrlPathFragment__NameAssignment : ( ruleQualifiedName ) ;
    public final void rule__UrlPathFragment__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3653:1: ( ( ruleQualifiedName ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3654:1: ( ruleQualifiedName )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3654:1: ( ruleQualifiedName )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3655:1: ruleQualifiedName
            {
             before(grammarAccess.getUrlPathFragmentAccess().getNameQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__UrlPathFragment__NameAssignment7326);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUrlPathFragmentAccess().getNameQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__UrlPathFragment__NameAssignment"


    // $ANTLR start "rule__Variable__ParameterReferenceAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3664:1: rule__Variable__ParameterReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Variable__ParameterReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3668:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3669:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3669:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3670:1: ( RULE_ID )
            {
             before(grammarAccess.getVariableAccess().getParameterReferenceParameterCrossReference_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3671:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3672:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getParameterReferenceParameterIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__ParameterReferenceAssignment_17361); 
             after(grammarAccess.getVariableAccess().getParameterReferenceParameterIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getParameterReferenceParameterCrossReference_1_0()); 

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
    // $ANTLR end "rule__Variable__ParameterReferenceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000200918002L});
    public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElement__Alternatives_in_ruleNamedElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0_in_rulePlatform455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatformMapping_in_entryRulePlatformMapping482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatformMapping489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMapping_in_rulePlatformMapping515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMapping_in_entryRuleTypeMapping541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMapping548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__0_in_ruleTypeMapping574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_entryRuleDataSource601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSource608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__0_in_ruleDataSource634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceAccessMethod_in_entryRuleDataSourceAccessMethod661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceAccessMethod668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__0_in_ruleDataSourceAccessMethod694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTSpecification_in_entryRuleRESTSpecification721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTSpecification728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__0_in_ruleRESTSpecification754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceBodySpecification_in_entryRuleDataSourceBodySpecification781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceBodySpecification788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceBodySpecification__BodycontentsAssignment_in_ruleDataSourceBodySpecification814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTURL_in_entryRuleRESTURL901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTURL908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTURL__Alternatives_in_ruleRESTURL934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_entryRuleAbsoluteRESTURL961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteRESTURL968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__0_in_ruleAbsoluteRESTURL994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeRESTURL_in_entryRuleRelativeRESTURL1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeRESTURL1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__0_in_ruleRelativeRESTURL1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_entryRuleUrlFragment1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlFragment1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlFragment__Alternatives_in_ruleUrlFragment1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPathFragment_in_entryRuleUrlPathFragment1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlPathFragment1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlPathFragment__NameAssignment_in_ruleUrlPathFragment1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTVerb__Alternatives_in_ruleRESTVerb1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__NamedElement__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_rule__NamedElement__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_rule__NamedElement__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_rule__RESTURL__Alternatives1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeRESTURL_in_rule__RESTURL__Alternatives1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPathFragment_in_rule__UrlFragment__Alternatives1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__UrlFragment__Alternatives1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RESTVerb__Alternatives1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RESTVerb__Alternatives1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RESTVerb__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RESTVerb__Alternatives1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__01679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataType__Group__0__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__11738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01799 = new BitSet(new long[]{0x0000000200018000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AbstractAssignment_0_in_rule__Entity__Group__0__Impl1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__1__Impl1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21922 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31982 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42043 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__4__Impl2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52105 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_5_in_rule__Entity__Group__5__Impl2135 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__6__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group_3__0__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02362 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12422 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__1__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__02546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__02549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Platform__Group__0__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__12608 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__12611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__NameAssignment_1_in_rule__Platform__Group__1__Impl2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__22668 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__22671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Platform__Group__2__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__32730 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Platform__Group__4_in_rule__Platform__Group__32733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__MappingsAssignment_3_in_rule__Platform__Group__3__Impl2760 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Platform__Group__4__Impl_in_rule__Platform__Group__42791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Platform__Group__4__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__0__Impl_in_rule__TypeMapping__Group__02860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__1_in_rule__TypeMapping__Group__02863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeMapping__Group__0__Impl2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__1__Impl_in_rule__TypeMapping__Group__12922 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__2_in_rule__TypeMapping__Group__12925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__TypeAssignment_1_in_rule__TypeMapping__Group__1__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__2__Impl_in_rule__TypeMapping__Group__22982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__3_in_rule__TypeMapping__Group__22985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeMapping__Group__2__Impl3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__3__Impl_in_rule__TypeMapping__Group__33044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__SimpleNameAssignment_3_in_rule__TypeMapping__Group__3__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__0__Impl_in_rule__DataSource__Group__03109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataSource__Group__1_in_rule__DataSource__Group__03112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataSource__Group__0__Impl3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__1__Impl_in_rule__DataSource__Group__13171 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__2_in_rule__DataSource__Group__13174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__NameAssignment_1_in_rule__DataSource__Group__1__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__2__Impl_in_rule__DataSource__Group__23231 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__3_in_rule__DataSource__Group__23234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DataSource__Group__2__Impl3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__3__Impl_in_rule__DataSource__Group__33293 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__4_in_rule__DataSource__Group__33296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataSource__Group__3__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__4__Impl_in_rule__DataSource__Group__43355 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__5_in_rule__DataSource__Group__43358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DataSource__Group__4__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__5__Impl_in_rule__DataSource__Group__53417 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__6_in_rule__DataSource__Group__53420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__BaseUrlAssignment_5_in_rule__DataSource__Group__5__Impl3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__6__Impl_in_rule__DataSource__Group__63477 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__7_in_rule__DataSource__Group__63480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataSource__Group__6__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__7__Impl_in_rule__DataSource__Group__73539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataSource__Group__8_in_rule__DataSource__Group__73542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DataSource__Group__7__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__8__Impl_in_rule__DataSource__Group__83601 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__DataSource__Group__9_in_rule__DataSource__Group__83604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__ResourceTypeAssignment_8_in_rule__DataSource__Group__8__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__9__Impl_in_rule__DataSource__Group__93661 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__DataSource__Group__10_in_rule__DataSource__Group__93664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__MethodsAssignment_9_in_rule__DataSource__Group__9__Impl3691 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DataSource__Group__10__Impl_in_rule__DataSource__Group__103722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataSource__Group__10__Impl3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__0__Impl_in_rule__DataSourceAccessMethod__Group__03803 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__1_in_rule__DataSourceAccessMethod__Group__03806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__NameAssignment_0_in_rule__DataSourceAccessMethod__Group__0__Impl3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__1__Impl_in_rule__DataSourceAccessMethod__Group__13863 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__2_in_rule__DataSourceAccessMethod__Group__13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DataSourceAccessMethod__Group__1__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__2__Impl_in_rule__DataSourceAccessMethod__Group__23925 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__3_in_rule__DataSourceAccessMethod__Group__23928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2__0_in_rule__DataSourceAccessMethod__Group__2__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__3__Impl_in_rule__DataSourceAccessMethod__Group__33986 = new BitSet(new long[]{0x0000000400007800L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__4_in_rule__DataSourceAccessMethod__Group__33989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DataSourceAccessMethod__Group__3__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__4__Impl_in_rule__DataSourceAccessMethod__Group__44048 = new BitSet(new long[]{0x0000000400007800L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__5_in_rule__DataSourceAccessMethod__Group__44051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__ReturnsManyAssignment_4_in_rule__DataSourceAccessMethod__Group__4__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__5__Impl_in_rule__DataSourceAccessMethod__Group__54109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__RestSpecificationAssignment_5_in_rule__DataSourceAccessMethod__Group__5__Impl4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2__0__Impl_in_rule__DataSourceAccessMethod__Group_2__04178 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2__1_in_rule__DataSourceAccessMethod__Group_2__04181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0_in_rule__DataSourceAccessMethod__Group_2__0__Impl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2__1__Impl_in_rule__DataSourceAccessMethod__Group_2__14238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2_1__0_in_rule__DataSourceAccessMethod__Group_2__1__Impl4265 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2_1__0__Impl_in_rule__DataSourceAccessMethod__Group_2_1__04300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2_1__1_in_rule__DataSourceAccessMethod__Group_2_1__04303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DataSourceAccessMethod__Group_2_1__0__Impl4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2_1__1__Impl_in_rule__DataSourceAccessMethod__Group_2_1__14362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1_in_rule__DataSourceAccessMethod__Group_2_1__1__Impl4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__0__Impl_in_rule__RESTSpecification__Group__04423 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__1_in_rule__RESTSpecification__Group__04426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__VerbAssignment_0_in_rule__RESTSpecification__Group__0__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__1__Impl_in_rule__RESTSpecification__Group__14483 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__2_in_rule__RESTSpecification__Group__14486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__PathAssignment_1_in_rule__RESTSpecification__Group__1__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__2__Impl_in_rule__RESTSpecification__Group__24543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__0_in_rule__RESTSpecification__Group__2__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__0__Impl_in_rule__RESTSpecification__Group_2__04607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__1_in_rule__RESTSpecification__Group_2__04610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RESTSpecification__Group_2__0__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__1__Impl_in_rule__RESTSpecification__Group_2__14669 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__2_in_rule__RESTSpecification__Group_2__14672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__BodyAssignment_2_1_in_rule__RESTSpecification__Group_2__1__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__2__Impl_in_rule__RESTSpecification__Group_2__24729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RESTSpecification__Group_2__2__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__0__Impl_in_rule__AbsoluteRESTURL__Group__04915 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__1_in_rule__AbsoluteRESTURL__Group__04918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__1__Impl_in_rule__AbsoluteRESTURL__Group__14976 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__2_in_rule__AbsoluteRESTURL__Group__14979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AbsoluteRESTURL__Group__1__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__2__Impl_in_rule__AbsoluteRESTURL__Group__25038 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__3_in_rule__AbsoluteRESTURL__Group__25041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__HostAssignment_2_in_rule__AbsoluteRESTURL__Group__2__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__3__Impl_in_rule__AbsoluteRESTURL__Group__35098 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__4_in_rule__AbsoluteRESTURL__Group__35101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_3__0_in_rule__AbsoluteRESTURL__Group__3__Impl5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__4__Impl_in_rule__AbsoluteRESTURL__Group__45159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_4__0_in_rule__AbsoluteRESTURL__Group__4__Impl5186 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_3__0__Impl_in_rule__AbsoluteRESTURL__Group_3__05227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_3__1_in_rule__AbsoluteRESTURL__Group_3__05230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AbsoluteRESTURL__Group_3__0__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_3__1__Impl_in_rule__AbsoluteRESTURL__Group_3__15289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__PortAssignment_3_1_in_rule__AbsoluteRESTURL__Group_3__1__Impl5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_4__0__Impl_in_rule__AbsoluteRESTURL__Group_4__05350 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_4__1_in_rule__AbsoluteRESTURL__Group_4__05353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AbsoluteRESTURL__Group_4__0__Impl5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_4__1__Impl_in_rule__AbsoluteRESTURL__Group_4__15412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__FragmentsAssignment_4_1_in_rule__AbsoluteRESTURL__Group_4__1__Impl5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__0__Impl_in_rule__RelativeRESTURL__Group__05473 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__1_in_rule__RelativeRESTURL__Group__05476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__1__Impl_in_rule__RelativeRESTURL__Group__15534 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__2_in_rule__RelativeRESTURL__Group__15537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RelativeRESTURL__Group__1__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__2__Impl_in_rule__RelativeRESTURL__Group__25596 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__3_in_rule__RelativeRESTURL__Group__25599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__FragmentsAssignment_2_in_rule__RelativeRESTURL__Group__2__Impl5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__3__Impl_in_rule__RelativeRESTURL__Group__35656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group_3__0_in_rule__RelativeRESTURL__Group__3__Impl5683 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group_3__0__Impl_in_rule__RelativeRESTURL__Group_3__05722 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group_3__1_in_rule__RelativeRESTURL__Group_3__05725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RelativeRESTURL__Group_3__0__Impl5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group_3__1__Impl_in_rule__RelativeRESTURL__Group_3__15784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__FragmentsAssignment_3_1_in_rule__RelativeRESTURL__Group_3__1__Impl5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__05845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__05848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Variable__Group__0__Impl5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__15907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ParameterReferenceAssignment_1_in_rule__Variable__Group__1__Impl5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05968 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6054 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__QualifiedName__Group_1__0__Impl6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElement_in_rule__Model__ElementsAssignment6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_16247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Entity__AbstractAssignment_06283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_26322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_16357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_56392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_06427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Attribute__ManyAssignment_16467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_26506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Platform__NameAssignment_16537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatformMapping_in_rule__Platform__MappingsAssignment_36568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeMapping__TypeAssignment_16603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeMapping__SimpleNameAssignment_36638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSource__NameAssignment_16669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_rule__DataSource__BaseUrlAssignment_56700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSource__ResourceTypeAssignment_86735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceAccessMethod_in_rule__DataSource__MethodsAssignment_96770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSourceAccessMethod__NameAssignment_06801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_06832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_16863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataSourceAccessMethod__ReturnsManyAssignment_46899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTSpecification_in_rule__DataSourceAccessMethod__RestSpecificationAssignment_56938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTVerb_in_rule__RESTSpecification__VerbAssignment_06969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTURL_in_rule__RESTSpecification__PathAssignment_17000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceBodySpecification_in_rule__RESTSpecification__BodyAssignment_2_17031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSourceBodySpecification__BodycontentsAssignment7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_07105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_17140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_rule__AbsoluteRESTURL__HostAssignment_27171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AbsoluteRESTURL__PortAssignment_3_17202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_rule__AbsoluteRESTURL__FragmentsAssignment_4_17233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_rule__RelativeRESTURL__FragmentsAssignment_27264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_rule__RelativeRESTURL__FragmentsAssignment_3_17295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__UrlPathFragment__NameAssignment7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__ParameterReferenceAssignment_17361 = new BitSet(new long[]{0x0000000000000002L});

}