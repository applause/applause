/**
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage
 * @generated
 */
public interface ApplauseDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplauseDslFactory eINSTANCE = org.applause.lang.applauseDsl.impl.ApplauseDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Element</em>'.
   * @generated
   */
  NamedElement createNamedElement();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Platform</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Platform</em>'.
   * @generated
   */
  Platform createPlatform();

  /**
   * Returns a new object of class '<em>Platform Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Platform Mapping</em>'.
   * @generated
   */
  PlatformMapping createPlatformMapping();

  /**
   * Returns a new object of class '<em>Type Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Mapping</em>'.
   * @generated
   */
  TypeMapping createTypeMapping();

  /**
   * Returns a new object of class '<em>Data Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Source</em>'.
   * @generated
   */
  DataSource createDataSource();

  /**
   * Returns a new object of class '<em>Data Source Access Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Source Access Method</em>'.
   * @generated
   */
  DataSourceAccessMethod createDataSourceAccessMethod();

  /**
   * Returns a new object of class '<em>REST Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>REST Specification</em>'.
   * @generated
   */
  RESTSpecification createRESTSpecification();

  /**
   * Returns a new object of class '<em>Data Source Body Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Source Body Specification</em>'.
   * @generated
   */
  DataSourceBodySpecification createDataSourceBodySpecification();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>RESTURL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RESTURL</em>'.
   * @generated
   */
  RESTURL createRESTURL();

  /**
   * Returns a new object of class '<em>Absolute RESTURL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Absolute RESTURL</em>'.
   * @generated
   */
  AbsoluteRESTURL createAbsoluteRESTURL();

  /**
   * Returns a new object of class '<em>Relative RESTURL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relative RESTURL</em>'.
   * @generated
   */
  RelativeRESTURL createRelativeRESTURL();

  /**
   * Returns a new object of class '<em>Url Fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Url Fragment</em>'.
   * @generated
   */
  UrlFragment createUrlFragment();

  /**
   * Returns a new object of class '<em>Url Path Fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Url Path Fragment</em>'.
   * @generated
   */
  UrlPathFragment createUrlPathFragment();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ApplauseDslPackage getApplauseDslPackage();

} //ApplauseDslFactory
