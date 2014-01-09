/**
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.ReferrableElement;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.UIActionNavigateAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Action Navigate Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.UIActionNavigateActionImpl#getTargetScreen <em>Target Screen</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.UIActionNavigateActionImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIActionNavigateActionImpl extends UIActionSpecificationImpl implements UIActionNavigateAction
{
  /**
   * The cached value of the '{@link #getTargetScreen() <em>Target Screen</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetScreen()
   * @generated
   * @ordered
   */
  protected Screen targetScreen;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected ReferrableElement variable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UIActionNavigateActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApplauseDslPackage.Literals.UI_ACTION_NAVIGATE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Screen getTargetScreen()
  {
    if (targetScreen != null && targetScreen.eIsProxy())
    {
      InternalEObject oldTargetScreen = (InternalEObject)targetScreen;
      targetScreen = (Screen)eResolveProxy(oldTargetScreen);
      if (targetScreen != oldTargetScreen)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__TARGET_SCREEN, oldTargetScreen, targetScreen));
      }
    }
    return targetScreen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Screen basicGetTargetScreen()
  {
    return targetScreen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetScreen(Screen newTargetScreen)
  {
    Screen oldTargetScreen = targetScreen;
    targetScreen = newTargetScreen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__TARGET_SCREEN, oldTargetScreen, targetScreen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferrableElement getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (ReferrableElement)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferrableElement basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(ReferrableElement newVariable)
  {
    ReferrableElement oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__TARGET_SCREEN:
        if (resolve) return getTargetScreen();
        return basicGetTargetScreen();
      case ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__TARGET_SCREEN:
        setTargetScreen((Screen)newValue);
        return;
      case ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__VARIABLE:
        setVariable((ReferrableElement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__TARGET_SCREEN:
        setTargetScreen((Screen)null);
        return;
      case ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__VARIABLE:
        setVariable((ReferrableElement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__TARGET_SCREEN:
        return targetScreen != null;
      case ApplauseDslPackage.UI_ACTION_NAVIGATE_ACTION__VARIABLE:
        return variable != null;
    }
    return super.eIsSet(featureID);
  }

} //UIActionNavigateActionImpl
