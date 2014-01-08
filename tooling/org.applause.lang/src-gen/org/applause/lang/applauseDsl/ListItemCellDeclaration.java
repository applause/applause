/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item Cell Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ListItemCellDeclaration#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getListItemCellDeclaration()
 * @model
 * @generated
 */
public interface ListItemCellDeclaration extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.UIComponentMemberDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getListItemCellDeclaration_Members()
   * @model containment="true"
   * @generated
   */
  EList<UIComponentMemberDeclaration> getMembers();

} // ListItemCellDeclaration
