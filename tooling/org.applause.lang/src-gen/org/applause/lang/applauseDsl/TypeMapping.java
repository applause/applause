/**
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.TypeMapping#getType <em>Type</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.TypeMapping#getSimpleName <em>Simple Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getTypeMapping()
 * @model
 * @generated
 */
public interface TypeMapping extends PlatformMapping
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DataType)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getTypeMapping_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.TypeMapping#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

  /**
   * Returns the value of the '<em><b>Simple Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Name</em>' attribute.
   * @see #setSimpleName(String)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getTypeMapping_SimpleName()
   * @model
   * @generated
   */
  String getSimpleName();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.TypeMapping#getSimpleName <em>Simple Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Name</em>' attribute.
   * @see #getSimpleName()
   * @generated
   */
  void setSimpleName(String value);

} // TypeMapping
