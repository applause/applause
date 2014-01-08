package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.APIClientGeneratorEntityAPIClientSpec;
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
@Named("API Client Code")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class APIClientGeneratorEntityAPIClientAPIClientCodeSpec extends APIClientGeneratorEntityAPIClientSpec {
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
    _builder.append("#import \"AFHTTPSessionManager.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@interface PersonAPIClient : AFHTTPSessionManager");
    _builder.newLine();
    _builder.append("+ (PersonAPIClient *)sharedClient;");
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
    _builder.append("#import \"PersonAPIClient.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("static NSString *const kBaseUrl = @\"http://localhost:2403\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@implementation PersonAPIClient");
    _builder.newLine();
    _builder.newLine();
    _builder.append("+ (PersonAPIClient *)sharedClient {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static dispatch_once_t onceToken;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static PersonAPIClient *defaultInstance = nil;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("dispatch_once(&onceToken, ^{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("defaultInstance = [[PersonAPIClient alloc] initWithBaseURL:[NSURL URLWithString:kBaseUrl]];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return defaultInstance;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (instancetype)initWithBaseURL:(NSURL *)url");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("self = [super initWithBaseURL:url];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (self) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AFJSONResponseSerializer *responseSerializer = [AFJSONResponseSerializer serializer];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("responseSerializer.readingOptions = NSJSONReadingAllowFragments;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.responseSerializer = responseSerializer;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.requestSerializer = [AFJSONRequestSerializer serializer];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return self;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    this.isGeneratedModuleFileFromModel(_builder, "Person", this.simplePersonEntity);
  }
}
