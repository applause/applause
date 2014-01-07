/**
 */
package org.applause.lang.applauseDsl;

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
 * @see org.applause.lang.applauseDsl.ApplauseDslFactory
 * @model kind="package"
 * @generated
 */
public interface ApplauseDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "applauseDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.applause.org/lang/ApplauseDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "applauseDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplauseDslPackage eINSTANCE = org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ModelImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.NamedElementImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.TypeImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.DataTypeImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.EntityImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ABSTRACT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.AttributeImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MANY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.PlatformImpl <em>Platform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.PlatformImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getPlatform()
   * @generated
   */
  int PLATFORM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM__MAPPINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Platform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.PlatformMappingImpl <em>Platform Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.PlatformMappingImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getPlatformMapping()
   * @generated
   */
  int PLATFORM_MAPPING = 7;

  /**
   * The number of structural features of the '<em>Platform Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_MAPPING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.TypeMappingImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getTypeMapping()
   * @generated
   */
  int TYPE_MAPPING = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING__TYPE = PLATFORM_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Simple Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING__SIMPLE_NAME = PLATFORM_MAPPING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_FEATURE_COUNT = PLATFORM_MAPPING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.DataSourceImpl <em>Data Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.DataSourceImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDataSource()
   * @generated
   */
  int DATA_SOURCE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Base Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE__BASE_URL = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE__RESOURCE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE__METHODS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.DataSourceAccessMethodImpl <em>Data Source Access Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.DataSourceAccessMethodImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDataSourceAccessMethod()
   * @generated
   */
  int DATA_SOURCE_ACCESS_METHOD = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_ACCESS_METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Declared Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_ACCESS_METHOD__DECLARED_PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Returns Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_ACCESS_METHOD__RETURNS_MANY = 2;

  /**
   * The feature id for the '<em><b>Rest Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION = 3;

  /**
   * The number of structural features of the '<em>Data Source Access Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_ACCESS_METHOD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.RESTSpecificationImpl <em>REST Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.RESTSpecificationImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRESTSpecification()
   * @generated
   */
  int REST_SPECIFICATION = 11;

  /**
   * The feature id for the '<em><b>Verb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_SPECIFICATION__VERB = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_SPECIFICATION__PATH = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_SPECIFICATION__BODY = 2;

  /**
   * The number of structural features of the '<em>REST Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_SPECIFICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.DataSourceBodySpecificationImpl <em>Data Source Body Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.DataSourceBodySpecificationImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDataSourceBodySpecification()
   * @generated
   */
  int DATA_SOURCE_BODY_SPECIFICATION = 12;

  /**
   * The feature id for the '<em><b>Bodycontents</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS = 0;

  /**
   * The number of structural features of the '<em>Data Source Body Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_BODY_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ParameterImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.RESTURLImpl <em>RESTURL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.RESTURLImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRESTURL()
   * @generated
   */
  int RESTURL = 14;

  /**
   * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTURL__FRAGMENTS = 0;

  /**
   * The number of structural features of the '<em>RESTURL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTURL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.AbsoluteRESTURLImpl <em>Absolute RESTURL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.AbsoluteRESTURLImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getAbsoluteRESTURL()
   * @generated
   */
  int ABSOLUTE_RESTURL = 15;

  /**
   * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_RESTURL__FRAGMENTS = RESTURL__FRAGMENTS;

  /**
   * The feature id for the '<em><b>Host</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_RESTURL__HOST = RESTURL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_RESTURL__PORT = RESTURL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Absolute RESTURL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_RESTURL_FEATURE_COUNT = RESTURL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.RelativeRESTURLImpl <em>Relative RESTURL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.RelativeRESTURLImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRelativeRESTURL()
   * @generated
   */
  int RELATIVE_RESTURL = 16;

  /**
   * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_RESTURL__FRAGMENTS = RESTURL__FRAGMENTS;

  /**
   * The number of structural features of the '<em>Relative RESTURL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_RESTURL_FEATURE_COUNT = RESTURL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.UrlFragmentImpl <em>Url Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.UrlFragmentImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUrlFragment()
   * @generated
   */
  int URL_FRAGMENT = 17;

  /**
   * The number of structural features of the '<em>Url Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_FRAGMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.UrlPathFragmentImpl <em>Url Path Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.UrlPathFragmentImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUrlPathFragment()
   * @generated
   */
  int URL_PATH_FRAGMENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_PATH_FRAGMENT__NAME = URL_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Url Path Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_PATH_FRAGMENT_FEATURE_COUNT = URL_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.VariableImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 19;

  /**
   * The feature id for the '<em><b>Parameter Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__PARAMETER_REFERENCE = URL_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = URL_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ScreenImpl <em>Screen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ScreenImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScreen()
   * @generated
   */
  int SCREEN = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__TITLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Datasource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__DATASOURCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__SECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Screen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ScreenSectionImpl <em>Screen Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ScreenSectionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScreenSection()
   * @generated
   */
  int SCREEN_SECTION = 21;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_SECTION__TITLE = 0;

  /**
   * The feature id for the '<em><b>Datasource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_SECTION__DATASOURCE = 1;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_SECTION__ITEMS = 2;

  /**
   * The number of structural features of the '<em>Screen Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_SECTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ScreenSectionItemsImpl <em>Screen Section Items</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ScreenSectionItemsImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScreenSectionItems()
   * @generated
   */
  int SCREEN_SECTION_ITEMS = 22;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_SECTION_ITEMS__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Screen Section Items</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_SECTION_ITEMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ScreenListItemCellImpl <em>Screen List Item Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ScreenListItemCellImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScreenListItemCell()
   * @generated
   */
  int SCREEN_LIST_ITEM_CELL = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST_ITEM_CELL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Rest Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST_ITEM_CELL__REST_METHOD = 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST_ITEM_CELL__VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST_ITEM_CELL__CONFIGURATIONS = 3;

  /**
   * The number of structural features of the '<em>Screen List Item Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST_ITEM_CELL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ListItemCellDeclarationImpl <em>List Item Cell Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ListItemCellDeclarationImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getListItemCellDeclaration()
   * @generated
   */
  int LIST_ITEM_CELL_DECLARATION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM_CELL_DECLARATION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM_CELL_DECLARATION__MEMBERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Item Cell Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM_CELL_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.UIComponentDeclarationImpl <em>UI Component Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.UIComponentDeclarationImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUIComponentDeclaration()
   * @generated
   */
  int UI_COMPONENT_DECLARATION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_DECLARATION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_DECLARATION__MEMBERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UI Component Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.UIComponentMemberDeclarationImpl <em>UI Component Member Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.UIComponentMemberDeclarationImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUIComponentMemberDeclaration()
   * @generated
   */
  int UI_COMPONENT_MEMBER_DECLARATION = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_MEMBER_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_MEMBER_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>UI Component Member Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_MEMBER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.UIComponentOrDataTypeImpl <em>UI Component Or Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.UIComponentOrDataTypeImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUIComponentOrDataType()
   * @generated
   */
  int UI_COMPONENT_OR_DATA_TYPE = 27;

  /**
   * The number of structural features of the '<em>UI Component Or Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_OR_DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.RESTMethodCallImpl <em>REST Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.RESTMethodCallImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRESTMethodCall()
   * @generated
   */
  int REST_METHOD_CALL = 28;

  /**
   * The feature id for the '<em><b>Datasource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_METHOD_CALL__DATASOURCE = 0;

  /**
   * The feature id for the '<em><b>Rest Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_METHOD_CALL__REST_METHOD = 1;

  /**
   * The number of structural features of the '<em>REST Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_METHOD_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.DataSourceCallImpl <em>Data Source Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.DataSourceCallImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDataSourceCall()
   * @generated
   */
  int DATA_SOURCE_CALL = 29;

  /**
   * The feature id for the '<em><b>Datasource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_CALL__DATASOURCE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_CALL__NAME = 1;

  /**
   * The number of structural features of the '<em>Data Source Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.UIComponentMemberConfigurationImpl <em>UI Component Member Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.UIComponentMemberConfigurationImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUIComponentMemberConfiguration()
   * @generated
   */
  int UI_COMPONENT_MEMBER_CONFIGURATION = 30;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_MEMBER_CONFIGURATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_MEMBER_CONFIGURATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>UI Component Member Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_MEMBER_CONFIGURATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.UIComponentMemberCallImpl <em>UI Component Member Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.UIComponentMemberCallImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUIComponentMemberCall()
   * @generated
   */
  int UI_COMPONENT_MEMBER_CALL = 31;

  /**
   * The feature id for the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_MEMBER_CALL__COMPONENT = 0;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_MEMBER_CALL__MEMBER = 1;

  /**
   * The number of structural features of the '<em>UI Component Member Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_COMPONENT_MEMBER_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ExpressionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 32;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.EntityMemberCallImpl <em>Entity Member Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.EntityMemberCallImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getEntityMemberCall()
   * @generated
   */
  int ENTITY_MEMBER_CALL = 33;

  /**
   * The feature id for the '<em><b>Head</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MEMBER_CALL__HEAD = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MEMBER_CALL__TAIL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity Member Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MEMBER_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.EntityMemberCallTailImpl <em>Entity Member Call Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.EntityMemberCallTailImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getEntityMemberCallTail()
   * @generated
   */
  int ENTITY_MEMBER_CALL_TAIL = 34;

  /**
   * The feature id for the '<em><b>Head</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MEMBER_CALL_TAIL__HEAD = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MEMBER_CALL_TAIL__TAIL = 1;

  /**
   * The number of structural features of the '<em>Entity Member Call Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MEMBER_CALL_TAIL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.AttributeReferenceImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getAttributeReference()
   * @generated
   */
  int ATTRIBUTE_REFERENCE = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REFERENCE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Attribute Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.StringLiteralImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 36;

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
   * The meta object id for the '{@link org.applause.lang.applauseDsl.RESTVerb <em>REST Verb</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.RESTVerb
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRESTVerb()
   * @generated
   */
  int REST_VERB = 37;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.ScreenKind <em>Screen Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.ScreenKind
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScreenKind()
   * @generated
   */
  int SCREEN_KIND = 38;


  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.applause.lang.applauseDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.applause.lang.applauseDsl.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see org.applause.lang.applauseDsl.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.applause.lang.applauseDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.applause.lang.applauseDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Entity#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.applause.lang.applauseDsl.Entity#isAbstract()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Abstract();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.applause.lang.applauseDsl.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.applause.lang.applauseDsl.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.applause.lang.applauseDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Attribute#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.applause.lang.applauseDsl.Attribute#isMany()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Many();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Platform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Platform</em>'.
   * @see org.applause.lang.applauseDsl.Platform
   * @generated
   */
  EClass getPlatform();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.Platform#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see org.applause.lang.applauseDsl.Platform#getMappings()
   * @see #getPlatform()
   * @generated
   */
  EReference getPlatform_Mappings();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.PlatformMapping <em>Platform Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Platform Mapping</em>'.
   * @see org.applause.lang.applauseDsl.PlatformMapping
   * @generated
   */
  EClass getPlatformMapping();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.TypeMapping <em>Type Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Mapping</em>'.
   * @see org.applause.lang.applauseDsl.TypeMapping
   * @generated
   */
  EClass getTypeMapping();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.TypeMapping#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.TypeMapping#getType()
   * @see #getTypeMapping()
   * @generated
   */
  EReference getTypeMapping_Type();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.TypeMapping#getSimpleName <em>Simple Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Name</em>'.
   * @see org.applause.lang.applauseDsl.TypeMapping#getSimpleName()
   * @see #getTypeMapping()
   * @generated
   */
  EAttribute getTypeMapping_SimpleName();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.DataSource <em>Data Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Source</em>'.
   * @see org.applause.lang.applauseDsl.DataSource
   * @generated
   */
  EClass getDataSource();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.DataSource#getBaseUrl <em>Base Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Url</em>'.
   * @see org.applause.lang.applauseDsl.DataSource#getBaseUrl()
   * @see #getDataSource()
   * @generated
   */
  EReference getDataSource_BaseUrl();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.DataSource#getResourceType <em>Resource Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource Type</em>'.
   * @see org.applause.lang.applauseDsl.DataSource#getResourceType()
   * @see #getDataSource()
   * @generated
   */
  EReference getDataSource_ResourceType();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.DataSource#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.applause.lang.applauseDsl.DataSource#getMethods()
   * @see #getDataSource()
   * @generated
   */
  EReference getDataSource_Methods();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.DataSourceAccessMethod <em>Data Source Access Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Source Access Method</em>'.
   * @see org.applause.lang.applauseDsl.DataSourceAccessMethod
   * @generated
   */
  EClass getDataSourceAccessMethod();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.DataSourceAccessMethod#getName()
   * @see #getDataSourceAccessMethod()
   * @generated
   */
  EAttribute getDataSourceAccessMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#getDeclaredParameters <em>Declared Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declared Parameters</em>'.
   * @see org.applause.lang.applauseDsl.DataSourceAccessMethod#getDeclaredParameters()
   * @see #getDataSourceAccessMethod()
   * @generated
   */
  EReference getDataSourceAccessMethod_DeclaredParameters();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#isReturnsMany <em>Returns Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Returns Many</em>'.
   * @see org.applause.lang.applauseDsl.DataSourceAccessMethod#isReturnsMany()
   * @see #getDataSourceAccessMethod()
   * @generated
   */
  EAttribute getDataSourceAccessMethod_ReturnsMany();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#getRestSpecification <em>Rest Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rest Specification</em>'.
   * @see org.applause.lang.applauseDsl.DataSourceAccessMethod#getRestSpecification()
   * @see #getDataSourceAccessMethod()
   * @generated
   */
  EReference getDataSourceAccessMethod_RestSpecification();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.RESTSpecification <em>REST Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REST Specification</em>'.
   * @see org.applause.lang.applauseDsl.RESTSpecification
   * @generated
   */
  EClass getRESTSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.RESTSpecification#getVerb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verb</em>'.
   * @see org.applause.lang.applauseDsl.RESTSpecification#getVerb()
   * @see #getRESTSpecification()
   * @generated
   */
  EAttribute getRESTSpecification_Verb();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.RESTSpecification#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.applause.lang.applauseDsl.RESTSpecification#getPath()
   * @see #getRESTSpecification()
   * @generated
   */
  EReference getRESTSpecification_Path();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.RESTSpecification#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.applause.lang.applauseDsl.RESTSpecification#getBody()
   * @see #getRESTSpecification()
   * @generated
   */
  EReference getRESTSpecification_Body();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.DataSourceBodySpecification <em>Data Source Body Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Source Body Specification</em>'.
   * @see org.applause.lang.applauseDsl.DataSourceBodySpecification
   * @generated
   */
  EClass getDataSourceBodySpecification();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.DataSourceBodySpecification#getBodycontents <em>Bodycontents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bodycontents</em>'.
   * @see org.applause.lang.applauseDsl.DataSourceBodySpecification#getBodycontents()
   * @see #getDataSourceBodySpecification()
   * @generated
   */
  EReference getDataSourceBodySpecification_Bodycontents();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.applause.lang.applauseDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.RESTURL <em>RESTURL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RESTURL</em>'.
   * @see org.applause.lang.applauseDsl.RESTURL
   * @generated
   */
  EClass getRESTURL();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.RESTURL#getFragments <em>Fragments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fragments</em>'.
   * @see org.applause.lang.applauseDsl.RESTURL#getFragments()
   * @see #getRESTURL()
   * @generated
   */
  EReference getRESTURL_Fragments();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.AbsoluteRESTURL <em>Absolute RESTURL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Absolute RESTURL</em>'.
   * @see org.applause.lang.applauseDsl.AbsoluteRESTURL
   * @generated
   */
  EClass getAbsoluteRESTURL();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.AbsoluteRESTURL#getHost <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Host</em>'.
   * @see org.applause.lang.applauseDsl.AbsoluteRESTURL#getHost()
   * @see #getAbsoluteRESTURL()
   * @generated
   */
  EReference getAbsoluteRESTURL_Host();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.AbsoluteRESTURL#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.applause.lang.applauseDsl.AbsoluteRESTURL#getPort()
   * @see #getAbsoluteRESTURL()
   * @generated
   */
  EAttribute getAbsoluteRESTURL_Port();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.RelativeRESTURL <em>Relative RESTURL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relative RESTURL</em>'.
   * @see org.applause.lang.applauseDsl.RelativeRESTURL
   * @generated
   */
  EClass getRelativeRESTURL();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.UrlFragment <em>Url Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Url Fragment</em>'.
   * @see org.applause.lang.applauseDsl.UrlFragment
   * @generated
   */
  EClass getUrlFragment();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.UrlPathFragment <em>Url Path Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Url Path Fragment</em>'.
   * @see org.applause.lang.applauseDsl.UrlPathFragment
   * @generated
   */
  EClass getUrlPathFragment();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.UrlPathFragment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.UrlPathFragment#getName()
   * @see #getUrlPathFragment()
   * @generated
   */
  EAttribute getUrlPathFragment_Name();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.applause.lang.applauseDsl.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.Variable#getParameterReference <em>Parameter Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter Reference</em>'.
   * @see org.applause.lang.applauseDsl.Variable#getParameterReference()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_ParameterReference();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Screen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen</em>'.
   * @see org.applause.lang.applauseDsl.Screen
   * @generated
   */
  EClass getScreen();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Screen#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.applause.lang.applauseDsl.Screen#getKind()
   * @see #getScreen()
   * @generated
   */
  EAttribute getScreen_Kind();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Screen#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.applause.lang.applauseDsl.Screen#getTitle()
   * @see #getScreen()
   * @generated
   */
  EAttribute getScreen_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.Screen#getDatasource <em>Datasource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datasource</em>'.
   * @see org.applause.lang.applauseDsl.Screen#getDatasource()
   * @see #getScreen()
   * @generated
   */
  EReference getScreen_Datasource();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.Screen#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.applause.lang.applauseDsl.Screen#getSections()
   * @see #getScreen()
   * @generated
   */
  EReference getScreen_Sections();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ScreenSection <em>Screen Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen Section</em>'.
   * @see org.applause.lang.applauseDsl.ScreenSection
   * @generated
   */
  EClass getScreenSection();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.ScreenSection#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.applause.lang.applauseDsl.ScreenSection#getTitle()
   * @see #getScreenSection()
   * @generated
   */
  EAttribute getScreenSection_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ScreenSection#getDatasource <em>Datasource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datasource</em>'.
   * @see org.applause.lang.applauseDsl.ScreenSection#getDatasource()
   * @see #getScreenSection()
   * @generated
   */
  EReference getScreenSection_Datasource();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ScreenSection#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Items</em>'.
   * @see org.applause.lang.applauseDsl.ScreenSection#getItems()
   * @see #getScreenSection()
   * @generated
   */
  EReference getScreenSection_Items();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ScreenSectionItems <em>Screen Section Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen Section Items</em>'.
   * @see org.applause.lang.applauseDsl.ScreenSectionItems
   * @generated
   */
  EClass getScreenSectionItems();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.ScreenSectionItems#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.applause.lang.applauseDsl.ScreenSectionItems#getItems()
   * @see #getScreenSectionItems()
   * @generated
   */
  EReference getScreenSectionItems_Items();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ScreenListItemCell <em>Screen List Item Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen List Item Cell</em>'.
   * @see org.applause.lang.applauseDsl.ScreenListItemCell
   * @generated
   */
  EClass getScreenListItemCell();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.ScreenListItemCell#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.ScreenListItemCell#getType()
   * @see #getScreenListItemCell()
   * @generated
   */
  EReference getScreenListItemCell_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ScreenListItemCell#getRestMethod <em>Rest Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rest Method</em>'.
   * @see org.applause.lang.applauseDsl.ScreenListItemCell#getRestMethod()
   * @see #getScreenListItemCell()
   * @generated
   */
  EReference getScreenListItemCell_RestMethod();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.ScreenListItemCell#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.applause.lang.applauseDsl.ScreenListItemCell#getVariable()
   * @see #getScreenListItemCell()
   * @generated
   */
  EAttribute getScreenListItemCell_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.ScreenListItemCell#getConfigurations <em>Configurations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configurations</em>'.
   * @see org.applause.lang.applauseDsl.ScreenListItemCell#getConfigurations()
   * @see #getScreenListItemCell()
   * @generated
   */
  EReference getScreenListItemCell_Configurations();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ListItemCellDeclaration <em>List Item Cell Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Item Cell Declaration</em>'.
   * @see org.applause.lang.applauseDsl.ListItemCellDeclaration
   * @generated
   */
  EClass getListItemCellDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.ListItemCellDeclaration#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.applause.lang.applauseDsl.ListItemCellDeclaration#getMembers()
   * @see #getListItemCellDeclaration()
   * @generated
   */
  EReference getListItemCellDeclaration_Members();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.UIComponentDeclaration <em>UI Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Component Declaration</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentDeclaration
   * @generated
   */
  EClass getUIComponentDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.UIComponentDeclaration#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentDeclaration#getMembers()
   * @see #getUIComponentDeclaration()
   * @generated
   */
  EReference getUIComponentDeclaration_Members();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.UIComponentMemberDeclaration <em>UI Component Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Component Member Declaration</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentMemberDeclaration
   * @generated
   */
  EClass getUIComponentMemberDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.UIComponentMemberDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentMemberDeclaration#getType()
   * @see #getUIComponentMemberDeclaration()
   * @generated
   */
  EReference getUIComponentMemberDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.UIComponentMemberDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentMemberDeclaration#getName()
   * @see #getUIComponentMemberDeclaration()
   * @generated
   */
  EAttribute getUIComponentMemberDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.UIComponentOrDataType <em>UI Component Or Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Component Or Data Type</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentOrDataType
   * @generated
   */
  EClass getUIComponentOrDataType();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.RESTMethodCall <em>REST Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REST Method Call</em>'.
   * @see org.applause.lang.applauseDsl.RESTMethodCall
   * @generated
   */
  EClass getRESTMethodCall();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.RESTMethodCall#getDatasource <em>Datasource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Datasource</em>'.
   * @see org.applause.lang.applauseDsl.RESTMethodCall#getDatasource()
   * @see #getRESTMethodCall()
   * @generated
   */
  EReference getRESTMethodCall_Datasource();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.RESTMethodCall#getRestMethod <em>Rest Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rest Method</em>'.
   * @see org.applause.lang.applauseDsl.RESTMethodCall#getRestMethod()
   * @see #getRESTMethodCall()
   * @generated
   */
  EReference getRESTMethodCall_RestMethod();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.DataSourceCall <em>Data Source Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Source Call</em>'.
   * @see org.applause.lang.applauseDsl.DataSourceCall
   * @generated
   */
  EClass getDataSourceCall();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.DataSourceCall#getDatasource <em>Datasource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Datasource</em>'.
   * @see org.applause.lang.applauseDsl.DataSourceCall#getDatasource()
   * @see #getDataSourceCall()
   * @generated
   */
  EReference getDataSourceCall_Datasource();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.DataSourceCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.DataSourceCall#getName()
   * @see #getDataSourceCall()
   * @generated
   */
  EAttribute getDataSourceCall_Name();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.UIComponentMemberConfiguration <em>UI Component Member Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Component Member Configuration</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentMemberConfiguration
   * @generated
   */
  EClass getUIComponentMemberConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.UIComponentMemberConfiguration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentMemberConfiguration#getType()
   * @see #getUIComponentMemberConfiguration()
   * @generated
   */
  EReference getUIComponentMemberConfiguration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.UIComponentMemberConfiguration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentMemberConfiguration#getValue()
   * @see #getUIComponentMemberConfiguration()
   * @generated
   */
  EReference getUIComponentMemberConfiguration_Value();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.UIComponentMemberCall <em>UI Component Member Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Component Member Call</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentMemberCall
   * @generated
   */
  EClass getUIComponentMemberCall();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.UIComponentMemberCall#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Component</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentMemberCall#getComponent()
   * @see #getUIComponentMemberCall()
   * @generated
   */
  EReference getUIComponentMemberCall_Component();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.UIComponentMemberCall#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Member</em>'.
   * @see org.applause.lang.applauseDsl.UIComponentMemberCall#getMember()
   * @see #getUIComponentMemberCall()
   * @generated
   */
  EReference getUIComponentMemberCall_Member();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.applause.lang.applauseDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.EntityMemberCall <em>Entity Member Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Member Call</em>'.
   * @see org.applause.lang.applauseDsl.EntityMemberCall
   * @generated
   */
  EClass getEntityMemberCall();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.EntityMemberCall#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Head</em>'.
   * @see org.applause.lang.applauseDsl.EntityMemberCall#getHead()
   * @see #getEntityMemberCall()
   * @generated
   */
  EReference getEntityMemberCall_Head();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.EntityMemberCall#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see org.applause.lang.applauseDsl.EntityMemberCall#getTail()
   * @see #getEntityMemberCall()
   * @generated
   */
  EReference getEntityMemberCall_Tail();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.EntityMemberCallTail <em>Entity Member Call Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Member Call Tail</em>'.
   * @see org.applause.lang.applauseDsl.EntityMemberCallTail
   * @generated
   */
  EClass getEntityMemberCallTail();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.EntityMemberCallTail#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Head</em>'.
   * @see org.applause.lang.applauseDsl.EntityMemberCallTail#getHead()
   * @see #getEntityMemberCallTail()
   * @generated
   */
  EReference getEntityMemberCallTail_Head();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.EntityMemberCallTail#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see org.applause.lang.applauseDsl.EntityMemberCallTail#getTail()
   * @see #getEntityMemberCallTail()
   * @generated
   */
  EReference getEntityMemberCallTail_Tail();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.AttributeReference <em>Attribute Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Reference</em>'.
   * @see org.applause.lang.applauseDsl.AttributeReference
   * @generated
   */
  EClass getAttributeReference();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.AttributeReference#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.applause.lang.applauseDsl.AttributeReference#getValue()
   * @see #getAttributeReference()
   * @generated
   */
  EReference getAttributeReference_Value();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.applause.lang.applauseDsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.applause.lang.applauseDsl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for enum '{@link org.applause.lang.applauseDsl.RESTVerb <em>REST Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>REST Verb</em>'.
   * @see org.applause.lang.applauseDsl.RESTVerb
   * @generated
   */
  EEnum getRESTVerb();

  /**
   * Returns the meta object for enum '{@link org.applause.lang.applauseDsl.ScreenKind <em>Screen Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Screen Kind</em>'.
   * @see org.applause.lang.applauseDsl.ScreenKind
   * @generated
   */
  EEnum getScreenKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ApplauseDslFactory getApplauseDslFactory();

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
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ModelImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.NamedElementImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.TypeImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.DataTypeImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.EntityImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__ABSTRACT = eINSTANCE.getEntity_Abstract();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.AttributeImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MANY = eINSTANCE.getAttribute_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.PlatformImpl <em>Platform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.PlatformImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getPlatform()
     * @generated
     */
    EClass PLATFORM = eINSTANCE.getPlatform();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLATFORM__MAPPINGS = eINSTANCE.getPlatform_Mappings();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.PlatformMappingImpl <em>Platform Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.PlatformMappingImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getPlatformMapping()
     * @generated
     */
    EClass PLATFORM_MAPPING = eINSTANCE.getPlatformMapping();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.TypeMappingImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getTypeMapping()
     * @generated
     */
    EClass TYPE_MAPPING = eINSTANCE.getTypeMapping();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_MAPPING__TYPE = eINSTANCE.getTypeMapping_Type();

    /**
     * The meta object literal for the '<em><b>Simple Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_MAPPING__SIMPLE_NAME = eINSTANCE.getTypeMapping_SimpleName();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.DataSourceImpl <em>Data Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.DataSourceImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDataSource()
     * @generated
     */
    EClass DATA_SOURCE = eINSTANCE.getDataSource();

    /**
     * The meta object literal for the '<em><b>Base Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE__BASE_URL = eINSTANCE.getDataSource_BaseUrl();

    /**
     * The meta object literal for the '<em><b>Resource Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE__RESOURCE_TYPE = eINSTANCE.getDataSource_ResourceType();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE__METHODS = eINSTANCE.getDataSource_Methods();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.DataSourceAccessMethodImpl <em>Data Source Access Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.DataSourceAccessMethodImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDataSourceAccessMethod()
     * @generated
     */
    EClass DATA_SOURCE_ACCESS_METHOD = eINSTANCE.getDataSourceAccessMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_SOURCE_ACCESS_METHOD__NAME = eINSTANCE.getDataSourceAccessMethod_Name();

    /**
     * The meta object literal for the '<em><b>Declared Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE_ACCESS_METHOD__DECLARED_PARAMETERS = eINSTANCE.getDataSourceAccessMethod_DeclaredParameters();

    /**
     * The meta object literal for the '<em><b>Returns Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_SOURCE_ACCESS_METHOD__RETURNS_MANY = eINSTANCE.getDataSourceAccessMethod_ReturnsMany();

    /**
     * The meta object literal for the '<em><b>Rest Specification</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION = eINSTANCE.getDataSourceAccessMethod_RestSpecification();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.RESTSpecificationImpl <em>REST Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.RESTSpecificationImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRESTSpecification()
     * @generated
     */
    EClass REST_SPECIFICATION = eINSTANCE.getRESTSpecification();

    /**
     * The meta object literal for the '<em><b>Verb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REST_SPECIFICATION__VERB = eINSTANCE.getRESTSpecification_Verb();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_SPECIFICATION__PATH = eINSTANCE.getRESTSpecification_Path();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_SPECIFICATION__BODY = eINSTANCE.getRESTSpecification_Body();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.DataSourceBodySpecificationImpl <em>Data Source Body Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.DataSourceBodySpecificationImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDataSourceBodySpecification()
     * @generated
     */
    EClass DATA_SOURCE_BODY_SPECIFICATION = eINSTANCE.getDataSourceBodySpecification();

    /**
     * The meta object literal for the '<em><b>Bodycontents</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS = eINSTANCE.getDataSourceBodySpecification_Bodycontents();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ParameterImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.RESTURLImpl <em>RESTURL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.RESTURLImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRESTURL()
     * @generated
     */
    EClass RESTURL = eINSTANCE.getRESTURL();

    /**
     * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTURL__FRAGMENTS = eINSTANCE.getRESTURL_Fragments();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.AbsoluteRESTURLImpl <em>Absolute RESTURL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.AbsoluteRESTURLImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getAbsoluteRESTURL()
     * @generated
     */
    EClass ABSOLUTE_RESTURL = eINSTANCE.getAbsoluteRESTURL();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSOLUTE_RESTURL__HOST = eINSTANCE.getAbsoluteRESTURL_Host();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSOLUTE_RESTURL__PORT = eINSTANCE.getAbsoluteRESTURL_Port();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.RelativeRESTURLImpl <em>Relative RESTURL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.RelativeRESTURLImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRelativeRESTURL()
     * @generated
     */
    EClass RELATIVE_RESTURL = eINSTANCE.getRelativeRESTURL();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.UrlFragmentImpl <em>Url Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.UrlFragmentImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUrlFragment()
     * @generated
     */
    EClass URL_FRAGMENT = eINSTANCE.getUrlFragment();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.UrlPathFragmentImpl <em>Url Path Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.UrlPathFragmentImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUrlPathFragment()
     * @generated
     */
    EClass URL_PATH_FRAGMENT = eINSTANCE.getUrlPathFragment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_PATH_FRAGMENT__NAME = eINSTANCE.getUrlPathFragment_Name();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.VariableImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Parameter Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__PARAMETER_REFERENCE = eINSTANCE.getVariable_ParameterReference();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ScreenImpl <em>Screen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ScreenImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScreen()
     * @generated
     */
    EClass SCREEN = eINSTANCE.getScreen();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN__KIND = eINSTANCE.getScreen_Kind();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN__TITLE = eINSTANCE.getScreen_Title();

    /**
     * The meta object literal for the '<em><b>Datasource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN__DATASOURCE = eINSTANCE.getScreen_Datasource();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN__SECTIONS = eINSTANCE.getScreen_Sections();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ScreenSectionImpl <em>Screen Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ScreenSectionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScreenSection()
     * @generated
     */
    EClass SCREEN_SECTION = eINSTANCE.getScreenSection();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN_SECTION__TITLE = eINSTANCE.getScreenSection_Title();

    /**
     * The meta object literal for the '<em><b>Datasource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_SECTION__DATASOURCE = eINSTANCE.getScreenSection_Datasource();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_SECTION__ITEMS = eINSTANCE.getScreenSection_Items();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ScreenSectionItemsImpl <em>Screen Section Items</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ScreenSectionItemsImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScreenSectionItems()
     * @generated
     */
    EClass SCREEN_SECTION_ITEMS = eINSTANCE.getScreenSectionItems();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_SECTION_ITEMS__ITEMS = eINSTANCE.getScreenSectionItems_Items();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ScreenListItemCellImpl <em>Screen List Item Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ScreenListItemCellImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScreenListItemCell()
     * @generated
     */
    EClass SCREEN_LIST_ITEM_CELL = eINSTANCE.getScreenListItemCell();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_LIST_ITEM_CELL__TYPE = eINSTANCE.getScreenListItemCell_Type();

    /**
     * The meta object literal for the '<em><b>Rest Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_LIST_ITEM_CELL__REST_METHOD = eINSTANCE.getScreenListItemCell_RestMethod();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN_LIST_ITEM_CELL__VARIABLE = eINSTANCE.getScreenListItemCell_Variable();

    /**
     * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_LIST_ITEM_CELL__CONFIGURATIONS = eINSTANCE.getScreenListItemCell_Configurations();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ListItemCellDeclarationImpl <em>List Item Cell Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ListItemCellDeclarationImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getListItemCellDeclaration()
     * @generated
     */
    EClass LIST_ITEM_CELL_DECLARATION = eINSTANCE.getListItemCellDeclaration();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ITEM_CELL_DECLARATION__MEMBERS = eINSTANCE.getListItemCellDeclaration_Members();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.UIComponentDeclarationImpl <em>UI Component Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.UIComponentDeclarationImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUIComponentDeclaration()
     * @generated
     */
    EClass UI_COMPONENT_DECLARATION = eINSTANCE.getUIComponentDeclaration();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_COMPONENT_DECLARATION__MEMBERS = eINSTANCE.getUIComponentDeclaration_Members();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.UIComponentMemberDeclarationImpl <em>UI Component Member Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.UIComponentMemberDeclarationImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUIComponentMemberDeclaration()
     * @generated
     */
    EClass UI_COMPONENT_MEMBER_DECLARATION = eINSTANCE.getUIComponentMemberDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_COMPONENT_MEMBER_DECLARATION__TYPE = eINSTANCE.getUIComponentMemberDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_COMPONENT_MEMBER_DECLARATION__NAME = eINSTANCE.getUIComponentMemberDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.UIComponentOrDataTypeImpl <em>UI Component Or Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.UIComponentOrDataTypeImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUIComponentOrDataType()
     * @generated
     */
    EClass UI_COMPONENT_OR_DATA_TYPE = eINSTANCE.getUIComponentOrDataType();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.RESTMethodCallImpl <em>REST Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.RESTMethodCallImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRESTMethodCall()
     * @generated
     */
    EClass REST_METHOD_CALL = eINSTANCE.getRESTMethodCall();

    /**
     * The meta object literal for the '<em><b>Datasource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_METHOD_CALL__DATASOURCE = eINSTANCE.getRESTMethodCall_Datasource();

    /**
     * The meta object literal for the '<em><b>Rest Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_METHOD_CALL__REST_METHOD = eINSTANCE.getRESTMethodCall_RestMethod();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.DataSourceCallImpl <em>Data Source Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.DataSourceCallImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDataSourceCall()
     * @generated
     */
    EClass DATA_SOURCE_CALL = eINSTANCE.getDataSourceCall();

    /**
     * The meta object literal for the '<em><b>Datasource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE_CALL__DATASOURCE = eINSTANCE.getDataSourceCall_Datasource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_SOURCE_CALL__NAME = eINSTANCE.getDataSourceCall_Name();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.UIComponentMemberConfigurationImpl <em>UI Component Member Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.UIComponentMemberConfigurationImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUIComponentMemberConfiguration()
     * @generated
     */
    EClass UI_COMPONENT_MEMBER_CONFIGURATION = eINSTANCE.getUIComponentMemberConfiguration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_COMPONENT_MEMBER_CONFIGURATION__TYPE = eINSTANCE.getUIComponentMemberConfiguration_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_COMPONENT_MEMBER_CONFIGURATION__VALUE = eINSTANCE.getUIComponentMemberConfiguration_Value();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.UIComponentMemberCallImpl <em>UI Component Member Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.UIComponentMemberCallImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getUIComponentMemberCall()
     * @generated
     */
    EClass UI_COMPONENT_MEMBER_CALL = eINSTANCE.getUIComponentMemberCall();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_COMPONENT_MEMBER_CALL__COMPONENT = eINSTANCE.getUIComponentMemberCall_Component();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_COMPONENT_MEMBER_CALL__MEMBER = eINSTANCE.getUIComponentMemberCall_Member();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ExpressionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.EntityMemberCallImpl <em>Entity Member Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.EntityMemberCallImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getEntityMemberCall()
     * @generated
     */
    EClass ENTITY_MEMBER_CALL = eINSTANCE.getEntityMemberCall();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_MEMBER_CALL__HEAD = eINSTANCE.getEntityMemberCall_Head();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_MEMBER_CALL__TAIL = eINSTANCE.getEntityMemberCall_Tail();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.EntityMemberCallTailImpl <em>Entity Member Call Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.EntityMemberCallTailImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getEntityMemberCallTail()
     * @generated
     */
    EClass ENTITY_MEMBER_CALL_TAIL = eINSTANCE.getEntityMemberCallTail();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_MEMBER_CALL_TAIL__HEAD = eINSTANCE.getEntityMemberCallTail_Head();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_MEMBER_CALL_TAIL__TAIL = eINSTANCE.getEntityMemberCallTail_Tail();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.AttributeReferenceImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getAttributeReference()
     * @generated
     */
    EClass ATTRIBUTE_REFERENCE = eINSTANCE.getAttributeReference();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_REFERENCE__VALUE = eINSTANCE.getAttributeReference_Value();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.StringLiteralImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringLiteral()
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
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.RESTVerb <em>REST Verb</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.RESTVerb
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRESTVerb()
     * @generated
     */
    EEnum REST_VERB = eINSTANCE.getRESTVerb();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.ScreenKind <em>Screen Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.ScreenKind
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScreenKind()
     * @generated
     */
    EEnum SCREEN_KIND = eINSTANCE.getScreenKind();

  }

} //ApplauseDslPackage
