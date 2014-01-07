/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.RESTSpecification#getVerb <em>Verb</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.RESTSpecification#getPath <em>Path</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.RESTSpecification#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getRESTSpecification()
 * @model
 * @generated
 */
public interface RESTSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Verb</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.lang.applauseDsl.RESTVerb}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verb</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verb</em>' attribute.
   * @see org.applause.lang.applauseDsl.RESTVerb
   * @see #setVerb(RESTVerb)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getRESTSpecification_Verb()
   * @model
   * @generated
   */
  RESTVerb getVerb();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.RESTSpecification#getVerb <em>Verb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verb</em>' attribute.
   * @see org.applause.lang.applauseDsl.RESTVerb
   * @see #getVerb()
   * @generated
   */
  void setVerb(RESTVerb value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(RESTURL)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getRESTSpecification_Path()
   * @model containment="true"
   * @generated
   */
  RESTURL getPath();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.RESTSpecification#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(RESTURL value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(DataSourceBodySpecification)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getRESTSpecification_Body()
   * @model containment="true"
   * @generated
   */
  DataSourceBodySpecification getBody();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.RESTSpecification#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(DataSourceBodySpecification value);

} // RESTSpecification
