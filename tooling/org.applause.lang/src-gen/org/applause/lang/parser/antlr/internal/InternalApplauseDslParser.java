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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'platform'", "'resource'", "'section'", "'abstract'", "'datatype'", "'entity'", "'extends'", "'{'", "'}'", "'[]'", "'typemapping'", "'->'", "'datasource'", "'baseUrl'", "':'", "'('", "','", "')'", "'http://'", "'/'", "'.'", "'screen'", "'='", "'sections'", "'items'", "'cell'", "'foreach'", "'as'", "'actions'", "'icon'", "'action'", "'navigate'", "'delete'", "'listitemcell'", "'uicomponent'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'DefaultList'", "'DefaultDetails'", "'performaction'"
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
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

                if ( (LA1_0==12||(LA1_0>=15 && LA1_0<=17)||LA1_0==24||LA1_0==33||(LA1_0>=45 && LA1_0<=46)) ) {
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
            case 16:
            case 17:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 33:
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

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==15||LA3_0==17) ) {
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:236:1: ruleKeywordedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'title' | kw= 'platform' | kw= 'resource' | kw= 'section' | kw= 'abstract' | this_ID_5= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleKeywordedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_5=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:239:28: ( (kw= 'title' | kw= 'platform' | kw= 'resource' | kw= 'section' | kw= 'abstract' | this_ID_5= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:240:1: (kw= 'title' | kw= 'platform' | kw= 'resource' | kw= 'section' | kw= 'abstract' | this_ID_5= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:240:1: (kw= 'title' | kw= 'platform' | kw= 'resource' | kw= 'section' | kw= 'abstract' | this_ID_5= RULE_ID )
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
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:241:2: kw= 'title'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleKeywordedID562); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getTitleKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:248:2: kw= 'platform'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleKeywordedID581); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getPlatformKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:255:2: kw= 'resource'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleKeywordedID600); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getResourceKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:262:2: kw= 'section'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleKeywordedID619); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getSectionKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:269:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleKeywordedID638); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordedIDAccess().getAbstractKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:275:10: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeywordedID659); 

                    		current.merge(this_ID_5);
                        
                     
                        newLeafNode(this_ID_5, grammarAccess.getKeywordedIDAccess().getIDTerminalRuleCall_5()); 
                        

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:290:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:291:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:292:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType704);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType714); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:299:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= ruleKeywordedID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:302:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= ruleKeywordedID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:303:1: (otherlv_0= 'datatype' ( (lv_name_1_0= ruleKeywordedID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:303:1: (otherlv_0= 'datatype' ( (lv_name_1_0= ruleKeywordedID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:303:3: otherlv_0= 'datatype' ( (lv_name_1_0= ruleKeywordedID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDataType751); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:307:1: ( (lv_name_1_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:308:1: (lv_name_1_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:308:1: (lv_name_1_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:309:3: lv_name_1_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeAccess().getNameKeywordedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleDataType772);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:333:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:334:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:335:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity808);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity818); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:342:1: ruleEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) ;
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
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:345:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:346:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:346:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:346:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:346:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:347:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:347:1: (lv_abstract_0_0= 'abstract' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:348:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,15,FOLLOW_15_in_ruleEntity861); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleEntity887); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:365:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:366:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:366:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:367:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity904); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:383:2: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:383:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleEntity922); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:387:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:388:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:388:1: (otherlv_4= RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:389:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity942); 

                    		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEntity956); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:404:1: ( (lv_attributes_6_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:405:1: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:405:1: (lv_attributes_6_0= ruleAttribute )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:406:3: lv_attributes_6_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity977);
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleEntity990); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:434:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:435:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:436:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1026);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1036); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:443:1: ruleAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= ruleKeywordedID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_many_1_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:446:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= ruleKeywordedID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:447:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= ruleKeywordedID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:447:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= ruleKeywordedID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:447:2: ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= ruleKeywordedID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:447:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:448:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:448:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:449:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1081); 

            		newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:460:2: ( (lv_many_1_0= '[]' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:461:1: (lv_many_1_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:461:1: (lv_many_1_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:462:3: lv_many_1_0= '[]'
                    {
                    lv_many_1_0=(Token)match(input,21,FOLLOW_21_in_ruleAttribute1099); 

                            newLeafNode(lv_many_1_0, grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:475:3: ( (lv_name_2_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:476:1: (lv_name_2_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:476:1: (lv_name_2_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:477:3: lv_name_2_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameKeywordedIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleAttribute1134);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:501:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:502:2: (iv_rulePlatform= rulePlatform EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:503:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform1170);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform1180); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:510:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mappings_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:513:28: ( (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:514:1: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:514:1: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:514:3: otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePlatform1217); 

                	newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:518:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:519:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:519:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:520:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlatform1234); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_rulePlatform1251); 

                	newLeafNode(otherlv_2, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:540:1: ( (lv_mappings_3_0= rulePlatformMapping ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:541:1: (lv_mappings_3_0= rulePlatformMapping )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:541:1: (lv_mappings_3_0= rulePlatformMapping )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:542:3: lv_mappings_3_0= rulePlatformMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlatformAccess().getMappingsPlatformMappingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlatformMapping_in_rulePlatform1272);
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_rulePlatform1285); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:570:1: entryRulePlatformMapping returns [EObject current=null] : iv_rulePlatformMapping= rulePlatformMapping EOF ;
    public final EObject entryRulePlatformMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformMapping = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:571:2: (iv_rulePlatformMapping= rulePlatformMapping EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:572:2: iv_rulePlatformMapping= rulePlatformMapping EOF
            {
             newCompositeNode(grammarAccess.getPlatformMappingRule()); 
            pushFollow(FOLLOW_rulePlatformMapping_in_entryRulePlatformMapping1321);
            iv_rulePlatformMapping=rulePlatformMapping();

            state._fsp--;

             current =iv_rulePlatformMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatformMapping1331); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:579:1: rulePlatformMapping returns [EObject current=null] : this_TypeMapping_0= ruleTypeMapping ;
    public final EObject rulePlatformMapping() throws RecognitionException {
        EObject current = null;

        EObject this_TypeMapping_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:582:28: (this_TypeMapping_0= ruleTypeMapping )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:584:5: this_TypeMapping_0= ruleTypeMapping
            {
             
                    newCompositeNode(grammarAccess.getPlatformMappingAccess().getTypeMappingParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTypeMapping_in_rulePlatformMapping1377);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:600:1: entryRuleTypeMapping returns [EObject current=null] : iv_ruleTypeMapping= ruleTypeMapping EOF ;
    public final EObject entryRuleTypeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMapping = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:601:2: (iv_ruleTypeMapping= ruleTypeMapping EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:602:2: iv_ruleTypeMapping= ruleTypeMapping EOF
            {
             newCompositeNode(grammarAccess.getTypeMappingRule()); 
            pushFollow(FOLLOW_ruleTypeMapping_in_entryRuleTypeMapping1411);
            iv_ruleTypeMapping=ruleTypeMapping();

            state._fsp--;

             current =iv_ruleTypeMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMapping1421); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:609:1: ruleTypeMapping returns [EObject current=null] : (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_simpleName_3_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:612:28: ( (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:613:1: (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:613:1: (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:613:3: otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTypeMapping1458); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeMappingAccess().getTypemappingKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:617:1: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:618:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:618:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:619:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeMappingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeMapping1478); 

            		newLeafNode(otherlv_1, grammarAccess.getTypeMappingAccess().getTypeDataTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleTypeMapping1490); 

                	newLeafNode(otherlv_2, grammarAccess.getTypeMappingAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:634:1: ( (lv_simpleName_3_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:635:1: (lv_simpleName_3_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:635:1: (lv_simpleName_3_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:636:3: lv_simpleName_3_0= RULE_ID
            {
            lv_simpleName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeMapping1507); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:660:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:661:2: (iv_ruleDataSource= ruleDataSource EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:662:2: iv_ruleDataSource= ruleDataSource EOF
            {
             newCompositeNode(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_ruleDataSource_in_entryRuleDataSource1548);
            iv_ruleDataSource=ruleDataSource();

            state._fsp--;

             current =iv_ruleDataSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSource1558); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:669:1: ruleDataSource returns [EObject current=null] : (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' ) ;
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
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:672:28: ( (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:673:1: (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:673:1: (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:673:3: otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleDataSource1595); 

                	newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getDatasourceKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:677:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:678:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:678:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:679:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSource1612); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDataSource1629); 

                	newLeafNode(otherlv_2, grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleDataSource1641); 

                	newLeafNode(otherlv_3, grammarAccess.getDataSourceAccess().getBaseUrlKeyword_3());
                
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleDataSource1653); 

                	newLeafNode(otherlv_4, grammarAccess.getDataSourceAccess().getColonKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:707:1: ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:708:1: (lv_baseUrl_5_0= ruleAbsoluteRESTURL )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:708:1: (lv_baseUrl_5_0= ruleAbsoluteRESTURL )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:709:3: lv_baseUrl_5_0= ruleAbsoluteRESTURL
            {
             
            	        newCompositeNode(grammarAccess.getDataSourceAccess().getBaseUrlAbsoluteRESTURLParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_ruleDataSource1674);
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

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleDataSource1686); 

                	newLeafNode(otherlv_6, grammarAccess.getDataSourceAccess().getResourceKeyword_6());
                
            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleDataSource1698); 

                	newLeafNode(otherlv_7, grammarAccess.getDataSourceAccess().getColonKeyword_7());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:733:1: ( (otherlv_8= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:734:1: (otherlv_8= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:734:1: (otherlv_8= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:735:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSource1718); 

            		newLeafNode(otherlv_8, grammarAccess.getDataSourceAccess().getResourceTypeEntityCrossReference_8_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:746:2: ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=11 && LA10_0<=15)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:747:1: (lv_methods_9_0= ruleDataSourceAccessMethod )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:747:1: (lv_methods_9_0= ruleDataSourceAccessMethod )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:748:3: lv_methods_9_0= ruleDataSourceAccessMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSourceAccess().getMethodsDataSourceAccessMethodParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataSourceAccessMethod_in_ruleDataSource1739);
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

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleDataSource1752); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:776:1: entryRuleDataSourceAccessMethod returns [EObject current=null] : iv_ruleDataSourceAccessMethod= ruleDataSourceAccessMethod EOF ;
    public final EObject entryRuleDataSourceAccessMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSourceAccessMethod = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:777:2: (iv_ruleDataSourceAccessMethod= ruleDataSourceAccessMethod EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:778:2: iv_ruleDataSourceAccessMethod= ruleDataSourceAccessMethod EOF
            {
             newCompositeNode(grammarAccess.getDataSourceAccessMethodRule()); 
            pushFollow(FOLLOW_ruleDataSourceAccessMethod_in_entryRuleDataSourceAccessMethod1788);
            iv_ruleDataSourceAccessMethod=ruleDataSourceAccessMethod();

            state._fsp--;

             current =iv_ruleDataSourceAccessMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceAccessMethod1798); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:785:1: ruleDataSourceAccessMethod returns [EObject current=null] : ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) ) ;
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
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:788:28: ( ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:789:1: ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:789:1: ( ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:789:2: ( (lv_name_0_0= ruleKeywordedID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:789:2: ( (lv_name_0_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:790:1: (lv_name_0_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:790:1: (lv_name_0_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:791:3: lv_name_0_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getNameKeywordedIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleDataSourceAccessMethod1844);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleDataSourceAccessMethod1856); 

                	newLeafNode(otherlv_1, grammarAccess.getDataSourceAccessMethodAccess().getLeftParenthesisKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:811:1: ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:811:2: ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )*
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:811:2: ( (lv_declaredParameters_2_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:812:1: (lv_declaredParameters_2_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:812:1: (lv_declaredParameters_2_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:813:3: lv_declaredParameters_2_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1878);
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

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:829:2: (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:829:4: otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleDataSourceAccessMethod1891); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getDataSourceAccessMethodAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:833:1: ( (lv_declaredParameters_4_0= ruleParameter ) )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:834:1: (lv_declaredParameters_4_0= ruleParameter )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:834:1: (lv_declaredParameters_4_0= ruleParameter )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:835:3: lv_declaredParameters_4_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1912);
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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleDataSourceAccessMethod1928); 

                	newLeafNode(otherlv_5, grammarAccess.getDataSourceAccessMethodAccess().getRightParenthesisKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:855:1: ( (lv_returnsMany_6_0= '[]' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:856:1: (lv_returnsMany_6_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:856:1: (lv_returnsMany_6_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:857:3: lv_returnsMany_6_0= '[]'
                    {
                    lv_returnsMany_6_0=(Token)match(input,21,FOLLOW_21_in_ruleDataSourceAccessMethod1946); 

                            newLeafNode(lv_returnsMany_6_0, grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyLeftSquareBracketRightSquareBracketKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSourceAccessMethodRule());
                    	        }
                           		setWithLastConsumed(current, "returnsMany", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:870:3: ( (lv_restSpecification_7_0= ruleRESTSpecification ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:871:1: (lv_restSpecification_7_0= ruleRESTSpecification )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:871:1: (lv_restSpecification_7_0= ruleRESTSpecification )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:872:3: lv_restSpecification_7_0= ruleRESTSpecification
            {
             
            	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getRestSpecificationRESTSpecificationParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRESTSpecification_in_ruleDataSourceAccessMethod1981);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:896:1: entryRuleRESTSpecification returns [EObject current=null] : iv_ruleRESTSpecification= ruleRESTSpecification EOF ;
    public final EObject entryRuleRESTSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRESTSpecification = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:897:2: (iv_ruleRESTSpecification= ruleRESTSpecification EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:898:2: iv_ruleRESTSpecification= ruleRESTSpecification EOF
            {
             newCompositeNode(grammarAccess.getRESTSpecificationRule()); 
            pushFollow(FOLLOW_ruleRESTSpecification_in_entryRuleRESTSpecification2017);
            iv_ruleRESTSpecification=ruleRESTSpecification();

            state._fsp--;

             current =iv_ruleRESTSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTSpecification2027); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:905:1: ruleRESTSpecification returns [EObject current=null] : ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleRESTSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_verb_0_0 = null;

        EObject lv_path_1_0 = null;

        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:908:28: ( ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:909:1: ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:909:1: ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:909:2: ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:909:2: ( (lv_verb_0_0= ruleRESTVerb ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:910:1: (lv_verb_0_0= ruleRESTVerb )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:910:1: (lv_verb_0_0= ruleRESTVerb )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:911:3: lv_verb_0_0= ruleRESTVerb
            {
             
            	        newCompositeNode(grammarAccess.getRESTSpecificationAccess().getVerbRESTVerbEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRESTVerb_in_ruleRESTSpecification2073);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:927:2: ( (lv_path_1_0= ruleRESTURL ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:928:1: (lv_path_1_0= ruleRESTURL )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:928:1: (lv_path_1_0= ruleRESTURL )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:929:3: lv_path_1_0= ruleRESTURL
            {
             
            	        newCompositeNode(grammarAccess.getRESTSpecificationAccess().getPathRESTURLParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRESTURL_in_ruleRESTSpecification2094);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:945:2: (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:945:4: otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRESTSpecification2107); 

                        	newLeafNode(otherlv_2, grammarAccess.getRESTSpecificationAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:949:1: ( (lv_body_3_0= ruleDataSourceBodySpecification ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:950:1: (lv_body_3_0= ruleDataSourceBodySpecification )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:950:1: (lv_body_3_0= ruleDataSourceBodySpecification )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:951:3: lv_body_3_0= ruleDataSourceBodySpecification
                    {
                     
                    	        newCompositeNode(grammarAccess.getRESTSpecificationAccess().getBodyDataSourceBodySpecificationParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataSourceBodySpecification_in_ruleRESTSpecification2128);
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

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleRESTSpecification2140); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:979:1: entryRuleDataSourceBodySpecification returns [EObject current=null] : iv_ruleDataSourceBodySpecification= ruleDataSourceBodySpecification EOF ;
    public final EObject entryRuleDataSourceBodySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSourceBodySpecification = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:980:2: (iv_ruleDataSourceBodySpecification= ruleDataSourceBodySpecification EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:981:2: iv_ruleDataSourceBodySpecification= ruleDataSourceBodySpecification EOF
            {
             newCompositeNode(grammarAccess.getDataSourceBodySpecificationRule()); 
            pushFollow(FOLLOW_ruleDataSourceBodySpecification_in_entryRuleDataSourceBodySpecification2178);
            iv_ruleDataSourceBodySpecification=ruleDataSourceBodySpecification();

            state._fsp--;

             current =iv_ruleDataSourceBodySpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceBodySpecification2188); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:988:1: ruleDataSourceBodySpecification returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDataSourceBodySpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:991:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:992:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:992:1: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:993:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:993:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:994:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceBodySpecificationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSourceBodySpecification2232); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1013:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1014:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1015:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2267);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2277); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1022:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= ruleKeywordedID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1025:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= ruleKeywordedID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1026:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= ruleKeywordedID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1026:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= ruleKeywordedID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1026:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= ruleKeywordedID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1026:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1027:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1027:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1028:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2322); 

            		newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1039:2: ( (lv_name_1_0= ruleKeywordedID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1040:1: (lv_name_1_0= ruleKeywordedID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1040:1: (lv_name_1_0= ruleKeywordedID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1041:3: lv_name_1_0= ruleKeywordedID
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameKeywordedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKeywordedID_in_ruleParameter2343);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1065:1: entryRuleRESTURL returns [EObject current=null] : iv_ruleRESTURL= ruleRESTURL EOF ;
    public final EObject entryRuleRESTURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRESTURL = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1066:2: (iv_ruleRESTURL= ruleRESTURL EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1067:2: iv_ruleRESTURL= ruleRESTURL EOF
            {
             newCompositeNode(grammarAccess.getRESTURLRule()); 
            pushFollow(FOLLOW_ruleRESTURL_in_entryRuleRESTURL2379);
            iv_ruleRESTURL=ruleRESTURL();

            state._fsp--;

             current =iv_ruleRESTURL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTURL2389); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1074:1: ruleRESTURL returns [EObject current=null] : (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL ) ;
    public final EObject ruleRESTURL() throws RecognitionException {
        EObject current = null;

        EObject this_AbsoluteRESTURL_0 = null;

        EObject this_RelativeRESTURL_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1077:28: ( (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1078:1: (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1078:1: (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==31) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1079:5: this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL
                    {
                     
                            newCompositeNode(grammarAccess.getRESTURLAccess().getAbsoluteRESTURLParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_ruleRESTURL2436);
                    this_AbsoluteRESTURL_0=ruleAbsoluteRESTURL();

                    state._fsp--;

                     
                            current = this_AbsoluteRESTURL_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1089:5: this_RelativeRESTURL_1= ruleRelativeRESTURL
                    {
                     
                            newCompositeNode(grammarAccess.getRESTURLAccess().getRelativeRESTURLParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRelativeRESTURL_in_ruleRESTURL2463);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1105:1: entryRuleAbsoluteRESTURL returns [EObject current=null] : iv_ruleAbsoluteRESTURL= ruleAbsoluteRESTURL EOF ;
    public final EObject entryRuleAbsoluteRESTURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteRESTURL = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1106:2: (iv_ruleAbsoluteRESTURL= ruleAbsoluteRESTURL EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1107:2: iv_ruleAbsoluteRESTURL= ruleAbsoluteRESTURL EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteRESTURLRule()); 
            pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_entryRuleAbsoluteRESTURL2498);
            iv_ruleAbsoluteRESTURL=ruleAbsoluteRESTURL();

            state._fsp--;

             current =iv_ruleAbsoluteRESTURL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteRESTURL2508); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1114:1: ruleAbsoluteRESTURL returns [EObject current=null] : ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* ) ;
    public final EObject ruleAbsoluteRESTURL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_port_4_0=null;
        Token otherlv_5=null;
        EObject lv_host_2_0 = null;

        EObject lv_fragments_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1117:28: ( ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1118:1: ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1118:1: ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1118:2: () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1118:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1119:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAbsoluteRESTURLAccess().getAbsoluteRESTURLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleAbsoluteRESTURL2554); 

                	newLeafNode(otherlv_1, grammarAccess.getAbsoluteRESTURLAccess().getHttpKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1128:1: ( (lv_host_2_0= ruleUrlFragment ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1129:1: (lv_host_2_0= ruleUrlFragment )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1129:1: (lv_host_2_0= ruleUrlFragment )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1130:3: lv_host_2_0= ruleUrlFragment
            {
             
            	        newCompositeNode(grammarAccess.getAbsoluteRESTURLAccess().getHostUrlFragmentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2575);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1146:2: (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1146:4: otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleAbsoluteRESTURL2588); 

                        	newLeafNode(otherlv_3, grammarAccess.getAbsoluteRESTURLAccess().getColonKeyword_3_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1150:1: ( (lv_port_4_0= RULE_INT ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1151:1: (lv_port_4_0= RULE_INT )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1151:1: (lv_port_4_0= RULE_INT )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1152:3: lv_port_4_0= RULE_INT
                    {
                    lv_port_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAbsoluteRESTURL2605); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1168:4: (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1168:6: otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) )
            	    {
            	    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleAbsoluteRESTURL2625); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAbsoluteRESTURLAccess().getSolidusKeyword_4_0());
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1172:1: ( (lv_fragments_6_0= ruleUrlFragment ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1173:1: (lv_fragments_6_0= ruleUrlFragment )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1173:1: (lv_fragments_6_0= ruleUrlFragment )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1174:3: lv_fragments_6_0= ruleUrlFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAbsoluteRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2646);
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


    // $ANTLR start "entryRuleRelativeRESTURL"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1198:1: entryRuleRelativeRESTURL returns [EObject current=null] : iv_ruleRelativeRESTURL= ruleRelativeRESTURL EOF ;
    public final EObject entryRuleRelativeRESTURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeRESTURL = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1199:2: (iv_ruleRelativeRESTURL= ruleRelativeRESTURL EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1200:2: iv_ruleRelativeRESTURL= ruleRelativeRESTURL EOF
            {
             newCompositeNode(grammarAccess.getRelativeRESTURLRule()); 
            pushFollow(FOLLOW_ruleRelativeRESTURL_in_entryRuleRelativeRESTURL2684);
            iv_ruleRelativeRESTURL=ruleRelativeRESTURL();

            state._fsp--;

             current =iv_ruleRelativeRESTURL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeRESTURL2694); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1207:1: ruleRelativeRESTURL returns [EObject current=null] : ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* ) ;
    public final EObject ruleRelativeRESTURL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fragments_2_0 = null;

        EObject lv_fragments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1210:28: ( ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1211:1: ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1211:1: ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1211:2: () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1211:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1212:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRelativeRESTURLAccess().getRelativeRESTURLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleRelativeRESTURL2740); 

                	newLeafNode(otherlv_1, grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1221:1: ( (lv_fragments_2_0= ruleUrlFragment ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1222:1: (lv_fragments_2_0= ruleUrlFragment )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1222:1: (lv_fragments_2_0= ruleUrlFragment )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1223:3: lv_fragments_2_0= ruleUrlFragment
            {
             
            	        newCompositeNode(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL2761);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1239:2: (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1239:4: otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleRelativeRESTURL2774); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_3_0());
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1243:1: ( (lv_fragments_4_0= ruleUrlFragment ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1244:1: (lv_fragments_4_0= ruleUrlFragment )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1244:1: (lv_fragments_4_0= ruleUrlFragment )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1245:3: lv_fragments_4_0= ruleUrlFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL2795);
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
            	    break loop18;
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
    // $ANTLR end "ruleRelativeRESTURL"


    // $ANTLR start "entryRuleUrlFragment"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1269:1: entryRuleUrlFragment returns [EObject current=null] : iv_ruleUrlFragment= ruleUrlFragment EOF ;
    public final EObject entryRuleUrlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlFragment = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1270:2: (iv_ruleUrlFragment= ruleUrlFragment EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1271:2: iv_ruleUrlFragment= ruleUrlFragment EOF
            {
             newCompositeNode(grammarAccess.getUrlFragmentRule()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_entryRuleUrlFragment2833);
            iv_ruleUrlFragment=ruleUrlFragment();

            state._fsp--;

             current =iv_ruleUrlFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlFragment2843); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1278:1: ruleUrlFragment returns [EObject current=null] : (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable ) ;
    public final EObject ruleUrlFragment() throws RecognitionException {
        EObject current = null;

        EObject this_UrlPathFragment_0 = null;

        EObject this_Variable_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1281:28: ( (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1282:1: (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1282:1: (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==26) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1283:5: this_UrlPathFragment_0= ruleUrlPathFragment
                    {
                     
                            newCompositeNode(grammarAccess.getUrlFragmentAccess().getUrlPathFragmentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUrlPathFragment_in_ruleUrlFragment2890);
                    this_UrlPathFragment_0=ruleUrlPathFragment();

                    state._fsp--;

                     
                            current = this_UrlPathFragment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1293:5: this_Variable_1= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getUrlFragmentAccess().getVariableParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleUrlFragment2917);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1309:1: entryRuleUrlPathFragment returns [EObject current=null] : iv_ruleUrlPathFragment= ruleUrlPathFragment EOF ;
    public final EObject entryRuleUrlPathFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlPathFragment = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1310:2: (iv_ruleUrlPathFragment= ruleUrlPathFragment EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1311:2: iv_ruleUrlPathFragment= ruleUrlPathFragment EOF
            {
             newCompositeNode(grammarAccess.getUrlPathFragmentRule()); 
            pushFollow(FOLLOW_ruleUrlPathFragment_in_entryRuleUrlPathFragment2952);
            iv_ruleUrlPathFragment=ruleUrlPathFragment();

            state._fsp--;

             current =iv_ruleUrlPathFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlPathFragment2962); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1318:1: ruleUrlPathFragment returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleUrlPathFragment() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1321:28: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1322:1: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1322:1: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1323:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1323:1: (lv_name_0_0= ruleQualifiedName )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1324:3: lv_name_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getUrlPathFragmentAccess().getNameQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleUrlPathFragment3007);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1348:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1349:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1350:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable3042);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3052); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1357:1: ruleVariable returns [EObject current=null] : (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1360:28: ( (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1361:1: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1361:1: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1361:3: otherlv_0= ':' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleVariable3089); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getColonKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1365:1: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1366:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1366:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1367:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable3109); 

            		newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getParameterReferenceParameterCrossReference_1_0()); 
            	

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1386:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1387:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1388:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3146);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3157); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1395:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1398:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1399:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1399:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1399:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3197); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1406:1: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1407:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedName3216); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3231); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1427:1: entryRuleScreen returns [EObject current=null] : iv_ruleScreen= ruleScreen EOF ;
    public final EObject entryRuleScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreen = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1428:2: (iv_ruleScreen= ruleScreen EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1429:2: iv_ruleScreen= ruleScreen EOF
            {
             newCompositeNode(grammarAccess.getScreenRule()); 
            pushFollow(FOLLOW_ruleScreen_in_entryRuleScreen3278);
            iv_ruleScreen=ruleScreen();

            state._fsp--;

             current =iv_ruleScreen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreen3288); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1436:1: ruleScreen returns [EObject current=null] : (otherlv_0= 'screen' ( (lv_kind_1_0= ruleScreenKind ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )? otherlv_13= 'sections' otherlv_14= '{' ( (lv_sections_15_0= ruleScreenSection ) )* otherlv_16= '}' otherlv_17= '}' ) ;
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
        Enumerator lv_kind_1_0 = null;

        EObject lv_inputParameter_4_0 = null;

        EObject lv_datasource_12_0 = null;

        EObject lv_sections_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1439:28: ( (otherlv_0= 'screen' ( (lv_kind_1_0= ruleScreenKind ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )? otherlv_13= 'sections' otherlv_14= '{' ( (lv_sections_15_0= ruleScreenSection ) )* otherlv_16= '}' otherlv_17= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1440:1: (otherlv_0= 'screen' ( (lv_kind_1_0= ruleScreenKind ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )? otherlv_13= 'sections' otherlv_14= '{' ( (lv_sections_15_0= ruleScreenSection ) )* otherlv_16= '}' otherlv_17= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1440:1: (otherlv_0= 'screen' ( (lv_kind_1_0= ruleScreenKind ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )? otherlv_13= 'sections' otherlv_14= '{' ( (lv_sections_15_0= ruleScreenSection ) )* otherlv_16= '}' otherlv_17= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1440:3: otherlv_0= 'screen' ( (lv_kind_1_0= ruleScreenKind ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )? otherlv_6= '{' (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )? otherlv_13= 'sections' otherlv_14= '{' ( (lv_sections_15_0= ruleScreenSection ) )* otherlv_16= '}' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleScreen3325); 

                	newLeafNode(otherlv_0, grammarAccess.getScreenAccess().getScreenKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1444:1: ( (lv_kind_1_0= ruleScreenKind ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1445:1: (lv_kind_1_0= ruleScreenKind )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1445:1: (lv_kind_1_0= ruleScreenKind )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1446:3: lv_kind_1_0= ruleScreenKind
            {
             
            	        newCompositeNode(grammarAccess.getScreenAccess().getKindScreenKindEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleScreenKind_in_ruleScreen3346);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1462:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1463:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1463:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1464:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScreen3363); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1480:2: (otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1480:4: otherlv_3= '(' ( (lv_inputParameter_4_0= ruleParameter ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleScreen3381); 

                        	newLeafNode(otherlv_3, grammarAccess.getScreenAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1484:1: ( (lv_inputParameter_4_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1485:1: (lv_inputParameter_4_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1485:1: (lv_inputParameter_4_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1486:3: lv_inputParameter_4_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getScreenAccess().getInputParameterParameterParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleScreen3402);
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

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleScreen3414); 

                        	newLeafNode(otherlv_5, grammarAccess.getScreenAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleScreen3428); 

                	newLeafNode(otherlv_6, grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1510:1: (otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==11) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1510:3: otherlv_7= 'title' otherlv_8= '=' ( (lv_title_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleScreen3441); 

                        	newLeafNode(otherlv_7, grammarAccess.getScreenAccess().getTitleKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleScreen3453); 

                        	newLeafNode(otherlv_8, grammarAccess.getScreenAccess().getEqualsSignKeyword_5_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1518:1: ( (lv_title_9_0= RULE_STRING ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1519:1: (lv_title_9_0= RULE_STRING )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1519:1: (lv_title_9_0= RULE_STRING )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1520:3: lv_title_9_0= RULE_STRING
                    {
                    lv_title_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScreen3470); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1536:4: (otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1536:6: otherlv_10= 'datasource' otherlv_11= '=' ( (lv_datasource_12_0= ruleDataSourceCall ) )
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleScreen3490); 

                        	newLeafNode(otherlv_10, grammarAccess.getScreenAccess().getDatasourceKeyword_6_0());
                        
                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleScreen3502); 

                        	newLeafNode(otherlv_11, grammarAccess.getScreenAccess().getEqualsSignKeyword_6_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1544:1: ( (lv_datasource_12_0= ruleDataSourceCall ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1545:1: (lv_datasource_12_0= ruleDataSourceCall )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1545:1: (lv_datasource_12_0= ruleDataSourceCall )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1546:3: lv_datasource_12_0= ruleDataSourceCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getScreenAccess().getDatasourceDataSourceCallParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataSourceCall_in_ruleScreen3523);
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

            otherlv_13=(Token)match(input,35,FOLLOW_35_in_ruleScreen3537); 

                	newLeafNode(otherlv_13, grammarAccess.getScreenAccess().getSectionsKeyword_7());
                
            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleScreen3549); 

                	newLeafNode(otherlv_14, grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1570:1: ( (lv_sections_15_0= ruleScreenSection ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1571:1: (lv_sections_15_0= ruleScreenSection )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1571:1: (lv_sections_15_0= ruleScreenSection )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1572:3: lv_sections_15_0= ruleScreenSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScreenAccess().getSectionsScreenSectionParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScreenSection_in_ruleScreen3570);
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
            	    break loop24;
                }
            } while (true);

            otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleScreen3583); 

                	newLeafNode(otherlv_16, grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleScreen3595); 

                	newLeafNode(otherlv_17, grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1604:1: entryRuleScreenSection returns [EObject current=null] : iv_ruleScreenSection= ruleScreenSection EOF ;
    public final EObject entryRuleScreenSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenSection = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1605:2: (iv_ruleScreenSection= ruleScreenSection EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1606:2: iv_ruleScreenSection= ruleScreenSection EOF
            {
             newCompositeNode(grammarAccess.getScreenSectionRule()); 
            pushFollow(FOLLOW_ruleScreenSection_in_entryRuleScreenSection3631);
            iv_ruleScreenSection=ruleScreenSection();

            state._fsp--;

             current =iv_ruleScreenSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenSection3641); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1613:1: ruleScreenSection returns [EObject current=null] : (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )? ( (lv_items_8_0= ruleScreenSectionItems ) ) otherlv_9= '}' ) ;
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
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1616:28: ( (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )? ( (lv_items_8_0= ruleScreenSectionItems ) ) otherlv_9= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1617:1: (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )? ( (lv_items_8_0= ruleScreenSectionItems ) ) otherlv_9= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1617:1: (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )? ( (lv_items_8_0= ruleScreenSectionItems ) ) otherlv_9= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1617:3: otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )? ( (lv_items_8_0= ruleScreenSectionItems ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleScreenSection3678); 

                	newLeafNode(otherlv_0, grammarAccess.getScreenSectionAccess().getSectionKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleScreenSection3690); 

                	newLeafNode(otherlv_1, grammarAccess.getScreenSectionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1625:1: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==11) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1625:3: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleScreenSection3703); 

                        	newLeafNode(otherlv_2, grammarAccess.getScreenSectionAccess().getTitleKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleScreenSection3715); 

                        	newLeafNode(otherlv_3, grammarAccess.getScreenSectionAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1633:1: ( (lv_title_4_0= RULE_STRING ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1634:1: (lv_title_4_0= RULE_STRING )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1634:1: (lv_title_4_0= RULE_STRING )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1635:3: lv_title_4_0= RULE_STRING
                    {
                    lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScreenSection3732); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1651:4: (otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1651:6: otherlv_5= 'datasource' otherlv_6= '=' ( (lv_datasource_7_0= ruleDataSourceCall ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleScreenSection3752); 

                        	newLeafNode(otherlv_5, grammarAccess.getScreenSectionAccess().getDatasourceKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleScreenSection3764); 

                        	newLeafNode(otherlv_6, grammarAccess.getScreenSectionAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1659:1: ( (lv_datasource_7_0= ruleDataSourceCall ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1660:1: (lv_datasource_7_0= ruleDataSourceCall )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1660:1: (lv_datasource_7_0= ruleDataSourceCall )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1661:3: lv_datasource_7_0= ruleDataSourceCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getScreenSectionAccess().getDatasourceDataSourceCallParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataSourceCall_in_ruleScreenSection3785);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1677:4: ( (lv_items_8_0= ruleScreenSectionItems ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1678:1: (lv_items_8_0= ruleScreenSectionItems )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1678:1: (lv_items_8_0= ruleScreenSectionItems )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1679:3: lv_items_8_0= ruleScreenSectionItems
            {
             
            	        newCompositeNode(grammarAccess.getScreenSectionAccess().getItemsScreenSectionItemsParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleScreenSectionItems_in_ruleScreenSection3808);
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

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleScreenSection3820); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1707:1: entryRuleScreenSectionItems returns [EObject current=null] : iv_ruleScreenSectionItems= ruleScreenSectionItems EOF ;
    public final EObject entryRuleScreenSectionItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenSectionItems = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1708:2: (iv_ruleScreenSectionItems= ruleScreenSectionItems EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1709:2: iv_ruleScreenSectionItems= ruleScreenSectionItems EOF
            {
             newCompositeNode(grammarAccess.getScreenSectionItemsRule()); 
            pushFollow(FOLLOW_ruleScreenSectionItems_in_entryRuleScreenSectionItems3856);
            iv_ruleScreenSectionItems=ruleScreenSectionItems();

            state._fsp--;

             current =iv_ruleScreenSectionItems; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenSectionItems3866); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1716:1: ruleScreenSectionItems returns [EObject current=null] : ( () otherlv_1= 'items' otherlv_2= '{' ( (lv_items_3_0= ruleScreenListItemCell ) )* otherlv_4= '}' ) ;
    public final EObject ruleScreenSectionItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1719:28: ( ( () otherlv_1= 'items' otherlv_2= '{' ( (lv_items_3_0= ruleScreenListItemCell ) )* otherlv_4= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1720:1: ( () otherlv_1= 'items' otherlv_2= '{' ( (lv_items_3_0= ruleScreenListItemCell ) )* otherlv_4= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1720:1: ( () otherlv_1= 'items' otherlv_2= '{' ( (lv_items_3_0= ruleScreenListItemCell ) )* otherlv_4= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1720:2: () otherlv_1= 'items' otherlv_2= '{' ( (lv_items_3_0= ruleScreenListItemCell ) )* otherlv_4= '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1720:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1721:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getScreenSectionItemsAccess().getScreenSectionItemsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleScreenSectionItems3912); 

                	newLeafNode(otherlv_1, grammarAccess.getScreenSectionItemsAccess().getItemsKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleScreenSectionItems3924); 

                	newLeafNode(otherlv_2, grammarAccess.getScreenSectionItemsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1734:1: ( (lv_items_3_0= ruleScreenListItemCell ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==37) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1735:1: (lv_items_3_0= ruleScreenListItemCell )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1735:1: (lv_items_3_0= ruleScreenListItemCell )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1736:3: lv_items_3_0= ruleScreenListItemCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScreenSectionItemsAccess().getItemsScreenListItemCellParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScreenListItemCell_in_ruleScreenSectionItems3945);
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
            	    break loop27;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleScreenSectionItems3958); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1764:1: entryRuleScreenListItemCell returns [EObject current=null] : iv_ruleScreenListItemCell= ruleScreenListItemCell EOF ;
    public final EObject entryRuleScreenListItemCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenListItemCell = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1765:2: (iv_ruleScreenListItemCell= ruleScreenListItemCell EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1766:2: iv_ruleScreenListItemCell= ruleScreenListItemCell EOF
            {
             newCompositeNode(grammarAccess.getScreenListItemCellRule()); 
            pushFollow(FOLLOW_ruleScreenListItemCell_in_entryRuleScreenListItemCell3994);
            iv_ruleScreenListItemCell=ruleScreenListItemCell();

            state._fsp--;

             current =iv_ruleScreenListItemCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenListItemCell4004); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1773:1: ruleScreenListItemCell returns [EObject current=null] : (otherlv_0= 'cell' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )? otherlv_6= '{' ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )* (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1776:28: ( (otherlv_0= 'cell' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )? otherlv_6= '{' ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )* (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1777:1: (otherlv_0= 'cell' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )? otherlv_6= '{' ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )* (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1777:1: (otherlv_0= 'cell' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )? otherlv_6= '{' ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )* (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1777:3: otherlv_0= 'cell' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )? otherlv_6= '{' ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )* (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleScreenListItemCell4041); 

                	newLeafNode(otherlv_0, grammarAccess.getScreenListItemCellAccess().getCellKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1781:1: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1782:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1782:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1783:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getScreenListItemCellRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScreenListItemCell4061); 

            		newLeafNode(otherlv_1, grammarAccess.getScreenListItemCellAccess().getTypeListItemCellDeclarationCrossReference_1_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1794:2: (otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1794:4: otherlv_2= 'foreach' ( (lv_restMethod_3_0= ruleRESTMethodCall ) ) otherlv_4= 'as' ( (lv_variable_5_0= ruleLoopVariable ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleScreenListItemCell4074); 

                        	newLeafNode(otherlv_2, grammarAccess.getScreenListItemCellAccess().getForeachKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1798:1: ( (lv_restMethod_3_0= ruleRESTMethodCall ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1799:1: (lv_restMethod_3_0= ruleRESTMethodCall )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1799:1: (lv_restMethod_3_0= ruleRESTMethodCall )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1800:3: lv_restMethod_3_0= ruleRESTMethodCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getScreenListItemCellAccess().getRestMethodRESTMethodCallParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRESTMethodCall_in_ruleScreenListItemCell4095);
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

                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleScreenListItemCell4107); 

                        	newLeafNode(otherlv_4, grammarAccess.getScreenListItemCellAccess().getAsKeyword_2_2());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1820:1: ( (lv_variable_5_0= ruleLoopVariable ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1821:1: (lv_variable_5_0= ruleLoopVariable )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1821:1: (lv_variable_5_0= ruleLoopVariable )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1822:3: lv_variable_5_0= ruleLoopVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getScreenListItemCellAccess().getVariableLoopVariableParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLoopVariable_in_ruleScreenListItemCell4128);
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

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleScreenListItemCell4142); 

                	newLeafNode(otherlv_6, grammarAccess.getScreenListItemCellAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1842:1: ( (lv_configurations_7_0= ruleUIComponentMemberConfiguration ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1843:1: (lv_configurations_7_0= ruleUIComponentMemberConfiguration )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1843:1: (lv_configurations_7_0= ruleUIComponentMemberConfiguration )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1844:3: lv_configurations_7_0= ruleUIComponentMemberConfiguration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScreenListItemCellAccess().getConfigurationsUIComponentMemberConfigurationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIComponentMemberConfiguration_in_ruleScreenListItemCell4163);
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
            	    break loop29;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1860:3: (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1860:5: otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleUIAction ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleScreenListItemCell4177); 

                        	newLeafNode(otherlv_8, grammarAccess.getScreenListItemCellAccess().getActionsKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleScreenListItemCell4189); 

                        	newLeafNode(otherlv_9, grammarAccess.getScreenListItemCellAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1868:1: ( (lv_actions_10_0= ruleUIAction ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=43 && LA30_0<=44)||LA30_0==53) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1869:1: (lv_actions_10_0= ruleUIAction )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1869:1: (lv_actions_10_0= ruleUIAction )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1870:3: lv_actions_10_0= ruleUIAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScreenListItemCellAccess().getActionsUIActionParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUIAction_in_ruleScreenListItemCell4210);
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleScreenListItemCell4223); 

                        	newLeafNode(otherlv_11, grammarAccess.getScreenListItemCellAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleScreenListItemCell4237); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1904:1: entryRuleLoopVariable returns [EObject current=null] : iv_ruleLoopVariable= ruleLoopVariable EOF ;
    public final EObject entryRuleLoopVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopVariable = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1905:2: (iv_ruleLoopVariable= ruleLoopVariable EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1906:2: iv_ruleLoopVariable= ruleLoopVariable EOF
            {
             newCompositeNode(grammarAccess.getLoopVariableRule()); 
            pushFollow(FOLLOW_ruleLoopVariable_in_entryRuleLoopVariable4275);
            iv_ruleLoopVariable=ruleLoopVariable();

            state._fsp--;

             current =iv_ruleLoopVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopVariable4285); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1913:1: ruleLoopVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLoopVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1916:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1917:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1917:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1918:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1918:1: (lv_name_0_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1919:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoopVariable4326); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1943:1: entryRuleUIAction returns [EObject current=null] : iv_ruleUIAction= ruleUIAction EOF ;
    public final EObject entryRuleUIAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIAction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1944:2: (iv_ruleUIAction= ruleUIAction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1945:2: iv_ruleUIAction= ruleUIAction EOF
            {
             newCompositeNode(grammarAccess.getUIActionRule()); 
            pushFollow(FOLLOW_ruleUIAction_in_entryRuleUIAction4366);
            iv_ruleUIAction=ruleUIAction();

            state._fsp--;

             current =iv_ruleUIAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIAction4376); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1952:1: ruleUIAction returns [EObject current=null] : ( ( (lv_kind_0_0= ruleUIActionKind ) ) otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )? otherlv_8= 'action' otherlv_9= '=' ( (lv_action_10_0= ruleUIActionSpecification ) ) otherlv_11= '}' ) ;
    public final EObject ruleUIAction() throws RecognitionException {
        EObject current = null;

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
        Enumerator lv_kind_0_0 = null;

        EObject lv_action_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1955:28: ( ( ( (lv_kind_0_0= ruleUIActionKind ) ) otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )? otherlv_8= 'action' otherlv_9= '=' ( (lv_action_10_0= ruleUIActionSpecification ) ) otherlv_11= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1956:1: ( ( (lv_kind_0_0= ruleUIActionKind ) ) otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )? otherlv_8= 'action' otherlv_9= '=' ( (lv_action_10_0= ruleUIActionSpecification ) ) otherlv_11= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1956:1: ( ( (lv_kind_0_0= ruleUIActionKind ) ) otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )? otherlv_8= 'action' otherlv_9= '=' ( (lv_action_10_0= ruleUIActionSpecification ) ) otherlv_11= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1956:2: ( (lv_kind_0_0= ruleUIActionKind ) ) otherlv_1= '{' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )? (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )? otherlv_8= 'action' otherlv_9= '=' ( (lv_action_10_0= ruleUIActionSpecification ) ) otherlv_11= '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1956:2: ( (lv_kind_0_0= ruleUIActionKind ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1957:1: (lv_kind_0_0= ruleUIActionKind )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1957:1: (lv_kind_0_0= ruleUIActionKind )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1958:3: lv_kind_0_0= ruleUIActionKind
            {
             
            	        newCompositeNode(grammarAccess.getUIActionAccess().getKindUIActionKindEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUIActionKind_in_ruleUIAction4422);
            lv_kind_0_0=ruleUIActionKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIActionRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_0_0, 
                    		"UIActionKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleUIAction4434); 

                	newLeafNode(otherlv_1, grammarAccess.getUIActionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1978:1: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==11) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1978:3: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleUIAction4447); 

                        	newLeafNode(otherlv_2, grammarAccess.getUIActionAccess().getTitleKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleUIAction4459); 

                        	newLeafNode(otherlv_3, grammarAccess.getUIActionAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1986:1: ( (lv_title_4_0= RULE_STRING ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1987:1: (lv_title_4_0= RULE_STRING )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1987:1: (lv_title_4_0= RULE_STRING )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1988:3: lv_title_4_0= RULE_STRING
                    {
                    lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIAction4476); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2004:4: (otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2004:6: otherlv_5= 'icon' otherlv_6= '=' ( (lv_icon_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleUIAction4496); 

                        	newLeafNode(otherlv_5, grammarAccess.getUIActionAccess().getIconKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleUIAction4508); 

                        	newLeafNode(otherlv_6, grammarAccess.getUIActionAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2012:1: ( (lv_icon_7_0= RULE_STRING ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2013:1: (lv_icon_7_0= RULE_STRING )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2013:1: (lv_icon_7_0= RULE_STRING )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2014:3: lv_icon_7_0= RULE_STRING
                    {
                    lv_icon_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUIAction4525); 

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

            otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleUIAction4544); 

                	newLeafNode(otherlv_8, grammarAccess.getUIActionAccess().getActionKeyword_4());
                
            otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleUIAction4556); 

                	newLeafNode(otherlv_9, grammarAccess.getUIActionAccess().getEqualsSignKeyword_5());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2038:1: ( (lv_action_10_0= ruleUIActionSpecification ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2039:1: (lv_action_10_0= ruleUIActionSpecification )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2039:1: (lv_action_10_0= ruleUIActionSpecification )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2040:3: lv_action_10_0= ruleUIActionSpecification
            {
             
            	        newCompositeNode(grammarAccess.getUIActionAccess().getActionUIActionSpecificationParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleUIActionSpecification_in_ruleUIAction4577);
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

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleUIAction4589); 

                	newLeafNode(otherlv_11, grammarAccess.getUIActionAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2068:1: entryRuleUIActionSpecification returns [EObject current=null] : iv_ruleUIActionSpecification= ruleUIActionSpecification EOF ;
    public final EObject entryRuleUIActionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIActionSpecification = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2069:2: (iv_ruleUIActionSpecification= ruleUIActionSpecification EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2070:2: iv_ruleUIActionSpecification= ruleUIActionSpecification EOF
            {
             newCompositeNode(grammarAccess.getUIActionSpecificationRule()); 
            pushFollow(FOLLOW_ruleUIActionSpecification_in_entryRuleUIActionSpecification4625);
            iv_ruleUIActionSpecification=ruleUIActionSpecification();

            state._fsp--;

             current =iv_ruleUIActionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIActionSpecification4635); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2077:1: ruleUIActionSpecification returns [EObject current=null] : (this_UIActionNavigateAction_0= ruleUIActionNavigateAction | this_UIActionDeleteAction_1= ruleUIActionDeleteAction ) ;
    public final EObject ruleUIActionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_UIActionNavigateAction_0 = null;

        EObject this_UIActionDeleteAction_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2080:28: ( (this_UIActionNavigateAction_0= ruleUIActionNavigateAction | this_UIActionDeleteAction_1= ruleUIActionDeleteAction ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2081:1: (this_UIActionNavigateAction_0= ruleUIActionNavigateAction | this_UIActionDeleteAction_1= ruleUIActionDeleteAction )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2081:1: (this_UIActionNavigateAction_0= ruleUIActionNavigateAction | this_UIActionDeleteAction_1= ruleUIActionDeleteAction )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            else if ( (LA34_0==44) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2082:5: this_UIActionNavigateAction_0= ruleUIActionNavigateAction
                    {
                     
                            newCompositeNode(grammarAccess.getUIActionSpecificationAccess().getUIActionNavigateActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUIActionNavigateAction_in_ruleUIActionSpecification4682);
                    this_UIActionNavigateAction_0=ruleUIActionNavigateAction();

                    state._fsp--;

                     
                            current = this_UIActionNavigateAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2092:5: this_UIActionDeleteAction_1= ruleUIActionDeleteAction
                    {
                     
                            newCompositeNode(grammarAccess.getUIActionSpecificationAccess().getUIActionDeleteActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUIActionDeleteAction_in_ruleUIActionSpecification4709);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2108:1: entryRuleUIActionNavigateAction returns [EObject current=null] : iv_ruleUIActionNavigateAction= ruleUIActionNavigateAction EOF ;
    public final EObject entryRuleUIActionNavigateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIActionNavigateAction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2109:2: (iv_ruleUIActionNavigateAction= ruleUIActionNavigateAction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2110:2: iv_ruleUIActionNavigateAction= ruleUIActionNavigateAction EOF
            {
             newCompositeNode(grammarAccess.getUIActionNavigateActionRule()); 
            pushFollow(FOLLOW_ruleUIActionNavigateAction_in_entryRuleUIActionNavigateAction4744);
            iv_ruleUIActionNavigateAction=ruleUIActionNavigateAction();

            state._fsp--;

             current =iv_ruleUIActionNavigateAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIActionNavigateAction4754); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2117:1: ruleUIActionNavigateAction returns [EObject current=null] : ( () otherlv_1= 'navigate' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) ;
    public final EObject ruleUIActionNavigateAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2120:28: ( ( () otherlv_1= 'navigate' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2121:1: ( () otherlv_1= 'navigate' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2121:1: ( () otherlv_1= 'navigate' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2121:2: () otherlv_1= 'navigate' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) )? otherlv_5= ')'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2121:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2122:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIActionNavigateActionAccess().getUIActionNavigateActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleUIActionNavigateAction4800); 

                	newLeafNode(otherlv_1, grammarAccess.getUIActionNavigateActionAccess().getNavigateKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2131:1: ( (otherlv_2= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2132:1: (otherlv_2= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2132:1: (otherlv_2= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2133:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUIActionNavigateActionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIActionNavigateAction4820); 

            		newLeafNode(otherlv_2, grammarAccess.getUIActionNavigateActionAccess().getTargetScreenScreenCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleUIActionNavigateAction4832); 

                	newLeafNode(otherlv_3, grammarAccess.getUIActionNavigateActionAccess().getLeftParenthesisKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2148:1: ( (otherlv_4= RULE_ID ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2149:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2149:1: (otherlv_4= RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2150:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIActionNavigateActionRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIActionNavigateAction4852); 

                    		newLeafNode(otherlv_4, grammarAccess.getUIActionNavigateActionAccess().getVariableReferrableElementCrossReference_4_0()); 
                    	

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleUIActionNavigateAction4865); 

                	newLeafNode(otherlv_5, grammarAccess.getUIActionNavigateActionAccess().getRightParenthesisKeyword_5());
                

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2173:1: entryRuleUIActionDeleteAction returns [EObject current=null] : iv_ruleUIActionDeleteAction= ruleUIActionDeleteAction EOF ;
    public final EObject entryRuleUIActionDeleteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIActionDeleteAction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2174:2: (iv_ruleUIActionDeleteAction= ruleUIActionDeleteAction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2175:2: iv_ruleUIActionDeleteAction= ruleUIActionDeleteAction EOF
            {
             newCompositeNode(grammarAccess.getUIActionDeleteActionRule()); 
            pushFollow(FOLLOW_ruleUIActionDeleteAction_in_entryRuleUIActionDeleteAction4901);
            iv_ruleUIActionDeleteAction=ruleUIActionDeleteAction();

            state._fsp--;

             current =iv_ruleUIActionDeleteAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIActionDeleteAction4911); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2182:1: ruleUIActionDeleteAction returns [EObject current=null] : ( () otherlv_1= 'delete' ) ;
    public final EObject ruleUIActionDeleteAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2185:28: ( ( () otherlv_1= 'delete' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2186:1: ( () otherlv_1= 'delete' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2186:1: ( () otherlv_1= 'delete' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2186:2: () otherlv_1= 'delete'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2186:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2187:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIActionDeleteActionAccess().getUIActionDeleteActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleUIActionDeleteAction4957); 

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


    // $ANTLR start "entryRuleListItemCellDeclaration"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2204:1: entryRuleListItemCellDeclaration returns [EObject current=null] : iv_ruleListItemCellDeclaration= ruleListItemCellDeclaration EOF ;
    public final EObject entryRuleListItemCellDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListItemCellDeclaration = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2205:2: (iv_ruleListItemCellDeclaration= ruleListItemCellDeclaration EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2206:2: iv_ruleListItemCellDeclaration= ruleListItemCellDeclaration EOF
            {
             newCompositeNode(grammarAccess.getListItemCellDeclarationRule()); 
            pushFollow(FOLLOW_ruleListItemCellDeclaration_in_entryRuleListItemCellDeclaration4993);
            iv_ruleListItemCellDeclaration=ruleListItemCellDeclaration();

            state._fsp--;

             current =iv_ruleListItemCellDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListItemCellDeclaration5003); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2213:1: ruleListItemCellDeclaration returns [EObject current=null] : (otherlv_0= 'listitemcell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleListItemCellDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2216:28: ( (otherlv_0= 'listitemcell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2217:1: (otherlv_0= 'listitemcell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2217:1: (otherlv_0= 'listitemcell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2217:3: otherlv_0= 'listitemcell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleListItemCellDeclaration5040); 

                	newLeafNode(otherlv_0, grammarAccess.getListItemCellDeclarationAccess().getListitemcellKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2221:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2222:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2222:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2223:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListItemCellDeclaration5057); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleListItemCellDeclaration5074); 

                	newLeafNode(otherlv_2, grammarAccess.getListItemCellDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2243:1: ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2244:1: (lv_members_3_0= ruleUIComponentMemberDeclaration )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2244:1: (lv_members_3_0= ruleUIComponentMemberDeclaration )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2245:3: lv_members_3_0= ruleUIComponentMemberDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListItemCellDeclarationAccess().getMembersUIComponentMemberDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIComponentMemberDeclaration_in_ruleListItemCellDeclaration5095);
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
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleListItemCellDeclaration5108); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2273:1: entryRuleUIComponentDeclaration returns [EObject current=null] : iv_ruleUIComponentDeclaration= ruleUIComponentDeclaration EOF ;
    public final EObject entryRuleUIComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponentDeclaration = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2274:2: (iv_ruleUIComponentDeclaration= ruleUIComponentDeclaration EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2275:2: iv_ruleUIComponentDeclaration= ruleUIComponentDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUIComponentDeclarationRule()); 
            pushFollow(FOLLOW_ruleUIComponentDeclaration_in_entryRuleUIComponentDeclaration5144);
            iv_ruleUIComponentDeclaration=ruleUIComponentDeclaration();

            state._fsp--;

             current =iv_ruleUIComponentDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentDeclaration5154); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2282:1: ruleUIComponentDeclaration returns [EObject current=null] : (otherlv_0= 'uicomponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleUIComponentDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2285:28: ( (otherlv_0= 'uicomponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2286:1: (otherlv_0= 'uicomponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2286:1: (otherlv_0= 'uicomponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2286:3: otherlv_0= 'uicomponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleUIComponentDeclaration5191); 

                	newLeafNode(otherlv_0, grammarAccess.getUIComponentDeclarationAccess().getUicomponentKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2290:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2291:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2291:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2292:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIComponentDeclaration5208); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleUIComponentDeclaration5225); 

                	newLeafNode(otherlv_2, grammarAccess.getUIComponentDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2312:1: ( (lv_members_3_0= ruleUIComponentMemberDeclaration ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2313:1: (lv_members_3_0= ruleUIComponentMemberDeclaration )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2313:1: (lv_members_3_0= ruleUIComponentMemberDeclaration )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2314:3: lv_members_3_0= ruleUIComponentMemberDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIComponentDeclarationAccess().getMembersUIComponentMemberDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIComponentMemberDeclaration_in_ruleUIComponentDeclaration5246);
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
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleUIComponentDeclaration5259); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2342:1: entryRuleUIComponentMemberDeclaration returns [EObject current=null] : iv_ruleUIComponentMemberDeclaration= ruleUIComponentMemberDeclaration EOF ;
    public final EObject entryRuleUIComponentMemberDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponentMemberDeclaration = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2343:2: (iv_ruleUIComponentMemberDeclaration= ruleUIComponentMemberDeclaration EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2344:2: iv_ruleUIComponentMemberDeclaration= ruleUIComponentMemberDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUIComponentMemberDeclarationRule()); 
            pushFollow(FOLLOW_ruleUIComponentMemberDeclaration_in_entryRuleUIComponentMemberDeclaration5295);
            iv_ruleUIComponentMemberDeclaration=ruleUIComponentMemberDeclaration();

            state._fsp--;

             current =iv_ruleUIComponentMemberDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentMemberDeclaration5305); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2351:1: ruleUIComponentMemberDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUIComponentMemberDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2354:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2355:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2355:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2355:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2355:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2356:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2356:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2357:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUIComponentMemberDeclarationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIComponentMemberDeclaration5350); 

            		newLeafNode(otherlv_0, grammarAccess.getUIComponentMemberDeclarationAccess().getTypeUIComponentOrDataTypeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2368:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2369:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2369:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2370:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIComponentMemberDeclaration5367); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2396:1: entryRuleRESTMethodCall returns [EObject current=null] : iv_ruleRESTMethodCall= ruleRESTMethodCall EOF ;
    public final EObject entryRuleRESTMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRESTMethodCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2397:2: (iv_ruleRESTMethodCall= ruleRESTMethodCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2398:2: iv_ruleRESTMethodCall= ruleRESTMethodCall EOF
            {
             newCompositeNode(grammarAccess.getRESTMethodCallRule()); 
            pushFollow(FOLLOW_ruleRESTMethodCall_in_entryRuleRESTMethodCall5410);
            iv_ruleRESTMethodCall=ruleRESTMethodCall();

            state._fsp--;

             current =iv_ruleRESTMethodCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTMethodCall5420); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2405:1: ruleRESTMethodCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ) ;
    public final EObject ruleRESTMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2408:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2409:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2409:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2409:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2409:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2410:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2410:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2411:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRESTMethodCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRESTMethodCall5465); 

            		newLeafNode(otherlv_0, grammarAccess.getRESTMethodCallAccess().getDatasourceDataSourceCallCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleRESTMethodCall5477); 

                	newLeafNode(otherlv_1, grammarAccess.getRESTMethodCallAccess().getFullStopKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2426:1: ( (otherlv_2= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2427:1: (otherlv_2= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2427:1: (otherlv_2= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2428:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRESTMethodCallRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRESTMethodCall5497); 

            		newLeafNode(otherlv_2, grammarAccess.getRESTMethodCallAccess().getRestMethodDataSourceAccessMethodCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleRESTMethodCall5509); 

                	newLeafNode(otherlv_3, grammarAccess.getRESTMethodCallAccess().getLeftParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleRESTMethodCall5521); 

                	newLeafNode(otherlv_4, grammarAccess.getRESTMethodCallAccess().getRightParenthesisKeyword_4());
                

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2455:1: entryRuleDataSourceCall returns [EObject current=null] : iv_ruleDataSourceCall= ruleDataSourceCall EOF ;
    public final EObject entryRuleDataSourceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSourceCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2456:2: (iv_ruleDataSourceCall= ruleDataSourceCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2457:2: iv_ruleDataSourceCall= ruleDataSourceCall EOF
            {
             newCompositeNode(grammarAccess.getDataSourceCallRule()); 
            pushFollow(FOLLOW_ruleDataSourceCall_in_entryRuleDataSourceCall5557);
            iv_ruleDataSourceCall=ruleDataSourceCall();

            state._fsp--;

             current =iv_ruleDataSourceCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceCall5567); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2464:1: ruleDataSourceCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDataSourceCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2467:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2468:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2468:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2468:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2468:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2469:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2469:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2470:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSourceCall5612); 

            		newLeafNode(otherlv_0, grammarAccess.getDataSourceCallAccess().getDatasourceDataSourceCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleDataSourceCall5624); 

                	newLeafNode(otherlv_1, grammarAccess.getDataSourceCallAccess().getAsKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2485:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2486:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2486:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2487:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSourceCall5641); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDataSourceCallAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceCallRule());
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
    // $ANTLR end "ruleDataSourceCall"


    // $ANTLR start "entryRuleUIComponentMemberConfiguration"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2511:1: entryRuleUIComponentMemberConfiguration returns [EObject current=null] : iv_ruleUIComponentMemberConfiguration= ruleUIComponentMemberConfiguration EOF ;
    public final EObject entryRuleUIComponentMemberConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponentMemberConfiguration = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2512:2: (iv_ruleUIComponentMemberConfiguration= ruleUIComponentMemberConfiguration EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2513:2: iv_ruleUIComponentMemberConfiguration= ruleUIComponentMemberConfiguration EOF
            {
             newCompositeNode(grammarAccess.getUIComponentMemberConfigurationRule()); 
            pushFollow(FOLLOW_ruleUIComponentMemberConfiguration_in_entryRuleUIComponentMemberConfiguration5682);
            iv_ruleUIComponentMemberConfiguration=ruleUIComponentMemberConfiguration();

            state._fsp--;

             current =iv_ruleUIComponentMemberConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentMemberConfiguration5692); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2520:1: ruleUIComponentMemberConfiguration returns [EObject current=null] : ( ( (lv_type_0_0= ruleUIComponentMemberCall ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleUIComponentMemberConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2523:28: ( ( ( (lv_type_0_0= ruleUIComponentMemberCall ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2524:1: ( ( (lv_type_0_0= ruleUIComponentMemberCall ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2524:1: ( ( (lv_type_0_0= ruleUIComponentMemberCall ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2524:2: ( (lv_type_0_0= ruleUIComponentMemberCall ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2524:2: ( (lv_type_0_0= ruleUIComponentMemberCall ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2525:1: (lv_type_0_0= ruleUIComponentMemberCall )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2525:1: (lv_type_0_0= ruleUIComponentMemberCall )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2526:3: lv_type_0_0= ruleUIComponentMemberCall
            {
             
            	        newCompositeNode(grammarAccess.getUIComponentMemberConfigurationAccess().getTypeUIComponentMemberCallParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUIComponentMemberCall_in_ruleUIComponentMemberConfiguration5738);
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleUIComponentMemberConfiguration5750); 

                	newLeafNode(otherlv_1, grammarAccess.getUIComponentMemberConfigurationAccess().getEqualsSignKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2546:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2547:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2547:1: (lv_value_2_0= ruleExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2548:3: lv_value_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getUIComponentMemberConfigurationAccess().getValueExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleUIComponentMemberConfiguration5771);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2572:1: entryRuleUIComponentMemberCall returns [EObject current=null] : iv_ruleUIComponentMemberCall= ruleUIComponentMemberCall EOF ;
    public final EObject entryRuleUIComponentMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponentMemberCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2573:2: (iv_ruleUIComponentMemberCall= ruleUIComponentMemberCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2574:2: iv_ruleUIComponentMemberCall= ruleUIComponentMemberCall EOF
            {
             newCompositeNode(grammarAccess.getUIComponentMemberCallRule()); 
            pushFollow(FOLLOW_ruleUIComponentMemberCall_in_entryRuleUIComponentMemberCall5807);
            iv_ruleUIComponentMemberCall=ruleUIComponentMemberCall();

            state._fsp--;

             current =iv_ruleUIComponentMemberCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIComponentMemberCall5817); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2581:1: ruleUIComponentMemberCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleUIComponentMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2584:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2585:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2585:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2585:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2585:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2586:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2586:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2587:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUIComponentMemberCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIComponentMemberCall5862); 

            		newLeafNode(otherlv_0, grammarAccess.getUIComponentMemberCallAccess().getComponentUIComponentMemberDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2598:2: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2598:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleUIComponentMemberCall5875); 

                        	newLeafNode(otherlv_1, grammarAccess.getUIComponentMemberCallAccess().getFullStopKeyword_1_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2602:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2603:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2603:1: (otherlv_2= RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2604:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIComponentMemberCallRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIComponentMemberCall5895); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2623:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2624:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2625:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5933);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5943); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2632:1: ruleExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_EntityMemberCall_1= ruleEntityMemberCall ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_EntityMemberCall_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2635:28: ( (this_StringLiteral_0= ruleStringLiteral | this_EntityMemberCall_1= ruleEntityMemberCall ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2636:1: (this_StringLiteral_0= ruleStringLiteral | this_EntityMemberCall_1= ruleEntityMemberCall )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2636:1: (this_StringLiteral_0= ruleStringLiteral | this_EntityMemberCall_1= ruleEntityMemberCall )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2637:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleExpression5990);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2647:5: this_EntityMemberCall_1= ruleEntityMemberCall
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getEntityMemberCallParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityMemberCall_in_ruleExpression6017);
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


    // $ANTLR start "entryRuleEntityMemberCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2663:1: entryRuleEntityMemberCall returns [EObject current=null] : iv_ruleEntityMemberCall= ruleEntityMemberCall EOF ;
    public final EObject entryRuleEntityMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMemberCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2664:2: (iv_ruleEntityMemberCall= ruleEntityMemberCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2665:2: iv_ruleEntityMemberCall= ruleEntityMemberCall EOF
            {
             newCompositeNode(grammarAccess.getEntityMemberCallRule()); 
            pushFollow(FOLLOW_ruleEntityMemberCall_in_entryRuleEntityMemberCall6052);
            iv_ruleEntityMemberCall=ruleEntityMemberCall();

            state._fsp--;

             current =iv_ruleEntityMemberCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityMemberCall6062); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2672:1: ruleEntityMemberCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleEntityMemberCallTail ) )? ) ;
    public final EObject ruleEntityMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tail_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2675:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleEntityMemberCallTail ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2676:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleEntityMemberCallTail ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2676:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleEntityMemberCallTail ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2676:2: ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleEntityMemberCallTail ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2676:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2677:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2677:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2678:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityMemberCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityMemberCall6107); 

            		newLeafNode(otherlv_0, grammarAccess.getEntityMemberCallAccess().getHeadAttributeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2689:2: ( (lv_tail_1_0= ruleEntityMemberCallTail ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==32) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2690:1: (lv_tail_1_0= ruleEntityMemberCallTail )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2690:1: (lv_tail_1_0= ruleEntityMemberCallTail )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2691:3: lv_tail_1_0= ruleEntityMemberCallTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityMemberCallAccess().getTailEntityMemberCallTailParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityMemberCallTail_in_ruleEntityMemberCall6128);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2715:1: entryRuleEntityMemberCallTail returns [EObject current=null] : iv_ruleEntityMemberCallTail= ruleEntityMemberCallTail EOF ;
    public final EObject entryRuleEntityMemberCallTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMemberCallTail = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2716:2: (iv_ruleEntityMemberCallTail= ruleEntityMemberCallTail EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2717:2: iv_ruleEntityMemberCallTail= ruleEntityMemberCallTail EOF
            {
             newCompositeNode(grammarAccess.getEntityMemberCallTailRule()); 
            pushFollow(FOLLOW_ruleEntityMemberCallTail_in_entryRuleEntityMemberCallTail6165);
            iv_ruleEntityMemberCallTail=ruleEntityMemberCallTail();

            state._fsp--;

             current =iv_ruleEntityMemberCallTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityMemberCallTail6175); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2724:1: ruleEntityMemberCallTail returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleEntityMemberCallTail ) )? ) ;
    public final EObject ruleEntityMemberCallTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2727:28: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleEntityMemberCallTail ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2728:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleEntityMemberCallTail ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2728:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleEntityMemberCallTail ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2728:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleEntityMemberCallTail ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleEntityMemberCallTail6212); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityMemberCallTailAccess().getFullStopKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2732:1: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2733:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2733:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2734:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityMemberCallTailRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityMemberCallTail6232); 

            		newLeafNode(otherlv_1, grammarAccess.getEntityMemberCallTailAccess().getHeadAttributeCrossReference_1_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2745:2: ( (lv_tail_2_0= ruleEntityMemberCallTail ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==32) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2746:1: (lv_tail_2_0= ruleEntityMemberCallTail )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2746:1: (lv_tail_2_0= ruleEntityMemberCallTail )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2747:3: lv_tail_2_0= ruleEntityMemberCallTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityMemberCallTailAccess().getTailEntityMemberCallTailParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityMemberCallTail_in_ruleEntityMemberCallTail6253);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2773:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2774:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2775:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6292);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6302); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2782:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2785:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2786:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2786:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2787:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2787:1: (lv_value_0_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2788:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6343); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2812:1: ruleRESTVerb returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleRESTVerb() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2814:28: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2815:1: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2815:1: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt42=1;
                }
                break;
            case 48:
                {
                alt42=2;
                }
                break;
            case 49:
                {
                alt42=3;
                }
                break;
            case 50:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2815:2: (enumLiteral_0= 'GET' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2815:2: (enumLiteral_0= 'GET' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2815:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleRESTVerb6397); 

                            current = grammarAccess.getRESTVerbAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRESTVerbAccess().getGETEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2821:6: (enumLiteral_1= 'POST' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2821:6: (enumLiteral_1= 'POST' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2821:8: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleRESTVerb6414); 

                            current = grammarAccess.getRESTVerbAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRESTVerbAccess().getPOSTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2827:6: (enumLiteral_2= 'PUT' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2827:6: (enumLiteral_2= 'PUT' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2827:8: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_49_in_ruleRESTVerb6431); 

                            current = grammarAccess.getRESTVerbAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRESTVerbAccess().getPUTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2833:6: (enumLiteral_3= 'DELETE' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2833:6: (enumLiteral_3= 'DELETE' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2833:8: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_50_in_ruleRESTVerb6448); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2843:1: ruleScreenKind returns [Enumerator current=null] : ( (enumLiteral_0= 'DefaultList' ) | (enumLiteral_1= 'DefaultDetails' ) ) ;
    public final Enumerator ruleScreenKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2845:28: ( ( (enumLiteral_0= 'DefaultList' ) | (enumLiteral_1= 'DefaultDetails' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2846:1: ( (enumLiteral_0= 'DefaultList' ) | (enumLiteral_1= 'DefaultDetails' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2846:1: ( (enumLiteral_0= 'DefaultList' ) | (enumLiteral_1= 'DefaultDetails' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            else if ( (LA43_0==52) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2846:2: (enumLiteral_0= 'DefaultList' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2846:2: (enumLiteral_0= 'DefaultList' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2846:4: enumLiteral_0= 'DefaultList'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleScreenKind6493); 

                            current = grammarAccess.getScreenKindAccess().getDefaultListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getScreenKindAccess().getDefaultListEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2852:6: (enumLiteral_1= 'DefaultDetails' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2852:6: (enumLiteral_1= 'DefaultDetails' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2852:8: enumLiteral_1= 'DefaultDetails'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleScreenKind6510); 

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


    // $ANTLR start "ruleUIActionKind"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2862:1: ruleUIActionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'navigate' ) | (enumLiteral_1= 'delete' ) | (enumLiteral_2= 'performaction' ) ) ;
    public final Enumerator ruleUIActionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2864:28: ( ( (enumLiteral_0= 'navigate' ) | (enumLiteral_1= 'delete' ) | (enumLiteral_2= 'performaction' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2865:1: ( (enumLiteral_0= 'navigate' ) | (enumLiteral_1= 'delete' ) | (enumLiteral_2= 'performaction' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2865:1: ( (enumLiteral_0= 'navigate' ) | (enumLiteral_1= 'delete' ) | (enumLiteral_2= 'performaction' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt44=1;
                }
                break;
            case 44:
                {
                alt44=2;
                }
                break;
            case 53:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2865:2: (enumLiteral_0= 'navigate' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2865:2: (enumLiteral_0= 'navigate' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2865:4: enumLiteral_0= 'navigate'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleUIActionKind6555); 

                            current = grammarAccess.getUIActionKindAccess().getNavigateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUIActionKindAccess().getNavigateEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2871:6: (enumLiteral_1= 'delete' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2871:6: (enumLiteral_1= 'delete' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2871:8: enumLiteral_1= 'delete'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleUIActionKind6572); 

                            current = grammarAccess.getUIActionKindAccess().getDeleteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUIActionKindAccess().getDeleteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2877:6: (enumLiteral_2= 'performaction' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2877:6: (enumLiteral_2= 'performaction' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2877:8: enumLiteral_2= 'performaction'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleUIActionKind6589); 

                            current = grammarAccess.getUIActionKindAccess().getPerformactionEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getUIActionKindAccess().getPerformactionEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleUIActionKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElement_in_ruleModel130 = new BitSet(new long[]{0x0000600201039002L});
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
    public static final BitSet FOLLOW_11_in_ruleKeywordedID562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleKeywordedID581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleKeywordedID600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleKeywordedID619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleKeywordedID638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeywordedID659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDataType751 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleDataType772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEntity861 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntity887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity904 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleEntity922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity942 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEntity956 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity977 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleEntity990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1081 = new BitSet(new long[]{0x000000000020F810L});
    public static final BitSet FOLLOW_21_in_ruleAttribute1099 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleAttribute1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform1170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePlatform1217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlatform1234 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePlatform1251 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rulePlatformMapping_in_rulePlatform1272 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_rulePlatform1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatformMapping_in_entryRulePlatformMapping1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatformMapping1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMapping_in_rulePlatformMapping1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMapping_in_entryRuleTypeMapping1411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMapping1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTypeMapping1458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeMapping1478 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTypeMapping1490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeMapping1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_entryRuleDataSource1548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSource1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDataSource1595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSource1612 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDataSource1629 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDataSource1641 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataSource1653 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_ruleDataSource1674 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDataSource1686 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataSource1698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSource1718 = new BitSet(new long[]{0x000000000010F810L});
    public static final BitSet FOLLOW_ruleDataSourceAccessMethod_in_ruleDataSource1739 = new BitSet(new long[]{0x000000000010F810L});
    public static final BitSet FOLLOW_20_in_ruleDataSource1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceAccessMethod_in_entryRuleDataSourceAccessMethod1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceAccessMethod1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleDataSourceAccessMethod1844 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDataSourceAccessMethod1856 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1878 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleDataSourceAccessMethod1891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1912 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleDataSourceAccessMethod1928 = new BitSet(new long[]{0x0007800000200000L});
    public static final BitSet FOLLOW_21_in_ruleDataSourceAccessMethod1946 = new BitSet(new long[]{0x0007800000200000L});
    public static final BitSet FOLLOW_ruleRESTSpecification_in_ruleDataSourceAccessMethod1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTSpecification_in_entryRuleRESTSpecification2017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTSpecification2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTVerb_in_ruleRESTSpecification2073 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleRESTURL_in_ruleRESTSpecification2094 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRESTSpecification2107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataSourceBodySpecification_in_ruleRESTSpecification2128 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRESTSpecification2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceBodySpecification_in_entryRuleDataSourceBodySpecification2178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceBodySpecification2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSourceBodySpecification2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2322 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_ruleKeywordedID_in_ruleParameter2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTURL_in_entryRuleRESTURL2379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTURL2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_ruleRESTURL2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeRESTURL_in_ruleRESTURL2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_entryRuleAbsoluteRESTURL2498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteRESTURL2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAbsoluteRESTURL2554 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2575 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_26_in_ruleAbsoluteRESTURL2588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAbsoluteRESTURL2605 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleAbsoluteRESTURL2625 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2646 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleRelativeRESTURL_in_entryRuleRelativeRESTURL2684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeRESTURL2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRelativeRESTURL2740 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL2761 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleRelativeRESTURL2774 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL2795 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_entryRuleUrlFragment2833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlFragment2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPathFragment_in_ruleUrlFragment2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleUrlFragment2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPathFragment_in_entryRuleUrlPathFragment2952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlPathFragment2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUrlPathFragment3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable3042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleVariable3089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3197 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedName3216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3231 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleScreen_in_entryRuleScreen3278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreen3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleScreen3325 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_ruleScreenKind_in_ruleScreen3346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScreen3363 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_27_in_ruleScreen3381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleScreen3402 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleScreen3414 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleScreen3428 = new BitSet(new long[]{0x0000000801000800L});
    public static final BitSet FOLLOW_11_in_ruleScreen3441 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleScreen3453 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScreen3470 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_24_in_ruleScreen3490 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleScreen3502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataSourceCall_in_ruleScreen3523 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleScreen3537 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleScreen3549 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_ruleScreenSection_in_ruleScreen3570 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_20_in_ruleScreen3583 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleScreen3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenSection_in_entryRuleScreenSection3631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenSection3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleScreenSection3678 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleScreenSection3690 = new BitSet(new long[]{0x0000001001000800L});
    public static final BitSet FOLLOW_11_in_ruleScreenSection3703 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleScreenSection3715 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScreenSection3732 = new BitSet(new long[]{0x0000001001000800L});
    public static final BitSet FOLLOW_24_in_ruleScreenSection3752 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleScreenSection3764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataSourceCall_in_ruleScreenSection3785 = new BitSet(new long[]{0x0000001001000800L});
    public static final BitSet FOLLOW_ruleScreenSectionItems_in_ruleScreenSection3808 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleScreenSection3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenSectionItems_in_entryRuleScreenSectionItems3856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenSectionItems3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleScreenSectionItems3912 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleScreenSectionItems3924 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_ruleScreenListItemCell_in_ruleScreenSectionItems3945 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_20_in_ruleScreenSectionItems3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenListItemCell_in_entryRuleScreenListItemCell3994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenListItemCell4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleScreenListItemCell4041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScreenListItemCell4061 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_38_in_ruleScreenListItemCell4074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRESTMethodCall_in_ruleScreenListItemCell4095 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleScreenListItemCell4107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLoopVariable_in_ruleScreenListItemCell4128 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleScreenListItemCell4142 = new BitSet(new long[]{0x0000010000100010L});
    public static final BitSet FOLLOW_ruleUIComponentMemberConfiguration_in_ruleScreenListItemCell4163 = new BitSet(new long[]{0x0000010000100010L});
    public static final BitSet FOLLOW_40_in_ruleScreenListItemCell4177 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleScreenListItemCell4189 = new BitSet(new long[]{0x0020180000100000L});
    public static final BitSet FOLLOW_ruleUIAction_in_ruleScreenListItemCell4210 = new BitSet(new long[]{0x0020180000100000L});
    public static final BitSet FOLLOW_20_in_ruleScreenListItemCell4223 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleScreenListItemCell4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopVariable_in_entryRuleLoopVariable4275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopVariable4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoopVariable4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIAction_in_entryRuleUIAction4366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIAction4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionKind_in_ruleUIAction4422 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUIAction4434 = new BitSet(new long[]{0x0000060000000800L});
    public static final BitSet FOLLOW_11_in_ruleUIAction4447 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUIAction4459 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIAction4476 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_ruleUIAction4496 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUIAction4508 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUIAction4525 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleUIAction4544 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUIAction4556 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleUIActionSpecification_in_ruleUIAction4577 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUIAction4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionSpecification_in_entryRuleUIActionSpecification4625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIActionSpecification4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionNavigateAction_in_ruleUIActionSpecification4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionDeleteAction_in_ruleUIActionSpecification4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionNavigateAction_in_entryRuleUIActionNavigateAction4744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIActionNavigateAction4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleUIActionNavigateAction4800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIActionNavigateAction4820 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUIActionNavigateAction4832 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIActionNavigateAction4852 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleUIActionNavigateAction4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionDeleteAction_in_entryRuleUIActionDeleteAction4901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIActionDeleteAction4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleUIActionDeleteAction4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListItemCellDeclaration_in_entryRuleListItemCellDeclaration4993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListItemCellDeclaration5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleListItemCellDeclaration5040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListItemCellDeclaration5057 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleListItemCellDeclaration5074 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleUIComponentMemberDeclaration_in_ruleListItemCellDeclaration5095 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleListItemCellDeclaration5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentDeclaration_in_entryRuleUIComponentDeclaration5144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentDeclaration5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleUIComponentDeclaration5191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIComponentDeclaration5208 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUIComponentDeclaration5225 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleUIComponentMemberDeclaration_in_ruleUIComponentDeclaration5246 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleUIComponentDeclaration5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberDeclaration_in_entryRuleUIComponentMemberDeclaration5295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentMemberDeclaration5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIComponentMemberDeclaration5350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIComponentMemberDeclaration5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTMethodCall_in_entryRuleRESTMethodCall5410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTMethodCall5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRESTMethodCall5465 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRESTMethodCall5477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRESTMethodCall5497 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRESTMethodCall5509 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRESTMethodCall5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceCall_in_entryRuleDataSourceCall5557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceCall5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSourceCall5612 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDataSourceCall5624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSourceCall5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberConfiguration_in_entryRuleUIComponentMemberConfiguration5682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentMemberConfiguration5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberCall_in_ruleUIComponentMemberConfiguration5738 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUIComponentMemberConfiguration5750 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleUIComponentMemberConfiguration5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIComponentMemberCall_in_entryRuleUIComponentMemberCall5807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIComponentMemberCall5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIComponentMemberCall5862 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleUIComponentMemberCall5875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIComponentMemberCall5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleExpression5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCall_in_ruleExpression6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCall_in_entryRuleEntityMemberCall6052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityMemberCall6062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityMemberCall6107 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCallTail_in_ruleEntityMemberCall6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCallTail_in_entryRuleEntityMemberCallTail6165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityMemberCallTail6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEntityMemberCallTail6212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityMemberCallTail6232 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleEntityMemberCallTail_in_ruleEntityMemberCallTail6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRESTVerb6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleRESTVerb6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRESTVerb6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleRESTVerb6448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleScreenKind6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleScreenKind6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleUIActionKind6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleUIActionKind6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUIActionKind6589 = new BitSet(new long[]{0x0000000000000002L});

}