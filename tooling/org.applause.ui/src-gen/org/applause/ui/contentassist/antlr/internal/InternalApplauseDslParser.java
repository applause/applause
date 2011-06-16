package org.applause.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.applause.services.ApplauseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'returns'", "'Default'", "'DefaultWithDisclosure'", "'Value2'", "'Double'", "'Subtitle'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'['", "']'", "'split('", "'tabbarApplication'", "'{'", "'}'", "'button'", "'title='", "'icon='", "'view='", "'const'", "'type'", "'mapsTo'", "'entity'", "'extends'", "'contentprovider'", "'fetches'", "'XML'", "'from'", "'selects'", "'tableview'", "'detailsview'", "'customview'", "'implementedBy'", "'header'", "'subtitle='", "'details='", "'image='", "'section'", "'cell'", "'foreach'", "'text='", "'action='", "'as'", "'[]'", "'derived'", "'resolves'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalApplauseDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g"; }


     
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




    // $ANTLR start entryRuleModel
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:62:1: ( ruleModel EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:77:1: ( rule__Model__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleApplication
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:89:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:90:1: ( ruleApplication EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:91:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication121);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication128); 

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
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:98:1: ruleApplication : ( ruleTabBarApplication ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:102:2: ( ( ruleTabBarApplication ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:103:1: ( ruleTabBarApplication )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:103:1: ( ruleTabBarApplication )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:104:1: ruleTabBarApplication
            {
             before(grammarAccess.getApplicationAccess().getTabBarApplicationParserRuleCall()); 
            pushFollow(FOLLOW_ruleTabBarApplication_in_ruleApplication154);
            ruleTabBarApplication();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getTabBarApplicationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleModelElement
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:117:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:118:1: ( ruleModelElement EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:119:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement180);
            ruleModelElement();
            _fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement187); 

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
    // $ANTLR end entryRuleModelElement


    // $ANTLR start ruleModelElement
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:126:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:130:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:131:1: ( ( rule__ModelElement__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:131:1: ( ( rule__ModelElement__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:132:1: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:133:1: ( rule__ModelElement__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:133:2: rule__ModelElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement213);
            rule__ModelElement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModelElement


    // $ANTLR start entryRuleTypeDescription
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:147:1: entryRuleTypeDescription : ruleTypeDescription EOF ;
    public final void entryRuleTypeDescription() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:148:1: ( ruleTypeDescription EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:149:1: ruleTypeDescription EOF
            {
             before(grammarAccess.getTypeDescriptionRule()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription242);
            ruleTypeDescription();
            _fsp--;

             after(grammarAccess.getTypeDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDescription249); 

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
    // $ANTLR end entryRuleTypeDescription


    // $ANTLR start ruleTypeDescription
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:156:1: ruleTypeDescription : ( ( rule__TypeDescription__Group__0 ) ) ;
    public final void ruleTypeDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:160:2: ( ( ( rule__TypeDescription__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:161:1: ( ( rule__TypeDescription__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:161:1: ( ( rule__TypeDescription__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:162:1: ( rule__TypeDescription__Group__0 )
            {
             before(grammarAccess.getTypeDescriptionAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:163:1: ( rule__TypeDescription__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:163:2: rule__TypeDescription__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__0_in_ruleTypeDescription275);
            rule__TypeDescription__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTypeDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypeDescription


    // $ANTLR start entryRuleParameter
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:175:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:176:1: ( ruleParameter EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:177:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter302);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter309); 

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
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:184:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:188:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:189:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:189:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:190:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:191:1: ( rule__Parameter__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:191:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter335);
            rule__Parameter__Group__0();
            _fsp--;


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
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleObjectReference
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:203:1: entryRuleObjectReference : ruleObjectReference EOF ;
    public final void entryRuleObjectReference() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:204:1: ( ruleObjectReference EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:205:1: ruleObjectReference EOF
            {
             before(grammarAccess.getObjectReferenceRule()); 
            pushFollow(FOLLOW_ruleObjectReference_in_entryRuleObjectReference362);
            ruleObjectReference();
            _fsp--;

             after(grammarAccess.getObjectReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectReference369); 

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
    // $ANTLR end entryRuleObjectReference


    // $ANTLR start ruleObjectReference
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:212:1: ruleObjectReference : ( ( rule__ObjectReference__Group__0 ) ) ;
    public final void ruleObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:216:2: ( ( ( rule__ObjectReference__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:217:1: ( ( rule__ObjectReference__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:217:1: ( ( rule__ObjectReference__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:218:1: ( rule__ObjectReference__Group__0 )
            {
             before(grammarAccess.getObjectReferenceAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:219:1: ( rule__ObjectReference__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:219:2: rule__ObjectReference__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__0_in_ruleObjectReference395);
            rule__ObjectReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getObjectReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleObjectReference


    // $ANTLR start entryRuleNestedObjectReference
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:231:1: entryRuleNestedObjectReference : ruleNestedObjectReference EOF ;
    public final void entryRuleNestedObjectReference() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:232:1: ( ruleNestedObjectReference EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:233:1: ruleNestedObjectReference EOF
            {
             before(grammarAccess.getNestedObjectReferenceRule()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference422);
            ruleNestedObjectReference();
            _fsp--;

             after(grammarAccess.getNestedObjectReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedObjectReference429); 

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
    // $ANTLR end entryRuleNestedObjectReference


    // $ANTLR start ruleNestedObjectReference
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:240:1: ruleNestedObjectReference : ( ( rule__NestedObjectReference__Group__0 ) ) ;
    public final void ruleNestedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:244:2: ( ( ( rule__NestedObjectReference__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:245:1: ( ( rule__NestedObjectReference__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:245:1: ( ( rule__NestedObjectReference__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:246:1: ( rule__NestedObjectReference__Group__0 )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:247:1: ( rule__NestedObjectReference__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:247:2: rule__NestedObjectReference__Group__0
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__0_in_ruleNestedObjectReference455);
            rule__NestedObjectReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNestedObjectReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNestedObjectReference


    // $ANTLR start entryRuleExpression
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:259:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:260:1: ( ruleExpression EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:261:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression482);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression489); 

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:268:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:272:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:273:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:273:1: ( ( rule__Expression__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:274:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:275:1: ( rule__Expression__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:275:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression515);
            rule__Expression__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleScalarExpression
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:287:1: entryRuleScalarExpression : ruleScalarExpression EOF ;
    public final void entryRuleScalarExpression() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:288:1: ( ruleScalarExpression EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:289:1: ruleScalarExpression EOF
            {
             before(grammarAccess.getScalarExpressionRule()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression542);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getScalarExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarExpression549); 

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
    // $ANTLR end entryRuleScalarExpression


    // $ANTLR start ruleScalarExpression
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:296:1: ruleScalarExpression : ( ( rule__ScalarExpression__Alternatives ) ) ;
    public final void ruleScalarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:300:2: ( ( ( rule__ScalarExpression__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:301:1: ( ( rule__ScalarExpression__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:301:1: ( ( rule__ScalarExpression__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:302:1: ( rule__ScalarExpression__Alternatives )
            {
             before(grammarAccess.getScalarExpressionAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:303:1: ( rule__ScalarExpression__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:303:2: rule__ScalarExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ScalarExpression__Alternatives_in_ruleScalarExpression575);
            rule__ScalarExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getScalarExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleScalarExpression


    // $ANTLR start entryRuleCollectionExpression
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:315:1: entryRuleCollectionExpression : ruleCollectionExpression EOF ;
    public final void entryRuleCollectionExpression() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:316:1: ( ruleCollectionExpression EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:317:1: ruleCollectionExpression EOF
            {
             before(grammarAccess.getCollectionExpressionRule()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression602);
            ruleCollectionExpression();
            _fsp--;

             after(grammarAccess.getCollectionExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression609); 

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
    // $ANTLR end entryRuleCollectionExpression


    // $ANTLR start ruleCollectionExpression
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:324:1: ruleCollectionExpression : ( ( rule__CollectionExpression__Alternatives ) ) ;
    public final void ruleCollectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:328:2: ( ( ( rule__CollectionExpression__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:329:1: ( ( rule__CollectionExpression__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:329:1: ( ( rule__CollectionExpression__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:330:1: ( rule__CollectionExpression__Alternatives )
            {
             before(grammarAccess.getCollectionExpressionAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:331:1: ( rule__CollectionExpression__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:331:2: rule__CollectionExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__CollectionExpression__Alternatives_in_ruleCollectionExpression635);
            rule__CollectionExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCollectionExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCollectionExpression


    // $ANTLR start entryRuleStringLiteral
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:343:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:344:1: ( ruleStringLiteral EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:345:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral662);
            ruleStringLiteral();
            _fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral669); 

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
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:352:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:356:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:357:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:357:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:358:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:359:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:359:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral695);
            rule__StringLiteral__ValueAssignment();
            _fsp--;


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
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleStringFunction
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:371:1: entryRuleStringFunction : ruleStringFunction EOF ;
    public final void entryRuleStringFunction() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:372:1: ( ruleStringFunction EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:373:1: ruleStringFunction EOF
            {
             before(grammarAccess.getStringFunctionRule()); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction722);
            ruleStringFunction();
            _fsp--;

             after(grammarAccess.getStringFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction729); 

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
    // $ANTLR end entryRuleStringFunction


    // $ANTLR start ruleStringFunction
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:380:1: ruleStringFunction : ( ( rule__StringFunction__Alternatives ) ) ;
    public final void ruleStringFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:384:2: ( ( ( rule__StringFunction__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:385:1: ( ( rule__StringFunction__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:385:1: ( ( rule__StringFunction__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:386:1: ( rule__StringFunction__Alternatives )
            {
             before(grammarAccess.getStringFunctionAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:387:1: ( rule__StringFunction__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:387:2: rule__StringFunction__Alternatives
            {
            pushFollow(FOLLOW_rule__StringFunction__Alternatives_in_ruleStringFunction755);
            rule__StringFunction__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringFunction


    // $ANTLR start entryRuleCollectionLiteral
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:399:1: entryRuleCollectionLiteral : ruleCollectionLiteral EOF ;
    public final void entryRuleCollectionLiteral() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:400:1: ( ruleCollectionLiteral EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:401:1: ruleCollectionLiteral EOF
            {
             before(grammarAccess.getCollectionLiteralRule()); 
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral782);
            ruleCollectionLiteral();
            _fsp--;

             after(grammarAccess.getCollectionLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral789); 

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
    // $ANTLR end entryRuleCollectionLiteral


    // $ANTLR start ruleCollectionLiteral
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:408:1: ruleCollectionLiteral : ( ( rule__CollectionLiteral__Group__0 ) ) ;
    public final void ruleCollectionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:412:2: ( ( ( rule__CollectionLiteral__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:413:1: ( ( rule__CollectionLiteral__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:413:1: ( ( rule__CollectionLiteral__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:414:1: ( rule__CollectionLiteral__Group__0 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:415:1: ( rule__CollectionLiteral__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:415:2: rule__CollectionLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__0_in_ruleCollectionLiteral815);
            rule__CollectionLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCollectionLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCollectionLiteral


    // $ANTLR start entryRuleCollectionFunction
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:427:1: entryRuleCollectionFunction : ruleCollectionFunction EOF ;
    public final void entryRuleCollectionFunction() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:428:1: ( ruleCollectionFunction EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:429:1: ruleCollectionFunction EOF
            {
             before(grammarAccess.getCollectionFunctionRule()); 
            pushFollow(FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction842);
            ruleCollectionFunction();
            _fsp--;

             after(grammarAccess.getCollectionFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunction849); 

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
    // $ANTLR end entryRuleCollectionFunction


    // $ANTLR start ruleCollectionFunction
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:436:1: ruleCollectionFunction : ( ( rule__CollectionFunction__Group__0 ) ) ;
    public final void ruleCollectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:440:2: ( ( ( rule__CollectionFunction__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:441:1: ( ( rule__CollectionFunction__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:441:1: ( ( rule__CollectionFunction__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:442:1: ( rule__CollectionFunction__Group__0 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:443:1: ( rule__CollectionFunction__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:443:2: rule__CollectionFunction__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__0_in_ruleCollectionFunction875);
            rule__CollectionFunction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCollectionFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCollectionFunction


    // $ANTLR start entryRuleTabBarApplication
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:455:1: entryRuleTabBarApplication : ruleTabBarApplication EOF ;
    public final void entryRuleTabBarApplication() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:456:1: ( ruleTabBarApplication EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:457:1: ruleTabBarApplication EOF
            {
             before(grammarAccess.getTabBarApplicationRule()); 
            pushFollow(FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication902);
            ruleTabBarApplication();
            _fsp--;

             after(grammarAccess.getTabBarApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabBarApplication909); 

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
    // $ANTLR end entryRuleTabBarApplication


    // $ANTLR start ruleTabBarApplication
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:464:1: ruleTabBarApplication : ( ( rule__TabBarApplication__Group__0 ) ) ;
    public final void ruleTabBarApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:468:2: ( ( ( rule__TabBarApplication__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:469:1: ( ( rule__TabBarApplication__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:469:1: ( ( rule__TabBarApplication__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:470:1: ( rule__TabBarApplication__Group__0 )
            {
             before(grammarAccess.getTabBarApplicationAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:471:1: ( rule__TabBarApplication__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:471:2: rule__TabBarApplication__Group__0
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__0_in_ruleTabBarApplication935);
            rule__TabBarApplication__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTabBarApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTabBarApplication


    // $ANTLR start entryRuleTabbarButton
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:483:1: entryRuleTabbarButton : ruleTabbarButton EOF ;
    public final void entryRuleTabbarButton() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:484:1: ( ruleTabbarButton EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:485:1: ruleTabbarButton EOF
            {
             before(grammarAccess.getTabbarButtonRule()); 
            pushFollow(FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton962);
            ruleTabbarButton();
            _fsp--;

             after(grammarAccess.getTabbarButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabbarButton969); 

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
    // $ANTLR end entryRuleTabbarButton


    // $ANTLR start ruleTabbarButton
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:492:1: ruleTabbarButton : ( ( rule__TabbarButton__Group__0 ) ) ;
    public final void ruleTabbarButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:496:2: ( ( ( rule__TabbarButton__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:497:1: ( ( rule__TabbarButton__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:497:1: ( ( rule__TabbarButton__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:498:1: ( rule__TabbarButton__Group__0 )
            {
             before(grammarAccess.getTabbarButtonAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:499:1: ( rule__TabbarButton__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:499:2: rule__TabbarButton__Group__0
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__0_in_ruleTabbarButton995);
            rule__TabbarButton__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTabbarButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTabbarButton


    // $ANTLR start entryRuleConstant
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:511:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:512:1: ( ruleConstant EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:513:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant1022);
            ruleConstant();
            _fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant1029); 

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
    // $ANTLR end entryRuleConstant


    // $ANTLR start ruleConstant
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:520:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:524:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:525:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:525:1: ( ( rule__Constant__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:526:1: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:527:1: ( rule__Constant__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:527:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant1055);
            rule__Constant__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConstant


    // $ANTLR start entryRuleType
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:539:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:540:1: ( ruleType EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:541:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1082);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1089); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:548:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:552:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:553:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:553:1: ( ( rule__Type__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:554:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:555:1: ( rule__Type__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:555:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1115);
            rule__Type__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:567:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:568:1: ( ruleSimpleType EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:569:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType1142);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType1149); 

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
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:576:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:580:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:581:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:581:1: ( ( rule__SimpleType__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:582:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:583:1: ( rule__SimpleType__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:583:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType1175);
            rule__SimpleType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:595:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:596:1: ( ruleEntity EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:597:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1202);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1209); 

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
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:604:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:608:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:609:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:609:1: ( ( rule__Entity__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:610:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:611:1: ( rule__Entity__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:611:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity1235);
            rule__Entity__Group__0();
            _fsp--;


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
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleProperty
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:623:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:624:1: ( ruleProperty EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:625:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1262);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1269); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:632:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:636:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:637:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:637:1: ( ( rule__Property__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:638:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:639:1: ( rule__Property__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:639:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty1295);
            rule__Property__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleContentProvider
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:651:1: entryRuleContentProvider : ruleContentProvider EOF ;
    public final void entryRuleContentProvider() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:652:1: ( ruleContentProvider EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:653:1: ruleContentProvider EOF
            {
             before(grammarAccess.getContentProviderRule()); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider1322);
            ruleContentProvider();
            _fsp--;

             after(grammarAccess.getContentProviderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider1329); 

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
    // $ANTLR end entryRuleContentProvider


    // $ANTLR start ruleContentProvider
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:660:1: ruleContentProvider : ( ( rule__ContentProvider__Group__0 ) ) ;
    public final void ruleContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:664:2: ( ( ( rule__ContentProvider__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:665:1: ( ( rule__ContentProvider__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:665:1: ( ( rule__ContentProvider__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:666:1: ( rule__ContentProvider__Group__0 )
            {
             before(grammarAccess.getContentProviderAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:667:1: ( rule__ContentProvider__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:667:2: rule__ContentProvider__Group__0
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__0_in_ruleContentProvider1355);
            rule__ContentProvider__Group__0();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleContentProvider


    // $ANTLR start entryRuleProviderConstruction
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:679:1: entryRuleProviderConstruction : ruleProviderConstruction EOF ;
    public final void entryRuleProviderConstruction() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:680:1: ( ruleProviderConstruction EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:681:1: ruleProviderConstruction EOF
            {
             before(grammarAccess.getProviderConstructionRule()); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction1382);
            ruleProviderConstruction();
            _fsp--;

             after(grammarAccess.getProviderConstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderConstruction1389); 

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
    // $ANTLR end entryRuleProviderConstruction


    // $ANTLR start ruleProviderConstruction
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:688:1: ruleProviderConstruction : ( ( rule__ProviderConstruction__Alternatives ) ) ;
    public final void ruleProviderConstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:692:2: ( ( ( rule__ProviderConstruction__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:693:1: ( ( rule__ProviderConstruction__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:693:1: ( ( rule__ProviderConstruction__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:694:1: ( rule__ProviderConstruction__Alternatives )
            {
             before(grammarAccess.getProviderConstructionAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:695:1: ( rule__ProviderConstruction__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:695:2: rule__ProviderConstruction__Alternatives
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Alternatives_in_ruleProviderConstruction1415);
            rule__ProviderConstruction__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getProviderConstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProviderConstruction


    // $ANTLR start entryRuleView
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:707:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:708:1: ( ruleView EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:709:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView1442);
            ruleView();
            _fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView1449); 

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
    // $ANTLR end entryRuleView


    // $ANTLR start ruleView
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:716:1: ruleView : ( ( rule__View__Alternatives ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:720:2: ( ( ( rule__View__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:721:1: ( ( rule__View__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:721:1: ( ( rule__View__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:722:1: ( rule__View__Alternatives )
            {
             before(grammarAccess.getViewAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:723:1: ( rule__View__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:723:2: rule__View__Alternatives
            {
            pushFollow(FOLLOW_rule__View__Alternatives_in_ruleView1475);
            rule__View__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getViewAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleView


    // $ANTLR start entryRuleSectionedView
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:735:1: entryRuleSectionedView : ruleSectionedView EOF ;
    public final void entryRuleSectionedView() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:736:1: ( ruleSectionedView EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:737:1: ruleSectionedView EOF
            {
             before(grammarAccess.getSectionedViewRule()); 
            pushFollow(FOLLOW_ruleSectionedView_in_entryRuleSectionedView1502);
            ruleSectionedView();
            _fsp--;

             after(grammarAccess.getSectionedViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionedView1509); 

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
    // $ANTLR end entryRuleSectionedView


    // $ANTLR start ruleSectionedView
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:744:1: ruleSectionedView : ( ( rule__SectionedView__Alternatives ) ) ;
    public final void ruleSectionedView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:748:2: ( ( ( rule__SectionedView__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:749:1: ( ( rule__SectionedView__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:749:1: ( ( rule__SectionedView__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:750:1: ( rule__SectionedView__Alternatives )
            {
             before(grammarAccess.getSectionedViewAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:751:1: ( rule__SectionedView__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:751:2: rule__SectionedView__Alternatives
            {
            pushFollow(FOLLOW_rule__SectionedView__Alternatives_in_ruleSectionedView1535);
            rule__SectionedView__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSectionedViewAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSectionedView


    // $ANTLR start entryRuleTableView
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:763:1: entryRuleTableView : ruleTableView EOF ;
    public final void entryRuleTableView() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:764:1: ( ruleTableView EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:765:1: ruleTableView EOF
            {
             before(grammarAccess.getTableViewRule()); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView1562);
            ruleTableView();
            _fsp--;

             after(grammarAccess.getTableViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView1569); 

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
    // $ANTLR end entryRuleTableView


    // $ANTLR start ruleTableView
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:772:1: ruleTableView : ( ( rule__TableView__Group__0 ) ) ;
    public final void ruleTableView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:776:2: ( ( ( rule__TableView__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:777:1: ( ( rule__TableView__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:777:1: ( ( rule__TableView__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:778:1: ( rule__TableView__Group__0 )
            {
             before(grammarAccess.getTableViewAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:779:1: ( rule__TableView__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:779:2: rule__TableView__Group__0
            {
            pushFollow(FOLLOW_rule__TableView__Group__0_in_ruleTableView1595);
            rule__TableView__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTableViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTableView


    // $ANTLR start entryRuleDetailsView
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:791:1: entryRuleDetailsView : ruleDetailsView EOF ;
    public final void entryRuleDetailsView() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:792:1: ( ruleDetailsView EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:793:1: ruleDetailsView EOF
            {
             before(grammarAccess.getDetailsViewRule()); 
            pushFollow(FOLLOW_ruleDetailsView_in_entryRuleDetailsView1622);
            ruleDetailsView();
            _fsp--;

             after(grammarAccess.getDetailsViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailsView1629); 

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
    // $ANTLR end entryRuleDetailsView


    // $ANTLR start ruleDetailsView
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:800:1: ruleDetailsView : ( ( rule__DetailsView__Group__0 ) ) ;
    public final void ruleDetailsView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:804:2: ( ( ( rule__DetailsView__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:805:1: ( ( rule__DetailsView__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:805:1: ( ( rule__DetailsView__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:806:1: ( rule__DetailsView__Group__0 )
            {
             before(grammarAccess.getDetailsViewAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:807:1: ( rule__DetailsView__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:807:2: rule__DetailsView__Group__0
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__0_in_ruleDetailsView1655);
            rule__DetailsView__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDetailsViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDetailsView


    // $ANTLR start entryRuleCustomView
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:819:1: entryRuleCustomView : ruleCustomView EOF ;
    public final void entryRuleCustomView() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:820:1: ( ruleCustomView EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:821:1: ruleCustomView EOF
            {
             before(grammarAccess.getCustomViewRule()); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView1682);
            ruleCustomView();
            _fsp--;

             after(grammarAccess.getCustomViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView1689); 

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
    // $ANTLR end entryRuleCustomView


    // $ANTLR start ruleCustomView
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:828:1: ruleCustomView : ( ( rule__CustomView__Group__0 ) ) ;
    public final void ruleCustomView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:832:2: ( ( ( rule__CustomView__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:833:1: ( ( rule__CustomView__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:833:1: ( ( rule__CustomView__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:834:1: ( rule__CustomView__Group__0 )
            {
             before(grammarAccess.getCustomViewAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:835:1: ( rule__CustomView__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:835:2: rule__CustomView__Group__0
            {
            pushFollow(FOLLOW_rule__CustomView__Group__0_in_ruleCustomView1715);
            rule__CustomView__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCustomViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCustomView


    // $ANTLR start entryRuleViewHeader
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:847:1: entryRuleViewHeader : ruleViewHeader EOF ;
    public final void entryRuleViewHeader() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:848:1: ( ruleViewHeader EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:849:1: ruleViewHeader EOF
            {
             before(grammarAccess.getViewHeaderRule()); 
            pushFollow(FOLLOW_ruleViewHeader_in_entryRuleViewHeader1742);
            ruleViewHeader();
            _fsp--;

             after(grammarAccess.getViewHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewHeader1749); 

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
    // $ANTLR end entryRuleViewHeader


    // $ANTLR start ruleViewHeader
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:856:1: ruleViewHeader : ( ( rule__ViewHeader__Group__0 ) ) ;
    public final void ruleViewHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:860:2: ( ( ( rule__ViewHeader__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:861:1: ( ( rule__ViewHeader__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:861:1: ( ( rule__ViewHeader__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:862:1: ( rule__ViewHeader__Group__0 )
            {
             before(grammarAccess.getViewHeaderAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:863:1: ( rule__ViewHeader__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:863:2: rule__ViewHeader__Group__0
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__0_in_ruleViewHeader1775);
            rule__ViewHeader__Group__0();
            _fsp--;


            }

             after(grammarAccess.getViewHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleViewHeader


    // $ANTLR start entryRuleViewSection
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:875:1: entryRuleViewSection : ruleViewSection EOF ;
    public final void entryRuleViewSection() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:876:1: ( ruleViewSection EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:877:1: ruleViewSection EOF
            {
             before(grammarAccess.getViewSectionRule()); 
            pushFollow(FOLLOW_ruleViewSection_in_entryRuleViewSection1802);
            ruleViewSection();
            _fsp--;

             after(grammarAccess.getViewSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewSection1809); 

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
    // $ANTLR end entryRuleViewSection


    // $ANTLR start ruleViewSection
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:884:1: ruleViewSection : ( ( rule__ViewSection__Group__0 ) ) ;
    public final void ruleViewSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:888:2: ( ( ( rule__ViewSection__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:889:1: ( ( rule__ViewSection__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:889:1: ( ( rule__ViewSection__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:890:1: ( rule__ViewSection__Group__0 )
            {
             before(grammarAccess.getViewSectionAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:891:1: ( rule__ViewSection__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:891:2: rule__ViewSection__Group__0
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__0_in_ruleViewSection1835);
            rule__ViewSection__Group__0();
            _fsp--;


            }

             after(grammarAccess.getViewSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleViewSection


    // $ANTLR start entryRuleSectionCell
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:903:1: entryRuleSectionCell : ruleSectionCell EOF ;
    public final void entryRuleSectionCell() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:904:1: ( ruleSectionCell EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:905:1: ruleSectionCell EOF
            {
             before(grammarAccess.getSectionCellRule()); 
            pushFollow(FOLLOW_ruleSectionCell_in_entryRuleSectionCell1862);
            ruleSectionCell();
            _fsp--;

             after(grammarAccess.getSectionCellRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionCell1869); 

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
    // $ANTLR end entryRuleSectionCell


    // $ANTLR start ruleSectionCell
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:912:1: ruleSectionCell : ( ( rule__SectionCell__Group__0 ) ) ;
    public final void ruleSectionCell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:916:2: ( ( ( rule__SectionCell__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:917:1: ( ( rule__SectionCell__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:917:1: ( ( rule__SectionCell__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:918:1: ( rule__SectionCell__Group__0 )
            {
             before(grammarAccess.getSectionCellAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:919:1: ( rule__SectionCell__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:919:2: rule__SectionCell__Group__0
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__0_in_ruleSectionCell1895);
            rule__SectionCell__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSectionCell


    // $ANTLR start entryRuleCollectionIterator
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:931:1: entryRuleCollectionIterator : ruleCollectionIterator EOF ;
    public final void entryRuleCollectionIterator() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:932:1: ( ruleCollectionIterator EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:933:1: ruleCollectionIterator EOF
            {
             before(grammarAccess.getCollectionIteratorRule()); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator1922);
            ruleCollectionIterator();
            _fsp--;

             after(grammarAccess.getCollectionIteratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator1929); 

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
    // $ANTLR end entryRuleCollectionIterator


    // $ANTLR start ruleCollectionIterator
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:940:1: ruleCollectionIterator : ( ( rule__CollectionIterator__Group__0 ) ) ;
    public final void ruleCollectionIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:944:2: ( ( ( rule__CollectionIterator__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:945:1: ( ( rule__CollectionIterator__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:945:1: ( ( rule__CollectionIterator__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:946:1: ( rule__CollectionIterator__Group__0 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:947:1: ( rule__CollectionIterator__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:947:2: rule__CollectionIterator__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__0_in_ruleCollectionIterator1955);
            rule__CollectionIterator__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCollectionIteratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCollectionIterator


    // $ANTLR start entryRuleViewAction
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:959:1: entryRuleViewAction : ruleViewAction EOF ;
    public final void entryRuleViewAction() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:960:1: ( ruleViewAction EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:961:1: ruleViewAction EOF
            {
             before(grammarAccess.getViewActionRule()); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction1982);
            ruleViewAction();
            _fsp--;

             after(grammarAccess.getViewActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction1989); 

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
    // $ANTLR end entryRuleViewAction


    // $ANTLR start ruleViewAction
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:968:1: ruleViewAction : ( ( rule__ViewAction__Alternatives ) ) ;
    public final void ruleViewAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:972:2: ( ( ( rule__ViewAction__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:973:1: ( ( rule__ViewAction__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:973:1: ( ( rule__ViewAction__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:974:1: ( rule__ViewAction__Alternatives )
            {
             before(grammarAccess.getViewActionAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:975:1: ( rule__ViewAction__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:975:2: rule__ViewAction__Alternatives
            {
            pushFollow(FOLLOW_rule__ViewAction__Alternatives_in_ruleViewAction2015);
            rule__ViewAction__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getViewActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleViewAction


    // $ANTLR start entryRuleExternalOpen
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:987:1: entryRuleExternalOpen : ruleExternalOpen EOF ;
    public final void entryRuleExternalOpen() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:988:1: ( ruleExternalOpen EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:989:1: ruleExternalOpen EOF
            {
             before(grammarAccess.getExternalOpenRule()); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen2042);
            ruleExternalOpen();
            _fsp--;

             after(grammarAccess.getExternalOpenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen2049); 

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
    // $ANTLR end entryRuleExternalOpen


    // $ANTLR start ruleExternalOpen
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:996:1: ruleExternalOpen : ( ( rule__ExternalOpen__UrlAssignment ) ) ;
    public final void ruleExternalOpen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1000:2: ( ( ( rule__ExternalOpen__UrlAssignment ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1001:1: ( ( rule__ExternalOpen__UrlAssignment ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1001:1: ( ( rule__ExternalOpen__UrlAssignment ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1002:1: ( rule__ExternalOpen__UrlAssignment )
            {
             before(grammarAccess.getExternalOpenAccess().getUrlAssignment()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1003:1: ( rule__ExternalOpen__UrlAssignment )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1003:2: rule__ExternalOpen__UrlAssignment
            {
            pushFollow(FOLLOW_rule__ExternalOpen__UrlAssignment_in_ruleExternalOpen2075);
            rule__ExternalOpen__UrlAssignment();
            _fsp--;


            }

             after(grammarAccess.getExternalOpenAccess().getUrlAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExternalOpen


    // $ANTLR start entryRuleViewCall
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1015:1: entryRuleViewCall : ruleViewCall EOF ;
    public final void entryRuleViewCall() throws RecognitionException {
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1016:1: ( ruleViewCall EOF )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1017:1: ruleViewCall EOF
            {
             before(grammarAccess.getViewCallRule()); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall2102);
            ruleViewCall();
            _fsp--;

             after(grammarAccess.getViewCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall2109); 

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
    // $ANTLR end entryRuleViewCall


    // $ANTLR start ruleViewCall
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1024:1: ruleViewCall : ( ( rule__ViewCall__Group__0 ) ) ;
    public final void ruleViewCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1028:2: ( ( ( rule__ViewCall__Group__0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1029:1: ( ( rule__ViewCall__Group__0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1029:1: ( ( rule__ViewCall__Group__0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1030:1: ( rule__ViewCall__Group__0 )
            {
             before(grammarAccess.getViewCallAccess().getGroup()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1031:1: ( rule__ViewCall__Group__0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1031:2: rule__ViewCall__Group__0
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__0_in_ruleViewCall2135);
            rule__ViewCall__Group__0();
            _fsp--;


            }

             after(grammarAccess.getViewCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleViewCall


    // $ANTLR start ruleCellType
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1044:1: ruleCellType : ( ( rule__CellType__Alternatives ) ) ;
    public final void ruleCellType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1048:1: ( ( ( rule__CellType__Alternatives ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1049:1: ( ( rule__CellType__Alternatives ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1049:1: ( ( rule__CellType__Alternatives ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1050:1: ( rule__CellType__Alternatives )
            {
             before(grammarAccess.getCellTypeAccess().getAlternatives()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1051:1: ( rule__CellType__Alternatives )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1051:2: rule__CellType__Alternatives
            {
            pushFollow(FOLLOW_rule__CellType__Alternatives_in_ruleCellType2172);
            rule__CellType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCellTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCellType


    // $ANTLR start rule__ModelElement__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1062:1: rule__ModelElement__Alternatives : ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) | ( ruleConstant ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1066:1: ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) | ( ruleConstant ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 34:
            case 36:
                {
                alt1=1;
                }
                break;
            case 38:
                {
                alt1=2;
                }
                break;
            case 43:
            case 44:
            case 45:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1062:1: rule__ModelElement__Alternatives : ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) | ( ruleConstant ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1067:1: ( ruleType )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1067:1: ( ruleType )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1068:1: ruleType
                    {
                     before(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__ModelElement__Alternatives2207);
                    ruleType();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1073:6: ( ruleContentProvider )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1073:6: ( ruleContentProvider )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1074:1: ruleContentProvider
                    {
                     before(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleContentProvider_in_rule__ModelElement__Alternatives2224);
                    ruleContentProvider();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1079:6: ( ruleView )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1079:6: ( ruleView )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1080:1: ruleView
                    {
                     before(grammarAccess.getModelElementAccess().getViewParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleView_in_rule__ModelElement__Alternatives2241);
                    ruleView();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getViewParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1085:6: ( ruleConstant )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1085:6: ( ruleConstant )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1086:1: ruleConstant
                    {
                     before(grammarAccess.getModelElementAccess().getConstantParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleConstant_in_rule__ModelElement__Alternatives2258);
                    ruleConstant();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getConstantParserRuleCall_3()); 

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
    // $ANTLR end rule__ModelElement__Alternatives


    // $ANTLR start rule__Expression__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1097:1: rule__Expression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1101:1: ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case 18:
            case 20:
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1097:1: rule__Expression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1102:1: ( ruleStringLiteral )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1102:1: ( ruleStringLiteral )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1103:1: ruleStringLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives2291);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1108:6: ( ruleStringFunction )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1108:6: ( ruleStringFunction )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1109:1: ruleStringFunction
                    {
                     before(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringFunction_in_rule__Expression__Alternatives2308);
                    ruleStringFunction();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1114:6: ( ruleCollectionLiteral )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1114:6: ( ruleCollectionLiteral )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1115:1: ruleCollectionLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_rule__Expression__Alternatives2325);
                    ruleCollectionLiteral();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1120:6: ( ruleCollectionFunction )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1120:6: ( ruleCollectionFunction )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1121:1: ruleCollectionFunction
                    {
                     before(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCollectionFunction_in_rule__Expression__Alternatives2342);
                    ruleCollectionFunction();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1126:6: ( ruleObjectReference )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1126:6: ( ruleObjectReference )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1127:1: ruleObjectReference
                    {
                     before(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__Expression__Alternatives2359);
                    ruleObjectReference();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4()); 

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
    // $ANTLR end rule__Expression__Alternatives


    // $ANTLR start rule__ScalarExpression__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1137:1: rule__ScalarExpression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) );
    public final void rule__ScalarExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1141:1: ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case 18:
            case 20:
            case 22:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1137:1: rule__ScalarExpression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1142:1: ( ruleStringLiteral )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1142:1: ( ruleStringLiteral )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1143:1: ruleStringLiteral
                    {
                     before(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__ScalarExpression__Alternatives2391);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1148:6: ( ruleStringFunction )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1148:6: ( ruleStringFunction )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1149:1: ruleStringFunction
                    {
                     before(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringFunction_in_rule__ScalarExpression__Alternatives2408);
                    ruleStringFunction();
                    _fsp--;

                     after(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1154:6: ( ruleObjectReference )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1154:6: ( ruleObjectReference )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1155:1: ruleObjectReference
                    {
                     before(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__ScalarExpression__Alternatives2425);
                    ruleObjectReference();
                    _fsp--;

                     after(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2()); 

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
    // $ANTLR end rule__ScalarExpression__Alternatives


    // $ANTLR start rule__CollectionExpression__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1165:1: rule__CollectionExpression__Alternatives : ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );
    public final void rule__CollectionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1169:1: ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1165:1: rule__CollectionExpression__Alternatives : ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1170:1: ( ruleCollectionLiteral )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1170:1: ( ruleCollectionLiteral )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1171:1: ruleCollectionLiteral
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_rule__CollectionExpression__Alternatives2457);
                    ruleCollectionLiteral();
                    _fsp--;

                     after(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1176:6: ( ruleCollectionFunction )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1176:6: ( ruleCollectionFunction )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1177:1: ruleCollectionFunction
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCollectionFunction_in_rule__CollectionExpression__Alternatives2474);
                    ruleCollectionFunction();
                    _fsp--;

                     after(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1182:6: ( ruleObjectReference )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1182:6: ( ruleObjectReference )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1183:1: ruleObjectReference
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__CollectionExpression__Alternatives2491);
                    ruleObjectReference();
                    _fsp--;

                     after(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2()); 

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
    // $ANTLR end rule__CollectionExpression__Alternatives


    // $ANTLR start rule__StringFunction__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1193:1: rule__StringFunction__Alternatives : ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) );
    public final void rule__StringFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1197:1: ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1193:1: rule__StringFunction__Alternatives : ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1198:1: ( ( rule__StringFunction__Group_0__0 ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1198:1: ( ( rule__StringFunction__Group_0__0 ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1199:1: ( rule__StringFunction__Group_0__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_0()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1200:1: ( rule__StringFunction__Group_0__0 )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1200:2: rule__StringFunction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_0__0_in_rule__StringFunction__Alternatives2523);
                    rule__StringFunction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStringFunctionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1204:6: ( ( rule__StringFunction__Group_1__0 ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1204:6: ( ( rule__StringFunction__Group_1__0 ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1205:1: ( rule__StringFunction__Group_1__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_1()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1206:1: ( rule__StringFunction__Group_1__0 )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1206:2: rule__StringFunction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_1__0_in_rule__StringFunction__Alternatives2541);
                    rule__StringFunction__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStringFunctionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1210:6: ( ( rule__StringFunction__Group_2__0 ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1210:6: ( ( rule__StringFunction__Group_2__0 ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1211:1: ( rule__StringFunction__Group_2__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_2()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1212:1: ( rule__StringFunction__Group_2__0 )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1212:2: rule__StringFunction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_2__0_in_rule__StringFunction__Alternatives2559);
                    rule__StringFunction__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStringFunctionAccess().getGroup_2()); 

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
    // $ANTLR end rule__StringFunction__Alternatives


    // $ANTLR start rule__Type__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1221:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1225:1: ( ( ruleSimpleType ) | ( ruleEntity ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            else if ( (LA6_0==36) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1221:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1226:1: ( ruleSimpleType )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1226:1: ( ruleSimpleType )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1227:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives2592);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1232:6: ( ruleEntity )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1232:6: ( ruleEntity )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1233:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives2609);
                    ruleEntity();
                    _fsp--;

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
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__ContentProvider__Alternatives_3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1243:1: rule__ContentProvider__Alternatives_3 : ( ( 'returns' ) | ( ( rule__ContentProvider__ResolverAssignment_3_1 ) ) );
    public final void rule__ContentProvider__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1247:1: ( ( 'returns' ) | ( ( rule__ContentProvider__ResolverAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==59) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1243:1: rule__ContentProvider__Alternatives_3 : ( ( 'returns' ) | ( ( rule__ContentProvider__ResolverAssignment_3_1 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1248:1: ( 'returns' )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1248:1: ( 'returns' )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1249:1: 'returns'
                    {
                     before(grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0()); 
                    match(input,11,FOLLOW_11_in_rule__ContentProvider__Alternatives_32642); 
                     after(grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1256:6: ( ( rule__ContentProvider__ResolverAssignment_3_1 ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1256:6: ( ( rule__ContentProvider__ResolverAssignment_3_1 ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1257:1: ( rule__ContentProvider__ResolverAssignment_3_1 )
                    {
                     before(grammarAccess.getContentProviderAccess().getResolverAssignment_3_1()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1258:1: ( rule__ContentProvider__ResolverAssignment_3_1 )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1258:2: rule__ContentProvider__ResolverAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ContentProvider__ResolverAssignment_3_1_in_rule__ContentProvider__Alternatives_32661);
                    rule__ContentProvider__ResolverAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getContentProviderAccess().getResolverAssignment_3_1()); 

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
    // $ANTLR end rule__ContentProvider__Alternatives_3


    // $ANTLR start rule__ProviderConstruction__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1267:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );
    public final void rule__ProviderConstruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1271:1: ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==17||LA8_1==19) ) {
                    alt8=2;
                }
                else if ( (LA8_1==18) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1267:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_STRING||LA8_0==18||LA8_0==20||(LA8_0>=22 && LA8_0<=23)||LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1267:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1272:1: ( ( rule__ProviderConstruction__Group_0__0 ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1272:1: ( ( rule__ProviderConstruction__Group_0__0 ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1273:1: ( rule__ProviderConstruction__Group_0__0 )
                    {
                     before(grammarAccess.getProviderConstructionAccess().getGroup_0()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1274:1: ( rule__ProviderConstruction__Group_0__0 )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1274:2: rule__ProviderConstruction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__0_in_rule__ProviderConstruction__Alternatives2694);
                    rule__ProviderConstruction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProviderConstructionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1278:6: ( ( rule__ProviderConstruction__Group_1__0 ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1278:6: ( ( rule__ProviderConstruction__Group_1__0 ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1279:1: ( rule__ProviderConstruction__Group_1__0 )
                    {
                     before(grammarAccess.getProviderConstructionAccess().getGroup_1()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1280:1: ( rule__ProviderConstruction__Group_1__0 )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1280:2: rule__ProviderConstruction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__0_in_rule__ProviderConstruction__Alternatives2712);
                    rule__ProviderConstruction__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProviderConstructionAccess().getGroup_1()); 

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
    // $ANTLR end rule__ProviderConstruction__Alternatives


    // $ANTLR start rule__View__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1289:1: rule__View__Alternatives : ( ( ruleSectionedView ) | ( ruleCustomView ) );
    public final void rule__View__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1293:1: ( ( ruleSectionedView ) | ( ruleCustomView ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=43 && LA9_0<=44)) ) {
                alt9=1;
            }
            else if ( (LA9_0==45) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1289:1: rule__View__Alternatives : ( ( ruleSectionedView ) | ( ruleCustomView ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1294:1: ( ruleSectionedView )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1294:1: ( ruleSectionedView )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1295:1: ruleSectionedView
                    {
                     before(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSectionedView_in_rule__View__Alternatives2745);
                    ruleSectionedView();
                    _fsp--;

                     after(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1300:6: ( ruleCustomView )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1300:6: ( ruleCustomView )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1301:1: ruleCustomView
                    {
                     before(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomView_in_rule__View__Alternatives2762);
                    ruleCustomView();
                    _fsp--;

                     after(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1()); 

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
    // $ANTLR end rule__View__Alternatives


    // $ANTLR start rule__SectionedView__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1311:1: rule__SectionedView__Alternatives : ( ( ruleTableView ) | ( ruleDetailsView ) );
    public final void rule__SectionedView__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1315:1: ( ( ruleTableView ) | ( ruleDetailsView ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            else if ( (LA10_0==44) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1311:1: rule__SectionedView__Alternatives : ( ( ruleTableView ) | ( ruleDetailsView ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1316:1: ( ruleTableView )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1316:1: ( ruleTableView )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1317:1: ruleTableView
                    {
                     before(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTableView_in_rule__SectionedView__Alternatives2794);
                    ruleTableView();
                    _fsp--;

                     after(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1322:6: ( ruleDetailsView )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1322:6: ( ruleDetailsView )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1323:1: ruleDetailsView
                    {
                     before(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDetailsView_in_rule__SectionedView__Alternatives2811);
                    ruleDetailsView();
                    _fsp--;

                     after(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1()); 

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
    // $ANTLR end rule__SectionedView__Alternatives


    // $ANTLR start rule__ViewAction__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1333:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );
    public final void rule__ViewAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1337:1: ( ( ruleViewCall ) | ( ruleExternalOpen ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==18) ) {
                    alt11=1;
                }
                else if ( (LA11_1==EOF||LA11_1==17||LA11_1==28) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1333:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_STRING||LA11_0==18||LA11_0==20||LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1333:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1338:1: ( ruleViewCall )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1338:1: ( ruleViewCall )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1339:1: ruleViewCall
                    {
                     before(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleViewCall_in_rule__ViewAction__Alternatives2843);
                    ruleViewCall();
                    _fsp--;

                     after(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1344:6: ( ruleExternalOpen )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1344:6: ( ruleExternalOpen )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1345:1: ruleExternalOpen
                    {
                     before(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExternalOpen_in_rule__ViewAction__Alternatives2860);
                    ruleExternalOpen();
                    _fsp--;

                     after(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1()); 

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
    // $ANTLR end rule__ViewAction__Alternatives


    // $ANTLR start rule__CellType__Alternatives
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1355:1: rule__CellType__Alternatives : ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) );
    public final void rule__CellType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1359:1: ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt12=1;
                }
                break;
            case 13:
                {
                alt12=2;
                }
                break;
            case 14:
                {
                alt12=3;
                }
                break;
            case 15:
                {
                alt12=4;
                }
                break;
            case 16:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1355:1: rule__CellType__Alternatives : ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1360:1: ( ( 'Default' ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1360:1: ( ( 'Default' ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1361:1: ( 'Default' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1362:1: ( 'Default' )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1362:3: 'Default'
                    {
                    match(input,12,FOLLOW_12_in_rule__CellType__Alternatives2893); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1367:6: ( ( 'DefaultWithDisclosure' ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1367:6: ( ( 'DefaultWithDisclosure' ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1368:1: ( 'DefaultWithDisclosure' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1369:1: ( 'DefaultWithDisclosure' )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1369:3: 'DefaultWithDisclosure'
                    {
                    match(input,13,FOLLOW_13_in_rule__CellType__Alternatives2914); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1374:6: ( ( 'Value2' ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1374:6: ( ( 'Value2' ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1375:1: ( 'Value2' )
                    {
                     before(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1376:1: ( 'Value2' )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1376:3: 'Value2'
                    {
                    match(input,14,FOLLOW_14_in_rule__CellType__Alternatives2935); 

                    }

                     after(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1381:6: ( ( 'Double' ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1381:6: ( ( 'Double' ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1382:1: ( 'Double' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1383:1: ( 'Double' )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1383:3: 'Double'
                    {
                    match(input,15,FOLLOW_15_in_rule__CellType__Alternatives2956); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1388:6: ( ( 'Subtitle' ) )
                    {
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1388:6: ( ( 'Subtitle' ) )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1389:1: ( 'Subtitle' )
                    {
                     before(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4()); 
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1390:1: ( 'Subtitle' )
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1390:3: 'Subtitle'
                    {
                    match(input,16,FOLLOW_16_in_rule__CellType__Alternatives2977); 

                    }

                     after(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4()); 

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
    // $ANTLR end rule__CellType__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1402:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1406:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1407:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03010);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03013);
            rule__Model__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1414:1: rule__Model__Group__0__Impl : ( ( rule__Model__ApplicationAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1418:1: ( ( ( rule__Model__ApplicationAssignment_0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1419:1: ( ( rule__Model__ApplicationAssignment_0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1419:1: ( ( rule__Model__ApplicationAssignment_0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1420:1: ( rule__Model__ApplicationAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getApplicationAssignment_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1421:1: ( rule__Model__ApplicationAssignment_0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1421:2: rule__Model__ApplicationAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ApplicationAssignment_0_in_rule__Model__Group__0__Impl3040);
            rule__Model__ApplicationAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getApplicationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1431:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1435:1: ( rule__Model__Group__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1436:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13070);
            rule__Model__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1442:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1446:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1447:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1447:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1448:1: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1449:1: ( rule__Model__ElementsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=33 && LA13_0<=34)||LA13_0==36||LA13_0==38||(LA13_0>=43 && LA13_0<=45)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1449:2: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl3097);
            	    rule__Model__ElementsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__TypeDescription__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1463:1: rule__TypeDescription__Group__0 : rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1 ;
    public final void rule__TypeDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1467:1: ( rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1468:2: rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__0__Impl_in_rule__TypeDescription__Group__03132);
            rule__TypeDescription__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeDescription__Group__1_in_rule__TypeDescription__Group__03135);
            rule__TypeDescription__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__Group__0


    // $ANTLR start rule__TypeDescription__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1475:1: rule__TypeDescription__Group__0__Impl : ( ( rule__TypeDescription__TypeAssignment_0 ) ) ;
    public final void rule__TypeDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1479:1: ( ( ( rule__TypeDescription__TypeAssignment_0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1480:1: ( ( rule__TypeDescription__TypeAssignment_0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1480:1: ( ( rule__TypeDescription__TypeAssignment_0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1481:1: ( rule__TypeDescription__TypeAssignment_0 )
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeAssignment_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1482:1: ( rule__TypeDescription__TypeAssignment_0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1482:2: rule__TypeDescription__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeDescription__TypeAssignment_0_in_rule__TypeDescription__Group__0__Impl3162);
            rule__TypeDescription__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTypeDescriptionAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__Group__0__Impl


    // $ANTLR start rule__TypeDescription__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1492:1: rule__TypeDescription__Group__1 : rule__TypeDescription__Group__1__Impl ;
    public final void rule__TypeDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1496:1: ( rule__TypeDescription__Group__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1497:2: rule__TypeDescription__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__1__Impl_in_rule__TypeDescription__Group__13192);
            rule__TypeDescription__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__Group__1


    // $ANTLR start rule__TypeDescription__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1503:1: rule__TypeDescription__Group__1__Impl : ( ( rule__TypeDescription__ManyAssignment_1 )? ) ;
    public final void rule__TypeDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1507:1: ( ( ( rule__TypeDescription__ManyAssignment_1 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1508:1: ( ( rule__TypeDescription__ManyAssignment_1 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1508:1: ( ( rule__TypeDescription__ManyAssignment_1 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1509:1: ( rule__TypeDescription__ManyAssignment_1 )?
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1510:1: ( rule__TypeDescription__ManyAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==57) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1510:2: rule__TypeDescription__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeDescription__ManyAssignment_1_in_rule__TypeDescription__Group__1__Impl3219);
                    rule__TypeDescription__ManyAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDescriptionAccess().getManyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__Group__1__Impl


    // $ANTLR start rule__Parameter__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1524:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1528:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1529:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03254);
            rule__Parameter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03257);
            rule__Parameter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__0


    // $ANTLR start rule__Parameter__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1536:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__DescriptionAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1540:1: ( ( ( rule__Parameter__DescriptionAssignment_0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1541:1: ( ( rule__Parameter__DescriptionAssignment_0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1541:1: ( ( rule__Parameter__DescriptionAssignment_0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1542:1: ( rule__Parameter__DescriptionAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getDescriptionAssignment_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1543:1: ( rule__Parameter__DescriptionAssignment_0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1543:2: rule__Parameter__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__DescriptionAssignment_0_in_rule__Parameter__Group__0__Impl3284);
            rule__Parameter__DescriptionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__0__Impl


    // $ANTLR start rule__Parameter__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1553:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1557:1: ( rule__Parameter__Group__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1558:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13314);
            rule__Parameter__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__1


    // $ANTLR start rule__Parameter__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1564:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1568:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1569:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1569:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1570:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1571:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1571:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3341);
            rule__Parameter__NameAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__Parameter__Group__1__Impl


    // $ANTLR start rule__ObjectReference__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1585:1: rule__ObjectReference__Group__0 : rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1 ;
    public final void rule__ObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1589:1: ( rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1590:2: rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__0__Impl_in_rule__ObjectReference__Group__03375);
            rule__ObjectReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ObjectReference__Group__1_in_rule__ObjectReference__Group__03378);
            rule__ObjectReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__Group__0


    // $ANTLR start rule__ObjectReference__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1597:1: rule__ObjectReference__Group__0__Impl : ( ( rule__ObjectReference__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1601:1: ( ( ( rule__ObjectReference__ObjectAssignment_0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1602:1: ( ( rule__ObjectReference__ObjectAssignment_0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1602:1: ( ( rule__ObjectReference__ObjectAssignment_0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1603:1: ( rule__ObjectReference__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectAssignment_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1604:1: ( rule__ObjectReference__ObjectAssignment_0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1604:2: rule__ObjectReference__ObjectAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectReference__ObjectAssignment_0_in_rule__ObjectReference__Group__0__Impl3405);
            rule__ObjectReference__ObjectAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getObjectReferenceAccess().getObjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__Group__0__Impl


    // $ANTLR start rule__ObjectReference__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1614:1: rule__ObjectReference__Group__1 : rule__ObjectReference__Group__1__Impl ;
    public final void rule__ObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1618:1: ( rule__ObjectReference__Group__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1619:2: rule__ObjectReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__1__Impl_in_rule__ObjectReference__Group__13435);
            rule__ObjectReference__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__Group__1


    // $ANTLR start rule__ObjectReference__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1625:1: rule__ObjectReference__Group__1__Impl : ( ( rule__ObjectReference__TailAssignment_1 )? ) ;
    public final void rule__ObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1629:1: ( ( ( rule__ObjectReference__TailAssignment_1 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1630:1: ( ( rule__ObjectReference__TailAssignment_1 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1630:1: ( ( rule__ObjectReference__TailAssignment_1 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1631:1: ( rule__ObjectReference__TailAssignment_1 )?
            {
             before(grammarAccess.getObjectReferenceAccess().getTailAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1632:1: ( rule__ObjectReference__TailAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1632:2: rule__ObjectReference__TailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ObjectReference__TailAssignment_1_in_rule__ObjectReference__Group__1__Impl3462);
                    rule__ObjectReference__TailAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectReferenceAccess().getTailAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__Group__1__Impl


    // $ANTLR start rule__NestedObjectReference__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1646:1: rule__NestedObjectReference__Group__0 : rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1 ;
    public final void rule__NestedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1650:1: ( rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1651:2: rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__0__Impl_in_rule__NestedObjectReference__Group__03497);
            rule__NestedObjectReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NestedObjectReference__Group__1_in_rule__NestedObjectReference__Group__03500);
            rule__NestedObjectReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__0


    // $ANTLR start rule__NestedObjectReference__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1658:1: rule__NestedObjectReference__Group__0__Impl : ( '.' ) ;
    public final void rule__NestedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1662:1: ( ( '.' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1663:1: ( '.' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1663:1: ( '.' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1664:1: '.'
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__NestedObjectReference__Group__0__Impl3528); 
             after(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__0__Impl


    // $ANTLR start rule__NestedObjectReference__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1677:1: rule__NestedObjectReference__Group__1 : rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2 ;
    public final void rule__NestedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1681:1: ( rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1682:2: rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__1__Impl_in_rule__NestedObjectReference__Group__13559);
            rule__NestedObjectReference__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NestedObjectReference__Group__2_in_rule__NestedObjectReference__Group__13562);
            rule__NestedObjectReference__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__1


    // $ANTLR start rule__NestedObjectReference__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1689:1: rule__NestedObjectReference__Group__1__Impl : ( ( rule__NestedObjectReference__ObjectAssignment_1 ) ) ;
    public final void rule__NestedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1693:1: ( ( ( rule__NestedObjectReference__ObjectAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1694:1: ( ( rule__NestedObjectReference__ObjectAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1694:1: ( ( rule__NestedObjectReference__ObjectAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1695:1: ( rule__NestedObjectReference__ObjectAssignment_1 )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1696:1: ( rule__NestedObjectReference__ObjectAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1696:2: rule__NestedObjectReference__ObjectAssignment_1
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__ObjectAssignment_1_in_rule__NestedObjectReference__Group__1__Impl3589);
            rule__NestedObjectReference__ObjectAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getNestedObjectReferenceAccess().getObjectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__1__Impl


    // $ANTLR start rule__NestedObjectReference__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1706:1: rule__NestedObjectReference__Group__2 : rule__NestedObjectReference__Group__2__Impl ;
    public final void rule__NestedObjectReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1710:1: ( rule__NestedObjectReference__Group__2__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1711:2: rule__NestedObjectReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__2__Impl_in_rule__NestedObjectReference__Group__23619);
            rule__NestedObjectReference__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__2


    // $ANTLR start rule__NestedObjectReference__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1717:1: rule__NestedObjectReference__Group__2__Impl : ( ( rule__NestedObjectReference__TailAssignment_2 )? ) ;
    public final void rule__NestedObjectReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1721:1: ( ( ( rule__NestedObjectReference__TailAssignment_2 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1722:1: ( ( rule__NestedObjectReference__TailAssignment_2 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1722:1: ( ( rule__NestedObjectReference__TailAssignment_2 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1723:1: ( rule__NestedObjectReference__TailAssignment_2 )?
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getTailAssignment_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1724:1: ( rule__NestedObjectReference__TailAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1724:2: rule__NestedObjectReference__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__NestedObjectReference__TailAssignment_2_in_rule__NestedObjectReference__Group__2__Impl3646);
                    rule__NestedObjectReference__TailAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNestedObjectReferenceAccess().getTailAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__2__Impl


    // $ANTLR start rule__StringFunction__Group_0__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1740:1: rule__StringFunction__Group_0__0 : rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1 ;
    public final void rule__StringFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1744:1: ( rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1745:2: rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__0__Impl_in_rule__StringFunction__Group_0__03683);
            rule__StringFunction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__1_in_rule__StringFunction__Group_0__03686);
            rule__StringFunction__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__0


    // $ANTLR start rule__StringFunction__Group_0__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1752:1: rule__StringFunction__Group_0__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1756:1: ( ( () ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1757:1: ( () )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1757:1: ( () )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1758:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1759:1: ()
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1761:1: 
            {
            }

             after(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__0__Impl


    // $ANTLR start rule__StringFunction__Group_0__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1771:1: rule__StringFunction__Group_0__1 : rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2 ;
    public final void rule__StringFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1775:1: ( rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1776:2: rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__1__Impl_in_rule__StringFunction__Group_0__13744);
            rule__StringFunction__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__2_in_rule__StringFunction__Group_0__13747);
            rule__StringFunction__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__1


    // $ANTLR start rule__StringFunction__Group_0__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1783:1: rule__StringFunction__Group_0__1__Impl : ( '(' ) ;
    public final void rule__StringFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1787:1: ( ( '(' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1788:1: ( '(' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1788:1: ( '(' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1789:1: '('
            {
             before(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__StringFunction__Group_0__1__Impl3775); 
             after(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__1__Impl


    // $ANTLR start rule__StringFunction__Group_0__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1802:1: rule__StringFunction__Group_0__2 : rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3 ;
    public final void rule__StringFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1806:1: ( rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1807:2: rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__2__Impl_in_rule__StringFunction__Group_0__23806);
            rule__StringFunction__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__3_in_rule__StringFunction__Group_0__23809);
            rule__StringFunction__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__2


    // $ANTLR start rule__StringFunction__Group_0__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1814:1: rule__StringFunction__Group_0__2__Impl : ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) ) ;
    public final void rule__StringFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1818:1: ( ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1819:1: ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1819:1: ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1820:1: ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1820:1: ( ( rule__StringFunction__ValuesAssignment_0_2 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1821:1: ( rule__StringFunction__ValuesAssignment_0_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1822:1: ( rule__StringFunction__ValuesAssignment_0_2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1822:2: rule__StringFunction__ValuesAssignment_0_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3838);
            rule__StringFunction__ValuesAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 

            }

            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1825:1: ( ( rule__StringFunction__ValuesAssignment_0_2 )* )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1826:1: ( rule__StringFunction__ValuesAssignment_0_2 )*
            {
             before(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1827:1: ( rule__StringFunction__ValuesAssignment_0_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||LA17_0==18||LA17_0==20||LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1827:2: rule__StringFunction__ValuesAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3850);
            	    rule__StringFunction__ValuesAssignment_0_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__2__Impl


    // $ANTLR start rule__StringFunction__Group_0__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1838:1: rule__StringFunction__Group_0__3 : rule__StringFunction__Group_0__3__Impl ;
    public final void rule__StringFunction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1842:1: ( rule__StringFunction__Group_0__3__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1843:2: rule__StringFunction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__3__Impl_in_rule__StringFunction__Group_0__33883);
            rule__StringFunction__Group_0__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__3


    // $ANTLR start rule__StringFunction__Group_0__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1849:1: rule__StringFunction__Group_0__3__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1853:1: ( ( ')' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1854:1: ( ')' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1854:1: ( ')' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1855:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3()); 
            match(input,19,FOLLOW_19_in_rule__StringFunction__Group_0__3__Impl3911); 
             after(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__3__Impl


    // $ANTLR start rule__StringFunction__Group_1__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1876:1: rule__StringFunction__Group_1__0 : rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1 ;
    public final void rule__StringFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1880:1: ( rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1881:2: rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__0__Impl_in_rule__StringFunction__Group_1__03950);
            rule__StringFunction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__1_in_rule__StringFunction__Group_1__03953);
            rule__StringFunction__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__0


    // $ANTLR start rule__StringFunction__Group_1__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1888:1: rule__StringFunction__Group_1__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1892:1: ( ( () ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1893:1: ( () )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1893:1: ( () )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1894:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1895:1: ()
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1897:1: 
            {
            }

             after(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__0__Impl


    // $ANTLR start rule__StringFunction__Group_1__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1907:1: rule__StringFunction__Group_1__1 : rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2 ;
    public final void rule__StringFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1911:1: ( rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1912:2: rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__1__Impl_in_rule__StringFunction__Group_1__14011);
            rule__StringFunction__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__2_in_rule__StringFunction__Group_1__14014);
            rule__StringFunction__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__1


    // $ANTLR start rule__StringFunction__Group_1__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1919:1: rule__StringFunction__Group_1__1__Impl : ( 'replace(' ) ;
    public final void rule__StringFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1923:1: ( ( 'replace(' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1924:1: ( 'replace(' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1924:1: ( 'replace(' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1925:1: 'replace('
            {
             before(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1()); 
            match(input,20,FOLLOW_20_in_rule__StringFunction__Group_1__1__Impl4042); 
             after(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__1__Impl


    // $ANTLR start rule__StringFunction__Group_1__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1938:1: rule__StringFunction__Group_1__2 : rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3 ;
    public final void rule__StringFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1942:1: ( rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1943:2: rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__2__Impl_in_rule__StringFunction__Group_1__24073);
            rule__StringFunction__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__3_in_rule__StringFunction__Group_1__24076);
            rule__StringFunction__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__2


    // $ANTLR start rule__StringFunction__Group_1__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1950:1: rule__StringFunction__Group_1__2__Impl : ( ( rule__StringFunction__ValueAssignment_1_2 ) ) ;
    public final void rule__StringFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1954:1: ( ( ( rule__StringFunction__ValueAssignment_1_2 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1955:1: ( ( rule__StringFunction__ValueAssignment_1_2 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1955:1: ( ( rule__StringFunction__ValueAssignment_1_2 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1956:1: ( rule__StringFunction__ValueAssignment_1_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValueAssignment_1_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1957:1: ( rule__StringFunction__ValueAssignment_1_2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1957:2: rule__StringFunction__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValueAssignment_1_2_in_rule__StringFunction__Group_1__2__Impl4103);
            rule__StringFunction__ValueAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__2__Impl


    // $ANTLR start rule__StringFunction__Group_1__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1967:1: rule__StringFunction__Group_1__3 : rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4 ;
    public final void rule__StringFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1971:1: ( rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1972:2: rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__3__Impl_in_rule__StringFunction__Group_1__34133);
            rule__StringFunction__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__4_in_rule__StringFunction__Group_1__34136);
            rule__StringFunction__Group_1__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__3


    // $ANTLR start rule__StringFunction__Group_1__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1979:1: rule__StringFunction__Group_1__3__Impl : ( ',' ) ;
    public final void rule__StringFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1983:1: ( ( ',' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1984:1: ( ',' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1984:1: ( ',' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1985:1: ','
            {
             before(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3()); 
            match(input,21,FOLLOW_21_in_rule__StringFunction__Group_1__3__Impl4164); 
             after(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__3__Impl


    // $ANTLR start rule__StringFunction__Group_1__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1998:1: rule__StringFunction__Group_1__4 : rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5 ;
    public final void rule__StringFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2002:1: ( rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2003:2: rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__4__Impl_in_rule__StringFunction__Group_1__44195);
            rule__StringFunction__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__5_in_rule__StringFunction__Group_1__44198);
            rule__StringFunction__Group_1__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__4


    // $ANTLR start rule__StringFunction__Group_1__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2010:1: rule__StringFunction__Group_1__4__Impl : ( ( rule__StringFunction__MatchAssignment_1_4 ) ) ;
    public final void rule__StringFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2014:1: ( ( ( rule__StringFunction__MatchAssignment_1_4 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2015:1: ( ( rule__StringFunction__MatchAssignment_1_4 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2015:1: ( ( rule__StringFunction__MatchAssignment_1_4 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2016:1: ( rule__StringFunction__MatchAssignment_1_4 )
            {
             before(grammarAccess.getStringFunctionAccess().getMatchAssignment_1_4()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2017:1: ( rule__StringFunction__MatchAssignment_1_4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2017:2: rule__StringFunction__MatchAssignment_1_4
            {
            pushFollow(FOLLOW_rule__StringFunction__MatchAssignment_1_4_in_rule__StringFunction__Group_1__4__Impl4225);
            rule__StringFunction__MatchAssignment_1_4();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getMatchAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__4__Impl


    // $ANTLR start rule__StringFunction__Group_1__5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2027:1: rule__StringFunction__Group_1__5 : rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6 ;
    public final void rule__StringFunction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2031:1: ( rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2032:2: rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__5__Impl_in_rule__StringFunction__Group_1__54255);
            rule__StringFunction__Group_1__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__6_in_rule__StringFunction__Group_1__54258);
            rule__StringFunction__Group_1__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__5


    // $ANTLR start rule__StringFunction__Group_1__5__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2039:1: rule__StringFunction__Group_1__5__Impl : ( ',' ) ;
    public final void rule__StringFunction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2043:1: ( ( ',' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2044:1: ( ',' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2044:1: ( ',' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2045:1: ','
            {
             before(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5()); 
            match(input,21,FOLLOW_21_in_rule__StringFunction__Group_1__5__Impl4286); 
             after(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__5__Impl


    // $ANTLR start rule__StringFunction__Group_1__6
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2058:1: rule__StringFunction__Group_1__6 : rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7 ;
    public final void rule__StringFunction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2062:1: ( rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2063:2: rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__6__Impl_in_rule__StringFunction__Group_1__64317);
            rule__StringFunction__Group_1__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__7_in_rule__StringFunction__Group_1__64320);
            rule__StringFunction__Group_1__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__6


    // $ANTLR start rule__StringFunction__Group_1__6__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2070:1: rule__StringFunction__Group_1__6__Impl : ( ( rule__StringFunction__ReplacementAssignment_1_6 ) ) ;
    public final void rule__StringFunction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2074:1: ( ( ( rule__StringFunction__ReplacementAssignment_1_6 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2075:1: ( ( rule__StringFunction__ReplacementAssignment_1_6 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2075:1: ( ( rule__StringFunction__ReplacementAssignment_1_6 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2076:1: ( rule__StringFunction__ReplacementAssignment_1_6 )
            {
             before(grammarAccess.getStringFunctionAccess().getReplacementAssignment_1_6()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2077:1: ( rule__StringFunction__ReplacementAssignment_1_6 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2077:2: rule__StringFunction__ReplacementAssignment_1_6
            {
            pushFollow(FOLLOW_rule__StringFunction__ReplacementAssignment_1_6_in_rule__StringFunction__Group_1__6__Impl4347);
            rule__StringFunction__ReplacementAssignment_1_6();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getReplacementAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__6__Impl


    // $ANTLR start rule__StringFunction__Group_1__7
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2087:1: rule__StringFunction__Group_1__7 : rule__StringFunction__Group_1__7__Impl ;
    public final void rule__StringFunction__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2091:1: ( rule__StringFunction__Group_1__7__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2092:2: rule__StringFunction__Group_1__7__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__7__Impl_in_rule__StringFunction__Group_1__74377);
            rule__StringFunction__Group_1__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__7


    // $ANTLR start rule__StringFunction__Group_1__7__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2098:1: rule__StringFunction__Group_1__7__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2102:1: ( ( ')' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2103:1: ( ')' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2103:1: ( ')' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2104:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7()); 
            match(input,19,FOLLOW_19_in_rule__StringFunction__Group_1__7__Impl4405); 
             after(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__7__Impl


    // $ANTLR start rule__StringFunction__Group_2__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2133:1: rule__StringFunction__Group_2__0 : rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1 ;
    public final void rule__StringFunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2137:1: ( rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2138:2: rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__0__Impl_in_rule__StringFunction__Group_2__04452);
            rule__StringFunction__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__1_in_rule__StringFunction__Group_2__04455);
            rule__StringFunction__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__0


    // $ANTLR start rule__StringFunction__Group_2__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2145:1: rule__StringFunction__Group_2__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2149:1: ( ( () ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2150:1: ( () )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2150:1: ( () )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2151:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2152:1: ()
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2154:1: 
            {
            }

             after(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__0__Impl


    // $ANTLR start rule__StringFunction__Group_2__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2164:1: rule__StringFunction__Group_2__1 : rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2 ;
    public final void rule__StringFunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2168:1: ( rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2169:2: rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__1__Impl_in_rule__StringFunction__Group_2__14513);
            rule__StringFunction__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__2_in_rule__StringFunction__Group_2__14516);
            rule__StringFunction__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__1


    // $ANTLR start rule__StringFunction__Group_2__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2176:1: rule__StringFunction__Group_2__1__Impl : ( 'urlconform(' ) ;
    public final void rule__StringFunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2180:1: ( ( 'urlconform(' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2181:1: ( 'urlconform(' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2181:1: ( 'urlconform(' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2182:1: 'urlconform('
            {
             before(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__StringFunction__Group_2__1__Impl4544); 
             after(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__1__Impl


    // $ANTLR start rule__StringFunction__Group_2__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2195:1: rule__StringFunction__Group_2__2 : rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3 ;
    public final void rule__StringFunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2199:1: ( rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2200:2: rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__2__Impl_in_rule__StringFunction__Group_2__24575);
            rule__StringFunction__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__3_in_rule__StringFunction__Group_2__24578);
            rule__StringFunction__Group_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__2


    // $ANTLR start rule__StringFunction__Group_2__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2207:1: rule__StringFunction__Group_2__2__Impl : ( ( rule__StringFunction__ValueAssignment_2_2 ) ) ;
    public final void rule__StringFunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2211:1: ( ( ( rule__StringFunction__ValueAssignment_2_2 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2212:1: ( ( rule__StringFunction__ValueAssignment_2_2 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2212:1: ( ( rule__StringFunction__ValueAssignment_2_2 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2213:1: ( rule__StringFunction__ValueAssignment_2_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValueAssignment_2_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2214:1: ( rule__StringFunction__ValueAssignment_2_2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2214:2: rule__StringFunction__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValueAssignment_2_2_in_rule__StringFunction__Group_2__2__Impl4605);
            rule__StringFunction__ValueAssignment_2_2();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getValueAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__2__Impl


    // $ANTLR start rule__StringFunction__Group_2__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2224:1: rule__StringFunction__Group_2__3 : rule__StringFunction__Group_2__3__Impl ;
    public final void rule__StringFunction__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2228:1: ( rule__StringFunction__Group_2__3__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2229:2: rule__StringFunction__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__3__Impl_in_rule__StringFunction__Group_2__34635);
            rule__StringFunction__Group_2__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__3


    // $ANTLR start rule__StringFunction__Group_2__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2235:1: rule__StringFunction__Group_2__3__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2239:1: ( ( ')' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2240:1: ( ')' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2240:1: ( ')' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2241:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3()); 
            match(input,19,FOLLOW_19_in_rule__StringFunction__Group_2__3__Impl4663); 
             after(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__3__Impl


    // $ANTLR start rule__CollectionLiteral__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2262:1: rule__CollectionLiteral__Group__0 : rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1 ;
    public final void rule__CollectionLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2266:1: ( rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2267:2: rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__0__Impl_in_rule__CollectionLiteral__Group__04702);
            rule__CollectionLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__1_in_rule__CollectionLiteral__Group__04705);
            rule__CollectionLiteral__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__0


    // $ANTLR start rule__CollectionLiteral__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2274:1: rule__CollectionLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__CollectionLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2278:1: ( ( '[' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2279:1: ( '[' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2279:1: ( '[' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2280:1: '['
            {
             before(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__CollectionLiteral__Group__0__Impl4733); 
             after(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__0__Impl


    // $ANTLR start rule__CollectionLiteral__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2293:1: rule__CollectionLiteral__Group__1 : rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2 ;
    public final void rule__CollectionLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2297:1: ( rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2298:2: rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__1__Impl_in_rule__CollectionLiteral__Group__14764);
            rule__CollectionLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__2_in_rule__CollectionLiteral__Group__14767);
            rule__CollectionLiteral__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__1


    // $ANTLR start rule__CollectionLiteral__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2305:1: rule__CollectionLiteral__Group__1__Impl : ( ( rule__CollectionLiteral__ItemsAssignment_1 ) ) ;
    public final void rule__CollectionLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2309:1: ( ( ( rule__CollectionLiteral__ItemsAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2310:1: ( ( rule__CollectionLiteral__ItemsAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2310:1: ( ( rule__CollectionLiteral__ItemsAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2311:1: ( rule__CollectionLiteral__ItemsAssignment_1 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2312:1: ( rule__CollectionLiteral__ItemsAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2312:2: rule__CollectionLiteral__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__ItemsAssignment_1_in_rule__CollectionLiteral__Group__1__Impl4794);
            rule__CollectionLiteral__ItemsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__1__Impl


    // $ANTLR start rule__CollectionLiteral__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2322:1: rule__CollectionLiteral__Group__2 : rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3 ;
    public final void rule__CollectionLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2326:1: ( rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2327:2: rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__2__Impl_in_rule__CollectionLiteral__Group__24824);
            rule__CollectionLiteral__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__3_in_rule__CollectionLiteral__Group__24827);
            rule__CollectionLiteral__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__2


    // $ANTLR start rule__CollectionLiteral__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2334:1: rule__CollectionLiteral__Group__2__Impl : ( ( rule__CollectionLiteral__Group_2__0 )* ) ;
    public final void rule__CollectionLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2338:1: ( ( ( rule__CollectionLiteral__Group_2__0 )* ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2339:1: ( ( rule__CollectionLiteral__Group_2__0 )* )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2339:1: ( ( rule__CollectionLiteral__Group_2__0 )* )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2340:1: ( rule__CollectionLiteral__Group_2__0 )*
            {
             before(grammarAccess.getCollectionLiteralAccess().getGroup_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2341:1: ( rule__CollectionLiteral__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2341:2: rule__CollectionLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__0_in_rule__CollectionLiteral__Group__2__Impl4854);
            	    rule__CollectionLiteral__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCollectionLiteralAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__2__Impl


    // $ANTLR start rule__CollectionLiteral__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2351:1: rule__CollectionLiteral__Group__3 : rule__CollectionLiteral__Group__3__Impl ;
    public final void rule__CollectionLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2355:1: ( rule__CollectionLiteral__Group__3__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2356:2: rule__CollectionLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__3__Impl_in_rule__CollectionLiteral__Group__34885);
            rule__CollectionLiteral__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__3


    // $ANTLR start rule__CollectionLiteral__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2362:1: rule__CollectionLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__CollectionLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2366:1: ( ( ']' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2367:1: ( ']' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2367:1: ( ']' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2368:1: ']'
            {
             before(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__CollectionLiteral__Group__3__Impl4913); 
             after(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__3__Impl


    // $ANTLR start rule__CollectionLiteral__Group_2__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2389:1: rule__CollectionLiteral__Group_2__0 : rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1 ;
    public final void rule__CollectionLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2393:1: ( rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2394:2: rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__0__Impl_in_rule__CollectionLiteral__Group_2__04952);
            rule__CollectionLiteral__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__1_in_rule__CollectionLiteral__Group_2__04955);
            rule__CollectionLiteral__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group_2__0


    // $ANTLR start rule__CollectionLiteral__Group_2__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2401:1: rule__CollectionLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__CollectionLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2405:1: ( ( ',' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2406:1: ( ',' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2406:1: ( ',' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2407:1: ','
            {
             before(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__CollectionLiteral__Group_2__0__Impl4983); 
             after(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group_2__0__Impl


    // $ANTLR start rule__CollectionLiteral__Group_2__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2420:1: rule__CollectionLiteral__Group_2__1 : rule__CollectionLiteral__Group_2__1__Impl ;
    public final void rule__CollectionLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2424:1: ( rule__CollectionLiteral__Group_2__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2425:2: rule__CollectionLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__1__Impl_in_rule__CollectionLiteral__Group_2__15014);
            rule__CollectionLiteral__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group_2__1


    // $ANTLR start rule__CollectionLiteral__Group_2__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2431:1: rule__CollectionLiteral__Group_2__1__Impl : ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) ) ;
    public final void rule__CollectionLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2435:1: ( ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2436:1: ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2436:1: ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2437:1: ( rule__CollectionLiteral__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_2_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2438:1: ( rule__CollectionLiteral__ItemsAssignment_2_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2438:2: rule__CollectionLiteral__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__ItemsAssignment_2_1_in_rule__CollectionLiteral__Group_2__1__Impl5041);
            rule__CollectionLiteral__ItemsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group_2__1__Impl


    // $ANTLR start rule__CollectionFunction__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2452:1: rule__CollectionFunction__Group__0 : rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1 ;
    public final void rule__CollectionFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2456:1: ( rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2457:2: rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__0__Impl_in_rule__CollectionFunction__Group__05075);
            rule__CollectionFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__1_in_rule__CollectionFunction__Group__05078);
            rule__CollectionFunction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__0


    // $ANTLR start rule__CollectionFunction__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2464:1: rule__CollectionFunction__Group__0__Impl : ( () ) ;
    public final void rule__CollectionFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2468:1: ( ( () ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2469:1: ( () )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2469:1: ( () )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2470:1: ()
            {
             before(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2471:1: ()
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2473:1: 
            {
            }

             after(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__0__Impl


    // $ANTLR start rule__CollectionFunction__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2483:1: rule__CollectionFunction__Group__1 : rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2 ;
    public final void rule__CollectionFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2487:1: ( rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2488:2: rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__1__Impl_in_rule__CollectionFunction__Group__15136);
            rule__CollectionFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__2_in_rule__CollectionFunction__Group__15139);
            rule__CollectionFunction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__1


    // $ANTLR start rule__CollectionFunction__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2495:1: rule__CollectionFunction__Group__1__Impl : ( 'split(' ) ;
    public final void rule__CollectionFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2499:1: ( ( 'split(' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2500:1: ( 'split(' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2500:1: ( 'split(' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2501:1: 'split('
            {
             before(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__CollectionFunction__Group__1__Impl5167); 
             after(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__1__Impl


    // $ANTLR start rule__CollectionFunction__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2514:1: rule__CollectionFunction__Group__2 : rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3 ;
    public final void rule__CollectionFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2518:1: ( rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2519:2: rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__2__Impl_in_rule__CollectionFunction__Group__25198);
            rule__CollectionFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__3_in_rule__CollectionFunction__Group__25201);
            rule__CollectionFunction__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__2


    // $ANTLR start rule__CollectionFunction__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2526:1: rule__CollectionFunction__Group__2__Impl : ( ( rule__CollectionFunction__ValueAssignment_2 ) ) ;
    public final void rule__CollectionFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2530:1: ( ( ( rule__CollectionFunction__ValueAssignment_2 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2531:1: ( ( rule__CollectionFunction__ValueAssignment_2 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2531:1: ( ( rule__CollectionFunction__ValueAssignment_2 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2532:1: ( rule__CollectionFunction__ValueAssignment_2 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getValueAssignment_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2533:1: ( rule__CollectionFunction__ValueAssignment_2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2533:2: rule__CollectionFunction__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionFunction__ValueAssignment_2_in_rule__CollectionFunction__Group__2__Impl5228);
            rule__CollectionFunction__ValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCollectionFunctionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__2__Impl


    // $ANTLR start rule__CollectionFunction__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2543:1: rule__CollectionFunction__Group__3 : rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4 ;
    public final void rule__CollectionFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2547:1: ( rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2548:2: rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__3__Impl_in_rule__CollectionFunction__Group__35258);
            rule__CollectionFunction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__4_in_rule__CollectionFunction__Group__35261);
            rule__CollectionFunction__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__3


    // $ANTLR start rule__CollectionFunction__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2555:1: rule__CollectionFunction__Group__3__Impl : ( ',' ) ;
    public final void rule__CollectionFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2559:1: ( ( ',' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2560:1: ( ',' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2560:1: ( ',' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2561:1: ','
            {
             before(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__CollectionFunction__Group__3__Impl5289); 
             after(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__3__Impl


    // $ANTLR start rule__CollectionFunction__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2574:1: rule__CollectionFunction__Group__4 : rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5 ;
    public final void rule__CollectionFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2578:1: ( rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2579:2: rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__4__Impl_in_rule__CollectionFunction__Group__45320);
            rule__CollectionFunction__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__5_in_rule__CollectionFunction__Group__45323);
            rule__CollectionFunction__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__4


    // $ANTLR start rule__CollectionFunction__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2586:1: rule__CollectionFunction__Group__4__Impl : ( ( rule__CollectionFunction__DelimiterAssignment_4 ) ) ;
    public final void rule__CollectionFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2590:1: ( ( ( rule__CollectionFunction__DelimiterAssignment_4 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2591:1: ( ( rule__CollectionFunction__DelimiterAssignment_4 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2591:1: ( ( rule__CollectionFunction__DelimiterAssignment_4 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2592:1: ( rule__CollectionFunction__DelimiterAssignment_4 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getDelimiterAssignment_4()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2593:1: ( rule__CollectionFunction__DelimiterAssignment_4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2593:2: rule__CollectionFunction__DelimiterAssignment_4
            {
            pushFollow(FOLLOW_rule__CollectionFunction__DelimiterAssignment_4_in_rule__CollectionFunction__Group__4__Impl5350);
            rule__CollectionFunction__DelimiterAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCollectionFunctionAccess().getDelimiterAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__4__Impl


    // $ANTLR start rule__CollectionFunction__Group__5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2603:1: rule__CollectionFunction__Group__5 : rule__CollectionFunction__Group__5__Impl ;
    public final void rule__CollectionFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2607:1: ( rule__CollectionFunction__Group__5__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2608:2: rule__CollectionFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__5__Impl_in_rule__CollectionFunction__Group__55380);
            rule__CollectionFunction__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__5


    // $ANTLR start rule__CollectionFunction__Group__5__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2614:1: rule__CollectionFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__CollectionFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2618:1: ( ( ')' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2619:1: ( ')' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2619:1: ( ')' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2620:1: ')'
            {
             before(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__CollectionFunction__Group__5__Impl5408); 
             after(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__5__Impl


    // $ANTLR start rule__TabBarApplication__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2645:1: rule__TabBarApplication__Group__0 : rule__TabBarApplication__Group__0__Impl rule__TabBarApplication__Group__1 ;
    public final void rule__TabBarApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2649:1: ( rule__TabBarApplication__Group__0__Impl rule__TabBarApplication__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2650:2: rule__TabBarApplication__Group__0__Impl rule__TabBarApplication__Group__1
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__0__Impl_in_rule__TabBarApplication__Group__05451);
            rule__TabBarApplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__1_in_rule__TabBarApplication__Group__05454);
            rule__TabBarApplication__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__0


    // $ANTLR start rule__TabBarApplication__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2657:1: rule__TabBarApplication__Group__0__Impl : ( 'tabbarApplication' ) ;
    public final void rule__TabBarApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2661:1: ( ( 'tabbarApplication' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2662:1: ( 'tabbarApplication' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2662:1: ( 'tabbarApplication' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2663:1: 'tabbarApplication'
            {
             before(grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__TabBarApplication__Group__0__Impl5482); 
             after(grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__0__Impl


    // $ANTLR start rule__TabBarApplication__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2676:1: rule__TabBarApplication__Group__1 : rule__TabBarApplication__Group__1__Impl rule__TabBarApplication__Group__2 ;
    public final void rule__TabBarApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2680:1: ( rule__TabBarApplication__Group__1__Impl rule__TabBarApplication__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2681:2: rule__TabBarApplication__Group__1__Impl rule__TabBarApplication__Group__2
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__1__Impl_in_rule__TabBarApplication__Group__15513);
            rule__TabBarApplication__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__2_in_rule__TabBarApplication__Group__15516);
            rule__TabBarApplication__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__1


    // $ANTLR start rule__TabBarApplication__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2688:1: rule__TabBarApplication__Group__1__Impl : ( ( rule__TabBarApplication__NameAssignment_1 ) ) ;
    public final void rule__TabBarApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2692:1: ( ( ( rule__TabBarApplication__NameAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2693:1: ( ( rule__TabBarApplication__NameAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2693:1: ( ( rule__TabBarApplication__NameAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2694:1: ( rule__TabBarApplication__NameAssignment_1 )
            {
             before(grammarAccess.getTabBarApplicationAccess().getNameAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2695:1: ( rule__TabBarApplication__NameAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2695:2: rule__TabBarApplication__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TabBarApplication__NameAssignment_1_in_rule__TabBarApplication__Group__1__Impl5543);
            rule__TabBarApplication__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTabBarApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__1__Impl


    // $ANTLR start rule__TabBarApplication__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2705:1: rule__TabBarApplication__Group__2 : rule__TabBarApplication__Group__2__Impl rule__TabBarApplication__Group__3 ;
    public final void rule__TabBarApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2709:1: ( rule__TabBarApplication__Group__2__Impl rule__TabBarApplication__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2710:2: rule__TabBarApplication__Group__2__Impl rule__TabBarApplication__Group__3
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__2__Impl_in_rule__TabBarApplication__Group__25573);
            rule__TabBarApplication__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__3_in_rule__TabBarApplication__Group__25576);
            rule__TabBarApplication__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__2


    // $ANTLR start rule__TabBarApplication__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2717:1: rule__TabBarApplication__Group__2__Impl : ( '{' ) ;
    public final void rule__TabBarApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2721:1: ( ( '{' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2722:1: ( '{' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2722:1: ( '{' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2723:1: '{'
            {
             before(grammarAccess.getTabBarApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__TabBarApplication__Group__2__Impl5604); 
             after(grammarAccess.getTabBarApplicationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__2__Impl


    // $ANTLR start rule__TabBarApplication__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2736:1: rule__TabBarApplication__Group__3 : rule__TabBarApplication__Group__3__Impl rule__TabBarApplication__Group__4 ;
    public final void rule__TabBarApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2740:1: ( rule__TabBarApplication__Group__3__Impl rule__TabBarApplication__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2741:2: rule__TabBarApplication__Group__3__Impl rule__TabBarApplication__Group__4
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__3__Impl_in_rule__TabBarApplication__Group__35635);
            rule__TabBarApplication__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__4_in_rule__TabBarApplication__Group__35638);
            rule__TabBarApplication__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__3


    // $ANTLR start rule__TabBarApplication__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2748:1: rule__TabBarApplication__Group__3__Impl : ( ( rule__TabBarApplication__ButtonsAssignment_3 )* ) ;
    public final void rule__TabBarApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2752:1: ( ( ( rule__TabBarApplication__ButtonsAssignment_3 )* ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2753:1: ( ( rule__TabBarApplication__ButtonsAssignment_3 )* )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2753:1: ( ( rule__TabBarApplication__ButtonsAssignment_3 )* )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2754:1: ( rule__TabBarApplication__ButtonsAssignment_3 )*
            {
             before(grammarAccess.getTabBarApplicationAccess().getButtonsAssignment_3()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2755:1: ( rule__TabBarApplication__ButtonsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2755:2: rule__TabBarApplication__ButtonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__TabBarApplication__ButtonsAssignment_3_in_rule__TabBarApplication__Group__3__Impl5665);
            	    rule__TabBarApplication__ButtonsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTabBarApplicationAccess().getButtonsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__3__Impl


    // $ANTLR start rule__TabBarApplication__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2765:1: rule__TabBarApplication__Group__4 : rule__TabBarApplication__Group__4__Impl ;
    public final void rule__TabBarApplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2769:1: ( rule__TabBarApplication__Group__4__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2770:2: rule__TabBarApplication__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__4__Impl_in_rule__TabBarApplication__Group__45696);
            rule__TabBarApplication__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__4


    // $ANTLR start rule__TabBarApplication__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2776:1: rule__TabBarApplication__Group__4__Impl : ( '}' ) ;
    public final void rule__TabBarApplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2780:1: ( ( '}' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2781:1: ( '}' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2781:1: ( '}' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2782:1: '}'
            {
             before(grammarAccess.getTabBarApplicationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__TabBarApplication__Group__4__Impl5724); 
             after(grammarAccess.getTabBarApplicationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__4__Impl


    // $ANTLR start rule__TabbarButton__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2805:1: rule__TabbarButton__Group__0 : rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1 ;
    public final void rule__TabbarButton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2809:1: ( rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2810:2: rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__0__Impl_in_rule__TabbarButton__Group__05765);
            rule__TabbarButton__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__1_in_rule__TabbarButton__Group__05768);
            rule__TabbarButton__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__0


    // $ANTLR start rule__TabbarButton__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2817:1: rule__TabbarButton__Group__0__Impl : ( 'button' ) ;
    public final void rule__TabbarButton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2821:1: ( ( 'button' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2822:1: ( 'button' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2822:1: ( 'button' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2823:1: 'button'
            {
             before(grammarAccess.getTabbarButtonAccess().getButtonKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__TabbarButton__Group__0__Impl5796); 
             after(grammarAccess.getTabbarButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__0__Impl


    // $ANTLR start rule__TabbarButton__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2836:1: rule__TabbarButton__Group__1 : rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2 ;
    public final void rule__TabbarButton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2840:1: ( rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2841:2: rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__1__Impl_in_rule__TabbarButton__Group__15827);
            rule__TabbarButton__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__2_in_rule__TabbarButton__Group__15830);
            rule__TabbarButton__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__1


    // $ANTLR start rule__TabbarButton__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2848:1: rule__TabbarButton__Group__1__Impl : ( '{' ) ;
    public final void rule__TabbarButton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2852:1: ( ( '{' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2853:1: ( '{' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2853:1: ( '{' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2854:1: '{'
            {
             before(grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__TabbarButton__Group__1__Impl5858); 
             after(grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__1__Impl


    // $ANTLR start rule__TabbarButton__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2867:1: rule__TabbarButton__Group__2 : rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3 ;
    public final void rule__TabbarButton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2871:1: ( rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2872:2: rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__2__Impl_in_rule__TabbarButton__Group__25889);
            rule__TabbarButton__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__3_in_rule__TabbarButton__Group__25892);
            rule__TabbarButton__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__2


    // $ANTLR start rule__TabbarButton__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2879:1: rule__TabbarButton__Group__2__Impl : ( 'title=' ) ;
    public final void rule__TabbarButton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2883:1: ( ( 'title=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2884:1: ( 'title=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2884:1: ( 'title=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2885:1: 'title='
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__TabbarButton__Group__2__Impl5920); 
             after(grammarAccess.getTabbarButtonAccess().getTitleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__2__Impl


    // $ANTLR start rule__TabbarButton__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2898:1: rule__TabbarButton__Group__3 : rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4 ;
    public final void rule__TabbarButton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2902:1: ( rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2903:2: rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__3__Impl_in_rule__TabbarButton__Group__35951);
            rule__TabbarButton__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__4_in_rule__TabbarButton__Group__35954);
            rule__TabbarButton__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__3


    // $ANTLR start rule__TabbarButton__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2910:1: rule__TabbarButton__Group__3__Impl : ( ( rule__TabbarButton__TitleAssignment_3 ) ) ;
    public final void rule__TabbarButton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2914:1: ( ( ( rule__TabbarButton__TitleAssignment_3 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2915:1: ( ( rule__TabbarButton__TitleAssignment_3 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2915:1: ( ( rule__TabbarButton__TitleAssignment_3 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2916:1: ( rule__TabbarButton__TitleAssignment_3 )
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleAssignment_3()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2917:1: ( rule__TabbarButton__TitleAssignment_3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2917:2: rule__TabbarButton__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__TabbarButton__TitleAssignment_3_in_rule__TabbarButton__Group__3__Impl5981);
            rule__TabbarButton__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getTabbarButtonAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__3__Impl


    // $ANTLR start rule__TabbarButton__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2927:1: rule__TabbarButton__Group__4 : rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5 ;
    public final void rule__TabbarButton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2931:1: ( rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2932:2: rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__4__Impl_in_rule__TabbarButton__Group__46011);
            rule__TabbarButton__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__5_in_rule__TabbarButton__Group__46014);
            rule__TabbarButton__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__4


    // $ANTLR start rule__TabbarButton__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2939:1: rule__TabbarButton__Group__4__Impl : ( 'icon=' ) ;
    public final void rule__TabbarButton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2943:1: ( ( 'icon=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2944:1: ( 'icon=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2944:1: ( 'icon=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2945:1: 'icon='
            {
             before(grammarAccess.getTabbarButtonAccess().getIconKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__TabbarButton__Group__4__Impl6042); 
             after(grammarAccess.getTabbarButtonAccess().getIconKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__4__Impl


    // $ANTLR start rule__TabbarButton__Group__5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2958:1: rule__TabbarButton__Group__5 : rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6 ;
    public final void rule__TabbarButton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2962:1: ( rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2963:2: rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__5__Impl_in_rule__TabbarButton__Group__56073);
            rule__TabbarButton__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__6_in_rule__TabbarButton__Group__56076);
            rule__TabbarButton__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__5


    // $ANTLR start rule__TabbarButton__Group__5__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2970:1: rule__TabbarButton__Group__5__Impl : ( ( rule__TabbarButton__IconAssignment_5 ) ) ;
    public final void rule__TabbarButton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2974:1: ( ( ( rule__TabbarButton__IconAssignment_5 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2975:1: ( ( rule__TabbarButton__IconAssignment_5 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2975:1: ( ( rule__TabbarButton__IconAssignment_5 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2976:1: ( rule__TabbarButton__IconAssignment_5 )
            {
             before(grammarAccess.getTabbarButtonAccess().getIconAssignment_5()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2977:1: ( rule__TabbarButton__IconAssignment_5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2977:2: rule__TabbarButton__IconAssignment_5
            {
            pushFollow(FOLLOW_rule__TabbarButton__IconAssignment_5_in_rule__TabbarButton__Group__5__Impl6103);
            rule__TabbarButton__IconAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getTabbarButtonAccess().getIconAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__5__Impl


    // $ANTLR start rule__TabbarButton__Group__6
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2987:1: rule__TabbarButton__Group__6 : rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7 ;
    public final void rule__TabbarButton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2991:1: ( rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2992:2: rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__6__Impl_in_rule__TabbarButton__Group__66133);
            rule__TabbarButton__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__7_in_rule__TabbarButton__Group__66136);
            rule__TabbarButton__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__6


    // $ANTLR start rule__TabbarButton__Group__6__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2999:1: rule__TabbarButton__Group__6__Impl : ( 'view=' ) ;
    public final void rule__TabbarButton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3003:1: ( ( 'view=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3004:1: ( 'view=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3004:1: ( 'view=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3005:1: 'view='
            {
             before(grammarAccess.getTabbarButtonAccess().getViewKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__TabbarButton__Group__6__Impl6164); 
             after(grammarAccess.getTabbarButtonAccess().getViewKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__6__Impl


    // $ANTLR start rule__TabbarButton__Group__7
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3018:1: rule__TabbarButton__Group__7 : rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8 ;
    public final void rule__TabbarButton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3022:1: ( rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3023:2: rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__7__Impl_in_rule__TabbarButton__Group__76195);
            rule__TabbarButton__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__8_in_rule__TabbarButton__Group__76198);
            rule__TabbarButton__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__7


    // $ANTLR start rule__TabbarButton__Group__7__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3030:1: rule__TabbarButton__Group__7__Impl : ( ( rule__TabbarButton__ViewAssignment_7 ) ) ;
    public final void rule__TabbarButton__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3034:1: ( ( ( rule__TabbarButton__ViewAssignment_7 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3035:1: ( ( rule__TabbarButton__ViewAssignment_7 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3035:1: ( ( rule__TabbarButton__ViewAssignment_7 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3036:1: ( rule__TabbarButton__ViewAssignment_7 )
            {
             before(grammarAccess.getTabbarButtonAccess().getViewAssignment_7()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3037:1: ( rule__TabbarButton__ViewAssignment_7 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3037:2: rule__TabbarButton__ViewAssignment_7
            {
            pushFollow(FOLLOW_rule__TabbarButton__ViewAssignment_7_in_rule__TabbarButton__Group__7__Impl6225);
            rule__TabbarButton__ViewAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getTabbarButtonAccess().getViewAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__7__Impl


    // $ANTLR start rule__TabbarButton__Group__8
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3047:1: rule__TabbarButton__Group__8 : rule__TabbarButton__Group__8__Impl ;
    public final void rule__TabbarButton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3051:1: ( rule__TabbarButton__Group__8__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3052:2: rule__TabbarButton__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__8__Impl_in_rule__TabbarButton__Group__86255);
            rule__TabbarButton__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__8


    // $ANTLR start rule__TabbarButton__Group__8__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3058:1: rule__TabbarButton__Group__8__Impl : ( '}' ) ;
    public final void rule__TabbarButton__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3062:1: ( ( '}' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3063:1: ( '}' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3063:1: ( '}' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3064:1: '}'
            {
             before(grammarAccess.getTabbarButtonAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_28_in_rule__TabbarButton__Group__8__Impl6283); 
             after(grammarAccess.getTabbarButtonAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__8__Impl


    // $ANTLR start rule__Constant__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3095:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3099:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3100:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__06332);
            rule__Constant__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__06335);
            rule__Constant__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__Group__0


    // $ANTLR start rule__Constant__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3107:1: rule__Constant__Group__0__Impl : ( () ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3111:1: ( ( () ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3112:1: ( () )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3112:1: ( () )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3113:1: ()
            {
             before(grammarAccess.getConstantAccess().getConstantAction_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3114:1: ()
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3116:1: 
            {
            }

             after(grammarAccess.getConstantAccess().getConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__Group__0__Impl


    // $ANTLR start rule__Constant__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3126:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3130:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3131:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__16393);
            rule__Constant__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__16396);
            rule__Constant__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__Group__1


    // $ANTLR start rule__Constant__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3138:1: rule__Constant__Group__1__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3142:1: ( ( 'const' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3143:1: ( 'const' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3143:1: ( 'const' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3144:1: 'const'
            {
             before(grammarAccess.getConstantAccess().getConstKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Constant__Group__1__Impl6424); 
             after(grammarAccess.getConstantAccess().getConstKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__Group__1__Impl


    // $ANTLR start rule__Constant__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3157:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3161:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3162:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__26455);
            rule__Constant__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__26458);
            rule__Constant__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__Group__2


    // $ANTLR start rule__Constant__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3169:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__NameAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3173:1: ( ( ( rule__Constant__NameAssignment_2 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3174:1: ( ( rule__Constant__NameAssignment_2 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3174:1: ( ( rule__Constant__NameAssignment_2 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3175:1: ( rule__Constant__NameAssignment_2 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3176:1: ( rule__Constant__NameAssignment_2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3176:2: rule__Constant__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_2_in_rule__Constant__Group__2__Impl6485);
            rule__Constant__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getConstantAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__Group__2__Impl


    // $ANTLR start rule__Constant__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3186:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3190:1: ( rule__Constant__Group__3__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3191:2: rule__Constant__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__36515);
            rule__Constant__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__Group__3


    // $ANTLR start rule__Constant__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3197:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__ValueAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3201:1: ( ( ( rule__Constant__ValueAssignment_3 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3202:1: ( ( rule__Constant__ValueAssignment_3 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3202:1: ( ( rule__Constant__ValueAssignment_3 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3203:1: ( rule__Constant__ValueAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3204:1: ( rule__Constant__ValueAssignment_3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3204:2: rule__Constant__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl6542);
            rule__Constant__ValueAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__Group__3__Impl


    // $ANTLR start rule__SimpleType__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3222:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3226:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3227:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__06580);
            rule__SimpleType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__06583);
            rule__SimpleType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__0


    // $ANTLR start rule__SimpleType__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3234:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3238:1: ( ( 'type' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3239:1: ( 'type' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3239:1: ( 'type' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3240:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__SimpleType__Group__0__Impl6611); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__0__Impl


    // $ANTLR start rule__SimpleType__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3253:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3257:1: ( rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3258:2: rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__16642);
            rule__SimpleType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__16645);
            rule__SimpleType__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__1


    // $ANTLR start rule__SimpleType__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3265:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3269:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3270:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3270:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3271:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3272:1: ( rule__SimpleType__NameAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3272:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl6672);
            rule__SimpleType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__1__Impl


    // $ANTLR start rule__SimpleType__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3282:1: rule__SimpleType__Group__2 : rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3 ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3286:1: ( rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3287:2: rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__26702);
            rule__SimpleType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__3_in_rule__SimpleType__Group__26705);
            rule__SimpleType__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__2


    // $ANTLR start rule__SimpleType__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3294:1: rule__SimpleType__Group__2__Impl : ( 'mapsTo' ) ;
    public final void rule__SimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3298:1: ( ( 'mapsTo' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3299:1: ( 'mapsTo' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3299:1: ( 'mapsTo' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3300:1: 'mapsTo'
            {
             before(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__SimpleType__Group__2__Impl6733); 
             after(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__2__Impl


    // $ANTLR start rule__SimpleType__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3313:1: rule__SimpleType__Group__3 : rule__SimpleType__Group__3__Impl ;
    public final void rule__SimpleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3317:1: ( rule__SimpleType__Group__3__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3318:2: rule__SimpleType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__3__Impl_in_rule__SimpleType__Group__36764);
            rule__SimpleType__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__3


    // $ANTLR start rule__SimpleType__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3324:1: rule__SimpleType__Group__3__Impl : ( ( rule__SimpleType__PlatformTypeAssignment_3 ) ) ;
    public final void rule__SimpleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3328:1: ( ( ( rule__SimpleType__PlatformTypeAssignment_3 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3329:1: ( ( rule__SimpleType__PlatformTypeAssignment_3 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3329:1: ( ( rule__SimpleType__PlatformTypeAssignment_3 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3330:1: ( rule__SimpleType__PlatformTypeAssignment_3 )
            {
             before(grammarAccess.getSimpleTypeAccess().getPlatformTypeAssignment_3()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3331:1: ( rule__SimpleType__PlatformTypeAssignment_3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3331:2: rule__SimpleType__PlatformTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__SimpleType__PlatformTypeAssignment_3_in_rule__SimpleType__Group__3__Impl6791);
            rule__SimpleType__PlatformTypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getPlatformTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__3__Impl


    // $ANTLR start rule__Entity__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3349:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3353:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3354:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06829);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06832);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3361:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3365:1: ( ( 'entity' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3366:1: ( 'entity' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3366:1: ( 'entity' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3367:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Entity__Group__0__Impl6860); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3380:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3384:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3385:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16891);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16894);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3392:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3396:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3397:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3397:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3398:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3399:1: ( rule__Entity__NameAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3399:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl6921);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Entity__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3409:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3413:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3414:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26951);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26954);
            rule__Entity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3421:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3425:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3426:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3426:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3427:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3428:1: ( rule__Entity__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3428:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl6981);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2__Impl


    // $ANTLR start rule__Entity__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3438:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3442:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3443:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__37012);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__37015);
            rule__Entity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3450:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3454:1: ( ( '{' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3455:1: ( '{' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3455:1: ( '{' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3456:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Entity__Group__3__Impl7043); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3__Impl


    // $ANTLR start rule__Entity__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3469:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3473:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3474:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__47074);
            rule__Entity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__47077);
            rule__Entity__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3481:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__PropertiesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3485:1: ( ( ( rule__Entity__PropertiesAssignment_4 )* ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3486:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3486:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3487:1: ( rule__Entity__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3488:1: ( rule__Entity__PropertiesAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==58) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3488:2: rule__Entity__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__4__Impl7104);
            	    rule__Entity__PropertiesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4__Impl


    // $ANTLR start rule__Entity__Group__5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3498:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3502:1: ( rule__Entity__Group__5__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3503:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__57135);
            rule__Entity__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5


    // $ANTLR start rule__Entity__Group__5__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3509:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3513:1: ( ( '}' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3514:1: ( '}' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3514:1: ( '}' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3515:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__Entity__Group__5__Impl7163); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5__Impl


    // $ANTLR start rule__Entity__Group_2__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3540:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3544:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3545:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__07206);
            rule__Entity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__07209);
            rule__Entity__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0


    // $ANTLR start rule__Entity__Group_2__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3552:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3556:1: ( ( 'extends' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3557:1: ( 'extends' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3557:1: ( 'extends' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3558:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__Entity__Group_2__0__Impl7237); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0__Impl


    // $ANTLR start rule__Entity__Group_2__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3571:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3575:1: ( rule__Entity__Group_2__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3576:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__17268);
            rule__Entity__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1


    // $ANTLR start rule__Entity__Group_2__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3582:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3586:1: ( ( ( rule__Entity__ExtendsAssignment_2_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3587:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3587:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3588:1: ( rule__Entity__ExtendsAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3589:1: ( rule__Entity__ExtendsAssignment_2_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3589:2: rule__Entity__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__1__Impl7295);
            rule__Entity__ExtendsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1__Impl


    // $ANTLR start rule__Property__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3603:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3607:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3608:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07329);
            rule__Property__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07332);
            rule__Property__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0


    // $ANTLR start rule__Property__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3615:1: rule__Property__Group__0__Impl : ( ( rule__Property__DerivedAssignment_0 )? ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3619:1: ( ( ( rule__Property__DerivedAssignment_0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3620:1: ( ( rule__Property__DerivedAssignment_0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3620:1: ( ( rule__Property__DerivedAssignment_0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3621:1: ( rule__Property__DerivedAssignment_0 )?
            {
             before(grammarAccess.getPropertyAccess().getDerivedAssignment_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3622:1: ( rule__Property__DerivedAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==58) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3622:2: rule__Property__DerivedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Property__DerivedAssignment_0_in_rule__Property__Group__0__Impl7359);
                    rule__Property__DerivedAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getDerivedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0__Impl


    // $ANTLR start rule__Property__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3632:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3636:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3637:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17390);
            rule__Property__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17393);
            rule__Property__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1


    // $ANTLR start rule__Property__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3644:1: rule__Property__Group__1__Impl : ( ( rule__Property__DescriptionAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3648:1: ( ( ( rule__Property__DescriptionAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3649:1: ( ( rule__Property__DescriptionAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3649:1: ( ( rule__Property__DescriptionAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3650:1: ( rule__Property__DescriptionAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3651:1: ( rule__Property__DescriptionAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3651:2: rule__Property__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__DescriptionAssignment_1_in_rule__Property__Group__1__Impl7420);
            rule__Property__DescriptionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1__Impl


    // $ANTLR start rule__Property__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3661:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3665:1: ( rule__Property__Group__2__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3666:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27450);
            rule__Property__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2


    // $ANTLR start rule__Property__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3672:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3676:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3677:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3677:1: ( ( rule__Property__NameAssignment_2 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3678:1: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3679:1: ( rule__Property__NameAssignment_2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3679:2: rule__Property__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl7477);
            rule__Property__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2__Impl


    // $ANTLR start rule__ContentProvider__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3695:1: rule__ContentProvider__Group__0 : rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1 ;
    public final void rule__ContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3699:1: ( rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3700:2: rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__0__Impl_in_rule__ContentProvider__Group__07513);
            rule__ContentProvider__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__1_in_rule__ContentProvider__Group__07516);
            rule__ContentProvider__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__0


    // $ANTLR start rule__ContentProvider__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3707:1: rule__ContentProvider__Group__0__Impl : ( 'contentprovider' ) ;
    public final void rule__ContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3711:1: ( ( 'contentprovider' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3712:1: ( 'contentprovider' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3712:1: ( 'contentprovider' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3713:1: 'contentprovider'
            {
             before(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ContentProvider__Group__0__Impl7544); 
             after(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__0__Impl


    // $ANTLR start rule__ContentProvider__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3726:1: rule__ContentProvider__Group__1 : rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2 ;
    public final void rule__ContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3730:1: ( rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3731:2: rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__1__Impl_in_rule__ContentProvider__Group__17575);
            rule__ContentProvider__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__2_in_rule__ContentProvider__Group__17578);
            rule__ContentProvider__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__1


    // $ANTLR start rule__ContentProvider__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3738:1: rule__ContentProvider__Group__1__Impl : ( ( rule__ContentProvider__NameAssignment_1 ) ) ;
    public final void rule__ContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3742:1: ( ( ( rule__ContentProvider__NameAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3743:1: ( ( rule__ContentProvider__NameAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3743:1: ( ( rule__ContentProvider__NameAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3744:1: ( rule__ContentProvider__NameAssignment_1 )
            {
             before(grammarAccess.getContentProviderAccess().getNameAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3745:1: ( rule__ContentProvider__NameAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3745:2: rule__ContentProvider__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ContentProvider__NameAssignment_1_in_rule__ContentProvider__Group__1__Impl7605);
            rule__ContentProvider__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__1__Impl


    // $ANTLR start rule__ContentProvider__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3755:1: rule__ContentProvider__Group__2 : rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3 ;
    public final void rule__ContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3759:1: ( rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3760:2: rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__2__Impl_in_rule__ContentProvider__Group__27635);
            rule__ContentProvider__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__3_in_rule__ContentProvider__Group__27638);
            rule__ContentProvider__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__2


    // $ANTLR start rule__ContentProvider__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3767:1: rule__ContentProvider__Group__2__Impl : ( ( rule__ContentProvider__Group_2__0 )? ) ;
    public final void rule__ContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3771:1: ( ( ( rule__ContentProvider__Group_2__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3772:1: ( ( rule__ContentProvider__Group_2__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3772:1: ( ( rule__ContentProvider__Group_2__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3773:1: ( rule__ContentProvider__Group_2__0 )?
            {
             before(grammarAccess.getContentProviderAccess().getGroup_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3774:1: ( rule__ContentProvider__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3774:2: rule__ContentProvider__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ContentProvider__Group_2__0_in_rule__ContentProvider__Group__2__Impl7665);
                    rule__ContentProvider__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentProviderAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__2__Impl


    // $ANTLR start rule__ContentProvider__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3784:1: rule__ContentProvider__Group__3 : rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4 ;
    public final void rule__ContentProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3788:1: ( rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3789:2: rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__3__Impl_in_rule__ContentProvider__Group__37696);
            rule__ContentProvider__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__4_in_rule__ContentProvider__Group__37699);
            rule__ContentProvider__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__3


    // $ANTLR start rule__ContentProvider__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3796:1: rule__ContentProvider__Group__3__Impl : ( ( rule__ContentProvider__Alternatives_3 ) ) ;
    public final void rule__ContentProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3800:1: ( ( ( rule__ContentProvider__Alternatives_3 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3801:1: ( ( rule__ContentProvider__Alternatives_3 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3801:1: ( ( rule__ContentProvider__Alternatives_3 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3802:1: ( rule__ContentProvider__Alternatives_3 )
            {
             before(grammarAccess.getContentProviderAccess().getAlternatives_3()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3803:1: ( rule__ContentProvider__Alternatives_3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3803:2: rule__ContentProvider__Alternatives_3
            {
            pushFollow(FOLLOW_rule__ContentProvider__Alternatives_3_in_rule__ContentProvider__Group__3__Impl7726);
            rule__ContentProvider__Alternatives_3();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__3__Impl


    // $ANTLR start rule__ContentProvider__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3813:1: rule__ContentProvider__Group__4 : rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5 ;
    public final void rule__ContentProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3817:1: ( rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3818:2: rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__4__Impl_in_rule__ContentProvider__Group__47756);
            rule__ContentProvider__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__5_in_rule__ContentProvider__Group__47759);
            rule__ContentProvider__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__4


    // $ANTLR start rule__ContentProvider__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3825:1: rule__ContentProvider__Group__4__Impl : ( ( rule__ContentProvider__TypeAssignment_4 ) ) ;
    public final void rule__ContentProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3829:1: ( ( ( rule__ContentProvider__TypeAssignment_4 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3830:1: ( ( rule__ContentProvider__TypeAssignment_4 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3830:1: ( ( rule__ContentProvider__TypeAssignment_4 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3831:1: ( rule__ContentProvider__TypeAssignment_4 )
            {
             before(grammarAccess.getContentProviderAccess().getTypeAssignment_4()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3832:1: ( rule__ContentProvider__TypeAssignment_4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3832:2: rule__ContentProvider__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__ContentProvider__TypeAssignment_4_in_rule__ContentProvider__Group__4__Impl7786);
            rule__ContentProvider__TypeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__4__Impl


    // $ANTLR start rule__ContentProvider__Group__5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3842:1: rule__ContentProvider__Group__5 : rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6 ;
    public final void rule__ContentProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3846:1: ( rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3847:2: rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__5__Impl_in_rule__ContentProvider__Group__57816);
            rule__ContentProvider__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__6_in_rule__ContentProvider__Group__57819);
            rule__ContentProvider__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__5


    // $ANTLR start rule__ContentProvider__Group__5__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3854:1: rule__ContentProvider__Group__5__Impl : ( ( rule__ContentProvider__ManyAssignment_5 )? ) ;
    public final void rule__ContentProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3858:1: ( ( ( rule__ContentProvider__ManyAssignment_5 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3859:1: ( ( rule__ContentProvider__ManyAssignment_5 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3859:1: ( ( rule__ContentProvider__ManyAssignment_5 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3860:1: ( rule__ContentProvider__ManyAssignment_5 )?
            {
             before(grammarAccess.getContentProviderAccess().getManyAssignment_5()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3861:1: ( rule__ContentProvider__ManyAssignment_5 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3861:2: rule__ContentProvider__ManyAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ContentProvider__ManyAssignment_5_in_rule__ContentProvider__Group__5__Impl7846);
                    rule__ContentProvider__ManyAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentProviderAccess().getManyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__5__Impl


    // $ANTLR start rule__ContentProvider__Group__6
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3871:1: rule__ContentProvider__Group__6 : rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7 ;
    public final void rule__ContentProvider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3875:1: ( rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3876:2: rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__6__Impl_in_rule__ContentProvider__Group__67877);
            rule__ContentProvider__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__7_in_rule__ContentProvider__Group__67880);
            rule__ContentProvider__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__6


    // $ANTLR start rule__ContentProvider__Group__6__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3883:1: rule__ContentProvider__Group__6__Impl : ( 'fetches' ) ;
    public final void rule__ContentProvider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3887:1: ( ( 'fetches' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3888:1: ( 'fetches' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3888:1: ( 'fetches' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3889:1: 'fetches'
            {
             before(grammarAccess.getContentProviderAccess().getFetchesKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__ContentProvider__Group__6__Impl7908); 
             after(grammarAccess.getContentProviderAccess().getFetchesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__6__Impl


    // $ANTLR start rule__ContentProvider__Group__7
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3902:1: rule__ContentProvider__Group__7 : rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8 ;
    public final void rule__ContentProvider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3906:1: ( rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3907:2: rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__7__Impl_in_rule__ContentProvider__Group__77939);
            rule__ContentProvider__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__8_in_rule__ContentProvider__Group__77942);
            rule__ContentProvider__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__7


    // $ANTLR start rule__ContentProvider__Group__7__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3914:1: rule__ContentProvider__Group__7__Impl : ( 'XML' ) ;
    public final void rule__ContentProvider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3918:1: ( ( 'XML' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3919:1: ( 'XML' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3919:1: ( 'XML' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3920:1: 'XML'
            {
             before(grammarAccess.getContentProviderAccess().getXMLKeyword_7()); 
            match(input,40,FOLLOW_40_in_rule__ContentProvider__Group__7__Impl7970); 
             after(grammarAccess.getContentProviderAccess().getXMLKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__7__Impl


    // $ANTLR start rule__ContentProvider__Group__8
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3933:1: rule__ContentProvider__Group__8 : rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9 ;
    public final void rule__ContentProvider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3937:1: ( rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3938:2: rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__8__Impl_in_rule__ContentProvider__Group__88001);
            rule__ContentProvider__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__9_in_rule__ContentProvider__Group__88004);
            rule__ContentProvider__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__8


    // $ANTLR start rule__ContentProvider__Group__8__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3945:1: rule__ContentProvider__Group__8__Impl : ( 'from' ) ;
    public final void rule__ContentProvider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3949:1: ( ( 'from' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3950:1: ( 'from' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3950:1: ( 'from' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3951:1: 'from'
            {
             before(grammarAccess.getContentProviderAccess().getFromKeyword_8()); 
            match(input,41,FOLLOW_41_in_rule__ContentProvider__Group__8__Impl8032); 
             after(grammarAccess.getContentProviderAccess().getFromKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__8__Impl


    // $ANTLR start rule__ContentProvider__Group__9
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3964:1: rule__ContentProvider__Group__9 : rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10 ;
    public final void rule__ContentProvider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3968:1: ( rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3969:2: rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__9__Impl_in_rule__ContentProvider__Group__98063);
            rule__ContentProvider__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__10_in_rule__ContentProvider__Group__98066);
            rule__ContentProvider__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__9


    // $ANTLR start rule__ContentProvider__Group__9__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3976:1: rule__ContentProvider__Group__9__Impl : ( ( rule__ContentProvider__UrlAssignment_9 ) ) ;
    public final void rule__ContentProvider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3980:1: ( ( ( rule__ContentProvider__UrlAssignment_9 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3981:1: ( ( rule__ContentProvider__UrlAssignment_9 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3981:1: ( ( rule__ContentProvider__UrlAssignment_9 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3982:1: ( rule__ContentProvider__UrlAssignment_9 )
            {
             before(grammarAccess.getContentProviderAccess().getUrlAssignment_9()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3983:1: ( rule__ContentProvider__UrlAssignment_9 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3983:2: rule__ContentProvider__UrlAssignment_9
            {
            pushFollow(FOLLOW_rule__ContentProvider__UrlAssignment_9_in_rule__ContentProvider__Group__9__Impl8093);
            rule__ContentProvider__UrlAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getUrlAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__9__Impl


    // $ANTLR start rule__ContentProvider__Group__10
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3993:1: rule__ContentProvider__Group__10 : rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11 ;
    public final void rule__ContentProvider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3997:1: ( rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3998:2: rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__10__Impl_in_rule__ContentProvider__Group__108123);
            rule__ContentProvider__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__11_in_rule__ContentProvider__Group__108126);
            rule__ContentProvider__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__10


    // $ANTLR start rule__ContentProvider__Group__10__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4005:1: rule__ContentProvider__Group__10__Impl : ( 'selects' ) ;
    public final void rule__ContentProvider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4009:1: ( ( 'selects' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4010:1: ( 'selects' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4010:1: ( 'selects' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4011:1: 'selects'
            {
             before(grammarAccess.getContentProviderAccess().getSelectsKeyword_10()); 
            match(input,42,FOLLOW_42_in_rule__ContentProvider__Group__10__Impl8154); 
             after(grammarAccess.getContentProviderAccess().getSelectsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__10__Impl


    // $ANTLR start rule__ContentProvider__Group__11
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4024:1: rule__ContentProvider__Group__11 : rule__ContentProvider__Group__11__Impl ;
    public final void rule__ContentProvider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4028:1: ( rule__ContentProvider__Group__11__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4029:2: rule__ContentProvider__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__11__Impl_in_rule__ContentProvider__Group__118185);
            rule__ContentProvider__Group__11__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__11


    // $ANTLR start rule__ContentProvider__Group__11__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4035:1: rule__ContentProvider__Group__11__Impl : ( ( rule__ContentProvider__SelectionAssignment_11 ) ) ;
    public final void rule__ContentProvider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4039:1: ( ( ( rule__ContentProvider__SelectionAssignment_11 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4040:1: ( ( rule__ContentProvider__SelectionAssignment_11 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4040:1: ( ( rule__ContentProvider__SelectionAssignment_11 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4041:1: ( rule__ContentProvider__SelectionAssignment_11 )
            {
             before(grammarAccess.getContentProviderAccess().getSelectionAssignment_11()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4042:1: ( rule__ContentProvider__SelectionAssignment_11 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4042:2: rule__ContentProvider__SelectionAssignment_11
            {
            pushFollow(FOLLOW_rule__ContentProvider__SelectionAssignment_11_in_rule__ContentProvider__Group__11__Impl8212);
            rule__ContentProvider__SelectionAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getSelectionAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__11__Impl


    // $ANTLR start rule__ContentProvider__Group_2__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4076:1: rule__ContentProvider__Group_2__0 : rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1 ;
    public final void rule__ContentProvider__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4080:1: ( rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4081:2: rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__0__Impl_in_rule__ContentProvider__Group_2__08266);
            rule__ContentProvider__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group_2__1_in_rule__ContentProvider__Group_2__08269);
            rule__ContentProvider__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__0


    // $ANTLR start rule__ContentProvider__Group_2__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4088:1: rule__ContentProvider__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ContentProvider__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4092:1: ( ( '(' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4093:1: ( '(' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4093:1: ( '(' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4094:1: '('
            {
             before(grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__ContentProvider__Group_2__0__Impl8297); 
             after(grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__0__Impl


    // $ANTLR start rule__ContentProvider__Group_2__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4107:1: rule__ContentProvider__Group_2__1 : rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2 ;
    public final void rule__ContentProvider__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4111:1: ( rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4112:2: rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__1__Impl_in_rule__ContentProvider__Group_2__18328);
            rule__ContentProvider__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group_2__2_in_rule__ContentProvider__Group_2__18331);
            rule__ContentProvider__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__1


    // $ANTLR start rule__ContentProvider__Group_2__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4119:1: rule__ContentProvider__Group_2__1__Impl : ( ( rule__ContentProvider__ParameterAssignment_2_1 ) ) ;
    public final void rule__ContentProvider__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4123:1: ( ( ( rule__ContentProvider__ParameterAssignment_2_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4124:1: ( ( rule__ContentProvider__ParameterAssignment_2_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4124:1: ( ( rule__ContentProvider__ParameterAssignment_2_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4125:1: ( rule__ContentProvider__ParameterAssignment_2_1 )
            {
             before(grammarAccess.getContentProviderAccess().getParameterAssignment_2_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4126:1: ( rule__ContentProvider__ParameterAssignment_2_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4126:2: rule__ContentProvider__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ContentProvider__ParameterAssignment_2_1_in_rule__ContentProvider__Group_2__1__Impl8358);
            rule__ContentProvider__ParameterAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getParameterAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__1__Impl


    // $ANTLR start rule__ContentProvider__Group_2__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4136:1: rule__ContentProvider__Group_2__2 : rule__ContentProvider__Group_2__2__Impl ;
    public final void rule__ContentProvider__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4140:1: ( rule__ContentProvider__Group_2__2__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4141:2: rule__ContentProvider__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__2__Impl_in_rule__ContentProvider__Group_2__28388);
            rule__ContentProvider__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__2


    // $ANTLR start rule__ContentProvider__Group_2__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4147:1: rule__ContentProvider__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ContentProvider__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4151:1: ( ( ')' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4152:1: ( ')' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4152:1: ( ')' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4153:1: ')'
            {
             before(grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__ContentProvider__Group_2__2__Impl8416); 
             after(grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__2__Impl


    // $ANTLR start rule__ProviderConstruction__Group_0__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4172:1: rule__ProviderConstruction__Group_0__0 : rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1 ;
    public final void rule__ProviderConstruction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4176:1: ( rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4177:2: rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__0__Impl_in_rule__ProviderConstruction__Group_0__08453);
            rule__ProviderConstruction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__1_in_rule__ProviderConstruction__Group_0__08456);
            rule__ProviderConstruction__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__0


    // $ANTLR start rule__ProviderConstruction__Group_0__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4184:1: rule__ProviderConstruction__Group_0__0__Impl : ( () ) ;
    public final void rule__ProviderConstruction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4188:1: ( ( () ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4189:1: ( () )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4189:1: ( () )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4190:1: ()
            {
             before(grammarAccess.getProviderConstructionAccess().getComplexProviderConstructionAction_0_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4191:1: ()
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4193:1: 
            {
            }

             after(grammarAccess.getProviderConstructionAccess().getComplexProviderConstructionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__0__Impl


    // $ANTLR start rule__ProviderConstruction__Group_0__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4203:1: rule__ProviderConstruction__Group_0__1 : rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2 ;
    public final void rule__ProviderConstruction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4207:1: ( rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4208:2: rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__1__Impl_in_rule__ProviderConstruction__Group_0__18514);
            rule__ProviderConstruction__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__2_in_rule__ProviderConstruction__Group_0__18517);
            rule__ProviderConstruction__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__1


    // $ANTLR start rule__ProviderConstruction__Group_0__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4215:1: rule__ProviderConstruction__Group_0__1__Impl : ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) ) ;
    public final void rule__ProviderConstruction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4219:1: ( ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4220:1: ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4220:1: ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4221:1: ( rule__ProviderConstruction__ProviderAssignment_0_1 )
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderAssignment_0_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4222:1: ( rule__ProviderConstruction__ProviderAssignment_0_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4222:2: rule__ProviderConstruction__ProviderAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__ProviderAssignment_0_1_in_rule__ProviderConstruction__Group_0__1__Impl8544);
            rule__ProviderConstruction__ProviderAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getProviderConstructionAccess().getProviderAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__1__Impl


    // $ANTLR start rule__ProviderConstruction__Group_0__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4232:1: rule__ProviderConstruction__Group_0__2 : rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3 ;
    public final void rule__ProviderConstruction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4236:1: ( rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4237:2: rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__2__Impl_in_rule__ProviderConstruction__Group_0__28574);
            rule__ProviderConstruction__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__3_in_rule__ProviderConstruction__Group_0__28577);
            rule__ProviderConstruction__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__2


    // $ANTLR start rule__ProviderConstruction__Group_0__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4244:1: rule__ProviderConstruction__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ProviderConstruction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4248:1: ( ( '(' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4249:1: ( '(' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4249:1: ( '(' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4250:1: '('
            {
             before(grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,18,FOLLOW_18_in_rule__ProviderConstruction__Group_0__2__Impl8605); 
             after(grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__2__Impl


    // $ANTLR start rule__ProviderConstruction__Group_0__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4263:1: rule__ProviderConstruction__Group_0__3 : rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4 ;
    public final void rule__ProviderConstruction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4267:1: ( rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4268:2: rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__3__Impl_in_rule__ProviderConstruction__Group_0__38636);
            rule__ProviderConstruction__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__4_in_rule__ProviderConstruction__Group_0__38639);
            rule__ProviderConstruction__Group_0__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__3


    // $ANTLR start rule__ProviderConstruction__Group_0__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4275:1: rule__ProviderConstruction__Group_0__3__Impl : ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? ) ;
    public final void rule__ProviderConstruction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4279:1: ( ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4280:1: ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4280:1: ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4281:1: ( rule__ProviderConstruction__ArgumentAssignment_0_3 )?
            {
             before(grammarAccess.getProviderConstructionAccess().getArgumentAssignment_0_3()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4282:1: ( rule__ProviderConstruction__ArgumentAssignment_0_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==18||LA25_0==20||(LA25_0>=22 && LA25_0<=23)||LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4282:2: rule__ProviderConstruction__ArgumentAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__ArgumentAssignment_0_3_in_rule__ProviderConstruction__Group_0__3__Impl8666);
                    rule__ProviderConstruction__ArgumentAssignment_0_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProviderConstructionAccess().getArgumentAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__3__Impl


    // $ANTLR start rule__ProviderConstruction__Group_0__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4292:1: rule__ProviderConstruction__Group_0__4 : rule__ProviderConstruction__Group_0__4__Impl ;
    public final void rule__ProviderConstruction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4296:1: ( rule__ProviderConstruction__Group_0__4__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4297:2: rule__ProviderConstruction__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__4__Impl_in_rule__ProviderConstruction__Group_0__48697);
            rule__ProviderConstruction__Group_0__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__4


    // $ANTLR start rule__ProviderConstruction__Group_0__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4303:1: rule__ProviderConstruction__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ProviderConstruction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4307:1: ( ( ')' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4308:1: ( ')' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4308:1: ( ')' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4309:1: ')'
            {
             before(grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,19,FOLLOW_19_in_rule__ProviderConstruction__Group_0__4__Impl8725); 
             after(grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__4__Impl


    // $ANTLR start rule__ProviderConstruction__Group_1__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4332:1: rule__ProviderConstruction__Group_1__0 : rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1 ;
    public final void rule__ProviderConstruction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4336:1: ( rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4337:2: rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__0__Impl_in_rule__ProviderConstruction__Group_1__08766);
            rule__ProviderConstruction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__1_in_rule__ProviderConstruction__Group_1__08769);
            rule__ProviderConstruction__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_1__0


    // $ANTLR start rule__ProviderConstruction__Group_1__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4344:1: rule__ProviderConstruction__Group_1__0__Impl : ( () ) ;
    public final void rule__ProviderConstruction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4348:1: ( ( () ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4349:1: ( () )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4349:1: ( () )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4350:1: ()
            {
             before(grammarAccess.getProviderConstructionAccess().getSimpleProviderConstructionAction_1_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4351:1: ()
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4353:1: 
            {
            }

             after(grammarAccess.getProviderConstructionAccess().getSimpleProviderConstructionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_1__0__Impl


    // $ANTLR start rule__ProviderConstruction__Group_1__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4363:1: rule__ProviderConstruction__Group_1__1 : rule__ProviderConstruction__Group_1__1__Impl ;
    public final void rule__ProviderConstruction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4367:1: ( rule__ProviderConstruction__Group_1__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4368:2: rule__ProviderConstruction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__1__Impl_in_rule__ProviderConstruction__Group_1__18827);
            rule__ProviderConstruction__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_1__1


    // $ANTLR start rule__ProviderConstruction__Group_1__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4374:1: rule__ProviderConstruction__Group_1__1__Impl : ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) ) ;
    public final void rule__ProviderConstruction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4378:1: ( ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4379:1: ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4379:1: ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4380:1: ( rule__ProviderConstruction__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getProviderConstructionAccess().getExpressionAssignment_1_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4381:1: ( rule__ProviderConstruction__ExpressionAssignment_1_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4381:2: rule__ProviderConstruction__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__ExpressionAssignment_1_1_in_rule__ProviderConstruction__Group_1__1__Impl8854);
            rule__ProviderConstruction__ExpressionAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getProviderConstructionAccess().getExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_1__1__Impl


    // $ANTLR start rule__TableView__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4395:1: rule__TableView__Group__0 : rule__TableView__Group__0__Impl rule__TableView__Group__1 ;
    public final void rule__TableView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4399:1: ( rule__TableView__Group__0__Impl rule__TableView__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4400:2: rule__TableView__Group__0__Impl rule__TableView__Group__1
            {
            pushFollow(FOLLOW_rule__TableView__Group__0__Impl_in_rule__TableView__Group__08888);
            rule__TableView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__1_in_rule__TableView__Group__08891);
            rule__TableView__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__0


    // $ANTLR start rule__TableView__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4407:1: rule__TableView__Group__0__Impl : ( 'tableview' ) ;
    public final void rule__TableView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4411:1: ( ( 'tableview' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4412:1: ( 'tableview' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4412:1: ( 'tableview' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4413:1: 'tableview'
            {
             before(grammarAccess.getTableViewAccess().getTableviewKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__TableView__Group__0__Impl8919); 
             after(grammarAccess.getTableViewAccess().getTableviewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__0__Impl


    // $ANTLR start rule__TableView__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4426:1: rule__TableView__Group__1 : rule__TableView__Group__1__Impl rule__TableView__Group__2 ;
    public final void rule__TableView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4430:1: ( rule__TableView__Group__1__Impl rule__TableView__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4431:2: rule__TableView__Group__1__Impl rule__TableView__Group__2
            {
            pushFollow(FOLLOW_rule__TableView__Group__1__Impl_in_rule__TableView__Group__18950);
            rule__TableView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__2_in_rule__TableView__Group__18953);
            rule__TableView__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__1


    // $ANTLR start rule__TableView__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4438:1: rule__TableView__Group__1__Impl : ( ( rule__TableView__NameAssignment_1 ) ) ;
    public final void rule__TableView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4442:1: ( ( ( rule__TableView__NameAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4443:1: ( ( rule__TableView__NameAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4443:1: ( ( rule__TableView__NameAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4444:1: ( rule__TableView__NameAssignment_1 )
            {
             before(grammarAccess.getTableViewAccess().getNameAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4445:1: ( rule__TableView__NameAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4445:2: rule__TableView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TableView__NameAssignment_1_in_rule__TableView__Group__1__Impl8980);
            rule__TableView__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTableViewAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__1__Impl


    // $ANTLR start rule__TableView__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4455:1: rule__TableView__Group__2 : rule__TableView__Group__2__Impl rule__TableView__Group__3 ;
    public final void rule__TableView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4459:1: ( rule__TableView__Group__2__Impl rule__TableView__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4460:2: rule__TableView__Group__2__Impl rule__TableView__Group__3
            {
            pushFollow(FOLLOW_rule__TableView__Group__2__Impl_in_rule__TableView__Group__29010);
            rule__TableView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__3_in_rule__TableView__Group__29013);
            rule__TableView__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__2


    // $ANTLR start rule__TableView__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4467:1: rule__TableView__Group__2__Impl : ( ( rule__TableView__Group_2__0 )? ) ;
    public final void rule__TableView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4471:1: ( ( ( rule__TableView__Group_2__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4472:1: ( ( rule__TableView__Group_2__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4472:1: ( ( rule__TableView__Group_2__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4473:1: ( rule__TableView__Group_2__0 )?
            {
             before(grammarAccess.getTableViewAccess().getGroup_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4474:1: ( rule__TableView__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4474:2: rule__TableView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TableView__Group_2__0_in_rule__TableView__Group__2__Impl9040);
                    rule__TableView__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableViewAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__2__Impl


    // $ANTLR start rule__TableView__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4484:1: rule__TableView__Group__3 : rule__TableView__Group__3__Impl rule__TableView__Group__4 ;
    public final void rule__TableView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4488:1: ( rule__TableView__Group__3__Impl rule__TableView__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4489:2: rule__TableView__Group__3__Impl rule__TableView__Group__4
            {
            pushFollow(FOLLOW_rule__TableView__Group__3__Impl_in_rule__TableView__Group__39071);
            rule__TableView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__4_in_rule__TableView__Group__39074);
            rule__TableView__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__3


    // $ANTLR start rule__TableView__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4496:1: rule__TableView__Group__3__Impl : ( '{' ) ;
    public final void rule__TableView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4500:1: ( ( '{' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4501:1: ( '{' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4501:1: ( '{' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4502:1: '{'
            {
             before(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__TableView__Group__3__Impl9102); 
             after(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__3__Impl


    // $ANTLR start rule__TableView__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4515:1: rule__TableView__Group__4 : rule__TableView__Group__4__Impl rule__TableView__Group__5 ;
    public final void rule__TableView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4519:1: ( rule__TableView__Group__4__Impl rule__TableView__Group__5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4520:2: rule__TableView__Group__4__Impl rule__TableView__Group__5
            {
            pushFollow(FOLLOW_rule__TableView__Group__4__Impl_in_rule__TableView__Group__49133);
            rule__TableView__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__5_in_rule__TableView__Group__49136);
            rule__TableView__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__4


    // $ANTLR start rule__TableView__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4527:1: rule__TableView__Group__4__Impl : ( 'title=' ) ;
    public final void rule__TableView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4531:1: ( ( 'title=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4532:1: ( 'title=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4532:1: ( 'title=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4533:1: 'title='
            {
             before(grammarAccess.getTableViewAccess().getTitleKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__TableView__Group__4__Impl9164); 
             after(grammarAccess.getTableViewAccess().getTitleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__4__Impl


    // $ANTLR start rule__TableView__Group__5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4546:1: rule__TableView__Group__5 : rule__TableView__Group__5__Impl rule__TableView__Group__6 ;
    public final void rule__TableView__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4550:1: ( rule__TableView__Group__5__Impl rule__TableView__Group__6 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4551:2: rule__TableView__Group__5__Impl rule__TableView__Group__6
            {
            pushFollow(FOLLOW_rule__TableView__Group__5__Impl_in_rule__TableView__Group__59195);
            rule__TableView__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__6_in_rule__TableView__Group__59198);
            rule__TableView__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__5


    // $ANTLR start rule__TableView__Group__5__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4558:1: rule__TableView__Group__5__Impl : ( ( rule__TableView__TitleAssignment_5 ) ) ;
    public final void rule__TableView__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4562:1: ( ( ( rule__TableView__TitleAssignment_5 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4563:1: ( ( rule__TableView__TitleAssignment_5 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4563:1: ( ( rule__TableView__TitleAssignment_5 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4564:1: ( rule__TableView__TitleAssignment_5 )
            {
             before(grammarAccess.getTableViewAccess().getTitleAssignment_5()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4565:1: ( rule__TableView__TitleAssignment_5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4565:2: rule__TableView__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__TableView__TitleAssignment_5_in_rule__TableView__Group__5__Impl9225);
            rule__TableView__TitleAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getTableViewAccess().getTitleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__5__Impl


    // $ANTLR start rule__TableView__Group__6
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4575:1: rule__TableView__Group__6 : rule__TableView__Group__6__Impl rule__TableView__Group__7 ;
    public final void rule__TableView__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4579:1: ( rule__TableView__Group__6__Impl rule__TableView__Group__7 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4580:2: rule__TableView__Group__6__Impl rule__TableView__Group__7
            {
            pushFollow(FOLLOW_rule__TableView__Group__6__Impl_in_rule__TableView__Group__69255);
            rule__TableView__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__7_in_rule__TableView__Group__69258);
            rule__TableView__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__6


    // $ANTLR start rule__TableView__Group__6__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4587:1: rule__TableView__Group__6__Impl : ( ( rule__TableView__SectionsAssignment_6 )* ) ;
    public final void rule__TableView__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4591:1: ( ( ( rule__TableView__SectionsAssignment_6 )* ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4592:1: ( ( rule__TableView__SectionsAssignment_6 )* )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4592:1: ( ( rule__TableView__SectionsAssignment_6 )* )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4593:1: ( rule__TableView__SectionsAssignment_6 )*
            {
             before(grammarAccess.getTableViewAccess().getSectionsAssignment_6()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4594:1: ( rule__TableView__SectionsAssignment_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==51) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4594:2: rule__TableView__SectionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__TableView__SectionsAssignment_6_in_rule__TableView__Group__6__Impl9285);
            	    rule__TableView__SectionsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getTableViewAccess().getSectionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__6__Impl


    // $ANTLR start rule__TableView__Group__7
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4604:1: rule__TableView__Group__7 : rule__TableView__Group__7__Impl ;
    public final void rule__TableView__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4608:1: ( rule__TableView__Group__7__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4609:2: rule__TableView__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__TableView__Group__7__Impl_in_rule__TableView__Group__79316);
            rule__TableView__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__7


    // $ANTLR start rule__TableView__Group__7__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4615:1: rule__TableView__Group__7__Impl : ( '}' ) ;
    public final void rule__TableView__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4619:1: ( ( '}' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4620:1: ( '}' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4620:1: ( '}' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4621:1: '}'
            {
             before(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_7()); 
            match(input,28,FOLLOW_28_in_rule__TableView__Group__7__Impl9344); 
             after(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__7__Impl


    // $ANTLR start rule__TableView__Group_2__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4650:1: rule__TableView__Group_2__0 : rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1 ;
    public final void rule__TableView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4654:1: ( rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4655:2: rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__0__Impl_in_rule__TableView__Group_2__09391);
            rule__TableView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group_2__1_in_rule__TableView__Group_2__09394);
            rule__TableView__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__0


    // $ANTLR start rule__TableView__Group_2__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4662:1: rule__TableView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TableView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4666:1: ( ( '(' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4667:1: ( '(' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4667:1: ( '(' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4668:1: '('
            {
             before(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__TableView__Group_2__0__Impl9422); 
             after(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__0__Impl


    // $ANTLR start rule__TableView__Group_2__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4681:1: rule__TableView__Group_2__1 : rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2 ;
    public final void rule__TableView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4685:1: ( rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4686:2: rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__1__Impl_in_rule__TableView__Group_2__19453);
            rule__TableView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group_2__2_in_rule__TableView__Group_2__19456);
            rule__TableView__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__1


    // $ANTLR start rule__TableView__Group_2__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4693:1: rule__TableView__Group_2__1__Impl : ( ( rule__TableView__ContentAssignment_2_1 ) ) ;
    public final void rule__TableView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4697:1: ( ( ( rule__TableView__ContentAssignment_2_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4698:1: ( ( rule__TableView__ContentAssignment_2_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4698:1: ( ( rule__TableView__ContentAssignment_2_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4699:1: ( rule__TableView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getTableViewAccess().getContentAssignment_2_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4700:1: ( rule__TableView__ContentAssignment_2_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4700:2: rule__TableView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TableView__ContentAssignment_2_1_in_rule__TableView__Group_2__1__Impl9483);
            rule__TableView__ContentAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getTableViewAccess().getContentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__1__Impl


    // $ANTLR start rule__TableView__Group_2__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4710:1: rule__TableView__Group_2__2 : rule__TableView__Group_2__2__Impl ;
    public final void rule__TableView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4714:1: ( rule__TableView__Group_2__2__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4715:2: rule__TableView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__2__Impl_in_rule__TableView__Group_2__29513);
            rule__TableView__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__2


    // $ANTLR start rule__TableView__Group_2__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4721:1: rule__TableView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TableView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4725:1: ( ( ')' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4726:1: ( ')' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4726:1: ( ')' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4727:1: ')'
            {
             before(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__TableView__Group_2__2__Impl9541); 
             after(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__2__Impl


    // $ANTLR start rule__DetailsView__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4746:1: rule__DetailsView__Group__0 : rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1 ;
    public final void rule__DetailsView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4750:1: ( rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4751:2: rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__0__Impl_in_rule__DetailsView__Group__09578);
            rule__DetailsView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__1_in_rule__DetailsView__Group__09581);
            rule__DetailsView__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__0


    // $ANTLR start rule__DetailsView__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4758:1: rule__DetailsView__Group__0__Impl : ( 'detailsview' ) ;
    public final void rule__DetailsView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4762:1: ( ( 'detailsview' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4763:1: ( 'detailsview' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4763:1: ( 'detailsview' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4764:1: 'detailsview'
            {
             before(grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__DetailsView__Group__0__Impl9609); 
             after(grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__0__Impl


    // $ANTLR start rule__DetailsView__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4777:1: rule__DetailsView__Group__1 : rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2 ;
    public final void rule__DetailsView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4781:1: ( rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4782:2: rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__1__Impl_in_rule__DetailsView__Group__19640);
            rule__DetailsView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__2_in_rule__DetailsView__Group__19643);
            rule__DetailsView__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__1


    // $ANTLR start rule__DetailsView__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4789:1: rule__DetailsView__Group__1__Impl : ( ( rule__DetailsView__NameAssignment_1 ) ) ;
    public final void rule__DetailsView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4793:1: ( ( ( rule__DetailsView__NameAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4794:1: ( ( rule__DetailsView__NameAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4794:1: ( ( rule__DetailsView__NameAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4795:1: ( rule__DetailsView__NameAssignment_1 )
            {
             before(grammarAccess.getDetailsViewAccess().getNameAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4796:1: ( rule__DetailsView__NameAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4796:2: rule__DetailsView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DetailsView__NameAssignment_1_in_rule__DetailsView__Group__1__Impl9670);
            rule__DetailsView__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDetailsViewAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__1__Impl


    // $ANTLR start rule__DetailsView__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4806:1: rule__DetailsView__Group__2 : rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3 ;
    public final void rule__DetailsView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4810:1: ( rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4811:2: rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__2__Impl_in_rule__DetailsView__Group__29700);
            rule__DetailsView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__3_in_rule__DetailsView__Group__29703);
            rule__DetailsView__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__2


    // $ANTLR start rule__DetailsView__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4818:1: rule__DetailsView__Group__2__Impl : ( ( rule__DetailsView__Group_2__0 )? ) ;
    public final void rule__DetailsView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4822:1: ( ( ( rule__DetailsView__Group_2__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4823:1: ( ( rule__DetailsView__Group_2__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4823:1: ( ( rule__DetailsView__Group_2__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4824:1: ( rule__DetailsView__Group_2__0 )?
            {
             before(grammarAccess.getDetailsViewAccess().getGroup_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4825:1: ( rule__DetailsView__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4825:2: rule__DetailsView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DetailsView__Group_2__0_in_rule__DetailsView__Group__2__Impl9730);
                    rule__DetailsView__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDetailsViewAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__2__Impl


    // $ANTLR start rule__DetailsView__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4835:1: rule__DetailsView__Group__3 : rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4 ;
    public final void rule__DetailsView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4839:1: ( rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4840:2: rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__3__Impl_in_rule__DetailsView__Group__39761);
            rule__DetailsView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__4_in_rule__DetailsView__Group__39764);
            rule__DetailsView__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__3


    // $ANTLR start rule__DetailsView__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4847:1: rule__DetailsView__Group__3__Impl : ( '{' ) ;
    public final void rule__DetailsView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4851:1: ( ( '{' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4852:1: ( '{' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4852:1: ( '{' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4853:1: '{'
            {
             before(grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__DetailsView__Group__3__Impl9792); 
             after(grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__3__Impl


    // $ANTLR start rule__DetailsView__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4866:1: rule__DetailsView__Group__4 : rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5 ;
    public final void rule__DetailsView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4870:1: ( rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4871:2: rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__4__Impl_in_rule__DetailsView__Group__49823);
            rule__DetailsView__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__5_in_rule__DetailsView__Group__49826);
            rule__DetailsView__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__4


    // $ANTLR start rule__DetailsView__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4878:1: rule__DetailsView__Group__4__Impl : ( 'title=' ) ;
    public final void rule__DetailsView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4882:1: ( ( 'title=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4883:1: ( 'title=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4883:1: ( 'title=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4884:1: 'title='
            {
             before(grammarAccess.getDetailsViewAccess().getTitleKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__DetailsView__Group__4__Impl9854); 
             after(grammarAccess.getDetailsViewAccess().getTitleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__4__Impl


    // $ANTLR start rule__DetailsView__Group__5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4897:1: rule__DetailsView__Group__5 : rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6 ;
    public final void rule__DetailsView__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4901:1: ( rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4902:2: rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__5__Impl_in_rule__DetailsView__Group__59885);
            rule__DetailsView__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__6_in_rule__DetailsView__Group__59888);
            rule__DetailsView__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__5


    // $ANTLR start rule__DetailsView__Group__5__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4909:1: rule__DetailsView__Group__5__Impl : ( ( rule__DetailsView__TitleAssignment_5 ) ) ;
    public final void rule__DetailsView__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4913:1: ( ( ( rule__DetailsView__TitleAssignment_5 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4914:1: ( ( rule__DetailsView__TitleAssignment_5 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4914:1: ( ( rule__DetailsView__TitleAssignment_5 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4915:1: ( rule__DetailsView__TitleAssignment_5 )
            {
             before(grammarAccess.getDetailsViewAccess().getTitleAssignment_5()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4916:1: ( rule__DetailsView__TitleAssignment_5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4916:2: rule__DetailsView__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__DetailsView__TitleAssignment_5_in_rule__DetailsView__Group__5__Impl9915);
            rule__DetailsView__TitleAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getDetailsViewAccess().getTitleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__5__Impl


    // $ANTLR start rule__DetailsView__Group__6
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4926:1: rule__DetailsView__Group__6 : rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7 ;
    public final void rule__DetailsView__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4930:1: ( rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4931:2: rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__6__Impl_in_rule__DetailsView__Group__69945);
            rule__DetailsView__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__7_in_rule__DetailsView__Group__69948);
            rule__DetailsView__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__6


    // $ANTLR start rule__DetailsView__Group__6__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4938:1: rule__DetailsView__Group__6__Impl : ( ( rule__DetailsView__HeaderAssignment_6 )? ) ;
    public final void rule__DetailsView__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4942:1: ( ( ( rule__DetailsView__HeaderAssignment_6 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4943:1: ( ( rule__DetailsView__HeaderAssignment_6 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4943:1: ( ( rule__DetailsView__HeaderAssignment_6 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4944:1: ( rule__DetailsView__HeaderAssignment_6 )?
            {
             before(grammarAccess.getDetailsViewAccess().getHeaderAssignment_6()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4945:1: ( rule__DetailsView__HeaderAssignment_6 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4945:2: rule__DetailsView__HeaderAssignment_6
                    {
                    pushFollow(FOLLOW_rule__DetailsView__HeaderAssignment_6_in_rule__DetailsView__Group__6__Impl9975);
                    rule__DetailsView__HeaderAssignment_6();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDetailsViewAccess().getHeaderAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__6__Impl


    // $ANTLR start rule__DetailsView__Group__7
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4955:1: rule__DetailsView__Group__7 : rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8 ;
    public final void rule__DetailsView__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4959:1: ( rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4960:2: rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__7__Impl_in_rule__DetailsView__Group__710006);
            rule__DetailsView__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__8_in_rule__DetailsView__Group__710009);
            rule__DetailsView__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__7


    // $ANTLR start rule__DetailsView__Group__7__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4967:1: rule__DetailsView__Group__7__Impl : ( ( rule__DetailsView__SectionsAssignment_7 )* ) ;
    public final void rule__DetailsView__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4971:1: ( ( ( rule__DetailsView__SectionsAssignment_7 )* ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4972:1: ( ( rule__DetailsView__SectionsAssignment_7 )* )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4972:1: ( ( rule__DetailsView__SectionsAssignment_7 )* )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4973:1: ( rule__DetailsView__SectionsAssignment_7 )*
            {
             before(grammarAccess.getDetailsViewAccess().getSectionsAssignment_7()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4974:1: ( rule__DetailsView__SectionsAssignment_7 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4974:2: rule__DetailsView__SectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__DetailsView__SectionsAssignment_7_in_rule__DetailsView__Group__7__Impl10036);
            	    rule__DetailsView__SectionsAssignment_7();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getDetailsViewAccess().getSectionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__7__Impl


    // $ANTLR start rule__DetailsView__Group__8
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4984:1: rule__DetailsView__Group__8 : rule__DetailsView__Group__8__Impl ;
    public final void rule__DetailsView__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4988:1: ( rule__DetailsView__Group__8__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4989:2: rule__DetailsView__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__8__Impl_in_rule__DetailsView__Group__810067);
            rule__DetailsView__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__8


    // $ANTLR start rule__DetailsView__Group__8__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4995:1: rule__DetailsView__Group__8__Impl : ( '}' ) ;
    public final void rule__DetailsView__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4999:1: ( ( '}' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5000:1: ( '}' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5000:1: ( '}' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5001:1: '}'
            {
             before(grammarAccess.getDetailsViewAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_28_in_rule__DetailsView__Group__8__Impl10095); 
             after(grammarAccess.getDetailsViewAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__8__Impl


    // $ANTLR start rule__DetailsView__Group_2__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5032:1: rule__DetailsView__Group_2__0 : rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1 ;
    public final void rule__DetailsView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5036:1: ( rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5037:2: rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__0__Impl_in_rule__DetailsView__Group_2__010144);
            rule__DetailsView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group_2__1_in_rule__DetailsView__Group_2__010147);
            rule__DetailsView__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__0


    // $ANTLR start rule__DetailsView__Group_2__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5044:1: rule__DetailsView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__DetailsView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5048:1: ( ( '(' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5049:1: ( '(' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5049:1: ( '(' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5050:1: '('
            {
             before(grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__DetailsView__Group_2__0__Impl10175); 
             after(grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__0__Impl


    // $ANTLR start rule__DetailsView__Group_2__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5063:1: rule__DetailsView__Group_2__1 : rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2 ;
    public final void rule__DetailsView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5067:1: ( rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5068:2: rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__1__Impl_in_rule__DetailsView__Group_2__110206);
            rule__DetailsView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group_2__2_in_rule__DetailsView__Group_2__110209);
            rule__DetailsView__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__1


    // $ANTLR start rule__DetailsView__Group_2__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5075:1: rule__DetailsView__Group_2__1__Impl : ( ( rule__DetailsView__ContentAssignment_2_1 ) ) ;
    public final void rule__DetailsView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5079:1: ( ( ( rule__DetailsView__ContentAssignment_2_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5080:1: ( ( rule__DetailsView__ContentAssignment_2_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5080:1: ( ( rule__DetailsView__ContentAssignment_2_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5081:1: ( rule__DetailsView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getDetailsViewAccess().getContentAssignment_2_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5082:1: ( rule__DetailsView__ContentAssignment_2_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5082:2: rule__DetailsView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DetailsView__ContentAssignment_2_1_in_rule__DetailsView__Group_2__1__Impl10236);
            rule__DetailsView__ContentAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDetailsViewAccess().getContentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__1__Impl


    // $ANTLR start rule__DetailsView__Group_2__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5092:1: rule__DetailsView__Group_2__2 : rule__DetailsView__Group_2__2__Impl ;
    public final void rule__DetailsView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5096:1: ( rule__DetailsView__Group_2__2__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5097:2: rule__DetailsView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__2__Impl_in_rule__DetailsView__Group_2__210266);
            rule__DetailsView__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__2


    // $ANTLR start rule__DetailsView__Group_2__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5103:1: rule__DetailsView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__DetailsView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5107:1: ( ( ')' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5108:1: ( ')' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5108:1: ( ')' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5109:1: ')'
            {
             before(grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__DetailsView__Group_2__2__Impl10294); 
             after(grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__2__Impl


    // $ANTLR start rule__CustomView__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5128:1: rule__CustomView__Group__0 : rule__CustomView__Group__0__Impl rule__CustomView__Group__1 ;
    public final void rule__CustomView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5132:1: ( rule__CustomView__Group__0__Impl rule__CustomView__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5133:2: rule__CustomView__Group__0__Impl rule__CustomView__Group__1
            {
            pushFollow(FOLLOW_rule__CustomView__Group__0__Impl_in_rule__CustomView__Group__010331);
            rule__CustomView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__1_in_rule__CustomView__Group__010334);
            rule__CustomView__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__0


    // $ANTLR start rule__CustomView__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5140:1: rule__CustomView__Group__0__Impl : ( 'customview' ) ;
    public final void rule__CustomView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5144:1: ( ( 'customview' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5145:1: ( 'customview' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5145:1: ( 'customview' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5146:1: 'customview'
            {
             before(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__CustomView__Group__0__Impl10362); 
             after(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__0__Impl


    // $ANTLR start rule__CustomView__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5159:1: rule__CustomView__Group__1 : rule__CustomView__Group__1__Impl rule__CustomView__Group__2 ;
    public final void rule__CustomView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5163:1: ( rule__CustomView__Group__1__Impl rule__CustomView__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5164:2: rule__CustomView__Group__1__Impl rule__CustomView__Group__2
            {
            pushFollow(FOLLOW_rule__CustomView__Group__1__Impl_in_rule__CustomView__Group__110393);
            rule__CustomView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__2_in_rule__CustomView__Group__110396);
            rule__CustomView__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__1


    // $ANTLR start rule__CustomView__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5171:1: rule__CustomView__Group__1__Impl : ( ( rule__CustomView__NameAssignment_1 ) ) ;
    public final void rule__CustomView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5175:1: ( ( ( rule__CustomView__NameAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5176:1: ( ( rule__CustomView__NameAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5176:1: ( ( rule__CustomView__NameAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5177:1: ( rule__CustomView__NameAssignment_1 )
            {
             before(grammarAccess.getCustomViewAccess().getNameAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5178:1: ( rule__CustomView__NameAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5178:2: rule__CustomView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomView__NameAssignment_1_in_rule__CustomView__Group__1__Impl10423);
            rule__CustomView__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCustomViewAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__1__Impl


    // $ANTLR start rule__CustomView__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5188:1: rule__CustomView__Group__2 : rule__CustomView__Group__2__Impl rule__CustomView__Group__3 ;
    public final void rule__CustomView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5192:1: ( rule__CustomView__Group__2__Impl rule__CustomView__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5193:2: rule__CustomView__Group__2__Impl rule__CustomView__Group__3
            {
            pushFollow(FOLLOW_rule__CustomView__Group__2__Impl_in_rule__CustomView__Group__210453);
            rule__CustomView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__3_in_rule__CustomView__Group__210456);
            rule__CustomView__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__2


    // $ANTLR start rule__CustomView__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5200:1: rule__CustomView__Group__2__Impl : ( ( rule__CustomView__Group_2__0 )? ) ;
    public final void rule__CustomView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5204:1: ( ( ( rule__CustomView__Group_2__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5205:1: ( ( rule__CustomView__Group_2__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5205:1: ( ( rule__CustomView__Group_2__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5206:1: ( rule__CustomView__Group_2__0 )?
            {
             before(grammarAccess.getCustomViewAccess().getGroup_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5207:1: ( rule__CustomView__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5207:2: rule__CustomView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CustomView__Group_2__0_in_rule__CustomView__Group__2__Impl10483);
                    rule__CustomView__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomViewAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__2__Impl


    // $ANTLR start rule__CustomView__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5217:1: rule__CustomView__Group__3 : rule__CustomView__Group__3__Impl rule__CustomView__Group__4 ;
    public final void rule__CustomView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5221:1: ( rule__CustomView__Group__3__Impl rule__CustomView__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5222:2: rule__CustomView__Group__3__Impl rule__CustomView__Group__4
            {
            pushFollow(FOLLOW_rule__CustomView__Group__3__Impl_in_rule__CustomView__Group__310514);
            rule__CustomView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__4_in_rule__CustomView__Group__310517);
            rule__CustomView__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__3


    // $ANTLR start rule__CustomView__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5229:1: rule__CustomView__Group__3__Impl : ( 'implementedBy' ) ;
    public final void rule__CustomView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5233:1: ( ( 'implementedBy' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5234:1: ( 'implementedBy' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5234:1: ( 'implementedBy' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5235:1: 'implementedBy'
            {
             before(grammarAccess.getCustomViewAccess().getImplementedByKeyword_3()); 
            match(input,46,FOLLOW_46_in_rule__CustomView__Group__3__Impl10545); 
             after(grammarAccess.getCustomViewAccess().getImplementedByKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__3__Impl


    // $ANTLR start rule__CustomView__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5248:1: rule__CustomView__Group__4 : rule__CustomView__Group__4__Impl ;
    public final void rule__CustomView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5252:1: ( rule__CustomView__Group__4__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5253:2: rule__CustomView__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CustomView__Group__4__Impl_in_rule__CustomView__Group__410576);
            rule__CustomView__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__4


    // $ANTLR start rule__CustomView__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5259:1: rule__CustomView__Group__4__Impl : ( ( rule__CustomView__ObjclassAssignment_4 ) ) ;
    public final void rule__CustomView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5263:1: ( ( ( rule__CustomView__ObjclassAssignment_4 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5264:1: ( ( rule__CustomView__ObjclassAssignment_4 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5264:1: ( ( rule__CustomView__ObjclassAssignment_4 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5265:1: ( rule__CustomView__ObjclassAssignment_4 )
            {
             before(grammarAccess.getCustomViewAccess().getObjclassAssignment_4()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5266:1: ( rule__CustomView__ObjclassAssignment_4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5266:2: rule__CustomView__ObjclassAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomView__ObjclassAssignment_4_in_rule__CustomView__Group__4__Impl10603);
            rule__CustomView__ObjclassAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCustomViewAccess().getObjclassAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__4__Impl


    // $ANTLR start rule__CustomView__Group_2__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5286:1: rule__CustomView__Group_2__0 : rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1 ;
    public final void rule__CustomView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5290:1: ( rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5291:2: rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__0__Impl_in_rule__CustomView__Group_2__010643);
            rule__CustomView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group_2__1_in_rule__CustomView__Group_2__010646);
            rule__CustomView__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__0


    // $ANTLR start rule__CustomView__Group_2__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5298:1: rule__CustomView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CustomView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5302:1: ( ( '(' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5303:1: ( '(' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5303:1: ( '(' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5304:1: '('
            {
             before(grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__CustomView__Group_2__0__Impl10674); 
             after(grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__0__Impl


    // $ANTLR start rule__CustomView__Group_2__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5317:1: rule__CustomView__Group_2__1 : rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2 ;
    public final void rule__CustomView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5321:1: ( rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5322:2: rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__1__Impl_in_rule__CustomView__Group_2__110705);
            rule__CustomView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group_2__2_in_rule__CustomView__Group_2__110708);
            rule__CustomView__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__1


    // $ANTLR start rule__CustomView__Group_2__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5329:1: rule__CustomView__Group_2__1__Impl : ( ( rule__CustomView__ContentAssignment_2_1 ) ) ;
    public final void rule__CustomView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5333:1: ( ( ( rule__CustomView__ContentAssignment_2_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5334:1: ( ( rule__CustomView__ContentAssignment_2_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5334:1: ( ( rule__CustomView__ContentAssignment_2_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5335:1: ( rule__CustomView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getCustomViewAccess().getContentAssignment_2_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5336:1: ( rule__CustomView__ContentAssignment_2_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5336:2: rule__CustomView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CustomView__ContentAssignment_2_1_in_rule__CustomView__Group_2__1__Impl10735);
            rule__CustomView__ContentAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getCustomViewAccess().getContentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__1__Impl


    // $ANTLR start rule__CustomView__Group_2__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5346:1: rule__CustomView__Group_2__2 : rule__CustomView__Group_2__2__Impl ;
    public final void rule__CustomView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5350:1: ( rule__CustomView__Group_2__2__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5351:2: rule__CustomView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__2__Impl_in_rule__CustomView__Group_2__210765);
            rule__CustomView__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__2


    // $ANTLR start rule__CustomView__Group_2__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5357:1: rule__CustomView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CustomView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5361:1: ( ( ')' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5362:1: ( ')' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5362:1: ( ')' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5363:1: ')'
            {
             before(grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__CustomView__Group_2__2__Impl10793); 
             after(grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__2__Impl


    // $ANTLR start rule__ViewHeader__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5382:1: rule__ViewHeader__Group__0 : rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1 ;
    public final void rule__ViewHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5386:1: ( rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5387:2: rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__0__Impl_in_rule__ViewHeader__Group__010830);
            rule__ViewHeader__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__1_in_rule__ViewHeader__Group__010833);
            rule__ViewHeader__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__0


    // $ANTLR start rule__ViewHeader__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5394:1: rule__ViewHeader__Group__0__Impl : ( () ) ;
    public final void rule__ViewHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5398:1: ( ( () ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5399:1: ( () )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5399:1: ( () )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5400:1: ()
            {
             before(grammarAccess.getViewHeaderAccess().getViewHeaderAction_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5401:1: ()
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5403:1: 
            {
            }

             after(grammarAccess.getViewHeaderAccess().getViewHeaderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__0__Impl


    // $ANTLR start rule__ViewHeader__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5413:1: rule__ViewHeader__Group__1 : rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2 ;
    public final void rule__ViewHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5417:1: ( rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5418:2: rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__1__Impl_in_rule__ViewHeader__Group__110891);
            rule__ViewHeader__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__2_in_rule__ViewHeader__Group__110894);
            rule__ViewHeader__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__1


    // $ANTLR start rule__ViewHeader__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5425:1: rule__ViewHeader__Group__1__Impl : ( 'header' ) ;
    public final void rule__ViewHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5429:1: ( ( 'header' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5430:1: ( 'header' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5430:1: ( 'header' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5431:1: 'header'
            {
             before(grammarAccess.getViewHeaderAccess().getHeaderKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__ViewHeader__Group__1__Impl10922); 
             after(grammarAccess.getViewHeaderAccess().getHeaderKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__1__Impl


    // $ANTLR start rule__ViewHeader__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5444:1: rule__ViewHeader__Group__2 : rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3 ;
    public final void rule__ViewHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5448:1: ( rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5449:2: rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__2__Impl_in_rule__ViewHeader__Group__210953);
            rule__ViewHeader__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__3_in_rule__ViewHeader__Group__210956);
            rule__ViewHeader__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__2


    // $ANTLR start rule__ViewHeader__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5456:1: rule__ViewHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__ViewHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5460:1: ( ( '{' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5461:1: ( '{' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5461:1: ( '{' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5462:1: '{'
            {
             before(grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ViewHeader__Group__2__Impl10984); 
             after(grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__2__Impl


    // $ANTLR start rule__ViewHeader__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5475:1: rule__ViewHeader__Group__3 : rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4 ;
    public final void rule__ViewHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5479:1: ( rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5480:2: rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__3__Impl_in_rule__ViewHeader__Group__311015);
            rule__ViewHeader__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__4_in_rule__ViewHeader__Group__311018);
            rule__ViewHeader__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__3


    // $ANTLR start rule__ViewHeader__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5487:1: rule__ViewHeader__Group__3__Impl : ( ( rule__ViewHeader__Group_3__0 )? ) ;
    public final void rule__ViewHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5491:1: ( ( ( rule__ViewHeader__Group_3__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5492:1: ( ( rule__ViewHeader__Group_3__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5492:1: ( ( rule__ViewHeader__Group_3__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5493:1: ( rule__ViewHeader__Group_3__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_3()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5494:1: ( rule__ViewHeader__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5494:2: rule__ViewHeader__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_3__0_in_rule__ViewHeader__Group__3__Impl11045);
                    rule__ViewHeader__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewHeaderAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__3__Impl


    // $ANTLR start rule__ViewHeader__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5504:1: rule__ViewHeader__Group__4 : rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5 ;
    public final void rule__ViewHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5508:1: ( rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5509:2: rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__4__Impl_in_rule__ViewHeader__Group__411076);
            rule__ViewHeader__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__5_in_rule__ViewHeader__Group__411079);
            rule__ViewHeader__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__4


    // $ANTLR start rule__ViewHeader__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5516:1: rule__ViewHeader__Group__4__Impl : ( ( rule__ViewHeader__Group_4__0 )? ) ;
    public final void rule__ViewHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5520:1: ( ( ( rule__ViewHeader__Group_4__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5521:1: ( ( rule__ViewHeader__Group_4__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5521:1: ( ( rule__ViewHeader__Group_4__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5522:1: ( rule__ViewHeader__Group_4__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_4()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5523:1: ( rule__ViewHeader__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5523:2: rule__ViewHeader__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_4__0_in_rule__ViewHeader__Group__4__Impl11106);
                    rule__ViewHeader__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewHeaderAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__4__Impl


    // $ANTLR start rule__ViewHeader__Group__5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5533:1: rule__ViewHeader__Group__5 : rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6 ;
    public final void rule__ViewHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5537:1: ( rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5538:2: rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__5__Impl_in_rule__ViewHeader__Group__511137);
            rule__ViewHeader__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__6_in_rule__ViewHeader__Group__511140);
            rule__ViewHeader__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__5


    // $ANTLR start rule__ViewHeader__Group__5__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5545:1: rule__ViewHeader__Group__5__Impl : ( ( rule__ViewHeader__Group_5__0 )? ) ;
    public final void rule__ViewHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5549:1: ( ( ( rule__ViewHeader__Group_5__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5550:1: ( ( rule__ViewHeader__Group_5__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5550:1: ( ( rule__ViewHeader__Group_5__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5551:1: ( rule__ViewHeader__Group_5__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_5()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5552:1: ( rule__ViewHeader__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5552:2: rule__ViewHeader__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_5__0_in_rule__ViewHeader__Group__5__Impl11167);
                    rule__ViewHeader__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewHeaderAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__5__Impl


    // $ANTLR start rule__ViewHeader__Group__6
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5562:1: rule__ViewHeader__Group__6 : rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7 ;
    public final void rule__ViewHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5566:1: ( rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5567:2: rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__6__Impl_in_rule__ViewHeader__Group__611198);
            rule__ViewHeader__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__7_in_rule__ViewHeader__Group__611201);
            rule__ViewHeader__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__6


    // $ANTLR start rule__ViewHeader__Group__6__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5574:1: rule__ViewHeader__Group__6__Impl : ( ( rule__ViewHeader__Group_6__0 )? ) ;
    public final void rule__ViewHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5578:1: ( ( ( rule__ViewHeader__Group_6__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5579:1: ( ( rule__ViewHeader__Group_6__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5579:1: ( ( rule__ViewHeader__Group_6__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5580:1: ( rule__ViewHeader__Group_6__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_6()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5581:1: ( rule__ViewHeader__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5581:2: rule__ViewHeader__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_6__0_in_rule__ViewHeader__Group__6__Impl11228);
                    rule__ViewHeader__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewHeaderAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__6__Impl


    // $ANTLR start rule__ViewHeader__Group__7
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5591:1: rule__ViewHeader__Group__7 : rule__ViewHeader__Group__7__Impl ;
    public final void rule__ViewHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5595:1: ( rule__ViewHeader__Group__7__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5596:2: rule__ViewHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__7__Impl_in_rule__ViewHeader__Group__711259);
            rule__ViewHeader__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__7


    // $ANTLR start rule__ViewHeader__Group__7__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5602:1: rule__ViewHeader__Group__7__Impl : ( '}' ) ;
    public final void rule__ViewHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5606:1: ( ( '}' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5607:1: ( '}' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5607:1: ( '}' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5608:1: '}'
            {
             before(grammarAccess.getViewHeaderAccess().getRightCurlyBracketKeyword_7()); 
            match(input,28,FOLLOW_28_in_rule__ViewHeader__Group__7__Impl11287); 
             after(grammarAccess.getViewHeaderAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__7__Impl


    // $ANTLR start rule__ViewHeader__Group_3__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5637:1: rule__ViewHeader__Group_3__0 : rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1 ;
    public final void rule__ViewHeader__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5641:1: ( rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5642:2: rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_3__0__Impl_in_rule__ViewHeader__Group_3__011334);
            rule__ViewHeader__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_3__1_in_rule__ViewHeader__Group_3__011337);
            rule__ViewHeader__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_3__0


    // $ANTLR start rule__ViewHeader__Group_3__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5649:1: rule__ViewHeader__Group_3__0__Impl : ( 'title=' ) ;
    public final void rule__ViewHeader__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5653:1: ( ( 'title=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5654:1: ( 'title=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5654:1: ( 'title=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5655:1: 'title='
            {
             before(grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__ViewHeader__Group_3__0__Impl11365); 
             after(grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_3__0__Impl


    // $ANTLR start rule__ViewHeader__Group_3__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5668:1: rule__ViewHeader__Group_3__1 : rule__ViewHeader__Group_3__1__Impl ;
    public final void rule__ViewHeader__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5672:1: ( rule__ViewHeader__Group_3__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5673:2: rule__ViewHeader__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_3__1__Impl_in_rule__ViewHeader__Group_3__111396);
            rule__ViewHeader__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_3__1


    // $ANTLR start rule__ViewHeader__Group_3__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5679:1: rule__ViewHeader__Group_3__1__Impl : ( ( rule__ViewHeader__TitleAssignment_3_1 ) ) ;
    public final void rule__ViewHeader__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5683:1: ( ( ( rule__ViewHeader__TitleAssignment_3_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5684:1: ( ( rule__ViewHeader__TitleAssignment_3_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5684:1: ( ( rule__ViewHeader__TitleAssignment_3_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5685:1: ( rule__ViewHeader__TitleAssignment_3_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getTitleAssignment_3_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5686:1: ( rule__ViewHeader__TitleAssignment_3_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5686:2: rule__ViewHeader__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__TitleAssignment_3_1_in_rule__ViewHeader__Group_3__1__Impl11423);
            rule__ViewHeader__TitleAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getViewHeaderAccess().getTitleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_3__1__Impl


    // $ANTLR start rule__ViewHeader__Group_4__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5700:1: rule__ViewHeader__Group_4__0 : rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1 ;
    public final void rule__ViewHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5704:1: ( rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5705:2: rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_4__0__Impl_in_rule__ViewHeader__Group_4__011457);
            rule__ViewHeader__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_4__1_in_rule__ViewHeader__Group_4__011460);
            rule__ViewHeader__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_4__0


    // $ANTLR start rule__ViewHeader__Group_4__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5712:1: rule__ViewHeader__Group_4__0__Impl : ( 'subtitle=' ) ;
    public final void rule__ViewHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5716:1: ( ( 'subtitle=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5717:1: ( 'subtitle=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5717:1: ( 'subtitle=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5718:1: 'subtitle='
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0()); 
            match(input,48,FOLLOW_48_in_rule__ViewHeader__Group_4__0__Impl11488); 
             after(grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_4__0__Impl


    // $ANTLR start rule__ViewHeader__Group_4__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5731:1: rule__ViewHeader__Group_4__1 : rule__ViewHeader__Group_4__1__Impl ;
    public final void rule__ViewHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5735:1: ( rule__ViewHeader__Group_4__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5736:2: rule__ViewHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_4__1__Impl_in_rule__ViewHeader__Group_4__111519);
            rule__ViewHeader__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_4__1


    // $ANTLR start rule__ViewHeader__Group_4__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5742:1: rule__ViewHeader__Group_4__1__Impl : ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) ) ;
    public final void rule__ViewHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5746:1: ( ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5747:1: ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5747:1: ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5748:1: ( rule__ViewHeader__SubtitleAssignment_4_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleAssignment_4_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5749:1: ( rule__ViewHeader__SubtitleAssignment_4_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5749:2: rule__ViewHeader__SubtitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__SubtitleAssignment_4_1_in_rule__ViewHeader__Group_4__1__Impl11546);
            rule__ViewHeader__SubtitleAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getViewHeaderAccess().getSubtitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_4__1__Impl


    // $ANTLR start rule__ViewHeader__Group_5__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5763:1: rule__ViewHeader__Group_5__0 : rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1 ;
    public final void rule__ViewHeader__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5767:1: ( rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5768:2: rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_5__0__Impl_in_rule__ViewHeader__Group_5__011580);
            rule__ViewHeader__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_5__1_in_rule__ViewHeader__Group_5__011583);
            rule__ViewHeader__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_5__0


    // $ANTLR start rule__ViewHeader__Group_5__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5775:1: rule__ViewHeader__Group_5__0__Impl : ( 'details=' ) ;
    public final void rule__ViewHeader__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5779:1: ( ( 'details=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5780:1: ( 'details=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5780:1: ( 'details=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5781:1: 'details='
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0()); 
            match(input,49,FOLLOW_49_in_rule__ViewHeader__Group_5__0__Impl11611); 
             after(grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_5__0__Impl


    // $ANTLR start rule__ViewHeader__Group_5__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5794:1: rule__ViewHeader__Group_5__1 : rule__ViewHeader__Group_5__1__Impl ;
    public final void rule__ViewHeader__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5798:1: ( rule__ViewHeader__Group_5__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5799:2: rule__ViewHeader__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_5__1__Impl_in_rule__ViewHeader__Group_5__111642);
            rule__ViewHeader__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_5__1


    // $ANTLR start rule__ViewHeader__Group_5__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5805:1: rule__ViewHeader__Group_5__1__Impl : ( ( rule__ViewHeader__DetailsAssignment_5_1 ) ) ;
    public final void rule__ViewHeader__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5809:1: ( ( ( rule__ViewHeader__DetailsAssignment_5_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5810:1: ( ( rule__ViewHeader__DetailsAssignment_5_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5810:1: ( ( rule__ViewHeader__DetailsAssignment_5_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5811:1: ( rule__ViewHeader__DetailsAssignment_5_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsAssignment_5_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5812:1: ( rule__ViewHeader__DetailsAssignment_5_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5812:2: rule__ViewHeader__DetailsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__DetailsAssignment_5_1_in_rule__ViewHeader__Group_5__1__Impl11669);
            rule__ViewHeader__DetailsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getViewHeaderAccess().getDetailsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_5__1__Impl


    // $ANTLR start rule__ViewHeader__Group_6__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5826:1: rule__ViewHeader__Group_6__0 : rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1 ;
    public final void rule__ViewHeader__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5830:1: ( rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5831:2: rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_6__0__Impl_in_rule__ViewHeader__Group_6__011703);
            rule__ViewHeader__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_6__1_in_rule__ViewHeader__Group_6__011706);
            rule__ViewHeader__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_6__0


    // $ANTLR start rule__ViewHeader__Group_6__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5838:1: rule__ViewHeader__Group_6__0__Impl : ( 'image=' ) ;
    public final void rule__ViewHeader__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5842:1: ( ( 'image=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5843:1: ( 'image=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5843:1: ( 'image=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5844:1: 'image='
            {
             before(grammarAccess.getViewHeaderAccess().getImageKeyword_6_0()); 
            match(input,50,FOLLOW_50_in_rule__ViewHeader__Group_6__0__Impl11734); 
             after(grammarAccess.getViewHeaderAccess().getImageKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_6__0__Impl


    // $ANTLR start rule__ViewHeader__Group_6__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5857:1: rule__ViewHeader__Group_6__1 : rule__ViewHeader__Group_6__1__Impl ;
    public final void rule__ViewHeader__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5861:1: ( rule__ViewHeader__Group_6__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5862:2: rule__ViewHeader__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_6__1__Impl_in_rule__ViewHeader__Group_6__111765);
            rule__ViewHeader__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_6__1


    // $ANTLR start rule__ViewHeader__Group_6__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5868:1: rule__ViewHeader__Group_6__1__Impl : ( ( rule__ViewHeader__ImageAssignment_6_1 ) ) ;
    public final void rule__ViewHeader__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5872:1: ( ( ( rule__ViewHeader__ImageAssignment_6_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5873:1: ( ( rule__ViewHeader__ImageAssignment_6_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5873:1: ( ( rule__ViewHeader__ImageAssignment_6_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5874:1: ( rule__ViewHeader__ImageAssignment_6_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getImageAssignment_6_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5875:1: ( rule__ViewHeader__ImageAssignment_6_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5875:2: rule__ViewHeader__ImageAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__ImageAssignment_6_1_in_rule__ViewHeader__Group_6__1__Impl11792);
            rule__ViewHeader__ImageAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getViewHeaderAccess().getImageAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_6__1__Impl


    // $ANTLR start rule__ViewSection__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5889:1: rule__ViewSection__Group__0 : rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1 ;
    public final void rule__ViewSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5893:1: ( rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5894:2: rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__0__Impl_in_rule__ViewSection__Group__011826);
            rule__ViewSection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__1_in_rule__ViewSection__Group__011829);
            rule__ViewSection__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__0


    // $ANTLR start rule__ViewSection__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5901:1: rule__ViewSection__Group__0__Impl : ( 'section' ) ;
    public final void rule__ViewSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5905:1: ( ( 'section' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5906:1: ( 'section' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5906:1: ( 'section' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5907:1: 'section'
            {
             before(grammarAccess.getViewSectionAccess().getSectionKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__ViewSection__Group__0__Impl11857); 
             after(grammarAccess.getViewSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__0__Impl


    // $ANTLR start rule__ViewSection__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5920:1: rule__ViewSection__Group__1 : rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2 ;
    public final void rule__ViewSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5924:1: ( rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5925:2: rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__1__Impl_in_rule__ViewSection__Group__111888);
            rule__ViewSection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__2_in_rule__ViewSection__Group__111891);
            rule__ViewSection__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__1


    // $ANTLR start rule__ViewSection__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5932:1: rule__ViewSection__Group__1__Impl : ( '{' ) ;
    public final void rule__ViewSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5936:1: ( ( '{' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5937:1: ( '{' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5937:1: ( '{' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5938:1: '{'
            {
             before(grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__ViewSection__Group__1__Impl11919); 
             after(grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__1__Impl


    // $ANTLR start rule__ViewSection__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5951:1: rule__ViewSection__Group__2 : rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3 ;
    public final void rule__ViewSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5955:1: ( rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5956:2: rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__2__Impl_in_rule__ViewSection__Group__211950);
            rule__ViewSection__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__3_in_rule__ViewSection__Group__211953);
            rule__ViewSection__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__2


    // $ANTLR start rule__ViewSection__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5963:1: rule__ViewSection__Group__2__Impl : ( ( rule__ViewSection__Group_2__0 )? ) ;
    public final void rule__ViewSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5967:1: ( ( ( rule__ViewSection__Group_2__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5968:1: ( ( rule__ViewSection__Group_2__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5968:1: ( ( rule__ViewSection__Group_2__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5969:1: ( rule__ViewSection__Group_2__0 )?
            {
             before(grammarAccess.getViewSectionAccess().getGroup_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5970:1: ( rule__ViewSection__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5970:2: rule__ViewSection__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ViewSection__Group_2__0_in_rule__ViewSection__Group__2__Impl11980);
                    rule__ViewSection__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewSectionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__2__Impl


    // $ANTLR start rule__ViewSection__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5980:1: rule__ViewSection__Group__3 : rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4 ;
    public final void rule__ViewSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5984:1: ( rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5985:2: rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__3__Impl_in_rule__ViewSection__Group__312011);
            rule__ViewSection__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__4_in_rule__ViewSection__Group__312014);
            rule__ViewSection__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__3


    // $ANTLR start rule__ViewSection__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5992:1: rule__ViewSection__Group__3__Impl : ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) ) ;
    public final void rule__ViewSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5996:1: ( ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5997:1: ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5997:1: ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5998:1: ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5998:1: ( ( rule__ViewSection__CellsAssignment_3 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5999:1: ( rule__ViewSection__CellsAssignment_3 )
            {
             before(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6000:1: ( rule__ViewSection__CellsAssignment_3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6000:2: rule__ViewSection__CellsAssignment_3
            {
            pushFollow(FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl12043);
            rule__ViewSection__CellsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 

            }

            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6003:1: ( ( rule__ViewSection__CellsAssignment_3 )* )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6004:1: ( rule__ViewSection__CellsAssignment_3 )*
            {
             before(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6005:1: ( rule__ViewSection__CellsAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==52) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6005:2: rule__ViewSection__CellsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl12055);
            	    rule__ViewSection__CellsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__3__Impl


    // $ANTLR start rule__ViewSection__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6016:1: rule__ViewSection__Group__4 : rule__ViewSection__Group__4__Impl ;
    public final void rule__ViewSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6020:1: ( rule__ViewSection__Group__4__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6021:2: rule__ViewSection__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__4__Impl_in_rule__ViewSection__Group__412088);
            rule__ViewSection__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__4


    // $ANTLR start rule__ViewSection__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6027:1: rule__ViewSection__Group__4__Impl : ( '}' ) ;
    public final void rule__ViewSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6031:1: ( ( '}' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6032:1: ( '}' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6032:1: ( '}' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6033:1: '}'
            {
             before(grammarAccess.getViewSectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__ViewSection__Group__4__Impl12116); 
             after(grammarAccess.getViewSectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__4__Impl


    // $ANTLR start rule__ViewSection__Group_2__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6056:1: rule__ViewSection__Group_2__0 : rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1 ;
    public final void rule__ViewSection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6060:1: ( rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6061:2: rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1
            {
            pushFollow(FOLLOW_rule__ViewSection__Group_2__0__Impl_in_rule__ViewSection__Group_2__012157);
            rule__ViewSection__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group_2__1_in_rule__ViewSection__Group_2__012160);
            rule__ViewSection__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group_2__0


    // $ANTLR start rule__ViewSection__Group_2__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6068:1: rule__ViewSection__Group_2__0__Impl : ( 'title=' ) ;
    public final void rule__ViewSection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6072:1: ( ( 'title=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6073:1: ( 'title=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6073:1: ( 'title=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6074:1: 'title='
            {
             before(grammarAccess.getViewSectionAccess().getTitleKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__ViewSection__Group_2__0__Impl12188); 
             after(grammarAccess.getViewSectionAccess().getTitleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group_2__0__Impl


    // $ANTLR start rule__ViewSection__Group_2__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6087:1: rule__ViewSection__Group_2__1 : rule__ViewSection__Group_2__1__Impl ;
    public final void rule__ViewSection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6091:1: ( rule__ViewSection__Group_2__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6092:2: rule__ViewSection__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewSection__Group_2__1__Impl_in_rule__ViewSection__Group_2__112219);
            rule__ViewSection__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group_2__1


    // $ANTLR start rule__ViewSection__Group_2__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6098:1: rule__ViewSection__Group_2__1__Impl : ( ( rule__ViewSection__TitleAssignment_2_1 ) ) ;
    public final void rule__ViewSection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6102:1: ( ( ( rule__ViewSection__TitleAssignment_2_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6103:1: ( ( rule__ViewSection__TitleAssignment_2_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6103:1: ( ( rule__ViewSection__TitleAssignment_2_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6104:1: ( rule__ViewSection__TitleAssignment_2_1 )
            {
             before(grammarAccess.getViewSectionAccess().getTitleAssignment_2_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6105:1: ( rule__ViewSection__TitleAssignment_2_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6105:2: rule__ViewSection__TitleAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ViewSection__TitleAssignment_2_1_in_rule__ViewSection__Group_2__1__Impl12246);
            rule__ViewSection__TitleAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getViewSectionAccess().getTitleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group_2__1__Impl


    // $ANTLR start rule__SectionCell__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6119:1: rule__SectionCell__Group__0 : rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1 ;
    public final void rule__SectionCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6123:1: ( rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6124:2: rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__0__Impl_in_rule__SectionCell__Group__012280);
            rule__SectionCell__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__1_in_rule__SectionCell__Group__012283);
            rule__SectionCell__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__0


    // $ANTLR start rule__SectionCell__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6131:1: rule__SectionCell__Group__0__Impl : ( 'cell' ) ;
    public final void rule__SectionCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6135:1: ( ( 'cell' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6136:1: ( 'cell' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6136:1: ( 'cell' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6137:1: 'cell'
            {
             before(grammarAccess.getSectionCellAccess().getCellKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__SectionCell__Group__0__Impl12311); 
             after(grammarAccess.getSectionCellAccess().getCellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__0__Impl


    // $ANTLR start rule__SectionCell__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6150:1: rule__SectionCell__Group__1 : rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2 ;
    public final void rule__SectionCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6154:1: ( rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6155:2: rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__1__Impl_in_rule__SectionCell__Group__112342);
            rule__SectionCell__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__2_in_rule__SectionCell__Group__112345);
            rule__SectionCell__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__1


    // $ANTLR start rule__SectionCell__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6162:1: rule__SectionCell__Group__1__Impl : ( ( rule__SectionCell__TypeAssignment_1 ) ) ;
    public final void rule__SectionCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6166:1: ( ( ( rule__SectionCell__TypeAssignment_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6167:1: ( ( rule__SectionCell__TypeAssignment_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6167:1: ( ( rule__SectionCell__TypeAssignment_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6168:1: ( rule__SectionCell__TypeAssignment_1 )
            {
             before(grammarAccess.getSectionCellAccess().getTypeAssignment_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6169:1: ( rule__SectionCell__TypeAssignment_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6169:2: rule__SectionCell__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__SectionCell__TypeAssignment_1_in_rule__SectionCell__Group__1__Impl12372);
            rule__SectionCell__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__1__Impl


    // $ANTLR start rule__SectionCell__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6179:1: rule__SectionCell__Group__2 : rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3 ;
    public final void rule__SectionCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6183:1: ( rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6184:2: rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__2__Impl_in_rule__SectionCell__Group__212402);
            rule__SectionCell__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__3_in_rule__SectionCell__Group__212405);
            rule__SectionCell__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__2


    // $ANTLR start rule__SectionCell__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6191:1: rule__SectionCell__Group__2__Impl : ( ( rule__SectionCell__Group_2__0 )? ) ;
    public final void rule__SectionCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6195:1: ( ( ( rule__SectionCell__Group_2__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6196:1: ( ( rule__SectionCell__Group_2__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6196:1: ( ( rule__SectionCell__Group_2__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6197:1: ( rule__SectionCell__Group_2__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6198:1: ( rule__SectionCell__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6198:2: rule__SectionCell__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_2__0_in_rule__SectionCell__Group__2__Impl12432);
                    rule__SectionCell__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionCellAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__2__Impl


    // $ANTLR start rule__SectionCell__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6208:1: rule__SectionCell__Group__3 : rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4 ;
    public final void rule__SectionCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6212:1: ( rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6213:2: rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__3__Impl_in_rule__SectionCell__Group__312463);
            rule__SectionCell__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__4_in_rule__SectionCell__Group__312466);
            rule__SectionCell__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__3


    // $ANTLR start rule__SectionCell__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6220:1: rule__SectionCell__Group__3__Impl : ( '{' ) ;
    public final void rule__SectionCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6224:1: ( ( '{' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6225:1: ( '{' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6225:1: ( '{' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6226:1: '{'
            {
             before(grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__SectionCell__Group__3__Impl12494); 
             after(grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__3__Impl


    // $ANTLR start rule__SectionCell__Group__4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6239:1: rule__SectionCell__Group__4 : rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5 ;
    public final void rule__SectionCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6243:1: ( rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6244:2: rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__4__Impl_in_rule__SectionCell__Group__412525);
            rule__SectionCell__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__5_in_rule__SectionCell__Group__412528);
            rule__SectionCell__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__4


    // $ANTLR start rule__SectionCell__Group__4__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6251:1: rule__SectionCell__Group__4__Impl : ( ( rule__SectionCell__Group_4__0 )? ) ;
    public final void rule__SectionCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6255:1: ( ( ( rule__SectionCell__Group_4__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6256:1: ( ( rule__SectionCell__Group_4__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6256:1: ( ( rule__SectionCell__Group_4__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6257:1: ( rule__SectionCell__Group_4__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_4()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6258:1: ( rule__SectionCell__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6258:2: rule__SectionCell__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_4__0_in_rule__SectionCell__Group__4__Impl12555);
                    rule__SectionCell__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionCellAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__4__Impl


    // $ANTLR start rule__SectionCell__Group__5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6268:1: rule__SectionCell__Group__5 : rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6 ;
    public final void rule__SectionCell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6272:1: ( rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6273:2: rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__5__Impl_in_rule__SectionCell__Group__512586);
            rule__SectionCell__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__6_in_rule__SectionCell__Group__512589);
            rule__SectionCell__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__5


    // $ANTLR start rule__SectionCell__Group__5__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6280:1: rule__SectionCell__Group__5__Impl : ( ( rule__SectionCell__Group_5__0 )? ) ;
    public final void rule__SectionCell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6284:1: ( ( ( rule__SectionCell__Group_5__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6285:1: ( ( rule__SectionCell__Group_5__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6285:1: ( ( rule__SectionCell__Group_5__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6286:1: ( rule__SectionCell__Group_5__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_5()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6287:1: ( rule__SectionCell__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6287:2: rule__SectionCell__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_5__0_in_rule__SectionCell__Group__5__Impl12616);
                    rule__SectionCell__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionCellAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__5__Impl


    // $ANTLR start rule__SectionCell__Group__6
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6297:1: rule__SectionCell__Group__6 : rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7 ;
    public final void rule__SectionCell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6301:1: ( rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6302:2: rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__6__Impl_in_rule__SectionCell__Group__612647);
            rule__SectionCell__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__7_in_rule__SectionCell__Group__612650);
            rule__SectionCell__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__6


    // $ANTLR start rule__SectionCell__Group__6__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6309:1: rule__SectionCell__Group__6__Impl : ( ( rule__SectionCell__Group_6__0 )? ) ;
    public final void rule__SectionCell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6313:1: ( ( ( rule__SectionCell__Group_6__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6314:1: ( ( rule__SectionCell__Group_6__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6314:1: ( ( rule__SectionCell__Group_6__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6315:1: ( rule__SectionCell__Group_6__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_6()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6316:1: ( rule__SectionCell__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6316:2: rule__SectionCell__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_6__0_in_rule__SectionCell__Group__6__Impl12677);
                    rule__SectionCell__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionCellAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__6__Impl


    // $ANTLR start rule__SectionCell__Group__7
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6326:1: rule__SectionCell__Group__7 : rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8 ;
    public final void rule__SectionCell__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6330:1: ( rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6331:2: rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__7__Impl_in_rule__SectionCell__Group__712708);
            rule__SectionCell__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__8_in_rule__SectionCell__Group__712711);
            rule__SectionCell__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__7


    // $ANTLR start rule__SectionCell__Group__7__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6338:1: rule__SectionCell__Group__7__Impl : ( ( rule__SectionCell__Group_7__0 )? ) ;
    public final void rule__SectionCell__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6342:1: ( ( ( rule__SectionCell__Group_7__0 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6343:1: ( ( rule__SectionCell__Group_7__0 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6343:1: ( ( rule__SectionCell__Group_7__0 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6344:1: ( rule__SectionCell__Group_7__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_7()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6345:1: ( rule__SectionCell__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6345:2: rule__SectionCell__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_7__0_in_rule__SectionCell__Group__7__Impl12738);
                    rule__SectionCell__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionCellAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__7__Impl


    // $ANTLR start rule__SectionCell__Group__8
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6355:1: rule__SectionCell__Group__8 : rule__SectionCell__Group__8__Impl ;
    public final void rule__SectionCell__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6359:1: ( rule__SectionCell__Group__8__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6360:2: rule__SectionCell__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__8__Impl_in_rule__SectionCell__Group__812769);
            rule__SectionCell__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__8


    // $ANTLR start rule__SectionCell__Group__8__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6366:1: rule__SectionCell__Group__8__Impl : ( '}' ) ;
    public final void rule__SectionCell__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6370:1: ( ( '}' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6371:1: ( '}' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6371:1: ( '}' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6372:1: '}'
            {
             before(grammarAccess.getSectionCellAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_28_in_rule__SectionCell__Group__8__Impl12797); 
             after(grammarAccess.getSectionCellAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__8__Impl


    // $ANTLR start rule__SectionCell__Group_2__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6403:1: rule__SectionCell__Group_2__0 : rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1 ;
    public final void rule__SectionCell__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6407:1: ( rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6408:2: rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_2__0__Impl_in_rule__SectionCell__Group_2__012846);
            rule__SectionCell__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_2__1_in_rule__SectionCell__Group_2__012849);
            rule__SectionCell__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_2__0


    // $ANTLR start rule__SectionCell__Group_2__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6415:1: rule__SectionCell__Group_2__0__Impl : ( 'foreach' ) ;
    public final void rule__SectionCell__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6419:1: ( ( 'foreach' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6420:1: ( 'foreach' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6420:1: ( 'foreach' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6421:1: 'foreach'
            {
             before(grammarAccess.getSectionCellAccess().getForeachKeyword_2_0()); 
            match(input,53,FOLLOW_53_in_rule__SectionCell__Group_2__0__Impl12877); 
             after(grammarAccess.getSectionCellAccess().getForeachKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_2__0__Impl


    // $ANTLR start rule__SectionCell__Group_2__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6434:1: rule__SectionCell__Group_2__1 : rule__SectionCell__Group_2__1__Impl ;
    public final void rule__SectionCell__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6438:1: ( rule__SectionCell__Group_2__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6439:2: rule__SectionCell__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_2__1__Impl_in_rule__SectionCell__Group_2__112908);
            rule__SectionCell__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_2__1


    // $ANTLR start rule__SectionCell__Group_2__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6445:1: rule__SectionCell__Group_2__1__Impl : ( ( rule__SectionCell__IteratorAssignment_2_1 ) ) ;
    public final void rule__SectionCell__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6449:1: ( ( ( rule__SectionCell__IteratorAssignment_2_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6450:1: ( ( rule__SectionCell__IteratorAssignment_2_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6450:1: ( ( rule__SectionCell__IteratorAssignment_2_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6451:1: ( rule__SectionCell__IteratorAssignment_2_1 )
            {
             before(grammarAccess.getSectionCellAccess().getIteratorAssignment_2_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6452:1: ( rule__SectionCell__IteratorAssignment_2_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6452:2: rule__SectionCell__IteratorAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SectionCell__IteratorAssignment_2_1_in_rule__SectionCell__Group_2__1__Impl12935);
            rule__SectionCell__IteratorAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getIteratorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_2__1__Impl


    // $ANTLR start rule__SectionCell__Group_4__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6466:1: rule__SectionCell__Group_4__0 : rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1 ;
    public final void rule__SectionCell__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6470:1: ( rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6471:2: rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_4__0__Impl_in_rule__SectionCell__Group_4__012969);
            rule__SectionCell__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_4__1_in_rule__SectionCell__Group_4__012972);
            rule__SectionCell__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_4__0


    // $ANTLR start rule__SectionCell__Group_4__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6478:1: rule__SectionCell__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__SectionCell__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6482:1: ( ( 'text=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6483:1: ( 'text=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6483:1: ( 'text=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6484:1: 'text='
            {
             before(grammarAccess.getSectionCellAccess().getTextKeyword_4_0()); 
            match(input,54,FOLLOW_54_in_rule__SectionCell__Group_4__0__Impl13000); 
             after(grammarAccess.getSectionCellAccess().getTextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_4__0__Impl


    // $ANTLR start rule__SectionCell__Group_4__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6497:1: rule__SectionCell__Group_4__1 : rule__SectionCell__Group_4__1__Impl ;
    public final void rule__SectionCell__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6501:1: ( rule__SectionCell__Group_4__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6502:2: rule__SectionCell__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_4__1__Impl_in_rule__SectionCell__Group_4__113031);
            rule__SectionCell__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_4__1


    // $ANTLR start rule__SectionCell__Group_4__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6508:1: rule__SectionCell__Group_4__1__Impl : ( ( rule__SectionCell__TextAssignment_4_1 ) ) ;
    public final void rule__SectionCell__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6512:1: ( ( ( rule__SectionCell__TextAssignment_4_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6513:1: ( ( rule__SectionCell__TextAssignment_4_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6513:1: ( ( rule__SectionCell__TextAssignment_4_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6514:1: ( rule__SectionCell__TextAssignment_4_1 )
            {
             before(grammarAccess.getSectionCellAccess().getTextAssignment_4_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6515:1: ( rule__SectionCell__TextAssignment_4_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6515:2: rule__SectionCell__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SectionCell__TextAssignment_4_1_in_rule__SectionCell__Group_4__1__Impl13058);
            rule__SectionCell__TextAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getTextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_4__1__Impl


    // $ANTLR start rule__SectionCell__Group_5__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6529:1: rule__SectionCell__Group_5__0 : rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1 ;
    public final void rule__SectionCell__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6533:1: ( rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6534:2: rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_5__0__Impl_in_rule__SectionCell__Group_5__013092);
            rule__SectionCell__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_5__1_in_rule__SectionCell__Group_5__013095);
            rule__SectionCell__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_5__0


    // $ANTLR start rule__SectionCell__Group_5__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6541:1: rule__SectionCell__Group_5__0__Impl : ( 'details=' ) ;
    public final void rule__SectionCell__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6545:1: ( ( 'details=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6546:1: ( 'details=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6546:1: ( 'details=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6547:1: 'details='
            {
             before(grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0()); 
            match(input,49,FOLLOW_49_in_rule__SectionCell__Group_5__0__Impl13123); 
             after(grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_5__0__Impl


    // $ANTLR start rule__SectionCell__Group_5__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6560:1: rule__SectionCell__Group_5__1 : rule__SectionCell__Group_5__1__Impl ;
    public final void rule__SectionCell__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6564:1: ( rule__SectionCell__Group_5__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6565:2: rule__SectionCell__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_5__1__Impl_in_rule__SectionCell__Group_5__113154);
            rule__SectionCell__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_5__1


    // $ANTLR start rule__SectionCell__Group_5__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6571:1: rule__SectionCell__Group_5__1__Impl : ( ( rule__SectionCell__DetailsAssignment_5_1 ) ) ;
    public final void rule__SectionCell__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6575:1: ( ( ( rule__SectionCell__DetailsAssignment_5_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6576:1: ( ( rule__SectionCell__DetailsAssignment_5_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6576:1: ( ( rule__SectionCell__DetailsAssignment_5_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6577:1: ( rule__SectionCell__DetailsAssignment_5_1 )
            {
             before(grammarAccess.getSectionCellAccess().getDetailsAssignment_5_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6578:1: ( rule__SectionCell__DetailsAssignment_5_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6578:2: rule__SectionCell__DetailsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__SectionCell__DetailsAssignment_5_1_in_rule__SectionCell__Group_5__1__Impl13181);
            rule__SectionCell__DetailsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getDetailsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_5__1__Impl


    // $ANTLR start rule__SectionCell__Group_6__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6592:1: rule__SectionCell__Group_6__0 : rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1 ;
    public final void rule__SectionCell__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6596:1: ( rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6597:2: rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_6__0__Impl_in_rule__SectionCell__Group_6__013215);
            rule__SectionCell__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_6__1_in_rule__SectionCell__Group_6__013218);
            rule__SectionCell__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_6__0


    // $ANTLR start rule__SectionCell__Group_6__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6604:1: rule__SectionCell__Group_6__0__Impl : ( 'image=' ) ;
    public final void rule__SectionCell__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6608:1: ( ( 'image=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6609:1: ( 'image=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6609:1: ( 'image=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6610:1: 'image='
            {
             before(grammarAccess.getSectionCellAccess().getImageKeyword_6_0()); 
            match(input,50,FOLLOW_50_in_rule__SectionCell__Group_6__0__Impl13246); 
             after(grammarAccess.getSectionCellAccess().getImageKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_6__0__Impl


    // $ANTLR start rule__SectionCell__Group_6__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6623:1: rule__SectionCell__Group_6__1 : rule__SectionCell__Group_6__1__Impl ;
    public final void rule__SectionCell__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6627:1: ( rule__SectionCell__Group_6__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6628:2: rule__SectionCell__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_6__1__Impl_in_rule__SectionCell__Group_6__113277);
            rule__SectionCell__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_6__1


    // $ANTLR start rule__SectionCell__Group_6__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6634:1: rule__SectionCell__Group_6__1__Impl : ( ( rule__SectionCell__ImageAssignment_6_1 ) ) ;
    public final void rule__SectionCell__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6638:1: ( ( ( rule__SectionCell__ImageAssignment_6_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6639:1: ( ( rule__SectionCell__ImageAssignment_6_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6639:1: ( ( rule__SectionCell__ImageAssignment_6_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6640:1: ( rule__SectionCell__ImageAssignment_6_1 )
            {
             before(grammarAccess.getSectionCellAccess().getImageAssignment_6_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6641:1: ( rule__SectionCell__ImageAssignment_6_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6641:2: rule__SectionCell__ImageAssignment_6_1
            {
            pushFollow(FOLLOW_rule__SectionCell__ImageAssignment_6_1_in_rule__SectionCell__Group_6__1__Impl13304);
            rule__SectionCell__ImageAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getImageAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_6__1__Impl


    // $ANTLR start rule__SectionCell__Group_7__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6655:1: rule__SectionCell__Group_7__0 : rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1 ;
    public final void rule__SectionCell__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6659:1: ( rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6660:2: rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_7__0__Impl_in_rule__SectionCell__Group_7__013338);
            rule__SectionCell__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_7__1_in_rule__SectionCell__Group_7__013341);
            rule__SectionCell__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_7__0


    // $ANTLR start rule__SectionCell__Group_7__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6667:1: rule__SectionCell__Group_7__0__Impl : ( 'action=' ) ;
    public final void rule__SectionCell__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6671:1: ( ( 'action=' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6672:1: ( 'action=' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6672:1: ( 'action=' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6673:1: 'action='
            {
             before(grammarAccess.getSectionCellAccess().getActionKeyword_7_0()); 
            match(input,55,FOLLOW_55_in_rule__SectionCell__Group_7__0__Impl13369); 
             after(grammarAccess.getSectionCellAccess().getActionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_7__0__Impl


    // $ANTLR start rule__SectionCell__Group_7__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6686:1: rule__SectionCell__Group_7__1 : rule__SectionCell__Group_7__1__Impl ;
    public final void rule__SectionCell__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6690:1: ( rule__SectionCell__Group_7__1__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6691:2: rule__SectionCell__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_7__1__Impl_in_rule__SectionCell__Group_7__113400);
            rule__SectionCell__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_7__1


    // $ANTLR start rule__SectionCell__Group_7__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6697:1: rule__SectionCell__Group_7__1__Impl : ( ( rule__SectionCell__ActionAssignment_7_1 ) ) ;
    public final void rule__SectionCell__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6701:1: ( ( ( rule__SectionCell__ActionAssignment_7_1 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6702:1: ( ( rule__SectionCell__ActionAssignment_7_1 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6702:1: ( ( rule__SectionCell__ActionAssignment_7_1 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6703:1: ( rule__SectionCell__ActionAssignment_7_1 )
            {
             before(grammarAccess.getSectionCellAccess().getActionAssignment_7_1()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6704:1: ( rule__SectionCell__ActionAssignment_7_1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6704:2: rule__SectionCell__ActionAssignment_7_1
            {
            pushFollow(FOLLOW_rule__SectionCell__ActionAssignment_7_1_in_rule__SectionCell__Group_7__1__Impl13427);
            rule__SectionCell__ActionAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getActionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_7__1__Impl


    // $ANTLR start rule__CollectionIterator__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6718:1: rule__CollectionIterator__Group__0 : rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1 ;
    public final void rule__CollectionIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6722:1: ( rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6723:2: rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__0__Impl_in_rule__CollectionIterator__Group__013461);
            rule__CollectionIterator__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionIterator__Group__1_in_rule__CollectionIterator__Group__013464);
            rule__CollectionIterator__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__0


    // $ANTLR start rule__CollectionIterator__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6730:1: rule__CollectionIterator__Group__0__Impl : ( ( rule__CollectionIterator__CollectionAssignment_0 ) ) ;
    public final void rule__CollectionIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6734:1: ( ( ( rule__CollectionIterator__CollectionAssignment_0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6735:1: ( ( rule__CollectionIterator__CollectionAssignment_0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6735:1: ( ( rule__CollectionIterator__CollectionAssignment_0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6736:1: ( rule__CollectionIterator__CollectionAssignment_0 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getCollectionAssignment_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6737:1: ( rule__CollectionIterator__CollectionAssignment_0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6737:2: rule__CollectionIterator__CollectionAssignment_0
            {
            pushFollow(FOLLOW_rule__CollectionIterator__CollectionAssignment_0_in_rule__CollectionIterator__Group__0__Impl13491);
            rule__CollectionIterator__CollectionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionIteratorAccess().getCollectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__0__Impl


    // $ANTLR start rule__CollectionIterator__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6747:1: rule__CollectionIterator__Group__1 : rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2 ;
    public final void rule__CollectionIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6751:1: ( rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6752:2: rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__1__Impl_in_rule__CollectionIterator__Group__113521);
            rule__CollectionIterator__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionIterator__Group__2_in_rule__CollectionIterator__Group__113524);
            rule__CollectionIterator__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__1


    // $ANTLR start rule__CollectionIterator__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6759:1: rule__CollectionIterator__Group__1__Impl : ( 'as' ) ;
    public final void rule__CollectionIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6763:1: ( ( 'as' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6764:1: ( 'as' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6764:1: ( 'as' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6765:1: 'as'
            {
             before(grammarAccess.getCollectionIteratorAccess().getAsKeyword_1()); 
            match(input,56,FOLLOW_56_in_rule__CollectionIterator__Group__1__Impl13552); 
             after(grammarAccess.getCollectionIteratorAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__1__Impl


    // $ANTLR start rule__CollectionIterator__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6778:1: rule__CollectionIterator__Group__2 : rule__CollectionIterator__Group__2__Impl ;
    public final void rule__CollectionIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6782:1: ( rule__CollectionIterator__Group__2__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6783:2: rule__CollectionIterator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__2__Impl_in_rule__CollectionIterator__Group__213583);
            rule__CollectionIterator__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__2


    // $ANTLR start rule__CollectionIterator__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6789:1: rule__CollectionIterator__Group__2__Impl : ( ( rule__CollectionIterator__NameAssignment_2 ) ) ;
    public final void rule__CollectionIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6793:1: ( ( ( rule__CollectionIterator__NameAssignment_2 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6794:1: ( ( rule__CollectionIterator__NameAssignment_2 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6794:1: ( ( rule__CollectionIterator__NameAssignment_2 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6795:1: ( rule__CollectionIterator__NameAssignment_2 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getNameAssignment_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6796:1: ( rule__CollectionIterator__NameAssignment_2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6796:2: rule__CollectionIterator__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionIterator__NameAssignment_2_in_rule__CollectionIterator__Group__2__Impl13610);
            rule__CollectionIterator__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCollectionIteratorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__2__Impl


    // $ANTLR start rule__ViewCall__Group__0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6812:1: rule__ViewCall__Group__0 : rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1 ;
    public final void rule__ViewCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6816:1: ( rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6817:2: rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__0__Impl_in_rule__ViewCall__Group__013646);
            rule__ViewCall__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__1_in_rule__ViewCall__Group__013649);
            rule__ViewCall__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__0


    // $ANTLR start rule__ViewCall__Group__0__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6824:1: rule__ViewCall__Group__0__Impl : ( ( rule__ViewCall__ViewAssignment_0 ) ) ;
    public final void rule__ViewCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6828:1: ( ( ( rule__ViewCall__ViewAssignment_0 ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6829:1: ( ( rule__ViewCall__ViewAssignment_0 ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6829:1: ( ( rule__ViewCall__ViewAssignment_0 ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6830:1: ( rule__ViewCall__ViewAssignment_0 )
            {
             before(grammarAccess.getViewCallAccess().getViewAssignment_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6831:1: ( rule__ViewCall__ViewAssignment_0 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6831:2: rule__ViewCall__ViewAssignment_0
            {
            pushFollow(FOLLOW_rule__ViewCall__ViewAssignment_0_in_rule__ViewCall__Group__0__Impl13676);
            rule__ViewCall__ViewAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getViewCallAccess().getViewAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__0__Impl


    // $ANTLR start rule__ViewCall__Group__1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6841:1: rule__ViewCall__Group__1 : rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2 ;
    public final void rule__ViewCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6845:1: ( rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6846:2: rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__1__Impl_in_rule__ViewCall__Group__113706);
            rule__ViewCall__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__2_in_rule__ViewCall__Group__113709);
            rule__ViewCall__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__1


    // $ANTLR start rule__ViewCall__Group__1__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6853:1: rule__ViewCall__Group__1__Impl : ( '(' ) ;
    public final void rule__ViewCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6857:1: ( ( '(' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6858:1: ( '(' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6858:1: ( '(' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6859:1: '('
            {
             before(grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ViewCall__Group__1__Impl13737); 
             after(grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__1__Impl


    // $ANTLR start rule__ViewCall__Group__2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6872:1: rule__ViewCall__Group__2 : rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3 ;
    public final void rule__ViewCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6876:1: ( rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3 )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6877:2: rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__2__Impl_in_rule__ViewCall__Group__213768);
            rule__ViewCall__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__3_in_rule__ViewCall__Group__213771);
            rule__ViewCall__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__2


    // $ANTLR start rule__ViewCall__Group__2__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6884:1: rule__ViewCall__Group__2__Impl : ( ( rule__ViewCall__ProviderAssignment_2 )? ) ;
    public final void rule__ViewCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6888:1: ( ( ( rule__ViewCall__ProviderAssignment_2 )? ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6889:1: ( ( rule__ViewCall__ProviderAssignment_2 )? )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6889:1: ( ( rule__ViewCall__ProviderAssignment_2 )? )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6890:1: ( rule__ViewCall__ProviderAssignment_2 )?
            {
             before(grammarAccess.getViewCallAccess().getProviderAssignment_2()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6891:1: ( rule__ViewCall__ProviderAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_STRING)||LA43_0==18||LA43_0==20||(LA43_0>=22 && LA43_0<=23)||LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6891:2: rule__ViewCall__ProviderAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ViewCall__ProviderAssignment_2_in_rule__ViewCall__Group__2__Impl13798);
                    rule__ViewCall__ProviderAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewCallAccess().getProviderAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__2__Impl


    // $ANTLR start rule__ViewCall__Group__3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6901:1: rule__ViewCall__Group__3 : rule__ViewCall__Group__3__Impl ;
    public final void rule__ViewCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6905:1: ( rule__ViewCall__Group__3__Impl )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6906:2: rule__ViewCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__3__Impl_in_rule__ViewCall__Group__313829);
            rule__ViewCall__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__3


    // $ANTLR start rule__ViewCall__Group__3__Impl
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6912:1: rule__ViewCall__Group__3__Impl : ( ')' ) ;
    public final void rule__ViewCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6916:1: ( ( ')' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6917:1: ( ')' )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6917:1: ( ')' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6918:1: ')'
            {
             before(grammarAccess.getViewCallAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__ViewCall__Group__3__Impl13857); 
             after(grammarAccess.getViewCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__3__Impl


    // $ANTLR start rule__Model__ApplicationAssignment_0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6940:1: rule__Model__ApplicationAssignment_0 : ( ruleApplication ) ;
    public final void rule__Model__ApplicationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6944:1: ( ( ruleApplication ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6945:1: ( ruleApplication )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6945:1: ( ruleApplication )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6946:1: ruleApplication
            {
             before(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__Model__ApplicationAssignment_013901);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ApplicationAssignment_0


    // $ANTLR start rule__Model__ElementsAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6955:1: rule__Model__ElementsAssignment_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6959:1: ( ( ruleModelElement ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6960:1: ( ruleModelElement )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6960:1: ( ruleModelElement )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6961:1: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelElement_in_rule__Model__ElementsAssignment_113932);
            ruleModelElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ElementsAssignment_1


    // $ANTLR start rule__TypeDescription__TypeAssignment_0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6970:1: rule__TypeDescription__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDescription__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6974:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6975:1: ( ( RULE_ID ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6975:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6976:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6977:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6978:1: RULE_ID
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDescription__TypeAssignment_013967); 
             after(grammarAccess.getTypeDescriptionAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__TypeAssignment_0


    // $ANTLR start rule__TypeDescription__ManyAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6989:1: rule__TypeDescription__ManyAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeDescription__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6993:1: ( ( ( '[]' ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6994:1: ( ( '[]' ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6994:1: ( ( '[]' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6995:1: ( '[]' )
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6996:1: ( '[]' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6997:1: '[]'
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,57,FOLLOW_57_in_rule__TypeDescription__ManyAssignment_114007); 
             after(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__ManyAssignment_1


    // $ANTLR start rule__Parameter__DescriptionAssignment_0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7012:1: rule__Parameter__DescriptionAssignment_0 : ( ruleTypeDescription ) ;
    public final void rule__Parameter__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7016:1: ( ( ruleTypeDescription ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7017:1: ( ruleTypeDescription )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7017:1: ( ruleTypeDescription )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7018:1: ruleTypeDescription
            {
             before(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_rule__Parameter__DescriptionAssignment_014046);
            ruleTypeDescription();
            _fsp--;

             after(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__DescriptionAssignment_0


    // $ANTLR start rule__Parameter__NameAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7027:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7031:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7032:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7032:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7033:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_114077); 
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
    // $ANTLR end rule__Parameter__NameAssignment_1


    // $ANTLR start rule__ObjectReference__ObjectAssignment_0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7042:1: rule__ObjectReference__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectReference__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7046:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7047:1: ( ( RULE_ID ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7047:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7048:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7049:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7050:1: RULE_ID
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectReference__ObjectAssignment_014112); 
             after(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__ObjectAssignment_0


    // $ANTLR start rule__ObjectReference__TailAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7061:1: rule__ObjectReference__TailAssignment_1 : ( ruleNestedObjectReference ) ;
    public final void rule__ObjectReference__TailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7065:1: ( ( ruleNestedObjectReference ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7066:1: ( ruleNestedObjectReference )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7066:1: ( ruleNestedObjectReference )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7067:1: ruleNestedObjectReference
            {
             before(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_rule__ObjectReference__TailAssignment_114147);
            ruleNestedObjectReference();
            _fsp--;

             after(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__TailAssignment_1


    // $ANTLR start rule__NestedObjectReference__ObjectAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7076:1: rule__NestedObjectReference__ObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NestedObjectReference__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7080:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7081:1: ( ( RULE_ID ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7081:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7082:1: ( RULE_ID )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7083:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7084:1: RULE_ID
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NestedObjectReference__ObjectAssignment_114182); 
             after(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__ObjectAssignment_1


    // $ANTLR start rule__NestedObjectReference__TailAssignment_2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7095:1: rule__NestedObjectReference__TailAssignment_2 : ( ruleNestedObjectReference ) ;
    public final void rule__NestedObjectReference__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7099:1: ( ( ruleNestedObjectReference ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7100:1: ( ruleNestedObjectReference )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7100:1: ( ruleNestedObjectReference )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7101:1: ruleNestedObjectReference
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_rule__NestedObjectReference__TailAssignment_214217);
            ruleNestedObjectReference();
            _fsp--;

             after(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__TailAssignment_2


    // $ANTLR start rule__StringLiteral__ValueAssignment
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7110:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7114:1: ( ( RULE_STRING ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7115:1: ( RULE_STRING )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7115:1: ( RULE_STRING )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7116:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment14248); 
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
    // $ANTLR end rule__StringLiteral__ValueAssignment


    // $ANTLR start rule__StringFunction__ValuesAssignment_0_2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7125:1: rule__StringFunction__ValuesAssignment_0_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValuesAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7129:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7130:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7130:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7131:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValuesAssignment_0_214279);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__ValuesAssignment_0_2


    // $ANTLR start rule__StringFunction__ValueAssignment_1_2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7140:1: rule__StringFunction__ValueAssignment_1_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7144:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7145:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7145:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7146:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_1_214310);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__ValueAssignment_1_2


    // $ANTLR start rule__StringFunction__MatchAssignment_1_4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7155:1: rule__StringFunction__MatchAssignment_1_4 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__MatchAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7159:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7160:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7160:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7161:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__MatchAssignment_1_414341);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__MatchAssignment_1_4


    // $ANTLR start rule__StringFunction__ReplacementAssignment_1_6
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7170:1: rule__StringFunction__ReplacementAssignment_1_6 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ReplacementAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7174:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7175:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7175:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7176:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ReplacementAssignment_1_614372);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__ReplacementAssignment_1_6


    // $ANTLR start rule__StringFunction__ValueAssignment_2_2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7185:1: rule__StringFunction__ValueAssignment_2_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7189:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7190:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7190:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7191:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_2_214403);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__ValueAssignment_2_2


    // $ANTLR start rule__CollectionLiteral__ItemsAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7200:1: rule__CollectionLiteral__ItemsAssignment_1 : ( ruleScalarExpression ) ;
    public final void rule__CollectionLiteral__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7204:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7205:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7205:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7206:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_114434);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__ItemsAssignment_1


    // $ANTLR start rule__CollectionLiteral__ItemsAssignment_2_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7215:1: rule__CollectionLiteral__ItemsAssignment_2_1 : ( ruleScalarExpression ) ;
    public final void rule__CollectionLiteral__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7219:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7220:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7220:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7221:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_2_114465);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__ItemsAssignment_2_1


    // $ANTLR start rule__CollectionFunction__ValueAssignment_2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7230:1: rule__CollectionFunction__ValueAssignment_2 : ( ruleScalarExpression ) ;
    public final void rule__CollectionFunction__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7234:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7235:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7235:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7236:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__ValueAssignment_214496);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__ValueAssignment_2


    // $ANTLR start rule__CollectionFunction__DelimiterAssignment_4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7245:1: rule__CollectionFunction__DelimiterAssignment_4 : ( ruleScalarExpression ) ;
    public final void rule__CollectionFunction__DelimiterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7249:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7250:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7250:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7251:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__DelimiterAssignment_414527);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__DelimiterAssignment_4


    // $ANTLR start rule__TabBarApplication__NameAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7260:1: rule__TabBarApplication__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TabBarApplication__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7264:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7265:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7265:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7266:1: RULE_ID
            {
             before(grammarAccess.getTabBarApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TabBarApplication__NameAssignment_114558); 
             after(grammarAccess.getTabBarApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__NameAssignment_1


    // $ANTLR start rule__TabBarApplication__ButtonsAssignment_3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7275:1: rule__TabBarApplication__ButtonsAssignment_3 : ( ruleTabbarButton ) ;
    public final void rule__TabBarApplication__ButtonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7279:1: ( ( ruleTabbarButton ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7280:1: ( ruleTabbarButton )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7280:1: ( ruleTabbarButton )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7281:1: ruleTabbarButton
            {
             before(grammarAccess.getTabBarApplicationAccess().getButtonsTabbarButtonParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTabbarButton_in_rule__TabBarApplication__ButtonsAssignment_314589);
            ruleTabbarButton();
            _fsp--;

             after(grammarAccess.getTabBarApplicationAccess().getButtonsTabbarButtonParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__ButtonsAssignment_3


    // $ANTLR start rule__TabbarButton__TitleAssignment_3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7290:1: rule__TabbarButton__TitleAssignment_3 : ( ruleScalarExpression ) ;
    public final void rule__TabbarButton__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7294:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7295:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7295:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7296:1: ruleScalarExpression
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TabbarButton__TitleAssignment_314620);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__TitleAssignment_3


    // $ANTLR start rule__TabbarButton__IconAssignment_5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7305:1: rule__TabbarButton__IconAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__TabbarButton__IconAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7309:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7310:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7310:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7311:1: ruleScalarExpression
            {
             before(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TabbarButton__IconAssignment_514651);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__IconAssignment_5


    // $ANTLR start rule__TabbarButton__ViewAssignment_7
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7320:1: rule__TabbarButton__ViewAssignment_7 : ( ruleViewCall ) ;
    public final void rule__TabbarButton__ViewAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7324:1: ( ( ruleViewCall ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7325:1: ( ruleViewCall )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7325:1: ( ruleViewCall )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7326:1: ruleViewCall
            {
             before(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleViewCall_in_rule__TabbarButton__ViewAssignment_714682);
            ruleViewCall();
            _fsp--;

             after(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__ViewAssignment_7


    // $ANTLR start rule__Constant__NameAssignment_2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7335:1: rule__Constant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7339:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7340:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7340:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7341:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_214713); 
             after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__NameAssignment_2


    // $ANTLR start rule__Constant__ValueAssignment_3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7350:1: rule__Constant__ValueAssignment_3 : ( ruleScalarExpression ) ;
    public final void rule__Constant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7354:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7355:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7355:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7356:1: ruleScalarExpression
            {
             before(grammarAccess.getConstantAccess().getValueScalarExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__Constant__ValueAssignment_314744);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getConstantAccess().getValueScalarExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__ValueAssignment_3


    // $ANTLR start rule__SimpleType__NameAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7365:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7369:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7370:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7370:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7371:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_114775); 
             after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__NameAssignment_1


    // $ANTLR start rule__SimpleType__PlatformTypeAssignment_3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7380:1: rule__SimpleType__PlatformTypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SimpleType__PlatformTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7384:1: ( ( RULE_STRING ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7385:1: ( RULE_STRING )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7385:1: ( RULE_STRING )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7386:1: RULE_STRING
            {
             before(grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleType__PlatformTypeAssignment_314806); 
             after(grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__PlatformTypeAssignment_3


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7395:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7399:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7400:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7400:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7401:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_114837); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__ExtendsAssignment_2_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7410:1: rule__Entity__ExtendsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7414:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7415:1: ( ( RULE_ID ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7415:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7416:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7417:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7418:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_114872); 
             after(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__ExtendsAssignment_2_1


    // $ANTLR start rule__Entity__PropertiesAssignment_4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7429:1: rule__Entity__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7433:1: ( ( ruleProperty ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7434:1: ( ruleProperty )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7434:1: ( ruleProperty )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7435:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_414907);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__PropertiesAssignment_4


    // $ANTLR start rule__Property__DerivedAssignment_0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7444:1: rule__Property__DerivedAssignment_0 : ( ( 'derived' ) ) ;
    public final void rule__Property__DerivedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7448:1: ( ( ( 'derived' ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7449:1: ( ( 'derived' ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7449:1: ( ( 'derived' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7450:1: ( 'derived' )
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7451:1: ( 'derived' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7452:1: 'derived'
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 
            match(input,58,FOLLOW_58_in_rule__Property__DerivedAssignment_014943); 
             after(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 

            }

             after(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__DerivedAssignment_0


    // $ANTLR start rule__Property__DescriptionAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7467:1: rule__Property__DescriptionAssignment_1 : ( ruleTypeDescription ) ;
    public final void rule__Property__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7471:1: ( ( ruleTypeDescription ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7472:1: ( ruleTypeDescription )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7472:1: ( ruleTypeDescription )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7473:1: ruleTypeDescription
            {
             before(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_rule__Property__DescriptionAssignment_114982);
            ruleTypeDescription();
            _fsp--;

             after(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__DescriptionAssignment_1


    // $ANTLR start rule__Property__NameAssignment_2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7482:1: rule__Property__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7486:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7487:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7487:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7488:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_215013); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__NameAssignment_2


    // $ANTLR start rule__ContentProvider__NameAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7497:1: rule__ContentProvider__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContentProvider__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7501:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7502:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7502:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7503:1: RULE_ID
            {
             before(grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentProvider__NameAssignment_115044); 
             after(grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__NameAssignment_1


    // $ANTLR start rule__ContentProvider__ParameterAssignment_2_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7512:1: rule__ContentProvider__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__ContentProvider__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7516:1: ( ( ruleParameter ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7517:1: ( ruleParameter )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7517:1: ( ruleParameter )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7518:1: ruleParameter
            {
             before(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ContentProvider__ParameterAssignment_2_115075);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__ParameterAssignment_2_1


    // $ANTLR start rule__ContentProvider__ResolverAssignment_3_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7527:1: rule__ContentProvider__ResolverAssignment_3_1 : ( ( 'resolves' ) ) ;
    public final void rule__ContentProvider__ResolverAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7531:1: ( ( ( 'resolves' ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7532:1: ( ( 'resolves' ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7532:1: ( ( 'resolves' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7533:1: ( 'resolves' )
            {
             before(grammarAccess.getContentProviderAccess().getResolverResolvesKeyword_3_1_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7534:1: ( 'resolves' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7535:1: 'resolves'
            {
             before(grammarAccess.getContentProviderAccess().getResolverResolvesKeyword_3_1_0()); 
            match(input,59,FOLLOW_59_in_rule__ContentProvider__ResolverAssignment_3_115111); 
             after(grammarAccess.getContentProviderAccess().getResolverResolvesKeyword_3_1_0()); 

            }

             after(grammarAccess.getContentProviderAccess().getResolverResolvesKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__ResolverAssignment_3_1


    // $ANTLR start rule__ContentProvider__TypeAssignment_4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7550:1: rule__ContentProvider__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ContentProvider__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7554:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7555:1: ( ( RULE_ID ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7555:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7556:1: ( RULE_ID )
            {
             before(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7557:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7558:1: RULE_ID
            {
             before(grammarAccess.getContentProviderAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentProvider__TypeAssignment_415154); 
             after(grammarAccess.getContentProviderAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__TypeAssignment_4


    // $ANTLR start rule__ContentProvider__ManyAssignment_5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7569:1: rule__ContentProvider__ManyAssignment_5 : ( ( '[]' ) ) ;
    public final void rule__ContentProvider__ManyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7573:1: ( ( ( '[]' ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7574:1: ( ( '[]' ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7574:1: ( ( '[]' ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7575:1: ( '[]' )
            {
             before(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7576:1: ( '[]' )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7577:1: '[]'
            {
             before(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            match(input,57,FOLLOW_57_in_rule__ContentProvider__ManyAssignment_515194); 
             after(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 

            }

             after(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__ManyAssignment_5


    // $ANTLR start rule__ContentProvider__UrlAssignment_9
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7592:1: rule__ContentProvider__UrlAssignment_9 : ( ruleScalarExpression ) ;
    public final void rule__ContentProvider__UrlAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7596:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7597:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7597:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7598:1: ruleScalarExpression
            {
             before(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ContentProvider__UrlAssignment_915233);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__UrlAssignment_9


    // $ANTLR start rule__ContentProvider__SelectionAssignment_11
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7607:1: rule__ContentProvider__SelectionAssignment_11 : ( ruleScalarExpression ) ;
    public final void rule__ContentProvider__SelectionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7611:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7612:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7612:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7613:1: ruleScalarExpression
            {
             before(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ContentProvider__SelectionAssignment_1115264);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__SelectionAssignment_11


    // $ANTLR start rule__ProviderConstruction__ProviderAssignment_0_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7622:1: rule__ProviderConstruction__ProviderAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProviderConstruction__ProviderAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7626:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7627:1: ( ( RULE_ID ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7627:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7628:1: ( RULE_ID )
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7629:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7630:1: RULE_ID
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderContentProviderIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProviderConstruction__ProviderAssignment_0_115299); 
             after(grammarAccess.getProviderConstructionAccess().getProviderContentProviderIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__ProviderAssignment_0_1


    // $ANTLR start rule__ProviderConstruction__ArgumentAssignment_0_3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7641:1: rule__ProviderConstruction__ArgumentAssignment_0_3 : ( ruleExpression ) ;
    public final void rule__ProviderConstruction__ArgumentAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7645:1: ( ( ruleExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7646:1: ( ruleExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7646:1: ( ruleExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7647:1: ruleExpression
            {
             before(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProviderConstruction__ArgumentAssignment_0_315334);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__ArgumentAssignment_0_3


    // $ANTLR start rule__ProviderConstruction__ExpressionAssignment_1_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7656:1: rule__ProviderConstruction__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ProviderConstruction__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7660:1: ( ( ruleExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7661:1: ( ruleExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7661:1: ( ruleExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7662:1: ruleExpression
            {
             before(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProviderConstruction__ExpressionAssignment_1_115365);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__ExpressionAssignment_1_1


    // $ANTLR start rule__TableView__NameAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7671:1: rule__TableView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TableView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7675:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7676:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7676:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7677:1: RULE_ID
            {
             before(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TableView__NameAssignment_115396); 
             after(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__NameAssignment_1


    // $ANTLR start rule__TableView__ContentAssignment_2_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7686:1: rule__TableView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__TableView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7690:1: ( ( ruleParameter ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7691:1: ( ruleParameter )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7691:1: ( ruleParameter )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7692:1: ruleParameter
            {
             before(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__TableView__ContentAssignment_2_115427);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__ContentAssignment_2_1


    // $ANTLR start rule__TableView__TitleAssignment_5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7701:1: rule__TableView__TitleAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__TableView__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7705:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7706:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7706:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7707:1: ruleScalarExpression
            {
             before(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TableView__TitleAssignment_515458);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__TitleAssignment_5


    // $ANTLR start rule__TableView__SectionsAssignment_6
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7716:1: rule__TableView__SectionsAssignment_6 : ( ruleViewSection ) ;
    public final void rule__TableView__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7720:1: ( ( ruleViewSection ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7721:1: ( ruleViewSection )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7721:1: ( ruleViewSection )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7722:1: ruleViewSection
            {
             before(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleViewSection_in_rule__TableView__SectionsAssignment_615489);
            ruleViewSection();
            _fsp--;

             after(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__SectionsAssignment_6


    // $ANTLR start rule__DetailsView__NameAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7731:1: rule__DetailsView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DetailsView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7735:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7736:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7736:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7737:1: RULE_ID
            {
             before(grammarAccess.getDetailsViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DetailsView__NameAssignment_115520); 
             after(grammarAccess.getDetailsViewAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__NameAssignment_1


    // $ANTLR start rule__DetailsView__ContentAssignment_2_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7746:1: rule__DetailsView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__DetailsView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7750:1: ( ( ruleParameter ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7751:1: ( ruleParameter )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7751:1: ( ruleParameter )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7752:1: ruleParameter
            {
             before(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__DetailsView__ContentAssignment_2_115551);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__ContentAssignment_2_1


    // $ANTLR start rule__DetailsView__TitleAssignment_5
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7761:1: rule__DetailsView__TitleAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__DetailsView__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7765:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7766:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7766:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7767:1: ruleScalarExpression
            {
             before(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__DetailsView__TitleAssignment_515582);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__TitleAssignment_5


    // $ANTLR start rule__DetailsView__HeaderAssignment_6
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7776:1: rule__DetailsView__HeaderAssignment_6 : ( ruleViewHeader ) ;
    public final void rule__DetailsView__HeaderAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7780:1: ( ( ruleViewHeader ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7781:1: ( ruleViewHeader )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7781:1: ( ruleViewHeader )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7782:1: ruleViewHeader
            {
             before(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleViewHeader_in_rule__DetailsView__HeaderAssignment_615613);
            ruleViewHeader();
            _fsp--;

             after(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__HeaderAssignment_6


    // $ANTLR start rule__DetailsView__SectionsAssignment_7
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7791:1: rule__DetailsView__SectionsAssignment_7 : ( ruleViewSection ) ;
    public final void rule__DetailsView__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7795:1: ( ( ruleViewSection ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7796:1: ( ruleViewSection )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7796:1: ( ruleViewSection )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7797:1: ruleViewSection
            {
             before(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleViewSection_in_rule__DetailsView__SectionsAssignment_715644);
            ruleViewSection();
            _fsp--;

             after(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__SectionsAssignment_7


    // $ANTLR start rule__CustomView__NameAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7806:1: rule__CustomView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7810:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7811:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7811:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7812:1: RULE_ID
            {
             before(grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomView__NameAssignment_115675); 
             after(grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__NameAssignment_1


    // $ANTLR start rule__CustomView__ContentAssignment_2_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7821:1: rule__CustomView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__CustomView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7825:1: ( ( ruleParameter ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7826:1: ( ruleParameter )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7826:1: ( ruleParameter )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7827:1: ruleParameter
            {
             before(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__CustomView__ContentAssignment_2_115706);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__ContentAssignment_2_1


    // $ANTLR start rule__CustomView__ObjclassAssignment_4
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7836:1: rule__CustomView__ObjclassAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomView__ObjclassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7840:1: ( ( RULE_STRING ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7841:1: ( RULE_STRING )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7841:1: ( RULE_STRING )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7842:1: RULE_STRING
            {
             before(grammarAccess.getCustomViewAccess().getObjclassSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomView__ObjclassAssignment_415737); 
             after(grammarAccess.getCustomViewAccess().getObjclassSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__ObjclassAssignment_4


    // $ANTLR start rule__ViewHeader__TitleAssignment_3_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7851:1: rule__ViewHeader__TitleAssignment_3_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7855:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7856:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7856:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7857:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__TitleAssignment_3_115768);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__TitleAssignment_3_1


    // $ANTLR start rule__ViewHeader__SubtitleAssignment_4_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7866:1: rule__ViewHeader__SubtitleAssignment_4_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__SubtitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7870:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7871:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7871:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7872:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__SubtitleAssignment_4_115799);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__SubtitleAssignment_4_1


    // $ANTLR start rule__ViewHeader__DetailsAssignment_5_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7881:1: rule__ViewHeader__DetailsAssignment_5_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__DetailsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7885:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7886:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7886:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7887:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__DetailsAssignment_5_115830);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__DetailsAssignment_5_1


    // $ANTLR start rule__ViewHeader__ImageAssignment_6_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7896:1: rule__ViewHeader__ImageAssignment_6_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__ImageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7900:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7901:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7901:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7902:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__ImageAssignment_6_115861);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__ImageAssignment_6_1


    // $ANTLR start rule__ViewSection__TitleAssignment_2_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7911:1: rule__ViewSection__TitleAssignment_2_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewSection__TitleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7915:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7916:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7916:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7917:1: ruleScalarExpression
            {
             before(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewSection__TitleAssignment_2_115892);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__TitleAssignment_2_1


    // $ANTLR start rule__ViewSection__CellsAssignment_3
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7926:1: rule__ViewSection__CellsAssignment_3 : ( ruleSectionCell ) ;
    public final void rule__ViewSection__CellsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7930:1: ( ( ruleSectionCell ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7931:1: ( ruleSectionCell )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7931:1: ( ruleSectionCell )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7932:1: ruleSectionCell
            {
             before(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSectionCell_in_rule__ViewSection__CellsAssignment_315923);
            ruleSectionCell();
            _fsp--;

             after(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__CellsAssignment_3


    // $ANTLR start rule__SectionCell__TypeAssignment_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7941:1: rule__SectionCell__TypeAssignment_1 : ( ruleCellType ) ;
    public final void rule__SectionCell__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7945:1: ( ( ruleCellType ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7946:1: ( ruleCellType )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7946:1: ( ruleCellType )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7947:1: ruleCellType
            {
             before(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCellType_in_rule__SectionCell__TypeAssignment_115954);
            ruleCellType();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__TypeAssignment_1


    // $ANTLR start rule__SectionCell__IteratorAssignment_2_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7956:1: rule__SectionCell__IteratorAssignment_2_1 : ( ruleCollectionIterator ) ;
    public final void rule__SectionCell__IteratorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7960:1: ( ( ruleCollectionIterator ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7961:1: ( ruleCollectionIterator )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7961:1: ( ruleCollectionIterator )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7962:1: ruleCollectionIterator
            {
             before(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_rule__SectionCell__IteratorAssignment_2_115985);
            ruleCollectionIterator();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__IteratorAssignment_2_1


    // $ANTLR start rule__SectionCell__TextAssignment_4_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7971:1: rule__SectionCell__TextAssignment_4_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7975:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7976:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7976:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7977:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__TextAssignment_4_116016);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__TextAssignment_4_1


    // $ANTLR start rule__SectionCell__DetailsAssignment_5_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7986:1: rule__SectionCell__DetailsAssignment_5_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__DetailsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7990:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7991:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7991:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7992:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__DetailsAssignment_5_116047);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__DetailsAssignment_5_1


    // $ANTLR start rule__SectionCell__ImageAssignment_6_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8001:1: rule__SectionCell__ImageAssignment_6_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__ImageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8005:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8006:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8006:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8007:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__ImageAssignment_6_116078);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__ImageAssignment_6_1


    // $ANTLR start rule__SectionCell__ActionAssignment_7_1
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8016:1: rule__SectionCell__ActionAssignment_7_1 : ( ruleViewAction ) ;
    public final void rule__SectionCell__ActionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8020:1: ( ( ruleViewAction ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8021:1: ( ruleViewAction )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8021:1: ( ruleViewAction )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8022:1: ruleViewAction
            {
             before(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleViewAction_in_rule__SectionCell__ActionAssignment_7_116109);
            ruleViewAction();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__ActionAssignment_7_1


    // $ANTLR start rule__CollectionIterator__CollectionAssignment_0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8031:1: rule__CollectionIterator__CollectionAssignment_0 : ( ruleCollectionExpression ) ;
    public final void rule__CollectionIterator__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8035:1: ( ( ruleCollectionExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8036:1: ( ruleCollectionExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8036:1: ( ruleCollectionExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8037:1: ruleCollectionExpression
            {
             before(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_rule__CollectionIterator__CollectionAssignment_016140);
            ruleCollectionExpression();
            _fsp--;

             after(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__CollectionAssignment_0


    // $ANTLR start rule__CollectionIterator__NameAssignment_2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8046:1: rule__CollectionIterator__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CollectionIterator__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8050:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8051:1: ( RULE_ID )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8051:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8052:1: RULE_ID
            {
             before(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionIterator__NameAssignment_216171); 
             after(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__NameAssignment_2


    // $ANTLR start rule__ExternalOpen__UrlAssignment
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8061:1: rule__ExternalOpen__UrlAssignment : ( ruleScalarExpression ) ;
    public final void rule__ExternalOpen__UrlAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8065:1: ( ( ruleScalarExpression ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8066:1: ( ruleScalarExpression )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8066:1: ( ruleScalarExpression )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8067:1: ruleScalarExpression
            {
             before(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ExternalOpen__UrlAssignment16202);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalOpen__UrlAssignment


    // $ANTLR start rule__ViewCall__ViewAssignment_0
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8076:1: rule__ViewCall__ViewAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ViewCall__ViewAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8080:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8081:1: ( ( RULE_ID ) )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8081:1: ( ( RULE_ID ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8082:1: ( RULE_ID )
            {
             before(grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0()); 
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8083:1: ( RULE_ID )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8084:1: RULE_ID
            {
             before(grammarAccess.getViewCallAccess().getViewViewIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ViewCall__ViewAssignment_016237); 
             after(grammarAccess.getViewCallAccess().getViewViewIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__ViewAssignment_0


    // $ANTLR start rule__ViewCall__ProviderAssignment_2
    // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8095:1: rule__ViewCall__ProviderAssignment_2 : ( ruleProviderConstruction ) ;
    public final void rule__ViewCall__ProviderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8099:1: ( ( ruleProviderConstruction ) )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8100:1: ( ruleProviderConstruction )
            {
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8100:1: ( ruleProviderConstruction )
            // ../org.applause.ui/src-gen/org/applause/ui/contentassist/antlr/internal/InternalApplauseDsl.g:8101:1: ruleProviderConstruction
            {
             before(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_rule__ViewCall__ProviderAssignment_216272);
            ruleProviderConstruction();
            _fsp--;

             after(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__ProviderAssignment_2


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_ruleApplication154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDescription249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__0_in_ruleTypeDescription275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_entryRuleObjectReference362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectReference369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__0_in_ruleObjectReference395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedObjectReference429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__0_in_ruleNestedObjectReference455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarExpression549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarExpression__Alternatives_in_ruleScalarExpression575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionExpression__Alternatives_in_ruleCollectionExpression635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Alternatives_in_ruleStringFunction755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__0_in_ruleCollectionLiteral815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunction849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__0_in_ruleCollectionFunction875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabBarApplication909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__0_in_ruleTabBarApplication935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabbarButton969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__0_in_ruleTabbarButton995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__0_in_ruleContentProvider1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderConstruction1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Alternatives_in_ruleProviderConstruction1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Alternatives_in_ruleView1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_entryRuleSectionedView1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionedView1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionedView__Alternatives_in_ruleSectionedView1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__0_in_ruleTableView1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_entryRuleDetailsView1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailsView1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__0_in_ruleDetailsView1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__0_in_ruleCustomView1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_entryRuleViewHeader1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewHeader1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__0_in_ruleViewHeader1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_entryRuleViewSection1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewSection1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__0_in_ruleViewSection1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_entryRuleSectionCell1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionCell1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__0_in_ruleSectionCell1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__0_in_ruleCollectionIterator1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewAction__Alternatives_in_ruleViewAction2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalOpen__UrlAssignment_in_ruleExternalOpen2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__0_in_ruleViewCall2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellType__Alternatives_in_ruleCellType2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ModelElement__Alternatives2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_rule__ModelElement__Alternatives2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__ModelElement__Alternatives2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__ModelElement__Alternatives2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_rule__Expression__Alternatives2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_rule__Expression__Alternatives2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_rule__Expression__Alternatives2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__Expression__Alternatives2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__ScalarExpression__Alternatives2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_rule__ScalarExpression__Alternatives2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__ScalarExpression__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_rule__CollectionExpression__Alternatives2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_rule__CollectionExpression__Alternatives2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__CollectionExpression__Alternatives2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__0_in_rule__StringFunction__Alternatives2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__0_in_rule__StringFunction__Alternatives2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__0_in_rule__StringFunction__Alternatives2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ContentProvider__Alternatives_32642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__ResolverAssignment_3_1_in_rule__ContentProvider__Alternatives_32661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__0_in_rule__ProviderConstruction__Alternatives2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__0_in_rule__ProviderConstruction__Alternatives2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_rule__View__Alternatives2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_rule__View__Alternatives2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_rule__SectionedView__Alternatives2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_rule__SectionedView__Alternatives2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_rule__ViewAction__Alternatives2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_rule__ViewAction__Alternatives2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CellType__Alternatives2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CellType__Alternatives2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CellType__Alternatives2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CellType__Alternatives2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CellType__Alternatives2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03010 = new BitSet(new long[]{0x0000385600000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ApplicationAssignment_0_in_rule__Model__Group__0__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl3097 = new BitSet(new long[]{0x0000385600000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__0__Impl_in_rule__TypeDescription__Group__03132 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__1_in_rule__TypeDescription__Group__03135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__TypeAssignment_0_in_rule__TypeDescription__Group__0__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__1__Impl_in_rule__TypeDescription__Group__13192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__ManyAssignment_1_in_rule__TypeDescription__Group__1__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DescriptionAssignment_0_in_rule__Parameter__Group__0__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__0__Impl_in_rule__ObjectReference__Group__03375 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__1_in_rule__ObjectReference__Group__03378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__ObjectAssignment_0_in_rule__ObjectReference__Group__0__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__1__Impl_in_rule__ObjectReference__Group__13435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__TailAssignment_1_in_rule__ObjectReference__Group__1__Impl3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__0__Impl_in_rule__NestedObjectReference__Group__03497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__1_in_rule__NestedObjectReference__Group__03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NestedObjectReference__Group__0__Impl3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__1__Impl_in_rule__NestedObjectReference__Group__13559 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__2_in_rule__NestedObjectReference__Group__13562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__ObjectAssignment_1_in_rule__NestedObjectReference__Group__1__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__2__Impl_in_rule__NestedObjectReference__Group__23619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__TailAssignment_2_in_rule__NestedObjectReference__Group__2__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__0__Impl_in_rule__StringFunction__Group_0__03683 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__1_in_rule__StringFunction__Group_0__03686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__1__Impl_in_rule__StringFunction__Group_0__13744 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__2_in_rule__StringFunction__Group_0__13747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringFunction__Group_0__1__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__2__Impl_in_rule__StringFunction__Group_0__23806 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__3_in_rule__StringFunction__Group_0__23809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3838 = new BitSet(new long[]{0x0000000000540032L});
    public static final BitSet FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3850 = new BitSet(new long[]{0x0000000000540032L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__3__Impl_in_rule__StringFunction__Group_0__33883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringFunction__Group_0__3__Impl3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__0__Impl_in_rule__StringFunction__Group_1__03950 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__1_in_rule__StringFunction__Group_1__03953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__1__Impl_in_rule__StringFunction__Group_1__14011 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__2_in_rule__StringFunction__Group_1__14014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StringFunction__Group_1__1__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__2__Impl_in_rule__StringFunction__Group_1__24073 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__3_in_rule__StringFunction__Group_1__24076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValueAssignment_1_2_in_rule__StringFunction__Group_1__2__Impl4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__3__Impl_in_rule__StringFunction__Group_1__34133 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__4_in_rule__StringFunction__Group_1__34136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringFunction__Group_1__3__Impl4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__4__Impl_in_rule__StringFunction__Group_1__44195 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__5_in_rule__StringFunction__Group_1__44198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__MatchAssignment_1_4_in_rule__StringFunction__Group_1__4__Impl4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__5__Impl_in_rule__StringFunction__Group_1__54255 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__6_in_rule__StringFunction__Group_1__54258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringFunction__Group_1__5__Impl4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__6__Impl_in_rule__StringFunction__Group_1__64317 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__7_in_rule__StringFunction__Group_1__64320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ReplacementAssignment_1_6_in_rule__StringFunction__Group_1__6__Impl4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__7__Impl_in_rule__StringFunction__Group_1__74377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringFunction__Group_1__7__Impl4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__0__Impl_in_rule__StringFunction__Group_2__04452 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__1_in_rule__StringFunction__Group_2__04455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__1__Impl_in_rule__StringFunction__Group_2__14513 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__2_in_rule__StringFunction__Group_2__14516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StringFunction__Group_2__1__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__2__Impl_in_rule__StringFunction__Group_2__24575 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__3_in_rule__StringFunction__Group_2__24578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValueAssignment_2_2_in_rule__StringFunction__Group_2__2__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__3__Impl_in_rule__StringFunction__Group_2__34635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringFunction__Group_2__3__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__0__Impl_in_rule__CollectionLiteral__Group__04702 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__1_in_rule__CollectionLiteral__Group__04705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionLiteral__Group__0__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__1__Impl_in_rule__CollectionLiteral__Group__14764 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__2_in_rule__CollectionLiteral__Group__14767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__ItemsAssignment_1_in_rule__CollectionLiteral__Group__1__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__2__Impl_in_rule__CollectionLiteral__Group__24824 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__3_in_rule__CollectionLiteral__Group__24827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__0_in_rule__CollectionLiteral__Group__2__Impl4854 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__3__Impl_in_rule__CollectionLiteral__Group__34885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CollectionLiteral__Group__3__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__0__Impl_in_rule__CollectionLiteral__Group_2__04952 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__1_in_rule__CollectionLiteral__Group_2__04955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CollectionLiteral__Group_2__0__Impl4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__1__Impl_in_rule__CollectionLiteral__Group_2__15014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__ItemsAssignment_2_1_in_rule__CollectionLiteral__Group_2__1__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__0__Impl_in_rule__CollectionFunction__Group__05075 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__1_in_rule__CollectionFunction__Group__05078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__1__Impl_in_rule__CollectionFunction__Group__15136 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__2_in_rule__CollectionFunction__Group__15139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionFunction__Group__1__Impl5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__2__Impl_in_rule__CollectionFunction__Group__25198 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__3_in_rule__CollectionFunction__Group__25201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__ValueAssignment_2_in_rule__CollectionFunction__Group__2__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__3__Impl_in_rule__CollectionFunction__Group__35258 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__4_in_rule__CollectionFunction__Group__35261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CollectionFunction__Group__3__Impl5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__4__Impl_in_rule__CollectionFunction__Group__45320 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__5_in_rule__CollectionFunction__Group__45323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__DelimiterAssignment_4_in_rule__CollectionFunction__Group__4__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__5__Impl_in_rule__CollectionFunction__Group__55380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CollectionFunction__Group__5__Impl5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__0__Impl_in_rule__TabBarApplication__Group__05451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__1_in_rule__TabBarApplication__Group__05454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TabBarApplication__Group__0__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__1__Impl_in_rule__TabBarApplication__Group__15513 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__2_in_rule__TabBarApplication__Group__15516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__NameAssignment_1_in_rule__TabBarApplication__Group__1__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__2__Impl_in_rule__TabBarApplication__Group__25573 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__3_in_rule__TabBarApplication__Group__25576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TabBarApplication__Group__2__Impl5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__3__Impl_in_rule__TabBarApplication__Group__35635 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__4_in_rule__TabBarApplication__Group__35638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__ButtonsAssignment_3_in_rule__TabBarApplication__Group__3__Impl5665 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__4__Impl_in_rule__TabBarApplication__Group__45696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TabBarApplication__Group__4__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__0__Impl_in_rule__TabbarButton__Group__05765 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__1_in_rule__TabbarButton__Group__05768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TabbarButton__Group__0__Impl5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__1__Impl_in_rule__TabbarButton__Group__15827 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__2_in_rule__TabbarButton__Group__15830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TabbarButton__Group__1__Impl5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__2__Impl_in_rule__TabbarButton__Group__25889 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__3_in_rule__TabbarButton__Group__25892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TabbarButton__Group__2__Impl5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__3__Impl_in_rule__TabbarButton__Group__35951 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__4_in_rule__TabbarButton__Group__35954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__TitleAssignment_3_in_rule__TabbarButton__Group__3__Impl5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__4__Impl_in_rule__TabbarButton__Group__46011 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__5_in_rule__TabbarButton__Group__46014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TabbarButton__Group__4__Impl6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__5__Impl_in_rule__TabbarButton__Group__56073 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__6_in_rule__TabbarButton__Group__56076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__IconAssignment_5_in_rule__TabbarButton__Group__5__Impl6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__6__Impl_in_rule__TabbarButton__Group__66133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__7_in_rule__TabbarButton__Group__66136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TabbarButton__Group__6__Impl6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__7__Impl_in_rule__TabbarButton__Group__76195 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__8_in_rule__TabbarButton__Group__76198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__ViewAssignment_7_in_rule__TabbarButton__Group__7__Impl6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__8__Impl_in_rule__TabbarButton__Group__86255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TabbarButton__Group__8__Impl6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__06332 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__06335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__16393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__16396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Constant__Group__1__Impl6424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__26455 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__26458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_2_in_rule__Constant__Group__2__Impl6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__36515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__06580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__06583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SimpleType__Group__0__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__16642 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__16645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__26702 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__3_in_rule__SimpleType__Group__26705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SimpleType__Group__2__Impl6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__3__Impl_in_rule__SimpleType__Group__36764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__PlatformTypeAssignment_3_in_rule__SimpleType__Group__3__Impl6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Entity__Group__0__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16891 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26951 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__37012 = new BitSet(new long[]{0x0400000010000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__37015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Entity__Group__3__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__47074 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__47077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__4__Impl7104 = new BitSet(new long[]{0x0400000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__57135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Entity__Group__5__Impl7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__07206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__07209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Entity__Group_2__0__Impl7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__17268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__1__Impl7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DerivedAssignment_0_in_rule__Property__Group__0__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_1_in_rule__Property__Group__1__Impl7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__0__Impl_in_rule__ContentProvider__Group__07513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__1_in_rule__ContentProvider__Group__07516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ContentProvider__Group__0__Impl7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__1__Impl_in_rule__ContentProvider__Group__17575 = new BitSet(new long[]{0x0800000000040800L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__2_in_rule__ContentProvider__Group__17578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__NameAssignment_1_in_rule__ContentProvider__Group__1__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__2__Impl_in_rule__ContentProvider__Group__27635 = new BitSet(new long[]{0x0800000000000800L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__3_in_rule__ContentProvider__Group__27638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__0_in_rule__ContentProvider__Group__2__Impl7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__3__Impl_in_rule__ContentProvider__Group__37696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__4_in_rule__ContentProvider__Group__37699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Alternatives_3_in_rule__ContentProvider__Group__3__Impl7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__4__Impl_in_rule__ContentProvider__Group__47756 = new BitSet(new long[]{0x0200008000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__5_in_rule__ContentProvider__Group__47759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__TypeAssignment_4_in_rule__ContentProvider__Group__4__Impl7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__5__Impl_in_rule__ContentProvider__Group__57816 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__6_in_rule__ContentProvider__Group__57819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__ManyAssignment_5_in_rule__ContentProvider__Group__5__Impl7846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__6__Impl_in_rule__ContentProvider__Group__67877 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__7_in_rule__ContentProvider__Group__67880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ContentProvider__Group__6__Impl7908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__7__Impl_in_rule__ContentProvider__Group__77939 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__8_in_rule__ContentProvider__Group__77942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ContentProvider__Group__7__Impl7970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__8__Impl_in_rule__ContentProvider__Group__88001 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__9_in_rule__ContentProvider__Group__88004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ContentProvider__Group__8__Impl8032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__9__Impl_in_rule__ContentProvider__Group__98063 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__10_in_rule__ContentProvider__Group__98066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__UrlAssignment_9_in_rule__ContentProvider__Group__9__Impl8093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__10__Impl_in_rule__ContentProvider__Group__108123 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__11_in_rule__ContentProvider__Group__108126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ContentProvider__Group__10__Impl8154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__11__Impl_in_rule__ContentProvider__Group__118185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__SelectionAssignment_11_in_rule__ContentProvider__Group__11__Impl8212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__0__Impl_in_rule__ContentProvider__Group_2__08266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__1_in_rule__ContentProvider__Group_2__08269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ContentProvider__Group_2__0__Impl8297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__1__Impl_in_rule__ContentProvider__Group_2__18328 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__2_in_rule__ContentProvider__Group_2__18331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__ParameterAssignment_2_1_in_rule__ContentProvider__Group_2__1__Impl8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__2__Impl_in_rule__ContentProvider__Group_2__28388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ContentProvider__Group_2__2__Impl8416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__0__Impl_in_rule__ProviderConstruction__Group_0__08453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__1_in_rule__ProviderConstruction__Group_0__08456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__1__Impl_in_rule__ProviderConstruction__Group_0__18514 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__2_in_rule__ProviderConstruction__Group_0__18517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ProviderAssignment_0_1_in_rule__ProviderConstruction__Group_0__1__Impl8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__2__Impl_in_rule__ProviderConstruction__Group_0__28574 = new BitSet(new long[]{0x0000000002DC0030L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__3_in_rule__ProviderConstruction__Group_0__28577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProviderConstruction__Group_0__2__Impl8605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__3__Impl_in_rule__ProviderConstruction__Group_0__38636 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__4_in_rule__ProviderConstruction__Group_0__38639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ArgumentAssignment_0_3_in_rule__ProviderConstruction__Group_0__3__Impl8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__4__Impl_in_rule__ProviderConstruction__Group_0__48697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProviderConstruction__Group_0__4__Impl8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__0__Impl_in_rule__ProviderConstruction__Group_1__08766 = new BitSet(new long[]{0x0000000002D40030L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__1_in_rule__ProviderConstruction__Group_1__08769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__1__Impl_in_rule__ProviderConstruction__Group_1__18827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ExpressionAssignment_1_1_in_rule__ProviderConstruction__Group_1__1__Impl8854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__0__Impl_in_rule__TableView__Group__08888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableView__Group__1_in_rule__TableView__Group__08891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TableView__Group__0__Impl8919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__1__Impl_in_rule__TableView__Group__18950 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_rule__TableView__Group__2_in_rule__TableView__Group__18953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__NameAssignment_1_in_rule__TableView__Group__1__Impl8980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__2__Impl_in_rule__TableView__Group__29010 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__3_in_rule__TableView__Group__29013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__0_in_rule__TableView__Group__2__Impl9040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__3__Impl_in_rule__TableView__Group__39071 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__4_in_rule__TableView__Group__39074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TableView__Group__3__Impl9102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__4__Impl_in_rule__TableView__Group__49133 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__TableView__Group__5_in_rule__TableView__Group__49136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TableView__Group__4__Impl9164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__5__Impl_in_rule__TableView__Group__59195 = new BitSet(new long[]{0x0008000010000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__6_in_rule__TableView__Group__59198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__TitleAssignment_5_in_rule__TableView__Group__5__Impl9225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__6__Impl_in_rule__TableView__Group__69255 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__7_in_rule__TableView__Group__69258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__SectionsAssignment_6_in_rule__TableView__Group__6__Impl9285 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__7__Impl_in_rule__TableView__Group__79316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TableView__Group__7__Impl9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__0__Impl_in_rule__TableView__Group_2__09391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__1_in_rule__TableView__Group_2__09394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TableView__Group_2__0__Impl9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__1__Impl_in_rule__TableView__Group_2__19453 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__2_in_rule__TableView__Group_2__19456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__ContentAssignment_2_1_in_rule__TableView__Group_2__1__Impl9483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__2__Impl_in_rule__TableView__Group_2__29513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TableView__Group_2__2__Impl9541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__0__Impl_in_rule__DetailsView__Group__09578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__1_in_rule__DetailsView__Group__09581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DetailsView__Group__0__Impl9609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__1__Impl_in_rule__DetailsView__Group__19640 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__2_in_rule__DetailsView__Group__19643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__NameAssignment_1_in_rule__DetailsView__Group__1__Impl9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__2__Impl_in_rule__DetailsView__Group__29700 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__3_in_rule__DetailsView__Group__29703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__0_in_rule__DetailsView__Group__2__Impl9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__3__Impl_in_rule__DetailsView__Group__39761 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__4_in_rule__DetailsView__Group__39764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DetailsView__Group__3__Impl9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__4__Impl_in_rule__DetailsView__Group__49823 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__5_in_rule__DetailsView__Group__49826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DetailsView__Group__4__Impl9854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__5__Impl_in_rule__DetailsView__Group__59885 = new BitSet(new long[]{0x0008800010000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__6_in_rule__DetailsView__Group__59888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__TitleAssignment_5_in_rule__DetailsView__Group__5__Impl9915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__6__Impl_in_rule__DetailsView__Group__69945 = new BitSet(new long[]{0x0008000010000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__7_in_rule__DetailsView__Group__69948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__HeaderAssignment_6_in_rule__DetailsView__Group__6__Impl9975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__7__Impl_in_rule__DetailsView__Group__710006 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__8_in_rule__DetailsView__Group__710009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__SectionsAssignment_7_in_rule__DetailsView__Group__7__Impl10036 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__8__Impl_in_rule__DetailsView__Group__810067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DetailsView__Group__8__Impl10095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__0__Impl_in_rule__DetailsView__Group_2__010144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__1_in_rule__DetailsView__Group_2__010147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DetailsView__Group_2__0__Impl10175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__1__Impl_in_rule__DetailsView__Group_2__110206 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__2_in_rule__DetailsView__Group_2__110209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__ContentAssignment_2_1_in_rule__DetailsView__Group_2__1__Impl10236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__2__Impl_in_rule__DetailsView__Group_2__210266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DetailsView__Group_2__2__Impl10294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__0__Impl_in_rule__CustomView__Group__010331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomView__Group__1_in_rule__CustomView__Group__010334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__CustomView__Group__0__Impl10362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__1__Impl_in_rule__CustomView__Group__110393 = new BitSet(new long[]{0x0000400000040000L});
    public static final BitSet FOLLOW_rule__CustomView__Group__2_in_rule__CustomView__Group__110396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__NameAssignment_1_in_rule__CustomView__Group__1__Impl10423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__2__Impl_in_rule__CustomView__Group__210453 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__CustomView__Group__3_in_rule__CustomView__Group__210456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__0_in_rule__CustomView__Group__2__Impl10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__3__Impl_in_rule__CustomView__Group__310514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomView__Group__4_in_rule__CustomView__Group__310517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__CustomView__Group__3__Impl10545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__4__Impl_in_rule__CustomView__Group__410576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__ObjclassAssignment_4_in_rule__CustomView__Group__4__Impl10603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__0__Impl_in_rule__CustomView__Group_2__010643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__1_in_rule__CustomView__Group_2__010646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CustomView__Group_2__0__Impl10674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__1__Impl_in_rule__CustomView__Group_2__110705 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__2_in_rule__CustomView__Group_2__110708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__ContentAssignment_2_1_in_rule__CustomView__Group_2__1__Impl10735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__2__Impl_in_rule__CustomView__Group_2__210765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CustomView__Group_2__2__Impl10793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__0__Impl_in_rule__ViewHeader__Group__010830 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__1_in_rule__ViewHeader__Group__010833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__1__Impl_in_rule__ViewHeader__Group__110891 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__2_in_rule__ViewHeader__Group__110894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ViewHeader__Group__1__Impl10922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__2__Impl_in_rule__ViewHeader__Group__210953 = new BitSet(new long[]{0x0007000050000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__3_in_rule__ViewHeader__Group__210956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewHeader__Group__2__Impl10984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__3__Impl_in_rule__ViewHeader__Group__311015 = new BitSet(new long[]{0x0007000010000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__4_in_rule__ViewHeader__Group__311018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__0_in_rule__ViewHeader__Group__3__Impl11045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__4__Impl_in_rule__ViewHeader__Group__411076 = new BitSet(new long[]{0x0006000010000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__5_in_rule__ViewHeader__Group__411079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__0_in_rule__ViewHeader__Group__4__Impl11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__5__Impl_in_rule__ViewHeader__Group__511137 = new BitSet(new long[]{0x0004000010000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__6_in_rule__ViewHeader__Group__511140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__0_in_rule__ViewHeader__Group__5__Impl11167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__6__Impl_in_rule__ViewHeader__Group__611198 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__7_in_rule__ViewHeader__Group__611201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__0_in_rule__ViewHeader__Group__6__Impl11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__7__Impl_in_rule__ViewHeader__Group__711259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ViewHeader__Group__7__Impl11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__0__Impl_in_rule__ViewHeader__Group_3__011334 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__1_in_rule__ViewHeader__Group_3__011337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ViewHeader__Group_3__0__Impl11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__1__Impl_in_rule__ViewHeader__Group_3__111396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__TitleAssignment_3_1_in_rule__ViewHeader__Group_3__1__Impl11423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__0__Impl_in_rule__ViewHeader__Group_4__011457 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__1_in_rule__ViewHeader__Group_4__011460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ViewHeader__Group_4__0__Impl11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__1__Impl_in_rule__ViewHeader__Group_4__111519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__SubtitleAssignment_4_1_in_rule__ViewHeader__Group_4__1__Impl11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__0__Impl_in_rule__ViewHeader__Group_5__011580 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__1_in_rule__ViewHeader__Group_5__011583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ViewHeader__Group_5__0__Impl11611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__1__Impl_in_rule__ViewHeader__Group_5__111642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__DetailsAssignment_5_1_in_rule__ViewHeader__Group_5__1__Impl11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__0__Impl_in_rule__ViewHeader__Group_6__011703 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__1_in_rule__ViewHeader__Group_6__011706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ViewHeader__Group_6__0__Impl11734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__1__Impl_in_rule__ViewHeader__Group_6__111765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__ImageAssignment_6_1_in_rule__ViewHeader__Group_6__1__Impl11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__0__Impl_in_rule__ViewSection__Group__011826 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__1_in_rule__ViewSection__Group__011829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ViewSection__Group__0__Impl11857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__1__Impl_in_rule__ViewSection__Group__111888 = new BitSet(new long[]{0x0010000040000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__2_in_rule__ViewSection__Group__111891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewSection__Group__1__Impl11919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__2__Impl_in_rule__ViewSection__Group__211950 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__3_in_rule__ViewSection__Group__211953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__0_in_rule__ViewSection__Group__2__Impl11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__3__Impl_in_rule__ViewSection__Group__312011 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__4_in_rule__ViewSection__Group__312014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl12043 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl12055 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__4__Impl_in_rule__ViewSection__Group__412088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ViewSection__Group__4__Impl12116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__0__Impl_in_rule__ViewSection__Group_2__012157 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__1_in_rule__ViewSection__Group_2__012160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ViewSection__Group_2__0__Impl12188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__1__Impl_in_rule__ViewSection__Group_2__112219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__TitleAssignment_2_1_in_rule__ViewSection__Group_2__1__Impl12246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__0__Impl_in_rule__SectionCell__Group__012280 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__1_in_rule__SectionCell__Group__012283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__SectionCell__Group__0__Impl12311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__1__Impl_in_rule__SectionCell__Group__112342 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__2_in_rule__SectionCell__Group__112345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__TypeAssignment_1_in_rule__SectionCell__Group__1__Impl12372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__2__Impl_in_rule__SectionCell__Group__212402 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__3_in_rule__SectionCell__Group__212405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__0_in_rule__SectionCell__Group__2__Impl12432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__3__Impl_in_rule__SectionCell__Group__312463 = new BitSet(new long[]{0x00C6000010000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__4_in_rule__SectionCell__Group__312466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SectionCell__Group__3__Impl12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__4__Impl_in_rule__SectionCell__Group__412525 = new BitSet(new long[]{0x0086000010000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__5_in_rule__SectionCell__Group__412528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__0_in_rule__SectionCell__Group__4__Impl12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__5__Impl_in_rule__SectionCell__Group__512586 = new BitSet(new long[]{0x0084000010000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__6_in_rule__SectionCell__Group__512589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__0_in_rule__SectionCell__Group__5__Impl12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__6__Impl_in_rule__SectionCell__Group__612647 = new BitSet(new long[]{0x0080000010000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__7_in_rule__SectionCell__Group__612650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__0_in_rule__SectionCell__Group__6__Impl12677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__7__Impl_in_rule__SectionCell__Group__712708 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__8_in_rule__SectionCell__Group__712711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__0_in_rule__SectionCell__Group__7__Impl12738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__8__Impl_in_rule__SectionCell__Group__812769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SectionCell__Group__8__Impl12797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__0__Impl_in_rule__SectionCell__Group_2__012846 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__1_in_rule__SectionCell__Group_2__012849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__SectionCell__Group_2__0__Impl12877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__1__Impl_in_rule__SectionCell__Group_2__112908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__IteratorAssignment_2_1_in_rule__SectionCell__Group_2__1__Impl12935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__0__Impl_in_rule__SectionCell__Group_4__012969 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__1_in_rule__SectionCell__Group_4__012972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SectionCell__Group_4__0__Impl13000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__1__Impl_in_rule__SectionCell__Group_4__113031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__TextAssignment_4_1_in_rule__SectionCell__Group_4__1__Impl13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__0__Impl_in_rule__SectionCell__Group_5__013092 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__1_in_rule__SectionCell__Group_5__013095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SectionCell__Group_5__0__Impl13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__1__Impl_in_rule__SectionCell__Group_5__113154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__DetailsAssignment_5_1_in_rule__SectionCell__Group_5__1__Impl13181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__0__Impl_in_rule__SectionCell__Group_6__013215 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__1_in_rule__SectionCell__Group_6__013218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__SectionCell__Group_6__0__Impl13246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__1__Impl_in_rule__SectionCell__Group_6__113277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__ImageAssignment_6_1_in_rule__SectionCell__Group_6__1__Impl13304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__0__Impl_in_rule__SectionCell__Group_7__013338 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__1_in_rule__SectionCell__Group_7__013341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__SectionCell__Group_7__0__Impl13369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__1__Impl_in_rule__SectionCell__Group_7__113400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__ActionAssignment_7_1_in_rule__SectionCell__Group_7__1__Impl13427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__0__Impl_in_rule__CollectionIterator__Group__013461 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__1_in_rule__CollectionIterator__Group__013464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__CollectionAssignment_0_in_rule__CollectionIterator__Group__0__Impl13491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__1__Impl_in_rule__CollectionIterator__Group__113521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__2_in_rule__CollectionIterator__Group__113524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__CollectionIterator__Group__1__Impl13552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__2__Impl_in_rule__CollectionIterator__Group__213583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__NameAssignment_2_in_rule__CollectionIterator__Group__2__Impl13610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__0__Impl_in_rule__ViewCall__Group__013646 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__1_in_rule__ViewCall__Group__013649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__ViewAssignment_0_in_rule__ViewCall__Group__0__Impl13676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__1__Impl_in_rule__ViewCall__Group__113706 = new BitSet(new long[]{0x0000000002DC0030L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__2_in_rule__ViewCall__Group__113709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ViewCall__Group__1__Impl13737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__2__Impl_in_rule__ViewCall__Group__213768 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__3_in_rule__ViewCall__Group__213771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__ProviderAssignment_2_in_rule__ViewCall__Group__2__Impl13798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__3__Impl_in_rule__ViewCall__Group__313829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ViewCall__Group__3__Impl13857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__Model__ApplicationAssignment_013901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_rule__Model__ElementsAssignment_113932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDescription__TypeAssignment_013967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__TypeDescription__ManyAssignment_114007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_rule__Parameter__DescriptionAssignment_014046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_114077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectReference__ObjectAssignment_014112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_rule__ObjectReference__TailAssignment_114147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NestedObjectReference__ObjectAssignment_114182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_rule__NestedObjectReference__TailAssignment_214217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment14248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValuesAssignment_0_214279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_1_214310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__MatchAssignment_1_414341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ReplacementAssignment_1_614372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_2_214403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_114434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_2_114465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__ValueAssignment_214496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__DelimiterAssignment_414527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TabBarApplication__NameAssignment_114558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_rule__TabBarApplication__ButtonsAssignment_314589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TabbarButton__TitleAssignment_314620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TabbarButton__IconAssignment_514651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_rule__TabbarButton__ViewAssignment_714682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_214713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__Constant__ValueAssignment_314744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_114775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleType__PlatformTypeAssignment_314806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_114837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_114872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_414907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Property__DerivedAssignment_014943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_rule__Property__DescriptionAssignment_114982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_215013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentProvider__NameAssignment_115044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ContentProvider__ParameterAssignment_2_115075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ContentProvider__ResolverAssignment_3_115111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentProvider__TypeAssignment_415154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ContentProvider__ManyAssignment_515194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ContentProvider__UrlAssignment_915233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ContentProvider__SelectionAssignment_1115264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProviderConstruction__ProviderAssignment_0_115299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProviderConstruction__ArgumentAssignment_0_315334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProviderConstruction__ExpressionAssignment_1_115365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TableView__NameAssignment_115396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__TableView__ContentAssignment_2_115427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TableView__TitleAssignment_515458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_rule__TableView__SectionsAssignment_615489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DetailsView__NameAssignment_115520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DetailsView__ContentAssignment_2_115551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__DetailsView__TitleAssignment_515582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_rule__DetailsView__HeaderAssignment_615613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_rule__DetailsView__SectionsAssignment_715644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomView__NameAssignment_115675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__CustomView__ContentAssignment_2_115706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomView__ObjclassAssignment_415737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__TitleAssignment_3_115768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__SubtitleAssignment_4_115799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__DetailsAssignment_5_115830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__ImageAssignment_6_115861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewSection__TitleAssignment_2_115892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_rule__ViewSection__CellsAssignment_315923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellType_in_rule__SectionCell__TypeAssignment_115954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_rule__SectionCell__IteratorAssignment_2_115985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__TextAssignment_4_116016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__DetailsAssignment_5_116047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__ImageAssignment_6_116078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_rule__SectionCell__ActionAssignment_7_116109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_rule__CollectionIterator__CollectionAssignment_016140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionIterator__NameAssignment_216171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ExternalOpen__UrlAssignment16202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ViewCall__ViewAssignment_016237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_rule__ViewCall__ProviderAssignment_216272 = new BitSet(new long[]{0x0000000000000002L});

}