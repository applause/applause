/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.DataSource#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.DataSource#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.DataSource#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Base Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Url</em>' containment reference.
   * @see #setBaseUrl(AbsoluteRESTURL)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSource_BaseUrl()
   * @model containment="true"
   * @generated
   */
  AbsoluteRESTURL getBaseUrl();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.DataSource#getBaseUrl <em>Base Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Url</em>' containment reference.
   * @see #getBaseUrl()
   * @generated
   */
  void setBaseUrl(AbsoluteRESTURL value);

  /**
   * Returns the value of the '<em><b>Resource Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Type</em>' reference.
   * @see #setResourceType(Entity)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSource_ResourceType()
   * @model
   * @generated
   */
  Entity getResourceType();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.DataSource#getResourceType <em>Resource Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Type</em>' reference.
   * @see #getResourceType()
   * @generated
   */
  void setResourceType(Entity value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.DataSourceAccessMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getDataSource_Methods()
   * @model containment="true"
   * @generated
   */
  EList<DataSourceAccessMethod> getMethods();

} // DataSource
