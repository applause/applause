package org.applause.lang.generator.ios.dataaccess;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.FileNameExtensions;
import org.applause.lang.generator.ios.dataaccess.APIClientClassExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class APIClientModuleFileCompiler {
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private FileNameExtensions _fileNameExtensions;
  
  @Inject
  @Extension
  private APIClientClassExtensions _aPIClientClassExtensions;
  
  public String mappingClassName(final Entity it) {
    String _typeName = this._typeExtensions.typeName(it);
    String _plus = (_typeName + "+");
    String _plus_1 = (_plus + "DataMapping");
    return _plus_1;
  }
  
  public CharSequence compileModuleFile(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    String _apiClientClassName = this._aPIClientClassExtensions.apiClientClassName(it);
    String _headerFileName = this._fileNameExtensions.headerFileName(_apiClientClassName);
    _builder.append(_headerFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("static NSString *const kBaseUrl = @\"http://localhost:2403\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@implementation ");
    String _apiClientClassName_1 = this._aPIClientClassExtensions.apiClientClassName(it);
    _builder.append(_apiClientClassName_1, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("+ (");
    String _apiClientClassName_2 = this._aPIClientClassExtensions.apiClientClassName(it);
    _builder.append(_apiClientClassName_2, "");
    _builder.append(" *)sharedClient {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("static dispatch_once_t onceToken;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static ");
    String _apiClientClassName_3 = this._aPIClientClassExtensions.apiClientClassName(it);
    _builder.append(_apiClientClassName_3, "	");
    _builder.append(" *defaultInstance = nil;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("dispatch_once(&onceToken, ^{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("defaultInstance = [[");
    String _apiClientClassName_4 = this._aPIClientClassExtensions.apiClientClassName(it);
    _builder.append(_apiClientClassName_4, "		");
    _builder.append(" alloc] initWithBaseURL:[NSURL URLWithString:kBaseUrl]];");
    _builder.newLineIfNotEmpty();
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
    return _builder;
  }
}
