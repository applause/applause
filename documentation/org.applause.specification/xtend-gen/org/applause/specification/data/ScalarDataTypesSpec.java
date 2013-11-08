package org.applause.specification.data;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Model;
import org.applause.specification.ApplauseDslInjectorProvider;
import org.applause.specification.ApplauseDslTestCreator;
import org.applause.specification.data.ApplauseValidationTestHelper;
import org.applause.specification.data.ScalarDataTypesDefiningDataTypesSpec;
import org.applause.specification.data.ScalarDataTypesPlatformMappingSpec;
import org.applause.specification.data.ScalarDataTypesValidationTestHelper;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * Scalar data types make up the core of the Applause DSL. They are one of the central building blocks
 * for most of the other concepts in the Applause DSL.
 */
@Contains({ ScalarDataTypesDefiningDataTypesSpec.class, ScalarDataTypesPlatformMappingSpec.class })
@Named("Scalar Data Types")
@RunWith(ExampleGroupRunner.class)
@InjectWith(ApplauseDslInjectorProvider.class)
@CreateWith(ApplauseDslTestCreator.class)
@SuppressWarnings("all")
public class ScalarDataTypesSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ApplauseValidationTestHelper _applauseValidationTestHelper;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ScalarDataTypesValidationTestHelper _scalarDataTypesValidationTestHelper;
}
