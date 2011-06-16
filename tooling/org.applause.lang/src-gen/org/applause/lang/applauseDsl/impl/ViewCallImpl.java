/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.ProviderConstruction;
import org.applause.lang.applauseDsl.View;
import org.applause.lang.applauseDsl.ViewCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewCallImpl#getView <em>View</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewCallImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewCallImpl extends ViewActionImpl implements ViewCall
{
  /**
   * The cached value of the '{@link #getView() <em>View</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView()
   * @generated
   * @ordered
   */
  protected View view;

  /**
   * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvider()
   * @generated
   * @ordered
   */
  protected ProviderConstruction provider;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewCallImpl()
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
    return ApplauseDslPackage.Literals.VIEW_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getView()
  {
    if (view != null && view.eIsProxy())
    {
      InternalEObject oldView = (InternalEObject)view;
      view = (View)eResolveProxy(oldView);
      if (view != oldView)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.VIEW_CALL__VIEW, oldView, view));
      }
    }
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View basicGetView()
  {
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setView(View newView)
  {
    View oldView = view;
    view = newView;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_CALL__VIEW, oldView, view));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProviderConstruction getProvider()
  {
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProvider(ProviderConstruction newProvider, NotificationChain msgs)
  {
    ProviderConstruction oldProvider = provider;
    provider = newProvider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_CALL__PROVIDER, oldProvider, newProvider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvider(ProviderConstruction newProvider)
  {
    if (newProvider != provider)
    {
      NotificationChain msgs = null;
      if (provider != null)
        msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_CALL__PROVIDER, null, msgs);
      if (newProvider != null)
        msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_CALL__PROVIDER, null, msgs);
      msgs = basicSetProvider(newProvider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_CALL__PROVIDER, newProvider, newProvider));
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
      case ApplauseDslPackage.VIEW_CALL__PROVIDER:
        return basicSetProvider(null, msgs);
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
      case ApplauseDslPackage.VIEW_CALL__VIEW:
        if (resolve) return getView();
        return basicGetView();
      case ApplauseDslPackage.VIEW_CALL__PROVIDER:
        return getProvider();
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
      case ApplauseDslPackage.VIEW_CALL__VIEW:
        setView((View)newValue);
        return;
      case ApplauseDslPackage.VIEW_CALL__PROVIDER:
        setProvider((ProviderConstruction)newValue);
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
      case ApplauseDslPackage.VIEW_CALL__VIEW:
        setView((View)null);
        return;
      case ApplauseDslPackage.VIEW_CALL__PROVIDER:
        setProvider((ProviderConstruction)null);
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
      case ApplauseDslPackage.VIEW_CALL__VIEW:
        return view != null;
      case ApplauseDslPackage.VIEW_CALL__PROVIDER:
        return provider != null;
    }
    return super.eIsSet(featureID);
  }

} //ViewCallImpl
