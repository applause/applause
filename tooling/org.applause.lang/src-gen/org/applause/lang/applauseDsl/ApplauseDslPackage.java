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
   * The feature id for the '<em><b>Base Url</b></em>' attribute.
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
   * The feature id for the '<em><b>Path</b></em>' attribute.
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
   * The meta object id for the '{@link org.applause.lang.applauseDsl.RESTVerb <em>REST Verb</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.RESTVerb
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRESTVerb()
   * @generated
   */
  int REST_VERB = 14;


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
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.DataSource#getBaseUrl <em>Base Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Url</em>'.
   * @see org.applause.lang.applauseDsl.DataSource#getBaseUrl()
   * @see #getDataSource()
   * @generated
   */
  EAttribute getDataSource_BaseUrl();

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
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.RESTSpecification#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.applause.lang.applauseDsl.RESTSpecification#getPath()
   * @see #getRESTSpecification()
   * @generated
   */
  EAttribute getRESTSpecification_Path();

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
   * Returns the meta object for enum '{@link org.applause.lang.applauseDsl.RESTVerb <em>REST Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>REST Verb</em>'.
   * @see org.applause.lang.applauseDsl.RESTVerb
   * @generated
   */
  EEnum getRESTVerb();

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
     * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_SOURCE__BASE_URL = eINSTANCE.getDataSource_BaseUrl();

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
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REST_SPECIFICATION__PATH = eINSTANCE.getRESTSpecification_Path();

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
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.RESTVerb <em>REST Verb</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.RESTVerb
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getRESTVerb()
     * @generated
     */
    EEnum REST_VERB = eINSTANCE.getRESTVerb();

  }

} //ApplauseDslPackage
