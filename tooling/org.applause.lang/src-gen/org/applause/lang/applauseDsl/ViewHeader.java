/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ViewHeader#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ViewHeader#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ViewHeader#getDetails <em>Details</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ViewHeader#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getViewHeader()
 * @model
 * @generated
 */
public interface ViewHeader extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getViewHeader_Title()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getTitle();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ViewHeader#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtitle</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtitle</em>' containment reference.
   * @see #setSubtitle(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getViewHeader_Subtitle()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getSubtitle();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ViewHeader#getSubtitle <em>Subtitle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtitle</em>' containment reference.
   * @see #getSubtitle()
   * @generated
   */
  void setSubtitle(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Details</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' containment reference.
   * @see #setDetails(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getViewHeader_Details()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getDetails();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ViewHeader#getDetails <em>Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Details</em>' containment reference.
   * @see #getDetails()
   * @generated
   */
  void setDetails(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' containment reference.
   * @see #setImage(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getViewHeader_Image()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getImage();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ViewHeader#getImage <em>Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' containment reference.
   * @see #getImage()
   * @generated
   */
  void setImage(ScalarExpression value);

} // ViewHeader
