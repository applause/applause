/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Access Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#getName <em>Name</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#getDeclaredParameters <em>Declared Parameters</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#isReturnsMany <em>Returns Many</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#getRestSpecification <em>Rest Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSourceAccessMethod()
 * @model
 * @generated
 */
public interface DataSourceAccessMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSourceAccessMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Declared Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Parameters</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSourceAccessMethod_DeclaredParameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getDeclaredParameters();

  /**
   * Returns the value of the '<em><b>Returns Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Returns Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returns Many</em>' attribute.
   * @see #setReturnsMany(boolean)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSourceAccessMethod_ReturnsMany()
   * @model
   * @generated
   */
  boolean isReturnsMany();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#isReturnsMany <em>Returns Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returns Many</em>' attribute.
   * @see #isReturnsMany()
   * @generated
   */
  void setReturnsMany(boolean value);

  /**
   * Returns the value of the '<em><b>Rest Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rest Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rest Specification</em>' containment reference.
   * @see #setRestSpecification(RESTSpecification)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSourceAccessMethod_RestSpecification()
   * @model containment="true"
   * @generated
   */
  RESTSpecification getRestSpecification();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.DataSourceAccessMethod#getRestSpecification <em>Rest Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest Specification</em>' containment reference.
   * @see #getRestSpecification()
   * @generated
   */
  void setRestSpecification(RESTSpecification value);

} // DataSourceAccessMethod
