/**
 */
package org.applause.lang.applauseDsl.util;

import org.applause.lang.applauseDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage
 * @generated
 */
public class ApplauseDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ApplauseDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplauseDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ApplauseDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplauseDslSwitch<Adapter> modelSwitch =
    new ApplauseDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter casePlatform(Platform object)
      {
        return createPlatformAdapter();
      }
      @Override
      public Adapter casePlatformMapping(PlatformMapping object)
      {
        return createPlatformMappingAdapter();
      }
      @Override
      public Adapter caseTypeMapping(TypeMapping object)
      {
        return createTypeMappingAdapter();
      }
      @Override
      public Adapter caseDataSource(DataSource object)
      {
        return createDataSourceAdapter();
      }
      @Override
      public Adapter caseDataSourceAccessMethod(DataSourceAccessMethod object)
      {
        return createDataSourceAccessMethodAdapter();
      }
      @Override
      public Adapter caseRESTSpecification(RESTSpecification object)
      {
        return createRESTSpecificationAdapter();
      }
      @Override
      public Adapter caseDataSourceBodySpecification(DataSourceBodySpecification object)
      {
        return createDataSourceBodySpecificationAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseRESTURL(RESTURL object)
      {
        return createRESTURLAdapter();
      }
      @Override
      public Adapter caseAbsoluteRESTURL(AbsoluteRESTURL object)
      {
        return createAbsoluteRESTURLAdapter();
      }
      @Override
      public Adapter caseRelativeRESTURL(RelativeRESTURL object)
      {
        return createRelativeRESTURLAdapter();
      }
      @Override
      public Adapter caseUrlFragment(UrlFragment object)
      {
        return createUrlFragmentAdapter();
      }
      @Override
      public Adapter caseUrlPathFragment(UrlPathFragment object)
      {
        return createUrlPathFragmentAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseScreen(Screen object)
      {
        return createScreenAdapter();
      }
      @Override
      public Adapter caseScreenSection(ScreenSection object)
      {
        return createScreenSectionAdapter();
      }
      @Override
      public Adapter caseScreenSectionItems(ScreenSectionItems object)
      {
        return createScreenSectionItemsAdapter();
      }
      @Override
      public Adapter caseScreenListItemCell(ScreenListItemCell object)
      {
        return createScreenListItemCellAdapter();
      }
      @Override
      public Adapter caseListItemCellDeclaration(ListItemCellDeclaration object)
      {
        return createListItemCellDeclarationAdapter();
      }
      @Override
      public Adapter caseUIComponentDeclaration(UIComponentDeclaration object)
      {
        return createUIComponentDeclarationAdapter();
      }
      @Override
      public Adapter caseUIComponentMemberDeclaration(UIComponentMemberDeclaration object)
      {
        return createUIComponentMemberDeclarationAdapter();
      }
      @Override
      public Adapter caseUIComponentOrDataType(UIComponentOrDataType object)
      {
        return createUIComponentOrDataTypeAdapter();
      }
      @Override
      public Adapter caseRESTMethodCall(RESTMethodCall object)
      {
        return createRESTMethodCallAdapter();
      }
      @Override
      public Adapter caseDataSourceCall(DataSourceCall object)
      {
        return createDataSourceCallAdapter();
      }
      @Override
      public Adapter caseUIComponentMemberConfiguration(UIComponentMemberConfiguration object)
      {
        return createUIComponentMemberConfigurationAdapter();
      }
      @Override
      public Adapter caseUIComponentMemberCall(UIComponentMemberCall object)
      {
        return createUIComponentMemberCallAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseEntityMemberCall(EntityMemberCall object)
      {
        return createEntityMemberCallAdapter();
      }
      @Override
      public Adapter caseEntityMemberCallTail(EntityMemberCallTail object)
      {
        return createEntityMemberCallTailAdapter();
      }
      @Override
      public Adapter caseAttributeReference(AttributeReference object)
      {
        return createAttributeReferenceAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Platform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Platform
   * @generated
   */
  public Adapter createPlatformAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.PlatformMapping <em>Platform Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.PlatformMapping
   * @generated
   */
  public Adapter createPlatformMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.TypeMapping <em>Type Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.TypeMapping
   * @generated
   */
  public Adapter createTypeMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.DataSource <em>Data Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.DataSource
   * @generated
   */
  public Adapter createDataSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.DataSourceAccessMethod <em>Data Source Access Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.DataSourceAccessMethod
   * @generated
   */
  public Adapter createDataSourceAccessMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.RESTSpecification <em>REST Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.RESTSpecification
   * @generated
   */
  public Adapter createRESTSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.DataSourceBodySpecification <em>Data Source Body Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.DataSourceBodySpecification
   * @generated
   */
  public Adapter createDataSourceBodySpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.RESTURL <em>RESTURL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.RESTURL
   * @generated
   */
  public Adapter createRESTURLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.AbsoluteRESTURL <em>Absolute RESTURL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.AbsoluteRESTURL
   * @generated
   */
  public Adapter createAbsoluteRESTURLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.RelativeRESTURL <em>Relative RESTURL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.RelativeRESTURL
   * @generated
   */
  public Adapter createRelativeRESTURLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.UrlFragment <em>Url Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.UrlFragment
   * @generated
   */
  public Adapter createUrlFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.UrlPathFragment <em>Url Path Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.UrlPathFragment
   * @generated
   */
  public Adapter createUrlPathFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Screen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Screen
   * @generated
   */
  public Adapter createScreenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ScreenSection <em>Screen Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ScreenSection
   * @generated
   */
  public Adapter createScreenSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ScreenSectionItems <em>Screen Section Items</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ScreenSectionItems
   * @generated
   */
  public Adapter createScreenSectionItemsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ScreenListItemCell <em>Screen List Item Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ScreenListItemCell
   * @generated
   */
  public Adapter createScreenListItemCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ListItemCellDeclaration <em>List Item Cell Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ListItemCellDeclaration
   * @generated
   */
  public Adapter createListItemCellDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.UIComponentDeclaration <em>UI Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.UIComponentDeclaration
   * @generated
   */
  public Adapter createUIComponentDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.UIComponentMemberDeclaration <em>UI Component Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.UIComponentMemberDeclaration
   * @generated
   */
  public Adapter createUIComponentMemberDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.UIComponentOrDataType <em>UI Component Or Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.UIComponentOrDataType
   * @generated
   */
  public Adapter createUIComponentOrDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.RESTMethodCall <em>REST Method Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.RESTMethodCall
   * @generated
   */
  public Adapter createRESTMethodCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.DataSourceCall <em>Data Source Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.DataSourceCall
   * @generated
   */
  public Adapter createDataSourceCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.UIComponentMemberConfiguration <em>UI Component Member Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.UIComponentMemberConfiguration
   * @generated
   */
  public Adapter createUIComponentMemberConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.UIComponentMemberCall <em>UI Component Member Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.UIComponentMemberCall
   * @generated
   */
  public Adapter createUIComponentMemberCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.EntityMemberCall <em>Entity Member Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.EntityMemberCall
   * @generated
   */
  public Adapter createEntityMemberCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.EntityMemberCallTail <em>Entity Member Call Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.EntityMemberCallTail
   * @generated
   */
  public Adapter createEntityMemberCallTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.AttributeReference <em>Attribute Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.AttributeReference
   * @generated
   */
  public Adapter createAttributeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ApplauseDslAdapterFactory
