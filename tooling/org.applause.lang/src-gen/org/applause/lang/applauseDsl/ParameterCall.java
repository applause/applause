/**
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ParameterCall#getHead <em>Head</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getParameterCall()
 * @model
 * @generated
 */
public interface ParameterCall extends ParameterReference
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' reference.
   * @see #setHead(Parameter)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getParameterCall_Head()
   * @model
   * @generated
   */
  Parameter getHead();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ParameterCall#getHead <em>Head</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Parameter value);

} // ParameterCall
