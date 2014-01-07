/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RESTURL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.RESTURL#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getRESTURL()
 * @model
 * @generated
 */
public interface RESTURL extends EObject
{
  /**
   * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.UrlFragment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fragments</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getRESTURL_Fragments()
   * @model containment="true"
   * @generated
   */
  EList<UrlFragment> getFragments();

} // RESTURL
