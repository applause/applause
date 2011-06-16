/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.SimpleType#getPlatformType <em>Platform Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends Type
{
  /**
   * Returns the value of the '<em><b>Platform Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Platform Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Platform Type</em>' attribute.
   * @see #setPlatformType(String)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getSimpleType_PlatformType()
   * @model
   * @generated
   */
  String getPlatformType();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.SimpleType#getPlatformType <em>Platform Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Platform Type</em>' attribute.
   * @see #getPlatformType()
   * @generated
   */
  void setPlatformType(String value);

} // SimpleType
