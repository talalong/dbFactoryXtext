package dbFactory.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dbFactory.services.DbFactoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbFactoryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'Objekt'", "'von'", "'{'", "'}'", "':'", "'['", "']'", "'Text'", "'text'", "'Zahl'", "'zahl'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDbFactoryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDbFactoryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDbFactoryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDbFactory.g"; }



     	private DbFactoryGrammarAccess grammarAccess;

        public InternalDbFactoryParser(TokenStream input, DbFactoryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DbFactoryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDbFactory.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDbFactory.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDbFactory.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDbFactory.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_command_0_0= ruleCommand ) )* otherlv_1= '.' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_command_0_0 = null;



        	enterRule();

        try {
            // InternalDbFactory.g:77:2: ( ( ( (lv_command_0_0= ruleCommand ) )* otherlv_1= '.' ) )
            // InternalDbFactory.g:78:2: ( ( (lv_command_0_0= ruleCommand ) )* otherlv_1= '.' )
            {
            // InternalDbFactory.g:78:2: ( ( (lv_command_0_0= ruleCommand ) )* otherlv_1= '.' )
            // InternalDbFactory.g:79:3: ( (lv_command_0_0= ruleCommand ) )* otherlv_1= '.'
            {
            // InternalDbFactory.g:79:3: ( (lv_command_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDbFactory.g:80:4: (lv_command_0_0= ruleCommand )
            	    {
            	    // InternalDbFactory.g:80:4: (lv_command_0_0= ruleCommand )
            	    // InternalDbFactory.g:81:5: lv_command_0_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_command_0_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"command",
            	    						lv_command_0_0,
            	    						"dbFactory.DbFactory.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getFullStopKeyword_1());
            		

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


    // $ANTLR start "entryRuleCommand"
    // InternalDbFactory.g:106:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalDbFactory.g:106:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalDbFactory.g:107:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalDbFactory.g:113:1: ruleCommand returns [EObject current=null] : ( (lv_obj_0_0= ruleObject ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject lv_obj_0_0 = null;



        	enterRule();

        try {
            // InternalDbFactory.g:119:2: ( ( (lv_obj_0_0= ruleObject ) ) )
            // InternalDbFactory.g:120:2: ( (lv_obj_0_0= ruleObject ) )
            {
            // InternalDbFactory.g:120:2: ( (lv_obj_0_0= ruleObject ) )
            // InternalDbFactory.g:121:3: (lv_obj_0_0= ruleObject )
            {
            // InternalDbFactory.g:121:3: (lv_obj_0_0= ruleObject )
            // InternalDbFactory.g:122:4: lv_obj_0_0= ruleObject
            {

            				newCompositeNode(grammarAccess.getCommandAccess().getObjObjectParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_obj_0_0=ruleObject();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getCommandRule());
            				}
            				set(
            					current,
            					"obj",
            					lv_obj_0_0,
            					"dbFactory.DbFactory.Object");
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleObject"
    // InternalDbFactory.g:142:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalDbFactory.g:142:47: (iv_ruleObject= ruleObject EOF )
            // InternalDbFactory.g:143:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalDbFactory.g:149:1: ruleObject returns [EObject current=null] : (otherlv_0= 'Objekt' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalDbFactory.g:155:2: ( (otherlv_0= 'Objekt' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalDbFactory.g:156:2: (otherlv_0= 'Objekt' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalDbFactory.g:156:2: (otherlv_0= 'Objekt' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalDbFactory.g:157:3: otherlv_0= 'Objekt' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getObjektKeyword_0());
            		
            // InternalDbFactory.g:161:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDbFactory.g:162:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDbFactory.g:162:4: (lv_name_1_0= RULE_ID )
            // InternalDbFactory.g:163:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"dbFactory.DbFactory.ID");
            				

            }


            }

            // InternalDbFactory.g:179:3: (otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDbFactory.g:180:4: otherlv_2= 'von' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getVonKeyword_2_0());
                    			
                    // InternalDbFactory.g:184:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDbFactory.g:185:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDbFactory.g:185:5: (otherlv_3= RULE_ID )
                    // InternalDbFactory.g:186:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDbFactory.g:202:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDbFactory.g:203:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalDbFactory.g:203:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalDbFactory.g:204:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getObjectAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"dbFactory.DbFactory.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleAttribute"
    // InternalDbFactory.g:229:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDbFactory.g:229:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDbFactory.g:230:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDbFactory.g:236:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '.' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDbFactory.g:242:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '.' ) )
            // InternalDbFactory.g:243:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '.' )
            {
            // InternalDbFactory.g:243:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '.' )
            // InternalDbFactory.g:244:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '.'
            {
            // InternalDbFactory.g:244:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDbFactory.g:245:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDbFactory.g:245:4: (lv_name_0_0= RULE_ID )
            // InternalDbFactory.g:246:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"dbFactory.DbFactory.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalDbFactory.g:266:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalDbFactory.g:267:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalDbFactory.g:267:4: (lv_type_2_0= ruleAttributeType )
            // InternalDbFactory.g:268:5: lv_type_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"dbFactory.DbFactory.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getFullStopKeyword_3());
            		

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


    // $ANTLR start "entryRuleAttributeType"
    // InternalDbFactory.g:293:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalDbFactory.g:293:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalDbFactory.g:294:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalDbFactory.g:300:1: ruleAttributeType returns [EObject current=null] : ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        EObject lv_elementType_0_0 = null;



        	enterRule();

        try {
            // InternalDbFactory.g:306:2: ( ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )? ) )
            // InternalDbFactory.g:307:2: ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )? )
            {
            // InternalDbFactory.g:307:2: ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )? )
            // InternalDbFactory.g:308:3: ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )?
            {
            // InternalDbFactory.g:308:3: ( (lv_elementType_0_0= ruleElementType ) )
            // InternalDbFactory.g:309:4: (lv_elementType_0_0= ruleElementType )
            {
            // InternalDbFactory.g:309:4: (lv_elementType_0_0= ruleElementType )
            // InternalDbFactory.g:310:5: lv_elementType_0_0= ruleElementType
            {

            					newCompositeNode(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_elementType_0_0=ruleElementType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_0_0,
            						"dbFactory.DbFactory.ElementType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDbFactory.g:327:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDbFactory.g:328:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']'
                    {
                    // InternalDbFactory.g:328:4: ( (lv_array_1_0= '[' ) )
                    // InternalDbFactory.g:329:5: (lv_array_1_0= '[' )
                    {
                    // InternalDbFactory.g:329:5: (lv_array_1_0= '[' )
                    // InternalDbFactory.g:330:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,17,FOLLOW_12); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeTypeRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalDbFactory.g:342:4: ( (lv_length_2_0= RULE_INT ) )
                    // InternalDbFactory.g:343:5: (lv_length_2_0= RULE_INT )
                    {
                    // InternalDbFactory.g:343:5: (lv_length_2_0= RULE_INT )
                    // InternalDbFactory.g:344:6: lv_length_2_0= RULE_INT
                    {
                    lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_length_2_0, grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleElementType"
    // InternalDbFactory.g:369:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalDbFactory.g:369:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalDbFactory.g:370:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalDbFactory.g:376:1: ruleElementType returns [EObject current=null] : (this_StandartType_0= ruleStandartType | this_ObjectType_1= ruleObjectType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_StandartType_0 = null;

        EObject this_ObjectType_1 = null;



        	enterRule();

        try {
            // InternalDbFactory.g:382:2: ( (this_StandartType_0= ruleStandartType | this_ObjectType_1= ruleObjectType ) )
            // InternalDbFactory.g:383:2: (this_StandartType_0= ruleStandartType | this_ObjectType_1= ruleObjectType )
            {
            // InternalDbFactory.g:383:2: (this_StandartType_0= ruleStandartType | this_ObjectType_1= ruleObjectType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=19 && LA5_0<=22)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDbFactory.g:384:3: this_StandartType_0= ruleStandartType
                    {

                    			newCompositeNode(grammarAccess.getElementTypeAccess().getStandartTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StandartType_0=ruleStandartType();

                    state._fsp--;


                    			current = this_StandartType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDbFactory.g:393:3: this_ObjectType_1= ruleObjectType
                    {

                    			newCompositeNode(grammarAccess.getElementTypeAccess().getObjectTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectType_1=ruleObjectType();

                    state._fsp--;


                    			current = this_ObjectType_1;
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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleStandartType"
    // InternalDbFactory.g:405:1: entryRuleStandartType returns [EObject current=null] : iv_ruleStandartType= ruleStandartType EOF ;
    public final EObject entryRuleStandartType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandartType = null;


        try {
            // InternalDbFactory.g:405:53: (iv_ruleStandartType= ruleStandartType EOF )
            // InternalDbFactory.g:406:2: iv_ruleStandartType= ruleStandartType EOF
            {
             newCompositeNode(grammarAccess.getStandartTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStandartType=ruleStandartType();

            state._fsp--;

             current =iv_ruleStandartType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStandartType"


    // $ANTLR start "ruleStandartType"
    // InternalDbFactory.g:412:1: ruleStandartType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'Text' | lv_typeName_0_2= 'text' | lv_typeName_0_3= 'Zahl' | lv_typeName_0_4= 'zahl' ) ) ) ;
    public final EObject ruleStandartType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;


        	enterRule();

        try {
            // InternalDbFactory.g:418:2: ( ( ( (lv_typeName_0_1= 'Text' | lv_typeName_0_2= 'text' | lv_typeName_0_3= 'Zahl' | lv_typeName_0_4= 'zahl' ) ) ) )
            // InternalDbFactory.g:419:2: ( ( (lv_typeName_0_1= 'Text' | lv_typeName_0_2= 'text' | lv_typeName_0_3= 'Zahl' | lv_typeName_0_4= 'zahl' ) ) )
            {
            // InternalDbFactory.g:419:2: ( ( (lv_typeName_0_1= 'Text' | lv_typeName_0_2= 'text' | lv_typeName_0_3= 'Zahl' | lv_typeName_0_4= 'zahl' ) ) )
            // InternalDbFactory.g:420:3: ( (lv_typeName_0_1= 'Text' | lv_typeName_0_2= 'text' | lv_typeName_0_3= 'Zahl' | lv_typeName_0_4= 'zahl' ) )
            {
            // InternalDbFactory.g:420:3: ( (lv_typeName_0_1= 'Text' | lv_typeName_0_2= 'text' | lv_typeName_0_3= 'Zahl' | lv_typeName_0_4= 'zahl' ) )
            // InternalDbFactory.g:421:4: (lv_typeName_0_1= 'Text' | lv_typeName_0_2= 'text' | lv_typeName_0_3= 'Zahl' | lv_typeName_0_4= 'zahl' )
            {
            // InternalDbFactory.g:421:4: (lv_typeName_0_1= 'Text' | lv_typeName_0_2= 'text' | lv_typeName_0_3= 'Zahl' | lv_typeName_0_4= 'zahl' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDbFactory.g:422:5: lv_typeName_0_1= 'Text'
                    {
                    lv_typeName_0_1=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_1, grammarAccess.getStandartTypeAccess().getTypeNameTextKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStandartTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDbFactory.g:433:5: lv_typeName_0_2= 'text'
                    {
                    lv_typeName_0_2=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_2, grammarAccess.getStandartTypeAccess().getTypeNameTextKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStandartTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalDbFactory.g:444:5: lv_typeName_0_3= 'Zahl'
                    {
                    lv_typeName_0_3=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_3, grammarAccess.getStandartTypeAccess().getTypeNameZahlKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStandartTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalDbFactory.g:455:5: lv_typeName_0_4= 'zahl'
                    {
                    lv_typeName_0_4=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_4, grammarAccess.getStandartTypeAccess().getTypeNameZahlKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStandartTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleStandartType"


    // $ANTLR start "entryRuleObjectType"
    // InternalDbFactory.g:471:1: entryRuleObjectType returns [EObject current=null] : iv_ruleObjectType= ruleObjectType EOF ;
    public final EObject entryRuleObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectType = null;


        try {
            // InternalDbFactory.g:471:51: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalDbFactory.g:472:2: iv_ruleObjectType= ruleObjectType EOF
            {
             newCompositeNode(grammarAccess.getObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectType=ruleObjectType();

            state._fsp--;

             current =iv_ruleObjectType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjectType"


    // $ANTLR start "ruleObjectType"
    // InternalDbFactory.g:478:1: ruleObjectType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDbFactory.g:484:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDbFactory.g:485:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDbFactory.g:485:2: ( (otherlv_0= RULE_ID ) )
            // InternalDbFactory.g:486:3: (otherlv_0= RULE_ID )
            {
            // InternalDbFactory.g:486:3: (otherlv_0= RULE_ID )
            // InternalDbFactory.g:487:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getObjectTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getObjectTypeAccess().getTypeObjObjectCrossReference_0());
            			

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
    // $ANTLR end "ruleObjectType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});

}