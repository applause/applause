package org.applause.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.applause.lang.applauseDsl.AbsoluteRESTURL;
import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.AttributeReference;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.DataSourceBodySpecification;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.DataType;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.EntityMemberCall;
import org.applause.lang.applauseDsl.EntityMemberCallTail;
import org.applause.lang.applauseDsl.ListItemCellDeclaration;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Platform;
import org.applause.lang.applauseDsl.RESTMethodCall;
import org.applause.lang.applauseDsl.RESTSpecification;
import org.applause.lang.applauseDsl.RelativeRESTURL;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenListItemCell;
import org.applause.lang.applauseDsl.ScreenSection;
import org.applause.lang.applauseDsl.ScreenSectionItems;
import org.applause.lang.applauseDsl.StringLiteral;
import org.applause.lang.applauseDsl.TypeMapping;
import org.applause.lang.applauseDsl.UIComponentDeclaration;
import org.applause.lang.applauseDsl.UIComponentMemberCall;
import org.applause.lang.applauseDsl.UIComponentMemberConfiguration;
import org.applause.lang.applauseDsl.UIComponentMemberDeclaration;
import org.applause.lang.applauseDsl.UrlPathFragment;
import org.applause.lang.applauseDsl.Variable;
import org.applause.lang.services.ApplauseDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ApplauseDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ApplauseDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ApplauseDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ApplauseDslPackage.ABSOLUTE_RESTURL:
				if(context == grammarAccess.getAbsoluteRESTURLRule() ||
				   context == grammarAccess.getRESTURLRule()) {
					sequence_AbsoluteRESTURL(context, (AbsoluteRESTURL) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.ATTRIBUTE_REFERENCE:
				if(context == grammarAccess.getAttributeReferenceRule()) {
					sequence_AttributeReference(context, (AttributeReference) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.DATA_SOURCE:
				if(context == grammarAccess.getDataSourceRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_DataSource(context, (DataSource) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD:
				if(context == grammarAccess.getDataSourceAccessMethodRule()) {
					sequence_DataSourceAccessMethod(context, (DataSourceAccessMethod) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.DATA_SOURCE_BODY_SPECIFICATION:
				if(context == grammarAccess.getDataSourceBodySpecificationRule()) {
					sequence_DataSourceBodySpecification(context, (DataSourceBodySpecification) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.DATA_SOURCE_CALL:
				if(context == grammarAccess.getDataSourceCallRule()) {
					sequence_DataSourceCall(context, (DataSourceCall) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUIComponentOrDataTypeRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.ENTITY:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.ENTITY_MEMBER_CALL:
				if(context == grammarAccess.getEntityMemberCallRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_EntityMemberCall(context, (EntityMemberCall) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.ENTITY_MEMBER_CALL_TAIL:
				if(context == grammarAccess.getEntityMemberCallTailRule()) {
					sequence_EntityMemberCallTail(context, (EntityMemberCallTail) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.LIST_ITEM_CELL_DECLARATION:
				if(context == grammarAccess.getListItemCellDeclarationRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_ListItemCellDeclaration(context, (ListItemCellDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.PLATFORM:
				if(context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getPlatformRule()) {
					sequence_Platform(context, (Platform) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.REST_METHOD_CALL:
				if(context == grammarAccess.getRESTMethodCallRule()) {
					sequence_RESTMethodCall(context, (RESTMethodCall) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.REST_SPECIFICATION:
				if(context == grammarAccess.getRESTSpecificationRule()) {
					sequence_RESTSpecification(context, (RESTSpecification) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.RELATIVE_RESTURL:
				if(context == grammarAccess.getRESTURLRule() ||
				   context == grammarAccess.getRelativeRESTURLRule()) {
					sequence_RelativeRESTURL(context, (RelativeRESTURL) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.SCREEN:
				if(context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getScreenRule()) {
					sequence_Screen(context, (Screen) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL:
				if(context == grammarAccess.getScreenListItemCellRule()) {
					sequence_ScreenListItemCell(context, (ScreenListItemCell) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.SCREEN_SECTION:
				if(context == grammarAccess.getScreenSectionRule()) {
					sequence_ScreenSection(context, (ScreenSection) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.SCREEN_SECTION_ITEMS:
				if(context == grammarAccess.getScreenSectionItemsRule()) {
					sequence_ScreenSectionItems(context, (ScreenSectionItems) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.STRING_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.TYPE_MAPPING:
				if(context == grammarAccess.getPlatformMappingRule() ||
				   context == grammarAccess.getTypeMappingRule()) {
					sequence_TypeMapping(context, (TypeMapping) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.UI_COMPONENT_DECLARATION:
				if(context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getUIComponentDeclarationRule() ||
				   context == grammarAccess.getUIComponentOrDataTypeRule()) {
					sequence_UIComponentDeclaration(context, (UIComponentDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.UI_COMPONENT_MEMBER_CALL:
				if(context == grammarAccess.getUIComponentMemberCallRule()) {
					sequence_UIComponentMemberCall(context, (UIComponentMemberCall) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.UI_COMPONENT_MEMBER_CONFIGURATION:
				if(context == grammarAccess.getUIComponentMemberConfigurationRule()) {
					sequence_UIComponentMemberConfiguration(context, (UIComponentMemberConfiguration) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.UI_COMPONENT_MEMBER_DECLARATION:
				if(context == grammarAccess.getUIComponentMemberDeclarationRule()) {
					sequence_UIComponentMemberDeclaration(context, (UIComponentMemberDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.URL_PATH_FRAGMENT:
				if(context == grammarAccess.getUrlFragmentRule() ||
				   context == grammarAccess.getUrlPathFragmentRule()) {
					sequence_UrlPathFragment(context, (UrlPathFragment) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.VARIABLE:
				if(context == grammarAccess.getUrlFragmentRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (host=UrlFragment port=INT? fragments+=UrlFragment*)
	 */
	protected void sequence_AbsoluteRESTURL(EObject context, AbsoluteRESTURL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[Attribute|ID]
	 */
	protected void sequence_AttributeReference(EObject context, AttributeReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.ATTRIBUTE_REFERENCE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.ATTRIBUTE_REFERENCE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeReferenceAccess().getValueAttributeIDTerminalRuleCall_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] many?='[]'? name=KeywordedID)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=KeywordedID (declaredParameters+=Parameter declaredParameters+=Parameter*)? returnsMany?='[]'? restSpecification=RESTSpecification)
	 */
	protected void sequence_DataSourceAccessMethod(EObject context, DataSourceAccessMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     bodycontents=[Parameter|ID]
	 */
	protected void sequence_DataSourceBodySpecification(EObject context, DataSourceBodySpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsParameterIDTerminalRuleCall_0_1(), semanticObject.getBodycontents());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (datasource=[DataSource|ID] name=ID)
	 */
	protected void sequence_DataSourceCall(EObject context, DataSourceCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.DATA_SOURCE_CALL__DATASOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.DATA_SOURCE_CALL__DATASOURCE));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.DATA_SOURCE_CALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.DATA_SOURCE_CALL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataSourceCallAccess().getDatasourceDataSourceIDTerminalRuleCall_0_0_1(), semanticObject.getDatasource());
		feeder.accept(grammarAccess.getDataSourceCallAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID baseUrl=AbsoluteRESTURL resourceType=[Entity|ID] methods+=DataSourceAccessMethod*)
	 */
	protected void sequence_DataSource(EObject context, DataSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=KeywordedID
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getNameKeywordedIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=[Attribute|ID] tail=EntityMemberCallTail?)
	 */
	protected void sequence_EntityMemberCallTail(EObject context, EntityMemberCallTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=[Attribute|ID] tail=EntityMemberCallTail?)
	 */
	protected void sequence_EntityMemberCall(EObject context, EntityMemberCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (abstract?='abstract'? name=ID superType=[Entity|ID]? attributes+=Attribute*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID members+=UIComponentMemberDeclaration*)
	 */
	protected void sequence_ListItemCellDeclaration(EObject context, ListItemCellDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=NamedElement*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] name=KeywordedID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameKeywordedIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID mappings+=PlatformMapping*)
	 */
	protected void sequence_Platform(EObject context, Platform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (datasource=[DataSourceCall|ID] restMethod=[DataSourceAccessMethod|ID])
	 */
	protected void sequence_RESTMethodCall(EObject context, RESTMethodCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.REST_METHOD_CALL__DATASOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.REST_METHOD_CALL__DATASOURCE));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.REST_METHOD_CALL__REST_METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.REST_METHOD_CALL__REST_METHOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRESTMethodCallAccess().getDatasourceDataSourceCallIDTerminalRuleCall_0_0_1(), semanticObject.getDatasource());
		feeder.accept(grammarAccess.getRESTMethodCallAccess().getRestMethodDataSourceAccessMethodIDTerminalRuleCall_2_0_1(), semanticObject.getRestMethod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (verb=RESTVerb path=RESTURL body=DataSourceBodySpecification?)
	 */
	protected void sequence_RESTSpecification(EObject context, RESTSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fragments+=UrlFragment fragments+=UrlFragment*)
	 */
	protected void sequence_RelativeRESTURL(EObject context, RelativeRESTURL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[ListItemCellDeclaration|ID] restMethod=RESTMethodCall variable=ID configurations+=UIComponentMemberConfiguration*)
	 */
	protected void sequence_ScreenListItemCell(EObject context, ScreenListItemCell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (items+=ScreenListItemCell*)
	 */
	protected void sequence_ScreenSectionItems(EObject context, ScreenSectionItems semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING? datasource=DataSourceCall? items=ScreenSectionItems)
	 */
	protected void sequence_ScreenSection(EObject context, ScreenSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=ScreenKind name=ID title=STRING? datasource=DataSourceCall? sections+=ScreenSection*)
	 */
	protected void sequence_Screen(EObject context, Screen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[DataType|ID] simpleName=ID)
	 */
	protected void sequence_TypeMapping(EObject context, TypeMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.TYPE_MAPPING__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.TYPE_MAPPING__TYPE));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.TYPE_MAPPING__SIMPLE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.TYPE_MAPPING__SIMPLE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeMappingAccess().getTypeDataTypeIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getTypeMappingAccess().getSimpleNameIDTerminalRuleCall_3_0(), semanticObject.getSimpleName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID members+=UIComponentMemberDeclaration*)
	 */
	protected void sequence_UIComponentDeclaration(EObject context, UIComponentDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (component=[UIComponentMemberDeclaration|ID] member=[UIComponentMemberDeclaration|ID]?)
	 */
	protected void sequence_UIComponentMemberCall(EObject context, UIComponentMemberCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=UIComponentMemberCall value=Expression)
	 */
	protected void sequence_UIComponentMemberConfiguration(EObject context, UIComponentMemberConfiguration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.UI_COMPONENT_MEMBER_CONFIGURATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.UI_COMPONENT_MEMBER_CONFIGURATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.UI_COMPONENT_MEMBER_CONFIGURATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.UI_COMPONENT_MEMBER_CONFIGURATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUIComponentMemberConfigurationAccess().getTypeUIComponentMemberCallParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getUIComponentMemberConfigurationAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[UIComponentOrDataType|ID] name=ID)
	 */
	protected void sequence_UIComponentMemberDeclaration(EObject context, UIComponentMemberDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.UI_COMPONENT_MEMBER_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.UI_COMPONENT_MEMBER_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.UI_COMPONENT_MEMBER_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.UI_COMPONENT_MEMBER_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUIComponentMemberDeclarationAccess().getTypeUIComponentOrDataTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getUIComponentMemberDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_UrlPathFragment(EObject context, UrlPathFragment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.URL_PATH_FRAGMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.URL_PATH_FRAGMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUrlPathFragmentAccess().getNameQualifiedNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     parameterReference=[Parameter|ID]
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.VARIABLE__PARAMETER_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.VARIABLE__PARAMETER_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getParameterReferenceParameterIDTerminalRuleCall_1_0_1(), semanticObject.getParameterReference());
		feeder.finish();
	}
}
