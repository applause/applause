/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.StringConcat#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getStringConcat()
 * @model
 * @generated
 */
public interface StringConcat extends StringFunction
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.ScalarExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getStringConcat_Values()
   * @model containment="true"
   * @generated
   */
  EList<ScalarExpression> getValues();

} // StringConcat
