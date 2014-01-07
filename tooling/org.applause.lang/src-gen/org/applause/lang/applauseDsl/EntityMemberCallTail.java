/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Member Call Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.EntityMemberCallTail#getHead <em>Head</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.EntityMemberCallTail#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getEntityMemberCallTail()
 * @model
 * @generated
 */
public interface EntityMemberCallTail extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' reference.
   * @see #setHead(Attribute)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getEntityMemberCallTail_Head()
   * @model
   * @generated
   */
  Attribute getHead();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.EntityMemberCallTail#getHead <em>Head</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Attribute value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference.
   * @see #setTail(EntityMemberCallTail)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getEntityMemberCallTail_Tail()
   * @model containment="true"
   * @generated
   */
  EntityMemberCallTail getTail();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.EntityMemberCallTail#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(EntityMemberCallTail value);

} // EntityMemberCallTail
