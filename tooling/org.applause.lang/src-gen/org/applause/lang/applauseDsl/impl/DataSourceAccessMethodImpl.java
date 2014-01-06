/**
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.RESTSpecification;

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
 * An implementation of the model object '<em><b>Data Source Access Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.DataSourceAccessMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.DataSourceAccessMethodImpl#getDeclaredParameters <em>Declared Parameters</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.DataSourceAccessMethodImpl#isReturnsMany <em>Returns Many</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.DataSourceAccessMethodImpl#getRestSpecification <em>Rest Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSourceAccessMethodImpl extends MinimalEObjectImpl.Container implements DataSourceAccessMethod
{
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
   * The default value of the '{@link #isReturnsMany() <em>Returns Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReturnsMany()
   * @generated
   * @ordered
   */
  protected static final boolean RETURNS_MANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReturnsMany() <em>Returns Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReturnsMany()
   * @generated
   * @ordered
   */
  protected boolean returnsMany = RETURNS_MANY_EDEFAULT;

  /**
   * The cached value of the '{@link #getRestSpecification() <em>Rest Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestSpecification()
   * @generated
   * @ordered
   */
  protected RESTSpecification restSpecification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataSourceAccessMethodImpl()
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
    return ApplauseDslPackage.Literals.DATA_SOURCE_ACCESS_METHOD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__NAME, oldName, name));
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
      declaredParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__DECLARED_PARAMETERS);
    }
    return declaredParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReturnsMany()
  {
    return returnsMany;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnsMany(boolean newReturnsMany)
  {
    boolean oldReturnsMany = returnsMany;
    returnsMany = newReturnsMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__RETURNS_MANY, oldReturnsMany, returnsMany));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RESTSpecification getRestSpecification()
  {
    return restSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRestSpecification(RESTSpecification newRestSpecification, NotificationChain msgs)
  {
    RESTSpecification oldRestSpecification = restSpecification;
    restSpecification = newRestSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION, oldRestSpecification, newRestSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestSpecification(RESTSpecification newRestSpecification)
  {
    if (newRestSpecification != restSpecification)
    {
      NotificationChain msgs = null;
      if (restSpecification != null)
        msgs = ((InternalEObject)restSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION, null, msgs);
      if (newRestSpecification != null)
        msgs = ((InternalEObject)newRestSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION, null, msgs);
      msgs = basicSetRestSpecification(newRestSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION, newRestSpecification, newRestSpecification));
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
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__DECLARED_PARAMETERS:
        return ((InternalEList<?>)getDeclaredParameters()).basicRemove(otherEnd, msgs);
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION:
        return basicSetRestSpecification(null, msgs);
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
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__NAME:
        return getName();
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__DECLARED_PARAMETERS:
        return getDeclaredParameters();
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__RETURNS_MANY:
        return isReturnsMany();
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION:
        return getRestSpecification();
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
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__NAME:
        setName((String)newValue);
        return;
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__DECLARED_PARAMETERS:
        getDeclaredParameters().clear();
        getDeclaredParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__RETURNS_MANY:
        setReturnsMany((Boolean)newValue);
        return;
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION:
        setRestSpecification((RESTSpecification)newValue);
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
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__DECLARED_PARAMETERS:
        getDeclaredParameters().clear();
        return;
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__RETURNS_MANY:
        setReturnsMany(RETURNS_MANY_EDEFAULT);
        return;
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION:
        setRestSpecification((RESTSpecification)null);
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
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__DECLARED_PARAMETERS:
        return declaredParameters != null && !declaredParameters.isEmpty();
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__RETURNS_MANY:
        return returnsMany != RETURNS_MANY_EDEFAULT;
      case ApplauseDslPackage.DATA_SOURCE_ACCESS_METHOD__REST_SPECIFICATION:
        return restSpecification != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", returnsMany: ");
    result.append(returnsMany);
    result.append(')');
    return result.toString();
  }

} //DataSourceAccessMethodImpl
