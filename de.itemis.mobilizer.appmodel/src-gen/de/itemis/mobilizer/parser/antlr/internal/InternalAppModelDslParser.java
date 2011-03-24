package de.itemis.mobilizer.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.itemis.mobilizer.services.AppModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppModelDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[]'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'['", "']'", "'split('", "'tabbarApplication'", "'{'", "'}'", "'button'", "'title='", "'icon='", "'view='", "'const'", "'type'", "'mapsTo'", "'entity'", "'extends'", "'derived'", "'contentprovider'", "'returns'", "'resolves'", "'fetches'", "'XML'", "'from'", "'selects'", "'tableview'", "'detailsview'", "'customview'", "'implementedBy'", "'header'", "'subtitle='", "'details='", "'image='", "'section'", "'cell'", "'foreach'", "'text='", "'action='", "'as'", "'Default'", "'DefaultWithDisclosure'", "'Value2'", "'Double'", "'Subtitle'"
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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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


        public InternalAppModelDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAppModelDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAppModelDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g"; }



     	private AppModelDslGrammarAccess grammarAccess;
     	
        public InternalAppModelDslParser(TokenStream input, AppModelDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AppModelDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:80:28: ( ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:81:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:81:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:81:2: ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )*
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:81:2: ( (lv_application_0_0= ruleApplication ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:82:1: (lv_application_0_0= ruleApplication )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:82:1: (lv_application_0_0= ruleApplication )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:83:3: lv_application_0_0= ruleApplication
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleApplication_in_ruleModel131);
            lv_application_0_0=ruleApplication();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"application",
                    		lv_application_0_0, 
                    		"Application");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:99:2: ( (lv_elements_1_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=28 && LA1_0<=29)||LA1_0==31||LA1_0==34||(LA1_0>=41 && LA1_0<=43)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:100:1: (lv_elements_1_0= ruleModelElement )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:100:1: (lv_elements_1_0= ruleModelElement )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:101:3: lv_elements_1_0= ruleModelElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElement_in_ruleModel152);
            	    lv_elements_1_0=ruleModelElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"ModelElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApplication"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:125:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:126:2: (iv_ruleApplication= ruleApplication EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:127:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication189);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication199); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:134:1: ruleApplication returns [EObject current=null] : this_TabBarApplication_0= ruleTabBarApplication ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        EObject this_TabBarApplication_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:137:28: (this_TabBarApplication_0= ruleTabBarApplication )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:139:5: this_TabBarApplication_0= ruleTabBarApplication
            {
             
                    newCompositeNode(grammarAccess.getApplicationAccess().getTabBarApplicationParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTabBarApplication_in_ruleApplication245);
            this_TabBarApplication_0=ruleTabBarApplication();

            state._fsp--;

             
                    current = this_TabBarApplication_0; 
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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleModelElement"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:155:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:156:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:157:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement279);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement289); 

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
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:164:1: ruleModelElement returns [EObject current=null] : (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ContentProvider_1 = null;

        EObject this_View_2 = null;

        EObject this_Constant_3 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:167:28: ( (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:168:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:168:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 29:
            case 31:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 41:
            case 42:
            case 43:
                {
                alt2=3;
                }
                break;
            case 28:
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
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:169:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleModelElement336);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:179:5: this_ContentProvider_1= ruleContentProvider
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContentProvider_in_ruleModelElement363);
                    this_ContentProvider_1=ruleContentProvider();

                    state._fsp--;

                     
                            current = this_ContentProvider_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:189:5: this_View_2= ruleView
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getViewParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleView_in_ruleModelElement390);
                    this_View_2=ruleView();

                    state._fsp--;

                     
                            current = this_View_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:199:5: this_Constant_3= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getConstantParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleModelElement417);
                    this_Constant_3=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleTypeDescription"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:217:1: entryRuleTypeDescription returns [EObject current=null] : iv_ruleTypeDescription= ruleTypeDescription EOF ;
    public final EObject entryRuleTypeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDescription = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:218:2: (iv_ruleTypeDescription= ruleTypeDescription EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:219:2: iv_ruleTypeDescription= ruleTypeDescription EOF
            {
             newCompositeNode(grammarAccess.getTypeDescriptionRule()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription454);
            iv_ruleTypeDescription=ruleTypeDescription();

            state._fsp--;

             current =iv_ruleTypeDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDescription464); 

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
    // $ANTLR end "entryRuleTypeDescription"


    // $ANTLR start "ruleTypeDescription"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:226:1: ruleTypeDescription returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_many_1_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:229:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:230:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:230:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:230:2: ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )?
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:230:2: ( (otherlv_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:231:1: (otherlv_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:231:1: (otherlv_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:232:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDescriptionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDescription509); 

            		newLeafNode(otherlv_0, grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:243:2: ( (lv_many_1_0= '[]' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:244:1: (lv_many_1_0= '[]' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:244:1: (lv_many_1_0= '[]' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:245:3: lv_many_1_0= '[]'
                    {
                    lv_many_1_0=(Token)match(input,11,FOLLOW_11_in_ruleTypeDescription527); 

                            newLeafNode(lv_many_1_0, grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDescriptionRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

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
    // $ANTLR end "ruleTypeDescription"


    // $ANTLR start "entryRuleParameter"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:266:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:267:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:268:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter577);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter587); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:275:1: ruleParameter returns [EObject current=null] : ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:278:28: ( ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:279:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:279:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:279:2: ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:279:2: ( (lv_description_0_0= ruleTypeDescription ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:280:1: (lv_description_0_0= ruleTypeDescription )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:280:1: (lv_description_0_0= ruleTypeDescription )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:281:3: lv_description_0_0= ruleTypeDescription
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleParameter633);
            lv_description_0_0=ruleTypeDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_0_0, 
                    		"TypeDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:297:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:298:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:298:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:299:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter650); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleObjectReference"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:323:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:324:2: (iv_ruleObjectReference= ruleObjectReference EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:325:2: iv_ruleObjectReference= ruleObjectReference EOF
            {
             newCompositeNode(grammarAccess.getObjectReferenceRule()); 
            pushFollow(FOLLOW_ruleObjectReference_in_entryRuleObjectReference691);
            iv_ruleObjectReference=ruleObjectReference();

            state._fsp--;

             current =iv_ruleObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectReference701); 

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
    // $ANTLR end "entryRuleObjectReference"


    // $ANTLR start "ruleObjectReference"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:332:1: ruleObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tail_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:335:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:336:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:336:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:336:2: ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:336:2: ( (otherlv_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:337:1: (otherlv_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:337:1: (otherlv_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:338:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectReference746); 

            		newLeafNode(otherlv_0, grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:349:2: ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:350:1: (lv_tail_1_0= ruleNestedObjectReference )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:350:1: (lv_tail_1_0= ruleNestedObjectReference )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:351:3: lv_tail_1_0= ruleNestedObjectReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleObjectReference767);
                    lv_tail_1_0=ruleNestedObjectReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"tail",
                            		lv_tail_1_0, 
                            		"NestedObjectReference");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleObjectReference"


    // $ANTLR start "entryRuleNestedObjectReference"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:375:1: entryRuleNestedObjectReference returns [EObject current=null] : iv_ruleNestedObjectReference= ruleNestedObjectReference EOF ;
    public final EObject entryRuleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedObjectReference = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:376:2: (iv_ruleNestedObjectReference= ruleNestedObjectReference EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:377:2: iv_ruleNestedObjectReference= ruleNestedObjectReference EOF
            {
             newCompositeNode(grammarAccess.getNestedObjectReferenceRule()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference804);
            iv_ruleNestedObjectReference=ruleNestedObjectReference();

            state._fsp--;

             current =iv_ruleNestedObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedObjectReference814); 

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
    // $ANTLR end "entryRuleNestedObjectReference"


    // $ANTLR start "ruleNestedObjectReference"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:384:1: ruleNestedObjectReference returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:387:28: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:388:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:388:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:388:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleNestedObjectReference851); 

                	newLeafNode(otherlv_0, grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:392:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:393:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:393:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:394:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNestedObjectReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNestedObjectReference871); 

            		newLeafNode(otherlv_1, grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0()); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:405:2: ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:406:1: (lv_tail_2_0= ruleNestedObjectReference )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:406:1: (lv_tail_2_0= ruleNestedObjectReference )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:407:3: lv_tail_2_0= ruleNestedObjectReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleNestedObjectReference892);
                    lv_tail_2_0=ruleNestedObjectReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNestedObjectReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"tail",
                            		lv_tail_2_0, 
                            		"NestedObjectReference");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleNestedObjectReference"


    // $ANTLR start "entryRuleExpression"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:431:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:432:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:433:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression929);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression939); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:440:1: ruleExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_CollectionLiteral_2 = null;

        EObject this_CollectionFunction_3 = null;

        EObject this_ObjectReference_4 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:443:28: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:444:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:444:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 13:
            case 15:
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:445:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleExpression986);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:455:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleExpression1013);
                    this_StringFunction_1=ruleStringFunction();

                    state._fsp--;

                     
                            current = this_StringFunction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:465:5: this_CollectionLiteral_2= ruleCollectionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleExpression1040);
                    this_CollectionLiteral_2=ruleCollectionLiteral();

                    state._fsp--;

                     
                            current = this_CollectionLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:475:5: this_CollectionFunction_3= ruleCollectionFunction
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleExpression1067);
                    this_CollectionFunction_3=ruleCollectionFunction();

                    state._fsp--;

                     
                            current = this_CollectionFunction_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:485:5: this_ObjectReference_4= ruleObjectReference
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleExpression1094);
                    this_ObjectReference_4=ruleObjectReference();

                    state._fsp--;

                     
                            current = this_ObjectReference_4; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleScalarExpression"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:501:1: entryRuleScalarExpression returns [EObject current=null] : iv_ruleScalarExpression= ruleScalarExpression EOF ;
    public final EObject entryRuleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarExpression = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:502:2: (iv_ruleScalarExpression= ruleScalarExpression EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:503:2: iv_ruleScalarExpression= ruleScalarExpression EOF
            {
             newCompositeNode(grammarAccess.getScalarExpressionRule()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression1129);
            iv_ruleScalarExpression=ruleScalarExpression();

            state._fsp--;

             current =iv_ruleScalarExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarExpression1139); 

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
    // $ANTLR end "entryRuleScalarExpression"


    // $ANTLR start "ruleScalarExpression"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:510:1: ruleScalarExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:513:28: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:514:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:514:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case 13:
            case 15:
            case 17:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:515:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleScalarExpression1186);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:525:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            newCompositeNode(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleScalarExpression1213);
                    this_StringFunction_1=ruleStringFunction();

                    state._fsp--;

                     
                            current = this_StringFunction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:535:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            newCompositeNode(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleScalarExpression1240);
                    this_ObjectReference_2=ruleObjectReference();

                    state._fsp--;

                     
                            current = this_ObjectReference_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleScalarExpression"


    // $ANTLR start "entryRuleCollectionExpression"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:551:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:552:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:553:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
             newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression1275);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;

             current =iv_ruleCollectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression1285); 

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
    // $ANTLR end "entryRuleCollectionExpression"


    // $ANTLR start "ruleCollectionExpression"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:560:1: ruleCollectionExpression returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteral_0 = null;

        EObject this_CollectionFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:563:28: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:564:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:564:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:565:5: this_CollectionLiteral_0= ruleCollectionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression1332);
                    this_CollectionLiteral_0=ruleCollectionLiteral();

                    state._fsp--;

                     
                            current = this_CollectionLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:575:5: this_CollectionFunction_1= ruleCollectionFunction
                    {
                     
                            newCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression1359);
                    this_CollectionFunction_1=ruleCollectionFunction();

                    state._fsp--;

                     
                            current = this_CollectionFunction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:585:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            newCompositeNode(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleCollectionExpression1386);
                    this_ObjectReference_2=ruleObjectReference();

                    state._fsp--;

                     
                            current = this_ObjectReference_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleCollectionExpression"


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:601:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:602:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:603:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1421);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1431); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:610:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:613:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:614:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:614:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:615:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:615:1: (lv_value_0_0= RULE_STRING )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:616:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1472); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleStringFunction"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:640:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:641:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:642:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
             newCompositeNode(grammarAccess.getStringFunctionRule()); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction1512);
            iv_ruleStringFunction=ruleStringFunction();

            state._fsp--;

             current =iv_ruleStringFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction1522); 

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
    // $ANTLR end "entryRuleStringFunction"


    // $ANTLR start "ruleStringFunction"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:649:1: ruleStringFunction returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_values_2_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_match_8_0 = null;

        EObject lv_replacement_10_0 = null;

        EObject lv_value_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:652:28: ( ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:653:1: ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:653:1: ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 17:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:653:2: ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:653:2: ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:653:3: () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:653:3: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:654:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleStringFunction1569); 

                        	newLeafNode(otherlv_1, grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:663:1: ( (lv_values_2_0= ruleScalarExpression ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==13||LA9_0==15||LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:664:1: (lv_values_2_0= ruleScalarExpression )
                    	    {
                    	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:664:1: (lv_values_2_0= ruleScalarExpression )
                    	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:665:3: lv_values_2_0= ruleScalarExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1590);
                    	    lv_values_2_0=ruleScalarExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_2_0, 
                    	            		"ScalarExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleStringFunction1603); 

                        	newLeafNode(otherlv_3, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:686:6: ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:686:6: ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:686:7: () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:686:7: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:687:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleStringFunction1632); 

                        	newLeafNode(otherlv_5, grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:696:1: ( (lv_value_6_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:697:1: (lv_value_6_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:697:1: (lv_value_6_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:698:3: lv_value_6_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1653);
                    lv_value_6_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleStringFunction1665); 

                        	newLeafNode(otherlv_7, grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:718:1: ( (lv_match_8_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:719:1: (lv_match_8_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:719:1: (lv_match_8_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:720:3: lv_match_8_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1686);
                    lv_match_8_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"match",
                            		lv_match_8_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleStringFunction1698); 

                        	newLeafNode(otherlv_9, grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:740:1: ( (lv_replacement_10_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:741:1: (lv_replacement_10_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:741:1: (lv_replacement_10_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:742:3: lv_replacement_10_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1719);
                    lv_replacement_10_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"replacement",
                            		lv_replacement_10_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleStringFunction1731); 

                        	newLeafNode(otherlv_11, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:763:6: ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:763:6: ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:763:7: () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:763:7: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:764:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0(),
                                current);
                        

                    }

                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleStringFunction1760); 

                        	newLeafNode(otherlv_13, grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:773:1: ( (lv_value_14_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:774:1: (lv_value_14_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:774:1: (lv_value_14_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:775:3: lv_value_14_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1781);
                    lv_value_14_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_14_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleStringFunction1793); 

                        	newLeafNode(otherlv_15, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3());
                        

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
    // $ANTLR end "ruleStringFunction"


    // $ANTLR start "entryRuleCollectionLiteral"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:803:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteral = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:804:2: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:805:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
            {
             newCompositeNode(grammarAccess.getCollectionLiteralRule()); 
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral1830);
            iv_ruleCollectionLiteral=ruleCollectionLiteral();

            state._fsp--;

             current =iv_ruleCollectionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral1840); 

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
    // $ANTLR end "entryRuleCollectionLiteral"


    // $ANTLR start "ruleCollectionLiteral"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:812:1: ruleCollectionLiteral returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:815:28: ( (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:816:1: (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:816:1: (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:816:3: otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleCollectionLiteral1877); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:820:1: ( (lv_items_1_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:821:1: (lv_items_1_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:821:1: (lv_items_1_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:822:3: lv_items_1_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1898);
            lv_items_1_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_1_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:838:2: (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:838:4: otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCollectionLiteral1911); 

            	        	newLeafNode(otherlv_2, grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:842:1: ( (lv_items_3_0= ruleScalarExpression ) )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:843:1: (lv_items_3_0= ruleScalarExpression )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:843:1: (lv_items_3_0= ruleScalarExpression )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:844:3: lv_items_3_0= ruleScalarExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1932);
            	    lv_items_3_0=ruleScalarExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"ScalarExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleCollectionLiteral1946); 

                	newLeafNode(otherlv_4, grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleCollectionLiteral"


    // $ANTLR start "entryRuleCollectionFunction"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:872:1: entryRuleCollectionFunction returns [EObject current=null] : iv_ruleCollectionFunction= ruleCollectionFunction EOF ;
    public final EObject entryRuleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFunction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:873:2: (iv_ruleCollectionFunction= ruleCollectionFunction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:874:2: iv_ruleCollectionFunction= ruleCollectionFunction EOF
            {
             newCompositeNode(grammarAccess.getCollectionFunctionRule()); 
            pushFollow(FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction1982);
            iv_ruleCollectionFunction=ruleCollectionFunction();

            state._fsp--;

             current =iv_ruleCollectionFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunction1992); 

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
    // $ANTLR end "entryRuleCollectionFunction"


    // $ANTLR start "ruleCollectionFunction"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:881:1: ruleCollectionFunction returns [EObject current=null] : ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleCollectionFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_delimiter_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:884:28: ( ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:885:1: ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:885:1: ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:885:2: () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')'
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:885:2: ()
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:886:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCollectionFunction2038); 

                	newLeafNode(otherlv_1, grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:895:1: ( (lv_value_2_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:896:1: (lv_value_2_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:896:1: (lv_value_2_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:897:3: lv_value_2_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2059);
            lv_value_2_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleCollectionFunction2071); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:917:1: ( (lv_delimiter_4_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:918:1: (lv_delimiter_4_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:918:1: (lv_delimiter_4_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:919:3: lv_delimiter_4_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2092);
            lv_delimiter_4_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"delimiter",
                    		lv_delimiter_4_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCollectionFunction2104); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleCollectionFunction"


    // $ANTLR start "entryRuleTabBarApplication"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:947:1: entryRuleTabBarApplication returns [EObject current=null] : iv_ruleTabBarApplication= ruleTabBarApplication EOF ;
    public final EObject entryRuleTabBarApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabBarApplication = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:948:2: (iv_ruleTabBarApplication= ruleTabBarApplication EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:949:2: iv_ruleTabBarApplication= ruleTabBarApplication EOF
            {
             newCompositeNode(grammarAccess.getTabBarApplicationRule()); 
            pushFollow(FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication2140);
            iv_ruleTabBarApplication=ruleTabBarApplication();

            state._fsp--;

             current =iv_ruleTabBarApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabBarApplication2150); 

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
    // $ANTLR end "entryRuleTabBarApplication"


    // $ANTLR start "ruleTabBarApplication"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:956:1: ruleTabBarApplication returns [EObject current=null] : (otherlv_0= 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* otherlv_4= '}' ) ;
    public final EObject ruleTabBarApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_buttons_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:959:28: ( (otherlv_0= 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* otherlv_4= '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:960:1: (otherlv_0= 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* otherlv_4= '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:960:1: (otherlv_0= 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* otherlv_4= '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:960:3: otherlv_0= 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleTabBarApplication2187); 

                	newLeafNode(otherlv_0, grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:964:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:965:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:965:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:966:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTabBarApplication2204); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTabBarApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabBarApplicationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleTabBarApplication2221); 

                	newLeafNode(otherlv_2, grammarAccess.getTabBarApplicationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:986:1: ( (lv_buttons_3_0= ruleTabbarButton ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:987:1: (lv_buttons_3_0= ruleTabbarButton )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:987:1: (lv_buttons_3_0= ruleTabbarButton )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:988:3: lv_buttons_3_0= ruleTabbarButton
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTabBarApplicationAccess().getButtonsTabbarButtonParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTabbarButton_in_ruleTabBarApplication2242);
            	    lv_buttons_3_0=ruleTabbarButton();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTabBarApplicationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"buttons",
            	            		lv_buttons_3_0, 
            	            		"TabbarButton");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleTabBarApplication2255); 

                	newLeafNode(otherlv_4, grammarAccess.getTabBarApplicationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleTabBarApplication"


    // $ANTLR start "entryRuleTabbarButton"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1016:1: entryRuleTabbarButton returns [EObject current=null] : iv_ruleTabbarButton= ruleTabbarButton EOF ;
    public final EObject entryRuleTabbarButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabbarButton = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1017:2: (iv_ruleTabbarButton= ruleTabbarButton EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1018:2: iv_ruleTabbarButton= ruleTabbarButton EOF
            {
             newCompositeNode(grammarAccess.getTabbarButtonRule()); 
            pushFollow(FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton2291);
            iv_ruleTabbarButton=ruleTabbarButton();

            state._fsp--;

             current =iv_ruleTabbarButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabbarButton2301); 

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
    // $ANTLR end "entryRuleTabbarButton"


    // $ANTLR start "ruleTabbarButton"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1025:1: ruleTabbarButton returns [EObject current=null] : (otherlv_0= 'button' otherlv_1= '{' otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) otherlv_4= 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) otherlv_6= 'view=' ( (lv_view_7_0= ruleViewCall ) ) otherlv_8= '}' ) ;
    public final EObject ruleTabbarButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_title_3_0 = null;

        EObject lv_icon_5_0 = null;

        EObject lv_view_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1028:28: ( (otherlv_0= 'button' otherlv_1= '{' otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) otherlv_4= 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) otherlv_6= 'view=' ( (lv_view_7_0= ruleViewCall ) ) otherlv_8= '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1029:1: (otherlv_0= 'button' otherlv_1= '{' otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) otherlv_4= 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) otherlv_6= 'view=' ( (lv_view_7_0= ruleViewCall ) ) otherlv_8= '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1029:1: (otherlv_0= 'button' otherlv_1= '{' otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) otherlv_4= 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) otherlv_6= 'view=' ( (lv_view_7_0= ruleViewCall ) ) otherlv_8= '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1029:3: otherlv_0= 'button' otherlv_1= '{' otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) otherlv_4= 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) otherlv_6= 'view=' ( (lv_view_7_0= ruleViewCall ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleTabbarButton2338); 

                	newLeafNode(otherlv_0, grammarAccess.getTabbarButtonAccess().getButtonKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleTabbarButton2350); 

                	newLeafNode(otherlv_1, grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTabbarButton2362); 

                	newLeafNode(otherlv_2, grammarAccess.getTabbarButtonAccess().getTitleKeyword_2());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1041:1: ( (lv_title_3_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1042:1: (lv_title_3_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1042:1: (lv_title_3_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1043:3: lv_title_3_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTabbarButton2383);
            lv_title_3_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTabbarButtonRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_3_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleTabbarButton2395); 

                	newLeafNode(otherlv_4, grammarAccess.getTabbarButtonAccess().getIconKeyword_4());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1063:1: ( (lv_icon_5_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1064:1: (lv_icon_5_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1064:1: (lv_icon_5_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1065:3: lv_icon_5_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTabbarButton2416);
            lv_icon_5_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTabbarButtonRule());
            	        }
                   		set(
                   			current, 
                   			"icon",
                    		lv_icon_5_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleTabbarButton2428); 

                	newLeafNode(otherlv_6, grammarAccess.getTabbarButtonAccess().getViewKeyword_6());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1085:1: ( (lv_view_7_0= ruleViewCall ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1086:1: (lv_view_7_0= ruleViewCall )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1086:1: (lv_view_7_0= ruleViewCall )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1087:3: lv_view_7_0= ruleViewCall
            {
             
            	        newCompositeNode(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleViewCall_in_ruleTabbarButton2449);
            lv_view_7_0=ruleViewCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTabbarButtonRule());
            	        }
                   		set(
                   			current, 
                   			"view",
                    		lv_view_7_0, 
                    		"ViewCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleTabbarButton2461); 

                	newLeafNode(otherlv_8, grammarAccess.getTabbarButtonAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleTabbarButton"


    // $ANTLR start "entryRuleConstant"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1115:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1116:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1117:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2497);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2507); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1124:1: ruleConstant returns [EObject current=null] : ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1127:28: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1128:1: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1128:1: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1128:2: () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1128:2: ()
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1129:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantAccess().getConstantAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleConstant2553); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstKeyword_1());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1138:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1139:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1139:1: (lv_name_2_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1140:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant2570); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1156:2: ( (lv_value_3_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1157:1: (lv_value_3_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1157:1: (lv_value_3_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1158:3: lv_value_3_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getValueScalarExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleConstant2596);
            lv_value_3_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"ScalarExpression");
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleType"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1182:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1183:2: (iv_ruleType= ruleType EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1184:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2632);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2642); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1191:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1194:28: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1195:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1195:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1196:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType2689);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1206:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType2716);
                    this_Entity_1=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1222:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1223:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1224:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType2751);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType2761); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1231:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_platformType_3_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1234:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1235:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1235:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1235:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSimpleType2798); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getTypeKeyword_0());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1239:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1240:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1240:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1241:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType2815); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSimpleType2832); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1261:1: ( (lv_platformType_3_0= RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1262:1: (lv_platformType_3_0= RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1262:1: (lv_platformType_3_0= RULE_STRING )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1263:3: lv_platformType_3_0= RULE_STRING
            {
            lv_platformType_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleType2849); 

            			newLeafNode(lv_platformType_3_0, grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"platformType",
                    		lv_platformType_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleEntity"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1287:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1288:2: (iv_ruleEntity= ruleEntity EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1289:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2890);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2900); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1296:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1299:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1300:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1300:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1300:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleEntity2937); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1304:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1305:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1305:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1306:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2954); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1322:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1322:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleEntity2972); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1326:1: ( (otherlv_3= RULE_ID ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1327:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1327:1: (otherlv_3= RULE_ID )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1328:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2992); 

                    		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleEntity3006); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1343:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1344:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1344:1: (lv_properties_5_0= ruleProperty )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1345:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity3027);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_5_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleEntity3040); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1373:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1374:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1375:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3076);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3086); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1382:1: ruleProperty returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1385:28: ( ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1386:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1386:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1386:2: ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1386:2: ( (lv_derived_0_0= 'derived' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1387:1: (lv_derived_0_0= 'derived' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1387:1: (lv_derived_0_0= 'derived' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1388:3: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)match(input,33,FOLLOW_33_in_ruleProperty3129); 

                            newLeafNode(lv_derived_0_0, grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1401:3: ( (lv_description_1_0= ruleTypeDescription ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1402:1: (lv_description_1_0= ruleTypeDescription )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1402:1: (lv_description_1_0= ruleTypeDescription )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1403:3: lv_description_1_0= ruleTypeDescription
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleProperty3164);
            lv_description_1_0=ruleTypeDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"TypeDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1419:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1420:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1420:1: (lv_name_2_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1421:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3181); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleContentProvider"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1445:1: entryRuleContentProvider returns [EObject current=null] : iv_ruleContentProvider= ruleContentProvider EOF ;
    public final EObject entryRuleContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProvider = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1446:2: (iv_ruleContentProvider= ruleContentProvider EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1447:2: iv_ruleContentProvider= ruleContentProvider EOF
            {
             newCompositeNode(grammarAccess.getContentProviderRule()); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider3222);
            iv_ruleContentProvider=ruleContentProvider();

            state._fsp--;

             current =iv_ruleContentProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider3232); 

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
    // $ANTLR end "entryRuleContentProvider"


    // $ANTLR start "ruleContentProvider"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1454:1: ruleContentProvider returns [EObject current=null] : (otherlv_0= 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )? (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? otherlv_9= 'fetches' otherlv_10= 'XML' otherlv_11= 'from' ( (lv_url_12_0= ruleScalarExpression ) ) otherlv_13= 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) ) ;
    public final EObject ruleContentProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_resolver_6_0=null;
        Token otherlv_7=null;
        Token lv_many_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_parameter_3_0 = null;

        EObject lv_url_12_0 = null;

        EObject lv_selection_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1457:28: ( (otherlv_0= 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )? (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? otherlv_9= 'fetches' otherlv_10= 'XML' otherlv_11= 'from' ( (lv_url_12_0= ruleScalarExpression ) ) otherlv_13= 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1458:1: (otherlv_0= 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )? (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? otherlv_9= 'fetches' otherlv_10= 'XML' otherlv_11= 'from' ( (lv_url_12_0= ruleScalarExpression ) ) otherlv_13= 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1458:1: (otherlv_0= 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )? (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? otherlv_9= 'fetches' otherlv_10= 'XML' otherlv_11= 'from' ( (lv_url_12_0= ruleScalarExpression ) ) otherlv_13= 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1458:3: otherlv_0= 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )? (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? otherlv_9= 'fetches' otherlv_10= 'XML' otherlv_11= 'from' ( (lv_url_12_0= ruleScalarExpression ) ) otherlv_13= 'selects' ( (lv_selection_14_0= ruleScalarExpression ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleContentProvider3269); 

                	newLeafNode(otherlv_0, grammarAccess.getContentProviderAccess().getContentproviderKeyword_0());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1462:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1463:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1463:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1464:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider3286); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContentProviderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1480:2: (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1480:4: otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContentProvider3304); 

                        	newLeafNode(otherlv_2, grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1484:1: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1485:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1485:1: (lv_parameter_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1486:3: lv_parameter_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleContentProvider3325);
                    lv_parameter_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentProviderRule());
                    	        }
                           		set(
                           			current, 
                           			"parameter",
                            		lv_parameter_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleContentProvider3337); 

                        	newLeafNode(otherlv_4, grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1506:3: (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            else if ( (LA18_0==36) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1506:5: otherlv_5= 'returns'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleContentProvider3352); 

                        	newLeafNode(otherlv_5, grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1511:6: ( (lv_resolver_6_0= 'resolves' ) )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1511:6: ( (lv_resolver_6_0= 'resolves' ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1512:1: (lv_resolver_6_0= 'resolves' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1512:1: (lv_resolver_6_0= 'resolves' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1513:3: lv_resolver_6_0= 'resolves'
                    {
                    lv_resolver_6_0=(Token)match(input,36,FOLLOW_36_in_ruleContentProvider3376); 

                            newLeafNode(lv_resolver_6_0, grammarAccess.getContentProviderAccess().getResolverResolvesKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContentProviderRule());
                    	        }
                           		setWithLastConsumed(current, "resolver", true, "resolves");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1526:3: ( (otherlv_7= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1527:1: (otherlv_7= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1527:1: (otherlv_7= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1528:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContentProviderRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider3410); 

            		newLeafNode(otherlv_7, grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0()); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1539:2: ( (lv_many_8_0= '[]' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1540:1: (lv_many_8_0= '[]' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1540:1: (lv_many_8_0= '[]' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1541:3: lv_many_8_0= '[]'
                    {
                    lv_many_8_0=(Token)match(input,11,FOLLOW_11_in_ruleContentProvider3428); 

                            newLeafNode(lv_many_8_0, grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContentProviderRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleContentProvider3454); 

                	newLeafNode(otherlv_9, grammarAccess.getContentProviderAccess().getFetchesKeyword_6());
                
            otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleContentProvider3466); 

                	newLeafNode(otherlv_10, grammarAccess.getContentProviderAccess().getXMLKeyword_7());
                
            otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleContentProvider3478); 

                	newLeafNode(otherlv_11, grammarAccess.getContentProviderAccess().getFromKeyword_8());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1566:1: ( (lv_url_12_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1567:1: (lv_url_12_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1567:1: (lv_url_12_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1568:3: lv_url_12_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider3499);
            lv_url_12_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContentProviderRule());
            	        }
                   		set(
                   			current, 
                   			"url",
                    		lv_url_12_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,40,FOLLOW_40_in_ruleContentProvider3511); 

                	newLeafNode(otherlv_13, grammarAccess.getContentProviderAccess().getSelectsKeyword_10());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1588:1: ( (lv_selection_14_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1589:1: (lv_selection_14_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1589:1: (lv_selection_14_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1590:3: lv_selection_14_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider3532);
            lv_selection_14_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContentProviderRule());
            	        }
                   		set(
                   			current, 
                   			"selection",
                    		lv_selection_14_0, 
                    		"ScalarExpression");
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
    // $ANTLR end "ruleContentProvider"


    // $ANTLR start "entryRuleProviderConstruction"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1614:1: entryRuleProviderConstruction returns [EObject current=null] : iv_ruleProviderConstruction= ruleProviderConstruction EOF ;
    public final EObject entryRuleProviderConstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderConstruction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1615:2: (iv_ruleProviderConstruction= ruleProviderConstruction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1616:2: iv_ruleProviderConstruction= ruleProviderConstruction EOF
            {
             newCompositeNode(grammarAccess.getProviderConstructionRule()); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction3568);
            iv_ruleProviderConstruction=ruleProviderConstruction();

            state._fsp--;

             current =iv_ruleProviderConstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderConstruction3578); 

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
    // $ANTLR end "entryRuleProviderConstruction"


    // $ANTLR start "ruleProviderConstruction"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1623:1: ruleProviderConstruction returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) ) ;
    public final EObject ruleProviderConstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_argument_3_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1626:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1627:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1627:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EOF||LA21_1==12||LA21_1==14) ) {
                    alt21=2;
                }
                else if ( (LA21_1==13) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_STRING||LA21_0==13||LA21_0==15||(LA21_0>=17 && LA21_0<=18)||LA21_0==20) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1627:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1627:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1627:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1627:3: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1628:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getProviderConstructionAccess().getComplexProviderConstructionAction_0_0(),
                                current);
                        

                    }

                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1633:2: ( (otherlv_1= RULE_ID ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1634:1: (otherlv_1= RULE_ID )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1634:1: (otherlv_1= RULE_ID )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1635:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getProviderConstructionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProviderConstruction3633); 

                    		newLeafNode(otherlv_1, grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleProviderConstruction3645); 

                        	newLeafNode(otherlv_2, grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1650:1: ( (lv_argument_3_0= ruleExpression ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||LA20_0==13||LA20_0==15||(LA20_0>=17 && LA20_0<=18)||LA20_0==20) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1651:1: (lv_argument_3_0= ruleExpression )
                            {
                            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1651:1: (lv_argument_3_0= ruleExpression )
                            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1652:3: lv_argument_3_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction3666);
                            lv_argument_3_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getProviderConstructionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"argument",
                                    		lv_argument_3_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProviderConstruction3679); 

                        	newLeafNode(otherlv_4, grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1673:6: ( () ( (lv_expression_6_0= ruleExpression ) ) )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1673:6: ( () ( (lv_expression_6_0= ruleExpression ) ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1673:7: () ( (lv_expression_6_0= ruleExpression ) )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1673:7: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1674:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getProviderConstructionAccess().getSimpleProviderConstructionAction_1_0(),
                                current);
                        

                    }

                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1679:2: ( (lv_expression_6_0= ruleExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1680:1: (lv_expression_6_0= ruleExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1680:1: (lv_expression_6_0= ruleExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1681:3: lv_expression_6_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction3717);
                    lv_expression_6_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProviderConstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_6_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleProviderConstruction"


    // $ANTLR start "entryRuleView"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1705:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1706:2: (iv_ruleView= ruleView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1707:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView3754);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView3764); 

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
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1714:1: ruleView returns [EObject current=null] : (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_SectionedView_0 = null;

        EObject this_CustomView_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1717:28: ( (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1718:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1718:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=41 && LA22_0<=42)) ) {
                alt22=1;
            }
            else if ( (LA22_0==43) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1719:5: this_SectionedView_0= ruleSectionedView
                    {
                     
                            newCompositeNode(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSectionedView_in_ruleView3811);
                    this_SectionedView_0=ruleSectionedView();

                    state._fsp--;

                     
                            current = this_SectionedView_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1729:5: this_CustomView_1= ruleCustomView
                    {
                     
                            newCompositeNode(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCustomView_in_ruleView3838);
                    this_CustomView_1=ruleCustomView();

                    state._fsp--;

                     
                            current = this_CustomView_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleSectionedView"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1745:1: entryRuleSectionedView returns [EObject current=null] : iv_ruleSectionedView= ruleSectionedView EOF ;
    public final EObject entryRuleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionedView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1746:2: (iv_ruleSectionedView= ruleSectionedView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1747:2: iv_ruleSectionedView= ruleSectionedView EOF
            {
             newCompositeNode(grammarAccess.getSectionedViewRule()); 
            pushFollow(FOLLOW_ruleSectionedView_in_entryRuleSectionedView3873);
            iv_ruleSectionedView=ruleSectionedView();

            state._fsp--;

             current =iv_ruleSectionedView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionedView3883); 

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
    // $ANTLR end "entryRuleSectionedView"


    // $ANTLR start "ruleSectionedView"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1754:1: ruleSectionedView returns [EObject current=null] : (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) ;
    public final EObject ruleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject this_TableView_0 = null;

        EObject this_DetailsView_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1757:28: ( (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1758:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1758:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            else if ( (LA23_0==42) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1759:5: this_TableView_0= ruleTableView
                    {
                     
                            newCompositeNode(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTableView_in_ruleSectionedView3930);
                    this_TableView_0=ruleTableView();

                    state._fsp--;

                     
                            current = this_TableView_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1769:5: this_DetailsView_1= ruleDetailsView
                    {
                     
                            newCompositeNode(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDetailsView_in_ruleSectionedView3957);
                    this_DetailsView_1=ruleDetailsView();

                    state._fsp--;

                     
                            current = this_DetailsView_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleSectionedView"


    // $ANTLR start "entryRuleTableView"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1785:1: entryRuleTableView returns [EObject current=null] : iv_ruleTableView= ruleTableView EOF ;
    public final EObject entryRuleTableView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1786:2: (iv_ruleTableView= ruleTableView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1787:2: iv_ruleTableView= ruleTableView EOF
            {
             newCompositeNode(grammarAccess.getTableViewRule()); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView3992);
            iv_ruleTableView=ruleTableView();

            state._fsp--;

             current =iv_ruleTableView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView4002); 

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
    // $ANTLR end "entryRuleTableView"


    // $ANTLR start "ruleTableView"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1794:1: ruleTableView returns [EObject current=null] : (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* otherlv_9= '}' ) ;
    public final EObject ruleTableView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_sections_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1797:28: ( (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* otherlv_9= '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1798:1: (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* otherlv_9= '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1798:1: (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* otherlv_9= '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1798:3: otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleTableView4039); 

                	newLeafNode(otherlv_0, grammarAccess.getTableViewAccess().getTableviewKeyword_0());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1802:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1803:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1803:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1804:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableView4056); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1820:2: (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1820:4: otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleTableView4074); 

                        	newLeafNode(otherlv_2, grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1824:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1825:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1825:1: (lv_content_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1826:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleTableView4095);
                    lv_content_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableViewRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTableView4107); 

                        	newLeafNode(otherlv_4, grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleTableView4121); 

                	newLeafNode(otherlv_5, grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleTableView4133); 

                	newLeafNode(otherlv_6, grammarAccess.getTableViewAccess().getTitleKeyword_4());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1854:1: ( (lv_title_7_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1855:1: (lv_title_7_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1855:1: (lv_title_7_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1856:3: lv_title_7_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTableView4154);
            lv_title_7_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableViewRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_7_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1872:2: ( (lv_sections_8_0= ruleViewSection ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1873:1: (lv_sections_8_0= ruleViewSection )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1873:1: (lv_sections_8_0= ruleViewSection )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1874:3: lv_sections_8_0= ruleViewSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleTableView4175);
            	    lv_sections_8_0=ruleViewSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_8_0, 
            	            		"ViewSection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleTableView4188); 

                	newLeafNode(otherlv_9, grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleTableView"


    // $ANTLR start "entryRuleDetailsView"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1902:1: entryRuleDetailsView returns [EObject current=null] : iv_ruleDetailsView= ruleDetailsView EOF ;
    public final EObject entryRuleDetailsView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetailsView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1903:2: (iv_ruleDetailsView= ruleDetailsView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1904:2: iv_ruleDetailsView= ruleDetailsView EOF
            {
             newCompositeNode(grammarAccess.getDetailsViewRule()); 
            pushFollow(FOLLOW_ruleDetailsView_in_entryRuleDetailsView4224);
            iv_ruleDetailsView=ruleDetailsView();

            state._fsp--;

             current =iv_ruleDetailsView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailsView4234); 

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
    // $ANTLR end "entryRuleDetailsView"


    // $ANTLR start "ruleDetailsView"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1911:1: ruleDetailsView returns [EObject current=null] : (otherlv_0= 'detailsview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* otherlv_10= '}' ) ;
    public final EObject ruleDetailsView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_header_8_0 = null;

        EObject lv_sections_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1914:28: ( (otherlv_0= 'detailsview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* otherlv_10= '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1915:1: (otherlv_0= 'detailsview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* otherlv_10= '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1915:1: (otherlv_0= 'detailsview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* otherlv_10= '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1915:3: otherlv_0= 'detailsview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleDetailsView4271); 

                	newLeafNode(otherlv_0, grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1919:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1920:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1920:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1921:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDetailsView4288); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDetailsViewAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDetailsViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1937:2: (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1937:4: otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDetailsView4306); 

                        	newLeafNode(otherlv_2, grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1941:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1942:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1942:1: (lv_content_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1943:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleDetailsView4327);
                    lv_content_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDetailsViewRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDetailsView4339); 

                        	newLeafNode(otherlv_4, grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleDetailsView4353); 

                	newLeafNode(otherlv_5, grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleDetailsView4365); 

                	newLeafNode(otherlv_6, grammarAccess.getDetailsViewAccess().getTitleKeyword_4());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1971:1: ( (lv_title_7_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1972:1: (lv_title_7_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1972:1: (lv_title_7_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1973:3: lv_title_7_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleDetailsView4386);
            lv_title_7_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDetailsViewRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_7_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1989:2: ( (lv_header_8_0= ruleViewHeader ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1990:1: (lv_header_8_0= ruleViewHeader )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1990:1: (lv_header_8_0= ruleViewHeader )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1991:3: lv_header_8_0= ruleViewHeader
                    {
                     
                    	        newCompositeNode(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleViewHeader_in_ruleDetailsView4407);
                    lv_header_8_0=ruleViewHeader();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDetailsViewRule());
                    	        }
                           		set(
                           			current, 
                           			"header",
                            		lv_header_8_0, 
                            		"ViewHeader");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2007:3: ( (lv_sections_9_0= ruleViewSection ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==49) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2008:1: (lv_sections_9_0= ruleViewSection )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2008:1: (lv_sections_9_0= ruleViewSection )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2009:3: lv_sections_9_0= ruleViewSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleDetailsView4429);
            	    lv_sections_9_0=ruleViewSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDetailsViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_9_0, 
            	            		"ViewSection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleDetailsView4442); 

                	newLeafNode(otherlv_10, grammarAccess.getDetailsViewAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleDetailsView"


    // $ANTLR start "entryRuleCustomView"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2037:1: entryRuleCustomView returns [EObject current=null] : iv_ruleCustomView= ruleCustomView EOF ;
    public final EObject entryRuleCustomView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2038:2: (iv_ruleCustomView= ruleCustomView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2039:2: iv_ruleCustomView= ruleCustomView EOF
            {
             newCompositeNode(grammarAccess.getCustomViewRule()); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView4478);
            iv_ruleCustomView=ruleCustomView();

            state._fsp--;

             current =iv_ruleCustomView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView4488); 

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
    // $ANTLR end "entryRuleCustomView"


    // $ANTLR start "ruleCustomView"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2046:1: ruleCustomView returns [EObject current=null] : (otherlv_0= 'customview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_objclass_6_0=null;
        EObject lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2049:28: ( (otherlv_0= 'customview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2050:1: (otherlv_0= 'customview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2050:1: (otherlv_0= 'customview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2050:3: otherlv_0= 'customview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleCustomView4525); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomViewAccess().getCustomviewKeyword_0());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2054:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2055:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2055:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2056:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomView4542); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2072:2: (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2072:4: otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleCustomView4560); 

                        	newLeafNode(otherlv_2, grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2076:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2077:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2077:1: (lv_content_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2078:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleCustomView4581);
                    lv_content_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomViewRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCustomView4593); 

                        	newLeafNode(otherlv_4, grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleCustomView4607); 

                	newLeafNode(otherlv_5, grammarAccess.getCustomViewAccess().getImplementedByKeyword_3());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2102:1: ( (lv_objclass_6_0= RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2103:1: (lv_objclass_6_0= RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2103:1: (lv_objclass_6_0= RULE_STRING )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2104:3: lv_objclass_6_0= RULE_STRING
            {
            lv_objclass_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomView4624); 

            			newLeafNode(lv_objclass_6_0, grammarAccess.getCustomViewAccess().getObjclassSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"objclass",
                    		lv_objclass_6_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleCustomView"


    // $ANTLR start "entryRuleViewHeader"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2128:1: entryRuleViewHeader returns [EObject current=null] : iv_ruleViewHeader= ruleViewHeader EOF ;
    public final EObject entryRuleViewHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewHeader = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2129:2: (iv_ruleViewHeader= ruleViewHeader EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2130:2: iv_ruleViewHeader= ruleViewHeader EOF
            {
             newCompositeNode(grammarAccess.getViewHeaderRule()); 
            pushFollow(FOLLOW_ruleViewHeader_in_entryRuleViewHeader4665);
            iv_ruleViewHeader=ruleViewHeader();

            state._fsp--;

             current =iv_ruleViewHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewHeader4675); 

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
    // $ANTLR end "entryRuleViewHeader"


    // $ANTLR start "ruleViewHeader"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2137:1: ruleViewHeader returns [EObject current=null] : ( () otherlv_1= 'header' otherlv_2= '{' (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleViewHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_title_4_0 = null;

        EObject lv_subtitle_6_0 = null;

        EObject lv_details_8_0 = null;

        EObject lv_image_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2140:28: ( ( () otherlv_1= 'header' otherlv_2= '{' (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? otherlv_11= '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2141:1: ( () otherlv_1= 'header' otherlv_2= '{' (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? otherlv_11= '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2141:1: ( () otherlv_1= 'header' otherlv_2= '{' (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? otherlv_11= '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2141:2: () otherlv_1= 'header' otherlv_2= '{' (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? otherlv_11= '}'
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2141:2: ()
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2142:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getViewHeaderAccess().getViewHeaderAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleViewHeader4721); 

                	newLeafNode(otherlv_1, grammarAccess.getViewHeaderAccess().getHeaderKeyword_1());
                
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleViewHeader4733); 

                	newLeafNode(otherlv_2, grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2155:1: (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2155:3: otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleViewHeader4746); 

                        	newLeafNode(otherlv_3, grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2159:1: ( (lv_title_4_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2160:1: (lv_title_4_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2160:1: (lv_title_4_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2161:3: lv_title_4_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4767);
                    lv_title_4_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_4_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2177:4: (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2177:6: otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) )
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleViewHeader4782); 

                        	newLeafNode(otherlv_5, grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2181:1: ( (lv_subtitle_6_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2182:1: (lv_subtitle_6_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2182:1: (lv_subtitle_6_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2183:3: lv_subtitle_6_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4803);
                    lv_subtitle_6_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"subtitle",
                            		lv_subtitle_6_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2199:4: (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2199:6: otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) )
                    {
                    otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleViewHeader4818); 

                        	newLeafNode(otherlv_7, grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2203:1: ( (lv_details_8_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2204:1: (lv_details_8_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2204:1: (lv_details_8_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2205:3: lv_details_8_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4839);
                    lv_details_8_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"details",
                            		lv_details_8_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2221:4: (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2221:6: otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) )
                    {
                    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleViewHeader4854); 

                        	newLeafNode(otherlv_9, grammarAccess.getViewHeaderAccess().getImageKeyword_6_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2225:1: ( (lv_image_10_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2226:1: (lv_image_10_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2226:1: (lv_image_10_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2227:3: lv_image_10_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4875);
                    lv_image_10_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"image",
                            		lv_image_10_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleViewHeader4889); 

                	newLeafNode(otherlv_11, grammarAccess.getViewHeaderAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleViewHeader"


    // $ANTLR start "entryRuleViewSection"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2255:1: entryRuleViewSection returns [EObject current=null] : iv_ruleViewSection= ruleViewSection EOF ;
    public final EObject entryRuleViewSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewSection = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2256:2: (iv_ruleViewSection= ruleViewSection EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2257:2: iv_ruleViewSection= ruleViewSection EOF
            {
             newCompositeNode(grammarAccess.getViewSectionRule()); 
            pushFollow(FOLLOW_ruleViewSection_in_entryRuleViewSection4925);
            iv_ruleViewSection=ruleViewSection();

            state._fsp--;

             current =iv_ruleViewSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewSection4935); 

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
    // $ANTLR end "entryRuleViewSection"


    // $ANTLR start "ruleViewSection"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2264:1: ruleViewSection returns [EObject current=null] : (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ otherlv_5= '}' ) ;
    public final EObject ruleViewSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_title_3_0 = null;

        EObject lv_cells_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2267:28: ( (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ otherlv_5= '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2268:1: (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ otherlv_5= '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2268:1: (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ otherlv_5= '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2268:3: otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleViewSection4972); 

                	newLeafNode(otherlv_0, grammarAccess.getViewSectionAccess().getSectionKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleViewSection4984); 

                	newLeafNode(otherlv_1, grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2276:1: (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2276:3: otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleViewSection4997); 

                        	newLeafNode(otherlv_2, grammarAccess.getViewSectionAccess().getTitleKeyword_2_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2280:1: ( (lv_title_3_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2281:1: (lv_title_3_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2281:1: (lv_title_3_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2282:3: lv_title_3_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewSection5018);
                    lv_title_3_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewSectionRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_3_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2298:4: ( (lv_cells_4_0= ruleSectionCell ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==50) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2299:1: (lv_cells_4_0= ruleSectionCell )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2299:1: (lv_cells_4_0= ruleSectionCell )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2300:3: lv_cells_4_0= ruleSectionCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSectionCell_in_ruleViewSection5041);
            	    lv_cells_4_0=ruleSectionCell();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getViewSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cells",
            	            		lv_cells_4_0, 
            	            		"SectionCell");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleViewSection5054); 

                	newLeafNode(otherlv_5, grammarAccess.getViewSectionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleViewSection"


    // $ANTLR start "entryRuleSectionCell"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2328:1: entryRuleSectionCell returns [EObject current=null] : iv_ruleSectionCell= ruleSectionCell EOF ;
    public final EObject entryRuleSectionCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionCell = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2329:2: (iv_ruleSectionCell= ruleSectionCell EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2330:2: iv_ruleSectionCell= ruleSectionCell EOF
            {
             newCompositeNode(grammarAccess.getSectionCellRule()); 
            pushFollow(FOLLOW_ruleSectionCell_in_entryRuleSectionCell5090);
            iv_ruleSectionCell=ruleSectionCell();

            state._fsp--;

             current =iv_ruleSectionCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionCell5100); 

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
    // $ANTLR end "entryRuleSectionCell"


    // $ANTLR start "ruleSectionCell"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2337:1: ruleSectionCell returns [EObject current=null] : (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? otherlv_4= '{' (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? (otherlv_11= 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleSectionCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_iterator_3_0 = null;

        EObject lv_text_6_0 = null;

        EObject lv_details_8_0 = null;

        EObject lv_image_10_0 = null;

        EObject lv_action_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2340:28: ( (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? otherlv_4= '{' (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? (otherlv_11= 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? otherlv_13= '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2341:1: (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? otherlv_4= '{' (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? (otherlv_11= 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? otherlv_13= '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2341:1: (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? otherlv_4= '{' (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? (otherlv_11= 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? otherlv_13= '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2341:3: otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? otherlv_4= '{' (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? (otherlv_11= 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleSectionCell5137); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionCellAccess().getCellKeyword_0());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2345:1: ( (lv_type_1_0= ruleCellType ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2346:1: (lv_type_1_0= ruleCellType )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2346:1: (lv_type_1_0= ruleCellType )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2347:3: lv_type_1_0= ruleCellType
            {
             
            	        newCompositeNode(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCellType_in_ruleSectionCell5158);
            lv_type_1_0=ruleCellType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"CellType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2363:2: (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2363:4: otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleSectionCell5171); 

                        	newLeafNode(otherlv_2, grammarAccess.getSectionCellAccess().getForeachKeyword_2_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2367:1: ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2368:1: (lv_iterator_3_0= ruleCollectionIterator )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2368:1: (lv_iterator_3_0= ruleCollectionIterator )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2369:3: lv_iterator_3_0= ruleCollectionIterator
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleSectionCell5192);
                    lv_iterator_3_0=ruleCollectionIterator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"iterator",
                            		lv_iterator_3_0, 
                            		"CollectionIterator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleSectionCell5206); 

                	newLeafNode(otherlv_4, grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2389:1: (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2389:3: otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleSectionCell5219); 

                        	newLeafNode(otherlv_5, grammarAccess.getSectionCellAccess().getTextKeyword_4_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2393:1: ( (lv_text_6_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2394:1: (lv_text_6_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2394:1: (lv_text_6_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2395:3: lv_text_6_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5240);
                    lv_text_6_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_6_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2411:4: (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2411:6: otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) )
                    {
                    otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleSectionCell5255); 

                        	newLeafNode(otherlv_7, grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2415:1: ( (lv_details_8_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2416:1: (lv_details_8_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2416:1: (lv_details_8_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2417:3: lv_details_8_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5276);
                    lv_details_8_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"details",
                            		lv_details_8_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2433:4: (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2433:6: otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) )
                    {
                    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleSectionCell5291); 

                        	newLeafNode(otherlv_9, grammarAccess.getSectionCellAccess().getImageKeyword_6_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2437:1: ( (lv_image_10_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2438:1: (lv_image_10_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2438:1: (lv_image_10_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2439:3: lv_image_10_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5312);
                    lv_image_10_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"image",
                            		lv_image_10_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2455:4: (otherlv_11= 'action=' ( (lv_action_12_0= ruleViewAction ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2455:6: otherlv_11= 'action=' ( (lv_action_12_0= ruleViewAction ) )
                    {
                    otherlv_11=(Token)match(input,53,FOLLOW_53_in_ruleSectionCell5327); 

                        	newLeafNode(otherlv_11, grammarAccess.getSectionCellAccess().getActionKeyword_7_0());
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2459:1: ( (lv_action_12_0= ruleViewAction ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2460:1: (lv_action_12_0= ruleViewAction )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2460:1: (lv_action_12_0= ruleViewAction )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2461:3: lv_action_12_0= ruleViewAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleViewAction_in_ruleSectionCell5348);
                    lv_action_12_0=ruleViewAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_12_0, 
                            		"ViewAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleSectionCell5362); 

                	newLeafNode(otherlv_13, grammarAccess.getSectionCellAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleSectionCell"


    // $ANTLR start "entryRuleCollectionIterator"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2489:1: entryRuleCollectionIterator returns [EObject current=null] : iv_ruleCollectionIterator= ruleCollectionIterator EOF ;
    public final EObject entryRuleCollectionIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionIterator = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2490:2: (iv_ruleCollectionIterator= ruleCollectionIterator EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2491:2: iv_ruleCollectionIterator= ruleCollectionIterator EOF
            {
             newCompositeNode(grammarAccess.getCollectionIteratorRule()); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator5398);
            iv_ruleCollectionIterator=ruleCollectionIterator();

            state._fsp--;

             current =iv_ruleCollectionIterator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator5408); 

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
    // $ANTLR end "entryRuleCollectionIterator"


    // $ANTLR start "ruleCollectionIterator"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2498:1: ruleCollectionIterator returns [EObject current=null] : ( ( (lv_collection_0_0= ruleCollectionExpression ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCollectionIterator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_collection_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2501:28: ( ( ( (lv_collection_0_0= ruleCollectionExpression ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2502:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2502:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2502:2: ( (lv_collection_0_0= ruleCollectionExpression ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2502:2: ( (lv_collection_0_0= ruleCollectionExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2503:1: (lv_collection_0_0= ruleCollectionExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2503:1: (lv_collection_0_0= ruleCollectionExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2504:3: lv_collection_0_0= ruleCollectionExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator5454);
            lv_collection_0_0=ruleCollectionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionIteratorRule());
            	        }
                   		set(
                   			current, 
                   			"collection",
                    		lv_collection_0_0, 
                    		"CollectionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleCollectionIterator5466); 

                	newLeafNode(otherlv_1, grammarAccess.getCollectionIteratorAccess().getAsKeyword_1());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2524:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2525:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2525:1: (lv_name_2_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2526:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionIterator5483); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectionIteratorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleCollectionIterator"


    // $ANTLR start "entryRuleViewAction"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2550:1: entryRuleViewAction returns [EObject current=null] : iv_ruleViewAction= ruleViewAction EOF ;
    public final EObject entryRuleViewAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewAction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2551:2: (iv_ruleViewAction= ruleViewAction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2552:2: iv_ruleViewAction= ruleViewAction EOF
            {
             newCompositeNode(grammarAccess.getViewActionRule()); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction5524);
            iv_ruleViewAction=ruleViewAction();

            state._fsp--;

             current =iv_ruleViewAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction5534); 

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
    // $ANTLR end "entryRuleViewAction"


    // $ANTLR start "ruleViewAction"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2559:1: ruleViewAction returns [EObject current=null] : (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen ) ;
    public final EObject ruleViewAction() throws RecognitionException {
        EObject current = null;

        EObject this_ViewCall_0 = null;

        EObject this_ExternalOpen_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2562:28: ( (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2563:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2563:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==EOF||LA41_1==12||LA41_1==23) ) {
                    alt41=2;
                }
                else if ( (LA41_1==13) ) {
                    alt41=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0==RULE_STRING||LA41_0==13||LA41_0==15||LA41_0==17) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2564:5: this_ViewCall_0= ruleViewCall
                    {
                     
                            newCompositeNode(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleViewCall_in_ruleViewAction5581);
                    this_ViewCall_0=ruleViewCall();

                    state._fsp--;

                     
                            current = this_ViewCall_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2574:5: this_ExternalOpen_1= ruleExternalOpen
                    {
                     
                            newCompositeNode(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExternalOpen_in_ruleViewAction5608);
                    this_ExternalOpen_1=ruleExternalOpen();

                    state._fsp--;

                     
                            current = this_ExternalOpen_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleViewAction"


    // $ANTLR start "entryRuleExternalOpen"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2590:1: entryRuleExternalOpen returns [EObject current=null] : iv_ruleExternalOpen= ruleExternalOpen EOF ;
    public final EObject entryRuleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalOpen = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2591:2: (iv_ruleExternalOpen= ruleExternalOpen EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2592:2: iv_ruleExternalOpen= ruleExternalOpen EOF
            {
             newCompositeNode(grammarAccess.getExternalOpenRule()); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen5643);
            iv_ruleExternalOpen=ruleExternalOpen();

            state._fsp--;

             current =iv_ruleExternalOpen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen5653); 

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
    // $ANTLR end "entryRuleExternalOpen"


    // $ANTLR start "ruleExternalOpen"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2599:1: ruleExternalOpen returns [EObject current=null] : ( (lv_url_0_0= ruleScalarExpression ) ) ;
    public final EObject ruleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject lv_url_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2602:28: ( ( (lv_url_0_0= ruleScalarExpression ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2603:1: ( (lv_url_0_0= ruleScalarExpression ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2603:1: ( (lv_url_0_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2604:1: (lv_url_0_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2604:1: (lv_url_0_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2605:3: lv_url_0_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleExternalOpen5698);
            lv_url_0_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalOpenRule());
            	        }
                   		set(
                   			current, 
                   			"url",
                    		lv_url_0_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleExternalOpen"


    // $ANTLR start "entryRuleViewCall"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2629:1: entryRuleViewCall returns [EObject current=null] : iv_ruleViewCall= ruleViewCall EOF ;
    public final EObject entryRuleViewCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewCall = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2630:2: (iv_ruleViewCall= ruleViewCall EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2631:2: iv_ruleViewCall= ruleViewCall EOF
            {
             newCompositeNode(grammarAccess.getViewCallRule()); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall5733);
            iv_ruleViewCall=ruleViewCall();

            state._fsp--;

             current =iv_ruleViewCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall5743); 

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
    // $ANTLR end "entryRuleViewCall"


    // $ANTLR start "ruleViewCall"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2638:1: ruleViewCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? otherlv_3= ')' ) ;
    public final EObject ruleViewCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_provider_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2641:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? otherlv_3= ')' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2642:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? otherlv_3= ')' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2642:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? otherlv_3= ')' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2642:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? otherlv_3= ')'
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2642:2: ( (otherlv_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2643:1: (otherlv_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2643:1: (otherlv_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2644:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getViewCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewCall5788); 

            		newLeafNode(otherlv_0, grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleViewCall5800); 

                	newLeafNode(otherlv_1, grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1());
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2659:1: ( (lv_provider_2_0= ruleProviderConstruction ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||LA42_0==13||LA42_0==15||(LA42_0>=17 && LA42_0<=18)||LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2660:1: (lv_provider_2_0= ruleProviderConstruction )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2660:1: (lv_provider_2_0= ruleProviderConstruction )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2661:3: lv_provider_2_0= ruleProviderConstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProviderConstruction_in_ruleViewCall5821);
                    lv_provider_2_0=ruleProviderConstruction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewCallRule());
                    	        }
                           		set(
                           			current, 
                           			"provider",
                            		lv_provider_2_0, 
                            		"ProviderConstruction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleViewCall5834); 

                	newLeafNode(otherlv_3, grammarAccess.getViewCallAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleViewCall"


    // $ANTLR start "ruleCellType"
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2689:1: ruleCellType returns [Enumerator current=null] : ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'DefaultWithDisclosure' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Subtitle' ) ) ;
    public final Enumerator ruleCellType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2691:28: ( ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'DefaultWithDisclosure' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Subtitle' ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2692:1: ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'DefaultWithDisclosure' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Subtitle' ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2692:1: ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'DefaultWithDisclosure' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Subtitle' ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt43=1;
                }
                break;
            case 56:
                {
                alt43=2;
                }
                break;
            case 57:
                {
                alt43=3;
                }
                break;
            case 58:
                {
                alt43=4;
                }
                break;
            case 59:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2692:2: (enumLiteral_0= 'Default' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2692:2: (enumLiteral_0= 'Default' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2692:4: enumLiteral_0= 'Default'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleCellType5884); 

                            current = grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2698:6: (enumLiteral_1= 'DefaultWithDisclosure' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2698:6: (enumLiteral_1= 'DefaultWithDisclosure' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2698:8: enumLiteral_1= 'DefaultWithDisclosure'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleCellType5901); 

                            current = grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2704:6: (enumLiteral_2= 'Value2' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2704:6: (enumLiteral_2= 'Value2' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2704:8: enumLiteral_2= 'Value2'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleCellType5918); 

                            current = grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2710:6: (enumLiteral_3= 'Double' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2710:6: (enumLiteral_3= 'Double' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2710:8: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_58_in_ruleCellType5935); 

                            current = grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2716:6: (enumLiteral_4= 'Subtitle' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2716:6: (enumLiteral_4= 'Subtitle' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2716:8: enumLiteral_4= 'Subtitle'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_59_in_ruleCellType5952); 

                            current = grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleCellType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleModel131 = new BitSet(new long[]{0x00000E04B0000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_ruleModel152 = new BitSet(new long[]{0x00000E04B0000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_ruleApplication245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModelElement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_ruleModelElement363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_ruleModelElement390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleModelElement417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDescription464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDescription509 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleTypeDescription527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleParameter633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_entryRuleObjectReference691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectReference701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectReference746 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleObjectReference767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedObjectReference814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleNestedObjectReference851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNestedObjectReference871 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleNestedObjectReference892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleExpression986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleExpression1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleExpression1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleExpression1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleExpression1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression1129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarExpression1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleScalarExpression1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleScalarExpression1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleScalarExpression1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression1275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleCollectionExpression1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStringFunction1569 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1590 = new BitSet(new long[]{0x000000000002E030L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStringFunction1632 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1653 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringFunction1665 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1686 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringFunction1698 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1719 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStringFunction1760 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1781 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCollectionLiteral1877 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1898 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionLiteral1911 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1932 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleCollectionLiteral1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunction1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCollectionFunction2038 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2059 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionFunction2071 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2092 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCollectionFunction2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication2140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabBarApplication2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTabBarApplication2187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTabBarApplication2204 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTabBarApplication2221 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_ruleTabBarApplication2242 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleTabBarApplication2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton2291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabbarButton2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTabbarButton2338 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTabbarButton2350 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTabbarButton2362 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTabbarButton2383 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTabbarButton2395 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTabbarButton2416 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTabbarButton2428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleTabbarButton2449 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTabbarButton2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConstant2553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant2570 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleConstant2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType2751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSimpleType2798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType2815 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSimpleType2832 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleType2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEntity2937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2954 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_32_in_ruleEntity2972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2992 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEntity3006 = new BitSet(new long[]{0x0000000200800010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity3027 = new BitSet(new long[]{0x0000000200800010L});
    public static final BitSet FOLLOW_23_in_ruleEntity3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleProperty3129 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleProperty3164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider3222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleContentProvider3269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider3286 = new BitSet(new long[]{0x0000001800002000L});
    public static final BitSet FOLLOW_13_in_ruleContentProvider3304 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleContentProvider3325 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContentProvider3337 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleContentProvider3352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_36_in_ruleContentProvider3376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider3410 = new BitSet(new long[]{0x0000002000000800L});
    public static final BitSet FOLLOW_11_in_ruleContentProvider3428 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleContentProvider3454 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleContentProvider3466 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleContentProvider3478 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider3499 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleContentProvider3511 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction3568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderConstruction3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProviderConstruction3633 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProviderConstruction3645 = new BitSet(new long[]{0x000000000016E030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction3666 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProviderConstruction3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView3754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_ruleView3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_ruleView3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_entryRuleSectionedView3873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionedView3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_ruleSectionedView3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_ruleSectionedView3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView3992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTableView4039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableView4056 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleTableView4074 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTableView4095 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTableView4107 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTableView4121 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTableView4133 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTableView4154 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleTableView4175 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTableView4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_entryRuleDetailsView4224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailsView4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDetailsView4271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDetailsView4288 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleDetailsView4306 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDetailsView4327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDetailsView4339 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDetailsView4353 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDetailsView4365 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleDetailsView4386 = new BitSet(new long[]{0x0002200000800000L});
    public static final BitSet FOLLOW_ruleViewHeader_in_ruleDetailsView4407 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleDetailsView4429 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDetailsView4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView4478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCustomView4525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomView4542 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_13_in_ruleCustomView4560 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCustomView4581 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomView4593 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCustomView4607 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomView4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_entryRuleViewHeader4665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewHeader4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleViewHeader4721 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleViewHeader4733 = new BitSet(new long[]{0x0001C00002800000L});
    public static final BitSet FOLLOW_25_in_ruleViewHeader4746 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4767 = new BitSet(new long[]{0x0001C00000800000L});
    public static final BitSet FOLLOW_46_in_ruleViewHeader4782 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4803 = new BitSet(new long[]{0x0001800000800000L});
    public static final BitSet FOLLOW_47_in_ruleViewHeader4818 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4839 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_48_in_ruleViewHeader4854 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4875 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleViewHeader4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_entryRuleViewSection4925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewSection4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleViewSection4972 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleViewSection4984 = new BitSet(new long[]{0x0004000002000000L});
    public static final BitSet FOLLOW_25_in_ruleViewSection4997 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewSection5018 = new BitSet(new long[]{0x0004000002000000L});
    public static final BitSet FOLLOW_ruleSectionCell_in_ruleViewSection5041 = new BitSet(new long[]{0x0004000002800000L});
    public static final BitSet FOLLOW_23_in_ruleViewSection5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_entryRuleSectionCell5090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionCell5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSectionCell5137 = new BitSet(new long[]{0x0F80000000000000L});
    public static final BitSet FOLLOW_ruleCellType_in_ruleSectionCell5158 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_51_in_ruleSectionCell5171 = new BitSet(new long[]{0x000000000016A030L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleSectionCell5192 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSectionCell5206 = new BitSet(new long[]{0x0031800000800000L});
    public static final BitSet FOLLOW_52_in_ruleSectionCell5219 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5240 = new BitSet(new long[]{0x0021800000800000L});
    public static final BitSet FOLLOW_47_in_ruleSectionCell5255 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5276 = new BitSet(new long[]{0x0021000000800000L});
    public static final BitSet FOLLOW_48_in_ruleSectionCell5291 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5312 = new BitSet(new long[]{0x0020000000800000L});
    public static final BitSet FOLLOW_53_in_ruleSectionCell5327 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleViewAction_in_ruleSectionCell5348 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSectionCell5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator5398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator5454 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleCollectionIterator5466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionIterator5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction5524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleViewAction5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_ruleViewAction5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen5643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleExternalOpen5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall5733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewCall5788 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewCall5800 = new BitSet(new long[]{0x000000000016E030L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_ruleViewCall5821 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleViewCall5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleCellType5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCellType5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCellType5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCellType5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCellType5952 = new BitSet(new long[]{0x0000000000000002L});

}