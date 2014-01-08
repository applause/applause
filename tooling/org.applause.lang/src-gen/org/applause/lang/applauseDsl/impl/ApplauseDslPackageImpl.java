/**
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.AbsoluteRESTURL;
import org.applause.lang.applauseDsl.ApplauseDslFactory;
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
import org.applause.lang.applauseDsl.Expression;
import org.applause.lang.applauseDsl.ListItemCellDeclaration;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.NamedElement;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Platform;
import org.applause.lang.applauseDsl.PlatformMapping;
import org.applause.lang.applauseDsl.RESTMethodCall;
import org.applause.lang.applauseDsl.RESTSpecification;
import org.applause.lang.applauseDsl.RESTVerb;
import org.applause.lang.applauseDsl.RelativeRESTURL;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenKind;
import org.applause.lang.applauseDsl.ScreenListItemCell;
import org.applause.lang.applauseDsl.ScreenSection;
import org.applause.lang.applauseDsl.ScreenSectionItems;
import org.applause.lang.applauseDsl.StringLiteral;
import org.applause.lang.applauseDsl.Type;
import org.applause.lang.applauseDsl.TypeMapping;
import org.applause.lang.applauseDsl.UIComponentDeclaration;
import org.applause.lang.applauseDsl.UIComponentMemberCall;
import org.applause.lang.applauseDsl.UIComponentMemberConfiguration;
import org.applause.lang.applauseDsl.UIComponentMemberDeclaration;
import org.applause.lang.applauseDsl.UIComponentOrDataType;
import org.applause.lang.applauseDsl.UrlFragment;
import org.applause.lang.applauseDsl.UrlPathFragment;
import org.applause.lang.applauseDsl.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplauseDslPackageImpl extends EPackageImpl implements ApplauseDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass platformEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass platformMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataSourceAccessMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataSourceBodySpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resturlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass absoluteRESTURLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relativeRESTURLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlPathFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenSectionItemsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenListItemCellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listItemCellDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiComponentDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiComponentMemberDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiComponentOrDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restMethodCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataSourceCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiComponentMemberConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiComponentMemberCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityMemberCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityMemberCallTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum restVerbEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum screenKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ApplauseDslPackageImpl()
  {
    super(eNS_URI, ApplauseDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ApplauseDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ApplauseDslPackage init()
  {
    if (isInited) return (ApplauseDslPackage)EPackage.Registry.INSTANCE.getEPackage(ApplauseDslPackage.eNS_URI);

    // Obtain or create and register package
    ApplauseDslPackageImpl theApplauseDslPackage = (ApplauseDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApplauseDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApplauseDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theApplauseDslPackage.createPackageContents();

    // Initialize created meta-data
    theApplauseDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theApplauseDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ApplauseDslPackage.eNS_URI, theApplauseDslPackage);
    return theApplauseDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Abstract()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_SuperType()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Attributes()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Type()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Many()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlatform()
  {
    return platformEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlatform_Mappings()
  {
    return (EReference)platformEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlatformMapping()
  {
    return platformMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeMapping()
  {
    return typeMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeMapping_Type()
  {
    return (EReference)typeMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeMapping_SimpleName()
  {
    return (EAttribute)typeMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSource()
  {
    return dataSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSource_BaseUrl()
  {
    return (EReference)dataSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSource_ResourceType()
  {
    return (EReference)dataSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSource_Methods()
  {
    return (EReference)dataSourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSourceAccessMethod()
  {
    return dataSourceAccessMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataSourceAccessMethod_Name()
  {
    return (EAttribute)dataSourceAccessMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSourceAccessMethod_DeclaredParameters()
  {
    return (EReference)dataSourceAccessMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataSourceAccessMethod_ReturnsMany()
  {
    return (EAttribute)dataSourceAccessMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSourceAccessMethod_RestSpecification()
  {
    return (EReference)dataSourceAccessMethodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRESTSpecification()
  {
    return restSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRESTSpecification_Verb()
  {
    return (EAttribute)restSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRESTSpecification_Path()
  {
    return (EReference)restSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRESTSpecification_Body()
  {
    return (EReference)restSpecificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSourceBodySpecification()
  {
    return dataSourceBodySpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSourceBodySpecification_Bodycontents()
  {
    return (EReference)dataSourceBodySpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRESTURL()
  {
    return resturlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRESTURL_Fragments()
  {
    return (EReference)resturlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbsoluteRESTURL()
  {
    return absoluteRESTURLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbsoluteRESTURL_Host()
  {
    return (EReference)absoluteRESTURLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbsoluteRESTURL_Port()
  {
    return (EAttribute)absoluteRESTURLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelativeRESTURL()
  {
    return relativeRESTURLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUrlFragment()
  {
    return urlFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUrlPathFragment()
  {
    return urlPathFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUrlPathFragment_Name()
  {
    return (EAttribute)urlPathFragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_ParameterReference()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreen()
  {
    return screenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScreen_Kind()
  {
    return (EAttribute)screenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScreen_Title()
  {
    return (EAttribute)screenEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreen_Datasource()
  {
    return (EReference)screenEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreen_Sections()
  {
    return (EReference)screenEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreenSection()
  {
    return screenSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScreenSection_Title()
  {
    return (EAttribute)screenSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenSection_Datasource()
  {
    return (EReference)screenSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenSection_Items()
  {
    return (EReference)screenSectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreenSectionItems()
  {
    return screenSectionItemsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenSectionItems_Items()
  {
    return (EReference)screenSectionItemsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreenListItemCell()
  {
    return screenListItemCellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenListItemCell_Type()
  {
    return (EReference)screenListItemCellEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenListItemCell_RestMethod()
  {
    return (EReference)screenListItemCellEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScreenListItemCell_Variable()
  {
    return (EAttribute)screenListItemCellEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenListItemCell_Configurations()
  {
    return (EReference)screenListItemCellEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListItemCellDeclaration()
  {
    return listItemCellDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListItemCellDeclaration_Members()
  {
    return (EReference)listItemCellDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIComponentDeclaration()
  {
    return uiComponentDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIComponentDeclaration_Members()
  {
    return (EReference)uiComponentDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIComponentMemberDeclaration()
  {
    return uiComponentMemberDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIComponentMemberDeclaration_Type()
  {
    return (EReference)uiComponentMemberDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUIComponentMemberDeclaration_Name()
  {
    return (EAttribute)uiComponentMemberDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIComponentOrDataType()
  {
    return uiComponentOrDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRESTMethodCall()
  {
    return restMethodCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRESTMethodCall_Datasource()
  {
    return (EReference)restMethodCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRESTMethodCall_RestMethod()
  {
    return (EReference)restMethodCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSourceCall()
  {
    return dataSourceCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSourceCall_Datasource()
  {
    return (EReference)dataSourceCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataSourceCall_Name()
  {
    return (EAttribute)dataSourceCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIComponentMemberConfiguration()
  {
    return uiComponentMemberConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIComponentMemberConfiguration_Type()
  {
    return (EReference)uiComponentMemberConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIComponentMemberConfiguration_Value()
  {
    return (EReference)uiComponentMemberConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIComponentMemberCall()
  {
    return uiComponentMemberCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIComponentMemberCall_Component()
  {
    return (EReference)uiComponentMemberCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIComponentMemberCall_Member()
  {
    return (EReference)uiComponentMemberCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityMemberCall()
  {
    return entityMemberCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityMemberCall_Head()
  {
    return (EReference)entityMemberCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityMemberCall_Tail()
  {
    return (EReference)entityMemberCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityMemberCallTail()
  {
    return entityMemberCallTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityMemberCallTail_Head()
  {
    return (EReference)entityMemberCallTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityMemberCallTail_Tail()
  {
    return (EReference)entityMemberCallTailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeReference()
  {
    return attributeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeReference_Value()
  {
    return (EReference)attributeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRESTVerb()
  {
    return restVerbEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getScreenKind()
  {
    return screenKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplauseDslFactory getApplauseDslFactory()
  {
    return (ApplauseDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    typeEClass = createEClass(TYPE);

    dataTypeEClass = createEClass(DATA_TYPE);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__ABSTRACT);
    createEReference(entityEClass, ENTITY__SUPER_TYPE);
    createEReference(entityEClass, ENTITY__ATTRIBUTES);

    attributeEClass = createEClass(ATTRIBUTE);
    createEReference(attributeEClass, ATTRIBUTE__TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__MANY);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);

    platformEClass = createEClass(PLATFORM);
    createEReference(platformEClass, PLATFORM__MAPPINGS);

    platformMappingEClass = createEClass(PLATFORM_MAPPING);

    typeMappingEClass = createEClass(TYPE_MAPPING);
    createEReference(typeMappingEClass, TYPE_MAPPING__TYPE);
    createEAttribute(typeMappingEClass, TYPE_MAPPING__SIMPLE_NAME);

    dataSourceEClass = createEClass(DATA_SOURCE);
    createEReference(dataSourceEClass, DATA_SOURCE__BASE_URL);
    createEReference(dataSourceEClass, DATA_SOURCE__RESOURCE_TYPE);
    createEReference(dataSourceEClass, DATA_SOURCE__METHODS);

    dataSourceAccessMethodEClass = createEClass(DATA_SOURCE_ACCESS_METHOD);
    createEAttribute(dataSourceAccessMethodEClass, DATA_SOURCE_ACCESS_METHOD__NAME);
    createEReference(dataSourceAccessMethodEClass, DATA_SOURCE_ACCESS_METHOD__DECLARED_PARAMETERS);
    createEAttribute(dataSourceAccessMethodEClass, DATA_SOURCE_ACCESS_METHOD__RETURNS_MANY);
    createEReference(dataSourceAccessMethodEClass, DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION);

    restSpecificationEClass = createEClass(REST_SPECIFICATION);
    createEAttribute(restSpecificationEClass, REST_SPECIFICATION__VERB);
    createEReference(restSpecificationEClass, REST_SPECIFICATION__PATH);
    createEReference(restSpecificationEClass, REST_SPECIFICATION__BODY);

    dataSourceBodySpecificationEClass = createEClass(DATA_SOURCE_BODY_SPECIFICATION);
    createEReference(dataSourceBodySpecificationEClass, DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TYPE);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    resturlEClass = createEClass(RESTURL);
    createEReference(resturlEClass, RESTURL__FRAGMENTS);

    absoluteRESTURLEClass = createEClass(ABSOLUTE_RESTURL);
    createEReference(absoluteRESTURLEClass, ABSOLUTE_RESTURL__HOST);
    createEAttribute(absoluteRESTURLEClass, ABSOLUTE_RESTURL__PORT);

    relativeRESTURLEClass = createEClass(RELATIVE_RESTURL);

    urlFragmentEClass = createEClass(URL_FRAGMENT);

    urlPathFragmentEClass = createEClass(URL_PATH_FRAGMENT);
    createEAttribute(urlPathFragmentEClass, URL_PATH_FRAGMENT__NAME);

    variableEClass = createEClass(VARIABLE);
    createEReference(variableEClass, VARIABLE__PARAMETER_REFERENCE);

    screenEClass = createEClass(SCREEN);
    createEAttribute(screenEClass, SCREEN__KIND);
    createEAttribute(screenEClass, SCREEN__TITLE);
    createEReference(screenEClass, SCREEN__DATASOURCE);
    createEReference(screenEClass, SCREEN__SECTIONS);

    screenSectionEClass = createEClass(SCREEN_SECTION);
    createEAttribute(screenSectionEClass, SCREEN_SECTION__TITLE);
    createEReference(screenSectionEClass, SCREEN_SECTION__DATASOURCE);
    createEReference(screenSectionEClass, SCREEN_SECTION__ITEMS);

    screenSectionItemsEClass = createEClass(SCREEN_SECTION_ITEMS);
    createEReference(screenSectionItemsEClass, SCREEN_SECTION_ITEMS__ITEMS);

    screenListItemCellEClass = createEClass(SCREEN_LIST_ITEM_CELL);
    createEReference(screenListItemCellEClass, SCREEN_LIST_ITEM_CELL__TYPE);
    createEReference(screenListItemCellEClass, SCREEN_LIST_ITEM_CELL__REST_METHOD);
    createEAttribute(screenListItemCellEClass, SCREEN_LIST_ITEM_CELL__VARIABLE);
    createEReference(screenListItemCellEClass, SCREEN_LIST_ITEM_CELL__CONFIGURATIONS);

    listItemCellDeclarationEClass = createEClass(LIST_ITEM_CELL_DECLARATION);
    createEReference(listItemCellDeclarationEClass, LIST_ITEM_CELL_DECLARATION__MEMBERS);

    uiComponentDeclarationEClass = createEClass(UI_COMPONENT_DECLARATION);
    createEReference(uiComponentDeclarationEClass, UI_COMPONENT_DECLARATION__MEMBERS);

    uiComponentMemberDeclarationEClass = createEClass(UI_COMPONENT_MEMBER_DECLARATION);
    createEReference(uiComponentMemberDeclarationEClass, UI_COMPONENT_MEMBER_DECLARATION__TYPE);
    createEAttribute(uiComponentMemberDeclarationEClass, UI_COMPONENT_MEMBER_DECLARATION__NAME);

    uiComponentOrDataTypeEClass = createEClass(UI_COMPONENT_OR_DATA_TYPE);

    restMethodCallEClass = createEClass(REST_METHOD_CALL);
    createEReference(restMethodCallEClass, REST_METHOD_CALL__DATASOURCE);
    createEReference(restMethodCallEClass, REST_METHOD_CALL__REST_METHOD);

    dataSourceCallEClass = createEClass(DATA_SOURCE_CALL);
    createEReference(dataSourceCallEClass, DATA_SOURCE_CALL__DATASOURCE);
    createEAttribute(dataSourceCallEClass, DATA_SOURCE_CALL__NAME);

    uiComponentMemberConfigurationEClass = createEClass(UI_COMPONENT_MEMBER_CONFIGURATION);
    createEReference(uiComponentMemberConfigurationEClass, UI_COMPONENT_MEMBER_CONFIGURATION__TYPE);
    createEReference(uiComponentMemberConfigurationEClass, UI_COMPONENT_MEMBER_CONFIGURATION__VALUE);

    uiComponentMemberCallEClass = createEClass(UI_COMPONENT_MEMBER_CALL);
    createEReference(uiComponentMemberCallEClass, UI_COMPONENT_MEMBER_CALL__COMPONENT);
    createEReference(uiComponentMemberCallEClass, UI_COMPONENT_MEMBER_CALL__MEMBER);

    expressionEClass = createEClass(EXPRESSION);

    entityMemberCallEClass = createEClass(ENTITY_MEMBER_CALL);
    createEReference(entityMemberCallEClass, ENTITY_MEMBER_CALL__HEAD);
    createEReference(entityMemberCallEClass, ENTITY_MEMBER_CALL__TAIL);

    entityMemberCallTailEClass = createEClass(ENTITY_MEMBER_CALL_TAIL);
    createEReference(entityMemberCallTailEClass, ENTITY_MEMBER_CALL_TAIL__HEAD);
    createEReference(entityMemberCallTailEClass, ENTITY_MEMBER_CALL_TAIL__TAIL);

    attributeReferenceEClass = createEClass(ATTRIBUTE_REFERENCE);
    createEReference(attributeReferenceEClass, ATTRIBUTE_REFERENCE__VALUE);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    // Create enums
    restVerbEEnum = createEEnum(REST_VERB);
    screenKindEEnum = createEEnum(SCREEN_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    typeEClass.getESuperTypes().add(this.getNamedElement());
    dataTypeEClass.getESuperTypes().add(this.getType());
    dataTypeEClass.getESuperTypes().add(this.getUIComponentOrDataType());
    entityEClass.getESuperTypes().add(this.getType());
    platformEClass.getESuperTypes().add(this.getNamedElement());
    typeMappingEClass.getESuperTypes().add(this.getPlatformMapping());
    dataSourceEClass.getESuperTypes().add(this.getNamedElement());
    absoluteRESTURLEClass.getESuperTypes().add(this.getRESTURL());
    relativeRESTURLEClass.getESuperTypes().add(this.getRESTURL());
    urlPathFragmentEClass.getESuperTypes().add(this.getUrlFragment());
    variableEClass.getESuperTypes().add(this.getUrlFragment());
    screenEClass.getESuperTypes().add(this.getNamedElement());
    listItemCellDeclarationEClass.getESuperTypes().add(this.getNamedElement());
    uiComponentDeclarationEClass.getESuperTypes().add(this.getNamedElement());
    uiComponentDeclarationEClass.getESuperTypes().add(this.getUIComponentOrDataType());
    entityMemberCallEClass.getESuperTypes().add(this.getExpression());
    stringLiteralEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getNamedElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_SuperType(), this.getEntity(), null, "superType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribute_Type(), this.getType(), null, "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlatform_Mappings(), this.getPlatformMapping(), null, "mappings", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(platformMappingEClass, PlatformMapping.class, "PlatformMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeMappingEClass, TypeMapping.class, "TypeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeMapping_Type(), this.getDataType(), null, "type", null, 0, 1, TypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeMapping_SimpleName(), ecorePackage.getEString(), "simpleName", null, 0, 1, TypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataSource_BaseUrl(), this.getAbsoluteRESTURL(), null, "baseUrl", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataSource_ResourceType(), this.getEntity(), null, "resourceType", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataSource_Methods(), this.getDataSourceAccessMethod(), null, "methods", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataSourceAccessMethodEClass, DataSourceAccessMethod.class, "DataSourceAccessMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataSourceAccessMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataSourceAccessMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataSourceAccessMethod_DeclaredParameters(), this.getParameter(), null, "declaredParameters", null, 0, -1, DataSourceAccessMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataSourceAccessMethod_ReturnsMany(), ecorePackage.getEBoolean(), "returnsMany", null, 0, 1, DataSourceAccessMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataSourceAccessMethod_RestSpecification(), this.getRESTSpecification(), null, "restSpecification", null, 0, 1, DataSourceAccessMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restSpecificationEClass, RESTSpecification.class, "RESTSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRESTSpecification_Verb(), this.getRESTVerb(), "verb", null, 0, 1, RESTSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRESTSpecification_Path(), this.getRESTURL(), null, "path", null, 0, 1, RESTSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRESTSpecification_Body(), this.getDataSourceBodySpecification(), null, "body", null, 0, 1, RESTSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataSourceBodySpecificationEClass, DataSourceBodySpecification.class, "DataSourceBodySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataSourceBodySpecification_Bodycontents(), this.getParameter(), null, "bodycontents", null, 0, 1, DataSourceBodySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Type(), this.getType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resturlEClass, org.applause.lang.applauseDsl.RESTURL.class, "RESTURL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRESTURL_Fragments(), this.getUrlFragment(), null, "fragments", null, 0, -1, org.applause.lang.applauseDsl.RESTURL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(absoluteRESTURLEClass, AbsoluteRESTURL.class, "AbsoluteRESTURL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbsoluteRESTURL_Host(), this.getUrlFragment(), null, "host", null, 0, 1, AbsoluteRESTURL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbsoluteRESTURL_Port(), ecorePackage.getEInt(), "port", null, 0, 1, AbsoluteRESTURL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relativeRESTURLEClass, RelativeRESTURL.class, "RelativeRESTURL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(urlFragmentEClass, UrlFragment.class, "UrlFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(urlPathFragmentEClass, UrlPathFragment.class, "UrlPathFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUrlPathFragment_Name(), ecorePackage.getEString(), "name", null, 0, 1, UrlPathFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_ParameterReference(), this.getParameter(), null, "parameterReference", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenEClass, Screen.class, "Screen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScreen_Kind(), this.getScreenKind(), "kind", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScreen_Title(), ecorePackage.getEString(), "title", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScreen_Datasource(), this.getDataSourceCall(), null, "datasource", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScreen_Sections(), this.getScreenSection(), null, "sections", null, 0, -1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenSectionEClass, ScreenSection.class, "ScreenSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScreenSection_Title(), ecorePackage.getEString(), "title", null, 0, 1, ScreenSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScreenSection_Datasource(), this.getDataSourceCall(), null, "datasource", null, 0, 1, ScreenSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScreenSection_Items(), this.getScreenSectionItems(), null, "items", null, 0, 1, ScreenSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenSectionItemsEClass, ScreenSectionItems.class, "ScreenSectionItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScreenSectionItems_Items(), this.getScreenListItemCell(), null, "items", null, 0, -1, ScreenSectionItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenListItemCellEClass, ScreenListItemCell.class, "ScreenListItemCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScreenListItemCell_Type(), this.getListItemCellDeclaration(), null, "type", null, 0, 1, ScreenListItemCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScreenListItemCell_RestMethod(), this.getRESTMethodCall(), null, "restMethod", null, 0, 1, ScreenListItemCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScreenListItemCell_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ScreenListItemCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScreenListItemCell_Configurations(), this.getUIComponentMemberConfiguration(), null, "configurations", null, 0, -1, ScreenListItemCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listItemCellDeclarationEClass, ListItemCellDeclaration.class, "ListItemCellDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListItemCellDeclaration_Members(), this.getUIComponentMemberDeclaration(), null, "members", null, 0, -1, ListItemCellDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiComponentDeclarationEClass, UIComponentDeclaration.class, "UIComponentDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUIComponentDeclaration_Members(), this.getUIComponentMemberDeclaration(), null, "members", null, 0, -1, UIComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiComponentMemberDeclarationEClass, UIComponentMemberDeclaration.class, "UIComponentMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUIComponentMemberDeclaration_Type(), this.getUIComponentOrDataType(), null, "type", null, 0, 1, UIComponentMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUIComponentMemberDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, UIComponentMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiComponentOrDataTypeEClass, UIComponentOrDataType.class, "UIComponentOrDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(restMethodCallEClass, RESTMethodCall.class, "RESTMethodCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRESTMethodCall_Datasource(), this.getDataSourceCall(), null, "datasource", null, 0, 1, RESTMethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRESTMethodCall_RestMethod(), this.getDataSourceAccessMethod(), null, "restMethod", null, 0, 1, RESTMethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataSourceCallEClass, DataSourceCall.class, "DataSourceCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataSourceCall_Datasource(), this.getDataSource(), null, "datasource", null, 0, 1, DataSourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataSourceCall_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataSourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiComponentMemberConfigurationEClass, UIComponentMemberConfiguration.class, "UIComponentMemberConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUIComponentMemberConfiguration_Type(), this.getUIComponentMemberCall(), null, "type", null, 0, 1, UIComponentMemberConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIComponentMemberConfiguration_Value(), this.getExpression(), null, "value", null, 0, 1, UIComponentMemberConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiComponentMemberCallEClass, UIComponentMemberCall.class, "UIComponentMemberCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUIComponentMemberCall_Component(), this.getUIComponentMemberDeclaration(), null, "component", null, 0, 1, UIComponentMemberCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIComponentMemberCall_Member(), this.getUIComponentMemberDeclaration(), null, "member", null, 0, 1, UIComponentMemberCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityMemberCallEClass, EntityMemberCall.class, "EntityMemberCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityMemberCall_Head(), this.getAttribute(), null, "head", null, 0, 1, EntityMemberCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityMemberCall_Tail(), this.getEntityMemberCallTail(), null, "tail", null, 0, 1, EntityMemberCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityMemberCallTailEClass, EntityMemberCallTail.class, "EntityMemberCallTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityMemberCallTail_Head(), this.getAttribute(), null, "head", null, 0, 1, EntityMemberCallTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityMemberCallTail_Tail(), this.getEntityMemberCallTail(), null, "tail", null, 0, 1, EntityMemberCallTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeReferenceEClass, AttributeReference.class, "AttributeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeReference_Value(), this.getAttribute(), null, "value", null, 0, 1, AttributeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(restVerbEEnum, RESTVerb.class, "RESTVerb");
    addEEnumLiteral(restVerbEEnum, RESTVerb.GET);
    addEEnumLiteral(restVerbEEnum, RESTVerb.POST);
    addEEnumLiteral(restVerbEEnum, RESTVerb.PUT);
    addEEnumLiteral(restVerbEEnum, RESTVerb.DELETE);

    initEEnum(screenKindEEnum, ScreenKind.class, "ScreenKind");
    addEEnumLiteral(screenKindEEnum, ScreenKind.DEFAULT_LIST);
    addEEnumLiteral(screenKindEEnum, ScreenKind.DEFAULT_DETAILS);

    // Create resource
    createResource(eNS_URI);
  }

} //ApplauseDslPackageImpl
