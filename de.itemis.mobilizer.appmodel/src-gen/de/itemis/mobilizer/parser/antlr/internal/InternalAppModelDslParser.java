package de.itemis.mobilizer.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import de.itemis.mobilizer.services.AppModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppModelDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[]'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'['", "']'", "'split('", "'tabbarApplication'", "'{'", "'}'", "'button'", "'title='", "'icon='", "'view='", "'type'", "'mapsTo'", "'entity'", "'extends'", "'derived'", "'contentprovider'", "'returns'", "'resolves'", "'fetches'", "'XML'", "'from'", "'selects'", "'tableview'", "'detailsview'", "'customview'", "'implementedBy'", "'header'", "'subtitle='", "'details='", "'image='", "'section'", "'cell'", "'foreach'", "'text='", "'action='", "'as'", "'Default'", "'DefaultWithDisclosure'", "'Value2'", "'Double'", "'Subtitle'"
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
    public String getGrammarFileName() { return "../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g"; }



     	private AppModelDslGrammarAccess grammarAccess;
     	
        public InternalAppModelDslParser(TokenStream input, IAstFactory factory, AppModelDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AppModelDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:80:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:87:1: ruleModel returns [EObject current=null] : ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:92:6: ( ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:93:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:93:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:93:2: ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )*
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:93:2: ( (lv_application_0_0= ruleApplication ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:94:1: (lv_application_0_0= ruleApplication )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:94:1: (lv_application_0_0= ruleApplication )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:95:3: lv_application_0_0= ruleApplication
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleApplication_in_ruleModel131);
            lv_application_0_0=ruleApplication();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"application",
            	        		lv_application_0_0, 
            	        		"Application", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:117:2: ( (lv_elements_1_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28||LA1_0==30||LA1_0==33||(LA1_0>=40 && LA1_0<=42)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:118:1: (lv_elements_1_0= ruleModelElement )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:118:1: (lv_elements_1_0= ruleModelElement )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:119:3: lv_elements_1_0= ruleModelElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElement_in_ruleModel152);
            	    lv_elements_1_0=ruleModelElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_1_0, 
            	    	        		"ModelElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleApplication
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:149:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:150:2: (iv_ruleApplication= ruleApplication EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:151:2: iv_ruleApplication= ruleApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication189);
            iv_ruleApplication=ruleApplication();
            _fsp--;

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
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:158:1: ruleApplication returns [EObject current=null] : this_TabBarApplication_0= ruleTabBarApplication ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        EObject this_TabBarApplication_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:163:6: (this_TabBarApplication_0= ruleTabBarApplication )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:165:5: this_TabBarApplication_0= ruleTabBarApplication
            {
             
                    currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getTabBarApplicationParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleTabBarApplication_in_ruleApplication245);
            this_TabBarApplication_0=ruleTabBarApplication();
            _fsp--;

             
                    current = this_TabBarApplication_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleModelElement
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:181:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:182:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:183:2: iv_ruleModelElement= ruleModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement279);
            iv_ruleModelElement=ruleModelElement();
            _fsp--;

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
    // $ANTLR end entryRuleModelElement


    // $ANTLR start ruleModelElement
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:190:1: ruleModelElement returns [EObject current=null] : (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ContentProvider_1 = null;

        EObject this_View_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:195:6: ( (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:196:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:196:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 28:
            case 30:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 40:
            case 41:
            case 42:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("196:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:197:5: this_Type_0= ruleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleModelElement336);
                    this_Type_0=ruleType();
                    _fsp--;

                     
                            current = this_Type_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:207:5: this_ContentProvider_1= ruleContentProvider
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentProvider_in_ruleModelElement363);
                    this_ContentProvider_1=ruleContentProvider();
                    _fsp--;

                     
                            current = this_ContentProvider_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:217:5: this_View_2= ruleView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getViewParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleView_in_ruleModelElement390);
                    this_View_2=ruleView();
                    _fsp--;

                     
                            current = this_View_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModelElement


    // $ANTLR start entryRuleTypeDescription
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:235:1: entryRuleTypeDescription returns [EObject current=null] : iv_ruleTypeDescription= ruleTypeDescription EOF ;
    public final EObject entryRuleTypeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDescription = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:236:2: (iv_ruleTypeDescription= ruleTypeDescription EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:237:2: iv_ruleTypeDescription= ruleTypeDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription427);
            iv_ruleTypeDescription=ruleTypeDescription();
            _fsp--;

             current =iv_ruleTypeDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDescription437); 

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
    // $ANTLR end entryRuleTypeDescription


    // $ANTLR start ruleTypeDescription
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:244:1: ruleTypeDescription returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeDescription() throws RecognitionException {
        EObject current = null;

        Token lv_many_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:249:6: ( ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:250:1: ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:250:1: ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:250:2: ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )?
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:250:2: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:251:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:251:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:252:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDescription480); 

            		createLeafNode(grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:264:2: ( (lv_many_1_0= '[]' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:265:1: (lv_many_1_0= '[]' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:265:1: (lv_many_1_0= '[]' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:266:3: lv_many_1_0= '[]'
                    {
                    lv_many_1_0=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleTypeDescription498); 

                            createLeafNode(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0(), "many"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeDescriptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "many", true, "[]", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeDescription


    // $ANTLR start entryRuleParameter
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:293:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:294:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:295:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter548);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter558); 

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
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:302:1: ruleParameter returns [EObject current=null] : ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:307:6: ( ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:308:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:308:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:308:2: ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:308:2: ( (lv_description_0_0= ruleTypeDescription ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:309:1: (lv_description_0_0= ruleTypeDescription )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:309:1: (lv_description_0_0= ruleTypeDescription )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:310:3: lv_description_0_0= ruleTypeDescription
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleParameter604);
            lv_description_0_0=ruleTypeDescription();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"description",
            	        		lv_description_0_0, 
            	        		"TypeDescription", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:332:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:333:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:333:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:334:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter621); 

            			createLeafNode(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleObjectReference
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:364:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:365:2: (iv_ruleObjectReference= ruleObjectReference EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:366:2: iv_ruleObjectReference= ruleObjectReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleObjectReference_in_entryRuleObjectReference662);
            iv_ruleObjectReference=ruleObjectReference();
            _fsp--;

             current =iv_ruleObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectReference672); 

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
    // $ANTLR end entryRuleObjectReference


    // $ANTLR start ruleObjectReference
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:373:1: ruleObjectReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:378:6: ( ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:379:1: ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:379:1: ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:379:2: ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:379:2: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:380:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:380:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:381:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getObjectReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectReference715); 

            		createLeafNode(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0(), "object"); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:393:2: ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:394:1: (lv_tail_1_0= ruleNestedObjectReference )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:394:1: (lv_tail_1_0= ruleNestedObjectReference )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:395:3: lv_tail_1_0= ruleNestedObjectReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleObjectReference736);
                    lv_tail_1_0=ruleNestedObjectReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tail",
                    	        		lv_tail_1_0, 
                    	        		"NestedObjectReference", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleObjectReference


    // $ANTLR start entryRuleNestedObjectReference
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:425:1: entryRuleNestedObjectReference returns [EObject current=null] : iv_ruleNestedObjectReference= ruleNestedObjectReference EOF ;
    public final EObject entryRuleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedObjectReference = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:426:2: (iv_ruleNestedObjectReference= ruleNestedObjectReference EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:427:2: iv_ruleNestedObjectReference= ruleNestedObjectReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNestedObjectReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference773);
            iv_ruleNestedObjectReference=ruleNestedObjectReference();
            _fsp--;

             current =iv_ruleNestedObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedObjectReference783); 

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
    // $ANTLR end entryRuleNestedObjectReference


    // $ANTLR start ruleNestedObjectReference
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:434:1: ruleNestedObjectReference returns [EObject current=null] : ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:439:6: ( ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:440:1: ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:440:1: ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:440:3: '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            {
            match(input,12,FOLLOW_12_in_ruleNestedObjectReference818); 

                    createLeafNode(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:444:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:445:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:445:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:446:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getNestedObjectReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNestedObjectReference836); 

            		createLeafNode(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0(), "object"); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:458:2: ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:459:1: (lv_tail_2_0= ruleNestedObjectReference )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:459:1: (lv_tail_2_0= ruleNestedObjectReference )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:460:3: lv_tail_2_0= ruleNestedObjectReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleNestedObjectReference857);
                    lv_tail_2_0=ruleNestedObjectReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNestedObjectReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tail",
                    	        		lv_tail_2_0, 
                    	        		"NestedObjectReference", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNestedObjectReference


    // $ANTLR start entryRuleExpression
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:490:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:491:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:492:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression894);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression904); 

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:499:1: ruleExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_CollectionLiteral_2 = null;

        EObject this_CollectionFunction_3 = null;

        EObject this_ObjectReference_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:504:6: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:505:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:505:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
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
                    new NoViableAltException("505:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:506:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleExpression951);
                    this_StringLiteral_0=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:516:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleExpression978);
                    this_StringFunction_1=ruleStringFunction();
                    _fsp--;

                     
                            current = this_StringFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:526:5: this_CollectionLiteral_2= ruleCollectionLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleExpression1005);
                    this_CollectionLiteral_2=ruleCollectionLiteral();
                    _fsp--;

                     
                            current = this_CollectionLiteral_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:536:5: this_CollectionFunction_3= ruleCollectionFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleExpression1032);
                    this_CollectionFunction_3=ruleCollectionFunction();
                    _fsp--;

                     
                            current = this_CollectionFunction_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:546:5: this_ObjectReference_4= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleExpression1059);
                    this_ObjectReference_4=ruleObjectReference();
                    _fsp--;

                     
                            current = this_ObjectReference_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleScalarExpression
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:562:1: entryRuleScalarExpression returns [EObject current=null] : iv_ruleScalarExpression= ruleScalarExpression EOF ;
    public final EObject entryRuleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarExpression = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:563:2: (iv_ruleScalarExpression= ruleScalarExpression EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:564:2: iv_ruleScalarExpression= ruleScalarExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScalarExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression1094);
            iv_ruleScalarExpression=ruleScalarExpression();
            _fsp--;

             current =iv_ruleScalarExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarExpression1104); 

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
    // $ANTLR end entryRuleScalarExpression


    // $ANTLR start ruleScalarExpression
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:571:1: ruleScalarExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:576:6: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:577:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:577:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
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
                    new NoViableAltException("577:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:578:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleScalarExpression1151);
                    this_StringLiteral_0=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:588:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleScalarExpression1178);
                    this_StringFunction_1=ruleStringFunction();
                    _fsp--;

                     
                            current = this_StringFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:598:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleScalarExpression1205);
                    this_ObjectReference_2=ruleObjectReference();
                    _fsp--;

                     
                            current = this_ObjectReference_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleScalarExpression


    // $ANTLR start entryRuleCollectionExpression
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:614:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:615:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:616:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression1240);
            iv_ruleCollectionExpression=ruleCollectionExpression();
            _fsp--;

             current =iv_ruleCollectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression1250); 

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
    // $ANTLR end entryRuleCollectionExpression


    // $ANTLR start ruleCollectionExpression
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:623:1: ruleCollectionExpression returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteral_0 = null;

        EObject this_CollectionFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:628:6: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:629:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:629:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
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
                    new NoViableAltException("629:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:630:5: this_CollectionLiteral_0= ruleCollectionLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression1297);
                    this_CollectionLiteral_0=ruleCollectionLiteral();
                    _fsp--;

                     
                            current = this_CollectionLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:640:5: this_CollectionFunction_1= ruleCollectionFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression1324);
                    this_CollectionFunction_1=ruleCollectionFunction();
                    _fsp--;

                     
                            current = this_CollectionFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:650:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleCollectionExpression1351);
                    this_ObjectReference_2=ruleObjectReference();
                    _fsp--;

                     
                            current = this_ObjectReference_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionExpression


    // $ANTLR start entryRuleStringLiteral
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:666:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:667:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:668:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1386);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1396); 

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
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:675:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:680:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:681:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:681:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:682:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:682:1: (lv_value_0_0= RULE_STRING )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:683:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1437); 

            			createLeafNode(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleStringFunction
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:713:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:714:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:715:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction1477);
            iv_ruleStringFunction=ruleStringFunction();
            _fsp--;

             current =iv_ruleStringFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction1487); 

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
    // $ANTLR end entryRuleStringFunction


    // $ANTLR start ruleStringFunction
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:722:1: ruleStringFunction returns [EObject current=null] : ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_values_2_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_match_8_0 = null;

        EObject lv_replacement_10_0 = null;

        EObject lv_value_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:727:6: ( ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:728:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:728:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
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
                    new NoViableAltException("728:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:728:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:728:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:728:3: () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:728:3: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:729:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,13,FOLLOW_13_in_ruleStringFunction1532); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:743:1: ( (lv_values_2_0= ruleScalarExpression ) )+
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
                    	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:744:1: (lv_values_2_0= ruleScalarExpression )
                    	    {
                    	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:744:1: (lv_values_2_0= ruleScalarExpression )
                    	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:745:3: lv_values_2_0= ruleScalarExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1553);
                    	    lv_values_2_0=ruleScalarExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"values",
                    	    	        		lv_values_2_0, 
                    	    	        		"ScalarExpression", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

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

                    match(input,14,FOLLOW_14_in_ruleStringFunction1564); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:772:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:772:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:772:7: () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:772:7: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:773:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,15,FOLLOW_15_in_ruleStringFunction1591); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:787:1: ( (lv_value_6_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:788:1: (lv_value_6_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:788:1: (lv_value_6_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:789:3: lv_value_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1612);
                    lv_value_6_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_6_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleStringFunction1622); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:815:1: ( (lv_match_8_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:816:1: (lv_match_8_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:816:1: (lv_match_8_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:817:3: lv_match_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1643);
                    lv_match_8_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"match",
                    	        		lv_match_8_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleStringFunction1653); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:843:1: ( (lv_replacement_10_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:844:1: (lv_replacement_10_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:844:1: (lv_replacement_10_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:845:3: lv_replacement_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1674);
                    lv_replacement_10_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"replacement",
                    	        		lv_replacement_10_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleStringFunction1684); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:872:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:872:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:872:7: () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:872:7: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:873:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,17,FOLLOW_17_in_ruleStringFunction1711); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:887:1: ( (lv_value_14_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:888:1: (lv_value_14_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:888:1: (lv_value_14_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:889:3: lv_value_14_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1732);
                    lv_value_14_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_14_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleStringFunction1742); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringFunction


    // $ANTLR start entryRuleCollectionLiteral
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:923:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteral = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:924:2: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:925:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral1779);
            iv_ruleCollectionLiteral=ruleCollectionLiteral();
            _fsp--;

             current =iv_ruleCollectionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral1789); 

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
    // $ANTLR end entryRuleCollectionLiteral


    // $ANTLR start ruleCollectionLiteral
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:932:1: ruleCollectionLiteral returns [EObject current=null] : ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:937:6: ( ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:938:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:938:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:938:3: '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']'
            {
            match(input,18,FOLLOW_18_in_ruleCollectionLiteral1824); 

                    createLeafNode(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:942:1: ( (lv_items_1_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:943:1: (lv_items_1_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:943:1: (lv_items_1_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:944:3: lv_items_1_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1845);
            lv_items_1_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"items",
            	        		lv_items_1_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:966:2: ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:966:4: ',' ( (lv_items_3_0= ruleScalarExpression ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleCollectionLiteral1856); 

            	            createLeafNode(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:970:1: ( (lv_items_3_0= ruleScalarExpression ) )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:971:1: (lv_items_3_0= ruleScalarExpression )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:971:1: (lv_items_3_0= ruleScalarExpression )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:972:3: lv_items_3_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1877);
            	    lv_items_3_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCollectionLiteralRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_3_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleCollectionLiteral1889); 

                    createLeafNode(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionLiteral


    // $ANTLR start entryRuleCollectionFunction
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1006:1: entryRuleCollectionFunction returns [EObject current=null] : iv_ruleCollectionFunction= ruleCollectionFunction EOF ;
    public final EObject entryRuleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFunction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1007:2: (iv_ruleCollectionFunction= ruleCollectionFunction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1008:2: iv_ruleCollectionFunction= ruleCollectionFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction1925);
            iv_ruleCollectionFunction=ruleCollectionFunction();
            _fsp--;

             current =iv_ruleCollectionFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunction1935); 

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
    // $ANTLR end entryRuleCollectionFunction


    // $ANTLR start ruleCollectionFunction
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1015:1: ruleCollectionFunction returns [EObject current=null] : ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) ;
    public final EObject ruleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;

        EObject lv_delimiter_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1020:6: ( ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1021:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1021:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1021:2: () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')'
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1021:2: ()
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1022:5: 
            {
             
                    temp=factory.create(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,20,FOLLOW_20_in_ruleCollectionFunction1979); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1036:1: ( (lv_value_2_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1037:1: (lv_value_2_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1037:1: (lv_value_2_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1038:3: lv_value_2_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2000);
            lv_value_2_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleCollectionFunction2010); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1064:1: ( (lv_delimiter_4_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1065:1: (lv_delimiter_4_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1065:1: (lv_delimiter_4_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1066:3: lv_delimiter_4_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2031);
            lv_delimiter_4_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"delimiter",
            	        		lv_delimiter_4_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleCollectionFunction2041); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionFunction


    // $ANTLR start entryRuleTabBarApplication
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1100:1: entryRuleTabBarApplication returns [EObject current=null] : iv_ruleTabBarApplication= ruleTabBarApplication EOF ;
    public final EObject entryRuleTabBarApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabBarApplication = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1101:2: (iv_ruleTabBarApplication= ruleTabBarApplication EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1102:2: iv_ruleTabBarApplication= ruleTabBarApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabBarApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication2077);
            iv_ruleTabBarApplication=ruleTabBarApplication();
            _fsp--;

             current =iv_ruleTabBarApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabBarApplication2087); 

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
    // $ANTLR end entryRuleTabBarApplication


    // $ANTLR start ruleTabBarApplication
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1109:1: ruleTabBarApplication returns [EObject current=null] : ( 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* '}' ) ;
    public final EObject ruleTabBarApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_buttons_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1114:6: ( ( 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1115:1: ( 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1115:1: ( 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1115:3: 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* '}'
            {
            match(input,21,FOLLOW_21_in_ruleTabBarApplication2122); 

                    createLeafNode(grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1119:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1120:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1120:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1121:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTabBarApplication2139); 

            			createLeafNode(grammarAccess.getTabBarApplicationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTabBarApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,22,FOLLOW_22_in_ruleTabBarApplication2154); 

                    createLeafNode(grammarAccess.getTabBarApplicationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1147:1: ( (lv_buttons_3_0= ruleTabbarButton ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1148:1: (lv_buttons_3_0= ruleTabbarButton )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1148:1: (lv_buttons_3_0= ruleTabbarButton )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1149:3: lv_buttons_3_0= ruleTabbarButton
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabBarApplicationAccess().getButtonsTabbarButtonParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTabbarButton_in_ruleTabBarApplication2175);
            	    lv_buttons_3_0=ruleTabbarButton();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTabBarApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"buttons",
            	    	        		lv_buttons_3_0, 
            	    	        		"TabbarButton", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleTabBarApplication2186); 

                    createLeafNode(grammarAccess.getTabBarApplicationAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTabBarApplication


    // $ANTLR start entryRuleTabbarButton
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1183:1: entryRuleTabbarButton returns [EObject current=null] : iv_ruleTabbarButton= ruleTabbarButton EOF ;
    public final EObject entryRuleTabbarButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabbarButton = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1184:2: (iv_ruleTabbarButton= ruleTabbarButton EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1185:2: iv_ruleTabbarButton= ruleTabbarButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabbarButtonRule(), currentNode); 
            pushFollow(FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton2222);
            iv_ruleTabbarButton=ruleTabbarButton();
            _fsp--;

             current =iv_ruleTabbarButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabbarButton2232); 

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
    // $ANTLR end entryRuleTabbarButton


    // $ANTLR start ruleTabbarButton
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1192:1: ruleTabbarButton returns [EObject current=null] : ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' ) ;
    public final EObject ruleTabbarButton() throws RecognitionException {
        EObject current = null;

        EObject lv_title_3_0 = null;

        EObject lv_icon_5_0 = null;

        EObject lv_view_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1197:6: ( ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1198:1: ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1198:1: ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1198:3: 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}'
            {
            match(input,24,FOLLOW_24_in_ruleTabbarButton2267); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getButtonKeyword_0(), null); 
                
            match(input,22,FOLLOW_22_in_ruleTabbarButton2277); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_ruleTabbarButton2287); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getTitleKeyword_2(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1210:1: ( (lv_title_3_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1211:1: (lv_title_3_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1211:1: (lv_title_3_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1212:3: lv_title_3_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTabbarButton2308);
            lv_title_3_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTabbarButtonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_3_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,26,FOLLOW_26_in_ruleTabbarButton2318); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getIconKeyword_4(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1238:1: ( (lv_icon_5_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1239:1: (lv_icon_5_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1239:1: (lv_icon_5_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1240:3: lv_icon_5_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTabbarButton2339);
            lv_icon_5_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTabbarButtonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"icon",
            	        		lv_icon_5_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,27,FOLLOW_27_in_ruleTabbarButton2349); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getViewKeyword_6(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1266:1: ( (lv_view_7_0= ruleViewCall ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1267:1: (lv_view_7_0= ruleViewCall )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1267:1: (lv_view_7_0= ruleViewCall )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1268:3: lv_view_7_0= ruleViewCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleViewCall_in_ruleTabbarButton2370);
            lv_view_7_0=ruleViewCall();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTabbarButtonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"view",
            	        		lv_view_7_0, 
            	        		"ViewCall", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,23,FOLLOW_23_in_ruleTabbarButton2380); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getRightCurlyBracketKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTabbarButton


    // $ANTLR start entryRuleType
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1302:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1303:2: (iv_ruleType= ruleType EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1304:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2416);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2426); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1311:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1316:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1317:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1317:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1317:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1318:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType2473);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1328:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType2500);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1344:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1345:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1346:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType2535);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType2545); 

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
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1353:1: ruleSimpleType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_platformType_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1358:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1359:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1359:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1359:3: 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) )
            {
            match(input,28,FOLLOW_28_in_ruleSimpleType2580); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1363:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1364:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1364:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1365:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType2597); 

            			createLeafNode(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,29,FOLLOW_29_in_ruleSimpleType2612); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1391:1: ( (lv_platformType_3_0= RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1392:1: (lv_platformType_3_0= RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1392:1: (lv_platformType_3_0= RULE_STRING )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1393:3: lv_platformType_3_0= RULE_STRING
            {
            lv_platformType_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleType2629); 

            			createLeafNode(grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0(), "platformType"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"platformType",
            	        		lv_platformType_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1423:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1424:2: (iv_ruleEntity= ruleEntity EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1425:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2670);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2680); 

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
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1432:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_properties_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1437:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1438:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1438:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1438:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}'
            {
            match(input,30,FOLLOW_30_in_ruleEntity2715); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1442:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1443:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1443:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1444:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2732); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1466:2: ( 'extends' ( ( RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1466:4: 'extends' ( ( RULE_ID ) )
                    {
                    match(input,31,FOLLOW_31_in_ruleEntity2748); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1470:1: ( ( RULE_ID ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1471:1: ( RULE_ID )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1471:1: ( RULE_ID )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1472:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2766); 

                    		createLeafNode(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0(), "extends"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleEntity2778); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1488:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1489:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1489:1: (lv_properties_5_0= ruleProperty )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1490:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity2799);
            	    lv_properties_5_0=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"properties",
            	    	        		lv_properties_5_0, 
            	    	        		"Property", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleEntity2810); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleProperty
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1524:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1525:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1526:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2846);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2856); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1533:1: ruleProperty returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_description_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1538:6: ( ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1539:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1539:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1539:2: ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1539:2: ( (lv_derived_0_0= 'derived' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1540:1: (lv_derived_0_0= 'derived' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1540:1: (lv_derived_0_0= 'derived' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1541:3: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleProperty2899); 

                            createLeafNode(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0(), "derived"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "derived", true, "derived", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1560:3: ( (lv_description_1_0= ruleTypeDescription ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1561:1: (lv_description_1_0= ruleTypeDescription )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1561:1: (lv_description_1_0= ruleTypeDescription )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1562:3: lv_description_1_0= ruleTypeDescription
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleProperty2934);
            lv_description_1_0=ruleTypeDescription();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"description",
            	        		lv_description_1_0, 
            	        		"TypeDescription", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1584:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1585:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1585:1: (lv_name_2_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1586:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2951); 

            			createLeafNode(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleContentProvider
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1616:1: entryRuleContentProvider returns [EObject current=null] : iv_ruleContentProvider= ruleContentProvider EOF ;
    public final EObject entryRuleContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProvider = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1617:2: (iv_ruleContentProvider= ruleContentProvider EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1618:2: iv_ruleContentProvider= ruleContentProvider EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentProviderRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider2992);
            iv_ruleContentProvider=ruleContentProvider();
            _fsp--;

             current =iv_ruleContentProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider3002); 

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
    // $ANTLR end entryRuleContentProvider


    // $ANTLR start ruleContentProvider
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1625:1: ruleContentProvider returns [EObject current=null] : ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) ) ;
    public final EObject ruleContentProvider() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_resolver_6_0=null;
        Token lv_many_8_0=null;
        EObject lv_parameter_3_0 = null;

        EObject lv_url_12_0 = null;

        EObject lv_selection_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1630:6: ( ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1631:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1631:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1631:3: 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) )
            {
            match(input,33,FOLLOW_33_in_ruleContentProvider3037); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1635:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1636:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1636:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1637:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider3054); 

            			createLeafNode(grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1659:2: ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1659:4: '(' ( (lv_parameter_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleContentProvider3070); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1663:1: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1664:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1664:1: (lv_parameter_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1665:3: lv_parameter_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleContentProvider3091);
                    lv_parameter_3_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"parameter",
                    	        		lv_parameter_3_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleContentProvider3101); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1691:3: ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==35) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1691:3: ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1691:5: 'returns'
                    {
                    match(input,34,FOLLOW_34_in_ruleContentProvider3114); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1696:6: ( (lv_resolver_6_0= 'resolves' ) )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1696:6: ( (lv_resolver_6_0= 'resolves' ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1697:1: (lv_resolver_6_0= 'resolves' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1697:1: (lv_resolver_6_0= 'resolves' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1698:3: lv_resolver_6_0= 'resolves'
                    {
                    lv_resolver_6_0=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleContentProvider3138); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getResolverResolvesKeyword_3_1_0(), "resolver"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "resolver", true, "resolves", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1717:3: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1718:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1718:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1719:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider3170); 

            		createLeafNode(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0(), "type"); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1731:2: ( (lv_many_8_0= '[]' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1732:1: (lv_many_8_0= '[]' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1732:1: (lv_many_8_0= '[]' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1733:3: lv_many_8_0= '[]'
                    {
                    lv_many_8_0=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleContentProvider3188); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0(), "many"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "many", true, "[]", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,36,FOLLOW_36_in_ruleContentProvider3212); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getFetchesKeyword_6(), null); 
                
            match(input,37,FOLLOW_37_in_ruleContentProvider3222); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getXMLKeyword_7(), null); 
                
            match(input,38,FOLLOW_38_in_ruleContentProvider3232); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getFromKeyword_8(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1764:1: ( (lv_url_12_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1765:1: (lv_url_12_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1765:1: (lv_url_12_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1766:3: lv_url_12_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider3253);
            lv_url_12_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"url",
            	        		lv_url_12_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,39,FOLLOW_39_in_ruleContentProvider3263); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getSelectsKeyword_10(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1792:1: ( (lv_selection_14_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1793:1: (lv_selection_14_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1793:1: (lv_selection_14_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1794:3: lv_selection_14_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider3284);
            lv_selection_14_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"selection",
            	        		lv_selection_14_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContentProvider


    // $ANTLR start entryRuleProviderConstruction
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1824:1: entryRuleProviderConstruction returns [EObject current=null] : iv_ruleProviderConstruction= ruleProviderConstruction EOF ;
    public final EObject entryRuleProviderConstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderConstruction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1825:2: (iv_ruleProviderConstruction= ruleProviderConstruction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1826:2: iv_ruleProviderConstruction= ruleProviderConstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProviderConstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction3320);
            iv_ruleProviderConstruction=ruleProviderConstruction();
            _fsp--;

             current =iv_ruleProviderConstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderConstruction3330); 

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
    // $ANTLR end entryRuleProviderConstruction


    // $ANTLR start ruleProviderConstruction
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1833:1: ruleProviderConstruction returns [EObject current=null] : ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) ) ;
    public final EObject ruleProviderConstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_argument_3_0 = null;

        EObject lv_expression_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1838:6: ( ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1839:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1839:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==13) ) {
                    alt21=1;
                }
                else if ( (LA21_1==EOF||LA21_1==12||LA21_1==14) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1839:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_STRING||LA21_0==13||LA21_0==15||(LA21_0>=17 && LA21_0<=18)||LA21_0==20) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1839:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1839:2: ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1839:2: ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1839:3: () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1839:3: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1840:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getProviderConstructionAccess().getComplexProviderConstructionAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getProviderConstructionAccess().getComplexProviderConstructionAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1850:2: ( ( RULE_ID ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1851:1: ( RULE_ID )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1851:1: ( RULE_ID )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1852:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getProviderConstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProviderConstruction3383); 

                    		createLeafNode(grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0(), "provider"); 
                    	

                    }


                    }

                    match(input,13,FOLLOW_13_in_ruleProviderConstruction3393); 

                            createLeafNode(grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1868:1: ( (lv_argument_3_0= ruleExpression ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||LA20_0==13||LA20_0==15||(LA20_0>=17 && LA20_0<=18)||LA20_0==20) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1869:1: (lv_argument_3_0= ruleExpression )
                            {
                            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1869:1: (lv_argument_3_0= ruleExpression )
                            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1870:3: lv_argument_3_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction3414);
                            lv_argument_3_0=ruleExpression();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getProviderConstructionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"argument",
                            	        		lv_argument_3_0, 
                            	        		"Expression", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }

                    match(input,14,FOLLOW_14_in_ruleProviderConstruction3425); 

                            createLeafNode(grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1897:6: ( () ( (lv_expression_6_0= ruleExpression ) ) )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1897:6: ( () ( (lv_expression_6_0= ruleExpression ) ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1897:7: () ( (lv_expression_6_0= ruleExpression ) )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1897:7: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1898:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getProviderConstructionAccess().getSimpleProviderConstructionAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getProviderConstructionAccess().getSimpleProviderConstructionAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1908:2: ( (lv_expression_6_0= ruleExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1909:1: (lv_expression_6_0= ruleExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1909:1: (lv_expression_6_0= ruleExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1910:3: lv_expression_6_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction3463);
                    lv_expression_6_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProviderConstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_6_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProviderConstruction


    // $ANTLR start entryRuleView
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1940:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1941:2: (iv_ruleView= ruleView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1942:2: iv_ruleView= ruleView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView3500);
            iv_ruleView=ruleView();
            _fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView3510); 

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
    // $ANTLR end entryRuleView


    // $ANTLR start ruleView
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1949:1: ruleView returns [EObject current=null] : (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_SectionedView_0 = null;

        EObject this_CustomView_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1954:6: ( (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1955:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1955:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=40 && LA22_0<=41)) ) {
                alt22=1;
            }
            else if ( (LA22_0==42) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1955:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1956:5: this_SectionedView_0= ruleSectionedView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSectionedView_in_ruleView3557);
                    this_SectionedView_0=ruleSectionedView();
                    _fsp--;

                     
                            current = this_SectionedView_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1966:5: this_CustomView_1= ruleCustomView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomView_in_ruleView3584);
                    this_CustomView_1=ruleCustomView();
                    _fsp--;

                     
                            current = this_CustomView_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleView


    // $ANTLR start entryRuleSectionedView
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1982:1: entryRuleSectionedView returns [EObject current=null] : iv_ruleSectionedView= ruleSectionedView EOF ;
    public final EObject entryRuleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionedView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1983:2: (iv_ruleSectionedView= ruleSectionedView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1984:2: iv_ruleSectionedView= ruleSectionedView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionedViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionedView_in_entryRuleSectionedView3619);
            iv_ruleSectionedView=ruleSectionedView();
            _fsp--;

             current =iv_ruleSectionedView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionedView3629); 

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
    // $ANTLR end entryRuleSectionedView


    // $ANTLR start ruleSectionedView
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1991:1: ruleSectionedView returns [EObject current=null] : (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) ;
    public final EObject ruleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject this_TableView_0 = null;

        EObject this_DetailsView_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1996:6: ( (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1997:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1997:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            else if ( (LA23_0==41) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1997:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1998:5: this_TableView_0= ruleTableView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTableView_in_ruleSectionedView3676);
                    this_TableView_0=ruleTableView();
                    _fsp--;

                     
                            current = this_TableView_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2008:5: this_DetailsView_1= ruleDetailsView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDetailsView_in_ruleSectionedView3703);
                    this_DetailsView_1=ruleDetailsView();
                    _fsp--;

                     
                            current = this_DetailsView_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSectionedView


    // $ANTLR start entryRuleTableView
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2024:1: entryRuleTableView returns [EObject current=null] : iv_ruleTableView= ruleTableView EOF ;
    public final EObject entryRuleTableView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2025:2: (iv_ruleTableView= ruleTableView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2026:2: iv_ruleTableView= ruleTableView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTableViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView3738);
            iv_ruleTableView=ruleTableView();
            _fsp--;

             current =iv_ruleTableView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView3748); 

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
    // $ANTLR end entryRuleTableView


    // $ANTLR start ruleTableView
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2033:1: ruleTableView returns [EObject current=null] : ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' ) ;
    public final EObject ruleTableView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_sections_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2038:6: ( ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2039:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2039:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2039:3: 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}'
            {
            match(input,40,FOLLOW_40_in_ruleTableView3783); 

                    createLeafNode(grammarAccess.getTableViewAccess().getTableviewKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2043:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2044:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2044:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2045:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableView3800); 

            			createLeafNode(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2067:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2067:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleTableView3816); 

                            createLeafNode(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2071:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2072:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2072:1: (lv_content_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2073:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleTableView3837);
                    lv_content_3_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_3_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleTableView3847); 

                            createLeafNode(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleTableView3859); 

                    createLeafNode(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,25,FOLLOW_25_in_ruleTableView3869); 

                    createLeafNode(grammarAccess.getTableViewAccess().getTitleKeyword_4(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2107:1: ( (lv_title_7_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2108:1: (lv_title_7_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2108:1: (lv_title_7_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2109:3: lv_title_7_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTableView3890);
            lv_title_7_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_7_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2131:2: ( (lv_sections_8_0= ruleViewSection ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2132:1: (lv_sections_8_0= ruleViewSection )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2132:1: (lv_sections_8_0= ruleViewSection )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2133:3: lv_sections_8_0= ruleViewSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleTableView3911);
            	    lv_sections_8_0=ruleViewSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sections",
            	    	        		lv_sections_8_0, 
            	    	        		"ViewSection", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleTableView3922); 

                    createLeafNode(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTableView


    // $ANTLR start entryRuleDetailsView
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2167:1: entryRuleDetailsView returns [EObject current=null] : iv_ruleDetailsView= ruleDetailsView EOF ;
    public final EObject entryRuleDetailsView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetailsView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2168:2: (iv_ruleDetailsView= ruleDetailsView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2169:2: iv_ruleDetailsView= ruleDetailsView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDetailsViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleDetailsView_in_entryRuleDetailsView3958);
            iv_ruleDetailsView=ruleDetailsView();
            _fsp--;

             current =iv_ruleDetailsView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailsView3968); 

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
    // $ANTLR end entryRuleDetailsView


    // $ANTLR start ruleDetailsView
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2176:1: ruleDetailsView returns [EObject current=null] : ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' ) ;
    public final EObject ruleDetailsView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_header_8_0 = null;

        EObject lv_sections_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2181:6: ( ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2182:1: ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2182:1: ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2182:3: 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}'
            {
            match(input,41,FOLLOW_41_in_ruleDetailsView4003); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2186:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2187:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2187:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2188:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDetailsView4020); 

            			createLeafNode(grammarAccess.getDetailsViewAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2210:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2210:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleDetailsView4036); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2214:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2215:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2215:1: (lv_content_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2216:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleDetailsView4057);
                    lv_content_3_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_3_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleDetailsView4067); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleDetailsView4079); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,25,FOLLOW_25_in_ruleDetailsView4089); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getTitleKeyword_4(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2250:1: ( (lv_title_7_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2251:1: (lv_title_7_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2251:1: (lv_title_7_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2252:3: lv_title_7_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleDetailsView4110);
            lv_title_7_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_7_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2274:2: ( (lv_header_8_0= ruleViewHeader ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2275:1: (lv_header_8_0= ruleViewHeader )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2275:1: (lv_header_8_0= ruleViewHeader )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2276:3: lv_header_8_0= ruleViewHeader
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewHeader_in_ruleDetailsView4131);
                    lv_header_8_0=ruleViewHeader();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"header",
                    	        		lv_header_8_0, 
                    	        		"ViewHeader", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2298:3: ( (lv_sections_9_0= ruleViewSection ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2299:1: (lv_sections_9_0= ruleViewSection )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2299:1: (lv_sections_9_0= ruleViewSection )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2300:3: lv_sections_9_0= ruleViewSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleDetailsView4153);
            	    lv_sections_9_0=ruleViewSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sections",
            	    	        		lv_sections_9_0, 
            	    	        		"ViewSection", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleDetailsView4164); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getRightCurlyBracketKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDetailsView


    // $ANTLR start entryRuleCustomView
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2334:1: entryRuleCustomView returns [EObject current=null] : iv_ruleCustomView= ruleCustomView EOF ;
    public final EObject entryRuleCustomView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2335:2: (iv_ruleCustomView= ruleCustomView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2336:2: iv_ruleCustomView= ruleCustomView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView4200);
            iv_ruleCustomView=ruleCustomView();
            _fsp--;

             current =iv_ruleCustomView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView4210); 

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
    // $ANTLR end entryRuleCustomView


    // $ANTLR start ruleCustomView
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2343:1: ruleCustomView returns [EObject current=null] : ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_objclass_6_0=null;
        EObject lv_content_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2348:6: ( ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2349:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2349:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2349:3: 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) )
            {
            match(input,42,FOLLOW_42_in_ruleCustomView4245); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2353:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2354:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2354:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2355:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomView4262); 

            			createLeafNode(grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2377:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2377:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleCustomView4278); 

                            createLeafNode(grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2381:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2382:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2382:1: (lv_content_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2383:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleCustomView4299);
                    lv_content_3_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_3_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleCustomView4309); 

                            createLeafNode(grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_ruleCustomView4321); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getImplementedByKeyword_3(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2413:1: ( (lv_objclass_6_0= RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2414:1: (lv_objclass_6_0= RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2414:1: (lv_objclass_6_0= RULE_STRING )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2415:3: lv_objclass_6_0= RULE_STRING
            {
            lv_objclass_6_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomView4338); 

            			createLeafNode(grammarAccess.getCustomViewAccess().getObjclassSTRINGTerminalRuleCall_4_0(), "objclass"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"objclass",
            	        		lv_objclass_6_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCustomView


    // $ANTLR start entryRuleViewHeader
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2445:1: entryRuleViewHeader returns [EObject current=null] : iv_ruleViewHeader= ruleViewHeader EOF ;
    public final EObject entryRuleViewHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewHeader = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2446:2: (iv_ruleViewHeader= ruleViewHeader EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2447:2: iv_ruleViewHeader= ruleViewHeader EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewHeaderRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewHeader_in_entryRuleViewHeader4379);
            iv_ruleViewHeader=ruleViewHeader();
            _fsp--;

             current =iv_ruleViewHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewHeader4389); 

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
    // $ANTLR end entryRuleViewHeader


    // $ANTLR start ruleViewHeader
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2454:1: ruleViewHeader returns [EObject current=null] : ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' ) ;
    public final EObject ruleViewHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_title_4_0 = null;

        EObject lv_subtitle_6_0 = null;

        EObject lv_details_8_0 = null;

        EObject lv_image_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2459:6: ( ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2460:1: ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2460:1: ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2460:2: () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}'
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2460:2: ()
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2461:5: 
            {
             
                    temp=factory.create(grammarAccess.getViewHeaderAccess().getViewHeaderAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getViewHeaderAccess().getViewHeaderAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,44,FOLLOW_44_in_ruleViewHeader4433); 

                    createLeafNode(grammarAccess.getViewHeaderAccess().getHeaderKeyword_1(), null); 
                
            match(input,22,FOLLOW_22_in_ruleViewHeader4443); 

                    createLeafNode(grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2479:1: ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2479:3: 'title=' ( (lv_title_4_0= ruleScalarExpression ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleViewHeader4454); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2483:1: ( (lv_title_4_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2484:1: (lv_title_4_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2484:1: (lv_title_4_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2485:3: lv_title_4_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4475);
                    lv_title_4_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewHeaderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"title",
                    	        		lv_title_4_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2507:4: ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2507:6: 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) )
                    {
                    match(input,45,FOLLOW_45_in_ruleViewHeader4488); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2511:1: ( (lv_subtitle_6_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2512:1: (lv_subtitle_6_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2512:1: (lv_subtitle_6_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2513:3: lv_subtitle_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4509);
                    lv_subtitle_6_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewHeaderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"subtitle",
                    	        		lv_subtitle_6_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2535:4: ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2535:6: 'details=' ( (lv_details_8_0= ruleScalarExpression ) )
                    {
                    match(input,46,FOLLOW_46_in_ruleViewHeader4522); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2539:1: ( (lv_details_8_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2540:1: (lv_details_8_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2540:1: (lv_details_8_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2541:3: lv_details_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4543);
                    lv_details_8_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewHeaderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"details",
                    	        		lv_details_8_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2563:4: ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2563:6: 'image=' ( (lv_image_10_0= ruleScalarExpression ) )
                    {
                    match(input,47,FOLLOW_47_in_ruleViewHeader4556); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getImageKeyword_6_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2567:1: ( (lv_image_10_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2568:1: (lv_image_10_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2568:1: (lv_image_10_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2569:3: lv_image_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4577);
                    lv_image_10_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewHeaderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"image",
                    	        		lv_image_10_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleViewHeader4589); 

                    createLeafNode(grammarAccess.getViewHeaderAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleViewHeader


    // $ANTLR start entryRuleViewSection
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2603:1: entryRuleViewSection returns [EObject current=null] : iv_ruleViewSection= ruleViewSection EOF ;
    public final EObject entryRuleViewSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewSection = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2604:2: (iv_ruleViewSection= ruleViewSection EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2605:2: iv_ruleViewSection= ruleViewSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewSection_in_entryRuleViewSection4625);
            iv_ruleViewSection=ruleViewSection();
            _fsp--;

             current =iv_ruleViewSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewSection4635); 

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
    // $ANTLR end entryRuleViewSection


    // $ANTLR start ruleViewSection
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2612:1: ruleViewSection returns [EObject current=null] : ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' ) ;
    public final EObject ruleViewSection() throws RecognitionException {
        EObject current = null;

        EObject lv_title_3_0 = null;

        EObject lv_cells_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2617:6: ( ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2618:1: ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2618:1: ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2618:3: 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}'
            {
            match(input,48,FOLLOW_48_in_ruleViewSection4670); 

                    createLeafNode(grammarAccess.getViewSectionAccess().getSectionKeyword_0(), null); 
                
            match(input,22,FOLLOW_22_in_ruleViewSection4680); 

                    createLeafNode(grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2626:1: ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2626:3: 'title=' ( (lv_title_3_0= ruleScalarExpression ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleViewSection4691); 

                            createLeafNode(grammarAccess.getViewSectionAccess().getTitleKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2630:1: ( (lv_title_3_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2631:1: (lv_title_3_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2631:1: (lv_title_3_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2632:3: lv_title_3_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewSection4712);
                    lv_title_3_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewSectionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"title",
                    	        		lv_title_3_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2654:4: ( (lv_cells_4_0= ruleSectionCell ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==49) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2655:1: (lv_cells_4_0= ruleSectionCell )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2655:1: (lv_cells_4_0= ruleSectionCell )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2656:3: lv_cells_4_0= ruleSectionCell
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSectionCell_in_ruleViewSection4735);
            	    lv_cells_4_0=ruleSectionCell();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getViewSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"cells",
            	    	        		lv_cells_4_0, 
            	    	        		"SectionCell", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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

            match(input,23,FOLLOW_23_in_ruleViewSection4746); 

                    createLeafNode(grammarAccess.getViewSectionAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleViewSection


    // $ANTLR start entryRuleSectionCell
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2690:1: entryRuleSectionCell returns [EObject current=null] : iv_ruleSectionCell= ruleSectionCell EOF ;
    public final EObject entryRuleSectionCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionCell = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2691:2: (iv_ruleSectionCell= ruleSectionCell EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2692:2: iv_ruleSectionCell= ruleSectionCell EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionCellRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionCell_in_entryRuleSectionCell4782);
            iv_ruleSectionCell=ruleSectionCell();
            _fsp--;

             current =iv_ruleSectionCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionCell4792); 

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
    // $ANTLR end entryRuleSectionCell


    // $ANTLR start ruleSectionCell
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2699:1: ruleSectionCell returns [EObject current=null] : ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' ) ;
    public final EObject ruleSectionCell() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        EObject lv_iterator_3_0 = null;

        EObject lv_text_6_0 = null;

        EObject lv_details_8_0 = null;

        EObject lv_image_10_0 = null;

        EObject lv_action_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2704:6: ( ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2705:1: ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2705:1: ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2705:3: 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}'
            {
            match(input,49,FOLLOW_49_in_ruleSectionCell4827); 

                    createLeafNode(grammarAccess.getSectionCellAccess().getCellKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2709:1: ( (lv_type_1_0= ruleCellType ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2710:1: (lv_type_1_0= ruleCellType )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2710:1: (lv_type_1_0= ruleCellType )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2711:3: lv_type_1_0= ruleCellType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCellType_in_ruleSectionCell4848);
            lv_type_1_0=ruleCellType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"CellType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2733:2: ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2733:4: 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    {
                    match(input,50,FOLLOW_50_in_ruleSectionCell4859); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getForeachKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2737:1: ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2738:1: (lv_iterator_3_0= ruleCollectionIterator )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2738:1: (lv_iterator_3_0= ruleCollectionIterator )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2739:3: lv_iterator_3_0= ruleCollectionIterator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleSectionCell4880);
                    lv_iterator_3_0=ruleCollectionIterator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"iterator",
                    	        		lv_iterator_3_0, 
                    	        		"CollectionIterator", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleSectionCell4892); 

                    createLeafNode(grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2765:1: ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2765:3: 'text=' ( (lv_text_6_0= ruleScalarExpression ) )
                    {
                    match(input,51,FOLLOW_51_in_ruleSectionCell4903); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getTextKeyword_4_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2769:1: ( (lv_text_6_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2770:1: (lv_text_6_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2770:1: (lv_text_6_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2771:3: lv_text_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell4924);
                    lv_text_6_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"text",
                    	        		lv_text_6_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2793:4: ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2793:6: 'details=' ( (lv_details_8_0= ruleScalarExpression ) )
                    {
                    match(input,46,FOLLOW_46_in_ruleSectionCell4937); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2797:1: ( (lv_details_8_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2798:1: (lv_details_8_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2798:1: (lv_details_8_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2799:3: lv_details_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell4958);
                    lv_details_8_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"details",
                    	        		lv_details_8_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2821:4: ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2821:6: 'image=' ( (lv_image_10_0= ruleScalarExpression ) )
                    {
                    match(input,47,FOLLOW_47_in_ruleSectionCell4971); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getImageKeyword_6_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2825:1: ( (lv_image_10_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2826:1: (lv_image_10_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2826:1: (lv_image_10_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2827:3: lv_image_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell4992);
                    lv_image_10_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"image",
                    	        		lv_image_10_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2849:4: ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==52) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2849:6: 'action=' ( (lv_action_12_0= ruleViewAction ) )
                    {
                    match(input,52,FOLLOW_52_in_ruleSectionCell5005); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getActionKeyword_7_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2853:1: ( (lv_action_12_0= ruleViewAction ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2854:1: (lv_action_12_0= ruleViewAction )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2854:1: (lv_action_12_0= ruleViewAction )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2855:3: lv_action_12_0= ruleViewAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_7_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewAction_in_ruleSectionCell5026);
                    lv_action_12_0=ruleViewAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"action",
                    	        		lv_action_12_0, 
                    	        		"ViewAction", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleSectionCell5038); 

                    createLeafNode(grammarAccess.getSectionCellAccess().getRightCurlyBracketKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSectionCell


    // $ANTLR start entryRuleCollectionIterator
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2889:1: entryRuleCollectionIterator returns [EObject current=null] : iv_ruleCollectionIterator= ruleCollectionIterator EOF ;
    public final EObject entryRuleCollectionIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionIterator = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2890:2: (iv_ruleCollectionIterator= ruleCollectionIterator EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2891:2: iv_ruleCollectionIterator= ruleCollectionIterator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionIteratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator5074);
            iv_ruleCollectionIterator=ruleCollectionIterator();
            _fsp--;

             current =iv_ruleCollectionIterator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator5084); 

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
    // $ANTLR end entryRuleCollectionIterator


    // $ANTLR start ruleCollectionIterator
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2898:1: ruleCollectionIterator returns [EObject current=null] : ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCollectionIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_collection_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2903:6: ( ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2904:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2904:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2904:2: ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2904:2: ( (lv_collection_0_0= ruleCollectionExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2905:1: (lv_collection_0_0= ruleCollectionExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2905:1: (lv_collection_0_0= ruleCollectionExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2906:3: lv_collection_0_0= ruleCollectionExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator5130);
            lv_collection_0_0=ruleCollectionExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionIteratorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"collection",
            	        		lv_collection_0_0, 
            	        		"CollectionExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,53,FOLLOW_53_in_ruleCollectionIterator5140); 

                    createLeafNode(grammarAccess.getCollectionIteratorAccess().getAsKeyword_1(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2932:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2933:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2933:1: (lv_name_2_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2934:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionIterator5157); 

            			createLeafNode(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionIteratorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionIterator


    // $ANTLR start entryRuleViewAction
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2964:1: entryRuleViewAction returns [EObject current=null] : iv_ruleViewAction= ruleViewAction EOF ;
    public final EObject entryRuleViewAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewAction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2965:2: (iv_ruleViewAction= ruleViewAction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2966:2: iv_ruleViewAction= ruleViewAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction5198);
            iv_ruleViewAction=ruleViewAction();
            _fsp--;

             current =iv_ruleViewAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction5208); 

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
    // $ANTLR end entryRuleViewAction


    // $ANTLR start ruleViewAction
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2973:1: ruleViewAction returns [EObject current=null] : (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen ) ;
    public final EObject ruleViewAction() throws RecognitionException {
        EObject current = null;

        EObject this_ViewCall_0 = null;

        EObject this_ExternalOpen_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2978:6: ( (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2979:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2979:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==13) ) {
                    alt41=1;
                }
                else if ( (LA41_1==EOF||LA41_1==12||LA41_1==23) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2979:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0==RULE_STRING||LA41_0==13||LA41_0==15||LA41_0==17) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2979:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2980:5: this_ViewCall_0= ruleViewCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleViewCall_in_ruleViewAction5255);
                    this_ViewCall_0=ruleViewCall();
                    _fsp--;

                     
                            current = this_ViewCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2990:5: this_ExternalOpen_1= ruleExternalOpen
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalOpen_in_ruleViewAction5282);
                    this_ExternalOpen_1=ruleExternalOpen();
                    _fsp--;

                     
                            current = this_ExternalOpen_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleViewAction


    // $ANTLR start entryRuleExternalOpen
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3006:1: entryRuleExternalOpen returns [EObject current=null] : iv_ruleExternalOpen= ruleExternalOpen EOF ;
    public final EObject entryRuleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalOpen = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3007:2: (iv_ruleExternalOpen= ruleExternalOpen EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3008:2: iv_ruleExternalOpen= ruleExternalOpen EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalOpenRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen5317);
            iv_ruleExternalOpen=ruleExternalOpen();
            _fsp--;

             current =iv_ruleExternalOpen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen5327); 

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
    // $ANTLR end entryRuleExternalOpen


    // $ANTLR start ruleExternalOpen
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3015:1: ruleExternalOpen returns [EObject current=null] : ( (lv_url_0_0= ruleScalarExpression ) ) ;
    public final EObject ruleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject lv_url_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3020:6: ( ( (lv_url_0_0= ruleScalarExpression ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3021:1: ( (lv_url_0_0= ruleScalarExpression ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3021:1: ( (lv_url_0_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3022:1: (lv_url_0_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3022:1: (lv_url_0_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3023:3: lv_url_0_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleExternalOpen5372);
            lv_url_0_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalOpenRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"url",
            	        		lv_url_0_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExternalOpen


    // $ANTLR start entryRuleViewCall
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3053:1: entryRuleViewCall returns [EObject current=null] : iv_ruleViewCall= ruleViewCall EOF ;
    public final EObject entryRuleViewCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewCall = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3054:2: (iv_ruleViewCall= ruleViewCall EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3055:2: iv_ruleViewCall= ruleViewCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall5407);
            iv_ruleViewCall=ruleViewCall();
            _fsp--;

             current =iv_ruleViewCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall5417); 

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
    // $ANTLR end entryRuleViewCall


    // $ANTLR start ruleViewCall
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3062:1: ruleViewCall returns [EObject current=null] : ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' ) ;
    public final EObject ruleViewCall() throws RecognitionException {
        EObject current = null;

        EObject lv_provider_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3067:6: ( ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3068:1: ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3068:1: ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3068:2: ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')'
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3068:2: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3069:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3069:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3070:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getViewCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewCall5460); 

            		createLeafNode(grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0(), "view"); 
            	

            }


            }

            match(input,13,FOLLOW_13_in_ruleViewCall5470); 

                    createLeafNode(grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3086:1: ( (lv_provider_2_0= ruleProviderConstruction ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||LA42_0==13||LA42_0==15||(LA42_0>=17 && LA42_0<=18)||LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3087:1: (lv_provider_2_0= ruleProviderConstruction )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3087:1: (lv_provider_2_0= ruleProviderConstruction )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3088:3: lv_provider_2_0= ruleProviderConstruction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProviderConstruction_in_ruleViewCall5491);
                    lv_provider_2_0=ruleProviderConstruction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"provider",
                    	        		lv_provider_2_0, 
                    	        		"ProviderConstruction", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleViewCall5502); 

                    createLeafNode(grammarAccess.getViewCallAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleViewCall


    // $ANTLR start ruleCellType
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3122:1: ruleCellType returns [Enumerator current=null] : ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) ) ;
    public final Enumerator ruleCellType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3126:6: ( ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3127:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3127:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt43=1;
                }
                break;
            case 55:
                {
                alt43=2;
                }
                break;
            case 56:
                {
                alt43=3;
                }
                break;
            case 57:
                {
                alt43=4;
                }
                break;
            case 58:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3127:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) )", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3127:2: ( 'Default' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3127:2: ( 'Default' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3127:4: 'Default'
                    {
                    match(input,54,FOLLOW_54_in_ruleCellType5550); 

                            current = grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3133:6: ( 'DefaultWithDisclosure' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3133:6: ( 'DefaultWithDisclosure' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3133:8: 'DefaultWithDisclosure'
                    {
                    match(input,55,FOLLOW_55_in_ruleCellType5565); 

                            current = grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3139:6: ( 'Value2' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3139:6: ( 'Value2' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3139:8: 'Value2'
                    {
                    match(input,56,FOLLOW_56_in_ruleCellType5580); 

                            current = grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3145:6: ( 'Double' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3145:6: ( 'Double' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3145:8: 'Double'
                    {
                    match(input,57,FOLLOW_57_in_ruleCellType5595); 

                            current = grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3151:6: ( 'Subtitle' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3151:6: ( 'Subtitle' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3151:8: 'Subtitle'
                    {
                    match(input,58,FOLLOW_58_in_ruleCellType5610); 

                            current = grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCellType


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleModel131 = new BitSet(new long[]{0x0000070250000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_ruleModel152 = new BitSet(new long[]{0x0000070250000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_ruleApplication245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModelElement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_ruleModelElement363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_ruleModelElement390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDescription437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDescription480 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleTypeDescription498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleParameter604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_entryRuleObjectReference662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectReference672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectReference715 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleObjectReference736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedObjectReference783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleNestedObjectReference818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNestedObjectReference836 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleNestedObjectReference857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleExpression951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleExpression978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleExpression1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleExpression1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleExpression1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression1094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarExpression1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleScalarExpression1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleScalarExpression1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleScalarExpression1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleCollectionExpression1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStringFunction1532 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1553 = new BitSet(new long[]{0x000000000002E030L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStringFunction1591 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1612 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringFunction1622 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1643 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringFunction1653 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1674 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStringFunction1711 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1732 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCollectionLiteral1824 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1845 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionLiteral1856 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1877 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleCollectionLiteral1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction1925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunction1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCollectionFunction1979 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2000 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionFunction2010 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2031 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCollectionFunction2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication2077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabBarApplication2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTabBarApplication2122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTabBarApplication2139 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTabBarApplication2154 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_ruleTabBarApplication2175 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleTabBarApplication2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabbarButton2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTabbarButton2267 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTabbarButton2277 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTabbarButton2287 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTabbarButton2308 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTabbarButton2318 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTabbarButton2339 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTabbarButton2349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleTabbarButton2370 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTabbarButton2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType2535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSimpleType2580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType2597 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSimpleType2612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleType2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEntity2715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2732 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleEntity2748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2766 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEntity2778 = new BitSet(new long[]{0x0000000100800010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity2799 = new BitSet(new long[]{0x0000000100800010L});
    public static final BitSet FOLLOW_23_in_ruleEntity2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleProperty2899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleProperty2934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider2992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleContentProvider3037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider3054 = new BitSet(new long[]{0x0000000C00002000L});
    public static final BitSet FOLLOW_13_in_ruleContentProvider3070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleContentProvider3091 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContentProvider3101 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleContentProvider3114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_35_in_ruleContentProvider3138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider3170 = new BitSet(new long[]{0x0000001000000800L});
    public static final BitSet FOLLOW_11_in_ruleContentProvider3188 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleContentProvider3212 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleContentProvider3222 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleContentProvider3232 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider3253 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleContentProvider3263 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction3320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderConstruction3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProviderConstruction3383 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProviderConstruction3393 = new BitSet(new long[]{0x000000000016E030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction3414 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProviderConstruction3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView3500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_ruleView3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_ruleView3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_entryRuleSectionedView3619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionedView3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_ruleSectionedView3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_ruleSectionedView3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView3738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTableView3783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableView3800 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleTableView3816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTableView3837 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTableView3847 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTableView3859 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTableView3869 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTableView3890 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleTableView3911 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTableView3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_entryRuleDetailsView3958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailsView3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDetailsView4003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDetailsView4020 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleDetailsView4036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDetailsView4057 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDetailsView4067 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDetailsView4079 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDetailsView4089 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleDetailsView4110 = new BitSet(new long[]{0x0001100000800000L});
    public static final BitSet FOLLOW_ruleViewHeader_in_ruleDetailsView4131 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleDetailsView4153 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDetailsView4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView4200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCustomView4245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomView4262 = new BitSet(new long[]{0x0000080000002000L});
    public static final BitSet FOLLOW_13_in_ruleCustomView4278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCustomView4299 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomView4309 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleCustomView4321 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomView4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_entryRuleViewHeader4379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewHeader4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleViewHeader4433 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleViewHeader4443 = new BitSet(new long[]{0x0000E00002800000L});
    public static final BitSet FOLLOW_25_in_ruleViewHeader4454 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4475 = new BitSet(new long[]{0x0000E00000800000L});
    public static final BitSet FOLLOW_45_in_ruleViewHeader4488 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4509 = new BitSet(new long[]{0x0000C00000800000L});
    public static final BitSet FOLLOW_46_in_ruleViewHeader4522 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4543 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_47_in_ruleViewHeader4556 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4577 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleViewHeader4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_entryRuleViewSection4625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewSection4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleViewSection4670 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleViewSection4680 = new BitSet(new long[]{0x0002000002000000L});
    public static final BitSet FOLLOW_25_in_ruleViewSection4691 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewSection4712 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleSectionCell_in_ruleViewSection4735 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_23_in_ruleViewSection4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_entryRuleSectionCell4782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionCell4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSectionCell4827 = new BitSet(new long[]{0x07C0000000000000L});
    public static final BitSet FOLLOW_ruleCellType_in_ruleSectionCell4848 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_50_in_ruleSectionCell4859 = new BitSet(new long[]{0x0000000000140010L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleSectionCell4880 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSectionCell4892 = new BitSet(new long[]{0x0018C00000800000L});
    public static final BitSet FOLLOW_51_in_ruleSectionCell4903 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell4924 = new BitSet(new long[]{0x0010C00000800000L});
    public static final BitSet FOLLOW_46_in_ruleSectionCell4937 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell4958 = new BitSet(new long[]{0x0010800000800000L});
    public static final BitSet FOLLOW_47_in_ruleSectionCell4971 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell4992 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_52_in_ruleSectionCell5005 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleViewAction_in_ruleSectionCell5026 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSectionCell5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator5074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator5130 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleCollectionIterator5140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionIterator5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction5198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleViewAction5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_ruleViewAction5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen5317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleExternalOpen5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall5407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewCall5460 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewCall5470 = new BitSet(new long[]{0x000000000016E030L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_ruleViewCall5491 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleViewCall5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCellType5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleCellType5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCellType5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCellType5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCellType5610 = new BitSet(new long[]{0x0000000000000002L});

}