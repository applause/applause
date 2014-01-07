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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'abstract'", "'entity'", "'extends'", "'{'", "'}'", "'[]'", "'platform'", "'typemapping'", "'->'", "'datasource'", "'baseUrl'", "':'", "'resource'", "'('", "','", "')'", "'http://'", "'/'", "'.'", "'GET'", "'POST'", "'PUT'", "'DELETE'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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

                if ( ((LA1_0>=11 && LA1_0<=13)||LA1_0==18||LA1_0==21) ) {
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:116:1: ruleNamedElement returns [EObject current=null] : (this_Type_0= ruleType | this_Platform_1= rulePlatform | this_DataSource_2= ruleDataSource ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_Platform_1 = null;

        EObject this_DataSource_2 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:119:28: ( (this_Type_0= ruleType | this_Platform_1= rulePlatform | this_DataSource_2= ruleDataSource ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:120:1: (this_Type_0= ruleType | this_Platform_1= rulePlatform | this_DataSource_2= ruleDataSource )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:120:1: (this_Type_0= ruleType | this_Platform_1= rulePlatform | this_DataSource_2= ruleDataSource )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:157:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:158:2: (iv_ruleType= ruleType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:159:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType312);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType322); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:166:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:169:28: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:170:1: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:170:1: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=12 && LA3_0<=13)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:171:5: this_DataType_0= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType369);
                    this_DataType_0=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:181:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType396);
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


    // $ANTLR start "entryRuleDataType"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:197:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:198:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:199:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType431);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType441); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:206:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:209:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:210:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:210:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:210:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDataType478); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:214:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:215:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:215:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:216:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType495); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:240:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:241:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:242:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity536);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity546); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:249:1: ruleEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) ;
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
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:252:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:253:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:253:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:253:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:253:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:254:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:254:1: (lv_abstract_0_0= 'abstract' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:255:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,12,FOLLOW_12_in_ruleEntity589); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEntity615); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:272:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:273:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:273:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:274:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity632); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:290:2: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:290:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEntity650); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:294:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:295:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:295:1: (otherlv_4= RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:296:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity670); 

                    		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEntity684); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:311:1: ( (lv_attributes_6_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:312:1: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:312:1: (lv_attributes_6_0= ruleAttribute )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:313:3: lv_attributes_6_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity705);
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
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleEntity718); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:341:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:342:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:343:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute754);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute764); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:350:1: ruleAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_many_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:353:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:354:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:354:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:354:2: ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:354:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:355:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:355:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:356:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute809); 

            		newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:367:2: ( (lv_many_1_0= '[]' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:368:1: (lv_many_1_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:368:1: (lv_many_1_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:369:3: lv_many_1_0= '[]'
                    {
                    lv_many_1_0=(Token)match(input,17,FOLLOW_17_in_ruleAttribute827); 

                            newLeafNode(lv_many_1_0, grammarAccess.getAttributeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:382:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:383:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:383:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:384:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute858); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRulePlatform"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:408:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:409:2: (iv_rulePlatform= rulePlatform EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:410:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform899);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform909); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:417:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mappings_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:420:28: ( (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:421:1: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:421:1: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:421:3: otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= rulePlatformMapping ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePlatform946); 

                	newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:425:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:426:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:426:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:427:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlatform963); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePlatform980); 

                	newLeafNode(otherlv_2, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:447:1: ( (lv_mappings_3_0= rulePlatformMapping ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:448:1: (lv_mappings_3_0= rulePlatformMapping )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:448:1: (lv_mappings_3_0= rulePlatformMapping )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:449:3: lv_mappings_3_0= rulePlatformMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlatformAccess().getMappingsPlatformMappingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlatformMapping_in_rulePlatform1001);
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
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePlatform1014); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:477:1: entryRulePlatformMapping returns [EObject current=null] : iv_rulePlatformMapping= rulePlatformMapping EOF ;
    public final EObject entryRulePlatformMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformMapping = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:478:2: (iv_rulePlatformMapping= rulePlatformMapping EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:479:2: iv_rulePlatformMapping= rulePlatformMapping EOF
            {
             newCompositeNode(grammarAccess.getPlatformMappingRule()); 
            pushFollow(FOLLOW_rulePlatformMapping_in_entryRulePlatformMapping1050);
            iv_rulePlatformMapping=rulePlatformMapping();

            state._fsp--;

             current =iv_rulePlatformMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatformMapping1060); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:486:1: rulePlatformMapping returns [EObject current=null] : this_TypeMapping_0= ruleTypeMapping ;
    public final EObject rulePlatformMapping() throws RecognitionException {
        EObject current = null;

        EObject this_TypeMapping_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:489:28: (this_TypeMapping_0= ruleTypeMapping )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:491:5: this_TypeMapping_0= ruleTypeMapping
            {
             
                    newCompositeNode(grammarAccess.getPlatformMappingAccess().getTypeMappingParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTypeMapping_in_rulePlatformMapping1106);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:507:1: entryRuleTypeMapping returns [EObject current=null] : iv_ruleTypeMapping= ruleTypeMapping EOF ;
    public final EObject entryRuleTypeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMapping = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:508:2: (iv_ruleTypeMapping= ruleTypeMapping EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:509:2: iv_ruleTypeMapping= ruleTypeMapping EOF
            {
             newCompositeNode(grammarAccess.getTypeMappingRule()); 
            pushFollow(FOLLOW_ruleTypeMapping_in_entryRuleTypeMapping1140);
            iv_ruleTypeMapping=ruleTypeMapping();

            state._fsp--;

             current =iv_ruleTypeMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMapping1150); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:516:1: ruleTypeMapping returns [EObject current=null] : (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_simpleName_3_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:519:28: ( (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:520:1: (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:520:1: (otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:520:3: otherlv_0= 'typemapping' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (lv_simpleName_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTypeMapping1187); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeMappingAccess().getTypemappingKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:524:1: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:525:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:525:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:526:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeMappingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeMapping1207); 

            		newLeafNode(otherlv_1, grammarAccess.getTypeMappingAccess().getTypeDataTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTypeMapping1219); 

                	newLeafNode(otherlv_2, grammarAccess.getTypeMappingAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:541:1: ( (lv_simpleName_3_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:542:1: (lv_simpleName_3_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:542:1: (lv_simpleName_3_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:543:3: lv_simpleName_3_0= RULE_ID
            {
            lv_simpleName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeMapping1236); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:567:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:568:2: (iv_ruleDataSource= ruleDataSource EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:569:2: iv_ruleDataSource= ruleDataSource EOF
            {
             newCompositeNode(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_ruleDataSource_in_entryRuleDataSource1277);
            iv_ruleDataSource=ruleDataSource();

            state._fsp--;

             current =iv_ruleDataSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSource1287); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:576:1: ruleDataSource returns [EObject current=null] : (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' ) ;
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
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:579:28: ( (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:580:1: (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:580:1: (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:580:3: otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'baseUrl' otherlv_4= ':' ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) ) otherlv_6= 'resource' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleDataSource1324); 

                	newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getDatasourceKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:584:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:585:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:585:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:586:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSource1341); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleDataSource1358); 

                	newLeafNode(otherlv_2, grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleDataSource1370); 

                	newLeafNode(otherlv_3, grammarAccess.getDataSourceAccess().getBaseUrlKeyword_3());
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleDataSource1382); 

                	newLeafNode(otherlv_4, grammarAccess.getDataSourceAccess().getColonKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:614:1: ( (lv_baseUrl_5_0= ruleAbsoluteRESTURL ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:615:1: (lv_baseUrl_5_0= ruleAbsoluteRESTURL )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:615:1: (lv_baseUrl_5_0= ruleAbsoluteRESTURL )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:616:3: lv_baseUrl_5_0= ruleAbsoluteRESTURL
            {
             
            	        newCompositeNode(grammarAccess.getDataSourceAccess().getBaseUrlAbsoluteRESTURLParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_ruleDataSource1403);
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

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleDataSource1415); 

                	newLeafNode(otherlv_6, grammarAccess.getDataSourceAccess().getResourceKeyword_6());
                
            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleDataSource1427); 

                	newLeafNode(otherlv_7, grammarAccess.getDataSourceAccess().getColonKeyword_7());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:640:1: ( (otherlv_8= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:641:1: (otherlv_8= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:641:1: (otherlv_8= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:642:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSource1447); 

            		newLeafNode(otherlv_8, grammarAccess.getDataSourceAccess().getResourceTypeEntityCrossReference_8_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:653:2: ( (lv_methods_9_0= ruleDataSourceAccessMethod ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:654:1: (lv_methods_9_0= ruleDataSourceAccessMethod )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:654:1: (lv_methods_9_0= ruleDataSourceAccessMethod )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:655:3: lv_methods_9_0= ruleDataSourceAccessMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSourceAccess().getMethodsDataSourceAccessMethodParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataSourceAccessMethod_in_ruleDataSource1468);
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
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleDataSource1481); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:683:1: entryRuleDataSourceAccessMethod returns [EObject current=null] : iv_ruleDataSourceAccessMethod= ruleDataSourceAccessMethod EOF ;
    public final EObject entryRuleDataSourceAccessMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSourceAccessMethod = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:684:2: (iv_ruleDataSourceAccessMethod= ruleDataSourceAccessMethod EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:685:2: iv_ruleDataSourceAccessMethod= ruleDataSourceAccessMethod EOF
            {
             newCompositeNode(grammarAccess.getDataSourceAccessMethodRule()); 
            pushFollow(FOLLOW_ruleDataSourceAccessMethod_in_entryRuleDataSourceAccessMethod1517);
            iv_ruleDataSourceAccessMethod=ruleDataSourceAccessMethod();

            state._fsp--;

             current =iv_ruleDataSourceAccessMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceAccessMethod1527); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:692:1: ruleDataSourceAccessMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) ) ;
    public final EObject ruleDataSourceAccessMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_returnsMany_6_0=null;
        EObject lv_declaredParameters_2_0 = null;

        EObject lv_declaredParameters_4_0 = null;

        EObject lv_restSpecification_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:695:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:696:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:696:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:696:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ( (lv_returnsMany_6_0= '[]' ) )? ( (lv_restSpecification_7_0= ruleRESTSpecification ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:696:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:697:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:697:1: (lv_name_0_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:698:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSourceAccessMethod1569); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDataSourceAccessMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceAccessMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleDataSourceAccessMethod1586); 

                	newLeafNode(otherlv_1, grammarAccess.getDataSourceAccessMethodAccess().getLeftParenthesisKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:718:1: ( ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:718:2: ( (lv_declaredParameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )*
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:718:2: ( (lv_declaredParameters_2_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:719:1: (lv_declaredParameters_2_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:719:1: (lv_declaredParameters_2_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:720:3: lv_declaredParameters_2_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1608);
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

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:736:2: (otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==26) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:736:4: otherlv_3= ',' ( (lv_declaredParameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleDataSourceAccessMethod1621); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getDataSourceAccessMethodAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:740:1: ( (lv_declaredParameters_4_0= ruleParameter ) )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:741:1: (lv_declaredParameters_4_0= ruleParameter )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:741:1: (lv_declaredParameters_4_0= ruleParameter )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:742:3: lv_declaredParameters_4_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersParameterParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1642);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleDataSourceAccessMethod1658); 

                	newLeafNode(otherlv_5, grammarAccess.getDataSourceAccessMethodAccess().getRightParenthesisKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:762:1: ( (lv_returnsMany_6_0= '[]' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:763:1: (lv_returnsMany_6_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:763:1: (lv_returnsMany_6_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:764:3: lv_returnsMany_6_0= '[]'
                    {
                    lv_returnsMany_6_0=(Token)match(input,17,FOLLOW_17_in_ruleDataSourceAccessMethod1676); 

                            newLeafNode(lv_returnsMany_6_0, grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyLeftSquareBracketRightSquareBracketKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSourceAccessMethodRule());
                    	        }
                           		setWithLastConsumed(current, "returnsMany", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:777:3: ( (lv_restSpecification_7_0= ruleRESTSpecification ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:778:1: (lv_restSpecification_7_0= ruleRESTSpecification )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:778:1: (lv_restSpecification_7_0= ruleRESTSpecification )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:779:3: lv_restSpecification_7_0= ruleRESTSpecification
            {
             
            	        newCompositeNode(grammarAccess.getDataSourceAccessMethodAccess().getRestSpecificationRESTSpecificationParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRESTSpecification_in_ruleDataSourceAccessMethod1711);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:803:1: entryRuleRESTSpecification returns [EObject current=null] : iv_ruleRESTSpecification= ruleRESTSpecification EOF ;
    public final EObject entryRuleRESTSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRESTSpecification = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:804:2: (iv_ruleRESTSpecification= ruleRESTSpecification EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:805:2: iv_ruleRESTSpecification= ruleRESTSpecification EOF
            {
             newCompositeNode(grammarAccess.getRESTSpecificationRule()); 
            pushFollow(FOLLOW_ruleRESTSpecification_in_entryRuleRESTSpecification1747);
            iv_ruleRESTSpecification=ruleRESTSpecification();

            state._fsp--;

             current =iv_ruleRESTSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTSpecification1757); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:812:1: ruleRESTSpecification returns [EObject current=null] : ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleRESTSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_verb_0_0 = null;

        EObject lv_path_1_0 = null;

        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:815:28: ( ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:816:1: ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:816:1: ( ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:816:2: ( (lv_verb_0_0= ruleRESTVerb ) ) ( (lv_path_1_0= ruleRESTURL ) ) (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:816:2: ( (lv_verb_0_0= ruleRESTVerb ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:817:1: (lv_verb_0_0= ruleRESTVerb )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:817:1: (lv_verb_0_0= ruleRESTVerb )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:818:3: lv_verb_0_0= ruleRESTVerb
            {
             
            	        newCompositeNode(grammarAccess.getRESTSpecificationAccess().getVerbRESTVerbEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRESTVerb_in_ruleRESTSpecification1803);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:834:2: ( (lv_path_1_0= ruleRESTURL ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:835:1: (lv_path_1_0= ruleRESTURL )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:835:1: (lv_path_1_0= ruleRESTURL )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:836:3: lv_path_1_0= ruleRESTURL
            {
             
            	        newCompositeNode(grammarAccess.getRESTSpecificationAccess().getPathRESTURLParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRESTURL_in_ruleRESTSpecification1824);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:852:2: (otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:852:4: otherlv_2= '{' ( (lv_body_3_0= ruleDataSourceBodySpecification ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRESTSpecification1837); 

                        	newLeafNode(otherlv_2, grammarAccess.getRESTSpecificationAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:856:1: ( (lv_body_3_0= ruleDataSourceBodySpecification ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:857:1: (lv_body_3_0= ruleDataSourceBodySpecification )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:857:1: (lv_body_3_0= ruleDataSourceBodySpecification )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:858:3: lv_body_3_0= ruleDataSourceBodySpecification
                    {
                     
                    	        newCompositeNode(grammarAccess.getRESTSpecificationAccess().getBodyDataSourceBodySpecificationParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataSourceBodySpecification_in_ruleRESTSpecification1858);
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

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRESTSpecification1870); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:886:1: entryRuleDataSourceBodySpecification returns [EObject current=null] : iv_ruleDataSourceBodySpecification= ruleDataSourceBodySpecification EOF ;
    public final EObject entryRuleDataSourceBodySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSourceBodySpecification = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:887:2: (iv_ruleDataSourceBodySpecification= ruleDataSourceBodySpecification EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:888:2: iv_ruleDataSourceBodySpecification= ruleDataSourceBodySpecification EOF
            {
             newCompositeNode(grammarAccess.getDataSourceBodySpecificationRule()); 
            pushFollow(FOLLOW_ruleDataSourceBodySpecification_in_entryRuleDataSourceBodySpecification1908);
            iv_ruleDataSourceBodySpecification=ruleDataSourceBodySpecification();

            state._fsp--;

             current =iv_ruleDataSourceBodySpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSourceBodySpecification1918); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:895:1: ruleDataSourceBodySpecification returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDataSourceBodySpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:898:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:899:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:899:1: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:900:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:900:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:901:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceBodySpecificationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSourceBodySpecification1962); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:920:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:921:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:922:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1997);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2007); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:929:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:932:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:933:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:933:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:933:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:933:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:934:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:934:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:935:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2052); 

            		newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:946:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:947:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:947:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:948:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2069); 

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


    // $ANTLR start "entryRuleRESTURL"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:972:1: entryRuleRESTURL returns [EObject current=null] : iv_ruleRESTURL= ruleRESTURL EOF ;
    public final EObject entryRuleRESTURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRESTURL = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:973:2: (iv_ruleRESTURL= ruleRESTURL EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:974:2: iv_ruleRESTURL= ruleRESTURL EOF
            {
             newCompositeNode(grammarAccess.getRESTURLRule()); 
            pushFollow(FOLLOW_ruleRESTURL_in_entryRuleRESTURL2110);
            iv_ruleRESTURL=ruleRESTURL();

            state._fsp--;

             current =iv_ruleRESTURL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTURL2120); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:981:1: ruleRESTURL returns [EObject current=null] : (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL ) ;
    public final EObject ruleRESTURL() throws RecognitionException {
        EObject current = null;

        EObject this_AbsoluteRESTURL_0 = null;

        EObject this_RelativeRESTURL_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:984:28: ( (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:985:1: (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:985:1: (this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL | this_RelativeRESTURL_1= ruleRelativeRESTURL )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:986:5: this_AbsoluteRESTURL_0= ruleAbsoluteRESTURL
                    {
                     
                            newCompositeNode(grammarAccess.getRESTURLAccess().getAbsoluteRESTURLParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_ruleRESTURL2167);
                    this_AbsoluteRESTURL_0=ruleAbsoluteRESTURL();

                    state._fsp--;

                     
                            current = this_AbsoluteRESTURL_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:996:5: this_RelativeRESTURL_1= ruleRelativeRESTURL
                    {
                     
                            newCompositeNode(grammarAccess.getRESTURLAccess().getRelativeRESTURLParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRelativeRESTURL_in_ruleRESTURL2194);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1012:1: entryRuleAbsoluteRESTURL returns [EObject current=null] : iv_ruleAbsoluteRESTURL= ruleAbsoluteRESTURL EOF ;
    public final EObject entryRuleAbsoluteRESTURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteRESTURL = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1013:2: (iv_ruleAbsoluteRESTURL= ruleAbsoluteRESTURL EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1014:2: iv_ruleAbsoluteRESTURL= ruleAbsoluteRESTURL EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteRESTURLRule()); 
            pushFollow(FOLLOW_ruleAbsoluteRESTURL_in_entryRuleAbsoluteRESTURL2229);
            iv_ruleAbsoluteRESTURL=ruleAbsoluteRESTURL();

            state._fsp--;

             current =iv_ruleAbsoluteRESTURL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteRESTURL2239); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1021:1: ruleAbsoluteRESTURL returns [EObject current=null] : ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* ) ;
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
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1024:28: ( ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1025:1: ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1025:1: ( () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1025:2: () otherlv_1= 'http://' ( (lv_host_2_0= ruleUrlFragment ) ) (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )? (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1025:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1026:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAbsoluteRESTURLAccess().getAbsoluteRESTURLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleAbsoluteRESTURL2285); 

                	newLeafNode(otherlv_1, grammarAccess.getAbsoluteRESTURLAccess().getHttpKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1035:1: ( (lv_host_2_0= ruleUrlFragment ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1036:1: (lv_host_2_0= ruleUrlFragment )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1036:1: (lv_host_2_0= ruleUrlFragment )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1037:3: lv_host_2_0= ruleUrlFragment
            {
             
            	        newCompositeNode(grammarAccess.getAbsoluteRESTURLAccess().getHostUrlFragmentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2306);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1053:2: (otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1053:4: otherlv_3= ':' ( (lv_port_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleAbsoluteRESTURL2319); 

                        	newLeafNode(otherlv_3, grammarAccess.getAbsoluteRESTURLAccess().getColonKeyword_3_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1057:1: ( (lv_port_4_0= RULE_INT ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1058:1: (lv_port_4_0= RULE_INT )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1058:1: (lv_port_4_0= RULE_INT )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1059:3: lv_port_4_0= RULE_INT
                    {
                    lv_port_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAbsoluteRESTURL2336); 

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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1075:4: (otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1075:6: otherlv_5= '/' ( (lv_fragments_6_0= ruleUrlFragment ) )
            	    {
            	    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleAbsoluteRESTURL2356); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAbsoluteRESTURLAccess().getSolidusKeyword_4_0());
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1079:1: ( (lv_fragments_6_0= ruleUrlFragment ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1080:1: (lv_fragments_6_0= ruleUrlFragment )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1080:1: (lv_fragments_6_0= ruleUrlFragment )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1081:3: lv_fragments_6_0= ruleUrlFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAbsoluteRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2377);
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
            	    break loop16;
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1105:1: entryRuleRelativeRESTURL returns [EObject current=null] : iv_ruleRelativeRESTURL= ruleRelativeRESTURL EOF ;
    public final EObject entryRuleRelativeRESTURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeRESTURL = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1106:2: (iv_ruleRelativeRESTURL= ruleRelativeRESTURL EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1107:2: iv_ruleRelativeRESTURL= ruleRelativeRESTURL EOF
            {
             newCompositeNode(grammarAccess.getRelativeRESTURLRule()); 
            pushFollow(FOLLOW_ruleRelativeRESTURL_in_entryRuleRelativeRESTURL2415);
            iv_ruleRelativeRESTURL=ruleRelativeRESTURL();

            state._fsp--;

             current =iv_ruleRelativeRESTURL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeRESTURL2425); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1114:1: ruleRelativeRESTURL returns [EObject current=null] : ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* ) ;
    public final EObject ruleRelativeRESTURL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fragments_2_0 = null;

        EObject lv_fragments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1117:28: ( ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1118:1: ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1118:1: ( () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1118:2: () otherlv_1= '/' ( (lv_fragments_2_0= ruleUrlFragment ) ) (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1118:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1119:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRelativeRESTURLAccess().getRelativeRESTURLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleRelativeRESTURL2471); 

                	newLeafNode(otherlv_1, grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1128:1: ( (lv_fragments_2_0= ruleUrlFragment ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1129:1: (lv_fragments_2_0= ruleUrlFragment )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1129:1: (lv_fragments_2_0= ruleUrlFragment )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1130:3: lv_fragments_2_0= ruleUrlFragment
            {
             
            	        newCompositeNode(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL2492);
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

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1146:2: (otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1146:4: otherlv_3= '/' ( (lv_fragments_4_0= ruleUrlFragment ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleRelativeRESTURL2505); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRelativeRESTURLAccess().getSolidusKeyword_3_0());
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1150:1: ( (lv_fragments_4_0= ruleUrlFragment ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1151:1: (lv_fragments_4_0= ruleUrlFragment )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1151:1: (lv_fragments_4_0= ruleUrlFragment )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1152:3: lv_fragments_4_0= ruleUrlFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelativeRESTURLAccess().getFragmentsUrlFragmentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL2526);
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
    // $ANTLR end "ruleRelativeRESTURL"


    // $ANTLR start "entryRuleUrlFragment"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1176:1: entryRuleUrlFragment returns [EObject current=null] : iv_ruleUrlFragment= ruleUrlFragment EOF ;
    public final EObject entryRuleUrlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlFragment = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1177:2: (iv_ruleUrlFragment= ruleUrlFragment EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1178:2: iv_ruleUrlFragment= ruleUrlFragment EOF
            {
             newCompositeNode(grammarAccess.getUrlFragmentRule()); 
            pushFollow(FOLLOW_ruleUrlFragment_in_entryRuleUrlFragment2564);
            iv_ruleUrlFragment=ruleUrlFragment();

            state._fsp--;

             current =iv_ruleUrlFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlFragment2574); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1185:1: ruleUrlFragment returns [EObject current=null] : (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable ) ;
    public final EObject ruleUrlFragment() throws RecognitionException {
        EObject current = null;

        EObject this_UrlPathFragment_0 = null;

        EObject this_Variable_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1188:28: ( (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1189:1: (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1189:1: (this_UrlPathFragment_0= ruleUrlPathFragment | this_Variable_1= ruleVariable )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==23) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1190:5: this_UrlPathFragment_0= ruleUrlPathFragment
                    {
                     
                            newCompositeNode(grammarAccess.getUrlFragmentAccess().getUrlPathFragmentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUrlPathFragment_in_ruleUrlFragment2621);
                    this_UrlPathFragment_0=ruleUrlPathFragment();

                    state._fsp--;

                     
                            current = this_UrlPathFragment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1200:5: this_Variable_1= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getUrlFragmentAccess().getVariableParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleUrlFragment2648);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1216:1: entryRuleUrlPathFragment returns [EObject current=null] : iv_ruleUrlPathFragment= ruleUrlPathFragment EOF ;
    public final EObject entryRuleUrlPathFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlPathFragment = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1217:2: (iv_ruleUrlPathFragment= ruleUrlPathFragment EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1218:2: iv_ruleUrlPathFragment= ruleUrlPathFragment EOF
            {
             newCompositeNode(grammarAccess.getUrlPathFragmentRule()); 
            pushFollow(FOLLOW_ruleUrlPathFragment_in_entryRuleUrlPathFragment2683);
            iv_ruleUrlPathFragment=ruleUrlPathFragment();

            state._fsp--;

             current =iv_ruleUrlPathFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlPathFragment2693); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1225:1: ruleUrlPathFragment returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleUrlPathFragment() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1228:28: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1229:1: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1229:1: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1230:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1230:1: (lv_name_0_0= ruleQualifiedName )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1231:3: lv_name_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getUrlPathFragmentAccess().getNameQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleUrlPathFragment2738);
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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1255:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1256:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1257:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2773);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2783); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1264:1: ruleVariable returns [EObject current=null] : (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1267:28: ( (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1268:1: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1268:1: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1268:3: otherlv_0= ':' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleVariable2820); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getColonKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1272:1: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1273:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1273:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1274:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2840); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1293:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1294:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1295:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2877);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2888); 

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
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1302:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1305:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1306:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1306:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1306:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2928); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1313:1: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1314:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleQualifiedName2947); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2962); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "ruleRESTVerb"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1334:1: ruleRESTVerb returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleRESTVerb() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1336:28: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1337:1: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1337:1: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt20=1;
                }
                break;
            case 32:
                {
                alt20=2;
                }
                break;
            case 33:
                {
                alt20=3;
                }
                break;
            case 34:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1337:2: (enumLiteral_0= 'GET' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1337:2: (enumLiteral_0= 'GET' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1337:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleRESTVerb3023); 

                            current = grammarAccess.getRESTVerbAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRESTVerbAccess().getGETEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1343:6: (enumLiteral_1= 'POST' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1343:6: (enumLiteral_1= 'POST' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1343:8: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleRESTVerb3040); 

                            current = grammarAccess.getRESTVerbAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRESTVerbAccess().getPOSTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1349:6: (enumLiteral_2= 'PUT' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1349:6: (enumLiteral_2= 'PUT' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1349:8: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_33_in_ruleRESTVerb3057); 

                            current = grammarAccess.getRESTVerbAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRESTVerbAccess().getPUTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1355:6: (enumLiteral_3= 'DELETE' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1355:6: (enumLiteral_3= 'DELETE' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1355:8: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_34_in_ruleRESTVerb3074); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElement_in_ruleModel130 = new BitSet(new long[]{0x0000000000243802L});
    public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleNamedElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_ruleNamedElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_ruleNamedElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDataType478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEntity589 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity632 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleEntity650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity670 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity684 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity705 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEntity718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute809 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleAttribute827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePlatform946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlatform963 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePlatform980 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rulePlatformMapping_in_rulePlatform1001 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_rulePlatform1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatformMapping_in_entryRulePlatformMapping1050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatformMapping1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMapping_in_rulePlatformMapping1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMapping_in_entryRuleTypeMapping1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMapping1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTypeMapping1187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeMapping1207 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTypeMapping1219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeMapping1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_entryRuleDataSource1277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSource1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDataSource1324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSource1341 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataSource1358 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDataSource1370 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDataSource1382 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_ruleDataSource1403 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDataSource1415 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDataSource1427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSource1447 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleDataSourceAccessMethod_in_ruleDataSource1468 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleDataSource1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceAccessMethod_in_entryRuleDataSourceAccessMethod1517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceAccessMethod1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSourceAccessMethod1569 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDataSourceAccessMethod1586 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1608 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleDataSourceAccessMethod1621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDataSourceAccessMethod1642 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleDataSourceAccessMethod1658 = new BitSet(new long[]{0x0000000780020000L});
    public static final BitSet FOLLOW_17_in_ruleDataSourceAccessMethod1676 = new BitSet(new long[]{0x0000000780020000L});
    public static final BitSet FOLLOW_ruleRESTSpecification_in_ruleDataSourceAccessMethod1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTSpecification_in_entryRuleRESTSpecification1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTSpecification1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTVerb_in_ruleRESTSpecification1803 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_ruleRESTURL_in_ruleRESTSpecification1824 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleRESTSpecification1837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataSourceBodySpecification_in_ruleRESTSpecification1858 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRESTSpecification1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSourceBodySpecification_in_entryRuleDataSourceBodySpecification1908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSourceBodySpecification1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSourceBodySpecification1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTURL_in_entryRuleRESTURL2110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTURL2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_ruleRESTURL2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeRESTURL_in_ruleRESTURL2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteRESTURL_in_entryRuleAbsoluteRESTURL2229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteRESTURL2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAbsoluteRESTURL2285 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2306 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_23_in_ruleAbsoluteRESTURL2319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAbsoluteRESTURL2336 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAbsoluteRESTURL2356 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleAbsoluteRESTURL2377 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleRelativeRESTURL_in_entryRuleRelativeRESTURL2415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeRESTURL2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRelativeRESTURL2471 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL2492 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleRelativeRESTURL2505 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_ruleRelativeRESTURL2526 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleUrlFragment_in_entryRuleUrlFragment2564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlFragment2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPathFragment_in_ruleUrlFragment2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleUrlFragment2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPathFragment_in_entryRuleUrlPathFragment2683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlPathFragment2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUrlPathFragment2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVariable2820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2928 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleQualifiedName2947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2962 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_31_in_ruleRESTVerb3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRESTVerb3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRESTVerb3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRESTVerb3074 = new BitSet(new long[]{0x0000000000000002L});

}