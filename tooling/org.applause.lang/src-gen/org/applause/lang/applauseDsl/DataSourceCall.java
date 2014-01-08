/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.DataSourceCall#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.DataSourceCall#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSourceCall()
 * @model
 * @generated
 */
public interface DataSourceCall extends EObject
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
   * @see #setDatasource(DataSource)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSourceCall_Datasource()
   * @model
   * @generated
   */
  DataSource getDatasource();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.DataSourceCall#getDatasource <em>Datasource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datasource</em>' reference.
   * @see #getDatasource()
   * @generated
   */
  void setDatasource(DataSource value);

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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSourceCall_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.DataSourceCall#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // DataSourceCall
