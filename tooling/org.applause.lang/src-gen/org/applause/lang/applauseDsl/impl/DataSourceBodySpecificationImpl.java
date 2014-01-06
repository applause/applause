/**
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.DataSourceBodySpecification;
import org.applause.lang.applauseDsl.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Body Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.DataSourceBodySpecificationImpl#getBodycontents <em>Bodycontents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSourceBodySpecificationImpl extends MinimalEObjectImpl.Container implements DataSourceBodySpecification
{
  /**
   * The cached value of the '{@link #getBodycontents() <em>Bodycontents</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodycontents()
   * @generated
   * @ordered
   */
  protected Parameter bodycontents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataSourceBodySpecificationImpl()
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
    return ApplauseDslPackage.Literals.DATA_SOURCE_BODY_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getBodycontents()
  {
    if (bodycontents != null && bodycontents.eIsProxy())
    {
      InternalEObject oldBodycontents = (InternalEObject)bodycontents;
      bodycontents = (Parameter)eResolveProxy(oldBodycontents);
      if (bodycontents != oldBodycontents)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS, oldBodycontents, bodycontents));
      }
    }
    return bodycontents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetBodycontents()
  {
    return bodycontents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBodycontents(Parameter newBodycontents)
  {
    Parameter oldBodycontents = bodycontents;
    bodycontents = newBodycontents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS, oldBodycontents, bodycontents));
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
      case ApplauseDslPackage.DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS:
        if (resolve) return getBodycontents();
        return basicGetBodycontents();
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
      case ApplauseDslPackage.DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS:
        setBodycontents((Parameter)newValue);
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
      case ApplauseDslPackage.DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS:
        setBodycontents((Parameter)null);
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
      case ApplauseDslPackage.DATA_SOURCE_BODY_SPECIFICATION__BODYCONTENTS:
        return bodycontents != null;
    }
    return super.eIsSet(featureID);
  }

} //DataSourceBodySpecificationImpl
