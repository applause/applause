/**
 * <copyright>
 * </copyright>
 *
 */
package de.itemis.mobilizer.appModelDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.ContentProvider#isResolver <em>Resolver</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getType <em>Type</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.ContentProvider#isMany <em>Many</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getUrl <em>Url</em>}</li>
 *   <li>{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getContentProvider()
 * @model
 * @generated
 */
public interface ContentProvider extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Parameter)
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getContentProvider_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

  /**
   * Returns the value of the '<em><b>Resolver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolver</em>' attribute.
   * @see #setResolver(boolean)
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getContentProvider_Resolver()
   * @model
   * @generated
   */
  boolean isResolver();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#isResolver <em>Resolver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolver</em>' attribute.
   * @see #isResolver()
   * @generated
   */
  void setResolver(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getContentProvider_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(boolean)
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getContentProvider_Many()
   * @model
   * @generated
   */
  boolean isMany();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isMany()
   * @generated
   */
  void setMany(boolean value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' containment reference.
   * @see #setUrl(ScalarExpression)
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getContentProvider_Url()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getUrl();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getUrl <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' containment reference.
   * @see #getUrl()
   * @generated
   */
  void setUrl(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' containment reference.
   * @see #setSelection(ScalarExpression)
   * @see de.itemis.mobilizer.appModelDsl.AppModelDslPackage#getContentProvider_Selection()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getSelection();

  /**
   * Sets the value of the '{@link de.itemis.mobilizer.appModelDsl.ContentProvider#getSelection <em>Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection</em>' containment reference.
   * @see #getSelection()
   * @generated
   */
  void setSelection(ScalarExpression value);

} // ContentProvider
