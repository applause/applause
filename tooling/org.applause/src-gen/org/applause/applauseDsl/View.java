/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applauseDsl.View#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applauseDsl.ApplauseDslPackage#getView()
 * @model
 * @generated
 */
public interface View extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(Parameter)
   * @see org.applause.applauseDsl.ApplauseDslPackage#getView_Content()
   * @model containment="true"
   * @generated
   */
  Parameter getContent();

  /**
   * Sets the value of the '{@link org.applause.applauseDsl.View#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(Parameter value);

} // View
