/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.itemis.mobilizer.appModelDsl.AppModelDslFactory
 * @model kind="package"
 * @generated
 */
public interface AppModelDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "appModelDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.itemis.de/mobilizer/AppModelDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "appModelDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AppModelDslPackage eINSTANCE = de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ModelImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ApplicationImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__BUTTONS = 1;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ModelElementImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.VariableDeclarationImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = MODEL_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.TypeDescriptionImpl <em>Type Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.TypeDescriptionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getTypeDescription()
   * @generated
   */
  int TYPE_DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DESCRIPTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DESCRIPTION__MANY = 1;

  /**
   * The number of structural features of the '<em>Type Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DESCRIPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ParameterImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DESCRIPTION = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ExpressionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ObjectReferenceImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getObjectReference()
   * @generated
   */
  int OBJECT_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE__TAIL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ScalarExpressionImpl <em>Scalar Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ScalarExpressionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getScalarExpression()
   * @generated
   */
  int SCALAR_EXPRESSION = 8;

  /**
   * The number of structural features of the '<em>Scalar Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.CollectionExpressionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCollectionExpression()
   * @generated
   */
  int COLLECTION_EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Collection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.StringLiteralImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringFunctionImpl <em>String Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.StringFunctionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringFunction()
   * @generated
   */
  int STRING_FUNCTION = 11;

  /**
   * The number of structural features of the '<em>String Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.CollectionLiteralImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCollectionLiteral()
   * @generated
   */
  int COLLECTION_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_LITERAL__ITEMS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.CollectionFunctionImpl <em>Collection Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.CollectionFunctionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCollectionFunction()
   * @generated
   */
  int COLLECTION_FUNCTION = 13;

  /**
   * The number of structural features of the '<em>Collection Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.TabbarButtonImpl <em>Tabbar Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.TabbarButtonImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getTabbarButton()
   * @generated
   */
  int TABBAR_BUTTON = 14;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABBAR_BUTTON__TITLE = 0;

  /**
   * The feature id for the '<em><b>Icon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABBAR_BUTTON__ICON = 1;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABBAR_BUTTON__VIEW = 2;

  /**
   * The number of structural features of the '<em>Tabbar Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABBAR_BUTTON_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.TypeImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = MODEL_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.SimpleTypeImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Platform Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__PLATFORM_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.EntityImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__EXTENDS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.PropertyImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DERIVED = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DESCRIPTION = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ContentProviderImpl <em>Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ContentProviderImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getContentProvider()
   * @generated
   */
  int CONTENT_PROVIDER = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__PARAMETER = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resolver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__RESOLVER = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__TYPE = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__MANY = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__URL = MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__SELECTION = MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ProviderConstructionImpl <em>Provider Construction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ProviderConstructionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getProviderConstruction()
   * @generated
   */
  int PROVIDER_CONSTRUCTION = 20;

  /**
   * The number of structural features of the '<em>Provider Construction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_CONSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ViewImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getView()
   * @generated
   */
  int VIEW = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__CONTENT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.SectionedViewImpl <em>Sectioned View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.SectionedViewImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getSectionedView()
   * @generated
   */
  int SECTIONED_VIEW = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__CONTENT = VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__TITLE = VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__SECTIONS = VIEW_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sectioned View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.TableViewImpl <em>Table View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.TableViewImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getTableView()
   * @generated
   */
  int TABLE_VIEW = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__NAME = SECTIONED_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__CONTENT = SECTIONED_VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__TITLE = SECTIONED_VIEW__TITLE;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__SECTIONS = SECTIONED_VIEW__SECTIONS;

  /**
   * The number of structural features of the '<em>Table View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW_FEATURE_COUNT = SECTIONED_VIEW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.DetailsViewImpl <em>Details View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.DetailsViewImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getDetailsView()
   * @generated
   */
  int DETAILS_VIEW = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__NAME = SECTIONED_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__CONTENT = SECTIONED_VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__TITLE = SECTIONED_VIEW__TITLE;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__SECTIONS = SECTIONED_VIEW__SECTIONS;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__HEADER = SECTIONED_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Details View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW_FEATURE_COUNT = SECTIONED_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.CustomViewImpl <em>Custom View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.CustomViewImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCustomView()
   * @generated
   */
  int CUSTOM_VIEW = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__CONTENT = VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Objclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__OBJCLASS = VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ViewHeaderImpl <em>View Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ViewHeaderImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getViewHeader()
   * @generated
   */
  int VIEW_HEADER = 26;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__TITLE = 0;

  /**
   * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__SUBTITLE = 1;

  /**
   * The feature id for the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__DETAILS = 2;

  /**
   * The feature id for the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__IMAGE = 3;

  /**
   * The number of structural features of the '<em>View Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ViewSectionImpl <em>View Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ViewSectionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getViewSection()
   * @generated
   */
  int VIEW_SECTION = 27;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SECTION__TITLE = 0;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SECTION__CELLS = 1;

  /**
   * The number of structural features of the '<em>View Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.SectionCellImpl <em>Section Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.SectionCellImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getSectionCell()
   * @generated
   */
  int SECTION_CELL = 28;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__ITERATOR = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__TEXT = 2;

  /**
   * The feature id for the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__DETAILS = 3;

  /**
   * The feature id for the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__IMAGE = 4;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__ACTION = 5;

  /**
   * The number of structural features of the '<em>Section Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.CollectionIteratorImpl <em>Collection Iterator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.CollectionIteratorImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCollectionIterator()
   * @generated
   */
  int COLLECTION_ITERATOR = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR__COLLECTION = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection Iterator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ViewActionImpl <em>View Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ViewActionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getViewAction()
   * @generated
   */
  int VIEW_ACTION = 30;

  /**
   * The number of structural features of the '<em>View Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ExternalOpenImpl <em>External Open</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ExternalOpenImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getExternalOpen()
   * @generated
   */
  int EXTERNAL_OPEN = 31;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OPEN__URL = VIEW_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Open</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OPEN_FEATURE_COUNT = VIEW_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ViewCallImpl <em>View Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ViewCallImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getViewCall()
   * @generated
   */
  int VIEW_CALL = 32;

  /**
   * The feature id for the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL__VIEW = VIEW_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL__PROVIDER = VIEW_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>View Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL_FEATURE_COUNT = VIEW_ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringConcatImpl <em>String Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.StringConcatImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringConcat()
   * @generated
   */
  int STRING_CONCAT = 33;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONCAT__VALUES = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONCAT_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringReplaceImpl <em>String Replace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.StringReplaceImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringReplace()
   * @generated
   */
  int STRING_REPLACE = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__VALUE = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__MATCH = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__REPLACEMENT = STRING_FUNCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>String Replace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringUrlConformImpl <em>String Url Conform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.StringUrlConformImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringUrlConform()
   * @generated
   */
  int STRING_URL_CONFORM = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_URL_CONFORM__VALUE = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Url Conform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_URL_CONFORM_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringSplitImpl <em>String Split</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.StringSplitImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringSplit()
   * @generated
   */
  int STRING_SPLIT = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT__VALUE = COLLECTION_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT__DELIMITER = COLLECTION_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Split</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT_FEATURE_COUNT = COLLECTION_FUNCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ConstantImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.ComplexProviderConstructionImpl <em>Complex Provider Construction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.ComplexProviderConstructionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getComplexProviderConstruction()
   * @generated
   */
  int COMPLEX_PROVIDER_CONSTRUCTION = 38;

  /**
   * The feature id for the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER = PROVIDER_CONSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT = PROVIDER_CONSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Complex Provider Construction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROVIDER_CONSTRUCTION_FEATURE_COUNT = PROVIDER_CONSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.impl.SimpleProviderConstructionImpl <em>Simple Provider Construction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.impl.SimpleProviderConstructionImpl
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getSimpleProviderConstruction()
   * @generated
   */
  int SIMPLE_PROVIDER_CONSTRUCTION = 39;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PROVIDER_CONSTRUCTION__EXPRESSION = PROVIDER_CONSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Provider Construction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PROVIDER_CONSTRUCTION_FEATURE_COUNT = PROVIDER_CONSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mobilizer.appModelDsl.CellType <em>Cell Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mobilizer.appModelDsl.CellType
   * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCellType()
   * @generated
   */
  int CELL_TYPE = 40;


  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.Model#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Model#getApplication()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Application();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mobilizer.appModelDsl.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mobilizer.appModelDsl.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mobilizer.appModelDsl.Application#getButtons <em>Buttons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Buttons</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Application#getButtons()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Buttons();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mobilizer.appModelDsl.ModelElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ModelElement#getName()
   * @see #getModelElement()
   * @generated
   */
  EAttribute getModelElement_Name();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see de.itemis.mobilizer.appModelDsl.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.TypeDescription <em>Type Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Description</em>'.
   * @see de.itemis.mobilizer.appModelDsl.TypeDescription
   * @generated
   */
  EClass getTypeDescription();

  /**
   * Returns the meta object for the reference '{@link de.itemis.mobilizer.appModelDsl.TypeDescription#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.itemis.mobilizer.appModelDsl.TypeDescription#getType()
   * @see #getTypeDescription()
   * @generated
   */
  EReference getTypeDescription_Type();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mobilizer.appModelDsl.TypeDescription#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see de.itemis.mobilizer.appModelDsl.TypeDescription#isMany()
   * @see #getTypeDescription()
   * @generated
   */
  EAttribute getTypeDescription_Many();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.Parameter#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Parameter#getDescription()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Description();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ObjectReference <em>Object Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Reference</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ObjectReference
   * @generated
   */
  EClass getObjectReference();

  /**
   * Returns the meta object for the reference '{@link de.itemis.mobilizer.appModelDsl.ObjectReference#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ObjectReference#getObject()
   * @see #getObjectReference()
   * @generated
   */
  EReference getObjectReference_Object();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ObjectReference#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ObjectReference#getTail()
   * @see #getObjectReference()
   * @generated
   */
  EReference getObjectReference_Tail();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ScalarExpression <em>Scalar Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar Expression</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ScalarExpression
   * @generated
   */
  EClass getScalarExpression();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.CollectionExpression <em>Collection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Expression</em>'.
   * @see de.itemis.mobilizer.appModelDsl.CollectionExpression
   * @generated
   */
  EClass getCollectionExpression();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mobilizer.appModelDsl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.StringFunction <em>String Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Function</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringFunction
   * @generated
   */
  EClass getStringFunction();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.CollectionLiteral <em>Collection Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Literal</em>'.
   * @see de.itemis.mobilizer.appModelDsl.CollectionLiteral
   * @generated
   */
  EClass getCollectionLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mobilizer.appModelDsl.CollectionLiteral#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see de.itemis.mobilizer.appModelDsl.CollectionLiteral#getItems()
   * @see #getCollectionLiteral()
   * @generated
   */
  EReference getCollectionLiteral_Items();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.CollectionFunction <em>Collection Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Function</em>'.
   * @see de.itemis.mobilizer.appModelDsl.CollectionFunction
   * @generated
   */
  EClass getCollectionFunction();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.TabbarButton <em>Tabbar Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tabbar Button</em>'.
   * @see de.itemis.mobilizer.appModelDsl.TabbarButton
   * @generated
   */
  EClass getTabbarButton();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.TabbarButton#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see de.itemis.mobilizer.appModelDsl.TabbarButton#getTitle()
   * @see #getTabbarButton()
   * @generated
   */
  EReference getTabbarButton_Title();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.TabbarButton#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Icon</em>'.
   * @see de.itemis.mobilizer.appModelDsl.TabbarButton#getIcon()
   * @see #getTabbarButton()
   * @generated
   */
  EReference getTabbarButton_Icon();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.TabbarButton#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View</em>'.
   * @see de.itemis.mobilizer.appModelDsl.TabbarButton#getView()
   * @see #getTabbarButton()
   * @generated
   */
  EReference getTabbarButton_View();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mobilizer.appModelDsl.SimpleType#getPlatformType <em>Platform Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Platform Type</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SimpleType#getPlatformType()
   * @see #getSimpleType()
   * @generated
   */
  EAttribute getSimpleType_PlatformType();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference '{@link de.itemis.mobilizer.appModelDsl.Entity#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Entity#getExtends()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mobilizer.appModelDsl.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mobilizer.appModelDsl.Property#isDerived <em>Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Derived</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Property#isDerived()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Derived();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.Property#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Property#getDescription()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Description();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Provider</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ContentProvider
   * @generated
   */
  EClass getContentProvider();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ContentProvider#getParameter()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Parameter();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#isResolver <em>Resolver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resolver</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ContentProvider#isResolver()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Resolver();

  /**
   * Returns the meta object for the reference '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ContentProvider#getType()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Type();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ContentProvider#isMany()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Many();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ContentProvider#getUrl()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Url();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getSelection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ContentProvider#getSelection()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Selection();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ProviderConstruction <em>Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provider Construction</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ProviderConstruction
   * @generated
   */
  EClass getProviderConstruction();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see de.itemis.mobilizer.appModelDsl.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.View#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see de.itemis.mobilizer.appModelDsl.View#getContent()
   * @see #getView()
   * @generated
   */
  EReference getView_Content();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.SectionedView <em>Sectioned View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sectioned View</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SectionedView
   * @generated
   */
  EClass getSectionedView();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.SectionedView#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SectionedView#getTitle()
   * @see #getSectionedView()
   * @generated
   */
  EReference getSectionedView_Title();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mobilizer.appModelDsl.SectionedView#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SectionedView#getSections()
   * @see #getSectionedView()
   * @generated
   */
  EReference getSectionedView_Sections();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.TableView <em>Table View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table View</em>'.
   * @see de.itemis.mobilizer.appModelDsl.TableView
   * @generated
   */
  EClass getTableView();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.DetailsView <em>Details View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Details View</em>'.
   * @see de.itemis.mobilizer.appModelDsl.DetailsView
   * @generated
   */
  EClass getDetailsView();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.DetailsView#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see de.itemis.mobilizer.appModelDsl.DetailsView#getHeader()
   * @see #getDetailsView()
   * @generated
   */
  EReference getDetailsView_Header();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.CustomView <em>Custom View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom View</em>'.
   * @see de.itemis.mobilizer.appModelDsl.CustomView
   * @generated
   */
  EClass getCustomView();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mobilizer.appModelDsl.CustomView#getObjclass <em>Objclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Objclass</em>'.
   * @see de.itemis.mobilizer.appModelDsl.CustomView#getObjclass()
   * @see #getCustomView()
   * @generated
   */
  EAttribute getCustomView_Objclass();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ViewHeader <em>View Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Header</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewHeader
   * @generated
   */
  EClass getViewHeader();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ViewHeader#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewHeader#getTitle()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Title();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ViewHeader#getSubtitle <em>Subtitle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtitle</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewHeader#getSubtitle()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Subtitle();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ViewHeader#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Details</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewHeader#getDetails()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Details();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ViewHeader#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Image</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewHeader#getImage()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Image();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ViewSection <em>View Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Section</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewSection
   * @generated
   */
  EClass getViewSection();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ViewSection#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewSection#getTitle()
   * @see #getViewSection()
   * @generated
   */
  EReference getViewSection_Title();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mobilizer.appModelDsl.ViewSection#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewSection#getCells()
   * @see #getViewSection()
   * @generated
   */
  EReference getViewSection_Cells();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.SectionCell <em>Section Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section Cell</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SectionCell
   * @generated
   */
  EClass getSectionCell();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mobilizer.appModelDsl.SectionCell#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SectionCell#getType()
   * @see #getSectionCell()
   * @generated
   */
  EAttribute getSectionCell_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.SectionCell#getIterator <em>Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iterator</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SectionCell#getIterator()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Iterator();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.SectionCell#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SectionCell#getText()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Text();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.SectionCell#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Details</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SectionCell#getDetails()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Details();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.SectionCell#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Image</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SectionCell#getImage()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Image();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.SectionCell#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SectionCell#getAction()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Action();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.CollectionIterator <em>Collection Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Iterator</em>'.
   * @see de.itemis.mobilizer.appModelDsl.CollectionIterator
   * @generated
   */
  EClass getCollectionIterator();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.CollectionIterator#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection</em>'.
   * @see de.itemis.mobilizer.appModelDsl.CollectionIterator#getCollection()
   * @see #getCollectionIterator()
   * @generated
   */
  EReference getCollectionIterator_Collection();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ViewAction <em>View Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Action</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewAction
   * @generated
   */
  EClass getViewAction();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ExternalOpen <em>External Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Open</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ExternalOpen
   * @generated
   */
  EClass getExternalOpen();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ExternalOpen#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ExternalOpen#getUrl()
   * @see #getExternalOpen()
   * @generated
   */
  EReference getExternalOpen_Url();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ViewCall <em>View Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Call</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewCall
   * @generated
   */
  EClass getViewCall();

  /**
   * Returns the meta object for the reference '{@link de.itemis.mobilizer.appModelDsl.ViewCall#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>View</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewCall#getView()
   * @see #getViewCall()
   * @generated
   */
  EReference getViewCall_View();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ViewCall#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Provider</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ViewCall#getProvider()
   * @see #getViewCall()
   * @generated
   */
  EReference getViewCall_Provider();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.StringConcat <em>String Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Concat</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringConcat
   * @generated
   */
  EClass getStringConcat();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mobilizer.appModelDsl.StringConcat#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringConcat#getValues()
   * @see #getStringConcat()
   * @generated
   */
  EReference getStringConcat_Values();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.StringReplace <em>String Replace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Replace</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringReplace
   * @generated
   */
  EClass getStringReplace();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.StringReplace#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringReplace#getValue()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.StringReplace#getMatch <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Match</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringReplace#getMatch()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Match();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.StringReplace#getReplacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replacement</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringReplace#getReplacement()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Replacement();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.StringUrlConform <em>String Url Conform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Url Conform</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringUrlConform
   * @generated
   */
  EClass getStringUrlConform();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.StringUrlConform#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringUrlConform#getValue()
   * @see #getStringUrlConform()
   * @generated
   */
  EReference getStringUrlConform_Value();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.StringSplit <em>String Split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Split</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringSplit
   * @generated
   */
  EClass getStringSplit();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.StringSplit#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringSplit#getValue()
   * @see #getStringSplit()
   * @generated
   */
  EReference getStringSplit_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.StringSplit#getDelimiter <em>Delimiter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delimiter</em>'.
   * @see de.itemis.mobilizer.appModelDsl.StringSplit#getDelimiter()
   * @see #getStringSplit()
   * @generated
   */
  EReference getStringSplit_Delimiter();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.itemis.mobilizer.appModelDsl.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Value();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction <em>Complex Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Provider Construction</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction
   * @generated
   */
  EClass getComplexProviderConstruction();

  /**
   * Returns the meta object for the reference '{@link de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Provider</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction#getProvider()
   * @see #getComplexProviderConstruction()
   * @generated
   */
  EReference getComplexProviderConstruction_Provider();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction#getArgument()
   * @see #getComplexProviderConstruction()
   * @generated
   */
  EReference getComplexProviderConstruction_Argument();

  /**
   * Returns the meta object for class '{@link de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction <em>Simple Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Provider Construction</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction
   * @generated
   */
  EClass getSimpleProviderConstruction();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction#getExpression()
   * @see #getSimpleProviderConstruction()
   * @generated
   */
  EReference getSimpleProviderConstruction_Expression();

  /**
   * Returns the meta object for enum '{@link de.itemis.mobilizer.appModelDsl.CellType <em>Cell Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cell Type</em>'.
   * @see de.itemis.mobilizer.appModelDsl.CellType
   * @generated
   */
  EEnum getCellType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AppModelDslFactory getAppModelDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ModelImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__APPLICATION = eINSTANCE.getModel_Application();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ApplicationImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__BUTTONS = eINSTANCE.getApplication_Buttons();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ModelElementImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.VariableDeclarationImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.TypeDescriptionImpl <em>Type Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.TypeDescriptionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getTypeDescription()
     * @generated
     */
    EClass TYPE_DESCRIPTION = eINSTANCE.getTypeDescription();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DESCRIPTION__TYPE = eINSTANCE.getTypeDescription_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DESCRIPTION__MANY = eINSTANCE.getTypeDescription_Many();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ParameterImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ObjectReferenceImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getObjectReference()
     * @generated
     */
    EClass OBJECT_REFERENCE = eINSTANCE.getObjectReference();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_REFERENCE__OBJECT = eINSTANCE.getObjectReference_Object();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_REFERENCE__TAIL = eINSTANCE.getObjectReference_Tail();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ExpressionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ScalarExpressionImpl <em>Scalar Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ScalarExpressionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getScalarExpression()
     * @generated
     */
    EClass SCALAR_EXPRESSION = eINSTANCE.getScalarExpression();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.CollectionExpressionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCollectionExpression()
     * @generated
     */
    EClass COLLECTION_EXPRESSION = eINSTANCE.getCollectionExpression();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.StringLiteralImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringFunctionImpl <em>String Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.StringFunctionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringFunction()
     * @generated
     */
    EClass STRING_FUNCTION = eINSTANCE.getStringFunction();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.CollectionLiteralImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCollectionLiteral()
     * @generated
     */
    EClass COLLECTION_LITERAL = eINSTANCE.getCollectionLiteral();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_LITERAL__ITEMS = eINSTANCE.getCollectionLiteral_Items();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.CollectionFunctionImpl <em>Collection Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.CollectionFunctionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCollectionFunction()
     * @generated
     */
    EClass COLLECTION_FUNCTION = eINSTANCE.getCollectionFunction();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.TabbarButtonImpl <em>Tabbar Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.TabbarButtonImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getTabbarButton()
     * @generated
     */
    EClass TABBAR_BUTTON = eINSTANCE.getTabbarButton();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABBAR_BUTTON__TITLE = eINSTANCE.getTabbarButton_Title();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABBAR_BUTTON__ICON = eINSTANCE.getTabbarButton_Icon();

    /**
     * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABBAR_BUTTON__VIEW = eINSTANCE.getTabbarButton_View();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.TypeImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.SimpleTypeImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '<em><b>Platform Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_TYPE__PLATFORM_TYPE = eINSTANCE.getSimpleType_PlatformType();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.EntityImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__EXTENDS = eINSTANCE.getEntity_Extends();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.PropertyImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DERIVED = eINSTANCE.getProperty_Derived();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ContentProviderImpl <em>Content Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ContentProviderImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getContentProvider()
     * @generated
     */
    EClass CONTENT_PROVIDER = eINSTANCE.getContentProvider();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__PARAMETER = eINSTANCE.getContentProvider_Parameter();

    /**
     * The meta object literal for the '<em><b>Resolver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__RESOLVER = eINSTANCE.getContentProvider_Resolver();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__TYPE = eINSTANCE.getContentProvider_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__MANY = eINSTANCE.getContentProvider_Many();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__URL = eINSTANCE.getContentProvider_Url();

    /**
     * The meta object literal for the '<em><b>Selection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__SELECTION = eINSTANCE.getContentProvider_Selection();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ProviderConstructionImpl <em>Provider Construction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ProviderConstructionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getProviderConstruction()
     * @generated
     */
    EClass PROVIDER_CONSTRUCTION = eINSTANCE.getProviderConstruction();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ViewImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__CONTENT = eINSTANCE.getView_Content();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.SectionedViewImpl <em>Sectioned View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.SectionedViewImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getSectionedView()
     * @generated
     */
    EClass SECTIONED_VIEW = eINSTANCE.getSectionedView();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTIONED_VIEW__TITLE = eINSTANCE.getSectionedView_Title();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTIONED_VIEW__SECTIONS = eINSTANCE.getSectionedView_Sections();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.TableViewImpl <em>Table View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.TableViewImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getTableView()
     * @generated
     */
    EClass TABLE_VIEW = eINSTANCE.getTableView();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.DetailsViewImpl <em>Details View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.DetailsViewImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getDetailsView()
     * @generated
     */
    EClass DETAILS_VIEW = eINSTANCE.getDetailsView();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DETAILS_VIEW__HEADER = eINSTANCE.getDetailsView_Header();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.CustomViewImpl <em>Custom View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.CustomViewImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCustomView()
     * @generated
     */
    EClass CUSTOM_VIEW = eINSTANCE.getCustomView();

    /**
     * The meta object literal for the '<em><b>Objclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_VIEW__OBJCLASS = eINSTANCE.getCustomView_Objclass();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ViewHeaderImpl <em>View Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ViewHeaderImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getViewHeader()
     * @generated
     */
    EClass VIEW_HEADER = eINSTANCE.getViewHeader();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__TITLE = eINSTANCE.getViewHeader_Title();

    /**
     * The meta object literal for the '<em><b>Subtitle</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__SUBTITLE = eINSTANCE.getViewHeader_Subtitle();

    /**
     * The meta object literal for the '<em><b>Details</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__DETAILS = eINSTANCE.getViewHeader_Details();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__IMAGE = eINSTANCE.getViewHeader_Image();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ViewSectionImpl <em>View Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ViewSectionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getViewSection()
     * @generated
     */
    EClass VIEW_SECTION = eINSTANCE.getViewSection();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_SECTION__TITLE = eINSTANCE.getViewSection_Title();

    /**
     * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_SECTION__CELLS = eINSTANCE.getViewSection_Cells();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.SectionCellImpl <em>Section Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.SectionCellImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getSectionCell()
     * @generated
     */
    EClass SECTION_CELL = eINSTANCE.getSectionCell();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION_CELL__TYPE = eINSTANCE.getSectionCell_Type();

    /**
     * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__ITERATOR = eINSTANCE.getSectionCell_Iterator();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__TEXT = eINSTANCE.getSectionCell_Text();

    /**
     * The meta object literal for the '<em><b>Details</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__DETAILS = eINSTANCE.getSectionCell_Details();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__IMAGE = eINSTANCE.getSectionCell_Image();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__ACTION = eINSTANCE.getSectionCell_Action();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.CollectionIteratorImpl <em>Collection Iterator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.CollectionIteratorImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCollectionIterator()
     * @generated
     */
    EClass COLLECTION_ITERATOR = eINSTANCE.getCollectionIterator();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_ITERATOR__COLLECTION = eINSTANCE.getCollectionIterator_Collection();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ViewActionImpl <em>View Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ViewActionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getViewAction()
     * @generated
     */
    EClass VIEW_ACTION = eINSTANCE.getViewAction();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ExternalOpenImpl <em>External Open</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ExternalOpenImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getExternalOpen()
     * @generated
     */
    EClass EXTERNAL_OPEN = eINSTANCE.getExternalOpen();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_OPEN__URL = eINSTANCE.getExternalOpen_Url();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ViewCallImpl <em>View Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ViewCallImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getViewCall()
     * @generated
     */
    EClass VIEW_CALL = eINSTANCE.getViewCall();

    /**
     * The meta object literal for the '<em><b>View</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CALL__VIEW = eINSTANCE.getViewCall_View();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CALL__PROVIDER = eINSTANCE.getViewCall_Provider();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringConcatImpl <em>String Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.StringConcatImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringConcat()
     * @generated
     */
    EClass STRING_CONCAT = eINSTANCE.getStringConcat();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_CONCAT__VALUES = eINSTANCE.getStringConcat_Values();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringReplaceImpl <em>String Replace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.StringReplaceImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringReplace()
     * @generated
     */
    EClass STRING_REPLACE = eINSTANCE.getStringReplace();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__VALUE = eINSTANCE.getStringReplace_Value();

    /**
     * The meta object literal for the '<em><b>Match</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__MATCH = eINSTANCE.getStringReplace_Match();

    /**
     * The meta object literal for the '<em><b>Replacement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__REPLACEMENT = eINSTANCE.getStringReplace_Replacement();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringUrlConformImpl <em>String Url Conform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.StringUrlConformImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringUrlConform()
     * @generated
     */
    EClass STRING_URL_CONFORM = eINSTANCE.getStringUrlConform();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_URL_CONFORM__VALUE = eINSTANCE.getStringUrlConform_Value();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.StringSplitImpl <em>String Split</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.StringSplitImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getStringSplit()
     * @generated
     */
    EClass STRING_SPLIT = eINSTANCE.getStringSplit();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_SPLIT__VALUE = eINSTANCE.getStringSplit_Value();

    /**
     * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_SPLIT__DELIMITER = eINSTANCE.getStringSplit_Delimiter();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ConstantImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.ComplexProviderConstructionImpl <em>Complex Provider Construction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.ComplexProviderConstructionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getComplexProviderConstruction()
     * @generated
     */
    EClass COMPLEX_PROVIDER_CONSTRUCTION = eINSTANCE.getComplexProviderConstruction();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER = eINSTANCE.getComplexProviderConstruction_Provider();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT = eINSTANCE.getComplexProviderConstruction_Argument();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.impl.SimpleProviderConstructionImpl <em>Simple Provider Construction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.impl.SimpleProviderConstructionImpl
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getSimpleProviderConstruction()
     * @generated
     */
    EClass SIMPLE_PROVIDER_CONSTRUCTION = eINSTANCE.getSimpleProviderConstruction();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_PROVIDER_CONSTRUCTION__EXPRESSION = eINSTANCE.getSimpleProviderConstruction_Expression();

    /**
     * The meta object literal for the '{@link de.itemis.mobilizer.appModelDsl.CellType <em>Cell Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mobilizer.appModelDsl.CellType
     * @see de.itemis.mobilizer.appModelDsl.impl.AppModelDslPackageImpl#getCellType()
     * @generated
     */
    EEnum CELL_TYPE = eINSTANCE.getCellType();

  }

} //AppModelDslPackage
