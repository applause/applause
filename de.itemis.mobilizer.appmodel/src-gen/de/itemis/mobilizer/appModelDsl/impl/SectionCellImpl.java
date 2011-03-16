/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl.impl;

import de.itemis.mobilizer.appModelDsl.AppModelDslPackage;
import de.itemis.mobilizer.appModelDsl.CellType;
import de.itemis.mobilizer.appModelDsl.CollectionIterator;
import de.itemis.mobilizer.appModelDsl.ScalarExpression;
import de.itemis.mobilizer.appModelDsl.SectionCell;
import de.itemis.mobilizer.appModelDsl.ViewAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.SectionCellImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.SectionCellImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.SectionCellImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.SectionCellImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.SectionCellImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.impl.SectionCellImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionCellImpl extends MinimalEObjectImpl.Container implements SectionCell
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final CellType TYPE_EDEFAULT = CellType.DEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected CellType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getIterator() <em>Iterator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterator()
   * @generated
   * @ordered
   */
  protected CollectionIterator iterator;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected ScalarExpression text;

  /**
   * The cached value of the '{@link #getDetails() <em>Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
  protected ScalarExpression details;

  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected ScalarExpression image;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected ViewAction action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SectionCellImpl()
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
    return AppModelDslPackage.Literals.SECTION_CELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(CellType newType)
  {
    CellType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionIterator getIterator()
  {
    return iterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIterator(CollectionIterator newIterator, NotificationChain msgs)
  {
    CollectionIterator oldIterator = iterator;
    iterator = newIterator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__ITERATOR, oldIterator, newIterator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIterator(CollectionIterator newIterator)
  {
    if (newIterator != iterator)
    {
      NotificationChain msgs = null;
      if (iterator != null)
        msgs = ((InternalEObject)iterator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.SECTION_CELL__ITERATOR, null, msgs);
      if (newIterator != null)
        msgs = ((InternalEObject)newIterator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.SECTION_CELL__ITERATOR, null, msgs);
      msgs = basicSetIterator(newIterator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__ITERATOR, newIterator, newIterator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(ScalarExpression newText, NotificationChain msgs)
  {
    ScalarExpression oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(ScalarExpression newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.SECTION_CELL__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.SECTION_CELL__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__TEXT, newText, newText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getDetails()
  {
    return details;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDetails(ScalarExpression newDetails, NotificationChain msgs)
  {
    ScalarExpression oldDetails = details;
    details = newDetails;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__DETAILS, oldDetails, newDetails);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetails(ScalarExpression newDetails)
  {
    if (newDetails != details)
    {
      NotificationChain msgs = null;
      if (details != null)
        msgs = ((InternalEObject)details).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.SECTION_CELL__DETAILS, null, msgs);
      if (newDetails != null)
        msgs = ((InternalEObject)newDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.SECTION_CELL__DETAILS, null, msgs);
      msgs = basicSetDetails(newDetails, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__DETAILS, newDetails, newDetails));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImage(ScalarExpression newImage, NotificationChain msgs)
  {
    ScalarExpression oldImage = image;
    image = newImage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__IMAGE, oldImage, newImage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage(ScalarExpression newImage)
  {
    if (newImage != image)
    {
      NotificationChain msgs = null;
      if (image != null)
        msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.SECTION_CELL__IMAGE, null, msgs);
      if (newImage != null)
        msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.SECTION_CELL__IMAGE, null, msgs);
      msgs = basicSetImage(newImage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__IMAGE, newImage, newImage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewAction getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(ViewAction newAction, NotificationChain msgs)
  {
    ViewAction oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(ViewAction newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.SECTION_CELL__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppModelDslPackage.SECTION_CELL__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppModelDslPackage.SECTION_CELL__ACTION, newAction, newAction));
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
      case AppModelDslPackage.SECTION_CELL__ITERATOR:
        return basicSetIterator(null, msgs);
      case AppModelDslPackage.SECTION_CELL__TEXT:
        return basicSetText(null, msgs);
      case AppModelDslPackage.SECTION_CELL__DETAILS:
        return basicSetDetails(null, msgs);
      case AppModelDslPackage.SECTION_CELL__IMAGE:
        return basicSetImage(null, msgs);
      case AppModelDslPackage.SECTION_CELL__ACTION:
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
      case AppModelDslPackage.SECTION_CELL__TYPE:
        return getType();
      case AppModelDslPackage.SECTION_CELL__ITERATOR:
        return getIterator();
      case AppModelDslPackage.SECTION_CELL__TEXT:
        return getText();
      case AppModelDslPackage.SECTION_CELL__DETAILS:
        return getDetails();
      case AppModelDslPackage.SECTION_CELL__IMAGE:
        return getImage();
      case AppModelDslPackage.SECTION_CELL__ACTION:
        return getAction();
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
      case AppModelDslPackage.SECTION_CELL__TYPE:
        setType((CellType)newValue);
        return;
      case AppModelDslPackage.SECTION_CELL__ITERATOR:
        setIterator((CollectionIterator)newValue);
        return;
      case AppModelDslPackage.SECTION_CELL__TEXT:
        setText((ScalarExpression)newValue);
        return;
      case AppModelDslPackage.SECTION_CELL__DETAILS:
        setDetails((ScalarExpression)newValue);
        return;
      case AppModelDslPackage.SECTION_CELL__IMAGE:
        setImage((ScalarExpression)newValue);
        return;
      case AppModelDslPackage.SECTION_CELL__ACTION:
        setAction((ViewAction)newValue);
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
      case AppModelDslPackage.SECTION_CELL__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AppModelDslPackage.SECTION_CELL__ITERATOR:
        setIterator((CollectionIterator)null);
        return;
      case AppModelDslPackage.SECTION_CELL__TEXT:
        setText((ScalarExpression)null);
        return;
      case AppModelDslPackage.SECTION_CELL__DETAILS:
        setDetails((ScalarExpression)null);
        return;
      case AppModelDslPackage.SECTION_CELL__IMAGE:
        setImage((ScalarExpression)null);
        return;
      case AppModelDslPackage.SECTION_CELL__ACTION:
        setAction((ViewAction)null);
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
      case AppModelDslPackage.SECTION_CELL__TYPE:
        return type != TYPE_EDEFAULT;
      case AppModelDslPackage.SECTION_CELL__ITERATOR:
        return iterator != null;
      case AppModelDslPackage.SECTION_CELL__TEXT:
        return text != null;
      case AppModelDslPackage.SECTION_CELL__DETAILS:
        return details != null;
      case AppModelDslPackage.SECTION_CELL__IMAGE:
        return image != null;
      case AppModelDslPackage.SECTION_CELL__ACTION:
        return action != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //SectionCellImpl
