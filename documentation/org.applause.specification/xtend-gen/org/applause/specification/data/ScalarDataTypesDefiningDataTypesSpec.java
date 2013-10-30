package org.applause.specification.data;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.Model;
import org.applause.specification.data.ScalarDataTypesSpec;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Data types can have any name and can be defined anywhere in your DSL program.
 */
@Named("Defining data types")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ScalarDataTypesDefiningDataTypesSpec extends ScalarDataTypesSpec {
  /**
   * New data types can be defined using the `datatype` keyword.
   * @filter('''|.isValid)
   */
  @Test
  @Named("Simple data types")
  @Order(1)
  public void _simpleDataTypes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("datatype String");
    _builder.newLine();
    _builder.append("datatype Integer");
    _builder.newLine();
    this._applauseValidationTestHelper.isValid(_builder);
  }
  
  public void hasDuplicateDatatype(final CharSequence sequence) {
    try {
      Model _parse = this._parseHelper.parse(sequence);
      EClass _dataType = ApplauseDslPackage.eINSTANCE.getDataType();
      this._applauseValidationTestHelper.assertError(_parse, _dataType, null, "Duplicate DataType \'String\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
