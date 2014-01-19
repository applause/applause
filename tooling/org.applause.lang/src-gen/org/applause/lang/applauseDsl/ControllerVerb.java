/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Verb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ControllerVerb#getKind <em>Kind</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ControllerVerb#getName <em>Name</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ControllerVerb#getDeclaredParameters <em>Declared Parameters</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ControllerVerb#getRestMethod <em>Rest Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getControllerVerb()
 * @model
 * @generated
 */
public interface ControllerVerb extends EObject
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.lang.applauseDsl.ControllerVerbKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.applause.lang.applauseDsl.ControllerVerbKind
   * @see #setKind(ControllerVerbKind)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getControllerVerb_Kind()
   * @model
   * @generated
   */
  ControllerVerbKind getKind();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ControllerVerb#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.applause.lang.applauseDsl.ControllerVerbKind
   * @see #getKind()
   * @generated
   */
  void setKind(ControllerVerbKind value);

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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getControllerVerb_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ControllerVerb#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Declared Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Parameters</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getControllerVerb_DeclaredParameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getDeclaredParameters();

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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getControllerVerb_RestMethod()
   * @model containment="true"
   * @generated
   */
  RESTMethodCall getRestMethod();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ControllerVerb#getRestMethod <em>Rest Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest Method</em>' containment reference.
   * @see #getRestMethod()
   * @generated
   */
  void setRestMethod(RESTMethodCall value);

} // ControllerVerb
