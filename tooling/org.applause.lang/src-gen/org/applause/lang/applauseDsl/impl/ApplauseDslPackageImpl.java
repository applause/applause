/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslFactory;
import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.Application;
import org.applause.lang.applauseDsl.CellType;
import org.applause.lang.applauseDsl.CollectionExpression;
import org.applause.lang.applauseDsl.CollectionFunction;
import org.applause.lang.applauseDsl.CollectionIterator;
import org.applause.lang.applauseDsl.CollectionLiteral;
import org.applause.lang.applauseDsl.ComplexProviderConstruction;
import org.applause.lang.applauseDsl.Constant;
import org.applause.lang.applauseDsl.ContentProvider;
import org.applause.lang.applauseDsl.CustomView;
import org.applause.lang.applauseDsl.DetailsView;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Expression;
import org.applause.lang.applauseDsl.ExternalOpen;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.ModelElement;
import org.applause.lang.applauseDsl.ObjectReference;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Property;
import org.applause.lang.applauseDsl.ProviderConstruction;
import org.applause.lang.applauseDsl.ScalarExpression;
import org.applause.lang.applauseDsl.SectionCell;
import org.applause.lang.applauseDsl.SectionedView;
import org.applause.lang.applauseDsl.SimpleProviderConstruction;
import org.applause.lang.applauseDsl.SimpleType;
import org.applause.lang.applauseDsl.StringConcat;
import org.applause.lang.applauseDsl.StringFunction;
import org.applause.lang.applauseDsl.StringLiteral;
import org.applause.lang.applauseDsl.StringReplace;
import org.applause.lang.applauseDsl.StringSplit;
import org.applause.lang.applauseDsl.StringUrlConform;
import org.applause.lang.applauseDsl.TabbarButton;
import org.applause.lang.applauseDsl.TableView;
import org.applause.lang.applauseDsl.Type;
import org.applause.lang.applauseDsl.TypeDescription;
import org.applause.lang.applauseDsl.VariableDeclaration;
import org.applause.lang.applauseDsl.View;
import org.applause.lang.applauseDsl.ViewAction;
import org.applause.lang.applauseDsl.ViewCall;
import org.applause.lang.applauseDsl.ViewHeader;
import org.applause.lang.applauseDsl.ViewSection;

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
  private EClass applicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDescriptionEClass = null;

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
  private EClass objectReferenceEClass = null;

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
  private EClass scalarExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionExpressionEClass = null;

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
  private EClass stringFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabbarButtonEClass = null;

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
  private EClass simpleTypeEClass = null;

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
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providerConstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionedViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass detailsViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionCellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionIteratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalOpenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringConcatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringReplaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringUrlConformEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringSplitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexProviderConstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleProviderConstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum cellTypeEEnum = null;

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
  public EReference getModel_Application()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplication()
  {
    return applicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_Name()
  {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_Splash()
  {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Buttons()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelElement()
  {
    return modelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelElement_Name()
  {
    return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDescription()
  {
    return typeDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDescription_Type()
  {
    return (EReference)typeDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeDescription_Many()
  {
    return (EAttribute)typeDescriptionEClass.getEStructuralFeatures().get(1);
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
  public EReference getParameter_Description()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectReference()
  {
    return objectReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectReference_Object()
  {
    return (EReference)objectReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectReference_Tail()
  {
    return (EReference)objectReferenceEClass.getEStructuralFeatures().get(1);
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
  public EClass getScalarExpression()
  {
    return scalarExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectionExpression()
  {
    return collectionExpressionEClass;
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
  public EClass getStringFunction()
  {
    return stringFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectionLiteral()
  {
    return collectionLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollectionLiteral_Items()
  {
    return (EReference)collectionLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectionFunction()
  {
    return collectionFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabbarButton()
  {
    return tabbarButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabbarButton_Title()
  {
    return (EReference)tabbarButtonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabbarButton_Icon()
  {
    return (EReference)tabbarButtonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabbarButton_View()
  {
    return (EReference)tabbarButtonEClass.getEStructuralFeatures().get(2);
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
  public EClass getSimpleType()
  {
    return simpleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleType_PlatformType()
  {
    return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(0);
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
  public EReference getEntity_Extends()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Properties()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Derived()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Description()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContentProvider()
  {
    return contentProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContentProvider_Parameter()
  {
    return (EReference)contentProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContentProvider_Resolver()
  {
    return (EAttribute)contentProviderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContentProvider_Type()
  {
    return (EReference)contentProviderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContentProvider_Many()
  {
    return (EAttribute)contentProviderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContentProvider_Url()
  {
    return (EReference)contentProviderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContentProvider_Selection()
  {
    return (EReference)contentProviderEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProviderConstruction()
  {
    return providerConstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getView()
  {
    return viewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getView_Content()
  {
    return (EReference)viewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSectionedView()
  {
    return sectionedViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionedView_Title()
  {
    return (EReference)sectionedViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionedView_Sections()
  {
    return (EReference)sectionedViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableView()
  {
    return tableViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDetailsView()
  {
    return detailsViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDetailsView_Header()
  {
    return (EReference)detailsViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomView()
  {
    return customViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomView_Objclass()
  {
    return (EAttribute)customViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewHeader()
  {
    return viewHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewHeader_Title()
  {
    return (EReference)viewHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewHeader_Subtitle()
  {
    return (EReference)viewHeaderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewHeader_Details()
  {
    return (EReference)viewHeaderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewHeader_Image()
  {
    return (EReference)viewHeaderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewSection()
  {
    return viewSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewSection_Title()
  {
    return (EReference)viewSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewSection_Cells()
  {
    return (EReference)viewSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSectionCell()
  {
    return sectionCellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionCell_Type()
  {
    return (EAttribute)sectionCellEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionCell_Iterator()
  {
    return (EReference)sectionCellEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionCell_Text()
  {
    return (EReference)sectionCellEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionCell_Details()
  {
    return (EReference)sectionCellEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionCell_Image()
  {
    return (EReference)sectionCellEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionCell_Action()
  {
    return (EReference)sectionCellEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectionIterator()
  {
    return collectionIteratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollectionIterator_Collection()
  {
    return (EReference)collectionIteratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewAction()
  {
    return viewActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalOpen()
  {
    return externalOpenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalOpen_Url()
  {
    return (EReference)externalOpenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewCall()
  {
    return viewCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewCall_View()
  {
    return (EReference)viewCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewCall_Provider()
  {
    return (EReference)viewCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringConcat()
  {
    return stringConcatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringConcat_Values()
  {
    return (EReference)stringConcatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringReplace()
  {
    return stringReplaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringReplace_Value()
  {
    return (EReference)stringReplaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringReplace_Match()
  {
    return (EReference)stringReplaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringReplace_Replacement()
  {
    return (EReference)stringReplaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringUrlConform()
  {
    return stringUrlConformEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringUrlConform_Value()
  {
    return (EReference)stringUrlConformEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringSplit()
  {
    return stringSplitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringSplit_Value()
  {
    return (EReference)stringSplitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringSplit_Delimiter()
  {
    return (EReference)stringSplitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_Value()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexProviderConstruction()
  {
    return complexProviderConstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexProviderConstruction_Provider()
  {
    return (EReference)complexProviderConstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexProviderConstruction_Argument()
  {
    return (EReference)complexProviderConstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleProviderConstruction()
  {
    return simpleProviderConstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleProviderConstruction_Expression()
  {
    return (EReference)simpleProviderConstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCellType()
  {
    return cellTypeEEnum;
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
    createEReference(modelEClass, MODEL__APPLICATION);
    createEReference(modelEClass, MODEL__ELEMENTS);

    applicationEClass = createEClass(APPLICATION);
    createEAttribute(applicationEClass, APPLICATION__NAME);
    createEAttribute(applicationEClass, APPLICATION__SPLASH);
    createEReference(applicationEClass, APPLICATION__BUTTONS);

    modelElementEClass = createEClass(MODEL_ELEMENT);
    createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);

    typeDescriptionEClass = createEClass(TYPE_DESCRIPTION);
    createEReference(typeDescriptionEClass, TYPE_DESCRIPTION__TYPE);
    createEAttribute(typeDescriptionEClass, TYPE_DESCRIPTION__MANY);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__DESCRIPTION);

    objectReferenceEClass = createEClass(OBJECT_REFERENCE);
    createEReference(objectReferenceEClass, OBJECT_REFERENCE__OBJECT);
    createEReference(objectReferenceEClass, OBJECT_REFERENCE__TAIL);

    expressionEClass = createEClass(EXPRESSION);

    scalarExpressionEClass = createEClass(SCALAR_EXPRESSION);

    collectionExpressionEClass = createEClass(COLLECTION_EXPRESSION);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    stringFunctionEClass = createEClass(STRING_FUNCTION);

    collectionLiteralEClass = createEClass(COLLECTION_LITERAL);
    createEReference(collectionLiteralEClass, COLLECTION_LITERAL__ITEMS);

    collectionFunctionEClass = createEClass(COLLECTION_FUNCTION);

    tabbarButtonEClass = createEClass(TABBAR_BUTTON);
    createEReference(tabbarButtonEClass, TABBAR_BUTTON__TITLE);
    createEReference(tabbarButtonEClass, TABBAR_BUTTON__ICON);
    createEReference(tabbarButtonEClass, TABBAR_BUTTON__VIEW);

    typeEClass = createEClass(TYPE);

    simpleTypeEClass = createEClass(SIMPLE_TYPE);
    createEAttribute(simpleTypeEClass, SIMPLE_TYPE__PLATFORM_TYPE);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__EXTENDS);
    createEReference(entityEClass, ENTITY__PROPERTIES);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__DERIVED);
    createEReference(propertyEClass, PROPERTY__DESCRIPTION);

    contentProviderEClass = createEClass(CONTENT_PROVIDER);
    createEReference(contentProviderEClass, CONTENT_PROVIDER__PARAMETER);
    createEAttribute(contentProviderEClass, CONTENT_PROVIDER__RESOLVER);
    createEReference(contentProviderEClass, CONTENT_PROVIDER__TYPE);
    createEAttribute(contentProviderEClass, CONTENT_PROVIDER__MANY);
    createEReference(contentProviderEClass, CONTENT_PROVIDER__URL);
    createEReference(contentProviderEClass, CONTENT_PROVIDER__SELECTION);

    providerConstructionEClass = createEClass(PROVIDER_CONSTRUCTION);

    viewEClass = createEClass(VIEW);
    createEReference(viewEClass, VIEW__CONTENT);

    sectionedViewEClass = createEClass(SECTIONED_VIEW);
    createEReference(sectionedViewEClass, SECTIONED_VIEW__TITLE);
    createEReference(sectionedViewEClass, SECTIONED_VIEW__SECTIONS);

    tableViewEClass = createEClass(TABLE_VIEW);

    detailsViewEClass = createEClass(DETAILS_VIEW);
    createEReference(detailsViewEClass, DETAILS_VIEW__HEADER);

    customViewEClass = createEClass(CUSTOM_VIEW);
    createEAttribute(customViewEClass, CUSTOM_VIEW__OBJCLASS);

    viewHeaderEClass = createEClass(VIEW_HEADER);
    createEReference(viewHeaderEClass, VIEW_HEADER__TITLE);
    createEReference(viewHeaderEClass, VIEW_HEADER__SUBTITLE);
    createEReference(viewHeaderEClass, VIEW_HEADER__DETAILS);
    createEReference(viewHeaderEClass, VIEW_HEADER__IMAGE);

    viewSectionEClass = createEClass(VIEW_SECTION);
    createEReference(viewSectionEClass, VIEW_SECTION__TITLE);
    createEReference(viewSectionEClass, VIEW_SECTION__CELLS);

    sectionCellEClass = createEClass(SECTION_CELL);
    createEAttribute(sectionCellEClass, SECTION_CELL__TYPE);
    createEReference(sectionCellEClass, SECTION_CELL__ITERATOR);
    createEReference(sectionCellEClass, SECTION_CELL__TEXT);
    createEReference(sectionCellEClass, SECTION_CELL__DETAILS);
    createEReference(sectionCellEClass, SECTION_CELL__IMAGE);
    createEReference(sectionCellEClass, SECTION_CELL__ACTION);

    collectionIteratorEClass = createEClass(COLLECTION_ITERATOR);
    createEReference(collectionIteratorEClass, COLLECTION_ITERATOR__COLLECTION);

    viewActionEClass = createEClass(VIEW_ACTION);

    externalOpenEClass = createEClass(EXTERNAL_OPEN);
    createEReference(externalOpenEClass, EXTERNAL_OPEN__URL);

    viewCallEClass = createEClass(VIEW_CALL);
    createEReference(viewCallEClass, VIEW_CALL__VIEW);
    createEReference(viewCallEClass, VIEW_CALL__PROVIDER);

    stringConcatEClass = createEClass(STRING_CONCAT);
    createEReference(stringConcatEClass, STRING_CONCAT__VALUES);

    stringReplaceEClass = createEClass(STRING_REPLACE);
    createEReference(stringReplaceEClass, STRING_REPLACE__VALUE);
    createEReference(stringReplaceEClass, STRING_REPLACE__MATCH);
    createEReference(stringReplaceEClass, STRING_REPLACE__REPLACEMENT);

    stringUrlConformEClass = createEClass(STRING_URL_CONFORM);
    createEReference(stringUrlConformEClass, STRING_URL_CONFORM__VALUE);

    stringSplitEClass = createEClass(STRING_SPLIT);
    createEReference(stringSplitEClass, STRING_SPLIT__VALUE);
    createEReference(stringSplitEClass, STRING_SPLIT__DELIMITER);

    constantEClass = createEClass(CONSTANT);
    createEReference(constantEClass, CONSTANT__VALUE);

    complexProviderConstructionEClass = createEClass(COMPLEX_PROVIDER_CONSTRUCTION);
    createEReference(complexProviderConstructionEClass, COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER);
    createEReference(complexProviderConstructionEClass, COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT);

    simpleProviderConstructionEClass = createEClass(SIMPLE_PROVIDER_CONSTRUCTION);
    createEReference(simpleProviderConstructionEClass, SIMPLE_PROVIDER_CONSTRUCTION__EXPRESSION);

    // Create enums
    cellTypeEEnum = createEEnum(CELL_TYPE);
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
    variableDeclarationEClass.getESuperTypes().add(this.getModelElement());
    parameterEClass.getESuperTypes().add(this.getVariableDeclaration());
    objectReferenceEClass.getESuperTypes().add(this.getExpression());
    objectReferenceEClass.getESuperTypes().add(this.getScalarExpression());
    objectReferenceEClass.getESuperTypes().add(this.getCollectionExpression());
    stringLiteralEClass.getESuperTypes().add(this.getExpression());
    stringLiteralEClass.getESuperTypes().add(this.getScalarExpression());
    stringFunctionEClass.getESuperTypes().add(this.getExpression());
    stringFunctionEClass.getESuperTypes().add(this.getScalarExpression());
    collectionLiteralEClass.getESuperTypes().add(this.getExpression());
    collectionLiteralEClass.getESuperTypes().add(this.getCollectionExpression());
    collectionFunctionEClass.getESuperTypes().add(this.getExpression());
    collectionFunctionEClass.getESuperTypes().add(this.getCollectionExpression());
    typeEClass.getESuperTypes().add(this.getModelElement());
    simpleTypeEClass.getESuperTypes().add(this.getType());
    entityEClass.getESuperTypes().add(this.getType());
    propertyEClass.getESuperTypes().add(this.getVariableDeclaration());
    contentProviderEClass.getESuperTypes().add(this.getModelElement());
    viewEClass.getESuperTypes().add(this.getModelElement());
    sectionedViewEClass.getESuperTypes().add(this.getView());
    tableViewEClass.getESuperTypes().add(this.getSectionedView());
    detailsViewEClass.getESuperTypes().add(this.getSectionedView());
    customViewEClass.getESuperTypes().add(this.getView());
    collectionIteratorEClass.getESuperTypes().add(this.getVariableDeclaration());
    externalOpenEClass.getESuperTypes().add(this.getViewAction());
    viewCallEClass.getESuperTypes().add(this.getViewAction());
    stringConcatEClass.getESuperTypes().add(this.getStringFunction());
    stringReplaceEClass.getESuperTypes().add(this.getStringFunction());
    stringUrlConformEClass.getESuperTypes().add(this.getStringFunction());
    stringSplitEClass.getESuperTypes().add(this.getCollectionFunction());
    constantEClass.getESuperTypes().add(this.getVariableDeclaration());
    complexProviderConstructionEClass.getESuperTypes().add(this.getProviderConstruction());
    simpleProviderConstructionEClass.getESuperTypes().add(this.getProviderConstruction());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Application(), this.getApplication(), null, "application", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Elements(), this.getModelElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplication_Splash(), ecorePackage.getEString(), "splash", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Buttons(), this.getTabbarButton(), null, "buttons", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeDescriptionEClass, TypeDescription.class, "TypeDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDescription_Type(), this.getType(), null, "type", null, 0, 1, TypeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeDescription_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, TypeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Description(), this.getTypeDescription(), null, "description", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectReferenceEClass, ObjectReference.class, "ObjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectReference_Object(), this.getVariableDeclaration(), null, "object", null, 0, 1, ObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectReference_Tail(), this.getObjectReference(), null, "tail", null, 0, 1, ObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scalarExpressionEClass, ScalarExpression.class, "ScalarExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionExpressionEClass, CollectionExpression.class, "CollectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringFunctionEClass, StringFunction.class, "StringFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionLiteralEClass, CollectionLiteral.class, "CollectionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollectionLiteral_Items(), this.getScalarExpression(), null, "items", null, 0, -1, CollectionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectionFunctionEClass, CollectionFunction.class, "CollectionFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tabbarButtonEClass, TabbarButton.class, "TabbarButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTabbarButton_Title(), this.getScalarExpression(), null, "title", null, 0, 1, TabbarButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTabbarButton_Icon(), this.getScalarExpression(), null, "icon", null, 0, 1, TabbarButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTabbarButton_View(), this.getViewCall(), null, "view", null, 0, 1, TabbarButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleType_PlatformType(), ecorePackage.getEString(), "platformType", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_Extends(), this.getEntity(), null, "extends", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Properties(), this.getProperty(), null, "properties", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Description(), this.getTypeDescription(), null, "description", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentProviderEClass, ContentProvider.class, "ContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContentProvider_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, ContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContentProvider_Resolver(), ecorePackage.getEBoolean(), "resolver", null, 0, 1, ContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContentProvider_Type(), this.getType(), null, "type", null, 0, 1, ContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContentProvider_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, ContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContentProvider_Url(), this.getScalarExpression(), null, "url", null, 0, 1, ContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContentProvider_Selection(), this.getScalarExpression(), null, "selection", null, 0, 1, ContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providerConstructionEClass, ProviderConstruction.class, "ProviderConstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getView_Content(), this.getParameter(), null, "content", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionedViewEClass, SectionedView.class, "SectionedView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSectionedView_Title(), this.getScalarExpression(), null, "title", null, 0, 1, SectionedView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSectionedView_Sections(), this.getViewSection(), null, "sections", null, 0, -1, SectionedView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableViewEClass, TableView.class, "TableView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(detailsViewEClass, DetailsView.class, "DetailsView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDetailsView_Header(), this.getViewHeader(), null, "header", null, 0, 1, DetailsView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customViewEClass, CustomView.class, "CustomView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomView_Objclass(), ecorePackage.getEString(), "objclass", null, 0, 1, CustomView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewHeaderEClass, ViewHeader.class, "ViewHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewHeader_Title(), this.getScalarExpression(), null, "title", null, 0, 1, ViewHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewHeader_Subtitle(), this.getScalarExpression(), null, "subtitle", null, 0, 1, ViewHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewHeader_Details(), this.getScalarExpression(), null, "details", null, 0, 1, ViewHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewHeader_Image(), this.getScalarExpression(), null, "image", null, 0, 1, ViewHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewSectionEClass, ViewSection.class, "ViewSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewSection_Title(), this.getScalarExpression(), null, "title", null, 0, 1, ViewSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewSection_Cells(), this.getSectionCell(), null, "cells", null, 0, -1, ViewSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionCellEClass, SectionCell.class, "SectionCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSectionCell_Type(), this.getCellType(), "type", null, 0, 1, SectionCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSectionCell_Iterator(), this.getCollectionIterator(), null, "iterator", null, 0, 1, SectionCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSectionCell_Text(), this.getScalarExpression(), null, "text", null, 0, 1, SectionCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSectionCell_Details(), this.getScalarExpression(), null, "details", null, 0, 1, SectionCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSectionCell_Image(), this.getScalarExpression(), null, "image", null, 0, 1, SectionCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSectionCell_Action(), this.getViewAction(), null, "action", null, 0, 1, SectionCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectionIteratorEClass, CollectionIterator.class, "CollectionIterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollectionIterator_Collection(), this.getCollectionExpression(), null, "collection", null, 0, 1, CollectionIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewActionEClass, ViewAction.class, "ViewAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalOpenEClass, ExternalOpen.class, "ExternalOpen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternalOpen_Url(), this.getScalarExpression(), null, "url", null, 0, 1, ExternalOpen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewCallEClass, ViewCall.class, "ViewCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewCall_View(), this.getView(), null, "view", null, 0, 1, ViewCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewCall_Provider(), this.getProviderConstruction(), null, "provider", null, 0, 1, ViewCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringConcatEClass, StringConcat.class, "StringConcat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringConcat_Values(), this.getScalarExpression(), null, "values", null, 0, -1, StringConcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringReplaceEClass, StringReplace.class, "StringReplace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringReplace_Value(), this.getScalarExpression(), null, "value", null, 0, 1, StringReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringReplace_Match(), this.getScalarExpression(), null, "match", null, 0, 1, StringReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringReplace_Replacement(), this.getScalarExpression(), null, "replacement", null, 0, 1, StringReplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringUrlConformEClass, StringUrlConform.class, "StringUrlConform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringUrlConform_Value(), this.getScalarExpression(), null, "value", null, 0, 1, StringUrlConform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringSplitEClass, StringSplit.class, "StringSplit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringSplit_Value(), this.getScalarExpression(), null, "value", null, 0, 1, StringSplit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringSplit_Delimiter(), this.getScalarExpression(), null, "delimiter", null, 0, 1, StringSplit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstant_Value(), this.getScalarExpression(), null, "value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexProviderConstructionEClass, ComplexProviderConstruction.class, "ComplexProviderConstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexProviderConstruction_Provider(), this.getContentProvider(), null, "provider", null, 0, 1, ComplexProviderConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexProviderConstruction_Argument(), this.getExpression(), null, "argument", null, 0, 1, ComplexProviderConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleProviderConstructionEClass, SimpleProviderConstruction.class, "SimpleProviderConstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleProviderConstruction_Expression(), this.getExpression(), null, "expression", null, 0, 1, SimpleProviderConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(cellTypeEEnum, CellType.class, "CellType");
    addEEnumLiteral(cellTypeEEnum, CellType.DEFAULT);
    addEEnumLiteral(cellTypeEEnum, CellType.DEFAULT_WITH_DISCLOSURE);
    addEEnumLiteral(cellTypeEEnum, CellType.VALUE2);
    addEEnumLiteral(cellTypeEEnum, CellType.DOUBLE);
    addEEnumLiteral(cellTypeEEnum, CellType.SUBTITLE);

    // Create resource
    createResource(eNS_URI);
  }

} //ApplauseDslPackageImpl
