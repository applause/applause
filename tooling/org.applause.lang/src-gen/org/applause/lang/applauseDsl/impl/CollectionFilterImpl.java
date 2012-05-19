/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.CollectionFilter;
import org.applause.lang.applauseDsl.ScalarExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.CollectionFilterImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.CollectionFilterImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.CollectionFilterImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionFilterImpl extends MinimalEObjectImpl.Container implements CollectionFilter
{
  /**
   * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongitude()
   * @generated
   * @ordered
   */
  protected ScalarExpression longitude;

  /**
   * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatitude()
   * @generated
   * @ordered
   */
  protected ScalarExpression latitude;

  /**
   * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistance()
   * @generated
   * @ordered
   */
  protected static final int DISTANCE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistance()
   * @generated
   * @ordered
   */
  protected int distance = DISTANCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectionFilterImpl()
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
    return ApplauseDslPackage.Literals.COLLECTION_FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getLongitude()
  {
    return longitude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongitude(ScalarExpression newLongitude, NotificationChain msgs)
  {
    ScalarExpression oldLongitude = longitude;
    longitude = newLongitude;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.COLLECTION_FILTER__LONGITUDE, oldLongitude, newLongitude);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongitude(ScalarExpression newLongitude)
  {
    if (newLongitude != longitude)
    {
      NotificationChain msgs = null;
      if (longitude != null)
        msgs = ((InternalEObject)longitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.COLLECTION_FILTER__LONGITUDE, null, msgs);
      if (newLongitude != null)
        msgs = ((InternalEObject)newLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.COLLECTION_FILTER__LONGITUDE, null, msgs);
      msgs = basicSetLongitude(newLongitude, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.COLLECTION_FILTER__LONGITUDE, newLongitude, newLongitude));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getLatitude()
  {
    return latitude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLatitude(ScalarExpression newLatitude, NotificationChain msgs)
  {
    ScalarExpression oldLatitude = latitude;
    latitude = newLatitude;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.COLLECTION_FILTER__LATITUDE, oldLatitude, newLatitude);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatitude(ScalarExpression newLatitude)
  {
    if (newLatitude != latitude)
    {
      NotificationChain msgs = null;
      if (latitude != null)
        msgs = ((InternalEObject)latitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.COLLECTION_FILTER__LATITUDE, null, msgs);
      if (newLatitude != null)
        msgs = ((InternalEObject)newLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.COLLECTION_FILTER__LATITUDE, null, msgs);
      msgs = basicSetLatitude(newLatitude, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.COLLECTION_FILTER__LATITUDE, newLatitude, newLatitude));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDistance()
  {
    return distance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistance(int newDistance)
  {
    int oldDistance = distance;
    distance = newDistance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.COLLECTION_FILTER__DISTANCE, oldDistance, distance));
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
      case ApplauseDslPackage.COLLECTION_FILTER__LONGITUDE:
        return basicSetLongitude(null, msgs);
      case ApplauseDslPackage.COLLECTION_FILTER__LATITUDE:
        return basicSetLatitude(null, msgs);
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
      case ApplauseDslPackage.COLLECTION_FILTER__LONGITUDE:
        return getLongitude();
      case ApplauseDslPackage.COLLECTION_FILTER__LATITUDE:
        return getLatitude();
      case ApplauseDslPackage.COLLECTION_FILTER__DISTANCE:
        return getDistance();
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
      case ApplauseDslPackage.COLLECTION_FILTER__LONGITUDE:
        setLongitude((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.COLLECTION_FILTER__LATITUDE:
        setLatitude((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.COLLECTION_FILTER__DISTANCE:
        setDistance((Integer)newValue);
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
      case ApplauseDslPackage.COLLECTION_FILTER__LONGITUDE:
        setLongitude((ScalarExpression)null);
        return;
      case ApplauseDslPackage.COLLECTION_FILTER__LATITUDE:
        setLatitude((ScalarExpression)null);
        return;
      case ApplauseDslPackage.COLLECTION_FILTER__DISTANCE:
        setDistance(DISTANCE_EDEFAULT);
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
      case ApplauseDslPackage.COLLECTION_FILTER__LONGITUDE:
        return longitude != null;
      case ApplauseDslPackage.COLLECTION_FILTER__LATITUDE:
        return latitude != null;
      case ApplauseDslPackage.COLLECTION_FILTER__DISTANCE:
        return distance != DISTANCE_EDEFAULT;
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
    result.append(" (distance: ");
    result.append(distance);
    result.append(')');
    return result.toString();
  }

} //CollectionFilterImpl
