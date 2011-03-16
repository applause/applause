/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl.util;

import de.itemis.mobilizer.appModelDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage
 * @generated
 */
public class AppModelDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AppModelDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppModelDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AppModelDslPackage.eINSTANCE;
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
  protected AppModelDslSwitch<Adapter> modelSwitch =
    new AppModelDslSwitch<Adapter>()
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
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.TypeDescription <em>Type Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.TypeDescription
   * @generated
   */
  public Adapter createTypeDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ObjectReference <em>Object Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ObjectReference
   * @generated
   */
  public Adapter createObjectReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ScalarExpression <em>Scalar Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ScalarExpression
   * @generated
   */
  public Adapter createScalarExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.CollectionExpression <em>Collection Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.CollectionExpression
   * @generated
   */
  public Adapter createCollectionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.StringFunction <em>String Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.StringFunction
   * @generated
   */
  public Adapter createStringFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.CollectionLiteral <em>Collection Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.CollectionLiteral
   * @generated
   */
  public Adapter createCollectionLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.CollectionFunction <em>Collection Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.CollectionFunction
   * @generated
   */
  public Adapter createCollectionFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.TabbarButton <em>Tabbar Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.TabbarButton
   * @generated
   */
  public Adapter createTabbarButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.SimpleType
   * @generated
   */
  public Adapter createSimpleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ContentProvider
   * @generated
   */
  public Adapter createContentProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ProviderConstruction <em>Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ProviderConstruction
   * @generated
   */
  public Adapter createProviderConstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.View
   * @generated
   */
  public Adapter createViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.SectionedView <em>Sectioned View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.SectionedView
   * @generated
   */
  public Adapter createSectionedViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.TableView <em>Table View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.TableView
   * @generated
   */
  public Adapter createTableViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.DetailsView <em>Details View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.DetailsView
   * @generated
   */
  public Adapter createDetailsViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.CustomView <em>Custom View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.CustomView
   * @generated
   */
  public Adapter createCustomViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ViewHeader <em>View Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ViewHeader
   * @generated
   */
  public Adapter createViewHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ViewSection <em>View Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ViewSection
   * @generated
   */
  public Adapter createViewSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.SectionCell <em>Section Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.SectionCell
   * @generated
   */
  public Adapter createSectionCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.CollectionIterator <em>Collection Iterator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.CollectionIterator
   * @generated
   */
  public Adapter createCollectionIteratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ViewAction <em>View Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ViewAction
   * @generated
   */
  public Adapter createViewActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ExternalOpen <em>External Open</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ExternalOpen
   * @generated
   */
  public Adapter createExternalOpenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ViewCall <em>View Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ViewCall
   * @generated
   */
  public Adapter createViewCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.StringConcat <em>String Concat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.StringConcat
   * @generated
   */
  public Adapter createStringConcatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.StringReplace <em>String Replace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.StringReplace
   * @generated
   */
  public Adapter createStringReplaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.StringUrlConform <em>String Url Conform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.StringUrlConform
   * @generated
   */
  public Adapter createStringUrlConformAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.StringSplit <em>String Split</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.StringSplit
   * @generated
   */
  public Adapter createStringSplitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction <em>Complex Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction
   * @generated
   */
  public Adapter createComplexProviderConstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction <em>Simple Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction
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

} //AppModelDslAdapterFactory
