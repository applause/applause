/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Component Member Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.UIComponentMemberConfiguration#getType <em>Type</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.UIComponentMemberConfiguration#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIComponentMemberConfiguration()
 * @model
 * @generated
 */
public interface UIComponentMemberConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(UIComponentMemberCall)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIComponentMemberConfiguration_Type()
   * @model containment="true"
   * @generated
   */
  UIComponentMemberCall getType();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIComponentMemberConfiguration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(UIComponentMemberCall value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIComponentMemberConfiguration_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIComponentMemberConfiguration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // UIComponentMemberConfiguration
