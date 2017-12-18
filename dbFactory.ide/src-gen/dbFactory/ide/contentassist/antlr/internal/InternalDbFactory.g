/*
 * generated by Xtext 2.12.0
 */
grammar InternalDbFactory;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package dbFactory.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommand
entryRuleCommand
:
{ before(grammarAccess.getCommandRule()); }
	 ruleCommand
{ after(grammarAccess.getCommandRule()); } 
	 EOF 
;

// Rule Command
ruleCommand 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommandAccess().getObjAssignment()); }
		(rule__Command__ObjAssignment)
		{ after(grammarAccess.getCommandAccess().getObjAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleObject
entryRuleObject
:
{ before(grammarAccess.getObjectRule()); }
	 ruleObject
{ after(grammarAccess.getObjectRule()); } 
	 EOF 
;

// Rule Object
ruleObject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getObjectAccess().getGroup()); }
		(rule__Object__Group__0)
		{ after(grammarAccess.getObjectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeType
entryRuleAttributeType
:
{ before(grammarAccess.getAttributeTypeRule()); }
	 ruleAttributeType
{ after(grammarAccess.getAttributeTypeRule()); } 
	 EOF 
;

// Rule AttributeType
ruleAttributeType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getGroup()); }
		(rule__AttributeType__Group__0)
		{ after(grammarAccess.getAttributeTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElementType
entryRuleElementType
:
{ before(grammarAccess.getElementTypeRule()); }
	 ruleElementType
{ after(grammarAccess.getElementTypeRule()); } 
	 EOF 
;

// Rule ElementType
ruleElementType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementTypeAccess().getAlternatives()); }
		(rule__ElementType__Alternatives)
		{ after(grammarAccess.getElementTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStandartType
entryRuleStandartType
:
{ before(grammarAccess.getStandartTypeRule()); }
	 ruleStandartType
{ after(grammarAccess.getStandartTypeRule()); } 
	 EOF 
;

// Rule StandartType
ruleStandartType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStandartTypeAccess().getTypeNameAssignment()); }
		(rule__StandartType__TypeNameAssignment)
		{ after(grammarAccess.getStandartTypeAccess().getTypeNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleObjectType
entryRuleObjectType
:
{ before(grammarAccess.getObjectTypeRule()); }
	 ruleObjectType
{ after(grammarAccess.getObjectTypeRule()); } 
	 EOF 
;

// Rule ObjectType
ruleObjectType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getObjectTypeAccess().getTypeObjAssignment()); }
		(rule__ObjectType__TypeObjAssignment)
		{ after(grammarAccess.getObjectTypeAccess().getTypeObjAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementTypeAccess().getStandartTypeParserRuleCall_0()); }
		ruleStandartType
		{ after(grammarAccess.getElementTypeAccess().getStandartTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getElementTypeAccess().getObjectTypeParserRuleCall_1()); }
		ruleObjectType
		{ after(grammarAccess.getElementTypeAccess().getObjectTypeParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandartType__TypeNameAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStandartTypeAccess().getTypeNameTextKeyword_0_0()); }
		'Text'
		{ after(grammarAccess.getStandartTypeAccess().getTypeNameTextKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getStandartTypeAccess().getTypeNameTextKeyword_0_1()); }
		'text'
		{ after(grammarAccess.getStandartTypeAccess().getTypeNameTextKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getStandartTypeAccess().getTypeNameZahlKeyword_0_2()); }
		'Zahl'
		{ after(grammarAccess.getStandartTypeAccess().getTypeNameZahlKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getStandartTypeAccess().getTypeNameZahlKeyword_0_3()); }
		'zahl'
		{ after(grammarAccess.getStandartTypeAccess().getTypeNameZahlKeyword_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getCommandAssignment_0()); }
	(rule__Model__CommandAssignment_0)*
	{ after(grammarAccess.getModelAccess().getCommandAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getModelAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Object__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__0__Impl
	rule__Object__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getObjektKeyword_0()); }
	'Objekt'
	{ after(grammarAccess.getObjectAccess().getObjektKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__1__Impl
	rule__Object__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getNameAssignment_1()); }
	(rule__Object__NameAssignment_1)
	{ after(grammarAccess.getObjectAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__2__Impl
	rule__Object__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getGroup_2()); }
	(rule__Object__Group_2__0)?
	{ after(grammarAccess.getObjectAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__3__Impl
	rule__Object__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__4__Impl
	rule__Object__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getAttributesAssignment_4()); }
	(rule__Object__AttributesAssignment_4)*
	{ after(grammarAccess.getObjectAccess().getAttributesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Object__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group_2__0__Impl
	rule__Object__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getVonKeyword_2_0()); }
	'von'
	{ after(grammarAccess.getObjectAccess().getVonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getSuperTypeAssignment_2_1()); }
	(rule__Object__SuperTypeAssignment_2_1)
	{ after(grammarAccess.getObjectAccess().getSuperTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_0()); }
	(rule__Attribute__NameAssignment_0)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getAttributeAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); }
	(rule__Attribute__TypeAssignment_2)
	{ after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getFullStopKeyword_3()); }
	'.'
	{ after(grammarAccess.getAttributeAccess().getFullStopKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeType__Group__0__Impl
	rule__AttributeType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeTypeAccess().getElementTypeAssignment_0()); }
	(rule__AttributeType__ElementTypeAssignment_0)
	{ after(grammarAccess.getAttributeTypeAccess().getElementTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeTypeAccess().getGroup_1()); }
	(rule__AttributeType__Group_1__0)?
	{ after(grammarAccess.getAttributeTypeAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeType__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeType__Group_1__0__Impl
	rule__AttributeType__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0()); }
	(rule__AttributeType__ArrayAssignment_1_0)
	{ after(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeType__Group_1__1__Impl
	rule__AttributeType__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1()); }
	(rule__AttributeType__LengthAssignment_1_1)
	{ after(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeType__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2()); }
	']'
	{ after(grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__CommandAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0_0()); }
		ruleCommand
		{ after(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__ObjAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommandAccess().getObjObjectParserRuleCall_0()); }
		ruleObject
		{ after(grammarAccess.getCommandAccess().getObjObjectParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__SuperTypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getObjectAccess().getSuperTypeObjectIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getObjectAccess().getSuperTypeObjectIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getObjectAccess().getSuperTypeObjectCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__AttributesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectAccess().getAttributesAttributeParserRuleCall_4_0()); }
		ruleAttribute
		{ after(grammarAccess.getObjectAccess().getAttributesAttributeParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0()); }
		ruleAttributeType
		{ after(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__ElementTypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); }
		ruleElementType
		{ after(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__ArrayAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
		(
			{ before(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
			'['
			{ after(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
		)
		{ after(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__LengthAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StandartType__TypeNameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStandartTypeAccess().getTypeNameAlternatives_0()); }
		(rule__StandartType__TypeNameAlternatives_0)
		{ after(grammarAccess.getStandartTypeAccess().getTypeNameAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectType__TypeObjAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectTypeAccess().getTypeObjObjectCrossReference_0()); }
		(
			{ before(grammarAccess.getObjectTypeAccess().getTypeObjObjectIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getObjectTypeAccess().getTypeObjObjectIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getObjectTypeAccess().getTypeObjObjectCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : ('A'..'Z'|'a'..'z'|'_'|'!') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'!')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;