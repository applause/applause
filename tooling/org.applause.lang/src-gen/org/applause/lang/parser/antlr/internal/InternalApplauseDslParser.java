package org.applause.lang.parser.antlr.internal; 

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
import org.applause.lang.services.ApplauseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'platform'", "'resource'", "'section'", "'abstract'", "'delete'", "'add'", "'edit'", "'display'", "'datatype'", "'entity'", "'extends'", "'{'", "'}'", "'[]'", "'typemapping'", "'->'", "'datasource'", "'baseUrl'", "':'", "'('", "','", "')'", "'http://'", "'/'", "'?'", "'&'", "'='", "'.'", "'screen'", "'sections'", "'actions'", "'controller'", "'items'", "'cell'", "'foreach'", "'as'", "'action'", "'icon'", "'gesture'", "'order'", "'listitemcell'", "'uicomponent'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'DefaultList'", "'DefaultDetails'", "'tap'", "'swipe'", "'longpress'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g"; }



     	private ApplauseDslGrammarAccess grammarAccess;
     	
        public InternalApplauseDslParser(TokenStream input, ApplauseDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ApplauseDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleNamedElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:80:28: ( ( (lv_elements_0_0= ruleNamedElement ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:81:1: ( (lv_elements_0_0= ruleNamedElement ) )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:81:1: ( (lv_elements_0_0= ruleNamedElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==15||(LA1_0>=20 && LA1_0<=21)||LA1_0==28||LA1_0==40||(LA1_0>=52 && LA1_0<=53)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:82:1: (lv_elements_0_0= ruleNamedElement )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:82:1: (lv_elements_0_0= ruleNamedElement )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:83:3: lv_elements_0_0= ruleNamedElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsNamedElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNamedElement_in_ruleModel130);
            	    lv_elements_0_0=ruleNamedElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"NamedElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleNamedElement"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:107:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:108:2: (iv_ruleNamedElement= ruleNamedElement EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:109:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
             newCompositeNode(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_ruleNamedElement_in_entryRuleNamedElement166);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;

             current =iv_ruleNamedElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedElement176); 

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
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:116:1: ruleNamedElement returns [EObject current=null] : (this_Type_0= ruleType | this_Platform_1= rulePlatform | this_DataSource_2= ruleDataSource | this_Screen_3= ruleScreen | this_UIComponentDeclaration_4= ruleUIComponentDeclaration | this_ListItemCellDeclaration_5= ruleListItemCellDeclaration ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_Platform_1 = null;

        EObject this_DataSource_2 = null;

        EObject this_Screen_3 = null;

        EObject this_UIComponentDeclaration_4 = null;

        EObject this_ListItemCellDeclaration_5 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:119:28: ( (this_Type_0= ruleType | this_Platform_1= rulePlatform | this_DataSource_2= ruleDataSource | this_Screen_3= ruleScreen | this_UIComponentDeclaration_4= ruleUIComponentDeclaration | this_ListItemCellDeclaration_5= ruleListItemCellDeclaration ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:120:1: (this_Type_0= ruleType | this_Platform_1= rulePlatform | this_DataSource_2= ruleDataSource | this_Screen_3= ruleScreen | this_UIComponentDeclaration_4= ruleUIComponentDeclaration | this_ListItemCellDeclaration_5= ruleListItemCellDeclaration )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:120:1: (this_Type_0= ruleType | this_Platform_1= rulePlatform | this_DataSource_2= ruleDataSource | this_Screen_3= ruleScreen | this_UIComponentDeclaration_4= ruleUIComponentDeclaration | this_ListItemCellDeclaration_5= ruleListItemCellDeclaration )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 15:
            case 20:
            case 21:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 40:
                {
                alt2=4;
                }
                break;
            case 53:
                {
                alt2=5;
                }
                break;
            case 52:
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:121:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleNamedElement223);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:131:5: this_Platform_1= rulePlatform
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getPlatformParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePlatform_in_ruleNamedElement250);
                    this_Platform_1=rulePlatform();

                    state._fsp--;

                     
                            current = this_Platform_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:141:5: this_DataSource_2= ruleDataSource
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getDataSourceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDataSource_in_ruleNamedElement277);
                    this_DataSource_2=ruleDataSource();

                    state._fsp--;

                     
                            current = this_DataSource_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:151:5: this_Screen_3= ruleScreen
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getScreenParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleScreen_in_ruleNamedElement304);
                    this_Screen_3=ruleScreen();

                    state._fsp--;

                     
                            current = this_Screen_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:161:5: this_UIComponentDeclaration_4= ruleUIComponentDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getUIComponentDeclarationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUIComponentDeclaration_in_ruleNamedElement331);
                    this_UIComponentDeclaration_4=ruleUIComponentDeclaration();

                    state._fsp--;

                     
                            current = this_UIComponentDeclaration_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:171:5: this_ListItemCellDeclaration_5= ruleListItemCellDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getListItemCellDeclarationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleListItemCellDeclaration_in_ruleNamedElement358);
                    this_ListItemCellDeclaration_5=ruleListItemCellDeclaration();

                    state._fsp--;

                     
                            current = this_ListItemCellDeclaration_5; 
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
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleType"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:187:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:188:2: (iv_ruleType= ruleType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:189:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType393);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType403); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:196:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:199:28: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:200:1: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:200:1: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==15||LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:201:5: this_DataType_0= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType450);
                    this_DataType_0=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:211:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType477);
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


    // $ANTLR start "entryRuleKeywordedID"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:227:1: entryRuleKeywordedID returns [String current=null] : iv_ruleKeywordedID= ruleKeywordedID EOF ;
    public final String entryRuleKeywordedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeywordedID = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:228:2: (iv_ruleKeywordedID= ruleKeywordedID EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:229:2: iv_ruleKeywordedID= ruleKeywordedID EOF
            {
             newCompositeNode(grammarAccess.getKeywordedIDRule()); 
            pushFollow(FOLLOW_ruleKeywordedID_in_entryRuleKeywordedID513);
            iv_ruleKeywordedID=ruleKeywordedID();

            state._fsp--;

             current =iv_ruleKeywordedID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeywordedID524); 

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
    // $ANTLR end "entryRuleKeywordedID"


    // $ANTLR start "ruleKeywordedID"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:236:1: ruleKeywordedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'title' | kw= 'platform' | kw= 'resource' | kw= 'section' | kw= 'abstract' | kw= 'delete' | kw= 'add' | kw= 'edit' | kw= 'display' ) ;
    public final AntlrDatatypeRuleToken ruleKeywordedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:239:28: ( (this_ID_0= RULE_ID | kw= 'title' | kw= 'platform' | kw= 'resource' | kw= 'section' | kw= 'abstract' | kw= 'delete' | kw= 'add' | kw= 'edit' | kw= 'display' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:240:1: (this_ID_0= RULE_ID | kw= 'title' | kw= 'platform' | kw= 'resource' | kw= 'section' | kw= 'abstract' | kw= 'delete' | kw= 'add' | kw= 'edit' | kw= 'display' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:240:1: (this_ID_0= RULE_ID | kw= 'title' | kw= 'platform' | kw= 'resource' | kw= 'section' | kw= 'abstract' | kw= 'delete' | kw= 'add' | kw= 'edit' | kw= 'display' )
            int alt4=10;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 11:
                {
                alt4=2;
                }
                break;
            case 12:
                {
                alt4=3;
                }
                break;
            case 13:
                {
                alt4=4;
                }
                break;
            case 14:
                {
                alt4=5;
                }
                break;
            case 15:
                {
                alt4=6;
                }
                break;
            case 16:
                {
                alt4=7;
                }
                break;
            case 17:
                {
                alt4=8;
                }
                break;
            case 18:
                {
                alt4=9;
                }
                break;
            case 19:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:240:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeywordedID564); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getKeywordedIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:249:2: kw= 'title'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleKeywordedID588); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getTitleKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:256:2: kw= 'platform'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleKeywordedID607); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getPlatformKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:263:2: kw= 'resource'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleKeywordedID626); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getResourceKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:270:2: kw= 'section'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleKeywordedID645); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getSectionKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:277:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleKeywordedID664); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getAbstractKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:284:2: kw= 'delete'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleKeywordedID683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getDeleteKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:291:2: kw= 'add'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleKeywordedID702); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getAddKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:298:2: kw= 'edit'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleKeywordedID721); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getEditKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:305:2: kw= 'display'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleKeywordedID740); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getDisplayKeyword_9()); 
                        

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
    // $ANTLR end "ruleKeywordedID"


    // $ANTLR start "entryRuleDataType"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:318:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:319:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:320:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType780);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType790); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:327:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= ruleKeywordedID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:330:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= ruleKeywordedID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:331:1: (otherlv_0= 'datatype' ( (lv_name_1_0= ruleKeywordedID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:331:1: (otherlv_0= 'datatype' ( (lv_name_1_0= ruleKeywordedID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:331:3: otherlv_0= 'datatype' ( (lv_name_1_0= ruleKeywordedID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDataType827); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:335:1: ( (lv_name_1_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:336:1: (lv_name_1_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:336:1: (lv_name_1_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:337:3: lv_name_1_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeAccess().getNameKeywordedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleDataType848);
            lv_name_1_0=ruleKeywordedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"KeywordedID");
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:361:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:362:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:363:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity884);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity894); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:370:1: ruleEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:373:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:374:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:374:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:374:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:374:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:375:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:375:1: (lv_abstract_0_0= 'abstract' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:376:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,15,FOLLOW_15_in_ruleEntity937); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleEntity963); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:393:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:394:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:394:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:395:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity980); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:411:2: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:411:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleEntity998); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:415:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:416:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:416:1: (otherlv_4= RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:417:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1018); 

                    		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleEntity1032); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:432:1: ( (lv_attributes_6_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:433:1: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:433:1: (lv_attributes_6_0= ruleAttribute )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:434:3: lv_attributes_6_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity1053);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_6_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleEntity1066); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleAttribute"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:462:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:463:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:464:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1102);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1112); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:471:1: ruleAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= ruleKeywordedID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_many_1_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:474:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= ruleKeywordedID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:475:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= ruleKeywordedID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:475:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= ruleKeywordedID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:475:2: ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= ruleKeywordedID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:475:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:476:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:476:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:477:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1157); 

            		newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:488:2: ( (lv_many_1_0= '[]' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:489:1: (lv_many_1_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:489:1: (lv_many_1_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:490:3: lv_many_1_0= '[]'
                    {
                    lv_many_1_0=(Token)match(input,25,FOLLOW_25_in_ruleAttribute1175); 

                            newLeafNode(lv_many_1_0, grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:503:3: ( (lv_name_2_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:504:1: (lv_name_2_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:504:1: (lv_name_2_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:505:3: lv_name_2_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameKeywordedIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleAttribute1210);
            lv_name_2_0=ruleKeywordedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"KeywordedID");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRulePlatform"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:529:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:530:2: (iv_rulePlatform= rulePlatform EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:531:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform1246);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform1256); 

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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:538:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mappings_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:541:28: ( (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:542:1: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:542:1: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:542:3: otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePlatform1293); 

                	newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:546:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:547:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:547:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:548:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlatform1310); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlatformRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePlatform1327); 

                	newLeafNode(otherlv_2, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:568:1: ( (lv_mappings_3_0= rulePlatformMapping ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:569:1: (lv_mappings_3_0= rulePlatformMapping )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:569:1: (lv_mappings_3_0= rulePlatformMapping )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:570:3: lv_mappings_3_0= rulePlatformMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlatformAccess().getMappingsPlatformMappingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlatformMapping_in_rulePlatform1348);
            	    lv_mappings_3_0=rulePlatformMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlatformRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mappings",
            	            		lv_mappings_3_0, 
            	            		"PlatformMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePlatform1361); 

                	newLeafNode(otherlv_4, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRulePlatformMapping"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:598:1: entryRulePlatformMapping returns [EObject current=null] : iv_rulePlatformMapping= rulePlatformMapping EOF ;
    public final EObject entryRulePlatformMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformMapping = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:599:2: (iv_rulePlatformMapping= rulePlatformMapping EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:600:2: iv_rulePlatformMapping= rulePlatformMapping EOF
            {
             newCompositeNode(grammarAccess.getPlatformMappingRule()); 
            pushFollow(FOLLOW_rulePlatformMapping_in_entryRulePlatformMapping1397);
            iv_rulePlatformMapping=rulePlatformMapping();

            state._fsp--;

             current =iv_rulePlatformMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatformMapping1407); 

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
    // $ANTLR end "entryRulePlatformMapping"


    // $ANTLR start "rulePlatformMapping"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:607:1: rulePlatformMapping returns [EObject current=null] : this_TypeMapping_0= ruleTypeMapping ;
    public final EObject rulePlatformMapping() throws RecognitionException {
        EObject current = null;

        EObject this_TypeMapping_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:610:28: (this_TypeMapping_0= ruleTypeMapping )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:612:5: this_TypeMapping_0= ruleTypeMapping
            {
             
                    newCompositeNode(grammarAccess.getPlatformMappingAccess().getTypeMappingParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTypeMapping_in_rulePlatformMapping1453);
            this_TypeMapping_0=ruleTypeMapping();

            state._fsp--;

             
                    current = this_TypeMapping_0; 
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
    // $ANTLR end "rulePlatformMapping"


    // $ANTLR start "entryRuleTypeMapping"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:628:1: entryRuleTypeMapping returns [EObject current=null] : iv_ruleTypeMapping= ruleTypeMapping EOF ;
    public final EObject entryRuleTypeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMapping = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:629:2: (iv_ruleTypeMapping= ruleTypeMapping EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:630:2: iv_ruleTypeMapping= ruleTypeMapping EOF
            {
             newCompositeNode(grammarAccess.getTypeMappingRule()); 
            pushFollow(FOLLOW_ruleTypeMapping_in_entryRuleTypeMapping1487);
            iv_ruleTypeMapping=ruleTypeMapping();

            state._fsp--;

             current =iv_ruleTypeMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMapping1497); 

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
    // $ANTLR end "entryRuleTypeMapping"


    // $ANTLR start "ruleTypeMapping"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:637:1: ruleTypeMapping returns [EObject current=null] : (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_simpleName_3_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:640:28: ( (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:641:1: (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:641:1: (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:641:3: otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTypeMapping1534); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeMappingAccess().getTypemappingKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:645:1: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:646:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:646:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:647:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeMappingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeMapping1554); 

            		newLeafNode(otherlv_1, grammarAccess.getTypeMappingAccess().getTypeDataTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleTypeMapping1566); 

                	newLeafNode(otherlv_2, grammarAccess.getTypeMappingAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:662:1: ( (lv_simpleName_3_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:663:1: (lv_simpleName_3_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:663:1: (lv_simpleName_3_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:664:3: lv_simpleName_3_0= RULE_ID
            {
            lv_simpleName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeMapping1583); 

            			newLeafNode(lv_simpleName_3_0, grammarAccess.getTypeMappingAccess().getSimpleNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"simpleName",
                    		lv_simpleName_3_0, 
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
    // $ANTLR end "ruleTypeMapping"


    // $ANTLR start "entryRuleDataSource"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:688:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:689:2: (iv_ruleDataSource= ruleDataSource EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:690:2: iv_ruleDataSource= ruleDataSource EOF
            {
             newCompositeNode(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_ruleDataSource_in_entryRuleDataSource1624);
            iv_ruleDataSource=ruleDataSource();

            state._fsp--;

             current =iv_ruleDataSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSource1634); 

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
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:697:1: ruleDataSource returns [EObject current=null] : (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_baseUrl_5_0 = null;

        EObject lv_methods_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:700:28: ( (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:701:1: (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:701:1: (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:701:3: otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleDataSource1671); 

                	newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getDatasourceKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:705:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:706:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:706:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:707:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSource1688); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataSourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleDataSource1705); 

                	newLeafNode(otherlv_2, grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleDataSource1717); 

                	newLeafNode(otherlv_3, grammarAccess.getDataSourceAccess().getBaseUrlKeyword_3());
                
            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleDataSource1729); 

                	newLeafNode(otherlv_4, grammarAccess.getDataSourceAccess().getColonKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:735:1: ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:736:1: (lv_baseUrl_5_0= ruleAbsoluteRESTURL )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:736:1: (lv_baseUrl_5_0= ruleAbsoluteRESTURL )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:737:3: lv_baseUrl_5_0= ruleAbsoluteRESTURL
            {
             
            	        newCompositeNode(grammarAccess.getDataSourceAccess().getBaseUrlAbsoluteRESTURLParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_ruleDataSource1750);
            lv_baseUrl_5_0=ruleAbsoluteRESTURL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSourceRule());
            	        }
                   		set(
                   			current, 
                   			"baseUrl",
                    		lv_baseUrl_5_0, 
                    		"AbsoluteRESTURL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleDataSource1762); 

                	newLeafNode(otherlv_6, grammarAccess.getDataSourceAccess().getResourceKeyword_6());
                
            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleDataSource1774); 

                	newLeafNode(otherlv_7, grammarAccess.getDataSourceAccess().getColonKeyword_7());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:761:1: ( (otherlv_8= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:762:1: (otherlv_8= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:762:1: (otherlv_8= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:763:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSource1794); 

            		newLeafNode(otherlv_8, grammarAccess.getDataSourceAccess().getResourceTypeEntityCrossReference_8_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:774:2: ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=11 && LA10_0<=19)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:775:1: (lv_methods_9_0= ruleDataSourceAccessMethod )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:775:1: (lv_methods_9_0= ruleDataSourceAccessMethod )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:776:3: lv_methods_9_0= ruleDataSourceAccessMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSourceAccess().getMethodsDataSourceAccessMethodParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataSourceAccessMethod_in_ruleDataSource1815);
            	    lv_methods_9_0=ruleDataSourceAccessMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSourceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_9_0, 
            	            		"DataSourceAccessMethod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleDataSource1828); 

                	newLeafNode(otherlv_10, grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleDataSourceAccessMethod"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:804:1: entryRuleDataSourceAccessMethod returns [EObject current=null] : iv_ruleDataSourceAccessMethod= ruleDataSourceAccessMethod EOF ;
    public final EObject entryRuleDataSourceAccessMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSourceAccessMethod = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:805:2: (iv_ruleDataSourceAccessMethod= ruleDataSourceAccessMethod EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:806:2: iv_ruleDataSourceAccessMethod= ruleDataSourceAccessMethod EOF
            {
             newCompositeNode(grammarAccess.getDataSourceAccessMethodRule()); 
            pushFollow(FOLLOW_ruleDataSourceAccessMethod_in_entryRuleDataSourceAccessMethod1864);
            iv_ruleDataSourceAccessMethod=ruleDataSourceAccessMethod();

            state._fsp--;

             current =iv_ruleDataSourceAccessMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceAccessMethod1874); 

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
    // $ANTLR end "entryRuleDataSourceAccessMethod"


    // $ANTLR start "ruleDataSourceAccessMethod"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:813:1: ruleDataSourceAccessMethod returns [EObject current=null] : ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) ) ;
    public final EObject ruleDataSourceAccessMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_returnsMany_6_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_declaredParameters_2_0 = null;

        EObject lv_declaredParameters_4_0 = null;

        EObject lv_restSpecification_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:816:28: ( ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:817:1: ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:817:1: ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:817:2: ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:817:2: ( (lv_name_0_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:818:1: (lv_name_0_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:818:1: (lv_name_0_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:819:3: lv_name_0_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getNameKeywordedIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleDataSourceAccessMethod1920);
            lv_name_0_0=ruleKeywordedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSourceAccessMethodRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"KeywordedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleDataSourceAccessMethod1932); 

                	newLeafNode(otherlv_1, grammarAccess.getDataSourceAccessMethodAccess().getLeftParenthesisKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:839:1: ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:839:2: ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )*
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:839:2: ( (lv_declaredParameters_2_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:840:1: (lv_declaredParameters_2_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:840:1: (lv_declaredParameters_2_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:841:3: lv_declaredParameters_2_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1954);
                    lv_declaredParameters_2_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSourceAccessMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"declaredParameters",
                            		lv_declaredParameters_2_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:857:2: (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==32) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:857:4: otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleDataSourceAccessMethod1967); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getDataSourceAccessMethodAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:861:1: ( (lv_declaredParameters_4_0= ruleParameter ) )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:862:1: (lv_declaredParameters_4_0= ruleParameter )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:862:1: (lv_declaredParameters_4_0= ruleParameter )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:863:3: lv_declaredParameters_4_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1988);
                    	    lv_declaredParameters_4_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataSourceAccessMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaredParameters",
                    	            		lv_declaredParameters_4_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleDataSourceAccessMethod2004); 

                	newLeafNode(otherlv_5, grammarAccess.getDataSourceAccessMethodAccess().getRightParenthesisKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:883:1: ( (lv_returnsMany_6_0= '[]' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:884:1: (lv_returnsMany_6_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:884:1: (lv_returnsMany_6_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:885:3: lv_returnsMany_6_0= '[]'
                    {
                    lv_returnsMany_6_0=(Token)match(input,25,FOLLOW_25_in_ruleDataSourceAccessMethod2022); 

                            newLeafNode(lv_returnsMany_6_0, grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyLeftSquareBracketRightSquareBracketKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSourceAccessMethodRule());
                    	        }
                           		setWithLastConsumed(current, "returnsMany", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:898:3: ( (lv_restSpecification_7_0= ruleRESTSpecification ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:899:1: (lv_restSpecification_7_0= ruleRESTSpecification )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:899:1: (lv_restSpecification_7_0= ruleRESTSpecification )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:900:3: lv_restSpecification_7_0= ruleRESTSpecification
            {
             
            	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getRestSpecificationRESTSpecificationParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRESTSpecification_in_ruleDataSourceAccessMethod2057);
            lv_restSpecification_7_0=ruleRESTSpecification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSourceAccessMethodRule());
            	        }
                   		set(
                   			current, 
                   			"restSpecification",
                    		lv_restSpecification_7_0, 
                    		"RESTSpecification");
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
    // $ANTLR end "ruleDataSourceAccessMethod"


    // $ANTLR start "entryRuleRESTSpecification"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:924:1: entryRuleRESTSpecification returns [EObject current=null] : iv_ruleRESTSpecification= ruleRESTSpecification EOF ;
    public final EObject entryRuleRESTSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRESTSpecification = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:925:2: (iv_ruleRESTSpecification= ruleRESTSpecification EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:926:2: iv_ruleRESTSpecification= ruleRESTSpecification EOF
            {
             newCompositeNode(grammarAccess.getRESTSpecificationRule()); 
            pushFollow(FOLLOW_ruleRESTSpecification_in_entryRuleRESTSpecification2093);
            iv_ruleRESTSpecification=ruleRESTSpecification();

            state._fsp--;

             current =iv_ruleRESTSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTSpecification2103); 

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
    // $ANTLR end "entryRuleRESTSpecification"


    // $ANTLR start "ruleRESTSpecification"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:933:1: ruleRESTSpecification returns [EObject current=null] : ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleRESTSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_verb_0_0 = null;

        EObject lv_path_1_0 = null;

        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:936:28: ( ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:937:1: ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:937:1: ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:937:2: ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:937:2: ( (lv_verb_0_0= ruleRESTVerb ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:938:1: (lv_verb_0_0= ruleRESTVerb )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:938:1: (lv_verb_0_0= ruleRESTVerb )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:939:3: lv_verb_0_0= ruleRESTVerb
            {
             
            	        newCompositeNode(grammarAccess.getRESTSpecificationAccess().getVerbRESTVerbEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRESTVerb_in_ruleRESTSpecification2149);
            lv_verb_0_0=ruleRESTVerb();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRESTSpecificationRule());
            	        }
                   		set(
                   			current, 
                   			"verb",
                    		lv_verb_0_0, 
                    		"RESTVerb");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:955:2: ( (lv_path_1_0= ruleRESTURL ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:956:1: (lv_path_1_0= ruleRESTURL )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:956:1: (lv_path_1_0= ruleRESTURL )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:957:3: lv_path_1_0= ruleRESTURL
            {
             
            	        newCompositeNode(grammarAccess.getRESTSpecificationAccess().getPathRESTURLParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRESTURL_in_ruleRESTSpecification2170);
            lv_path_1_0=ruleRESTURL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRESTSpecificationRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_1_0, 
                    		"RESTURL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:973:2: (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:973:4: otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleRESTSpecification2183); 

                        	newLeafNode(otherlv_2, grammarAccess.getRESTSpecificationAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:977:1: ( (lv_body_3_0= ruleDataSourceBodySpecification ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:978:1: (lv_body_3_0= ruleDataSourceBodySpecification )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:978:1: (lv_body_3_0= ruleDataSourceBodySpecification )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:979:3: lv_body_3_0= ruleDataSourceBodySpecification
                    {
                     
                    	        newCompositeNode(grammarAccess.getRESTSpecificationAccess().getBodyDataSourceBodySpecificationParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataSourceBodySpecification_in_ruleRESTSpecification2204);
                    lv_body_3_0=ruleDataSourceBodySpecification();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRESTSpecificationRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_3_0, 
                            		"DataSourceBodySpecification");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleRESTSpecification2216); 

                        	newLeafNode(otherlv_4, grammarAccess.getRESTSpecificationAccess().getRightCurlyBracketKeyword_2_2());
                        

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
    // $ANTLR end "ruleRESTSpecification"


    // $ANTLR start "entryRuleDataSourceBodySpecification"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1007:1: entryRuleDataSourceBodySpecification returns [EObject current=null] : iv_ruleDataSourceBodySpecification= ruleDataSourceBodySpecification EOF ;
    public final EObject entryRuleDataSourceBodySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSourceBodySpecification = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1008:2: (iv_ruleDataSourceBodySpecification= ruleDataSourceBodySpecification EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1009:2: iv_ruleDataSourceBodySpecification= ruleDataSourceBodySpecification EOF
            {
             newCompositeNode(grammarAccess.getDataSourceBodySpecificationRule()); 
            pushFollow(FOLLOW_ruleDataSourceBodySpecification_in_entryRuleDataSourceBodySpecification2254);
            iv_ruleDataSourceBodySpecification=ruleDataSourceBodySpecification();

            state._fsp--;

             current =iv_ruleDataSourceBodySpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceBodySpecification2264); 

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
    // $ANTLR end "entryRuleDataSourceBodySpecification"


    // $ANTLR start "ruleDataSourceBodySpecification"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1016:1: ruleDataSourceBodySpecification returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDataSourceBodySpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1019:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1020:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1020:1: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1021:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1021:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1022:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceBodySpecificationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSourceBodySpecification2308); 

            		newLeafNode(otherlv_0, grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsParameterCrossReference_0()); 
            	

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
    // $ANTLR end "ruleDataSourceBodySpecification"


    // $ANTLR start "entryRuleParameter"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1041:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1042:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1043:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2343);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2353); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1050:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= ruleKeywordedID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1053:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= ruleKeywordedID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1054:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= ruleKeywordedID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1054:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= ruleKeywordedID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1054:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= ruleKeywordedID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1054:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1055:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1055:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1056:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2398); 

            		newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1067:2: ( (lv_name_1_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1068:1: (lv_name_1_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1068:1: (lv_name_1_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1069:3: lv_name_1_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameKeywordedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleParameter2419);
            lv_name_1_0=ruleKeywordedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"KeywordedID");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRESTURL"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1093:1: entryRuleRESTURL returns [EObject current=null] : iv_ruleRESTURL= ruleRESTURL EOF ;
    public final EObject entryRuleRESTURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRESTURL = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1094:2: (iv_ruleRESTURL= ruleRESTURL EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1095:2: iv_ruleRESTURL= ruleRESTURL EOF
            {
             newCompositeNode(grammarAccess.getRESTURLRule()); 
            pushFollow(FOLLOW_ruleRESTURL_in_entryRuleRESTURL2455);
            iv_ruleRESTURL=ruleRESTURL();

            state._fsp--;

             current =iv_ruleRESTURL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTURL2465); 

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
    // $ANTLR end "entryRuleRESTURL"


    // $ANTLR start "ruleRESTURL"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1102:1: ruleRESTURL returns [EObject current=null] : (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL ) ;
    public final EObject ruleRESTURL() throws RecognitionException {
        EObject current = null;

        EObject this_AbsoluteRESTURL_0 = null;

        EObject this_RelativeRESTURL_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1105:28: ( (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1106:1: (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1106:1: (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1107:5: this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL
                    {
                     
                            newCompositeNode(grammarAccess.getRESTURLAccess().getAbsoluteRESTURLParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_ruleRESTURL2512);
                    this_AbsoluteRESTURL_0=ruleAbsoluteRESTURL();

                    state._fsp--;

                     
                            current = this_AbsoluteRESTURL_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1117:5: this_RelativeRESTURL_1= ruleRelativeRESTURL
                    {
                     
                            newCompositeNode(grammarAccess.getRESTURLAccess().getRelativeRESTURLParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRelativeRESTURL_in_ruleRESTURL2539);
                    this_RelativeRESTURL_1=ruleRelativeRESTURL();

                    state._fsp--;

                     
                            current = this_RelativeRESTURL_1; 
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
    // $ANTLR end "ruleRESTURL"


    // $ANTLR start "entryRuleAbsoluteRESTURL"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1133:1: entryRuleAbsoluteRESTURL returns [EObject current=null] : iv_ruleAbsoluteRESTURL= ruleAbsoluteRESTURL EOF ;
    public final EObject entryRuleAbsoluteRESTURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteRESTURL = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1134:2: (iv_ruleAbsoluteRESTURL= ruleAbsoluteRESTURL EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1135:2: iv_ruleAbsoluteRESTURL= ruleAbsoluteRESTURL EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteRESTURLRule()); 
            pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_entryRuleAbsoluteRESTURL2574);
            iv_ruleAbsoluteRESTURL=ruleAbsoluteRESTURL();

            state._fsp--;

             current =iv_ruleAbsoluteRESTURL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteRESTURL2584); 

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
    // $ANTLR end "entryRuleAbsoluteRESTURL"


    // $ANTLR start "ruleAbsoluteRESTURL"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1142:1: ruleAbsoluteRESTURL returns [EObject current=null] : ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* (otherlv_7= '?' ( (lv_parameters_8_0= ruleUrlParameter ) ) (otherlv_9= '&' ( (lv_parameters_10_0= ruleUrlParameter ) ) )* )? ) ;
    public final EObject ruleAbsoluteRESTURL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_port_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_host_2_0 = null;

        EObject lv_fragments_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1145:28: ( ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* (otherlv_7= '?' ( (lv_parameters_8_0= ruleUrlParameter ) ) (otherlv_9= '&' ( (lv_parameters_10_0= ruleUrlParameter ) ) )* )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1146:1: ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* (otherlv_7= '?' ( (lv_parameters_8_0= ruleUrlParameter ) ) (otherlv_9= '&' ( (lv_parameters_10_0= ruleUrlParameter ) ) )* )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1146:1: ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* (otherlv_7= '?' ( (lv_parameters_8_0= ruleUrlParameter ) ) (otherlv_9= '&' ( (lv_parameters_10_0= ruleUrlParameter ) ) )* )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1146:2: () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* (otherlv_7= '?' ( (lv_parameters_8_0= ruleUrlParameter ) ) (otherlv_9= '&' ( (lv_parameters_10_0= ruleUrlParameter ) ) )* )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1146:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1147:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAbsoluteRESTURLAccess().getAbsoluteRESTURLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleAbsoluteRESTURL2630); 

                	newLeafNode(otherlv_1, grammarAccess.getAbsoluteRESTURLAccess().getHttpKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1156:1: ( (lv_host_2_0= ruleUrlFragment ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1157:1: (lv_host_2_0= ruleUrlFragment )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1157:1: (lv_host_2_0= ruleUrlFragment )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1158:3: lv_host_2_0= ruleUrlFragment
            {
             
            	        newCompositeNode(grammarAccess.getAbsoluteRESTURLAccess().getHostUrlFragmentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2651);
            lv_host_2_0=ruleUrlFragment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAbsoluteRESTURLRule());
            	        }
                   		set(
                   			current, 
                   			"host",
                    		lv_host_2_0, 
                    		"UrlFragment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1174:2: (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1174:4: otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleAbsoluteRESTURL2664); 

                        	newLeafNode(otherlv_3, grammarAccess.getAbsoluteRESTURLAccess().getColonKeyword_3_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1178:1: ( (lv_port_4_0= RULE_INT ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1179:1: (lv_port_4_0= RULE_INT )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1179:1: (lv_port_4_0= RULE_INT )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1180:3: lv_port_4_0= RULE_INT
                    {
                    lv_port_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAbsoluteRESTURL2681); 

                    			newLeafNode(lv_port_4_0, grammarAccess.getAbsoluteRESTURLAccess().getPortINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbsoluteRESTURLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"port",
                            		lv_port_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1196:4: (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1196:6: otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) )
            	    {
            	    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleAbsoluteRESTURL2701); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAbsoluteRESTURLAccess().getSolidusKeyword_4_0());
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1200:1: ( (lv_fragments_6_0= ruleUrlFragment ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1201:1: (lv_fragments_6_0= ruleUrlFragment )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1201:1: (lv_fragments_6_0= ruleUrlFragment )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1202:3: lv_fragments_6_0= ruleUrlFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAbsoluteRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2722);
            	    lv_fragments_6_0=ruleUrlFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAbsoluteRESTURLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_6_0, 
            	            		"UrlFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1218:4: (otherlv_7= '?' ( (lv_parameters_8_0= ruleUrlParameter ) ) (otherlv_9= '&' ( (lv_parameters_10_0= ruleUrlParameter ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1218:6: otherlv_7= '?' ( (lv_parameters_8_0= ruleUrlParameter ) ) (otherlv_9= '&' ( (lv_parameters_10_0= ruleUrlParameter ) ) )*
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleAbsoluteRESTURL2737); 

                        	newLeafNode(otherlv_7, grammarAccess.getAbsoluteRESTURLAccess().getQuestionMarkKeyword_5_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1222:1: ( (lv_parameters_8_0= ruleUrlParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1223:1: (lv_parameters_8_0= ruleUrlParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1223:1: (lv_parameters_8_0= ruleUrlParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1224:3: lv_parameters_8_0= ruleUrlParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbsoluteRESTURLAccess().getParametersUrlParameterParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUrlParameter_in_ruleAbsoluteRESTURL2758);
                    lv_parameters_8_0=ruleUrlParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbsoluteRESTURLRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_8_0, 
                            		"UrlParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1240:2: (otherlv_9= '&' ( (lv_parameters_10_0= ruleUrlParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==37) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1240:4: otherlv_9= '&' ( (lv_parameters_10_0= ruleUrlParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleAbsoluteRESTURL2771); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getAbsoluteRESTURLAccess().getAmpersandKeyword_5_2_0());
                    	        
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1244:1: ( (lv_parameters_10_0= ruleUrlParameter ) )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1245:1: (lv_parameters_10_0= ruleUrlParameter )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1245:1: (lv_parameters_10_0= ruleUrlParameter )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1246:3: lv_parameters_10_0= ruleUrlParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAbsoluteRESTURLAccess().getParametersUrlParameterParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUrlParameter_in_ruleAbsoluteRESTURL2792);
                    	    lv_parameters_10_0=ruleUrlParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAbsoluteRESTURLRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_10_0, 
                    	            		"UrlParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


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
    // $ANTLR end "ruleAbsoluteRESTURL"


    // $ANTLR start "entryRuleUrlParameter"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1270:1: entryRuleUrlParameter returns [EObject current=null] : iv_ruleUrlParameter= ruleUrlParameter EOF ;
    public final EObject entryRuleUrlParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlParameter = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1271:2: (iv_ruleUrlParameter= ruleUrlParameter EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1272:2: iv_ruleUrlParameter= ruleUrlParameter EOF
            {
             newCompositeNode(grammarAccess.getUrlParameterRule()); 
            pushFollow(FOLLOW_ruleUrlParameter_in_entryRuleUrlParameter2832);
            iv_ruleUrlParameter=ruleUrlParameter();

            state._fsp--;

             current =iv_ruleUrlParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlParameter2842); 

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
    // $ANTLR end "entryRuleUrlParameter"


    // $ANTLR start "ruleUrlParameter"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1279:1: ruleUrlParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariable ) ) ) ;
    public final EObject ruleUrlParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1282:28: ( ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariable ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1283:1: ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariable ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1283:1: ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariable ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1283:2: ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariable ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1283:2: ( (lv_name_0_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1284:1: (lv_name_0_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1284:1: (lv_name_0_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1285:3: lv_name_0_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getUrlParameterAccess().getNameKeywordedIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleUrlParameter2888);
            lv_name_0_0=ruleKeywordedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUrlParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"KeywordedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleUrlParameter2900); 

                	newLeafNode(otherlv_1, grammarAccess.getUrlParameterAccess().getEqualsSignKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1305:1: ( (lv_value_2_0= ruleVariable ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1306:1: (lv_value_2_0= ruleVariable )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1306:1: (lv_value_2_0= ruleVariable )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1307:3: lv_value_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getUrlParameterAccess().getValueVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleUrlParameter2921);
            lv_value_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUrlParameterRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Variable");
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
    // $ANTLR end "ruleUrlParameter"


    // $ANTLR start "entryRuleRelativeRESTURL"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1331:1: entryRuleRelativeRESTURL returns [EObject current=null] : iv_ruleRelativeRESTURL= ruleRelativeRESTURL EOF ;
    public final EObject entryRuleRelativeRESTURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeRESTURL = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1332:2: (iv_ruleRelativeRESTURL= ruleRelativeRESTURL EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1333:2: iv_ruleRelativeRESTURL= ruleRelativeRESTURL EOF
            {
             newCompositeNode(grammarAccess.getRelativeRESTURLRule()); 
            pushFollow(FOLLOW_ruleRelativeRESTURL_in_entryRuleRelativeRESTURL2957);
            iv_ruleRelativeRESTURL=ruleRelativeRESTURL();

            state._fsp--;

             current =iv_ruleRelativeRESTURL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeRESTURL2967); 

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
    // $ANTLR end "entryRuleRelativeRESTURL"


    // $ANTLR start "ruleRelativeRESTURL"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1340:1: ruleRelativeRESTURL returns [EObject current=null] : ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* (otherlv_5= '?' ( (lv_parameters_6_0= ruleUrlParameter ) ) (otherlv_7= '&' ( (lv_parameters_8_0= ruleUrlParameter ) ) )* )? ) ;
    public final EObject ruleRelativeRESTURL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_fragments_2_0 = null;

        EObject lv_fragments_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1343:28: ( ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* (otherlv_5= '?' ( (lv_parameters_6_0= ruleUrlParameter ) ) (otherlv_7= '&' ( (lv_parameters_8_0= ruleUrlParameter ) ) )* )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1344:1: ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* (otherlv_5= '?' ( (lv_parameters_6_0= ruleUrlParameter ) ) (otherlv_7= '&' ( (lv_parameters_8_0= ruleUrlParameter ) ) )* )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1344:1: ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* (otherlv_5= '?' ( (lv_parameters_6_0= ruleUrlParameter ) ) (otherlv_7= '&' ( (lv_parameters_8_0= ruleUrlParameter ) ) )* )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1344:2: () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* (otherlv_5= '?' ( (lv_parameters_6_0= ruleUrlParameter ) ) (otherlv_7= '&' ( (lv_parameters_8_0= ruleUrlParameter ) ) )* )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1344:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1345:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRelativeRESTURLAccess().getRelativeRESTURLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleRelativeRESTURL3013); 

                	newLeafNode(otherlv_1, grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1354:1: ( (lv_fragments_2_0= ruleUrlFragment ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1355:1: (lv_fragments_2_0= ruleUrlFragment )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1355:1: (lv_fragments_2_0= ruleUrlFragment )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1356:3: lv_fragments_2_0= ruleUrlFragment
            {
             
            	        newCompositeNode(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL3034);
            lv_fragments_2_0=ruleUrlFragment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelativeRESTURLRule());
            	        }
                   		add(
                   			current, 
                   			"fragments",
                    		lv_fragments_2_0, 
                    		"UrlFragment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1372:2: (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1372:4: otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleRelativeRESTURL3047); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_3_0());
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1376:1: ( (lv_fragments_4_0= ruleUrlFragment ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1377:1: (lv_fragments_4_0= ruleUrlFragment )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1377:1: (lv_fragments_4_0= ruleUrlFragment )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1378:3: lv_fragments_4_0= ruleUrlFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL3068);
            	    lv_fragments_4_0=ruleUrlFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelativeRESTURLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_4_0, 
            	            		"UrlFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1394:4: (otherlv_5= '?' ( (lv_parameters_6_0= ruleUrlParameter ) ) (otherlv_7= '&' ( (lv_parameters_8_0= ruleUrlParameter ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1394:6: otherlv_5= '?' ( (lv_parameters_6_0= ruleUrlParameter ) ) (otherlv_7= '&' ( (lv_parameters_8_0= ruleUrlParameter ) ) )*
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleRelativeRESTURL3083); 

                        	newLeafNode(otherlv_5, grammarAccess.getRelativeRESTURLAccess().getQuestionMarkKeyword_4_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1398:1: ( (lv_parameters_6_0= ruleUrlParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1399:1: (lv_parameters_6_0= ruleUrlParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1399:1: (lv_parameters_6_0= ruleUrlParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1400:3: lv_parameters_6_0= ruleUrlParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelativeRESTURLAccess().getParametersUrlParameterParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUrlParameter_in_ruleRelativeRESTURL3104);
                    lv_parameters_6_0=ruleUrlParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelativeRESTURLRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_6_0, 
                            		"UrlParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1416:2: (otherlv_7= '&' ( (lv_parameters_8_0= ruleUrlParameter ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==37) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1416:4: otherlv_7= '&' ( (lv_parameters_8_0= ruleUrlParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleRelativeRESTURL3117); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getRelativeRESTURLAccess().getAmpersandKeyword_4_2_0());
                    	        
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1420:1: ( (lv_parameters_8_0= ruleUrlParameter ) )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1421:1: (lv_parameters_8_0= ruleUrlParameter )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1421:1: (lv_parameters_8_0= ruleUrlParameter )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1422:3: lv_parameters_8_0= ruleUrlParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelativeRESTURLAccess().getParametersUrlParameterParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUrlParameter_in_ruleRelativeRESTURL3138);
                    	    lv_parameters_8_0=ruleUrlParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRelativeRESTURLRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_8_0, 
                    	            		"UrlParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


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
    // $ANTLR end "ruleRelativeRESTURL"


    // $ANTLR start "entryRuleUrlFragment"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1446:1: entryRuleUrlFragment returns [EObject current=null] : iv_ruleUrlFragment= ruleUrlFragment EOF ;
    public final EObject entryRuleUrlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlFragment = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1447:2: (iv_ruleUrlFragment= ruleUrlFragment EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1448:2: iv_ruleUrlFragment= ruleUrlFragment EOF
            {
             newCompositeNode(grammarAccess.getUrlFragmentRule()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_entryRuleUrlFragment3178);
            iv_ruleUrlFragment=ruleUrlFragment();

            state._fsp--;

             current =iv_ruleUrlFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlFragment3188); 

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
    // $ANTLR end "entryRuleUrlFragment"


    // $ANTLR start "ruleUrlFragment"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1455:1: ruleUrlFragment returns [EObject current=null] : (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable ) ;
    public final EObject ruleUrlFragment() throws RecognitionException {
        EObject current = null;

        EObject this_UrlPathFragment_0 = null;

        EObject this_Variable_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1458:28: ( (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1459:1: (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1459:1: (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==30) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1460:5: this_UrlPathFragment_0= ruleUrlPathFragment
                    {
                     
                            newCompositeNode(grammarAccess.getUrlFragmentAccess().getUrlPathFragmentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUrlPathFragment_in_ruleUrlFragment3235);
                    this_UrlPathFragment_0=ruleUrlPathFragment();

                    state._fsp--;

                     
                            current = this_UrlPathFragment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1470:5: this_Variable_1= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getUrlFragmentAccess().getVariableParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleUrlFragment3262);
                    this_Variable_1=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_1; 
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
    // $ANTLR end "ruleUrlFragment"


    // $ANTLR start "entryRuleUrlPathFragment"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1486:1: entryRuleUrlPathFragment returns [EObject current=null] : iv_ruleUrlPathFragment= ruleUrlPathFragment EOF ;
    public final EObject entryRuleUrlPathFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlPathFragment = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1487:2: (iv_ruleUrlPathFragment= ruleUrlPathFragment EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1488:2: iv_ruleUrlPathFragment= ruleUrlPathFragment EOF
            {
             newCompositeNode(grammarAccess.getUrlPathFragmentRule()); 
            pushFollow(FOLLOW_ruleUrlPathFragment_in_entryRuleUrlPathFragment3297);
            iv_ruleUrlPathFragment=ruleUrlPathFragment();

            state._fsp--;

             current =iv_ruleUrlPathFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlPathFragment3307); 

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
    // $ANTLR end "entryRuleUrlPathFragment"


    // $ANTLR start "ruleUrlPathFragment"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1495:1: ruleUrlPathFragment returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleUrlPathFragment() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1498:28: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1499:1: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1499:1: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1500:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1500:1: (lv_name_0_0= ruleQualifiedName )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1501:3: lv_name_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getUrlPathFragmentAccess().getNameQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleUrlPathFragment3352);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUrlPathFragmentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"QualifiedName");
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
    // $ANTLR end "ruleUrlPathFragment"


    // $ANTLR start "entryRuleVariable"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1525:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1526:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1527:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable3387);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3397); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1534:1: ruleVariable returns [EObject current=null] : (otherlv_0= ':' ( (lv_parameterReference_1_0= ruleParameterMemberCall ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_parameterReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1537:28: ( (otherlv_0= ':' ( (lv_parameterReference_1_0= ruleParameterMemberCall ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1538:1: (otherlv_0= ':' ( (lv_parameterReference_1_0= ruleParameterMemberCall ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1538:1: (otherlv_0= ':' ( (lv_parameterReference_1_0= ruleParameterMemberCall ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1538:3: otherlv_0= ':' ( (lv_parameterReference_1_0= ruleParameterMemberCall ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleVariable3434); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getColonKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1542:1: ( (lv_parameterReference_1_0= ruleParameterMemberCall ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1543:1: (lv_parameterReference_1_0= ruleParameterMemberCall )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1543:1: (lv_parameterReference_1_0= ruleParameterMemberCall )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1544:3: lv_parameterReference_1_0= ruleParameterMemberCall
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getParameterReferenceParameterMemberCallParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterMemberCall_in_ruleVariable3455);
            lv_parameterReference_1_0=ruleParameterMemberCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"parameterReference",
                    		lv_parameterReference_1_0, 
                    		"ParameterMemberCall");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1568:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1569:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1570:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3492);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3503); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1577:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1580:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1581:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1581:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1581:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3543); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1588:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1589:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedName3562); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3577); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleScreen"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1609:1: entryRuleScreen returns [EObject current=null] : iv_ruleScreen= ruleScreen EOF ;
    public final EObject entryRuleScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreen = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1610:2: (iv_ruleScreen= ruleScreen EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1611:2: iv_ruleScreen= ruleScreen EOF
            {
             newCompositeNode(grammarAccess.getScreenRule()); 
            pushFollow(FOLLOW_ruleScreen_in_entryRuleScreen3624);
            iv_ruleScreen=ruleScreen();

            state._fsp--;

             current =iv_ruleScreen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreen3634); 

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
    // $ANTLR end "entryRuleScreen"


    // $ANTLR start "ruleScreen"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1618:1: ruleScreen returns [EObject current=null] : (otherlv_0= 'screen' ( (lv_kind_1_0= ruleScreenKind ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )? otherlv_13= 'sections' otherlv_14= '{' ( (lv_sections_15_0= ruleScreenSection ) )* otherlv_16= '}' (otherlv_17= 'actions' otherlv_18= '{' ( (lv_actions_19_0= ruleUIAction ) )* otherlv_20= '}' )? (otherlv_21= 'controller' otherlv_22= '{' ( (lv_verbs_23_0= ruleControllerVerb ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleScreen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_title_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Enumerator lv_kind_1_0 = null;

        EObject lv_inputParameter_4_0 = null;

        EObject lv_datasource_12_0 = null;

        EObject lv_sections_15_0 = null;

        EObject lv_actions_19_0 = null;

        EObject lv_verbs_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1621:28: ( (otherlv_0= 'screen' ( (lv_kind_1_0= ruleScreenKind ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )? otherlv_13= 'sections' otherlv_14= '{' ( (lv_sections_15_0= ruleScreenSection ) )* otherlv_16= '}' (otherlv_17= 'actions' otherlv_18= '{' ( (lv_actions_19_0= ruleUIAction ) )* otherlv_20= '}' )? (otherlv_21= 'controller' otherlv_22= '{' ( (lv_verbs_23_0= ruleControllerVerb ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1622:1: (otherlv_0= 'screen' ( (lv_kind_1_0= ruleScreenKind ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )? otherlv_13= 'sections' otherlv_14= '{' ( (lv_sections_15_0= ruleScreenSection ) )* otherlv_16= '}' (otherlv_17= 'actions' otherlv_18= '{' ( (lv_actions_19_0= ruleUIAction ) )* otherlv_20= '}' )? (otherlv_21= 'controller' otherlv_22= '{' ( (lv_verbs_23_0= ruleControllerVerb ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1622:1: (otherlv_0= 'screen' ( (lv_kind_1_0= ruleScreenKind ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )? otherlv_13= 'sections' otherlv_14= '{' ( (lv_sections_15_0= ruleScreenSection ) )* otherlv_16= '}' (otherlv_17= 'actions' otherlv_18= '{' ( (lv_actions_19_0= ruleUIAction ) )* otherlv_20= '}' )? (otherlv_21= 'controller' otherlv_22= '{' ( (lv_verbs_23_0= ruleControllerVerb ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1622:3: otherlv_0= 'screen' ( (lv_kind_1_0= ruleScreenKind ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )? otherlv_13= 'sections' otherlv_14= '{' ( (lv_sections_15_0= ruleScreenSection ) )* otherlv_16= '}' (otherlv_17= 'actions' otherlv_18= '{' ( (lv_actions_19_0= ruleUIAction ) )* otherlv_20= '}' )? (otherlv_21= 'controller' otherlv_22= '{' ( (lv_verbs_23_0= ruleControllerVerb ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleScreen3671); 

                	newLeafNode(otherlv_0, grammarAccess.getScreenAccess().getScreenKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1626:1: ( (lv_kind_1_0= ruleScreenKind ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1627:1: (lv_kind_1_0= ruleScreenKind )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1627:1: (lv_kind_1_0= ruleScreenKind )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1628:3: lv_kind_1_0= ruleScreenKind
            {
             
            	        newCompositeNode(grammarAccess.getScreenAccess().getKindScreenKindEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleScreenKind_in_ruleScreen3692);
            lv_kind_1_0=ruleScreenKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScreenRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_1_0, 
                    		"ScreenKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1644:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1645:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1645:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1646:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScreen3709); 

            			newLeafNode(lv_name_2_0, grammarAccess.getScreenAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScreenRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1662:2: (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1662:4: otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleScreen3727); 

                        	newLeafNode(otherlv_3, grammarAccess.getScreenAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1666:1: ( (lv_inputParameter_4_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1667:1: (lv_inputParameter_4_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1667:1: (lv_inputParameter_4_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1668:3: lv_inputParameter_4_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getScreenAccess().getInputParameterParameterParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleScreen3748);
                    lv_inputParameter_4_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScreenRule());
                    	        }
                           		set(
                           			current, 
                           			"inputParameter",
                            		lv_inputParameter_4_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleScreen3760); 

                        	newLeafNode(otherlv_5, grammarAccess.getScreenAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleScreen3774); 

                	newLeafNode(otherlv_6, grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1692:1: (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==11) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1692:3: otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleScreen3787); 

                        	newLeafNode(otherlv_7, grammarAccess.getScreenAccess().getTitleKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleScreen3799); 

                        	newLeafNode(otherlv_8, grammarAccess.getScreenAccess().getEqualsSignKeyword_5_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1700:1: ( (lv_title_9_0= RULE_STRING ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1701:1: (lv_title_9_0= RULE_STRING )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1701:1: (lv_title_9_0= RULE_STRING )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1702:3: lv_title_9_0= RULE_STRING
                    {
                    lv_title_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScreen3816); 

                    			newLeafNode(lv_title_9_0, grammarAccess.getScreenAccess().getTitleSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScreenRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1718:4: (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1718:6: otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) )
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleScreen3836); 

                        	newLeafNode(otherlv_10, grammarAccess.getScreenAccess().getDatasourceKeyword_6_0());
                        
                    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleScreen3848); 

                        	newLeafNode(otherlv_11, grammarAccess.getScreenAccess().getEqualsSignKeyword_6_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1726:1: ( (lv_datasource_12_0= ruleDataSourceCall ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1727:1: (lv_datasource_12_0= ruleDataSourceCall )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1727:1: (lv_datasource_12_0= ruleDataSourceCall )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1728:3: lv_datasource_12_0= ruleDataSourceCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getScreenAccess().getDatasourceDataSourceCallParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataSourceCall_in_ruleScreen3869);
                    lv_datasource_12_0=ruleDataSourceCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScreenRule());
                    	        }
                           		set(
                           			current, 
                           			"datasource",
                            		lv_datasource_12_0, 
                            		"DataSourceCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleScreen3883); 

                	newLeafNode(otherlv_13, grammarAccess.getScreenAccess().getSectionsKeyword_7());
                
            otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleScreen3895); 

                	newLeafNode(otherlv_14, grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1752:1: ( (lv_sections_15_0= ruleScreenSection ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1753:1: (lv_sections_15_0= ruleScreenSection )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1753:1: (lv_sections_15_0= ruleScreenSection )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1754:3: lv_sections_15_0= ruleScreenSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScreenAccess().getSectionsScreenSectionParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScreenSection_in_ruleScreen3916);
            	    lv_sections_15_0=ruleScreenSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScreenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_15_0, 
            	            		"ScreenSection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleScreen3929); 

                	newLeafNode(otherlv_16, grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_10());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1774:1: (otherlv_17= 'actions' otherlv_18= '{' ( (lv_actions_19_0= ruleUIAction ) )* otherlv_20= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1774:3: otherlv_17= 'actions' otherlv_18= '{' ( (lv_actions_19_0= ruleUIAction ) )* otherlv_20= '}'
                    {
                    otherlv_17=(Token)match(input,42,FOLLOW_42_in_ruleScreen3942); 

                        	newLeafNode(otherlv_17, grammarAccess.getScreenAccess().getActionsKeyword_11_0());
                        
                    otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleScreen3954); 

                        	newLeafNode(otherlv_18, grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1782:1: ( (lv_actions_19_0= ruleUIAction ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==48) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1783:1: (lv_actions_19_0= ruleUIAction )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1783:1: (lv_actions_19_0= ruleUIAction )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1784:3: lv_actions_19_0= ruleUIAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScreenAccess().getActionsUIActionParserRuleCall_11_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUIAction_in_ruleScreen3975);
                    	    lv_actions_19_0=ruleUIAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getScreenRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_19_0, 
                    	            		"UIAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleScreen3988); 

                        	newLeafNode(otherlv_20, grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_11_3());
                        

                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1804:3: (otherlv_21= 'controller' otherlv_22= '{' ( (lv_verbs_23_0= ruleControllerVerb ) )* otherlv_24= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1804:5: otherlv_21= 'controller' otherlv_22= '{' ( (lv_verbs_23_0= ruleControllerVerb ) )* otherlv_24= '}'
                    {
                    otherlv_21=(Token)match(input,43,FOLLOW_43_in_ruleScreen4003); 

                        	newLeafNode(otherlv_21, grammarAccess.getScreenAccess().getControllerKeyword_12_0());
                        
                    otherlv_22=(Token)match(input,23,FOLLOW_23_in_ruleScreen4015); 

                        	newLeafNode(otherlv_22, grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1812:1: ( (lv_verbs_23_0= ruleControllerVerb ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=16 && LA31_0<=19)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1813:1: (lv_verbs_23_0= ruleControllerVerb )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1813:1: (lv_verbs_23_0= ruleControllerVerb )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1814:3: lv_verbs_23_0= ruleControllerVerb
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScreenAccess().getVerbsControllerVerbParserRuleCall_12_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleControllerVerb_in_ruleScreen4036);
                    	    lv_verbs_23_0=ruleControllerVerb();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getScreenRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"verbs",
                    	            		lv_verbs_23_0, 
                    	            		"ControllerVerb");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,24,FOLLOW_24_in_ruleScreen4049); 

                        	newLeafNode(otherlv_24, grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_12_3());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,24,FOLLOW_24_in_ruleScreen4063); 

                	newLeafNode(otherlv_25, grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_13());
                

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
    // $ANTLR end "ruleScreen"


    // $ANTLR start "entryRuleScreenSection"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1846:1: entryRuleScreenSection returns [EObject current=null] : iv_ruleScreenSection= ruleScreenSection EOF ;
    public final EObject entryRuleScreenSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenSection = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1847:2: (iv_ruleScreenSection= ruleScreenSection EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1848:2: iv_ruleScreenSection= ruleScreenSection EOF
            {
             newCompositeNode(grammarAccess.getScreenSectionRule()); 
            pushFollow(FOLLOW_ruleScreenSection_in_entryRuleScreenSection4099);
            iv_ruleScreenSection=ruleScreenSection();

            state._fsp--;

             current =iv_ruleScreenSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenSection4109); 

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
    // $ANTLR end "entryRuleScreenSection"


    // $ANTLR start "ruleScreenSection"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1855:1: ruleScreenSection returns [EObject current=null] : (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )? ( (lv_items_8_0= ruleScreenSectionItems ) ) otherlv_9= '}' ) ;
    public final EObject ruleScreenSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_datasource_7_0 = null;

        EObject lv_items_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1858:28: ( (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )? ( (lv_items_8_0= ruleScreenSectionItems ) ) otherlv_9= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1859:1: (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )? ( (lv_items_8_0= ruleScreenSectionItems ) ) otherlv_9= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1859:1: (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )? ( (lv_items_8_0= ruleScreenSectionItems ) ) otherlv_9= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1859:3: otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )? ( (lv_items_8_0= ruleScreenSectionItems ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleScreenSection4146); 

                	newLeafNode(otherlv_0, grammarAccess.getScreenSectionAccess().getSectionKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleScreenSection4158); 

                	newLeafNode(otherlv_1, grammarAccess.getScreenSectionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1867:1: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==11) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1867:3: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleScreenSection4171); 

                        	newLeafNode(otherlv_2, grammarAccess.getScreenSectionAccess().getTitleKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleScreenSection4183); 

                        	newLeafNode(otherlv_3, grammarAccess.getScreenSectionAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1875:1: ( (lv_title_4_0= RULE_STRING ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1876:1: (lv_title_4_0= RULE_STRING )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1876:1: (lv_title_4_0= RULE_STRING )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1877:3: lv_title_4_0= RULE_STRING
                    {
                    lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScreenSection4200); 

                    			newLeafNode(lv_title_4_0, grammarAccess.getScreenSectionAccess().getTitleSTRINGTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScreenSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1893:4: (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1893:6: otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleScreenSection4220); 

                        	newLeafNode(otherlv_5, grammarAccess.getScreenSectionAccess().getDatasourceKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleScreenSection4232); 

                        	newLeafNode(otherlv_6, grammarAccess.getScreenSectionAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1901:1: ( (lv_datasource_7_0= ruleDataSourceCall ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1902:1: (lv_datasource_7_0= ruleDataSourceCall )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1902:1: (lv_datasource_7_0= ruleDataSourceCall )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1903:3: lv_datasource_7_0= ruleDataSourceCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getScreenSectionAccess().getDatasourceDataSourceCallParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataSourceCall_in_ruleScreenSection4253);
                    lv_datasource_7_0=ruleDataSourceCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScreenSectionRule());
                    	        }
                           		set(
                           			current, 
                           			"datasource",
                            		lv_datasource_7_0, 
                            		"DataSourceCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1919:4: ( (lv_items_8_0= ruleScreenSectionItems ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1920:1: (lv_items_8_0= ruleScreenSectionItems )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1920:1: (lv_items_8_0= ruleScreenSectionItems )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1921:3: lv_items_8_0= ruleScreenSectionItems
            {
             
            	        newCompositeNode(grammarAccess.getScreenSectionAccess().getItemsScreenSectionItemsParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleScreenSectionItems_in_ruleScreenSection4276);
            lv_items_8_0=ruleScreenSectionItems();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScreenSectionRule());
            	        }
                   		set(
                   			current, 
                   			"items",
                    		lv_items_8_0, 
                    		"ScreenSectionItems");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleScreenSection4288); 

                	newLeafNode(otherlv_9, grammarAccess.getScreenSectionAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleScreenSection"


    // $ANTLR start "entryRuleScreenSectionItems"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1949:1: entryRuleScreenSectionItems returns [EObject current=null] : iv_ruleScreenSectionItems= ruleScreenSectionItems EOF ;
    public final EObject entryRuleScreenSectionItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenSectionItems = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1950:2: (iv_ruleScreenSectionItems= ruleScreenSectionItems EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1951:2: iv_ruleScreenSectionItems= ruleScreenSectionItems EOF
            {
             newCompositeNode(grammarAccess.getScreenSectionItemsRule()); 
            pushFollow(FOLLOW_ruleScreenSectionItems_in_entryRuleScreenSectionItems4324);
            iv_ruleScreenSectionItems=ruleScreenSectionItems();

            state._fsp--;

             current =iv_ruleScreenSectionItems; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenSectionItems4334); 

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
    // $ANTLR end "entryRuleScreenSectionItems"


    // $ANTLR start "ruleScreenSectionItems"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1958:1: ruleScreenSectionItems returns [EObject current=null] : ( () otherlv_1= 'items' otherlv_2= '{' ( (lv_items_3_0= ruleScreenListItemCell ) )* otherlv_4= '}' ) ;
    public final EObject ruleScreenSectionItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1961:28: ( ( () otherlv_1= 'items' otherlv_2= '{' ( (lv_items_3_0= ruleScreenListItemCell ) )* otherlv_4= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1962:1: ( () otherlv_1= 'items' otherlv_2= '{' ( (lv_items_3_0= ruleScreenListItemCell ) )* otherlv_4= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1962:1: ( () otherlv_1= 'items' otherlv_2= '{' ( (lv_items_3_0= ruleScreenListItemCell ) )* otherlv_4= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1962:2: () otherlv_1= 'items' otherlv_2= '{' ( (lv_items_3_0= ruleScreenListItemCell ) )* otherlv_4= '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1962:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1963:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getScreenSectionItemsAccess().getScreenSectionItemsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleScreenSectionItems4380); 

                	newLeafNode(otherlv_1, grammarAccess.getScreenSectionItemsAccess().getItemsKeyword_1());
                
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleScreenSectionItems4392); 

                	newLeafNode(otherlv_2, grammarAccess.getScreenSectionItemsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1976:1: ( (lv_items_3_0= ruleScreenListItemCell ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==45) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1977:1: (lv_items_3_0= ruleScreenListItemCell )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1977:1: (lv_items_3_0= ruleScreenListItemCell )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1978:3: lv_items_3_0= ruleScreenListItemCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScreenSectionItemsAccess().getItemsScreenListItemCellParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScreenListItemCell_in_ruleScreenSectionItems4413);
            	    lv_items_3_0=ruleScreenListItemCell();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScreenSectionItemsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"ScreenListItemCell");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleScreenSectionItems4426); 

                	newLeafNode(otherlv_4, grammarAccess.getScreenSectionItemsAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleScreenSectionItems"


    // $ANTLR start "entryRuleScreenListItemCell"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2006:1: entryRuleScreenListItemCell returns [EObject current=null] : iv_ruleScreenListItemCell= ruleScreenListItemCell EOF ;
    public final EObject entryRuleScreenListItemCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenListItemCell = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2007:2: (iv_ruleScreenListItemCell= ruleScreenListItemCell EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2008:2: iv_ruleScreenListItemCell= ruleScreenListItemCell EOF
            {
             newCompositeNode(grammarAccess.getScreenListItemCellRule()); 
            pushFollow(FOLLOW_ruleScreenListItemCell_in_entryRuleScreenListItemCell4462);
            iv_ruleScreenListItemCell=ruleScreenListItemCell();

            state._fsp--;

             current =iv_ruleScreenListItemCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenListItemCell4472); 

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
    // $ANTLR end "entryRuleScreenListItemCell"


    // $ANTLR start "ruleScreenListItemCell"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2015:1: ruleScreenListItemCell returns [EObject current=null] : (otherlv_0= 'cell' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )? otherlv_6= '{' ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )* (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleScreenListItemCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_restMethod_3_0 = null;

        EObject lv_variable_5_0 = null;

        EObject lv_configurations_7_0 = null;

        EObject lv_actions_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2018:28: ( (otherlv_0= 'cell' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )? otherlv_6= '{' ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )* (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2019:1: (otherlv_0= 'cell' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )? otherlv_6= '{' ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )* (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2019:1: (otherlv_0= 'cell' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )? otherlv_6= '{' ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )* (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2019:3: otherlv_0= 'cell' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )? otherlv_6= '{' ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )* (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleScreenListItemCell4509); 

                	newLeafNode(otherlv_0, grammarAccess.getScreenListItemCellAccess().getCellKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2023:1: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2024:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2024:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2025:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getScreenListItemCellRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScreenListItemCell4529); 

            		newLeafNode(otherlv_1, grammarAccess.getScreenListItemCellAccess().getTypeListItemCellDeclarationCrossReference_1_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2036:2: (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2036:4: otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) )
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleScreenListItemCell4542); 

                        	newLeafNode(otherlv_2, grammarAccess.getScreenListItemCellAccess().getForeachKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2040:1: ( (lv_restMethod_3_0= ruleRESTMethodCall ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2041:1: (lv_restMethod_3_0= ruleRESTMethodCall )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2041:1: (lv_restMethod_3_0= ruleRESTMethodCall )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2042:3: lv_restMethod_3_0= ruleRESTMethodCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getScreenListItemCellAccess().getRestMethodRESTMethodCallParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRESTMethodCall_in_ruleScreenListItemCell4563);
                    lv_restMethod_3_0=ruleRESTMethodCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScreenListItemCellRule());
                    	        }
                           		set(
                           			current, 
                           			"restMethod",
                            		lv_restMethod_3_0, 
                            		"RESTMethodCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleScreenListItemCell4575); 

                        	newLeafNode(otherlv_4, grammarAccess.getScreenListItemCellAccess().getAsKeyword_2_2());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2062:1: ( (lv_variable_5_0= ruleLoopVariable ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2063:1: (lv_variable_5_0= ruleLoopVariable )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2063:1: (lv_variable_5_0= ruleLoopVariable )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2064:3: lv_variable_5_0= ruleLoopVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getScreenListItemCellAccess().getVariableLoopVariableParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLoopVariable_in_ruleScreenListItemCell4596);
                    lv_variable_5_0=ruleLoopVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScreenListItemCellRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_5_0, 
                            		"LoopVariable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleScreenListItemCell4610); 

                	newLeafNode(otherlv_6, grammarAccess.getScreenListItemCellAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2084:1: ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2085:1: (lv_configurations_7_0= ruleUIComponentMemberConfiguration )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2085:1: (lv_configurations_7_0= ruleUIComponentMemberConfiguration )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2086:3: lv_configurations_7_0= ruleUIComponentMemberConfiguration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScreenListItemCellAccess().getConfigurationsUIComponentMemberConfigurationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIComponentMemberConfiguration_in_ruleScreenListItemCell4631);
            	    lv_configurations_7_0=ruleUIComponentMemberConfiguration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScreenListItemCellRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"configurations",
            	            		lv_configurations_7_0, 
            	            		"UIComponentMemberConfiguration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2102:3: (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2102:5: otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleScreenListItemCell4645); 

                        	newLeafNode(otherlv_8, grammarAccess.getScreenListItemCellAccess().getActionsKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleScreenListItemCell4657); 

                        	newLeafNode(otherlv_9, grammarAccess.getScreenListItemCellAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2110:1: ( (lv_actions_10_0= ruleUIAction ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==48) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2111:1: (lv_actions_10_0= ruleUIAction )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2111:1: (lv_actions_10_0= ruleUIAction )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2112:3: lv_actions_10_0= ruleUIAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScreenListItemCellAccess().getActionsUIActionParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUIAction_in_ruleScreenListItemCell4678);
                    	    lv_actions_10_0=ruleUIAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getScreenListItemCellRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_10_0, 
                    	            		"UIAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleScreenListItemCell4691); 

                        	newLeafNode(otherlv_11, grammarAccess.getScreenListItemCellAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleScreenListItemCell4705); 

                	newLeafNode(otherlv_12, grammarAccess.getScreenListItemCellAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleScreenListItemCell"


    // $ANTLR start "entryRuleLoopVariable"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2146:1: entryRuleLoopVariable returns [EObject current=null] : iv_ruleLoopVariable= ruleLoopVariable EOF ;
    public final EObject entryRuleLoopVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopVariable = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2147:2: (iv_ruleLoopVariable= ruleLoopVariable EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2148:2: iv_ruleLoopVariable= ruleLoopVariable EOF
            {
             newCompositeNode(grammarAccess.getLoopVariableRule()); 
            pushFollow(FOLLOW_ruleLoopVariable_in_entryRuleLoopVariable4743);
            iv_ruleLoopVariable=ruleLoopVariable();

            state._fsp--;

             current =iv_ruleLoopVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopVariable4753); 

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
    // $ANTLR end "entryRuleLoopVariable"


    // $ANTLR start "ruleLoopVariable"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2155:1: ruleLoopVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLoopVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2158:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2159:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2159:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2160:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2160:1: (lv_name_0_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2161:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoopVariable4794); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLoopVariableAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLoopVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleLoopVariable"


    // $ANTLR start "entryRuleUIAction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2185:1: entryRuleUIAction returns [EObject current=null] : iv_ruleUIAction= ruleUIAction EOF ;
    public final EObject entryRuleUIAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIAction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2186:2: (iv_ruleUIAction= ruleUIAction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2187:2: iv_ruleUIAction= ruleUIAction EOF
            {
             newCompositeNode(grammarAccess.getUIActionRule()); 
            pushFollow(FOLLOW_ruleUIAction_in_entryRuleUIAction4834);
            iv_ruleUIAction=ruleUIAction();

            state._fsp--;

             current =iv_ruleUIAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIAction4844); 

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
    // $ANTLR end "entryRuleUIAction"


    // $ANTLR start "ruleUIAction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2194:1: ruleUIAction returns [EObject current=null] : (otherlv_0= 'action' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )? otherlv_8= 'action' otherlv_9= '=' ( (lv_action_10_0= ruleUIActionSpecification ) ) (otherlv_11= 'gesture' otherlv_12= '=' ( (lv_gesture_13_0= ruleGestureKind ) ) )? (otherlv_14= 'order' otherlv_15= '=' ( (lv_order_16_0= RULE_INT ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleUIAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_icon_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_order_16_0=null;
        Token otherlv_17=null;
        EObject lv_action_10_0 = null;

        Enumerator lv_gesture_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2197:28: ( (otherlv_0= 'action' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )? otherlv_8= 'action' otherlv_9= '=' ( (lv_action_10_0= ruleUIActionSpecification ) ) (otherlv_11= 'gesture' otherlv_12= '=' ( (lv_gesture_13_0= ruleGestureKind ) ) )? (otherlv_14= 'order' otherlv_15= '=' ( (lv_order_16_0= RULE_INT ) ) )? otherlv_17= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2198:1: (otherlv_0= 'action' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )? otherlv_8= 'action' otherlv_9= '=' ( (lv_action_10_0= ruleUIActionSpecification ) ) (otherlv_11= 'gesture' otherlv_12= '=' ( (lv_gesture_13_0= ruleGestureKind ) ) )? (otherlv_14= 'order' otherlv_15= '=' ( (lv_order_16_0= RULE_INT ) ) )? otherlv_17= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2198:1: (otherlv_0= 'action' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )? otherlv_8= 'action' otherlv_9= '=' ( (lv_action_10_0= ruleUIActionSpecification ) ) (otherlv_11= 'gesture' otherlv_12= '=' ( (lv_gesture_13_0= ruleGestureKind ) ) )? (otherlv_14= 'order' otherlv_15= '=' ( (lv_order_16_0= RULE_INT ) ) )? otherlv_17= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2198:3: otherlv_0= 'action' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )? otherlv_8= 'action' otherlv_9= '=' ( (lv_action_10_0= ruleUIActionSpecification ) ) (otherlv_11= 'gesture' otherlv_12= '=' ( (lv_gesture_13_0= ruleGestureKind ) ) )? (otherlv_14= 'order' otherlv_15= '=' ( (lv_order_16_0= RULE_INT ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleUIAction4881); 

                	newLeafNode(otherlv_0, grammarAccess.getUIActionAccess().getActionKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleUIAction4893); 

                	newLeafNode(otherlv_1, grammarAccess.getUIActionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2206:1: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==11) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2206:3: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleUIAction4906); 

                        	newLeafNode(otherlv_2, grammarAccess.getUIActionAccess().getTitleKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleUIAction4918); 

                        	newLeafNode(otherlv_3, grammarAccess.getUIActionAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2214:1: ( (lv_title_4_0= RULE_STRING ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2215:1: (lv_title_4_0= RULE_STRING )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2215:1: (lv_title_4_0= RULE_STRING )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2216:3: lv_title_4_0= RULE_STRING
                    {
                    lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIAction4935); 

                    			newLeafNode(lv_title_4_0, grammarAccess.getUIActionAccess().getTitleSTRINGTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIActionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2232:4: (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2232:6: otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleUIAction4955); 

                        	newLeafNode(otherlv_5, grammarAccess.getUIActionAccess().getIconKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleUIAction4967); 

                        	newLeafNode(otherlv_6, grammarAccess.getUIActionAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2240:1: ( (lv_icon_7_0= RULE_STRING ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2241:1: (lv_icon_7_0= RULE_STRING )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2241:1: (lv_icon_7_0= RULE_STRING )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2242:3: lv_icon_7_0= RULE_STRING
                    {
                    lv_icon_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIAction4984); 

                    			newLeafNode(lv_icon_7_0, grammarAccess.getUIActionAccess().getIconSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIActionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleUIAction5003); 

                	newLeafNode(otherlv_8, grammarAccess.getUIActionAccess().getActionKeyword_4());
                
            otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleUIAction5015); 

                	newLeafNode(otherlv_9, grammarAccess.getUIActionAccess().getEqualsSignKeyword_5());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2266:1: ( (lv_action_10_0= ruleUIActionSpecification ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2267:1: (lv_action_10_0= ruleUIActionSpecification )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2267:1: (lv_action_10_0= ruleUIActionSpecification )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2268:3: lv_action_10_0= ruleUIActionSpecification
            {
             
            	        newCompositeNode(grammarAccess.getUIActionAccess().getActionUIActionSpecificationParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleUIActionSpecification_in_ruleUIAction5036);
            lv_action_10_0=ruleUIActionSpecification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIActionRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_10_0, 
                    		"UIActionSpecification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2284:2: (otherlv_11= 'gesture' otherlv_12= '=' ( (lv_gesture_13_0= ruleGestureKind ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2284:4: otherlv_11= 'gesture' otherlv_12= '=' ( (lv_gesture_13_0= ruleGestureKind ) )
                    {
                    otherlv_11=(Token)match(input,50,FOLLOW_50_in_ruleUIAction5049); 

                        	newLeafNode(otherlv_11, grammarAccess.getUIActionAccess().getGestureKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleUIAction5061); 

                        	newLeafNode(otherlv_12, grammarAccess.getUIActionAccess().getEqualsSignKeyword_7_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2292:1: ( (lv_gesture_13_0= ruleGestureKind ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2293:1: (lv_gesture_13_0= ruleGestureKind )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2293:1: (lv_gesture_13_0= ruleGestureKind )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2294:3: lv_gesture_13_0= ruleGestureKind
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIActionAccess().getGestureGestureKindEnumRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGestureKind_in_ruleUIAction5082);
                    lv_gesture_13_0=ruleGestureKind();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIActionRule());
                    	        }
                           		set(
                           			current, 
                           			"gesture",
                            		lv_gesture_13_0, 
                            		"GestureKind");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2310:4: (otherlv_14= 'order' otherlv_15= '=' ( (lv_order_16_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2310:6: otherlv_14= 'order' otherlv_15= '=' ( (lv_order_16_0= RULE_INT ) )
                    {
                    otherlv_14=(Token)match(input,51,FOLLOW_51_in_ruleUIAction5097); 

                        	newLeafNode(otherlv_14, grammarAccess.getUIActionAccess().getOrderKeyword_8_0());
                        
                    otherlv_15=(Token)match(input,38,FOLLOW_38_in_ruleUIAction5109); 

                        	newLeafNode(otherlv_15, grammarAccess.getUIActionAccess().getEqualsSignKeyword_8_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2318:1: ( (lv_order_16_0= RULE_INT ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2319:1: (lv_order_16_0= RULE_INT )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2319:1: (lv_order_16_0= RULE_INT )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2320:3: lv_order_16_0= RULE_INT
                    {
                    lv_order_16_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUIAction5126); 

                    			newLeafNode(lv_order_16_0, grammarAccess.getUIActionAccess().getOrderINTTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIActionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"order",
                            		lv_order_16_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleUIAction5145); 

                	newLeafNode(otherlv_17, grammarAccess.getUIActionAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleUIAction"


    // $ANTLR start "entryRuleUIActionSpecification"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2348:1: entryRuleUIActionSpecification returns [EObject current=null] : iv_ruleUIActionSpecification= ruleUIActionSpecification EOF ;
    public final EObject entryRuleUIActionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIActionSpecification = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2349:2: (iv_ruleUIActionSpecification= ruleUIActionSpecification EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2350:2: iv_ruleUIActionSpecification= ruleUIActionSpecification EOF
            {
             newCompositeNode(grammarAccess.getUIActionSpecificationRule()); 
            pushFollow(FOLLOW_ruleUIActionSpecification_in_entryRuleUIActionSpecification5181);
            iv_ruleUIActionSpecification=ruleUIActionSpecification();

            state._fsp--;

             current =iv_ruleUIActionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIActionSpecification5191); 

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
    // $ANTLR end "entryRuleUIActionSpecification"


    // $ANTLR start "ruleUIActionSpecification"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2357:1: ruleUIActionSpecification returns [EObject current=null] : (this_UIActionNavigateAction_0= ruleUIActionNavigateAction | this_UIActionDeleteAction_1= ruleUIActionDeleteAction ) ;
    public final EObject ruleUIActionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_UIActionNavigateAction_0 = null;

        EObject this_UIActionDeleteAction_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2360:28: ( (this_UIActionNavigateAction_0= ruleUIActionNavigateAction | this_UIActionDeleteAction_1= ruleUIActionDeleteAction ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2361:1: (this_UIActionNavigateAction_0= ruleUIActionNavigateAction | this_UIActionDeleteAction_1= ruleUIActionDeleteAction )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2361:1: (this_UIActionNavigateAction_0= ruleUIActionNavigateAction | this_UIActionDeleteAction_1= ruleUIActionDeleteAction )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==16) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2362:5: this_UIActionNavigateAction_0= ruleUIActionNavigateAction
                    {
                     
                            newCompositeNode(grammarAccess.getUIActionSpecificationAccess().getUIActionNavigateActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUIActionNavigateAction_in_ruleUIActionSpecification5238);
                    this_UIActionNavigateAction_0=ruleUIActionNavigateAction();

                    state._fsp--;

                     
                            current = this_UIActionNavigateAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2372:5: this_UIActionDeleteAction_1= ruleUIActionDeleteAction
                    {
                     
                            newCompositeNode(grammarAccess.getUIActionSpecificationAccess().getUIActionDeleteActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUIActionDeleteAction_in_ruleUIActionSpecification5265);
                    this_UIActionDeleteAction_1=ruleUIActionDeleteAction();

                    state._fsp--;

                     
                            current = this_UIActionDeleteAction_1; 
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
    // $ANTLR end "ruleUIActionSpecification"


    // $ANTLR start "entryRuleUIActionNavigateAction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2388:1: entryRuleUIActionNavigateAction returns [EObject current=null] : iv_ruleUIActionNavigateAction= ruleUIActionNavigateAction EOF ;
    public final EObject entryRuleUIActionNavigateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIActionNavigateAction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2389:2: (iv_ruleUIActionNavigateAction= ruleUIActionNavigateAction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2390:2: iv_ruleUIActionNavigateAction= ruleUIActionNavigateAction EOF
            {
             newCompositeNode(grammarAccess.getUIActionNavigateActionRule()); 
            pushFollow(FOLLOW_ruleUIActionNavigateAction_in_entryRuleUIActionNavigateAction5300);
            iv_ruleUIActionNavigateAction=ruleUIActionNavigateAction();

            state._fsp--;

             current =iv_ruleUIActionNavigateAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIActionNavigateAction5310); 

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
    // $ANTLR end "entryRuleUIActionNavigateAction"


    // $ANTLR start "ruleUIActionNavigateAction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2397:1: ruleUIActionNavigateAction returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( ruleKeywordedID ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' ) ;
    public final EObject ruleUIActionNavigateAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2400:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( ruleKeywordedID ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2401:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( ruleKeywordedID ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2401:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( ruleKeywordedID ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2401:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( ruleKeywordedID ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) )? otherlv_6= ')'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2401:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2402:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIActionNavigateActionAccess().getUIActionNavigateActionAction_0(),
                        current);
                

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2407:2: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2408:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2408:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2409:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUIActionNavigateActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIActionNavigateAction5364); 

            		newLeafNode(otherlv_1, grammarAccess.getUIActionNavigateActionAccess().getTargetScreenScreenCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleUIActionNavigateAction5376); 

                	newLeafNode(otherlv_2, grammarAccess.getUIActionNavigateActionAccess().getFullStopKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2424:1: ( ( ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2425:1: ( ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2425:1: ( ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2426:3: ruleKeywordedID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUIActionNavigateActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getUIActionNavigateActionAccess().getActionVerbControllerVerbCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleUIActionNavigateAction5399);
            ruleKeywordedID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleUIActionNavigateAction5411); 

                	newLeafNode(otherlv_4, grammarAccess.getUIActionNavigateActionAccess().getLeftParenthesisKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2443:1: ( (otherlv_5= RULE_ID ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2444:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2444:1: (otherlv_5= RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2445:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIActionNavigateActionRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIActionNavigateAction5431); 

                    		newLeafNode(otherlv_5, grammarAccess.getUIActionNavigateActionAccess().getVariableReferrableElementCrossReference_5_0()); 
                    	

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleUIActionNavigateAction5444); 

                	newLeafNode(otherlv_6, grammarAccess.getUIActionNavigateActionAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleUIActionNavigateAction"


    // $ANTLR start "entryRuleUIActionDeleteAction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2468:1: entryRuleUIActionDeleteAction returns [EObject current=null] : iv_ruleUIActionDeleteAction= ruleUIActionDeleteAction EOF ;
    public final EObject entryRuleUIActionDeleteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIActionDeleteAction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2469:2: (iv_ruleUIActionDeleteAction= ruleUIActionDeleteAction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2470:2: iv_ruleUIActionDeleteAction= ruleUIActionDeleteAction EOF
            {
             newCompositeNode(grammarAccess.getUIActionDeleteActionRule()); 
            pushFollow(FOLLOW_ruleUIActionDeleteAction_in_entryRuleUIActionDeleteAction5480);
            iv_ruleUIActionDeleteAction=ruleUIActionDeleteAction();

            state._fsp--;

             current =iv_ruleUIActionDeleteAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIActionDeleteAction5490); 

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
    // $ANTLR end "entryRuleUIActionDeleteAction"


    // $ANTLR start "ruleUIActionDeleteAction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2477:1: ruleUIActionDeleteAction returns [EObject current=null] : ( () otherlv_1= 'delete' ) ;
    public final EObject ruleUIActionDeleteAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2480:28: ( ( () otherlv_1= 'delete' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2481:1: ( () otherlv_1= 'delete' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2481:1: ( () otherlv_1= 'delete' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2481:2: () otherlv_1= 'delete'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2481:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2482:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIActionDeleteActionAccess().getUIActionDeleteActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleUIActionDeleteAction5536); 

                	newLeafNode(otherlv_1, grammarAccess.getUIActionDeleteActionAccess().getDeleteKeyword_1());
                

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
    // $ANTLR end "ruleUIActionDeleteAction"


    // $ANTLR start "entryRuleControllerVerb"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2499:1: entryRuleControllerVerb returns [EObject current=null] : iv_ruleControllerVerb= ruleControllerVerb EOF ;
    public final EObject entryRuleControllerVerb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerVerb = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2500:2: (iv_ruleControllerVerb= ruleControllerVerb EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2501:2: iv_ruleControllerVerb= ruleControllerVerb EOF
            {
             newCompositeNode(grammarAccess.getControllerVerbRule()); 
            pushFollow(FOLLOW_ruleControllerVerb_in_entryRuleControllerVerb5572);
            iv_ruleControllerVerb=ruleControllerVerb();

            state._fsp--;

             current =iv_ruleControllerVerb; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControllerVerb5582); 

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
    // $ANTLR end "entryRuleControllerVerb"


    // $ANTLR start "ruleControllerVerb"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2508:1: ruleControllerVerb returns [EObject current=null] : ( ( (lv_kind_0_0= ruleControllerVerbKind ) ) ( (lv_name_1_0= ruleKeywordedID ) ) otherlv_2= '(' ( ( (lv_declaredParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_declaredParameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_restMethod_8_0= ruleRESTMethodCall ) )? otherlv_9= '}' ) ;
    public final EObject ruleControllerVerb() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_kind_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_declaredParameters_3_0 = null;

        EObject lv_declaredParameters_5_0 = null;

        EObject lv_restMethod_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2511:28: ( ( ( (lv_kind_0_0= ruleControllerVerbKind ) ) ( (lv_name_1_0= ruleKeywordedID ) ) otherlv_2= '(' ( ( (lv_declaredParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_declaredParameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_restMethod_8_0= ruleRESTMethodCall ) )? otherlv_9= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2512:1: ( ( (lv_kind_0_0= ruleControllerVerbKind ) ) ( (lv_name_1_0= ruleKeywordedID ) ) otherlv_2= '(' ( ( (lv_declaredParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_declaredParameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_restMethod_8_0= ruleRESTMethodCall ) )? otherlv_9= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2512:1: ( ( (lv_kind_0_0= ruleControllerVerbKind ) ) ( (lv_name_1_0= ruleKeywordedID ) ) otherlv_2= '(' ( ( (lv_declaredParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_declaredParameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_restMethod_8_0= ruleRESTMethodCall ) )? otherlv_9= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2512:2: ( (lv_kind_0_0= ruleControllerVerbKind ) ) ( (lv_name_1_0= ruleKeywordedID ) ) otherlv_2= '(' ( ( (lv_declaredParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_declaredParameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_restMethod_8_0= ruleRESTMethodCall ) )? otherlv_9= '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2512:2: ( (lv_kind_0_0= ruleControllerVerbKind ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2513:1: (lv_kind_0_0= ruleControllerVerbKind )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2513:1: (lv_kind_0_0= ruleControllerVerbKind )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2514:3: lv_kind_0_0= ruleControllerVerbKind
            {
             
            	        newCompositeNode(grammarAccess.getControllerVerbAccess().getKindControllerVerbKindEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleControllerVerbKind_in_ruleControllerVerb5628);
            lv_kind_0_0=ruleControllerVerbKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControllerVerbRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_0_0, 
                    		"ControllerVerbKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2530:2: ( (lv_name_1_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2531:1: (lv_name_1_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2531:1: (lv_name_1_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2532:3: lv_name_1_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getControllerVerbAccess().getNameKeywordedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleControllerVerb5649);
            lv_name_1_0=ruleKeywordedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControllerVerbRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"KeywordedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleControllerVerb5661); 

                	newLeafNode(otherlv_2, grammarAccess.getControllerVerbAccess().getLeftParenthesisKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2552:1: ( ( (lv_declaredParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_declaredParameters_5_0= ruleParameter ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2552:2: ( (lv_declaredParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_declaredParameters_5_0= ruleParameter ) ) )*
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2552:2: ( (lv_declaredParameters_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2553:1: (lv_declaredParameters_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2553:1: (lv_declaredParameters_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2554:3: lv_declaredParameters_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerVerbAccess().getDeclaredParametersParameterParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleControllerVerb5683);
                    lv_declaredParameters_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerVerbRule());
                    	        }
                           		add(
                           			current, 
                           			"declaredParameters",
                            		lv_declaredParameters_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2570:2: (otherlv_4= ',' ( (lv_declaredParameters_5_0= ruleParameter ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==32) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2570:4: otherlv_4= ',' ( (lv_declaredParameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleControllerVerb5696); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getControllerVerbAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2574:1: ( (lv_declaredParameters_5_0= ruleParameter ) )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2575:1: (lv_declaredParameters_5_0= ruleParameter )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2575:1: (lv_declaredParameters_5_0= ruleParameter )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2576:3: lv_declaredParameters_5_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getControllerVerbAccess().getDeclaredParametersParameterParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleControllerVerb5717);
                    	    lv_declaredParameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getControllerVerbRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaredParameters",
                    	            		lv_declaredParameters_5_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleControllerVerb5733); 

                	newLeafNode(otherlv_6, grammarAccess.getControllerVerbAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleControllerVerb5745); 

                	newLeafNode(otherlv_7, grammarAccess.getControllerVerbAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2600:1: ( (lv_restMethod_8_0= ruleRESTMethodCall ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2601:1: (lv_restMethod_8_0= ruleRESTMethodCall )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2601:1: (lv_restMethod_8_0= ruleRESTMethodCall )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2602:3: lv_restMethod_8_0= ruleRESTMethodCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerVerbAccess().getRestMethodRESTMethodCallParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRESTMethodCall_in_ruleControllerVerb5766);
                    lv_restMethod_8_0=ruleRESTMethodCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerVerbRule());
                    	        }
                           		set(
                           			current, 
                           			"restMethod",
                            		lv_restMethod_8_0, 
                            		"RESTMethodCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleControllerVerb5779); 

                	newLeafNode(otherlv_9, grammarAccess.getControllerVerbAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleControllerVerb"


    // $ANTLR start "entryRuleListItemCellDeclaration"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2630:1: entryRuleListItemCellDeclaration returns [EObject current=null] : iv_ruleListItemCellDeclaration= ruleListItemCellDeclaration EOF ;
    public final EObject entryRuleListItemCellDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListItemCellDeclaration = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2631:2: (iv_ruleListItemCellDeclaration= ruleListItemCellDeclaration EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2632:2: iv_ruleListItemCellDeclaration= ruleListItemCellDeclaration EOF
            {
             newCompositeNode(grammarAccess.getListItemCellDeclarationRule()); 
            pushFollow(FOLLOW_ruleListItemCellDeclaration_in_entryRuleListItemCellDeclaration5815);
            iv_ruleListItemCellDeclaration=ruleListItemCellDeclaration();

            state._fsp--;

             current =iv_ruleListItemCellDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListItemCellDeclaration5825); 

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
    // $ANTLR end "entryRuleListItemCellDeclaration"


    // $ANTLR start "ruleListItemCellDeclaration"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2639:1: ruleListItemCellDeclaration returns [EObject current=null] : (otherlv_0= 'listitemcell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleListItemCellDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2642:28: ( (otherlv_0= 'listitemcell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2643:1: (otherlv_0= 'listitemcell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2643:1: (otherlv_0= 'listitemcell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2643:3: otherlv_0= 'listitemcell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleListItemCellDeclaration5862); 

                	newLeafNode(otherlv_0, grammarAccess.getListItemCellDeclarationAccess().getListitemcellKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2647:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2648:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2648:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2649:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListItemCellDeclaration5879); 

            			newLeafNode(lv_name_1_0, grammarAccess.getListItemCellDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListItemCellDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleListItemCellDeclaration5896); 

                	newLeafNode(otherlv_2, grammarAccess.getListItemCellDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2669:1: ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2670:1: (lv_members_3_0= ruleUIComponentMemberDeclaration )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2670:1: (lv_members_3_0= ruleUIComponentMemberDeclaration )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2671:3: lv_members_3_0= ruleUIComponentMemberDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListItemCellDeclarationAccess().getMembersUIComponentMemberDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIComponentMemberDeclaration_in_ruleListItemCellDeclaration5917);
            	    lv_members_3_0=ruleUIComponentMemberDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getListItemCellDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"UIComponentMemberDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleListItemCellDeclaration5930); 

                	newLeafNode(otherlv_4, grammarAccess.getListItemCellDeclarationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleListItemCellDeclaration"


    // $ANTLR start "entryRuleUIComponentDeclaration"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2699:1: entryRuleUIComponentDeclaration returns [EObject current=null] : iv_ruleUIComponentDeclaration= ruleUIComponentDeclaration EOF ;
    public final EObject entryRuleUIComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponentDeclaration = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2700:2: (iv_ruleUIComponentDeclaration= ruleUIComponentDeclaration EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2701:2: iv_ruleUIComponentDeclaration= ruleUIComponentDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUIComponentDeclarationRule()); 
            pushFollow(FOLLOW_ruleUIComponentDeclaration_in_entryRuleUIComponentDeclaration5966);
            iv_ruleUIComponentDeclaration=ruleUIComponentDeclaration();

            state._fsp--;

             current =iv_ruleUIComponentDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentDeclaration5976); 

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
    // $ANTLR end "entryRuleUIComponentDeclaration"


    // $ANTLR start "ruleUIComponentDeclaration"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2708:1: ruleUIComponentDeclaration returns [EObject current=null] : (otherlv_0= 'uicomponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleUIComponentDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2711:28: ( (otherlv_0= 'uicomponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2712:1: (otherlv_0= 'uicomponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2712:1: (otherlv_0= 'uicomponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2712:3: otherlv_0= 'uicomponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleUIComponentDeclaration6013); 

                	newLeafNode(otherlv_0, grammarAccess.getUIComponentDeclarationAccess().getUicomponentKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2716:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2717:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2717:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2718:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIComponentDeclaration6030); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUIComponentDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUIComponentDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleUIComponentDeclaration6047); 

                	newLeafNode(otherlv_2, grammarAccess.getUIComponentDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2738:1: ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2739:1: (lv_members_3_0= ruleUIComponentMemberDeclaration )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2739:1: (lv_members_3_0= ruleUIComponentMemberDeclaration )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2740:3: lv_members_3_0= ruleUIComponentMemberDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIComponentDeclarationAccess().getMembersUIComponentMemberDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIComponentMemberDeclaration_in_ruleUIComponentDeclaration6068);
            	    lv_members_3_0=ruleUIComponentMemberDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIComponentDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"UIComponentMemberDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleUIComponentDeclaration6081); 

                	newLeafNode(otherlv_4, grammarAccess.getUIComponentDeclarationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleUIComponentDeclaration"


    // $ANTLR start "entryRuleUIComponentMemberDeclaration"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2768:1: entryRuleUIComponentMemberDeclaration returns [EObject current=null] : iv_ruleUIComponentMemberDeclaration= ruleUIComponentMemberDeclaration EOF ;
    public final EObject entryRuleUIComponentMemberDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponentMemberDeclaration = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2769:2: (iv_ruleUIComponentMemberDeclaration= ruleUIComponentMemberDeclaration EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2770:2: iv_ruleUIComponentMemberDeclaration= ruleUIComponentMemberDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUIComponentMemberDeclarationRule()); 
            pushFollow(FOLLOW_ruleUIComponentMemberDeclaration_in_entryRuleUIComponentMemberDeclaration6117);
            iv_ruleUIComponentMemberDeclaration=ruleUIComponentMemberDeclaration();

            state._fsp--;

             current =iv_ruleUIComponentMemberDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentMemberDeclaration6127); 

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
    // $ANTLR end "entryRuleUIComponentMemberDeclaration"


    // $ANTLR start "ruleUIComponentMemberDeclaration"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2777:1: ruleUIComponentMemberDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUIComponentMemberDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2780:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2781:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2781:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2781:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2781:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2782:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2782:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2783:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUIComponentMemberDeclarationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIComponentMemberDeclaration6172); 

            		newLeafNode(otherlv_0, grammarAccess.getUIComponentMemberDeclarationAccess().getTypeUIComponentOrDataTypeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2794:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2795:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2795:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2796:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIComponentMemberDeclaration6189); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUIComponentMemberDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUIComponentMemberDeclarationRule());
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
    // $ANTLR end "ruleUIComponentMemberDeclaration"


    // $ANTLR start "entryRuleRESTMethodCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2822:1: entryRuleRESTMethodCall returns [EObject current=null] : iv_ruleRESTMethodCall= ruleRESTMethodCall EOF ;
    public final EObject entryRuleRESTMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRESTMethodCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2823:2: (iv_ruleRESTMethodCall= ruleRESTMethodCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2824:2: iv_ruleRESTMethodCall= ruleRESTMethodCall EOF
            {
             newCompositeNode(grammarAccess.getRESTMethodCallRule()); 
            pushFollow(FOLLOW_ruleRESTMethodCall_in_entryRuleRESTMethodCall6232);
            iv_ruleRESTMethodCall=ruleRESTMethodCall();

            state._fsp--;

             current =iv_ruleRESTMethodCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTMethodCall6242); 

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
    // $ANTLR end "entryRuleRESTMethodCall"


    // $ANTLR start "ruleRESTMethodCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2831:1: ruleRESTMethodCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleKeywordedID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameterCall ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterCall ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleRESTMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2834:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleKeywordedID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameterCall ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterCall ) ) )* otherlv_7= ')' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2835:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleKeywordedID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameterCall ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterCall ) ) )* otherlv_7= ')' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2835:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleKeywordedID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameterCall ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterCall ) ) )* otherlv_7= ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2835:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleKeywordedID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameterCall ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterCall ) ) )* otherlv_7= ')'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2835:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2836:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2836:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2837:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRESTMethodCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRESTMethodCall6287); 

            		newLeafNode(otherlv_0, grammarAccess.getRESTMethodCallAccess().getDatasourceDataSourceCallCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleRESTMethodCall6299); 

                	newLeafNode(otherlv_1, grammarAccess.getRESTMethodCallAccess().getFullStopKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2852:1: ( ( ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2853:1: ( ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2853:1: ( ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2854:3: ruleKeywordedID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRESTMethodCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRESTMethodCallAccess().getRestMethodDataSourceAccessMethodCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleRESTMethodCall6322);
            ruleKeywordedID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleRESTMethodCall6334); 

                	newLeafNode(otherlv_3, grammarAccess.getRESTMethodCallAccess().getLeftParenthesisKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2871:1: ( (lv_parameters_4_0= ruleParameterCall ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2872:1: (lv_parameters_4_0= ruleParameterCall )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2872:1: (lv_parameters_4_0= ruleParameterCall )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2873:3: lv_parameters_4_0= ruleParameterCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getRESTMethodCallAccess().getParametersParameterCallParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterCall_in_ruleRESTMethodCall6355);
                    lv_parameters_4_0=ruleParameterCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRESTMethodCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_4_0, 
                            		"ParameterCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2889:3: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterCall ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==32) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2889:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameterCall ) )
            	    {
            	    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleRESTMethodCall6369); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRESTMethodCallAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2893:1: ( (lv_parameters_6_0= ruleParameterCall ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2894:1: (lv_parameters_6_0= ruleParameterCall )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2894:1: (lv_parameters_6_0= ruleParameterCall )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2895:3: lv_parameters_6_0= ruleParameterCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRESTMethodCallAccess().getParametersParameterCallParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterCall_in_ruleRESTMethodCall6390);
            	    lv_parameters_6_0=ruleParameterCall();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRESTMethodCallRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_6_0, 
            	            		"ParameterCall");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleRESTMethodCall6404); 

                	newLeafNode(otherlv_7, grammarAccess.getRESTMethodCallAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleRESTMethodCall"


    // $ANTLR start "entryRuleDataSourceCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2923:1: entryRuleDataSourceCall returns [EObject current=null] : iv_ruleDataSourceCall= ruleDataSourceCall EOF ;
    public final EObject entryRuleDataSourceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSourceCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2924:2: (iv_ruleDataSourceCall= ruleDataSourceCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2925:2: iv_ruleDataSourceCall= ruleDataSourceCall EOF
            {
             newCompositeNode(grammarAccess.getDataSourceCallRule()); 
            pushFollow(FOLLOW_ruleDataSourceCall_in_entryRuleDataSourceCall6440);
            iv_ruleDataSourceCall=ruleDataSourceCall();

            state._fsp--;

             current =iv_ruleDataSourceCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceCall6450); 

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
    // $ANTLR end "entryRuleDataSourceCall"


    // $ANTLR start "ruleDataSourceCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2932:1: ruleDataSourceCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= ruleKeywordedID ) ) ) ;
    public final EObject ruleDataSourceCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2935:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= ruleKeywordedID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2936:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= ruleKeywordedID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2936:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= ruleKeywordedID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2936:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= ruleKeywordedID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2936:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2937:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2937:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2938:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSourceCall6495); 

            		newLeafNode(otherlv_0, grammarAccess.getDataSourceCallAccess().getDatasourceDataSourceCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleDataSourceCall6507); 

                	newLeafNode(otherlv_1, grammarAccess.getDataSourceCallAccess().getAsKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2953:1: ( (lv_name_2_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2954:1: (lv_name_2_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2954:1: (lv_name_2_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2955:3: lv_name_2_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getDataSourceCallAccess().getNameKeywordedIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleDataSourceCall6528);
            lv_name_2_0=ruleKeywordedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataSourceCallRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"KeywordedID");
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
    // $ANTLR end "ruleDataSourceCall"


    // $ANTLR start "entryRuleUIComponentMemberConfiguration"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2979:1: entryRuleUIComponentMemberConfiguration returns [EObject current=null] : iv_ruleUIComponentMemberConfiguration= ruleUIComponentMemberConfiguration EOF ;
    public final EObject entryRuleUIComponentMemberConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponentMemberConfiguration = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2980:2: (iv_ruleUIComponentMemberConfiguration= ruleUIComponentMemberConfiguration EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2981:2: iv_ruleUIComponentMemberConfiguration= ruleUIComponentMemberConfiguration EOF
            {
             newCompositeNode(grammarAccess.getUIComponentMemberConfigurationRule()); 
            pushFollow(FOLLOW_ruleUIComponentMemberConfiguration_in_entryRuleUIComponentMemberConfiguration6564);
            iv_ruleUIComponentMemberConfiguration=ruleUIComponentMemberConfiguration();

            state._fsp--;

             current =iv_ruleUIComponentMemberConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentMemberConfiguration6574); 

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
    // $ANTLR end "entryRuleUIComponentMemberConfiguration"


    // $ANTLR start "ruleUIComponentMemberConfiguration"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2988:1: ruleUIComponentMemberConfiguration returns [EObject current=null] : ( ( (lv_type_0_0= ruleUIComponentMemberCall ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleUIComponentMemberConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2991:28: ( ( ( (lv_type_0_0= ruleUIComponentMemberCall ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2992:1: ( ( (lv_type_0_0= ruleUIComponentMemberCall ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2992:1: ( ( (lv_type_0_0= ruleUIComponentMemberCall ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2992:2: ( (lv_type_0_0= ruleUIComponentMemberCall ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2992:2: ( (lv_type_0_0= ruleUIComponentMemberCall ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2993:1: (lv_type_0_0= ruleUIComponentMemberCall )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2993:1: (lv_type_0_0= ruleUIComponentMemberCall )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2994:3: lv_type_0_0= ruleUIComponentMemberCall
            {
             
            	        newCompositeNode(grammarAccess.getUIComponentMemberConfigurationAccess().getTypeUIComponentMemberCallParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUIComponentMemberCall_in_ruleUIComponentMemberConfiguration6620);
            lv_type_0_0=ruleUIComponentMemberCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIComponentMemberConfigurationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"UIComponentMemberCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleUIComponentMemberConfiguration6632); 

                	newLeafNode(otherlv_1, grammarAccess.getUIComponentMemberConfigurationAccess().getEqualsSignKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3014:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3015:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3015:1: (lv_value_2_0= ruleExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3016:3: lv_value_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getUIComponentMemberConfigurationAccess().getValueExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleUIComponentMemberConfiguration6653);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIComponentMemberConfigurationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Expression");
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
    // $ANTLR end "ruleUIComponentMemberConfiguration"


    // $ANTLR start "entryRuleUIComponentMemberCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3040:1: entryRuleUIComponentMemberCall returns [EObject current=null] : iv_ruleUIComponentMemberCall= ruleUIComponentMemberCall EOF ;
    public final EObject entryRuleUIComponentMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponentMemberCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3041:2: (iv_ruleUIComponentMemberCall= ruleUIComponentMemberCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3042:2: iv_ruleUIComponentMemberCall= ruleUIComponentMemberCall EOF
            {
             newCompositeNode(grammarAccess.getUIComponentMemberCallRule()); 
            pushFollow(FOLLOW_ruleUIComponentMemberCall_in_entryRuleUIComponentMemberCall6689);
            iv_ruleUIComponentMemberCall=ruleUIComponentMemberCall();

            state._fsp--;

             current =iv_ruleUIComponentMemberCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentMemberCall6699); 

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
    // $ANTLR end "entryRuleUIComponentMemberCall"


    // $ANTLR start "ruleUIComponentMemberCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3049:1: ruleUIComponentMemberCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleUIComponentMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3052:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3053:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3053:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3053:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3053:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3054:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3054:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3055:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUIComponentMemberCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIComponentMemberCall6744); 

            		newLeafNode(otherlv_0, grammarAccess.getUIComponentMemberCallAccess().getComponentUIComponentMemberDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3066:2: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==39) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3066:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleUIComponentMemberCall6757); 

                        	newLeafNode(otherlv_1, grammarAccess.getUIComponentMemberCallAccess().getFullStopKeyword_1_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3070:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3071:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3071:1: (otherlv_2= RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3072:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIComponentMemberCallRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIComponentMemberCall6777); 

                    		newLeafNode(otherlv_2, grammarAccess.getUIComponentMemberCallAccess().getMemberUIComponentMemberDeclarationCrossReference_1_1_0()); 
                    	

                    }


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
    // $ANTLR end "ruleUIComponentMemberCall"


    // $ANTLR start "entryRuleExpression"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3091:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3092:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3093:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6815);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6825); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3100:1: ruleExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_EntityMemberCall_1= ruleEntityMemberCall ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_EntityMemberCall_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3103:28: ( (this_StringLiteral_0= ruleStringLiteral | this_EntityMemberCall_1= ruleEntityMemberCall ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3104:1: (this_StringLiteral_0= ruleStringLiteral | this_EntityMemberCall_1= ruleEntityMemberCall )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3104:1: (this_StringLiteral_0= ruleStringLiteral | this_EntityMemberCall_1= ruleEntityMemberCall )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3105:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleExpression6872);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3115:5: this_EntityMemberCall_1= ruleEntityMemberCall
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getEntityMemberCallParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityMemberCall_in_ruleExpression6899);
                    this_EntityMemberCall_1=ruleEntityMemberCall();

                    state._fsp--;

                     
                            current = this_EntityMemberCall_1; 
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


    // $ANTLR start "entryRuleParameterCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3131:1: entryRuleParameterCall returns [EObject current=null] : iv_ruleParameterCall= ruleParameterCall EOF ;
    public final EObject entryRuleParameterCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3132:2: (iv_ruleParameterCall= ruleParameterCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3133:2: iv_ruleParameterCall= ruleParameterCall EOF
            {
             newCompositeNode(grammarAccess.getParameterCallRule()); 
            pushFollow(FOLLOW_ruleParameterCall_in_entryRuleParameterCall6934);
            iv_ruleParameterCall=ruleParameterCall();

            state._fsp--;

             current =iv_ruleParameterCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterCall6944); 

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
    // $ANTLR end "entryRuleParameterCall"


    // $ANTLR start "ruleParameterCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3140:1: ruleParameterCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleParameterCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3143:28: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3144:1: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3144:1: ( () ( (otherlv_1= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3144:2: () ( (otherlv_1= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3144:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3145:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterCallAccess().getParameterCallAction_0(),
                        current);
                

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3150:2: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3151:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3151:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3152:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterCallRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterCall6998); 

            		newLeafNode(otherlv_1, grammarAccess.getParameterCallAccess().getHeadParameterCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleParameterCall"


    // $ANTLR start "entryRuleParameterMemberCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3171:1: entryRuleParameterMemberCall returns [EObject current=null] : iv_ruleParameterMemberCall= ruleParameterMemberCall EOF ;
    public final EObject entryRuleParameterMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterMemberCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3172:2: (iv_ruleParameterMemberCall= ruleParameterMemberCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3173:2: iv_ruleParameterMemberCall= ruleParameterMemberCall EOF
            {
             newCompositeNode(grammarAccess.getParameterMemberCallRule()); 
            pushFollow(FOLLOW_ruleParameterMemberCall_in_entryRuleParameterMemberCall7034);
            iv_ruleParameterMemberCall=ruleParameterMemberCall();

            state._fsp--;

             current =iv_ruleParameterMemberCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterMemberCall7044); 

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
    // $ANTLR end "entryRuleParameterMemberCall"


    // $ANTLR start "ruleParameterMemberCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3180:1: ruleParameterMemberCall returns [EObject current=null] : (this_ParameterCall_0= ruleParameterCall ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleParameterMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_ParameterCall_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3183:28: ( (this_ParameterCall_0= ruleParameterCall ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3184:1: (this_ParameterCall_0= ruleParameterCall ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3184:1: (this_ParameterCall_0= ruleParameterCall ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3185:5: this_ParameterCall_0= ruleParameterCall ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getParameterMemberCallAccess().getParameterCallParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleParameterCall_in_ruleParameterMemberCall7091);
            this_ParameterCall_0=ruleParameterCall();

            state._fsp--;

             
                    current = this_ParameterCall_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3193:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==39) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3193:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3193:2: ()
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3194:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getParameterMemberCallAccess().getParameterMemberCallReferenceAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleParameterMemberCall7112); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParameterMemberCallAccess().getFullStopKeyword_1_1());
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3203:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3204:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3204:1: (otherlv_3= RULE_ID )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3205:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getParameterMemberCallRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterMemberCall7132); 

            	    		newLeafNode(otherlv_3, grammarAccess.getParameterMemberCallAccess().getTailAttributeCrossReference_1_2_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleParameterMemberCall"


    // $ANTLR start "entryRuleEntityMemberCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3224:1: entryRuleEntityMemberCall returns [EObject current=null] : iv_ruleEntityMemberCall= ruleEntityMemberCall EOF ;
    public final EObject entryRuleEntityMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMemberCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3225:2: (iv_ruleEntityMemberCall= ruleEntityMemberCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3226:2: iv_ruleEntityMemberCall= ruleEntityMemberCall EOF
            {
             newCompositeNode(grammarAccess.getEntityMemberCallRule()); 
            pushFollow(FOLLOW_ruleEntityMemberCall_in_entryRuleEntityMemberCall7170);
            iv_ruleEntityMemberCall=ruleEntityMemberCall();

            state._fsp--;

             current =iv_ruleEntityMemberCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityMemberCall7180); 

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
    // $ANTLR end "entryRuleEntityMemberCall"


    // $ANTLR start "ruleEntityMemberCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3233:1: ruleEntityMemberCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleEntityMemberCallTail ) )? ) ;
    public final EObject ruleEntityMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tail_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3236:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleEntityMemberCallTail ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3237:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleEntityMemberCallTail ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3237:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleEntityMemberCallTail ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3237:2: ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleEntityMemberCallTail ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3237:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3238:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3238:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3239:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityMemberCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityMemberCall7225); 

            		newLeafNode(otherlv_0, grammarAccess.getEntityMemberCallAccess().getHeadAttributeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3250:2: ( (lv_tail_1_0= ruleEntityMemberCallTail ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==39) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3251:1: (lv_tail_1_0= ruleEntityMemberCallTail )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3251:1: (lv_tail_1_0= ruleEntityMemberCallTail )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3252:3: lv_tail_1_0= ruleEntityMemberCallTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityMemberCallAccess().getTailEntityMemberCallTailParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityMemberCallTail_in_ruleEntityMemberCall7246);
                    lv_tail_1_0=ruleEntityMemberCallTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityMemberCallRule());
                    	        }
                           		set(
                           			current, 
                           			"tail",
                            		lv_tail_1_0, 
                            		"EntityMemberCallTail");
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
    // $ANTLR end "ruleEntityMemberCall"


    // $ANTLR start "entryRuleEntityMemberCallTail"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3276:1: entryRuleEntityMemberCallTail returns [EObject current=null] : iv_ruleEntityMemberCallTail= ruleEntityMemberCallTail EOF ;
    public final EObject entryRuleEntityMemberCallTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMemberCallTail = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3277:2: (iv_ruleEntityMemberCallTail= ruleEntityMemberCallTail EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3278:2: iv_ruleEntityMemberCallTail= ruleEntityMemberCallTail EOF
            {
             newCompositeNode(grammarAccess.getEntityMemberCallTailRule()); 
            pushFollow(FOLLOW_ruleEntityMemberCallTail_in_entryRuleEntityMemberCallTail7283);
            iv_ruleEntityMemberCallTail=ruleEntityMemberCallTail();

            state._fsp--;

             current =iv_ruleEntityMemberCallTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityMemberCallTail7293); 

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
    // $ANTLR end "entryRuleEntityMemberCallTail"


    // $ANTLR start "ruleEntityMemberCallTail"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3285:1: ruleEntityMemberCallTail returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleEntityMemberCallTail ) )? ) ;
    public final EObject ruleEntityMemberCallTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3288:28: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleEntityMemberCallTail ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3289:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleEntityMemberCallTail ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3289:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleEntityMemberCallTail ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3289:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleEntityMemberCallTail ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEntityMemberCallTail7330); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityMemberCallTailAccess().getFullStopKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3293:1: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3294:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3294:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3295:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityMemberCallTailRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityMemberCallTail7350); 

            		newLeafNode(otherlv_1, grammarAccess.getEntityMemberCallTailAccess().getHeadAttributeCrossReference_1_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3306:2: ( (lv_tail_2_0= ruleEntityMemberCallTail ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==39) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3307:1: (lv_tail_2_0= ruleEntityMemberCallTail )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3307:1: (lv_tail_2_0= ruleEntityMemberCallTail )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3308:3: lv_tail_2_0= ruleEntityMemberCallTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityMemberCallTailAccess().getTailEntityMemberCallTailParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityMemberCallTail_in_ruleEntityMemberCallTail7371);
                    lv_tail_2_0=ruleEntityMemberCallTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityMemberCallTailRule());
                    	        }
                           		set(
                           			current, 
                           			"tail",
                            		lv_tail_2_0, 
                            		"EntityMemberCallTail");
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
    // $ANTLR end "ruleEntityMemberCallTail"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3334:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3335:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3336:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7410);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral7420); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3343:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3346:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3347:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3347:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3348:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3348:1: (lv_value_0_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3349:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7461); 

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


    // $ANTLR start "ruleRESTVerb"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3373:1: ruleRESTVerb returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleRESTVerb() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3375:28: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3376:1: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3376:1: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt58=1;
                }
                break;
            case 55:
                {
                alt58=2;
                }
                break;
            case 56:
                {
                alt58=3;
                }
                break;
            case 57:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3376:2: (enumLiteral_0= 'GET' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3376:2: (enumLiteral_0= 'GET' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3376:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleRESTVerb7515); 

                            current = grammarAccess.getRESTVerbAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRESTVerbAccess().getGETEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3382:6: (enumLiteral_1= 'POST' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3382:6: (enumLiteral_1= 'POST' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3382:8: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleRESTVerb7532); 

                            current = grammarAccess.getRESTVerbAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRESTVerbAccess().getPOSTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3388:6: (enumLiteral_2= 'PUT' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3388:6: (enumLiteral_2= 'PUT' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3388:8: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleRESTVerb7549); 

                            current = grammarAccess.getRESTVerbAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRESTVerbAccess().getPUTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3394:6: (enumLiteral_3= 'DELETE' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3394:6: (enumLiteral_3= 'DELETE' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3394:8: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_57_in_ruleRESTVerb7566); 

                            current = grammarAccess.getRESTVerbAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRESTVerbAccess().getDELETEEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleRESTVerb"


    // $ANTLR start "ruleScreenKind"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3404:1: ruleScreenKind returns [Enumerator current=null] : ( (enumLiteral_0= 'DefaultList' ) | (enumLiteral_1= 'DefaultDetails' ) ) ;
    public final Enumerator ruleScreenKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3406:28: ( ( (enumLiteral_0= 'DefaultList' ) | (enumLiteral_1= 'DefaultDetails' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3407:1: ( (enumLiteral_0= 'DefaultList' ) | (enumLiteral_1= 'DefaultDetails' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3407:1: ( (enumLiteral_0= 'DefaultList' ) | (enumLiteral_1= 'DefaultDetails' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==58) ) {
                alt59=1;
            }
            else if ( (LA59_0==59) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3407:2: (enumLiteral_0= 'DefaultList' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3407:2: (enumLiteral_0= 'DefaultList' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3407:4: enumLiteral_0= 'DefaultList'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleScreenKind7611); 

                            current = grammarAccess.getScreenKindAccess().getDefaultListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getScreenKindAccess().getDefaultListEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3413:6: (enumLiteral_1= 'DefaultDetails' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3413:6: (enumLiteral_1= 'DefaultDetails' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3413:8: enumLiteral_1= 'DefaultDetails'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleScreenKind7628); 

                            current = grammarAccess.getScreenKindAccess().getDefaultDetailsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getScreenKindAccess().getDefaultDetailsEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleScreenKind"


    // $ANTLR start "ruleGestureKind"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3423:1: ruleGestureKind returns [Enumerator current=null] : ( (enumLiteral_0= 'tap' ) | (enumLiteral_1= 'swipe' ) | (enumLiteral_2= 'longpress' ) ) ;
    public final Enumerator ruleGestureKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3425:28: ( ( (enumLiteral_0= 'tap' ) | (enumLiteral_1= 'swipe' ) | (enumLiteral_2= 'longpress' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3426:1: ( (enumLiteral_0= 'tap' ) | (enumLiteral_1= 'swipe' ) | (enumLiteral_2= 'longpress' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3426:1: ( (enumLiteral_0= 'tap' ) | (enumLiteral_1= 'swipe' ) | (enumLiteral_2= 'longpress' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt60=1;
                }
                break;
            case 61:
                {
                alt60=2;
                }
                break;
            case 62:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3426:2: (enumLiteral_0= 'tap' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3426:2: (enumLiteral_0= 'tap' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3426:4: enumLiteral_0= 'tap'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleGestureKind7673); 

                            current = grammarAccess.getGestureKindAccess().getTapEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGestureKindAccess().getTapEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3432:6: (enumLiteral_1= 'swipe' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3432:6: (enumLiteral_1= 'swipe' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3432:8: enumLiteral_1= 'swipe'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleGestureKind7690); 

                            current = grammarAccess.getGestureKindAccess().getSwipeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGestureKindAccess().getSwipeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3438:6: (enumLiteral_2= 'longpress' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3438:6: (enumLiteral_2= 'longpress' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3438:8: enumLiteral_2= 'longpress'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleGestureKind7707); 

                            current = grammarAccess.getGestureKindAccess().getLongpressEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGestureKindAccess().getLongpressEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleGestureKind"


    // $ANTLR start "ruleControllerVerbKind"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3448:1: ruleControllerVerbKind returns [Enumerator current=null] : ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'display' ) | (enumLiteral_3= 'delete' ) ) ;
    public final Enumerator ruleControllerVerbKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3450:28: ( ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'display' ) | (enumLiteral_3= 'delete' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3451:1: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'display' ) | (enumLiteral_3= 'delete' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3451:1: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'display' ) | (enumLiteral_3= 'delete' ) )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt61=1;
                }
                break;
            case 18:
                {
                alt61=2;
                }
                break;
            case 19:
                {
                alt61=3;
                }
                break;
            case 16:
                {
                alt61=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3451:2: (enumLiteral_0= 'add' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3451:2: (enumLiteral_0= 'add' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3451:4: enumLiteral_0= 'add'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_17_in_ruleControllerVerbKind7752); 

                            current = grammarAccess.getControllerVerbKindAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getControllerVerbKindAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3457:6: (enumLiteral_1= 'edit' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3457:6: (enumLiteral_1= 'edit' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3457:8: enumLiteral_1= 'edit'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_18_in_ruleControllerVerbKind7769); 

                            current = grammarAccess.getControllerVerbKindAccess().getEditEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getControllerVerbKindAccess().getEditEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3463:6: (enumLiteral_2= 'display' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3463:6: (enumLiteral_2= 'display' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3463:8: enumLiteral_2= 'display'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_19_in_ruleControllerVerbKind7786); 

                            current = grammarAccess.getControllerVerbKindAccess().getDisplayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getControllerVerbKindAccess().getDisplayEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3469:6: (enumLiteral_3= 'delete' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3469:6: (enumLiteral_3= 'delete' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3469:8: enumLiteral_3= 'delete'
                    {
                    enumLiteral_3=(Token)match(input,16,FOLLOW_16_in_ruleControllerVerbKind7803); 

                            current = grammarAccess.getControllerVerbKindAccess().getDeleteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getControllerVerbKindAccess().getDeleteEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleControllerVerbKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElement_in_ruleModel130 = new BitSet(new long[]{0x0030010010309002L});
    public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleNamedElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_ruleNamedElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_ruleNamedElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreen_in_ruleNamedElement304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentDeclaration_in_ruleNamedElement331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListItemCellDeclaration_in_ruleNamedElement358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_entryRuleKeywordedID513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeywordedID524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeywordedID564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleKeywordedID588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleKeywordedID607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleKeywordedID626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleKeywordedID645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleKeywordedID664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleKeywordedID683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleKeywordedID702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleKeywordedID721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleKeywordedID740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDataType827 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleDataType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEntity937 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEntity963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity980 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleEntity998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1018 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEntity1032 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity1053 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleEntity1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1157 = new BitSet(new long[]{0x00000000020FF810L});
    public static final BitSet FOLLOW_25_in_ruleAttribute1175 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleAttribute1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform1246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePlatform1293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlatform1310 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePlatform1327 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rulePlatformMapping_in_rulePlatform1348 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_rulePlatform1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatformMapping_in_entryRulePlatformMapping1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatformMapping1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMapping_in_rulePlatformMapping1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMapping_in_entryRuleTypeMapping1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMapping1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeMapping1534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeMapping1554 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTypeMapping1566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeMapping1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_entryRuleDataSource1624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSource1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDataSource1671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSource1688 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDataSource1705 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDataSource1717 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDataSource1729 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_ruleDataSource1750 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDataSource1762 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDataSource1774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSource1794 = new BitSet(new long[]{0x00000000010FF810L});
    public static final BitSet FOLLOW_ruleDataSourceAccessMethod_in_ruleDataSource1815 = new BitSet(new long[]{0x00000000010FF810L});
    public static final BitSet FOLLOW_24_in_ruleDataSource1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceAccessMethod_in_entryRuleDataSourceAccessMethod1864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceAccessMethod1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleDataSourceAccessMethod1920 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDataSourceAccessMethod1932 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1954 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleDataSourceAccessMethod1967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1988 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleDataSourceAccessMethod2004 = new BitSet(new long[]{0x03C0000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDataSourceAccessMethod2022 = new BitSet(new long[]{0x03C0000002000000L});
    public static final BitSet FOLLOW_ruleRESTSpecification_in_ruleDataSourceAccessMethod2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTSpecification_in_entryRuleRESTSpecification2093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTSpecification2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTVerb_in_ruleRESTSpecification2149 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleRESTURL_in_ruleRESTSpecification2170 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleRESTSpecification2183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataSourceBodySpecification_in_ruleRESTSpecification2204 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRESTSpecification2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceBodySpecification_in_entryRuleDataSourceBodySpecification2254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceBodySpecification2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSourceBodySpecification2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2398 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleParameter2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTURL_in_entryRuleRESTURL2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTURL2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_ruleRESTURL2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeRESTURL_in_ruleRESTURL2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_entryRuleAbsoluteRESTURL2574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteRESTURL2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAbsoluteRESTURL2630 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2651 = new BitSet(new long[]{0x0000001840000002L});
    public static final BitSet FOLLOW_30_in_ruleAbsoluteRESTURL2664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAbsoluteRESTURL2681 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35_in_ruleAbsoluteRESTURL2701 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2722 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_36_in_ruleAbsoluteRESTURL2737 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleUrlParameter_in_ruleAbsoluteRESTURL2758 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleAbsoluteRESTURL2771 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleUrlParameter_in_ruleAbsoluteRESTURL2792 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleUrlParameter_in_entryRuleUrlParameter2832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlParameter2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleUrlParameter2888 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUrlParameter2900 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleUrlParameter2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeRESTURL_in_entryRuleRelativeRESTURL2957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeRESTURL2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRelativeRESTURL3013 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL3034 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35_in_ruleRelativeRESTURL3047 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL3068 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_36_in_ruleRelativeRESTURL3083 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleUrlParameter_in_ruleRelativeRESTURL3104 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleRelativeRESTURL3117 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleUrlParameter_in_ruleRelativeRESTURL3138 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_entryRuleUrlFragment3178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlFragment3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPathFragment_in_ruleUrlFragment3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleUrlFragment3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPathFragment_in_entryRuleUrlPathFragment3297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlPathFragment3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUrlPathFragment3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable3387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVariable3434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterMemberCall_in_ruleVariable3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3543 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName3562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3577 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleScreen_in_entryRuleScreen3624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreen3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleScreen3671 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleScreenKind_in_ruleScreen3692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScreen3709 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_31_in_ruleScreen3727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleScreen3748 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleScreen3760 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleScreen3774 = new BitSet(new long[]{0x0000020010000800L});
    public static final BitSet FOLLOW_11_in_ruleScreen3787 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleScreen3799 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScreen3816 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_28_in_ruleScreen3836 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleScreen3848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataSourceCall_in_ruleScreen3869 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleScreen3883 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleScreen3895 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_ruleScreenSection_in_ruleScreen3916 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleScreen3929 = new BitSet(new long[]{0x00000C0001000000L});
    public static final BitSet FOLLOW_42_in_ruleScreen3942 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleScreen3954 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_ruleUIAction_in_ruleScreen3975 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_24_in_ruleScreen3988 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_43_in_ruleScreen4003 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleScreen4015 = new BitSet(new long[]{0x00000000010F0000L});
    public static final BitSet FOLLOW_ruleControllerVerb_in_ruleScreen4036 = new BitSet(new long[]{0x00000000010F0000L});
    public static final BitSet FOLLOW_24_in_ruleScreen4049 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleScreen4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenSection_in_entryRuleScreenSection4099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenSection4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleScreenSection4146 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleScreenSection4158 = new BitSet(new long[]{0x0000100010000800L});
    public static final BitSet FOLLOW_11_in_ruleScreenSection4171 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleScreenSection4183 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScreenSection4200 = new BitSet(new long[]{0x0000100010000800L});
    public static final BitSet FOLLOW_28_in_ruleScreenSection4220 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleScreenSection4232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataSourceCall_in_ruleScreenSection4253 = new BitSet(new long[]{0x0000100010000800L});
    public static final BitSet FOLLOW_ruleScreenSectionItems_in_ruleScreenSection4276 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleScreenSection4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenSectionItems_in_entryRuleScreenSectionItems4324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenSectionItems4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleScreenSectionItems4380 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleScreenSectionItems4392 = new BitSet(new long[]{0x0000200001000000L});
    public static final BitSet FOLLOW_ruleScreenListItemCell_in_ruleScreenSectionItems4413 = new BitSet(new long[]{0x0000200001000000L});
    public static final BitSet FOLLOW_24_in_ruleScreenSectionItems4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenListItemCell_in_entryRuleScreenListItemCell4462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenListItemCell4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleScreenListItemCell4509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScreenListItemCell4529 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_46_in_ruleScreenListItemCell4542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRESTMethodCall_in_ruleScreenListItemCell4563 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleScreenListItemCell4575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLoopVariable_in_ruleScreenListItemCell4596 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleScreenListItemCell4610 = new BitSet(new long[]{0x0000040001000010L});
    public static final BitSet FOLLOW_ruleUIComponentMemberConfiguration_in_ruleScreenListItemCell4631 = new BitSet(new long[]{0x0000040001000010L});
    public static final BitSet FOLLOW_42_in_ruleScreenListItemCell4645 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleScreenListItemCell4657 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_ruleUIAction_in_ruleScreenListItemCell4678 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_24_in_ruleScreenListItemCell4691 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleScreenListItemCell4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopVariable_in_entryRuleLoopVariable4743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopVariable4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoopVariable4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIAction_in_entryRuleUIAction4834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIAction4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleUIAction4881 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUIAction4893 = new BitSet(new long[]{0x0003000000000800L});
    public static final BitSet FOLLOW_11_in_ruleUIAction4906 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUIAction4918 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIAction4935 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49_in_ruleUIAction4955 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUIAction4967 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIAction4984 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleUIAction5003 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUIAction5015 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleUIActionSpecification_in_ruleUIAction5036 = new BitSet(new long[]{0x000C000001000000L});
    public static final BitSet FOLLOW_50_in_ruleUIAction5049 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUIAction5061 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleGestureKind_in_ruleUIAction5082 = new BitSet(new long[]{0x0008000001000000L});
    public static final BitSet FOLLOW_51_in_ruleUIAction5097 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUIAction5109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUIAction5126 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleUIAction5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionSpecification_in_entryRuleUIActionSpecification5181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIActionSpecification5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionNavigateAction_in_ruleUIActionSpecification5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionDeleteAction_in_ruleUIActionSpecification5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionNavigateAction_in_entryRuleUIActionNavigateAction5300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIActionNavigateAction5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIActionNavigateAction5364 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleUIActionNavigateAction5376 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleUIActionNavigateAction5399 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleUIActionNavigateAction5411 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIActionNavigateAction5431 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleUIActionNavigateAction5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionDeleteAction_in_entryRuleUIActionDeleteAction5480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIActionDeleteAction5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleUIActionDeleteAction5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControllerVerb_in_entryRuleControllerVerb5572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControllerVerb5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControllerVerbKind_in_ruleControllerVerb5628 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleControllerVerb5649 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleControllerVerb5661 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleControllerVerb5683 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleControllerVerb5696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleControllerVerb5717 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleControllerVerb5733 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleControllerVerb5745 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleRESTMethodCall_in_ruleControllerVerb5766 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleControllerVerb5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListItemCellDeclaration_in_entryRuleListItemCellDeclaration5815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListItemCellDeclaration5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleListItemCellDeclaration5862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListItemCellDeclaration5879 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleListItemCellDeclaration5896 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleUIComponentMemberDeclaration_in_ruleListItemCellDeclaration5917 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleListItemCellDeclaration5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentDeclaration_in_entryRuleUIComponentDeclaration5966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentDeclaration5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUIComponentDeclaration6013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIComponentDeclaration6030 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUIComponentDeclaration6047 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleUIComponentMemberDeclaration_in_ruleUIComponentDeclaration6068 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleUIComponentDeclaration6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberDeclaration_in_entryRuleUIComponentMemberDeclaration6117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentMemberDeclaration6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIComponentMemberDeclaration6172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIComponentMemberDeclaration6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTMethodCall_in_entryRuleRESTMethodCall6232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTMethodCall6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRESTMethodCall6287 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRESTMethodCall6299 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleRESTMethodCall6322 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRESTMethodCall6334 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_ruleParameterCall_in_ruleRESTMethodCall6355 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleRESTMethodCall6369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterCall_in_ruleRESTMethodCall6390 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleRESTMethodCall6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceCall_in_entryRuleDataSourceCall6440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceCall6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSourceCall6495 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleDataSourceCall6507 = new BitSet(new long[]{0x00000000000FF810L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleDataSourceCall6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberConfiguration_in_entryRuleUIComponentMemberConfiguration6564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentMemberConfiguration6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberCall_in_ruleUIComponentMemberConfiguration6620 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUIComponentMemberConfiguration6632 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleUIComponentMemberConfiguration6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberCall_in_entryRuleUIComponentMemberCall6689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentMemberCall6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIComponentMemberCall6744 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleUIComponentMemberCall6757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIComponentMemberCall6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleExpression6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCall_in_ruleExpression6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterCall_in_entryRuleParameterCall6934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterCall6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterCall6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterMemberCall_in_entryRuleParameterMemberCall7034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterMemberCall7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterCall_in_ruleParameterMemberCall7091 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleParameterMemberCall7112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterMemberCall7132 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCall_in_entryRuleEntityMemberCall7170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityMemberCall7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityMemberCall7225 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCallTail_in_ruleEntityMemberCall7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCallTail_in_entryRuleEntityMemberCallTail7283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityMemberCallTail7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEntityMemberCallTail7330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityMemberCallTail7350 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCallTail_in_ruleEntityMemberCallTail7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleRESTVerb7515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleRESTVerb7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleRESTVerb7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleRESTVerb7566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleScreenKind7611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleScreenKind7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleGestureKind7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleGestureKind7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleGestureKind7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleControllerVerbKind7752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleControllerVerbKind7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleControllerVerbKind7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleControllerVerbKind7803 = new BitSet(new long[]{0x0000000000000002L});

}