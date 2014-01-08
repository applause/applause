/**
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenKind;
import org.applause.lang.applauseDsl.ScreenSection;

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
 * An implementation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ScreenImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ScreenImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ScreenImpl#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ScreenImpl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScreenImpl extends NamedElementImpl implements Screen
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final ScreenKind KIND_EDEFAULT = ScreenKind.DEFAULT_LIST;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected ScreenKind kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatasource()
   * @generated
   * @ordered
   */
  protected DataSourceCall datasource;

  /**
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<ScreenSection> sections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScreenImpl()
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
    return ApplauseDslPackage.Literals.SCREEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(ScreenKind newKind)
  {
    ScreenKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SCREEN__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SCREEN__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSourceCall getDatasource()
  {
    return datasource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatasource(DataSourceCall newDatasource, NotificationChain msgs)
  {
    DataSourceCall oldDatasource = datasource;
    datasource = newDatasource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SCREEN__DATASOURCE, oldDatasource, newDatasource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatasource(DataSourceCall newDatasource)
  {
    if (newDatasource != datasource)
    {
      NotificationChain msgs = null;
      if (datasource != null)
        msgs = ((InternalEObject)datasource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.SCREEN__DATASOURCE, null, msgs);
      if (newDatasource != null)
        msgs = ((InternalEObject)newDatasource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.SCREEN__DATASOURCE, null, msgs);
      msgs = basicSetDatasource(newDatasource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SCREEN__DATASOURCE, newDatasource, newDatasource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScreenSection> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectContainmentEList<ScreenSection>(ScreenSection.class, this, ApplauseDslPackage.SCREEN__SECTIONS);
    }
    return sections;
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
      case ApplauseDslPackage.SCREEN__DATASOURCE:
        return basicSetDatasource(null, msgs);
      case ApplauseDslPackage.SCREEN__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
      case ApplauseDslPackage.SCREEN__KIND:
        return getKind();
      case ApplauseDslPackage.SCREEN__TITLE:
        return getTitle();
      case ApplauseDslPackage.SCREEN__DATASOURCE:
        return getDatasource();
      case ApplauseDslPackage.SCREEN__SECTIONS:
        return getSections();
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
      case ApplauseDslPackage.SCREEN__KIND:
        setKind((ScreenKind)newValue);
        return;
      case ApplauseDslPackage.SCREEN__TITLE:
        setTitle((String)newValue);
        return;
      case ApplauseDslPackage.SCREEN__DATASOURCE:
        setDatasource((DataSourceCall)newValue);
        return;
      case ApplauseDslPackage.SCREEN__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends ScreenSection>)newValue);
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
      case ApplauseDslPackage.SCREEN__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case ApplauseDslPackage.SCREEN__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case ApplauseDslPackage.SCREEN__DATASOURCE:
        setDatasource((DataSourceCall)null);
        return;
      case ApplauseDslPackage.SCREEN__SECTIONS:
        getSections().clear();
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
      case ApplauseDslPackage.SCREEN__KIND:
        return kind != KIND_EDEFAULT;
      case ApplauseDslPackage.SCREEN__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case ApplauseDslPackage.SCREEN__DATASOURCE:
        return datasource != null;
      case ApplauseDslPackage.SCREEN__SECTIONS:
        return sections != null && !sections.isEmpty();
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
    result.append(" (kind: ");
    result.append(kind);
    result.append(", title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //ScreenImpl
