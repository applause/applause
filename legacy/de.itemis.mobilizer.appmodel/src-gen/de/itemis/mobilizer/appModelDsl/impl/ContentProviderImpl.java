/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl.impl;

import de.itemis.mobilizer.appModelDsl.AppModelDslPackage;
import de.itemis.mobilizer.appModelDsl.ContentProvider;
import de.itemis.mobilizer.appModelDsl.Parameter;
import de.itemis.mobilizer.appModelDsl.ScalarExpression;
import de.itemis.mobilizer.appModelDsl.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.ContentProviderImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.ContentProviderImpl#isResolver <em>Resolver</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.ContentProviderImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.ContentProviderImpl#isMany <em>Many</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.ContentProviderImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.ContentProviderImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentProviderImpl extends ModelElementImpl implements ContentProvider
{
  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected Parameter parameter;

  /**
   * The default value of the '{@link #isResolver() <em>Resolver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResolver()
   * @generated
   * @ordered
   */
  protected static final boolean RESOLVER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResolver() <em>Resolver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResolver()
   * @generated
   * @ordered
   */
  protected boolean resolver = RESOLVER_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
  protected static final boolean MANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
  protected boolean many = MANY_EDEFAULT;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected ScalarExpression url;

  /**
   * The cached value of the '{@link #getSelection() <em>Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelection()
   * @generated
   * @ordered
   */
  protected ScalarExpression selection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentProviderImpl()
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
    return AppModelDslPackage.Literals.CONTENT_PROVIDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs)
  {
    Parameter oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppModelDslPackage.CONTENT_PROVIDER__PARAMETER, oldParameter, newParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(Parameter newParameter)
  {
    if (newParameter != parameter)
    {
      NotificationChain msgs = null;
      if (parameter != null)
        msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.CONTENT_PROVIDER__PARAMETER, null, msgs);
      if (newParameter != null)
        msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.CONTENT_PROVIDER__PARAMETER, null, msgs);
      msgs = basicSetParameter(newParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.CONTENT_PROVIDER__PARAMETER, newParameter, newParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResolver()
  {
    return resolver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResolver(boolean newResolver)
  {
    boolean oldResolver = resolver;
    resolver = newResolver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.CONTENT_PROVIDER__RESOLVER, oldResolver, resolver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppModelDslPackage.CONTENT_PROVIDER__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.CONTENT_PROVIDER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMany()
  {
    return many;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMany(boolean newMany)
  {
    boolean oldMany = many;
    many = newMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.CONTENT_PROVIDER__MANY, oldMany, many));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUrl(ScalarExpression newUrl, NotificationChain msgs)
  {
    ScalarExpression oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppModelDslPackage.CONTENT_PROVIDER__URL, oldUrl, newUrl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(ScalarExpression newUrl)
  {
    if (newUrl != url)
    {
      NotificationChain msgs = null;
      if (url != null)
        msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.CONTENT_PROVIDER__URL, null, msgs);
      if (newUrl != null)
        msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.CONTENT_PROVIDER__URL, null, msgs);
      msgs = basicSetUrl(newUrl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.CONTENT_PROVIDER__URL, newUrl, newUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getSelection()
  {
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelection(ScalarExpression newSelection, NotificationChain msgs)
  {
    ScalarExpression oldSelection = selection;
    selection = newSelection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppModelDslPackage.CONTENT_PROVIDER__SELECTION, oldSelection, newSelection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelection(ScalarExpression newSelection)
  {
    if (newSelection != selection)
    {
      NotificationChain msgs = null;
      if (selection != null)
        msgs = ((InternalEObject)selection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.CONTENT_PROVIDER__SELECTION, null, msgs);
      if (newSelection != null)
        msgs = ((InternalEObject)newSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.CONTENT_PROVIDER__SELECTION, null, msgs);
      msgs = basicSetSelection(newSelection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.CONTENT_PROVIDER__SELECTION, newSelection, newSelection));
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
      case AppModelDslPackage.CONTENT_PROVIDER__PARAMETER:
        return basicSetParameter(null, msgs);
      case AppModelDslPackage.CONTENT_PROVIDER__URL:
        return basicSetUrl(null, msgs);
      case AppModelDslPackage.CONTENT_PROVIDER__SELECTION:
        return basicSetSelection(null, msgs);
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
      case AppModelDslPackage.CONTENT_PROVIDER__PARAMETER:
        return getParameter();
      case AppModelDslPackage.CONTENT_PROVIDER__RESOLVER:
        return isResolver();
      case AppModelDslPackage.CONTENT_PROVIDER__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case AppModelDslPackage.CONTENT_PROVIDER__MANY:
        return isMany();
      case AppModelDslPackage.CONTENT_PROVIDER__URL:
        return getUrl();
      case AppModelDslPackage.CONTENT_PROVIDER__SELECTION:
        return getSelection();
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
      case AppModelDslPackage.CONTENT_PROVIDER__PARAMETER:
        setParameter((Parameter)newValue);
        return;
      case AppModelDslPackage.CONTENT_PROVIDER__RESOLVER:
        setResolver((Boolean)newValue);
        return;
      case AppModelDslPackage.CONTENT_PROVIDER__TYPE:
        setType((Type)newValue);
        return;
      case AppModelDslPackage.CONTENT_PROVIDER__MANY:
        setMany((Boolean)newValue);
        return;
      case AppModelDslPackage.CONTENT_PROVIDER__URL:
        setUrl((ScalarExpression)newValue);
        return;
      case AppModelDslPackage.CONTENT_PROVIDER__SELECTION:
        setSelection((ScalarExpression)newValue);
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
      case AppModelDslPackage.CONTENT_PROVIDER__PARAMETER:
        setParameter((Parameter)null);
        return;
      case AppModelDslPackage.CONTENT_PROVIDER__RESOLVER:
        setResolver(RESOLVER_EDEFAULT);
        return;
      case AppModelDslPackage.CONTENT_PROVIDER__TYPE:
        setType((Type)null);
        return;
      case AppModelDslPackage.CONTENT_PROVIDER__MANY:
        setMany(MANY_EDEFAULT);
        return;
      case AppModelDslPackage.CONTENT_PROVIDER__URL:
        setUrl((ScalarExpression)null);
        return;
      case AppModelDslPackage.CONTENT_PROVIDER__SELECTION:
        setSelection((ScalarExpression)null);
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
      case AppModelDslPackage.CONTENT_PROVIDER__PARAMETER:
        return parameter != null;
      case AppModelDslPackage.CONTENT_PROVIDER__RESOLVER:
        return resolver != RESOLVER_EDEFAULT;
      case AppModelDslPackage.CONTENT_PROVIDER__TYPE:
        return type != null;
      case AppModelDslPackage.CONTENT_PROVIDER__MANY:
        return many != MANY_EDEFAULT;
      case AppModelDslPackage.CONTENT_PROVIDER__URL:
        return url != null;
      case AppModelDslPackage.CONTENT_PROVIDER__SELECTION:
        return selection != null;
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
    result.append(" (resolver: ");
    result.append(resolver);
    result.append(", many: ");
    result.append(many);
    result.append(')');
    return result.toString();
  }

} //ContentProviderImpl
