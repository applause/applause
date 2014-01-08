/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.AttributeReference#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getAttributeReference()
 * @model
 * @generated
 */
public interface AttributeReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(Attribute)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getAttributeReference_Value()
   * @model
   * @generated
   */
  Attribute getValue();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.AttributeReference#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Attribute value);

} // AttributeReference
