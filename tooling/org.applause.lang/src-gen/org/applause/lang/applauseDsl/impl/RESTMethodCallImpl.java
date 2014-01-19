/**
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.ParameterReference;
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
 * An implementation of the model object '<em><b>REST Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.RESTMethodCallImpl#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.RESTMethodCallImpl#getRestMethod <em>Rest Method</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.RESTMethodCallImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RESTMethodCallImpl extends MinimalEObjectImpl.Container implements RESTMethodCall
{
  /**
   * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatasource()
   * @generated
   * @ordered
   */
  protected DataSourceCall datasource;

  /**
   * The cached value of the '{@link #getRestMethod() <em>Rest Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestMethod()
   * @generated
   * @ordered
   */
  protected DataSourceAccessMethod restMethod;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ParameterReference> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RESTMethodCallImpl()
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
    return ApplauseDslPackage.Literals.REST_METHOD_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSourceCall getDatasource()
  {
    if (datasource != null && datasource.eIsProxy())
    {
      InternalEObject oldDatasource = (InternalEObject)datasource;
      datasource = (DataSourceCall)eResolveProxy(oldDatasource);
      if (datasource != oldDatasource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.REST_METHOD_CALL__DATASOURCE, oldDatasource, datasource));
      }
    }
    return datasource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSourceCall basicGetDatasource()
  {
    return datasource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatasource(DataSourceCall newDatasource)
  {
    DataSourceCall oldDatasource = datasource;
    datasource = newDatasource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.REST_METHOD_CALL__DATASOURCE, oldDatasource, datasource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSourceAccessMethod getRestMethod()
  {
    if (restMethod != null && restMethod.eIsProxy())
    {
      InternalEObject oldRestMethod = (InternalEObject)restMethod;
      restMethod = (DataSourceAccessMethod)eResolveProxy(oldRestMethod);
      if (restMethod != oldRestMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.REST_METHOD_CALL__REST_METHOD, oldRestMethod, restMethod));
      }
    }
    return restMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSourceAccessMethod basicGetRestMethod()
  {
    return restMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestMethod(DataSourceAccessMethod newRestMethod)
  {
    DataSourceAccessMethod oldRestMethod = restMethod;
    restMethod = newRestMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.REST_METHOD_CALL__REST_METHOD, oldRestMethod, restMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterReference> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ParameterReference>(ParameterReference.class, this, ApplauseDslPackage.REST_METHOD_CALL__PARAMETERS);
    }
    return parameters;
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
      case ApplauseDslPackage.REST_METHOD_CALL__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case ApplauseDslPackage.REST_METHOD_CALL__DATASOURCE:
        if (resolve) return getDatasource();
        return basicGetDatasource();
      case ApplauseDslPackage.REST_METHOD_CALL__REST_METHOD:
        if (resolve) return getRestMethod();
        return basicGetRestMethod();
      case ApplauseDslPackage.REST_METHOD_CALL__PARAMETERS:
        return getParameters();
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
      case ApplauseDslPackage.REST_METHOD_CALL__DATASOURCE:
        setDatasource((DataSourceCall)newValue);
        return;
      case ApplauseDslPackage.REST_METHOD_CALL__REST_METHOD:
        setRestMethod((DataSourceAccessMethod)newValue);
        return;
      case ApplauseDslPackage.REST_METHOD_CALL__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ParameterReference>)newValue);
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
      case ApplauseDslPackage.REST_METHOD_CALL__DATASOURCE:
        setDatasource((DataSourceCall)null);
        return;
      case ApplauseDslPackage.REST_METHOD_CALL__REST_METHOD:
        setRestMethod((DataSourceAccessMethod)null);
        return;
      case ApplauseDslPackage.REST_METHOD_CALL__PARAMETERS:
        getParameters().clear();
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
      case ApplauseDslPackage.REST_METHOD_CALL__DATASOURCE:
        return datasource != null;
      case ApplauseDslPackage.REST_METHOD_CALL__REST_METHOD:
        return restMethod != null;
      case ApplauseDslPackage.REST_METHOD_CALL__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RESTMethodCallImpl
