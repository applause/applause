/**
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplauseDslFactoryImpl extends EFactoryImpl implements ApplauseDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApplauseDslFactory init()
  {
    try
    {
      ApplauseDslFactory theApplauseDslFactory = (ApplauseDslFactory)EPackage.Registry.INSTANCE.getEFactory(ApplauseDslPackage.eNS_URI);
      if (theApplauseDslFactory != null)
      {
        return theApplauseDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ApplauseDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplauseDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ApplauseDslPackage.MODEL: return createModel();
      case ApplauseDslPackage.NAMED_ELEMENT: return createNamedElement();
      case ApplauseDslPackage.TYPE: return createType();
      case ApplauseDslPackage.DATA_TYPE: return createDataType();
      case ApplauseDslPackage.ENTITY: return createEntity();
      case ApplauseDslPackage.ATTRIBUTE: return createAttribute();
      case ApplauseDslPackage.PLATFORM: return createPlatform();
      case ApplauseDslPackage.PLATFORM_MAPPING: return createPlatformMapping();
      case ApplauseDslPackage.TYPE_MAPPING: return createTypeMapping();
      case ApplauseDslPackage.DATA_SOURCE: return createDataSource();
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD: return createDataSourceAccessMethod();
      case ApplauseDslPackage.REST_SPECIFICATION: return createRESTSpecification();
      case ApplauseDslPackage.DATA_SOURCE_BODY_SPECIFICATION: return createDataSourceBodySpecification();
      case ApplauseDslPackage.PARAMETER: return createParameter();
      case ApplauseDslPackage.RESTURL: return createRESTURL();
      case ApplauseDslPackage.ABSOLUTE_RESTURL: return createAbsoluteRESTURL();
      case ApplauseDslPackage.RELATIVE_RESTURL: return createRelativeRESTURL();
      case ApplauseDslPackage.URL_FRAGMENT: return createUrlFragment();
      case ApplauseDslPackage.URL_PATH_FRAGMENT: return createUrlPathFragment();
      case ApplauseDslPackage.VARIABLE: return createVariable();
      case ApplauseDslPackage.SCREEN: return createScreen();
      case ApplauseDslPackage.SCREEN_SECTION: return createScreenSection();
      case ApplauseDslPackage.SCREEN_SECTION_ITEMS: return createScreenSectionItems();
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL: return createScreenListItemCell();
      case ApplauseDslPackage.LIST_ITEM_CELL_DECLARATION: return createListItemCellDeclaration();
      case ApplauseDslPackage.UI_COMPONENT_DECLARATION: return createUIComponentDeclaration();
      case ApplauseDslPackage.UI_COMPONENT_MEMBER_DECLARATION: return createUIComponentMemberDeclaration();
      case ApplauseDslPackage.UI_COMPONENT_OR_DATA_TYPE: return createUIComponentOrDataType();
      case ApplauseDslPackage.REST_METHOD_CALL: return createRESTMethodCall();
      case ApplauseDslPackage.DATA_SOURCE_CALL: return createDataSourceCall();
      case ApplauseDslPackage.UI_COMPONENT_MEMBER_CONFIGURATION: return createUIComponentMemberConfiguration();
      case ApplauseDslPackage.UI_COMPONENT_MEMBER_CALL: return createUIComponentMemberCall();
      case ApplauseDslPackage.EXPRESSION: return createExpression();
      case ApplauseDslPackage.ENTITY_MEMBER_CALL: return createEntityMemberCall();
      case ApplauseDslPackage.ENTITY_MEMBER_CALL_TAIL: return createEntityMemberCallTail();
      case ApplauseDslPackage.ATTRIBUTE_REFERENCE: return createAttributeReference();
      case ApplauseDslPackage.STRING_LITERAL: return createStringLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ApplauseDslPackage.REST_VERB:
        return createRESTVerbFromString(eDataType, initialValue);
      case ApplauseDslPackage.SCREEN_KIND:
        return createScreenKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ApplauseDslPackage.REST_VERB:
        return convertRESTVerbToString(eDataType, instanceValue);
      case ApplauseDslPackage.SCREEN_KIND:
        return convertScreenKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement createNamedElement()
  {
    NamedElementImpl namedElement = new NamedElementImpl();
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Platform createPlatform()
  {
    PlatformImpl platform = new PlatformImpl();
    return platform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformMapping createPlatformMapping()
  {
    PlatformMappingImpl platformMapping = new PlatformMappingImpl();
    return platformMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeMapping createTypeMapping()
  {
    TypeMappingImpl typeMapping = new TypeMappingImpl();
    return typeMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSource createDataSource()
  {
    DataSourceImpl dataSource = new DataSourceImpl();
    return dataSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSourceAccessMethod createDataSourceAccessMethod()
  {
    DataSourceAccessMethodImpl dataSourceAccessMethod = new DataSourceAccessMethodImpl();
    return dataSourceAccessMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RESTSpecification createRESTSpecification()
  {
    RESTSpecificationImpl restSpecification = new RESTSpecificationImpl();
    return restSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSourceBodySpecification createDataSourceBodySpecification()
  {
    DataSourceBodySpecificationImpl dataSourceBodySpecification = new DataSourceBodySpecificationImpl();
    return dataSourceBodySpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RESTURL createRESTURL()
  {
    RESTURLImpl resturl = new RESTURLImpl();
    return resturl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsoluteRESTURL createAbsoluteRESTURL()
  {
    AbsoluteRESTURLImpl absoluteRESTURL = new AbsoluteRESTURLImpl();
    return absoluteRESTURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativeRESTURL createRelativeRESTURL()
  {
    RelativeRESTURLImpl relativeRESTURL = new RelativeRESTURLImpl();
    return relativeRESTURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UrlFragment createUrlFragment()
  {
    UrlFragmentImpl urlFragment = new UrlFragmentImpl();
    return urlFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UrlPathFragment createUrlPathFragment()
  {
    UrlPathFragmentImpl urlPathFragment = new UrlPathFragmentImpl();
    return urlPathFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Screen createScreen()
  {
    ScreenImpl screen = new ScreenImpl();
    return screen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenSection createScreenSection()
  {
    ScreenSectionImpl screenSection = new ScreenSectionImpl();
    return screenSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenSectionItems createScreenSectionItems()
  {
    ScreenSectionItemsImpl screenSectionItems = new ScreenSectionItemsImpl();
    return screenSectionItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenListItemCell createScreenListItemCell()
  {
    ScreenListItemCellImpl screenListItemCell = new ScreenListItemCellImpl();
    return screenListItemCell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListItemCellDeclaration createListItemCellDeclaration()
  {
    ListItemCellDeclarationImpl listItemCellDeclaration = new ListItemCellDeclarationImpl();
    return listItemCellDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIComponentDeclaration createUIComponentDeclaration()
  {
    UIComponentDeclarationImpl uiComponentDeclaration = new UIComponentDeclarationImpl();
    return uiComponentDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIComponentMemberDeclaration createUIComponentMemberDeclaration()
  {
    UIComponentMemberDeclarationImpl uiComponentMemberDeclaration = new UIComponentMemberDeclarationImpl();
    return uiComponentMemberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIComponentOrDataType createUIComponentOrDataType()
  {
    UIComponentOrDataTypeImpl uiComponentOrDataType = new UIComponentOrDataTypeImpl();
    return uiComponentOrDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RESTMethodCall createRESTMethodCall()
  {
    RESTMethodCallImpl restMethodCall = new RESTMethodCallImpl();
    return restMethodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSourceCall createDataSourceCall()
  {
    DataSourceCallImpl dataSourceCall = new DataSourceCallImpl();
    return dataSourceCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIComponentMemberConfiguration createUIComponentMemberConfiguration()
  {
    UIComponentMemberConfigurationImpl uiComponentMemberConfiguration = new UIComponentMemberConfigurationImpl();
    return uiComponentMemberConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIComponentMemberCall createUIComponentMemberCall()
  {
    UIComponentMemberCallImpl uiComponentMemberCall = new UIComponentMemberCallImpl();
    return uiComponentMemberCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityMemberCall createEntityMemberCall()
  {
    EntityMemberCallImpl entityMemberCall = new EntityMemberCallImpl();
    return entityMemberCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityMemberCallTail createEntityMemberCallTail()
  {
    EntityMemberCallTailImpl entityMemberCallTail = new EntityMemberCallTailImpl();
    return entityMemberCallTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeReference createAttributeReference()
  {
    AttributeReferenceImpl attributeReference = new AttributeReferenceImpl();
    return attributeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RESTVerb createRESTVerbFromString(EDataType eDataType, String initialValue)
  {
    RESTVerb result = RESTVerb.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRESTVerbToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenKind createScreenKindFromString(EDataType eDataType, String initialValue)
  {
    ScreenKind result = ScreenKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertScreenKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplauseDslPackage getApplauseDslPackage()
  {
    return (ApplauseDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ApplauseDslPackage getPackage()
  {
    return ApplauseDslPackage.eINSTANCE;
  }

} //ApplauseDslFactoryImpl
