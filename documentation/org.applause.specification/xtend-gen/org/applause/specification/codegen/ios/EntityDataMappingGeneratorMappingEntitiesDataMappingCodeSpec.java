package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.EntityDataMappingGeneratorMappingEntitiesSpec;
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
 * datatype String
 * entity Person {
 * 	String name
 * }
 * </pre>
 * 
 * will result in the following header and implementation files:
 */
@Named("Data Mapping Code")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class EntityDataMappingGeneratorMappingEntitiesDataMappingCodeSpec extends EntityDataMappingGeneratorMappingEntitiesSpec {
  final String simplePersonEntity = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("datatype String");
      _builder.newLine();
      _builder.append("entity Person {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String name");
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
    _builder.append("#import \"Person.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@interface Person (DataMapping)");
    _builder.newLine();
    _builder.append("- (id)initWithAttributes:(NSDictionary *)attributes;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (NSDictionary *)attributes;");
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
    _builder.append("#import \"Person+DataMapping.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@implementation Person (DataMapping)");
    _builder.newLine();
    _builder.append("- (id)initWithAttributes:(NSDictionary *)attributes");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("self = [super init];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (self) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.name = [attributes valueForKeyPath:@\"name\"];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return self;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (NSDictionary *)attributes");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSMutableDictionary *attributes = [[NSMutableDictionary alloc] init];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (self.name != nil) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("attributes[@\"name\"] = self.name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return attributes;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    this.isGeneratedModuleFileFromModel(_builder, "Person", this.simplePersonEntity);
  }
}
