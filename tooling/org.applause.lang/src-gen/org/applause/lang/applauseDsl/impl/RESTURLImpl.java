/**
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.RESTURL;
import org.applause.lang.applauseDsl.UrlFragment;
import org.applause.lang.applauseDsl.UrlParameter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RESTURL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.RESTURLImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.RESTURLImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RESTURLImpl extends MinimalEObjectImpl.Container implements RESTURL
{
  /**
   * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFragments()
   * @generated
   * @ordered
   */
  protected EList<UrlFragment> fragments;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<UrlParameter> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RESTURLImpl()
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
    return ApplauseDslPackage.Literals.RESTURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UrlFragment> getFragments()
  {
    if (fragments == null)
    {
      fragments = new EObjectContainmentEList<UrlFragment>(UrlFragment.class, this, ApplauseDslPackage.RESTURL__FRAGMENTS);
    }
    return fragments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UrlParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<UrlParameter>(UrlParameter.class, this, ApplauseDslPackage.RESTURL__PARAMETERS);
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
      case ApplauseDslPackage.RESTURL__FRAGMENTS:
        return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
      case ApplauseDslPackage.RESTURL__PARAMETERS:
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
      case ApplauseDslPackage.RESTURL__FRAGMENTS:
        return getFragments();
      case ApplauseDslPackage.RESTURL__PARAMETERS:
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
      case ApplauseDslPackage.RESTURL__FRAGMENTS:
        getFragments().clear();
        getFragments().addAll((Collection<? extends UrlFragment>)newValue);
        return;
      case ApplauseDslPackage.RESTURL__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends UrlParameter>)newValue);
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
      case ApplauseDslPackage.RESTURL__FRAGMENTS:
        getFragments().clear();
        return;
      case ApplauseDslPackage.RESTURL__PARAMETERS:
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
      case ApplauseDslPackage.RESTURL__FRAGMENTS:
        return fragments != null && !fragments.isEmpty();
      case ApplauseDslPackage.RESTURL__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RESTURLImpl
