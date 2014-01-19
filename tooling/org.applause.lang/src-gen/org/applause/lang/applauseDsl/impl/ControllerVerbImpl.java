/**
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.ControllerVerb;
import org.applause.lang.applauseDsl.ControllerVerbKind;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.RESTMethodCall;

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
 * An implementation of the model object '<em><b>Controller Verb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ControllerVerbImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ControllerVerbImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ControllerVerbImpl#getDeclaredParameters <em>Declared Parameters</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ControllerVerbImpl#getRestMethod <em>Rest Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerVerbImpl extends MinimalEObjectImpl.Container implements ControllerVerb
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final ControllerVerbKind KIND_EDEFAULT = ControllerVerbKind.ADD;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected ControllerVerbKind kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeclaredParameters() <em>Declared Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> declaredParameters;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControllerVerbImpl()
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
    return ApplauseDslPackage.Literals.CONTROLLER_VERB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControllerVerbKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(ControllerVerbKind newKind)
  {
    ControllerVerbKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTROLLER_VERB__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTROLLER_VERB__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getDeclaredParameters()
  {
    if (declaredParameters == null)
    {
      declaredParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ApplauseDslPackage.CONTROLLER_VERB__DECLARED_PARAMETERS);
    }
    return declaredParameters;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTROLLER_VERB__REST_METHOD, oldRestMethod, newRestMethod);
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
        msgs = ((InternalEObject)restMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.CONTROLLER_VERB__REST_METHOD, null, msgs);
      if (newRestMethod != null)
        msgs = ((InternalEObject)newRestMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.CONTROLLER_VERB__REST_METHOD, null, msgs);
      msgs = basicSetRestMethod(newRestMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTROLLER_VERB__REST_METHOD, newRestMethod, newRestMethod));
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
      case ApplauseDslPackage.CONTROLLER_VERB__DECLARED_PARAMETERS:
        return ((InternalEList<?>)getDeclaredParameters()).basicRemove(otherEnd, msgs);
      case ApplauseDslPackage.CONTROLLER_VERB__REST_METHOD:
        return basicSetRestMethod(null, msgs);
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
      case ApplauseDslPackage.CONTROLLER_VERB__KIND:
        return getKind();
      case ApplauseDslPackage.CONTROLLER_VERB__NAME:
        return getName();
      case ApplauseDslPackage.CONTROLLER_VERB__DECLARED_PARAMETERS:
        return getDeclaredParameters();
      case ApplauseDslPackage.CONTROLLER_VERB__REST_METHOD:
        return getRestMethod();
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
      case ApplauseDslPackage.CONTROLLER_VERB__KIND:
        setKind((ControllerVerbKind)newValue);
        return;
      case ApplauseDslPackage.CONTROLLER_VERB__NAME:
        setName((String)newValue);
        return;
      case ApplauseDslPackage.CONTROLLER_VERB__DECLARED_PARAMETERS:
        getDeclaredParameters().clear();
        getDeclaredParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case ApplauseDslPackage.CONTROLLER_VERB__REST_METHOD:
        setRestMethod((RESTMethodCall)newValue);
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
      case ApplauseDslPackage.CONTROLLER_VERB__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case ApplauseDslPackage.CONTROLLER_VERB__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ApplauseDslPackage.CONTROLLER_VERB__DECLARED_PARAMETERS:
        getDeclaredParameters().clear();
        return;
      case ApplauseDslPackage.CONTROLLER_VERB__REST_METHOD:
        setRestMethod((RESTMethodCall)null);
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
      case ApplauseDslPackage.CONTROLLER_VERB__KIND:
        return kind != KIND_EDEFAULT;
      case ApplauseDslPackage.CONTROLLER_VERB__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ApplauseDslPackage.CONTROLLER_VERB__DECLARED_PARAMETERS:
        return declaredParameters != null && !declaredParameters.isEmpty();
      case ApplauseDslPackage.CONTROLLER_VERB__REST_METHOD:
        return restMethod != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (kind: ");
    result.append(kind);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ControllerVerbImpl
