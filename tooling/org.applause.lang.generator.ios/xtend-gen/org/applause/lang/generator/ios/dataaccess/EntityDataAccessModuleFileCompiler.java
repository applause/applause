package org.applause.lang.generator.ios.dataaccess;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.RESTSpecification;
import org.applause.lang.applauseDsl.RESTURL;
import org.applause.lang.applauseDsl.RESTVerb;
import org.applause.lang.generator.ios.FileNameExtensions;
import org.applause.lang.generator.ios.dataaccess.APIClientClassExtensions;
import org.applause.lang.generator.ios.dataaccess.DataAccessClassExtensions;
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessExtensions;
import org.applause.lang.generator.ios.dataaccess.RESTURLExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.emf.common.util.EList;
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
  
  @Inject
  @Extension
  private FileNameExtensions _fileNameExtensions;
  
  @Inject
  @Extension
  private RESTURLExtensions _rESTURLExtensions;
  
  public String mappingClassName(final Entity it) {
    String _typeName = this._typeExtensions.typeName(it);
    String _plus = (_typeName + "+");
    String _plus_1 = (_plus + "DataMapping");
    return _plus_1;
  }
  
  @Inject
  @Extension
  private APIClientClassExtensions _aPIClientClassExtensions;
  
  @Inject
  @Extension
  private DataAccessClassExtensions _dataAccessClassExtensions;
  
  public CharSequence compileModuleFile(final DataSource it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    Entity _resourceType = it.getResourceType();
    String _entityDataAccessCategoryHeaderFileName = this._dataAccessClassExtensions.entityDataAccessCategoryHeaderFileName(_resourceType);
    _builder.append(_entityDataAccessCategoryHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"");
    Entity _resourceType_1 = it.getResourceType();
    String _apiClientClassName = this._aPIClientClassExtensions.apiClientClassName(_resourceType_1);
    String _headerFileName = this._fileNameExtensions.headerFileName(_apiClientClassName);
    _builder.append(_headerFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"");
    Entity _resourceType_2 = it.getResourceType();
    String _mappingClassName = this.mappingClassName(_resourceType_2);
    String _headerFileName_1 = this._fileNameExtensions.headerFileName(_mappingClassName);
    _builder.append(_headerFileName_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@implementation ");
    Entity _resourceType_3 = it.getResourceType();
    String _typeName = this._typeExtensions.typeName(_resourceType_3);
    _builder.append(_typeName, "");
    _builder.append(" (DataAccess)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<DataSourceAccessMethod> _methods = it.getMethods();
      for(final DataSourceAccessMethod method : _methods) {
        CharSequence _compileRESTMethod = this.compileRESTMethod(method);
        _builder.append(_compileRESTMethod, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileRESTMethod(final DataSourceAccessMethod it) {
    CharSequence _switchResult = null;
    RESTSpecification _restSpecification = it.getRestSpecification();
    RESTVerb _verb = _restSpecification.getVerb();
    final RESTVerb _switchValue = _verb;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,RESTVerb.GET)) {
        _matched=true;
        CharSequence _compileGETLISTMethod = this.compileGETLISTMethod(it);
        _switchResult = _compileGETLISTMethod;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,RESTVerb.POST)) {
        _matched=true;
        CharSequence _compilePOSTMethod = this.compilePOSTMethod(it);
        _switchResult = _compilePOSTMethod;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,RESTVerb.PUT)) {
        _matched=true;
        CharSequence _compilePUTMethod = this.compilePUTMethod(it);
        _switchResult = _compilePUTMethod;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,RESTVerb.DELETE)) {
        _matched=true;
        CharSequence _compileDELETEMethod = this.compileDELETEMethod(it);
        _switchResult = _compileDELETEMethod;
      }
    }
    return _switchResult;
  }
  
  public String urlConstantForRESTMethod(final DataSourceAccessMethod it) {
    String _name = it.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("k" + _firstUpper);
    String _plus_1 = (_plus + "Path");
    return _plus_1;
  }
  
  public CharSequence compileGETLISTMethod(final DataSourceAccessMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("static NSString *const ");
    String _urlConstantForRESTMethod = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod, "");
    _builder.append(" = @\"");
    RESTSpecification _restSpecification = it.getRestSpecification();
    RESTURL _path = _restSpecification.getPath();
    String _value = this._rESTURLExtensions.value(_path);
    _builder.append(_value, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("+ (void)");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(":(void (^)(NSArray *");
    Entity _resourceType = this._entityDataAccessExtensions.resourceType(it);
    String _parameterName = this._entityDataAccessExtensions.parameterName(_resourceType);
    String _plural = this._entityDataAccessExtensions.plural(_parameterName);
    _builder.append(_plural, "");
    _builder.append(", NSError *error))block");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[");
    Entity _resourceType_1 = this._entityDataAccessExtensions.resourceType(it);
    String _apiClientClassName = this._aPIClientClassExtensions.apiClientClassName(_resourceType_1);
    _builder.append(_apiClientClassName, "	");
    _builder.append(" sharedClient] GET:");
    String _urlConstantForRESTMethod_1 = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod_1, "	");
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
    Entity _resourceType_2 = this._entityDataAccessExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType_2);
    _builder.append(_typeName, "			");
    _builder.append(" *mappedElement = [[");
    Entity _resourceType_3 = this._entityDataAccessExtensions.resourceType(it);
    String _typeName_1 = this._typeExtensions.typeName(_resourceType_3);
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
    return _builder;
  }
  
  public CharSequence compilePOSTMethod(final DataSourceAccessMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("static NSString *const ");
    String _urlConstantForRESTMethod = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod, "");
    _builder.append(" = @\"");
    RESTSpecification _restSpecification = it.getRestSpecification();
    RESTURL _path = _restSpecification.getPath();
    String _value = this._rESTURLExtensions.value(_path);
    _builder.append(_value, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("- (void)");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(":(void (^)(");
    String _parameterList = this._entityDataAccessExtensions.parameterList(it);
    _builder.append(_parameterList, "");
    _builder.append(", NSError *error))block");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSDictionary *elementDictionary = [self attributes];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[");
    Entity _resourceType = this._entityDataAccessExtensions.resourceType(it);
    String _apiClientClassName = this._aPIClientClassExtensions.apiClientClassName(_resourceType);
    _builder.append(_apiClientClassName, "	");
    _builder.append(" sharedClient] POST:");
    String _urlConstantForRESTMethod_1 = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod_1, "	");
    _builder.append(" parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    Entity _resourceType_1 = this._entityDataAccessExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName, "		");
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
    return _builder;
  }
  
  public CharSequence compilePUTMethod(final DataSourceAccessMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("static NSString *const ");
    String _urlConstantForRESTMethod = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod, "");
    _builder.append(" = @\"");
    RESTSpecification _restSpecification = it.getRestSpecification();
    RESTURL _path = _restSpecification.getPath();
    String _value = this._rESTURLExtensions.value(_path);
    _builder.append(_value, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("- (void)");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(":(void (^)(");
    String _parameterList = this._entityDataAccessExtensions.parameterList(it);
    _builder.append(_parameterList, "");
    _builder.append(", NSError *error))block");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSDictionary *elementDictionary = [self attributes];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[");
    Entity _resourceType = this._entityDataAccessExtensions.resourceType(it);
    String _apiClientClassName = this._aPIClientClassExtensions.apiClientClassName(_resourceType);
    _builder.append(_apiClientClassName, "	");
    _builder.append(" sharedClient] PUT:");
    String _urlConstantForRESTMethod_1 = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod_1, "	");
    _builder.append(" parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    Entity _resourceType_1 = this._entityDataAccessExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName, "		");
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
    return _builder;
  }
  
  public CharSequence compileDELETEMethod(final DataSourceAccessMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("static NSString *const ");
    String _urlConstantForRESTMethod = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod, "");
    _builder.append(" = @\"");
    RESTSpecification _restSpecification = it.getRestSpecification();
    RESTURL _path = _restSpecification.getPath();
    String _value = this._rESTURLExtensions.value(_path);
    _builder.append(_value, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("- (void)");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(":(void (^)(");
    String _parameterList = this._entityDataAccessExtensions.parameterList(it);
    _builder.append(_parameterList, "");
    _builder.append(", NSError *error))block");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSString *urlString = [NSString stringWithFormat:");
    String _urlConstantForRESTMethod_1 = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod_1, "	");
    _builder.append(", self.id];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("[[");
    Entity _resourceType = this._entityDataAccessExtensions.resourceType(it);
    String _apiClientClassName = this._aPIClientClassExtensions.apiClientClassName(_resourceType);
    _builder.append(_apiClientClassName, "	");
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
    return _builder;
  }
}
