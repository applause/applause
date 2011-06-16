/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Provider Construction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction#getProvider <em>Provider</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getComplexProviderConstruction()
 * @model
 * @generated
 */
public interface ComplexProviderConstruction extends ProviderConstruction
{
  /**
   * Returns the value of the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' reference.
   * @see #setProvider(ContentProvider)
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getComplexProviderConstruction_Provider()
   * @model
   * @generated
   */
  ContentProvider getProvider();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction#getProvider <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provider</em>' reference.
   * @see #getProvider()
   * @generated
   */
  void setProvider(ContentProvider value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(Expression)
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getComplexProviderConstruction_Argument()
   * @model containment="true"
   * @generated
   */
  Expression getArgument();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(Expression value);

} // ComplexProviderConstruction
