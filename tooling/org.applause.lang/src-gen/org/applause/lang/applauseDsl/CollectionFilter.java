/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.CollectionFilter#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.CollectionFilter#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.CollectionFilter#getDistance <em>Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getCollectionFilter()
 * @model
 * @generated
 */
public interface CollectionFilter extends EObject
{
  /**
   * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Longitude</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Longitude</em>' containment reference.
   * @see #setLongitude(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getCollectionFilter_Longitude()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getLongitude();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.CollectionFilter#getLongitude <em>Longitude</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Longitude</em>' containment reference.
   * @see #getLongitude()
   * @generated
   */
  void setLongitude(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Latitude</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Latitude</em>' containment reference.
   * @see #setLatitude(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getCollectionFilter_Latitude()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getLatitude();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.CollectionFilter#getLatitude <em>Latitude</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Latitude</em>' containment reference.
   * @see #getLatitude()
   * @generated
   */
  void setLatitude(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Distance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distance</em>' attribute.
   * @see #setDistance(int)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getCollectionFilter_Distance()
   * @model
   * @generated
   */
  int getDistance();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.CollectionFilter#getDistance <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance</em>' attribute.
   * @see #getDistance()
   * @generated
   */
  void setDistance(int value);

} // CollectionFilter
