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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[]'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'['", "']'", "'split('", "'tabbarApplication'", "'{'", "'}'", "'button'", "'title='", "'icon='", "'view='", "'const'", "'type'", "'mapsTo'", "'entity'", "'extends'", "'derived'", "'contentprovider'", "'returns'", "'resolves'", "'fetches'", "'XML'", "'from'", "'selects'", "'tableview'", "'detailsview'", "'customview'", "'implementedBy'", "'header'", "'subtitle='", "'details='", "'image='", "'section'", "'cell'", "'foreach'", "'text='", "'action='", "'as'", "'Default'", "'DefaultWithDisclosure'", "'Value2'", "'Double'", "'Subtitle'"
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

                if ( ((LA1_0>=28 && LA1_0<=29)||LA1_0==31||LA1_0==34||(LA1_0>=41 && LA1_0<=43)) ) {
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:190:1: ruleModelElement returns [EObject current=null] : (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ContentProvider_1 = null;

        EObject this_View_2 = null;

        EObject this_Constant_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:195:6: ( (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:196:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:196:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant )
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
                    new NoViableAltException("196:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant )", 2, 0, input);

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
                case 4 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:227:5: this_Constant_3= ruleConstant
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getConstantParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleModelElement417);
                    this_Constant_3=ruleConstant();
                    _fsp--;

                     
                            current = this_Constant_3; 
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:245:1: entryRuleTypeDescription returns [EObject current=null] : iv_ruleTypeDescription= ruleTypeDescription EOF ;
    public final EObject entryRuleTypeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDescription = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:246:2: (iv_ruleTypeDescription= ruleTypeDescription EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:247:2: iv_ruleTypeDescription= ruleTypeDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription454);
            iv_ruleTypeDescription=ruleTypeDescription();
            _fsp--;

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
    // $ANTLR end entryRuleTypeDescription


    // $ANTLR start ruleTypeDescription
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:254:1: ruleTypeDescription returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeDescription() throws RecognitionException {
        EObject current = null;

        Token lv_many_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:259:6: ( ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:260:1: ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:260:1: ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:260:2: ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )?
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:260:2: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:261:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:261:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:262:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDescription507); 

            		createLeafNode(grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:274:2: ( (lv_many_1_0= '[]' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:275:1: (lv_many_1_0= '[]' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:275:1: (lv_many_1_0= '[]' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:276:3: lv_many_1_0= '[]'
                    {
                    lv_many_1_0=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleTypeDescription525); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:303:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:304:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:305:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter575);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter585); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:312:1: ruleParameter returns [EObject current=null] : ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:317:6: ( ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:318:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:318:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:318:2: ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:318:2: ( (lv_description_0_0= ruleTypeDescription ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:319:1: (lv_description_0_0= ruleTypeDescription )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:319:1: (lv_description_0_0= ruleTypeDescription )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:320:3: lv_description_0_0= ruleTypeDescription
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleParameter631);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:342:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:343:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:343:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:344:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter648); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:374:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:375:2: (iv_ruleObjectReference= ruleObjectReference EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:376:2: iv_ruleObjectReference= ruleObjectReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleObjectReference_in_entryRuleObjectReference689);
            iv_ruleObjectReference=ruleObjectReference();
            _fsp--;

             current =iv_ruleObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectReference699); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:383:1: ruleObjectReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:388:6: ( ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:389:1: ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:389:1: ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:389:2: ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:389:2: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:390:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:390:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:391:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getObjectReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectReference742); 

            		createLeafNode(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0(), "object"); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:403:2: ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:404:1: (lv_tail_1_0= ruleNestedObjectReference )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:404:1: (lv_tail_1_0= ruleNestedObjectReference )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:405:3: lv_tail_1_0= ruleNestedObjectReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleObjectReference763);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:435:1: entryRuleNestedObjectReference returns [EObject current=null] : iv_ruleNestedObjectReference= ruleNestedObjectReference EOF ;
    public final EObject entryRuleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedObjectReference = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:436:2: (iv_ruleNestedObjectReference= ruleNestedObjectReference EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:437:2: iv_ruleNestedObjectReference= ruleNestedObjectReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNestedObjectReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference800);
            iv_ruleNestedObjectReference=ruleNestedObjectReference();
            _fsp--;

             current =iv_ruleNestedObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedObjectReference810); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:444:1: ruleNestedObjectReference returns [EObject current=null] : ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:449:6: ( ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:450:1: ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:450:1: ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:450:3: '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            {
            match(input,12,FOLLOW_12_in_ruleNestedObjectReference845); 

                    createLeafNode(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:454:1: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:455:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:455:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:456:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getNestedObjectReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNestedObjectReference863); 

            		createLeafNode(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0(), "object"); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:468:2: ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:469:1: (lv_tail_2_0= ruleNestedObjectReference )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:469:1: (lv_tail_2_0= ruleNestedObjectReference )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:470:3: lv_tail_2_0= ruleNestedObjectReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleNestedObjectReference884);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:500:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:501:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:502:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression921);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression931); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:509:1: ruleExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_CollectionLiteral_2 = null;

        EObject this_CollectionFunction_3 = null;

        EObject this_ObjectReference_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:514:6: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:515:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:515:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
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
                    new NoViableAltException("515:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:516:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleExpression978);
                    this_StringLiteral_0=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:526:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleExpression1005);
                    this_StringFunction_1=ruleStringFunction();
                    _fsp--;

                     
                            current = this_StringFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:536:5: this_CollectionLiteral_2= ruleCollectionLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleExpression1032);
                    this_CollectionLiteral_2=ruleCollectionLiteral();
                    _fsp--;

                     
                            current = this_CollectionLiteral_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:546:5: this_CollectionFunction_3= ruleCollectionFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleExpression1059);
                    this_CollectionFunction_3=ruleCollectionFunction();
                    _fsp--;

                     
                            current = this_CollectionFunction_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:556:5: this_ObjectReference_4= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleExpression1086);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:572:1: entryRuleScalarExpression returns [EObject current=null] : iv_ruleScalarExpression= ruleScalarExpression EOF ;
    public final EObject entryRuleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarExpression = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:573:2: (iv_ruleScalarExpression= ruleScalarExpression EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:574:2: iv_ruleScalarExpression= ruleScalarExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScalarExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression1121);
            iv_ruleScalarExpression=ruleScalarExpression();
            _fsp--;

             current =iv_ruleScalarExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarExpression1131); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:581:1: ruleScalarExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:586:6: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:587:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:587:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
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
                    new NoViableAltException("587:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:588:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleScalarExpression1178);
                    this_StringLiteral_0=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:598:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleScalarExpression1205);
                    this_StringFunction_1=ruleStringFunction();
                    _fsp--;

                     
                            current = this_StringFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:608:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleScalarExpression1232);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:624:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:625:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:626:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression1267);
            iv_ruleCollectionExpression=ruleCollectionExpression();
            _fsp--;

             current =iv_ruleCollectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression1277); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:633:1: ruleCollectionExpression returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteral_0 = null;

        EObject this_CollectionFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:638:6: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:639:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:639:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
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
                    new NoViableAltException("639:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:640:5: this_CollectionLiteral_0= ruleCollectionLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression1324);
                    this_CollectionLiteral_0=ruleCollectionLiteral();
                    _fsp--;

                     
                            current = this_CollectionLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:650:5: this_CollectionFunction_1= ruleCollectionFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression1351);
                    this_CollectionFunction_1=ruleCollectionFunction();
                    _fsp--;

                     
                            current = this_CollectionFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:660:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleCollectionExpression1378);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:676:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:677:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:678:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1413);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1423); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:685:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:690:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:691:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:691:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:692:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:692:1: (lv_value_0_0= RULE_STRING )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:693:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1464); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:723:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:724:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:725:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction1504);
            iv_ruleStringFunction=ruleStringFunction();
            _fsp--;

             current =iv_ruleStringFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction1514); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:732:1: ruleStringFunction returns [EObject current=null] : ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_values_2_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_match_8_0 = null;

        EObject lv_replacement_10_0 = null;

        EObject lv_value_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:737:6: ( ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:738:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:738:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
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
                    new NoViableAltException("738:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:738:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:738:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:738:3: () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:738:3: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:739:5: 
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

                    match(input,13,FOLLOW_13_in_ruleStringFunction1559); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:753:1: ( (lv_values_2_0= ruleScalarExpression ) )+
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
                    	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:754:1: (lv_values_2_0= ruleScalarExpression )
                    	    {
                    	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:754:1: (lv_values_2_0= ruleScalarExpression )
                    	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:755:3: lv_values_2_0= ruleScalarExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1580);
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

                    match(input,14,FOLLOW_14_in_ruleStringFunction1591); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:782:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:782:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:782:7: () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:782:7: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:783:5: 
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

                    match(input,15,FOLLOW_15_in_ruleStringFunction1618); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:797:1: ( (lv_value_6_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:798:1: (lv_value_6_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:798:1: (lv_value_6_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:799:3: lv_value_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1639);
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

                    match(input,16,FOLLOW_16_in_ruleStringFunction1649); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:825:1: ( (lv_match_8_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:826:1: (lv_match_8_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:826:1: (lv_match_8_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:827:3: lv_match_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1670);
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

                    match(input,16,FOLLOW_16_in_ruleStringFunction1680); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:853:1: ( (lv_replacement_10_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:854:1: (lv_replacement_10_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:854:1: (lv_replacement_10_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:855:3: lv_replacement_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1701);
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

                    match(input,14,FOLLOW_14_in_ruleStringFunction1711); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:882:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:882:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:882:7: () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:882:7: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:883:5: 
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

                    match(input,17,FOLLOW_17_in_ruleStringFunction1738); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:897:1: ( (lv_value_14_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:898:1: (lv_value_14_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:898:1: (lv_value_14_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:899:3: lv_value_14_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1759);
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

                    match(input,14,FOLLOW_14_in_ruleStringFunction1769); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:933:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteral = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:934:2: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:935:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral1806);
            iv_ruleCollectionLiteral=ruleCollectionLiteral();
            _fsp--;

             current =iv_ruleCollectionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral1816); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:942:1: ruleCollectionLiteral returns [EObject current=null] : ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:947:6: ( ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:948:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:948:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:948:3: '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']'
            {
            match(input,18,FOLLOW_18_in_ruleCollectionLiteral1851); 

                    createLeafNode(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:952:1: ( (lv_items_1_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:953:1: (lv_items_1_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:953:1: (lv_items_1_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:954:3: lv_items_1_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1872);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:976:2: ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:976:4: ',' ( (lv_items_3_0= ruleScalarExpression ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleCollectionLiteral1883); 

            	            createLeafNode(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:980:1: ( (lv_items_3_0= ruleScalarExpression ) )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:981:1: (lv_items_3_0= ruleScalarExpression )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:981:1: (lv_items_3_0= ruleScalarExpression )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:982:3: lv_items_3_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1904);
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

            match(input,19,FOLLOW_19_in_ruleCollectionLiteral1916); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1016:1: entryRuleCollectionFunction returns [EObject current=null] : iv_ruleCollectionFunction= ruleCollectionFunction EOF ;
    public final EObject entryRuleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFunction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1017:2: (iv_ruleCollectionFunction= ruleCollectionFunction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1018:2: iv_ruleCollectionFunction= ruleCollectionFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction1952);
            iv_ruleCollectionFunction=ruleCollectionFunction();
            _fsp--;

             current =iv_ruleCollectionFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunction1962); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1025:1: ruleCollectionFunction returns [EObject current=null] : ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) ;
    public final EObject ruleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;

        EObject lv_delimiter_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1030:6: ( ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1031:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1031:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1031:2: () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')'
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1031:2: ()
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1032:5: 
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

            match(input,20,FOLLOW_20_in_ruleCollectionFunction2006); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1046:1: ( (lv_value_2_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1047:1: (lv_value_2_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1047:1: (lv_value_2_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1048:3: lv_value_2_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2027);
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

            match(input,16,FOLLOW_16_in_ruleCollectionFunction2037); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1074:1: ( (lv_delimiter_4_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1075:1: (lv_delimiter_4_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1075:1: (lv_delimiter_4_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1076:3: lv_delimiter_4_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2058);
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

            match(input,14,FOLLOW_14_in_ruleCollectionFunction2068); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1110:1: entryRuleTabBarApplication returns [EObject current=null] : iv_ruleTabBarApplication= ruleTabBarApplication EOF ;
    public final EObject entryRuleTabBarApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabBarApplication = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1111:2: (iv_ruleTabBarApplication= ruleTabBarApplication EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1112:2: iv_ruleTabBarApplication= ruleTabBarApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabBarApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication2104);
            iv_ruleTabBarApplication=ruleTabBarApplication();
            _fsp--;

             current =iv_ruleTabBarApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabBarApplication2114); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1119:1: ruleTabBarApplication returns [EObject current=null] : ( 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* '}' ) ;
    public final EObject ruleTabBarApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_buttons_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1124:6: ( ( 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1125:1: ( 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1125:1: ( 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1125:3: 'tabbarApplication' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_buttons_3_0= ruleTabbarButton ) )* '}'
            {
            match(input,21,FOLLOW_21_in_ruleTabBarApplication2149); 

                    createLeafNode(grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1129:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1130:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1130:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1131:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTabBarApplication2166); 

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

            match(input,22,FOLLOW_22_in_ruleTabBarApplication2181); 

                    createLeafNode(grammarAccess.getTabBarApplicationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1157:1: ( (lv_buttons_3_0= ruleTabbarButton ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1158:1: (lv_buttons_3_0= ruleTabbarButton )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1158:1: (lv_buttons_3_0= ruleTabbarButton )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1159:3: lv_buttons_3_0= ruleTabbarButton
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabBarApplicationAccess().getButtonsTabbarButtonParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTabbarButton_in_ruleTabBarApplication2202);
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

            match(input,23,FOLLOW_23_in_ruleTabBarApplication2213); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1193:1: entryRuleTabbarButton returns [EObject current=null] : iv_ruleTabbarButton= ruleTabbarButton EOF ;
    public final EObject entryRuleTabbarButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabbarButton = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1194:2: (iv_ruleTabbarButton= ruleTabbarButton EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1195:2: iv_ruleTabbarButton= ruleTabbarButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabbarButtonRule(), currentNode); 
            pushFollow(FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton2249);
            iv_ruleTabbarButton=ruleTabbarButton();
            _fsp--;

             current =iv_ruleTabbarButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabbarButton2259); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1202:1: ruleTabbarButton returns [EObject current=null] : ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' ) ;
    public final EObject ruleTabbarButton() throws RecognitionException {
        EObject current = null;

        EObject lv_title_3_0 = null;

        EObject lv_icon_5_0 = null;

        EObject lv_view_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1207:6: ( ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1208:1: ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1208:1: ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1208:3: 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}'
            {
            match(input,24,FOLLOW_24_in_ruleTabbarButton2294); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getButtonKeyword_0(), null); 
                
            match(input,22,FOLLOW_22_in_ruleTabbarButton2304); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_ruleTabbarButton2314); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getTitleKeyword_2(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1220:1: ( (lv_title_3_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1221:1: (lv_title_3_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1221:1: (lv_title_3_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1222:3: lv_title_3_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTabbarButton2335);
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

            match(input,26,FOLLOW_26_in_ruleTabbarButton2345); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getIconKeyword_4(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1248:1: ( (lv_icon_5_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1249:1: (lv_icon_5_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1249:1: (lv_icon_5_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1250:3: lv_icon_5_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTabbarButton2366);
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

            match(input,27,FOLLOW_27_in_ruleTabbarButton2376); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getViewKeyword_6(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1276:1: ( (lv_view_7_0= ruleViewCall ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1277:1: (lv_view_7_0= ruleViewCall )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1277:1: (lv_view_7_0= ruleViewCall )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1278:3: lv_view_7_0= ruleViewCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleViewCall_in_ruleTabbarButton2397);
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

            match(input,23,FOLLOW_23_in_ruleTabbarButton2407); 

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


    // $ANTLR start entryRuleConstant
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1312:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1313:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1314:2: iv_ruleConstant= ruleConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2443);
            iv_ruleConstant=ruleConstant();
            _fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2453); 

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
    // $ANTLR end entryRuleConstant


    // $ANTLR start ruleConstant
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1321:1: ruleConstant returns [EObject current=null] : ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1326:6: ( ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1327:1: ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1327:1: ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1327:2: () 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1327:2: ()
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1328:5: 
            {
             
                    temp=factory.create(grammarAccess.getConstantAccess().getConstantAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getConstantAccess().getConstantAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,28,FOLLOW_28_in_ruleConstant2497); 

                    createLeafNode(grammarAccess.getConstantAccess().getConstKeyword_1(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1342:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1343:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1343:1: (lv_name_2_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1344:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant2514); 

            			createLeafNode(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1366:2: ( (lv_value_3_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1367:1: (lv_value_3_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1367:1: (lv_value_3_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1368:3: lv_value_3_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantAccess().getValueScalarExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleConstant2540);
            lv_value_3_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
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
    // $ANTLR end ruleConstant


    // $ANTLR start entryRuleType
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1398:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1399:2: (iv_ruleType= ruleType EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1400:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2576);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2586); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1407:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1412:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1413:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1413:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
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
                    new NoViableAltException("1413:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1414:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType2633);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1424:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType2660);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1440:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1441:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1442:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType2695);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType2705); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1449:1: ruleSimpleType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_platformType_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1454:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1455:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1455:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1455:3: 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) )
            {
            match(input,29,FOLLOW_29_in_ruleSimpleType2740); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1459:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1460:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1460:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1461:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType2757); 

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

            match(input,30,FOLLOW_30_in_ruleSimpleType2772); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1487:1: ( (lv_platformType_3_0= RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1488:1: (lv_platformType_3_0= RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1488:1: (lv_platformType_3_0= RULE_STRING )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1489:3: lv_platformType_3_0= RULE_STRING
            {
            lv_platformType_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleType2789); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1519:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1520:2: (iv_ruleEntity= ruleEntity EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1521:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2830);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2840); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1528:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_properties_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1533:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1534:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1534:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1534:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}'
            {
            match(input,31,FOLLOW_31_in_ruleEntity2875); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1538:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1539:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1539:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1540:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2892); 

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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1562:2: ( 'extends' ( ( RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1562:4: 'extends' ( ( RULE_ID ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleEntity2908); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1566:1: ( ( RULE_ID ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1567:1: ( RULE_ID )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1567:1: ( RULE_ID )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1568:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2926); 

                    		createLeafNode(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0(), "extends"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleEntity2938); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1584:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1585:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1585:1: (lv_properties_5_0= ruleProperty )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1586:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity2959);
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

            match(input,23,FOLLOW_23_in_ruleEntity2970); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1620:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1621:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1622:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3006);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3016); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1629:1: ruleProperty returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_description_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1634:6: ( ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1635:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1635:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1635:2: ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1635:2: ( (lv_derived_0_0= 'derived' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1636:1: (lv_derived_0_0= 'derived' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1636:1: (lv_derived_0_0= 'derived' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1637:3: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleProperty3059); 

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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1656:3: ( (lv_description_1_0= ruleTypeDescription ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1657:1: (lv_description_1_0= ruleTypeDescription )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1657:1: (lv_description_1_0= ruleTypeDescription )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1658:3: lv_description_1_0= ruleTypeDescription
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleProperty3094);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1680:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1681:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1681:1: (lv_name_2_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1682:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3111); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1712:1: entryRuleContentProvider returns [EObject current=null] : iv_ruleContentProvider= ruleContentProvider EOF ;
    public final EObject entryRuleContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProvider = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1713:2: (iv_ruleContentProvider= ruleContentProvider EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1714:2: iv_ruleContentProvider= ruleContentProvider EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentProviderRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider3152);
            iv_ruleContentProvider=ruleContentProvider();
            _fsp--;

             current =iv_ruleContentProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider3162); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1721:1: ruleContentProvider returns [EObject current=null] : ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) ) ;
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
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1726:6: ( ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1727:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1727:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1727:3: 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) )
            {
            match(input,34,FOLLOW_34_in_ruleContentProvider3197); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1731:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1732:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1732:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1733:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider3214); 

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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1755:2: ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1755:4: '(' ( (lv_parameter_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleContentProvider3230); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1759:1: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1760:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1760:1: (lv_parameter_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1761:3: lv_parameter_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleContentProvider3251);
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

                    match(input,14,FOLLOW_14_in_ruleContentProvider3261); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1787:3: ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) )
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
                    new NoViableAltException("1787:3: ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1787:5: 'returns'
                    {
                    match(input,35,FOLLOW_35_in_ruleContentProvider3274); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1792:6: ( (lv_resolver_6_0= 'resolves' ) )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1792:6: ( (lv_resolver_6_0= 'resolves' ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1793:1: (lv_resolver_6_0= 'resolves' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1793:1: (lv_resolver_6_0= 'resolves' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1794:3: lv_resolver_6_0= 'resolves'
                    {
                    lv_resolver_6_0=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleContentProvider3298); 

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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1813:3: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1814:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1814:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1815:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider3330); 

            		createLeafNode(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0(), "type"); 
            	

            }


            }

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1827:2: ( (lv_many_8_0= '[]' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1828:1: (lv_many_8_0= '[]' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1828:1: (lv_many_8_0= '[]' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1829:3: lv_many_8_0= '[]'
                    {
                    lv_many_8_0=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleContentProvider3348); 

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

            match(input,37,FOLLOW_37_in_ruleContentProvider3372); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getFetchesKeyword_6(), null); 
                
            match(input,38,FOLLOW_38_in_ruleContentProvider3382); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getXMLKeyword_7(), null); 
                
            match(input,39,FOLLOW_39_in_ruleContentProvider3392); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getFromKeyword_8(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1860:1: ( (lv_url_12_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1861:1: (lv_url_12_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1861:1: (lv_url_12_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1862:3: lv_url_12_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider3413);
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

            match(input,40,FOLLOW_40_in_ruleContentProvider3423); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getSelectsKeyword_10(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1888:1: ( (lv_selection_14_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1889:1: (lv_selection_14_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1889:1: (lv_selection_14_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1890:3: lv_selection_14_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider3444);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1920:1: entryRuleProviderConstruction returns [EObject current=null] : iv_ruleProviderConstruction= ruleProviderConstruction EOF ;
    public final EObject entryRuleProviderConstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderConstruction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1921:2: (iv_ruleProviderConstruction= ruleProviderConstruction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1922:2: iv_ruleProviderConstruction= ruleProviderConstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProviderConstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction3480);
            iv_ruleProviderConstruction=ruleProviderConstruction();
            _fsp--;

             current =iv_ruleProviderConstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderConstruction3490); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1929:1: ruleProviderConstruction returns [EObject current=null] : ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) ) ;
    public final EObject ruleProviderConstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_argument_3_0 = null;

        EObject lv_expression_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1934:6: ( ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1935:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1935:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )
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
                        new NoViableAltException("1935:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_STRING||LA21_0==13||LA21_0==15||(LA21_0>=17 && LA21_0<=18)||LA21_0==20) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1935:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1935:2: ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1935:2: ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1935:3: () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')'
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1935:3: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1936:5: 
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

                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1946:2: ( ( RULE_ID ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1947:1: ( RULE_ID )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1947:1: ( RULE_ID )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1948:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getProviderConstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProviderConstruction3543); 

                    		createLeafNode(grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0(), "provider"); 
                    	

                    }


                    }

                    match(input,13,FOLLOW_13_in_ruleProviderConstruction3553); 

                            createLeafNode(grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1964:1: ( (lv_argument_3_0= ruleExpression ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||LA20_0==13||LA20_0==15||(LA20_0>=17 && LA20_0<=18)||LA20_0==20) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1965:1: (lv_argument_3_0= ruleExpression )
                            {
                            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1965:1: (lv_argument_3_0= ruleExpression )
                            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1966:3: lv_argument_3_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction3574);
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

                    match(input,14,FOLLOW_14_in_ruleProviderConstruction3585); 

                            createLeafNode(grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1993:6: ( () ( (lv_expression_6_0= ruleExpression ) ) )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1993:6: ( () ( (lv_expression_6_0= ruleExpression ) ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1993:7: () ( (lv_expression_6_0= ruleExpression ) )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1993:7: ()
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:1994:5: 
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

                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2004:2: ( (lv_expression_6_0= ruleExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2005:1: (lv_expression_6_0= ruleExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2005:1: (lv_expression_6_0= ruleExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2006:3: lv_expression_6_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction3623);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2036:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2037:2: (iv_ruleView= ruleView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2038:2: iv_ruleView= ruleView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView3660);
            iv_ruleView=ruleView();
            _fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView3670); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2045:1: ruleView returns [EObject current=null] : (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_SectionedView_0 = null;

        EObject this_CustomView_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2050:6: ( (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2051:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2051:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )
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
                    new NoViableAltException("2051:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2052:5: this_SectionedView_0= ruleSectionedView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSectionedView_in_ruleView3717);
                    this_SectionedView_0=ruleSectionedView();
                    _fsp--;

                     
                            current = this_SectionedView_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2062:5: this_CustomView_1= ruleCustomView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomView_in_ruleView3744);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2078:1: entryRuleSectionedView returns [EObject current=null] : iv_ruleSectionedView= ruleSectionedView EOF ;
    public final EObject entryRuleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionedView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2079:2: (iv_ruleSectionedView= ruleSectionedView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2080:2: iv_ruleSectionedView= ruleSectionedView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionedViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionedView_in_entryRuleSectionedView3779);
            iv_ruleSectionedView=ruleSectionedView();
            _fsp--;

             current =iv_ruleSectionedView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionedView3789); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2087:1: ruleSectionedView returns [EObject current=null] : (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) ;
    public final EObject ruleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject this_TableView_0 = null;

        EObject this_DetailsView_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2092:6: ( (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2093:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2093:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
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
                    new NoViableAltException("2093:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2094:5: this_TableView_0= ruleTableView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTableView_in_ruleSectionedView3836);
                    this_TableView_0=ruleTableView();
                    _fsp--;

                     
                            current = this_TableView_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2104:5: this_DetailsView_1= ruleDetailsView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDetailsView_in_ruleSectionedView3863);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2120:1: entryRuleTableView returns [EObject current=null] : iv_ruleTableView= ruleTableView EOF ;
    public final EObject entryRuleTableView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2121:2: (iv_ruleTableView= ruleTableView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2122:2: iv_ruleTableView= ruleTableView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTableViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView3898);
            iv_ruleTableView=ruleTableView();
            _fsp--;

             current =iv_ruleTableView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView3908); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2129:1: ruleTableView returns [EObject current=null] : ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' ) ;
    public final EObject ruleTableView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_sections_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2134:6: ( ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2135:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2135:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2135:3: 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}'
            {
            match(input,41,FOLLOW_41_in_ruleTableView3943); 

                    createLeafNode(grammarAccess.getTableViewAccess().getTableviewKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2139:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2140:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2140:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2141:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableView3960); 

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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2163:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2163:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleTableView3976); 

                            createLeafNode(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2167:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2168:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2168:1: (lv_content_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2169:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleTableView3997);
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

                    match(input,14,FOLLOW_14_in_ruleTableView4007); 

                            createLeafNode(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleTableView4019); 

                    createLeafNode(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,25,FOLLOW_25_in_ruleTableView4029); 

                    createLeafNode(grammarAccess.getTableViewAccess().getTitleKeyword_4(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2203:1: ( (lv_title_7_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2204:1: (lv_title_7_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2204:1: (lv_title_7_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2205:3: lv_title_7_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTableView4050);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2227:2: ( (lv_sections_8_0= ruleViewSection ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2228:1: (lv_sections_8_0= ruleViewSection )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2228:1: (lv_sections_8_0= ruleViewSection )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2229:3: lv_sections_8_0= ruleViewSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleTableView4071);
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

            match(input,23,FOLLOW_23_in_ruleTableView4082); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2263:1: entryRuleDetailsView returns [EObject current=null] : iv_ruleDetailsView= ruleDetailsView EOF ;
    public final EObject entryRuleDetailsView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetailsView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2264:2: (iv_ruleDetailsView= ruleDetailsView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2265:2: iv_ruleDetailsView= ruleDetailsView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDetailsViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleDetailsView_in_entryRuleDetailsView4118);
            iv_ruleDetailsView=ruleDetailsView();
            _fsp--;

             current =iv_ruleDetailsView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailsView4128); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2272:1: ruleDetailsView returns [EObject current=null] : ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' ) ;
    public final EObject ruleDetailsView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_header_8_0 = null;

        EObject lv_sections_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2277:6: ( ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2278:1: ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2278:1: ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2278:3: 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}'
            {
            match(input,42,FOLLOW_42_in_ruleDetailsView4163); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2282:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2283:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2283:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2284:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDetailsView4180); 

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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2306:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2306:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleDetailsView4196); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2310:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2311:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2311:1: (lv_content_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2312:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleDetailsView4217);
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

                    match(input,14,FOLLOW_14_in_ruleDetailsView4227); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleDetailsView4239); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,25,FOLLOW_25_in_ruleDetailsView4249); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getTitleKeyword_4(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2346:1: ( (lv_title_7_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2347:1: (lv_title_7_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2347:1: (lv_title_7_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2348:3: lv_title_7_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleDetailsView4270);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2370:2: ( (lv_header_8_0= ruleViewHeader ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2371:1: (lv_header_8_0= ruleViewHeader )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2371:1: (lv_header_8_0= ruleViewHeader )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2372:3: lv_header_8_0= ruleViewHeader
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewHeader_in_ruleDetailsView4291);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2394:3: ( (lv_sections_9_0= ruleViewSection ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==49) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2395:1: (lv_sections_9_0= ruleViewSection )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2395:1: (lv_sections_9_0= ruleViewSection )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2396:3: lv_sections_9_0= ruleViewSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleDetailsView4313);
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

            match(input,23,FOLLOW_23_in_ruleDetailsView4324); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2430:1: entryRuleCustomView returns [EObject current=null] : iv_ruleCustomView= ruleCustomView EOF ;
    public final EObject entryRuleCustomView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomView = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2431:2: (iv_ruleCustomView= ruleCustomView EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2432:2: iv_ruleCustomView= ruleCustomView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView4360);
            iv_ruleCustomView=ruleCustomView();
            _fsp--;

             current =iv_ruleCustomView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView4370); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2439:1: ruleCustomView returns [EObject current=null] : ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_objclass_6_0=null;
        EObject lv_content_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2444:6: ( ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2445:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2445:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2445:3: 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) )
            {
            match(input,43,FOLLOW_43_in_ruleCustomView4405); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2449:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2450:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2450:1: (lv_name_1_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2451:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomView4422); 

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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2473:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2473:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleCustomView4438); 

                            createLeafNode(grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2477:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2478:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2478:1: (lv_content_3_0= ruleParameter )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2479:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleCustomView4459);
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

                    match(input,14,FOLLOW_14_in_ruleCustomView4469); 

                            createLeafNode(grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,44,FOLLOW_44_in_ruleCustomView4481); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getImplementedByKeyword_3(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2509:1: ( (lv_objclass_6_0= RULE_STRING ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2510:1: (lv_objclass_6_0= RULE_STRING )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2510:1: (lv_objclass_6_0= RULE_STRING )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2511:3: lv_objclass_6_0= RULE_STRING
            {
            lv_objclass_6_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomView4498); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2541:1: entryRuleViewHeader returns [EObject current=null] : iv_ruleViewHeader= ruleViewHeader EOF ;
    public final EObject entryRuleViewHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewHeader = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2542:2: (iv_ruleViewHeader= ruleViewHeader EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2543:2: iv_ruleViewHeader= ruleViewHeader EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewHeaderRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewHeader_in_entryRuleViewHeader4539);
            iv_ruleViewHeader=ruleViewHeader();
            _fsp--;

             current =iv_ruleViewHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewHeader4549); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2550:1: ruleViewHeader returns [EObject current=null] : ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' ) ;
    public final EObject ruleViewHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_title_4_0 = null;

        EObject lv_subtitle_6_0 = null;

        EObject lv_details_8_0 = null;

        EObject lv_image_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2555:6: ( ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2556:1: ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2556:1: ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2556:2: () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}'
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2556:2: ()
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2557:5: 
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

            match(input,45,FOLLOW_45_in_ruleViewHeader4593); 

                    createLeafNode(grammarAccess.getViewHeaderAccess().getHeaderKeyword_1(), null); 
                
            match(input,22,FOLLOW_22_in_ruleViewHeader4603); 

                    createLeafNode(grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2575:1: ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2575:3: 'title=' ( (lv_title_4_0= ruleScalarExpression ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleViewHeader4614); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2579:1: ( (lv_title_4_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2580:1: (lv_title_4_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2580:1: (lv_title_4_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2581:3: lv_title_4_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4635);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2603:4: ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2603:6: 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) )
                    {
                    match(input,46,FOLLOW_46_in_ruleViewHeader4648); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2607:1: ( (lv_subtitle_6_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2608:1: (lv_subtitle_6_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2608:1: (lv_subtitle_6_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2609:3: lv_subtitle_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4669);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2631:4: ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2631:6: 'details=' ( (lv_details_8_0= ruleScalarExpression ) )
                    {
                    match(input,47,FOLLOW_47_in_ruleViewHeader4682); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2635:1: ( (lv_details_8_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2636:1: (lv_details_8_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2636:1: (lv_details_8_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2637:3: lv_details_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4703);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2659:4: ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2659:6: 'image=' ( (lv_image_10_0= ruleScalarExpression ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleViewHeader4716); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getImageKeyword_6_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2663:1: ( (lv_image_10_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2664:1: (lv_image_10_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2664:1: (lv_image_10_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2665:3: lv_image_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4737);
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

            match(input,23,FOLLOW_23_in_ruleViewHeader4749); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2699:1: entryRuleViewSection returns [EObject current=null] : iv_ruleViewSection= ruleViewSection EOF ;
    public final EObject entryRuleViewSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewSection = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2700:2: (iv_ruleViewSection= ruleViewSection EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2701:2: iv_ruleViewSection= ruleViewSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewSection_in_entryRuleViewSection4785);
            iv_ruleViewSection=ruleViewSection();
            _fsp--;

             current =iv_ruleViewSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewSection4795); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2708:1: ruleViewSection returns [EObject current=null] : ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' ) ;
    public final EObject ruleViewSection() throws RecognitionException {
        EObject current = null;

        EObject lv_title_3_0 = null;

        EObject lv_cells_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2713:6: ( ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2714:1: ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2714:1: ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2714:3: 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}'
            {
            match(input,49,FOLLOW_49_in_ruleViewSection4830); 

                    createLeafNode(grammarAccess.getViewSectionAccess().getSectionKeyword_0(), null); 
                
            match(input,22,FOLLOW_22_in_ruleViewSection4840); 

                    createLeafNode(grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2722:1: ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2722:3: 'title=' ( (lv_title_3_0= ruleScalarExpression ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleViewSection4851); 

                            createLeafNode(grammarAccess.getViewSectionAccess().getTitleKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2726:1: ( (lv_title_3_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2727:1: (lv_title_3_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2727:1: (lv_title_3_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2728:3: lv_title_3_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewSection4872);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2750:4: ( (lv_cells_4_0= ruleSectionCell ) )+
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
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2751:1: (lv_cells_4_0= ruleSectionCell )
            	    {
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2751:1: (lv_cells_4_0= ruleSectionCell )
            	    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2752:3: lv_cells_4_0= ruleSectionCell
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSectionCell_in_ruleViewSection4895);
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

            match(input,23,FOLLOW_23_in_ruleViewSection4906); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2786:1: entryRuleSectionCell returns [EObject current=null] : iv_ruleSectionCell= ruleSectionCell EOF ;
    public final EObject entryRuleSectionCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionCell = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2787:2: (iv_ruleSectionCell= ruleSectionCell EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2788:2: iv_ruleSectionCell= ruleSectionCell EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionCellRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionCell_in_entryRuleSectionCell4942);
            iv_ruleSectionCell=ruleSectionCell();
            _fsp--;

             current =iv_ruleSectionCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionCell4952); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2795:1: ruleSectionCell returns [EObject current=null] : ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' ) ;
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
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2800:6: ( ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2801:1: ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2801:1: ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2801:3: 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}'
            {
            match(input,50,FOLLOW_50_in_ruleSectionCell4987); 

                    createLeafNode(grammarAccess.getSectionCellAccess().getCellKeyword_0(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2805:1: ( (lv_type_1_0= ruleCellType ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2806:1: (lv_type_1_0= ruleCellType )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2806:1: (lv_type_1_0= ruleCellType )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2807:3: lv_type_1_0= ruleCellType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCellType_in_ruleSectionCell5008);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2829:2: ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2829:4: 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    {
                    match(input,51,FOLLOW_51_in_ruleSectionCell5019); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getForeachKeyword_2_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2833:1: ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2834:1: (lv_iterator_3_0= ruleCollectionIterator )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2834:1: (lv_iterator_3_0= ruleCollectionIterator )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2835:3: lv_iterator_3_0= ruleCollectionIterator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleSectionCell5040);
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

            match(input,22,FOLLOW_22_in_ruleSectionCell5052); 

                    createLeafNode(grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2861:1: ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2861:3: 'text=' ( (lv_text_6_0= ruleScalarExpression ) )
                    {
                    match(input,52,FOLLOW_52_in_ruleSectionCell5063); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getTextKeyword_4_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2865:1: ( (lv_text_6_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2866:1: (lv_text_6_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2866:1: (lv_text_6_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2867:3: lv_text_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5084);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2889:4: ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2889:6: 'details=' ( (lv_details_8_0= ruleScalarExpression ) )
                    {
                    match(input,47,FOLLOW_47_in_ruleSectionCell5097); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2893:1: ( (lv_details_8_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2894:1: (lv_details_8_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2894:1: (lv_details_8_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2895:3: lv_details_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5118);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2917:4: ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2917:6: 'image=' ( (lv_image_10_0= ruleScalarExpression ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleSectionCell5131); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getImageKeyword_6_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2921:1: ( (lv_image_10_0= ruleScalarExpression ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2922:1: (lv_image_10_0= ruleScalarExpression )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2922:1: (lv_image_10_0= ruleScalarExpression )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2923:3: lv_image_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5152);
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

            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2945:4: ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2945:6: 'action=' ( (lv_action_12_0= ruleViewAction ) )
                    {
                    match(input,53,FOLLOW_53_in_ruleSectionCell5165); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getActionKeyword_7_0(), null); 
                        
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2949:1: ( (lv_action_12_0= ruleViewAction ) )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2950:1: (lv_action_12_0= ruleViewAction )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2950:1: (lv_action_12_0= ruleViewAction )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2951:3: lv_action_12_0= ruleViewAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_7_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewAction_in_ruleSectionCell5186);
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

            match(input,23,FOLLOW_23_in_ruleSectionCell5198); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2985:1: entryRuleCollectionIterator returns [EObject current=null] : iv_ruleCollectionIterator= ruleCollectionIterator EOF ;
    public final EObject entryRuleCollectionIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionIterator = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2986:2: (iv_ruleCollectionIterator= ruleCollectionIterator EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2987:2: iv_ruleCollectionIterator= ruleCollectionIterator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionIteratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator5234);
            iv_ruleCollectionIterator=ruleCollectionIterator();
            _fsp--;

             current =iv_ruleCollectionIterator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator5244); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2994:1: ruleCollectionIterator returns [EObject current=null] : ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCollectionIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_collection_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:2999:6: ( ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3000:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3000:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3000:2: ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3000:2: ( (lv_collection_0_0= ruleCollectionExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3001:1: (lv_collection_0_0= ruleCollectionExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3001:1: (lv_collection_0_0= ruleCollectionExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3002:3: lv_collection_0_0= ruleCollectionExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator5290);
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

            match(input,54,FOLLOW_54_in_ruleCollectionIterator5300); 

                    createLeafNode(grammarAccess.getCollectionIteratorAccess().getAsKeyword_1(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3028:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3029:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3029:1: (lv_name_2_0= RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3030:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionIterator5317); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3060:1: entryRuleViewAction returns [EObject current=null] : iv_ruleViewAction= ruleViewAction EOF ;
    public final EObject entryRuleViewAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewAction = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3061:2: (iv_ruleViewAction= ruleViewAction EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3062:2: iv_ruleViewAction= ruleViewAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction5358);
            iv_ruleViewAction=ruleViewAction();
            _fsp--;

             current =iv_ruleViewAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction5368); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3069:1: ruleViewAction returns [EObject current=null] : (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen ) ;
    public final EObject ruleViewAction() throws RecognitionException {
        EObject current = null;

        EObject this_ViewCall_0 = null;

        EObject this_ExternalOpen_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3074:6: ( (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3075:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3075:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )
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
                        new NoViableAltException("3075:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0==RULE_STRING||LA41_0==13||LA41_0==15||LA41_0==17) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3075:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3076:5: this_ViewCall_0= ruleViewCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleViewCall_in_ruleViewAction5415);
                    this_ViewCall_0=ruleViewCall();
                    _fsp--;

                     
                            current = this_ViewCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3086:5: this_ExternalOpen_1= ruleExternalOpen
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalOpen_in_ruleViewAction5442);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3102:1: entryRuleExternalOpen returns [EObject current=null] : iv_ruleExternalOpen= ruleExternalOpen EOF ;
    public final EObject entryRuleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalOpen = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3103:2: (iv_ruleExternalOpen= ruleExternalOpen EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3104:2: iv_ruleExternalOpen= ruleExternalOpen EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalOpenRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen5477);
            iv_ruleExternalOpen=ruleExternalOpen();
            _fsp--;

             current =iv_ruleExternalOpen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen5487); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3111:1: ruleExternalOpen returns [EObject current=null] : ( (lv_url_0_0= ruleScalarExpression ) ) ;
    public final EObject ruleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject lv_url_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3116:6: ( ( (lv_url_0_0= ruleScalarExpression ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3117:1: ( (lv_url_0_0= ruleScalarExpression ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3117:1: ( (lv_url_0_0= ruleScalarExpression ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3118:1: (lv_url_0_0= ruleScalarExpression )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3118:1: (lv_url_0_0= ruleScalarExpression )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3119:3: lv_url_0_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleExternalOpen5532);
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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3149:1: entryRuleViewCall returns [EObject current=null] : iv_ruleViewCall= ruleViewCall EOF ;
    public final EObject entryRuleViewCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewCall = null;


        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3150:2: (iv_ruleViewCall= ruleViewCall EOF )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3151:2: iv_ruleViewCall= ruleViewCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall5567);
            iv_ruleViewCall=ruleViewCall();
            _fsp--;

             current =iv_ruleViewCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall5577); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3158:1: ruleViewCall returns [EObject current=null] : ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' ) ;
    public final EObject ruleViewCall() throws RecognitionException {
        EObject current = null;

        EObject lv_provider_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3163:6: ( ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3164:1: ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3164:1: ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3164:2: ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')'
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3164:2: ( ( RULE_ID ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3165:1: ( RULE_ID )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3165:1: ( RULE_ID )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3166:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getViewCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewCall5620); 

            		createLeafNode(grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0(), "view"); 
            	

            }


            }

            match(input,13,FOLLOW_13_in_ruleViewCall5630); 

                    createLeafNode(grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3182:1: ( (lv_provider_2_0= ruleProviderConstruction ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||LA42_0==13||LA42_0==15||(LA42_0>=17 && LA42_0<=18)||LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3183:1: (lv_provider_2_0= ruleProviderConstruction )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3183:1: (lv_provider_2_0= ruleProviderConstruction )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3184:3: lv_provider_2_0= ruleProviderConstruction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProviderConstruction_in_ruleViewCall5651);
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

            match(input,14,FOLLOW_14_in_ruleViewCall5662); 

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
    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3218:1: ruleCellType returns [Enumerator current=null] : ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) ) ;
    public final Enumerator ruleCellType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3222:6: ( ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) ) )
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3223:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) )
            {
            // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3223:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) )
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
                    new NoViableAltException("3223:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) )", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3223:2: ( 'Default' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3223:2: ( 'Default' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3223:4: 'Default'
                    {
                    match(input,55,FOLLOW_55_in_ruleCellType5710); 

                            current = grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3229:6: ( 'DefaultWithDisclosure' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3229:6: ( 'DefaultWithDisclosure' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3229:8: 'DefaultWithDisclosure'
                    {
                    match(input,56,FOLLOW_56_in_ruleCellType5725); 

                            current = grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3235:6: ( 'Value2' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3235:6: ( 'Value2' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3235:8: 'Value2'
                    {
                    match(input,57,FOLLOW_57_in_ruleCellType5740); 

                            current = grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3241:6: ( 'Double' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3241:6: ( 'Double' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3241:8: 'Double'
                    {
                    match(input,58,FOLLOW_58_in_ruleCellType5755); 

                            current = grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3247:6: ( 'Subtitle' )
                    {
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3247:6: ( 'Subtitle' )
                    // ../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g:3247:8: 'Subtitle'
                    {
                    match(input,59,FOLLOW_59_in_ruleCellType5770); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDescription507 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleTypeDescription525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleParameter631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_entryRuleObjectReference689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectReference699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectReference742 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleObjectReference763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedObjectReference810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleNestedObjectReference845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNestedObjectReference863 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleNestedObjectReference884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleExpression978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleExpression1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleExpression1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleExpression1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleExpression1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression1121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarExpression1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleScalarExpression1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleScalarExpression1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleScalarExpression1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleCollectionExpression1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction1504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStringFunction1559 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1580 = new BitSet(new long[]{0x000000000002E030L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStringFunction1618 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1639 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringFunction1649 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1670 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringFunction1680 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1701 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStringFunction1738 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1759 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCollectionLiteral1851 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1872 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionLiteral1883 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1904 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleCollectionLiteral1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction1952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunction1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCollectionFunction2006 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2027 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionFunction2037 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2058 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCollectionFunction2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication2104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabBarApplication2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTabBarApplication2149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTabBarApplication2166 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTabBarApplication2181 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_ruleTabBarApplication2202 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleTabBarApplication2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton2249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabbarButton2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTabbarButton2294 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTabbarButton2304 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTabbarButton2314 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTabbarButton2335 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTabbarButton2345 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTabbarButton2366 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTabbarButton2376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleTabbarButton2397 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTabbarButton2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConstant2497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant2514 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleConstant2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType2695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSimpleType2740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType2757 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSimpleType2772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleType2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEntity2875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2892 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_32_in_ruleEntity2908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2926 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEntity2938 = new BitSet(new long[]{0x0000000200800010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity2959 = new BitSet(new long[]{0x0000000200800010L});
    public static final BitSet FOLLOW_23_in_ruleEntity2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleProperty3059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleProperty3094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider3152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleContentProvider3197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider3214 = new BitSet(new long[]{0x0000001800002000L});
    public static final BitSet FOLLOW_13_in_ruleContentProvider3230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleContentProvider3251 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContentProvider3261 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleContentProvider3274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_36_in_ruleContentProvider3298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider3330 = new BitSet(new long[]{0x0000002000000800L});
    public static final BitSet FOLLOW_11_in_ruleContentProvider3348 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleContentProvider3372 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleContentProvider3382 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleContentProvider3392 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider3413 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleContentProvider3423 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderConstruction3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProviderConstruction3543 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProviderConstruction3553 = new BitSet(new long[]{0x000000000016E030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction3574 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProviderConstruction3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView3660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_ruleView3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_ruleView3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_entryRuleSectionedView3779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionedView3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_ruleSectionedView3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_ruleSectionedView3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView3898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTableView3943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableView3960 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleTableView3976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTableView3997 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTableView4007 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTableView4019 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTableView4029 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTableView4050 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleTableView4071 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTableView4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_entryRuleDetailsView4118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailsView4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDetailsView4163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDetailsView4180 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleDetailsView4196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDetailsView4217 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDetailsView4227 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDetailsView4239 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDetailsView4249 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleDetailsView4270 = new BitSet(new long[]{0x0002200000800000L});
    public static final BitSet FOLLOW_ruleViewHeader_in_ruleDetailsView4291 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleDetailsView4313 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDetailsView4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView4360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCustomView4405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomView4422 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_13_in_ruleCustomView4438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCustomView4459 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomView4469 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCustomView4481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomView4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_entryRuleViewHeader4539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewHeader4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleViewHeader4593 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleViewHeader4603 = new BitSet(new long[]{0x0001C00002800000L});
    public static final BitSet FOLLOW_25_in_ruleViewHeader4614 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4635 = new BitSet(new long[]{0x0001C00000800000L});
    public static final BitSet FOLLOW_46_in_ruleViewHeader4648 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4669 = new BitSet(new long[]{0x0001800000800000L});
    public static final BitSet FOLLOW_47_in_ruleViewHeader4682 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4703 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_48_in_ruleViewHeader4716 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4737 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleViewHeader4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_entryRuleViewSection4785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewSection4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleViewSection4830 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleViewSection4840 = new BitSet(new long[]{0x0004000002000000L});
    public static final BitSet FOLLOW_25_in_ruleViewSection4851 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewSection4872 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleSectionCell_in_ruleViewSection4895 = new BitSet(new long[]{0x0004000000800000L});
    public static final BitSet FOLLOW_23_in_ruleViewSection4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_entryRuleSectionCell4942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionCell4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSectionCell4987 = new BitSet(new long[]{0x0F80000000000000L});
    public static final BitSet FOLLOW_ruleCellType_in_ruleSectionCell5008 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_51_in_ruleSectionCell5019 = new BitSet(new long[]{0x0000000000140010L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleSectionCell5040 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSectionCell5052 = new BitSet(new long[]{0x0031800000800000L});
    public static final BitSet FOLLOW_52_in_ruleSectionCell5063 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5084 = new BitSet(new long[]{0x0021800000800000L});
    public static final BitSet FOLLOW_47_in_ruleSectionCell5097 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5118 = new BitSet(new long[]{0x0021000000800000L});
    public static final BitSet FOLLOW_48_in_ruleSectionCell5131 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5152 = new BitSet(new long[]{0x0020000000800000L});
    public static final BitSet FOLLOW_53_in_ruleSectionCell5165 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleViewAction_in_ruleSectionCell5186 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSectionCell5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator5234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator5290 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleCollectionIterator5300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionIterator5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction5358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleViewAction5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_ruleViewAction5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen5477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleExternalOpen5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall5567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewCall5620 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewCall5630 = new BitSet(new long[]{0x000000000016E030L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_ruleViewCall5651 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleViewCall5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleCellType5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCellType5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCellType5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCellType5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCellType5770 = new BitSet(new long[]{0x0000000000000002L});

}