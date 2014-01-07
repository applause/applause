/**
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Variable;

import org.eclipse.emf.common.notify.Notification;

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
   * The cached value of the '{@link #getParameterReference() <em>Parameter Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterReference()
   * @generated
   * @ordered
   */
  protected Parameter parameterReference;

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
  public Parameter getParameterReference()
  {
    if (parameterReference != null && parameterReference.eIsProxy())
    {
      InternalEObject oldParameterReference = (InternalEObject)parameterReference;
      parameterReference = (Parameter)eResolveProxy(oldParameterReference);
      if (parameterReference != oldParameterReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE, oldParameterReference, parameterReference));
      }
    }
    return parameterReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetParameterReference()
  {
    return parameterReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterReference(Parameter newParameterReference)
  {
    Parameter oldParameterReference = parameterReference;
    parameterReference = newParameterReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VARIABLE__PARAMETER_REFERENCE, oldParameterReference, parameterReference));
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
        if (resolve) return getParameterReference();
        return basicGetParameterReference();
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
        setParameterReference((Parameter)newValue);
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
        setParameterReference((Parameter)null);
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
