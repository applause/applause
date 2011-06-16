/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sectioned View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applauseDsl.SectionedView#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.applauseDsl.SectionedView#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applauseDsl.ApplauseDslPackage#getSectionedView()
 * @model
 * @generated
 */
public interface SectionedView extends View
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(ScalarExpression)
   * @see org.applause.applauseDsl.ApplauseDslPackage#getSectionedView_Title()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getTitle();

  /**
   * Sets the value of the '{@link org.applause.applauseDsl.SectionedView#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.applauseDsl.ViewSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.applause.applauseDsl.ApplauseDslPackage#getSectionedView_Sections()
   * @model containment="true"
   * @generated
   */
  EList<ViewSection> getSections();

} // SectionedView
