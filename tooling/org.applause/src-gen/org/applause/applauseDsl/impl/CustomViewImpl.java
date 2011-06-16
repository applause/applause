/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applauseDsl.impl;

import org.applause.applauseDsl.ApplauseDslPackage;
import org.applause.applauseDsl.CustomView;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.applauseDsl.impl.CustomViewImpl#getObjclass <em>Objclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomViewImpl extends ViewImpl implements CustomView
{
  /**
   * The default value of the '{@link #getObjclass() <em>Objclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjclass()
   * @generated
   * @ordered
   */
  protected static final String OBJCLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjclass() <em>Objclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjclass()
   * @generated
   * @ordered
   */
  protected String objclass = OBJCLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomViewImpl()
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
    return ApplauseDslPackage.Literals.CUSTOM_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjclass()
  {
    return objclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjclass(String newObjclass)
  {
    String oldObjclass = objclass;
    objclass = newObjclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CUSTOM_VIEW__OBJCLASS, oldObjclass, objclass));
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
      case ApplauseDslPackage.CUSTOM_VIEW__OBJCLASS:
        return getObjclass();
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
      case ApplauseDslPackage.CUSTOM_VIEW__OBJCLASS:
        setObjclass((String)newValue);
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
      case ApplauseDslPackage.CUSTOM_VIEW__OBJCLASS:
        setObjclass(OBJCLASS_EDEFAULT);
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
      case ApplauseDslPackage.CUSTOM_VIEW__OBJCLASS:
        return OBJCLASS_EDEFAULT == null ? objclass != null : !OBJCLASS_EDEFAULT.equals(objclass);
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
    result.append(" (objclass: ");
    result.append(objclass);
    result.append(')');
    return result.toString();
  }

} //CustomViewImpl
