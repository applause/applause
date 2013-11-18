package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.EntityDataAccessGeneratorGeneratingEntitiesSpec;
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
@Named("Data Access Code")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class EntityDataAccessGeneratorGeneratingEntitiesDataAccessCodeSpec extends EntityDataAccessGeneratorGeneratingEntitiesSpec {
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
    _builder.append("@interface Person (DataAccess)");
    _builder.newLine();
    _builder.append("+ (void)allPersons:(void (^)(NSArray *persons, NSError *error))block;");
    _builder.newLine();
    _builder.append("- (void)post:(void (^)(Person *person, NSError *error))block;");
    _builder.newLine();
    _builder.append("- (void)put:(void (^)(Person *person, NSError *error))block;");
    _builder.newLine();
    _builder.append("- (void)remove:(void (^)(Person *person, NSError *error))block;");
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
    _builder.append("#import \"Person+DataAccess.h\"");
    _builder.newLine();
    _builder.append("#import \"PersonAPIClient.h\"");
    _builder.newLine();
    _builder.append("#import \"Person+DataMapping.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("static NSString *const kAllPersonsPath = @\"/persons\";");
    _builder.newLine();
    _builder.append("static NSString *const kPostPersonPath = @\"/persons\";");
    _builder.newLine();
    _builder.append("static NSString *const kPutPersonPath = @\"/persons\";");
    _builder.newLine();
    _builder.append("static NSString *const kDeletePersonPath = @\"/persons/%@\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@implementation Person (DataAccess)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("+ (void)allPersons:(void (^)(NSArray *persons, NSError *error))block");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[PersonAPIClient sharedClient] GET:kAllPersonsPath parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NSArray *elementsFromJSON = responseObject;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NSMutableArray *result = [[NSMutableArray alloc] initWithCapacity:[elementsFromJSON count]];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (NSDictionary *attributes in elementsFromJSON) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Person *mappedElement = [[Person alloc] initWithAttributes:attributes];");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("[result addObject:mappedElement];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (block) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("block([result copy], nil);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} failure:^(NSURLSessionDataTask *task, NSError *error)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (block) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("block(@[], error);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)post:(void (^)(Person *person, NSError *error))block");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSDictionary *elementDictionary = [self attributes];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[PersonAPIClient sharedClient] POST:kPostPersonPath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Person *postedElement = responseObject;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(block) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("block(postedElement, nil);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} failure:^(NSURLSessionDataTask *task, NSError *error)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(block) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("block(nil, error);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)put:(void (^)(Person *person, NSError *error))block");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSDictionary *elementDictionary = [self attributes];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[PersonAPIClient sharedClient] PUT:kPutPersonPath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Person *postedElement = responseObject;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(block) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("block(postedElement, nil);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} failure:^(NSURLSessionDataTask *task, NSError *error)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(block) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("block(nil, error);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)remove:(void (^)(Person *person, NSError *error))block");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSString *urlString = [NSString stringWithFormat:kDeletePersonPath, self.id];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[PersonAPIClient sharedClient] DELETE:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(block) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("block(self, nil);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} failure:^(NSURLSessionDataTask *task, NSError *error)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(block) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("block(nil, error);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    this.isGeneratedModuleFileFromModel(_builder, "Person", this.simplePersonEntity);
  }
}
