package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.EntityGeneratorSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * A simple entity like this:
 * 
 * <pre class="prettyprint linenums lang-applause">
 * entity Person {
 * }
 * </pre>
 * 
 * will result in the following header and implementation files:
 */
@Named("Simple Entities")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class EntityGeneratorSimpleEntitiesSpec extends EntityGeneratorSpec {
  final String simplePersonEntity = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity Person {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  /**
   * @filter('''|.isGeneratedHeaderFileFromModel.*)
   */
  @Test
  @Named("Header File")
  @Order(1)
  public void _headerFile() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@interface Person : NSObject");
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    this.isGeneratedHeaderFileFromModel(_builder, "Person", this.simplePersonEntity);
  }
  
  /**
   * @filter('''|.isGeneratedHeaderFileFromModel.*)
   */
  @Test
  @Named("Implementation file")
  @Order(2)
  public void _implementationFile() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"Person.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@implementation Person");
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    this.isGeneratedModuleFileFromModel(_builder, "Person", this.simplePersonEntity);
  }
}
