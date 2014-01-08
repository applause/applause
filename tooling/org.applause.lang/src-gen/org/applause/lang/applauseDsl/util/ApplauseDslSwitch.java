/**
 */
package org.applause.lang.applauseDsl.util;

import org.applause.lang.applauseDsl.*;

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
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage
 * @generated
 */
public class ApplauseDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ApplauseDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplauseDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ApplauseDslPackage.eINSTANCE;
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
      case ApplauseDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseNamedElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = caseType(dataType);
        if (result == null) result = caseUIComponentOrDataType(dataType);
        if (result == null) result = caseNamedElement(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseType(entity);
        if (result == null) result = caseNamedElement(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.PLATFORM:
      {
        Platform platform = (Platform)theEObject;
        T result = casePlatform(platform);
        if (result == null) result = caseNamedElement(platform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.PLATFORM_MAPPING:
      {
        PlatformMapping platformMapping = (PlatformMapping)theEObject;
        T result = casePlatformMapping(platformMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.TYPE_MAPPING:
      {
        TypeMapping typeMapping = (TypeMapping)theEObject;
        T result = caseTypeMapping(typeMapping);
        if (result == null) result = casePlatformMapping(typeMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.DATA_SOURCE:
      {
        DataSource dataSource = (DataSource)theEObject;
        T result = caseDataSource(dataSource);
        if (result == null) result = caseNamedElement(dataSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD:
      {
        DataSourceAccessMethod dataSourceAccessMethod = (DataSourceAccessMethod)theEObject;
        T result = caseDataSourceAccessMethod(dataSourceAccessMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.REST_SPECIFICATION:
      {
        RESTSpecification restSpecification = (RESTSpecification)theEObject;
        T result = caseRESTSpecification(restSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.DATA_SOURCE_BODY_SPECIFICATION:
      {
        DataSourceBodySpecification dataSourceBodySpecification = (DataSourceBodySpecification)theEObject;
        T result = caseDataSourceBodySpecification(dataSourceBodySpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.RESTURL:
      {
        RESTURL resturl = (RESTURL)theEObject;
        T result = caseRESTURL(resturl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.ABSOLUTE_RESTURL:
      {
        AbsoluteRESTURL absoluteRESTURL = (AbsoluteRESTURL)theEObject;
        T result = caseAbsoluteRESTURL(absoluteRESTURL);
        if (result == null) result = caseRESTURL(absoluteRESTURL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.RELATIVE_RESTURL:
      {
        RelativeRESTURL relativeRESTURL = (RelativeRESTURL)theEObject;
        T result = caseRelativeRESTURL(relativeRESTURL);
        if (result == null) result = caseRESTURL(relativeRESTURL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.URL_FRAGMENT:
      {
        UrlFragment urlFragment = (UrlFragment)theEObject;
        T result = caseUrlFragment(urlFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.URL_PATH_FRAGMENT:
      {
        UrlPathFragment urlPathFragment = (UrlPathFragment)theEObject;
        T result = caseUrlPathFragment(urlPathFragment);
        if (result == null) result = caseUrlFragment(urlPathFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseUrlFragment(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.SCREEN:
      {
        Screen screen = (Screen)theEObject;
        T result = caseScreen(screen);
        if (result == null) result = caseNamedElement(screen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.SCREEN_SECTION:
      {
        ScreenSection screenSection = (ScreenSection)theEObject;
        T result = caseScreenSection(screenSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.SCREEN_SECTION_ITEMS:
      {
        ScreenSectionItems screenSectionItems = (ScreenSectionItems)theEObject;
        T result = caseScreenSectionItems(screenSectionItems);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL:
      {
        ScreenListItemCell screenListItemCell = (ScreenListItemCell)theEObject;
        T result = caseScreenListItemCell(screenListItemCell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.LIST_ITEM_CELL_DECLARATION:
      {
        ListItemCellDeclaration listItemCellDeclaration = (ListItemCellDeclaration)theEObject;
        T result = caseListItemCellDeclaration(listItemCellDeclaration);
        if (result == null) result = caseNamedElement(listItemCellDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.UI_COMPONENT_DECLARATION:
      {
        UIComponentDeclaration uiComponentDeclaration = (UIComponentDeclaration)theEObject;
        T result = caseUIComponentDeclaration(uiComponentDeclaration);
        if (result == null) result = caseNamedElement(uiComponentDeclaration);
        if (result == null) result = caseUIComponentOrDataType(uiComponentDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.UI_COMPONENT_MEMBER_DECLARATION:
      {
        UIComponentMemberDeclaration uiComponentMemberDeclaration = (UIComponentMemberDeclaration)theEObject;
        T result = caseUIComponentMemberDeclaration(uiComponentMemberDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.UI_COMPONENT_OR_DATA_TYPE:
      {
        UIComponentOrDataType uiComponentOrDataType = (UIComponentOrDataType)theEObject;
        T result = caseUIComponentOrDataType(uiComponentOrDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.REST_METHOD_CALL:
      {
        RESTMethodCall restMethodCall = (RESTMethodCall)theEObject;
        T result = caseRESTMethodCall(restMethodCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.DATA_SOURCE_CALL:
      {
        DataSourceCall dataSourceCall = (DataSourceCall)theEObject;
        T result = caseDataSourceCall(dataSourceCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.UI_COMPONENT_MEMBER_CONFIGURATION:
      {
        UIComponentMemberConfiguration uiComponentMemberConfiguration = (UIComponentMemberConfiguration)theEObject;
        T result = caseUIComponentMemberConfiguration(uiComponentMemberConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.UI_COMPONENT_MEMBER_CALL:
      {
        UIComponentMemberCall uiComponentMemberCall = (UIComponentMemberCall)theEObject;
        T result = caseUIComponentMemberCall(uiComponentMemberCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.ENTITY_MEMBER_CALL:
      {
        EntityMemberCall entityMemberCall = (EntityMemberCall)theEObject;
        T result = caseEntityMemberCall(entityMemberCall);
        if (result == null) result = caseExpression(entityMemberCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.ENTITY_MEMBER_CALL_TAIL:
      {
        EntityMemberCallTail entityMemberCallTail = (EntityMemberCallTail)theEObject;
        T result = caseEntityMemberCallTail(entityMemberCallTail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.ATTRIBUTE_REFERENCE:
      {
        AttributeReference attributeReference = (AttributeReference)theEObject;
        T result = caseAttributeReference(attributeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
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
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlatform(Platform object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Platform Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Platform Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlatformMapping(PlatformMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeMapping(TypeMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSource(DataSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Source Access Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Source Access Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSourceAccessMethod(DataSourceAccessMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>REST Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>REST Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRESTSpecification(RESTSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Source Body Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Source Body Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSourceBodySpecification(DataSourceBodySpecification object)
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
   * Returns the result of interpreting the object as an instance of '<em>RESTURL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RESTURL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRESTURL(RESTURL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Absolute RESTURL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Absolute RESTURL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbsoluteRESTURL(AbsoluteRESTURL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relative RESTURL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relative RESTURL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelativeRESTURL(RelativeRESTURL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Url Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Url Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUrlFragment(UrlFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Url Path Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Url Path Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUrlPathFragment(UrlPathFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreen(Screen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreenSection(ScreenSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen Section Items</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen Section Items</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreenSectionItems(ScreenSectionItems object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen List Item Cell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen List Item Cell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreenListItemCell(ScreenListItemCell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Item Cell Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Item Cell Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListItemCellDeclaration(ListItemCellDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Component Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Component Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIComponentDeclaration(UIComponentDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Component Member Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Component Member Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIComponentMemberDeclaration(UIComponentMemberDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Component Or Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Component Or Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIComponentOrDataType(UIComponentOrDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>REST Method Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>REST Method Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRESTMethodCall(RESTMethodCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Source Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Source Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSourceCall(DataSourceCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Component Member Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Component Member Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIComponentMemberConfiguration(UIComponentMemberConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Component Member Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Component Member Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIComponentMemberCall(UIComponentMemberCall object)
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
   * Returns the result of interpreting the object as an instance of '<em>Entity Member Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Member Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityMemberCall(EntityMemberCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Member Call Tail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Member Call Tail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityMemberCallTail(EntityMemberCallTail object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeReference(AttributeReference object)
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

} //ApplauseDslSwitch
