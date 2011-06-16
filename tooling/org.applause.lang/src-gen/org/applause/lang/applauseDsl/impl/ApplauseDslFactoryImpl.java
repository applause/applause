/**
 * <copyright>
 * </copyright>
 *
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
      ApplauseDslFactory theApplauseDslFactory = (ApplauseDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.applause.org/lang/ApplauseDsl"); 
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
      case ApplauseDslPackage.APPLICATION: return createApplication();
      case ApplauseDslPackage.MODEL_ELEMENT: return createModelElement();
      case ApplauseDslPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case ApplauseDslPackage.TYPE_DESCRIPTION: return createTypeDescription();
      case ApplauseDslPackage.PARAMETER: return createParameter();
      case ApplauseDslPackage.OBJECT_REFERENCE: return createObjectReference();
      case ApplauseDslPackage.EXPRESSION: return createExpression();
      case ApplauseDslPackage.SCALAR_EXPRESSION: return createScalarExpression();
      case ApplauseDslPackage.COLLECTION_EXPRESSION: return createCollectionExpression();
      case ApplauseDslPackage.STRING_LITERAL: return createStringLiteral();
      case ApplauseDslPackage.STRING_FUNCTION: return createStringFunction();
      case ApplauseDslPackage.COLLECTION_LITERAL: return createCollectionLiteral();
      case ApplauseDslPackage.COLLECTION_FUNCTION: return createCollectionFunction();
      case ApplauseDslPackage.TABBAR_BUTTON: return createTabbarButton();
      case ApplauseDslPackage.TYPE: return createType();
      case ApplauseDslPackage.SIMPLE_TYPE: return createSimpleType();
      case ApplauseDslPackage.ENTITY: return createEntity();
      case ApplauseDslPackage.PROPERTY: return createProperty();
      case ApplauseDslPackage.CONTENT_PROVIDER: return createContentProvider();
      case ApplauseDslPackage.PROVIDER_CONSTRUCTION: return createProviderConstruction();
      case ApplauseDslPackage.VIEW: return createView();
      case ApplauseDslPackage.SECTIONED_VIEW: return createSectionedView();
      case ApplauseDslPackage.TABLE_VIEW: return createTableView();
      case ApplauseDslPackage.DETAILS_VIEW: return createDetailsView();
      case ApplauseDslPackage.CUSTOM_VIEW: return createCustomView();
      case ApplauseDslPackage.VIEW_HEADER: return createViewHeader();
      case ApplauseDslPackage.VIEW_SECTION: return createViewSection();
      case ApplauseDslPackage.SECTION_CELL: return createSectionCell();
      case ApplauseDslPackage.COLLECTION_ITERATOR: return createCollectionIterator();
      case ApplauseDslPackage.VIEW_ACTION: return createViewAction();
      case ApplauseDslPackage.EXTERNAL_OPEN: return createExternalOpen();
      case ApplauseDslPackage.VIEW_CALL: return createViewCall();
      case ApplauseDslPackage.STRING_CONCAT: return createStringConcat();
      case ApplauseDslPackage.STRING_REPLACE: return createStringReplace();
      case ApplauseDslPackage.STRING_URL_CONFORM: return createStringUrlConform();
      case ApplauseDslPackage.STRING_SPLIT: return createStringSplit();
      case ApplauseDslPackage.CONSTANT: return createConstant();
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION: return createComplexProviderConstruction();
      case ApplauseDslPackage.SIMPLE_PROVIDER_CONSTRUCTION: return createSimpleProviderConstruction();
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
      case ApplauseDslPackage.CELL_TYPE:
        return createCellTypeFromString(eDataType, initialValue);
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
      case ApplauseDslPackage.CELL_TYPE:
        return convertCellTypeToString(eDataType, instanceValue);
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
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement createModelElement()
  {
    ModelElementImpl modelElement = new ModelElementImpl();
    return modelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDescription createTypeDescription()
  {
    TypeDescriptionImpl typeDescription = new TypeDescriptionImpl();
    return typeDescription;
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
  public ObjectReference createObjectReference()
  {
    ObjectReferenceImpl objectReference = new ObjectReferenceImpl();
    return objectReference;
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
  public ScalarExpression createScalarExpression()
  {
    ScalarExpressionImpl scalarExpression = new ScalarExpressionImpl();
    return scalarExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionExpression createCollectionExpression()
  {
    CollectionExpressionImpl collectionExpression = new CollectionExpressionImpl();
    return collectionExpression;
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
  public StringFunction createStringFunction()
  {
    StringFunctionImpl stringFunction = new StringFunctionImpl();
    return stringFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionLiteral createCollectionLiteral()
  {
    CollectionLiteralImpl collectionLiteral = new CollectionLiteralImpl();
    return collectionLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionFunction createCollectionFunction()
  {
    CollectionFunctionImpl collectionFunction = new CollectionFunctionImpl();
    return collectionFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabbarButton createTabbarButton()
  {
    TabbarButtonImpl tabbarButton = new TabbarButtonImpl();
    return tabbarButton;
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
  public SimpleType createSimpleType()
  {
    SimpleTypeImpl simpleType = new SimpleTypeImpl();
    return simpleType;
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
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProvider createContentProvider()
  {
    ContentProviderImpl contentProvider = new ContentProviderImpl();
    return contentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProviderConstruction createProviderConstruction()
  {
    ProviderConstructionImpl providerConstruction = new ProviderConstructionImpl();
    return providerConstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View createView()
  {
    ViewImpl view = new ViewImpl();
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionedView createSectionedView()
  {
    SectionedViewImpl sectionedView = new SectionedViewImpl();
    return sectionedView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableView createTableView()
  {
    TableViewImpl tableView = new TableViewImpl();
    return tableView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DetailsView createDetailsView()
  {
    DetailsViewImpl detailsView = new DetailsViewImpl();
    return detailsView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomView createCustomView()
  {
    CustomViewImpl customView = new CustomViewImpl();
    return customView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewHeader createViewHeader()
  {
    ViewHeaderImpl viewHeader = new ViewHeaderImpl();
    return viewHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewSection createViewSection()
  {
    ViewSectionImpl viewSection = new ViewSectionImpl();
    return viewSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionCell createSectionCell()
  {
    SectionCellImpl sectionCell = new SectionCellImpl();
    return sectionCell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionIterator createCollectionIterator()
  {
    CollectionIteratorImpl collectionIterator = new CollectionIteratorImpl();
    return collectionIterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewAction createViewAction()
  {
    ViewActionImpl viewAction = new ViewActionImpl();
    return viewAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalOpen createExternalOpen()
  {
    ExternalOpenImpl externalOpen = new ExternalOpenImpl();
    return externalOpen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewCall createViewCall()
  {
    ViewCallImpl viewCall = new ViewCallImpl();
    return viewCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConcat createStringConcat()
  {
    StringConcatImpl stringConcat = new StringConcatImpl();
    return stringConcat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringReplace createStringReplace()
  {
    StringReplaceImpl stringReplace = new StringReplaceImpl();
    return stringReplace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringUrlConform createStringUrlConform()
  {
    StringUrlConformImpl stringUrlConform = new StringUrlConformImpl();
    return stringUrlConform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringSplit createStringSplit()
  {
    StringSplitImpl stringSplit = new StringSplitImpl();
    return stringSplit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexProviderConstruction createComplexProviderConstruction()
  {
    ComplexProviderConstructionImpl complexProviderConstruction = new ComplexProviderConstructionImpl();
    return complexProviderConstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleProviderConstruction createSimpleProviderConstruction()
  {
    SimpleProviderConstructionImpl simpleProviderConstruction = new SimpleProviderConstructionImpl();
    return simpleProviderConstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellType createCellTypeFromString(EDataType eDataType, String initialValue)
  {
    CellType result = CellType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCellTypeToString(EDataType eDataType, Object instanceValue)
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
