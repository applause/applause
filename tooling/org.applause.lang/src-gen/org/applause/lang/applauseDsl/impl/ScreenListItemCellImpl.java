/**
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.ListItemCellDeclaration;
import org.applause.lang.applauseDsl.LoopVariable;
import org.applause.lang.applauseDsl.RESTMethodCall;
import org.applause.lang.applauseDsl.ScreenListItemCell;
import org.applause.lang.applauseDsl.UIAction;
import org.applause.lang.applauseDsl.UIComponentMemberConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen List Item Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ScreenListItemCellImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ScreenListItemCellImpl#getRestMethod <em>Rest Method</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ScreenListItemCellImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ScreenListItemCellImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ScreenListItemCellImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScreenListItemCellImpl extends MinimalEObjectImpl.Container implements ScreenListItemCell
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ListItemCellDeclaration type;

  /**
   * The cached value of the '{@link #getRestMethod() <em>Rest Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestMethod()
   * @generated
   * @ordered
   */
  protected RESTMethodCall restMethod;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected LoopVariable variable;

  /**
   * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigurations()
   * @generated
   * @ordered
   */
  protected EList<UIComponentMemberConfiguration> configurations;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<UIAction> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScreenListItemCellImpl()
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
    return ApplauseDslPackage.Literals.SCREEN_LIST_ITEM_CELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListItemCellDeclaration getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (ListItemCellDeclaration)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListItemCellDeclaration basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ListItemCellDeclaration newType)
  {
    ListItemCellDeclaration oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RESTMethodCall getRestMethod()
  {
    return restMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRestMethod(RESTMethodCall newRestMethod, NotificationChain msgs)
  {
    RESTMethodCall oldRestMethod = restMethod;
    restMethod = newRestMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__REST_METHOD, oldRestMethod, newRestMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestMethod(RESTMethodCall newRestMethod)
  {
    if (newRestMethod != restMethod)
    {
      NotificationChain msgs = null;
      if (restMethod != null)
        msgs = ((InternalEObject)restMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__REST_METHOD, null, msgs);
      if (newRestMethod != null)
        msgs = ((InternalEObject)newRestMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__REST_METHOD, null, msgs);
      msgs = basicSetRestMethod(newRestMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__REST_METHOD, newRestMethod, newRestMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopVariable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(LoopVariable newVariable, NotificationChain msgs)
  {
    LoopVariable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(LoopVariable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UIComponentMemberConfiguration> getConfigurations()
  {
    if (configurations == null)
    {
      configurations = new EObjectContainmentEList<UIComponentMemberConfiguration>(UIComponentMemberConfiguration.class, this, ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__CONFIGURATIONS);
    }
    return configurations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UIAction> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<UIAction>(UIAction.class, this, ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__REST_METHOD:
        return basicSetRestMethod(null, msgs);
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__VARIABLE:
        return basicSetVariable(null, msgs);
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__CONFIGURATIONS:
        return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__REST_METHOD:
        return getRestMethod();
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__VARIABLE:
        return getVariable();
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__CONFIGURATIONS:
        return getConfigurations();
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__ACTIONS:
        return getActions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__TYPE:
        setType((ListItemCellDeclaration)newValue);
        return;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__REST_METHOD:
        setRestMethod((RESTMethodCall)newValue);
        return;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__VARIABLE:
        setVariable((LoopVariable)newValue);
        return;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__CONFIGURATIONS:
        getConfigurations().clear();
        getConfigurations().addAll((Collection<? extends UIComponentMemberConfiguration>)newValue);
        return;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends UIAction>)newValue);
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
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__TYPE:
        setType((ListItemCellDeclaration)null);
        return;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__REST_METHOD:
        setRestMethod((RESTMethodCall)null);
        return;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__VARIABLE:
        setVariable((LoopVariable)null);
        return;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__CONFIGURATIONS:
        getConfigurations().clear();
        return;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__ACTIONS:
        getActions().clear();
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
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__TYPE:
        return type != null;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__REST_METHOD:
        return restMethod != null;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__VARIABLE:
        return variable != null;
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__CONFIGURATIONS:
        return configurations != null && !configurations.isEmpty();
      case ApplauseDslPackage.SCREEN_LIST_ITEM_CELL__ACTIONS:
        return actions != null && !actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScreenListItemCellImpl
