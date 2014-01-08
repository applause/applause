/**
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Member Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.EntityMemberCall#getHead <em>Head</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.EntityMemberCall#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getEntityMemberCall()
 * @model
 * @generated
 */
public interface EntityMemberCall extends Expression
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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getEntityMemberCall_Head()
   * @model
   * @generated
   */
  Attribute getHead();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.EntityMemberCall#getHead <em>Head</em>}' reference.
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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getEntityMemberCall_Tail()
   * @model containment="true"
   * @generated
   */
  EntityMemberCallTail getTail();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.EntityMemberCall#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(EntityMemberCallTail value);

} // EntityMemberCall
