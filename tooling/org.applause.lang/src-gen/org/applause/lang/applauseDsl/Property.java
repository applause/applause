/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.Property#isDerived <em>Derived</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Property#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends VariableDeclaration
{
  /**
   * Returns the value of the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Derived</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Derived</em>' attribute.
   * @see #setDerived(boolean)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getProperty_Derived()
   * @model
   * @generated
   */
  boolean isDerived();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Property#isDerived <em>Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Derived</em>' attribute.
   * @see #isDerived()
   * @generated
   */
  void setDerived(boolean value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(TypeDescription)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getProperty_Description()
   * @model containment="true"
   * @generated
   */
  TypeDescription getDescription();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Property#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(TypeDescription value);

} // Property
