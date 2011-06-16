/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.ScalarExpression;
import org.applause.lang.applauseDsl.ViewHeader;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewHeaderImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewHeaderImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewHeaderImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewHeaderImpl#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewHeaderImpl extends MinimalEObjectImpl.Container implements ViewHeader
{
  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected ScalarExpression title;

  /**
   * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtitle()
   * @generated
   * @ordered
   */
  protected ScalarExpression subtitle;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewHeaderImpl()
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
    return ApplauseDslPackage.Literals.VIEW_HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(ScalarExpression newTitle, NotificationChain msgs)
  {
    ScalarExpression oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_HEADER__TITLE, oldTitle, newTitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(ScalarExpression newTitle)
  {
    if (newTitle != title)
    {
      NotificationChain msgs = null;
      if (title != null)
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_HEADER__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_HEADER__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_HEADER__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getSubtitle()
  {
    return subtitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubtitle(ScalarExpression newSubtitle, NotificationChain msgs)
  {
    ScalarExpression oldSubtitle = subtitle;
    subtitle = newSubtitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_HEADER__SUBTITLE, oldSubtitle, newSubtitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtitle(ScalarExpression newSubtitle)
  {
    if (newSubtitle != subtitle)
    {
      NotificationChain msgs = null;
      if (subtitle != null)
        msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_HEADER__SUBTITLE, null, msgs);
      if (newSubtitle != null)
        msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_HEADER__SUBTITLE, null, msgs);
      msgs = basicSetSubtitle(newSubtitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_HEADER__SUBTITLE, newSubtitle, newSubtitle));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_HEADER__DETAILS, oldDetails, newDetails);
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
        msgs = ((InternalEObject)details).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_HEADER__DETAILS, null, msgs);
      if (newDetails != null)
        msgs = ((InternalEObject)newDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_HEADER__DETAILS, null, msgs);
      msgs = basicSetDetails(newDetails, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_HEADER__DETAILS, newDetails, newDetails));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_HEADER__IMAGE, oldImage, newImage);
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
        msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_HEADER__IMAGE, null, msgs);
      if (newImage != null)
        msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_HEADER__IMAGE, null, msgs);
      msgs = basicSetImage(newImage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_HEADER__IMAGE, newImage, newImage));
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
      case ApplauseDslPackage.VIEW_HEADER__TITLE:
        return basicSetTitle(null, msgs);
      case ApplauseDslPackage.VIEW_HEADER__SUBTITLE:
        return basicSetSubtitle(null, msgs);
      case ApplauseDslPackage.VIEW_HEADER__DETAILS:
        return basicSetDetails(null, msgs);
      case ApplauseDslPackage.VIEW_HEADER__IMAGE:
        return basicSetImage(null, msgs);
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
      case ApplauseDslPackage.VIEW_HEADER__TITLE:
        return getTitle();
      case ApplauseDslPackage.VIEW_HEADER__SUBTITLE:
        return getSubtitle();
      case ApplauseDslPackage.VIEW_HEADER__DETAILS:
        return getDetails();
      case ApplauseDslPackage.VIEW_HEADER__IMAGE:
        return getImage();
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
      case ApplauseDslPackage.VIEW_HEADER__TITLE:
        setTitle((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.VIEW_HEADER__SUBTITLE:
        setSubtitle((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.VIEW_HEADER__DETAILS:
        setDetails((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.VIEW_HEADER__IMAGE:
        setImage((ScalarExpression)newValue);
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
      case ApplauseDslPackage.VIEW_HEADER__TITLE:
        setTitle((ScalarExpression)null);
        return;
      case ApplauseDslPackage.VIEW_HEADER__SUBTITLE:
        setSubtitle((ScalarExpression)null);
        return;
      case ApplauseDslPackage.VIEW_HEADER__DETAILS:
        setDetails((ScalarExpression)null);
        return;
      case ApplauseDslPackage.VIEW_HEADER__IMAGE:
        setImage((ScalarExpression)null);
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
      case ApplauseDslPackage.VIEW_HEADER__TITLE:
        return title != null;
      case ApplauseDslPackage.VIEW_HEADER__SUBTITLE:
        return subtitle != null;
      case ApplauseDslPackage.VIEW_HEADER__DETAILS:
        return details != null;
      case ApplauseDslPackage.VIEW_HEADER__IMAGE:
        return image != null;
    }
    return super.eIsSet(featureID);
  }

} //ViewHeaderImpl
