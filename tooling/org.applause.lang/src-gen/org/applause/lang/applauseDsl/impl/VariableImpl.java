/**
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.ParameterReference;
import org.applause.lang.applauseDsl.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.VariableImpl#getParameterReference <em>Parameter Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends UrlFragmentImpl implements Variable
{
  /**
   * The cached value of the '{@link #getParameterReference() <em>Parameter Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterReference()
   * @generated
   * @ordered
   */
  protected ParameterReference parameterReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return ApplauseDslPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterReference getParameterReference()
  {
    return parameterReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterReference(ParameterReference newParameterReference, NotificationChain msgs)
  {
    ParameterReference oldParameterReference = parameterReference;
    parameterReference = newParameterReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE, oldParameterReference, newParameterReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterReference(ParameterReference newParameterReference)
  {
    if (newParameterReference != parameterReference)
    {
      NotificationChain msgs = null;
      if (parameterReference != null)
        msgs = ((InternalEObject)parameterReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE, null, msgs);
      if (newParameterReference != null)
        msgs = ((InternalEObject)newParameterReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE, null, msgs);
      msgs = basicSetParameterReference(newParameterReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE, newParameterReference, newParameterReference));
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
      case ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE:
        return basicSetParameterReference(null, msgs);
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
      case ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE:
        return getParameterReference();
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
      case ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE:
        setParameterReference((ParameterReference)newValue);
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
      case ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE:
        setParameterReference((ParameterReference)null);
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
      case ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE:
        return parameterReference != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableImpl
