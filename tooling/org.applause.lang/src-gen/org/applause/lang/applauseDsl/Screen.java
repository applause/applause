/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.Screen#getKind <em>Kind</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Screen#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Screen#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Screen#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreen()
 * @model
 * @generated
 */
public interface Screen extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.lang.applauseDsl.ScreenKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.applause.lang.applauseDsl.ScreenKind
   * @see #setKind(ScreenKind)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreen_Kind()
   * @model
   * @generated
   */
  ScreenKind getKind();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Screen#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.applause.lang.applauseDsl.ScreenKind
   * @see #getKind()
   * @generated
   */
  void setKind(ScreenKind value);

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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreen_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Screen#getTitle <em>Title</em>}' attribute.
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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreen_Datasource()
   * @model containment="true"
   * @generated
   */
  DataSourceCall getDatasource();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Screen#getDatasource <em>Datasource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datasource</em>' containment reference.
   * @see #getDatasource()
   * @generated
   */
  void setDatasource(DataSourceCall value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.ScreenSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreen_Sections()
   * @model containment="true"
   * @generated
   */
  EList<ScreenSection> getSections();

} // Screen
