/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Split</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.StringSplit#getValue <em>Value</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.StringSplit#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getStringSplit()
 * @model
 * @generated
 */
public interface StringSplit extends CollectionFunction
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getStringSplit_Value()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getValue();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.StringSplit#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Delimiter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delimiter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delimiter</em>' containment reference.
   * @see #setDelimiter(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getStringSplit_Delimiter()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getDelimiter();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.StringSplit#getDelimiter <em>Delimiter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delimiter</em>' containment reference.
   * @see #getDelimiter()
   * @generated
   */
  void setDelimiter(ScalarExpression value);

} // StringSplit
