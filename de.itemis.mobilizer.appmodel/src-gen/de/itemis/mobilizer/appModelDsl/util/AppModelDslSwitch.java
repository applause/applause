/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl.util;

import de.itemis.mobilizer.appModelDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage
 * @generated
 */
public class AppModelDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AppModelDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppModelDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AppModelDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AppModelDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.MODEL_ELEMENT:
      {
        ModelElement modelElement = (ModelElement)theEObject;
        T result = caseModelElement(modelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseModelElement(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.TYPE_DESCRIPTION:
      {
        TypeDescription typeDescription = (TypeDescription)theEObject;
        T result = caseTypeDescription(typeDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseVariableDeclaration(parameter);
        if (result == null) result = caseModelElement(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.OBJECT_REFERENCE:
      {
        ObjectReference objectReference = (ObjectReference)theEObject;
        T result = caseObjectReference(objectReference);
        if (result == null) result = caseExpression(objectReference);
        if (result == null) result = caseScalarExpression(objectReference);
        if (result == null) result = caseCollectionExpression(objectReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.SCALAR_EXPRESSION:
      {
        ScalarExpression scalarExpression = (ScalarExpression)theEObject;
        T result = caseScalarExpression(scalarExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.COLLECTION_EXPRESSION:
      {
        CollectionExpression collectionExpression = (CollectionExpression)theEObject;
        T result = caseCollectionExpression(collectionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = caseScalarExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.STRING_FUNCTION:
      {
        StringFunction stringFunction = (StringFunction)theEObject;
        T result = caseStringFunction(stringFunction);
        if (result == null) result = caseExpression(stringFunction);
        if (result == null) result = caseScalarExpression(stringFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.COLLECTION_LITERAL:
      {
        CollectionLiteral collectionLiteral = (CollectionLiteral)theEObject;
        T result = caseCollectionLiteral(collectionLiteral);
        if (result == null) result = caseExpression(collectionLiteral);
        if (result == null) result = caseCollectionExpression(collectionLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.COLLECTION_FUNCTION:
      {
        CollectionFunction collectionFunction = (CollectionFunction)theEObject;
        T result = caseCollectionFunction(collectionFunction);
        if (result == null) result = caseExpression(collectionFunction);
        if (result == null) result = caseCollectionExpression(collectionFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.TABBAR_BUTTON:
      {
        TabbarButton tabbarButton = (TabbarButton)theEObject;
        T result = caseTabbarButton(tabbarButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseModelElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.SIMPLE_TYPE:
      {
        SimpleType simpleType = (SimpleType)theEObject;
        T result = caseSimpleType(simpleType);
        if (result == null) result = caseType(simpleType);
        if (result == null) result = caseModelElement(simpleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseType(entity);
        if (result == null) result = caseModelElement(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = caseVariableDeclaration(property);
        if (result == null) result = caseModelElement(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.CONTENT_PROVIDER:
      {
        ContentProvider contentProvider = (ContentProvider)theEObject;
        T result = caseContentProvider(contentProvider);
        if (result == null) result = caseModelElement(contentProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.PROVIDER_CONSTRUCTION:
      {
        ProviderConstruction providerConstruction = (ProviderConstruction)theEObject;
        T result = caseProviderConstruction(providerConstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.VIEW:
      {
        View view = (View)theEObject;
        T result = caseView(view);
        if (result == null) result = caseModelElement(view);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.SECTIONED_VIEW:
      {
        SectionedView sectionedView = (SectionedView)theEObject;
        T result = caseSectionedView(sectionedView);
        if (result == null) result = caseView(sectionedView);
        if (result == null) result = caseModelElement(sectionedView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.TABLE_VIEW:
      {
        TableView tableView = (TableView)theEObject;
        T result = caseTableView(tableView);
        if (result == null) result = caseSectionedView(tableView);
        if (result == null) result = caseView(tableView);
        if (result == null) result = caseModelElement(tableView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.DETAILS_VIEW:
      {
        DetailsView detailsView = (DetailsView)theEObject;
        T result = caseDetailsView(detailsView);
        if (result == null) result = caseSectionedView(detailsView);
        if (result == null) result = caseView(detailsView);
        if (result == null) result = caseModelElement(detailsView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.CUSTOM_VIEW:
      {
        CustomView customView = (CustomView)theEObject;
        T result = caseCustomView(customView);
        if (result == null) result = caseView(customView);
        if (result == null) result = caseModelElement(customView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.VIEW_HEADER:
      {
        ViewHeader viewHeader = (ViewHeader)theEObject;
        T result = caseViewHeader(viewHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.VIEW_SECTION:
      {
        ViewSection viewSection = (ViewSection)theEObject;
        T result = caseViewSection(viewSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.SECTION_CELL:
      {
        SectionCell sectionCell = (SectionCell)theEObject;
        T result = caseSectionCell(sectionCell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.COLLECTION_ITERATOR:
      {
        CollectionIterator collectionIterator = (CollectionIterator)theEObject;
        T result = caseCollectionIterator(collectionIterator);
        if (result == null) result = caseVariableDeclaration(collectionIterator);
        if (result == null) result = caseModelElement(collectionIterator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.VIEW_ACTION:
      {
        ViewAction viewAction = (ViewAction)theEObject;
        T result = caseViewAction(viewAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.EXTERNAL_OPEN:
      {
        ExternalOpen externalOpen = (ExternalOpen)theEObject;
        T result = caseExternalOpen(externalOpen);
        if (result == null) result = caseViewAction(externalOpen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.VIEW_CALL:
      {
        ViewCall viewCall = (ViewCall)theEObject;
        T result = caseViewCall(viewCall);
        if (result == null) result = caseViewAction(viewCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.STRING_CONCAT:
      {
        StringConcat stringConcat = (StringConcat)theEObject;
        T result = caseStringConcat(stringConcat);
        if (result == null) result = caseStringFunction(stringConcat);
        if (result == null) result = caseExpression(stringConcat);
        if (result == null) result = caseScalarExpression(stringConcat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.STRING_REPLACE:
      {
        StringReplace stringReplace = (StringReplace)theEObject;
        T result = caseStringReplace(stringReplace);
        if (result == null) result = caseStringFunction(stringReplace);
        if (result == null) result = caseExpression(stringReplace);
        if (result == null) result = caseScalarExpression(stringReplace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.STRING_URL_CONFORM:
      {
        StringUrlConform stringUrlConform = (StringUrlConform)theEObject;
        T result = caseStringUrlConform(stringUrlConform);
        if (result == null) result = caseStringFunction(stringUrlConform);
        if (result == null) result = caseExpression(stringUrlConform);
        if (result == null) result = caseScalarExpression(stringUrlConform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.STRING_SPLIT:
      {
        StringSplit stringSplit = (StringSplit)theEObject;
        T result = caseStringSplit(stringSplit);
        if (result == null) result = caseCollectionFunction(stringSplit);
        if (result == null) result = caseExpression(stringSplit);
        if (result == null) result = caseCollectionExpression(stringSplit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseVariableDeclaration(constant);
        if (result == null) result = caseModelElement(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.COMPLEX_PROVIDER_CONSTRUCTION:
      {
        ComplexProviderConstruction complexProviderConstruction = (ComplexProviderConstruction)theEObject;
        T result = caseComplexProviderConstruction(complexProviderConstruction);
        if (result == null) result = caseProviderConstruction(complexProviderConstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppModelDslPackage.SIMPLE_PROVIDER_CONSTRUCTION:
      {
        SimpleProviderConstruction simpleProviderConstruction = (SimpleProviderConstruction)theEObject;
        T result = caseSimpleProviderConstruction(simpleProviderConstruction);
        if (result == null) result = caseProviderConstruction(simpleProviderConstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElement(ModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDescription(TypeDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectReference(ObjectReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scalar Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scalar Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScalarExpression(ScalarExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionExpression(CollectionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringFunction(StringFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionLiteral(CollectionLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionFunction(CollectionFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tabbar Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tabbar Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabbarButton(TabbarButton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleType(SimpleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContentProvider(ContentProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provider Construction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provider Construction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProviderConstruction(ProviderConstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseView(View object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sectioned View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sectioned View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSectionedView(SectionedView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableView(TableView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Details View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Details View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDetailsView(DetailsView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomView(CustomView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewHeader(ViewHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewSection(ViewSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section Cell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section Cell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSectionCell(SectionCell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Iterator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Iterator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionIterator(CollectionIterator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewAction(ViewAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Open</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Open</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalOpen(ExternalOpen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewCall(ViewCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Concat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Concat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConcat(StringConcat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Replace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Replace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringReplace(StringReplace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Url Conform</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Url Conform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringUrlConform(StringUrlConform object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Split</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Split</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringSplit(StringSplit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Provider Construction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Provider Construction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexProviderConstruction(ComplexProviderConstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Provider Construction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Provider Construction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleProviderConstruction(SimpleProviderConstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AppModelDslSwitch
