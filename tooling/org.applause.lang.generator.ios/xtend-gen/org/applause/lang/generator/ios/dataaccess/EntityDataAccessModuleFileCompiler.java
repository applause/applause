package org.applause.lang.generator.ios.dataaccess;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EntityDataAccessModuleFileCompiler {
  @Inject
  @Extension
  private EntityDataAccessExtensions _entityDataAccessExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  public String listAllUrlConstantName(final Entity it) {
    String _name = it.getName();
    String _plural = this._entityDataAccessExtensions.plural(_name);
    String _plus = ("kAll" + _plural);
    String _plus_1 = (_plus + "Path");
    return _plus_1;
  }
  
  public String listAllUrlPattern(final Entity it) {
    String _name = it.getName();
    String _plural = this._entityDataAccessExtensions.plural(_name);
    String _firstLower = StringExtensions.toFirstLower(_plural);
    String _plus = ("/" + _firstLower);
    return _plus;
  }
  
  public String putUrlConstantName(final Entity it) {
    String _name = it.getName();
    String _plus = ("kPut" + _name);
    String _plus_1 = (_plus + "Path");
    return _plus_1;
  }
  
  public String putUrlPattern(final Entity it) {
    String _name = it.getName();
    String _plural = this._entityDataAccessExtensions.plural(_name);
    String _firstLower = StringExtensions.toFirstLower(_plural);
    String _plus = ("/" + _firstLower);
    return _plus;
  }
  
  public String postUrlConstantName(final Entity it) {
    String _name = it.getName();
    String _plus = ("kPost" + _name);
    String _plus_1 = (_plus + "Path");
    return _plus_1;
  }
  
  public String postUrlPattern(final Entity it) {
    String _name = it.getName();
    String _plural = this._entityDataAccessExtensions.plural(_name);
    String _firstLower = StringExtensions.toFirstLower(_plural);
    String _plus = ("/" + _firstLower);
    return _plus;
  }
  
  public String deleteUrlConstantName(final Entity it) {
    String _name = it.getName();
    String _plus = ("kDelete" + _name);
    String _plus_1 = (_plus + "Path");
    return _plus_1;
  }
  
  public String deleteUrlPattern(final Entity it) {
    String _name = it.getName();
    String _plural = this._entityDataAccessExtensions.plural(_name);
    String _firstLower = StringExtensions.toFirstLower(_plural);
    String _plus = ("/" + _firstLower);
    String _plus_1 = (_plus + "/%@");
    return _plus_1;
  }
  
  public String apiClientClassName(final Entity it) {
    String _name = it.getName();
    String _plus = (_name + "APIClient");
    return _plus;
  }
  
  public String headerFileName(final String className) {
    String _plus = (className + ".h");
    return _plus;
  }
  
  public String mappingClassName(final Entity it) {
    String _typeName = this._typeExtensions.typeName(it);
    String _plus = (_typeName + "+");
    String _plus_1 = (_plus + "DataMapping");
    return _plus_1;
  }
  
  public CharSequence compileModuleFile(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    String _headerFileName = this._entityDataAccessExtensions.headerFileName(it);
    _builder.append(_headerFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"");
    String _apiClientClassName = this.apiClientClassName(it);
    String _headerFileName_1 = this.headerFileName(_apiClientClassName);
    _builder.append(_headerFileName_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"");
    String _mappingClassName = this.mappingClassName(it);
    String _headerFileName_2 = this.headerFileName(_mappingClassName);
    _builder.append(_headerFileName_2, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("static NSString *const ");
    String _listAllUrlConstantName = this.listAllUrlConstantName(it);
    _builder.append(_listAllUrlConstantName, "");
    _builder.append(" = @\"");
    String _listAllUrlPattern = this.listAllUrlPattern(it);
    _builder.append(_listAllUrlPattern, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("static NSString *const ");
    String _postUrlConstantName = this.postUrlConstantName(it);
    _builder.append(_postUrlConstantName, "");
    _builder.append(" = @\"");
    String _postUrlPattern = this.postUrlPattern(it);
    _builder.append(_postUrlPattern, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("static NSString *const ");
    String _putUrlConstantName = this.putUrlConstantName(it);
    _builder.append(_putUrlConstantName, "");
    _builder.append(" = @\"");
    String _putUrlPattern = this.putUrlPattern(it);
    _builder.append(_putUrlPattern, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("static NSString *const ");
    String _deleteUrlConstantName = this.deleteUrlConstantName(it);
    _builder.append(_deleteUrlConstantName, "");
    _builder.append(" = @\"");
    String _deleteUrlPattern = this.deleteUrlPattern(it);
    _builder.append(_deleteUrlPattern, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@implementation ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(" (DataAccess)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("+ (void)");
    String _listAllMethodName = this._entityDataAccessExtensions.listAllMethodName(it);
    _builder.append(_listAllMethodName, "");
    _builder.append(":(void (^)(NSArray *");
    String _parameterName = this._entityDataAccessExtensions.parameterName(it);
    String _plural = this._entityDataAccessExtensions.plural(_parameterName);
    _builder.append(_plural, "");
    _builder.append(", NSError *error))block");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[");
    String _apiClientClassName_1 = this.apiClientClassName(it);
    _builder.append(_apiClientClassName_1, "	");
    _builder.append(" sharedClient] GET:");
    String _listAllUrlConstantName_1 = this.listAllUrlConstantName(it);
    _builder.append(_listAllUrlConstantName_1, "	");
    _builder.append(" parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLineIfNotEmpty();
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
    String _typeName = this._typeExtensions.typeName(it);
    _builder.append(_typeName, "			");
    _builder.append(" *mappedElement = [[");
    String _typeName_1 = this._typeExtensions.typeName(it);
    _builder.append(_typeName_1, "			");
    _builder.append(" alloc] initWithAttributes:attributes];");
    _builder.newLineIfNotEmpty();
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
    _builder.append("- (void)post:(void (^)(");
    String _typeName_2 = this._typeExtensions.typeName(it);
    _builder.append(_typeName_2, "");
    _builder.append(" *");
    String _parameterName_1 = this._entityDataAccessExtensions.parameterName(it);
    _builder.append(_parameterName_1, "");
    _builder.append(", NSError *error))block");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSDictionary *elementDictionary = [self attributes];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[");
    String _apiClientClassName_2 = this.apiClientClassName(it);
    _builder.append(_apiClientClassName_2, "	");
    _builder.append(" sharedClient] POST:");
    String _postUrlConstantName_1 = this.postUrlConstantName(it);
    _builder.append(_postUrlConstantName_1, "	");
    _builder.append(" parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    String _typeName_3 = this._typeExtensions.typeName(it);
    _builder.append(_typeName_3, "		");
    _builder.append(" *postedElement = responseObject;");
    _builder.newLineIfNotEmpty();
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
    _builder.append("- (void)put:(void (^)(");
    String _typeName_4 = this._typeExtensions.typeName(it);
    _builder.append(_typeName_4, "");
    _builder.append(" *");
    String _parameterName_2 = this._entityDataAccessExtensions.parameterName(it);
    _builder.append(_parameterName_2, "");
    _builder.append(", NSError *error))block");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSDictionary *elementDictionary = [self attributes];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[");
    String _apiClientClassName_3 = this.apiClientClassName(it);
    _builder.append(_apiClientClassName_3, "	");
    _builder.append(" sharedClient] PUT:");
    String _putUrlConstantName_1 = this.putUrlConstantName(it);
    _builder.append(_putUrlConstantName_1, "	");
    _builder.append(" parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    String _typeName_5 = this._typeExtensions.typeName(it);
    _builder.append(_typeName_5, "		");
    _builder.append(" *postedElement = responseObject;");
    _builder.newLineIfNotEmpty();
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
    _builder.append("- (void)remove:(void (^)(");
    String _typeName_6 = this._typeExtensions.typeName(it);
    _builder.append(_typeName_6, "");
    _builder.append(" *");
    String _parameterName_3 = this._entityDataAccessExtensions.parameterName(it);
    _builder.append(_parameterName_3, "");
    _builder.append(", NSError *error))block");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSString *urlString = [NSString stringWithFormat:");
    String _deleteUrlConstantName_1 = this.deleteUrlConstantName(it);
    _builder.append(_deleteUrlConstantName_1, "	");
    _builder.append(", self.id];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("[[");
    String _apiClientClassName_4 = this.apiClientClassName(it);
    _builder.append(_apiClientClassName_4, "	");
    _builder.append(" sharedClient] DELETE:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLineIfNotEmpty();
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
    return _builder;
  }
}
