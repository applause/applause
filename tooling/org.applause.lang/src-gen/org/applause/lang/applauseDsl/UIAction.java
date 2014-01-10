/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.UIAction#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.UIAction#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.UIAction#getAction <em>Action</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.UIAction#getGesture <em>Gesture</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.UIAction#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIAction()
 * @model
 * @generated
 */
public interface UIAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIAction_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIAction#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon</em>' attribute.
   * @see #setIcon(String)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIAction_Icon()
   * @model
   * @generated
   */
  String getIcon();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIAction#getIcon <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' attribute.
   * @see #getIcon()
   * @generated
   */
  void setIcon(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(UIActionSpecification)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIAction_Action()
   * @model containment="true"
   * @generated
   */
  UIActionSpecification getAction();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIAction#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(UIActionSpecification value);

  /**
   * Returns the value of the '<em><b>Gesture</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.lang.applauseDsl.GestureKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gesture</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gesture</em>' attribute.
   * @see org.applause.lang.applauseDsl.GestureKind
   * @see #setGesture(GestureKind)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIAction_Gesture()
   * @model
   * @generated
   */
  GestureKind getGesture();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIAction#getGesture <em>Gesture</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gesture</em>' attribute.
   * @see org.applause.lang.applauseDsl.GestureKind
   * @see #getGesture()
   * @generated
   */
  void setGesture(GestureKind value);

  /**
   * Returns the value of the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' attribute.
   * @see #setOrder(int)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIAction_Order()
   * @model
   * @generated
   */
  int getOrder();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIAction#getOrder <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' attribute.
   * @see #getOrder()
   * @generated
   */
  void setOrder(int value);

} // UIAction
