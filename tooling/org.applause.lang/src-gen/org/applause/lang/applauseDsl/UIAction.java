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
 *   <li>{@link org.applause.lang.applauseDsl.UIAction#getKind <em>Kind</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.UIAction#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.UIAction#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.UIAction#getAction <em>Action</em>}</li>
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
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.lang.applauseDsl.UIActionKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.applause.lang.applauseDsl.UIActionKind
   * @see #setKind(UIActionKind)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIAction_Kind()
   * @model
   * @generated
   */
  UIActionKind getKind();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIAction#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.applause.lang.applauseDsl.UIActionKind
   * @see #getKind()
   * @generated
   */
  void setKind(UIActionKind value);

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

} // UIAction
