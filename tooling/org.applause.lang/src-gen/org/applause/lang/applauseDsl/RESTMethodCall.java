/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.RESTMethodCall#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.RESTMethodCall#getRestMethod <em>Rest Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getRESTMethodCall()
 * @model
 * @generated
 */
public interface RESTMethodCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Datasource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datasource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datasource</em>' reference.
   * @see #setDatasource(DataSourceCall)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getRESTMethodCall_Datasource()
   * @model
   * @generated
   */
  DataSourceCall getDatasource();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.RESTMethodCall#getDatasource <em>Datasource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datasource</em>' reference.
   * @see #getDatasource()
   * @generated
   */
  void setDatasource(DataSourceCall value);

  /**
   * Returns the value of the '<em><b>Rest Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rest Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rest Method</em>' reference.
   * @see #setRestMethod(DataSourceAccessMethod)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getRESTMethodCall_RestMethod()
   * @model
   * @generated
   */
  DataSourceAccessMethod getRestMethod();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.RESTMethodCall#getRestMethod <em>Rest Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest Method</em>' reference.
   * @see #getRestMethod()
   * @generated
   */
  void setRestMethod(DataSourceAccessMethod value);

} // RESTMethodCall
