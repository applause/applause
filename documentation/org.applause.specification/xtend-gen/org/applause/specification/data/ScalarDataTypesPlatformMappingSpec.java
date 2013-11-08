package org.applause.specification.data;

import org.applause.specification.data.ScalarDataTypesSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Applause supports mapping data types to platform types.
 */
@Named("Platform Mapping")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ScalarDataTypesPlatformMappingSpec extends ScalarDataTypesSpec {
  /**
   * The `platform` keyword can be used to define a platform.
   * @filter('''|.hasPlatform.*)
   */
  @Test
  @Named("Defining platforms")
  @Order(1)
  public void _definingPlatforms() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("platform iOS {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// platform-specific configurations");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._scalarDataTypesValidationTestHelper.hasPlatform(_builder, "iOS");
  }
  
  /**
   * This makes sense when you want to support multiple platforms. This way, you can use the
   * platform-independent data type name and do not need to care about what's the right type
   * on the target platform.
   * @filter('''|.hasPlatformTypeMapping.*)
   */
  @Test
  @Named("A data type can be mapped to a type in the target language")
  @Order(2)
  public void _aDataTypeCanBeMappedToATypeInTheTargetLanguage() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("datatype String");
    _builder.newLine();
    _builder.append("platform iOS {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("typemapping String -> NSString");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._scalarDataTypesValidationTestHelper.hasPlatformTypeMapping(_builder, "String", "NSString");
  }
}
