/**
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.GestureKind;
import org.applause.lang.applauseDsl.UIAction;
import org.applause.lang.applauseDsl.UIActionSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.UIActionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.UIActionImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.UIActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.UIActionImpl#getGesture <em>Gesture</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.UIActionImpl#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIActionImpl extends MinimalEObjectImpl.Container implements UIAction
{
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
   * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected static final String ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected String icon = ICON_EDEFAULT;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected UIActionSpecification action;

  /**
   * The default value of the '{@link #getGesture() <em>Gesture</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGesture()
   * @generated
   * @ordered
   */
  protected static final GestureKind GESTURE_EDEFAULT = GestureKind.TAP;

  /**
   * The cached value of the '{@link #getGesture() <em>Gesture</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGesture()
   * @generated
   * @ordered
   */
  protected GestureKind gesture = GESTURE_EDEFAULT;

  /**
   * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected static final int ORDER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected int order = ORDER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UIActionImpl()
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
    return ApplauseDslPackage.Literals.UI_ACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.UI_ACTION__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(String newIcon)
  {
    String oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.UI_ACTION__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIActionSpecification getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(UIActionSpecification newAction, NotificationChain msgs)
  {
    UIActionSpecification oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.UI_ACTION__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(UIActionSpecification newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.UI_ACTION__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.UI_ACTION__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.UI_ACTION__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GestureKind getGesture()
  {
    return gesture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGesture(GestureKind newGesture)
  {
    GestureKind oldGesture = gesture;
    gesture = newGesture == null ? GESTURE_EDEFAULT : newGesture;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.UI_ACTION__GESTURE, oldGesture, gesture));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrder(int newOrder)
  {
    int oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.UI_ACTION__ORDER, oldOrder, order));
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
      case ApplauseDslPackage.UI_ACTION__ACTION:
        return basicSetAction(null, msgs);
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
      case ApplauseDslPackage.UI_ACTION__TITLE:
        return getTitle();
      case ApplauseDslPackage.UI_ACTION__ICON:
        return getIcon();
      case ApplauseDslPackage.UI_ACTION__ACTION:
        return getAction();
      case ApplauseDslPackage.UI_ACTION__GESTURE:
        return getGesture();
      case ApplauseDslPackage.UI_ACTION__ORDER:
        return getOrder();
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
      case ApplauseDslPackage.UI_ACTION__TITLE:
        setTitle((String)newValue);
        return;
      case ApplauseDslPackage.UI_ACTION__ICON:
        setIcon((String)newValue);
        return;
      case ApplauseDslPackage.UI_ACTION__ACTION:
        setAction((UIActionSpecification)newValue);
        return;
      case ApplauseDslPackage.UI_ACTION__GESTURE:
        setGesture((GestureKind)newValue);
        return;
      case ApplauseDslPackage.UI_ACTION__ORDER:
        setOrder((Integer)newValue);
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
      case ApplauseDslPackage.UI_ACTION__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case ApplauseDslPackage.UI_ACTION__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case ApplauseDslPackage.UI_ACTION__ACTION:
        setAction((UIActionSpecification)null);
        return;
      case ApplauseDslPackage.UI_ACTION__GESTURE:
        setGesture(GESTURE_EDEFAULT);
        return;
      case ApplauseDslPackage.UI_ACTION__ORDER:
        setOrder(ORDER_EDEFAULT);
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
      case ApplauseDslPackage.UI_ACTION__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case ApplauseDslPackage.UI_ACTION__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case ApplauseDslPackage.UI_ACTION__ACTION:
        return action != null;
      case ApplauseDslPackage.UI_ACTION__GESTURE:
        return gesture != GESTURE_EDEFAULT;
      case ApplauseDslPackage.UI_ACTION__ORDER:
        return order != ORDER_EDEFAULT;
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
    result.append(" (title: ");
    result.append(title);
    result.append(", icon: ");
    result.append(icon);
    result.append(", gesture: ");
    result.append(gesture);
    result.append(", order: ");
    result.append(order);
    result.append(')');
    return result.toString();
  }

} //UIActionImpl
