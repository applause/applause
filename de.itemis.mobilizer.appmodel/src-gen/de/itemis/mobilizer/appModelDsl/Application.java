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
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.Application#getName <em>Name</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.Application#getButtons <em>Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
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
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getApplication_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.Application#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mobilizer.appModelDsl.TabbarButton}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buttons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buttons</em>' containment reference list.
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getApplication_Buttons()
   * @model containment="true"
   * @generated
   */
  EList<TabbarButton> getButtons();

} // Application
