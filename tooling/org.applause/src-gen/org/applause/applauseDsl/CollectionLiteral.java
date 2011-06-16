/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applauseDsl.CollectionLiteral#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applauseDsl.ApplauseDslPackage#getCollectionLiteral()
 * @model
 * @generated
 */
public interface CollectionLiteral extends Expression, CollectionExpression
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.applauseDsl.ScalarExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.applause.applauseDsl.ApplauseDslPackage#getCollectionLiteral_Items()
   * @model containment="true"
   * @generated
   */
  EList<ScalarExpression> getItems();

} // CollectionLiteral
