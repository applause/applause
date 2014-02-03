package org.applause.specification.data;

import org.applause.specification.data.ScalarDataTypesSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
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
    throw new Error("Unresolved compilation problems:"
      + "\nAmbiguous feature call.\nThe extension methods\n\tisValid(CharSequence) in ApplauseValidationTestHelper and\n\tisValid(CharSequence) in ApplauseValidationTestHelper\nboth match.");
  }
  
  /**
   * Data types must be unique. Currently, this means they must be unique across the board and __cannot__
   * be namespaced.
   * @filter('''|.hasDuplicateDatatype)
   */
  @Test
  @Named("Data types must be unique")
  @Order(2)
  public void _dataTypesMustBeUnique() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("datatype String");
    _builder.newLine();
    _builder.append("datatype String // <-- invalid");
    _builder.newLine();
    this._scalarDataTypesValidationTestHelper.hasDuplicateDatatype(_builder);
  }
}
