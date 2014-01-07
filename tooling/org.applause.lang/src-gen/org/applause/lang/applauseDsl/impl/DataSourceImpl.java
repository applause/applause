/**
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.AbsoluteRESTURL;
import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.Entity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.DataSourceImpl#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.DataSourceImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.DataSourceImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSourceImpl extends NamedElementImpl implements DataSource
{
  /**
   * The cached value of the '{@link #getBaseUrl() <em>Base Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseUrl()
   * @generated
   * @ordered
   */
  protected AbsoluteRESTURL baseUrl;

  /**
   * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceType()
   * @generated
   * @ordered
   */
  protected Entity resourceType;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<DataSourceAccessMethod> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataSourceImpl()
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
    return ApplauseDslPackage.Literals.DATA_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsoluteRESTURL getBaseUrl()
  {
    return baseUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBaseUrl(AbsoluteRESTURL newBaseUrl, NotificationChain msgs)
  {
    AbsoluteRESTURL oldBaseUrl = baseUrl;
    baseUrl = newBaseUrl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.DATA_SOURCE__BASE_URL, oldBaseUrl, newBaseUrl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseUrl(AbsoluteRESTURL newBaseUrl)
  {
    if (newBaseUrl != baseUrl)
    {
      NotificationChain msgs = null;
      if (baseUrl != null)
        msgs = ((InternalEObject)baseUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.DATA_SOURCE__BASE_URL, null, msgs);
      if (newBaseUrl != null)
        msgs = ((InternalEObject)newBaseUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.DATA_SOURCE__BASE_URL, null, msgs);
      msgs = basicSetBaseUrl(newBaseUrl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.DATA_SOURCE__BASE_URL, newBaseUrl, newBaseUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getResourceType()
  {
    if (resourceType != null && resourceType.eIsProxy())
    {
      InternalEObject oldResourceType = (InternalEObject)resourceType;
      resourceType = (Entity)eResolveProxy(oldResourceType);
      if (resourceType != oldResourceType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.DATA_SOURCE__RESOURCE_TYPE, oldResourceType, resourceType));
      }
    }
    return resourceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetResourceType()
  {
    return resourceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceType(Entity newResourceType)
  {
    Entity oldResourceType = resourceType;
    resourceType = newResourceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.DATA_SOURCE__RESOURCE_TYPE, oldResourceType, resourceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataSourceAccessMethod> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<DataSourceAccessMethod>(DataSourceAccessMethod.class, this, ApplauseDslPackage.DATA_SOURCE__METHODS);
    }
    return methods;
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
      case ApplauseDslPackage.DATA_SOURCE__BASE_URL:
        return basicSetBaseUrl(null, msgs);
      case ApplauseDslPackage.DATA_SOURCE__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case ApplauseDslPackage.DATA_SOURCE__BASE_URL:
        return getBaseUrl();
      case ApplauseDslPackage.DATA_SOURCE__RESOURCE_TYPE:
        if (resolve) return getResourceType();
        return basicGetResourceType();
      case ApplauseDslPackage.DATA_SOURCE__METHODS:
        return getMethods();
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
      case ApplauseDslPackage.DATA_SOURCE__BASE_URL:
        setBaseUrl((AbsoluteRESTURL)newValue);
        return;
      case ApplauseDslPackage.DATA_SOURCE__RESOURCE_TYPE:
        setResourceType((Entity)newValue);
        return;
      case ApplauseDslPackage.DATA_SOURCE__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends DataSourceAccessMethod>)newValue);
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
      case ApplauseDslPackage.DATA_SOURCE__BASE_URL:
        setBaseUrl((AbsoluteRESTURL)null);
        return;
      case ApplauseDslPackage.DATA_SOURCE__RESOURCE_TYPE:
        setResourceType((Entity)null);
        return;
      case ApplauseDslPackage.DATA_SOURCE__METHODS:
        getMethods().clear();
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
      case ApplauseDslPackage.DATA_SOURCE__BASE_URL:
        return baseUrl != null;
      case ApplauseDslPackage.DATA_SOURCE__RESOURCE_TYPE:
        return resourceType != null;
      case ApplauseDslPackage.DATA_SOURCE__METHODS:
        return methods != null && !methods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DataSourceImpl
