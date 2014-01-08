/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen List Item Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ScreenListItemCell#getType <em>Type</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ScreenListItemCell#getRestMethod <em>Rest Method</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ScreenListItemCell#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ScreenListItemCell#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenListItemCell()
 * @model
 * @generated
 */
public interface ScreenListItemCell extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ListItemCellDeclaration)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenListItemCell_Type()
   * @model
   * @generated
   */
  ListItemCellDeclaration getType();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ScreenListItemCell#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ListItemCellDeclaration value);

  /**
   * Returns the value of the '<em><b>Rest Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rest Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rest Method</em>' containment reference.
   * @see #setRestMethod(RESTMethodCall)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenListItemCell_RestMethod()
   * @model containment="true"
   * @generated
   */
  RESTMethodCall getRestMethod();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ScreenListItemCell#getRestMethod <em>Rest Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest Method</em>' containment reference.
   * @see #getRestMethod()
   * @generated
   */
  void setRestMethod(RESTMethodCall value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenListItemCell_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ScreenListItemCell#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

  /**
   * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.UIComponentMemberConfiguration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configurations</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getScreenListItemCell_Configurations()
   * @model containment="true"
   * @generated
   */
  EList<UIComponentMemberConfiguration> getConfigurations();

} // ScreenListItemCell
