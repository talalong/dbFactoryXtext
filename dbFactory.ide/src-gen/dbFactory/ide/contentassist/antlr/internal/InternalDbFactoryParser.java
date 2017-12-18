package dbFactory.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dbFactory.services.DbFactoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbFactoryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Text'", "'text'", "'Zahl'", "'zahl'", "'.'", "'Objekt'", "'{'", "'}'", "'von'", "':'", "']'", "'['"
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

    	public void setGrammarAccess(DbFactoryGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalDbFactory.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDbFactory.g:54:1: ( ruleModel EOF )
            // InternalDbFactory.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDbFactory.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDbFactory.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDbFactory.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDbFactory.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDbFactory.g:69:3: ( rule__Model__Group__0 )
            // InternalDbFactory.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalDbFactory.g:78:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalDbFactory.g:79:1: ( ruleCommand EOF )
            // InternalDbFactory.g:80:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalDbFactory.g:87:1: ruleCommand : ( ( rule__Command__ObjAssignment ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:91:2: ( ( ( rule__Command__ObjAssignment ) ) )
            // InternalDbFactory.g:92:2: ( ( rule__Command__ObjAssignment ) )
            {
            // InternalDbFactory.g:92:2: ( ( rule__Command__ObjAssignment ) )
            // InternalDbFactory.g:93:3: ( rule__Command__ObjAssignment )
            {
             before(grammarAccess.getCommandAccess().getObjAssignment()); 
            // InternalDbFactory.g:94:3: ( rule__Command__ObjAssignment )
            // InternalDbFactory.g:94:4: rule__Command__ObjAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Command__ObjAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getObjAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleObject"
    // InternalDbFactory.g:103:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalDbFactory.g:104:1: ( ruleObject EOF )
            // InternalDbFactory.g:105:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalDbFactory.g:112:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:116:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalDbFactory.g:117:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalDbFactory.g:117:2: ( ( rule__Object__Group__0 ) )
            // InternalDbFactory.g:118:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalDbFactory.g:119:3: ( rule__Object__Group__0 )
            // InternalDbFactory.g:119:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleAttribute"
    // InternalDbFactory.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDbFactory.g:129:1: ( ruleAttribute EOF )
            // InternalDbFactory.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDbFactory.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDbFactory.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDbFactory.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDbFactory.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDbFactory.g:144:3: ( rule__Attribute__Group__0 )
            // InternalDbFactory.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalDbFactory.g:153:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalDbFactory.g:154:1: ( ruleAttributeType EOF )
            // InternalDbFactory.g:155:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalDbFactory.g:162:1: ruleAttributeType : ( ( rule__AttributeType__Group__0 ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:166:2: ( ( ( rule__AttributeType__Group__0 ) ) )
            // InternalDbFactory.g:167:2: ( ( rule__AttributeType__Group__0 ) )
            {
            // InternalDbFactory.g:167:2: ( ( rule__AttributeType__Group__0 ) )
            // InternalDbFactory.g:168:3: ( rule__AttributeType__Group__0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup()); 
            // InternalDbFactory.g:169:3: ( rule__AttributeType__Group__0 )
            // InternalDbFactory.g:169:4: rule__AttributeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleElementType"
    // InternalDbFactory.g:178:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // InternalDbFactory.g:179:1: ( ruleElementType EOF )
            // InternalDbFactory.g:180:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalDbFactory.g:187:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:191:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalDbFactory.g:192:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalDbFactory.g:192:2: ( ( rule__ElementType__Alternatives ) )
            // InternalDbFactory.g:193:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalDbFactory.g:194:3: ( rule__ElementType__Alternatives )
            // InternalDbFactory.g:194:4: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleStandartType"
    // InternalDbFactory.g:203:1: entryRuleStandartType : ruleStandartType EOF ;
    public final void entryRuleStandartType() throws RecognitionException {
        try {
            // InternalDbFactory.g:204:1: ( ruleStandartType EOF )
            // InternalDbFactory.g:205:1: ruleStandartType EOF
            {
             before(grammarAccess.getStandartTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStandartType();

            state._fsp--;

             after(grammarAccess.getStandartTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStandartType"


    // $ANTLR start "ruleStandartType"
    // InternalDbFactory.g:212:1: ruleStandartType : ( ( rule__StandartType__TypeNameAssignment ) ) ;
    public final void ruleStandartType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:216:2: ( ( ( rule__StandartType__TypeNameAssignment ) ) )
            // InternalDbFactory.g:217:2: ( ( rule__StandartType__TypeNameAssignment ) )
            {
            // InternalDbFactory.g:217:2: ( ( rule__StandartType__TypeNameAssignment ) )
            // InternalDbFactory.g:218:3: ( rule__StandartType__TypeNameAssignment )
            {
             before(grammarAccess.getStandartTypeAccess().getTypeNameAssignment()); 
            // InternalDbFactory.g:219:3: ( rule__StandartType__TypeNameAssignment )
            // InternalDbFactory.g:219:4: rule__StandartType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StandartType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStandartTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStandartType"


    // $ANTLR start "entryRuleObjectType"
    // InternalDbFactory.g:228:1: entryRuleObjectType : ruleObjectType EOF ;
    public final void entryRuleObjectType() throws RecognitionException {
        try {
            // InternalDbFactory.g:229:1: ( ruleObjectType EOF )
            // InternalDbFactory.g:230:1: ruleObjectType EOF
            {
             before(grammarAccess.getObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectType();

            state._fsp--;

             after(grammarAccess.getObjectTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjectType"


    // $ANTLR start "ruleObjectType"
    // InternalDbFactory.g:237:1: ruleObjectType : ( ( rule__ObjectType__TypeObjAssignment ) ) ;
    public final void ruleObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:241:2: ( ( ( rule__ObjectType__TypeObjAssignment ) ) )
            // InternalDbFactory.g:242:2: ( ( rule__ObjectType__TypeObjAssignment ) )
            {
            // InternalDbFactory.g:242:2: ( ( rule__ObjectType__TypeObjAssignment ) )
            // InternalDbFactory.g:243:3: ( rule__ObjectType__TypeObjAssignment )
            {
             before(grammarAccess.getObjectTypeAccess().getTypeObjAssignment()); 
            // InternalDbFactory.g:244:3: ( rule__ObjectType__TypeObjAssignment )
            // InternalDbFactory.g:244:4: rule__ObjectType__TypeObjAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ObjectType__TypeObjAssignment();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeAccess().getTypeObjAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectType"


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalDbFactory.g:252:1: rule__ElementType__Alternatives : ( ( ruleStandartType ) | ( ruleObjectType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:256:1: ( ( ruleStandartType ) | ( ruleObjectType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=14)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDbFactory.g:257:2: ( ruleStandartType )
                    {
                    // InternalDbFactory.g:257:2: ( ruleStandartType )
                    // InternalDbFactory.g:258:3: ruleStandartType
                    {
                     before(grammarAccess.getElementTypeAccess().getStandartTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStandartType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getStandartTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbFactory.g:263:2: ( ruleObjectType )
                    {
                    // InternalDbFactory.g:263:2: ( ruleObjectType )
                    // InternalDbFactory.g:264:3: ruleObjectType
                    {
                     before(grammarAccess.getElementTypeAccess().getObjectTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getObjectTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__StandartType__TypeNameAlternatives_0"
    // InternalDbFactory.g:273:1: rule__StandartType__TypeNameAlternatives_0 : ( ( 'Text' ) | ( 'text' ) | ( 'Zahl' ) | ( 'zahl' ) );
    public final void rule__StandartType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:277:1: ( ( 'Text' ) | ( 'text' ) | ( 'Zahl' ) | ( 'zahl' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
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
                    // InternalDbFactory.g:278:2: ( 'Text' )
                    {
                    // InternalDbFactory.g:278:2: ( 'Text' )
                    // InternalDbFactory.g:279:3: 'Text'
                    {
                     before(grammarAccess.getStandartTypeAccess().getTypeNameTextKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStandartTypeAccess().getTypeNameTextKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbFactory.g:284:2: ( 'text' )
                    {
                    // InternalDbFactory.g:284:2: ( 'text' )
                    // InternalDbFactory.g:285:3: 'text'
                    {
                     before(grammarAccess.getStandartTypeAccess().getTypeNameTextKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStandartTypeAccess().getTypeNameTextKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDbFactory.g:290:2: ( 'Zahl' )
                    {
                    // InternalDbFactory.g:290:2: ( 'Zahl' )
                    // InternalDbFactory.g:291:3: 'Zahl'
                    {
                     before(grammarAccess.getStandartTypeAccess().getTypeNameZahlKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStandartTypeAccess().getTypeNameZahlKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDbFactory.g:296:2: ( 'zahl' )
                    {
                    // InternalDbFactory.g:296:2: ( 'zahl' )
                    // InternalDbFactory.g:297:3: 'zahl'
                    {
                     before(grammarAccess.getStandartTypeAccess().getTypeNameZahlKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStandartTypeAccess().getTypeNameZahlKeyword_0_3()); 

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
    // $ANTLR end "rule__StandartType__TypeNameAlternatives_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDbFactory.g:306:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:310:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDbFactory.g:311:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDbFactory.g:318:1: rule__Model__Group__0__Impl : ( ( rule__Model__CommandAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:322:1: ( ( ( rule__Model__CommandAssignment_0 )* ) )
            // InternalDbFactory.g:323:1: ( ( rule__Model__CommandAssignment_0 )* )
            {
            // InternalDbFactory.g:323:1: ( ( rule__Model__CommandAssignment_0 )* )
            // InternalDbFactory.g:324:2: ( rule__Model__CommandAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getCommandAssignment_0()); 
            // InternalDbFactory.g:325:2: ( rule__Model__CommandAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDbFactory.g:325:3: rule__Model__CommandAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__CommandAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCommandAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDbFactory.g:333:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:337:1: ( rule__Model__Group__1__Impl )
            // InternalDbFactory.g:338:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDbFactory.g:344:1: rule__Model__Group__1__Impl : ( '.' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:348:1: ( ( '.' ) )
            // InternalDbFactory.g:349:1: ( '.' )
            {
            // InternalDbFactory.g:349:1: ( '.' )
            // InternalDbFactory.g:350:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalDbFactory.g:360:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:364:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalDbFactory.g:365:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalDbFactory.g:372:1: rule__Object__Group__0__Impl : ( 'Objekt' ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:376:1: ( ( 'Objekt' ) )
            // InternalDbFactory.g:377:1: ( 'Objekt' )
            {
            // InternalDbFactory.g:377:1: ( 'Objekt' )
            // InternalDbFactory.g:378:2: 'Objekt'
            {
             before(grammarAccess.getObjectAccess().getObjektKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObjektKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalDbFactory.g:387:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:391:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalDbFactory.g:392:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalDbFactory.g:399:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:403:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalDbFactory.g:404:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalDbFactory.g:404:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalDbFactory.g:405:2: ( rule__Object__NameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // InternalDbFactory.g:406:2: ( rule__Object__NameAssignment_1 )
            // InternalDbFactory.g:406:3: rule__Object__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalDbFactory.g:414:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:418:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalDbFactory.g:419:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalDbFactory.g:426:1: rule__Object__Group__2__Impl : ( ( rule__Object__Group_2__0 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:430:1: ( ( ( rule__Object__Group_2__0 )? ) )
            // InternalDbFactory.g:431:1: ( ( rule__Object__Group_2__0 )? )
            {
            // InternalDbFactory.g:431:1: ( ( rule__Object__Group_2__0 )? )
            // InternalDbFactory.g:432:2: ( rule__Object__Group_2__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_2()); 
            // InternalDbFactory.g:433:2: ( rule__Object__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDbFactory.g:433:3: rule__Object__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalDbFactory.g:441:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:445:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalDbFactory.g:446:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Object__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalDbFactory.g:453:1: rule__Object__Group__3__Impl : ( '{' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:457:1: ( ( '{' ) )
            // InternalDbFactory.g:458:1: ( '{' )
            {
            // InternalDbFactory.g:458:1: ( '{' )
            // InternalDbFactory.g:459:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalDbFactory.g:468:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:472:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalDbFactory.g:473:2: rule__Object__Group__4__Impl rule__Object__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Object__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalDbFactory.g:480:1: rule__Object__Group__4__Impl : ( ( rule__Object__AttributesAssignment_4 )* ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:484:1: ( ( ( rule__Object__AttributesAssignment_4 )* ) )
            // InternalDbFactory.g:485:1: ( ( rule__Object__AttributesAssignment_4 )* )
            {
            // InternalDbFactory.g:485:1: ( ( rule__Object__AttributesAssignment_4 )* )
            // InternalDbFactory.g:486:2: ( rule__Object__AttributesAssignment_4 )*
            {
             before(grammarAccess.getObjectAccess().getAttributesAssignment_4()); 
            // InternalDbFactory.g:487:2: ( rule__Object__AttributesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDbFactory.g:487:3: rule__Object__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Object__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getObjectAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Object__Group__5"
    // InternalDbFactory.g:495:1: rule__Object__Group__5 : rule__Object__Group__5__Impl ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:499:1: ( rule__Object__Group__5__Impl )
            // InternalDbFactory.g:500:2: rule__Object__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5"


    // $ANTLR start "rule__Object__Group__5__Impl"
    // InternalDbFactory.g:506:1: rule__Object__Group__5__Impl : ( '}' ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:510:1: ( ( '}' ) )
            // InternalDbFactory.g:511:1: ( '}' )
            {
            // InternalDbFactory.g:511:1: ( '}' )
            // InternalDbFactory.g:512:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5__Impl"


    // $ANTLR start "rule__Object__Group_2__0"
    // InternalDbFactory.g:522:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:526:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalDbFactory.g:527:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Object__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0"


    // $ANTLR start "rule__Object__Group_2__0__Impl"
    // InternalDbFactory.g:534:1: rule__Object__Group_2__0__Impl : ( 'von' ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:538:1: ( ( 'von' ) )
            // InternalDbFactory.g:539:1: ( 'von' )
            {
            // InternalDbFactory.g:539:1: ( 'von' )
            // InternalDbFactory.g:540:2: 'von'
            {
             before(grammarAccess.getObjectAccess().getVonKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getVonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0__Impl"


    // $ANTLR start "rule__Object__Group_2__1"
    // InternalDbFactory.g:549:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:553:1: ( rule__Object__Group_2__1__Impl )
            // InternalDbFactory.g:554:2: rule__Object__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1"


    // $ANTLR start "rule__Object__Group_2__1__Impl"
    // InternalDbFactory.g:560:1: rule__Object__Group_2__1__Impl : ( ( rule__Object__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:564:1: ( ( ( rule__Object__SuperTypeAssignment_2_1 ) ) )
            // InternalDbFactory.g:565:1: ( ( rule__Object__SuperTypeAssignment_2_1 ) )
            {
            // InternalDbFactory.g:565:1: ( ( rule__Object__SuperTypeAssignment_2_1 ) )
            // InternalDbFactory.g:566:2: ( rule__Object__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getObjectAccess().getSuperTypeAssignment_2_1()); 
            // InternalDbFactory.g:567:2: ( rule__Object__SuperTypeAssignment_2_1 )
            // InternalDbFactory.g:567:3: rule__Object__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDbFactory.g:576:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:580:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDbFactory.g:581:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalDbFactory.g:588:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:592:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalDbFactory.g:593:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalDbFactory.g:593:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalDbFactory.g:594:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalDbFactory.g:595:2: ( rule__Attribute__NameAssignment_0 )
            // InternalDbFactory.g:595:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalDbFactory.g:603:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:607:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDbFactory.g:608:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalDbFactory.g:615:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:619:1: ( ( ':' ) )
            // InternalDbFactory.g:620:1: ( ':' )
            {
            // InternalDbFactory.g:620:1: ( ':' )
            // InternalDbFactory.g:621:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalDbFactory.g:630:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:634:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDbFactory.g:635:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalDbFactory.g:642:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:646:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalDbFactory.g:647:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalDbFactory.g:647:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalDbFactory.g:648:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalDbFactory.g:649:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalDbFactory.g:649:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalDbFactory.g:657:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:661:1: ( rule__Attribute__Group__3__Impl )
            // InternalDbFactory.g:662:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalDbFactory.g:668:1: rule__Attribute__Group__3__Impl : ( '.' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:672:1: ( ( '.' ) )
            // InternalDbFactory.g:673:1: ( '.' )
            {
            // InternalDbFactory.g:673:1: ( '.' )
            // InternalDbFactory.g:674:2: '.'
            {
             before(grammarAccess.getAttributeAccess().getFullStopKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__AttributeType__Group__0"
    // InternalDbFactory.g:684:1: rule__AttributeType__Group__0 : rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 ;
    public final void rule__AttributeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:688:1: ( rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 )
            // InternalDbFactory.g:689:2: rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__AttributeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__0"


    // $ANTLR start "rule__AttributeType__Group__0__Impl"
    // InternalDbFactory.g:696:1: rule__AttributeType__Group__0__Impl : ( ( rule__AttributeType__ElementTypeAssignment_0 ) ) ;
    public final void rule__AttributeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:700:1: ( ( ( rule__AttributeType__ElementTypeAssignment_0 ) ) )
            // InternalDbFactory.g:701:1: ( ( rule__AttributeType__ElementTypeAssignment_0 ) )
            {
            // InternalDbFactory.g:701:1: ( ( rule__AttributeType__ElementTypeAssignment_0 ) )
            // InternalDbFactory.g:702:2: ( rule__AttributeType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getElementTypeAssignment_0()); 
            // InternalDbFactory.g:703:2: ( rule__AttributeType__ElementTypeAssignment_0 )
            // InternalDbFactory.g:703:3: rule__AttributeType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__ElementTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getElementTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__0__Impl"


    // $ANTLR start "rule__AttributeType__Group__1"
    // InternalDbFactory.g:711:1: rule__AttributeType__Group__1 : rule__AttributeType__Group__1__Impl ;
    public final void rule__AttributeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:715:1: ( rule__AttributeType__Group__1__Impl )
            // InternalDbFactory.g:716:2: rule__AttributeType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__1"


    // $ANTLR start "rule__AttributeType__Group__1__Impl"
    // InternalDbFactory.g:722:1: rule__AttributeType__Group__1__Impl : ( ( rule__AttributeType__Group_1__0 )? ) ;
    public final void rule__AttributeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:726:1: ( ( ( rule__AttributeType__Group_1__0 )? ) )
            // InternalDbFactory.g:727:1: ( ( rule__AttributeType__Group_1__0 )? )
            {
            // InternalDbFactory.g:727:1: ( ( rule__AttributeType__Group_1__0 )? )
            // InternalDbFactory.g:728:2: ( rule__AttributeType__Group_1__0 )?
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup_1()); 
            // InternalDbFactory.g:729:2: ( rule__AttributeType__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDbFactory.g:729:3: rule__AttributeType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__0"
    // InternalDbFactory.g:738:1: rule__AttributeType__Group_1__0 : rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1 ;
    public final void rule__AttributeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:742:1: ( rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1 )
            // InternalDbFactory.g:743:2: rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__AttributeType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__0"


    // $ANTLR start "rule__AttributeType__Group_1__0__Impl"
    // InternalDbFactory.g:750:1: rule__AttributeType__Group_1__0__Impl : ( ( rule__AttributeType__ArrayAssignment_1_0 ) ) ;
    public final void rule__AttributeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:754:1: ( ( ( rule__AttributeType__ArrayAssignment_1_0 ) ) )
            // InternalDbFactory.g:755:1: ( ( rule__AttributeType__ArrayAssignment_1_0 ) )
            {
            // InternalDbFactory.g:755:1: ( ( rule__AttributeType__ArrayAssignment_1_0 ) )
            // InternalDbFactory.g:756:2: ( rule__AttributeType__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0()); 
            // InternalDbFactory.g:757:2: ( rule__AttributeType__ArrayAssignment_1_0 )
            // InternalDbFactory.g:757:3: rule__AttributeType__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__1"
    // InternalDbFactory.g:765:1: rule__AttributeType__Group_1__1 : rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2 ;
    public final void rule__AttributeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:769:1: ( rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2 )
            // InternalDbFactory.g:770:2: rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__AttributeType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__1"


    // $ANTLR start "rule__AttributeType__Group_1__1__Impl"
    // InternalDbFactory.g:777:1: rule__AttributeType__Group_1__1__Impl : ( ( rule__AttributeType__LengthAssignment_1_1 ) ) ;
    public final void rule__AttributeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:781:1: ( ( ( rule__AttributeType__LengthAssignment_1_1 ) ) )
            // InternalDbFactory.g:782:1: ( ( rule__AttributeType__LengthAssignment_1_1 ) )
            {
            // InternalDbFactory.g:782:1: ( ( rule__AttributeType__LengthAssignment_1_1 ) )
            // InternalDbFactory.g:783:2: ( rule__AttributeType__LengthAssignment_1_1 )
            {
             before(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1()); 
            // InternalDbFactory.g:784:2: ( rule__AttributeType__LengthAssignment_1_1 )
            // InternalDbFactory.g:784:3: rule__AttributeType__LengthAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__LengthAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__2"
    // InternalDbFactory.g:792:1: rule__AttributeType__Group_1__2 : rule__AttributeType__Group_1__2__Impl ;
    public final void rule__AttributeType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:796:1: ( rule__AttributeType__Group_1__2__Impl )
            // InternalDbFactory.g:797:2: rule__AttributeType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__2"


    // $ANTLR start "rule__AttributeType__Group_1__2__Impl"
    // InternalDbFactory.g:803:1: rule__AttributeType__Group_1__2__Impl : ( ']' ) ;
    public final void rule__AttributeType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:807:1: ( ( ']' ) )
            // InternalDbFactory.g:808:1: ( ']' )
            {
            // InternalDbFactory.g:808:1: ( ']' )
            // InternalDbFactory.g:809:2: ']'
            {
             before(grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__2__Impl"


    // $ANTLR start "rule__Model__CommandAssignment_0"
    // InternalDbFactory.g:819:1: rule__Model__CommandAssignment_0 : ( ruleCommand ) ;
    public final void rule__Model__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:823:1: ( ( ruleCommand ) )
            // InternalDbFactory.g:824:2: ( ruleCommand )
            {
            // InternalDbFactory.g:824:2: ( ruleCommand )
            // InternalDbFactory.g:825:3: ruleCommand
            {
             before(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CommandAssignment_0"


    // $ANTLR start "rule__Command__ObjAssignment"
    // InternalDbFactory.g:834:1: rule__Command__ObjAssignment : ( ruleObject ) ;
    public final void rule__Command__ObjAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:838:1: ( ( ruleObject ) )
            // InternalDbFactory.g:839:2: ( ruleObject )
            {
            // InternalDbFactory.g:839:2: ( ruleObject )
            // InternalDbFactory.g:840:3: ruleObject
            {
             before(grammarAccess.getCommandAccess().getObjObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getObjObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ObjAssignment"


    // $ANTLR start "rule__Object__NameAssignment_1"
    // InternalDbFactory.g:849:1: rule__Object__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:853:1: ( ( RULE_ID ) )
            // InternalDbFactory.g:854:2: ( RULE_ID )
            {
            // InternalDbFactory.g:854:2: ( RULE_ID )
            // InternalDbFactory.g:855:3: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__NameAssignment_1"


    // $ANTLR start "rule__Object__SuperTypeAssignment_2_1"
    // InternalDbFactory.g:864:1: rule__Object__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Object__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:868:1: ( ( ( RULE_ID ) ) )
            // InternalDbFactory.g:869:2: ( ( RULE_ID ) )
            {
            // InternalDbFactory.g:869:2: ( ( RULE_ID ) )
            // InternalDbFactory.g:870:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); 
            // InternalDbFactory.g:871:3: ( RULE_ID )
            // InternalDbFactory.g:872:4: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getSuperTypeObjectIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getSuperTypeObjectIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Object__AttributesAssignment_4"
    // InternalDbFactory.g:883:1: rule__Object__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Object__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:887:1: ( ( ruleAttribute ) )
            // InternalDbFactory.g:888:2: ( ruleAttribute )
            {
            // InternalDbFactory.g:888:2: ( ruleAttribute )
            // InternalDbFactory.g:889:3: ruleAttribute
            {
             before(grammarAccess.getObjectAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getAttributesAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalDbFactory.g:898:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:902:1: ( ( RULE_ID ) )
            // InternalDbFactory.g:903:2: ( RULE_ID )
            {
            // InternalDbFactory.g:903:2: ( RULE_ID )
            // InternalDbFactory.g:904:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalDbFactory.g:913:1: rule__Attribute__TypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:917:1: ( ( ruleAttributeType ) )
            // InternalDbFactory.g:918:2: ( ruleAttributeType )
            {
            // InternalDbFactory.g:918:2: ( ruleAttributeType )
            // InternalDbFactory.g:919:3: ruleAttributeType
            {
             before(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__AttributeType__ElementTypeAssignment_0"
    // InternalDbFactory.g:928:1: rule__AttributeType__ElementTypeAssignment_0 : ( ruleElementType ) ;
    public final void rule__AttributeType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:932:1: ( ( ruleElementType ) )
            // InternalDbFactory.g:933:2: ( ruleElementType )
            {
            // InternalDbFactory.g:933:2: ( ruleElementType )
            // InternalDbFactory.g:934:3: ruleElementType
            {
             before(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__ElementTypeAssignment_0"


    // $ANTLR start "rule__AttributeType__ArrayAssignment_1_0"
    // InternalDbFactory.g:943:1: rule__AttributeType__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__AttributeType__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:947:1: ( ( ( '[' ) ) )
            // InternalDbFactory.g:948:2: ( ( '[' ) )
            {
            // InternalDbFactory.g:948:2: ( ( '[' ) )
            // InternalDbFactory.g:949:3: ( '[' )
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalDbFactory.g:950:3: ( '[' )
            // InternalDbFactory.g:951:4: '['
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__ArrayAssignment_1_0"


    // $ANTLR start "rule__AttributeType__LengthAssignment_1_1"
    // InternalDbFactory.g:962:1: rule__AttributeType__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__AttributeType__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:966:1: ( ( RULE_INT ) )
            // InternalDbFactory.g:967:2: ( RULE_INT )
            {
            // InternalDbFactory.g:967:2: ( RULE_INT )
            // InternalDbFactory.g:968:3: RULE_INT
            {
             before(grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__LengthAssignment_1_1"


    // $ANTLR start "rule__StandartType__TypeNameAssignment"
    // InternalDbFactory.g:977:1: rule__StandartType__TypeNameAssignment : ( ( rule__StandartType__TypeNameAlternatives_0 ) ) ;
    public final void rule__StandartType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:981:1: ( ( ( rule__StandartType__TypeNameAlternatives_0 ) ) )
            // InternalDbFactory.g:982:2: ( ( rule__StandartType__TypeNameAlternatives_0 ) )
            {
            // InternalDbFactory.g:982:2: ( ( rule__StandartType__TypeNameAlternatives_0 ) )
            // InternalDbFactory.g:983:3: ( rule__StandartType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getStandartTypeAccess().getTypeNameAlternatives_0()); 
            // InternalDbFactory.g:984:3: ( rule__StandartType__TypeNameAlternatives_0 )
            // InternalDbFactory.g:984:4: rule__StandartType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__StandartType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStandartTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandartType__TypeNameAssignment"


    // $ANTLR start "rule__ObjectType__TypeObjAssignment"
    // InternalDbFactory.g:992:1: rule__ObjectType__TypeObjAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ObjectType__TypeObjAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbFactory.g:996:1: ( ( ( RULE_ID ) ) )
            // InternalDbFactory.g:997:2: ( ( RULE_ID ) )
            {
            // InternalDbFactory.g:997:2: ( ( RULE_ID ) )
            // InternalDbFactory.g:998:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectTypeAccess().getTypeObjObjectCrossReference_0()); 
            // InternalDbFactory.g:999:3: ( RULE_ID )
            // InternalDbFactory.g:1000:4: RULE_ID
            {
             before(grammarAccess.getObjectTypeAccess().getTypeObjObjectIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectTypeAccess().getTypeObjObjectIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getObjectTypeAccess().getTypeObjObjectCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectType__TypeObjAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}