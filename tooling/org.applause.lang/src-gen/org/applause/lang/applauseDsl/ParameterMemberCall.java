/**
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Member Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ParameterMemberCall#getReference <em>Reference</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ParameterMemberCall#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getParameterMemberCall()
 * @model
 * @generated
 */
public interface ParameterMemberCall extends ParameterReference
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(ParameterReference)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getParameterMemberCall_Reference()
   * @model containment="true"
   * @generated
   */
  ParameterReference getReference();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ParameterMemberCall#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(ParameterReference value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' reference.
   * @see #setTail(Attribute)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getParameterMemberCall_Tail()
   * @model
   * @generated
   */
  Attribute getTail();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ParameterMemberCall#getTail <em>Tail</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' reference.
   * @see #getTail()
   * @generated
   */
  void setTail(Attribute value);

} // ParameterMemberCall
