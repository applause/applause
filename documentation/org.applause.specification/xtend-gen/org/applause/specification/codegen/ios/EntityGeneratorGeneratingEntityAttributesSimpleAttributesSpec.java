package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.EntityGeneratorGeneratingEntityAttributesSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Simple attributes like these:
 * 
 * <pre class="prettyprint linenums lang-applause">
 * datatype String
 * entity Person {
 * 	String name
 * }
 * </pre>
 * 
 * will result in the following header and implementation files:
 */
@Named("Simple Attributes")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class EntityGeneratorGeneratingEntityAttributesSimpleAttributesSpec extends EntityGeneratorGeneratingEntityAttributesSpec {
  final String simplePersonEntity = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("datatype String");
      _builder.newLine();
      _builder.append("datatype Bool");
      _builder.newLine();
      _builder.append("entity Person {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String name");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Bool grownUp");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  /**
   * @filter('''|.isGenerated.*)
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
    _builder.append("@property (nonatomic, strong) NSString *name;");
    _builder.newLine();
    _builder.append("@property (nonatomic) BOOL grownUp;");
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    this.isGeneratedHeaderFileFromModel(_builder, "Person", this.simplePersonEntity);
  }
  
  /**
   * @filter('''|.isGenerated.*)
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
