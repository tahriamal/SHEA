package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'configuration'", "'{'", "'}'", "'node'", "'component'", "'hostedBy'", "'nothostedBy'", "'collocated'", "'separated'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : (this_node_0= rulenode | this_configuration_1= ruleconfiguration | this_relationship_2= rulerelationship ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_node_0 = null;

        EObject this_configuration_1 = null;

        EObject this_relationship_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( (this_node_0= rulenode | this_configuration_1= ruleconfiguration | this_relationship_2= rulerelationship ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (this_node_0= rulenode | this_configuration_1= ruleconfiguration | this_relationship_2= rulerelationship )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (this_node_0= rulenode | this_configuration_1= ruleconfiguration | this_relationship_2= rulerelationship )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:5: this_node_0= rulenode
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getNodeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulenode_in_ruleModel132);
                    this_node_0=rulenode();

                    state._fsp--;

                     
                            current = this_node_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:91:5: this_configuration_1= ruleconfiguration
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getConfigurationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleconfiguration_in_ruleModel159);
                    this_configuration_1=ruleconfiguration();

                    state._fsp--;

                     
                            current = this_configuration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:101:5: this_relationship_2= rulerelationship
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getRelationshipParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulerelationship_in_ruleModel186);
                    this_relationship_2=rulerelationship();

                    state._fsp--;

                     
                            current = this_relationship_2; 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleconfiguration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:1: entryRuleconfiguration returns [EObject current=null] : iv_ruleconfiguration= ruleconfiguration EOF ;
    public final EObject entryRuleconfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconfiguration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:2: (iv_ruleconfiguration= ruleconfiguration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:2: iv_ruleconfiguration= ruleconfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_ruleconfiguration_in_entryRuleconfiguration221);
            iv_ruleconfiguration=ruleconfiguration();

            state._fsp--;

             current =iv_ruleconfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconfiguration231); 

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
    // $ANTLR end "entryRuleconfiguration"


    // $ANTLR start "ruleconfiguration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:1: ruleconfiguration returns [EObject current=null] : (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= rulecomponent ) )* otherlv_4= '}' ) ;
    public final EObject ruleconfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:129:28: ( (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= rulecomponent ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:130:1: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= rulecomponent ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:130:1: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= rulecomponent ) )* otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:130:3: otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= rulecomponent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleconfiguration268); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:134:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:135:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:135:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconfiguration285); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConfigurationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigurationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleconfiguration302); 

                	newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:1: ( (lv_components_3_0= rulecomponent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:157:1: (lv_components_3_0= rulecomponent )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:157:1: (lv_components_3_0= rulecomponent )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:158:3: lv_components_3_0= rulecomponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecomponent_in_ruleconfiguration323);
            	    lv_components_3_0=rulecomponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_3_0, 
            	            		"component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleconfiguration336); 

                	newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleconfiguration"


    // $ANTLR start "entryRulenode"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:186:1: entryRulenode returns [EObject current=null] : iv_rulenode= rulenode EOF ;
    public final EObject entryRulenode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenode = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:2: (iv_rulenode= rulenode EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:2: iv_rulenode= rulenode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_rulenode_in_entryRulenode372);
            iv_rulenode=rulenode();

            state._fsp--;

             current =iv_rulenode; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenode382); 

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
    // $ANTLR end "entryRulenode"


    // $ANTLR start "rulenode"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:195:1: rulenode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulenode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulenode419); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:204:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:204:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulenode436); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
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
    // $ANTLR end "rulenode"


    // $ANTLR start "entryRulecomponent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:1: entryRulecomponent returns [EObject current=null] : iv_rulecomponent= rulecomponent EOF ;
    public final EObject entryRulecomponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecomponent = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:2: (iv_rulecomponent= rulecomponent EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:2: iv_rulecomponent= rulecomponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_rulecomponent_in_entryRulecomponent477);
            iv_rulecomponent=rulecomponent();

            state._fsp--;

             current =iv_rulecomponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecomponent487); 

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
    // $ANTLR end "entryRulecomponent"


    // $ANTLR start "rulecomponent"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:238:1: rulecomponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_relationship_2_0= rulerelationship ) )* ) ;
    public final EObject rulecomponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_relationship_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_relationship_2_0= rulerelationship ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_relationship_2_0= rulerelationship ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_relationship_2_0= rulerelationship ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_relationship_2_0= rulerelationship ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulecomponent524); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:246:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecomponent541); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:264:2: ( (lv_relationship_2_0= rulerelationship ) )*
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt3=1;
                    }
                    break;
                case 17:
                    {
                    alt3=1;
                    }
                    break;
                case 18:
                    {
                    alt3=1;
                    }
                    break;
                case 19:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:265:1: (lv_relationship_2_0= rulerelationship )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:265:1: (lv_relationship_2_0= rulerelationship )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:266:3: lv_relationship_2_0= rulerelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getRelationshipRelationshipParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulerelationship_in_rulecomponent567);
            	    lv_relationship_2_0=rulerelationship();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relationship",
            	            		lv_relationship_2_0, 
            	            		"relationship");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "rulecomponent"


    // $ANTLR start "entryRulerelationship"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:290:1: entryRulerelationship returns [EObject current=null] : iv_rulerelationship= rulerelationship EOF ;
    public final EObject entryRulerelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelationship = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:291:2: (iv_rulerelationship= rulerelationship EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:292:2: iv_rulerelationship= rulerelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_rulerelationship_in_entryRulerelationship604);
            iv_rulerelationship=rulerelationship();

            state._fsp--;

             current =iv_rulerelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerelationship614); 

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
    // $ANTLR end "entryRulerelationship"


    // $ANTLR start "rulerelationship"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:1: rulerelationship returns [EObject current=null] : (this_hostedBy_0= rulehostedBy | this_notHostedBy_1= rulenotHostedBy | this_collocated_2= rulecollocated | this_separated_3= ruleseparated ) ;
    public final EObject rulerelationship() throws RecognitionException {
        EObject current = null;

        EObject this_hostedBy_0 = null;

        EObject this_notHostedBy_1 = null;

        EObject this_collocated_2 = null;

        EObject this_separated_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:28: ( (this_hostedBy_0= rulehostedBy | this_notHostedBy_1= rulenotHostedBy | this_collocated_2= rulecollocated | this_separated_3= ruleseparated ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:1: (this_hostedBy_0= rulehostedBy | this_notHostedBy_1= rulenotHostedBy | this_collocated_2= rulecollocated | this_separated_3= ruleseparated )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:1: (this_hostedBy_0= rulehostedBy | this_notHostedBy_1= rulenotHostedBy | this_collocated_2= rulecollocated | this_separated_3= ruleseparated )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:5: this_hostedBy_0= rulehostedBy
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getHostedByParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulehostedBy_in_rulerelationship661);
                    this_hostedBy_0=rulehostedBy();

                    state._fsp--;

                     
                            current = this_hostedBy_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:5: this_notHostedBy_1= rulenotHostedBy
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getNotHostedByParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulenotHostedBy_in_rulerelationship688);
                    this_notHostedBy_1=rulenotHostedBy();

                    state._fsp--;

                     
                            current = this_notHostedBy_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:5: this_collocated_2= rulecollocated
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getCollocatedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulecollocated_in_rulerelationship715);
                    this_collocated_2=rulecollocated();

                    state._fsp--;

                     
                            current = this_collocated_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:5: this_separated_3= ruleseparated
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getSeparatedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleseparated_in_rulerelationship742);
                    this_separated_3=ruleseparated();

                    state._fsp--;

                     
                            current = this_separated_3; 
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
    // $ANTLR end "rulerelationship"


    // $ANTLR start "entryRulehostedBy"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: entryRulehostedBy returns [EObject current=null] : iv_rulehostedBy= rulehostedBy EOF ;
    public final EObject entryRulehostedBy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehostedBy = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:2: (iv_rulehostedBy= rulehostedBy EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:2: iv_rulehostedBy= rulehostedBy EOF
            {
             newCompositeNode(grammarAccess.getHostedByRule()); 
            pushFollow(FOLLOW_rulehostedBy_in_entryRulehostedBy777);
            iv_rulehostedBy=rulehostedBy();

            state._fsp--;

             current =iv_rulehostedBy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulehostedBy787); 

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
    // $ANTLR end "entryRulehostedBy"


    // $ANTLR start "rulehostedBy"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:359:1: rulehostedBy returns [EObject current=null] : (otherlv_0= 'hostedBy' this_node_1= rulenode ) ;
    public final EObject rulehostedBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_node_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:28: ( (otherlv_0= 'hostedBy' this_node_1= rulenode ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:1: (otherlv_0= 'hostedBy' this_node_1= rulenode )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:1: (otherlv_0= 'hostedBy' this_node_1= rulenode )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:3: otherlv_0= 'hostedBy' this_node_1= rulenode
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulehostedBy824); 

                	newLeafNode(otherlv_0, grammarAccess.getHostedByAccess().getHostedByKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getHostedByAccess().getNodeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulenode_in_rulehostedBy846);
            this_node_1=rulenode();

            state._fsp--;

             
                    current = this_node_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulehostedBy"


    // $ANTLR start "entryRulenotHostedBy"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:384:1: entryRulenotHostedBy returns [EObject current=null] : iv_rulenotHostedBy= rulenotHostedBy EOF ;
    public final EObject entryRulenotHostedBy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenotHostedBy = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:385:2: (iv_rulenotHostedBy= rulenotHostedBy EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:386:2: iv_rulenotHostedBy= rulenotHostedBy EOF
            {
             newCompositeNode(grammarAccess.getNotHostedByRule()); 
            pushFollow(FOLLOW_rulenotHostedBy_in_entryRulenotHostedBy881);
            iv_rulenotHostedBy=rulenotHostedBy();

            state._fsp--;

             current =iv_rulenotHostedBy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenotHostedBy891); 

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
    // $ANTLR end "entryRulenotHostedBy"


    // $ANTLR start "rulenotHostedBy"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:393:1: rulenotHostedBy returns [EObject current=null] : (otherlv_0= 'nothostedBy' this_node_1= rulenode ) ;
    public final EObject rulenotHostedBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_node_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:28: ( (otherlv_0= 'nothostedBy' this_node_1= rulenode ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:1: (otherlv_0= 'nothostedBy' this_node_1= rulenode )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:1: (otherlv_0= 'nothostedBy' this_node_1= rulenode )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:3: otherlv_0= 'nothostedBy' this_node_1= rulenode
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulenotHostedBy928); 

                	newLeafNode(otherlv_0, grammarAccess.getNotHostedByAccess().getNothostedByKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNotHostedByAccess().getNodeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulenode_in_rulenotHostedBy950);
            this_node_1=rulenode();

            state._fsp--;

             
                    current = this_node_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulenotHostedBy"


    // $ANTLR start "entryRulecollocated"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:418:1: entryRulecollocated returns [EObject current=null] : iv_rulecollocated= rulecollocated EOF ;
    public final EObject entryRulecollocated() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecollocated = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:419:2: (iv_rulecollocated= rulecollocated EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:2: iv_rulecollocated= rulecollocated EOF
            {
             newCompositeNode(grammarAccess.getCollocatedRule()); 
            pushFollow(FOLLOW_rulecollocated_in_entryRulecollocated985);
            iv_rulecollocated=rulecollocated();

            state._fsp--;

             current =iv_rulecollocated; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecollocated995); 

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
    // $ANTLR end "entryRulecollocated"


    // $ANTLR start "rulecollocated"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:1: rulecollocated returns [EObject current=null] : (otherlv_0= 'collocated' this_component_1= rulecomponent ) ;
    public final EObject rulecollocated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_component_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:28: ( (otherlv_0= 'collocated' this_component_1= rulecomponent ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:431:1: (otherlv_0= 'collocated' this_component_1= rulecomponent )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:431:1: (otherlv_0= 'collocated' this_component_1= rulecomponent )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:431:3: otherlv_0= 'collocated' this_component_1= rulecomponent
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulecollocated1032); 

                	newLeafNode(otherlv_0, grammarAccess.getCollocatedAccess().getCollocatedKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getCollocatedAccess().getComponentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulecomponent_in_rulecollocated1054);
            this_component_1=rulecomponent();

            state._fsp--;

             
                    current = this_component_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulecollocated"


    // $ANTLR start "entryRuleseparated"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:1: entryRuleseparated returns [EObject current=null] : iv_ruleseparated= ruleseparated EOF ;
    public final EObject entryRuleseparated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleseparated = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:453:2: (iv_ruleseparated= ruleseparated EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:2: iv_ruleseparated= ruleseparated EOF
            {
             newCompositeNode(grammarAccess.getSeparatedRule()); 
            pushFollow(FOLLOW_ruleseparated_in_entryRuleseparated1089);
            iv_ruleseparated=ruleseparated();

            state._fsp--;

             current =iv_ruleseparated; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleseparated1099); 

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
    // $ANTLR end "entryRuleseparated"


    // $ANTLR start "ruleseparated"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:1: ruleseparated returns [EObject current=null] : (otherlv_0= 'separated' this_component_1= rulecomponent ) ;
    public final EObject ruleseparated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_component_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:28: ( (otherlv_0= 'separated' this_component_1= rulecomponent ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:1: (otherlv_0= 'separated' this_component_1= rulecomponent )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:1: (otherlv_0= 'separated' this_component_1= rulecomponent )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:3: otherlv_0= 'separated' this_component_1= rulecomponent
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleseparated1136); 

                	newLeafNode(otherlv_0, grammarAccess.getSeparatedAccess().getSeparatedKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getSeparatedAccess().getComponentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulecomponent_in_ruleseparated1158);
            this_component_1=rulecomponent();

            state._fsp--;

             
                    current = this_component_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleseparated"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_in_ruleModel132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconfiguration_in_ruleModel159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelationship_in_ruleModel186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconfiguration_in_entryRuleconfiguration221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconfiguration231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleconfiguration268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconfiguration285 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleconfiguration302 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rulecomponent_in_ruleconfiguration323 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleconfiguration336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_in_entryRulenode372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenode382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulenode419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulenode436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomponent_in_entryRulecomponent477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecomponent487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulecomponent524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecomponent541 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_rulerelationship_in_rulecomponent567 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_rulerelationship_in_entryRulerelationship604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelationship614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehostedBy_in_rulerelationship661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenotHostedBy_in_rulerelationship688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecollocated_in_rulerelationship715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleseparated_in_rulerelationship742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehostedBy_in_entryRulehostedBy777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehostedBy787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulehostedBy824 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulenode_in_rulehostedBy846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenotHostedBy_in_entryRulenotHostedBy881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenotHostedBy891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulenotHostedBy928 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulenode_in_rulenotHostedBy950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecollocated_in_entryRulecollocated985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecollocated995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulecollocated1032 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rulecomponent_in_rulecollocated1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleseparated_in_entryRuleseparated1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleseparated1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleseparated1136 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rulecomponent_in_ruleseparated1158 = new BitSet(new long[]{0x0000000000000002L});

}