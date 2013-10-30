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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'entity'", "'{'", "'}'", "'extends'", "'abstract'", "'[]'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==16) ) {
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


    // $ANTLR start "entryRuleType"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:88:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:89:1: ( ruleType EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:90:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType122);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType129); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:97:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:101:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:102:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:102:1: ( ( rule__Type__Alternatives ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:103:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:104:1: ( rule__Type__Alternatives )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:104:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType155);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:116:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:117:1: ( ruleDataType EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:118:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType182);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType189); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:125:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:129:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:130:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:130:1: ( ( rule__DataType__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:131:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:132:1: ( rule__DataType__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:132:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType215);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:144:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:145:1: ( ruleEntity EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:146:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity242);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity249); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:153:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:157:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:158:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:158:1: ( ( rule__Entity__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:159:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:160:1: ( rule__Entity__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:160:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity275);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:172:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:173:1: ( ruleAttribute EOF )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:174:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute302);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute309); 

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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:181:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:185:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:186:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:186:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:187:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:188:1: ( rule__Attribute__Group__0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:188:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute335);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:200:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:204:1: ( ( ruleDataType ) | ( ruleEntity ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12||LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:205:1: ( ruleDataType )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:205:1: ( ruleDataType )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:206:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives371);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:211:6: ( ruleEntity )
                    {
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:211:6: ( ruleEntity )
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:212:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives388);
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


    // $ANTLR start "rule__DataType__Group__0"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:224:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:228:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:229:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__0418);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__0421);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:236:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:240:1: ( ( 'datatype' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:241:1: ( 'datatype' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:241:1: ( 'datatype' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:242:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__DataType__Group__0__Impl449); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:255:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:259:1: ( rule__DataType__Group__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:260:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__1480);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:266:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:270:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:271:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:271:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:272:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:273:1: ( rule__DataType__NameAssignment_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:273:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl507);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:287:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:291:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:292:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0541);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0544);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:299:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__AbstractAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:303:1: ( ( ( rule__Entity__AbstractAssignment_0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:304:1: ( ( rule__Entity__AbstractAssignment_0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:304:1: ( ( rule__Entity__AbstractAssignment_0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:305:1: ( rule__Entity__AbstractAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getAbstractAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:306:1: ( rule__Entity__AbstractAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:306:2: rule__Entity__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__AbstractAssignment_0_in_rule__Entity__Group__0__Impl571);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:316:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:320:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:321:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1602);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1605);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:328:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:332:1: ( ( 'entity' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:333:1: ( 'entity' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:333:1: ( 'entity' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:334:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__1__Impl633); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:347:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:351:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:352:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2664);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2667);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:359:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:363:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:364:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:364:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:365:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:366:1: ( rule__Entity__NameAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:366:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl694);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:376:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:380:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:381:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3724);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3727);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:388:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:392:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:393:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:393:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:394:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:395:1: ( rule__Entity__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:395:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl754);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:405:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:409:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:410:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4785);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4788);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:417:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:421:1: ( ( '{' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:422:1: ( '{' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:422:1: ( '{' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:423:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__4__Impl816); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:436:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:440:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:441:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__5847);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__5850);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:448:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__AttributesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:452:1: ( ( ( rule__Entity__AttributesAssignment_5 )* ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:453:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:453:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:454:1: ( rule__Entity__AttributesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:455:1: ( rule__Entity__AttributesAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:455:2: rule__Entity__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_5_in_rule__Entity__Group__5__Impl877);
            	    rule__Entity__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:465:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:469:1: ( rule__Entity__Group__6__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:470:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__6908);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:476:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:480:1: ( ( '}' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:481:1: ( '}' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:481:1: ( '}' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:482:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__6__Impl936); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:509:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:513:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:514:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__0981);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__0984);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:521:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:525:1: ( ( 'extends' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:526:1: ( 'extends' )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:526:1: ( 'extends' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:527:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group_3__0__Impl1012); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:540:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:544:1: ( rule__Entity__Group_3__1__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:545:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__11043);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:551:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:555:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:556:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:556:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:557:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:558:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:558:2: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl1070);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:572:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:576:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:577:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01104);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01107);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:584:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:588:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:589:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:589:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:590:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:591:1: ( rule__Attribute__TypeAssignment_0 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:591:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl1134);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:601:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:605:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:606:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11164);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11167);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:613:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ManyAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:617:1: ( ( ( rule__Attribute__ManyAssignment_1 )? ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:618:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:618:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:619:1: ( rule__Attribute__ManyAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_1()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:620:1: ( rule__Attribute__ManyAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:620:2: rule__Attribute__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__1__Impl1194);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:630:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:634:1: ( rule__Attribute__Group__2__Impl )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:635:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21225);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:641:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:645:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:646:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:646:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:647:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:648:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:648:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl1252);
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


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:665:1: rule__Model__ElementsAssignment : ( ruleType ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:669:1: ( ( ruleType ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:670:1: ( ruleType )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:670:1: ( ruleType )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:671:1: ruleType
            {
             before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__ElementsAssignment1293);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:680:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:684:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:685:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:685:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:686:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_11324); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:695:1: rule__Entity__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Entity__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:699:1: ( ( ( 'abstract' ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:700:1: ( ( 'abstract' ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:700:1: ( ( 'abstract' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:701:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:702:1: ( 'abstract' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:703:1: 'abstract'
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Entity__AbstractAssignment_01360); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:718:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:722:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:723:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:723:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:724:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_21399); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:733:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:737:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:738:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:738:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:739:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:740:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:741:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_11434); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:752:1: rule__Entity__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:756:1: ( ( ruleAttribute ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:757:1: ( ruleAttribute )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:757:1: ( ruleAttribute )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:758:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_51469);
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:767:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:771:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:772:1: ( ( RULE_ID ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:772:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:773:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:774:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:775:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_01504); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:786:1: rule__Attribute__ManyAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__Attribute__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:790:1: ( ( ( '[]' ) ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:791:1: ( ( '[]' ) )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:791:1: ( ( '[]' ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:792:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:793:1: ( '[]' )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:794:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Attribute__ManyAssignment_11544); 
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
    // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:809:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:813:1: ( ( RULE_ID ) )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:814:1: ( RULE_ID )
            {
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:814:1: ( RULE_ID )
            // ../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g:815:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_21583); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000011802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__0418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__0421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataType__Group__0__Impl449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0541 = new BitSet(new long[]{0x0000000000011800L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AbstractAssignment_0_in_rule__Entity__Group__0__Impl571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__1__Impl633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2664 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3724 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4785 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__4__Impl816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__5847 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_5_in_rule__Entity__Group__5__Impl877 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__6__Impl936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__0981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__0984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group_3__0__Impl1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__11043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01104 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11164 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__1__Impl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__ElementsAssignment1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_11324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__AbstractAssignment_01360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_21399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_11434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_51469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_01504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attribute__ManyAssignment_11544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_21583 = new BitSet(new long[]{0x0000000000000002L});

}