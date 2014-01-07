/**
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute RESTURL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.AbsoluteRESTURL#getHost <em>Host</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.AbsoluteRESTURL#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getAbsoluteRESTURL()
 * @model
 * @generated
 */
public interface AbsoluteRESTURL extends RESTURL
{
  /**
   * Returns the value of the '<em><b>Host</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host</em>' containment reference.
   * @see #setHost(UrlFragment)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getAbsoluteRESTURL_Host()
   * @model containment="true"
   * @generated
   */
  UrlFragment getHost();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.AbsoluteRESTURL#getHost <em>Host</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host</em>' containment reference.
   * @see #getHost()
   * @generated
   */
  void setHost(UrlFragment value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(int)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getAbsoluteRESTURL_Port()
   * @model
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.AbsoluteRESTURL#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

} // AbsoluteRESTURL
