/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Component Member Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.UIComponentMemberCall#getComponent <em>Component</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.UIComponentMemberCall#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIComponentMemberCall()
 * @model
 * @generated
 */
public interface UIComponentMemberCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(UIComponentMemberDeclaration)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIComponentMemberCall_Component()
   * @model
   * @generated
   */
  UIComponentMemberDeclaration getComponent();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIComponentMemberCall#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(UIComponentMemberDeclaration value);

  /**
   * Returns the value of the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' reference.
   * @see #setMember(UIComponentMemberDeclaration)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIComponentMemberCall_Member()
   * @model
   * @generated
   */
  UIComponentMemberDeclaration getMember();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIComponentMemberCall#getMember <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' reference.
   * @see #getMember()
   * @generated
   */
  void setMember(UIComponentMemberDeclaration value);

} // UIComponentMemberCall
