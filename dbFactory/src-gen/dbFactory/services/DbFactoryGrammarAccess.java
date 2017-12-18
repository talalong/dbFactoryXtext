/*
 * generated by Xtext 2.12.0
 */
package dbFactory.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DbFactoryGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dbFactory.DbFactory.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommandAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommandCommandParserRuleCall_0_0 = (RuleCall)cCommandAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Model:
		//	command+=Command* '.';
		@Override public ParserRule getRule() { return rule; }
		
		//command+=Command* '.'
		public Group getGroup() { return cGroup; }
		
		//command+=Command*
		public Assignment getCommandAssignment_0() { return cCommandAssignment_0; }
		
		//Command
		public RuleCall getCommandCommandParserRuleCall_0_0() { return cCommandCommandParserRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dbFactory.DbFactory.Command");
		private final Assignment cObjAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cObjObjectParserRuleCall_0 = (RuleCall)cObjAssignment.eContents().get(0);
		
		//Command:
		//	obj=Object;
		@Override public ParserRule getRule() { return rule; }
		
		//obj=Object
		public Assignment getObjAssignment() { return cObjAssignment; }
		
		//Object
		public RuleCall getObjObjectParserRuleCall_0() { return cObjObjectParserRuleCall_0; }
	}
	public class ObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dbFactory.DbFactory.Object");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObjektKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cVonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeObjectCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeObjectIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeObjectCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAttributesAttributeParserRuleCall_4_0 = (RuleCall)cAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Object:
		//	'Objekt' name=ID ('von' superType=[Object])? '{'
		//	attributes+=Attribute*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Objekt' name=ID ('von' superType=[Object])? '{' attributes+=Attribute* '}'
		public Group getGroup() { return cGroup; }
		
		//'Objekt'
		public Keyword getObjektKeyword_0() { return cObjektKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('von' superType=[Object])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'von'
		public Keyword getVonKeyword_2_0() { return cVonKeyword_2_0; }
		
		//superType=[Object]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[Object]
		public CrossReference getSuperTypeObjectCrossReference_2_1_0() { return cSuperTypeObjectCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSuperTypeObjectIDTerminalRuleCall_2_1_0_1() { return cSuperTypeObjectIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//attributes+=Attribute*
		public Assignment getAttributesAssignment_4() { return cAttributesAssignment_4; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_4_0() { return cAttributesAttributeParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dbFactory.DbFactory.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeAttributeTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Attribute:
		//	name=ID ':' type=AttributeType '.';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' type=AttributeType '.'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=AttributeType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//AttributeType
		public RuleCall getTypeAttributeTypeParserRuleCall_2_0() { return cTypeAttributeTypeParserRuleCall_2_0; }
		
		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
	}
	public class AttributeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dbFactory.DbFactory.AttributeType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cElementTypeElementTypeParserRuleCall_0_0 = (RuleCall)cElementTypeAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cArrayAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cArrayLeftSquareBracketKeyword_1_0_0 = (Keyword)cArrayAssignment_1_0.eContents().get(0);
		private final Assignment cLengthAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cLengthINTTerminalRuleCall_1_1_0 = (RuleCall)cLengthAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//AttributeType:
		//	elementType=ElementType (array?='[' length=INT ']')?;
		@Override public ParserRule getRule() { return rule; }
		
		//elementType=ElementType (array?='[' length=INT ']')?
		public Group getGroup() { return cGroup; }
		
		//elementType=ElementType
		public Assignment getElementTypeAssignment_0() { return cElementTypeAssignment_0; }
		
		//ElementType
		public RuleCall getElementTypeElementTypeParserRuleCall_0_0() { return cElementTypeElementTypeParserRuleCall_0_0; }
		
		//(array?='[' length=INT ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//array?='['
		public Assignment getArrayAssignment_1_0() { return cArrayAssignment_1_0; }
		
		//'['
		public Keyword getArrayLeftSquareBracketKeyword_1_0_0() { return cArrayLeftSquareBracketKeyword_1_0_0; }
		
		//length=INT
		public Assignment getLengthAssignment_1_1() { return cLengthAssignment_1_1; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_1_1_0() { return cLengthINTTerminalRuleCall_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
	}
	public class ElementTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dbFactory.DbFactory.ElementType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStandartTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cObjectTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ElementType:
		//	StandartType | ObjectType;
		@Override public ParserRule getRule() { return rule; }
		
		//StandartType | ObjectType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//StandartType
		public RuleCall getStandartTypeParserRuleCall_0() { return cStandartTypeParserRuleCall_0; }
		
		//ObjectType
		public RuleCall getObjectTypeParserRuleCall_1() { return cObjectTypeParserRuleCall_1; }
	}
	public class StandartTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dbFactory.DbFactory.StandartType");
		private final Assignment cTypeNameAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTypeNameAlternatives_0 = (Alternatives)cTypeNameAssignment.eContents().get(0);
		private final Keyword cTypeNameTextKeyword_0_0 = (Keyword)cTypeNameAlternatives_0.eContents().get(0);
		private final Keyword cTypeNameTextKeyword_0_1 = (Keyword)cTypeNameAlternatives_0.eContents().get(1);
		private final Keyword cTypeNameZahlKeyword_0_2 = (Keyword)cTypeNameAlternatives_0.eContents().get(2);
		private final Keyword cTypeNameZahlKeyword_0_3 = (Keyword)cTypeNameAlternatives_0.eContents().get(3);
		
		//StandartType:
		//	typeName=('Text' | 'text' | 'Zahl' | 'zahl');
		@Override public ParserRule getRule() { return rule; }
		
		//typeName=('Text' | 'text' | 'Zahl' | 'zahl')
		public Assignment getTypeNameAssignment() { return cTypeNameAssignment; }
		
		//('Text' | 'text' | 'Zahl' | 'zahl')
		public Alternatives getTypeNameAlternatives_0() { return cTypeNameAlternatives_0; }
		
		//'Text'
		public Keyword getTypeNameTextKeyword_0_0() { return cTypeNameTextKeyword_0_0; }
		
		//'text'
		public Keyword getTypeNameTextKeyword_0_1() { return cTypeNameTextKeyword_0_1; }
		
		//'Zahl'
		public Keyword getTypeNameZahlKeyword_0_2() { return cTypeNameZahlKeyword_0_2; }
		
		//'zahl'
		public Keyword getTypeNameZahlKeyword_0_3() { return cTypeNameZahlKeyword_0_3; }
	}
	public class ObjectTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dbFactory.DbFactory.ObjectType");
		private final Assignment cTypeObjAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cTypeObjObjectCrossReference_0 = (CrossReference)cTypeObjAssignment.eContents().get(0);
		private final RuleCall cTypeObjObjectIDTerminalRuleCall_0_1 = (RuleCall)cTypeObjObjectCrossReference_0.eContents().get(1);
		
		//ObjectType:
		//	typeObj=[Object];
		@Override public ParserRule getRule() { return rule; }
		
		//typeObj=[Object]
		public Assignment getTypeObjAssignment() { return cTypeObjAssignment; }
		
		//[Object]
		public CrossReference getTypeObjObjectCrossReference_0() { return cTypeObjObjectCrossReference_0; }
		
		//ID
		public RuleCall getTypeObjObjectIDTerminalRuleCall_0_1() { return cTypeObjObjectIDTerminalRuleCall_0_1; }
	}
	
	
	private final ModelElements pModel;
	private final CommandElements pCommand;
	private final ObjectElements pObject;
	private final AttributeElements pAttribute;
	private final AttributeTypeElements pAttributeType;
	private final ElementTypeElements pElementType;
	private final StandartTypeElements pStandartType;
	private final ObjectTypeElements pObjectType;
	private final TerminalRule tID;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DbFactoryGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pCommand = new CommandElements();
		this.pObject = new ObjectElements();
		this.pAttribute = new AttributeElements();
		this.pAttributeType = new AttributeTypeElements();
		this.pElementType = new ElementTypeElements();
		this.pStandartType = new StandartTypeElements();
		this.pObjectType = new ObjectTypeElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "dbFactory.DbFactory.ID");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dbFactory.DbFactory".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	command+=Command* '.';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Command:
	//	obj=Object;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//Object:
	//	'Objekt' name=ID ('von' superType=[Object])? '{'
	//	attributes+=Attribute*
	//	'}';
	public ObjectElements getObjectAccess() {
		return pObject;
	}
	
	public ParserRule getObjectRule() {
		return getObjectAccess().getRule();
	}
	
	//Attribute:
	//	name=ID ':' type=AttributeType '.';
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//AttributeType:
	//	elementType=ElementType (array?='[' length=INT ']')?;
	public AttributeTypeElements getAttributeTypeAccess() {
		return pAttributeType;
	}
	
	public ParserRule getAttributeTypeRule() {
		return getAttributeTypeAccess().getRule();
	}
	
	//ElementType:
	//	StandartType | ObjectType;
	public ElementTypeElements getElementTypeAccess() {
		return pElementType;
	}
	
	public ParserRule getElementTypeRule() {
		return getElementTypeAccess().getRule();
	}
	
	//StandartType:
	//	typeName=('Text' | 'text' | 'Zahl' | 'zahl');
	public StandartTypeElements getStandartTypeAccess() {
		return pStandartType;
	}
	
	public ParserRule getStandartTypeRule() {
		return getStandartTypeAccess().getRule();
	}
	
	//ObjectType:
	//	typeObj=[Object];
	public ObjectTypeElements getObjectTypeAccess() {
		return pObjectType;
	}
	
	public ParserRule getObjectTypeRule() {
		return getObjectTypeAccess().getRule();
	}
	
	//terminal ID:
	//	('A'..'Z' | 'a'..'z' | '_' | '!') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '!')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}