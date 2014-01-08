/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen Section Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ScreenSectionItems#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenSectionItems()
 * @model
 * @generated
 */
public interface ScreenSectionItems extends EObject
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.ScreenListItemCell}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenSectionItems_Items()
   * @model containment="true"
   * @generated
   */
  EList<ScreenListItemCell> getItems();

} // ScreenSectionItems
