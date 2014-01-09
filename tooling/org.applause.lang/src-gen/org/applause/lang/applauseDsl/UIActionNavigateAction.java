/**
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Action Navigate Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.UIActionNavigateAction#getTargetScreen <em>Target Screen</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.UIActionNavigateAction#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIActionNavigateAction()
 * @model
 * @generated
 */
public interface UIActionNavigateAction extends UIActionSpecification
{
  /**
   * Returns the value of the '<em><b>Target Screen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Screen</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Screen</em>' reference.
   * @see #setTargetScreen(Screen)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIActionNavigateAction_TargetScreen()
   * @model
   * @generated
   */
  Screen getTargetScreen();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIActionNavigateAction#getTargetScreen <em>Target Screen</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Screen</em>' reference.
   * @see #getTargetScreen()
   * @generated
   */
  void setTargetScreen(Screen value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(ReferrableElement)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getUIActionNavigateAction_Variable()
   * @model
   * @generated
   */
  ReferrableElement getVariable();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.UIActionNavigateAction#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(ReferrableElement value);

} // UIActionNavigateAction
