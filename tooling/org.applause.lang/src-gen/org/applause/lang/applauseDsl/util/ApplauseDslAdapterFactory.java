/**
 * <copyright>
 * </copyright>
 *
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
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseModelElement(ModelElement object)
      {
        return createModelElementAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseTypeDescription(TypeDescription object)
      {
        return createTypeDescriptionAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseObjectReference(ObjectReference object)
      {
        return createObjectReferenceAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseScalarExpression(ScalarExpression object)
      {
        return createScalarExpressionAdapter();
      }
      @Override
      public Adapter caseCollectionExpression(CollectionExpression object)
      {
        return createCollectionExpressionAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseStringFunction(StringFunction object)
      {
        return createStringFunctionAdapter();
      }
      @Override
      public Adapter caseCollectionLiteral(CollectionLiteral object)
      {
        return createCollectionLiteralAdapter();
      }
      @Override
      public Adapter caseCollectionFunction(CollectionFunction object)
      {
        return createCollectionFunctionAdapter();
      }
      @Override
      public Adapter caseTabbarButton(TabbarButton object)
      {
        return createTabbarButtonAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseSimpleType(SimpleType object)
      {
        return createSimpleTypeAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseContentProvider(ContentProvider object)
      {
        return createContentProviderAdapter();
      }
      @Override
      public Adapter caseProviderConstruction(ProviderConstruction object)
      {
        return createProviderConstructionAdapter();
      }
      @Override
      public Adapter caseView(View object)
      {
        return createViewAdapter();
      }
      @Override
      public Adapter caseSectionedView(SectionedView object)
      {
        return createSectionedViewAdapter();
      }
      @Override
      public Adapter caseTableView(TableView object)
      {
        return createTableViewAdapter();
      }
      @Override
      public Adapter caseDetailsView(DetailsView object)
      {
        return createDetailsViewAdapter();
      }
      @Override
      public Adapter caseCustomView(CustomView object)
      {
        return createCustomViewAdapter();
      }
      @Override
      public Adapter caseViewHeader(ViewHeader object)
      {
        return createViewHeaderAdapter();
      }
      @Override
      public Adapter caseViewSection(ViewSection object)
      {
        return createViewSectionAdapter();
      }
      @Override
      public Adapter caseSectionCell(SectionCell object)
      {
        return createSectionCellAdapter();
      }
      @Override
      public Adapter caseCollectionFilter(CollectionFilter object)
      {
        return createCollectionFilterAdapter();
      }
      @Override
      public Adapter caseCollectionIterator(CollectionIterator object)
      {
        return createCollectionIteratorAdapter();
      }
      @Override
      public Adapter caseViewAction(ViewAction object)
      {
        return createViewActionAdapter();
      }
      @Override
      public Adapter caseExternalOpen(ExternalOpen object)
      {
        return createExternalOpenAdapter();
      }
      @Override
      public Adapter caseViewCall(ViewCall object)
      {
        return createViewCallAdapter();
      }
      @Override
      public Adapter caseStringConcat(StringConcat object)
      {
        return createStringConcatAdapter();
      }
      @Override
      public Adapter caseStringReplace(StringReplace object)
      {
        return createStringReplaceAdapter();
      }
      @Override
      public Adapter caseStringUrlConform(StringUrlConform object)
      {
        return createStringUrlConformAdapter();
      }
      @Override
      public Adapter caseStringSplit(StringSplit object)
      {
        return createStringSplitAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseComplexProviderConstruction(ComplexProviderConstruction object)
      {
        return createComplexProviderConstructionAdapter();
      }
      @Override
      public Adapter caseSimpleProviderConstruction(SimpleProviderConstruction object)
      {
        return createSimpleProviderConstructionAdapter();
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
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.TypeDescription <em>Type Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.TypeDescription
   * @generated
   */
  public Adapter createTypeDescriptionAdapter()
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
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ObjectReference <em>Object Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ObjectReference
   * @generated
   */
  public Adapter createObjectReferenceAdapter()
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
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ScalarExpression <em>Scalar Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ScalarExpression
   * @generated
   */
  public Adapter createScalarExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.CollectionExpression <em>Collection Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.CollectionExpression
   * @generated
   */
  public Adapter createCollectionExpressionAdapter()
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
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.StringFunction <em>String Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.StringFunction
   * @generated
   */
  public Adapter createStringFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.CollectionLiteral <em>Collection Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.CollectionLiteral
   * @generated
   */
  public Adapter createCollectionLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.CollectionFunction <em>Collection Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.CollectionFunction
   * @generated
   */
  public Adapter createCollectionFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.TabbarButton <em>Tabbar Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.TabbarButton
   * @generated
   */
  public Adapter createTabbarButtonAdapter()
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
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.SimpleType
   * @generated
   */
  public Adapter createSimpleTypeAdapter()
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
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ContentProvider
   * @generated
   */
  public Adapter createContentProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ProviderConstruction <em>Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ProviderConstruction
   * @generated
   */
  public Adapter createProviderConstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.View
   * @generated
   */
  public Adapter createViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.SectionedView <em>Sectioned View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.SectionedView
   * @generated
   */
  public Adapter createSectionedViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.TableView <em>Table View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.TableView
   * @generated
   */
  public Adapter createTableViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.DetailsView <em>Details View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.DetailsView
   * @generated
   */
  public Adapter createDetailsViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.CustomView <em>Custom View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.CustomView
   * @generated
   */
  public Adapter createCustomViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ViewHeader <em>View Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ViewHeader
   * @generated
   */
  public Adapter createViewHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ViewSection <em>View Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ViewSection
   * @generated
   */
  public Adapter createViewSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.SectionCell <em>Section Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.SectionCell
   * @generated
   */
  public Adapter createSectionCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.CollectionFilter <em>Collection Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.CollectionFilter
   * @generated
   */
  public Adapter createCollectionFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.CollectionIterator <em>Collection Iterator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.CollectionIterator
   * @generated
   */
  public Adapter createCollectionIteratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ViewAction <em>View Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ViewAction
   * @generated
   */
  public Adapter createViewActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ExternalOpen <em>External Open</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ExternalOpen
   * @generated
   */
  public Adapter createExternalOpenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ViewCall <em>View Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ViewCall
   * @generated
   */
  public Adapter createViewCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.StringConcat <em>String Concat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.StringConcat
   * @generated
   */
  public Adapter createStringConcatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.StringReplace <em>String Replace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.StringReplace
   * @generated
   */
  public Adapter createStringReplaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.StringUrlConform <em>String Url Conform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.StringUrlConform
   * @generated
   */
  public Adapter createStringUrlConformAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.StringSplit <em>String Split</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.StringSplit
   * @generated
   */
  public Adapter createStringSplitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.ComplexProviderConstruction <em>Complex Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.ComplexProviderConstruction
   * @generated
   */
  public Adapter createComplexProviderConstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.applause.lang.applauseDsl.SimpleProviderConstruction <em>Simple Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.applause.lang.applauseDsl.SimpleProviderConstruction
   * @generated
   */
  public Adapter createSimpleProviderConstructionAdapter()
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
