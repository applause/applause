/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.StringConcat#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getStringConcat()
 * @model
 * @generated
 */
public interface StringConcat extends StringFunction
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mobilizer.appModelDsl.ScalarExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getStringConcat_Values()
   * @model containment="true"
   * @generated
   */
  EList<ScalarExpression> getValues();

} // StringConcat
