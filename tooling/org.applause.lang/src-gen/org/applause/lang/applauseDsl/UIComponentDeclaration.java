/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Component Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.UIComponentDeclaration#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIComponentDeclaration()
 * @model
 * @generated
 */
public interface UIComponentDeclaration extends NamedElement, UIComponentOrDataType
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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIComponentDeclaration_Members()
   * @model containment="true"
   * @generated
   */
  EList<UIComponentMemberDeclaration> getMembers();

} // UIComponentDeclaration
