/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Provider Construction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getSimpleProviderConstruction()
 * @model
 * @generated
 */
public interface SimpleProviderConstruction extends ProviderConstruction
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getSimpleProviderConstruction_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // SimpleProviderConstruction
