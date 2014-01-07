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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'platform'", "'resource'", "'section'", "'abstract'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'DefaultList'", "'DefaultDetails'", "'datatype'", "'entity'", "'{'", "'}'", "'extends'", "'typemapping'", "'->'", "'datasource'", "'baseUrl'", "':'", "'('", "')'", "','", "'http://'", "'/'", "'.'", "'screen'", "'sections'", "'='", "'items'", "'cell'", "'foreach'", "'as'", "'listitemcell'", "'uicomponent'", "'[]'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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

                if ( (LA1_0==12||LA1_0==15||(LA1_0>=22 && LA1_0<=23)||LA1_0==29||LA1_0==38||(LA1_0>=45 && LA1_0<=46)) ) {
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


    // $ANTLR start "entryRuleKeywordedID"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:144:1: entryRuleKeywordedID : ruleKeywordedID EOF ;
    public final void entryRuleKeywordedID() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:145:1: ( ruleKeywordedID EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:146:1: ruleKeywordedID EOF
            {
             before(grammarAccess.getKeywordedIDRule()); 
            pushFollow(FOLLOW_ruleKeywordedID_in_entryRuleKeywordedID242);
            ruleKeywordedID();

            state._fsp--;

             after(grammarAccess.getKeywordedIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeywordedID249); 

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
    // $ANTLR end "entryRuleKeywordedID"


    // $ANTLR start "ruleKeywordedID"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:153:1: ruleKeywordedID : ( ( rule__KeywordedID__Alternatives ) ) ;
    public final void ruleKeywordedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:157:2: ( ( ( rule__KeywordedID__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:158:1: ( ( rule__KeywordedID__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:158:1: ( ( rule__KeywordedID__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:159:1: ( rule__KeywordedID__Alternatives )
            {
             before(grammarAccess.getKeywordedIDAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:160:1: ( rule__KeywordedID__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:160:2: rule__KeywordedID__Alternatives
            {
            pushFollow(FOLLOW_rule__KeywordedID__Alternatives_in_ruleKeywordedID275);
            rule__KeywordedID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKeywordedIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKeywordedID"


    // $ANTLR start "entryRuleDataType"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:172:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:173:1: ( ruleDataType EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:174:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType302);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType309); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:181:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:185:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:186:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:186:1: ( ( rule__DataType__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:187:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:188:1: ( rule__DataType__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:188:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType335);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:200:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:201:1: ( ruleEntity EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:202:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity362);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity369); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:209:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:213:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:214:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:214:1: ( ( rule__Entity__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:215:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:216:1: ( rule__Entity__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:216:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity395);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:229:1: ( ruleAttribute EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:230:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute422);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute429); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:237:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:241:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:242:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:242:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:243:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:244:1: ( rule__Attribute__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:244:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute455);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:256:1: entryRulePlatform : rulePlatform EOF ;
    public final void entryRulePlatform() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:257:1: ( rulePlatform EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:258:1: rulePlatform EOF
            {
             before(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform482);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getPlatformRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform489); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:265:1: rulePlatform : ( ( rule__Platform__Group__0 ) ) ;
    public final void rulePlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:269:2: ( ( ( rule__Platform__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:270:1: ( ( rule__Platform__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:270:1: ( ( rule__Platform__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:271:1: ( rule__Platform__Group__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:272:1: ( rule__Platform__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:272:2: rule__Platform__Group__0
            {
            pushFollow(FOLLOW_rule__Platform__Group__0_in_rulePlatform515);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:284:1: entryRulePlatformMapping : rulePlatformMapping EOF ;
    public final void entryRulePlatformMapping() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:285:1: ( rulePlatformMapping EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:286:1: rulePlatformMapping EOF
            {
             before(grammarAccess.getPlatformMappingRule()); 
            pushFollow(FOLLOW_rulePlatformMapping_in_entryRulePlatformMapping542);
            rulePlatformMapping();

            state._fsp--;

             after(grammarAccess.getPlatformMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatformMapping549); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:293:1: rulePlatformMapping : ( ruleTypeMapping ) ;
    public final void rulePlatformMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:297:2: ( ( ruleTypeMapping ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:298:1: ( ruleTypeMapping )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:298:1: ( ruleTypeMapping )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:299:1: ruleTypeMapping
            {
             before(grammarAccess.getPlatformMappingAccess().getTypeMappingParserRuleCall()); 
            pushFollow(FOLLOW_ruleTypeMapping_in_rulePlatformMapping575);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:312:1: entryRuleTypeMapping : ruleTypeMapping EOF ;
    public final void entryRuleTypeMapping() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:313:1: ( ruleTypeMapping EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:314:1: ruleTypeMapping EOF
            {
             before(grammarAccess.getTypeMappingRule()); 
            pushFollow(FOLLOW_ruleTypeMapping_in_entryRuleTypeMapping601);
            ruleTypeMapping();

            state._fsp--;

             after(grammarAccess.getTypeMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMapping608); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:321:1: ruleTypeMapping : ( ( rule__TypeMapping__Group__0 ) ) ;
    public final void ruleTypeMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:325:2: ( ( ( rule__TypeMapping__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:326:1: ( ( rule__TypeMapping__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:326:1: ( ( rule__TypeMapping__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:327:1: ( rule__TypeMapping__Group__0 )
            {
             before(grammarAccess.getTypeMappingAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:328:1: ( rule__TypeMapping__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:328:2: rule__TypeMapping__Group__0
            {
            pushFollow(FOLLOW_rule__TypeMapping__Group__0_in_ruleTypeMapping634);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:340:1: entryRuleDataSource : ruleDataSource EOF ;
    public final void entryRuleDataSource() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:341:1: ( ruleDataSource EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:342:1: ruleDataSource EOF
            {
             before(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_ruleDataSource_in_entryRuleDataSource661);
            ruleDataSource();

            state._fsp--;

             after(grammarAccess.getDataSourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSource668); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:349:1: ruleDataSource : ( ( rule__DataSource__Group__0 ) ) ;
    public final void ruleDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:353:2: ( ( ( rule__DataSource__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:354:1: ( ( rule__DataSource__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:354:1: ( ( rule__DataSource__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:355:1: ( rule__DataSource__Group__0 )
            {
             before(grammarAccess.getDataSourceAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:356:1: ( rule__DataSource__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:356:2: rule__DataSource__Group__0
            {
            pushFollow(FOLLOW_rule__DataSource__Group__0_in_ruleDataSource694);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:368:1: entryRuleDataSourceAccessMethod : ruleDataSourceAccessMethod EOF ;
    public final void entryRuleDataSourceAccessMethod() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:369:1: ( ruleDataSourceAccessMethod EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:370:1: ruleDataSourceAccessMethod EOF
            {
             before(grammarAccess.getDataSourceAccessMethodRule()); 
            pushFollow(FOLLOW_ruleDataSourceAccessMethod_in_entryRuleDataSourceAccessMethod721);
            ruleDataSourceAccessMethod();

            state._fsp--;

             after(grammarAccess.getDataSourceAccessMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceAccessMethod728); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:377:1: ruleDataSourceAccessMethod : ( ( rule__DataSourceAccessMethod__Group__0 ) ) ;
    public final void ruleDataSourceAccessMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:381:2: ( ( ( rule__DataSourceAccessMethod__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:382:1: ( ( rule__DataSourceAccessMethod__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:382:1: ( ( rule__DataSourceAccessMethod__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:383:1: ( rule__DataSourceAccessMethod__Group__0 )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:384:1: ( rule__DataSourceAccessMethod__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:384:2: rule__DataSourceAccessMethod__Group__0
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__0_in_ruleDataSourceAccessMethod754);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:396:1: entryRuleRESTSpecification : ruleRESTSpecification EOF ;
    public final void entryRuleRESTSpecification() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:397:1: ( ruleRESTSpecification EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:398:1: ruleRESTSpecification EOF
            {
             before(grammarAccess.getRESTSpecificationRule()); 
            pushFollow(FOLLOW_ruleRESTSpecification_in_entryRuleRESTSpecification781);
            ruleRESTSpecification();

            state._fsp--;

             after(grammarAccess.getRESTSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTSpecification788); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:405:1: ruleRESTSpecification : ( ( rule__RESTSpecification__Group__0 ) ) ;
    public final void ruleRESTSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:409:2: ( ( ( rule__RESTSpecification__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:410:1: ( ( rule__RESTSpecification__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:410:1: ( ( rule__RESTSpecification__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:411:1: ( rule__RESTSpecification__Group__0 )
            {
             before(grammarAccess.getRESTSpecificationAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:412:1: ( rule__RESTSpecification__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:412:2: rule__RESTSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group__0_in_ruleRESTSpecification814);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:424:1: entryRuleDataSourceBodySpecification : ruleDataSourceBodySpecification EOF ;
    public final void entryRuleDataSourceBodySpecification() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:425:1: ( ruleDataSourceBodySpecification EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:426:1: ruleDataSourceBodySpecification EOF
            {
             before(grammarAccess.getDataSourceBodySpecificationRule()); 
            pushFollow(FOLLOW_ruleDataSourceBodySpecification_in_entryRuleDataSourceBodySpecification841);
            ruleDataSourceBodySpecification();

            state._fsp--;

             after(grammarAccess.getDataSourceBodySpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceBodySpecification848); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:433:1: ruleDataSourceBodySpecification : ( ( rule__DataSourceBodySpecification__BodycontentsAssignment ) ) ;
    public final void ruleDataSourceBodySpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:437:2: ( ( ( rule__DataSourceBodySpecification__BodycontentsAssignment ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:438:1: ( ( rule__DataSourceBodySpecification__BodycontentsAssignment ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:438:1: ( ( rule__DataSourceBodySpecification__BodycontentsAssignment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:439:1: ( rule__DataSourceBodySpecification__BodycontentsAssignment )
            {
             before(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsAssignment()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:440:1: ( rule__DataSourceBodySpecification__BodycontentsAssignment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:440:2: rule__DataSourceBodySpecification__BodycontentsAssignment
            {
            pushFollow(FOLLOW_rule__DataSourceBodySpecification__BodycontentsAssignment_in_ruleDataSourceBodySpecification874);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:452:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:453:1: ( ruleParameter EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:454:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter901);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter908); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:461:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:465:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:466:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:466:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:467:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:468:1: ( rule__Parameter__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:468:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter934);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:480:1: entryRuleRESTURL : ruleRESTURL EOF ;
    public final void entryRuleRESTURL() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:481:1: ( ruleRESTURL EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:482:1: ruleRESTURL EOF
            {
             before(grammarAccess.getRESTURLRule()); 
            pushFollow(FOLLOW_ruleRESTURL_in_entryRuleRESTURL961);
            ruleRESTURL();

            state._fsp--;

             after(grammarAccess.getRESTURLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTURL968); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:489:1: ruleRESTURL : ( ( rule__RESTURL__Alternatives ) ) ;
    public final void ruleRESTURL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:493:2: ( ( ( rule__RESTURL__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:494:1: ( ( rule__RESTURL__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:494:1: ( ( rule__RESTURL__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:495:1: ( rule__RESTURL__Alternatives )
            {
             before(grammarAccess.getRESTURLAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:496:1: ( rule__RESTURL__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:496:2: rule__RESTURL__Alternatives
            {
            pushFollow(FOLLOW_rule__RESTURL__Alternatives_in_ruleRESTURL994);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:508:1: entryRuleAbsoluteRESTURL : ruleAbsoluteRESTURL EOF ;
    public final void entryRuleAbsoluteRESTURL() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:509:1: ( ruleAbsoluteRESTURL EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:510:1: ruleAbsoluteRESTURL EOF
            {
             before(grammarAccess.getAbsoluteRESTURLRule()); 
            pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_entryRuleAbsoluteRESTURL1021);
            ruleAbsoluteRESTURL();

            state._fsp--;

             after(grammarAccess.getAbsoluteRESTURLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteRESTURL1028); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:517:1: ruleAbsoluteRESTURL : ( ( rule__AbsoluteRESTURL__Group__0 ) ) ;
    public final void ruleAbsoluteRESTURL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:521:2: ( ( ( rule__AbsoluteRESTURL__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:522:1: ( ( rule__AbsoluteRESTURL__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:522:1: ( ( rule__AbsoluteRESTURL__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:523:1: ( rule__AbsoluteRESTURL__Group__0 )
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:524:1: ( rule__AbsoluteRESTURL__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:524:2: rule__AbsoluteRESTURL__Group__0
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__0_in_ruleAbsoluteRESTURL1054);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:536:1: entryRuleRelativeRESTURL : ruleRelativeRESTURL EOF ;
    public final void entryRuleRelativeRESTURL() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:537:1: ( ruleRelativeRESTURL EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:538:1: ruleRelativeRESTURL EOF
            {
             before(grammarAccess.getRelativeRESTURLRule()); 
            pushFollow(FOLLOW_ruleRelativeRESTURL_in_entryRuleRelativeRESTURL1081);
            ruleRelativeRESTURL();

            state._fsp--;

             after(grammarAccess.getRelativeRESTURLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeRESTURL1088); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:545:1: ruleRelativeRESTURL : ( ( rule__RelativeRESTURL__Group__0 ) ) ;
    public final void ruleRelativeRESTURL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:549:2: ( ( ( rule__RelativeRESTURL__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:550:1: ( ( rule__RelativeRESTURL__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:550:1: ( ( rule__RelativeRESTURL__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:551:1: ( rule__RelativeRESTURL__Group__0 )
            {
             before(grammarAccess.getRelativeRESTURLAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:552:1: ( rule__RelativeRESTURL__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:552:2: rule__RelativeRESTURL__Group__0
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__0_in_ruleRelativeRESTURL1114);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:564:1: entryRuleUrlFragment : ruleUrlFragment EOF ;
    public final void entryRuleUrlFragment() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:565:1: ( ruleUrlFragment EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:566:1: ruleUrlFragment EOF
            {
             before(grammarAccess.getUrlFragmentRule()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_entryRuleUrlFragment1141);
            ruleUrlFragment();

            state._fsp--;

             after(grammarAccess.getUrlFragmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlFragment1148); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:573:1: ruleUrlFragment : ( ( rule__UrlFragment__Alternatives ) ) ;
    public final void ruleUrlFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:577:2: ( ( ( rule__UrlFragment__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:578:1: ( ( rule__UrlFragment__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:578:1: ( ( rule__UrlFragment__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:579:1: ( rule__UrlFragment__Alternatives )
            {
             before(grammarAccess.getUrlFragmentAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:580:1: ( rule__UrlFragment__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:580:2: rule__UrlFragment__Alternatives
            {
            pushFollow(FOLLOW_rule__UrlFragment__Alternatives_in_ruleUrlFragment1174);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:592:1: entryRuleUrlPathFragment : ruleUrlPathFragment EOF ;
    public final void entryRuleUrlPathFragment() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:593:1: ( ruleUrlPathFragment EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:594:1: ruleUrlPathFragment EOF
            {
             before(grammarAccess.getUrlPathFragmentRule()); 
            pushFollow(FOLLOW_ruleUrlPathFragment_in_entryRuleUrlPathFragment1201);
            ruleUrlPathFragment();

            state._fsp--;

             after(grammarAccess.getUrlPathFragmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlPathFragment1208); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:601:1: ruleUrlPathFragment : ( ( rule__UrlPathFragment__NameAssignment ) ) ;
    public final void ruleUrlPathFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:605:2: ( ( ( rule__UrlPathFragment__NameAssignment ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:606:1: ( ( rule__UrlPathFragment__NameAssignment ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:606:1: ( ( rule__UrlPathFragment__NameAssignment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:607:1: ( rule__UrlPathFragment__NameAssignment )
            {
             before(grammarAccess.getUrlPathFragmentAccess().getNameAssignment()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:608:1: ( rule__UrlPathFragment__NameAssignment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:608:2: rule__UrlPathFragment__NameAssignment
            {
            pushFollow(FOLLOW_rule__UrlPathFragment__NameAssignment_in_ruleUrlPathFragment1234);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:620:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:621:1: ( ruleVariable EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:622:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1261);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1268); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:629:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:633:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:634:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:634:1: ( ( rule__Variable__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:635:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:636:1: ( rule__Variable__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:636:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable1294);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:648:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:649:1: ( ruleQualifiedName EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:650:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1321);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1328); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:657:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:661:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:662:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:662:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:663:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:664:1: ( rule__QualifiedName__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:664:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1354);
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


    // $ANTLR start "entryRuleScreen"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:676:1: entryRuleScreen : ruleScreen EOF ;
    public final void entryRuleScreen() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:677:1: ( ruleScreen EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:678:1: ruleScreen EOF
            {
             before(grammarAccess.getScreenRule()); 
            pushFollow(FOLLOW_ruleScreen_in_entryRuleScreen1381);
            ruleScreen();

            state._fsp--;

             after(grammarAccess.getScreenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreen1388); 

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
    // $ANTLR end "entryRuleScreen"


    // $ANTLR start "ruleScreen"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:685:1: ruleScreen : ( ( rule__Screen__Group__0 ) ) ;
    public final void ruleScreen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:689:2: ( ( ( rule__Screen__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:690:1: ( ( rule__Screen__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:690:1: ( ( rule__Screen__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:691:1: ( rule__Screen__Group__0 )
            {
             before(grammarAccess.getScreenAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:692:1: ( rule__Screen__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:692:2: rule__Screen__Group__0
            {
            pushFollow(FOLLOW_rule__Screen__Group__0_in_ruleScreen1414);
            rule__Screen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScreenAccess().getGroup()); 

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
    // $ANTLR end "ruleScreen"


    // $ANTLR start "entryRuleScreenSection"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:704:1: entryRuleScreenSection : ruleScreenSection EOF ;
    public final void entryRuleScreenSection() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:705:1: ( ruleScreenSection EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:706:1: ruleScreenSection EOF
            {
             before(grammarAccess.getScreenSectionRule()); 
            pushFollow(FOLLOW_ruleScreenSection_in_entryRuleScreenSection1441);
            ruleScreenSection();

            state._fsp--;

             after(grammarAccess.getScreenSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenSection1448); 

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
    // $ANTLR end "entryRuleScreenSection"


    // $ANTLR start "ruleScreenSection"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:713:1: ruleScreenSection : ( ( rule__ScreenSection__Group__0 ) ) ;
    public final void ruleScreenSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:717:2: ( ( ( rule__ScreenSection__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:718:1: ( ( rule__ScreenSection__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:718:1: ( ( rule__ScreenSection__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:719:1: ( rule__ScreenSection__Group__0 )
            {
             before(grammarAccess.getScreenSectionAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:720:1: ( rule__ScreenSection__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:720:2: rule__ScreenSection__Group__0
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group__0_in_ruleScreenSection1474);
            rule__ScreenSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScreenSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleScreenSection"


    // $ANTLR start "entryRuleScreenSectionItems"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:732:1: entryRuleScreenSectionItems : ruleScreenSectionItems EOF ;
    public final void entryRuleScreenSectionItems() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:733:1: ( ruleScreenSectionItems EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:734:1: ruleScreenSectionItems EOF
            {
             before(grammarAccess.getScreenSectionItemsRule()); 
            pushFollow(FOLLOW_ruleScreenSectionItems_in_entryRuleScreenSectionItems1501);
            ruleScreenSectionItems();

            state._fsp--;

             after(grammarAccess.getScreenSectionItemsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenSectionItems1508); 

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
    // $ANTLR end "entryRuleScreenSectionItems"


    // $ANTLR start "ruleScreenSectionItems"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:741:1: ruleScreenSectionItems : ( ( rule__ScreenSectionItems__Group__0 ) ) ;
    public final void ruleScreenSectionItems() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:745:2: ( ( ( rule__ScreenSectionItems__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:746:1: ( ( rule__ScreenSectionItems__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:746:1: ( ( rule__ScreenSectionItems__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:747:1: ( rule__ScreenSectionItems__Group__0 )
            {
             before(grammarAccess.getScreenSectionItemsAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:748:1: ( rule__ScreenSectionItems__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:748:2: rule__ScreenSectionItems__Group__0
            {
            pushFollow(FOLLOW_rule__ScreenSectionItems__Group__0_in_ruleScreenSectionItems1534);
            rule__ScreenSectionItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScreenSectionItemsAccess().getGroup()); 

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
    // $ANTLR end "ruleScreenSectionItems"


    // $ANTLR start "entryRuleScreenListItemCell"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:760:1: entryRuleScreenListItemCell : ruleScreenListItemCell EOF ;
    public final void entryRuleScreenListItemCell() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:761:1: ( ruleScreenListItemCell EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:762:1: ruleScreenListItemCell EOF
            {
             before(grammarAccess.getScreenListItemCellRule()); 
            pushFollow(FOLLOW_ruleScreenListItemCell_in_entryRuleScreenListItemCell1561);
            ruleScreenListItemCell();

            state._fsp--;

             after(grammarAccess.getScreenListItemCellRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenListItemCell1568); 

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
    // $ANTLR end "entryRuleScreenListItemCell"


    // $ANTLR start "ruleScreenListItemCell"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:769:1: ruleScreenListItemCell : ( ( rule__ScreenListItemCell__Group__0 ) ) ;
    public final void ruleScreenListItemCell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:773:2: ( ( ( rule__ScreenListItemCell__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:774:1: ( ( rule__ScreenListItemCell__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:774:1: ( ( rule__ScreenListItemCell__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:775:1: ( rule__ScreenListItemCell__Group__0 )
            {
             before(grammarAccess.getScreenListItemCellAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:776:1: ( rule__ScreenListItemCell__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:776:2: rule__ScreenListItemCell__Group__0
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__0_in_ruleScreenListItemCell1594);
            rule__ScreenListItemCell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScreenListItemCellAccess().getGroup()); 

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
    // $ANTLR end "ruleScreenListItemCell"


    // $ANTLR start "entryRuleListItemCellDeclaration"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:788:1: entryRuleListItemCellDeclaration : ruleListItemCellDeclaration EOF ;
    public final void entryRuleListItemCellDeclaration() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:789:1: ( ruleListItemCellDeclaration EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:790:1: ruleListItemCellDeclaration EOF
            {
             before(grammarAccess.getListItemCellDeclarationRule()); 
            pushFollow(FOLLOW_ruleListItemCellDeclaration_in_entryRuleListItemCellDeclaration1621);
            ruleListItemCellDeclaration();

            state._fsp--;

             after(grammarAccess.getListItemCellDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListItemCellDeclaration1628); 

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
    // $ANTLR end "entryRuleListItemCellDeclaration"


    // $ANTLR start "ruleListItemCellDeclaration"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:797:1: ruleListItemCellDeclaration : ( ( rule__ListItemCellDeclaration__Group__0 ) ) ;
    public final void ruleListItemCellDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:801:2: ( ( ( rule__ListItemCellDeclaration__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:802:1: ( ( rule__ListItemCellDeclaration__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:802:1: ( ( rule__ListItemCellDeclaration__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:803:1: ( rule__ListItemCellDeclaration__Group__0 )
            {
             before(grammarAccess.getListItemCellDeclarationAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:804:1: ( rule__ListItemCellDeclaration__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:804:2: rule__ListItemCellDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ListItemCellDeclaration__Group__0_in_ruleListItemCellDeclaration1654);
            rule__ListItemCellDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListItemCellDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleListItemCellDeclaration"


    // $ANTLR start "entryRuleUIComponentDeclaration"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:816:1: entryRuleUIComponentDeclaration : ruleUIComponentDeclaration EOF ;
    public final void entryRuleUIComponentDeclaration() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:817:1: ( ruleUIComponentDeclaration EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:818:1: ruleUIComponentDeclaration EOF
            {
             before(grammarAccess.getUIComponentDeclarationRule()); 
            pushFollow(FOLLOW_ruleUIComponentDeclaration_in_entryRuleUIComponentDeclaration1681);
            ruleUIComponentDeclaration();

            state._fsp--;

             after(grammarAccess.getUIComponentDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentDeclaration1688); 

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
    // $ANTLR end "entryRuleUIComponentDeclaration"


    // $ANTLR start "ruleUIComponentDeclaration"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:825:1: ruleUIComponentDeclaration : ( ( rule__UIComponentDeclaration__Group__0 ) ) ;
    public final void ruleUIComponentDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:829:2: ( ( ( rule__UIComponentDeclaration__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:830:1: ( ( rule__UIComponentDeclaration__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:830:1: ( ( rule__UIComponentDeclaration__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:831:1: ( rule__UIComponentDeclaration__Group__0 )
            {
             before(grammarAccess.getUIComponentDeclarationAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:832:1: ( rule__UIComponentDeclaration__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:832:2: rule__UIComponentDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__UIComponentDeclaration__Group__0_in_ruleUIComponentDeclaration1714);
            rule__UIComponentDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleUIComponentDeclaration"


    // $ANTLR start "entryRuleUIComponentMemberDeclaration"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:844:1: entryRuleUIComponentMemberDeclaration : ruleUIComponentMemberDeclaration EOF ;
    public final void entryRuleUIComponentMemberDeclaration() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:845:1: ( ruleUIComponentMemberDeclaration EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:846:1: ruleUIComponentMemberDeclaration EOF
            {
             before(grammarAccess.getUIComponentMemberDeclarationRule()); 
            pushFollow(FOLLOW_ruleUIComponentMemberDeclaration_in_entryRuleUIComponentMemberDeclaration1741);
            ruleUIComponentMemberDeclaration();

            state._fsp--;

             after(grammarAccess.getUIComponentMemberDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentMemberDeclaration1748); 

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
    // $ANTLR end "entryRuleUIComponentMemberDeclaration"


    // $ANTLR start "ruleUIComponentMemberDeclaration"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:853:1: ruleUIComponentMemberDeclaration : ( ( rule__UIComponentMemberDeclaration__Group__0 ) ) ;
    public final void ruleUIComponentMemberDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:857:2: ( ( ( rule__UIComponentMemberDeclaration__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:858:1: ( ( rule__UIComponentMemberDeclaration__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:858:1: ( ( rule__UIComponentMemberDeclaration__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:859:1: ( rule__UIComponentMemberDeclaration__Group__0 )
            {
             before(grammarAccess.getUIComponentMemberDeclarationAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:860:1: ( rule__UIComponentMemberDeclaration__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:860:2: rule__UIComponentMemberDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__UIComponentMemberDeclaration__Group__0_in_ruleUIComponentMemberDeclaration1774);
            rule__UIComponentMemberDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentMemberDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleUIComponentMemberDeclaration"


    // $ANTLR start "entryRuleRESTMethodCall"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:874:1: entryRuleRESTMethodCall : ruleRESTMethodCall EOF ;
    public final void entryRuleRESTMethodCall() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:875:1: ( ruleRESTMethodCall EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:876:1: ruleRESTMethodCall EOF
            {
             before(grammarAccess.getRESTMethodCallRule()); 
            pushFollow(FOLLOW_ruleRESTMethodCall_in_entryRuleRESTMethodCall1803);
            ruleRESTMethodCall();

            state._fsp--;

             after(grammarAccess.getRESTMethodCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTMethodCall1810); 

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
    // $ANTLR end "entryRuleRESTMethodCall"


    // $ANTLR start "ruleRESTMethodCall"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:883:1: ruleRESTMethodCall : ( ( rule__RESTMethodCall__Group__0 ) ) ;
    public final void ruleRESTMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:887:2: ( ( ( rule__RESTMethodCall__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:888:1: ( ( rule__RESTMethodCall__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:888:1: ( ( rule__RESTMethodCall__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:889:1: ( rule__RESTMethodCall__Group__0 )
            {
             before(grammarAccess.getRESTMethodCallAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:890:1: ( rule__RESTMethodCall__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:890:2: rule__RESTMethodCall__Group__0
            {
            pushFollow(FOLLOW_rule__RESTMethodCall__Group__0_in_ruleRESTMethodCall1836);
            rule__RESTMethodCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRESTMethodCallAccess().getGroup()); 

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
    // $ANTLR end "ruleRESTMethodCall"


    // $ANTLR start "entryRuleDataSourceCall"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:902:1: entryRuleDataSourceCall : ruleDataSourceCall EOF ;
    public final void entryRuleDataSourceCall() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:903:1: ( ruleDataSourceCall EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:904:1: ruleDataSourceCall EOF
            {
             before(grammarAccess.getDataSourceCallRule()); 
            pushFollow(FOLLOW_ruleDataSourceCall_in_entryRuleDataSourceCall1863);
            ruleDataSourceCall();

            state._fsp--;

             after(grammarAccess.getDataSourceCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceCall1870); 

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
    // $ANTLR end "entryRuleDataSourceCall"


    // $ANTLR start "ruleDataSourceCall"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:911:1: ruleDataSourceCall : ( ( rule__DataSourceCall__Group__0 ) ) ;
    public final void ruleDataSourceCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:915:2: ( ( ( rule__DataSourceCall__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:916:1: ( ( rule__DataSourceCall__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:916:1: ( ( rule__DataSourceCall__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:917:1: ( rule__DataSourceCall__Group__0 )
            {
             before(grammarAccess.getDataSourceCallAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:918:1: ( rule__DataSourceCall__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:918:2: rule__DataSourceCall__Group__0
            {
            pushFollow(FOLLOW_rule__DataSourceCall__Group__0_in_ruleDataSourceCall1896);
            rule__DataSourceCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceCallAccess().getGroup()); 

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
    // $ANTLR end "ruleDataSourceCall"


    // $ANTLR start "entryRuleUIComponentMemberConfiguration"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:930:1: entryRuleUIComponentMemberConfiguration : ruleUIComponentMemberConfiguration EOF ;
    public final void entryRuleUIComponentMemberConfiguration() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:931:1: ( ruleUIComponentMemberConfiguration EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:932:1: ruleUIComponentMemberConfiguration EOF
            {
             before(grammarAccess.getUIComponentMemberConfigurationRule()); 
            pushFollow(FOLLOW_ruleUIComponentMemberConfiguration_in_entryRuleUIComponentMemberConfiguration1923);
            ruleUIComponentMemberConfiguration();

            state._fsp--;

             after(grammarAccess.getUIComponentMemberConfigurationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentMemberConfiguration1930); 

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
    // $ANTLR end "entryRuleUIComponentMemberConfiguration"


    // $ANTLR start "ruleUIComponentMemberConfiguration"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:939:1: ruleUIComponentMemberConfiguration : ( ( rule__UIComponentMemberConfiguration__Group__0 ) ) ;
    public final void ruleUIComponentMemberConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:943:2: ( ( ( rule__UIComponentMemberConfiguration__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:944:1: ( ( rule__UIComponentMemberConfiguration__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:944:1: ( ( rule__UIComponentMemberConfiguration__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:945:1: ( rule__UIComponentMemberConfiguration__Group__0 )
            {
             before(grammarAccess.getUIComponentMemberConfigurationAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:946:1: ( rule__UIComponentMemberConfiguration__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:946:2: rule__UIComponentMemberConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__UIComponentMemberConfiguration__Group__0_in_ruleUIComponentMemberConfiguration1956);
            rule__UIComponentMemberConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentMemberConfigurationAccess().getGroup()); 

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
    // $ANTLR end "ruleUIComponentMemberConfiguration"


    // $ANTLR start "entryRuleUIComponentMemberCall"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:958:1: entryRuleUIComponentMemberCall : ruleUIComponentMemberCall EOF ;
    public final void entryRuleUIComponentMemberCall() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:959:1: ( ruleUIComponentMemberCall EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:960:1: ruleUIComponentMemberCall EOF
            {
             before(grammarAccess.getUIComponentMemberCallRule()); 
            pushFollow(FOLLOW_ruleUIComponentMemberCall_in_entryRuleUIComponentMemberCall1983);
            ruleUIComponentMemberCall();

            state._fsp--;

             after(grammarAccess.getUIComponentMemberCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentMemberCall1990); 

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
    // $ANTLR end "entryRuleUIComponentMemberCall"


    // $ANTLR start "ruleUIComponentMemberCall"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:967:1: ruleUIComponentMemberCall : ( ( rule__UIComponentMemberCall__Group__0 ) ) ;
    public final void ruleUIComponentMemberCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:971:2: ( ( ( rule__UIComponentMemberCall__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:972:1: ( ( rule__UIComponentMemberCall__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:972:1: ( ( rule__UIComponentMemberCall__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:973:1: ( rule__UIComponentMemberCall__Group__0 )
            {
             before(grammarAccess.getUIComponentMemberCallAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:974:1: ( rule__UIComponentMemberCall__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:974:2: rule__UIComponentMemberCall__Group__0
            {
            pushFollow(FOLLOW_rule__UIComponentMemberCall__Group__0_in_ruleUIComponentMemberCall2016);
            rule__UIComponentMemberCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentMemberCallAccess().getGroup()); 

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
    // $ANTLR end "ruleUIComponentMemberCall"


    // $ANTLR start "entryRuleExpression"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:986:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:987:1: ( ruleExpression EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:988:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2043);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2050); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:995:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:999:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1000:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1000:1: ( ( rule__Expression__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1001:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1002:1: ( rule__Expression__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1002:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression2076);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEntityMemberCall"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1014:1: entryRuleEntityMemberCall : ruleEntityMemberCall EOF ;
    public final void entryRuleEntityMemberCall() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1015:1: ( ruleEntityMemberCall EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1016:1: ruleEntityMemberCall EOF
            {
             before(grammarAccess.getEntityMemberCallRule()); 
            pushFollow(FOLLOW_ruleEntityMemberCall_in_entryRuleEntityMemberCall2103);
            ruleEntityMemberCall();

            state._fsp--;

             after(grammarAccess.getEntityMemberCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityMemberCall2110); 

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
    // $ANTLR end "entryRuleEntityMemberCall"


    // $ANTLR start "ruleEntityMemberCall"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1023:1: ruleEntityMemberCall : ( ( rule__EntityMemberCall__Group__0 ) ) ;
    public final void ruleEntityMemberCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1027:2: ( ( ( rule__EntityMemberCall__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1028:1: ( ( rule__EntityMemberCall__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1028:1: ( ( rule__EntityMemberCall__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1029:1: ( rule__EntityMemberCall__Group__0 )
            {
             before(grammarAccess.getEntityMemberCallAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1030:1: ( rule__EntityMemberCall__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1030:2: rule__EntityMemberCall__Group__0
            {
            pushFollow(FOLLOW_rule__EntityMemberCall__Group__0_in_ruleEntityMemberCall2136);
            rule__EntityMemberCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMemberCallAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityMemberCall"


    // $ANTLR start "entryRuleEntityMemberCallTail"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1042:1: entryRuleEntityMemberCallTail : ruleEntityMemberCallTail EOF ;
    public final void entryRuleEntityMemberCallTail() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1043:1: ( ruleEntityMemberCallTail EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1044:1: ruleEntityMemberCallTail EOF
            {
             before(grammarAccess.getEntityMemberCallTailRule()); 
            pushFollow(FOLLOW_ruleEntityMemberCallTail_in_entryRuleEntityMemberCallTail2163);
            ruleEntityMemberCallTail();

            state._fsp--;

             after(grammarAccess.getEntityMemberCallTailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityMemberCallTail2170); 

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
    // $ANTLR end "entryRuleEntityMemberCallTail"


    // $ANTLR start "ruleEntityMemberCallTail"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1051:1: ruleEntityMemberCallTail : ( ( rule__EntityMemberCallTail__Group__0 ) ) ;
    public final void ruleEntityMemberCallTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1055:2: ( ( ( rule__EntityMemberCallTail__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1056:1: ( ( rule__EntityMemberCallTail__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1056:1: ( ( rule__EntityMemberCallTail__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1057:1: ( rule__EntityMemberCallTail__Group__0 )
            {
             before(grammarAccess.getEntityMemberCallTailAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1058:1: ( rule__EntityMemberCallTail__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1058:2: rule__EntityMemberCallTail__Group__0
            {
            pushFollow(FOLLOW_rule__EntityMemberCallTail__Group__0_in_ruleEntityMemberCallTail2196);
            rule__EntityMemberCallTail__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMemberCallTailAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityMemberCallTail"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1072:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1073:1: ( ruleStringLiteral EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1074:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2225);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2232); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1081:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1085:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1086:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1086:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1087:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1088:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1088:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral2258);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "ruleRESTVerb"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1101:1: ruleRESTVerb : ( ( rule__RESTVerb__Alternatives ) ) ;
    public final void ruleRESTVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1105:1: ( ( ( rule__RESTVerb__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1106:1: ( ( rule__RESTVerb__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1106:1: ( ( rule__RESTVerb__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1107:1: ( rule__RESTVerb__Alternatives )
            {
             before(grammarAccess.getRESTVerbAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1108:1: ( rule__RESTVerb__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1108:2: rule__RESTVerb__Alternatives
            {
            pushFollow(FOLLOW_rule__RESTVerb__Alternatives_in_ruleRESTVerb2295);
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


    // $ANTLR start "ruleScreenKind"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1120:1: ruleScreenKind : ( ( rule__ScreenKind__Alternatives ) ) ;
    public final void ruleScreenKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1124:1: ( ( ( rule__ScreenKind__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1125:1: ( ( rule__ScreenKind__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1125:1: ( ( rule__ScreenKind__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1126:1: ( rule__ScreenKind__Alternatives )
            {
             before(grammarAccess.getScreenKindAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1127:1: ( rule__ScreenKind__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1127:2: rule__ScreenKind__Alternatives
            {
            pushFollow(FOLLOW_rule__ScreenKind__Alternatives_in_ruleScreenKind2331);
            rule__ScreenKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScreenKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleScreenKind"


    // $ANTLR start "rule__NamedElement__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1138:1: rule__NamedElement__Alternatives : ( ( ruleType ) | ( rulePlatform ) | ( ruleDataSource ) | ( ruleScreen ) | ( ruleUIComponentDeclaration ) | ( ruleListItemCellDeclaration ) );
    public final void rule__NamedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1142:1: ( ( ruleType ) | ( rulePlatform ) | ( ruleDataSource ) | ( ruleScreen ) | ( ruleUIComponentDeclaration ) | ( ruleListItemCellDeclaration ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 15:
            case 22:
            case 23:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 38:
                {
                alt2=4;
                }
                break;
            case 46:
                {
                alt2=5;
                }
                break;
            case 45:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1143:1: ( ruleType )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1143:1: ( ruleType )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1144:1: ruleType
                    {
                     before(grammarAccess.getNamedElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__NamedElement__Alternatives2366);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1149:6: ( rulePlatform )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1149:6: ( rulePlatform )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1150:1: rulePlatform
                    {
                     before(grammarAccess.getNamedElementAccess().getPlatformParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePlatform_in_rule__NamedElement__Alternatives2383);
                    rulePlatform();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getPlatformParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1155:6: ( ruleDataSource )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1155:6: ( ruleDataSource )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1156:1: ruleDataSource
                    {
                     before(grammarAccess.getNamedElementAccess().getDataSourceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDataSource_in_rule__NamedElement__Alternatives2400);
                    ruleDataSource();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getDataSourceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1161:6: ( ruleScreen )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1161:6: ( ruleScreen )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1162:1: ruleScreen
                    {
                     before(grammarAccess.getNamedElementAccess().getScreenParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleScreen_in_rule__NamedElement__Alternatives2417);
                    ruleScreen();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getScreenParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1167:6: ( ruleUIComponentDeclaration )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1167:6: ( ruleUIComponentDeclaration )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1168:1: ruleUIComponentDeclaration
                    {
                     before(grammarAccess.getNamedElementAccess().getUIComponentDeclarationParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUIComponentDeclaration_in_rule__NamedElement__Alternatives2434);
                    ruleUIComponentDeclaration();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getUIComponentDeclarationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1173:6: ( ruleListItemCellDeclaration )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1173:6: ( ruleListItemCellDeclaration )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1174:1: ruleListItemCellDeclaration
                    {
                     before(grammarAccess.getNamedElementAccess().getListItemCellDeclarationParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleListItemCellDeclaration_in_rule__NamedElement__Alternatives2451);
                    ruleListItemCellDeclaration();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getListItemCellDeclarationParserRuleCall_5()); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1184:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1188:1: ( ( ruleDataType ) | ( ruleEntity ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==15||LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1189:1: ( ruleDataType )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1189:1: ( ruleDataType )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1190:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives2483);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1195:6: ( ruleEntity )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1195:6: ( ruleEntity )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1196:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives2500);
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


    // $ANTLR start "rule__KeywordedID__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1206:1: rule__KeywordedID__Alternatives : ( ( 'title' ) | ( 'platform' ) | ( 'resource' ) | ( 'section' ) | ( 'abstract' ) | ( RULE_ID ) );
    public final void rule__KeywordedID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1210:1: ( ( 'title' ) | ( 'platform' ) | ( 'resource' ) | ( 'section' ) | ( 'abstract' ) | ( RULE_ID ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case RULE_ID:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1211:1: ( 'title' )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1211:1: ( 'title' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1212:1: 'title'
                    {
                     before(grammarAccess.getKeywordedIDAccess().getTitleKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__KeywordedID__Alternatives2533); 
                     after(grammarAccess.getKeywordedIDAccess().getTitleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1219:6: ( 'platform' )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1219:6: ( 'platform' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1220:1: 'platform'
                    {
                     before(grammarAccess.getKeywordedIDAccess().getPlatformKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__KeywordedID__Alternatives2553); 
                     after(grammarAccess.getKeywordedIDAccess().getPlatformKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1227:6: ( 'resource' )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1227:6: ( 'resource' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1228:1: 'resource'
                    {
                     before(grammarAccess.getKeywordedIDAccess().getResourceKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__KeywordedID__Alternatives2573); 
                     after(grammarAccess.getKeywordedIDAccess().getResourceKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1235:6: ( 'section' )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1235:6: ( 'section' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1236:1: 'section'
                    {
                     before(grammarAccess.getKeywordedIDAccess().getSectionKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__KeywordedID__Alternatives2593); 
                     after(grammarAccess.getKeywordedIDAccess().getSectionKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1243:6: ( 'abstract' )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1243:6: ( 'abstract' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1244:1: 'abstract'
                    {
                     before(grammarAccess.getKeywordedIDAccess().getAbstractKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__KeywordedID__Alternatives2613); 
                     after(grammarAccess.getKeywordedIDAccess().getAbstractKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1251:6: ( RULE_ID )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1251:6: ( RULE_ID )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1252:1: RULE_ID
                    {
                     before(grammarAccess.getKeywordedIDAccess().getIDTerminalRuleCall_5()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KeywordedID__Alternatives2632); 
                     after(grammarAccess.getKeywordedIDAccess().getIDTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__KeywordedID__Alternatives"


    // $ANTLR start "rule__RESTURL__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1262:1: rule__RESTURL__Alternatives : ( ( ruleAbsoluteRESTURL ) | ( ruleRelativeRESTURL ) );
    public final void rule__RESTURL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1266:1: ( ( ruleAbsoluteRESTURL ) | ( ruleRelativeRESTURL ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==36) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1267:1: ( ruleAbsoluteRESTURL )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1267:1: ( ruleAbsoluteRESTURL )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1268:1: ruleAbsoluteRESTURL
                    {
                     before(grammarAccess.getRESTURLAccess().getAbsoluteRESTURLParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_rule__RESTURL__Alternatives2664);
                    ruleAbsoluteRESTURL();

                    state._fsp--;

                     after(grammarAccess.getRESTURLAccess().getAbsoluteRESTURLParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1273:6: ( ruleRelativeRESTURL )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1273:6: ( ruleRelativeRESTURL )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1274:1: ruleRelativeRESTURL
                    {
                     before(grammarAccess.getRESTURLAccess().getRelativeRESTURLParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelativeRESTURL_in_rule__RESTURL__Alternatives2681);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1284:1: rule__UrlFragment__Alternatives : ( ( ruleUrlPathFragment ) | ( ruleVariable ) );
    public final void rule__UrlFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1288:1: ( ( ruleUrlPathFragment ) | ( ruleVariable ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1289:1: ( ruleUrlPathFragment )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1289:1: ( ruleUrlPathFragment )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1290:1: ruleUrlPathFragment
                    {
                     before(grammarAccess.getUrlFragmentAccess().getUrlPathFragmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUrlPathFragment_in_rule__UrlFragment__Alternatives2713);
                    ruleUrlPathFragment();

                    state._fsp--;

                     after(grammarAccess.getUrlFragmentAccess().getUrlPathFragmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1295:6: ( ruleVariable )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1295:6: ( ruleVariable )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1296:1: ruleVariable
                    {
                     before(grammarAccess.getUrlFragmentAccess().getVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__UrlFragment__Alternatives2730);
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


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1307:1: rule__Expression__Alternatives : ( ( ruleStringLiteral ) | ( ruleEntityMemberCall ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1311:1: ( ( ruleStringLiteral ) | ( ruleEntityMemberCall ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1312:1: ( ruleStringLiteral )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1312:1: ( ruleStringLiteral )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1313:1: ruleStringLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives2763);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1318:6: ( ruleEntityMemberCall )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1318:6: ( ruleEntityMemberCall )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1319:1: ruleEntityMemberCall
                    {
                     before(grammarAccess.getExpressionAccess().getEntityMemberCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntityMemberCall_in_rule__Expression__Alternatives2780);
                    ruleEntityMemberCall();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getEntityMemberCallParserRuleCall_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__RESTVerb__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1329:1: rule__RESTVerb__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__RESTVerb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1333:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            case 19:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1334:1: ( ( 'GET' ) )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1334:1: ( ( 'GET' ) )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1335:1: ( 'GET' )
                    {
                     before(grammarAccess.getRESTVerbAccess().getGETEnumLiteralDeclaration_0()); 
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1336:1: ( 'GET' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1336:3: 'GET'
                    {
                    match(input,16,FOLLOW_16_in_rule__RESTVerb__Alternatives2813); 

                    }

                     after(grammarAccess.getRESTVerbAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1341:6: ( ( 'POST' ) )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1341:6: ( ( 'POST' ) )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1342:1: ( 'POST' )
                    {
                     before(grammarAccess.getRESTVerbAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1343:1: ( 'POST' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1343:3: 'POST'
                    {
                    match(input,17,FOLLOW_17_in_rule__RESTVerb__Alternatives2834); 

                    }

                     after(grammarAccess.getRESTVerbAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1348:6: ( ( 'PUT' ) )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1348:6: ( ( 'PUT' ) )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1349:1: ( 'PUT' )
                    {
                     before(grammarAccess.getRESTVerbAccess().getPUTEnumLiteralDeclaration_2()); 
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1350:1: ( 'PUT' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1350:3: 'PUT'
                    {
                    match(input,18,FOLLOW_18_in_rule__RESTVerb__Alternatives2855); 

                    }

                     after(grammarAccess.getRESTVerbAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1355:6: ( ( 'DELETE' ) )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1355:6: ( ( 'DELETE' ) )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1356:1: ( 'DELETE' )
                    {
                     before(grammarAccess.getRESTVerbAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1357:1: ( 'DELETE' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1357:3: 'DELETE'
                    {
                    match(input,19,FOLLOW_19_in_rule__RESTVerb__Alternatives2876); 

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


    // $ANTLR start "rule__ScreenKind__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1367:1: rule__ScreenKind__Alternatives : ( ( ( 'DefaultList' ) ) | ( ( 'DefaultDetails' ) ) );
    public final void rule__ScreenKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1371:1: ( ( ( 'DefaultList' ) ) | ( ( 'DefaultDetails' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1372:1: ( ( 'DefaultList' ) )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1372:1: ( ( 'DefaultList' ) )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1373:1: ( 'DefaultList' )
                    {
                     before(grammarAccess.getScreenKindAccess().getDefaultListEnumLiteralDeclaration_0()); 
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1374:1: ( 'DefaultList' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1374:3: 'DefaultList'
                    {
                    match(input,20,FOLLOW_20_in_rule__ScreenKind__Alternatives2912); 

                    }

                     after(grammarAccess.getScreenKindAccess().getDefaultListEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1379:6: ( ( 'DefaultDetails' ) )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1379:6: ( ( 'DefaultDetails' ) )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1380:1: ( 'DefaultDetails' )
                    {
                     before(grammarAccess.getScreenKindAccess().getDefaultDetailsEnumLiteralDeclaration_1()); 
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1381:1: ( 'DefaultDetails' )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1381:3: 'DefaultDetails'
                    {
                    match(input,21,FOLLOW_21_in_rule__ScreenKind__Alternatives2933); 

                    }

                     after(grammarAccess.getScreenKindAccess().getDefaultDetailsEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ScreenKind__Alternatives"


    // $ANTLR start "rule__DataType__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1393:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1397:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1398:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02966);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02969);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1405:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1409:1: ( ( 'datatype' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1410:1: ( 'datatype' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1410:1: ( 'datatype' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1411:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__DataType__Group__0__Impl2997); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1424:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1428:1: ( rule__DataType__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1429:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13028);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1435:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1439:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1440:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1440:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1441:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1442:1: ( rule__DataType__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1442:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3055);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1456:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1460:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1461:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03089);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03092);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1468:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__AbstractAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1472:1: ( ( ( rule__Entity__AbstractAssignment_0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1473:1: ( ( rule__Entity__AbstractAssignment_0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1473:1: ( ( rule__Entity__AbstractAssignment_0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1474:1: ( rule__Entity__AbstractAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getAbstractAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1475:1: ( rule__Entity__AbstractAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1475:2: rule__Entity__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__AbstractAssignment_0_in_rule__Entity__Group__0__Impl3119);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1485:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1489:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1490:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13150);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13153);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1497:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1501:1: ( ( 'entity' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1502:1: ( 'entity' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1502:1: ( 'entity' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1503:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Entity__Group__1__Impl3181); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1516:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1520:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1521:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23212);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23215);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1528:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1532:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1533:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1533:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1534:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1535:1: ( rule__Entity__NameAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1535:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3242);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1545:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1549:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1550:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33272);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33275);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1557:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1561:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1562:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1562:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1563:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1564:1: ( rule__Entity__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1564:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl3302);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1574:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1578:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1579:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43333);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43336);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1586:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1590:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1591:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1591:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1592:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Entity__Group__4__Impl3364); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1605:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1609:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1610:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53395);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__53398);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1617:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__AttributesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1621:1: ( ( ( rule__Entity__AttributesAssignment_5 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1622:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1622:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1623:1: ( rule__Entity__AttributesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1624:1: ( rule__Entity__AttributesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1624:2: rule__Entity__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_5_in_rule__Entity__Group__5__Impl3425);
            	    rule__Entity__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1634:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1638:1: ( rule__Entity__Group__6__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1639:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__63456);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1645:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1649:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1650:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1650:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1651:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group__6__Impl3484); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1678:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1682:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1683:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__03529);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__03532);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1690:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1694:1: ( ( 'extends' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1695:1: ( 'extends' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1695:1: ( 'extends' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1696:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Entity__Group_3__0__Impl3560); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1709:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1713:1: ( rule__Entity__Group_3__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1714:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__13591);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1720:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1724:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1725:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1725:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1726:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1727:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1727:2: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl3618);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1741:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1745:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1746:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03652);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03655);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1753:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1757:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1758:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1758:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1759:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1760:1: ( rule__Attribute__TypeAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1760:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl3682);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1770:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1774:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1775:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13712);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13715);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1782:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ManyAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1786:1: ( ( ( rule__Attribute__ManyAssignment_1 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1787:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1787:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1788:1: ( rule__Attribute__ManyAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1789:1: ( rule__Attribute__ManyAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==47) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1789:2: rule__Attribute__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__1__Impl3742);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1799:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1803:1: ( rule__Attribute__Group__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1804:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23773);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1810:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1814:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1815:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1815:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1816:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1817:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1817:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl3800);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1833:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1837:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1838:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__03836);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__03839);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1845:1: rule__Platform__Group__0__Impl : ( 'platform' ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1849:1: ( ( 'platform' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1850:1: ( 'platform' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1850:1: ( 'platform' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1851:1: 'platform'
            {
             before(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Platform__Group__0__Impl3867); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1864:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1868:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1869:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__13898);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__13901);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1876:1: rule__Platform__Group__1__Impl : ( ( rule__Platform__NameAssignment_1 ) ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1880:1: ( ( ( rule__Platform__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1881:1: ( ( rule__Platform__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1881:1: ( ( rule__Platform__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1882:1: ( rule__Platform__NameAssignment_1 )
            {
             before(grammarAccess.getPlatformAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1883:1: ( rule__Platform__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1883:2: rule__Platform__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Platform__NameAssignment_1_in_rule__Platform__Group__1__Impl3928);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1893:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1897:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1898:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__23958);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__23961);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1905:1: rule__Platform__Group__2__Impl : ( '{' ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1909:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1910:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1910:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1911:1: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Platform__Group__2__Impl3989); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1924:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl rule__Platform__Group__4 ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1928:1: ( rule__Platform__Group__3__Impl rule__Platform__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1929:2: rule__Platform__Group__3__Impl rule__Platform__Group__4
            {
            pushFollow(FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__34020);
            rule__Platform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__4_in_rule__Platform__Group__34023);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1936:1: rule__Platform__Group__3__Impl : ( ( rule__Platform__MappingsAssignment_3 )* ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1940:1: ( ( ( rule__Platform__MappingsAssignment_3 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1941:1: ( ( rule__Platform__MappingsAssignment_3 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1941:1: ( ( rule__Platform__MappingsAssignment_3 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1942:1: ( rule__Platform__MappingsAssignment_3 )*
            {
             before(grammarAccess.getPlatformAccess().getMappingsAssignment_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1943:1: ( rule__Platform__MappingsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1943:2: rule__Platform__MappingsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Platform__MappingsAssignment_3_in_rule__Platform__Group__3__Impl4050);
            	    rule__Platform__MappingsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1953:1: rule__Platform__Group__4 : rule__Platform__Group__4__Impl ;
    public final void rule__Platform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1957:1: ( rule__Platform__Group__4__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1958:2: rule__Platform__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group__4__Impl_in_rule__Platform__Group__44081);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1964:1: rule__Platform__Group__4__Impl : ( '}' ) ;
    public final void rule__Platform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1968:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1969:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1969:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1970:1: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Platform__Group__4__Impl4109); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1993:1: rule__TypeMapping__Group__0 : rule__TypeMapping__Group__0__Impl rule__TypeMapping__Group__1 ;
    public final void rule__TypeMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1997:1: ( rule__TypeMapping__Group__0__Impl rule__TypeMapping__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1998:2: rule__TypeMapping__Group__0__Impl rule__TypeMapping__Group__1
            {
            pushFollow(FOLLOW_rule__TypeMapping__Group__0__Impl_in_rule__TypeMapping__Group__04150);
            rule__TypeMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMapping__Group__1_in_rule__TypeMapping__Group__04153);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2005:1: rule__TypeMapping__Group__0__Impl : ( 'typemapping' ) ;
    public final void rule__TypeMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2009:1: ( ( 'typemapping' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2010:1: ( 'typemapping' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2010:1: ( 'typemapping' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2011:1: 'typemapping'
            {
             before(grammarAccess.getTypeMappingAccess().getTypemappingKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__TypeMapping__Group__0__Impl4181); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2024:1: rule__TypeMapping__Group__1 : rule__TypeMapping__Group__1__Impl rule__TypeMapping__Group__2 ;
    public final void rule__TypeMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2028:1: ( rule__TypeMapping__Group__1__Impl rule__TypeMapping__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2029:2: rule__TypeMapping__Group__1__Impl rule__TypeMapping__Group__2
            {
            pushFollow(FOLLOW_rule__TypeMapping__Group__1__Impl_in_rule__TypeMapping__Group__14212);
            rule__TypeMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMapping__Group__2_in_rule__TypeMapping__Group__14215);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2036:1: rule__TypeMapping__Group__1__Impl : ( ( rule__TypeMapping__TypeAssignment_1 ) ) ;
    public final void rule__TypeMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2040:1: ( ( ( rule__TypeMapping__TypeAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2041:1: ( ( rule__TypeMapping__TypeAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2041:1: ( ( rule__TypeMapping__TypeAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2042:1: ( rule__TypeMapping__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeMappingAccess().getTypeAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2043:1: ( rule__TypeMapping__TypeAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2043:2: rule__TypeMapping__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeMapping__TypeAssignment_1_in_rule__TypeMapping__Group__1__Impl4242);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2053:1: rule__TypeMapping__Group__2 : rule__TypeMapping__Group__2__Impl rule__TypeMapping__Group__3 ;
    public final void rule__TypeMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2057:1: ( rule__TypeMapping__Group__2__Impl rule__TypeMapping__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2058:2: rule__TypeMapping__Group__2__Impl rule__TypeMapping__Group__3
            {
            pushFollow(FOLLOW_rule__TypeMapping__Group__2__Impl_in_rule__TypeMapping__Group__24272);
            rule__TypeMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMapping__Group__3_in_rule__TypeMapping__Group__24275);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2065:1: rule__TypeMapping__Group__2__Impl : ( '->' ) ;
    public final void rule__TypeMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2069:1: ( ( '->' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2070:1: ( '->' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2070:1: ( '->' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2071:1: '->'
            {
             before(grammarAccess.getTypeMappingAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__TypeMapping__Group__2__Impl4303); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2084:1: rule__TypeMapping__Group__3 : rule__TypeMapping__Group__3__Impl ;
    public final void rule__TypeMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2088:1: ( rule__TypeMapping__Group__3__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2089:2: rule__TypeMapping__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeMapping__Group__3__Impl_in_rule__TypeMapping__Group__34334);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2095:1: rule__TypeMapping__Group__3__Impl : ( ( rule__TypeMapping__SimpleNameAssignment_3 ) ) ;
    public final void rule__TypeMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2099:1: ( ( ( rule__TypeMapping__SimpleNameAssignment_3 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2100:1: ( ( rule__TypeMapping__SimpleNameAssignment_3 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2100:1: ( ( rule__TypeMapping__SimpleNameAssignment_3 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2101:1: ( rule__TypeMapping__SimpleNameAssignment_3 )
            {
             before(grammarAccess.getTypeMappingAccess().getSimpleNameAssignment_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2102:1: ( rule__TypeMapping__SimpleNameAssignment_3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2102:2: rule__TypeMapping__SimpleNameAssignment_3
            {
            pushFollow(FOLLOW_rule__TypeMapping__SimpleNameAssignment_3_in_rule__TypeMapping__Group__3__Impl4361);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2120:1: rule__DataSource__Group__0 : rule__DataSource__Group__0__Impl rule__DataSource__Group__1 ;
    public final void rule__DataSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2124:1: ( rule__DataSource__Group__0__Impl rule__DataSource__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2125:2: rule__DataSource__Group__0__Impl rule__DataSource__Group__1
            {
            pushFollow(FOLLOW_rule__DataSource__Group__0__Impl_in_rule__DataSource__Group__04399);
            rule__DataSource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__1_in_rule__DataSource__Group__04402);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2132:1: rule__DataSource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__DataSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2136:1: ( ( 'datasource' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2137:1: ( 'datasource' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2137:1: ( 'datasource' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2138:1: 'datasource'
            {
             before(grammarAccess.getDataSourceAccess().getDatasourceKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__DataSource__Group__0__Impl4430); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2151:1: rule__DataSource__Group__1 : rule__DataSource__Group__1__Impl rule__DataSource__Group__2 ;
    public final void rule__DataSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2155:1: ( rule__DataSource__Group__1__Impl rule__DataSource__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2156:2: rule__DataSource__Group__1__Impl rule__DataSource__Group__2
            {
            pushFollow(FOLLOW_rule__DataSource__Group__1__Impl_in_rule__DataSource__Group__14461);
            rule__DataSource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__2_in_rule__DataSource__Group__14464);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2163:1: rule__DataSource__Group__1__Impl : ( ( rule__DataSource__NameAssignment_1 ) ) ;
    public final void rule__DataSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2167:1: ( ( ( rule__DataSource__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2168:1: ( ( rule__DataSource__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2168:1: ( ( rule__DataSource__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2169:1: ( rule__DataSource__NameAssignment_1 )
            {
             before(grammarAccess.getDataSourceAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2170:1: ( rule__DataSource__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2170:2: rule__DataSource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataSource__NameAssignment_1_in_rule__DataSource__Group__1__Impl4491);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2180:1: rule__DataSource__Group__2 : rule__DataSource__Group__2__Impl rule__DataSource__Group__3 ;
    public final void rule__DataSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2184:1: ( rule__DataSource__Group__2__Impl rule__DataSource__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2185:2: rule__DataSource__Group__2__Impl rule__DataSource__Group__3
            {
            pushFollow(FOLLOW_rule__DataSource__Group__2__Impl_in_rule__DataSource__Group__24521);
            rule__DataSource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__3_in_rule__DataSource__Group__24524);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2192:1: rule__DataSource__Group__2__Impl : ( '{' ) ;
    public final void rule__DataSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2196:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2197:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2197:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2198:1: '{'
            {
             before(grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__DataSource__Group__2__Impl4552); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2211:1: rule__DataSource__Group__3 : rule__DataSource__Group__3__Impl rule__DataSource__Group__4 ;
    public final void rule__DataSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2215:1: ( rule__DataSource__Group__3__Impl rule__DataSource__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2216:2: rule__DataSource__Group__3__Impl rule__DataSource__Group__4
            {
            pushFollow(FOLLOW_rule__DataSource__Group__3__Impl_in_rule__DataSource__Group__34583);
            rule__DataSource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__4_in_rule__DataSource__Group__34586);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2223:1: rule__DataSource__Group__3__Impl : ( 'baseUrl' ) ;
    public final void rule__DataSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2227:1: ( ( 'baseUrl' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2228:1: ( 'baseUrl' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2228:1: ( 'baseUrl' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2229:1: 'baseUrl'
            {
             before(grammarAccess.getDataSourceAccess().getBaseUrlKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__DataSource__Group__3__Impl4614); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2242:1: rule__DataSource__Group__4 : rule__DataSource__Group__4__Impl rule__DataSource__Group__5 ;
    public final void rule__DataSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2246:1: ( rule__DataSource__Group__4__Impl rule__DataSource__Group__5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2247:2: rule__DataSource__Group__4__Impl rule__DataSource__Group__5
            {
            pushFollow(FOLLOW_rule__DataSource__Group__4__Impl_in_rule__DataSource__Group__44645);
            rule__DataSource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__5_in_rule__DataSource__Group__44648);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2254:1: rule__DataSource__Group__4__Impl : ( ':' ) ;
    public final void rule__DataSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2258:1: ( ( ':' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2259:1: ( ':' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2259:1: ( ':' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2260:1: ':'
            {
             before(grammarAccess.getDataSourceAccess().getColonKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__DataSource__Group__4__Impl4676); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2273:1: rule__DataSource__Group__5 : rule__DataSource__Group__5__Impl rule__DataSource__Group__6 ;
    public final void rule__DataSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2277:1: ( rule__DataSource__Group__5__Impl rule__DataSource__Group__6 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2278:2: rule__DataSource__Group__5__Impl rule__DataSource__Group__6
            {
            pushFollow(FOLLOW_rule__DataSource__Group__5__Impl_in_rule__DataSource__Group__54707);
            rule__DataSource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__6_in_rule__DataSource__Group__54710);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2285:1: rule__DataSource__Group__5__Impl : ( ( rule__DataSource__BaseUrlAssignment_5 ) ) ;
    public final void rule__DataSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2289:1: ( ( ( rule__DataSource__BaseUrlAssignment_5 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2290:1: ( ( rule__DataSource__BaseUrlAssignment_5 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2290:1: ( ( rule__DataSource__BaseUrlAssignment_5 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2291:1: ( rule__DataSource__BaseUrlAssignment_5 )
            {
             before(grammarAccess.getDataSourceAccess().getBaseUrlAssignment_5()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2292:1: ( rule__DataSource__BaseUrlAssignment_5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2292:2: rule__DataSource__BaseUrlAssignment_5
            {
            pushFollow(FOLLOW_rule__DataSource__BaseUrlAssignment_5_in_rule__DataSource__Group__5__Impl4737);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2302:1: rule__DataSource__Group__6 : rule__DataSource__Group__6__Impl rule__DataSource__Group__7 ;
    public final void rule__DataSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2306:1: ( rule__DataSource__Group__6__Impl rule__DataSource__Group__7 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2307:2: rule__DataSource__Group__6__Impl rule__DataSource__Group__7
            {
            pushFollow(FOLLOW_rule__DataSource__Group__6__Impl_in_rule__DataSource__Group__64767);
            rule__DataSource__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__7_in_rule__DataSource__Group__64770);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2314:1: rule__DataSource__Group__6__Impl : ( 'resource' ) ;
    public final void rule__DataSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2318:1: ( ( 'resource' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2319:1: ( 'resource' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2319:1: ( 'resource' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2320:1: 'resource'
            {
             before(grammarAccess.getDataSourceAccess().getResourceKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__DataSource__Group__6__Impl4798); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2333:1: rule__DataSource__Group__7 : rule__DataSource__Group__7__Impl rule__DataSource__Group__8 ;
    public final void rule__DataSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2337:1: ( rule__DataSource__Group__7__Impl rule__DataSource__Group__8 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2338:2: rule__DataSource__Group__7__Impl rule__DataSource__Group__8
            {
            pushFollow(FOLLOW_rule__DataSource__Group__7__Impl_in_rule__DataSource__Group__74829);
            rule__DataSource__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__8_in_rule__DataSource__Group__74832);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2345:1: rule__DataSource__Group__7__Impl : ( ':' ) ;
    public final void rule__DataSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2349:1: ( ( ':' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2350:1: ( ':' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2350:1: ( ':' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2351:1: ':'
            {
             before(grammarAccess.getDataSourceAccess().getColonKeyword_7()); 
            match(input,31,FOLLOW_31_in_rule__DataSource__Group__7__Impl4860); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2364:1: rule__DataSource__Group__8 : rule__DataSource__Group__8__Impl rule__DataSource__Group__9 ;
    public final void rule__DataSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2368:1: ( rule__DataSource__Group__8__Impl rule__DataSource__Group__9 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2369:2: rule__DataSource__Group__8__Impl rule__DataSource__Group__9
            {
            pushFollow(FOLLOW_rule__DataSource__Group__8__Impl_in_rule__DataSource__Group__84891);
            rule__DataSource__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__9_in_rule__DataSource__Group__84894);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2376:1: rule__DataSource__Group__8__Impl : ( ( rule__DataSource__ResourceTypeAssignment_8 ) ) ;
    public final void rule__DataSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2380:1: ( ( ( rule__DataSource__ResourceTypeAssignment_8 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2381:1: ( ( rule__DataSource__ResourceTypeAssignment_8 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2381:1: ( ( rule__DataSource__ResourceTypeAssignment_8 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2382:1: ( rule__DataSource__ResourceTypeAssignment_8 )
            {
             before(grammarAccess.getDataSourceAccess().getResourceTypeAssignment_8()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2383:1: ( rule__DataSource__ResourceTypeAssignment_8 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2383:2: rule__DataSource__ResourceTypeAssignment_8
            {
            pushFollow(FOLLOW_rule__DataSource__ResourceTypeAssignment_8_in_rule__DataSource__Group__8__Impl4921);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2393:1: rule__DataSource__Group__9 : rule__DataSource__Group__9__Impl rule__DataSource__Group__10 ;
    public final void rule__DataSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2397:1: ( rule__DataSource__Group__9__Impl rule__DataSource__Group__10 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2398:2: rule__DataSource__Group__9__Impl rule__DataSource__Group__10
            {
            pushFollow(FOLLOW_rule__DataSource__Group__9__Impl_in_rule__DataSource__Group__94951);
            rule__DataSource__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSource__Group__10_in_rule__DataSource__Group__94954);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2405:1: rule__DataSource__Group__9__Impl : ( ( rule__DataSource__MethodsAssignment_9 )* ) ;
    public final void rule__DataSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2409:1: ( ( ( rule__DataSource__MethodsAssignment_9 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2410:1: ( ( rule__DataSource__MethodsAssignment_9 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2410:1: ( ( rule__DataSource__MethodsAssignment_9 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2411:1: ( rule__DataSource__MethodsAssignment_9 )*
            {
             before(grammarAccess.getDataSourceAccess().getMethodsAssignment_9()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2412:1: ( rule__DataSource__MethodsAssignment_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=11 && LA15_0<=15)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2412:2: rule__DataSource__MethodsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__DataSource__MethodsAssignment_9_in_rule__DataSource__Group__9__Impl4981);
            	    rule__DataSource__MethodsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2422:1: rule__DataSource__Group__10 : rule__DataSource__Group__10__Impl ;
    public final void rule__DataSource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2426:1: ( rule__DataSource__Group__10__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2427:2: rule__DataSource__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__DataSource__Group__10__Impl_in_rule__DataSource__Group__105012);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2433:1: rule__DataSource__Group__10__Impl : ( '}' ) ;
    public final void rule__DataSource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2437:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2438:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2438:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2439:1: '}'
            {
             before(grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_10()); 
            match(input,25,FOLLOW_25_in_rule__DataSource__Group__10__Impl5040); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2474:1: rule__DataSourceAccessMethod__Group__0 : rule__DataSourceAccessMethod__Group__0__Impl rule__DataSourceAccessMethod__Group__1 ;
    public final void rule__DataSourceAccessMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2478:1: ( rule__DataSourceAccessMethod__Group__0__Impl rule__DataSourceAccessMethod__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2479:2: rule__DataSourceAccessMethod__Group__0__Impl rule__DataSourceAccessMethod__Group__1
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__0__Impl_in_rule__DataSourceAccessMethod__Group__05093);
            rule__DataSourceAccessMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__1_in_rule__DataSourceAccessMethod__Group__05096);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2486:1: rule__DataSourceAccessMethod__Group__0__Impl : ( ( rule__DataSourceAccessMethod__NameAssignment_0 ) ) ;
    public final void rule__DataSourceAccessMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2490:1: ( ( ( rule__DataSourceAccessMethod__NameAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2491:1: ( ( rule__DataSourceAccessMethod__NameAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2491:1: ( ( rule__DataSourceAccessMethod__NameAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2492:1: ( rule__DataSourceAccessMethod__NameAssignment_0 )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getNameAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2493:1: ( rule__DataSourceAccessMethod__NameAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2493:2: rule__DataSourceAccessMethod__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__NameAssignment_0_in_rule__DataSourceAccessMethod__Group__0__Impl5123);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2503:1: rule__DataSourceAccessMethod__Group__1 : rule__DataSourceAccessMethod__Group__1__Impl rule__DataSourceAccessMethod__Group__2 ;
    public final void rule__DataSourceAccessMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2507:1: ( rule__DataSourceAccessMethod__Group__1__Impl rule__DataSourceAccessMethod__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2508:2: rule__DataSourceAccessMethod__Group__1__Impl rule__DataSourceAccessMethod__Group__2
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__1__Impl_in_rule__DataSourceAccessMethod__Group__15153);
            rule__DataSourceAccessMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__2_in_rule__DataSourceAccessMethod__Group__15156);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2515:1: rule__DataSourceAccessMethod__Group__1__Impl : ( '(' ) ;
    public final void rule__DataSourceAccessMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2519:1: ( ( '(' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2520:1: ( '(' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2520:1: ( '(' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2521:1: '('
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__DataSourceAccessMethod__Group__1__Impl5184); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2534:1: rule__DataSourceAccessMethod__Group__2 : rule__DataSourceAccessMethod__Group__2__Impl rule__DataSourceAccessMethod__Group__3 ;
    public final void rule__DataSourceAccessMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2538:1: ( rule__DataSourceAccessMethod__Group__2__Impl rule__DataSourceAccessMethod__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2539:2: rule__DataSourceAccessMethod__Group__2__Impl rule__DataSourceAccessMethod__Group__3
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__2__Impl_in_rule__DataSourceAccessMethod__Group__25215);
            rule__DataSourceAccessMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__3_in_rule__DataSourceAccessMethod__Group__25218);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2546:1: rule__DataSourceAccessMethod__Group__2__Impl : ( ( rule__DataSourceAccessMethod__Group_2__0 )? ) ;
    public final void rule__DataSourceAccessMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2550:1: ( ( ( rule__DataSourceAccessMethod__Group_2__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2551:1: ( ( rule__DataSourceAccessMethod__Group_2__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2551:1: ( ( rule__DataSourceAccessMethod__Group_2__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2552:1: ( rule__DataSourceAccessMethod__Group_2__0 )?
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getGroup_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2553:1: ( rule__DataSourceAccessMethod__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2553:2: rule__DataSourceAccessMethod__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2__0_in_rule__DataSourceAccessMethod__Group__2__Impl5245);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2563:1: rule__DataSourceAccessMethod__Group__3 : rule__DataSourceAccessMethod__Group__3__Impl rule__DataSourceAccessMethod__Group__4 ;
    public final void rule__DataSourceAccessMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2567:1: ( rule__DataSourceAccessMethod__Group__3__Impl rule__DataSourceAccessMethod__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2568:2: rule__DataSourceAccessMethod__Group__3__Impl rule__DataSourceAccessMethod__Group__4
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__3__Impl_in_rule__DataSourceAccessMethod__Group__35276);
            rule__DataSourceAccessMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__4_in_rule__DataSourceAccessMethod__Group__35279);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2575:1: rule__DataSourceAccessMethod__Group__3__Impl : ( ')' ) ;
    public final void rule__DataSourceAccessMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2579:1: ( ( ')' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2580:1: ( ')' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2580:1: ( ')' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2581:1: ')'
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__DataSourceAccessMethod__Group__3__Impl5307); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2594:1: rule__DataSourceAccessMethod__Group__4 : rule__DataSourceAccessMethod__Group__4__Impl rule__DataSourceAccessMethod__Group__5 ;
    public final void rule__DataSourceAccessMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2598:1: ( rule__DataSourceAccessMethod__Group__4__Impl rule__DataSourceAccessMethod__Group__5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2599:2: rule__DataSourceAccessMethod__Group__4__Impl rule__DataSourceAccessMethod__Group__5
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__4__Impl_in_rule__DataSourceAccessMethod__Group__45338);
            rule__DataSourceAccessMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__5_in_rule__DataSourceAccessMethod__Group__45341);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2606:1: rule__DataSourceAccessMethod__Group__4__Impl : ( ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )? ) ;
    public final void rule__DataSourceAccessMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2610:1: ( ( ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2611:1: ( ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2611:1: ( ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2612:1: ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )?
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyAssignment_4()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2613:1: ( rule__DataSourceAccessMethod__ReturnsManyAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2613:2: rule__DataSourceAccessMethod__ReturnsManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__DataSourceAccessMethod__ReturnsManyAssignment_4_in_rule__DataSourceAccessMethod__Group__4__Impl5368);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2623:1: rule__DataSourceAccessMethod__Group__5 : rule__DataSourceAccessMethod__Group__5__Impl ;
    public final void rule__DataSourceAccessMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2627:1: ( rule__DataSourceAccessMethod__Group__5__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2628:2: rule__DataSourceAccessMethod__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group__5__Impl_in_rule__DataSourceAccessMethod__Group__55399);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2634:1: rule__DataSourceAccessMethod__Group__5__Impl : ( ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 ) ) ;
    public final void rule__DataSourceAccessMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2638:1: ( ( ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2639:1: ( ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2639:1: ( ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2640:1: ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getRestSpecificationAssignment_5()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2641:1: ( rule__DataSourceAccessMethod__RestSpecificationAssignment_5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2641:2: rule__DataSourceAccessMethod__RestSpecificationAssignment_5
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__RestSpecificationAssignment_5_in_rule__DataSourceAccessMethod__Group__5__Impl5426);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2663:1: rule__DataSourceAccessMethod__Group_2__0 : rule__DataSourceAccessMethod__Group_2__0__Impl rule__DataSourceAccessMethod__Group_2__1 ;
    public final void rule__DataSourceAccessMethod__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2667:1: ( rule__DataSourceAccessMethod__Group_2__0__Impl rule__DataSourceAccessMethod__Group_2__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2668:2: rule__DataSourceAccessMethod__Group_2__0__Impl rule__DataSourceAccessMethod__Group_2__1
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2__0__Impl_in_rule__DataSourceAccessMethod__Group_2__05468);
            rule__DataSourceAccessMethod__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2__1_in_rule__DataSourceAccessMethod__Group_2__05471);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2675:1: rule__DataSourceAccessMethod__Group_2__0__Impl : ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 ) ) ;
    public final void rule__DataSourceAccessMethod__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2679:1: ( ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2680:1: ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2680:1: ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2681:1: ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersAssignment_2_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2682:1: ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2682:2: rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0_in_rule__DataSourceAccessMethod__Group_2__0__Impl5498);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2692:1: rule__DataSourceAccessMethod__Group_2__1 : rule__DataSourceAccessMethod__Group_2__1__Impl ;
    public final void rule__DataSourceAccessMethod__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2696:1: ( rule__DataSourceAccessMethod__Group_2__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2697:2: rule__DataSourceAccessMethod__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2__1__Impl_in_rule__DataSourceAccessMethod__Group_2__15528);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2703:1: rule__DataSourceAccessMethod__Group_2__1__Impl : ( ( rule__DataSourceAccessMethod__Group_2_1__0 )* ) ;
    public final void rule__DataSourceAccessMethod__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2707:1: ( ( ( rule__DataSourceAccessMethod__Group_2_1__0 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2708:1: ( ( rule__DataSourceAccessMethod__Group_2_1__0 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2708:1: ( ( rule__DataSourceAccessMethod__Group_2_1__0 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2709:1: ( rule__DataSourceAccessMethod__Group_2_1__0 )*
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getGroup_2_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2710:1: ( rule__DataSourceAccessMethod__Group_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2710:2: rule__DataSourceAccessMethod__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2_1__0_in_rule__DataSourceAccessMethod__Group_2__1__Impl5555);
            	    rule__DataSourceAccessMethod__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2724:1: rule__DataSourceAccessMethod__Group_2_1__0 : rule__DataSourceAccessMethod__Group_2_1__0__Impl rule__DataSourceAccessMethod__Group_2_1__1 ;
    public final void rule__DataSourceAccessMethod__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2728:1: ( rule__DataSourceAccessMethod__Group_2_1__0__Impl rule__DataSourceAccessMethod__Group_2_1__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2729:2: rule__DataSourceAccessMethod__Group_2_1__0__Impl rule__DataSourceAccessMethod__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2_1__0__Impl_in_rule__DataSourceAccessMethod__Group_2_1__05590);
            rule__DataSourceAccessMethod__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2_1__1_in_rule__DataSourceAccessMethod__Group_2_1__05593);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2736:1: rule__DataSourceAccessMethod__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__DataSourceAccessMethod__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2740:1: ( ( ',' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2741:1: ( ',' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2741:1: ( ',' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2742:1: ','
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getCommaKeyword_2_1_0()); 
            match(input,34,FOLLOW_34_in_rule__DataSourceAccessMethod__Group_2_1__0__Impl5621); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2755:1: rule__DataSourceAccessMethod__Group_2_1__1 : rule__DataSourceAccessMethod__Group_2_1__1__Impl ;
    public final void rule__DataSourceAccessMethod__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2759:1: ( rule__DataSourceAccessMethod__Group_2_1__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2760:2: rule__DataSourceAccessMethod__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__Group_2_1__1__Impl_in_rule__DataSourceAccessMethod__Group_2_1__15652);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2766:1: rule__DataSourceAccessMethod__Group_2_1__1__Impl : ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 ) ) ;
    public final void rule__DataSourceAccessMethod__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2770:1: ( ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2771:1: ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2771:1: ( ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2772:1: ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersAssignment_2_1_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2773:1: ( rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2773:2: rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1_in_rule__DataSourceAccessMethod__Group_2_1__1__Impl5679);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2787:1: rule__RESTSpecification__Group__0 : rule__RESTSpecification__Group__0__Impl rule__RESTSpecification__Group__1 ;
    public final void rule__RESTSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2791:1: ( rule__RESTSpecification__Group__0__Impl rule__RESTSpecification__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2792:2: rule__RESTSpecification__Group__0__Impl rule__RESTSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group__0__Impl_in_rule__RESTSpecification__Group__05713);
            rule__RESTSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTSpecification__Group__1_in_rule__RESTSpecification__Group__05716);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2799:1: rule__RESTSpecification__Group__0__Impl : ( ( rule__RESTSpecification__VerbAssignment_0 ) ) ;
    public final void rule__RESTSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2803:1: ( ( ( rule__RESTSpecification__VerbAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2804:1: ( ( rule__RESTSpecification__VerbAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2804:1: ( ( rule__RESTSpecification__VerbAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2805:1: ( rule__RESTSpecification__VerbAssignment_0 )
            {
             before(grammarAccess.getRESTSpecificationAccess().getVerbAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2806:1: ( rule__RESTSpecification__VerbAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2806:2: rule__RESTSpecification__VerbAssignment_0
            {
            pushFollow(FOLLOW_rule__RESTSpecification__VerbAssignment_0_in_rule__RESTSpecification__Group__0__Impl5743);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2816:1: rule__RESTSpecification__Group__1 : rule__RESTSpecification__Group__1__Impl rule__RESTSpecification__Group__2 ;
    public final void rule__RESTSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2820:1: ( rule__RESTSpecification__Group__1__Impl rule__RESTSpecification__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2821:2: rule__RESTSpecification__Group__1__Impl rule__RESTSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group__1__Impl_in_rule__RESTSpecification__Group__15773);
            rule__RESTSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTSpecification__Group__2_in_rule__RESTSpecification__Group__15776);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2828:1: rule__RESTSpecification__Group__1__Impl : ( ( rule__RESTSpecification__PathAssignment_1 ) ) ;
    public final void rule__RESTSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2832:1: ( ( ( rule__RESTSpecification__PathAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2833:1: ( ( rule__RESTSpecification__PathAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2833:1: ( ( rule__RESTSpecification__PathAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2834:1: ( rule__RESTSpecification__PathAssignment_1 )
            {
             before(grammarAccess.getRESTSpecificationAccess().getPathAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2835:1: ( rule__RESTSpecification__PathAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2835:2: rule__RESTSpecification__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__RESTSpecification__PathAssignment_1_in_rule__RESTSpecification__Group__1__Impl5803);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2845:1: rule__RESTSpecification__Group__2 : rule__RESTSpecification__Group__2__Impl ;
    public final void rule__RESTSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2849:1: ( rule__RESTSpecification__Group__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2850:2: rule__RESTSpecification__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group__2__Impl_in_rule__RESTSpecification__Group__25833);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2856:1: rule__RESTSpecification__Group__2__Impl : ( ( rule__RESTSpecification__Group_2__0 )? ) ;
    public final void rule__RESTSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2860:1: ( ( ( rule__RESTSpecification__Group_2__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2861:1: ( ( rule__RESTSpecification__Group_2__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2861:1: ( ( rule__RESTSpecification__Group_2__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2862:1: ( rule__RESTSpecification__Group_2__0 )?
            {
             before(grammarAccess.getRESTSpecificationAccess().getGroup_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2863:1: ( rule__RESTSpecification__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2863:2: rule__RESTSpecification__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RESTSpecification__Group_2__0_in_rule__RESTSpecification__Group__2__Impl5860);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2879:1: rule__RESTSpecification__Group_2__0 : rule__RESTSpecification__Group_2__0__Impl rule__RESTSpecification__Group_2__1 ;
    public final void rule__RESTSpecification__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2883:1: ( rule__RESTSpecification__Group_2__0__Impl rule__RESTSpecification__Group_2__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2884:2: rule__RESTSpecification__Group_2__0__Impl rule__RESTSpecification__Group_2__1
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group_2__0__Impl_in_rule__RESTSpecification__Group_2__05897);
            rule__RESTSpecification__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTSpecification__Group_2__1_in_rule__RESTSpecification__Group_2__05900);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2891:1: rule__RESTSpecification__Group_2__0__Impl : ( '{' ) ;
    public final void rule__RESTSpecification__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2895:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2896:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2896:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2897:1: '{'
            {
             before(grammarAccess.getRESTSpecificationAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__RESTSpecification__Group_2__0__Impl5928); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2910:1: rule__RESTSpecification__Group_2__1 : rule__RESTSpecification__Group_2__1__Impl rule__RESTSpecification__Group_2__2 ;
    public final void rule__RESTSpecification__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2914:1: ( rule__RESTSpecification__Group_2__1__Impl rule__RESTSpecification__Group_2__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2915:2: rule__RESTSpecification__Group_2__1__Impl rule__RESTSpecification__Group_2__2
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group_2__1__Impl_in_rule__RESTSpecification__Group_2__15959);
            rule__RESTSpecification__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTSpecification__Group_2__2_in_rule__RESTSpecification__Group_2__15962);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2922:1: rule__RESTSpecification__Group_2__1__Impl : ( ( rule__RESTSpecification__BodyAssignment_2_1 ) ) ;
    public final void rule__RESTSpecification__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2926:1: ( ( ( rule__RESTSpecification__BodyAssignment_2_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2927:1: ( ( rule__RESTSpecification__BodyAssignment_2_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2927:1: ( ( rule__RESTSpecification__BodyAssignment_2_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2928:1: ( rule__RESTSpecification__BodyAssignment_2_1 )
            {
             before(grammarAccess.getRESTSpecificationAccess().getBodyAssignment_2_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2929:1: ( rule__RESTSpecification__BodyAssignment_2_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2929:2: rule__RESTSpecification__BodyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RESTSpecification__BodyAssignment_2_1_in_rule__RESTSpecification__Group_2__1__Impl5989);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2939:1: rule__RESTSpecification__Group_2__2 : rule__RESTSpecification__Group_2__2__Impl ;
    public final void rule__RESTSpecification__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2943:1: ( rule__RESTSpecification__Group_2__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2944:2: rule__RESTSpecification__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__RESTSpecification__Group_2__2__Impl_in_rule__RESTSpecification__Group_2__26019);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2950:1: rule__RESTSpecification__Group_2__2__Impl : ( '}' ) ;
    public final void rule__RESTSpecification__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2954:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2955:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2955:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2956:1: '}'
            {
             before(grammarAccess.getRESTSpecificationAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,25,FOLLOW_25_in_rule__RESTSpecification__Group_2__2__Impl6047); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2975:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2979:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2980:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06084);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06087);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2987:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2991:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2992:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2992:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2993:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2994:1: ( rule__Parameter__TypeAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2994:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl6114);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3004:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3008:1: ( rule__Parameter__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3009:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16144);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3015:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3019:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3020:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3020:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3021:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3022:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3022:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl6171);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3036:1: rule__AbsoluteRESTURL__Group__0 : rule__AbsoluteRESTURL__Group__0__Impl rule__AbsoluteRESTURL__Group__1 ;
    public final void rule__AbsoluteRESTURL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3040:1: ( rule__AbsoluteRESTURL__Group__0__Impl rule__AbsoluteRESTURL__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3041:2: rule__AbsoluteRESTURL__Group__0__Impl rule__AbsoluteRESTURL__Group__1
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__0__Impl_in_rule__AbsoluteRESTURL__Group__06205);
            rule__AbsoluteRESTURL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__1_in_rule__AbsoluteRESTURL__Group__06208);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3048:1: rule__AbsoluteRESTURL__Group__0__Impl : ( () ) ;
    public final void rule__AbsoluteRESTURL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3052:1: ( ( () ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3053:1: ( () )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3053:1: ( () )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3054:1: ()
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getAbsoluteRESTURLAction_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3055:1: ()
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3057:1: 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3067:1: rule__AbsoluteRESTURL__Group__1 : rule__AbsoluteRESTURL__Group__1__Impl rule__AbsoluteRESTURL__Group__2 ;
    public final void rule__AbsoluteRESTURL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3071:1: ( rule__AbsoluteRESTURL__Group__1__Impl rule__AbsoluteRESTURL__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3072:2: rule__AbsoluteRESTURL__Group__1__Impl rule__AbsoluteRESTURL__Group__2
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__1__Impl_in_rule__AbsoluteRESTURL__Group__16266);
            rule__AbsoluteRESTURL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__2_in_rule__AbsoluteRESTURL__Group__16269);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3079:1: rule__AbsoluteRESTURL__Group__1__Impl : ( 'http://' ) ;
    public final void rule__AbsoluteRESTURL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3083:1: ( ( 'http://' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3084:1: ( 'http://' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3084:1: ( 'http://' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3085:1: 'http://'
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getHttpKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__AbsoluteRESTURL__Group__1__Impl6297); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3098:1: rule__AbsoluteRESTURL__Group__2 : rule__AbsoluteRESTURL__Group__2__Impl rule__AbsoluteRESTURL__Group__3 ;
    public final void rule__AbsoluteRESTURL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3102:1: ( rule__AbsoluteRESTURL__Group__2__Impl rule__AbsoluteRESTURL__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3103:2: rule__AbsoluteRESTURL__Group__2__Impl rule__AbsoluteRESTURL__Group__3
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__2__Impl_in_rule__AbsoluteRESTURL__Group__26328);
            rule__AbsoluteRESTURL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__3_in_rule__AbsoluteRESTURL__Group__26331);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3110:1: rule__AbsoluteRESTURL__Group__2__Impl : ( ( rule__AbsoluteRESTURL__HostAssignment_2 ) ) ;
    public final void rule__AbsoluteRESTURL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3114:1: ( ( ( rule__AbsoluteRESTURL__HostAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3115:1: ( ( rule__AbsoluteRESTURL__HostAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3115:1: ( ( rule__AbsoluteRESTURL__HostAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3116:1: ( rule__AbsoluteRESTURL__HostAssignment_2 )
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getHostAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3117:1: ( rule__AbsoluteRESTURL__HostAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3117:2: rule__AbsoluteRESTURL__HostAssignment_2
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__HostAssignment_2_in_rule__AbsoluteRESTURL__Group__2__Impl6358);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3127:1: rule__AbsoluteRESTURL__Group__3 : rule__AbsoluteRESTURL__Group__3__Impl rule__AbsoluteRESTURL__Group__4 ;
    public final void rule__AbsoluteRESTURL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3131:1: ( rule__AbsoluteRESTURL__Group__3__Impl rule__AbsoluteRESTURL__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3132:2: rule__AbsoluteRESTURL__Group__3__Impl rule__AbsoluteRESTURL__Group__4
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__3__Impl_in_rule__AbsoluteRESTURL__Group__36388);
            rule__AbsoluteRESTURL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__4_in_rule__AbsoluteRESTURL__Group__36391);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3139:1: rule__AbsoluteRESTURL__Group__3__Impl : ( ( rule__AbsoluteRESTURL__Group_3__0 )? ) ;
    public final void rule__AbsoluteRESTURL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3143:1: ( ( ( rule__AbsoluteRESTURL__Group_3__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3144:1: ( ( rule__AbsoluteRESTURL__Group_3__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3144:1: ( ( rule__AbsoluteRESTURL__Group_3__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3145:1: ( rule__AbsoluteRESTURL__Group_3__0 )?
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getGroup_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3146:1: ( rule__AbsoluteRESTURL__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3146:2: rule__AbsoluteRESTURL__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_3__0_in_rule__AbsoluteRESTURL__Group__3__Impl6418);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3156:1: rule__AbsoluteRESTURL__Group__4 : rule__AbsoluteRESTURL__Group__4__Impl ;
    public final void rule__AbsoluteRESTURL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3160:1: ( rule__AbsoluteRESTURL__Group__4__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3161:2: rule__AbsoluteRESTURL__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group__4__Impl_in_rule__AbsoluteRESTURL__Group__46449);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3167:1: rule__AbsoluteRESTURL__Group__4__Impl : ( ( rule__AbsoluteRESTURL__Group_4__0 )* ) ;
    public final void rule__AbsoluteRESTURL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3171:1: ( ( ( rule__AbsoluteRESTURL__Group_4__0 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3172:1: ( ( rule__AbsoluteRESTURL__Group_4__0 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3172:1: ( ( rule__AbsoluteRESTURL__Group_4__0 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3173:1: ( rule__AbsoluteRESTURL__Group_4__0 )*
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getGroup_4()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3174:1: ( rule__AbsoluteRESTURL__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3174:2: rule__AbsoluteRESTURL__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_4__0_in_rule__AbsoluteRESTURL__Group__4__Impl6476);
            	    rule__AbsoluteRESTURL__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3194:1: rule__AbsoluteRESTURL__Group_3__0 : rule__AbsoluteRESTURL__Group_3__0__Impl rule__AbsoluteRESTURL__Group_3__1 ;
    public final void rule__AbsoluteRESTURL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3198:1: ( rule__AbsoluteRESTURL__Group_3__0__Impl rule__AbsoluteRESTURL__Group_3__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3199:2: rule__AbsoluteRESTURL__Group_3__0__Impl rule__AbsoluteRESTURL__Group_3__1
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_3__0__Impl_in_rule__AbsoluteRESTURL__Group_3__06517);
            rule__AbsoluteRESTURL__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_3__1_in_rule__AbsoluteRESTURL__Group_3__06520);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3206:1: rule__AbsoluteRESTURL__Group_3__0__Impl : ( ':' ) ;
    public final void rule__AbsoluteRESTURL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3210:1: ( ( ':' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3211:1: ( ':' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3211:1: ( ':' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3212:1: ':'
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getColonKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__AbsoluteRESTURL__Group_3__0__Impl6548); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3225:1: rule__AbsoluteRESTURL__Group_3__1 : rule__AbsoluteRESTURL__Group_3__1__Impl ;
    public final void rule__AbsoluteRESTURL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3229:1: ( rule__AbsoluteRESTURL__Group_3__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3230:2: rule__AbsoluteRESTURL__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_3__1__Impl_in_rule__AbsoluteRESTURL__Group_3__16579);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3236:1: rule__AbsoluteRESTURL__Group_3__1__Impl : ( ( rule__AbsoluteRESTURL__PortAssignment_3_1 ) ) ;
    public final void rule__AbsoluteRESTURL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3240:1: ( ( ( rule__AbsoluteRESTURL__PortAssignment_3_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3241:1: ( ( rule__AbsoluteRESTURL__PortAssignment_3_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3241:1: ( ( rule__AbsoluteRESTURL__PortAssignment_3_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3242:1: ( rule__AbsoluteRESTURL__PortAssignment_3_1 )
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getPortAssignment_3_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3243:1: ( rule__AbsoluteRESTURL__PortAssignment_3_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3243:2: rule__AbsoluteRESTURL__PortAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__PortAssignment_3_1_in_rule__AbsoluteRESTURL__Group_3__1__Impl6606);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3257:1: rule__AbsoluteRESTURL__Group_4__0 : rule__AbsoluteRESTURL__Group_4__0__Impl rule__AbsoluteRESTURL__Group_4__1 ;
    public final void rule__AbsoluteRESTURL__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3261:1: ( rule__AbsoluteRESTURL__Group_4__0__Impl rule__AbsoluteRESTURL__Group_4__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3262:2: rule__AbsoluteRESTURL__Group_4__0__Impl rule__AbsoluteRESTURL__Group_4__1
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_4__0__Impl_in_rule__AbsoluteRESTURL__Group_4__06640);
            rule__AbsoluteRESTURL__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_4__1_in_rule__AbsoluteRESTURL__Group_4__06643);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3269:1: rule__AbsoluteRESTURL__Group_4__0__Impl : ( '/' ) ;
    public final void rule__AbsoluteRESTURL__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3273:1: ( ( '/' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3274:1: ( '/' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3274:1: ( '/' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3275:1: '/'
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getSolidusKeyword_4_0()); 
            match(input,36,FOLLOW_36_in_rule__AbsoluteRESTURL__Group_4__0__Impl6671); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3288:1: rule__AbsoluteRESTURL__Group_4__1 : rule__AbsoluteRESTURL__Group_4__1__Impl ;
    public final void rule__AbsoluteRESTURL__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3292:1: ( rule__AbsoluteRESTURL__Group_4__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3293:2: rule__AbsoluteRESTURL__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__Group_4__1__Impl_in_rule__AbsoluteRESTURL__Group_4__16702);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3299:1: rule__AbsoluteRESTURL__Group_4__1__Impl : ( ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 ) ) ;
    public final void rule__AbsoluteRESTURL__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3303:1: ( ( ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3304:1: ( ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3304:1: ( ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3305:1: ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 )
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getFragmentsAssignment_4_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3306:1: ( rule__AbsoluteRESTURL__FragmentsAssignment_4_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3306:2: rule__AbsoluteRESTURL__FragmentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__AbsoluteRESTURL__FragmentsAssignment_4_1_in_rule__AbsoluteRESTURL__Group_4__1__Impl6729);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3320:1: rule__RelativeRESTURL__Group__0 : rule__RelativeRESTURL__Group__0__Impl rule__RelativeRESTURL__Group__1 ;
    public final void rule__RelativeRESTURL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3324:1: ( rule__RelativeRESTURL__Group__0__Impl rule__RelativeRESTURL__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3325:2: rule__RelativeRESTURL__Group__0__Impl rule__RelativeRESTURL__Group__1
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__0__Impl_in_rule__RelativeRESTURL__Group__06763);
            rule__RelativeRESTURL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__1_in_rule__RelativeRESTURL__Group__06766);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3332:1: rule__RelativeRESTURL__Group__0__Impl : ( () ) ;
    public final void rule__RelativeRESTURL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3336:1: ( ( () ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3337:1: ( () )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3337:1: ( () )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3338:1: ()
            {
             before(grammarAccess.getRelativeRESTURLAccess().getRelativeRESTURLAction_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3339:1: ()
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3341:1: 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3351:1: rule__RelativeRESTURL__Group__1 : rule__RelativeRESTURL__Group__1__Impl rule__RelativeRESTURL__Group__2 ;
    public final void rule__RelativeRESTURL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3355:1: ( rule__RelativeRESTURL__Group__1__Impl rule__RelativeRESTURL__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3356:2: rule__RelativeRESTURL__Group__1__Impl rule__RelativeRESTURL__Group__2
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__1__Impl_in_rule__RelativeRESTURL__Group__16824);
            rule__RelativeRESTURL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__2_in_rule__RelativeRESTURL__Group__16827);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3363:1: rule__RelativeRESTURL__Group__1__Impl : ( '/' ) ;
    public final void rule__RelativeRESTURL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3367:1: ( ( '/' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3368:1: ( '/' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3368:1: ( '/' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3369:1: '/'
            {
             before(grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__RelativeRESTURL__Group__1__Impl6855); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3382:1: rule__RelativeRESTURL__Group__2 : rule__RelativeRESTURL__Group__2__Impl rule__RelativeRESTURL__Group__3 ;
    public final void rule__RelativeRESTURL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3386:1: ( rule__RelativeRESTURL__Group__2__Impl rule__RelativeRESTURL__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3387:2: rule__RelativeRESTURL__Group__2__Impl rule__RelativeRESTURL__Group__3
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__2__Impl_in_rule__RelativeRESTURL__Group__26886);
            rule__RelativeRESTURL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__3_in_rule__RelativeRESTURL__Group__26889);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3394:1: rule__RelativeRESTURL__Group__2__Impl : ( ( rule__RelativeRESTURL__FragmentsAssignment_2 ) ) ;
    public final void rule__RelativeRESTURL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3398:1: ( ( ( rule__RelativeRESTURL__FragmentsAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3399:1: ( ( rule__RelativeRESTURL__FragmentsAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3399:1: ( ( rule__RelativeRESTURL__FragmentsAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3400:1: ( rule__RelativeRESTURL__FragmentsAssignment_2 )
            {
             before(grammarAccess.getRelativeRESTURLAccess().getFragmentsAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3401:1: ( rule__RelativeRESTURL__FragmentsAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3401:2: rule__RelativeRESTURL__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__FragmentsAssignment_2_in_rule__RelativeRESTURL__Group__2__Impl6916);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3411:1: rule__RelativeRESTURL__Group__3 : rule__RelativeRESTURL__Group__3__Impl ;
    public final void rule__RelativeRESTURL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3415:1: ( rule__RelativeRESTURL__Group__3__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3416:2: rule__RelativeRESTURL__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group__3__Impl_in_rule__RelativeRESTURL__Group__36946);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3422:1: rule__RelativeRESTURL__Group__3__Impl : ( ( rule__RelativeRESTURL__Group_3__0 )* ) ;
    public final void rule__RelativeRESTURL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3426:1: ( ( ( rule__RelativeRESTURL__Group_3__0 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3427:1: ( ( rule__RelativeRESTURL__Group_3__0 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3427:1: ( ( rule__RelativeRESTURL__Group_3__0 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3428:1: ( rule__RelativeRESTURL__Group_3__0 )*
            {
             before(grammarAccess.getRelativeRESTURLAccess().getGroup_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3429:1: ( rule__RelativeRESTURL__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3429:2: rule__RelativeRESTURL__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RelativeRESTURL__Group_3__0_in_rule__RelativeRESTURL__Group__3__Impl6973);
            	    rule__RelativeRESTURL__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3447:1: rule__RelativeRESTURL__Group_3__0 : rule__RelativeRESTURL__Group_3__0__Impl rule__RelativeRESTURL__Group_3__1 ;
    public final void rule__RelativeRESTURL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3451:1: ( rule__RelativeRESTURL__Group_3__0__Impl rule__RelativeRESTURL__Group_3__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3452:2: rule__RelativeRESTURL__Group_3__0__Impl rule__RelativeRESTURL__Group_3__1
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group_3__0__Impl_in_rule__RelativeRESTURL__Group_3__07012);
            rule__RelativeRESTURL__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeRESTURL__Group_3__1_in_rule__RelativeRESTURL__Group_3__07015);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3459:1: rule__RelativeRESTURL__Group_3__0__Impl : ( '/' ) ;
    public final void rule__RelativeRESTURL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3463:1: ( ( '/' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3464:1: ( '/' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3464:1: ( '/' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3465:1: '/'
            {
             before(grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_3_0()); 
            match(input,36,FOLLOW_36_in_rule__RelativeRESTURL__Group_3__0__Impl7043); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3478:1: rule__RelativeRESTURL__Group_3__1 : rule__RelativeRESTURL__Group_3__1__Impl ;
    public final void rule__RelativeRESTURL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3482:1: ( rule__RelativeRESTURL__Group_3__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3483:2: rule__RelativeRESTURL__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__Group_3__1__Impl_in_rule__RelativeRESTURL__Group_3__17074);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3489:1: rule__RelativeRESTURL__Group_3__1__Impl : ( ( rule__RelativeRESTURL__FragmentsAssignment_3_1 ) ) ;
    public final void rule__RelativeRESTURL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3493:1: ( ( ( rule__RelativeRESTURL__FragmentsAssignment_3_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3494:1: ( ( rule__RelativeRESTURL__FragmentsAssignment_3_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3494:1: ( ( rule__RelativeRESTURL__FragmentsAssignment_3_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3495:1: ( rule__RelativeRESTURL__FragmentsAssignment_3_1 )
            {
             before(grammarAccess.getRelativeRESTURLAccess().getFragmentsAssignment_3_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3496:1: ( rule__RelativeRESTURL__FragmentsAssignment_3_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3496:2: rule__RelativeRESTURL__FragmentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RelativeRESTURL__FragmentsAssignment_3_1_in_rule__RelativeRESTURL__Group_3__1__Impl7101);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3510:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3514:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3515:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__07135);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__07138);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3522:1: rule__Variable__Group__0__Impl : ( ':' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3526:1: ( ( ':' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3527:1: ( ':' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3527:1: ( ':' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3528:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Variable__Group__0__Impl7166); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3541:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3545:1: ( rule__Variable__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3546:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__17197);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3552:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__ParameterReferenceAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3556:1: ( ( ( rule__Variable__ParameterReferenceAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3557:1: ( ( rule__Variable__ParameterReferenceAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3557:1: ( ( rule__Variable__ParameterReferenceAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3558:1: ( rule__Variable__ParameterReferenceAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getParameterReferenceAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3559:1: ( rule__Variable__ParameterReferenceAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3559:2: rule__Variable__ParameterReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__ParameterReferenceAssignment_1_in_rule__Variable__Group__1__Impl7224);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3573:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3577:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3578:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07258);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07261);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3585:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3589:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3590:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3590:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3591:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7288); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3602:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3606:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3607:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17317);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3613:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3617:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3618:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3618:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3619:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3620:1: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3620:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7344);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3634:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3638:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3639:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07379);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07382);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3646:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3650:1: ( ( '.' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3651:1: ( '.' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3651:1: ( '.' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3652:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl7410); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3665:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3669:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3670:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17441);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3676:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3680:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3681:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3681:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3682:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7468); 
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


    // $ANTLR start "rule__Screen__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3697:1: rule__Screen__Group__0 : rule__Screen__Group__0__Impl rule__Screen__Group__1 ;
    public final void rule__Screen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3701:1: ( rule__Screen__Group__0__Impl rule__Screen__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3702:2: rule__Screen__Group__0__Impl rule__Screen__Group__1
            {
            pushFollow(FOLLOW_rule__Screen__Group__0__Impl_in_rule__Screen__Group__07501);
            rule__Screen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group__1_in_rule__Screen__Group__07504);
            rule__Screen__Group__1();

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
    // $ANTLR end "rule__Screen__Group__0"


    // $ANTLR start "rule__Screen__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3709:1: rule__Screen__Group__0__Impl : ( 'screen' ) ;
    public final void rule__Screen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3713:1: ( ( 'screen' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3714:1: ( 'screen' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3714:1: ( 'screen' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3715:1: 'screen'
            {
             before(grammarAccess.getScreenAccess().getScreenKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Screen__Group__0__Impl7532); 
             after(grammarAccess.getScreenAccess().getScreenKeyword_0()); 

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
    // $ANTLR end "rule__Screen__Group__0__Impl"


    // $ANTLR start "rule__Screen__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3728:1: rule__Screen__Group__1 : rule__Screen__Group__1__Impl rule__Screen__Group__2 ;
    public final void rule__Screen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3732:1: ( rule__Screen__Group__1__Impl rule__Screen__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3733:2: rule__Screen__Group__1__Impl rule__Screen__Group__2
            {
            pushFollow(FOLLOW_rule__Screen__Group__1__Impl_in_rule__Screen__Group__17563);
            rule__Screen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group__2_in_rule__Screen__Group__17566);
            rule__Screen__Group__2();

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
    // $ANTLR end "rule__Screen__Group__1"


    // $ANTLR start "rule__Screen__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3740:1: rule__Screen__Group__1__Impl : ( ( rule__Screen__KindAssignment_1 ) ) ;
    public final void rule__Screen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3744:1: ( ( ( rule__Screen__KindAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3745:1: ( ( rule__Screen__KindAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3745:1: ( ( rule__Screen__KindAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3746:1: ( rule__Screen__KindAssignment_1 )
            {
             before(grammarAccess.getScreenAccess().getKindAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3747:1: ( rule__Screen__KindAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3747:2: rule__Screen__KindAssignment_1
            {
            pushFollow(FOLLOW_rule__Screen__KindAssignment_1_in_rule__Screen__Group__1__Impl7593);
            rule__Screen__KindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScreenAccess().getKindAssignment_1()); 

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
    // $ANTLR end "rule__Screen__Group__1__Impl"


    // $ANTLR start "rule__Screen__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3757:1: rule__Screen__Group__2 : rule__Screen__Group__2__Impl rule__Screen__Group__3 ;
    public final void rule__Screen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3761:1: ( rule__Screen__Group__2__Impl rule__Screen__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3762:2: rule__Screen__Group__2__Impl rule__Screen__Group__3
            {
            pushFollow(FOLLOW_rule__Screen__Group__2__Impl_in_rule__Screen__Group__27623);
            rule__Screen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group__3_in_rule__Screen__Group__27626);
            rule__Screen__Group__3();

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
    // $ANTLR end "rule__Screen__Group__2"


    // $ANTLR start "rule__Screen__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3769:1: rule__Screen__Group__2__Impl : ( ( rule__Screen__NameAssignment_2 ) ) ;
    public final void rule__Screen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3773:1: ( ( ( rule__Screen__NameAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3774:1: ( ( rule__Screen__NameAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3774:1: ( ( rule__Screen__NameAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3775:1: ( rule__Screen__NameAssignment_2 )
            {
             before(grammarAccess.getScreenAccess().getNameAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3776:1: ( rule__Screen__NameAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3776:2: rule__Screen__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Screen__NameAssignment_2_in_rule__Screen__Group__2__Impl7653);
            rule__Screen__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScreenAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Screen__Group__2__Impl"


    // $ANTLR start "rule__Screen__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3786:1: rule__Screen__Group__3 : rule__Screen__Group__3__Impl rule__Screen__Group__4 ;
    public final void rule__Screen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3790:1: ( rule__Screen__Group__3__Impl rule__Screen__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3791:2: rule__Screen__Group__3__Impl rule__Screen__Group__4
            {
            pushFollow(FOLLOW_rule__Screen__Group__3__Impl_in_rule__Screen__Group__37683);
            rule__Screen__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group__4_in_rule__Screen__Group__37686);
            rule__Screen__Group__4();

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
    // $ANTLR end "rule__Screen__Group__3"


    // $ANTLR start "rule__Screen__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3798:1: rule__Screen__Group__3__Impl : ( '{' ) ;
    public final void rule__Screen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3802:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3803:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3803:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3804:1: '{'
            {
             before(grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Screen__Group__3__Impl7714); 
             after(grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Screen__Group__3__Impl"


    // $ANTLR start "rule__Screen__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3817:1: rule__Screen__Group__4 : rule__Screen__Group__4__Impl rule__Screen__Group__5 ;
    public final void rule__Screen__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3821:1: ( rule__Screen__Group__4__Impl rule__Screen__Group__5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3822:2: rule__Screen__Group__4__Impl rule__Screen__Group__5
            {
            pushFollow(FOLLOW_rule__Screen__Group__4__Impl_in_rule__Screen__Group__47745);
            rule__Screen__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group__5_in_rule__Screen__Group__47748);
            rule__Screen__Group__5();

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
    // $ANTLR end "rule__Screen__Group__4"


    // $ANTLR start "rule__Screen__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3829:1: rule__Screen__Group__4__Impl : ( ( rule__Screen__Group_4__0 )? ) ;
    public final void rule__Screen__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3833:1: ( ( ( rule__Screen__Group_4__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3834:1: ( ( rule__Screen__Group_4__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3834:1: ( ( rule__Screen__Group_4__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3835:1: ( rule__Screen__Group_4__0 )?
            {
             before(grammarAccess.getScreenAccess().getGroup_4()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3836:1: ( rule__Screen__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==11) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3836:2: rule__Screen__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Screen__Group_4__0_in_rule__Screen__Group__4__Impl7775);
                    rule__Screen__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScreenAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Screen__Group__4__Impl"


    // $ANTLR start "rule__Screen__Group__5"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3846:1: rule__Screen__Group__5 : rule__Screen__Group__5__Impl rule__Screen__Group__6 ;
    public final void rule__Screen__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3850:1: ( rule__Screen__Group__5__Impl rule__Screen__Group__6 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3851:2: rule__Screen__Group__5__Impl rule__Screen__Group__6
            {
            pushFollow(FOLLOW_rule__Screen__Group__5__Impl_in_rule__Screen__Group__57806);
            rule__Screen__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group__6_in_rule__Screen__Group__57809);
            rule__Screen__Group__6();

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
    // $ANTLR end "rule__Screen__Group__5"


    // $ANTLR start "rule__Screen__Group__5__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3858:1: rule__Screen__Group__5__Impl : ( ( rule__Screen__Group_5__0 )? ) ;
    public final void rule__Screen__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3862:1: ( ( ( rule__Screen__Group_5__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3863:1: ( ( rule__Screen__Group_5__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3863:1: ( ( rule__Screen__Group_5__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3864:1: ( rule__Screen__Group_5__0 )?
            {
             before(grammarAccess.getScreenAccess().getGroup_5()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3865:1: ( rule__Screen__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3865:2: rule__Screen__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Screen__Group_5__0_in_rule__Screen__Group__5__Impl7836);
                    rule__Screen__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScreenAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Screen__Group__5__Impl"


    // $ANTLR start "rule__Screen__Group__6"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3875:1: rule__Screen__Group__6 : rule__Screen__Group__6__Impl rule__Screen__Group__7 ;
    public final void rule__Screen__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3879:1: ( rule__Screen__Group__6__Impl rule__Screen__Group__7 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3880:2: rule__Screen__Group__6__Impl rule__Screen__Group__7
            {
            pushFollow(FOLLOW_rule__Screen__Group__6__Impl_in_rule__Screen__Group__67867);
            rule__Screen__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group__7_in_rule__Screen__Group__67870);
            rule__Screen__Group__7();

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
    // $ANTLR end "rule__Screen__Group__6"


    // $ANTLR start "rule__Screen__Group__6__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3887:1: rule__Screen__Group__6__Impl : ( 'sections' ) ;
    public final void rule__Screen__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3891:1: ( ( 'sections' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3892:1: ( 'sections' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3892:1: ( 'sections' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3893:1: 'sections'
            {
             before(grammarAccess.getScreenAccess().getSectionsKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__Screen__Group__6__Impl7898); 
             after(grammarAccess.getScreenAccess().getSectionsKeyword_6()); 

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
    // $ANTLR end "rule__Screen__Group__6__Impl"


    // $ANTLR start "rule__Screen__Group__7"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3906:1: rule__Screen__Group__7 : rule__Screen__Group__7__Impl rule__Screen__Group__8 ;
    public final void rule__Screen__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3910:1: ( rule__Screen__Group__7__Impl rule__Screen__Group__8 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3911:2: rule__Screen__Group__7__Impl rule__Screen__Group__8
            {
            pushFollow(FOLLOW_rule__Screen__Group__7__Impl_in_rule__Screen__Group__77929);
            rule__Screen__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group__8_in_rule__Screen__Group__77932);
            rule__Screen__Group__8();

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
    // $ANTLR end "rule__Screen__Group__7"


    // $ANTLR start "rule__Screen__Group__7__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3918:1: rule__Screen__Group__7__Impl : ( '{' ) ;
    public final void rule__Screen__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3922:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3923:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3923:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3924:1: '{'
            {
             before(grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__Screen__Group__7__Impl7960); 
             after(grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Screen__Group__7__Impl"


    // $ANTLR start "rule__Screen__Group__8"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3937:1: rule__Screen__Group__8 : rule__Screen__Group__8__Impl rule__Screen__Group__9 ;
    public final void rule__Screen__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3941:1: ( rule__Screen__Group__8__Impl rule__Screen__Group__9 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3942:2: rule__Screen__Group__8__Impl rule__Screen__Group__9
            {
            pushFollow(FOLLOW_rule__Screen__Group__8__Impl_in_rule__Screen__Group__87991);
            rule__Screen__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group__9_in_rule__Screen__Group__87994);
            rule__Screen__Group__9();

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
    // $ANTLR end "rule__Screen__Group__8"


    // $ANTLR start "rule__Screen__Group__8__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3949:1: rule__Screen__Group__8__Impl : ( ( rule__Screen__SectionsAssignment_8 )* ) ;
    public final void rule__Screen__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3953:1: ( ( ( rule__Screen__SectionsAssignment_8 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3954:1: ( ( rule__Screen__SectionsAssignment_8 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3954:1: ( ( rule__Screen__SectionsAssignment_8 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3955:1: ( rule__Screen__SectionsAssignment_8 )*
            {
             before(grammarAccess.getScreenAccess().getSectionsAssignment_8()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3956:1: ( rule__Screen__SectionsAssignment_8 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3956:2: rule__Screen__SectionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Screen__SectionsAssignment_8_in_rule__Screen__Group__8__Impl8021);
            	    rule__Screen__SectionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getScreenAccess().getSectionsAssignment_8()); 

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
    // $ANTLR end "rule__Screen__Group__8__Impl"


    // $ANTLR start "rule__Screen__Group__9"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3966:1: rule__Screen__Group__9 : rule__Screen__Group__9__Impl rule__Screen__Group__10 ;
    public final void rule__Screen__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3970:1: ( rule__Screen__Group__9__Impl rule__Screen__Group__10 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3971:2: rule__Screen__Group__9__Impl rule__Screen__Group__10
            {
            pushFollow(FOLLOW_rule__Screen__Group__9__Impl_in_rule__Screen__Group__98052);
            rule__Screen__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group__10_in_rule__Screen__Group__98055);
            rule__Screen__Group__10();

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
    // $ANTLR end "rule__Screen__Group__9"


    // $ANTLR start "rule__Screen__Group__9__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3978:1: rule__Screen__Group__9__Impl : ( '}' ) ;
    public final void rule__Screen__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3982:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3983:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3983:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3984:1: '}'
            {
             before(grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_9()); 
            match(input,25,FOLLOW_25_in_rule__Screen__Group__9__Impl8083); 
             after(grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Screen__Group__9__Impl"


    // $ANTLR start "rule__Screen__Group__10"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3997:1: rule__Screen__Group__10 : rule__Screen__Group__10__Impl ;
    public final void rule__Screen__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4001:1: ( rule__Screen__Group__10__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4002:2: rule__Screen__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Screen__Group__10__Impl_in_rule__Screen__Group__108114);
            rule__Screen__Group__10__Impl();

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
    // $ANTLR end "rule__Screen__Group__10"


    // $ANTLR start "rule__Screen__Group__10__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4008:1: rule__Screen__Group__10__Impl : ( '}' ) ;
    public final void rule__Screen__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4012:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4013:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4013:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4014:1: '}'
            {
             before(grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_10()); 
            match(input,25,FOLLOW_25_in_rule__Screen__Group__10__Impl8142); 
             after(grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Screen__Group__10__Impl"


    // $ANTLR start "rule__Screen__Group_4__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4049:1: rule__Screen__Group_4__0 : rule__Screen__Group_4__0__Impl rule__Screen__Group_4__1 ;
    public final void rule__Screen__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4053:1: ( rule__Screen__Group_4__0__Impl rule__Screen__Group_4__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4054:2: rule__Screen__Group_4__0__Impl rule__Screen__Group_4__1
            {
            pushFollow(FOLLOW_rule__Screen__Group_4__0__Impl_in_rule__Screen__Group_4__08195);
            rule__Screen__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group_4__1_in_rule__Screen__Group_4__08198);
            rule__Screen__Group_4__1();

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
    // $ANTLR end "rule__Screen__Group_4__0"


    // $ANTLR start "rule__Screen__Group_4__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4061:1: rule__Screen__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__Screen__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4065:1: ( ( 'title' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4066:1: ( 'title' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4066:1: ( 'title' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4067:1: 'title'
            {
             before(grammarAccess.getScreenAccess().getTitleKeyword_4_0()); 
            match(input,11,FOLLOW_11_in_rule__Screen__Group_4__0__Impl8226); 
             after(grammarAccess.getScreenAccess().getTitleKeyword_4_0()); 

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
    // $ANTLR end "rule__Screen__Group_4__0__Impl"


    // $ANTLR start "rule__Screen__Group_4__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4080:1: rule__Screen__Group_4__1 : rule__Screen__Group_4__1__Impl rule__Screen__Group_4__2 ;
    public final void rule__Screen__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4084:1: ( rule__Screen__Group_4__1__Impl rule__Screen__Group_4__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4085:2: rule__Screen__Group_4__1__Impl rule__Screen__Group_4__2
            {
            pushFollow(FOLLOW_rule__Screen__Group_4__1__Impl_in_rule__Screen__Group_4__18257);
            rule__Screen__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group_4__2_in_rule__Screen__Group_4__18260);
            rule__Screen__Group_4__2();

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
    // $ANTLR end "rule__Screen__Group_4__1"


    // $ANTLR start "rule__Screen__Group_4__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4092:1: rule__Screen__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Screen__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4096:1: ( ( '=' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4097:1: ( '=' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4097:1: ( '=' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4098:1: '='
            {
             before(grammarAccess.getScreenAccess().getEqualsSignKeyword_4_1()); 
            match(input,40,FOLLOW_40_in_rule__Screen__Group_4__1__Impl8288); 
             after(grammarAccess.getScreenAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Screen__Group_4__1__Impl"


    // $ANTLR start "rule__Screen__Group_4__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4111:1: rule__Screen__Group_4__2 : rule__Screen__Group_4__2__Impl ;
    public final void rule__Screen__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4115:1: ( rule__Screen__Group_4__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4116:2: rule__Screen__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Screen__Group_4__2__Impl_in_rule__Screen__Group_4__28319);
            rule__Screen__Group_4__2__Impl();

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
    // $ANTLR end "rule__Screen__Group_4__2"


    // $ANTLR start "rule__Screen__Group_4__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4122:1: rule__Screen__Group_4__2__Impl : ( ( rule__Screen__TitleAssignment_4_2 ) ) ;
    public final void rule__Screen__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4126:1: ( ( ( rule__Screen__TitleAssignment_4_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4127:1: ( ( rule__Screen__TitleAssignment_4_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4127:1: ( ( rule__Screen__TitleAssignment_4_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4128:1: ( rule__Screen__TitleAssignment_4_2 )
            {
             before(grammarAccess.getScreenAccess().getTitleAssignment_4_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4129:1: ( rule__Screen__TitleAssignment_4_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4129:2: rule__Screen__TitleAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Screen__TitleAssignment_4_2_in_rule__Screen__Group_4__2__Impl8346);
            rule__Screen__TitleAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getScreenAccess().getTitleAssignment_4_2()); 

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
    // $ANTLR end "rule__Screen__Group_4__2__Impl"


    // $ANTLR start "rule__Screen__Group_5__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4145:1: rule__Screen__Group_5__0 : rule__Screen__Group_5__0__Impl rule__Screen__Group_5__1 ;
    public final void rule__Screen__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4149:1: ( rule__Screen__Group_5__0__Impl rule__Screen__Group_5__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4150:2: rule__Screen__Group_5__0__Impl rule__Screen__Group_5__1
            {
            pushFollow(FOLLOW_rule__Screen__Group_5__0__Impl_in_rule__Screen__Group_5__08382);
            rule__Screen__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group_5__1_in_rule__Screen__Group_5__08385);
            rule__Screen__Group_5__1();

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
    // $ANTLR end "rule__Screen__Group_5__0"


    // $ANTLR start "rule__Screen__Group_5__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4157:1: rule__Screen__Group_5__0__Impl : ( 'datasource' ) ;
    public final void rule__Screen__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4161:1: ( ( 'datasource' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4162:1: ( 'datasource' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4162:1: ( 'datasource' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4163:1: 'datasource'
            {
             before(grammarAccess.getScreenAccess().getDatasourceKeyword_5_0()); 
            match(input,29,FOLLOW_29_in_rule__Screen__Group_5__0__Impl8413); 
             after(grammarAccess.getScreenAccess().getDatasourceKeyword_5_0()); 

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
    // $ANTLR end "rule__Screen__Group_5__0__Impl"


    // $ANTLR start "rule__Screen__Group_5__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4176:1: rule__Screen__Group_5__1 : rule__Screen__Group_5__1__Impl rule__Screen__Group_5__2 ;
    public final void rule__Screen__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4180:1: ( rule__Screen__Group_5__1__Impl rule__Screen__Group_5__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4181:2: rule__Screen__Group_5__1__Impl rule__Screen__Group_5__2
            {
            pushFollow(FOLLOW_rule__Screen__Group_5__1__Impl_in_rule__Screen__Group_5__18444);
            rule__Screen__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Screen__Group_5__2_in_rule__Screen__Group_5__18447);
            rule__Screen__Group_5__2();

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
    // $ANTLR end "rule__Screen__Group_5__1"


    // $ANTLR start "rule__Screen__Group_5__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4188:1: rule__Screen__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Screen__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4192:1: ( ( '=' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4193:1: ( '=' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4193:1: ( '=' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4194:1: '='
            {
             before(grammarAccess.getScreenAccess().getEqualsSignKeyword_5_1()); 
            match(input,40,FOLLOW_40_in_rule__Screen__Group_5__1__Impl8475); 
             after(grammarAccess.getScreenAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__Screen__Group_5__1__Impl"


    // $ANTLR start "rule__Screen__Group_5__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4207:1: rule__Screen__Group_5__2 : rule__Screen__Group_5__2__Impl ;
    public final void rule__Screen__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4211:1: ( rule__Screen__Group_5__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4212:2: rule__Screen__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Screen__Group_5__2__Impl_in_rule__Screen__Group_5__28506);
            rule__Screen__Group_5__2__Impl();

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
    // $ANTLR end "rule__Screen__Group_5__2"


    // $ANTLR start "rule__Screen__Group_5__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4218:1: rule__Screen__Group_5__2__Impl : ( ( rule__Screen__DatasourceAssignment_5_2 ) ) ;
    public final void rule__Screen__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4222:1: ( ( ( rule__Screen__DatasourceAssignment_5_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4223:1: ( ( rule__Screen__DatasourceAssignment_5_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4223:1: ( ( rule__Screen__DatasourceAssignment_5_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4224:1: ( rule__Screen__DatasourceAssignment_5_2 )
            {
             before(grammarAccess.getScreenAccess().getDatasourceAssignment_5_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4225:1: ( rule__Screen__DatasourceAssignment_5_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4225:2: rule__Screen__DatasourceAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Screen__DatasourceAssignment_5_2_in_rule__Screen__Group_5__2__Impl8533);
            rule__Screen__DatasourceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getScreenAccess().getDatasourceAssignment_5_2()); 

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
    // $ANTLR end "rule__Screen__Group_5__2__Impl"


    // $ANTLR start "rule__ScreenSection__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4241:1: rule__ScreenSection__Group__0 : rule__ScreenSection__Group__0__Impl rule__ScreenSection__Group__1 ;
    public final void rule__ScreenSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4245:1: ( rule__ScreenSection__Group__0__Impl rule__ScreenSection__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4246:2: rule__ScreenSection__Group__0__Impl rule__ScreenSection__Group__1
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group__0__Impl_in_rule__ScreenSection__Group__08569);
            rule__ScreenSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSection__Group__1_in_rule__ScreenSection__Group__08572);
            rule__ScreenSection__Group__1();

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
    // $ANTLR end "rule__ScreenSection__Group__0"


    // $ANTLR start "rule__ScreenSection__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4253:1: rule__ScreenSection__Group__0__Impl : ( 'section' ) ;
    public final void rule__ScreenSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4257:1: ( ( 'section' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4258:1: ( 'section' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4258:1: ( 'section' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4259:1: 'section'
            {
             before(grammarAccess.getScreenSectionAccess().getSectionKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__ScreenSection__Group__0__Impl8600); 
             after(grammarAccess.getScreenSectionAccess().getSectionKeyword_0()); 

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
    // $ANTLR end "rule__ScreenSection__Group__0__Impl"


    // $ANTLR start "rule__ScreenSection__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4272:1: rule__ScreenSection__Group__1 : rule__ScreenSection__Group__1__Impl rule__ScreenSection__Group__2 ;
    public final void rule__ScreenSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4276:1: ( rule__ScreenSection__Group__1__Impl rule__ScreenSection__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4277:2: rule__ScreenSection__Group__1__Impl rule__ScreenSection__Group__2
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group__1__Impl_in_rule__ScreenSection__Group__18631);
            rule__ScreenSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSection__Group__2_in_rule__ScreenSection__Group__18634);
            rule__ScreenSection__Group__2();

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
    // $ANTLR end "rule__ScreenSection__Group__1"


    // $ANTLR start "rule__ScreenSection__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4284:1: rule__ScreenSection__Group__1__Impl : ( '{' ) ;
    public final void rule__ScreenSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4288:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4289:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4289:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4290:1: '{'
            {
             before(grammarAccess.getScreenSectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__ScreenSection__Group__1__Impl8662); 
             after(grammarAccess.getScreenSectionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ScreenSection__Group__1__Impl"


    // $ANTLR start "rule__ScreenSection__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4303:1: rule__ScreenSection__Group__2 : rule__ScreenSection__Group__2__Impl rule__ScreenSection__Group__3 ;
    public final void rule__ScreenSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4307:1: ( rule__ScreenSection__Group__2__Impl rule__ScreenSection__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4308:2: rule__ScreenSection__Group__2__Impl rule__ScreenSection__Group__3
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group__2__Impl_in_rule__ScreenSection__Group__28693);
            rule__ScreenSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSection__Group__3_in_rule__ScreenSection__Group__28696);
            rule__ScreenSection__Group__3();

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
    // $ANTLR end "rule__ScreenSection__Group__2"


    // $ANTLR start "rule__ScreenSection__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4315:1: rule__ScreenSection__Group__2__Impl : ( ( rule__ScreenSection__Group_2__0 )? ) ;
    public final void rule__ScreenSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4319:1: ( ( ( rule__ScreenSection__Group_2__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4320:1: ( ( rule__ScreenSection__Group_2__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4320:1: ( ( rule__ScreenSection__Group_2__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4321:1: ( rule__ScreenSection__Group_2__0 )?
            {
             before(grammarAccess.getScreenSectionAccess().getGroup_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4322:1: ( rule__ScreenSection__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==11) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4322:2: rule__ScreenSection__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ScreenSection__Group_2__0_in_rule__ScreenSection__Group__2__Impl8723);
                    rule__ScreenSection__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScreenSectionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ScreenSection__Group__2__Impl"


    // $ANTLR start "rule__ScreenSection__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4332:1: rule__ScreenSection__Group__3 : rule__ScreenSection__Group__3__Impl rule__ScreenSection__Group__4 ;
    public final void rule__ScreenSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4336:1: ( rule__ScreenSection__Group__3__Impl rule__ScreenSection__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4337:2: rule__ScreenSection__Group__3__Impl rule__ScreenSection__Group__4
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group__3__Impl_in_rule__ScreenSection__Group__38754);
            rule__ScreenSection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSection__Group__4_in_rule__ScreenSection__Group__38757);
            rule__ScreenSection__Group__4();

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
    // $ANTLR end "rule__ScreenSection__Group__3"


    // $ANTLR start "rule__ScreenSection__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4344:1: rule__ScreenSection__Group__3__Impl : ( ( rule__ScreenSection__Group_3__0 )? ) ;
    public final void rule__ScreenSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4348:1: ( ( ( rule__ScreenSection__Group_3__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4349:1: ( ( rule__ScreenSection__Group_3__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4349:1: ( ( rule__ScreenSection__Group_3__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4350:1: ( rule__ScreenSection__Group_3__0 )?
            {
             before(grammarAccess.getScreenSectionAccess().getGroup_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4351:1: ( rule__ScreenSection__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4351:2: rule__ScreenSection__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ScreenSection__Group_3__0_in_rule__ScreenSection__Group__3__Impl8784);
                    rule__ScreenSection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScreenSectionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ScreenSection__Group__3__Impl"


    // $ANTLR start "rule__ScreenSection__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4361:1: rule__ScreenSection__Group__4 : rule__ScreenSection__Group__4__Impl rule__ScreenSection__Group__5 ;
    public final void rule__ScreenSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4365:1: ( rule__ScreenSection__Group__4__Impl rule__ScreenSection__Group__5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4366:2: rule__ScreenSection__Group__4__Impl rule__ScreenSection__Group__5
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group__4__Impl_in_rule__ScreenSection__Group__48815);
            rule__ScreenSection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSection__Group__5_in_rule__ScreenSection__Group__48818);
            rule__ScreenSection__Group__5();

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
    // $ANTLR end "rule__ScreenSection__Group__4"


    // $ANTLR start "rule__ScreenSection__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4373:1: rule__ScreenSection__Group__4__Impl : ( ( rule__ScreenSection__ItemsAssignment_4 ) ) ;
    public final void rule__ScreenSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4377:1: ( ( ( rule__ScreenSection__ItemsAssignment_4 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4378:1: ( ( rule__ScreenSection__ItemsAssignment_4 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4378:1: ( ( rule__ScreenSection__ItemsAssignment_4 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4379:1: ( rule__ScreenSection__ItemsAssignment_4 )
            {
             before(grammarAccess.getScreenSectionAccess().getItemsAssignment_4()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4380:1: ( rule__ScreenSection__ItemsAssignment_4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4380:2: rule__ScreenSection__ItemsAssignment_4
            {
            pushFollow(FOLLOW_rule__ScreenSection__ItemsAssignment_4_in_rule__ScreenSection__Group__4__Impl8845);
            rule__ScreenSection__ItemsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScreenSectionAccess().getItemsAssignment_4()); 

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
    // $ANTLR end "rule__ScreenSection__Group__4__Impl"


    // $ANTLR start "rule__ScreenSection__Group__5"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4390:1: rule__ScreenSection__Group__5 : rule__ScreenSection__Group__5__Impl ;
    public final void rule__ScreenSection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4394:1: ( rule__ScreenSection__Group__5__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4395:2: rule__ScreenSection__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group__5__Impl_in_rule__ScreenSection__Group__58875);
            rule__ScreenSection__Group__5__Impl();

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
    // $ANTLR end "rule__ScreenSection__Group__5"


    // $ANTLR start "rule__ScreenSection__Group__5__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4401:1: rule__ScreenSection__Group__5__Impl : ( '}' ) ;
    public final void rule__ScreenSection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4405:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4406:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4406:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4407:1: '}'
            {
             before(grammarAccess.getScreenSectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__ScreenSection__Group__5__Impl8903); 
             after(grammarAccess.getScreenSectionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ScreenSection__Group__5__Impl"


    // $ANTLR start "rule__ScreenSection__Group_2__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4432:1: rule__ScreenSection__Group_2__0 : rule__ScreenSection__Group_2__0__Impl rule__ScreenSection__Group_2__1 ;
    public final void rule__ScreenSection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4436:1: ( rule__ScreenSection__Group_2__0__Impl rule__ScreenSection__Group_2__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4437:2: rule__ScreenSection__Group_2__0__Impl rule__ScreenSection__Group_2__1
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group_2__0__Impl_in_rule__ScreenSection__Group_2__08946);
            rule__ScreenSection__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSection__Group_2__1_in_rule__ScreenSection__Group_2__08949);
            rule__ScreenSection__Group_2__1();

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
    // $ANTLR end "rule__ScreenSection__Group_2__0"


    // $ANTLR start "rule__ScreenSection__Group_2__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4444:1: rule__ScreenSection__Group_2__0__Impl : ( 'title' ) ;
    public final void rule__ScreenSection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4448:1: ( ( 'title' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4449:1: ( 'title' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4449:1: ( 'title' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4450:1: 'title'
            {
             before(grammarAccess.getScreenSectionAccess().getTitleKeyword_2_0()); 
            match(input,11,FOLLOW_11_in_rule__ScreenSection__Group_2__0__Impl8977); 
             after(grammarAccess.getScreenSectionAccess().getTitleKeyword_2_0()); 

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
    // $ANTLR end "rule__ScreenSection__Group_2__0__Impl"


    // $ANTLR start "rule__ScreenSection__Group_2__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4463:1: rule__ScreenSection__Group_2__1 : rule__ScreenSection__Group_2__1__Impl rule__ScreenSection__Group_2__2 ;
    public final void rule__ScreenSection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4467:1: ( rule__ScreenSection__Group_2__1__Impl rule__ScreenSection__Group_2__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4468:2: rule__ScreenSection__Group_2__1__Impl rule__ScreenSection__Group_2__2
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group_2__1__Impl_in_rule__ScreenSection__Group_2__19008);
            rule__ScreenSection__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSection__Group_2__2_in_rule__ScreenSection__Group_2__19011);
            rule__ScreenSection__Group_2__2();

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
    // $ANTLR end "rule__ScreenSection__Group_2__1"


    // $ANTLR start "rule__ScreenSection__Group_2__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4475:1: rule__ScreenSection__Group_2__1__Impl : ( '=' ) ;
    public final void rule__ScreenSection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4479:1: ( ( '=' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4480:1: ( '=' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4480:1: ( '=' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4481:1: '='
            {
             before(grammarAccess.getScreenSectionAccess().getEqualsSignKeyword_2_1()); 
            match(input,40,FOLLOW_40_in_rule__ScreenSection__Group_2__1__Impl9039); 
             after(grammarAccess.getScreenSectionAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__ScreenSection__Group_2__1__Impl"


    // $ANTLR start "rule__ScreenSection__Group_2__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4494:1: rule__ScreenSection__Group_2__2 : rule__ScreenSection__Group_2__2__Impl ;
    public final void rule__ScreenSection__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4498:1: ( rule__ScreenSection__Group_2__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4499:2: rule__ScreenSection__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group_2__2__Impl_in_rule__ScreenSection__Group_2__29070);
            rule__ScreenSection__Group_2__2__Impl();

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
    // $ANTLR end "rule__ScreenSection__Group_2__2"


    // $ANTLR start "rule__ScreenSection__Group_2__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4505:1: rule__ScreenSection__Group_2__2__Impl : ( ( rule__ScreenSection__TitleAssignment_2_2 ) ) ;
    public final void rule__ScreenSection__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4509:1: ( ( ( rule__ScreenSection__TitleAssignment_2_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4510:1: ( ( rule__ScreenSection__TitleAssignment_2_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4510:1: ( ( rule__ScreenSection__TitleAssignment_2_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4511:1: ( rule__ScreenSection__TitleAssignment_2_2 )
            {
             before(grammarAccess.getScreenSectionAccess().getTitleAssignment_2_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4512:1: ( rule__ScreenSection__TitleAssignment_2_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4512:2: rule__ScreenSection__TitleAssignment_2_2
            {
            pushFollow(FOLLOW_rule__ScreenSection__TitleAssignment_2_2_in_rule__ScreenSection__Group_2__2__Impl9097);
            rule__ScreenSection__TitleAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getScreenSectionAccess().getTitleAssignment_2_2()); 

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
    // $ANTLR end "rule__ScreenSection__Group_2__2__Impl"


    // $ANTLR start "rule__ScreenSection__Group_3__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4528:1: rule__ScreenSection__Group_3__0 : rule__ScreenSection__Group_3__0__Impl rule__ScreenSection__Group_3__1 ;
    public final void rule__ScreenSection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4532:1: ( rule__ScreenSection__Group_3__0__Impl rule__ScreenSection__Group_3__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4533:2: rule__ScreenSection__Group_3__0__Impl rule__ScreenSection__Group_3__1
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group_3__0__Impl_in_rule__ScreenSection__Group_3__09133);
            rule__ScreenSection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSection__Group_3__1_in_rule__ScreenSection__Group_3__09136);
            rule__ScreenSection__Group_3__1();

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
    // $ANTLR end "rule__ScreenSection__Group_3__0"


    // $ANTLR start "rule__ScreenSection__Group_3__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4540:1: rule__ScreenSection__Group_3__0__Impl : ( 'datasource' ) ;
    public final void rule__ScreenSection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4544:1: ( ( 'datasource' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4545:1: ( 'datasource' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4545:1: ( 'datasource' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4546:1: 'datasource'
            {
             before(grammarAccess.getScreenSectionAccess().getDatasourceKeyword_3_0()); 
            match(input,29,FOLLOW_29_in_rule__ScreenSection__Group_3__0__Impl9164); 
             after(grammarAccess.getScreenSectionAccess().getDatasourceKeyword_3_0()); 

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
    // $ANTLR end "rule__ScreenSection__Group_3__0__Impl"


    // $ANTLR start "rule__ScreenSection__Group_3__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4559:1: rule__ScreenSection__Group_3__1 : rule__ScreenSection__Group_3__1__Impl rule__ScreenSection__Group_3__2 ;
    public final void rule__ScreenSection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4563:1: ( rule__ScreenSection__Group_3__1__Impl rule__ScreenSection__Group_3__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4564:2: rule__ScreenSection__Group_3__1__Impl rule__ScreenSection__Group_3__2
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group_3__1__Impl_in_rule__ScreenSection__Group_3__19195);
            rule__ScreenSection__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSection__Group_3__2_in_rule__ScreenSection__Group_3__19198);
            rule__ScreenSection__Group_3__2();

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
    // $ANTLR end "rule__ScreenSection__Group_3__1"


    // $ANTLR start "rule__ScreenSection__Group_3__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4571:1: rule__ScreenSection__Group_3__1__Impl : ( '=' ) ;
    public final void rule__ScreenSection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4575:1: ( ( '=' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4576:1: ( '=' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4576:1: ( '=' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4577:1: '='
            {
             before(grammarAccess.getScreenSectionAccess().getEqualsSignKeyword_3_1()); 
            match(input,40,FOLLOW_40_in_rule__ScreenSection__Group_3__1__Impl9226); 
             after(grammarAccess.getScreenSectionAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__ScreenSection__Group_3__1__Impl"


    // $ANTLR start "rule__ScreenSection__Group_3__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4590:1: rule__ScreenSection__Group_3__2 : rule__ScreenSection__Group_3__2__Impl ;
    public final void rule__ScreenSection__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4594:1: ( rule__ScreenSection__Group_3__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4595:2: rule__ScreenSection__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ScreenSection__Group_3__2__Impl_in_rule__ScreenSection__Group_3__29257);
            rule__ScreenSection__Group_3__2__Impl();

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
    // $ANTLR end "rule__ScreenSection__Group_3__2"


    // $ANTLR start "rule__ScreenSection__Group_3__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4601:1: rule__ScreenSection__Group_3__2__Impl : ( ( rule__ScreenSection__DatasourceAssignment_3_2 ) ) ;
    public final void rule__ScreenSection__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4605:1: ( ( ( rule__ScreenSection__DatasourceAssignment_3_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4606:1: ( ( rule__ScreenSection__DatasourceAssignment_3_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4606:1: ( ( rule__ScreenSection__DatasourceAssignment_3_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4607:1: ( rule__ScreenSection__DatasourceAssignment_3_2 )
            {
             before(grammarAccess.getScreenSectionAccess().getDatasourceAssignment_3_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4608:1: ( rule__ScreenSection__DatasourceAssignment_3_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4608:2: rule__ScreenSection__DatasourceAssignment_3_2
            {
            pushFollow(FOLLOW_rule__ScreenSection__DatasourceAssignment_3_2_in_rule__ScreenSection__Group_3__2__Impl9284);
            rule__ScreenSection__DatasourceAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getScreenSectionAccess().getDatasourceAssignment_3_2()); 

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
    // $ANTLR end "rule__ScreenSection__Group_3__2__Impl"


    // $ANTLR start "rule__ScreenSectionItems__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4624:1: rule__ScreenSectionItems__Group__0 : rule__ScreenSectionItems__Group__0__Impl rule__ScreenSectionItems__Group__1 ;
    public final void rule__ScreenSectionItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4628:1: ( rule__ScreenSectionItems__Group__0__Impl rule__ScreenSectionItems__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4629:2: rule__ScreenSectionItems__Group__0__Impl rule__ScreenSectionItems__Group__1
            {
            pushFollow(FOLLOW_rule__ScreenSectionItems__Group__0__Impl_in_rule__ScreenSectionItems__Group__09320);
            rule__ScreenSectionItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSectionItems__Group__1_in_rule__ScreenSectionItems__Group__09323);
            rule__ScreenSectionItems__Group__1();

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
    // $ANTLR end "rule__ScreenSectionItems__Group__0"


    // $ANTLR start "rule__ScreenSectionItems__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4636:1: rule__ScreenSectionItems__Group__0__Impl : ( () ) ;
    public final void rule__ScreenSectionItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4640:1: ( ( () ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4641:1: ( () )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4641:1: ( () )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4642:1: ()
            {
             before(grammarAccess.getScreenSectionItemsAccess().getScreenSectionItemsAction_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4643:1: ()
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4645:1: 
            {
            }

             after(grammarAccess.getScreenSectionItemsAccess().getScreenSectionItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScreenSectionItems__Group__0__Impl"


    // $ANTLR start "rule__ScreenSectionItems__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4655:1: rule__ScreenSectionItems__Group__1 : rule__ScreenSectionItems__Group__1__Impl rule__ScreenSectionItems__Group__2 ;
    public final void rule__ScreenSectionItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4659:1: ( rule__ScreenSectionItems__Group__1__Impl rule__ScreenSectionItems__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4660:2: rule__ScreenSectionItems__Group__1__Impl rule__ScreenSectionItems__Group__2
            {
            pushFollow(FOLLOW_rule__ScreenSectionItems__Group__1__Impl_in_rule__ScreenSectionItems__Group__19381);
            rule__ScreenSectionItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSectionItems__Group__2_in_rule__ScreenSectionItems__Group__19384);
            rule__ScreenSectionItems__Group__2();

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
    // $ANTLR end "rule__ScreenSectionItems__Group__1"


    // $ANTLR start "rule__ScreenSectionItems__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4667:1: rule__ScreenSectionItems__Group__1__Impl : ( 'items' ) ;
    public final void rule__ScreenSectionItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4671:1: ( ( 'items' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4672:1: ( 'items' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4672:1: ( 'items' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4673:1: 'items'
            {
             before(grammarAccess.getScreenSectionItemsAccess().getItemsKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__ScreenSectionItems__Group__1__Impl9412); 
             after(grammarAccess.getScreenSectionItemsAccess().getItemsKeyword_1()); 

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
    // $ANTLR end "rule__ScreenSectionItems__Group__1__Impl"


    // $ANTLR start "rule__ScreenSectionItems__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4686:1: rule__ScreenSectionItems__Group__2 : rule__ScreenSectionItems__Group__2__Impl rule__ScreenSectionItems__Group__3 ;
    public final void rule__ScreenSectionItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4690:1: ( rule__ScreenSectionItems__Group__2__Impl rule__ScreenSectionItems__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4691:2: rule__ScreenSectionItems__Group__2__Impl rule__ScreenSectionItems__Group__3
            {
            pushFollow(FOLLOW_rule__ScreenSectionItems__Group__2__Impl_in_rule__ScreenSectionItems__Group__29443);
            rule__ScreenSectionItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSectionItems__Group__3_in_rule__ScreenSectionItems__Group__29446);
            rule__ScreenSectionItems__Group__3();

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
    // $ANTLR end "rule__ScreenSectionItems__Group__2"


    // $ANTLR start "rule__ScreenSectionItems__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4698:1: rule__ScreenSectionItems__Group__2__Impl : ( '{' ) ;
    public final void rule__ScreenSectionItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4702:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4703:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4703:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4704:1: '{'
            {
             before(grammarAccess.getScreenSectionItemsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__ScreenSectionItems__Group__2__Impl9474); 
             after(grammarAccess.getScreenSectionItemsAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ScreenSectionItems__Group__2__Impl"


    // $ANTLR start "rule__ScreenSectionItems__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4717:1: rule__ScreenSectionItems__Group__3 : rule__ScreenSectionItems__Group__3__Impl rule__ScreenSectionItems__Group__4 ;
    public final void rule__ScreenSectionItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4721:1: ( rule__ScreenSectionItems__Group__3__Impl rule__ScreenSectionItems__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4722:2: rule__ScreenSectionItems__Group__3__Impl rule__ScreenSectionItems__Group__4
            {
            pushFollow(FOLLOW_rule__ScreenSectionItems__Group__3__Impl_in_rule__ScreenSectionItems__Group__39505);
            rule__ScreenSectionItems__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenSectionItems__Group__4_in_rule__ScreenSectionItems__Group__39508);
            rule__ScreenSectionItems__Group__4();

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
    // $ANTLR end "rule__ScreenSectionItems__Group__3"


    // $ANTLR start "rule__ScreenSectionItems__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4729:1: rule__ScreenSectionItems__Group__3__Impl : ( ( rule__ScreenSectionItems__ItemsAssignment_3 )* ) ;
    public final void rule__ScreenSectionItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4733:1: ( ( ( rule__ScreenSectionItems__ItemsAssignment_3 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4734:1: ( ( rule__ScreenSectionItems__ItemsAssignment_3 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4734:1: ( ( rule__ScreenSectionItems__ItemsAssignment_3 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4735:1: ( rule__ScreenSectionItems__ItemsAssignment_3 )*
            {
             before(grammarAccess.getScreenSectionItemsAccess().getItemsAssignment_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4736:1: ( rule__ScreenSectionItems__ItemsAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4736:2: rule__ScreenSectionItems__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ScreenSectionItems__ItemsAssignment_3_in_rule__ScreenSectionItems__Group__3__Impl9535);
            	    rule__ScreenSectionItems__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getScreenSectionItemsAccess().getItemsAssignment_3()); 

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
    // $ANTLR end "rule__ScreenSectionItems__Group__3__Impl"


    // $ANTLR start "rule__ScreenSectionItems__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4746:1: rule__ScreenSectionItems__Group__4 : rule__ScreenSectionItems__Group__4__Impl ;
    public final void rule__ScreenSectionItems__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4750:1: ( rule__ScreenSectionItems__Group__4__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4751:2: rule__ScreenSectionItems__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ScreenSectionItems__Group__4__Impl_in_rule__ScreenSectionItems__Group__49566);
            rule__ScreenSectionItems__Group__4__Impl();

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
    // $ANTLR end "rule__ScreenSectionItems__Group__4"


    // $ANTLR start "rule__ScreenSectionItems__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4757:1: rule__ScreenSectionItems__Group__4__Impl : ( '}' ) ;
    public final void rule__ScreenSectionItems__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4761:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4762:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4762:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4763:1: '}'
            {
             before(grammarAccess.getScreenSectionItemsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__ScreenSectionItems__Group__4__Impl9594); 
             after(grammarAccess.getScreenSectionItemsAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ScreenSectionItems__Group__4__Impl"


    // $ANTLR start "rule__ScreenListItemCell__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4786:1: rule__ScreenListItemCell__Group__0 : rule__ScreenListItemCell__Group__0__Impl rule__ScreenListItemCell__Group__1 ;
    public final void rule__ScreenListItemCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4790:1: ( rule__ScreenListItemCell__Group__0__Impl rule__ScreenListItemCell__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4791:2: rule__ScreenListItemCell__Group__0__Impl rule__ScreenListItemCell__Group__1
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__0__Impl_in_rule__ScreenListItemCell__Group__09635);
            rule__ScreenListItemCell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__1_in_rule__ScreenListItemCell__Group__09638);
            rule__ScreenListItemCell__Group__1();

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
    // $ANTLR end "rule__ScreenListItemCell__Group__0"


    // $ANTLR start "rule__ScreenListItemCell__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4798:1: rule__ScreenListItemCell__Group__0__Impl : ( 'cell' ) ;
    public final void rule__ScreenListItemCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4802:1: ( ( 'cell' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4803:1: ( 'cell' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4803:1: ( 'cell' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4804:1: 'cell'
            {
             before(grammarAccess.getScreenListItemCellAccess().getCellKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__ScreenListItemCell__Group__0__Impl9666); 
             after(grammarAccess.getScreenListItemCellAccess().getCellKeyword_0()); 

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
    // $ANTLR end "rule__ScreenListItemCell__Group__0__Impl"


    // $ANTLR start "rule__ScreenListItemCell__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4817:1: rule__ScreenListItemCell__Group__1 : rule__ScreenListItemCell__Group__1__Impl rule__ScreenListItemCell__Group__2 ;
    public final void rule__ScreenListItemCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4821:1: ( rule__ScreenListItemCell__Group__1__Impl rule__ScreenListItemCell__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4822:2: rule__ScreenListItemCell__Group__1__Impl rule__ScreenListItemCell__Group__2
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__1__Impl_in_rule__ScreenListItemCell__Group__19697);
            rule__ScreenListItemCell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__2_in_rule__ScreenListItemCell__Group__19700);
            rule__ScreenListItemCell__Group__2();

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
    // $ANTLR end "rule__ScreenListItemCell__Group__1"


    // $ANTLR start "rule__ScreenListItemCell__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4829:1: rule__ScreenListItemCell__Group__1__Impl : ( ( rule__ScreenListItemCell__TypeAssignment_1 ) ) ;
    public final void rule__ScreenListItemCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4833:1: ( ( ( rule__ScreenListItemCell__TypeAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4834:1: ( ( rule__ScreenListItemCell__TypeAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4834:1: ( ( rule__ScreenListItemCell__TypeAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4835:1: ( rule__ScreenListItemCell__TypeAssignment_1 )
            {
             before(grammarAccess.getScreenListItemCellAccess().getTypeAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4836:1: ( rule__ScreenListItemCell__TypeAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4836:2: rule__ScreenListItemCell__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__TypeAssignment_1_in_rule__ScreenListItemCell__Group__1__Impl9727);
            rule__ScreenListItemCell__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScreenListItemCellAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__ScreenListItemCell__Group__1__Impl"


    // $ANTLR start "rule__ScreenListItemCell__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4846:1: rule__ScreenListItemCell__Group__2 : rule__ScreenListItemCell__Group__2__Impl rule__ScreenListItemCell__Group__3 ;
    public final void rule__ScreenListItemCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4850:1: ( rule__ScreenListItemCell__Group__2__Impl rule__ScreenListItemCell__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4851:2: rule__ScreenListItemCell__Group__2__Impl rule__ScreenListItemCell__Group__3
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__2__Impl_in_rule__ScreenListItemCell__Group__29757);
            rule__ScreenListItemCell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__3_in_rule__ScreenListItemCell__Group__29760);
            rule__ScreenListItemCell__Group__3();

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
    // $ANTLR end "rule__ScreenListItemCell__Group__2"


    // $ANTLR start "rule__ScreenListItemCell__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4858:1: rule__ScreenListItemCell__Group__2__Impl : ( 'foreach' ) ;
    public final void rule__ScreenListItemCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4862:1: ( ( 'foreach' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4863:1: ( 'foreach' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4863:1: ( 'foreach' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4864:1: 'foreach'
            {
             before(grammarAccess.getScreenListItemCellAccess().getForeachKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__ScreenListItemCell__Group__2__Impl9788); 
             after(grammarAccess.getScreenListItemCellAccess().getForeachKeyword_2()); 

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
    // $ANTLR end "rule__ScreenListItemCell__Group__2__Impl"


    // $ANTLR start "rule__ScreenListItemCell__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4877:1: rule__ScreenListItemCell__Group__3 : rule__ScreenListItemCell__Group__3__Impl rule__ScreenListItemCell__Group__4 ;
    public final void rule__ScreenListItemCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4881:1: ( rule__ScreenListItemCell__Group__3__Impl rule__ScreenListItemCell__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4882:2: rule__ScreenListItemCell__Group__3__Impl rule__ScreenListItemCell__Group__4
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__3__Impl_in_rule__ScreenListItemCell__Group__39819);
            rule__ScreenListItemCell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__4_in_rule__ScreenListItemCell__Group__39822);
            rule__ScreenListItemCell__Group__4();

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
    // $ANTLR end "rule__ScreenListItemCell__Group__3"


    // $ANTLR start "rule__ScreenListItemCell__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4889:1: rule__ScreenListItemCell__Group__3__Impl : ( ( rule__ScreenListItemCell__RestMethodAssignment_3 ) ) ;
    public final void rule__ScreenListItemCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4893:1: ( ( ( rule__ScreenListItemCell__RestMethodAssignment_3 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4894:1: ( ( rule__ScreenListItemCell__RestMethodAssignment_3 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4894:1: ( ( rule__ScreenListItemCell__RestMethodAssignment_3 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4895:1: ( rule__ScreenListItemCell__RestMethodAssignment_3 )
            {
             before(grammarAccess.getScreenListItemCellAccess().getRestMethodAssignment_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4896:1: ( rule__ScreenListItemCell__RestMethodAssignment_3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4896:2: rule__ScreenListItemCell__RestMethodAssignment_3
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__RestMethodAssignment_3_in_rule__ScreenListItemCell__Group__3__Impl9849);
            rule__ScreenListItemCell__RestMethodAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScreenListItemCellAccess().getRestMethodAssignment_3()); 

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
    // $ANTLR end "rule__ScreenListItemCell__Group__3__Impl"


    // $ANTLR start "rule__ScreenListItemCell__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4906:1: rule__ScreenListItemCell__Group__4 : rule__ScreenListItemCell__Group__4__Impl rule__ScreenListItemCell__Group__5 ;
    public final void rule__ScreenListItemCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4910:1: ( rule__ScreenListItemCell__Group__4__Impl rule__ScreenListItemCell__Group__5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4911:2: rule__ScreenListItemCell__Group__4__Impl rule__ScreenListItemCell__Group__5
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__4__Impl_in_rule__ScreenListItemCell__Group__49879);
            rule__ScreenListItemCell__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__5_in_rule__ScreenListItemCell__Group__49882);
            rule__ScreenListItemCell__Group__5();

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
    // $ANTLR end "rule__ScreenListItemCell__Group__4"


    // $ANTLR start "rule__ScreenListItemCell__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4918:1: rule__ScreenListItemCell__Group__4__Impl : ( 'as' ) ;
    public final void rule__ScreenListItemCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4922:1: ( ( 'as' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4923:1: ( 'as' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4923:1: ( 'as' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4924:1: 'as'
            {
             before(grammarAccess.getScreenListItemCellAccess().getAsKeyword_4()); 
            match(input,44,FOLLOW_44_in_rule__ScreenListItemCell__Group__4__Impl9910); 
             after(grammarAccess.getScreenListItemCellAccess().getAsKeyword_4()); 

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
    // $ANTLR end "rule__ScreenListItemCell__Group__4__Impl"


    // $ANTLR start "rule__ScreenListItemCell__Group__5"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4937:1: rule__ScreenListItemCell__Group__5 : rule__ScreenListItemCell__Group__5__Impl rule__ScreenListItemCell__Group__6 ;
    public final void rule__ScreenListItemCell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4941:1: ( rule__ScreenListItemCell__Group__5__Impl rule__ScreenListItemCell__Group__6 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4942:2: rule__ScreenListItemCell__Group__5__Impl rule__ScreenListItemCell__Group__6
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__5__Impl_in_rule__ScreenListItemCell__Group__59941);
            rule__ScreenListItemCell__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__6_in_rule__ScreenListItemCell__Group__59944);
            rule__ScreenListItemCell__Group__6();

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
    // $ANTLR end "rule__ScreenListItemCell__Group__5"


    // $ANTLR start "rule__ScreenListItemCell__Group__5__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4949:1: rule__ScreenListItemCell__Group__5__Impl : ( ( rule__ScreenListItemCell__VariableAssignment_5 ) ) ;
    public final void rule__ScreenListItemCell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4953:1: ( ( ( rule__ScreenListItemCell__VariableAssignment_5 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4954:1: ( ( rule__ScreenListItemCell__VariableAssignment_5 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4954:1: ( ( rule__ScreenListItemCell__VariableAssignment_5 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4955:1: ( rule__ScreenListItemCell__VariableAssignment_5 )
            {
             before(grammarAccess.getScreenListItemCellAccess().getVariableAssignment_5()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4956:1: ( rule__ScreenListItemCell__VariableAssignment_5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4956:2: rule__ScreenListItemCell__VariableAssignment_5
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__VariableAssignment_5_in_rule__ScreenListItemCell__Group__5__Impl9971);
            rule__ScreenListItemCell__VariableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScreenListItemCellAccess().getVariableAssignment_5()); 

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
    // $ANTLR end "rule__ScreenListItemCell__Group__5__Impl"


    // $ANTLR start "rule__ScreenListItemCell__Group__6"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4966:1: rule__ScreenListItemCell__Group__6 : rule__ScreenListItemCell__Group__6__Impl rule__ScreenListItemCell__Group__7 ;
    public final void rule__ScreenListItemCell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4970:1: ( rule__ScreenListItemCell__Group__6__Impl rule__ScreenListItemCell__Group__7 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4971:2: rule__ScreenListItemCell__Group__6__Impl rule__ScreenListItemCell__Group__7
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__6__Impl_in_rule__ScreenListItemCell__Group__610001);
            rule__ScreenListItemCell__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__7_in_rule__ScreenListItemCell__Group__610004);
            rule__ScreenListItemCell__Group__7();

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
    // $ANTLR end "rule__ScreenListItemCell__Group__6"


    // $ANTLR start "rule__ScreenListItemCell__Group__6__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4978:1: rule__ScreenListItemCell__Group__6__Impl : ( '{' ) ;
    public final void rule__ScreenListItemCell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4982:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4983:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4983:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4984:1: '{'
            {
             before(grammarAccess.getScreenListItemCellAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__ScreenListItemCell__Group__6__Impl10032); 
             after(grammarAccess.getScreenListItemCellAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ScreenListItemCell__Group__6__Impl"


    // $ANTLR start "rule__ScreenListItemCell__Group__7"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4997:1: rule__ScreenListItemCell__Group__7 : rule__ScreenListItemCell__Group__7__Impl rule__ScreenListItemCell__Group__8 ;
    public final void rule__ScreenListItemCell__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5001:1: ( rule__ScreenListItemCell__Group__7__Impl rule__ScreenListItemCell__Group__8 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5002:2: rule__ScreenListItemCell__Group__7__Impl rule__ScreenListItemCell__Group__8
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__7__Impl_in_rule__ScreenListItemCell__Group__710063);
            rule__ScreenListItemCell__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__8_in_rule__ScreenListItemCell__Group__710066);
            rule__ScreenListItemCell__Group__8();

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
    // $ANTLR end "rule__ScreenListItemCell__Group__7"


    // $ANTLR start "rule__ScreenListItemCell__Group__7__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5009:1: rule__ScreenListItemCell__Group__7__Impl : ( ( rule__ScreenListItemCell__ConfigurationsAssignment_7 )* ) ;
    public final void rule__ScreenListItemCell__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5013:1: ( ( ( rule__ScreenListItemCell__ConfigurationsAssignment_7 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5014:1: ( ( rule__ScreenListItemCell__ConfigurationsAssignment_7 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5014:1: ( ( rule__ScreenListItemCell__ConfigurationsAssignment_7 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5015:1: ( rule__ScreenListItemCell__ConfigurationsAssignment_7 )*
            {
             before(grammarAccess.getScreenListItemCellAccess().getConfigurationsAssignment_7()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5016:1: ( rule__ScreenListItemCell__ConfigurationsAssignment_7 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5016:2: rule__ScreenListItemCell__ConfigurationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__ScreenListItemCell__ConfigurationsAssignment_7_in_rule__ScreenListItemCell__Group__7__Impl10093);
            	    rule__ScreenListItemCell__ConfigurationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getScreenListItemCellAccess().getConfigurationsAssignment_7()); 

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
    // $ANTLR end "rule__ScreenListItemCell__Group__7__Impl"


    // $ANTLR start "rule__ScreenListItemCell__Group__8"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5026:1: rule__ScreenListItemCell__Group__8 : rule__ScreenListItemCell__Group__8__Impl ;
    public final void rule__ScreenListItemCell__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5030:1: ( rule__ScreenListItemCell__Group__8__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5031:2: rule__ScreenListItemCell__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ScreenListItemCell__Group__8__Impl_in_rule__ScreenListItemCell__Group__810124);
            rule__ScreenListItemCell__Group__8__Impl();

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
    // $ANTLR end "rule__ScreenListItemCell__Group__8"


    // $ANTLR start "rule__ScreenListItemCell__Group__8__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5037:1: rule__ScreenListItemCell__Group__8__Impl : ( '}' ) ;
    public final void rule__ScreenListItemCell__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5041:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5042:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5042:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5043:1: '}'
            {
             before(grammarAccess.getScreenListItemCellAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_25_in_rule__ScreenListItemCell__Group__8__Impl10152); 
             after(grammarAccess.getScreenListItemCellAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ScreenListItemCell__Group__8__Impl"


    // $ANTLR start "rule__ListItemCellDeclaration__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5074:1: rule__ListItemCellDeclaration__Group__0 : rule__ListItemCellDeclaration__Group__0__Impl rule__ListItemCellDeclaration__Group__1 ;
    public final void rule__ListItemCellDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5078:1: ( rule__ListItemCellDeclaration__Group__0__Impl rule__ListItemCellDeclaration__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5079:2: rule__ListItemCellDeclaration__Group__0__Impl rule__ListItemCellDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ListItemCellDeclaration__Group__0__Impl_in_rule__ListItemCellDeclaration__Group__010201);
            rule__ListItemCellDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItemCellDeclaration__Group__1_in_rule__ListItemCellDeclaration__Group__010204);
            rule__ListItemCellDeclaration__Group__1();

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
    // $ANTLR end "rule__ListItemCellDeclaration__Group__0"


    // $ANTLR start "rule__ListItemCellDeclaration__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5086:1: rule__ListItemCellDeclaration__Group__0__Impl : ( 'listitemcell' ) ;
    public final void rule__ListItemCellDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5090:1: ( ( 'listitemcell' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5091:1: ( 'listitemcell' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5091:1: ( 'listitemcell' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5092:1: 'listitemcell'
            {
             before(grammarAccess.getListItemCellDeclarationAccess().getListitemcellKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__ListItemCellDeclaration__Group__0__Impl10232); 
             after(grammarAccess.getListItemCellDeclarationAccess().getListitemcellKeyword_0()); 

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
    // $ANTLR end "rule__ListItemCellDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ListItemCellDeclaration__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5105:1: rule__ListItemCellDeclaration__Group__1 : rule__ListItemCellDeclaration__Group__1__Impl rule__ListItemCellDeclaration__Group__2 ;
    public final void rule__ListItemCellDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5109:1: ( rule__ListItemCellDeclaration__Group__1__Impl rule__ListItemCellDeclaration__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5110:2: rule__ListItemCellDeclaration__Group__1__Impl rule__ListItemCellDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ListItemCellDeclaration__Group__1__Impl_in_rule__ListItemCellDeclaration__Group__110263);
            rule__ListItemCellDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItemCellDeclaration__Group__2_in_rule__ListItemCellDeclaration__Group__110266);
            rule__ListItemCellDeclaration__Group__2();

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
    // $ANTLR end "rule__ListItemCellDeclaration__Group__1"


    // $ANTLR start "rule__ListItemCellDeclaration__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5117:1: rule__ListItemCellDeclaration__Group__1__Impl : ( ( rule__ListItemCellDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ListItemCellDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5121:1: ( ( ( rule__ListItemCellDeclaration__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5122:1: ( ( rule__ListItemCellDeclaration__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5122:1: ( ( rule__ListItemCellDeclaration__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5123:1: ( rule__ListItemCellDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getListItemCellDeclarationAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5124:1: ( rule__ListItemCellDeclaration__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5124:2: rule__ListItemCellDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ListItemCellDeclaration__NameAssignment_1_in_rule__ListItemCellDeclaration__Group__1__Impl10293);
            rule__ListItemCellDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemCellDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ListItemCellDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ListItemCellDeclaration__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5134:1: rule__ListItemCellDeclaration__Group__2 : rule__ListItemCellDeclaration__Group__2__Impl rule__ListItemCellDeclaration__Group__3 ;
    public final void rule__ListItemCellDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5138:1: ( rule__ListItemCellDeclaration__Group__2__Impl rule__ListItemCellDeclaration__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5139:2: rule__ListItemCellDeclaration__Group__2__Impl rule__ListItemCellDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ListItemCellDeclaration__Group__2__Impl_in_rule__ListItemCellDeclaration__Group__210323);
            rule__ListItemCellDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItemCellDeclaration__Group__3_in_rule__ListItemCellDeclaration__Group__210326);
            rule__ListItemCellDeclaration__Group__3();

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
    // $ANTLR end "rule__ListItemCellDeclaration__Group__2"


    // $ANTLR start "rule__ListItemCellDeclaration__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5146:1: rule__ListItemCellDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__ListItemCellDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5150:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5151:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5151:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5152:1: '{'
            {
             before(grammarAccess.getListItemCellDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__ListItemCellDeclaration__Group__2__Impl10354); 
             after(grammarAccess.getListItemCellDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ListItemCellDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ListItemCellDeclaration__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5165:1: rule__ListItemCellDeclaration__Group__3 : rule__ListItemCellDeclaration__Group__3__Impl rule__ListItemCellDeclaration__Group__4 ;
    public final void rule__ListItemCellDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5169:1: ( rule__ListItemCellDeclaration__Group__3__Impl rule__ListItemCellDeclaration__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5170:2: rule__ListItemCellDeclaration__Group__3__Impl rule__ListItemCellDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ListItemCellDeclaration__Group__3__Impl_in_rule__ListItemCellDeclaration__Group__310385);
            rule__ListItemCellDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListItemCellDeclaration__Group__4_in_rule__ListItemCellDeclaration__Group__310388);
            rule__ListItemCellDeclaration__Group__4();

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
    // $ANTLR end "rule__ListItemCellDeclaration__Group__3"


    // $ANTLR start "rule__ListItemCellDeclaration__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5177:1: rule__ListItemCellDeclaration__Group__3__Impl : ( ( rule__ListItemCellDeclaration__MembersAssignment_3 )* ) ;
    public final void rule__ListItemCellDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5181:1: ( ( ( rule__ListItemCellDeclaration__MembersAssignment_3 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5182:1: ( ( rule__ListItemCellDeclaration__MembersAssignment_3 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5182:1: ( ( rule__ListItemCellDeclaration__MembersAssignment_3 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5183:1: ( rule__ListItemCellDeclaration__MembersAssignment_3 )*
            {
             before(grammarAccess.getListItemCellDeclarationAccess().getMembersAssignment_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5184:1: ( rule__ListItemCellDeclaration__MembersAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5184:2: rule__ListItemCellDeclaration__MembersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ListItemCellDeclaration__MembersAssignment_3_in_rule__ListItemCellDeclaration__Group__3__Impl10415);
            	    rule__ListItemCellDeclaration__MembersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getListItemCellDeclarationAccess().getMembersAssignment_3()); 

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
    // $ANTLR end "rule__ListItemCellDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ListItemCellDeclaration__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5194:1: rule__ListItemCellDeclaration__Group__4 : rule__ListItemCellDeclaration__Group__4__Impl ;
    public final void rule__ListItemCellDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5198:1: ( rule__ListItemCellDeclaration__Group__4__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5199:2: rule__ListItemCellDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ListItemCellDeclaration__Group__4__Impl_in_rule__ListItemCellDeclaration__Group__410446);
            rule__ListItemCellDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__ListItemCellDeclaration__Group__4"


    // $ANTLR start "rule__ListItemCellDeclaration__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5205:1: rule__ListItemCellDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__ListItemCellDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5209:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5210:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5210:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5211:1: '}'
            {
             before(grammarAccess.getListItemCellDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__ListItemCellDeclaration__Group__4__Impl10474); 
             after(grammarAccess.getListItemCellDeclarationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ListItemCellDeclaration__Group__4__Impl"


    // $ANTLR start "rule__UIComponentDeclaration__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5234:1: rule__UIComponentDeclaration__Group__0 : rule__UIComponentDeclaration__Group__0__Impl rule__UIComponentDeclaration__Group__1 ;
    public final void rule__UIComponentDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5238:1: ( rule__UIComponentDeclaration__Group__0__Impl rule__UIComponentDeclaration__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5239:2: rule__UIComponentDeclaration__Group__0__Impl rule__UIComponentDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__UIComponentDeclaration__Group__0__Impl_in_rule__UIComponentDeclaration__Group__010515);
            rule__UIComponentDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIComponentDeclaration__Group__1_in_rule__UIComponentDeclaration__Group__010518);
            rule__UIComponentDeclaration__Group__1();

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
    // $ANTLR end "rule__UIComponentDeclaration__Group__0"


    // $ANTLR start "rule__UIComponentDeclaration__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5246:1: rule__UIComponentDeclaration__Group__0__Impl : ( 'uicomponent' ) ;
    public final void rule__UIComponentDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5250:1: ( ( 'uicomponent' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5251:1: ( 'uicomponent' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5251:1: ( 'uicomponent' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5252:1: 'uicomponent'
            {
             before(grammarAccess.getUIComponentDeclarationAccess().getUicomponentKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__UIComponentDeclaration__Group__0__Impl10546); 
             after(grammarAccess.getUIComponentDeclarationAccess().getUicomponentKeyword_0()); 

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
    // $ANTLR end "rule__UIComponentDeclaration__Group__0__Impl"


    // $ANTLR start "rule__UIComponentDeclaration__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5265:1: rule__UIComponentDeclaration__Group__1 : rule__UIComponentDeclaration__Group__1__Impl rule__UIComponentDeclaration__Group__2 ;
    public final void rule__UIComponentDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5269:1: ( rule__UIComponentDeclaration__Group__1__Impl rule__UIComponentDeclaration__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5270:2: rule__UIComponentDeclaration__Group__1__Impl rule__UIComponentDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__UIComponentDeclaration__Group__1__Impl_in_rule__UIComponentDeclaration__Group__110577);
            rule__UIComponentDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIComponentDeclaration__Group__2_in_rule__UIComponentDeclaration__Group__110580);
            rule__UIComponentDeclaration__Group__2();

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
    // $ANTLR end "rule__UIComponentDeclaration__Group__1"


    // $ANTLR start "rule__UIComponentDeclaration__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5277:1: rule__UIComponentDeclaration__Group__1__Impl : ( ( rule__UIComponentDeclaration__NameAssignment_1 ) ) ;
    public final void rule__UIComponentDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5281:1: ( ( ( rule__UIComponentDeclaration__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5282:1: ( ( rule__UIComponentDeclaration__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5282:1: ( ( rule__UIComponentDeclaration__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5283:1: ( rule__UIComponentDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getUIComponentDeclarationAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5284:1: ( rule__UIComponentDeclaration__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5284:2: rule__UIComponentDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UIComponentDeclaration__NameAssignment_1_in_rule__UIComponentDeclaration__Group__1__Impl10607);
            rule__UIComponentDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__UIComponentDeclaration__Group__1__Impl"


    // $ANTLR start "rule__UIComponentDeclaration__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5294:1: rule__UIComponentDeclaration__Group__2 : rule__UIComponentDeclaration__Group__2__Impl rule__UIComponentDeclaration__Group__3 ;
    public final void rule__UIComponentDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5298:1: ( rule__UIComponentDeclaration__Group__2__Impl rule__UIComponentDeclaration__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5299:2: rule__UIComponentDeclaration__Group__2__Impl rule__UIComponentDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__UIComponentDeclaration__Group__2__Impl_in_rule__UIComponentDeclaration__Group__210637);
            rule__UIComponentDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIComponentDeclaration__Group__3_in_rule__UIComponentDeclaration__Group__210640);
            rule__UIComponentDeclaration__Group__3();

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
    // $ANTLR end "rule__UIComponentDeclaration__Group__2"


    // $ANTLR start "rule__UIComponentDeclaration__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5306:1: rule__UIComponentDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__UIComponentDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5310:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5311:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5311:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5312:1: '{'
            {
             before(grammarAccess.getUIComponentDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__UIComponentDeclaration__Group__2__Impl10668); 
             after(grammarAccess.getUIComponentDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__UIComponentDeclaration__Group__2__Impl"


    // $ANTLR start "rule__UIComponentDeclaration__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5325:1: rule__UIComponentDeclaration__Group__3 : rule__UIComponentDeclaration__Group__3__Impl rule__UIComponentDeclaration__Group__4 ;
    public final void rule__UIComponentDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5329:1: ( rule__UIComponentDeclaration__Group__3__Impl rule__UIComponentDeclaration__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5330:2: rule__UIComponentDeclaration__Group__3__Impl rule__UIComponentDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__UIComponentDeclaration__Group__3__Impl_in_rule__UIComponentDeclaration__Group__310699);
            rule__UIComponentDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIComponentDeclaration__Group__4_in_rule__UIComponentDeclaration__Group__310702);
            rule__UIComponentDeclaration__Group__4();

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
    // $ANTLR end "rule__UIComponentDeclaration__Group__3"


    // $ANTLR start "rule__UIComponentDeclaration__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5337:1: rule__UIComponentDeclaration__Group__3__Impl : ( ( rule__UIComponentDeclaration__MembersAssignment_3 )* ) ;
    public final void rule__UIComponentDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5341:1: ( ( ( rule__UIComponentDeclaration__MembersAssignment_3 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5342:1: ( ( rule__UIComponentDeclaration__MembersAssignment_3 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5342:1: ( ( rule__UIComponentDeclaration__MembersAssignment_3 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5343:1: ( rule__UIComponentDeclaration__MembersAssignment_3 )*
            {
             before(grammarAccess.getUIComponentDeclarationAccess().getMembersAssignment_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5344:1: ( rule__UIComponentDeclaration__MembersAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5344:2: rule__UIComponentDeclaration__MembersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__UIComponentDeclaration__MembersAssignment_3_in_rule__UIComponentDeclaration__Group__3__Impl10729);
            	    rule__UIComponentDeclaration__MembersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getUIComponentDeclarationAccess().getMembersAssignment_3()); 

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
    // $ANTLR end "rule__UIComponentDeclaration__Group__3__Impl"


    // $ANTLR start "rule__UIComponentDeclaration__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5354:1: rule__UIComponentDeclaration__Group__4 : rule__UIComponentDeclaration__Group__4__Impl ;
    public final void rule__UIComponentDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5358:1: ( rule__UIComponentDeclaration__Group__4__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5359:2: rule__UIComponentDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UIComponentDeclaration__Group__4__Impl_in_rule__UIComponentDeclaration__Group__410760);
            rule__UIComponentDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__UIComponentDeclaration__Group__4"


    // $ANTLR start "rule__UIComponentDeclaration__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5365:1: rule__UIComponentDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__UIComponentDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5369:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5370:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5370:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5371:1: '}'
            {
             before(grammarAccess.getUIComponentDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__UIComponentDeclaration__Group__4__Impl10788); 
             after(grammarAccess.getUIComponentDeclarationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__UIComponentDeclaration__Group__4__Impl"


    // $ANTLR start "rule__UIComponentMemberDeclaration__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5394:1: rule__UIComponentMemberDeclaration__Group__0 : rule__UIComponentMemberDeclaration__Group__0__Impl rule__UIComponentMemberDeclaration__Group__1 ;
    public final void rule__UIComponentMemberDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5398:1: ( rule__UIComponentMemberDeclaration__Group__0__Impl rule__UIComponentMemberDeclaration__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5399:2: rule__UIComponentMemberDeclaration__Group__0__Impl rule__UIComponentMemberDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__UIComponentMemberDeclaration__Group__0__Impl_in_rule__UIComponentMemberDeclaration__Group__010829);
            rule__UIComponentMemberDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIComponentMemberDeclaration__Group__1_in_rule__UIComponentMemberDeclaration__Group__010832);
            rule__UIComponentMemberDeclaration__Group__1();

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
    // $ANTLR end "rule__UIComponentMemberDeclaration__Group__0"


    // $ANTLR start "rule__UIComponentMemberDeclaration__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5406:1: rule__UIComponentMemberDeclaration__Group__0__Impl : ( ( rule__UIComponentMemberDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__UIComponentMemberDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5410:1: ( ( ( rule__UIComponentMemberDeclaration__TypeAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5411:1: ( ( rule__UIComponentMemberDeclaration__TypeAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5411:1: ( ( rule__UIComponentMemberDeclaration__TypeAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5412:1: ( rule__UIComponentMemberDeclaration__TypeAssignment_0 )
            {
             before(grammarAccess.getUIComponentMemberDeclarationAccess().getTypeAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5413:1: ( rule__UIComponentMemberDeclaration__TypeAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5413:2: rule__UIComponentMemberDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__UIComponentMemberDeclaration__TypeAssignment_0_in_rule__UIComponentMemberDeclaration__Group__0__Impl10859);
            rule__UIComponentMemberDeclaration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentMemberDeclarationAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__UIComponentMemberDeclaration__Group__0__Impl"


    // $ANTLR start "rule__UIComponentMemberDeclaration__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5423:1: rule__UIComponentMemberDeclaration__Group__1 : rule__UIComponentMemberDeclaration__Group__1__Impl ;
    public final void rule__UIComponentMemberDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5427:1: ( rule__UIComponentMemberDeclaration__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5428:2: rule__UIComponentMemberDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UIComponentMemberDeclaration__Group__1__Impl_in_rule__UIComponentMemberDeclaration__Group__110889);
            rule__UIComponentMemberDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__UIComponentMemberDeclaration__Group__1"


    // $ANTLR start "rule__UIComponentMemberDeclaration__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5434:1: rule__UIComponentMemberDeclaration__Group__1__Impl : ( ( rule__UIComponentMemberDeclaration__NameAssignment_1 ) ) ;
    public final void rule__UIComponentMemberDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5438:1: ( ( ( rule__UIComponentMemberDeclaration__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5439:1: ( ( rule__UIComponentMemberDeclaration__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5439:1: ( ( rule__UIComponentMemberDeclaration__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5440:1: ( rule__UIComponentMemberDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getUIComponentMemberDeclarationAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5441:1: ( rule__UIComponentMemberDeclaration__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5441:2: rule__UIComponentMemberDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UIComponentMemberDeclaration__NameAssignment_1_in_rule__UIComponentMemberDeclaration__Group__1__Impl10916);
            rule__UIComponentMemberDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentMemberDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__UIComponentMemberDeclaration__Group__1__Impl"


    // $ANTLR start "rule__RESTMethodCall__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5455:1: rule__RESTMethodCall__Group__0 : rule__RESTMethodCall__Group__0__Impl rule__RESTMethodCall__Group__1 ;
    public final void rule__RESTMethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5459:1: ( rule__RESTMethodCall__Group__0__Impl rule__RESTMethodCall__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5460:2: rule__RESTMethodCall__Group__0__Impl rule__RESTMethodCall__Group__1
            {
            pushFollow(FOLLOW_rule__RESTMethodCall__Group__0__Impl_in_rule__RESTMethodCall__Group__010950);
            rule__RESTMethodCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTMethodCall__Group__1_in_rule__RESTMethodCall__Group__010953);
            rule__RESTMethodCall__Group__1();

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
    // $ANTLR end "rule__RESTMethodCall__Group__0"


    // $ANTLR start "rule__RESTMethodCall__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5467:1: rule__RESTMethodCall__Group__0__Impl : ( ( rule__RESTMethodCall__DatasourceAssignment_0 ) ) ;
    public final void rule__RESTMethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5471:1: ( ( ( rule__RESTMethodCall__DatasourceAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5472:1: ( ( rule__RESTMethodCall__DatasourceAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5472:1: ( ( rule__RESTMethodCall__DatasourceAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5473:1: ( rule__RESTMethodCall__DatasourceAssignment_0 )
            {
             before(grammarAccess.getRESTMethodCallAccess().getDatasourceAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5474:1: ( rule__RESTMethodCall__DatasourceAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5474:2: rule__RESTMethodCall__DatasourceAssignment_0
            {
            pushFollow(FOLLOW_rule__RESTMethodCall__DatasourceAssignment_0_in_rule__RESTMethodCall__Group__0__Impl10980);
            rule__RESTMethodCall__DatasourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRESTMethodCallAccess().getDatasourceAssignment_0()); 

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
    // $ANTLR end "rule__RESTMethodCall__Group__0__Impl"


    // $ANTLR start "rule__RESTMethodCall__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5484:1: rule__RESTMethodCall__Group__1 : rule__RESTMethodCall__Group__1__Impl rule__RESTMethodCall__Group__2 ;
    public final void rule__RESTMethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5488:1: ( rule__RESTMethodCall__Group__1__Impl rule__RESTMethodCall__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5489:2: rule__RESTMethodCall__Group__1__Impl rule__RESTMethodCall__Group__2
            {
            pushFollow(FOLLOW_rule__RESTMethodCall__Group__1__Impl_in_rule__RESTMethodCall__Group__111010);
            rule__RESTMethodCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTMethodCall__Group__2_in_rule__RESTMethodCall__Group__111013);
            rule__RESTMethodCall__Group__2();

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
    // $ANTLR end "rule__RESTMethodCall__Group__1"


    // $ANTLR start "rule__RESTMethodCall__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5496:1: rule__RESTMethodCall__Group__1__Impl : ( '.' ) ;
    public final void rule__RESTMethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5500:1: ( ( '.' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5501:1: ( '.' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5501:1: ( '.' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5502:1: '.'
            {
             before(grammarAccess.getRESTMethodCallAccess().getFullStopKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__RESTMethodCall__Group__1__Impl11041); 
             after(grammarAccess.getRESTMethodCallAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__RESTMethodCall__Group__1__Impl"


    // $ANTLR start "rule__RESTMethodCall__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5515:1: rule__RESTMethodCall__Group__2 : rule__RESTMethodCall__Group__2__Impl rule__RESTMethodCall__Group__3 ;
    public final void rule__RESTMethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5519:1: ( rule__RESTMethodCall__Group__2__Impl rule__RESTMethodCall__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5520:2: rule__RESTMethodCall__Group__2__Impl rule__RESTMethodCall__Group__3
            {
            pushFollow(FOLLOW_rule__RESTMethodCall__Group__2__Impl_in_rule__RESTMethodCall__Group__211072);
            rule__RESTMethodCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTMethodCall__Group__3_in_rule__RESTMethodCall__Group__211075);
            rule__RESTMethodCall__Group__3();

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
    // $ANTLR end "rule__RESTMethodCall__Group__2"


    // $ANTLR start "rule__RESTMethodCall__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5527:1: rule__RESTMethodCall__Group__2__Impl : ( ( rule__RESTMethodCall__RestMethodAssignment_2 ) ) ;
    public final void rule__RESTMethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5531:1: ( ( ( rule__RESTMethodCall__RestMethodAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5532:1: ( ( rule__RESTMethodCall__RestMethodAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5532:1: ( ( rule__RESTMethodCall__RestMethodAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5533:1: ( rule__RESTMethodCall__RestMethodAssignment_2 )
            {
             before(grammarAccess.getRESTMethodCallAccess().getRestMethodAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5534:1: ( rule__RESTMethodCall__RestMethodAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5534:2: rule__RESTMethodCall__RestMethodAssignment_2
            {
            pushFollow(FOLLOW_rule__RESTMethodCall__RestMethodAssignment_2_in_rule__RESTMethodCall__Group__2__Impl11102);
            rule__RESTMethodCall__RestMethodAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRESTMethodCallAccess().getRestMethodAssignment_2()); 

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
    // $ANTLR end "rule__RESTMethodCall__Group__2__Impl"


    // $ANTLR start "rule__RESTMethodCall__Group__3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5544:1: rule__RESTMethodCall__Group__3 : rule__RESTMethodCall__Group__3__Impl rule__RESTMethodCall__Group__4 ;
    public final void rule__RESTMethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5548:1: ( rule__RESTMethodCall__Group__3__Impl rule__RESTMethodCall__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5549:2: rule__RESTMethodCall__Group__3__Impl rule__RESTMethodCall__Group__4
            {
            pushFollow(FOLLOW_rule__RESTMethodCall__Group__3__Impl_in_rule__RESTMethodCall__Group__311132);
            rule__RESTMethodCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTMethodCall__Group__4_in_rule__RESTMethodCall__Group__311135);
            rule__RESTMethodCall__Group__4();

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
    // $ANTLR end "rule__RESTMethodCall__Group__3"


    // $ANTLR start "rule__RESTMethodCall__Group__3__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5556:1: rule__RESTMethodCall__Group__3__Impl : ( '(' ) ;
    public final void rule__RESTMethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5560:1: ( ( '(' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5561:1: ( '(' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5561:1: ( '(' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5562:1: '('
            {
             before(grammarAccess.getRESTMethodCallAccess().getLeftParenthesisKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__RESTMethodCall__Group__3__Impl11163); 
             after(grammarAccess.getRESTMethodCallAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__RESTMethodCall__Group__3__Impl"


    // $ANTLR start "rule__RESTMethodCall__Group__4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5575:1: rule__RESTMethodCall__Group__4 : rule__RESTMethodCall__Group__4__Impl ;
    public final void rule__RESTMethodCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5579:1: ( rule__RESTMethodCall__Group__4__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5580:2: rule__RESTMethodCall__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RESTMethodCall__Group__4__Impl_in_rule__RESTMethodCall__Group__411194);
            rule__RESTMethodCall__Group__4__Impl();

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
    // $ANTLR end "rule__RESTMethodCall__Group__4"


    // $ANTLR start "rule__RESTMethodCall__Group__4__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5586:1: rule__RESTMethodCall__Group__4__Impl : ( ')' ) ;
    public final void rule__RESTMethodCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5590:1: ( ( ')' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5591:1: ( ')' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5591:1: ( ')' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5592:1: ')'
            {
             before(grammarAccess.getRESTMethodCallAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__RESTMethodCall__Group__4__Impl11222); 
             after(grammarAccess.getRESTMethodCallAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__RESTMethodCall__Group__4__Impl"


    // $ANTLR start "rule__DataSourceCall__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5615:1: rule__DataSourceCall__Group__0 : rule__DataSourceCall__Group__0__Impl rule__DataSourceCall__Group__1 ;
    public final void rule__DataSourceCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5619:1: ( rule__DataSourceCall__Group__0__Impl rule__DataSourceCall__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5620:2: rule__DataSourceCall__Group__0__Impl rule__DataSourceCall__Group__1
            {
            pushFollow(FOLLOW_rule__DataSourceCall__Group__0__Impl_in_rule__DataSourceCall__Group__011263);
            rule__DataSourceCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceCall__Group__1_in_rule__DataSourceCall__Group__011266);
            rule__DataSourceCall__Group__1();

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
    // $ANTLR end "rule__DataSourceCall__Group__0"


    // $ANTLR start "rule__DataSourceCall__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5627:1: rule__DataSourceCall__Group__0__Impl : ( ( rule__DataSourceCall__DatasourceAssignment_0 ) ) ;
    public final void rule__DataSourceCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5631:1: ( ( ( rule__DataSourceCall__DatasourceAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5632:1: ( ( rule__DataSourceCall__DatasourceAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5632:1: ( ( rule__DataSourceCall__DatasourceAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5633:1: ( rule__DataSourceCall__DatasourceAssignment_0 )
            {
             before(grammarAccess.getDataSourceCallAccess().getDatasourceAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5634:1: ( rule__DataSourceCall__DatasourceAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5634:2: rule__DataSourceCall__DatasourceAssignment_0
            {
            pushFollow(FOLLOW_rule__DataSourceCall__DatasourceAssignment_0_in_rule__DataSourceCall__Group__0__Impl11293);
            rule__DataSourceCall__DatasourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceCallAccess().getDatasourceAssignment_0()); 

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
    // $ANTLR end "rule__DataSourceCall__Group__0__Impl"


    // $ANTLR start "rule__DataSourceCall__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5644:1: rule__DataSourceCall__Group__1 : rule__DataSourceCall__Group__1__Impl rule__DataSourceCall__Group__2 ;
    public final void rule__DataSourceCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5648:1: ( rule__DataSourceCall__Group__1__Impl rule__DataSourceCall__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5649:2: rule__DataSourceCall__Group__1__Impl rule__DataSourceCall__Group__2
            {
            pushFollow(FOLLOW_rule__DataSourceCall__Group__1__Impl_in_rule__DataSourceCall__Group__111323);
            rule__DataSourceCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSourceCall__Group__2_in_rule__DataSourceCall__Group__111326);
            rule__DataSourceCall__Group__2();

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
    // $ANTLR end "rule__DataSourceCall__Group__1"


    // $ANTLR start "rule__DataSourceCall__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5656:1: rule__DataSourceCall__Group__1__Impl : ( 'as' ) ;
    public final void rule__DataSourceCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5660:1: ( ( 'as' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5661:1: ( 'as' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5661:1: ( 'as' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5662:1: 'as'
            {
             before(grammarAccess.getDataSourceCallAccess().getAsKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__DataSourceCall__Group__1__Impl11354); 
             after(grammarAccess.getDataSourceCallAccess().getAsKeyword_1()); 

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
    // $ANTLR end "rule__DataSourceCall__Group__1__Impl"


    // $ANTLR start "rule__DataSourceCall__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5675:1: rule__DataSourceCall__Group__2 : rule__DataSourceCall__Group__2__Impl ;
    public final void rule__DataSourceCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5679:1: ( rule__DataSourceCall__Group__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5680:2: rule__DataSourceCall__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DataSourceCall__Group__2__Impl_in_rule__DataSourceCall__Group__211385);
            rule__DataSourceCall__Group__2__Impl();

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
    // $ANTLR end "rule__DataSourceCall__Group__2"


    // $ANTLR start "rule__DataSourceCall__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5686:1: rule__DataSourceCall__Group__2__Impl : ( ( rule__DataSourceCall__NameAssignment_2 ) ) ;
    public final void rule__DataSourceCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5690:1: ( ( ( rule__DataSourceCall__NameAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5691:1: ( ( rule__DataSourceCall__NameAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5691:1: ( ( rule__DataSourceCall__NameAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5692:1: ( rule__DataSourceCall__NameAssignment_2 )
            {
             before(grammarAccess.getDataSourceCallAccess().getNameAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5693:1: ( rule__DataSourceCall__NameAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5693:2: rule__DataSourceCall__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DataSourceCall__NameAssignment_2_in_rule__DataSourceCall__Group__2__Impl11412);
            rule__DataSourceCall__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceCallAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DataSourceCall__Group__2__Impl"


    // $ANTLR start "rule__UIComponentMemberConfiguration__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5709:1: rule__UIComponentMemberConfiguration__Group__0 : rule__UIComponentMemberConfiguration__Group__0__Impl rule__UIComponentMemberConfiguration__Group__1 ;
    public final void rule__UIComponentMemberConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5713:1: ( rule__UIComponentMemberConfiguration__Group__0__Impl rule__UIComponentMemberConfiguration__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5714:2: rule__UIComponentMemberConfiguration__Group__0__Impl rule__UIComponentMemberConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__UIComponentMemberConfiguration__Group__0__Impl_in_rule__UIComponentMemberConfiguration__Group__011448);
            rule__UIComponentMemberConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIComponentMemberConfiguration__Group__1_in_rule__UIComponentMemberConfiguration__Group__011451);
            rule__UIComponentMemberConfiguration__Group__1();

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
    // $ANTLR end "rule__UIComponentMemberConfiguration__Group__0"


    // $ANTLR start "rule__UIComponentMemberConfiguration__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5721:1: rule__UIComponentMemberConfiguration__Group__0__Impl : ( ( rule__UIComponentMemberConfiguration__TypeAssignment_0 ) ) ;
    public final void rule__UIComponentMemberConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5725:1: ( ( ( rule__UIComponentMemberConfiguration__TypeAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5726:1: ( ( rule__UIComponentMemberConfiguration__TypeAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5726:1: ( ( rule__UIComponentMemberConfiguration__TypeAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5727:1: ( rule__UIComponentMemberConfiguration__TypeAssignment_0 )
            {
             before(grammarAccess.getUIComponentMemberConfigurationAccess().getTypeAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5728:1: ( rule__UIComponentMemberConfiguration__TypeAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5728:2: rule__UIComponentMemberConfiguration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__UIComponentMemberConfiguration__TypeAssignment_0_in_rule__UIComponentMemberConfiguration__Group__0__Impl11478);
            rule__UIComponentMemberConfiguration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentMemberConfigurationAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__UIComponentMemberConfiguration__Group__0__Impl"


    // $ANTLR start "rule__UIComponentMemberConfiguration__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5738:1: rule__UIComponentMemberConfiguration__Group__1 : rule__UIComponentMemberConfiguration__Group__1__Impl rule__UIComponentMemberConfiguration__Group__2 ;
    public final void rule__UIComponentMemberConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5742:1: ( rule__UIComponentMemberConfiguration__Group__1__Impl rule__UIComponentMemberConfiguration__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5743:2: rule__UIComponentMemberConfiguration__Group__1__Impl rule__UIComponentMemberConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__UIComponentMemberConfiguration__Group__1__Impl_in_rule__UIComponentMemberConfiguration__Group__111508);
            rule__UIComponentMemberConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIComponentMemberConfiguration__Group__2_in_rule__UIComponentMemberConfiguration__Group__111511);
            rule__UIComponentMemberConfiguration__Group__2();

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
    // $ANTLR end "rule__UIComponentMemberConfiguration__Group__1"


    // $ANTLR start "rule__UIComponentMemberConfiguration__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5750:1: rule__UIComponentMemberConfiguration__Group__1__Impl : ( '=' ) ;
    public final void rule__UIComponentMemberConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5754:1: ( ( '=' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5755:1: ( '=' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5755:1: ( '=' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5756:1: '='
            {
             before(grammarAccess.getUIComponentMemberConfigurationAccess().getEqualsSignKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__UIComponentMemberConfiguration__Group__1__Impl11539); 
             after(grammarAccess.getUIComponentMemberConfigurationAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__UIComponentMemberConfiguration__Group__1__Impl"


    // $ANTLR start "rule__UIComponentMemberConfiguration__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5769:1: rule__UIComponentMemberConfiguration__Group__2 : rule__UIComponentMemberConfiguration__Group__2__Impl ;
    public final void rule__UIComponentMemberConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5773:1: ( rule__UIComponentMemberConfiguration__Group__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5774:2: rule__UIComponentMemberConfiguration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UIComponentMemberConfiguration__Group__2__Impl_in_rule__UIComponentMemberConfiguration__Group__211570);
            rule__UIComponentMemberConfiguration__Group__2__Impl();

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
    // $ANTLR end "rule__UIComponentMemberConfiguration__Group__2"


    // $ANTLR start "rule__UIComponentMemberConfiguration__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5780:1: rule__UIComponentMemberConfiguration__Group__2__Impl : ( ( rule__UIComponentMemberConfiguration__ValueAssignment_2 ) ) ;
    public final void rule__UIComponentMemberConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5784:1: ( ( ( rule__UIComponentMemberConfiguration__ValueAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5785:1: ( ( rule__UIComponentMemberConfiguration__ValueAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5785:1: ( ( rule__UIComponentMemberConfiguration__ValueAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5786:1: ( rule__UIComponentMemberConfiguration__ValueAssignment_2 )
            {
             before(grammarAccess.getUIComponentMemberConfigurationAccess().getValueAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5787:1: ( rule__UIComponentMemberConfiguration__ValueAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5787:2: rule__UIComponentMemberConfiguration__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__UIComponentMemberConfiguration__ValueAssignment_2_in_rule__UIComponentMemberConfiguration__Group__2__Impl11597);
            rule__UIComponentMemberConfiguration__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentMemberConfigurationAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__UIComponentMemberConfiguration__Group__2__Impl"


    // $ANTLR start "rule__UIComponentMemberCall__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5803:1: rule__UIComponentMemberCall__Group__0 : rule__UIComponentMemberCall__Group__0__Impl rule__UIComponentMemberCall__Group__1 ;
    public final void rule__UIComponentMemberCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5807:1: ( rule__UIComponentMemberCall__Group__0__Impl rule__UIComponentMemberCall__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5808:2: rule__UIComponentMemberCall__Group__0__Impl rule__UIComponentMemberCall__Group__1
            {
            pushFollow(FOLLOW_rule__UIComponentMemberCall__Group__0__Impl_in_rule__UIComponentMemberCall__Group__011633);
            rule__UIComponentMemberCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIComponentMemberCall__Group__1_in_rule__UIComponentMemberCall__Group__011636);
            rule__UIComponentMemberCall__Group__1();

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
    // $ANTLR end "rule__UIComponentMemberCall__Group__0"


    // $ANTLR start "rule__UIComponentMemberCall__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5815:1: rule__UIComponentMemberCall__Group__0__Impl : ( ( rule__UIComponentMemberCall__ComponentAssignment_0 ) ) ;
    public final void rule__UIComponentMemberCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5819:1: ( ( ( rule__UIComponentMemberCall__ComponentAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5820:1: ( ( rule__UIComponentMemberCall__ComponentAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5820:1: ( ( rule__UIComponentMemberCall__ComponentAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5821:1: ( rule__UIComponentMemberCall__ComponentAssignment_0 )
            {
             before(grammarAccess.getUIComponentMemberCallAccess().getComponentAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5822:1: ( rule__UIComponentMemberCall__ComponentAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5822:2: rule__UIComponentMemberCall__ComponentAssignment_0
            {
            pushFollow(FOLLOW_rule__UIComponentMemberCall__ComponentAssignment_0_in_rule__UIComponentMemberCall__Group__0__Impl11663);
            rule__UIComponentMemberCall__ComponentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentMemberCallAccess().getComponentAssignment_0()); 

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
    // $ANTLR end "rule__UIComponentMemberCall__Group__0__Impl"


    // $ANTLR start "rule__UIComponentMemberCall__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5832:1: rule__UIComponentMemberCall__Group__1 : rule__UIComponentMemberCall__Group__1__Impl ;
    public final void rule__UIComponentMemberCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5836:1: ( rule__UIComponentMemberCall__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5837:2: rule__UIComponentMemberCall__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UIComponentMemberCall__Group__1__Impl_in_rule__UIComponentMemberCall__Group__111693);
            rule__UIComponentMemberCall__Group__1__Impl();

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
    // $ANTLR end "rule__UIComponentMemberCall__Group__1"


    // $ANTLR start "rule__UIComponentMemberCall__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5843:1: rule__UIComponentMemberCall__Group__1__Impl : ( ( rule__UIComponentMemberCall__Group_1__0 )? ) ;
    public final void rule__UIComponentMemberCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5847:1: ( ( ( rule__UIComponentMemberCall__Group_1__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5848:1: ( ( rule__UIComponentMemberCall__Group_1__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5848:1: ( ( rule__UIComponentMemberCall__Group_1__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5849:1: ( rule__UIComponentMemberCall__Group_1__0 )?
            {
             before(grammarAccess.getUIComponentMemberCallAccess().getGroup_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5850:1: ( rule__UIComponentMemberCall__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5850:2: rule__UIComponentMemberCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UIComponentMemberCall__Group_1__0_in_rule__UIComponentMemberCall__Group__1__Impl11720);
                    rule__UIComponentMemberCall__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUIComponentMemberCallAccess().getGroup_1()); 

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
    // $ANTLR end "rule__UIComponentMemberCall__Group__1__Impl"


    // $ANTLR start "rule__UIComponentMemberCall__Group_1__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5864:1: rule__UIComponentMemberCall__Group_1__0 : rule__UIComponentMemberCall__Group_1__0__Impl rule__UIComponentMemberCall__Group_1__1 ;
    public final void rule__UIComponentMemberCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5868:1: ( rule__UIComponentMemberCall__Group_1__0__Impl rule__UIComponentMemberCall__Group_1__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5869:2: rule__UIComponentMemberCall__Group_1__0__Impl rule__UIComponentMemberCall__Group_1__1
            {
            pushFollow(FOLLOW_rule__UIComponentMemberCall__Group_1__0__Impl_in_rule__UIComponentMemberCall__Group_1__011755);
            rule__UIComponentMemberCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIComponentMemberCall__Group_1__1_in_rule__UIComponentMemberCall__Group_1__011758);
            rule__UIComponentMemberCall__Group_1__1();

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
    // $ANTLR end "rule__UIComponentMemberCall__Group_1__0"


    // $ANTLR start "rule__UIComponentMemberCall__Group_1__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5876:1: rule__UIComponentMemberCall__Group_1__0__Impl : ( '.' ) ;
    public final void rule__UIComponentMemberCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5880:1: ( ( '.' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5881:1: ( '.' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5881:1: ( '.' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5882:1: '.'
            {
             before(grammarAccess.getUIComponentMemberCallAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__UIComponentMemberCall__Group_1__0__Impl11786); 
             after(grammarAccess.getUIComponentMemberCallAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__UIComponentMemberCall__Group_1__0__Impl"


    // $ANTLR start "rule__UIComponentMemberCall__Group_1__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5895:1: rule__UIComponentMemberCall__Group_1__1 : rule__UIComponentMemberCall__Group_1__1__Impl ;
    public final void rule__UIComponentMemberCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5899:1: ( rule__UIComponentMemberCall__Group_1__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5900:2: rule__UIComponentMemberCall__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UIComponentMemberCall__Group_1__1__Impl_in_rule__UIComponentMemberCall__Group_1__111817);
            rule__UIComponentMemberCall__Group_1__1__Impl();

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
    // $ANTLR end "rule__UIComponentMemberCall__Group_1__1"


    // $ANTLR start "rule__UIComponentMemberCall__Group_1__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5906:1: rule__UIComponentMemberCall__Group_1__1__Impl : ( ( rule__UIComponentMemberCall__MemberAssignment_1_1 ) ) ;
    public final void rule__UIComponentMemberCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5910:1: ( ( ( rule__UIComponentMemberCall__MemberAssignment_1_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5911:1: ( ( rule__UIComponentMemberCall__MemberAssignment_1_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5911:1: ( ( rule__UIComponentMemberCall__MemberAssignment_1_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5912:1: ( rule__UIComponentMemberCall__MemberAssignment_1_1 )
            {
             before(grammarAccess.getUIComponentMemberCallAccess().getMemberAssignment_1_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5913:1: ( rule__UIComponentMemberCall__MemberAssignment_1_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5913:2: rule__UIComponentMemberCall__MemberAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UIComponentMemberCall__MemberAssignment_1_1_in_rule__UIComponentMemberCall__Group_1__1__Impl11844);
            rule__UIComponentMemberCall__MemberAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUIComponentMemberCallAccess().getMemberAssignment_1_1()); 

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
    // $ANTLR end "rule__UIComponentMemberCall__Group_1__1__Impl"


    // $ANTLR start "rule__EntityMemberCall__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5927:1: rule__EntityMemberCall__Group__0 : rule__EntityMemberCall__Group__0__Impl rule__EntityMemberCall__Group__1 ;
    public final void rule__EntityMemberCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5931:1: ( rule__EntityMemberCall__Group__0__Impl rule__EntityMemberCall__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5932:2: rule__EntityMemberCall__Group__0__Impl rule__EntityMemberCall__Group__1
            {
            pushFollow(FOLLOW_rule__EntityMemberCall__Group__0__Impl_in_rule__EntityMemberCall__Group__011878);
            rule__EntityMemberCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityMemberCall__Group__1_in_rule__EntityMemberCall__Group__011881);
            rule__EntityMemberCall__Group__1();

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
    // $ANTLR end "rule__EntityMemberCall__Group__0"


    // $ANTLR start "rule__EntityMemberCall__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5939:1: rule__EntityMemberCall__Group__0__Impl : ( ( rule__EntityMemberCall__HeadAssignment_0 ) ) ;
    public final void rule__EntityMemberCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5943:1: ( ( ( rule__EntityMemberCall__HeadAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5944:1: ( ( rule__EntityMemberCall__HeadAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5944:1: ( ( rule__EntityMemberCall__HeadAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5945:1: ( rule__EntityMemberCall__HeadAssignment_0 )
            {
             before(grammarAccess.getEntityMemberCallAccess().getHeadAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5946:1: ( rule__EntityMemberCall__HeadAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5946:2: rule__EntityMemberCall__HeadAssignment_0
            {
            pushFollow(FOLLOW_rule__EntityMemberCall__HeadAssignment_0_in_rule__EntityMemberCall__Group__0__Impl11908);
            rule__EntityMemberCall__HeadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMemberCallAccess().getHeadAssignment_0()); 

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
    // $ANTLR end "rule__EntityMemberCall__Group__0__Impl"


    // $ANTLR start "rule__EntityMemberCall__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5956:1: rule__EntityMemberCall__Group__1 : rule__EntityMemberCall__Group__1__Impl ;
    public final void rule__EntityMemberCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5960:1: ( rule__EntityMemberCall__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5961:2: rule__EntityMemberCall__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EntityMemberCall__Group__1__Impl_in_rule__EntityMemberCall__Group__111938);
            rule__EntityMemberCall__Group__1__Impl();

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
    // $ANTLR end "rule__EntityMemberCall__Group__1"


    // $ANTLR start "rule__EntityMemberCall__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5967:1: rule__EntityMemberCall__Group__1__Impl : ( ( rule__EntityMemberCall__TailAssignment_1 )? ) ;
    public final void rule__EntityMemberCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5971:1: ( ( ( rule__EntityMemberCall__TailAssignment_1 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5972:1: ( ( rule__EntityMemberCall__TailAssignment_1 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5972:1: ( ( rule__EntityMemberCall__TailAssignment_1 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5973:1: ( rule__EntityMemberCall__TailAssignment_1 )?
            {
             before(grammarAccess.getEntityMemberCallAccess().getTailAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5974:1: ( rule__EntityMemberCall__TailAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5974:2: rule__EntityMemberCall__TailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EntityMemberCall__TailAssignment_1_in_rule__EntityMemberCall__Group__1__Impl11965);
                    rule__EntityMemberCall__TailAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityMemberCallAccess().getTailAssignment_1()); 

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
    // $ANTLR end "rule__EntityMemberCall__Group__1__Impl"


    // $ANTLR start "rule__EntityMemberCallTail__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5988:1: rule__EntityMemberCallTail__Group__0 : rule__EntityMemberCallTail__Group__0__Impl rule__EntityMemberCallTail__Group__1 ;
    public final void rule__EntityMemberCallTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5992:1: ( rule__EntityMemberCallTail__Group__0__Impl rule__EntityMemberCallTail__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5993:2: rule__EntityMemberCallTail__Group__0__Impl rule__EntityMemberCallTail__Group__1
            {
            pushFollow(FOLLOW_rule__EntityMemberCallTail__Group__0__Impl_in_rule__EntityMemberCallTail__Group__012000);
            rule__EntityMemberCallTail__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityMemberCallTail__Group__1_in_rule__EntityMemberCallTail__Group__012003);
            rule__EntityMemberCallTail__Group__1();

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
    // $ANTLR end "rule__EntityMemberCallTail__Group__0"


    // $ANTLR start "rule__EntityMemberCallTail__Group__0__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6000:1: rule__EntityMemberCallTail__Group__0__Impl : ( '.' ) ;
    public final void rule__EntityMemberCallTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6004:1: ( ( '.' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6005:1: ( '.' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6005:1: ( '.' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6006:1: '.'
            {
             before(grammarAccess.getEntityMemberCallTailAccess().getFullStopKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__EntityMemberCallTail__Group__0__Impl12031); 
             after(grammarAccess.getEntityMemberCallTailAccess().getFullStopKeyword_0()); 

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
    // $ANTLR end "rule__EntityMemberCallTail__Group__0__Impl"


    // $ANTLR start "rule__EntityMemberCallTail__Group__1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6019:1: rule__EntityMemberCallTail__Group__1 : rule__EntityMemberCallTail__Group__1__Impl rule__EntityMemberCallTail__Group__2 ;
    public final void rule__EntityMemberCallTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6023:1: ( rule__EntityMemberCallTail__Group__1__Impl rule__EntityMemberCallTail__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6024:2: rule__EntityMemberCallTail__Group__1__Impl rule__EntityMemberCallTail__Group__2
            {
            pushFollow(FOLLOW_rule__EntityMemberCallTail__Group__1__Impl_in_rule__EntityMemberCallTail__Group__112062);
            rule__EntityMemberCallTail__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityMemberCallTail__Group__2_in_rule__EntityMemberCallTail__Group__112065);
            rule__EntityMemberCallTail__Group__2();

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
    // $ANTLR end "rule__EntityMemberCallTail__Group__1"


    // $ANTLR start "rule__EntityMemberCallTail__Group__1__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6031:1: rule__EntityMemberCallTail__Group__1__Impl : ( ( rule__EntityMemberCallTail__HeadAssignment_1 ) ) ;
    public final void rule__EntityMemberCallTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6035:1: ( ( ( rule__EntityMemberCallTail__HeadAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6036:1: ( ( rule__EntityMemberCallTail__HeadAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6036:1: ( ( rule__EntityMemberCallTail__HeadAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6037:1: ( rule__EntityMemberCallTail__HeadAssignment_1 )
            {
             before(grammarAccess.getEntityMemberCallTailAccess().getHeadAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6038:1: ( rule__EntityMemberCallTail__HeadAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6038:2: rule__EntityMemberCallTail__HeadAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityMemberCallTail__HeadAssignment_1_in_rule__EntityMemberCallTail__Group__1__Impl12092);
            rule__EntityMemberCallTail__HeadAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityMemberCallTailAccess().getHeadAssignment_1()); 

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
    // $ANTLR end "rule__EntityMemberCallTail__Group__1__Impl"


    // $ANTLR start "rule__EntityMemberCallTail__Group__2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6048:1: rule__EntityMemberCallTail__Group__2 : rule__EntityMemberCallTail__Group__2__Impl ;
    public final void rule__EntityMemberCallTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6052:1: ( rule__EntityMemberCallTail__Group__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6053:2: rule__EntityMemberCallTail__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityMemberCallTail__Group__2__Impl_in_rule__EntityMemberCallTail__Group__212122);
            rule__EntityMemberCallTail__Group__2__Impl();

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
    // $ANTLR end "rule__EntityMemberCallTail__Group__2"


    // $ANTLR start "rule__EntityMemberCallTail__Group__2__Impl"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6059:1: rule__EntityMemberCallTail__Group__2__Impl : ( ( rule__EntityMemberCallTail__TailAssignment_2 )? ) ;
    public final void rule__EntityMemberCallTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6063:1: ( ( ( rule__EntityMemberCallTail__TailAssignment_2 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6064:1: ( ( rule__EntityMemberCallTail__TailAssignment_2 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6064:1: ( ( rule__EntityMemberCallTail__TailAssignment_2 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6065:1: ( rule__EntityMemberCallTail__TailAssignment_2 )?
            {
             before(grammarAccess.getEntityMemberCallTailAccess().getTailAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6066:1: ( rule__EntityMemberCallTail__TailAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6066:2: rule__EntityMemberCallTail__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__EntityMemberCallTail__TailAssignment_2_in_rule__EntityMemberCallTail__Group__2__Impl12149);
                    rule__EntityMemberCallTail__TailAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityMemberCallTailAccess().getTailAssignment_2()); 

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
    // $ANTLR end "rule__EntityMemberCallTail__Group__2__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6083:1: rule__Model__ElementsAssignment : ( ruleNamedElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6087:1: ( ( ruleNamedElement ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6088:1: ( ruleNamedElement )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6088:1: ( ruleNamedElement )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6089:1: ruleNamedElement
            {
             before(grammarAccess.getModelAccess().getElementsNamedElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNamedElement_in_rule__Model__ElementsAssignment12191);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6098:1: rule__DataType__NameAssignment_1 : ( ruleKeywordedID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6102:1: ( ( ruleKeywordedID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6103:1: ( ruleKeywordedID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6103:1: ( ruleKeywordedID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6104:1: ruleKeywordedID
            {
             before(grammarAccess.getDataTypeAccess().getNameKeywordedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleKeywordedID_in_rule__DataType__NameAssignment_112222);
            ruleKeywordedID();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getNameKeywordedIDParserRuleCall_1_0()); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6113:1: rule__Entity__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Entity__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6117:1: ( ( ( 'abstract' ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6118:1: ( ( 'abstract' ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6118:1: ( ( 'abstract' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6119:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6120:1: ( 'abstract' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6121:1: 'abstract'
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__Entity__AbstractAssignment_012258); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6136:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6140:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6141:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6141:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6142:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_212297); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6151:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6155:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6156:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6156:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6157:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6158:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6159:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_112332); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6170:1: rule__Entity__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6174:1: ( ( ruleAttribute ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6175:1: ( ruleAttribute )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6175:1: ( ruleAttribute )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6176:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_512367);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6185:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6189:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6190:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6190:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6191:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6192:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6193:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_012402); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6204:1: rule__Attribute__ManyAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__Attribute__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6208:1: ( ( ( '[]' ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6209:1: ( ( '[]' ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6209:1: ( ( '[]' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6210:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6211:1: ( '[]' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6212:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__Attribute__ManyAssignment_112442); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6227:1: rule__Attribute__NameAssignment_2 : ( ruleKeywordedID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6231:1: ( ( ruleKeywordedID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6232:1: ( ruleKeywordedID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6232:1: ( ruleKeywordedID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6233:1: ruleKeywordedID
            {
             before(grammarAccess.getAttributeAccess().getNameKeywordedIDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleKeywordedID_in_rule__Attribute__NameAssignment_212481);
            ruleKeywordedID();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameKeywordedIDParserRuleCall_2_0()); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6242:1: rule__Platform__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Platform__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6246:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6247:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6247:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6248:1: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Platform__NameAssignment_112512); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6257:1: rule__Platform__MappingsAssignment_3 : ( rulePlatformMapping ) ;
    public final void rule__Platform__MappingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6261:1: ( ( rulePlatformMapping ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6262:1: ( rulePlatformMapping )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6262:1: ( rulePlatformMapping )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6263:1: rulePlatformMapping
            {
             before(grammarAccess.getPlatformAccess().getMappingsPlatformMappingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePlatformMapping_in_rule__Platform__MappingsAssignment_312543);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6272:1: rule__TypeMapping__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeMapping__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6276:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6277:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6277:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6278:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeMappingAccess().getTypeDataTypeCrossReference_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6279:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6280:1: RULE_ID
            {
             before(grammarAccess.getTypeMappingAccess().getTypeDataTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeMapping__TypeAssignment_112578); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6291:1: rule__TypeMapping__SimpleNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__TypeMapping__SimpleNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6295:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6296:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6296:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6297:1: RULE_ID
            {
             before(grammarAccess.getTypeMappingAccess().getSimpleNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeMapping__SimpleNameAssignment_312613); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6306:1: rule__DataSource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6310:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6311:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6311:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6312:1: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSource__NameAssignment_112644); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6321:1: rule__DataSource__BaseUrlAssignment_5 : ( ruleAbsoluteRESTURL ) ;
    public final void rule__DataSource__BaseUrlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6325:1: ( ( ruleAbsoluteRESTURL ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6326:1: ( ruleAbsoluteRESTURL )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6326:1: ( ruleAbsoluteRESTURL )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6327:1: ruleAbsoluteRESTURL
            {
             before(grammarAccess.getDataSourceAccess().getBaseUrlAbsoluteRESTURLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_rule__DataSource__BaseUrlAssignment_512675);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6336:1: rule__DataSource__ResourceTypeAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__DataSource__ResourceTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6340:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6341:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6341:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6342:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceAccess().getResourceTypeEntityCrossReference_8_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6343:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6344:1: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getResourceTypeEntityIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSource__ResourceTypeAssignment_812710); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6355:1: rule__DataSource__MethodsAssignment_9 : ( ruleDataSourceAccessMethod ) ;
    public final void rule__DataSource__MethodsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6359:1: ( ( ruleDataSourceAccessMethod ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6360:1: ( ruleDataSourceAccessMethod )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6360:1: ( ruleDataSourceAccessMethod )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6361:1: ruleDataSourceAccessMethod
            {
             before(grammarAccess.getDataSourceAccess().getMethodsDataSourceAccessMethodParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleDataSourceAccessMethod_in_rule__DataSource__MethodsAssignment_912745);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6370:1: rule__DataSourceAccessMethod__NameAssignment_0 : ( ruleKeywordedID ) ;
    public final void rule__DataSourceAccessMethod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6374:1: ( ( ruleKeywordedID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6375:1: ( ruleKeywordedID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6375:1: ( ruleKeywordedID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6376:1: ruleKeywordedID
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getNameKeywordedIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleKeywordedID_in_rule__DataSourceAccessMethod__NameAssignment_012776);
            ruleKeywordedID();

            state._fsp--;

             after(grammarAccess.getDataSourceAccessMethodAccess().getNameKeywordedIDParserRuleCall_0_0()); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6385:1: rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0 : ( ruleParameter ) ;
    public final void rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6389:1: ( ( ruleParameter ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6390:1: ( ruleParameter )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6390:1: ( ruleParameter )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6391:1: ruleParameter
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_012807);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6400:1: rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1 : ( ruleParameter ) ;
    public final void rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6404:1: ( ( ruleParameter ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6405:1: ( ruleParameter )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6405:1: ( ruleParameter )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6406:1: ruleParameter
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_112838);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6415:1: rule__DataSourceAccessMethod__ReturnsManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__DataSourceAccessMethod__ReturnsManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6419:1: ( ( ( '[]' ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6420:1: ( ( '[]' ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6420:1: ( ( '[]' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6421:1: ( '[]' )
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6422:1: ( '[]' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6423:1: '[]'
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,47,FOLLOW_47_in_rule__DataSourceAccessMethod__ReturnsManyAssignment_412874); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6438:1: rule__DataSourceAccessMethod__RestSpecificationAssignment_5 : ( ruleRESTSpecification ) ;
    public final void rule__DataSourceAccessMethod__RestSpecificationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6442:1: ( ( ruleRESTSpecification ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6443:1: ( ruleRESTSpecification )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6443:1: ( ruleRESTSpecification )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6444:1: ruleRESTSpecification
            {
             before(grammarAccess.getDataSourceAccessMethodAccess().getRestSpecificationRESTSpecificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRESTSpecification_in_rule__DataSourceAccessMethod__RestSpecificationAssignment_512913);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6453:1: rule__RESTSpecification__VerbAssignment_0 : ( ruleRESTVerb ) ;
    public final void rule__RESTSpecification__VerbAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6457:1: ( ( ruleRESTVerb ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6458:1: ( ruleRESTVerb )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6458:1: ( ruleRESTVerb )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6459:1: ruleRESTVerb
            {
             before(grammarAccess.getRESTSpecificationAccess().getVerbRESTVerbEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRESTVerb_in_rule__RESTSpecification__VerbAssignment_012944);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6468:1: rule__RESTSpecification__PathAssignment_1 : ( ruleRESTURL ) ;
    public final void rule__RESTSpecification__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6472:1: ( ( ruleRESTURL ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6473:1: ( ruleRESTURL )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6473:1: ( ruleRESTURL )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6474:1: ruleRESTURL
            {
             before(grammarAccess.getRESTSpecificationAccess().getPathRESTURLParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRESTURL_in_rule__RESTSpecification__PathAssignment_112975);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6483:1: rule__RESTSpecification__BodyAssignment_2_1 : ( ruleDataSourceBodySpecification ) ;
    public final void rule__RESTSpecification__BodyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6487:1: ( ( ruleDataSourceBodySpecification ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6488:1: ( ruleDataSourceBodySpecification )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6488:1: ( ruleDataSourceBodySpecification )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6489:1: ruleDataSourceBodySpecification
            {
             before(grammarAccess.getRESTSpecificationAccess().getBodyDataSourceBodySpecificationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDataSourceBodySpecification_in_rule__RESTSpecification__BodyAssignment_2_113006);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6498:1: rule__DataSourceBodySpecification__BodycontentsAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DataSourceBodySpecification__BodycontentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6502:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6503:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6503:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6504:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsParameterCrossReference_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6505:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6506:1: RULE_ID
            {
             before(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsParameterIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSourceBodySpecification__BodycontentsAssignment13041); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6517:1: rule__Parameter__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6521:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6522:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6522:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6523:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6524:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6525:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_013080); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6536:1: rule__Parameter__NameAssignment_1 : ( ruleKeywordedID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6540:1: ( ( ruleKeywordedID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6541:1: ( ruleKeywordedID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6541:1: ( ruleKeywordedID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6542:1: ruleKeywordedID
            {
             before(grammarAccess.getParameterAccess().getNameKeywordedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleKeywordedID_in_rule__Parameter__NameAssignment_113115);
            ruleKeywordedID();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameKeywordedIDParserRuleCall_1_0()); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6551:1: rule__AbsoluteRESTURL__HostAssignment_2 : ( ruleUrlFragment ) ;
    public final void rule__AbsoluteRESTURL__HostAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6555:1: ( ( ruleUrlFragment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6556:1: ( ruleUrlFragment )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6556:1: ( ruleUrlFragment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6557:1: ruleUrlFragment
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getHostUrlFragmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_rule__AbsoluteRESTURL__HostAssignment_213146);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6566:1: rule__AbsoluteRESTURL__PortAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__AbsoluteRESTURL__PortAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6570:1: ( ( RULE_INT ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6571:1: ( RULE_INT )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6571:1: ( RULE_INT )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6572:1: RULE_INT
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getPortINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AbsoluteRESTURL__PortAssignment_3_113177); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6581:1: rule__AbsoluteRESTURL__FragmentsAssignment_4_1 : ( ruleUrlFragment ) ;
    public final void rule__AbsoluteRESTURL__FragmentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6585:1: ( ( ruleUrlFragment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6586:1: ( ruleUrlFragment )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6586:1: ( ruleUrlFragment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6587:1: ruleUrlFragment
            {
             before(grammarAccess.getAbsoluteRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_rule__AbsoluteRESTURL__FragmentsAssignment_4_113208);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6596:1: rule__RelativeRESTURL__FragmentsAssignment_2 : ( ruleUrlFragment ) ;
    public final void rule__RelativeRESTURL__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6600:1: ( ( ruleUrlFragment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6601:1: ( ruleUrlFragment )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6601:1: ( ruleUrlFragment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6602:1: ruleUrlFragment
            {
             before(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_rule__RelativeRESTURL__FragmentsAssignment_213239);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6611:1: rule__RelativeRESTURL__FragmentsAssignment_3_1 : ( ruleUrlFragment ) ;
    public final void rule__RelativeRESTURL__FragmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6615:1: ( ( ruleUrlFragment ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6616:1: ( ruleUrlFragment )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6616:1: ( ruleUrlFragment )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6617:1: ruleUrlFragment
            {
             before(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_rule__RelativeRESTURL__FragmentsAssignment_3_113270);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6626:1: rule__UrlPathFragment__NameAssignment : ( ruleQualifiedName ) ;
    public final void rule__UrlPathFragment__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6630:1: ( ( ruleQualifiedName ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6631:1: ( ruleQualifiedName )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6631:1: ( ruleQualifiedName )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6632:1: ruleQualifiedName
            {
             before(grammarAccess.getUrlPathFragmentAccess().getNameQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__UrlPathFragment__NameAssignment13301);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6641:1: rule__Variable__ParameterReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Variable__ParameterReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6645:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6646:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6646:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6647:1: ( RULE_ID )
            {
             before(grammarAccess.getVariableAccess().getParameterReferenceParameterCrossReference_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6648:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6649:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getParameterReferenceParameterIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__ParameterReferenceAssignment_113336); 
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


    // $ANTLR start "rule__Screen__KindAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6660:1: rule__Screen__KindAssignment_1 : ( ruleScreenKind ) ;
    public final void rule__Screen__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6664:1: ( ( ruleScreenKind ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6665:1: ( ruleScreenKind )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6665:1: ( ruleScreenKind )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6666:1: ruleScreenKind
            {
             before(grammarAccess.getScreenAccess().getKindScreenKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScreenKind_in_rule__Screen__KindAssignment_113371);
            ruleScreenKind();

            state._fsp--;

             after(grammarAccess.getScreenAccess().getKindScreenKindEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Screen__KindAssignment_1"


    // $ANTLR start "rule__Screen__NameAssignment_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6675:1: rule__Screen__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Screen__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6679:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6680:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6680:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6681:1: RULE_ID
            {
             before(grammarAccess.getScreenAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Screen__NameAssignment_213402); 
             after(grammarAccess.getScreenAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Screen__NameAssignment_2"


    // $ANTLR start "rule__Screen__TitleAssignment_4_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6690:1: rule__Screen__TitleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Screen__TitleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6694:1: ( ( RULE_STRING ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6695:1: ( RULE_STRING )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6695:1: ( RULE_STRING )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6696:1: RULE_STRING
            {
             before(grammarAccess.getScreenAccess().getTitleSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Screen__TitleAssignment_4_213433); 
             after(grammarAccess.getScreenAccess().getTitleSTRINGTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Screen__TitleAssignment_4_2"


    // $ANTLR start "rule__Screen__DatasourceAssignment_5_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6705:1: rule__Screen__DatasourceAssignment_5_2 : ( ruleDataSourceCall ) ;
    public final void rule__Screen__DatasourceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6709:1: ( ( ruleDataSourceCall ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6710:1: ( ruleDataSourceCall )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6710:1: ( ruleDataSourceCall )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6711:1: ruleDataSourceCall
            {
             before(grammarAccess.getScreenAccess().getDatasourceDataSourceCallParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleDataSourceCall_in_rule__Screen__DatasourceAssignment_5_213464);
            ruleDataSourceCall();

            state._fsp--;

             after(grammarAccess.getScreenAccess().getDatasourceDataSourceCallParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Screen__DatasourceAssignment_5_2"


    // $ANTLR start "rule__Screen__SectionsAssignment_8"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6720:1: rule__Screen__SectionsAssignment_8 : ( ruleScreenSection ) ;
    public final void rule__Screen__SectionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6724:1: ( ( ruleScreenSection ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6725:1: ( ruleScreenSection )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6725:1: ( ruleScreenSection )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6726:1: ruleScreenSection
            {
             before(grammarAccess.getScreenAccess().getSectionsScreenSectionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleScreenSection_in_rule__Screen__SectionsAssignment_813495);
            ruleScreenSection();

            state._fsp--;

             after(grammarAccess.getScreenAccess().getSectionsScreenSectionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Screen__SectionsAssignment_8"


    // $ANTLR start "rule__ScreenSection__TitleAssignment_2_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6735:1: rule__ScreenSection__TitleAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__ScreenSection__TitleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6739:1: ( ( RULE_STRING ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6740:1: ( RULE_STRING )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6740:1: ( RULE_STRING )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6741:1: RULE_STRING
            {
             before(grammarAccess.getScreenSectionAccess().getTitleSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ScreenSection__TitleAssignment_2_213526); 
             after(grammarAccess.getScreenSectionAccess().getTitleSTRINGTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__ScreenSection__TitleAssignment_2_2"


    // $ANTLR start "rule__ScreenSection__DatasourceAssignment_3_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6750:1: rule__ScreenSection__DatasourceAssignment_3_2 : ( ruleDataSourceCall ) ;
    public final void rule__ScreenSection__DatasourceAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6754:1: ( ( ruleDataSourceCall ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6755:1: ( ruleDataSourceCall )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6755:1: ( ruleDataSourceCall )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6756:1: ruleDataSourceCall
            {
             before(grammarAccess.getScreenSectionAccess().getDatasourceDataSourceCallParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleDataSourceCall_in_rule__ScreenSection__DatasourceAssignment_3_213557);
            ruleDataSourceCall();

            state._fsp--;

             after(grammarAccess.getScreenSectionAccess().getDatasourceDataSourceCallParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__ScreenSection__DatasourceAssignment_3_2"


    // $ANTLR start "rule__ScreenSection__ItemsAssignment_4"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6765:1: rule__ScreenSection__ItemsAssignment_4 : ( ruleScreenSectionItems ) ;
    public final void rule__ScreenSection__ItemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6769:1: ( ( ruleScreenSectionItems ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6770:1: ( ruleScreenSectionItems )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6770:1: ( ruleScreenSectionItems )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6771:1: ruleScreenSectionItems
            {
             before(grammarAccess.getScreenSectionAccess().getItemsScreenSectionItemsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleScreenSectionItems_in_rule__ScreenSection__ItemsAssignment_413588);
            ruleScreenSectionItems();

            state._fsp--;

             after(grammarAccess.getScreenSectionAccess().getItemsScreenSectionItemsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ScreenSection__ItemsAssignment_4"


    // $ANTLR start "rule__ScreenSectionItems__ItemsAssignment_3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6780:1: rule__ScreenSectionItems__ItemsAssignment_3 : ( ruleScreenListItemCell ) ;
    public final void rule__ScreenSectionItems__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6784:1: ( ( ruleScreenListItemCell ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6785:1: ( ruleScreenListItemCell )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6785:1: ( ruleScreenListItemCell )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6786:1: ruleScreenListItemCell
            {
             before(grammarAccess.getScreenSectionItemsAccess().getItemsScreenListItemCellParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleScreenListItemCell_in_rule__ScreenSectionItems__ItemsAssignment_313619);
            ruleScreenListItemCell();

            state._fsp--;

             after(grammarAccess.getScreenSectionItemsAccess().getItemsScreenListItemCellParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ScreenSectionItems__ItemsAssignment_3"


    // $ANTLR start "rule__ScreenListItemCell__TypeAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6795:1: rule__ScreenListItemCell__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ScreenListItemCell__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6799:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6800:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6800:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6801:1: ( RULE_ID )
            {
             before(grammarAccess.getScreenListItemCellAccess().getTypeListItemCellDeclarationCrossReference_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6802:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6803:1: RULE_ID
            {
             before(grammarAccess.getScreenListItemCellAccess().getTypeListItemCellDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ScreenListItemCell__TypeAssignment_113654); 
             after(grammarAccess.getScreenListItemCellAccess().getTypeListItemCellDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getScreenListItemCellAccess().getTypeListItemCellDeclarationCrossReference_1_0()); 

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
    // $ANTLR end "rule__ScreenListItemCell__TypeAssignment_1"


    // $ANTLR start "rule__ScreenListItemCell__RestMethodAssignment_3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6814:1: rule__ScreenListItemCell__RestMethodAssignment_3 : ( ruleRESTMethodCall ) ;
    public final void rule__ScreenListItemCell__RestMethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6818:1: ( ( ruleRESTMethodCall ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6819:1: ( ruleRESTMethodCall )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6819:1: ( ruleRESTMethodCall )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6820:1: ruleRESTMethodCall
            {
             before(grammarAccess.getScreenListItemCellAccess().getRestMethodRESTMethodCallParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRESTMethodCall_in_rule__ScreenListItemCell__RestMethodAssignment_313689);
            ruleRESTMethodCall();

            state._fsp--;

             after(grammarAccess.getScreenListItemCellAccess().getRestMethodRESTMethodCallParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ScreenListItemCell__RestMethodAssignment_3"


    // $ANTLR start "rule__ScreenListItemCell__VariableAssignment_5"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6829:1: rule__ScreenListItemCell__VariableAssignment_5 : ( RULE_ID ) ;
    public final void rule__ScreenListItemCell__VariableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6833:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6834:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6834:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6835:1: RULE_ID
            {
             before(grammarAccess.getScreenListItemCellAccess().getVariableIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ScreenListItemCell__VariableAssignment_513720); 
             after(grammarAccess.getScreenListItemCellAccess().getVariableIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ScreenListItemCell__VariableAssignment_5"


    // $ANTLR start "rule__ScreenListItemCell__ConfigurationsAssignment_7"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6844:1: rule__ScreenListItemCell__ConfigurationsAssignment_7 : ( ruleUIComponentMemberConfiguration ) ;
    public final void rule__ScreenListItemCell__ConfigurationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6848:1: ( ( ruleUIComponentMemberConfiguration ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6849:1: ( ruleUIComponentMemberConfiguration )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6849:1: ( ruleUIComponentMemberConfiguration )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6850:1: ruleUIComponentMemberConfiguration
            {
             before(grammarAccess.getScreenListItemCellAccess().getConfigurationsUIComponentMemberConfigurationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleUIComponentMemberConfiguration_in_rule__ScreenListItemCell__ConfigurationsAssignment_713751);
            ruleUIComponentMemberConfiguration();

            state._fsp--;

             after(grammarAccess.getScreenListItemCellAccess().getConfigurationsUIComponentMemberConfigurationParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ScreenListItemCell__ConfigurationsAssignment_7"


    // $ANTLR start "rule__ListItemCellDeclaration__NameAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6859:1: rule__ListItemCellDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ListItemCellDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6863:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6864:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6864:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6865:1: RULE_ID
            {
             before(grammarAccess.getListItemCellDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListItemCellDeclaration__NameAssignment_113782); 
             after(grammarAccess.getListItemCellDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ListItemCellDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ListItemCellDeclaration__MembersAssignment_3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6874:1: rule__ListItemCellDeclaration__MembersAssignment_3 : ( ruleUIComponentMemberDeclaration ) ;
    public final void rule__ListItemCellDeclaration__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6878:1: ( ( ruleUIComponentMemberDeclaration ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6879:1: ( ruleUIComponentMemberDeclaration )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6879:1: ( ruleUIComponentMemberDeclaration )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6880:1: ruleUIComponentMemberDeclaration
            {
             before(grammarAccess.getListItemCellDeclarationAccess().getMembersUIComponentMemberDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUIComponentMemberDeclaration_in_rule__ListItemCellDeclaration__MembersAssignment_313813);
            ruleUIComponentMemberDeclaration();

            state._fsp--;

             after(grammarAccess.getListItemCellDeclarationAccess().getMembersUIComponentMemberDeclarationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ListItemCellDeclaration__MembersAssignment_3"


    // $ANTLR start "rule__UIComponentDeclaration__NameAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6889:1: rule__UIComponentDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UIComponentDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6893:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6894:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6894:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6895:1: RULE_ID
            {
             before(grammarAccess.getUIComponentDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UIComponentDeclaration__NameAssignment_113844); 
             after(grammarAccess.getUIComponentDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UIComponentDeclaration__NameAssignment_1"


    // $ANTLR start "rule__UIComponentDeclaration__MembersAssignment_3"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6904:1: rule__UIComponentDeclaration__MembersAssignment_3 : ( ruleUIComponentMemberDeclaration ) ;
    public final void rule__UIComponentDeclaration__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6908:1: ( ( ruleUIComponentMemberDeclaration ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6909:1: ( ruleUIComponentMemberDeclaration )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6909:1: ( ruleUIComponentMemberDeclaration )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6910:1: ruleUIComponentMemberDeclaration
            {
             before(grammarAccess.getUIComponentDeclarationAccess().getMembersUIComponentMemberDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUIComponentMemberDeclaration_in_rule__UIComponentDeclaration__MembersAssignment_313875);
            ruleUIComponentMemberDeclaration();

            state._fsp--;

             after(grammarAccess.getUIComponentDeclarationAccess().getMembersUIComponentMemberDeclarationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__UIComponentDeclaration__MembersAssignment_3"


    // $ANTLR start "rule__UIComponentMemberDeclaration__TypeAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6919:1: rule__UIComponentMemberDeclaration__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UIComponentMemberDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6923:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6924:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6924:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6925:1: ( RULE_ID )
            {
             before(grammarAccess.getUIComponentMemberDeclarationAccess().getTypeUIComponentOrDataTypeCrossReference_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6926:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6927:1: RULE_ID
            {
             before(grammarAccess.getUIComponentMemberDeclarationAccess().getTypeUIComponentOrDataTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UIComponentMemberDeclaration__TypeAssignment_013910); 
             after(grammarAccess.getUIComponentMemberDeclarationAccess().getTypeUIComponentOrDataTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUIComponentMemberDeclarationAccess().getTypeUIComponentOrDataTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__UIComponentMemberDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__UIComponentMemberDeclaration__NameAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6938:1: rule__UIComponentMemberDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UIComponentMemberDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6942:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6943:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6943:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6944:1: RULE_ID
            {
             before(grammarAccess.getUIComponentMemberDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UIComponentMemberDeclaration__NameAssignment_113945); 
             after(grammarAccess.getUIComponentMemberDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UIComponentMemberDeclaration__NameAssignment_1"


    // $ANTLR start "rule__RESTMethodCall__DatasourceAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6953:1: rule__RESTMethodCall__DatasourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RESTMethodCall__DatasourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6957:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6958:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6958:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6959:1: ( RULE_ID )
            {
             before(grammarAccess.getRESTMethodCallAccess().getDatasourceDataSourceCallCrossReference_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6960:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6961:1: RULE_ID
            {
             before(grammarAccess.getRESTMethodCallAccess().getDatasourceDataSourceCallIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RESTMethodCall__DatasourceAssignment_013980); 
             after(grammarAccess.getRESTMethodCallAccess().getDatasourceDataSourceCallIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRESTMethodCallAccess().getDatasourceDataSourceCallCrossReference_0_0()); 

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
    // $ANTLR end "rule__RESTMethodCall__DatasourceAssignment_0"


    // $ANTLR start "rule__RESTMethodCall__RestMethodAssignment_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6972:1: rule__RESTMethodCall__RestMethodAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RESTMethodCall__RestMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6976:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6977:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6977:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6978:1: ( RULE_ID )
            {
             before(grammarAccess.getRESTMethodCallAccess().getRestMethodDataSourceAccessMethodCrossReference_2_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6979:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6980:1: RULE_ID
            {
             before(grammarAccess.getRESTMethodCallAccess().getRestMethodDataSourceAccessMethodIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RESTMethodCall__RestMethodAssignment_214019); 
             after(grammarAccess.getRESTMethodCallAccess().getRestMethodDataSourceAccessMethodIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRESTMethodCallAccess().getRestMethodDataSourceAccessMethodCrossReference_2_0()); 

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
    // $ANTLR end "rule__RESTMethodCall__RestMethodAssignment_2"


    // $ANTLR start "rule__DataSourceCall__DatasourceAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6991:1: rule__DataSourceCall__DatasourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DataSourceCall__DatasourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6995:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6996:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6996:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6997:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceCallAccess().getDatasourceDataSourceCrossReference_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6998:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6999:1: RULE_ID
            {
             before(grammarAccess.getDataSourceCallAccess().getDatasourceDataSourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSourceCall__DatasourceAssignment_014058); 
             after(grammarAccess.getDataSourceCallAccess().getDatasourceDataSourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDataSourceCallAccess().getDatasourceDataSourceCrossReference_0_0()); 

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
    // $ANTLR end "rule__DataSourceCall__DatasourceAssignment_0"


    // $ANTLR start "rule__DataSourceCall__NameAssignment_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7010:1: rule__DataSourceCall__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataSourceCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7014:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7015:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7015:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7016:1: RULE_ID
            {
             before(grammarAccess.getDataSourceCallAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSourceCall__NameAssignment_214093); 
             after(grammarAccess.getDataSourceCallAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataSourceCall__NameAssignment_2"


    // $ANTLR start "rule__UIComponentMemberConfiguration__TypeAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7025:1: rule__UIComponentMemberConfiguration__TypeAssignment_0 : ( ruleUIComponentMemberCall ) ;
    public final void rule__UIComponentMemberConfiguration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7029:1: ( ( ruleUIComponentMemberCall ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7030:1: ( ruleUIComponentMemberCall )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7030:1: ( ruleUIComponentMemberCall )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7031:1: ruleUIComponentMemberCall
            {
             before(grammarAccess.getUIComponentMemberConfigurationAccess().getTypeUIComponentMemberCallParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUIComponentMemberCall_in_rule__UIComponentMemberConfiguration__TypeAssignment_014124);
            ruleUIComponentMemberCall();

            state._fsp--;

             after(grammarAccess.getUIComponentMemberConfigurationAccess().getTypeUIComponentMemberCallParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__UIComponentMemberConfiguration__TypeAssignment_0"


    // $ANTLR start "rule__UIComponentMemberConfiguration__ValueAssignment_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7040:1: rule__UIComponentMemberConfiguration__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__UIComponentMemberConfiguration__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7044:1: ( ( ruleExpression ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7045:1: ( ruleExpression )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7045:1: ( ruleExpression )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7046:1: ruleExpression
            {
             before(grammarAccess.getUIComponentMemberConfigurationAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__UIComponentMemberConfiguration__ValueAssignment_214155);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getUIComponentMemberConfigurationAccess().getValueExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UIComponentMemberConfiguration__ValueAssignment_2"


    // $ANTLR start "rule__UIComponentMemberCall__ComponentAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7055:1: rule__UIComponentMemberCall__ComponentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UIComponentMemberCall__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7059:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7060:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7060:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7061:1: ( RULE_ID )
            {
             before(grammarAccess.getUIComponentMemberCallAccess().getComponentUIComponentMemberDeclarationCrossReference_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7062:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7063:1: RULE_ID
            {
             before(grammarAccess.getUIComponentMemberCallAccess().getComponentUIComponentMemberDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UIComponentMemberCall__ComponentAssignment_014190); 
             after(grammarAccess.getUIComponentMemberCallAccess().getComponentUIComponentMemberDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUIComponentMemberCallAccess().getComponentUIComponentMemberDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__UIComponentMemberCall__ComponentAssignment_0"


    // $ANTLR start "rule__UIComponentMemberCall__MemberAssignment_1_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7074:1: rule__UIComponentMemberCall__MemberAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__UIComponentMemberCall__MemberAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7078:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7079:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7079:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7080:1: ( RULE_ID )
            {
             before(grammarAccess.getUIComponentMemberCallAccess().getMemberUIComponentMemberDeclarationCrossReference_1_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7081:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7082:1: RULE_ID
            {
             before(grammarAccess.getUIComponentMemberCallAccess().getMemberUIComponentMemberDeclarationIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UIComponentMemberCall__MemberAssignment_1_114229); 
             after(grammarAccess.getUIComponentMemberCallAccess().getMemberUIComponentMemberDeclarationIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getUIComponentMemberCallAccess().getMemberUIComponentMemberDeclarationCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__UIComponentMemberCall__MemberAssignment_1_1"


    // $ANTLR start "rule__EntityMemberCall__HeadAssignment_0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7093:1: rule__EntityMemberCall__HeadAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EntityMemberCall__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7097:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7098:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7098:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7099:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityMemberCallAccess().getHeadAttributeCrossReference_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7100:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7101:1: RULE_ID
            {
             before(grammarAccess.getEntityMemberCallAccess().getHeadAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityMemberCall__HeadAssignment_014268); 
             after(grammarAccess.getEntityMemberCallAccess().getHeadAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEntityMemberCallAccess().getHeadAttributeCrossReference_0_0()); 

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
    // $ANTLR end "rule__EntityMemberCall__HeadAssignment_0"


    // $ANTLR start "rule__EntityMemberCall__TailAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7112:1: rule__EntityMemberCall__TailAssignment_1 : ( ruleEntityMemberCallTail ) ;
    public final void rule__EntityMemberCall__TailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7116:1: ( ( ruleEntityMemberCallTail ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7117:1: ( ruleEntityMemberCallTail )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7117:1: ( ruleEntityMemberCallTail )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7118:1: ruleEntityMemberCallTail
            {
             before(grammarAccess.getEntityMemberCallAccess().getTailEntityMemberCallTailParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntityMemberCallTail_in_rule__EntityMemberCall__TailAssignment_114303);
            ruleEntityMemberCallTail();

            state._fsp--;

             after(grammarAccess.getEntityMemberCallAccess().getTailEntityMemberCallTailParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityMemberCall__TailAssignment_1"


    // $ANTLR start "rule__EntityMemberCallTail__HeadAssignment_1"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7127:1: rule__EntityMemberCallTail__HeadAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityMemberCallTail__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7131:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7132:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7132:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7133:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityMemberCallTailAccess().getHeadAttributeCrossReference_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7134:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7135:1: RULE_ID
            {
             before(grammarAccess.getEntityMemberCallTailAccess().getHeadAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityMemberCallTail__HeadAssignment_114338); 
             after(grammarAccess.getEntityMemberCallTailAccess().getHeadAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityMemberCallTailAccess().getHeadAttributeCrossReference_1_0()); 

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
    // $ANTLR end "rule__EntityMemberCallTail__HeadAssignment_1"


    // $ANTLR start "rule__EntityMemberCallTail__TailAssignment_2"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7146:1: rule__EntityMemberCallTail__TailAssignment_2 : ( ruleEntityMemberCallTail ) ;
    public final void rule__EntityMemberCallTail__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7150:1: ( ( ruleEntityMemberCallTail ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7151:1: ( ruleEntityMemberCallTail )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7151:1: ( ruleEntityMemberCallTail )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7152:1: ruleEntityMemberCallTail
            {
             before(grammarAccess.getEntityMemberCallTailAccess().getTailEntityMemberCallTailParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntityMemberCallTail_in_rule__EntityMemberCallTail__TailAssignment_214373);
            ruleEntityMemberCallTail();

            state._fsp--;

             after(grammarAccess.getEntityMemberCallTailAccess().getTailEntityMemberCallTailParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EntityMemberCallTail__TailAssignment_2"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7162:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7166:1: ( ( RULE_STRING ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7167:1: ( RULE_STRING )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7167:1: ( RULE_STRING )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7168:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment14405); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000604020C09002L});
    public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElement__Alternatives_in_ruleNamedElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_entryRuleKeywordedID242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeywordedID249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeywordedID__Alternatives_in_ruleKeywordedID275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0_in_rulePlatform515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatformMapping_in_entryRulePlatformMapping542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatformMapping549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMapping_in_rulePlatformMapping575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMapping_in_entryRuleTypeMapping601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMapping608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__0_in_ruleTypeMapping634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_entryRuleDataSource661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSource668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__0_in_ruleDataSource694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceAccessMethod_in_entryRuleDataSourceAccessMethod721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceAccessMethod728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__0_in_ruleDataSourceAccessMethod754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTSpecification_in_entryRuleRESTSpecification781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTSpecification788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__0_in_ruleRESTSpecification814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceBodySpecification_in_entryRuleDataSourceBodySpecification841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceBodySpecification848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceBodySpecification__BodycontentsAssignment_in_ruleDataSourceBodySpecification874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTURL_in_entryRuleRESTURL961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTURL968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTURL__Alternatives_in_ruleRESTURL994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_entryRuleAbsoluteRESTURL1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteRESTURL1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__0_in_ruleAbsoluteRESTURL1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeRESTURL_in_entryRuleRelativeRESTURL1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeRESTURL1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__0_in_ruleRelativeRESTURL1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_entryRuleUrlFragment1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlFragment1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlFragment__Alternatives_in_ruleUrlFragment1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPathFragment_in_entryRuleUrlPathFragment1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlPathFragment1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlPathFragment__NameAssignment_in_ruleUrlPathFragment1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreen_in_entryRuleScreen1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreen1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__0_in_ruleScreen1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenSection_in_entryRuleScreenSection1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenSection1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__0_in_ruleScreenSection1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenSectionItems_in_entryRuleScreenSectionItems1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenSectionItems1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__Group__0_in_ruleScreenSectionItems1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenListItemCell_in_entryRuleScreenListItemCell1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenListItemCell1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__0_in_ruleScreenListItemCell1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListItemCellDeclaration_in_entryRuleListItemCellDeclaration1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListItemCellDeclaration1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__Group__0_in_ruleListItemCellDeclaration1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentDeclaration_in_entryRuleUIComponentDeclaration1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentDeclaration1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__Group__0_in_ruleUIComponentDeclaration1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberDeclaration_in_entryRuleUIComponentMemberDeclaration1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentMemberDeclaration1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberDeclaration__Group__0_in_ruleUIComponentMemberDeclaration1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTMethodCall_in_entryRuleRESTMethodCall1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTMethodCall1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__Group__0_in_ruleRESTMethodCall1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceCall_in_entryRuleDataSourceCall1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceCall1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceCall__Group__0_in_ruleDataSourceCall1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberConfiguration_in_entryRuleUIComponentMemberConfiguration1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentMemberConfiguration1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberConfiguration__Group__0_in_ruleUIComponentMemberConfiguration1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberCall_in_entryRuleUIComponentMemberCall1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentMemberCall1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberCall__Group__0_in_ruleUIComponentMemberCall2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCall_in_entryRuleEntityMemberCall2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityMemberCall2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCall__Group__0_in_ruleEntityMemberCall2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCallTail_in_entryRuleEntityMemberCallTail2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityMemberCallTail2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCallTail__Group__0_in_ruleEntityMemberCallTail2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTVerb__Alternatives_in_ruleRESTVerb2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenKind__Alternatives_in_ruleScreenKind2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__NamedElement__Alternatives2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_rule__NamedElement__Alternatives2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_rule__NamedElement__Alternatives2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreen_in_rule__NamedElement__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentDeclaration_in_rule__NamedElement__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListItemCellDeclaration_in_rule__NamedElement__Alternatives2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__KeywordedID__Alternatives2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__KeywordedID__Alternatives2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__KeywordedID__Alternatives2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__KeywordedID__Alternatives2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__KeywordedID__Alternatives2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KeywordedID__Alternatives2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_rule__RESTURL__Alternatives2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeRESTURL_in_rule__RESTURL__Alternatives2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPathFragment_in_rule__UrlFragment__Alternatives2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__UrlFragment__Alternatives2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCall_in_rule__Expression__Alternatives2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RESTVerb__Alternatives2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RESTVerb__Alternatives2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RESTVerb__Alternatives2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RESTVerb__Alternatives2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ScreenKind__Alternatives2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ScreenKind__Alternatives2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02966 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataType__Group__0__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03089 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AbstractAssignment_0_in_rule__Entity__Group__0__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group__1__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23212 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33272 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43333 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entity__Group__4__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53395 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__53398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_5_in_rule__Entity__Group__5__Impl3425 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__63456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group__6__Impl3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__03529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__03532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group_3__0__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__13591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03652 = new BitSet(new long[]{0x000080000000F810L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13712 = new BitSet(new long[]{0x000080000000F810L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__1__Impl3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__03836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__03839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Platform__Group__0__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__13898 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__13901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__NameAssignment_1_in_rule__Platform__Group__1__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__23958 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__23961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Platform__Group__2__Impl3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__34020 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__Platform__Group__4_in_rule__Platform__Group__34023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__MappingsAssignment_3_in_rule__Platform__Group__3__Impl4050 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__4__Impl_in_rule__Platform__Group__44081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Platform__Group__4__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__0__Impl_in_rule__TypeMapping__Group__04150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__1_in_rule__TypeMapping__Group__04153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TypeMapping__Group__0__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__1__Impl_in_rule__TypeMapping__Group__14212 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__2_in_rule__TypeMapping__Group__14215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__TypeAssignment_1_in_rule__TypeMapping__Group__1__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__2__Impl_in_rule__TypeMapping__Group__24272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__3_in_rule__TypeMapping__Group__24275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TypeMapping__Group__2__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__Group__3__Impl_in_rule__TypeMapping__Group__34334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMapping__SimpleNameAssignment_3_in_rule__TypeMapping__Group__3__Impl4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__0__Impl_in_rule__DataSource__Group__04399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataSource__Group__1_in_rule__DataSource__Group__04402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DataSource__Group__0__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__1__Impl_in_rule__DataSource__Group__14461 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__2_in_rule__DataSource__Group__14464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__NameAssignment_1_in_rule__DataSource__Group__1__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__2__Impl_in_rule__DataSource__Group__24521 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__3_in_rule__DataSource__Group__24524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataSource__Group__2__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__3__Impl_in_rule__DataSource__Group__34583 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__4_in_rule__DataSource__Group__34586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataSource__Group__3__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__4__Impl_in_rule__DataSource__Group__44645 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__5_in_rule__DataSource__Group__44648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DataSource__Group__4__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__5__Impl_in_rule__DataSource__Group__54707 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__6_in_rule__DataSource__Group__54710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__BaseUrlAssignment_5_in_rule__DataSource__Group__5__Impl4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__6__Impl_in_rule__DataSource__Group__64767 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DataSource__Group__7_in_rule__DataSource__Group__64770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataSource__Group__6__Impl4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__7__Impl_in_rule__DataSource__Group__74829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataSource__Group__8_in_rule__DataSource__Group__74832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DataSource__Group__7__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__8__Impl_in_rule__DataSource__Group__84891 = new BitSet(new long[]{0x000000000200F810L});
    public static final BitSet FOLLOW_rule__DataSource__Group__9_in_rule__DataSource__Group__84894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__ResourceTypeAssignment_8_in_rule__DataSource__Group__8__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__Group__9__Impl_in_rule__DataSource__Group__94951 = new BitSet(new long[]{0x000000000200F810L});
    public static final BitSet FOLLOW_rule__DataSource__Group__10_in_rule__DataSource__Group__94954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSource__MethodsAssignment_9_in_rule__DataSource__Group__9__Impl4981 = new BitSet(new long[]{0x000000000000F812L});
    public static final BitSet FOLLOW_rule__DataSource__Group__10__Impl_in_rule__DataSource__Group__105012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DataSource__Group__10__Impl5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__0__Impl_in_rule__DataSourceAccessMethod__Group__05093 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__1_in_rule__DataSourceAccessMethod__Group__05096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__NameAssignment_0_in_rule__DataSourceAccessMethod__Group__0__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__1__Impl_in_rule__DataSourceAccessMethod__Group__15153 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__2_in_rule__DataSourceAccessMethod__Group__15156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DataSourceAccessMethod__Group__1__Impl5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__2__Impl_in_rule__DataSourceAccessMethod__Group__25215 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__3_in_rule__DataSourceAccessMethod__Group__25218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2__0_in_rule__DataSourceAccessMethod__Group__2__Impl5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__3__Impl_in_rule__DataSourceAccessMethod__Group__35276 = new BitSet(new long[]{0x00008000000F0000L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__4_in_rule__DataSourceAccessMethod__Group__35279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DataSourceAccessMethod__Group__3__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__4__Impl_in_rule__DataSourceAccessMethod__Group__45338 = new BitSet(new long[]{0x00008000000F0000L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__5_in_rule__DataSourceAccessMethod__Group__45341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__ReturnsManyAssignment_4_in_rule__DataSourceAccessMethod__Group__4__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group__5__Impl_in_rule__DataSourceAccessMethod__Group__55399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__RestSpecificationAssignment_5_in_rule__DataSourceAccessMethod__Group__5__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2__0__Impl_in_rule__DataSourceAccessMethod__Group_2__05468 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2__1_in_rule__DataSourceAccessMethod__Group_2__05471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0_in_rule__DataSourceAccessMethod__Group_2__0__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2__1__Impl_in_rule__DataSourceAccessMethod__Group_2__15528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2_1__0_in_rule__DataSourceAccessMethod__Group_2__1__Impl5555 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2_1__0__Impl_in_rule__DataSourceAccessMethod__Group_2_1__05590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2_1__1_in_rule__DataSourceAccessMethod__Group_2_1__05593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataSourceAccessMethod__Group_2_1__0__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__Group_2_1__1__Impl_in_rule__DataSourceAccessMethod__Group_2_1__15652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1_in_rule__DataSourceAccessMethod__Group_2_1__1__Impl5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__0__Impl_in_rule__RESTSpecification__Group__05713 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__1_in_rule__RESTSpecification__Group__05716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__VerbAssignment_0_in_rule__RESTSpecification__Group__0__Impl5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__1__Impl_in_rule__RESTSpecification__Group__15773 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__2_in_rule__RESTSpecification__Group__15776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__PathAssignment_1_in_rule__RESTSpecification__Group__1__Impl5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group__2__Impl_in_rule__RESTSpecification__Group__25833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__0_in_rule__RESTSpecification__Group__2__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__0__Impl_in_rule__RESTSpecification__Group_2__05897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__1_in_rule__RESTSpecification__Group_2__05900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RESTSpecification__Group_2__0__Impl5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__1__Impl_in_rule__RESTSpecification__Group_2__15959 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__2_in_rule__RESTSpecification__Group_2__15962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__BodyAssignment_2_1_in_rule__RESTSpecification__Group_2__1__Impl5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTSpecification__Group_2__2__Impl_in_rule__RESTSpecification__Group_2__26019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RESTSpecification__Group_2__2__Impl6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06084 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__0__Impl_in_rule__AbsoluteRESTURL__Group__06205 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__1_in_rule__AbsoluteRESTURL__Group__06208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__1__Impl_in_rule__AbsoluteRESTURL__Group__16266 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__2_in_rule__AbsoluteRESTURL__Group__16269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AbsoluteRESTURL__Group__1__Impl6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__2__Impl_in_rule__AbsoluteRESTURL__Group__26328 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__3_in_rule__AbsoluteRESTURL__Group__26331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__HostAssignment_2_in_rule__AbsoluteRESTURL__Group__2__Impl6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__3__Impl_in_rule__AbsoluteRESTURL__Group__36388 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__4_in_rule__AbsoluteRESTURL__Group__36391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_3__0_in_rule__AbsoluteRESTURL__Group__3__Impl6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group__4__Impl_in_rule__AbsoluteRESTURL__Group__46449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_4__0_in_rule__AbsoluteRESTURL__Group__4__Impl6476 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_3__0__Impl_in_rule__AbsoluteRESTURL__Group_3__06517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_3__1_in_rule__AbsoluteRESTURL__Group_3__06520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AbsoluteRESTURL__Group_3__0__Impl6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_3__1__Impl_in_rule__AbsoluteRESTURL__Group_3__16579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__PortAssignment_3_1_in_rule__AbsoluteRESTURL__Group_3__1__Impl6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_4__0__Impl_in_rule__AbsoluteRESTURL__Group_4__06640 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_4__1_in_rule__AbsoluteRESTURL__Group_4__06643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AbsoluteRESTURL__Group_4__0__Impl6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__Group_4__1__Impl_in_rule__AbsoluteRESTURL__Group_4__16702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbsoluteRESTURL__FragmentsAssignment_4_1_in_rule__AbsoluteRESTURL__Group_4__1__Impl6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__0__Impl_in_rule__RelativeRESTURL__Group__06763 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__1_in_rule__RelativeRESTURL__Group__06766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__1__Impl_in_rule__RelativeRESTURL__Group__16824 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__2_in_rule__RelativeRESTURL__Group__16827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RelativeRESTURL__Group__1__Impl6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__2__Impl_in_rule__RelativeRESTURL__Group__26886 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__3_in_rule__RelativeRESTURL__Group__26889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__FragmentsAssignment_2_in_rule__RelativeRESTURL__Group__2__Impl6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group__3__Impl_in_rule__RelativeRESTURL__Group__36946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group_3__0_in_rule__RelativeRESTURL__Group__3__Impl6973 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group_3__0__Impl_in_rule__RelativeRESTURL__Group_3__07012 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group_3__1_in_rule__RelativeRESTURL__Group_3__07015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RelativeRESTURL__Group_3__0__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__Group_3__1__Impl_in_rule__RelativeRESTURL__Group_3__17074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeRESTURL__FragmentsAssignment_3_1_in_rule__RelativeRESTURL__Group_3__1__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__07135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__07138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable__Group__0__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__17197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ParameterReferenceAssignment_1_in_rule__Variable__Group__1__Impl7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07258 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7344 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__0__Impl_in_rule__Screen__Group__07501 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Screen__Group__1_in_rule__Screen__Group__07504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Screen__Group__0__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__1__Impl_in_rule__Screen__Group__17563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Screen__Group__2_in_rule__Screen__Group__17566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__KindAssignment_1_in_rule__Screen__Group__1__Impl7593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__2__Impl_in_rule__Screen__Group__27623 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Screen__Group__3_in_rule__Screen__Group__27626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__NameAssignment_2_in_rule__Screen__Group__2__Impl7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__3__Impl_in_rule__Screen__Group__37683 = new BitSet(new long[]{0x0000008020000800L});
    public static final BitSet FOLLOW_rule__Screen__Group__4_in_rule__Screen__Group__37686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Screen__Group__3__Impl7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__4__Impl_in_rule__Screen__Group__47745 = new BitSet(new long[]{0x0000008020000800L});
    public static final BitSet FOLLOW_rule__Screen__Group__5_in_rule__Screen__Group__47748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group_4__0_in_rule__Screen__Group__4__Impl7775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__5__Impl_in_rule__Screen__Group__57806 = new BitSet(new long[]{0x0000008020000800L});
    public static final BitSet FOLLOW_rule__Screen__Group__6_in_rule__Screen__Group__57809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group_5__0_in_rule__Screen__Group__5__Impl7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__6__Impl_in_rule__Screen__Group__67867 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Screen__Group__7_in_rule__Screen__Group__67870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Screen__Group__6__Impl7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__7__Impl_in_rule__Screen__Group__77929 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_rule__Screen__Group__8_in_rule__Screen__Group__77932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Screen__Group__7__Impl7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__8__Impl_in_rule__Screen__Group__87991 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_rule__Screen__Group__9_in_rule__Screen__Group__87994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__SectionsAssignment_8_in_rule__Screen__Group__8__Impl8021 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Screen__Group__9__Impl_in_rule__Screen__Group__98052 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Screen__Group__10_in_rule__Screen__Group__98055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Screen__Group__9__Impl8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group__10__Impl_in_rule__Screen__Group__108114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Screen__Group__10__Impl8142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group_4__0__Impl_in_rule__Screen__Group_4__08195 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Screen__Group_4__1_in_rule__Screen__Group_4__08198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Screen__Group_4__0__Impl8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group_4__1__Impl_in_rule__Screen__Group_4__18257 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Screen__Group_4__2_in_rule__Screen__Group_4__18260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Screen__Group_4__1__Impl8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group_4__2__Impl_in_rule__Screen__Group_4__28319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__TitleAssignment_4_2_in_rule__Screen__Group_4__2__Impl8346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group_5__0__Impl_in_rule__Screen__Group_5__08382 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Screen__Group_5__1_in_rule__Screen__Group_5__08385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Screen__Group_5__0__Impl8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group_5__1__Impl_in_rule__Screen__Group_5__18444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Screen__Group_5__2_in_rule__Screen__Group_5__18447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Screen__Group_5__1__Impl8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__Group_5__2__Impl_in_rule__Screen__Group_5__28506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Screen__DatasourceAssignment_5_2_in_rule__Screen__Group_5__2__Impl8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__0__Impl_in_rule__ScreenSection__Group__08569 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__1_in_rule__ScreenSection__Group__08572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ScreenSection__Group__0__Impl8600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__1__Impl_in_rule__ScreenSection__Group__18631 = new BitSet(new long[]{0x0000020020000800L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__2_in_rule__ScreenSection__Group__18634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ScreenSection__Group__1__Impl8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__2__Impl_in_rule__ScreenSection__Group__28693 = new BitSet(new long[]{0x0000020020000800L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__3_in_rule__ScreenSection__Group__28696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_2__0_in_rule__ScreenSection__Group__2__Impl8723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__3__Impl_in_rule__ScreenSection__Group__38754 = new BitSet(new long[]{0x0000020020000800L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__4_in_rule__ScreenSection__Group__38757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_3__0_in_rule__ScreenSection__Group__3__Impl8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__4__Impl_in_rule__ScreenSection__Group__48815 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__5_in_rule__ScreenSection__Group__48818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__ItemsAssignment_4_in_rule__ScreenSection__Group__4__Impl8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group__5__Impl_in_rule__ScreenSection__Group__58875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ScreenSection__Group__5__Impl8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_2__0__Impl_in_rule__ScreenSection__Group_2__08946 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_2__1_in_rule__ScreenSection__Group_2__08949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ScreenSection__Group_2__0__Impl8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_2__1__Impl_in_rule__ScreenSection__Group_2__19008 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_2__2_in_rule__ScreenSection__Group_2__19011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ScreenSection__Group_2__1__Impl9039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_2__2__Impl_in_rule__ScreenSection__Group_2__29070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__TitleAssignment_2_2_in_rule__ScreenSection__Group_2__2__Impl9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_3__0__Impl_in_rule__ScreenSection__Group_3__09133 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_3__1_in_rule__ScreenSection__Group_3__09136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ScreenSection__Group_3__0__Impl9164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_3__1__Impl_in_rule__ScreenSection__Group_3__19195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_3__2_in_rule__ScreenSection__Group_3__19198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ScreenSection__Group_3__1__Impl9226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__Group_3__2__Impl_in_rule__ScreenSection__Group_3__29257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSection__DatasourceAssignment_3_2_in_rule__ScreenSection__Group_3__2__Impl9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__Group__0__Impl_in_rule__ScreenSectionItems__Group__09320 = new BitSet(new long[]{0x0000020020000800L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__Group__1_in_rule__ScreenSectionItems__Group__09323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__Group__1__Impl_in_rule__ScreenSectionItems__Group__19381 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__Group__2_in_rule__ScreenSectionItems__Group__19384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ScreenSectionItems__Group__1__Impl9412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__Group__2__Impl_in_rule__ScreenSectionItems__Group__29443 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__Group__3_in_rule__ScreenSectionItems__Group__29446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ScreenSectionItems__Group__2__Impl9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__Group__3__Impl_in_rule__ScreenSectionItems__Group__39505 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__Group__4_in_rule__ScreenSectionItems__Group__39508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__ItemsAssignment_3_in_rule__ScreenSectionItems__Group__3__Impl9535 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__ScreenSectionItems__Group__4__Impl_in_rule__ScreenSectionItems__Group__49566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ScreenSectionItems__Group__4__Impl9594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__0__Impl_in_rule__ScreenListItemCell__Group__09635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__1_in_rule__ScreenListItemCell__Group__09638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ScreenListItemCell__Group__0__Impl9666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__1__Impl_in_rule__ScreenListItemCell__Group__19697 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__2_in_rule__ScreenListItemCell__Group__19700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__TypeAssignment_1_in_rule__ScreenListItemCell__Group__1__Impl9727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__2__Impl_in_rule__ScreenListItemCell__Group__29757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__3_in_rule__ScreenListItemCell__Group__29760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ScreenListItemCell__Group__2__Impl9788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__3__Impl_in_rule__ScreenListItemCell__Group__39819 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__4_in_rule__ScreenListItemCell__Group__39822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__RestMethodAssignment_3_in_rule__ScreenListItemCell__Group__3__Impl9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__4__Impl_in_rule__ScreenListItemCell__Group__49879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__5_in_rule__ScreenListItemCell__Group__49882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ScreenListItemCell__Group__4__Impl9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__5__Impl_in_rule__ScreenListItemCell__Group__59941 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__6_in_rule__ScreenListItemCell__Group__59944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__VariableAssignment_5_in_rule__ScreenListItemCell__Group__5__Impl9971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__6__Impl_in_rule__ScreenListItemCell__Group__610001 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__7_in_rule__ScreenListItemCell__Group__610004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ScreenListItemCell__Group__6__Impl10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__7__Impl_in_rule__ScreenListItemCell__Group__710063 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__8_in_rule__ScreenListItemCell__Group__710066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__ConfigurationsAssignment_7_in_rule__ScreenListItemCell__Group__7__Impl10093 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ScreenListItemCell__Group__8__Impl_in_rule__ScreenListItemCell__Group__810124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ScreenListItemCell__Group__8__Impl10152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__Group__0__Impl_in_rule__ListItemCellDeclaration__Group__010201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__Group__1_in_rule__ListItemCellDeclaration__Group__010204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ListItemCellDeclaration__Group__0__Impl10232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__Group__1__Impl_in_rule__ListItemCellDeclaration__Group__110263 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__Group__2_in_rule__ListItemCellDeclaration__Group__110266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__NameAssignment_1_in_rule__ListItemCellDeclaration__Group__1__Impl10293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__Group__2__Impl_in_rule__ListItemCellDeclaration__Group__210323 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__Group__3_in_rule__ListItemCellDeclaration__Group__210326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ListItemCellDeclaration__Group__2__Impl10354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__Group__3__Impl_in_rule__ListItemCellDeclaration__Group__310385 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__Group__4_in_rule__ListItemCellDeclaration__Group__310388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__MembersAssignment_3_in_rule__ListItemCellDeclaration__Group__3__Impl10415 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ListItemCellDeclaration__Group__4__Impl_in_rule__ListItemCellDeclaration__Group__410446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ListItemCellDeclaration__Group__4__Impl10474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__Group__0__Impl_in_rule__UIComponentDeclaration__Group__010515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__Group__1_in_rule__UIComponentDeclaration__Group__010518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__UIComponentDeclaration__Group__0__Impl10546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__Group__1__Impl_in_rule__UIComponentDeclaration__Group__110577 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__Group__2_in_rule__UIComponentDeclaration__Group__110580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__NameAssignment_1_in_rule__UIComponentDeclaration__Group__1__Impl10607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__Group__2__Impl_in_rule__UIComponentDeclaration__Group__210637 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__Group__3_in_rule__UIComponentDeclaration__Group__210640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UIComponentDeclaration__Group__2__Impl10668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__Group__3__Impl_in_rule__UIComponentDeclaration__Group__310699 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__Group__4_in_rule__UIComponentDeclaration__Group__310702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__MembersAssignment_3_in_rule__UIComponentDeclaration__Group__3__Impl10729 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__UIComponentDeclaration__Group__4__Impl_in_rule__UIComponentDeclaration__Group__410760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UIComponentDeclaration__Group__4__Impl10788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberDeclaration__Group__0__Impl_in_rule__UIComponentMemberDeclaration__Group__010829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UIComponentMemberDeclaration__Group__1_in_rule__UIComponentMemberDeclaration__Group__010832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberDeclaration__TypeAssignment_0_in_rule__UIComponentMemberDeclaration__Group__0__Impl10859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberDeclaration__Group__1__Impl_in_rule__UIComponentMemberDeclaration__Group__110889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberDeclaration__NameAssignment_1_in_rule__UIComponentMemberDeclaration__Group__1__Impl10916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__Group__0__Impl_in_rule__RESTMethodCall__Group__010950 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__Group__1_in_rule__RESTMethodCall__Group__010953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__DatasourceAssignment_0_in_rule__RESTMethodCall__Group__0__Impl10980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__Group__1__Impl_in_rule__RESTMethodCall__Group__111010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__Group__2_in_rule__RESTMethodCall__Group__111013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RESTMethodCall__Group__1__Impl11041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__Group__2__Impl_in_rule__RESTMethodCall__Group__211072 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__Group__3_in_rule__RESTMethodCall__Group__211075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__RestMethodAssignment_2_in_rule__RESTMethodCall__Group__2__Impl11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__Group__3__Impl_in_rule__RESTMethodCall__Group__311132 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__Group__4_in_rule__RESTMethodCall__Group__311135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RESTMethodCall__Group__3__Impl11163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTMethodCall__Group__4__Impl_in_rule__RESTMethodCall__Group__411194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RESTMethodCall__Group__4__Impl11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceCall__Group__0__Impl_in_rule__DataSourceCall__Group__011263 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__DataSourceCall__Group__1_in_rule__DataSourceCall__Group__011266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceCall__DatasourceAssignment_0_in_rule__DataSourceCall__Group__0__Impl11293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceCall__Group__1__Impl_in_rule__DataSourceCall__Group__111323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataSourceCall__Group__2_in_rule__DataSourceCall__Group__111326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DataSourceCall__Group__1__Impl11354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceCall__Group__2__Impl_in_rule__DataSourceCall__Group__211385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSourceCall__NameAssignment_2_in_rule__DataSourceCall__Group__2__Impl11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberConfiguration__Group__0__Impl_in_rule__UIComponentMemberConfiguration__Group__011448 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__UIComponentMemberConfiguration__Group__1_in_rule__UIComponentMemberConfiguration__Group__011451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberConfiguration__TypeAssignment_0_in_rule__UIComponentMemberConfiguration__Group__0__Impl11478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberConfiguration__Group__1__Impl_in_rule__UIComponentMemberConfiguration__Group__111508 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__UIComponentMemberConfiguration__Group__2_in_rule__UIComponentMemberConfiguration__Group__111511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__UIComponentMemberConfiguration__Group__1__Impl11539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberConfiguration__Group__2__Impl_in_rule__UIComponentMemberConfiguration__Group__211570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberConfiguration__ValueAssignment_2_in_rule__UIComponentMemberConfiguration__Group__2__Impl11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberCall__Group__0__Impl_in_rule__UIComponentMemberCall__Group__011633 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__UIComponentMemberCall__Group__1_in_rule__UIComponentMemberCall__Group__011636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberCall__ComponentAssignment_0_in_rule__UIComponentMemberCall__Group__0__Impl11663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberCall__Group__1__Impl_in_rule__UIComponentMemberCall__Group__111693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberCall__Group_1__0_in_rule__UIComponentMemberCall__Group__1__Impl11720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberCall__Group_1__0__Impl_in_rule__UIComponentMemberCall__Group_1__011755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UIComponentMemberCall__Group_1__1_in_rule__UIComponentMemberCall__Group_1__011758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__UIComponentMemberCall__Group_1__0__Impl11786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberCall__Group_1__1__Impl_in_rule__UIComponentMemberCall__Group_1__111817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIComponentMemberCall__MemberAssignment_1_1_in_rule__UIComponentMemberCall__Group_1__1__Impl11844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCall__Group__0__Impl_in_rule__EntityMemberCall__Group__011878 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EntityMemberCall__Group__1_in_rule__EntityMemberCall__Group__011881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCall__HeadAssignment_0_in_rule__EntityMemberCall__Group__0__Impl11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCall__Group__1__Impl_in_rule__EntityMemberCall__Group__111938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCall__TailAssignment_1_in_rule__EntityMemberCall__Group__1__Impl11965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCallTail__Group__0__Impl_in_rule__EntityMemberCallTail__Group__012000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityMemberCallTail__Group__1_in_rule__EntityMemberCallTail__Group__012003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EntityMemberCallTail__Group__0__Impl12031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCallTail__Group__1__Impl_in_rule__EntityMemberCallTail__Group__112062 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EntityMemberCallTail__Group__2_in_rule__EntityMemberCallTail__Group__112065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCallTail__HeadAssignment_1_in_rule__EntityMemberCallTail__Group__1__Impl12092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCallTail__Group__2__Impl_in_rule__EntityMemberCallTail__Group__212122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityMemberCallTail__TailAssignment_2_in_rule__EntityMemberCallTail__Group__2__Impl12149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElement_in_rule__Model__ElementsAssignment12191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_rule__DataType__NameAssignment_112222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__AbstractAssignment_012258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_212297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_112332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_512367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_012402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Attribute__ManyAssignment_112442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_rule__Attribute__NameAssignment_212481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Platform__NameAssignment_112512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatformMapping_in_rule__Platform__MappingsAssignment_312543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeMapping__TypeAssignment_112578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeMapping__SimpleNameAssignment_312613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSource__NameAssignment_112644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_rule__DataSource__BaseUrlAssignment_512675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSource__ResourceTypeAssignment_812710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceAccessMethod_in_rule__DataSource__MethodsAssignment_912745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_rule__DataSourceAccessMethod__NameAssignment_012776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_012807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_112838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DataSourceAccessMethod__ReturnsManyAssignment_412874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTSpecification_in_rule__DataSourceAccessMethod__RestSpecificationAssignment_512913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTVerb_in_rule__RESTSpecification__VerbAssignment_012944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTURL_in_rule__RESTSpecification__PathAssignment_112975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceBodySpecification_in_rule__RESTSpecification__BodyAssignment_2_113006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSourceBodySpecification__BodycontentsAssignment13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_013080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_rule__Parameter__NameAssignment_113115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_rule__AbsoluteRESTURL__HostAssignment_213146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AbsoluteRESTURL__PortAssignment_3_113177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_rule__AbsoluteRESTURL__FragmentsAssignment_4_113208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_rule__RelativeRESTURL__FragmentsAssignment_213239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_rule__RelativeRESTURL__FragmentsAssignment_3_113270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__UrlPathFragment__NameAssignment13301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__ParameterReferenceAssignment_113336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenKind_in_rule__Screen__KindAssignment_113371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Screen__NameAssignment_213402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Screen__TitleAssignment_4_213433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceCall_in_rule__Screen__DatasourceAssignment_5_213464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenSection_in_rule__Screen__SectionsAssignment_813495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ScreenSection__TitleAssignment_2_213526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceCall_in_rule__ScreenSection__DatasourceAssignment_3_213557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenSectionItems_in_rule__ScreenSection__ItemsAssignment_413588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenListItemCell_in_rule__ScreenSectionItems__ItemsAssignment_313619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ScreenListItemCell__TypeAssignment_113654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTMethodCall_in_rule__ScreenListItemCell__RestMethodAssignment_313689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ScreenListItemCell__VariableAssignment_513720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberConfiguration_in_rule__ScreenListItemCell__ConfigurationsAssignment_713751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListItemCellDeclaration__NameAssignment_113782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberDeclaration_in_rule__ListItemCellDeclaration__MembersAssignment_313813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UIComponentDeclaration__NameAssignment_113844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberDeclaration_in_rule__UIComponentDeclaration__MembersAssignment_313875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UIComponentMemberDeclaration__TypeAssignment_013910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UIComponentMemberDeclaration__NameAssignment_113945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RESTMethodCall__DatasourceAssignment_013980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RESTMethodCall__RestMethodAssignment_214019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSourceCall__DatasourceAssignment_014058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSourceCall__NameAssignment_214093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberCall_in_rule__UIComponentMemberConfiguration__TypeAssignment_014124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__UIComponentMemberConfiguration__ValueAssignment_214155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UIComponentMemberCall__ComponentAssignment_014190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UIComponentMemberCall__MemberAssignment_1_114229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityMemberCall__HeadAssignment_014268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCallTail_in_rule__EntityMemberCall__TailAssignment_114303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityMemberCallTail__HeadAssignment_114338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCallTail_in_rule__EntityMemberCallTail__TailAssignment_214373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment14405 = new BitSet(new long[]{0x0000000000000002L});

}