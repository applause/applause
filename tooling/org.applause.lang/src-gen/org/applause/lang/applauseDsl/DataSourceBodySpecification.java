/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Body Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.DataSourceBodySpecification#getBodycontents <em>Bodycontents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSourceBodySpecification()
 * @model
 * @generated
 */
public interface DataSourceBodySpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Bodycontents</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bodycontents</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bodycontents</em>' reference.
   * @see #setBodycontents(Parameter)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSourceBodySpecification_Bodycontents()
   * @model
   * @generated
   */
  Parameter getBodycontents();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.DataSourceBodySpecification#getBodycontents <em>Bodycontents</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bodycontents</em>' reference.
   * @see #getBodycontents()
   * @generated
   */
  void setBodycontents(Parameter value);

} // DataSourceBodySpecification
