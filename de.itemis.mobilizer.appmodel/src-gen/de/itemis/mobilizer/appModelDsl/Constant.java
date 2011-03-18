/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.Constant#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends VariableDeclaration
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
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getConstant_Value()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getValue();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.Constant#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ScalarExpression value);

} // Constant
