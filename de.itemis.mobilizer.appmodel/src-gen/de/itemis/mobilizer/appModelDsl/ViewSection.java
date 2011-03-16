/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.ViewSection#getTitle <em>Title</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.ViewSection#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getViewSection()
 * @model
 * @generated
 */
public interface ViewSection extends EObject
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
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getViewSection_Title()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getTitle();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.ViewSection#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mobilizer.appModelDsl.SectionCell}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cells</em>' containment reference list.
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getViewSection_Cells()
   * @model containment="true"
   * @generated
   */
  EList<SectionCell> getCells();

} // ViewSection
