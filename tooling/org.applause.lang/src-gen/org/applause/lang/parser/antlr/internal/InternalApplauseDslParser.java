package org.applause.lang.parser.antlr.internal; 

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
import org.applause.lang.services.ApplauseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[]'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'['", "']'", "'split('", "'tabbarApplication'", "'application'", "'{'", "'splash='", "'}'", "'button'", "'title='", "'icon='", "'view='", "'const'", "'type'", "'mapsTo'", "'entity'", "'extends'", "'derived'", "'contentprovider'", "'returns'", "'resolves'", "'fetches'", "'XML'", "'from'", "'selects'", "'tableview'", "'detailsview'", "'customview'", "'implementedBy'", "'header'", "'subtitle='", "'details='", "'image='", "'section'", "'cell'", "'foreach'", "'text='", "'action='", "'as'", "'Default'", "'DefaultWithDisclosure'", "'Value2'", "'Double'", "'Subtitle'"
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
    public String getGrammarFileName() { return "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g"; }



     	private ApplauseDslGrammarAccess grammarAccess;
     	
        public InternalApplauseDslParser(TokenStream input, IAstFactory factory, ApplauseDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/applause/lang/parser/antlr/internal/InternalApplauseDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ApplauseDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:80:2: iv_ruleModel= ruleModel EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:87:1: ruleModel returns [EObject current=null] : ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:92:6: ( ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:93:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:93:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:93:2: ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:93:2: ( (lv_application_0_0= ruleApplication ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:94:1: (lv_application_0_0= ruleApplication )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:94:1: (lv_application_0_0= ruleApplication )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:95:3: lv_application_0_0= ruleApplication
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:117:2: ( (lv_elements_1_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=30 && LA1_0<=31)||LA1_0==33||LA1_0==36||(LA1_0>=43 && LA1_0<=45)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:118:1: (lv_elements_1_0= ruleModelElement )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:118:1: (lv_elements_1_0= ruleModelElement )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:119:3: lv_elements_1_0= ruleModelElement
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:149:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:150:2: (iv_ruleApplication= ruleApplication EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:151:2: iv_ruleApplication= ruleApplication EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:158:1: ruleApplication returns [EObject current=null] : this_TabBarApplication_0= ruleTabBarApplication ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        EObject this_TabBarApplication_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:163:6: (this_TabBarApplication_0= ruleTabBarApplication )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:165:5: this_TabBarApplication_0= ruleTabBarApplication
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:181:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:182:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:183:2: iv_ruleModelElement= ruleModelElement EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:190:1: ruleModelElement returns [EObject current=null] : (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ContentProvider_1 = null;

        EObject this_View_2 = null;

        EObject this_Constant_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:195:6: ( (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:196:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:196:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 31:
            case 33:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 43:
            case 44:
            case 45:
                {
                alt2=3;
                }
                break;
            case 30:
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:197:5: this_Type_0= ruleType
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:207:5: this_ContentProvider_1= ruleContentProvider
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:217:5: this_View_2= ruleView
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:227:5: this_Constant_3= ruleConstant
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:245:1: entryRuleTypeDescription returns [EObject current=null] : iv_ruleTypeDescription= ruleTypeDescription EOF ;
    public final EObject entryRuleTypeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDescription = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:246:2: (iv_ruleTypeDescription= ruleTypeDescription EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:247:2: iv_ruleTypeDescription= ruleTypeDescription EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:254:1: ruleTypeDescription returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeDescription() throws RecognitionException {
        EObject current = null;

        Token lv_many_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:259:6: ( ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:260:1: ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:260:1: ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:260:2: ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:260:2: ( ( RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:261:1: ( RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:261:1: ( RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:262:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDescription507); 

            		createLeafNode(grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:274:2: ( (lv_many_1_0= '[]' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:275:1: (lv_many_1_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:275:1: (lv_many_1_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:276:3: lv_many_1_0= '[]'
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:303:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:304:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:305:2: iv_ruleParameter= ruleParameter EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:312:1: ruleParameter returns [EObject current=null] : ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:317:6: ( ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:318:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:318:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:318:2: ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:318:2: ( (lv_description_0_0= ruleTypeDescription ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:319:1: (lv_description_0_0= ruleTypeDescription )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:319:1: (lv_description_0_0= ruleTypeDescription )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:320:3: lv_description_0_0= ruleTypeDescription
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:342:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:343:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:343:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:344:3: lv_name_1_0= RULE_ID
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:374:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:375:2: (iv_ruleObjectReference= ruleObjectReference EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:376:2: iv_ruleObjectReference= ruleObjectReference EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:383:1: ruleObjectReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:388:6: ( ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:389:1: ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:389:1: ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:389:2: ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:389:2: ( ( RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:390:1: ( RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:390:1: ( RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:391:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getObjectReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectReference742); 

            		createLeafNode(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0(), "object"); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:403:2: ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:404:1: (lv_tail_1_0= ruleNestedObjectReference )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:404:1: (lv_tail_1_0= ruleNestedObjectReference )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:405:3: lv_tail_1_0= ruleNestedObjectReference
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:435:1: entryRuleNestedObjectReference returns [EObject current=null] : iv_ruleNestedObjectReference= ruleNestedObjectReference EOF ;
    public final EObject entryRuleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedObjectReference = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:436:2: (iv_ruleNestedObjectReference= ruleNestedObjectReference EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:437:2: iv_ruleNestedObjectReference= ruleNestedObjectReference EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:444:1: ruleNestedObjectReference returns [EObject current=null] : ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:449:6: ( ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:450:1: ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:450:1: ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:450:3: '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            {
            match(input,12,FOLLOW_12_in_ruleNestedObjectReference845); 

                    createLeafNode(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:454:1: ( ( RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:455:1: ( RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:455:1: ( RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:456:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getNestedObjectReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNestedObjectReference863); 

            		createLeafNode(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0(), "object"); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:468:2: ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:469:1: (lv_tail_2_0= ruleNestedObjectReference )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:469:1: (lv_tail_2_0= ruleNestedObjectReference )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:470:3: lv_tail_2_0= ruleNestedObjectReference
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:500:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:501:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:502:2: iv_ruleExpression= ruleExpression EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:509:1: ruleExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_CollectionLiteral_2 = null;

        EObject this_CollectionFunction_3 = null;

        EObject this_ObjectReference_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:514:6: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:515:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:515:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:516:5: this_StringLiteral_0= ruleStringLiteral
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:526:5: this_StringFunction_1= ruleStringFunction
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:536:5: this_CollectionLiteral_2= ruleCollectionLiteral
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:546:5: this_CollectionFunction_3= ruleCollectionFunction
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:556:5: this_ObjectReference_4= ruleObjectReference
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:572:1: entryRuleScalarExpression returns [EObject current=null] : iv_ruleScalarExpression= ruleScalarExpression EOF ;
    public final EObject entryRuleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:573:2: (iv_ruleScalarExpression= ruleScalarExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:574:2: iv_ruleScalarExpression= ruleScalarExpression EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:581:1: ruleScalarExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:586:6: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:587:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:587:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:588:5: this_StringLiteral_0= ruleStringLiteral
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:598:5: this_StringFunction_1= ruleStringFunction
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:608:5: this_ObjectReference_2= ruleObjectReference
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:624:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:625:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:626:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:633:1: ruleCollectionExpression returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteral_0 = null;

        EObject this_CollectionFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:638:6: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:639:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:639:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:640:5: this_CollectionLiteral_0= ruleCollectionLiteral
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:650:5: this_CollectionFunction_1= ruleCollectionFunction
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:660:5: this_ObjectReference_2= ruleObjectReference
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:676:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:677:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:678:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:685:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:690:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:691:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:691:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:692:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:692:1: (lv_value_0_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:693:3: lv_value_0_0= RULE_STRING
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:723:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:724:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:725:2: iv_ruleStringFunction= ruleStringFunction EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:732:1: ruleStringFunction returns [EObject current=null] : ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_values_2_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_match_8_0 = null;

        EObject lv_replacement_10_0 = null;

        EObject lv_value_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:737:6: ( ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:738:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:738:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:738:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:738:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:738:3: () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:738:3: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:739:5: 
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
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:753:1: ( (lv_values_2_0= ruleScalarExpression ) )+
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
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:754:1: (lv_values_2_0= ruleScalarExpression )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:754:1: (lv_values_2_0= ruleScalarExpression )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:755:3: lv_values_2_0= ruleScalarExpression
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:782:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:782:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:782:7: () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:782:7: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:783:5: 
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
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:797:1: ( (lv_value_6_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:798:1: (lv_value_6_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:798:1: (lv_value_6_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:799:3: lv_value_6_0= ruleScalarExpression
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
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:825:1: ( (lv_match_8_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:826:1: (lv_match_8_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:826:1: (lv_match_8_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:827:3: lv_match_8_0= ruleScalarExpression
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
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:853:1: ( (lv_replacement_10_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:854:1: (lv_replacement_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:854:1: (lv_replacement_10_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:855:3: lv_replacement_10_0= ruleScalarExpression
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:882:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:882:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:882:7: () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:882:7: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:883:5: 
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
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:897:1: ( (lv_value_14_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:898:1: (lv_value_14_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:898:1: (lv_value_14_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:899:3: lv_value_14_0= ruleScalarExpression
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:933:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteral = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:934:2: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:935:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:942:1: ruleCollectionLiteral returns [EObject current=null] : ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:947:6: ( ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:948:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:948:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:948:3: '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']'
            {
            match(input,18,FOLLOW_18_in_ruleCollectionLiteral1851); 

                    createLeafNode(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:952:1: ( (lv_items_1_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:953:1: (lv_items_1_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:953:1: (lv_items_1_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:954:3: lv_items_1_0= ruleScalarExpression
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:976:2: ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:976:4: ',' ( (lv_items_3_0= ruleScalarExpression ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleCollectionLiteral1883); 

            	            createLeafNode(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:980:1: ( (lv_items_3_0= ruleScalarExpression ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:981:1: (lv_items_3_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:981:1: (lv_items_3_0= ruleScalarExpression )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:982:3: lv_items_3_0= ruleScalarExpression
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1016:1: entryRuleCollectionFunction returns [EObject current=null] : iv_ruleCollectionFunction= ruleCollectionFunction EOF ;
    public final EObject entryRuleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFunction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1017:2: (iv_ruleCollectionFunction= ruleCollectionFunction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1018:2: iv_ruleCollectionFunction= ruleCollectionFunction EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1025:1: ruleCollectionFunction returns [EObject current=null] : ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) ;
    public final EObject ruleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;

        EObject lv_delimiter_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1030:6: ( ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1031:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1031:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1031:2: () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1031:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1032:5: 
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
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1046:1: ( (lv_value_2_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1047:1: (lv_value_2_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1047:1: (lv_value_2_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1048:3: lv_value_2_0= ruleScalarExpression
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
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1074:1: ( (lv_delimiter_4_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1075:1: (lv_delimiter_4_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1075:1: (lv_delimiter_4_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1076:3: lv_delimiter_4_0= ruleScalarExpression
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1110:1: entryRuleTabBarApplication returns [EObject current=null] : iv_ruleTabBarApplication= ruleTabBarApplication EOF ;
    public final EObject entryRuleTabBarApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabBarApplication = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1111:2: (iv_ruleTabBarApplication= ruleTabBarApplication EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1112:2: iv_ruleTabBarApplication= ruleTabBarApplication EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1119:1: ruleTabBarApplication returns [EObject current=null] : ( ( 'tabbarApplication' | 'application' ) ( (lv_name_2_0= RULE_ID ) ) '{' ( 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )? ( (lv_buttons_6_0= ruleTabbarButton ) )* '}' ) ;
    public final EObject ruleTabBarApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_splash_5_0=null;
        EObject lv_buttons_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1124:6: ( ( ( 'tabbarApplication' | 'application' ) ( (lv_name_2_0= RULE_ID ) ) '{' ( 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )? ( (lv_buttons_6_0= ruleTabbarButton ) )* '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1125:1: ( ( 'tabbarApplication' | 'application' ) ( (lv_name_2_0= RULE_ID ) ) '{' ( 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )? ( (lv_buttons_6_0= ruleTabbarButton ) )* '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1125:1: ( ( 'tabbarApplication' | 'application' ) ( (lv_name_2_0= RULE_ID ) ) '{' ( 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )? ( (lv_buttons_6_0= ruleTabbarButton ) )* '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1125:2: ( 'tabbarApplication' | 'application' ) ( (lv_name_2_0= RULE_ID ) ) '{' ( 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )? ( (lv_buttons_6_0= ruleTabbarButton ) )* '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1125:2: ( 'tabbarApplication' | 'application' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1125:2: ( 'tabbarApplication' | 'application' )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1125:4: 'tabbarApplication'
                    {
                    match(input,21,FOLLOW_21_in_ruleTabBarApplication2150); 

                            createLeafNode(grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1130:7: 'application'
                    {
                    match(input,22,FOLLOW_22_in_ruleTabBarApplication2166); 

                            createLeafNode(grammarAccess.getTabBarApplicationAccess().getApplicationKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1134:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1135:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1135:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1136:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTabBarApplication2184); 

            			createLeafNode(grammarAccess.getTabBarApplicationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTabBarApplicationRule().getType().getClassifier());
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

            match(input,23,FOLLOW_23_in_ruleTabBarApplication2199); 

                    createLeafNode(grammarAccess.getTabBarApplicationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1162:1: ( 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1162:3: 'splash=' ( (lv_splash_5_0= RULE_STRING ) )
                    {
                    match(input,24,FOLLOW_24_in_ruleTabBarApplication2210); 

                            createLeafNode(grammarAccess.getTabBarApplicationAccess().getSplashKeyword_3_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1166:1: ( (lv_splash_5_0= RULE_STRING ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1167:1: (lv_splash_5_0= RULE_STRING )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1167:1: (lv_splash_5_0= RULE_STRING )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1168:3: lv_splash_5_0= RULE_STRING
                    {
                    lv_splash_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTabBarApplication2227); 

                    			createLeafNode(grammarAccess.getTabBarApplicationAccess().getSplashSTRINGTerminalRuleCall_3_1_0(), "splash"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTabBarApplicationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"splash",
                    	        		lv_splash_5_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1190:4: ( (lv_buttons_6_0= ruleTabbarButton ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1191:1: (lv_buttons_6_0= ruleTabbarButton )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1191:1: (lv_buttons_6_0= ruleTabbarButton )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1192:3: lv_buttons_6_0= ruleTabbarButton
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabBarApplicationAccess().getButtonsTabbarButtonParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTabbarButton_in_ruleTabBarApplication2255);
            	    lv_buttons_6_0=ruleTabbarButton();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTabBarApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"buttons",
            	    	        		lv_buttons_6_0, 
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
            	    break loop14;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleTabBarApplication2266); 

                    createLeafNode(grammarAccess.getTabBarApplicationAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1226:1: entryRuleTabbarButton returns [EObject current=null] : iv_ruleTabbarButton= ruleTabbarButton EOF ;
    public final EObject entryRuleTabbarButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabbarButton = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1227:2: (iv_ruleTabbarButton= ruleTabbarButton EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1228:2: iv_ruleTabbarButton= ruleTabbarButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabbarButtonRule(), currentNode); 
            pushFollow(FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton2302);
            iv_ruleTabbarButton=ruleTabbarButton();
            _fsp--;

             current =iv_ruleTabbarButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabbarButton2312); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1235:1: ruleTabbarButton returns [EObject current=null] : ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' ) ;
    public final EObject ruleTabbarButton() throws RecognitionException {
        EObject current = null;

        EObject lv_title_3_0 = null;

        EObject lv_icon_5_0 = null;

        EObject lv_view_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1240:6: ( ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1241:1: ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1241:1: ( 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1241:3: 'button' '{' 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) 'view=' ( (lv_view_7_0= ruleViewCall ) ) '}'
            {
            match(input,26,FOLLOW_26_in_ruleTabbarButton2347); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getButtonKeyword_0(), null); 
                
            match(input,23,FOLLOW_23_in_ruleTabbarButton2357); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,27,FOLLOW_27_in_ruleTabbarButton2367); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getTitleKeyword_2(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1253:1: ( (lv_title_3_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1254:1: (lv_title_3_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1254:1: (lv_title_3_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1255:3: lv_title_3_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTabbarButton2388);
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

            match(input,28,FOLLOW_28_in_ruleTabbarButton2398); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getIconKeyword_4(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1281:1: ( (lv_icon_5_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1282:1: (lv_icon_5_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1282:1: (lv_icon_5_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1283:3: lv_icon_5_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTabbarButton2419);
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

            match(input,29,FOLLOW_29_in_ruleTabbarButton2429); 

                    createLeafNode(grammarAccess.getTabbarButtonAccess().getViewKeyword_6(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1309:1: ( (lv_view_7_0= ruleViewCall ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1310:1: (lv_view_7_0= ruleViewCall )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1310:1: (lv_view_7_0= ruleViewCall )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1311:3: lv_view_7_0= ruleViewCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleViewCall_in_ruleTabbarButton2450);
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

            match(input,25,FOLLOW_25_in_ruleTabbarButton2460); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1345:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1346:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1347:2: iv_ruleConstant= ruleConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2496);
            iv_ruleConstant=ruleConstant();
            _fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2506); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1354:1: ruleConstant returns [EObject current=null] : ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1359:6: ( ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1360:1: ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1360:1: ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1360:2: () 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1360:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1361:5: 
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

            match(input,30,FOLLOW_30_in_ruleConstant2550); 

                    createLeafNode(grammarAccess.getConstantAccess().getConstKeyword_1(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1375:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1376:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1376:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1377:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant2567); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1399:2: ( (lv_value_3_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1400:1: (lv_value_3_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1400:1: (lv_value_3_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1401:3: lv_value_3_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantAccess().getValueScalarExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleConstant2593);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1431:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1432:2: (iv_ruleType= ruleType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1433:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2629);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2639); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1440:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1445:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1446:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1446:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1446:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1447:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType2686);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1457:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType2713);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1473:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1474:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1475:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType2748);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType2758); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1482:1: ruleSimpleType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_platformType_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1487:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1488:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1488:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1488:3: 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) )
            {
            match(input,31,FOLLOW_31_in_ruleSimpleType2793); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1492:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1493:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1493:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1494:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType2810); 

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

            match(input,32,FOLLOW_32_in_ruleSimpleType2825); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1520:1: ( (lv_platformType_3_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1521:1: (lv_platformType_3_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1521:1: (lv_platformType_3_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1522:3: lv_platformType_3_0= RULE_STRING
            {
            lv_platformType_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleType2842); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1552:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1553:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1554:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2883);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2893); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1561:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_properties_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1566:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1567:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1567:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1567:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}'
            {
            match(input,33,FOLLOW_33_in_ruleEntity2928); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1571:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1572:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1572:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1573:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2945); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1595:2: ( 'extends' ( ( RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1595:4: 'extends' ( ( RULE_ID ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleEntity2961); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1599:1: ( ( RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1600:1: ( RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1600:1: ( RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1601:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2979); 

                    		createLeafNode(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0(), "extends"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleEntity2991); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1617:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1618:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1618:1: (lv_properties_5_0= ruleProperty )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1619:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity3012);
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
            	    break loop17;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleEntity3023); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1653:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1654:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1655:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3059);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3069); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1662:1: ruleProperty returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_description_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1667:6: ( ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1668:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1668:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1668:2: ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1668:2: ( (lv_derived_0_0= 'derived' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1669:1: (lv_derived_0_0= 'derived' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1669:1: (lv_derived_0_0= 'derived' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1670:3: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleProperty3112); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1689:3: ( (lv_description_1_0= ruleTypeDescription ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1690:1: (lv_description_1_0= ruleTypeDescription )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1690:1: (lv_description_1_0= ruleTypeDescription )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1691:3: lv_description_1_0= ruleTypeDescription
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleProperty3147);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1713:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1714:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1714:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1715:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3164); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1745:1: entryRuleContentProvider returns [EObject current=null] : iv_ruleContentProvider= ruleContentProvider EOF ;
    public final EObject entryRuleContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProvider = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1746:2: (iv_ruleContentProvider= ruleContentProvider EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1747:2: iv_ruleContentProvider= ruleContentProvider EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentProviderRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider3205);
            iv_ruleContentProvider=ruleContentProvider();
            _fsp--;

             current =iv_ruleContentProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider3215); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1754:1: ruleContentProvider returns [EObject current=null] : ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) ) ;
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
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1759:6: ( ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1760:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1760:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1760:3: 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? 'fetches' 'XML' 'from' ( (lv_url_12_0= ruleScalarExpression ) ) 'selects' ( (lv_selection_14_0= ruleScalarExpression ) )
            {
            match(input,36,FOLLOW_36_in_ruleContentProvider3250); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1764:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1765:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1765:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1766:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider3267); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1788:2: ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1788:4: '(' ( (lv_parameter_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleContentProvider3283); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1792:1: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1793:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1793:1: (lv_parameter_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1794:3: lv_parameter_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleContentProvider3304);
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

                    match(input,14,FOLLOW_14_in_ruleContentProvider3314); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1820:3: ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            else if ( (LA20_0==38) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1820:3: ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1820:5: 'returns'
                    {
                    match(input,37,FOLLOW_37_in_ruleContentProvider3327); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1825:6: ( (lv_resolver_6_0= 'resolves' ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1825:6: ( (lv_resolver_6_0= 'resolves' ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1826:1: (lv_resolver_6_0= 'resolves' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1826:1: (lv_resolver_6_0= 'resolves' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1827:3: lv_resolver_6_0= 'resolves'
                    {
                    lv_resolver_6_0=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleContentProvider3351); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1846:3: ( ( RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1847:1: ( RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1847:1: ( RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1848:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider3383); 

            		createLeafNode(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0(), "type"); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1860:2: ( (lv_many_8_0= '[]' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==11) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1861:1: (lv_many_8_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1861:1: (lv_many_8_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1862:3: lv_many_8_0= '[]'
                    {
                    lv_many_8_0=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleContentProvider3401); 

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

            match(input,39,FOLLOW_39_in_ruleContentProvider3425); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getFetchesKeyword_6(), null); 
                
            match(input,40,FOLLOW_40_in_ruleContentProvider3435); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getXMLKeyword_7(), null); 
                
            match(input,41,FOLLOW_41_in_ruleContentProvider3445); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getFromKeyword_8(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1893:1: ( (lv_url_12_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1894:1: (lv_url_12_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1894:1: (lv_url_12_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1895:3: lv_url_12_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider3466);
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

            match(input,42,FOLLOW_42_in_ruleContentProvider3476); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getSelectsKeyword_10(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1921:1: ( (lv_selection_14_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1922:1: (lv_selection_14_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1922:1: (lv_selection_14_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1923:3: lv_selection_14_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider3497);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1953:1: entryRuleProviderConstruction returns [EObject current=null] : iv_ruleProviderConstruction= ruleProviderConstruction EOF ;
    public final EObject entryRuleProviderConstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderConstruction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1954:2: (iv_ruleProviderConstruction= ruleProviderConstruction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1955:2: iv_ruleProviderConstruction= ruleProviderConstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProviderConstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction3533);
            iv_ruleProviderConstruction=ruleProviderConstruction();
            _fsp--;

             current =iv_ruleProviderConstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderConstruction3543); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1962:1: ruleProviderConstruction returns [EObject current=null] : ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) ) ;
    public final EObject ruleProviderConstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_argument_3_0 = null;

        EObject lv_expression_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1967:6: ( ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1968:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1968:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==13) ) {
                    alt23=1;
                }
                else if ( (LA23_1==EOF||LA23_1==12||LA23_1==14) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1968:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_STRING||LA23_0==13||LA23_0==15||(LA23_0>=17 && LA23_0<=18)||LA23_0==20) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1968:1: ( ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1968:2: ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1968:2: ( () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1968:3: () ( ( RULE_ID ) ) '(' ( (lv_argument_3_0= ruleExpression ) )? ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1968:3: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1969:5: 
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

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1979:2: ( ( RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1980:1: ( RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1980:1: ( RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1981:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getProviderConstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProviderConstruction3596); 

                    		createLeafNode(grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0(), "provider"); 
                    	

                    }


                    }

                    match(input,13,FOLLOW_13_in_ruleProviderConstruction3606); 

                            createLeafNode(grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1997:1: ( (lv_argument_3_0= ruleExpression ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==13||LA22_0==15||(LA22_0>=17 && LA22_0<=18)||LA22_0==20) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1998:1: (lv_argument_3_0= ruleExpression )
                            {
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1998:1: (lv_argument_3_0= ruleExpression )
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1999:3: lv_argument_3_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction3627);
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

                    match(input,14,FOLLOW_14_in_ruleProviderConstruction3638); 

                            createLeafNode(grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2026:6: ( () ( (lv_expression_6_0= ruleExpression ) ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2026:6: ( () ( (lv_expression_6_0= ruleExpression ) ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2026:7: () ( (lv_expression_6_0= ruleExpression ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2026:7: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2027:5: 
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

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2037:2: ( (lv_expression_6_0= ruleExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2038:1: (lv_expression_6_0= ruleExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2038:1: (lv_expression_6_0= ruleExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2039:3: lv_expression_6_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction3676);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2069:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2070:2: (iv_ruleView= ruleView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2071:2: iv_ruleView= ruleView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView3713);
            iv_ruleView=ruleView();
            _fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView3723); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2078:1: ruleView returns [EObject current=null] : (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_SectionedView_0 = null;

        EObject this_CustomView_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2083:6: ( (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2084:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2084:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=43 && LA24_0<=44)) ) {
                alt24=1;
            }
            else if ( (LA24_0==45) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2084:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2085:5: this_SectionedView_0= ruleSectionedView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSectionedView_in_ruleView3770);
                    this_SectionedView_0=ruleSectionedView();
                    _fsp--;

                     
                            current = this_SectionedView_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2095:5: this_CustomView_1= ruleCustomView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomView_in_ruleView3797);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2111:1: entryRuleSectionedView returns [EObject current=null] : iv_ruleSectionedView= ruleSectionedView EOF ;
    public final EObject entryRuleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionedView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2112:2: (iv_ruleSectionedView= ruleSectionedView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2113:2: iv_ruleSectionedView= ruleSectionedView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionedViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionedView_in_entryRuleSectionedView3832);
            iv_ruleSectionedView=ruleSectionedView();
            _fsp--;

             current =iv_ruleSectionedView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionedView3842); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2120:1: ruleSectionedView returns [EObject current=null] : (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) ;
    public final EObject ruleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject this_TableView_0 = null;

        EObject this_DetailsView_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2125:6: ( (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2126:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2126:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            else if ( (LA25_0==44) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2126:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2127:5: this_TableView_0= ruleTableView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTableView_in_ruleSectionedView3889);
                    this_TableView_0=ruleTableView();
                    _fsp--;

                     
                            current = this_TableView_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2137:5: this_DetailsView_1= ruleDetailsView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDetailsView_in_ruleSectionedView3916);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2153:1: entryRuleTableView returns [EObject current=null] : iv_ruleTableView= ruleTableView EOF ;
    public final EObject entryRuleTableView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2154:2: (iv_ruleTableView= ruleTableView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2155:2: iv_ruleTableView= ruleTableView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTableViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView3951);
            iv_ruleTableView=ruleTableView();
            _fsp--;

             current =iv_ruleTableView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView3961); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2162:1: ruleTableView returns [EObject current=null] : ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' ) ;
    public final EObject ruleTableView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_sections_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2167:6: ( ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2168:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2168:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2168:3: 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* '}'
            {
            match(input,43,FOLLOW_43_in_ruleTableView3996); 

                    createLeafNode(grammarAccess.getTableViewAccess().getTableviewKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2172:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2173:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2173:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2174:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableView4013); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2196:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2196:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleTableView4029); 

                            createLeafNode(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2200:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2201:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2201:1: (lv_content_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2202:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleTableView4050);
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

                    match(input,14,FOLLOW_14_in_ruleTableView4060); 

                            createLeafNode(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleTableView4072); 

                    createLeafNode(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,27,FOLLOW_27_in_ruleTableView4082); 

                    createLeafNode(grammarAccess.getTableViewAccess().getTitleKeyword_4(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2236:1: ( (lv_title_7_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2237:1: (lv_title_7_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2237:1: (lv_title_7_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2238:3: lv_title_7_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTableView4103);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2260:2: ( (lv_sections_8_0= ruleViewSection ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==51) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2261:1: (lv_sections_8_0= ruleViewSection )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2261:1: (lv_sections_8_0= ruleViewSection )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2262:3: lv_sections_8_0= ruleViewSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleTableView4124);
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
            	    break loop27;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleTableView4135); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2296:1: entryRuleDetailsView returns [EObject current=null] : iv_ruleDetailsView= ruleDetailsView EOF ;
    public final EObject entryRuleDetailsView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetailsView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2297:2: (iv_ruleDetailsView= ruleDetailsView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2298:2: iv_ruleDetailsView= ruleDetailsView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDetailsViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleDetailsView_in_entryRuleDetailsView4171);
            iv_ruleDetailsView=ruleDetailsView();
            _fsp--;

             current =iv_ruleDetailsView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailsView4181); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2305:1: ruleDetailsView returns [EObject current=null] : ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' ) ;
    public final EObject ruleDetailsView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_header_8_0 = null;

        EObject lv_sections_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2310:6: ( ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2311:1: ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2311:1: ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2311:3: 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? '{' 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* '}'
            {
            match(input,44,FOLLOW_44_in_ruleDetailsView4216); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2315:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2316:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2316:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2317:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDetailsView4233); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2339:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2339:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleDetailsView4249); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2343:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2344:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2344:1: (lv_content_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2345:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleDetailsView4270);
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

                    match(input,14,FOLLOW_14_in_ruleDetailsView4280); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleDetailsView4292); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,27,FOLLOW_27_in_ruleDetailsView4302); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getTitleKeyword_4(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2379:1: ( (lv_title_7_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2380:1: (lv_title_7_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2380:1: (lv_title_7_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2381:3: lv_title_7_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleDetailsView4323);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2403:2: ( (lv_header_8_0= ruleViewHeader ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2404:1: (lv_header_8_0= ruleViewHeader )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2404:1: (lv_header_8_0= ruleViewHeader )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2405:3: lv_header_8_0= ruleViewHeader
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewHeader_in_ruleDetailsView4344);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2427:3: ( (lv_sections_9_0= ruleViewSection ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2428:1: (lv_sections_9_0= ruleViewSection )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2428:1: (lv_sections_9_0= ruleViewSection )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2429:3: lv_sections_9_0= ruleViewSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleDetailsView4366);
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
            	    break loop30;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleDetailsView4377); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2463:1: entryRuleCustomView returns [EObject current=null] : iv_ruleCustomView= ruleCustomView EOF ;
    public final EObject entryRuleCustomView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2464:2: (iv_ruleCustomView= ruleCustomView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2465:2: iv_ruleCustomView= ruleCustomView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView4413);
            iv_ruleCustomView=ruleCustomView();
            _fsp--;

             current =iv_ruleCustomView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView4423); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2472:1: ruleCustomView returns [EObject current=null] : ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_objclass_6_0=null;
        EObject lv_content_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2477:6: ( ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2478:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2478:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2478:3: 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) )
            {
            match(input,45,FOLLOW_45_in_ruleCustomView4458); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2482:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2483:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2483:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2484:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomView4475); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2506:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2506:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,13,FOLLOW_13_in_ruleCustomView4491); 

                            createLeafNode(grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2510:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2511:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2511:1: (lv_content_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2512:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleCustomView4512);
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

                    match(input,14,FOLLOW_14_in_ruleCustomView4522); 

                            createLeafNode(grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,46,FOLLOW_46_in_ruleCustomView4534); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getImplementedByKeyword_3(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2542:1: ( (lv_objclass_6_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2543:1: (lv_objclass_6_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2543:1: (lv_objclass_6_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2544:3: lv_objclass_6_0= RULE_STRING
            {
            lv_objclass_6_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomView4551); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2574:1: entryRuleViewHeader returns [EObject current=null] : iv_ruleViewHeader= ruleViewHeader EOF ;
    public final EObject entryRuleViewHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewHeader = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2575:2: (iv_ruleViewHeader= ruleViewHeader EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2576:2: iv_ruleViewHeader= ruleViewHeader EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewHeaderRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewHeader_in_entryRuleViewHeader4592);
            iv_ruleViewHeader=ruleViewHeader();
            _fsp--;

             current =iv_ruleViewHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewHeader4602); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2583:1: ruleViewHeader returns [EObject current=null] : ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' ) ;
    public final EObject ruleViewHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_title_4_0 = null;

        EObject lv_subtitle_6_0 = null;

        EObject lv_details_8_0 = null;

        EObject lv_image_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2588:6: ( ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2589:1: ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2589:1: ( () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2589:2: () 'header' '{' ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2589:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2590:5: 
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

            match(input,47,FOLLOW_47_in_ruleViewHeader4646); 

                    createLeafNode(grammarAccess.getViewHeaderAccess().getHeaderKeyword_1(), null); 
                
            match(input,23,FOLLOW_23_in_ruleViewHeader4656); 

                    createLeafNode(grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2608:1: ( 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2608:3: 'title=' ( (lv_title_4_0= ruleScalarExpression ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleViewHeader4667); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2612:1: ( (lv_title_4_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2613:1: (lv_title_4_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2613:1: (lv_title_4_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2614:3: lv_title_4_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4688);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2636:4: ( 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2636:6: 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleViewHeader4701); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2640:1: ( (lv_subtitle_6_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2641:1: (lv_subtitle_6_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2641:1: (lv_subtitle_6_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2642:3: lv_subtitle_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4722);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2664:4: ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2664:6: 'details=' ( (lv_details_8_0= ruleScalarExpression ) )
                    {
                    match(input,49,FOLLOW_49_in_ruleViewHeader4735); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2668:1: ( (lv_details_8_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2669:1: (lv_details_8_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2669:1: (lv_details_8_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2670:3: lv_details_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4756);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2692:4: ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2692:6: 'image=' ( (lv_image_10_0= ruleScalarExpression ) )
                    {
                    match(input,50,FOLLOW_50_in_ruleViewHeader4769); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getImageKeyword_6_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2696:1: ( (lv_image_10_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2697:1: (lv_image_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2697:1: (lv_image_10_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2698:3: lv_image_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4790);
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

            match(input,25,FOLLOW_25_in_ruleViewHeader4802); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2732:1: entryRuleViewSection returns [EObject current=null] : iv_ruleViewSection= ruleViewSection EOF ;
    public final EObject entryRuleViewSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewSection = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2733:2: (iv_ruleViewSection= ruleViewSection EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2734:2: iv_ruleViewSection= ruleViewSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewSection_in_entryRuleViewSection4838);
            iv_ruleViewSection=ruleViewSection();
            _fsp--;

             current =iv_ruleViewSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewSection4848); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2741:1: ruleViewSection returns [EObject current=null] : ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' ) ;
    public final EObject ruleViewSection() throws RecognitionException {
        EObject current = null;

        EObject lv_title_3_0 = null;

        EObject lv_cells_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2746:6: ( ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2747:1: ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2747:1: ( 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2747:3: 'section' '{' ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ '}'
            {
            match(input,51,FOLLOW_51_in_ruleViewSection4883); 

                    createLeafNode(grammarAccess.getViewSectionAccess().getSectionKeyword_0(), null); 
                
            match(input,23,FOLLOW_23_in_ruleViewSection4893); 

                    createLeafNode(grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2755:1: ( 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2755:3: 'title=' ( (lv_title_3_0= ruleScalarExpression ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleViewSection4904); 

                            createLeafNode(grammarAccess.getViewSectionAccess().getTitleKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2759:1: ( (lv_title_3_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2760:1: (lv_title_3_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2760:1: (lv_title_3_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2761:3: lv_title_3_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewSection4925);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2783:4: ( (lv_cells_4_0= ruleSectionCell ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==52) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2784:1: (lv_cells_4_0= ruleSectionCell )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2784:1: (lv_cells_4_0= ruleSectionCell )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2785:3: lv_cells_4_0= ruleSectionCell
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSectionCell_in_ruleViewSection4948);
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
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            match(input,25,FOLLOW_25_in_ruleViewSection4959); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2819:1: entryRuleSectionCell returns [EObject current=null] : iv_ruleSectionCell= ruleSectionCell EOF ;
    public final EObject entryRuleSectionCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionCell = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2820:2: (iv_ruleSectionCell= ruleSectionCell EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2821:2: iv_ruleSectionCell= ruleSectionCell EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionCellRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionCell_in_entryRuleSectionCell4995);
            iv_ruleSectionCell=ruleSectionCell();
            _fsp--;

             current =iv_ruleSectionCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionCell5005); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2828:1: ruleSectionCell returns [EObject current=null] : ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' ) ;
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
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2833:6: ( ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2834:1: ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2834:1: ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2834:3: 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )? '}'
            {
            match(input,52,FOLLOW_52_in_ruleSectionCell5040); 

                    createLeafNode(grammarAccess.getSectionCellAccess().getCellKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2838:1: ( (lv_type_1_0= ruleCellType ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2839:1: (lv_type_1_0= ruleCellType )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2839:1: (lv_type_1_0= ruleCellType )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2840:3: lv_type_1_0= ruleCellType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCellType_in_ruleSectionCell5061);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2862:2: ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2862:4: 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    {
                    match(input,53,FOLLOW_53_in_ruleSectionCell5072); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getForeachKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2866:1: ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2867:1: (lv_iterator_3_0= ruleCollectionIterator )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2867:1: (lv_iterator_3_0= ruleCollectionIterator )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2868:3: lv_iterator_3_0= ruleCollectionIterator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleSectionCell5093);
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

            match(input,23,FOLLOW_23_in_ruleSectionCell5105); 

                    createLeafNode(grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2894:1: ( 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2894:3: 'text=' ( (lv_text_6_0= ruleScalarExpression ) )
                    {
                    match(input,54,FOLLOW_54_in_ruleSectionCell5116); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getTextKeyword_4_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2898:1: ( (lv_text_6_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2899:1: (lv_text_6_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2899:1: (lv_text_6_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2900:3: lv_text_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5137);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2922:4: ( 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2922:6: 'details=' ( (lv_details_8_0= ruleScalarExpression ) )
                    {
                    match(input,49,FOLLOW_49_in_ruleSectionCell5150); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2926:1: ( (lv_details_8_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2927:1: (lv_details_8_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2927:1: (lv_details_8_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2928:3: lv_details_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5171);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2950:4: ( 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2950:6: 'image=' ( (lv_image_10_0= ruleScalarExpression ) )
                    {
                    match(input,50,FOLLOW_50_in_ruleSectionCell5184); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getImageKeyword_6_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2954:1: ( (lv_image_10_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2955:1: (lv_image_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2955:1: (lv_image_10_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2956:3: lv_image_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5205);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2978:4: ( 'action=' ( (lv_action_12_0= ruleViewAction ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2978:6: 'action=' ( (lv_action_12_0= ruleViewAction ) )
                    {
                    match(input,55,FOLLOW_55_in_ruleSectionCell5218); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getActionKeyword_7_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2982:1: ( (lv_action_12_0= ruleViewAction ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2983:1: (lv_action_12_0= ruleViewAction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2983:1: (lv_action_12_0= ruleViewAction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2984:3: lv_action_12_0= ruleViewAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_7_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewAction_in_ruleSectionCell5239);
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

            match(input,25,FOLLOW_25_in_ruleSectionCell5251); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3018:1: entryRuleCollectionIterator returns [EObject current=null] : iv_ruleCollectionIterator= ruleCollectionIterator EOF ;
    public final EObject entryRuleCollectionIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionIterator = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3019:2: (iv_ruleCollectionIterator= ruleCollectionIterator EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3020:2: iv_ruleCollectionIterator= ruleCollectionIterator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionIteratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator5287);
            iv_ruleCollectionIterator=ruleCollectionIterator();
            _fsp--;

             current =iv_ruleCollectionIterator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator5297); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3027:1: ruleCollectionIterator returns [EObject current=null] : ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCollectionIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_collection_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3032:6: ( ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3033:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3033:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3033:2: ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3033:2: ( (lv_collection_0_0= ruleCollectionExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3034:1: (lv_collection_0_0= ruleCollectionExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3034:1: (lv_collection_0_0= ruleCollectionExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3035:3: lv_collection_0_0= ruleCollectionExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator5343);
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

            match(input,56,FOLLOW_56_in_ruleCollectionIterator5353); 

                    createLeafNode(grammarAccess.getCollectionIteratorAccess().getAsKeyword_1(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3061:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3062:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3062:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3063:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionIterator5370); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3093:1: entryRuleViewAction returns [EObject current=null] : iv_ruleViewAction= ruleViewAction EOF ;
    public final EObject entryRuleViewAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewAction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3094:2: (iv_ruleViewAction= ruleViewAction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3095:2: iv_ruleViewAction= ruleViewAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction5411);
            iv_ruleViewAction=ruleViewAction();
            _fsp--;

             current =iv_ruleViewAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction5421); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3102:1: ruleViewAction returns [EObject current=null] : (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen ) ;
    public final EObject ruleViewAction() throws RecognitionException {
        EObject current = null;

        EObject this_ViewCall_0 = null;

        EObject this_ExternalOpen_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3107:6: ( (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3108:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3108:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==13) ) {
                    alt43=1;
                }
                else if ( (LA43_1==EOF||LA43_1==12||LA43_1==25) ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("3108:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )", 43, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==RULE_STRING||LA43_0==13||LA43_0==15||LA43_0==17) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3108:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3109:5: this_ViewCall_0= ruleViewCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleViewCall_in_ruleViewAction5468);
                    this_ViewCall_0=ruleViewCall();
                    _fsp--;

                     
                            current = this_ViewCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3119:5: this_ExternalOpen_1= ruleExternalOpen
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalOpen_in_ruleViewAction5495);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3135:1: entryRuleExternalOpen returns [EObject current=null] : iv_ruleExternalOpen= ruleExternalOpen EOF ;
    public final EObject entryRuleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalOpen = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3136:2: (iv_ruleExternalOpen= ruleExternalOpen EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3137:2: iv_ruleExternalOpen= ruleExternalOpen EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalOpenRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen5530);
            iv_ruleExternalOpen=ruleExternalOpen();
            _fsp--;

             current =iv_ruleExternalOpen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen5540); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3144:1: ruleExternalOpen returns [EObject current=null] : ( (lv_url_0_0= ruleScalarExpression ) ) ;
    public final EObject ruleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject lv_url_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3149:6: ( ( (lv_url_0_0= ruleScalarExpression ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3150:1: ( (lv_url_0_0= ruleScalarExpression ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3150:1: ( (lv_url_0_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3151:1: (lv_url_0_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3151:1: (lv_url_0_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3152:3: lv_url_0_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleExternalOpen5585);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3182:1: entryRuleViewCall returns [EObject current=null] : iv_ruleViewCall= ruleViewCall EOF ;
    public final EObject entryRuleViewCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3183:2: (iv_ruleViewCall= ruleViewCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3184:2: iv_ruleViewCall= ruleViewCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall5620);
            iv_ruleViewCall=ruleViewCall();
            _fsp--;

             current =iv_ruleViewCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall5630); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3191:1: ruleViewCall returns [EObject current=null] : ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' ) ;
    public final EObject ruleViewCall() throws RecognitionException {
        EObject current = null;

        EObject lv_provider_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3196:6: ( ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3197:1: ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3197:1: ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3197:2: ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? ')'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3197:2: ( ( RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3198:1: ( RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3198:1: ( RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3199:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getViewCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewCall5673); 

            		createLeafNode(grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0(), "view"); 
            	

            }


            }

            match(input,13,FOLLOW_13_in_ruleViewCall5683); 

                    createLeafNode(grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3215:1: ( (lv_provider_2_0= ruleProviderConstruction ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==13||LA44_0==15||(LA44_0>=17 && LA44_0<=18)||LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3216:1: (lv_provider_2_0= ruleProviderConstruction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3216:1: (lv_provider_2_0= ruleProviderConstruction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3217:3: lv_provider_2_0= ruleProviderConstruction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProviderConstruction_in_ruleViewCall5704);
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

            match(input,14,FOLLOW_14_in_ruleViewCall5715); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3251:1: ruleCellType returns [Enumerator current=null] : ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) ) ;
    public final Enumerator ruleCellType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3255:6: ( ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3256:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3256:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt45=1;
                }
                break;
            case 58:
                {
                alt45=2;
                }
                break;
            case 59:
                {
                alt45=3;
                }
                break;
            case 60:
                {
                alt45=4;
                }
                break;
            case 61:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3256:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) )", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3256:2: ( 'Default' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3256:2: ( 'Default' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3256:4: 'Default'
                    {
                    match(input,57,FOLLOW_57_in_ruleCellType5763); 

                            current = grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3262:6: ( 'DefaultWithDisclosure' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3262:6: ( 'DefaultWithDisclosure' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3262:8: 'DefaultWithDisclosure'
                    {
                    match(input,58,FOLLOW_58_in_ruleCellType5778); 

                            current = grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3268:6: ( 'Value2' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3268:6: ( 'Value2' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3268:8: 'Value2'
                    {
                    match(input,59,FOLLOW_59_in_ruleCellType5793); 

                            current = grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3274:6: ( 'Double' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3274:6: ( 'Double' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3274:8: 'Double'
                    {
                    match(input,60,FOLLOW_60_in_ruleCellType5808); 

                            current = grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3280:6: ( 'Subtitle' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3280:6: ( 'Subtitle' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3280:8: 'Subtitle'
                    {
                    match(input,61,FOLLOW_61_in_ruleCellType5823); 

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
    public static final BitSet FOLLOW_ruleApplication_in_ruleModel131 = new BitSet(new long[]{0x00003812C0000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_ruleModel152 = new BitSet(new long[]{0x00003812C0000002L});
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
    public static final BitSet FOLLOW_21_in_ruleTabBarApplication2150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleTabBarApplication2166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTabBarApplication2184 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTabBarApplication2199 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_24_in_ruleTabBarApplication2210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTabBarApplication2227 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_ruleTabBarApplication2255 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleTabBarApplication2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton2302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabbarButton2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTabbarButton2347 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTabbarButton2357 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTabbarButton2367 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTabbarButton2388 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTabbarButton2398 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTabbarButton2419 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTabbarButton2429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleTabbarButton2450 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTabbarButton2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleConstant2550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant2567 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleConstant2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType2748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSimpleType2793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType2810 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSimpleType2825 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleType2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEntity2928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2945 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_34_in_ruleEntity2961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2979 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEntity2991 = new BitSet(new long[]{0x0000000802000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity3012 = new BitSet(new long[]{0x0000000802000010L});
    public static final BitSet FOLLOW_25_in_ruleEntity3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleProperty3112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleProperty3147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider3205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleContentProvider3250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider3267 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_13_in_ruleContentProvider3283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleContentProvider3304 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContentProvider3314 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_ruleContentProvider3327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38_in_ruleContentProvider3351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider3383 = new BitSet(new long[]{0x0000008000000800L});
    public static final BitSet FOLLOW_11_in_ruleContentProvider3401 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleContentProvider3425 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleContentProvider3435 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleContentProvider3445 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider3466 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleContentProvider3476 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction3533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderConstruction3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProviderConstruction3596 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProviderConstruction3606 = new BitSet(new long[]{0x000000000016E030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction3627 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProviderConstruction3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView3713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_ruleView3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_ruleView3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_entryRuleSectionedView3832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionedView3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_ruleSectionedView3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_ruleSectionedView3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView3951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTableView3996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableView4013 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_ruleTableView4029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTableView4050 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTableView4060 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTableView4072 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTableView4082 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTableView4103 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleTableView4124 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTableView4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_entryRuleDetailsView4171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailsView4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDetailsView4216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDetailsView4233 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_ruleDetailsView4249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDetailsView4270 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDetailsView4280 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDetailsView4292 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDetailsView4302 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleDetailsView4323 = new BitSet(new long[]{0x0008800002000000L});
    public static final BitSet FOLLOW_ruleViewHeader_in_ruleDetailsView4344 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleDetailsView4366 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDetailsView4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView4413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCustomView4458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomView4475 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_13_in_ruleCustomView4491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCustomView4512 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomView4522 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCustomView4534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomView4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_entryRuleViewHeader4592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewHeader4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleViewHeader4646 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleViewHeader4656 = new BitSet(new long[]{0x000700000A000000L});
    public static final BitSet FOLLOW_27_in_ruleViewHeader4667 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4688 = new BitSet(new long[]{0x0007000002000000L});
    public static final BitSet FOLLOW_48_in_ruleViewHeader4701 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4722 = new BitSet(new long[]{0x0006000002000000L});
    public static final BitSet FOLLOW_49_in_ruleViewHeader4735 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4756 = new BitSet(new long[]{0x0004000002000000L});
    public static final BitSet FOLLOW_50_in_ruleViewHeader4769 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4790 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleViewHeader4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_entryRuleViewSection4838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewSection4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleViewSection4883 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleViewSection4893 = new BitSet(new long[]{0x0010000008000000L});
    public static final BitSet FOLLOW_27_in_ruleViewSection4904 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewSection4925 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleSectionCell_in_ruleViewSection4948 = new BitSet(new long[]{0x0010000002000000L});
    public static final BitSet FOLLOW_25_in_ruleViewSection4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_entryRuleSectionCell4995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionCell5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSectionCell5040 = new BitSet(new long[]{0x3E00000000000000L});
    public static final BitSet FOLLOW_ruleCellType_in_ruleSectionCell5061 = new BitSet(new long[]{0x0020000000800000L});
    public static final BitSet FOLLOW_53_in_ruleSectionCell5072 = new BitSet(new long[]{0x0000000000140010L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleSectionCell5093 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSectionCell5105 = new BitSet(new long[]{0x00C6000002000000L});
    public static final BitSet FOLLOW_54_in_ruleSectionCell5116 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5137 = new BitSet(new long[]{0x0086000002000000L});
    public static final BitSet FOLLOW_49_in_ruleSectionCell5150 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5171 = new BitSet(new long[]{0x0084000002000000L});
    public static final BitSet FOLLOW_50_in_ruleSectionCell5184 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5205 = new BitSet(new long[]{0x0080000002000000L});
    public static final BitSet FOLLOW_55_in_ruleSectionCell5218 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleViewAction_in_ruleSectionCell5239 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSectionCell5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator5287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator5343 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCollectionIterator5353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionIterator5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction5411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleViewAction5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_ruleViewAction5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen5530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleExternalOpen5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall5620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewCall5673 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewCall5683 = new BitSet(new long[]{0x000000000016E030L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_ruleViewCall5704 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleViewCall5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCellType5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCellType5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCellType5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCellType5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCellType5823 = new BitSet(new long[]{0x0000000000000002L});

}