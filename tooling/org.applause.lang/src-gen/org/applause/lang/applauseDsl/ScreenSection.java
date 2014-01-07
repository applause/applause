/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ScreenSection#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ScreenSection#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ScreenSection#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenSection()
 * @model
 * @generated
 */
public interface ScreenSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenSection_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ScreenSection#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Datasource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datasource</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datasource</em>' containment reference.
   * @see #setDatasource(DataSourceCall)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenSection_Datasource()
   * @model containment="true"
   * @generated
   */
  DataSourceCall getDatasource();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ScreenSection#getDatasource <em>Datasource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datasource</em>' containment reference.
   * @see #getDatasource()
   * @generated
   */
  void setDatasource(DataSourceCall value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference.
   * @see #setItems(ScreenSectionItems)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenSection_Items()
   * @model containment="true"
   * @generated
   */
  ScreenSectionItems getItems();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ScreenSection#getItems <em>Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Items</em>' containment reference.
   * @see #getItems()
   * @generated
   */
  void setItems(ScreenSectionItems value);

} // ScreenSection
