package de.itemis.mobilizer.ui.contentassist.antlr.internal; 

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
import de.itemis.mobilizer.services.AppModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppModelDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'returns'", "'Default'", "'DefaultWithDisclosure'", "'Value2'", "'Double'", "'Subtitle'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'['", "']'", "'split('", "'tabbarApplication'", "'{'", "'}'", "'button'", "'title='", "'icon='", "'view='", "'type'", "'mapsTo'", "'entity'", "'extends'", "'contentprovider'", "'fetches'", "'XML'", "'from'", "'selects'", "'tableview'", "'detailsview'", "'customview'", "'implementedBy'", "'header'", "'subtitle='", "'details='", "'image='", "'section'", "'cell'", "'foreach'", "'text='", "'action='", "'as'", "'[]'", "'derived'", "'resolves'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalAppModelDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g"; }


     
     	private AppModelDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AppModelDslGrammarAccess grammarAccess) {
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:62:1: ( ruleModel EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:63:1: ruleModel EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:77:1: ( rule__Model__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:77:2: rule__Model__Group__0
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:89:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:90:1: ( ruleApplication EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:91:1: ruleApplication EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:98:1: ruleApplication : ( ruleTabBarApplication ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:102:2: ( ( ruleTabBarApplication ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:103:1: ( ruleTabBarApplication )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:103:1: ( ruleTabBarApplication )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:104:1: ruleTabBarApplication
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:117:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:118:1: ( ruleModelElement EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:119:1: ruleModelElement EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:126:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:130:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:131:1: ( ( rule__ModelElement__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:131:1: ( ( rule__ModelElement__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:132:1: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:133:1: ( rule__ModelElement__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:133:2: rule__ModelElement__Alternatives
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:147:1: entryRuleTypeDescription : ruleTypeDescription EOF ;
    public final void entryRuleTypeDescription() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:148:1: ( ruleTypeDescription EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:149:1: ruleTypeDescription EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:156:1: ruleTypeDescription : ( ( rule__TypeDescription__Group__0 ) ) ;
    public final void ruleTypeDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:160:2: ( ( ( rule__TypeDescription__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:161:1: ( ( rule__TypeDescription__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:161:1: ( ( rule__TypeDescription__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:162:1: ( rule__TypeDescription__Group__0 )
            {
             before(grammarAccess.getTypeDescriptionAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:163:1: ( rule__TypeDescription__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:163:2: rule__TypeDescription__Group__0
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:175:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:176:1: ( ruleParameter EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:177:1: ruleParameter EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:184:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:188:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:189:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:189:1: ( ( rule__Parameter__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:190:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:191:1: ( rule__Parameter__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:191:2: rule__Parameter__Group__0
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:203:1: entryRuleObjectReference : ruleObjectReference EOF ;
    public final void entryRuleObjectReference() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:204:1: ( ruleObjectReference EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:205:1: ruleObjectReference EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:212:1: ruleObjectReference : ( ( rule__ObjectReference__Group__0 ) ) ;
    public final void ruleObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:216:2: ( ( ( rule__ObjectReference__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:217:1: ( ( rule__ObjectReference__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:217:1: ( ( rule__ObjectReference__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:218:1: ( rule__ObjectReference__Group__0 )
            {
             before(grammarAccess.getObjectReferenceAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:219:1: ( rule__ObjectReference__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:219:2: rule__ObjectReference__Group__0
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:231:1: entryRuleNestedObjectReference : ruleNestedObjectReference EOF ;
    public final void entryRuleNestedObjectReference() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:232:1: ( ruleNestedObjectReference EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:233:1: ruleNestedObjectReference EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:240:1: ruleNestedObjectReference : ( ( rule__NestedObjectReference__Group__0 ) ) ;
    public final void ruleNestedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:244:2: ( ( ( rule__NestedObjectReference__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:245:1: ( ( rule__NestedObjectReference__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:245:1: ( ( rule__NestedObjectReference__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:246:1: ( rule__NestedObjectReference__Group__0 )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:247:1: ( rule__NestedObjectReference__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:247:2: rule__NestedObjectReference__Group__0
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:259:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:260:1: ( ruleExpression EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:261:1: ruleExpression EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:268:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:272:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:273:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:273:1: ( ( rule__Expression__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:274:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:275:1: ( rule__Expression__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:275:2: rule__Expression__Alternatives
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:287:1: entryRuleScalarExpression : ruleScalarExpression EOF ;
    public final void entryRuleScalarExpression() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:288:1: ( ruleScalarExpression EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:289:1: ruleScalarExpression EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:296:1: ruleScalarExpression : ( ( rule__ScalarExpression__Alternatives ) ) ;
    public final void ruleScalarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:300:2: ( ( ( rule__ScalarExpression__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:301:1: ( ( rule__ScalarExpression__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:301:1: ( ( rule__ScalarExpression__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:302:1: ( rule__ScalarExpression__Alternatives )
            {
             before(grammarAccess.getScalarExpressionAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:303:1: ( rule__ScalarExpression__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:303:2: rule__ScalarExpression__Alternatives
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:315:1: entryRuleCollectionExpression : ruleCollectionExpression EOF ;
    public final void entryRuleCollectionExpression() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:316:1: ( ruleCollectionExpression EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:317:1: ruleCollectionExpression EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:324:1: ruleCollectionExpression : ( ( rule__CollectionExpression__Alternatives ) ) ;
    public final void ruleCollectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:328:2: ( ( ( rule__CollectionExpression__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:329:1: ( ( rule__CollectionExpression__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:329:1: ( ( rule__CollectionExpression__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:330:1: ( rule__CollectionExpression__Alternatives )
            {
             before(grammarAccess.getCollectionExpressionAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:331:1: ( rule__CollectionExpression__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:331:2: rule__CollectionExpression__Alternatives
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:343:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:344:1: ( ruleStringLiteral EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:345:1: ruleStringLiteral EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:352:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:356:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:357:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:357:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:358:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:359:1: ( rule__StringLiteral__ValueAssignment )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:359:2: rule__StringLiteral__ValueAssignment
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:371:1: entryRuleStringFunction : ruleStringFunction EOF ;
    public final void entryRuleStringFunction() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:372:1: ( ruleStringFunction EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:373:1: ruleStringFunction EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:380:1: ruleStringFunction : ( ( rule__StringFunction__Alternatives ) ) ;
    public final void ruleStringFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:384:2: ( ( ( rule__StringFunction__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:385:1: ( ( rule__StringFunction__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:385:1: ( ( rule__StringFunction__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:386:1: ( rule__StringFunction__Alternatives )
            {
             before(grammarAccess.getStringFunctionAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:387:1: ( rule__StringFunction__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:387:2: rule__StringFunction__Alternatives
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:399:1: entryRuleCollectionLiteral : ruleCollectionLiteral EOF ;
    public final void entryRuleCollectionLiteral() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:400:1: ( ruleCollectionLiteral EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:401:1: ruleCollectionLiteral EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:408:1: ruleCollectionLiteral : ( ( rule__CollectionLiteral__Group__0 ) ) ;
    public final void ruleCollectionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:412:2: ( ( ( rule__CollectionLiteral__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:413:1: ( ( rule__CollectionLiteral__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:413:1: ( ( rule__CollectionLiteral__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:414:1: ( rule__CollectionLiteral__Group__0 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:415:1: ( rule__CollectionLiteral__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:415:2: rule__CollectionLiteral__Group__0
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:427:1: entryRuleCollectionFunction : ruleCollectionFunction EOF ;
    public final void entryRuleCollectionFunction() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:428:1: ( ruleCollectionFunction EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:429:1: ruleCollectionFunction EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:436:1: ruleCollectionFunction : ( ( rule__CollectionFunction__Group__0 ) ) ;
    public final void ruleCollectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:440:2: ( ( ( rule__CollectionFunction__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:441:1: ( ( rule__CollectionFunction__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:441:1: ( ( rule__CollectionFunction__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:442:1: ( rule__CollectionFunction__Group__0 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:443:1: ( rule__CollectionFunction__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:443:2: rule__CollectionFunction__Group__0
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:455:1: entryRuleTabBarApplication : ruleTabBarApplication EOF ;
    public final void entryRuleTabBarApplication() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:456:1: ( ruleTabBarApplication EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:457:1: ruleTabBarApplication EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:464:1: ruleTabBarApplication : ( ( rule__TabBarApplication__Group__0 ) ) ;
    public final void ruleTabBarApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:468:2: ( ( ( rule__TabBarApplication__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:469:1: ( ( rule__TabBarApplication__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:469:1: ( ( rule__TabBarApplication__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:470:1: ( rule__TabBarApplication__Group__0 )
            {
             before(grammarAccess.getTabBarApplicationAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:471:1: ( rule__TabBarApplication__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:471:2: rule__TabBarApplication__Group__0
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:483:1: entryRuleTabbarButton : ruleTabbarButton EOF ;
    public final void entryRuleTabbarButton() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:484:1: ( ruleTabbarButton EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:485:1: ruleTabbarButton EOF
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:492:1: ruleTabbarButton : ( ( rule__TabbarButton__Group__0 ) ) ;
    public final void ruleTabbarButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:496:2: ( ( ( rule__TabbarButton__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:497:1: ( ( rule__TabbarButton__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:497:1: ( ( rule__TabbarButton__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:498:1: ( rule__TabbarButton__Group__0 )
            {
             before(grammarAccess.getTabbarButtonAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:499:1: ( rule__TabbarButton__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:499:2: rule__TabbarButton__Group__0
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


    // $ANTLR start entryRuleType
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:511:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:512:1: ( ruleType EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:513:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1022);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1029); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:520:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:524:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:525:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:525:1: ( ( rule__Type__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:526:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:527:1: ( rule__Type__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:527:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1055);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:539:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:540:1: ( ruleSimpleType EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:541:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType1082);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType1089); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:548:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:552:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:553:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:553:1: ( ( rule__SimpleType__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:554:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:555:1: ( rule__SimpleType__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:555:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType1115);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:567:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:568:1: ( ruleEntity EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:569:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1142);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1149); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:576:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:580:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:581:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:581:1: ( ( rule__Entity__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:582:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:583:1: ( rule__Entity__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:583:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity1175);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:595:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:596:1: ( ruleProperty EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:597:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1202);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1209); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:604:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:608:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:609:1: ( ( rule__Property__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:609:1: ( ( rule__Property__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:610:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:611:1: ( rule__Property__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:611:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty1235);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:623:1: entryRuleContentProvider : ruleContentProvider EOF ;
    public final void entryRuleContentProvider() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:624:1: ( ruleContentProvider EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:625:1: ruleContentProvider EOF
            {
             before(grammarAccess.getContentProviderRule()); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider1262);
            ruleContentProvider();
            _fsp--;

             after(grammarAccess.getContentProviderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider1269); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:632:1: ruleContentProvider : ( ( rule__ContentProvider__Group__0 ) ) ;
    public final void ruleContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:636:2: ( ( ( rule__ContentProvider__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:637:1: ( ( rule__ContentProvider__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:637:1: ( ( rule__ContentProvider__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:638:1: ( rule__ContentProvider__Group__0 )
            {
             before(grammarAccess.getContentProviderAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:639:1: ( rule__ContentProvider__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:639:2: rule__ContentProvider__Group__0
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__0_in_ruleContentProvider1295);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:651:1: entryRuleProviderConstruction : ruleProviderConstruction EOF ;
    public final void entryRuleProviderConstruction() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:652:1: ( ruleProviderConstruction EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:653:1: ruleProviderConstruction EOF
            {
             before(grammarAccess.getProviderConstructionRule()); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction1322);
            ruleProviderConstruction();
            _fsp--;

             after(grammarAccess.getProviderConstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderConstruction1329); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:660:1: ruleProviderConstruction : ( ( rule__ProviderConstruction__Alternatives ) ) ;
    public final void ruleProviderConstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:664:2: ( ( ( rule__ProviderConstruction__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:665:1: ( ( rule__ProviderConstruction__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:665:1: ( ( rule__ProviderConstruction__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:666:1: ( rule__ProviderConstruction__Alternatives )
            {
             before(grammarAccess.getProviderConstructionAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:667:1: ( rule__ProviderConstruction__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:667:2: rule__ProviderConstruction__Alternatives
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Alternatives_in_ruleProviderConstruction1355);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:679:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:680:1: ( ruleView EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:681:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView1382);
            ruleView();
            _fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView1389); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:688:1: ruleView : ( ( rule__View__Alternatives ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:692:2: ( ( ( rule__View__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:693:1: ( ( rule__View__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:693:1: ( ( rule__View__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:694:1: ( rule__View__Alternatives )
            {
             before(grammarAccess.getViewAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:695:1: ( rule__View__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:695:2: rule__View__Alternatives
            {
            pushFollow(FOLLOW_rule__View__Alternatives_in_ruleView1415);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:707:1: entryRuleSectionedView : ruleSectionedView EOF ;
    public final void entryRuleSectionedView() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:708:1: ( ruleSectionedView EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:709:1: ruleSectionedView EOF
            {
             before(grammarAccess.getSectionedViewRule()); 
            pushFollow(FOLLOW_ruleSectionedView_in_entryRuleSectionedView1442);
            ruleSectionedView();
            _fsp--;

             after(grammarAccess.getSectionedViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionedView1449); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:716:1: ruleSectionedView : ( ( rule__SectionedView__Alternatives ) ) ;
    public final void ruleSectionedView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:720:2: ( ( ( rule__SectionedView__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:721:1: ( ( rule__SectionedView__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:721:1: ( ( rule__SectionedView__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:722:1: ( rule__SectionedView__Alternatives )
            {
             before(grammarAccess.getSectionedViewAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:723:1: ( rule__SectionedView__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:723:2: rule__SectionedView__Alternatives
            {
            pushFollow(FOLLOW_rule__SectionedView__Alternatives_in_ruleSectionedView1475);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:735:1: entryRuleTableView : ruleTableView EOF ;
    public final void entryRuleTableView() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:736:1: ( ruleTableView EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:737:1: ruleTableView EOF
            {
             before(grammarAccess.getTableViewRule()); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView1502);
            ruleTableView();
            _fsp--;

             after(grammarAccess.getTableViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView1509); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:744:1: ruleTableView : ( ( rule__TableView__Group__0 ) ) ;
    public final void ruleTableView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:748:2: ( ( ( rule__TableView__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:749:1: ( ( rule__TableView__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:749:1: ( ( rule__TableView__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:750:1: ( rule__TableView__Group__0 )
            {
             before(grammarAccess.getTableViewAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:751:1: ( rule__TableView__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:751:2: rule__TableView__Group__0
            {
            pushFollow(FOLLOW_rule__TableView__Group__0_in_ruleTableView1535);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:763:1: entryRuleDetailsView : ruleDetailsView EOF ;
    public final void entryRuleDetailsView() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:764:1: ( ruleDetailsView EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:765:1: ruleDetailsView EOF
            {
             before(grammarAccess.getDetailsViewRule()); 
            pushFollow(FOLLOW_ruleDetailsView_in_entryRuleDetailsView1562);
            ruleDetailsView();
            _fsp--;

             after(grammarAccess.getDetailsViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailsView1569); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:772:1: ruleDetailsView : ( ( rule__DetailsView__Group__0 ) ) ;
    public final void ruleDetailsView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:776:2: ( ( ( rule__DetailsView__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:777:1: ( ( rule__DetailsView__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:777:1: ( ( rule__DetailsView__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:778:1: ( rule__DetailsView__Group__0 )
            {
             before(grammarAccess.getDetailsViewAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:779:1: ( rule__DetailsView__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:779:2: rule__DetailsView__Group__0
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__0_in_ruleDetailsView1595);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:791:1: entryRuleCustomView : ruleCustomView EOF ;
    public final void entryRuleCustomView() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:792:1: ( ruleCustomView EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:793:1: ruleCustomView EOF
            {
             before(grammarAccess.getCustomViewRule()); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView1622);
            ruleCustomView();
            _fsp--;

             after(grammarAccess.getCustomViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView1629); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:800:1: ruleCustomView : ( ( rule__CustomView__Group__0 ) ) ;
    public final void ruleCustomView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:804:2: ( ( ( rule__CustomView__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:805:1: ( ( rule__CustomView__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:805:1: ( ( rule__CustomView__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:806:1: ( rule__CustomView__Group__0 )
            {
             before(grammarAccess.getCustomViewAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:807:1: ( rule__CustomView__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:807:2: rule__CustomView__Group__0
            {
            pushFollow(FOLLOW_rule__CustomView__Group__0_in_ruleCustomView1655);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:819:1: entryRuleViewHeader : ruleViewHeader EOF ;
    public final void entryRuleViewHeader() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:820:1: ( ruleViewHeader EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:821:1: ruleViewHeader EOF
            {
             before(grammarAccess.getViewHeaderRule()); 
            pushFollow(FOLLOW_ruleViewHeader_in_entryRuleViewHeader1682);
            ruleViewHeader();
            _fsp--;

             after(grammarAccess.getViewHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewHeader1689); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:828:1: ruleViewHeader : ( ( rule__ViewHeader__Group__0 ) ) ;
    public final void ruleViewHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:832:2: ( ( ( rule__ViewHeader__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:833:1: ( ( rule__ViewHeader__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:833:1: ( ( rule__ViewHeader__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:834:1: ( rule__ViewHeader__Group__0 )
            {
             before(grammarAccess.getViewHeaderAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:835:1: ( rule__ViewHeader__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:835:2: rule__ViewHeader__Group__0
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__0_in_ruleViewHeader1715);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:847:1: entryRuleViewSection : ruleViewSection EOF ;
    public final void entryRuleViewSection() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:848:1: ( ruleViewSection EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:849:1: ruleViewSection EOF
            {
             before(grammarAccess.getViewSectionRule()); 
            pushFollow(FOLLOW_ruleViewSection_in_entryRuleViewSection1742);
            ruleViewSection();
            _fsp--;

             after(grammarAccess.getViewSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewSection1749); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:856:1: ruleViewSection : ( ( rule__ViewSection__Group__0 ) ) ;
    public final void ruleViewSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:860:2: ( ( ( rule__ViewSection__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:861:1: ( ( rule__ViewSection__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:861:1: ( ( rule__ViewSection__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:862:1: ( rule__ViewSection__Group__0 )
            {
             before(grammarAccess.getViewSectionAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:863:1: ( rule__ViewSection__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:863:2: rule__ViewSection__Group__0
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__0_in_ruleViewSection1775);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:875:1: entryRuleSectionCell : ruleSectionCell EOF ;
    public final void entryRuleSectionCell() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:876:1: ( ruleSectionCell EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:877:1: ruleSectionCell EOF
            {
             before(grammarAccess.getSectionCellRule()); 
            pushFollow(FOLLOW_ruleSectionCell_in_entryRuleSectionCell1802);
            ruleSectionCell();
            _fsp--;

             after(grammarAccess.getSectionCellRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionCell1809); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:884:1: ruleSectionCell : ( ( rule__SectionCell__Group__0 ) ) ;
    public final void ruleSectionCell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:888:2: ( ( ( rule__SectionCell__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:889:1: ( ( rule__SectionCell__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:889:1: ( ( rule__SectionCell__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:890:1: ( rule__SectionCell__Group__0 )
            {
             before(grammarAccess.getSectionCellAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:891:1: ( rule__SectionCell__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:891:2: rule__SectionCell__Group__0
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__0_in_ruleSectionCell1835);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:903:1: entryRuleCollectionIterator : ruleCollectionIterator EOF ;
    public final void entryRuleCollectionIterator() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:904:1: ( ruleCollectionIterator EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:905:1: ruleCollectionIterator EOF
            {
             before(grammarAccess.getCollectionIteratorRule()); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator1862);
            ruleCollectionIterator();
            _fsp--;

             after(grammarAccess.getCollectionIteratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator1869); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:912:1: ruleCollectionIterator : ( ( rule__CollectionIterator__Group__0 ) ) ;
    public final void ruleCollectionIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:916:2: ( ( ( rule__CollectionIterator__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:917:1: ( ( rule__CollectionIterator__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:917:1: ( ( rule__CollectionIterator__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:918:1: ( rule__CollectionIterator__Group__0 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:919:1: ( rule__CollectionIterator__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:919:2: rule__CollectionIterator__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__0_in_ruleCollectionIterator1895);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:931:1: entryRuleViewAction : ruleViewAction EOF ;
    public final void entryRuleViewAction() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:932:1: ( ruleViewAction EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:933:1: ruleViewAction EOF
            {
             before(grammarAccess.getViewActionRule()); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction1922);
            ruleViewAction();
            _fsp--;

             after(grammarAccess.getViewActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction1929); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:940:1: ruleViewAction : ( ( rule__ViewAction__Alternatives ) ) ;
    public final void ruleViewAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:944:2: ( ( ( rule__ViewAction__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:945:1: ( ( rule__ViewAction__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:945:1: ( ( rule__ViewAction__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:946:1: ( rule__ViewAction__Alternatives )
            {
             before(grammarAccess.getViewActionAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:947:1: ( rule__ViewAction__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:947:2: rule__ViewAction__Alternatives
            {
            pushFollow(FOLLOW_rule__ViewAction__Alternatives_in_ruleViewAction1955);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:959:1: entryRuleExternalOpen : ruleExternalOpen EOF ;
    public final void entryRuleExternalOpen() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:960:1: ( ruleExternalOpen EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:961:1: ruleExternalOpen EOF
            {
             before(grammarAccess.getExternalOpenRule()); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen1982);
            ruleExternalOpen();
            _fsp--;

             after(grammarAccess.getExternalOpenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen1989); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:968:1: ruleExternalOpen : ( ( rule__ExternalOpen__UrlAssignment ) ) ;
    public final void ruleExternalOpen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:972:2: ( ( ( rule__ExternalOpen__UrlAssignment ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:973:1: ( ( rule__ExternalOpen__UrlAssignment ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:973:1: ( ( rule__ExternalOpen__UrlAssignment ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:974:1: ( rule__ExternalOpen__UrlAssignment )
            {
             before(grammarAccess.getExternalOpenAccess().getUrlAssignment()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:975:1: ( rule__ExternalOpen__UrlAssignment )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:975:2: rule__ExternalOpen__UrlAssignment
            {
            pushFollow(FOLLOW_rule__ExternalOpen__UrlAssignment_in_ruleExternalOpen2015);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:987:1: entryRuleViewCall : ruleViewCall EOF ;
    public final void entryRuleViewCall() throws RecognitionException {
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:988:1: ( ruleViewCall EOF )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:989:1: ruleViewCall EOF
            {
             before(grammarAccess.getViewCallRule()); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall2042);
            ruleViewCall();
            _fsp--;

             after(grammarAccess.getViewCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall2049); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:996:1: ruleViewCall : ( ( rule__ViewCall__Group__0 ) ) ;
    public final void ruleViewCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1000:2: ( ( ( rule__ViewCall__Group__0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1001:1: ( ( rule__ViewCall__Group__0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1001:1: ( ( rule__ViewCall__Group__0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1002:1: ( rule__ViewCall__Group__0 )
            {
             before(grammarAccess.getViewCallAccess().getGroup()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1003:1: ( rule__ViewCall__Group__0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1003:2: rule__ViewCall__Group__0
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__0_in_ruleViewCall2075);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1016:1: ruleCellType : ( ( rule__CellType__Alternatives ) ) ;
    public final void ruleCellType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1020:1: ( ( ( rule__CellType__Alternatives ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1021:1: ( ( rule__CellType__Alternatives ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1021:1: ( ( rule__CellType__Alternatives ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1022:1: ( rule__CellType__Alternatives )
            {
             before(grammarAccess.getCellTypeAccess().getAlternatives()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1023:1: ( rule__CellType__Alternatives )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1023:2: rule__CellType__Alternatives
            {
            pushFollow(FOLLOW_rule__CellType__Alternatives_in_ruleCellType2112);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1034:1: rule__ModelElement__Alternatives : ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1038:1: ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 33:
            case 35:
                {
                alt1=1;
                }
                break;
            case 37:
                {
                alt1=2;
                }
                break;
            case 42:
            case 43:
            case 44:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1034:1: rule__ModelElement__Alternatives : ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1039:1: ( ruleType )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1039:1: ( ruleType )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1040:1: ruleType
                    {
                     before(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__ModelElement__Alternatives2147);
                    ruleType();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1045:6: ( ruleContentProvider )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1045:6: ( ruleContentProvider )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1046:1: ruleContentProvider
                    {
                     before(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleContentProvider_in_rule__ModelElement__Alternatives2164);
                    ruleContentProvider();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1051:6: ( ruleView )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1051:6: ( ruleView )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1052:1: ruleView
                    {
                     before(grammarAccess.getModelElementAccess().getViewParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleView_in_rule__ModelElement__Alternatives2181);
                    ruleView();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getViewParserRuleCall_2()); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1063:1: rule__Expression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1067:1: ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) )
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
                    new NoViableAltException("1063:1: rule__Expression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1068:1: ( ruleStringLiteral )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1068:1: ( ruleStringLiteral )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1069:1: ruleStringLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives2214);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1074:6: ( ruleStringFunction )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1074:6: ( ruleStringFunction )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1075:1: ruleStringFunction
                    {
                     before(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringFunction_in_rule__Expression__Alternatives2231);
                    ruleStringFunction();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1080:6: ( ruleCollectionLiteral )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1080:6: ( ruleCollectionLiteral )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1081:1: ruleCollectionLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_rule__Expression__Alternatives2248);
                    ruleCollectionLiteral();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1086:6: ( ruleCollectionFunction )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1086:6: ( ruleCollectionFunction )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1087:1: ruleCollectionFunction
                    {
                     before(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCollectionFunction_in_rule__Expression__Alternatives2265);
                    ruleCollectionFunction();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1092:6: ( ruleObjectReference )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1092:6: ( ruleObjectReference )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1093:1: ruleObjectReference
                    {
                     before(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__Expression__Alternatives2282);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1103:1: rule__ScalarExpression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) );
    public final void rule__ScalarExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1107:1: ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) )
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
                    new NoViableAltException("1103:1: rule__ScalarExpression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1108:1: ( ruleStringLiteral )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1108:1: ( ruleStringLiteral )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1109:1: ruleStringLiteral
                    {
                     before(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__ScalarExpression__Alternatives2314);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1114:6: ( ruleStringFunction )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1114:6: ( ruleStringFunction )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1115:1: ruleStringFunction
                    {
                     before(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringFunction_in_rule__ScalarExpression__Alternatives2331);
                    ruleStringFunction();
                    _fsp--;

                     after(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1120:6: ( ruleObjectReference )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1120:6: ( ruleObjectReference )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1121:1: ruleObjectReference
                    {
                     before(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__ScalarExpression__Alternatives2348);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1131:1: rule__CollectionExpression__Alternatives : ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );
    public final void rule__CollectionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1135:1: ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) )
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
                    new NoViableAltException("1131:1: rule__CollectionExpression__Alternatives : ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1136:1: ( ruleCollectionLiteral )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1136:1: ( ruleCollectionLiteral )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1137:1: ruleCollectionLiteral
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_rule__CollectionExpression__Alternatives2380);
                    ruleCollectionLiteral();
                    _fsp--;

                     after(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1142:6: ( ruleCollectionFunction )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1142:6: ( ruleCollectionFunction )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1143:1: ruleCollectionFunction
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCollectionFunction_in_rule__CollectionExpression__Alternatives2397);
                    ruleCollectionFunction();
                    _fsp--;

                     after(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1148:6: ( ruleObjectReference )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1148:6: ( ruleObjectReference )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1149:1: ruleObjectReference
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__CollectionExpression__Alternatives2414);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1159:1: rule__StringFunction__Alternatives : ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) );
    public final void rule__StringFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1163:1: ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) )
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
                    new NoViableAltException("1159:1: rule__StringFunction__Alternatives : ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1164:1: ( ( rule__StringFunction__Group_0__0 ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1164:1: ( ( rule__StringFunction__Group_0__0 ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1165:1: ( rule__StringFunction__Group_0__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_0()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1166:1: ( rule__StringFunction__Group_0__0 )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1166:2: rule__StringFunction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_0__0_in_rule__StringFunction__Alternatives2446);
                    rule__StringFunction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStringFunctionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1170:6: ( ( rule__StringFunction__Group_1__0 ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1170:6: ( ( rule__StringFunction__Group_1__0 ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1171:1: ( rule__StringFunction__Group_1__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_1()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1172:1: ( rule__StringFunction__Group_1__0 )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1172:2: rule__StringFunction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_1__0_in_rule__StringFunction__Alternatives2464);
                    rule__StringFunction__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStringFunctionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1176:6: ( ( rule__StringFunction__Group_2__0 ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1176:6: ( ( rule__StringFunction__Group_2__0 ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1177:1: ( rule__StringFunction__Group_2__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_2()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1178:1: ( rule__StringFunction__Group_2__0 )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1178:2: rule__StringFunction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_2__0_in_rule__StringFunction__Alternatives2482);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1187:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1191:1: ( ( ruleSimpleType ) | ( ruleEntity ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            else if ( (LA6_0==35) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1187:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1192:1: ( ruleSimpleType )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1192:1: ( ruleSimpleType )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1193:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives2515);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1198:6: ( ruleEntity )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1198:6: ( ruleEntity )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1199:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives2532);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1209:1: rule__ContentProvider__Alternatives_3 : ( ( 'returns' ) | ( ( rule__ContentProvider__ResolverAssignment_3_1 ) ) );
    public final void rule__ContentProvider__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1213:1: ( ( 'returns' ) | ( ( rule__ContentProvider__ResolverAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==58) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1209:1: rule__ContentProvider__Alternatives_3 : ( ( 'returns' ) | ( ( rule__ContentProvider__ResolverAssignment_3_1 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1214:1: ( 'returns' )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1214:1: ( 'returns' )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1215:1: 'returns'
                    {
                     before(grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0()); 
                    match(input,11,FOLLOW_11_in_rule__ContentProvider__Alternatives_32565); 
                     after(grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1222:6: ( ( rule__ContentProvider__ResolverAssignment_3_1 ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1222:6: ( ( rule__ContentProvider__ResolverAssignment_3_1 ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1223:1: ( rule__ContentProvider__ResolverAssignment_3_1 )
                    {
                     before(grammarAccess.getContentProviderAccess().getResolverAssignment_3_1()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1224:1: ( rule__ContentProvider__ResolverAssignment_3_1 )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1224:2: rule__ContentProvider__ResolverAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ContentProvider__ResolverAssignment_3_1_in_rule__ContentProvider__Alternatives_32584);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1233:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );
    public final void rule__ProviderConstruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1237:1: ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) )
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
                        new NoViableAltException("1233:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_STRING||LA8_0==18||LA8_0==20||(LA8_0>=22 && LA8_0<=23)||LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1233:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1238:1: ( ( rule__ProviderConstruction__Group_0__0 ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1238:1: ( ( rule__ProviderConstruction__Group_0__0 ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1239:1: ( rule__ProviderConstruction__Group_0__0 )
                    {
                     before(grammarAccess.getProviderConstructionAccess().getGroup_0()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1240:1: ( rule__ProviderConstruction__Group_0__0 )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1240:2: rule__ProviderConstruction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__0_in_rule__ProviderConstruction__Alternatives2617);
                    rule__ProviderConstruction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProviderConstructionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1244:6: ( ( rule__ProviderConstruction__Group_1__0 ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1244:6: ( ( rule__ProviderConstruction__Group_1__0 ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1245:1: ( rule__ProviderConstruction__Group_1__0 )
                    {
                     before(grammarAccess.getProviderConstructionAccess().getGroup_1()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1246:1: ( rule__ProviderConstruction__Group_1__0 )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1246:2: rule__ProviderConstruction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__0_in_rule__ProviderConstruction__Alternatives2635);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1255:1: rule__View__Alternatives : ( ( ruleSectionedView ) | ( ruleCustomView ) );
    public final void rule__View__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1259:1: ( ( ruleSectionedView ) | ( ruleCustomView ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=42 && LA9_0<=43)) ) {
                alt9=1;
            }
            else if ( (LA9_0==44) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1255:1: rule__View__Alternatives : ( ( ruleSectionedView ) | ( ruleCustomView ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1260:1: ( ruleSectionedView )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1260:1: ( ruleSectionedView )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1261:1: ruleSectionedView
                    {
                     before(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSectionedView_in_rule__View__Alternatives2668);
                    ruleSectionedView();
                    _fsp--;

                     after(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1266:6: ( ruleCustomView )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1266:6: ( ruleCustomView )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1267:1: ruleCustomView
                    {
                     before(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomView_in_rule__View__Alternatives2685);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1277:1: rule__SectionedView__Alternatives : ( ( ruleTableView ) | ( ruleDetailsView ) );
    public final void rule__SectionedView__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1281:1: ( ( ruleTableView ) | ( ruleDetailsView ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            else if ( (LA10_0==43) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1277:1: rule__SectionedView__Alternatives : ( ( ruleTableView ) | ( ruleDetailsView ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1282:1: ( ruleTableView )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1282:1: ( ruleTableView )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1283:1: ruleTableView
                    {
                     before(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTableView_in_rule__SectionedView__Alternatives2717);
                    ruleTableView();
                    _fsp--;

                     after(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1288:6: ( ruleDetailsView )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1288:6: ( ruleDetailsView )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1289:1: ruleDetailsView
                    {
                     before(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDetailsView_in_rule__SectionedView__Alternatives2734);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1299:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );
    public final void rule__ViewAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1303:1: ( ( ruleViewCall ) | ( ruleExternalOpen ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||LA11_1==17||LA11_1==28) ) {
                    alt11=2;
                }
                else if ( (LA11_1==18) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1299:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_STRING||LA11_0==18||LA11_0==20||LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1299:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1304:1: ( ruleViewCall )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1304:1: ( ruleViewCall )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1305:1: ruleViewCall
                    {
                     before(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleViewCall_in_rule__ViewAction__Alternatives2766);
                    ruleViewCall();
                    _fsp--;

                     after(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1310:6: ( ruleExternalOpen )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1310:6: ( ruleExternalOpen )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1311:1: ruleExternalOpen
                    {
                     before(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExternalOpen_in_rule__ViewAction__Alternatives2783);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1321:1: rule__CellType__Alternatives : ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) );
    public final void rule__CellType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1325:1: ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) )
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
                    new NoViableAltException("1321:1: rule__CellType__Alternatives : ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1326:1: ( ( 'Default' ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1326:1: ( ( 'Default' ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1327:1: ( 'Default' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1328:1: ( 'Default' )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1328:3: 'Default'
                    {
                    match(input,12,FOLLOW_12_in_rule__CellType__Alternatives2816); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1333:6: ( ( 'DefaultWithDisclosure' ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1333:6: ( ( 'DefaultWithDisclosure' ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1334:1: ( 'DefaultWithDisclosure' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1335:1: ( 'DefaultWithDisclosure' )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1335:3: 'DefaultWithDisclosure'
                    {
                    match(input,13,FOLLOW_13_in_rule__CellType__Alternatives2837); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1340:6: ( ( 'Value2' ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1340:6: ( ( 'Value2' ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1341:1: ( 'Value2' )
                    {
                     before(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1342:1: ( 'Value2' )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1342:3: 'Value2'
                    {
                    match(input,14,FOLLOW_14_in_rule__CellType__Alternatives2858); 

                    }

                     after(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1347:6: ( ( 'Double' ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1347:6: ( ( 'Double' ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1348:1: ( 'Double' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1349:1: ( 'Double' )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1349:3: 'Double'
                    {
                    match(input,15,FOLLOW_15_in_rule__CellType__Alternatives2879); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1354:6: ( ( 'Subtitle' ) )
                    {
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1354:6: ( ( 'Subtitle' ) )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1355:1: ( 'Subtitle' )
                    {
                     before(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4()); 
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1356:1: ( 'Subtitle' )
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1356:3: 'Subtitle'
                    {
                    match(input,16,FOLLOW_16_in_rule__CellType__Alternatives2900); 

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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1368:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1372:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1373:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02933);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02936);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1380:1: rule__Model__Group__0__Impl : ( ( rule__Model__ApplicationAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1384:1: ( ( ( rule__Model__ApplicationAssignment_0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1385:1: ( ( rule__Model__ApplicationAssignment_0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1385:1: ( ( rule__Model__ApplicationAssignment_0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1386:1: ( rule__Model__ApplicationAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getApplicationAssignment_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1387:1: ( rule__Model__ApplicationAssignment_0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1387:2: rule__Model__ApplicationAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ApplicationAssignment_0_in_rule__Model__Group__0__Impl2963);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1397:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1401:1: ( rule__Model__Group__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1402:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12993);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1408:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1412:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1413:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1413:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1414:1: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1415:1: ( rule__Model__ElementsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33||LA13_0==35||LA13_0==37||(LA13_0>=42 && LA13_0<=44)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1415:2: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl3020);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1429:1: rule__TypeDescription__Group__0 : rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1 ;
    public final void rule__TypeDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1433:1: ( rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1434:2: rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__0__Impl_in_rule__TypeDescription__Group__03055);
            rule__TypeDescription__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeDescription__Group__1_in_rule__TypeDescription__Group__03058);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1441:1: rule__TypeDescription__Group__0__Impl : ( ( rule__TypeDescription__TypeAssignment_0 ) ) ;
    public final void rule__TypeDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1445:1: ( ( ( rule__TypeDescription__TypeAssignment_0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1446:1: ( ( rule__TypeDescription__TypeAssignment_0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1446:1: ( ( rule__TypeDescription__TypeAssignment_0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1447:1: ( rule__TypeDescription__TypeAssignment_0 )
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeAssignment_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1448:1: ( rule__TypeDescription__TypeAssignment_0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1448:2: rule__TypeDescription__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeDescription__TypeAssignment_0_in_rule__TypeDescription__Group__0__Impl3085);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1458:1: rule__TypeDescription__Group__1 : rule__TypeDescription__Group__1__Impl ;
    public final void rule__TypeDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1462:1: ( rule__TypeDescription__Group__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1463:2: rule__TypeDescription__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__1__Impl_in_rule__TypeDescription__Group__13115);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1469:1: rule__TypeDescription__Group__1__Impl : ( ( rule__TypeDescription__ManyAssignment_1 )? ) ;
    public final void rule__TypeDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1473:1: ( ( ( rule__TypeDescription__ManyAssignment_1 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1474:1: ( ( rule__TypeDescription__ManyAssignment_1 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1474:1: ( ( rule__TypeDescription__ManyAssignment_1 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1475:1: ( rule__TypeDescription__ManyAssignment_1 )?
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1476:1: ( rule__TypeDescription__ManyAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==56) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1476:2: rule__TypeDescription__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeDescription__ManyAssignment_1_in_rule__TypeDescription__Group__1__Impl3142);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1490:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1494:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1495:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03177);
            rule__Parameter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03180);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1502:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__DescriptionAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1506:1: ( ( ( rule__Parameter__DescriptionAssignment_0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1507:1: ( ( rule__Parameter__DescriptionAssignment_0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1507:1: ( ( rule__Parameter__DescriptionAssignment_0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1508:1: ( rule__Parameter__DescriptionAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getDescriptionAssignment_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1509:1: ( rule__Parameter__DescriptionAssignment_0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1509:2: rule__Parameter__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__DescriptionAssignment_0_in_rule__Parameter__Group__0__Impl3207);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1519:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1523:1: ( rule__Parameter__Group__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1524:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13237);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1530:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1534:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1535:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1535:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1536:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1537:1: ( rule__Parameter__NameAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1537:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3264);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1551:1: rule__ObjectReference__Group__0 : rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1 ;
    public final void rule__ObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1555:1: ( rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1556:2: rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__0__Impl_in_rule__ObjectReference__Group__03298);
            rule__ObjectReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ObjectReference__Group__1_in_rule__ObjectReference__Group__03301);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1563:1: rule__ObjectReference__Group__0__Impl : ( ( rule__ObjectReference__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1567:1: ( ( ( rule__ObjectReference__ObjectAssignment_0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1568:1: ( ( rule__ObjectReference__ObjectAssignment_0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1568:1: ( ( rule__ObjectReference__ObjectAssignment_0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1569:1: ( rule__ObjectReference__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectAssignment_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1570:1: ( rule__ObjectReference__ObjectAssignment_0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1570:2: rule__ObjectReference__ObjectAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectReference__ObjectAssignment_0_in_rule__ObjectReference__Group__0__Impl3328);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1580:1: rule__ObjectReference__Group__1 : rule__ObjectReference__Group__1__Impl ;
    public final void rule__ObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1584:1: ( rule__ObjectReference__Group__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1585:2: rule__ObjectReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__1__Impl_in_rule__ObjectReference__Group__13358);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1591:1: rule__ObjectReference__Group__1__Impl : ( ( rule__ObjectReference__TailAssignment_1 )? ) ;
    public final void rule__ObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1595:1: ( ( ( rule__ObjectReference__TailAssignment_1 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1596:1: ( ( rule__ObjectReference__TailAssignment_1 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1596:1: ( ( rule__ObjectReference__TailAssignment_1 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1597:1: ( rule__ObjectReference__TailAssignment_1 )?
            {
             before(grammarAccess.getObjectReferenceAccess().getTailAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1598:1: ( rule__ObjectReference__TailAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1598:2: rule__ObjectReference__TailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ObjectReference__TailAssignment_1_in_rule__ObjectReference__Group__1__Impl3385);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1612:1: rule__NestedObjectReference__Group__0 : rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1 ;
    public final void rule__NestedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1616:1: ( rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1617:2: rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__0__Impl_in_rule__NestedObjectReference__Group__03420);
            rule__NestedObjectReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NestedObjectReference__Group__1_in_rule__NestedObjectReference__Group__03423);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1624:1: rule__NestedObjectReference__Group__0__Impl : ( '.' ) ;
    public final void rule__NestedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1628:1: ( ( '.' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1629:1: ( '.' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1629:1: ( '.' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1630:1: '.'
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__NestedObjectReference__Group__0__Impl3451); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1643:1: rule__NestedObjectReference__Group__1 : rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2 ;
    public final void rule__NestedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1647:1: ( rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1648:2: rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__1__Impl_in_rule__NestedObjectReference__Group__13482);
            rule__NestedObjectReference__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NestedObjectReference__Group__2_in_rule__NestedObjectReference__Group__13485);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1655:1: rule__NestedObjectReference__Group__1__Impl : ( ( rule__NestedObjectReference__ObjectAssignment_1 ) ) ;
    public final void rule__NestedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1659:1: ( ( ( rule__NestedObjectReference__ObjectAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1660:1: ( ( rule__NestedObjectReference__ObjectAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1660:1: ( ( rule__NestedObjectReference__ObjectAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1661:1: ( rule__NestedObjectReference__ObjectAssignment_1 )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1662:1: ( rule__NestedObjectReference__ObjectAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1662:2: rule__NestedObjectReference__ObjectAssignment_1
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__ObjectAssignment_1_in_rule__NestedObjectReference__Group__1__Impl3512);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1672:1: rule__NestedObjectReference__Group__2 : rule__NestedObjectReference__Group__2__Impl ;
    public final void rule__NestedObjectReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1676:1: ( rule__NestedObjectReference__Group__2__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1677:2: rule__NestedObjectReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__2__Impl_in_rule__NestedObjectReference__Group__23542);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1683:1: rule__NestedObjectReference__Group__2__Impl : ( ( rule__NestedObjectReference__TailAssignment_2 )? ) ;
    public final void rule__NestedObjectReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1687:1: ( ( ( rule__NestedObjectReference__TailAssignment_2 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1688:1: ( ( rule__NestedObjectReference__TailAssignment_2 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1688:1: ( ( rule__NestedObjectReference__TailAssignment_2 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1689:1: ( rule__NestedObjectReference__TailAssignment_2 )?
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getTailAssignment_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1690:1: ( rule__NestedObjectReference__TailAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1690:2: rule__NestedObjectReference__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__NestedObjectReference__TailAssignment_2_in_rule__NestedObjectReference__Group__2__Impl3569);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1706:1: rule__StringFunction__Group_0__0 : rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1 ;
    public final void rule__StringFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1710:1: ( rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1711:2: rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__0__Impl_in_rule__StringFunction__Group_0__03606);
            rule__StringFunction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__1_in_rule__StringFunction__Group_0__03609);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1718:1: rule__StringFunction__Group_0__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1722:1: ( ( () ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1723:1: ( () )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1723:1: ( () )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1724:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1725:1: ()
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1727:1: 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1737:1: rule__StringFunction__Group_0__1 : rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2 ;
    public final void rule__StringFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1741:1: ( rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1742:2: rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__1__Impl_in_rule__StringFunction__Group_0__13667);
            rule__StringFunction__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__2_in_rule__StringFunction__Group_0__13670);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1749:1: rule__StringFunction__Group_0__1__Impl : ( '(' ) ;
    public final void rule__StringFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1753:1: ( ( '(' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1754:1: ( '(' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1754:1: ( '(' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1755:1: '('
            {
             before(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__StringFunction__Group_0__1__Impl3698); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1768:1: rule__StringFunction__Group_0__2 : rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3 ;
    public final void rule__StringFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1772:1: ( rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1773:2: rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__2__Impl_in_rule__StringFunction__Group_0__23729);
            rule__StringFunction__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__3_in_rule__StringFunction__Group_0__23732);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1780:1: rule__StringFunction__Group_0__2__Impl : ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) ) ;
    public final void rule__StringFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1784:1: ( ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1785:1: ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1785:1: ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1786:1: ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1786:1: ( ( rule__StringFunction__ValuesAssignment_0_2 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1787:1: ( rule__StringFunction__ValuesAssignment_0_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1788:1: ( rule__StringFunction__ValuesAssignment_0_2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1788:2: rule__StringFunction__ValuesAssignment_0_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3761);
            rule__StringFunction__ValuesAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 

            }

            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1791:1: ( ( rule__StringFunction__ValuesAssignment_0_2 )* )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1792:1: ( rule__StringFunction__ValuesAssignment_0_2 )*
            {
             before(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1793:1: ( rule__StringFunction__ValuesAssignment_0_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||LA17_0==18||LA17_0==20||LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1793:2: rule__StringFunction__ValuesAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3773);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1804:1: rule__StringFunction__Group_0__3 : rule__StringFunction__Group_0__3__Impl ;
    public final void rule__StringFunction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1808:1: ( rule__StringFunction__Group_0__3__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1809:2: rule__StringFunction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__3__Impl_in_rule__StringFunction__Group_0__33806);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1815:1: rule__StringFunction__Group_0__3__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1819:1: ( ( ')' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1820:1: ( ')' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1820:1: ( ')' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1821:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3()); 
            match(input,19,FOLLOW_19_in_rule__StringFunction__Group_0__3__Impl3834); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1842:1: rule__StringFunction__Group_1__0 : rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1 ;
    public final void rule__StringFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1846:1: ( rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1847:2: rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__0__Impl_in_rule__StringFunction__Group_1__03873);
            rule__StringFunction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__1_in_rule__StringFunction__Group_1__03876);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1854:1: rule__StringFunction__Group_1__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1858:1: ( ( () ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1859:1: ( () )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1859:1: ( () )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1860:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1861:1: ()
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1863:1: 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1873:1: rule__StringFunction__Group_1__1 : rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2 ;
    public final void rule__StringFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1877:1: ( rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1878:2: rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__1__Impl_in_rule__StringFunction__Group_1__13934);
            rule__StringFunction__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__2_in_rule__StringFunction__Group_1__13937);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1885:1: rule__StringFunction__Group_1__1__Impl : ( 'replace(' ) ;
    public final void rule__StringFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1889:1: ( ( 'replace(' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1890:1: ( 'replace(' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1890:1: ( 'replace(' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1891:1: 'replace('
            {
             before(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1()); 
            match(input,20,FOLLOW_20_in_rule__StringFunction__Group_1__1__Impl3965); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1904:1: rule__StringFunction__Group_1__2 : rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3 ;
    public final void rule__StringFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1908:1: ( rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1909:2: rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__2__Impl_in_rule__StringFunction__Group_1__23996);
            rule__StringFunction__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__3_in_rule__StringFunction__Group_1__23999);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1916:1: rule__StringFunction__Group_1__2__Impl : ( ( rule__StringFunction__ValueAssignment_1_2 ) ) ;
    public final void rule__StringFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1920:1: ( ( ( rule__StringFunction__ValueAssignment_1_2 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1921:1: ( ( rule__StringFunction__ValueAssignment_1_2 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1921:1: ( ( rule__StringFunction__ValueAssignment_1_2 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1922:1: ( rule__StringFunction__ValueAssignment_1_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValueAssignment_1_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1923:1: ( rule__StringFunction__ValueAssignment_1_2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1923:2: rule__StringFunction__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValueAssignment_1_2_in_rule__StringFunction__Group_1__2__Impl4026);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1933:1: rule__StringFunction__Group_1__3 : rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4 ;
    public final void rule__StringFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1937:1: ( rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1938:2: rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__3__Impl_in_rule__StringFunction__Group_1__34056);
            rule__StringFunction__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__4_in_rule__StringFunction__Group_1__34059);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1945:1: rule__StringFunction__Group_1__3__Impl : ( ',' ) ;
    public final void rule__StringFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1949:1: ( ( ',' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1950:1: ( ',' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1950:1: ( ',' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1951:1: ','
            {
             before(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3()); 
            match(input,21,FOLLOW_21_in_rule__StringFunction__Group_1__3__Impl4087); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1964:1: rule__StringFunction__Group_1__4 : rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5 ;
    public final void rule__StringFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1968:1: ( rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1969:2: rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__4__Impl_in_rule__StringFunction__Group_1__44118);
            rule__StringFunction__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__5_in_rule__StringFunction__Group_1__44121);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1976:1: rule__StringFunction__Group_1__4__Impl : ( ( rule__StringFunction__MatchAssignment_1_4 ) ) ;
    public final void rule__StringFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1980:1: ( ( ( rule__StringFunction__MatchAssignment_1_4 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1981:1: ( ( rule__StringFunction__MatchAssignment_1_4 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1981:1: ( ( rule__StringFunction__MatchAssignment_1_4 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1982:1: ( rule__StringFunction__MatchAssignment_1_4 )
            {
             before(grammarAccess.getStringFunctionAccess().getMatchAssignment_1_4()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1983:1: ( rule__StringFunction__MatchAssignment_1_4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1983:2: rule__StringFunction__MatchAssignment_1_4
            {
            pushFollow(FOLLOW_rule__StringFunction__MatchAssignment_1_4_in_rule__StringFunction__Group_1__4__Impl4148);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1993:1: rule__StringFunction__Group_1__5 : rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6 ;
    public final void rule__StringFunction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1997:1: ( rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:1998:2: rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__5__Impl_in_rule__StringFunction__Group_1__54178);
            rule__StringFunction__Group_1__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__6_in_rule__StringFunction__Group_1__54181);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2005:1: rule__StringFunction__Group_1__5__Impl : ( ',' ) ;
    public final void rule__StringFunction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2009:1: ( ( ',' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2010:1: ( ',' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2010:1: ( ',' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2011:1: ','
            {
             before(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5()); 
            match(input,21,FOLLOW_21_in_rule__StringFunction__Group_1__5__Impl4209); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2024:1: rule__StringFunction__Group_1__6 : rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7 ;
    public final void rule__StringFunction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2028:1: ( rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2029:2: rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__6__Impl_in_rule__StringFunction__Group_1__64240);
            rule__StringFunction__Group_1__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__7_in_rule__StringFunction__Group_1__64243);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2036:1: rule__StringFunction__Group_1__6__Impl : ( ( rule__StringFunction__ReplacementAssignment_1_6 ) ) ;
    public final void rule__StringFunction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2040:1: ( ( ( rule__StringFunction__ReplacementAssignment_1_6 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2041:1: ( ( rule__StringFunction__ReplacementAssignment_1_6 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2041:1: ( ( rule__StringFunction__ReplacementAssignment_1_6 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2042:1: ( rule__StringFunction__ReplacementAssignment_1_6 )
            {
             before(grammarAccess.getStringFunctionAccess().getReplacementAssignment_1_6()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2043:1: ( rule__StringFunction__ReplacementAssignment_1_6 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2043:2: rule__StringFunction__ReplacementAssignment_1_6
            {
            pushFollow(FOLLOW_rule__StringFunction__ReplacementAssignment_1_6_in_rule__StringFunction__Group_1__6__Impl4270);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2053:1: rule__StringFunction__Group_1__7 : rule__StringFunction__Group_1__7__Impl ;
    public final void rule__StringFunction__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2057:1: ( rule__StringFunction__Group_1__7__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2058:2: rule__StringFunction__Group_1__7__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__7__Impl_in_rule__StringFunction__Group_1__74300);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2064:1: rule__StringFunction__Group_1__7__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2068:1: ( ( ')' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2069:1: ( ')' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2069:1: ( ')' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2070:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7()); 
            match(input,19,FOLLOW_19_in_rule__StringFunction__Group_1__7__Impl4328); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2099:1: rule__StringFunction__Group_2__0 : rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1 ;
    public final void rule__StringFunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2103:1: ( rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2104:2: rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__0__Impl_in_rule__StringFunction__Group_2__04375);
            rule__StringFunction__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__1_in_rule__StringFunction__Group_2__04378);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2111:1: rule__StringFunction__Group_2__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2115:1: ( ( () ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2116:1: ( () )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2116:1: ( () )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2117:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2118:1: ()
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2120:1: 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2130:1: rule__StringFunction__Group_2__1 : rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2 ;
    public final void rule__StringFunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2134:1: ( rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2135:2: rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__1__Impl_in_rule__StringFunction__Group_2__14436);
            rule__StringFunction__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__2_in_rule__StringFunction__Group_2__14439);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2142:1: rule__StringFunction__Group_2__1__Impl : ( 'urlconform(' ) ;
    public final void rule__StringFunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2146:1: ( ( 'urlconform(' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2147:1: ( 'urlconform(' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2147:1: ( 'urlconform(' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2148:1: 'urlconform('
            {
             before(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__StringFunction__Group_2__1__Impl4467); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2161:1: rule__StringFunction__Group_2__2 : rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3 ;
    public final void rule__StringFunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2165:1: ( rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2166:2: rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__2__Impl_in_rule__StringFunction__Group_2__24498);
            rule__StringFunction__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__3_in_rule__StringFunction__Group_2__24501);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2173:1: rule__StringFunction__Group_2__2__Impl : ( ( rule__StringFunction__ValueAssignment_2_2 ) ) ;
    public final void rule__StringFunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2177:1: ( ( ( rule__StringFunction__ValueAssignment_2_2 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2178:1: ( ( rule__StringFunction__ValueAssignment_2_2 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2178:1: ( ( rule__StringFunction__ValueAssignment_2_2 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2179:1: ( rule__StringFunction__ValueAssignment_2_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValueAssignment_2_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2180:1: ( rule__StringFunction__ValueAssignment_2_2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2180:2: rule__StringFunction__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValueAssignment_2_2_in_rule__StringFunction__Group_2__2__Impl4528);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2190:1: rule__StringFunction__Group_2__3 : rule__StringFunction__Group_2__3__Impl ;
    public final void rule__StringFunction__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2194:1: ( rule__StringFunction__Group_2__3__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2195:2: rule__StringFunction__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__3__Impl_in_rule__StringFunction__Group_2__34558);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2201:1: rule__StringFunction__Group_2__3__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2205:1: ( ( ')' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2206:1: ( ')' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2206:1: ( ')' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2207:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3()); 
            match(input,19,FOLLOW_19_in_rule__StringFunction__Group_2__3__Impl4586); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2228:1: rule__CollectionLiteral__Group__0 : rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1 ;
    public final void rule__CollectionLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2232:1: ( rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2233:2: rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__0__Impl_in_rule__CollectionLiteral__Group__04625);
            rule__CollectionLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__1_in_rule__CollectionLiteral__Group__04628);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2240:1: rule__CollectionLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__CollectionLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2244:1: ( ( '[' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2245:1: ( '[' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2245:1: ( '[' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2246:1: '['
            {
             before(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__CollectionLiteral__Group__0__Impl4656); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2259:1: rule__CollectionLiteral__Group__1 : rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2 ;
    public final void rule__CollectionLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2263:1: ( rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2264:2: rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__1__Impl_in_rule__CollectionLiteral__Group__14687);
            rule__CollectionLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__2_in_rule__CollectionLiteral__Group__14690);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2271:1: rule__CollectionLiteral__Group__1__Impl : ( ( rule__CollectionLiteral__ItemsAssignment_1 ) ) ;
    public final void rule__CollectionLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2275:1: ( ( ( rule__CollectionLiteral__ItemsAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2276:1: ( ( rule__CollectionLiteral__ItemsAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2276:1: ( ( rule__CollectionLiteral__ItemsAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2277:1: ( rule__CollectionLiteral__ItemsAssignment_1 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2278:1: ( rule__CollectionLiteral__ItemsAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2278:2: rule__CollectionLiteral__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__ItemsAssignment_1_in_rule__CollectionLiteral__Group__1__Impl4717);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2288:1: rule__CollectionLiteral__Group__2 : rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3 ;
    public final void rule__CollectionLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2292:1: ( rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2293:2: rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__2__Impl_in_rule__CollectionLiteral__Group__24747);
            rule__CollectionLiteral__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__3_in_rule__CollectionLiteral__Group__24750);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2300:1: rule__CollectionLiteral__Group__2__Impl : ( ( rule__CollectionLiteral__Group_2__0 )* ) ;
    public final void rule__CollectionLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2304:1: ( ( ( rule__CollectionLiteral__Group_2__0 )* ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2305:1: ( ( rule__CollectionLiteral__Group_2__0 )* )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2305:1: ( ( rule__CollectionLiteral__Group_2__0 )* )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2306:1: ( rule__CollectionLiteral__Group_2__0 )*
            {
             before(grammarAccess.getCollectionLiteralAccess().getGroup_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2307:1: ( rule__CollectionLiteral__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2307:2: rule__CollectionLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__0_in_rule__CollectionLiteral__Group__2__Impl4777);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2317:1: rule__CollectionLiteral__Group__3 : rule__CollectionLiteral__Group__3__Impl ;
    public final void rule__CollectionLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2321:1: ( rule__CollectionLiteral__Group__3__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2322:2: rule__CollectionLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__3__Impl_in_rule__CollectionLiteral__Group__34808);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2328:1: rule__CollectionLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__CollectionLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2332:1: ( ( ']' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2333:1: ( ']' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2333:1: ( ']' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2334:1: ']'
            {
             before(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__CollectionLiteral__Group__3__Impl4836); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2355:1: rule__CollectionLiteral__Group_2__0 : rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1 ;
    public final void rule__CollectionLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2359:1: ( rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2360:2: rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__0__Impl_in_rule__CollectionLiteral__Group_2__04875);
            rule__CollectionLiteral__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__1_in_rule__CollectionLiteral__Group_2__04878);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2367:1: rule__CollectionLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__CollectionLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2371:1: ( ( ',' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2372:1: ( ',' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2372:1: ( ',' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2373:1: ','
            {
             before(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__CollectionLiteral__Group_2__0__Impl4906); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2386:1: rule__CollectionLiteral__Group_2__1 : rule__CollectionLiteral__Group_2__1__Impl ;
    public final void rule__CollectionLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2390:1: ( rule__CollectionLiteral__Group_2__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2391:2: rule__CollectionLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__1__Impl_in_rule__CollectionLiteral__Group_2__14937);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2397:1: rule__CollectionLiteral__Group_2__1__Impl : ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) ) ;
    public final void rule__CollectionLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2401:1: ( ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2402:1: ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2402:1: ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2403:1: ( rule__CollectionLiteral__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_2_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2404:1: ( rule__CollectionLiteral__ItemsAssignment_2_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2404:2: rule__CollectionLiteral__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__ItemsAssignment_2_1_in_rule__CollectionLiteral__Group_2__1__Impl4964);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2418:1: rule__CollectionFunction__Group__0 : rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1 ;
    public final void rule__CollectionFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2422:1: ( rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2423:2: rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__0__Impl_in_rule__CollectionFunction__Group__04998);
            rule__CollectionFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__1_in_rule__CollectionFunction__Group__05001);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2430:1: rule__CollectionFunction__Group__0__Impl : ( () ) ;
    public final void rule__CollectionFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2434:1: ( ( () ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2435:1: ( () )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2435:1: ( () )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2436:1: ()
            {
             before(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2437:1: ()
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2439:1: 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2449:1: rule__CollectionFunction__Group__1 : rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2 ;
    public final void rule__CollectionFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2453:1: ( rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2454:2: rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__1__Impl_in_rule__CollectionFunction__Group__15059);
            rule__CollectionFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__2_in_rule__CollectionFunction__Group__15062);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2461:1: rule__CollectionFunction__Group__1__Impl : ( 'split(' ) ;
    public final void rule__CollectionFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2465:1: ( ( 'split(' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2466:1: ( 'split(' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2466:1: ( 'split(' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2467:1: 'split('
            {
             before(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__CollectionFunction__Group__1__Impl5090); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2480:1: rule__CollectionFunction__Group__2 : rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3 ;
    public final void rule__CollectionFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2484:1: ( rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2485:2: rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__2__Impl_in_rule__CollectionFunction__Group__25121);
            rule__CollectionFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__3_in_rule__CollectionFunction__Group__25124);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2492:1: rule__CollectionFunction__Group__2__Impl : ( ( rule__CollectionFunction__ValueAssignment_2 ) ) ;
    public final void rule__CollectionFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2496:1: ( ( ( rule__CollectionFunction__ValueAssignment_2 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2497:1: ( ( rule__CollectionFunction__ValueAssignment_2 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2497:1: ( ( rule__CollectionFunction__ValueAssignment_2 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2498:1: ( rule__CollectionFunction__ValueAssignment_2 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getValueAssignment_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2499:1: ( rule__CollectionFunction__ValueAssignment_2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2499:2: rule__CollectionFunction__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionFunction__ValueAssignment_2_in_rule__CollectionFunction__Group__2__Impl5151);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2509:1: rule__CollectionFunction__Group__3 : rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4 ;
    public final void rule__CollectionFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2513:1: ( rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2514:2: rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__3__Impl_in_rule__CollectionFunction__Group__35181);
            rule__CollectionFunction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__4_in_rule__CollectionFunction__Group__35184);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2521:1: rule__CollectionFunction__Group__3__Impl : ( ',' ) ;
    public final void rule__CollectionFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2525:1: ( ( ',' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2526:1: ( ',' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2526:1: ( ',' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2527:1: ','
            {
             before(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__CollectionFunction__Group__3__Impl5212); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2540:1: rule__CollectionFunction__Group__4 : rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5 ;
    public final void rule__CollectionFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2544:1: ( rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2545:2: rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__4__Impl_in_rule__CollectionFunction__Group__45243);
            rule__CollectionFunction__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__5_in_rule__CollectionFunction__Group__45246);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2552:1: rule__CollectionFunction__Group__4__Impl : ( ( rule__CollectionFunction__DelimiterAssignment_4 ) ) ;
    public final void rule__CollectionFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2556:1: ( ( ( rule__CollectionFunction__DelimiterAssignment_4 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2557:1: ( ( rule__CollectionFunction__DelimiterAssignment_4 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2557:1: ( ( rule__CollectionFunction__DelimiterAssignment_4 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2558:1: ( rule__CollectionFunction__DelimiterAssignment_4 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getDelimiterAssignment_4()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2559:1: ( rule__CollectionFunction__DelimiterAssignment_4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2559:2: rule__CollectionFunction__DelimiterAssignment_4
            {
            pushFollow(FOLLOW_rule__CollectionFunction__DelimiterAssignment_4_in_rule__CollectionFunction__Group__4__Impl5273);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2569:1: rule__CollectionFunction__Group__5 : rule__CollectionFunction__Group__5__Impl ;
    public final void rule__CollectionFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2573:1: ( rule__CollectionFunction__Group__5__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2574:2: rule__CollectionFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__5__Impl_in_rule__CollectionFunction__Group__55303);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2580:1: rule__CollectionFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__CollectionFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2584:1: ( ( ')' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2585:1: ( ')' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2585:1: ( ')' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2586:1: ')'
            {
             before(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__CollectionFunction__Group__5__Impl5331); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2611:1: rule__TabBarApplication__Group__0 : rule__TabBarApplication__Group__0__Impl rule__TabBarApplication__Group__1 ;
    public final void rule__TabBarApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2615:1: ( rule__TabBarApplication__Group__0__Impl rule__TabBarApplication__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2616:2: rule__TabBarApplication__Group__0__Impl rule__TabBarApplication__Group__1
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__0__Impl_in_rule__TabBarApplication__Group__05374);
            rule__TabBarApplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__1_in_rule__TabBarApplication__Group__05377);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2623:1: rule__TabBarApplication__Group__0__Impl : ( 'tabbarApplication' ) ;
    public final void rule__TabBarApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2627:1: ( ( 'tabbarApplication' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2628:1: ( 'tabbarApplication' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2628:1: ( 'tabbarApplication' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2629:1: 'tabbarApplication'
            {
             before(grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__TabBarApplication__Group__0__Impl5405); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2642:1: rule__TabBarApplication__Group__1 : rule__TabBarApplication__Group__1__Impl rule__TabBarApplication__Group__2 ;
    public final void rule__TabBarApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2646:1: ( rule__TabBarApplication__Group__1__Impl rule__TabBarApplication__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2647:2: rule__TabBarApplication__Group__1__Impl rule__TabBarApplication__Group__2
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__1__Impl_in_rule__TabBarApplication__Group__15436);
            rule__TabBarApplication__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__2_in_rule__TabBarApplication__Group__15439);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2654:1: rule__TabBarApplication__Group__1__Impl : ( ( rule__TabBarApplication__NameAssignment_1 ) ) ;
    public final void rule__TabBarApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2658:1: ( ( ( rule__TabBarApplication__NameAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2659:1: ( ( rule__TabBarApplication__NameAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2659:1: ( ( rule__TabBarApplication__NameAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2660:1: ( rule__TabBarApplication__NameAssignment_1 )
            {
             before(grammarAccess.getTabBarApplicationAccess().getNameAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2661:1: ( rule__TabBarApplication__NameAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2661:2: rule__TabBarApplication__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TabBarApplication__NameAssignment_1_in_rule__TabBarApplication__Group__1__Impl5466);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2671:1: rule__TabBarApplication__Group__2 : rule__TabBarApplication__Group__2__Impl rule__TabBarApplication__Group__3 ;
    public final void rule__TabBarApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2675:1: ( rule__TabBarApplication__Group__2__Impl rule__TabBarApplication__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2676:2: rule__TabBarApplication__Group__2__Impl rule__TabBarApplication__Group__3
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__2__Impl_in_rule__TabBarApplication__Group__25496);
            rule__TabBarApplication__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__3_in_rule__TabBarApplication__Group__25499);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2683:1: rule__TabBarApplication__Group__2__Impl : ( '{' ) ;
    public final void rule__TabBarApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2687:1: ( ( '{' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2688:1: ( '{' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2688:1: ( '{' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2689:1: '{'
            {
             before(grammarAccess.getTabBarApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__TabBarApplication__Group__2__Impl5527); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2702:1: rule__TabBarApplication__Group__3 : rule__TabBarApplication__Group__3__Impl rule__TabBarApplication__Group__4 ;
    public final void rule__TabBarApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2706:1: ( rule__TabBarApplication__Group__3__Impl rule__TabBarApplication__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2707:2: rule__TabBarApplication__Group__3__Impl rule__TabBarApplication__Group__4
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__3__Impl_in_rule__TabBarApplication__Group__35558);
            rule__TabBarApplication__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__4_in_rule__TabBarApplication__Group__35561);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2714:1: rule__TabBarApplication__Group__3__Impl : ( ( rule__TabBarApplication__ButtonsAssignment_3 )* ) ;
    public final void rule__TabBarApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2718:1: ( ( ( rule__TabBarApplication__ButtonsAssignment_3 )* ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2719:1: ( ( rule__TabBarApplication__ButtonsAssignment_3 )* )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2719:1: ( ( rule__TabBarApplication__ButtonsAssignment_3 )* )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2720:1: ( rule__TabBarApplication__ButtonsAssignment_3 )*
            {
             before(grammarAccess.getTabBarApplicationAccess().getButtonsAssignment_3()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2721:1: ( rule__TabBarApplication__ButtonsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2721:2: rule__TabBarApplication__ButtonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__TabBarApplication__ButtonsAssignment_3_in_rule__TabBarApplication__Group__3__Impl5588);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2731:1: rule__TabBarApplication__Group__4 : rule__TabBarApplication__Group__4__Impl ;
    public final void rule__TabBarApplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2735:1: ( rule__TabBarApplication__Group__4__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2736:2: rule__TabBarApplication__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__4__Impl_in_rule__TabBarApplication__Group__45619);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2742:1: rule__TabBarApplication__Group__4__Impl : ( '}' ) ;
    public final void rule__TabBarApplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2746:1: ( ( '}' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2747:1: ( '}' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2747:1: ( '}' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2748:1: '}'
            {
             before(grammarAccess.getTabBarApplicationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__TabBarApplication__Group__4__Impl5647); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2771:1: rule__TabbarButton__Group__0 : rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1 ;
    public final void rule__TabbarButton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2775:1: ( rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2776:2: rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__0__Impl_in_rule__TabbarButton__Group__05688);
            rule__TabbarButton__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__1_in_rule__TabbarButton__Group__05691);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2783:1: rule__TabbarButton__Group__0__Impl : ( 'button' ) ;
    public final void rule__TabbarButton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2787:1: ( ( 'button' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2788:1: ( 'button' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2788:1: ( 'button' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2789:1: 'button'
            {
             before(grammarAccess.getTabbarButtonAccess().getButtonKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__TabbarButton__Group__0__Impl5719); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2802:1: rule__TabbarButton__Group__1 : rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2 ;
    public final void rule__TabbarButton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2806:1: ( rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2807:2: rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__1__Impl_in_rule__TabbarButton__Group__15750);
            rule__TabbarButton__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__2_in_rule__TabbarButton__Group__15753);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2814:1: rule__TabbarButton__Group__1__Impl : ( '{' ) ;
    public final void rule__TabbarButton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2818:1: ( ( '{' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2819:1: ( '{' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2819:1: ( '{' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2820:1: '{'
            {
             before(grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__TabbarButton__Group__1__Impl5781); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2833:1: rule__TabbarButton__Group__2 : rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3 ;
    public final void rule__TabbarButton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2837:1: ( rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2838:2: rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__2__Impl_in_rule__TabbarButton__Group__25812);
            rule__TabbarButton__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__3_in_rule__TabbarButton__Group__25815);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2845:1: rule__TabbarButton__Group__2__Impl : ( 'title=' ) ;
    public final void rule__TabbarButton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2849:1: ( ( 'title=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2850:1: ( 'title=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2850:1: ( 'title=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2851:1: 'title='
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__TabbarButton__Group__2__Impl5843); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2864:1: rule__TabbarButton__Group__3 : rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4 ;
    public final void rule__TabbarButton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2868:1: ( rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2869:2: rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__3__Impl_in_rule__TabbarButton__Group__35874);
            rule__TabbarButton__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__4_in_rule__TabbarButton__Group__35877);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2876:1: rule__TabbarButton__Group__3__Impl : ( ( rule__TabbarButton__TitleAssignment_3 ) ) ;
    public final void rule__TabbarButton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2880:1: ( ( ( rule__TabbarButton__TitleAssignment_3 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2881:1: ( ( rule__TabbarButton__TitleAssignment_3 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2881:1: ( ( rule__TabbarButton__TitleAssignment_3 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2882:1: ( rule__TabbarButton__TitleAssignment_3 )
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleAssignment_3()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2883:1: ( rule__TabbarButton__TitleAssignment_3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2883:2: rule__TabbarButton__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__TabbarButton__TitleAssignment_3_in_rule__TabbarButton__Group__3__Impl5904);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2893:1: rule__TabbarButton__Group__4 : rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5 ;
    public final void rule__TabbarButton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2897:1: ( rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2898:2: rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__4__Impl_in_rule__TabbarButton__Group__45934);
            rule__TabbarButton__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__5_in_rule__TabbarButton__Group__45937);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2905:1: rule__TabbarButton__Group__4__Impl : ( 'icon=' ) ;
    public final void rule__TabbarButton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2909:1: ( ( 'icon=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2910:1: ( 'icon=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2910:1: ( 'icon=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2911:1: 'icon='
            {
             before(grammarAccess.getTabbarButtonAccess().getIconKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__TabbarButton__Group__4__Impl5965); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2924:1: rule__TabbarButton__Group__5 : rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6 ;
    public final void rule__TabbarButton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2928:1: ( rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2929:2: rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__5__Impl_in_rule__TabbarButton__Group__55996);
            rule__TabbarButton__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__6_in_rule__TabbarButton__Group__55999);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2936:1: rule__TabbarButton__Group__5__Impl : ( ( rule__TabbarButton__IconAssignment_5 ) ) ;
    public final void rule__TabbarButton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2940:1: ( ( ( rule__TabbarButton__IconAssignment_5 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2941:1: ( ( rule__TabbarButton__IconAssignment_5 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2941:1: ( ( rule__TabbarButton__IconAssignment_5 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2942:1: ( rule__TabbarButton__IconAssignment_5 )
            {
             before(grammarAccess.getTabbarButtonAccess().getIconAssignment_5()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2943:1: ( rule__TabbarButton__IconAssignment_5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2943:2: rule__TabbarButton__IconAssignment_5
            {
            pushFollow(FOLLOW_rule__TabbarButton__IconAssignment_5_in_rule__TabbarButton__Group__5__Impl6026);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2953:1: rule__TabbarButton__Group__6 : rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7 ;
    public final void rule__TabbarButton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2957:1: ( rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2958:2: rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__6__Impl_in_rule__TabbarButton__Group__66056);
            rule__TabbarButton__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__7_in_rule__TabbarButton__Group__66059);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2965:1: rule__TabbarButton__Group__6__Impl : ( 'view=' ) ;
    public final void rule__TabbarButton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2969:1: ( ( 'view=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2970:1: ( 'view=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2970:1: ( 'view=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2971:1: 'view='
            {
             before(grammarAccess.getTabbarButtonAccess().getViewKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__TabbarButton__Group__6__Impl6087); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2984:1: rule__TabbarButton__Group__7 : rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8 ;
    public final void rule__TabbarButton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2988:1: ( rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2989:2: rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__7__Impl_in_rule__TabbarButton__Group__76118);
            rule__TabbarButton__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__8_in_rule__TabbarButton__Group__76121);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:2996:1: rule__TabbarButton__Group__7__Impl : ( ( rule__TabbarButton__ViewAssignment_7 ) ) ;
    public final void rule__TabbarButton__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3000:1: ( ( ( rule__TabbarButton__ViewAssignment_7 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3001:1: ( ( rule__TabbarButton__ViewAssignment_7 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3001:1: ( ( rule__TabbarButton__ViewAssignment_7 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3002:1: ( rule__TabbarButton__ViewAssignment_7 )
            {
             before(grammarAccess.getTabbarButtonAccess().getViewAssignment_7()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3003:1: ( rule__TabbarButton__ViewAssignment_7 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3003:2: rule__TabbarButton__ViewAssignment_7
            {
            pushFollow(FOLLOW_rule__TabbarButton__ViewAssignment_7_in_rule__TabbarButton__Group__7__Impl6148);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3013:1: rule__TabbarButton__Group__8 : rule__TabbarButton__Group__8__Impl ;
    public final void rule__TabbarButton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3017:1: ( rule__TabbarButton__Group__8__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3018:2: rule__TabbarButton__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__8__Impl_in_rule__TabbarButton__Group__86178);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3024:1: rule__TabbarButton__Group__8__Impl : ( '}' ) ;
    public final void rule__TabbarButton__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3028:1: ( ( '}' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3029:1: ( '}' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3029:1: ( '}' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3030:1: '}'
            {
             before(grammarAccess.getTabbarButtonAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_28_in_rule__TabbarButton__Group__8__Impl6206); 
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


    // $ANTLR start rule__SimpleType__Group__0
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3061:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3065:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3066:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__06255);
            rule__SimpleType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__06258);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3073:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3077:1: ( ( 'type' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3078:1: ( 'type' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3078:1: ( 'type' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3079:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__SimpleType__Group__0__Impl6286); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3092:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3096:1: ( rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3097:2: rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__16317);
            rule__SimpleType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__16320);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3104:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3108:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3109:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3109:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3110:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3111:1: ( rule__SimpleType__NameAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3111:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl6347);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3121:1: rule__SimpleType__Group__2 : rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3 ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3125:1: ( rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3126:2: rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__26377);
            rule__SimpleType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__3_in_rule__SimpleType__Group__26380);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3133:1: rule__SimpleType__Group__2__Impl : ( 'mapsTo' ) ;
    public final void rule__SimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3137:1: ( ( 'mapsTo' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3138:1: ( 'mapsTo' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3138:1: ( 'mapsTo' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3139:1: 'mapsTo'
            {
             before(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__SimpleType__Group__2__Impl6408); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3152:1: rule__SimpleType__Group__3 : rule__SimpleType__Group__3__Impl ;
    public final void rule__SimpleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3156:1: ( rule__SimpleType__Group__3__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3157:2: rule__SimpleType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__3__Impl_in_rule__SimpleType__Group__36439);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3163:1: rule__SimpleType__Group__3__Impl : ( ( rule__SimpleType__PlatformTypeAssignment_3 ) ) ;
    public final void rule__SimpleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3167:1: ( ( ( rule__SimpleType__PlatformTypeAssignment_3 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3168:1: ( ( rule__SimpleType__PlatformTypeAssignment_3 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3168:1: ( ( rule__SimpleType__PlatformTypeAssignment_3 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3169:1: ( rule__SimpleType__PlatformTypeAssignment_3 )
            {
             before(grammarAccess.getSimpleTypeAccess().getPlatformTypeAssignment_3()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3170:1: ( rule__SimpleType__PlatformTypeAssignment_3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3170:2: rule__SimpleType__PlatformTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__SimpleType__PlatformTypeAssignment_3_in_rule__SimpleType__Group__3__Impl6466);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3188:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3192:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3193:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06504);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06507);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3200:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3204:1: ( ( 'entity' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3205:1: ( 'entity' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3205:1: ( 'entity' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3206:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Entity__Group__0__Impl6535); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3219:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3223:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3224:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16566);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16569);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3231:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3235:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3236:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3236:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3237:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3238:1: ( rule__Entity__NameAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3238:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl6596);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3248:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3252:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3253:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26626);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26629);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3260:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3264:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3265:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3265:1: ( ( rule__Entity__Group_2__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3266:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3267:1: ( rule__Entity__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3267:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl6656);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3277:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3281:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3282:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__36687);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__36690);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3289:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3293:1: ( ( '{' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3294:1: ( '{' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3294:1: ( '{' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3295:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Entity__Group__3__Impl6718); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3308:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3312:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3313:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__46749);
            rule__Entity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__46752);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3320:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__PropertiesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3324:1: ( ( ( rule__Entity__PropertiesAssignment_4 )* ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3325:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3325:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3326:1: ( rule__Entity__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3327:1: ( rule__Entity__PropertiesAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==57) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3327:2: rule__Entity__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__4__Impl6779);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3337:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3341:1: ( rule__Entity__Group__5__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3342:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__56810);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3348:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3352:1: ( ( '}' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3353:1: ( '}' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3353:1: ( '}' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3354:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__Entity__Group__5__Impl6838); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3379:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3383:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3384:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__06881);
            rule__Entity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__06884);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3391:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3395:1: ( ( 'extends' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3396:1: ( 'extends' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3396:1: ( 'extends' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3397:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Entity__Group_2__0__Impl6912); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3410:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3414:1: ( rule__Entity__Group_2__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3415:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__16943);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3421:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3425:1: ( ( ( rule__Entity__ExtendsAssignment_2_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3426:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3426:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3427:1: ( rule__Entity__ExtendsAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3428:1: ( rule__Entity__ExtendsAssignment_2_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3428:2: rule__Entity__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__1__Impl6970);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3442:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3446:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3447:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07004);
            rule__Property__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07007);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3454:1: rule__Property__Group__0__Impl : ( ( rule__Property__DerivedAssignment_0 )? ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3458:1: ( ( ( rule__Property__DerivedAssignment_0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3459:1: ( ( rule__Property__DerivedAssignment_0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3459:1: ( ( rule__Property__DerivedAssignment_0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3460:1: ( rule__Property__DerivedAssignment_0 )?
            {
             before(grammarAccess.getPropertyAccess().getDerivedAssignment_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3461:1: ( rule__Property__DerivedAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==57) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3461:2: rule__Property__DerivedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Property__DerivedAssignment_0_in_rule__Property__Group__0__Impl7034);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3471:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3475:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3476:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17065);
            rule__Property__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17068);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3483:1: rule__Property__Group__1__Impl : ( ( rule__Property__DescriptionAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3487:1: ( ( ( rule__Property__DescriptionAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3488:1: ( ( rule__Property__DescriptionAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3488:1: ( ( rule__Property__DescriptionAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3489:1: ( rule__Property__DescriptionAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3490:1: ( rule__Property__DescriptionAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3490:2: rule__Property__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__DescriptionAssignment_1_in_rule__Property__Group__1__Impl7095);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3500:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3504:1: ( rule__Property__Group__2__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3505:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27125);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3511:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3515:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3516:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3516:1: ( ( rule__Property__NameAssignment_2 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3517:1: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3518:1: ( rule__Property__NameAssignment_2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3518:2: rule__Property__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl7152);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3534:1: rule__ContentProvider__Group__0 : rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1 ;
    public final void rule__ContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3538:1: ( rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3539:2: rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__0__Impl_in_rule__ContentProvider__Group__07188);
            rule__ContentProvider__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__1_in_rule__ContentProvider__Group__07191);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3546:1: rule__ContentProvider__Group__0__Impl : ( 'contentprovider' ) ;
    public final void rule__ContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3550:1: ( ( 'contentprovider' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3551:1: ( 'contentprovider' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3551:1: ( 'contentprovider' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3552:1: 'contentprovider'
            {
             before(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ContentProvider__Group__0__Impl7219); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3565:1: rule__ContentProvider__Group__1 : rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2 ;
    public final void rule__ContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3569:1: ( rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3570:2: rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__1__Impl_in_rule__ContentProvider__Group__17250);
            rule__ContentProvider__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__2_in_rule__ContentProvider__Group__17253);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3577:1: rule__ContentProvider__Group__1__Impl : ( ( rule__ContentProvider__NameAssignment_1 ) ) ;
    public final void rule__ContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3581:1: ( ( ( rule__ContentProvider__NameAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3582:1: ( ( rule__ContentProvider__NameAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3582:1: ( ( rule__ContentProvider__NameAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3583:1: ( rule__ContentProvider__NameAssignment_1 )
            {
             before(grammarAccess.getContentProviderAccess().getNameAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3584:1: ( rule__ContentProvider__NameAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3584:2: rule__ContentProvider__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ContentProvider__NameAssignment_1_in_rule__ContentProvider__Group__1__Impl7280);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3594:1: rule__ContentProvider__Group__2 : rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3 ;
    public final void rule__ContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3598:1: ( rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3599:2: rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__2__Impl_in_rule__ContentProvider__Group__27310);
            rule__ContentProvider__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__3_in_rule__ContentProvider__Group__27313);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3606:1: rule__ContentProvider__Group__2__Impl : ( ( rule__ContentProvider__Group_2__0 )? ) ;
    public final void rule__ContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3610:1: ( ( ( rule__ContentProvider__Group_2__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3611:1: ( ( rule__ContentProvider__Group_2__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3611:1: ( ( rule__ContentProvider__Group_2__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3612:1: ( rule__ContentProvider__Group_2__0 )?
            {
             before(grammarAccess.getContentProviderAccess().getGroup_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3613:1: ( rule__ContentProvider__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3613:2: rule__ContentProvider__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ContentProvider__Group_2__0_in_rule__ContentProvider__Group__2__Impl7340);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3623:1: rule__ContentProvider__Group__3 : rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4 ;
    public final void rule__ContentProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3627:1: ( rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3628:2: rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__3__Impl_in_rule__ContentProvider__Group__37371);
            rule__ContentProvider__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__4_in_rule__ContentProvider__Group__37374);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3635:1: rule__ContentProvider__Group__3__Impl : ( ( rule__ContentProvider__Alternatives_3 ) ) ;
    public final void rule__ContentProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3639:1: ( ( ( rule__ContentProvider__Alternatives_3 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3640:1: ( ( rule__ContentProvider__Alternatives_3 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3640:1: ( ( rule__ContentProvider__Alternatives_3 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3641:1: ( rule__ContentProvider__Alternatives_3 )
            {
             before(grammarAccess.getContentProviderAccess().getAlternatives_3()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3642:1: ( rule__ContentProvider__Alternatives_3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3642:2: rule__ContentProvider__Alternatives_3
            {
            pushFollow(FOLLOW_rule__ContentProvider__Alternatives_3_in_rule__ContentProvider__Group__3__Impl7401);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3652:1: rule__ContentProvider__Group__4 : rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5 ;
    public final void rule__ContentProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3656:1: ( rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3657:2: rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__4__Impl_in_rule__ContentProvider__Group__47431);
            rule__ContentProvider__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__5_in_rule__ContentProvider__Group__47434);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3664:1: rule__ContentProvider__Group__4__Impl : ( ( rule__ContentProvider__TypeAssignment_4 ) ) ;
    public final void rule__ContentProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3668:1: ( ( ( rule__ContentProvider__TypeAssignment_4 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3669:1: ( ( rule__ContentProvider__TypeAssignment_4 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3669:1: ( ( rule__ContentProvider__TypeAssignment_4 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3670:1: ( rule__ContentProvider__TypeAssignment_4 )
            {
             before(grammarAccess.getContentProviderAccess().getTypeAssignment_4()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3671:1: ( rule__ContentProvider__TypeAssignment_4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3671:2: rule__ContentProvider__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__ContentProvider__TypeAssignment_4_in_rule__ContentProvider__Group__4__Impl7461);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3681:1: rule__ContentProvider__Group__5 : rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6 ;
    public final void rule__ContentProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3685:1: ( rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3686:2: rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__5__Impl_in_rule__ContentProvider__Group__57491);
            rule__ContentProvider__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__6_in_rule__ContentProvider__Group__57494);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3693:1: rule__ContentProvider__Group__5__Impl : ( ( rule__ContentProvider__ManyAssignment_5 )? ) ;
    public final void rule__ContentProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3697:1: ( ( ( rule__ContentProvider__ManyAssignment_5 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3698:1: ( ( rule__ContentProvider__ManyAssignment_5 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3698:1: ( ( rule__ContentProvider__ManyAssignment_5 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3699:1: ( rule__ContentProvider__ManyAssignment_5 )?
            {
             before(grammarAccess.getContentProviderAccess().getManyAssignment_5()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3700:1: ( rule__ContentProvider__ManyAssignment_5 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==56) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3700:2: rule__ContentProvider__ManyAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ContentProvider__ManyAssignment_5_in_rule__ContentProvider__Group__5__Impl7521);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3710:1: rule__ContentProvider__Group__6 : rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7 ;
    public final void rule__ContentProvider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3714:1: ( rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3715:2: rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__6__Impl_in_rule__ContentProvider__Group__67552);
            rule__ContentProvider__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__7_in_rule__ContentProvider__Group__67555);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3722:1: rule__ContentProvider__Group__6__Impl : ( 'fetches' ) ;
    public final void rule__ContentProvider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3726:1: ( ( 'fetches' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3727:1: ( 'fetches' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3727:1: ( 'fetches' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3728:1: 'fetches'
            {
             before(grammarAccess.getContentProviderAccess().getFetchesKeyword_6()); 
            match(input,38,FOLLOW_38_in_rule__ContentProvider__Group__6__Impl7583); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3741:1: rule__ContentProvider__Group__7 : rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8 ;
    public final void rule__ContentProvider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3745:1: ( rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3746:2: rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__7__Impl_in_rule__ContentProvider__Group__77614);
            rule__ContentProvider__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__8_in_rule__ContentProvider__Group__77617);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3753:1: rule__ContentProvider__Group__7__Impl : ( 'XML' ) ;
    public final void rule__ContentProvider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3757:1: ( ( 'XML' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3758:1: ( 'XML' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3758:1: ( 'XML' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3759:1: 'XML'
            {
             before(grammarAccess.getContentProviderAccess().getXMLKeyword_7()); 
            match(input,39,FOLLOW_39_in_rule__ContentProvider__Group__7__Impl7645); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3772:1: rule__ContentProvider__Group__8 : rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9 ;
    public final void rule__ContentProvider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3776:1: ( rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3777:2: rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__8__Impl_in_rule__ContentProvider__Group__87676);
            rule__ContentProvider__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__9_in_rule__ContentProvider__Group__87679);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3784:1: rule__ContentProvider__Group__8__Impl : ( 'from' ) ;
    public final void rule__ContentProvider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3788:1: ( ( 'from' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3789:1: ( 'from' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3789:1: ( 'from' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3790:1: 'from'
            {
             before(grammarAccess.getContentProviderAccess().getFromKeyword_8()); 
            match(input,40,FOLLOW_40_in_rule__ContentProvider__Group__8__Impl7707); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3803:1: rule__ContentProvider__Group__9 : rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10 ;
    public final void rule__ContentProvider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3807:1: ( rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3808:2: rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__9__Impl_in_rule__ContentProvider__Group__97738);
            rule__ContentProvider__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__10_in_rule__ContentProvider__Group__97741);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3815:1: rule__ContentProvider__Group__9__Impl : ( ( rule__ContentProvider__UrlAssignment_9 ) ) ;
    public final void rule__ContentProvider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3819:1: ( ( ( rule__ContentProvider__UrlAssignment_9 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3820:1: ( ( rule__ContentProvider__UrlAssignment_9 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3820:1: ( ( rule__ContentProvider__UrlAssignment_9 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3821:1: ( rule__ContentProvider__UrlAssignment_9 )
            {
             before(grammarAccess.getContentProviderAccess().getUrlAssignment_9()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3822:1: ( rule__ContentProvider__UrlAssignment_9 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3822:2: rule__ContentProvider__UrlAssignment_9
            {
            pushFollow(FOLLOW_rule__ContentProvider__UrlAssignment_9_in_rule__ContentProvider__Group__9__Impl7768);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3832:1: rule__ContentProvider__Group__10 : rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11 ;
    public final void rule__ContentProvider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3836:1: ( rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3837:2: rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__10__Impl_in_rule__ContentProvider__Group__107798);
            rule__ContentProvider__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__11_in_rule__ContentProvider__Group__107801);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3844:1: rule__ContentProvider__Group__10__Impl : ( 'selects' ) ;
    public final void rule__ContentProvider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3848:1: ( ( 'selects' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3849:1: ( 'selects' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3849:1: ( 'selects' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3850:1: 'selects'
            {
             before(grammarAccess.getContentProviderAccess().getSelectsKeyword_10()); 
            match(input,41,FOLLOW_41_in_rule__ContentProvider__Group__10__Impl7829); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3863:1: rule__ContentProvider__Group__11 : rule__ContentProvider__Group__11__Impl ;
    public final void rule__ContentProvider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3867:1: ( rule__ContentProvider__Group__11__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3868:2: rule__ContentProvider__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__11__Impl_in_rule__ContentProvider__Group__117860);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3874:1: rule__ContentProvider__Group__11__Impl : ( ( rule__ContentProvider__SelectionAssignment_11 ) ) ;
    public final void rule__ContentProvider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3878:1: ( ( ( rule__ContentProvider__SelectionAssignment_11 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3879:1: ( ( rule__ContentProvider__SelectionAssignment_11 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3879:1: ( ( rule__ContentProvider__SelectionAssignment_11 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3880:1: ( rule__ContentProvider__SelectionAssignment_11 )
            {
             before(grammarAccess.getContentProviderAccess().getSelectionAssignment_11()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3881:1: ( rule__ContentProvider__SelectionAssignment_11 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3881:2: rule__ContentProvider__SelectionAssignment_11
            {
            pushFollow(FOLLOW_rule__ContentProvider__SelectionAssignment_11_in_rule__ContentProvider__Group__11__Impl7887);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3915:1: rule__ContentProvider__Group_2__0 : rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1 ;
    public final void rule__ContentProvider__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3919:1: ( rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3920:2: rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__0__Impl_in_rule__ContentProvider__Group_2__07941);
            rule__ContentProvider__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group_2__1_in_rule__ContentProvider__Group_2__07944);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3927:1: rule__ContentProvider__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ContentProvider__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3931:1: ( ( '(' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3932:1: ( '(' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3932:1: ( '(' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3933:1: '('
            {
             before(grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__ContentProvider__Group_2__0__Impl7972); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3946:1: rule__ContentProvider__Group_2__1 : rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2 ;
    public final void rule__ContentProvider__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3950:1: ( rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3951:2: rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__1__Impl_in_rule__ContentProvider__Group_2__18003);
            rule__ContentProvider__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group_2__2_in_rule__ContentProvider__Group_2__18006);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3958:1: rule__ContentProvider__Group_2__1__Impl : ( ( rule__ContentProvider__ParameterAssignment_2_1 ) ) ;
    public final void rule__ContentProvider__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3962:1: ( ( ( rule__ContentProvider__ParameterAssignment_2_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3963:1: ( ( rule__ContentProvider__ParameterAssignment_2_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3963:1: ( ( rule__ContentProvider__ParameterAssignment_2_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3964:1: ( rule__ContentProvider__ParameterAssignment_2_1 )
            {
             before(grammarAccess.getContentProviderAccess().getParameterAssignment_2_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3965:1: ( rule__ContentProvider__ParameterAssignment_2_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3965:2: rule__ContentProvider__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ContentProvider__ParameterAssignment_2_1_in_rule__ContentProvider__Group_2__1__Impl8033);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3975:1: rule__ContentProvider__Group_2__2 : rule__ContentProvider__Group_2__2__Impl ;
    public final void rule__ContentProvider__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3979:1: ( rule__ContentProvider__Group_2__2__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3980:2: rule__ContentProvider__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__2__Impl_in_rule__ContentProvider__Group_2__28063);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3986:1: rule__ContentProvider__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ContentProvider__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3990:1: ( ( ')' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3991:1: ( ')' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3991:1: ( ')' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:3992:1: ')'
            {
             before(grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__ContentProvider__Group_2__2__Impl8091); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4011:1: rule__ProviderConstruction__Group_0__0 : rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1 ;
    public final void rule__ProviderConstruction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4015:1: ( rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4016:2: rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__0__Impl_in_rule__ProviderConstruction__Group_0__08128);
            rule__ProviderConstruction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__1_in_rule__ProviderConstruction__Group_0__08131);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4023:1: rule__ProviderConstruction__Group_0__0__Impl : ( () ) ;
    public final void rule__ProviderConstruction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4027:1: ( ( () ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4028:1: ( () )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4028:1: ( () )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4029:1: ()
            {
             before(grammarAccess.getProviderConstructionAccess().getComplexProviderConstructionAction_0_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4030:1: ()
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4032:1: 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4042:1: rule__ProviderConstruction__Group_0__1 : rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2 ;
    public final void rule__ProviderConstruction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4046:1: ( rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4047:2: rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__1__Impl_in_rule__ProviderConstruction__Group_0__18189);
            rule__ProviderConstruction__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__2_in_rule__ProviderConstruction__Group_0__18192);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4054:1: rule__ProviderConstruction__Group_0__1__Impl : ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) ) ;
    public final void rule__ProviderConstruction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4058:1: ( ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4059:1: ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4059:1: ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4060:1: ( rule__ProviderConstruction__ProviderAssignment_0_1 )
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderAssignment_0_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4061:1: ( rule__ProviderConstruction__ProviderAssignment_0_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4061:2: rule__ProviderConstruction__ProviderAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__ProviderAssignment_0_1_in_rule__ProviderConstruction__Group_0__1__Impl8219);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4071:1: rule__ProviderConstruction__Group_0__2 : rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3 ;
    public final void rule__ProviderConstruction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4075:1: ( rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4076:2: rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__2__Impl_in_rule__ProviderConstruction__Group_0__28249);
            rule__ProviderConstruction__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__3_in_rule__ProviderConstruction__Group_0__28252);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4083:1: rule__ProviderConstruction__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ProviderConstruction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4087:1: ( ( '(' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4088:1: ( '(' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4088:1: ( '(' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4089:1: '('
            {
             before(grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,18,FOLLOW_18_in_rule__ProviderConstruction__Group_0__2__Impl8280); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4102:1: rule__ProviderConstruction__Group_0__3 : rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4 ;
    public final void rule__ProviderConstruction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4106:1: ( rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4107:2: rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__3__Impl_in_rule__ProviderConstruction__Group_0__38311);
            rule__ProviderConstruction__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__4_in_rule__ProviderConstruction__Group_0__38314);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4114:1: rule__ProviderConstruction__Group_0__3__Impl : ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? ) ;
    public final void rule__ProviderConstruction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4118:1: ( ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4119:1: ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4119:1: ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4120:1: ( rule__ProviderConstruction__ArgumentAssignment_0_3 )?
            {
             before(grammarAccess.getProviderConstructionAccess().getArgumentAssignment_0_3()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4121:1: ( rule__ProviderConstruction__ArgumentAssignment_0_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==18||LA25_0==20||(LA25_0>=22 && LA25_0<=23)||LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4121:2: rule__ProviderConstruction__ArgumentAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__ArgumentAssignment_0_3_in_rule__ProviderConstruction__Group_0__3__Impl8341);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4131:1: rule__ProviderConstruction__Group_0__4 : rule__ProviderConstruction__Group_0__4__Impl ;
    public final void rule__ProviderConstruction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4135:1: ( rule__ProviderConstruction__Group_0__4__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4136:2: rule__ProviderConstruction__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__4__Impl_in_rule__ProviderConstruction__Group_0__48372);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4142:1: rule__ProviderConstruction__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ProviderConstruction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4146:1: ( ( ')' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4147:1: ( ')' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4147:1: ( ')' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4148:1: ')'
            {
             before(grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,19,FOLLOW_19_in_rule__ProviderConstruction__Group_0__4__Impl8400); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4171:1: rule__ProviderConstruction__Group_1__0 : rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1 ;
    public final void rule__ProviderConstruction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4175:1: ( rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4176:2: rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__0__Impl_in_rule__ProviderConstruction__Group_1__08441);
            rule__ProviderConstruction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__1_in_rule__ProviderConstruction__Group_1__08444);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4183:1: rule__ProviderConstruction__Group_1__0__Impl : ( () ) ;
    public final void rule__ProviderConstruction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4187:1: ( ( () ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4188:1: ( () )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4188:1: ( () )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4189:1: ()
            {
             before(grammarAccess.getProviderConstructionAccess().getSimpleProviderConstructionAction_1_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4190:1: ()
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4192:1: 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4202:1: rule__ProviderConstruction__Group_1__1 : rule__ProviderConstruction__Group_1__1__Impl ;
    public final void rule__ProviderConstruction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4206:1: ( rule__ProviderConstruction__Group_1__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4207:2: rule__ProviderConstruction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__1__Impl_in_rule__ProviderConstruction__Group_1__18502);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4213:1: rule__ProviderConstruction__Group_1__1__Impl : ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) ) ;
    public final void rule__ProviderConstruction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4217:1: ( ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4218:1: ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4218:1: ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4219:1: ( rule__ProviderConstruction__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getProviderConstructionAccess().getExpressionAssignment_1_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4220:1: ( rule__ProviderConstruction__ExpressionAssignment_1_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4220:2: rule__ProviderConstruction__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__ExpressionAssignment_1_1_in_rule__ProviderConstruction__Group_1__1__Impl8529);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4234:1: rule__TableView__Group__0 : rule__TableView__Group__0__Impl rule__TableView__Group__1 ;
    public final void rule__TableView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4238:1: ( rule__TableView__Group__0__Impl rule__TableView__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4239:2: rule__TableView__Group__0__Impl rule__TableView__Group__1
            {
            pushFollow(FOLLOW_rule__TableView__Group__0__Impl_in_rule__TableView__Group__08563);
            rule__TableView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__1_in_rule__TableView__Group__08566);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4246:1: rule__TableView__Group__0__Impl : ( 'tableview' ) ;
    public final void rule__TableView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4250:1: ( ( 'tableview' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4251:1: ( 'tableview' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4251:1: ( 'tableview' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4252:1: 'tableview'
            {
             before(grammarAccess.getTableViewAccess().getTableviewKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__TableView__Group__0__Impl8594); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4265:1: rule__TableView__Group__1 : rule__TableView__Group__1__Impl rule__TableView__Group__2 ;
    public final void rule__TableView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4269:1: ( rule__TableView__Group__1__Impl rule__TableView__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4270:2: rule__TableView__Group__1__Impl rule__TableView__Group__2
            {
            pushFollow(FOLLOW_rule__TableView__Group__1__Impl_in_rule__TableView__Group__18625);
            rule__TableView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__2_in_rule__TableView__Group__18628);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4277:1: rule__TableView__Group__1__Impl : ( ( rule__TableView__NameAssignment_1 ) ) ;
    public final void rule__TableView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4281:1: ( ( ( rule__TableView__NameAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4282:1: ( ( rule__TableView__NameAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4282:1: ( ( rule__TableView__NameAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4283:1: ( rule__TableView__NameAssignment_1 )
            {
             before(grammarAccess.getTableViewAccess().getNameAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4284:1: ( rule__TableView__NameAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4284:2: rule__TableView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TableView__NameAssignment_1_in_rule__TableView__Group__1__Impl8655);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4294:1: rule__TableView__Group__2 : rule__TableView__Group__2__Impl rule__TableView__Group__3 ;
    public final void rule__TableView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4298:1: ( rule__TableView__Group__2__Impl rule__TableView__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4299:2: rule__TableView__Group__2__Impl rule__TableView__Group__3
            {
            pushFollow(FOLLOW_rule__TableView__Group__2__Impl_in_rule__TableView__Group__28685);
            rule__TableView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__3_in_rule__TableView__Group__28688);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4306:1: rule__TableView__Group__2__Impl : ( ( rule__TableView__Group_2__0 )? ) ;
    public final void rule__TableView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4310:1: ( ( ( rule__TableView__Group_2__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4311:1: ( ( rule__TableView__Group_2__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4311:1: ( ( rule__TableView__Group_2__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4312:1: ( rule__TableView__Group_2__0 )?
            {
             before(grammarAccess.getTableViewAccess().getGroup_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4313:1: ( rule__TableView__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4313:2: rule__TableView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TableView__Group_2__0_in_rule__TableView__Group__2__Impl8715);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4323:1: rule__TableView__Group__3 : rule__TableView__Group__3__Impl rule__TableView__Group__4 ;
    public final void rule__TableView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4327:1: ( rule__TableView__Group__3__Impl rule__TableView__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4328:2: rule__TableView__Group__3__Impl rule__TableView__Group__4
            {
            pushFollow(FOLLOW_rule__TableView__Group__3__Impl_in_rule__TableView__Group__38746);
            rule__TableView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__4_in_rule__TableView__Group__38749);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4335:1: rule__TableView__Group__3__Impl : ( '{' ) ;
    public final void rule__TableView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4339:1: ( ( '{' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4340:1: ( '{' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4340:1: ( '{' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4341:1: '{'
            {
             before(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__TableView__Group__3__Impl8777); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4354:1: rule__TableView__Group__4 : rule__TableView__Group__4__Impl rule__TableView__Group__5 ;
    public final void rule__TableView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4358:1: ( rule__TableView__Group__4__Impl rule__TableView__Group__5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4359:2: rule__TableView__Group__4__Impl rule__TableView__Group__5
            {
            pushFollow(FOLLOW_rule__TableView__Group__4__Impl_in_rule__TableView__Group__48808);
            rule__TableView__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__5_in_rule__TableView__Group__48811);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4366:1: rule__TableView__Group__4__Impl : ( 'title=' ) ;
    public final void rule__TableView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4370:1: ( ( 'title=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4371:1: ( 'title=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4371:1: ( 'title=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4372:1: 'title='
            {
             before(grammarAccess.getTableViewAccess().getTitleKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__TableView__Group__4__Impl8839); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4385:1: rule__TableView__Group__5 : rule__TableView__Group__5__Impl rule__TableView__Group__6 ;
    public final void rule__TableView__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4389:1: ( rule__TableView__Group__5__Impl rule__TableView__Group__6 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4390:2: rule__TableView__Group__5__Impl rule__TableView__Group__6
            {
            pushFollow(FOLLOW_rule__TableView__Group__5__Impl_in_rule__TableView__Group__58870);
            rule__TableView__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__6_in_rule__TableView__Group__58873);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4397:1: rule__TableView__Group__5__Impl : ( ( rule__TableView__TitleAssignment_5 ) ) ;
    public final void rule__TableView__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4401:1: ( ( ( rule__TableView__TitleAssignment_5 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4402:1: ( ( rule__TableView__TitleAssignment_5 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4402:1: ( ( rule__TableView__TitleAssignment_5 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4403:1: ( rule__TableView__TitleAssignment_5 )
            {
             before(grammarAccess.getTableViewAccess().getTitleAssignment_5()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4404:1: ( rule__TableView__TitleAssignment_5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4404:2: rule__TableView__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__TableView__TitleAssignment_5_in_rule__TableView__Group__5__Impl8900);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4414:1: rule__TableView__Group__6 : rule__TableView__Group__6__Impl rule__TableView__Group__7 ;
    public final void rule__TableView__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4418:1: ( rule__TableView__Group__6__Impl rule__TableView__Group__7 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4419:2: rule__TableView__Group__6__Impl rule__TableView__Group__7
            {
            pushFollow(FOLLOW_rule__TableView__Group__6__Impl_in_rule__TableView__Group__68930);
            rule__TableView__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__7_in_rule__TableView__Group__68933);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4426:1: rule__TableView__Group__6__Impl : ( ( rule__TableView__SectionsAssignment_6 )* ) ;
    public final void rule__TableView__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4430:1: ( ( ( rule__TableView__SectionsAssignment_6 )* ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4431:1: ( ( rule__TableView__SectionsAssignment_6 )* )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4431:1: ( ( rule__TableView__SectionsAssignment_6 )* )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4432:1: ( rule__TableView__SectionsAssignment_6 )*
            {
             before(grammarAccess.getTableViewAccess().getSectionsAssignment_6()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4433:1: ( rule__TableView__SectionsAssignment_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==50) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4433:2: rule__TableView__SectionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__TableView__SectionsAssignment_6_in_rule__TableView__Group__6__Impl8960);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4443:1: rule__TableView__Group__7 : rule__TableView__Group__7__Impl ;
    public final void rule__TableView__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4447:1: ( rule__TableView__Group__7__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4448:2: rule__TableView__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__TableView__Group__7__Impl_in_rule__TableView__Group__78991);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4454:1: rule__TableView__Group__7__Impl : ( '}' ) ;
    public final void rule__TableView__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4458:1: ( ( '}' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4459:1: ( '}' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4459:1: ( '}' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4460:1: '}'
            {
             before(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_7()); 
            match(input,28,FOLLOW_28_in_rule__TableView__Group__7__Impl9019); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4489:1: rule__TableView__Group_2__0 : rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1 ;
    public final void rule__TableView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4493:1: ( rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4494:2: rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__0__Impl_in_rule__TableView__Group_2__09066);
            rule__TableView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group_2__1_in_rule__TableView__Group_2__09069);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4501:1: rule__TableView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TableView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4505:1: ( ( '(' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4506:1: ( '(' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4506:1: ( '(' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4507:1: '('
            {
             before(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__TableView__Group_2__0__Impl9097); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4520:1: rule__TableView__Group_2__1 : rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2 ;
    public final void rule__TableView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4524:1: ( rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4525:2: rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__1__Impl_in_rule__TableView__Group_2__19128);
            rule__TableView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group_2__2_in_rule__TableView__Group_2__19131);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4532:1: rule__TableView__Group_2__1__Impl : ( ( rule__TableView__ContentAssignment_2_1 ) ) ;
    public final void rule__TableView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4536:1: ( ( ( rule__TableView__ContentAssignment_2_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4537:1: ( ( rule__TableView__ContentAssignment_2_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4537:1: ( ( rule__TableView__ContentAssignment_2_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4538:1: ( rule__TableView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getTableViewAccess().getContentAssignment_2_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4539:1: ( rule__TableView__ContentAssignment_2_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4539:2: rule__TableView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TableView__ContentAssignment_2_1_in_rule__TableView__Group_2__1__Impl9158);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4549:1: rule__TableView__Group_2__2 : rule__TableView__Group_2__2__Impl ;
    public final void rule__TableView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4553:1: ( rule__TableView__Group_2__2__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4554:2: rule__TableView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__2__Impl_in_rule__TableView__Group_2__29188);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4560:1: rule__TableView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TableView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4564:1: ( ( ')' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4565:1: ( ')' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4565:1: ( ')' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4566:1: ')'
            {
             before(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__TableView__Group_2__2__Impl9216); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4585:1: rule__DetailsView__Group__0 : rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1 ;
    public final void rule__DetailsView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4589:1: ( rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4590:2: rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__0__Impl_in_rule__DetailsView__Group__09253);
            rule__DetailsView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__1_in_rule__DetailsView__Group__09256);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4597:1: rule__DetailsView__Group__0__Impl : ( 'detailsview' ) ;
    public final void rule__DetailsView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4601:1: ( ( 'detailsview' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4602:1: ( 'detailsview' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4602:1: ( 'detailsview' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4603:1: 'detailsview'
            {
             before(grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__DetailsView__Group__0__Impl9284); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4616:1: rule__DetailsView__Group__1 : rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2 ;
    public final void rule__DetailsView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4620:1: ( rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4621:2: rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__1__Impl_in_rule__DetailsView__Group__19315);
            rule__DetailsView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__2_in_rule__DetailsView__Group__19318);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4628:1: rule__DetailsView__Group__1__Impl : ( ( rule__DetailsView__NameAssignment_1 ) ) ;
    public final void rule__DetailsView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4632:1: ( ( ( rule__DetailsView__NameAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4633:1: ( ( rule__DetailsView__NameAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4633:1: ( ( rule__DetailsView__NameAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4634:1: ( rule__DetailsView__NameAssignment_1 )
            {
             before(grammarAccess.getDetailsViewAccess().getNameAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4635:1: ( rule__DetailsView__NameAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4635:2: rule__DetailsView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DetailsView__NameAssignment_1_in_rule__DetailsView__Group__1__Impl9345);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4645:1: rule__DetailsView__Group__2 : rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3 ;
    public final void rule__DetailsView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4649:1: ( rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4650:2: rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__2__Impl_in_rule__DetailsView__Group__29375);
            rule__DetailsView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__3_in_rule__DetailsView__Group__29378);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4657:1: rule__DetailsView__Group__2__Impl : ( ( rule__DetailsView__Group_2__0 )? ) ;
    public final void rule__DetailsView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4661:1: ( ( ( rule__DetailsView__Group_2__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4662:1: ( ( rule__DetailsView__Group_2__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4662:1: ( ( rule__DetailsView__Group_2__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4663:1: ( rule__DetailsView__Group_2__0 )?
            {
             before(grammarAccess.getDetailsViewAccess().getGroup_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4664:1: ( rule__DetailsView__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4664:2: rule__DetailsView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DetailsView__Group_2__0_in_rule__DetailsView__Group__2__Impl9405);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4674:1: rule__DetailsView__Group__3 : rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4 ;
    public final void rule__DetailsView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4678:1: ( rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4679:2: rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__3__Impl_in_rule__DetailsView__Group__39436);
            rule__DetailsView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__4_in_rule__DetailsView__Group__39439);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4686:1: rule__DetailsView__Group__3__Impl : ( '{' ) ;
    public final void rule__DetailsView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4690:1: ( ( '{' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4691:1: ( '{' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4691:1: ( '{' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4692:1: '{'
            {
             before(grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__DetailsView__Group__3__Impl9467); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4705:1: rule__DetailsView__Group__4 : rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5 ;
    public final void rule__DetailsView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4709:1: ( rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4710:2: rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__4__Impl_in_rule__DetailsView__Group__49498);
            rule__DetailsView__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__5_in_rule__DetailsView__Group__49501);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4717:1: rule__DetailsView__Group__4__Impl : ( 'title=' ) ;
    public final void rule__DetailsView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4721:1: ( ( 'title=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4722:1: ( 'title=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4722:1: ( 'title=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4723:1: 'title='
            {
             before(grammarAccess.getDetailsViewAccess().getTitleKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__DetailsView__Group__4__Impl9529); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4736:1: rule__DetailsView__Group__5 : rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6 ;
    public final void rule__DetailsView__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4740:1: ( rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4741:2: rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__5__Impl_in_rule__DetailsView__Group__59560);
            rule__DetailsView__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__6_in_rule__DetailsView__Group__59563);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4748:1: rule__DetailsView__Group__5__Impl : ( ( rule__DetailsView__TitleAssignment_5 ) ) ;
    public final void rule__DetailsView__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4752:1: ( ( ( rule__DetailsView__TitleAssignment_5 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4753:1: ( ( rule__DetailsView__TitleAssignment_5 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4753:1: ( ( rule__DetailsView__TitleAssignment_5 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4754:1: ( rule__DetailsView__TitleAssignment_5 )
            {
             before(grammarAccess.getDetailsViewAccess().getTitleAssignment_5()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4755:1: ( rule__DetailsView__TitleAssignment_5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4755:2: rule__DetailsView__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__DetailsView__TitleAssignment_5_in_rule__DetailsView__Group__5__Impl9590);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4765:1: rule__DetailsView__Group__6 : rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7 ;
    public final void rule__DetailsView__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4769:1: ( rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4770:2: rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__6__Impl_in_rule__DetailsView__Group__69620);
            rule__DetailsView__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__7_in_rule__DetailsView__Group__69623);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4777:1: rule__DetailsView__Group__6__Impl : ( ( rule__DetailsView__HeaderAssignment_6 )? ) ;
    public final void rule__DetailsView__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4781:1: ( ( ( rule__DetailsView__HeaderAssignment_6 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4782:1: ( ( rule__DetailsView__HeaderAssignment_6 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4782:1: ( ( rule__DetailsView__HeaderAssignment_6 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4783:1: ( rule__DetailsView__HeaderAssignment_6 )?
            {
             before(grammarAccess.getDetailsViewAccess().getHeaderAssignment_6()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4784:1: ( rule__DetailsView__HeaderAssignment_6 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4784:2: rule__DetailsView__HeaderAssignment_6
                    {
                    pushFollow(FOLLOW_rule__DetailsView__HeaderAssignment_6_in_rule__DetailsView__Group__6__Impl9650);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4794:1: rule__DetailsView__Group__7 : rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8 ;
    public final void rule__DetailsView__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4798:1: ( rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4799:2: rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__7__Impl_in_rule__DetailsView__Group__79681);
            rule__DetailsView__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__8_in_rule__DetailsView__Group__79684);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4806:1: rule__DetailsView__Group__7__Impl : ( ( rule__DetailsView__SectionsAssignment_7 )* ) ;
    public final void rule__DetailsView__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4810:1: ( ( ( rule__DetailsView__SectionsAssignment_7 )* ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4811:1: ( ( rule__DetailsView__SectionsAssignment_7 )* )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4811:1: ( ( rule__DetailsView__SectionsAssignment_7 )* )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4812:1: ( rule__DetailsView__SectionsAssignment_7 )*
            {
             before(grammarAccess.getDetailsViewAccess().getSectionsAssignment_7()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4813:1: ( rule__DetailsView__SectionsAssignment_7 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==50) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4813:2: rule__DetailsView__SectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__DetailsView__SectionsAssignment_7_in_rule__DetailsView__Group__7__Impl9711);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4823:1: rule__DetailsView__Group__8 : rule__DetailsView__Group__8__Impl ;
    public final void rule__DetailsView__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4827:1: ( rule__DetailsView__Group__8__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4828:2: rule__DetailsView__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__8__Impl_in_rule__DetailsView__Group__89742);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4834:1: rule__DetailsView__Group__8__Impl : ( '}' ) ;
    public final void rule__DetailsView__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4838:1: ( ( '}' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4839:1: ( '}' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4839:1: ( '}' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4840:1: '}'
            {
             before(grammarAccess.getDetailsViewAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_28_in_rule__DetailsView__Group__8__Impl9770); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4871:1: rule__DetailsView__Group_2__0 : rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1 ;
    public final void rule__DetailsView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4875:1: ( rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4876:2: rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__0__Impl_in_rule__DetailsView__Group_2__09819);
            rule__DetailsView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group_2__1_in_rule__DetailsView__Group_2__09822);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4883:1: rule__DetailsView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__DetailsView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4887:1: ( ( '(' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4888:1: ( '(' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4888:1: ( '(' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4889:1: '('
            {
             before(grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__DetailsView__Group_2__0__Impl9850); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4902:1: rule__DetailsView__Group_2__1 : rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2 ;
    public final void rule__DetailsView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4906:1: ( rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4907:2: rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__1__Impl_in_rule__DetailsView__Group_2__19881);
            rule__DetailsView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group_2__2_in_rule__DetailsView__Group_2__19884);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4914:1: rule__DetailsView__Group_2__1__Impl : ( ( rule__DetailsView__ContentAssignment_2_1 ) ) ;
    public final void rule__DetailsView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4918:1: ( ( ( rule__DetailsView__ContentAssignment_2_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4919:1: ( ( rule__DetailsView__ContentAssignment_2_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4919:1: ( ( rule__DetailsView__ContentAssignment_2_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4920:1: ( rule__DetailsView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getDetailsViewAccess().getContentAssignment_2_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4921:1: ( rule__DetailsView__ContentAssignment_2_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4921:2: rule__DetailsView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DetailsView__ContentAssignment_2_1_in_rule__DetailsView__Group_2__1__Impl9911);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4931:1: rule__DetailsView__Group_2__2 : rule__DetailsView__Group_2__2__Impl ;
    public final void rule__DetailsView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4935:1: ( rule__DetailsView__Group_2__2__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4936:2: rule__DetailsView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__2__Impl_in_rule__DetailsView__Group_2__29941);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4942:1: rule__DetailsView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__DetailsView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4946:1: ( ( ')' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4947:1: ( ')' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4947:1: ( ')' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4948:1: ')'
            {
             before(grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__DetailsView__Group_2__2__Impl9969); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4967:1: rule__CustomView__Group__0 : rule__CustomView__Group__0__Impl rule__CustomView__Group__1 ;
    public final void rule__CustomView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4971:1: ( rule__CustomView__Group__0__Impl rule__CustomView__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4972:2: rule__CustomView__Group__0__Impl rule__CustomView__Group__1
            {
            pushFollow(FOLLOW_rule__CustomView__Group__0__Impl_in_rule__CustomView__Group__010006);
            rule__CustomView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__1_in_rule__CustomView__Group__010009);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4979:1: rule__CustomView__Group__0__Impl : ( 'customview' ) ;
    public final void rule__CustomView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4983:1: ( ( 'customview' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4984:1: ( 'customview' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4984:1: ( 'customview' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4985:1: 'customview'
            {
             before(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__CustomView__Group__0__Impl10037); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:4998:1: rule__CustomView__Group__1 : rule__CustomView__Group__1__Impl rule__CustomView__Group__2 ;
    public final void rule__CustomView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5002:1: ( rule__CustomView__Group__1__Impl rule__CustomView__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5003:2: rule__CustomView__Group__1__Impl rule__CustomView__Group__2
            {
            pushFollow(FOLLOW_rule__CustomView__Group__1__Impl_in_rule__CustomView__Group__110068);
            rule__CustomView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__2_in_rule__CustomView__Group__110071);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5010:1: rule__CustomView__Group__1__Impl : ( ( rule__CustomView__NameAssignment_1 ) ) ;
    public final void rule__CustomView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5014:1: ( ( ( rule__CustomView__NameAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5015:1: ( ( rule__CustomView__NameAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5015:1: ( ( rule__CustomView__NameAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5016:1: ( rule__CustomView__NameAssignment_1 )
            {
             before(grammarAccess.getCustomViewAccess().getNameAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5017:1: ( rule__CustomView__NameAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5017:2: rule__CustomView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomView__NameAssignment_1_in_rule__CustomView__Group__1__Impl10098);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5027:1: rule__CustomView__Group__2 : rule__CustomView__Group__2__Impl rule__CustomView__Group__3 ;
    public final void rule__CustomView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5031:1: ( rule__CustomView__Group__2__Impl rule__CustomView__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5032:2: rule__CustomView__Group__2__Impl rule__CustomView__Group__3
            {
            pushFollow(FOLLOW_rule__CustomView__Group__2__Impl_in_rule__CustomView__Group__210128);
            rule__CustomView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__3_in_rule__CustomView__Group__210131);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5039:1: rule__CustomView__Group__2__Impl : ( ( rule__CustomView__Group_2__0 )? ) ;
    public final void rule__CustomView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5043:1: ( ( ( rule__CustomView__Group_2__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5044:1: ( ( rule__CustomView__Group_2__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5044:1: ( ( rule__CustomView__Group_2__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5045:1: ( rule__CustomView__Group_2__0 )?
            {
             before(grammarAccess.getCustomViewAccess().getGroup_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5046:1: ( rule__CustomView__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5046:2: rule__CustomView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CustomView__Group_2__0_in_rule__CustomView__Group__2__Impl10158);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5056:1: rule__CustomView__Group__3 : rule__CustomView__Group__3__Impl rule__CustomView__Group__4 ;
    public final void rule__CustomView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5060:1: ( rule__CustomView__Group__3__Impl rule__CustomView__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5061:2: rule__CustomView__Group__3__Impl rule__CustomView__Group__4
            {
            pushFollow(FOLLOW_rule__CustomView__Group__3__Impl_in_rule__CustomView__Group__310189);
            rule__CustomView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__4_in_rule__CustomView__Group__310192);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5068:1: rule__CustomView__Group__3__Impl : ( 'implementedBy' ) ;
    public final void rule__CustomView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5072:1: ( ( 'implementedBy' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5073:1: ( 'implementedBy' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5073:1: ( 'implementedBy' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5074:1: 'implementedBy'
            {
             before(grammarAccess.getCustomViewAccess().getImplementedByKeyword_3()); 
            match(input,45,FOLLOW_45_in_rule__CustomView__Group__3__Impl10220); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5087:1: rule__CustomView__Group__4 : rule__CustomView__Group__4__Impl ;
    public final void rule__CustomView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5091:1: ( rule__CustomView__Group__4__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5092:2: rule__CustomView__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CustomView__Group__4__Impl_in_rule__CustomView__Group__410251);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5098:1: rule__CustomView__Group__4__Impl : ( ( rule__CustomView__ObjclassAssignment_4 ) ) ;
    public final void rule__CustomView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5102:1: ( ( ( rule__CustomView__ObjclassAssignment_4 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5103:1: ( ( rule__CustomView__ObjclassAssignment_4 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5103:1: ( ( rule__CustomView__ObjclassAssignment_4 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5104:1: ( rule__CustomView__ObjclassAssignment_4 )
            {
             before(grammarAccess.getCustomViewAccess().getObjclassAssignment_4()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5105:1: ( rule__CustomView__ObjclassAssignment_4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5105:2: rule__CustomView__ObjclassAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomView__ObjclassAssignment_4_in_rule__CustomView__Group__4__Impl10278);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5125:1: rule__CustomView__Group_2__0 : rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1 ;
    public final void rule__CustomView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5129:1: ( rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5130:2: rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__0__Impl_in_rule__CustomView__Group_2__010318);
            rule__CustomView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group_2__1_in_rule__CustomView__Group_2__010321);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5137:1: rule__CustomView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CustomView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5141:1: ( ( '(' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5142:1: ( '(' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5142:1: ( '(' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5143:1: '('
            {
             before(grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__CustomView__Group_2__0__Impl10349); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5156:1: rule__CustomView__Group_2__1 : rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2 ;
    public final void rule__CustomView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5160:1: ( rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5161:2: rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__1__Impl_in_rule__CustomView__Group_2__110380);
            rule__CustomView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group_2__2_in_rule__CustomView__Group_2__110383);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5168:1: rule__CustomView__Group_2__1__Impl : ( ( rule__CustomView__ContentAssignment_2_1 ) ) ;
    public final void rule__CustomView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5172:1: ( ( ( rule__CustomView__ContentAssignment_2_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5173:1: ( ( rule__CustomView__ContentAssignment_2_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5173:1: ( ( rule__CustomView__ContentAssignment_2_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5174:1: ( rule__CustomView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getCustomViewAccess().getContentAssignment_2_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5175:1: ( rule__CustomView__ContentAssignment_2_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5175:2: rule__CustomView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CustomView__ContentAssignment_2_1_in_rule__CustomView__Group_2__1__Impl10410);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5185:1: rule__CustomView__Group_2__2 : rule__CustomView__Group_2__2__Impl ;
    public final void rule__CustomView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5189:1: ( rule__CustomView__Group_2__2__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5190:2: rule__CustomView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__2__Impl_in_rule__CustomView__Group_2__210440);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5196:1: rule__CustomView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CustomView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5200:1: ( ( ')' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5201:1: ( ')' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5201:1: ( ')' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5202:1: ')'
            {
             before(grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__CustomView__Group_2__2__Impl10468); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5221:1: rule__ViewHeader__Group__0 : rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1 ;
    public final void rule__ViewHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5225:1: ( rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5226:2: rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__0__Impl_in_rule__ViewHeader__Group__010505);
            rule__ViewHeader__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__1_in_rule__ViewHeader__Group__010508);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5233:1: rule__ViewHeader__Group__0__Impl : ( () ) ;
    public final void rule__ViewHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5237:1: ( ( () ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5238:1: ( () )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5238:1: ( () )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5239:1: ()
            {
             before(grammarAccess.getViewHeaderAccess().getViewHeaderAction_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5240:1: ()
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5242:1: 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5252:1: rule__ViewHeader__Group__1 : rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2 ;
    public final void rule__ViewHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5256:1: ( rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5257:2: rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__1__Impl_in_rule__ViewHeader__Group__110566);
            rule__ViewHeader__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__2_in_rule__ViewHeader__Group__110569);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5264:1: rule__ViewHeader__Group__1__Impl : ( 'header' ) ;
    public final void rule__ViewHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5268:1: ( ( 'header' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5269:1: ( 'header' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5269:1: ( 'header' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5270:1: 'header'
            {
             before(grammarAccess.getViewHeaderAccess().getHeaderKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__ViewHeader__Group__1__Impl10597); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5283:1: rule__ViewHeader__Group__2 : rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3 ;
    public final void rule__ViewHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5287:1: ( rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5288:2: rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__2__Impl_in_rule__ViewHeader__Group__210628);
            rule__ViewHeader__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__3_in_rule__ViewHeader__Group__210631);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5295:1: rule__ViewHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__ViewHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5299:1: ( ( '{' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5300:1: ( '{' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5300:1: ( '{' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5301:1: '{'
            {
             before(grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ViewHeader__Group__2__Impl10659); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5314:1: rule__ViewHeader__Group__3 : rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4 ;
    public final void rule__ViewHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5318:1: ( rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5319:2: rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__3__Impl_in_rule__ViewHeader__Group__310690);
            rule__ViewHeader__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__4_in_rule__ViewHeader__Group__310693);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5326:1: rule__ViewHeader__Group__3__Impl : ( ( rule__ViewHeader__Group_3__0 )? ) ;
    public final void rule__ViewHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5330:1: ( ( ( rule__ViewHeader__Group_3__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5331:1: ( ( rule__ViewHeader__Group_3__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5331:1: ( ( rule__ViewHeader__Group_3__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5332:1: ( rule__ViewHeader__Group_3__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_3()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5333:1: ( rule__ViewHeader__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5333:2: rule__ViewHeader__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_3__0_in_rule__ViewHeader__Group__3__Impl10720);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5343:1: rule__ViewHeader__Group__4 : rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5 ;
    public final void rule__ViewHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5347:1: ( rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5348:2: rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__4__Impl_in_rule__ViewHeader__Group__410751);
            rule__ViewHeader__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__5_in_rule__ViewHeader__Group__410754);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5355:1: rule__ViewHeader__Group__4__Impl : ( ( rule__ViewHeader__Group_4__0 )? ) ;
    public final void rule__ViewHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5359:1: ( ( ( rule__ViewHeader__Group_4__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5360:1: ( ( rule__ViewHeader__Group_4__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5360:1: ( ( rule__ViewHeader__Group_4__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5361:1: ( rule__ViewHeader__Group_4__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_4()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5362:1: ( rule__ViewHeader__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5362:2: rule__ViewHeader__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_4__0_in_rule__ViewHeader__Group__4__Impl10781);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5372:1: rule__ViewHeader__Group__5 : rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6 ;
    public final void rule__ViewHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5376:1: ( rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5377:2: rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__5__Impl_in_rule__ViewHeader__Group__510812);
            rule__ViewHeader__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__6_in_rule__ViewHeader__Group__510815);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5384:1: rule__ViewHeader__Group__5__Impl : ( ( rule__ViewHeader__Group_5__0 )? ) ;
    public final void rule__ViewHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5388:1: ( ( ( rule__ViewHeader__Group_5__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5389:1: ( ( rule__ViewHeader__Group_5__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5389:1: ( ( rule__ViewHeader__Group_5__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5390:1: ( rule__ViewHeader__Group_5__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_5()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5391:1: ( rule__ViewHeader__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5391:2: rule__ViewHeader__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_5__0_in_rule__ViewHeader__Group__5__Impl10842);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5401:1: rule__ViewHeader__Group__6 : rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7 ;
    public final void rule__ViewHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5405:1: ( rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5406:2: rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__6__Impl_in_rule__ViewHeader__Group__610873);
            rule__ViewHeader__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__7_in_rule__ViewHeader__Group__610876);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5413:1: rule__ViewHeader__Group__6__Impl : ( ( rule__ViewHeader__Group_6__0 )? ) ;
    public final void rule__ViewHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5417:1: ( ( ( rule__ViewHeader__Group_6__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5418:1: ( ( rule__ViewHeader__Group_6__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5418:1: ( ( rule__ViewHeader__Group_6__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5419:1: ( rule__ViewHeader__Group_6__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_6()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5420:1: ( rule__ViewHeader__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5420:2: rule__ViewHeader__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_6__0_in_rule__ViewHeader__Group__6__Impl10903);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5430:1: rule__ViewHeader__Group__7 : rule__ViewHeader__Group__7__Impl ;
    public final void rule__ViewHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5434:1: ( rule__ViewHeader__Group__7__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5435:2: rule__ViewHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__7__Impl_in_rule__ViewHeader__Group__710934);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5441:1: rule__ViewHeader__Group__7__Impl : ( '}' ) ;
    public final void rule__ViewHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5445:1: ( ( '}' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5446:1: ( '}' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5446:1: ( '}' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5447:1: '}'
            {
             before(grammarAccess.getViewHeaderAccess().getRightCurlyBracketKeyword_7()); 
            match(input,28,FOLLOW_28_in_rule__ViewHeader__Group__7__Impl10962); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5476:1: rule__ViewHeader__Group_3__0 : rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1 ;
    public final void rule__ViewHeader__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5480:1: ( rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5481:2: rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_3__0__Impl_in_rule__ViewHeader__Group_3__011009);
            rule__ViewHeader__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_3__1_in_rule__ViewHeader__Group_3__011012);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5488:1: rule__ViewHeader__Group_3__0__Impl : ( 'title=' ) ;
    public final void rule__ViewHeader__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5492:1: ( ( 'title=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5493:1: ( 'title=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5493:1: ( 'title=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5494:1: 'title='
            {
             before(grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__ViewHeader__Group_3__0__Impl11040); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5507:1: rule__ViewHeader__Group_3__1 : rule__ViewHeader__Group_3__1__Impl ;
    public final void rule__ViewHeader__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5511:1: ( rule__ViewHeader__Group_3__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5512:2: rule__ViewHeader__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_3__1__Impl_in_rule__ViewHeader__Group_3__111071);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5518:1: rule__ViewHeader__Group_3__1__Impl : ( ( rule__ViewHeader__TitleAssignment_3_1 ) ) ;
    public final void rule__ViewHeader__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5522:1: ( ( ( rule__ViewHeader__TitleAssignment_3_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5523:1: ( ( rule__ViewHeader__TitleAssignment_3_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5523:1: ( ( rule__ViewHeader__TitleAssignment_3_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5524:1: ( rule__ViewHeader__TitleAssignment_3_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getTitleAssignment_3_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5525:1: ( rule__ViewHeader__TitleAssignment_3_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5525:2: rule__ViewHeader__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__TitleAssignment_3_1_in_rule__ViewHeader__Group_3__1__Impl11098);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5539:1: rule__ViewHeader__Group_4__0 : rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1 ;
    public final void rule__ViewHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5543:1: ( rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5544:2: rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_4__0__Impl_in_rule__ViewHeader__Group_4__011132);
            rule__ViewHeader__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_4__1_in_rule__ViewHeader__Group_4__011135);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5551:1: rule__ViewHeader__Group_4__0__Impl : ( 'subtitle=' ) ;
    public final void rule__ViewHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5555:1: ( ( 'subtitle=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5556:1: ( 'subtitle=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5556:1: ( 'subtitle=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5557:1: 'subtitle='
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0()); 
            match(input,47,FOLLOW_47_in_rule__ViewHeader__Group_4__0__Impl11163); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5570:1: rule__ViewHeader__Group_4__1 : rule__ViewHeader__Group_4__1__Impl ;
    public final void rule__ViewHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5574:1: ( rule__ViewHeader__Group_4__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5575:2: rule__ViewHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_4__1__Impl_in_rule__ViewHeader__Group_4__111194);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5581:1: rule__ViewHeader__Group_4__1__Impl : ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) ) ;
    public final void rule__ViewHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5585:1: ( ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5586:1: ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5586:1: ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5587:1: ( rule__ViewHeader__SubtitleAssignment_4_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleAssignment_4_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5588:1: ( rule__ViewHeader__SubtitleAssignment_4_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5588:2: rule__ViewHeader__SubtitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__SubtitleAssignment_4_1_in_rule__ViewHeader__Group_4__1__Impl11221);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5602:1: rule__ViewHeader__Group_5__0 : rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1 ;
    public final void rule__ViewHeader__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5606:1: ( rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5607:2: rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_5__0__Impl_in_rule__ViewHeader__Group_5__011255);
            rule__ViewHeader__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_5__1_in_rule__ViewHeader__Group_5__011258);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5614:1: rule__ViewHeader__Group_5__0__Impl : ( 'details=' ) ;
    public final void rule__ViewHeader__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5618:1: ( ( 'details=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5619:1: ( 'details=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5619:1: ( 'details=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5620:1: 'details='
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0()); 
            match(input,48,FOLLOW_48_in_rule__ViewHeader__Group_5__0__Impl11286); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5633:1: rule__ViewHeader__Group_5__1 : rule__ViewHeader__Group_5__1__Impl ;
    public final void rule__ViewHeader__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5637:1: ( rule__ViewHeader__Group_5__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5638:2: rule__ViewHeader__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_5__1__Impl_in_rule__ViewHeader__Group_5__111317);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5644:1: rule__ViewHeader__Group_5__1__Impl : ( ( rule__ViewHeader__DetailsAssignment_5_1 ) ) ;
    public final void rule__ViewHeader__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5648:1: ( ( ( rule__ViewHeader__DetailsAssignment_5_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5649:1: ( ( rule__ViewHeader__DetailsAssignment_5_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5649:1: ( ( rule__ViewHeader__DetailsAssignment_5_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5650:1: ( rule__ViewHeader__DetailsAssignment_5_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsAssignment_5_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5651:1: ( rule__ViewHeader__DetailsAssignment_5_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5651:2: rule__ViewHeader__DetailsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__DetailsAssignment_5_1_in_rule__ViewHeader__Group_5__1__Impl11344);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5665:1: rule__ViewHeader__Group_6__0 : rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1 ;
    public final void rule__ViewHeader__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5669:1: ( rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5670:2: rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_6__0__Impl_in_rule__ViewHeader__Group_6__011378);
            rule__ViewHeader__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_6__1_in_rule__ViewHeader__Group_6__011381);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5677:1: rule__ViewHeader__Group_6__0__Impl : ( 'image=' ) ;
    public final void rule__ViewHeader__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5681:1: ( ( 'image=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5682:1: ( 'image=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5682:1: ( 'image=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5683:1: 'image='
            {
             before(grammarAccess.getViewHeaderAccess().getImageKeyword_6_0()); 
            match(input,49,FOLLOW_49_in_rule__ViewHeader__Group_6__0__Impl11409); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5696:1: rule__ViewHeader__Group_6__1 : rule__ViewHeader__Group_6__1__Impl ;
    public final void rule__ViewHeader__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5700:1: ( rule__ViewHeader__Group_6__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5701:2: rule__ViewHeader__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_6__1__Impl_in_rule__ViewHeader__Group_6__111440);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5707:1: rule__ViewHeader__Group_6__1__Impl : ( ( rule__ViewHeader__ImageAssignment_6_1 ) ) ;
    public final void rule__ViewHeader__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5711:1: ( ( ( rule__ViewHeader__ImageAssignment_6_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5712:1: ( ( rule__ViewHeader__ImageAssignment_6_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5712:1: ( ( rule__ViewHeader__ImageAssignment_6_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5713:1: ( rule__ViewHeader__ImageAssignment_6_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getImageAssignment_6_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5714:1: ( rule__ViewHeader__ImageAssignment_6_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5714:2: rule__ViewHeader__ImageAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__ImageAssignment_6_1_in_rule__ViewHeader__Group_6__1__Impl11467);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5728:1: rule__ViewSection__Group__0 : rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1 ;
    public final void rule__ViewSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5732:1: ( rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5733:2: rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__0__Impl_in_rule__ViewSection__Group__011501);
            rule__ViewSection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__1_in_rule__ViewSection__Group__011504);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5740:1: rule__ViewSection__Group__0__Impl : ( 'section' ) ;
    public final void rule__ViewSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5744:1: ( ( 'section' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5745:1: ( 'section' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5745:1: ( 'section' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5746:1: 'section'
            {
             before(grammarAccess.getViewSectionAccess().getSectionKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__ViewSection__Group__0__Impl11532); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5759:1: rule__ViewSection__Group__1 : rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2 ;
    public final void rule__ViewSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5763:1: ( rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5764:2: rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__1__Impl_in_rule__ViewSection__Group__111563);
            rule__ViewSection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__2_in_rule__ViewSection__Group__111566);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5771:1: rule__ViewSection__Group__1__Impl : ( '{' ) ;
    public final void rule__ViewSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5775:1: ( ( '{' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5776:1: ( '{' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5776:1: ( '{' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5777:1: '{'
            {
             before(grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__ViewSection__Group__1__Impl11594); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5790:1: rule__ViewSection__Group__2 : rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3 ;
    public final void rule__ViewSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5794:1: ( rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5795:2: rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__2__Impl_in_rule__ViewSection__Group__211625);
            rule__ViewSection__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__3_in_rule__ViewSection__Group__211628);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5802:1: rule__ViewSection__Group__2__Impl : ( ( rule__ViewSection__Group_2__0 )? ) ;
    public final void rule__ViewSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5806:1: ( ( ( rule__ViewSection__Group_2__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5807:1: ( ( rule__ViewSection__Group_2__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5807:1: ( ( rule__ViewSection__Group_2__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5808:1: ( rule__ViewSection__Group_2__0 )?
            {
             before(grammarAccess.getViewSectionAccess().getGroup_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5809:1: ( rule__ViewSection__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5809:2: rule__ViewSection__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ViewSection__Group_2__0_in_rule__ViewSection__Group__2__Impl11655);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5819:1: rule__ViewSection__Group__3 : rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4 ;
    public final void rule__ViewSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5823:1: ( rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5824:2: rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__3__Impl_in_rule__ViewSection__Group__311686);
            rule__ViewSection__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__4_in_rule__ViewSection__Group__311689);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5831:1: rule__ViewSection__Group__3__Impl : ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) ) ;
    public final void rule__ViewSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5835:1: ( ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5836:1: ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5836:1: ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5837:1: ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5837:1: ( ( rule__ViewSection__CellsAssignment_3 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5838:1: ( rule__ViewSection__CellsAssignment_3 )
            {
             before(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5839:1: ( rule__ViewSection__CellsAssignment_3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5839:2: rule__ViewSection__CellsAssignment_3
            {
            pushFollow(FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11718);
            rule__ViewSection__CellsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 

            }

            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5842:1: ( ( rule__ViewSection__CellsAssignment_3 )* )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5843:1: ( rule__ViewSection__CellsAssignment_3 )*
            {
             before(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5844:1: ( rule__ViewSection__CellsAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==51) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5844:2: rule__ViewSection__CellsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11730);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5855:1: rule__ViewSection__Group__4 : rule__ViewSection__Group__4__Impl ;
    public final void rule__ViewSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5859:1: ( rule__ViewSection__Group__4__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5860:2: rule__ViewSection__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__4__Impl_in_rule__ViewSection__Group__411763);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5866:1: rule__ViewSection__Group__4__Impl : ( '}' ) ;
    public final void rule__ViewSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5870:1: ( ( '}' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5871:1: ( '}' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5871:1: ( '}' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5872:1: '}'
            {
             before(grammarAccess.getViewSectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__ViewSection__Group__4__Impl11791); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5895:1: rule__ViewSection__Group_2__0 : rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1 ;
    public final void rule__ViewSection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5899:1: ( rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5900:2: rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1
            {
            pushFollow(FOLLOW_rule__ViewSection__Group_2__0__Impl_in_rule__ViewSection__Group_2__011832);
            rule__ViewSection__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group_2__1_in_rule__ViewSection__Group_2__011835);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5907:1: rule__ViewSection__Group_2__0__Impl : ( 'title=' ) ;
    public final void rule__ViewSection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5911:1: ( ( 'title=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5912:1: ( 'title=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5912:1: ( 'title=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5913:1: 'title='
            {
             before(grammarAccess.getViewSectionAccess().getTitleKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__ViewSection__Group_2__0__Impl11863); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5926:1: rule__ViewSection__Group_2__1 : rule__ViewSection__Group_2__1__Impl ;
    public final void rule__ViewSection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5930:1: ( rule__ViewSection__Group_2__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5931:2: rule__ViewSection__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewSection__Group_2__1__Impl_in_rule__ViewSection__Group_2__111894);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5937:1: rule__ViewSection__Group_2__1__Impl : ( ( rule__ViewSection__TitleAssignment_2_1 ) ) ;
    public final void rule__ViewSection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5941:1: ( ( ( rule__ViewSection__TitleAssignment_2_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5942:1: ( ( rule__ViewSection__TitleAssignment_2_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5942:1: ( ( rule__ViewSection__TitleAssignment_2_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5943:1: ( rule__ViewSection__TitleAssignment_2_1 )
            {
             before(grammarAccess.getViewSectionAccess().getTitleAssignment_2_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5944:1: ( rule__ViewSection__TitleAssignment_2_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5944:2: rule__ViewSection__TitleAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ViewSection__TitleAssignment_2_1_in_rule__ViewSection__Group_2__1__Impl11921);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5958:1: rule__SectionCell__Group__0 : rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1 ;
    public final void rule__SectionCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5962:1: ( rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5963:2: rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__0__Impl_in_rule__SectionCell__Group__011955);
            rule__SectionCell__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__1_in_rule__SectionCell__Group__011958);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5970:1: rule__SectionCell__Group__0__Impl : ( 'cell' ) ;
    public final void rule__SectionCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5974:1: ( ( 'cell' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5975:1: ( 'cell' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5975:1: ( 'cell' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5976:1: 'cell'
            {
             before(grammarAccess.getSectionCellAccess().getCellKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__SectionCell__Group__0__Impl11986); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5989:1: rule__SectionCell__Group__1 : rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2 ;
    public final void rule__SectionCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5993:1: ( rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:5994:2: rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__1__Impl_in_rule__SectionCell__Group__112017);
            rule__SectionCell__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__2_in_rule__SectionCell__Group__112020);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6001:1: rule__SectionCell__Group__1__Impl : ( ( rule__SectionCell__TypeAssignment_1 ) ) ;
    public final void rule__SectionCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6005:1: ( ( ( rule__SectionCell__TypeAssignment_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6006:1: ( ( rule__SectionCell__TypeAssignment_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6006:1: ( ( rule__SectionCell__TypeAssignment_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6007:1: ( rule__SectionCell__TypeAssignment_1 )
            {
             before(grammarAccess.getSectionCellAccess().getTypeAssignment_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6008:1: ( rule__SectionCell__TypeAssignment_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6008:2: rule__SectionCell__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__SectionCell__TypeAssignment_1_in_rule__SectionCell__Group__1__Impl12047);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6018:1: rule__SectionCell__Group__2 : rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3 ;
    public final void rule__SectionCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6022:1: ( rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6023:2: rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__2__Impl_in_rule__SectionCell__Group__212077);
            rule__SectionCell__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__3_in_rule__SectionCell__Group__212080);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6030:1: rule__SectionCell__Group__2__Impl : ( ( rule__SectionCell__Group_2__0 )? ) ;
    public final void rule__SectionCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6034:1: ( ( ( rule__SectionCell__Group_2__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6035:1: ( ( rule__SectionCell__Group_2__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6035:1: ( ( rule__SectionCell__Group_2__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6036:1: ( rule__SectionCell__Group_2__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6037:1: ( rule__SectionCell__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==52) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6037:2: rule__SectionCell__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_2__0_in_rule__SectionCell__Group__2__Impl12107);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6047:1: rule__SectionCell__Group__3 : rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4 ;
    public final void rule__SectionCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6051:1: ( rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6052:2: rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__3__Impl_in_rule__SectionCell__Group__312138);
            rule__SectionCell__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__4_in_rule__SectionCell__Group__312141);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6059:1: rule__SectionCell__Group__3__Impl : ( '{' ) ;
    public final void rule__SectionCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6063:1: ( ( '{' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6064:1: ( '{' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6064:1: ( '{' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6065:1: '{'
            {
             before(grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__SectionCell__Group__3__Impl12169); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6078:1: rule__SectionCell__Group__4 : rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5 ;
    public final void rule__SectionCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6082:1: ( rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6083:2: rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__4__Impl_in_rule__SectionCell__Group__412200);
            rule__SectionCell__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__5_in_rule__SectionCell__Group__412203);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6090:1: rule__SectionCell__Group__4__Impl : ( ( rule__SectionCell__Group_4__0 )? ) ;
    public final void rule__SectionCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6094:1: ( ( ( rule__SectionCell__Group_4__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6095:1: ( ( rule__SectionCell__Group_4__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6095:1: ( ( rule__SectionCell__Group_4__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6096:1: ( rule__SectionCell__Group_4__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_4()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6097:1: ( rule__SectionCell__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6097:2: rule__SectionCell__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_4__0_in_rule__SectionCell__Group__4__Impl12230);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6107:1: rule__SectionCell__Group__5 : rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6 ;
    public final void rule__SectionCell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6111:1: ( rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6112:2: rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__5__Impl_in_rule__SectionCell__Group__512261);
            rule__SectionCell__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__6_in_rule__SectionCell__Group__512264);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6119:1: rule__SectionCell__Group__5__Impl : ( ( rule__SectionCell__Group_5__0 )? ) ;
    public final void rule__SectionCell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6123:1: ( ( ( rule__SectionCell__Group_5__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6124:1: ( ( rule__SectionCell__Group_5__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6124:1: ( ( rule__SectionCell__Group_5__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6125:1: ( rule__SectionCell__Group_5__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_5()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6126:1: ( rule__SectionCell__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6126:2: rule__SectionCell__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_5__0_in_rule__SectionCell__Group__5__Impl12291);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6136:1: rule__SectionCell__Group__6 : rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7 ;
    public final void rule__SectionCell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6140:1: ( rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6141:2: rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__6__Impl_in_rule__SectionCell__Group__612322);
            rule__SectionCell__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__7_in_rule__SectionCell__Group__612325);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6148:1: rule__SectionCell__Group__6__Impl : ( ( rule__SectionCell__Group_6__0 )? ) ;
    public final void rule__SectionCell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6152:1: ( ( ( rule__SectionCell__Group_6__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6153:1: ( ( rule__SectionCell__Group_6__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6153:1: ( ( rule__SectionCell__Group_6__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6154:1: ( rule__SectionCell__Group_6__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_6()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6155:1: ( rule__SectionCell__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6155:2: rule__SectionCell__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_6__0_in_rule__SectionCell__Group__6__Impl12352);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6165:1: rule__SectionCell__Group__7 : rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8 ;
    public final void rule__SectionCell__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6169:1: ( rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6170:2: rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__7__Impl_in_rule__SectionCell__Group__712383);
            rule__SectionCell__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__8_in_rule__SectionCell__Group__712386);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6177:1: rule__SectionCell__Group__7__Impl : ( ( rule__SectionCell__Group_7__0 )? ) ;
    public final void rule__SectionCell__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6181:1: ( ( ( rule__SectionCell__Group_7__0 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6182:1: ( ( rule__SectionCell__Group_7__0 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6182:1: ( ( rule__SectionCell__Group_7__0 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6183:1: ( rule__SectionCell__Group_7__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_7()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6184:1: ( rule__SectionCell__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6184:2: rule__SectionCell__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_7__0_in_rule__SectionCell__Group__7__Impl12413);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6194:1: rule__SectionCell__Group__8 : rule__SectionCell__Group__8__Impl ;
    public final void rule__SectionCell__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6198:1: ( rule__SectionCell__Group__8__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6199:2: rule__SectionCell__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__8__Impl_in_rule__SectionCell__Group__812444);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6205:1: rule__SectionCell__Group__8__Impl : ( '}' ) ;
    public final void rule__SectionCell__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6209:1: ( ( '}' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6210:1: ( '}' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6210:1: ( '}' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6211:1: '}'
            {
             before(grammarAccess.getSectionCellAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_28_in_rule__SectionCell__Group__8__Impl12472); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6242:1: rule__SectionCell__Group_2__0 : rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1 ;
    public final void rule__SectionCell__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6246:1: ( rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6247:2: rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_2__0__Impl_in_rule__SectionCell__Group_2__012521);
            rule__SectionCell__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_2__1_in_rule__SectionCell__Group_2__012524);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6254:1: rule__SectionCell__Group_2__0__Impl : ( 'foreach' ) ;
    public final void rule__SectionCell__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6258:1: ( ( 'foreach' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6259:1: ( 'foreach' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6259:1: ( 'foreach' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6260:1: 'foreach'
            {
             before(grammarAccess.getSectionCellAccess().getForeachKeyword_2_0()); 
            match(input,52,FOLLOW_52_in_rule__SectionCell__Group_2__0__Impl12552); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6273:1: rule__SectionCell__Group_2__1 : rule__SectionCell__Group_2__1__Impl ;
    public final void rule__SectionCell__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6277:1: ( rule__SectionCell__Group_2__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6278:2: rule__SectionCell__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_2__1__Impl_in_rule__SectionCell__Group_2__112583);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6284:1: rule__SectionCell__Group_2__1__Impl : ( ( rule__SectionCell__IteratorAssignment_2_1 ) ) ;
    public final void rule__SectionCell__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6288:1: ( ( ( rule__SectionCell__IteratorAssignment_2_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6289:1: ( ( rule__SectionCell__IteratorAssignment_2_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6289:1: ( ( rule__SectionCell__IteratorAssignment_2_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6290:1: ( rule__SectionCell__IteratorAssignment_2_1 )
            {
             before(grammarAccess.getSectionCellAccess().getIteratorAssignment_2_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6291:1: ( rule__SectionCell__IteratorAssignment_2_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6291:2: rule__SectionCell__IteratorAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SectionCell__IteratorAssignment_2_1_in_rule__SectionCell__Group_2__1__Impl12610);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6305:1: rule__SectionCell__Group_4__0 : rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1 ;
    public final void rule__SectionCell__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6309:1: ( rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6310:2: rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_4__0__Impl_in_rule__SectionCell__Group_4__012644);
            rule__SectionCell__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_4__1_in_rule__SectionCell__Group_4__012647);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6317:1: rule__SectionCell__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__SectionCell__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6321:1: ( ( 'text=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6322:1: ( 'text=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6322:1: ( 'text=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6323:1: 'text='
            {
             before(grammarAccess.getSectionCellAccess().getTextKeyword_4_0()); 
            match(input,53,FOLLOW_53_in_rule__SectionCell__Group_4__0__Impl12675); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6336:1: rule__SectionCell__Group_4__1 : rule__SectionCell__Group_4__1__Impl ;
    public final void rule__SectionCell__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6340:1: ( rule__SectionCell__Group_4__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6341:2: rule__SectionCell__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_4__1__Impl_in_rule__SectionCell__Group_4__112706);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6347:1: rule__SectionCell__Group_4__1__Impl : ( ( rule__SectionCell__TextAssignment_4_1 ) ) ;
    public final void rule__SectionCell__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6351:1: ( ( ( rule__SectionCell__TextAssignment_4_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6352:1: ( ( rule__SectionCell__TextAssignment_4_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6352:1: ( ( rule__SectionCell__TextAssignment_4_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6353:1: ( rule__SectionCell__TextAssignment_4_1 )
            {
             before(grammarAccess.getSectionCellAccess().getTextAssignment_4_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6354:1: ( rule__SectionCell__TextAssignment_4_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6354:2: rule__SectionCell__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SectionCell__TextAssignment_4_1_in_rule__SectionCell__Group_4__1__Impl12733);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6368:1: rule__SectionCell__Group_5__0 : rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1 ;
    public final void rule__SectionCell__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6372:1: ( rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6373:2: rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_5__0__Impl_in_rule__SectionCell__Group_5__012767);
            rule__SectionCell__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_5__1_in_rule__SectionCell__Group_5__012770);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6380:1: rule__SectionCell__Group_5__0__Impl : ( 'details=' ) ;
    public final void rule__SectionCell__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6384:1: ( ( 'details=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6385:1: ( 'details=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6385:1: ( 'details=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6386:1: 'details='
            {
             before(grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0()); 
            match(input,48,FOLLOW_48_in_rule__SectionCell__Group_5__0__Impl12798); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6399:1: rule__SectionCell__Group_5__1 : rule__SectionCell__Group_5__1__Impl ;
    public final void rule__SectionCell__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6403:1: ( rule__SectionCell__Group_5__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6404:2: rule__SectionCell__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_5__1__Impl_in_rule__SectionCell__Group_5__112829);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6410:1: rule__SectionCell__Group_5__1__Impl : ( ( rule__SectionCell__DetailsAssignment_5_1 ) ) ;
    public final void rule__SectionCell__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6414:1: ( ( ( rule__SectionCell__DetailsAssignment_5_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6415:1: ( ( rule__SectionCell__DetailsAssignment_5_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6415:1: ( ( rule__SectionCell__DetailsAssignment_5_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6416:1: ( rule__SectionCell__DetailsAssignment_5_1 )
            {
             before(grammarAccess.getSectionCellAccess().getDetailsAssignment_5_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6417:1: ( rule__SectionCell__DetailsAssignment_5_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6417:2: rule__SectionCell__DetailsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__SectionCell__DetailsAssignment_5_1_in_rule__SectionCell__Group_5__1__Impl12856);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6431:1: rule__SectionCell__Group_6__0 : rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1 ;
    public final void rule__SectionCell__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6435:1: ( rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6436:2: rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_6__0__Impl_in_rule__SectionCell__Group_6__012890);
            rule__SectionCell__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_6__1_in_rule__SectionCell__Group_6__012893);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6443:1: rule__SectionCell__Group_6__0__Impl : ( 'image=' ) ;
    public final void rule__SectionCell__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6447:1: ( ( 'image=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6448:1: ( 'image=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6448:1: ( 'image=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6449:1: 'image='
            {
             before(grammarAccess.getSectionCellAccess().getImageKeyword_6_0()); 
            match(input,49,FOLLOW_49_in_rule__SectionCell__Group_6__0__Impl12921); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6462:1: rule__SectionCell__Group_6__1 : rule__SectionCell__Group_6__1__Impl ;
    public final void rule__SectionCell__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6466:1: ( rule__SectionCell__Group_6__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6467:2: rule__SectionCell__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_6__1__Impl_in_rule__SectionCell__Group_6__112952);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6473:1: rule__SectionCell__Group_6__1__Impl : ( ( rule__SectionCell__ImageAssignment_6_1 ) ) ;
    public final void rule__SectionCell__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6477:1: ( ( ( rule__SectionCell__ImageAssignment_6_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6478:1: ( ( rule__SectionCell__ImageAssignment_6_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6478:1: ( ( rule__SectionCell__ImageAssignment_6_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6479:1: ( rule__SectionCell__ImageAssignment_6_1 )
            {
             before(grammarAccess.getSectionCellAccess().getImageAssignment_6_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6480:1: ( rule__SectionCell__ImageAssignment_6_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6480:2: rule__SectionCell__ImageAssignment_6_1
            {
            pushFollow(FOLLOW_rule__SectionCell__ImageAssignment_6_1_in_rule__SectionCell__Group_6__1__Impl12979);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6494:1: rule__SectionCell__Group_7__0 : rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1 ;
    public final void rule__SectionCell__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6498:1: ( rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6499:2: rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_7__0__Impl_in_rule__SectionCell__Group_7__013013);
            rule__SectionCell__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_7__1_in_rule__SectionCell__Group_7__013016);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6506:1: rule__SectionCell__Group_7__0__Impl : ( 'action=' ) ;
    public final void rule__SectionCell__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6510:1: ( ( 'action=' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6511:1: ( 'action=' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6511:1: ( 'action=' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6512:1: 'action='
            {
             before(grammarAccess.getSectionCellAccess().getActionKeyword_7_0()); 
            match(input,54,FOLLOW_54_in_rule__SectionCell__Group_7__0__Impl13044); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6525:1: rule__SectionCell__Group_7__1 : rule__SectionCell__Group_7__1__Impl ;
    public final void rule__SectionCell__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6529:1: ( rule__SectionCell__Group_7__1__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6530:2: rule__SectionCell__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_7__1__Impl_in_rule__SectionCell__Group_7__113075);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6536:1: rule__SectionCell__Group_7__1__Impl : ( ( rule__SectionCell__ActionAssignment_7_1 ) ) ;
    public final void rule__SectionCell__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6540:1: ( ( ( rule__SectionCell__ActionAssignment_7_1 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6541:1: ( ( rule__SectionCell__ActionAssignment_7_1 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6541:1: ( ( rule__SectionCell__ActionAssignment_7_1 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6542:1: ( rule__SectionCell__ActionAssignment_7_1 )
            {
             before(grammarAccess.getSectionCellAccess().getActionAssignment_7_1()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6543:1: ( rule__SectionCell__ActionAssignment_7_1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6543:2: rule__SectionCell__ActionAssignment_7_1
            {
            pushFollow(FOLLOW_rule__SectionCell__ActionAssignment_7_1_in_rule__SectionCell__Group_7__1__Impl13102);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6557:1: rule__CollectionIterator__Group__0 : rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1 ;
    public final void rule__CollectionIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6561:1: ( rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6562:2: rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__0__Impl_in_rule__CollectionIterator__Group__013136);
            rule__CollectionIterator__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionIterator__Group__1_in_rule__CollectionIterator__Group__013139);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6569:1: rule__CollectionIterator__Group__0__Impl : ( ( rule__CollectionIterator__CollectionAssignment_0 ) ) ;
    public final void rule__CollectionIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6573:1: ( ( ( rule__CollectionIterator__CollectionAssignment_0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6574:1: ( ( rule__CollectionIterator__CollectionAssignment_0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6574:1: ( ( rule__CollectionIterator__CollectionAssignment_0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6575:1: ( rule__CollectionIterator__CollectionAssignment_0 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getCollectionAssignment_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6576:1: ( rule__CollectionIterator__CollectionAssignment_0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6576:2: rule__CollectionIterator__CollectionAssignment_0
            {
            pushFollow(FOLLOW_rule__CollectionIterator__CollectionAssignment_0_in_rule__CollectionIterator__Group__0__Impl13166);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6586:1: rule__CollectionIterator__Group__1 : rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2 ;
    public final void rule__CollectionIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6590:1: ( rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6591:2: rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__1__Impl_in_rule__CollectionIterator__Group__113196);
            rule__CollectionIterator__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionIterator__Group__2_in_rule__CollectionIterator__Group__113199);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6598:1: rule__CollectionIterator__Group__1__Impl : ( 'as' ) ;
    public final void rule__CollectionIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6602:1: ( ( 'as' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6603:1: ( 'as' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6603:1: ( 'as' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6604:1: 'as'
            {
             before(grammarAccess.getCollectionIteratorAccess().getAsKeyword_1()); 
            match(input,55,FOLLOW_55_in_rule__CollectionIterator__Group__1__Impl13227); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6617:1: rule__CollectionIterator__Group__2 : rule__CollectionIterator__Group__2__Impl ;
    public final void rule__CollectionIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6621:1: ( rule__CollectionIterator__Group__2__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6622:2: rule__CollectionIterator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__2__Impl_in_rule__CollectionIterator__Group__213258);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6628:1: rule__CollectionIterator__Group__2__Impl : ( ( rule__CollectionIterator__NameAssignment_2 ) ) ;
    public final void rule__CollectionIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6632:1: ( ( ( rule__CollectionIterator__NameAssignment_2 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6633:1: ( ( rule__CollectionIterator__NameAssignment_2 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6633:1: ( ( rule__CollectionIterator__NameAssignment_2 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6634:1: ( rule__CollectionIterator__NameAssignment_2 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getNameAssignment_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6635:1: ( rule__CollectionIterator__NameAssignment_2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6635:2: rule__CollectionIterator__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionIterator__NameAssignment_2_in_rule__CollectionIterator__Group__2__Impl13285);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6651:1: rule__ViewCall__Group__0 : rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1 ;
    public final void rule__ViewCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6655:1: ( rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6656:2: rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__0__Impl_in_rule__ViewCall__Group__013321);
            rule__ViewCall__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__1_in_rule__ViewCall__Group__013324);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6663:1: rule__ViewCall__Group__0__Impl : ( ( rule__ViewCall__ViewAssignment_0 ) ) ;
    public final void rule__ViewCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6667:1: ( ( ( rule__ViewCall__ViewAssignment_0 ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6668:1: ( ( rule__ViewCall__ViewAssignment_0 ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6668:1: ( ( rule__ViewCall__ViewAssignment_0 ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6669:1: ( rule__ViewCall__ViewAssignment_0 )
            {
             before(grammarAccess.getViewCallAccess().getViewAssignment_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6670:1: ( rule__ViewCall__ViewAssignment_0 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6670:2: rule__ViewCall__ViewAssignment_0
            {
            pushFollow(FOLLOW_rule__ViewCall__ViewAssignment_0_in_rule__ViewCall__Group__0__Impl13351);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6680:1: rule__ViewCall__Group__1 : rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2 ;
    public final void rule__ViewCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6684:1: ( rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6685:2: rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__1__Impl_in_rule__ViewCall__Group__113381);
            rule__ViewCall__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__2_in_rule__ViewCall__Group__113384);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6692:1: rule__ViewCall__Group__1__Impl : ( '(' ) ;
    public final void rule__ViewCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6696:1: ( ( '(' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6697:1: ( '(' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6697:1: ( '(' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6698:1: '('
            {
             before(grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ViewCall__Group__1__Impl13412); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6711:1: rule__ViewCall__Group__2 : rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3 ;
    public final void rule__ViewCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6715:1: ( rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3 )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6716:2: rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__2__Impl_in_rule__ViewCall__Group__213443);
            rule__ViewCall__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__3_in_rule__ViewCall__Group__213446);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6723:1: rule__ViewCall__Group__2__Impl : ( ( rule__ViewCall__ProviderAssignment_2 )? ) ;
    public final void rule__ViewCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6727:1: ( ( ( rule__ViewCall__ProviderAssignment_2 )? ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6728:1: ( ( rule__ViewCall__ProviderAssignment_2 )? )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6728:1: ( ( rule__ViewCall__ProviderAssignment_2 )? )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6729:1: ( rule__ViewCall__ProviderAssignment_2 )?
            {
             before(grammarAccess.getViewCallAccess().getProviderAssignment_2()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6730:1: ( rule__ViewCall__ProviderAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_STRING)||LA43_0==18||LA43_0==20||(LA43_0>=22 && LA43_0<=23)||LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6730:2: rule__ViewCall__ProviderAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ViewCall__ProviderAssignment_2_in_rule__ViewCall__Group__2__Impl13473);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6740:1: rule__ViewCall__Group__3 : rule__ViewCall__Group__3__Impl ;
    public final void rule__ViewCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6744:1: ( rule__ViewCall__Group__3__Impl )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6745:2: rule__ViewCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__3__Impl_in_rule__ViewCall__Group__313504);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6751:1: rule__ViewCall__Group__3__Impl : ( ')' ) ;
    public final void rule__ViewCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6755:1: ( ( ')' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6756:1: ( ')' )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6756:1: ( ')' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6757:1: ')'
            {
             before(grammarAccess.getViewCallAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__ViewCall__Group__3__Impl13532); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6779:1: rule__Model__ApplicationAssignment_0 : ( ruleApplication ) ;
    public final void rule__Model__ApplicationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6783:1: ( ( ruleApplication ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6784:1: ( ruleApplication )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6784:1: ( ruleApplication )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6785:1: ruleApplication
            {
             before(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__Model__ApplicationAssignment_013576);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6794:1: rule__Model__ElementsAssignment_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6798:1: ( ( ruleModelElement ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6799:1: ( ruleModelElement )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6799:1: ( ruleModelElement )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6800:1: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelElement_in_rule__Model__ElementsAssignment_113607);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6809:1: rule__TypeDescription__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDescription__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6813:1: ( ( ( RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6814:1: ( ( RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6814:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6815:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6816:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6817:1: RULE_ID
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDescription__TypeAssignment_013642); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6828:1: rule__TypeDescription__ManyAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeDescription__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6832:1: ( ( ( '[]' ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6833:1: ( ( '[]' ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6833:1: ( ( '[]' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6834:1: ( '[]' )
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6835:1: ( '[]' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6836:1: '[]'
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,56,FOLLOW_56_in_rule__TypeDescription__ManyAssignment_113682); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6851:1: rule__Parameter__DescriptionAssignment_0 : ( ruleTypeDescription ) ;
    public final void rule__Parameter__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6855:1: ( ( ruleTypeDescription ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6856:1: ( ruleTypeDescription )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6856:1: ( ruleTypeDescription )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6857:1: ruleTypeDescription
            {
             before(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_rule__Parameter__DescriptionAssignment_013721);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6866:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6870:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6871:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6871:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6872:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_113752); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6881:1: rule__ObjectReference__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectReference__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6885:1: ( ( ( RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6886:1: ( ( RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6886:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6887:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6888:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6889:1: RULE_ID
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectReference__ObjectAssignment_013787); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6900:1: rule__ObjectReference__TailAssignment_1 : ( ruleNestedObjectReference ) ;
    public final void rule__ObjectReference__TailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6904:1: ( ( ruleNestedObjectReference ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6905:1: ( ruleNestedObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6905:1: ( ruleNestedObjectReference )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6906:1: ruleNestedObjectReference
            {
             before(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_rule__ObjectReference__TailAssignment_113822);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6915:1: rule__NestedObjectReference__ObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NestedObjectReference__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6919:1: ( ( ( RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6920:1: ( ( RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6920:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6921:1: ( RULE_ID )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6922:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6923:1: RULE_ID
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NestedObjectReference__ObjectAssignment_113857); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6934:1: rule__NestedObjectReference__TailAssignment_2 : ( ruleNestedObjectReference ) ;
    public final void rule__NestedObjectReference__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6938:1: ( ( ruleNestedObjectReference ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6939:1: ( ruleNestedObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6939:1: ( ruleNestedObjectReference )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6940:1: ruleNestedObjectReference
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_rule__NestedObjectReference__TailAssignment_213892);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6949:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6953:1: ( ( RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6954:1: ( RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6954:1: ( RULE_STRING )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6955:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment13923); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6964:1: rule__StringFunction__ValuesAssignment_0_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValuesAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6968:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6969:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6969:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6970:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValuesAssignment_0_213954);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6979:1: rule__StringFunction__ValueAssignment_1_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6983:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6984:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6984:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6985:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_1_213985);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6994:1: rule__StringFunction__MatchAssignment_1_4 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__MatchAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6998:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6999:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:6999:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7000:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__MatchAssignment_1_414016);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7009:1: rule__StringFunction__ReplacementAssignment_1_6 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ReplacementAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7013:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7014:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7014:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7015:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ReplacementAssignment_1_614047);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7024:1: rule__StringFunction__ValueAssignment_2_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7028:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7029:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7029:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7030:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_2_214078);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7039:1: rule__CollectionLiteral__ItemsAssignment_1 : ( ruleScalarExpression ) ;
    public final void rule__CollectionLiteral__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7043:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7044:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7044:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7045:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_114109);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7054:1: rule__CollectionLiteral__ItemsAssignment_2_1 : ( ruleScalarExpression ) ;
    public final void rule__CollectionLiteral__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7058:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7059:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7059:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7060:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_2_114140);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7069:1: rule__CollectionFunction__ValueAssignment_2 : ( ruleScalarExpression ) ;
    public final void rule__CollectionFunction__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7073:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7074:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7074:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7075:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__ValueAssignment_214171);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7084:1: rule__CollectionFunction__DelimiterAssignment_4 : ( ruleScalarExpression ) ;
    public final void rule__CollectionFunction__DelimiterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7088:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7089:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7089:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7090:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__DelimiterAssignment_414202);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7099:1: rule__TabBarApplication__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TabBarApplication__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7103:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7104:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7104:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7105:1: RULE_ID
            {
             before(grammarAccess.getTabBarApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TabBarApplication__NameAssignment_114233); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7114:1: rule__TabBarApplication__ButtonsAssignment_3 : ( ruleTabbarButton ) ;
    public final void rule__TabBarApplication__ButtonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7118:1: ( ( ruleTabbarButton ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7119:1: ( ruleTabbarButton )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7119:1: ( ruleTabbarButton )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7120:1: ruleTabbarButton
            {
             before(grammarAccess.getTabBarApplicationAccess().getButtonsTabbarButtonParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTabbarButton_in_rule__TabBarApplication__ButtonsAssignment_314264);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7129:1: rule__TabbarButton__TitleAssignment_3 : ( ruleScalarExpression ) ;
    public final void rule__TabbarButton__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7133:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7134:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7134:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7135:1: ruleScalarExpression
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TabbarButton__TitleAssignment_314295);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7144:1: rule__TabbarButton__IconAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__TabbarButton__IconAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7148:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7149:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7149:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7150:1: ruleScalarExpression
            {
             before(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TabbarButton__IconAssignment_514326);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7159:1: rule__TabbarButton__ViewAssignment_7 : ( ruleViewCall ) ;
    public final void rule__TabbarButton__ViewAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7163:1: ( ( ruleViewCall ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7164:1: ( ruleViewCall )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7164:1: ( ruleViewCall )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7165:1: ruleViewCall
            {
             before(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleViewCall_in_rule__TabbarButton__ViewAssignment_714357);
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


    // $ANTLR start rule__SimpleType__NameAssignment_1
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7174:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7178:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7179:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7179:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7180:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_114388); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7189:1: rule__SimpleType__PlatformTypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SimpleType__PlatformTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7193:1: ( ( RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7194:1: ( RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7194:1: ( RULE_STRING )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7195:1: RULE_STRING
            {
             before(grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleType__PlatformTypeAssignment_314419); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7204:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7208:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7209:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7209:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7210:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_114450); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7219:1: rule__Entity__ExtendsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7223:1: ( ( ( RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7224:1: ( ( RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7224:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7225:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7226:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7227:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_114485); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7238:1: rule__Entity__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7242:1: ( ( ruleProperty ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7243:1: ( ruleProperty )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7243:1: ( ruleProperty )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7244:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_414520);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7253:1: rule__Property__DerivedAssignment_0 : ( ( 'derived' ) ) ;
    public final void rule__Property__DerivedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7257:1: ( ( ( 'derived' ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7258:1: ( ( 'derived' ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7258:1: ( ( 'derived' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7259:1: ( 'derived' )
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7260:1: ( 'derived' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7261:1: 'derived'
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 
            match(input,57,FOLLOW_57_in_rule__Property__DerivedAssignment_014556); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7276:1: rule__Property__DescriptionAssignment_1 : ( ruleTypeDescription ) ;
    public final void rule__Property__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7280:1: ( ( ruleTypeDescription ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7281:1: ( ruleTypeDescription )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7281:1: ( ruleTypeDescription )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7282:1: ruleTypeDescription
            {
             before(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_rule__Property__DescriptionAssignment_114595);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7291:1: rule__Property__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7295:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7296:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7296:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7297:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_214626); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7306:1: rule__ContentProvider__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContentProvider__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7310:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7311:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7311:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7312:1: RULE_ID
            {
             before(grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentProvider__NameAssignment_114657); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7321:1: rule__ContentProvider__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__ContentProvider__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7325:1: ( ( ruleParameter ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7326:1: ( ruleParameter )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7326:1: ( ruleParameter )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7327:1: ruleParameter
            {
             before(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ContentProvider__ParameterAssignment_2_114688);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7336:1: rule__ContentProvider__ResolverAssignment_3_1 : ( ( 'resolves' ) ) ;
    public final void rule__ContentProvider__ResolverAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7340:1: ( ( ( 'resolves' ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7341:1: ( ( 'resolves' ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7341:1: ( ( 'resolves' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7342:1: ( 'resolves' )
            {
             before(grammarAccess.getContentProviderAccess().getResolverResolvesKeyword_3_1_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7343:1: ( 'resolves' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7344:1: 'resolves'
            {
             before(grammarAccess.getContentProviderAccess().getResolverResolvesKeyword_3_1_0()); 
            match(input,58,FOLLOW_58_in_rule__ContentProvider__ResolverAssignment_3_114724); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7359:1: rule__ContentProvider__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ContentProvider__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7363:1: ( ( ( RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7364:1: ( ( RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7364:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7365:1: ( RULE_ID )
            {
             before(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7366:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7367:1: RULE_ID
            {
             before(grammarAccess.getContentProviderAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentProvider__TypeAssignment_414767); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7378:1: rule__ContentProvider__ManyAssignment_5 : ( ( '[]' ) ) ;
    public final void rule__ContentProvider__ManyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7382:1: ( ( ( '[]' ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7383:1: ( ( '[]' ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7383:1: ( ( '[]' ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7384:1: ( '[]' )
            {
             before(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7385:1: ( '[]' )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7386:1: '[]'
            {
             before(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            match(input,56,FOLLOW_56_in_rule__ContentProvider__ManyAssignment_514807); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7401:1: rule__ContentProvider__UrlAssignment_9 : ( ruleScalarExpression ) ;
    public final void rule__ContentProvider__UrlAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7405:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7406:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7406:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7407:1: ruleScalarExpression
            {
             before(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ContentProvider__UrlAssignment_914846);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7416:1: rule__ContentProvider__SelectionAssignment_11 : ( ruleScalarExpression ) ;
    public final void rule__ContentProvider__SelectionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7420:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7421:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7421:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7422:1: ruleScalarExpression
            {
             before(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ContentProvider__SelectionAssignment_1114877);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7431:1: rule__ProviderConstruction__ProviderAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProviderConstruction__ProviderAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7435:1: ( ( ( RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7436:1: ( ( RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7436:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7437:1: ( RULE_ID )
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7438:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7439:1: RULE_ID
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderContentProviderIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProviderConstruction__ProviderAssignment_0_114912); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7450:1: rule__ProviderConstruction__ArgumentAssignment_0_3 : ( ruleExpression ) ;
    public final void rule__ProviderConstruction__ArgumentAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7454:1: ( ( ruleExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7455:1: ( ruleExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7455:1: ( ruleExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7456:1: ruleExpression
            {
             before(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProviderConstruction__ArgumentAssignment_0_314947);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7465:1: rule__ProviderConstruction__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ProviderConstruction__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7469:1: ( ( ruleExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7470:1: ( ruleExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7470:1: ( ruleExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7471:1: ruleExpression
            {
             before(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProviderConstruction__ExpressionAssignment_1_114978);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7480:1: rule__TableView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TableView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7484:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7485:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7485:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7486:1: RULE_ID
            {
             before(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TableView__NameAssignment_115009); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7495:1: rule__TableView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__TableView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7499:1: ( ( ruleParameter ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7500:1: ( ruleParameter )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7500:1: ( ruleParameter )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7501:1: ruleParameter
            {
             before(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__TableView__ContentAssignment_2_115040);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7510:1: rule__TableView__TitleAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__TableView__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7514:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7515:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7515:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7516:1: ruleScalarExpression
            {
             before(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TableView__TitleAssignment_515071);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7525:1: rule__TableView__SectionsAssignment_6 : ( ruleViewSection ) ;
    public final void rule__TableView__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7529:1: ( ( ruleViewSection ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7530:1: ( ruleViewSection )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7530:1: ( ruleViewSection )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7531:1: ruleViewSection
            {
             before(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleViewSection_in_rule__TableView__SectionsAssignment_615102);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7540:1: rule__DetailsView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DetailsView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7544:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7545:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7545:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7546:1: RULE_ID
            {
             before(grammarAccess.getDetailsViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DetailsView__NameAssignment_115133); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7555:1: rule__DetailsView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__DetailsView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7559:1: ( ( ruleParameter ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7560:1: ( ruleParameter )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7560:1: ( ruleParameter )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7561:1: ruleParameter
            {
             before(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__DetailsView__ContentAssignment_2_115164);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7570:1: rule__DetailsView__TitleAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__DetailsView__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7574:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7575:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7575:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7576:1: ruleScalarExpression
            {
             before(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__DetailsView__TitleAssignment_515195);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7585:1: rule__DetailsView__HeaderAssignment_6 : ( ruleViewHeader ) ;
    public final void rule__DetailsView__HeaderAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7589:1: ( ( ruleViewHeader ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7590:1: ( ruleViewHeader )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7590:1: ( ruleViewHeader )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7591:1: ruleViewHeader
            {
             before(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleViewHeader_in_rule__DetailsView__HeaderAssignment_615226);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7600:1: rule__DetailsView__SectionsAssignment_7 : ( ruleViewSection ) ;
    public final void rule__DetailsView__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7604:1: ( ( ruleViewSection ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7605:1: ( ruleViewSection )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7605:1: ( ruleViewSection )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7606:1: ruleViewSection
            {
             before(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleViewSection_in_rule__DetailsView__SectionsAssignment_715257);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7615:1: rule__CustomView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7619:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7620:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7620:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7621:1: RULE_ID
            {
             before(grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomView__NameAssignment_115288); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7630:1: rule__CustomView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__CustomView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7634:1: ( ( ruleParameter ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7635:1: ( ruleParameter )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7635:1: ( ruleParameter )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7636:1: ruleParameter
            {
             before(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__CustomView__ContentAssignment_2_115319);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7645:1: rule__CustomView__ObjclassAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomView__ObjclassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7649:1: ( ( RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7650:1: ( RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7650:1: ( RULE_STRING )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7651:1: RULE_STRING
            {
             before(grammarAccess.getCustomViewAccess().getObjclassSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomView__ObjclassAssignment_415350); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7660:1: rule__ViewHeader__TitleAssignment_3_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7664:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7665:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7665:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7666:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__TitleAssignment_3_115381);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7675:1: rule__ViewHeader__SubtitleAssignment_4_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__SubtitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7679:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7680:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7680:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7681:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__SubtitleAssignment_4_115412);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7690:1: rule__ViewHeader__DetailsAssignment_5_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__DetailsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7694:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7695:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7695:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7696:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__DetailsAssignment_5_115443);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7705:1: rule__ViewHeader__ImageAssignment_6_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__ImageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7709:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7710:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7710:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7711:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__ImageAssignment_6_115474);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7720:1: rule__ViewSection__TitleAssignment_2_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewSection__TitleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7724:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7725:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7725:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7726:1: ruleScalarExpression
            {
             before(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewSection__TitleAssignment_2_115505);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7735:1: rule__ViewSection__CellsAssignment_3 : ( ruleSectionCell ) ;
    public final void rule__ViewSection__CellsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7739:1: ( ( ruleSectionCell ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7740:1: ( ruleSectionCell )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7740:1: ( ruleSectionCell )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7741:1: ruleSectionCell
            {
             before(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSectionCell_in_rule__ViewSection__CellsAssignment_315536);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7750:1: rule__SectionCell__TypeAssignment_1 : ( ruleCellType ) ;
    public final void rule__SectionCell__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7754:1: ( ( ruleCellType ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7755:1: ( ruleCellType )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7755:1: ( ruleCellType )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7756:1: ruleCellType
            {
             before(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCellType_in_rule__SectionCell__TypeAssignment_115567);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7765:1: rule__SectionCell__IteratorAssignment_2_1 : ( ruleCollectionIterator ) ;
    public final void rule__SectionCell__IteratorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7769:1: ( ( ruleCollectionIterator ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7770:1: ( ruleCollectionIterator )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7770:1: ( ruleCollectionIterator )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7771:1: ruleCollectionIterator
            {
             before(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_rule__SectionCell__IteratorAssignment_2_115598);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7780:1: rule__SectionCell__TextAssignment_4_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7784:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7785:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7785:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7786:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__TextAssignment_4_115629);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7795:1: rule__SectionCell__DetailsAssignment_5_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__DetailsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7799:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7800:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7800:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7801:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__DetailsAssignment_5_115660);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7810:1: rule__SectionCell__ImageAssignment_6_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__ImageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7814:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7815:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7815:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7816:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__ImageAssignment_6_115691);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7825:1: rule__SectionCell__ActionAssignment_7_1 : ( ruleViewAction ) ;
    public final void rule__SectionCell__ActionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7829:1: ( ( ruleViewAction ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7830:1: ( ruleViewAction )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7830:1: ( ruleViewAction )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7831:1: ruleViewAction
            {
             before(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleViewAction_in_rule__SectionCell__ActionAssignment_7_115722);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7840:1: rule__CollectionIterator__CollectionAssignment_0 : ( ruleCollectionExpression ) ;
    public final void rule__CollectionIterator__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7844:1: ( ( ruleCollectionExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7845:1: ( ruleCollectionExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7845:1: ( ruleCollectionExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7846:1: ruleCollectionExpression
            {
             before(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_rule__CollectionIterator__CollectionAssignment_015753);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7855:1: rule__CollectionIterator__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CollectionIterator__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7859:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7860:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7860:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7861:1: RULE_ID
            {
             before(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionIterator__NameAssignment_215784); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7870:1: rule__ExternalOpen__UrlAssignment : ( ruleScalarExpression ) ;
    public final void rule__ExternalOpen__UrlAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7874:1: ( ( ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7875:1: ( ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7875:1: ( ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7876:1: ruleScalarExpression
            {
             before(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ExternalOpen__UrlAssignment15815);
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7885:1: rule__ViewCall__ViewAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ViewCall__ViewAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7889:1: ( ( ( RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7890:1: ( ( RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7890:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7891:1: ( RULE_ID )
            {
             before(grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0()); 
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7892:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7893:1: RULE_ID
            {
             before(grammarAccess.getViewCallAccess().getViewViewIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ViewCall__ViewAssignment_015850); 
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
    // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7904:1: rule__ViewCall__ProviderAssignment_2 : ( ruleProviderConstruction ) ;
    public final void rule__ViewCall__ProviderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7908:1: ( ( ruleProviderConstruction ) )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7909:1: ( ruleProviderConstruction )
            {
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7909:1: ( ruleProviderConstruction )
            // ../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g:7910:1: ruleProviderConstruction
            {
             before(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_rule__ViewCall__ProviderAssignment_215885);
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
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__0_in_ruleContentProvider1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderConstruction1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Alternatives_in_ruleProviderConstruction1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Alternatives_in_ruleView1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_entryRuleSectionedView1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionedView1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionedView__Alternatives_in_ruleSectionedView1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__0_in_ruleTableView1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_entryRuleDetailsView1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailsView1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__0_in_ruleDetailsView1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__0_in_ruleCustomView1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_entryRuleViewHeader1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewHeader1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__0_in_ruleViewHeader1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_entryRuleViewSection1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewSection1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__0_in_ruleViewSection1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_entryRuleSectionCell1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionCell1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__0_in_ruleSectionCell1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__0_in_ruleCollectionIterator1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewAction__Alternatives_in_ruleViewAction1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalOpen__UrlAssignment_in_ruleExternalOpen2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__0_in_ruleViewCall2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellType__Alternatives_in_ruleCellType2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ModelElement__Alternatives2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_rule__ModelElement__Alternatives2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__ModelElement__Alternatives2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_rule__Expression__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_rule__Expression__Alternatives2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_rule__Expression__Alternatives2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__Expression__Alternatives2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__ScalarExpression__Alternatives2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_rule__ScalarExpression__Alternatives2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__ScalarExpression__Alternatives2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_rule__CollectionExpression__Alternatives2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_rule__CollectionExpression__Alternatives2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__CollectionExpression__Alternatives2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__0_in_rule__StringFunction__Alternatives2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__0_in_rule__StringFunction__Alternatives2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__0_in_rule__StringFunction__Alternatives2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ContentProvider__Alternatives_32565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__ResolverAssignment_3_1_in_rule__ContentProvider__Alternatives_32584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__0_in_rule__ProviderConstruction__Alternatives2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__0_in_rule__ProviderConstruction__Alternatives2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_rule__View__Alternatives2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_rule__View__Alternatives2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_rule__SectionedView__Alternatives2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_rule__SectionedView__Alternatives2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_rule__ViewAction__Alternatives2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_rule__ViewAction__Alternatives2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CellType__Alternatives2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CellType__Alternatives2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CellType__Alternatives2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CellType__Alternatives2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CellType__Alternatives2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02933 = new BitSet(new long[]{0x00001C2A00000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ApplicationAssignment_0_in_rule__Model__Group__0__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl3020 = new BitSet(new long[]{0x00001C2A00000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__0__Impl_in_rule__TypeDescription__Group__03055 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__1_in_rule__TypeDescription__Group__03058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__TypeAssignment_0_in_rule__TypeDescription__Group__0__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__1__Impl_in_rule__TypeDescription__Group__13115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__ManyAssignment_1_in_rule__TypeDescription__Group__1__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DescriptionAssignment_0_in_rule__Parameter__Group__0__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__0__Impl_in_rule__ObjectReference__Group__03298 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__1_in_rule__ObjectReference__Group__03301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__ObjectAssignment_0_in_rule__ObjectReference__Group__0__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__1__Impl_in_rule__ObjectReference__Group__13358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__TailAssignment_1_in_rule__ObjectReference__Group__1__Impl3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__0__Impl_in_rule__NestedObjectReference__Group__03420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__1_in_rule__NestedObjectReference__Group__03423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NestedObjectReference__Group__0__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__1__Impl_in_rule__NestedObjectReference__Group__13482 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__2_in_rule__NestedObjectReference__Group__13485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__ObjectAssignment_1_in_rule__NestedObjectReference__Group__1__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__2__Impl_in_rule__NestedObjectReference__Group__23542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__TailAssignment_2_in_rule__NestedObjectReference__Group__2__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__0__Impl_in_rule__StringFunction__Group_0__03606 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__1_in_rule__StringFunction__Group_0__03609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__1__Impl_in_rule__StringFunction__Group_0__13667 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__2_in_rule__StringFunction__Group_0__13670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringFunction__Group_0__1__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__2__Impl_in_rule__StringFunction__Group_0__23729 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__3_in_rule__StringFunction__Group_0__23732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3761 = new BitSet(new long[]{0x0000000000540032L});
    public static final BitSet FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3773 = new BitSet(new long[]{0x0000000000540032L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__3__Impl_in_rule__StringFunction__Group_0__33806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringFunction__Group_0__3__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__0__Impl_in_rule__StringFunction__Group_1__03873 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__1_in_rule__StringFunction__Group_1__03876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__1__Impl_in_rule__StringFunction__Group_1__13934 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__2_in_rule__StringFunction__Group_1__13937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StringFunction__Group_1__1__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__2__Impl_in_rule__StringFunction__Group_1__23996 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__3_in_rule__StringFunction__Group_1__23999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValueAssignment_1_2_in_rule__StringFunction__Group_1__2__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__3__Impl_in_rule__StringFunction__Group_1__34056 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__4_in_rule__StringFunction__Group_1__34059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringFunction__Group_1__3__Impl4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__4__Impl_in_rule__StringFunction__Group_1__44118 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__5_in_rule__StringFunction__Group_1__44121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__MatchAssignment_1_4_in_rule__StringFunction__Group_1__4__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__5__Impl_in_rule__StringFunction__Group_1__54178 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__6_in_rule__StringFunction__Group_1__54181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringFunction__Group_1__5__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__6__Impl_in_rule__StringFunction__Group_1__64240 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__7_in_rule__StringFunction__Group_1__64243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ReplacementAssignment_1_6_in_rule__StringFunction__Group_1__6__Impl4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__7__Impl_in_rule__StringFunction__Group_1__74300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringFunction__Group_1__7__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__0__Impl_in_rule__StringFunction__Group_2__04375 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__1_in_rule__StringFunction__Group_2__04378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__1__Impl_in_rule__StringFunction__Group_2__14436 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__2_in_rule__StringFunction__Group_2__14439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StringFunction__Group_2__1__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__2__Impl_in_rule__StringFunction__Group_2__24498 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__3_in_rule__StringFunction__Group_2__24501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValueAssignment_2_2_in_rule__StringFunction__Group_2__2__Impl4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__3__Impl_in_rule__StringFunction__Group_2__34558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringFunction__Group_2__3__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__0__Impl_in_rule__CollectionLiteral__Group__04625 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__1_in_rule__CollectionLiteral__Group__04628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionLiteral__Group__0__Impl4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__1__Impl_in_rule__CollectionLiteral__Group__14687 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__2_in_rule__CollectionLiteral__Group__14690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__ItemsAssignment_1_in_rule__CollectionLiteral__Group__1__Impl4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__2__Impl_in_rule__CollectionLiteral__Group__24747 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__3_in_rule__CollectionLiteral__Group__24750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__0_in_rule__CollectionLiteral__Group__2__Impl4777 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__3__Impl_in_rule__CollectionLiteral__Group__34808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CollectionLiteral__Group__3__Impl4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__0__Impl_in_rule__CollectionLiteral__Group_2__04875 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__1_in_rule__CollectionLiteral__Group_2__04878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CollectionLiteral__Group_2__0__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__1__Impl_in_rule__CollectionLiteral__Group_2__14937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__ItemsAssignment_2_1_in_rule__CollectionLiteral__Group_2__1__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__0__Impl_in_rule__CollectionFunction__Group__04998 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__1_in_rule__CollectionFunction__Group__05001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__1__Impl_in_rule__CollectionFunction__Group__15059 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__2_in_rule__CollectionFunction__Group__15062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionFunction__Group__1__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__2__Impl_in_rule__CollectionFunction__Group__25121 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__3_in_rule__CollectionFunction__Group__25124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__ValueAssignment_2_in_rule__CollectionFunction__Group__2__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__3__Impl_in_rule__CollectionFunction__Group__35181 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__4_in_rule__CollectionFunction__Group__35184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CollectionFunction__Group__3__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__4__Impl_in_rule__CollectionFunction__Group__45243 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__5_in_rule__CollectionFunction__Group__45246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__DelimiterAssignment_4_in_rule__CollectionFunction__Group__4__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__5__Impl_in_rule__CollectionFunction__Group__55303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CollectionFunction__Group__5__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__0__Impl_in_rule__TabBarApplication__Group__05374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__1_in_rule__TabBarApplication__Group__05377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TabBarApplication__Group__0__Impl5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__1__Impl_in_rule__TabBarApplication__Group__15436 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__2_in_rule__TabBarApplication__Group__15439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__NameAssignment_1_in_rule__TabBarApplication__Group__1__Impl5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__2__Impl_in_rule__TabBarApplication__Group__25496 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__3_in_rule__TabBarApplication__Group__25499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TabBarApplication__Group__2__Impl5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__3__Impl_in_rule__TabBarApplication__Group__35558 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__4_in_rule__TabBarApplication__Group__35561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__ButtonsAssignment_3_in_rule__TabBarApplication__Group__3__Impl5588 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__4__Impl_in_rule__TabBarApplication__Group__45619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TabBarApplication__Group__4__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__0__Impl_in_rule__TabbarButton__Group__05688 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__1_in_rule__TabbarButton__Group__05691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TabbarButton__Group__0__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__1__Impl_in_rule__TabbarButton__Group__15750 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__2_in_rule__TabbarButton__Group__15753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TabbarButton__Group__1__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__2__Impl_in_rule__TabbarButton__Group__25812 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__3_in_rule__TabbarButton__Group__25815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TabbarButton__Group__2__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__3__Impl_in_rule__TabbarButton__Group__35874 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__4_in_rule__TabbarButton__Group__35877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__TitleAssignment_3_in_rule__TabbarButton__Group__3__Impl5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__4__Impl_in_rule__TabbarButton__Group__45934 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__5_in_rule__TabbarButton__Group__45937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TabbarButton__Group__4__Impl5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__5__Impl_in_rule__TabbarButton__Group__55996 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__6_in_rule__TabbarButton__Group__55999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__IconAssignment_5_in_rule__TabbarButton__Group__5__Impl6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__6__Impl_in_rule__TabbarButton__Group__66056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__7_in_rule__TabbarButton__Group__66059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TabbarButton__Group__6__Impl6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__7__Impl_in_rule__TabbarButton__Group__76118 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__8_in_rule__TabbarButton__Group__76121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__ViewAssignment_7_in_rule__TabbarButton__Group__7__Impl6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__8__Impl_in_rule__TabbarButton__Group__86178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TabbarButton__Group__8__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__06255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__06258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SimpleType__Group__0__Impl6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__16317 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__16320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__26377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__3_in_rule__SimpleType__Group__26380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SimpleType__Group__2__Impl6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__3__Impl_in_rule__SimpleType__Group__36439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__PlatformTypeAssignment_3_in_rule__SimpleType__Group__3__Impl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Entity__Group__0__Impl6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16566 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26626 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__36687 = new BitSet(new long[]{0x0200000010000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__36690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Entity__Group__3__Impl6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__46749 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__46752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__4__Impl6779 = new BitSet(new long[]{0x0200000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__56810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Entity__Group__5__Impl6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__06881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__06884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Entity__Group_2__0__Impl6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__16943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__1__Impl6970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DerivedAssignment_0_in_rule__Property__Group__0__Impl7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_1_in_rule__Property__Group__1__Impl7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__0__Impl_in_rule__ContentProvider__Group__07188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__1_in_rule__ContentProvider__Group__07191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ContentProvider__Group__0__Impl7219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__1__Impl_in_rule__ContentProvider__Group__17250 = new BitSet(new long[]{0x0400000000040800L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__2_in_rule__ContentProvider__Group__17253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__NameAssignment_1_in_rule__ContentProvider__Group__1__Impl7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__2__Impl_in_rule__ContentProvider__Group__27310 = new BitSet(new long[]{0x0400000000000800L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__3_in_rule__ContentProvider__Group__27313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__0_in_rule__ContentProvider__Group__2__Impl7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__3__Impl_in_rule__ContentProvider__Group__37371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__4_in_rule__ContentProvider__Group__37374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Alternatives_3_in_rule__ContentProvider__Group__3__Impl7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__4__Impl_in_rule__ContentProvider__Group__47431 = new BitSet(new long[]{0x0100004000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__5_in_rule__ContentProvider__Group__47434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__TypeAssignment_4_in_rule__ContentProvider__Group__4__Impl7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__5__Impl_in_rule__ContentProvider__Group__57491 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__6_in_rule__ContentProvider__Group__57494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__ManyAssignment_5_in_rule__ContentProvider__Group__5__Impl7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__6__Impl_in_rule__ContentProvider__Group__67552 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__7_in_rule__ContentProvider__Group__67555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ContentProvider__Group__6__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__7__Impl_in_rule__ContentProvider__Group__77614 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__8_in_rule__ContentProvider__Group__77617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ContentProvider__Group__7__Impl7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__8__Impl_in_rule__ContentProvider__Group__87676 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__9_in_rule__ContentProvider__Group__87679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ContentProvider__Group__8__Impl7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__9__Impl_in_rule__ContentProvider__Group__97738 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__10_in_rule__ContentProvider__Group__97741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__UrlAssignment_9_in_rule__ContentProvider__Group__9__Impl7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__10__Impl_in_rule__ContentProvider__Group__107798 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__11_in_rule__ContentProvider__Group__107801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ContentProvider__Group__10__Impl7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__11__Impl_in_rule__ContentProvider__Group__117860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__SelectionAssignment_11_in_rule__ContentProvider__Group__11__Impl7887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__0__Impl_in_rule__ContentProvider__Group_2__07941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__1_in_rule__ContentProvider__Group_2__07944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ContentProvider__Group_2__0__Impl7972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__1__Impl_in_rule__ContentProvider__Group_2__18003 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__2_in_rule__ContentProvider__Group_2__18006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__ParameterAssignment_2_1_in_rule__ContentProvider__Group_2__1__Impl8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__2__Impl_in_rule__ContentProvider__Group_2__28063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ContentProvider__Group_2__2__Impl8091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__0__Impl_in_rule__ProviderConstruction__Group_0__08128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__1_in_rule__ProviderConstruction__Group_0__08131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__1__Impl_in_rule__ProviderConstruction__Group_0__18189 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__2_in_rule__ProviderConstruction__Group_0__18192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ProviderAssignment_0_1_in_rule__ProviderConstruction__Group_0__1__Impl8219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__2__Impl_in_rule__ProviderConstruction__Group_0__28249 = new BitSet(new long[]{0x0000000002DC0030L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__3_in_rule__ProviderConstruction__Group_0__28252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProviderConstruction__Group_0__2__Impl8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__3__Impl_in_rule__ProviderConstruction__Group_0__38311 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__4_in_rule__ProviderConstruction__Group_0__38314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ArgumentAssignment_0_3_in_rule__ProviderConstruction__Group_0__3__Impl8341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__4__Impl_in_rule__ProviderConstruction__Group_0__48372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProviderConstruction__Group_0__4__Impl8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__0__Impl_in_rule__ProviderConstruction__Group_1__08441 = new BitSet(new long[]{0x0000000002D40030L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__1_in_rule__ProviderConstruction__Group_1__08444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__1__Impl_in_rule__ProviderConstruction__Group_1__18502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ExpressionAssignment_1_1_in_rule__ProviderConstruction__Group_1__1__Impl8529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__0__Impl_in_rule__TableView__Group__08563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableView__Group__1_in_rule__TableView__Group__08566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TableView__Group__0__Impl8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__1__Impl_in_rule__TableView__Group__18625 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_rule__TableView__Group__2_in_rule__TableView__Group__18628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__NameAssignment_1_in_rule__TableView__Group__1__Impl8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__2__Impl_in_rule__TableView__Group__28685 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__3_in_rule__TableView__Group__28688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__0_in_rule__TableView__Group__2__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__3__Impl_in_rule__TableView__Group__38746 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__4_in_rule__TableView__Group__38749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TableView__Group__3__Impl8777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__4__Impl_in_rule__TableView__Group__48808 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__TableView__Group__5_in_rule__TableView__Group__48811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TableView__Group__4__Impl8839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__5__Impl_in_rule__TableView__Group__58870 = new BitSet(new long[]{0x0004000010000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__6_in_rule__TableView__Group__58873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__TitleAssignment_5_in_rule__TableView__Group__5__Impl8900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__6__Impl_in_rule__TableView__Group__68930 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__7_in_rule__TableView__Group__68933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__SectionsAssignment_6_in_rule__TableView__Group__6__Impl8960 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__7__Impl_in_rule__TableView__Group__78991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TableView__Group__7__Impl9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__0__Impl_in_rule__TableView__Group_2__09066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__1_in_rule__TableView__Group_2__09069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TableView__Group_2__0__Impl9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__1__Impl_in_rule__TableView__Group_2__19128 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__2_in_rule__TableView__Group_2__19131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__ContentAssignment_2_1_in_rule__TableView__Group_2__1__Impl9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__2__Impl_in_rule__TableView__Group_2__29188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TableView__Group_2__2__Impl9216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__0__Impl_in_rule__DetailsView__Group__09253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__1_in_rule__DetailsView__Group__09256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DetailsView__Group__0__Impl9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__1__Impl_in_rule__DetailsView__Group__19315 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__2_in_rule__DetailsView__Group__19318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__NameAssignment_1_in_rule__DetailsView__Group__1__Impl9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__2__Impl_in_rule__DetailsView__Group__29375 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__3_in_rule__DetailsView__Group__29378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__0_in_rule__DetailsView__Group__2__Impl9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__3__Impl_in_rule__DetailsView__Group__39436 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__4_in_rule__DetailsView__Group__39439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DetailsView__Group__3__Impl9467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__4__Impl_in_rule__DetailsView__Group__49498 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__5_in_rule__DetailsView__Group__49501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DetailsView__Group__4__Impl9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__5__Impl_in_rule__DetailsView__Group__59560 = new BitSet(new long[]{0x0004400010000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__6_in_rule__DetailsView__Group__59563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__TitleAssignment_5_in_rule__DetailsView__Group__5__Impl9590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__6__Impl_in_rule__DetailsView__Group__69620 = new BitSet(new long[]{0x0004000010000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__7_in_rule__DetailsView__Group__69623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__HeaderAssignment_6_in_rule__DetailsView__Group__6__Impl9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__7__Impl_in_rule__DetailsView__Group__79681 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__8_in_rule__DetailsView__Group__79684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__SectionsAssignment_7_in_rule__DetailsView__Group__7__Impl9711 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__8__Impl_in_rule__DetailsView__Group__89742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DetailsView__Group__8__Impl9770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__0__Impl_in_rule__DetailsView__Group_2__09819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__1_in_rule__DetailsView__Group_2__09822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DetailsView__Group_2__0__Impl9850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__1__Impl_in_rule__DetailsView__Group_2__19881 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__2_in_rule__DetailsView__Group_2__19884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__ContentAssignment_2_1_in_rule__DetailsView__Group_2__1__Impl9911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__2__Impl_in_rule__DetailsView__Group_2__29941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DetailsView__Group_2__2__Impl9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__0__Impl_in_rule__CustomView__Group__010006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomView__Group__1_in_rule__CustomView__Group__010009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__CustomView__Group__0__Impl10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__1__Impl_in_rule__CustomView__Group__110068 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_rule__CustomView__Group__2_in_rule__CustomView__Group__110071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__NameAssignment_1_in_rule__CustomView__Group__1__Impl10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__2__Impl_in_rule__CustomView__Group__210128 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__CustomView__Group__3_in_rule__CustomView__Group__210131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__0_in_rule__CustomView__Group__2__Impl10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__3__Impl_in_rule__CustomView__Group__310189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomView__Group__4_in_rule__CustomView__Group__310192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__CustomView__Group__3__Impl10220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__4__Impl_in_rule__CustomView__Group__410251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__ObjclassAssignment_4_in_rule__CustomView__Group__4__Impl10278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__0__Impl_in_rule__CustomView__Group_2__010318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__1_in_rule__CustomView__Group_2__010321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CustomView__Group_2__0__Impl10349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__1__Impl_in_rule__CustomView__Group_2__110380 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__2_in_rule__CustomView__Group_2__110383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__ContentAssignment_2_1_in_rule__CustomView__Group_2__1__Impl10410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__2__Impl_in_rule__CustomView__Group_2__210440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CustomView__Group_2__2__Impl10468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__0__Impl_in_rule__ViewHeader__Group__010505 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__1_in_rule__ViewHeader__Group__010508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__1__Impl_in_rule__ViewHeader__Group__110566 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__2_in_rule__ViewHeader__Group__110569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ViewHeader__Group__1__Impl10597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__2__Impl_in_rule__ViewHeader__Group__210628 = new BitSet(new long[]{0x0003800050000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__3_in_rule__ViewHeader__Group__210631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewHeader__Group__2__Impl10659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__3__Impl_in_rule__ViewHeader__Group__310690 = new BitSet(new long[]{0x0003800010000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__4_in_rule__ViewHeader__Group__310693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__0_in_rule__ViewHeader__Group__3__Impl10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__4__Impl_in_rule__ViewHeader__Group__410751 = new BitSet(new long[]{0x0003000010000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__5_in_rule__ViewHeader__Group__410754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__0_in_rule__ViewHeader__Group__4__Impl10781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__5__Impl_in_rule__ViewHeader__Group__510812 = new BitSet(new long[]{0x0002000010000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__6_in_rule__ViewHeader__Group__510815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__0_in_rule__ViewHeader__Group__5__Impl10842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__6__Impl_in_rule__ViewHeader__Group__610873 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__7_in_rule__ViewHeader__Group__610876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__0_in_rule__ViewHeader__Group__6__Impl10903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__7__Impl_in_rule__ViewHeader__Group__710934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ViewHeader__Group__7__Impl10962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__0__Impl_in_rule__ViewHeader__Group_3__011009 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__1_in_rule__ViewHeader__Group_3__011012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ViewHeader__Group_3__0__Impl11040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__1__Impl_in_rule__ViewHeader__Group_3__111071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__TitleAssignment_3_1_in_rule__ViewHeader__Group_3__1__Impl11098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__0__Impl_in_rule__ViewHeader__Group_4__011132 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__1_in_rule__ViewHeader__Group_4__011135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ViewHeader__Group_4__0__Impl11163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__1__Impl_in_rule__ViewHeader__Group_4__111194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__SubtitleAssignment_4_1_in_rule__ViewHeader__Group_4__1__Impl11221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__0__Impl_in_rule__ViewHeader__Group_5__011255 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__1_in_rule__ViewHeader__Group_5__011258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ViewHeader__Group_5__0__Impl11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__1__Impl_in_rule__ViewHeader__Group_5__111317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__DetailsAssignment_5_1_in_rule__ViewHeader__Group_5__1__Impl11344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__0__Impl_in_rule__ViewHeader__Group_6__011378 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__1_in_rule__ViewHeader__Group_6__011381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ViewHeader__Group_6__0__Impl11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__1__Impl_in_rule__ViewHeader__Group_6__111440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__ImageAssignment_6_1_in_rule__ViewHeader__Group_6__1__Impl11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__0__Impl_in_rule__ViewSection__Group__011501 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__1_in_rule__ViewSection__Group__011504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ViewSection__Group__0__Impl11532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__1__Impl_in_rule__ViewSection__Group__111563 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__2_in_rule__ViewSection__Group__111566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewSection__Group__1__Impl11594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__2__Impl_in_rule__ViewSection__Group__211625 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__3_in_rule__ViewSection__Group__211628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__0_in_rule__ViewSection__Group__2__Impl11655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__3__Impl_in_rule__ViewSection__Group__311686 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__4_in_rule__ViewSection__Group__311689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11718 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11730 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__4__Impl_in_rule__ViewSection__Group__411763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ViewSection__Group__4__Impl11791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__0__Impl_in_rule__ViewSection__Group_2__011832 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__1_in_rule__ViewSection__Group_2__011835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ViewSection__Group_2__0__Impl11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__1__Impl_in_rule__ViewSection__Group_2__111894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__TitleAssignment_2_1_in_rule__ViewSection__Group_2__1__Impl11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__0__Impl_in_rule__SectionCell__Group__011955 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__1_in_rule__SectionCell__Group__011958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__SectionCell__Group__0__Impl11986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__1__Impl_in_rule__SectionCell__Group__112017 = new BitSet(new long[]{0x0010000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__2_in_rule__SectionCell__Group__112020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__TypeAssignment_1_in_rule__SectionCell__Group__1__Impl12047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__2__Impl_in_rule__SectionCell__Group__212077 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__3_in_rule__SectionCell__Group__212080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__0_in_rule__SectionCell__Group__2__Impl12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__3__Impl_in_rule__SectionCell__Group__312138 = new BitSet(new long[]{0x0063000010000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__4_in_rule__SectionCell__Group__312141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SectionCell__Group__3__Impl12169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__4__Impl_in_rule__SectionCell__Group__412200 = new BitSet(new long[]{0x0043000010000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__5_in_rule__SectionCell__Group__412203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__0_in_rule__SectionCell__Group__4__Impl12230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__5__Impl_in_rule__SectionCell__Group__512261 = new BitSet(new long[]{0x0042000010000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__6_in_rule__SectionCell__Group__512264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__0_in_rule__SectionCell__Group__5__Impl12291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__6__Impl_in_rule__SectionCell__Group__612322 = new BitSet(new long[]{0x0040000010000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__7_in_rule__SectionCell__Group__612325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__0_in_rule__SectionCell__Group__6__Impl12352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__7__Impl_in_rule__SectionCell__Group__712383 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__8_in_rule__SectionCell__Group__712386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__0_in_rule__SectionCell__Group__7__Impl12413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__8__Impl_in_rule__SectionCell__Group__812444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SectionCell__Group__8__Impl12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__0__Impl_in_rule__SectionCell__Group_2__012521 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__1_in_rule__SectionCell__Group_2__012524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__SectionCell__Group_2__0__Impl12552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__1__Impl_in_rule__SectionCell__Group_2__112583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__IteratorAssignment_2_1_in_rule__SectionCell__Group_2__1__Impl12610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__0__Impl_in_rule__SectionCell__Group_4__012644 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__1_in_rule__SectionCell__Group_4__012647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__SectionCell__Group_4__0__Impl12675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__1__Impl_in_rule__SectionCell__Group_4__112706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__TextAssignment_4_1_in_rule__SectionCell__Group_4__1__Impl12733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__0__Impl_in_rule__SectionCell__Group_5__012767 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__1_in_rule__SectionCell__Group_5__012770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SectionCell__Group_5__0__Impl12798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__1__Impl_in_rule__SectionCell__Group_5__112829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__DetailsAssignment_5_1_in_rule__SectionCell__Group_5__1__Impl12856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__0__Impl_in_rule__SectionCell__Group_6__012890 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__1_in_rule__SectionCell__Group_6__012893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SectionCell__Group_6__0__Impl12921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__1__Impl_in_rule__SectionCell__Group_6__112952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__ImageAssignment_6_1_in_rule__SectionCell__Group_6__1__Impl12979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__0__Impl_in_rule__SectionCell__Group_7__013013 = new BitSet(new long[]{0x0000000000540030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__1_in_rule__SectionCell__Group_7__013016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SectionCell__Group_7__0__Impl13044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__1__Impl_in_rule__SectionCell__Group_7__113075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__ActionAssignment_7_1_in_rule__SectionCell__Group_7__1__Impl13102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__0__Impl_in_rule__CollectionIterator__Group__013136 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__1_in_rule__CollectionIterator__Group__013139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__CollectionAssignment_0_in_rule__CollectionIterator__Group__0__Impl13166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__1__Impl_in_rule__CollectionIterator__Group__113196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__2_in_rule__CollectionIterator__Group__113199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__CollectionIterator__Group__1__Impl13227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__2__Impl_in_rule__CollectionIterator__Group__213258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__NameAssignment_2_in_rule__CollectionIterator__Group__2__Impl13285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__0__Impl_in_rule__ViewCall__Group__013321 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__1_in_rule__ViewCall__Group__013324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__ViewAssignment_0_in_rule__ViewCall__Group__0__Impl13351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__1__Impl_in_rule__ViewCall__Group__113381 = new BitSet(new long[]{0x0000000002DC0030L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__2_in_rule__ViewCall__Group__113384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ViewCall__Group__1__Impl13412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__2__Impl_in_rule__ViewCall__Group__213443 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__3_in_rule__ViewCall__Group__213446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__ProviderAssignment_2_in_rule__ViewCall__Group__2__Impl13473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__3__Impl_in_rule__ViewCall__Group__313504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ViewCall__Group__3__Impl13532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__Model__ApplicationAssignment_013576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_rule__Model__ElementsAssignment_113607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDescription__TypeAssignment_013642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__TypeDescription__ManyAssignment_113682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_rule__Parameter__DescriptionAssignment_013721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_113752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectReference__ObjectAssignment_013787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_rule__ObjectReference__TailAssignment_113822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NestedObjectReference__ObjectAssignment_113857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_rule__NestedObjectReference__TailAssignment_213892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment13923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValuesAssignment_0_213954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_1_213985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__MatchAssignment_1_414016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ReplacementAssignment_1_614047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_2_214078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_114109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_2_114140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__ValueAssignment_214171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__DelimiterAssignment_414202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TabBarApplication__NameAssignment_114233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_rule__TabBarApplication__ButtonsAssignment_314264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TabbarButton__TitleAssignment_314295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TabbarButton__IconAssignment_514326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_rule__TabbarButton__ViewAssignment_714357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_114388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleType__PlatformTypeAssignment_314419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_114450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_114485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_414520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Property__DerivedAssignment_014556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_rule__Property__DescriptionAssignment_114595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_214626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentProvider__NameAssignment_114657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ContentProvider__ParameterAssignment_2_114688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__ContentProvider__ResolverAssignment_3_114724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentProvider__TypeAssignment_414767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ContentProvider__ManyAssignment_514807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ContentProvider__UrlAssignment_914846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ContentProvider__SelectionAssignment_1114877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProviderConstruction__ProviderAssignment_0_114912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProviderConstruction__ArgumentAssignment_0_314947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProviderConstruction__ExpressionAssignment_1_114978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TableView__NameAssignment_115009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__TableView__ContentAssignment_2_115040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TableView__TitleAssignment_515071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_rule__TableView__SectionsAssignment_615102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DetailsView__NameAssignment_115133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DetailsView__ContentAssignment_2_115164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__DetailsView__TitleAssignment_515195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_rule__DetailsView__HeaderAssignment_615226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_rule__DetailsView__SectionsAssignment_715257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomView__NameAssignment_115288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__CustomView__ContentAssignment_2_115319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomView__ObjclassAssignment_415350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__TitleAssignment_3_115381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__SubtitleAssignment_4_115412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__DetailsAssignment_5_115443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__ImageAssignment_6_115474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewSection__TitleAssignment_2_115505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_rule__ViewSection__CellsAssignment_315536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellType_in_rule__SectionCell__TypeAssignment_115567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_rule__SectionCell__IteratorAssignment_2_115598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__TextAssignment_4_115629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__DetailsAssignment_5_115660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__ImageAssignment_6_115691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_rule__SectionCell__ActionAssignment_7_115722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_rule__CollectionIterator__CollectionAssignment_015753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionIterator__NameAssignment_215784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ExternalOpen__UrlAssignment15815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ViewCall__ViewAssignment_015850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_rule__ViewCall__ProviderAssignment_215885 = new BitSet(new long[]{0x0000000000000002L});

}