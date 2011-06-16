/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Open</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ExternalOpen#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getExternalOpen()
 * @model
 * @generated
 */
public interface ExternalOpen extends ViewAction
{
  /**
   * Returns the value of the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' containment reference.
   * @see #setUrl(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getExternalOpen_Url()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getUrl();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ExternalOpen#getUrl <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' containment reference.
   * @see #getUrl()
   * @generated
   */
  void setUrl(ScalarExpression value);

} // ExternalOpen
