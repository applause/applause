package org.applause.lang.generator.ios.dataaccess;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.RESTSpecification;
import org.applause.lang.applauseDsl.RESTURL;
import org.applause.lang.applauseDsl.RESTVerb;
import org.applause.lang.generator.ios.dataaccess.APIClientClassExtensions;
import org.applause.lang.generator.ios.dataaccess.DataAccessImportHelper;
import org.applause.lang.generator.ios.dataaccess.DataAccessMethodCompiler;
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessExtensions;
import org.applause.lang.generator.ios.dataaccess.RESTURLExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
  private RESTURLExtensions _rESTURLExtensions;
  
  @Inject
  @Extension
  private APIClientClassExtensions _aPIClientClassExtensions;
  
  @Inject
  @Extension
  private DataAccessImportHelper _dataAccessImportHelper;
  
  @Inject
  @Extension
  private DataAccessMethodCompiler _dataAccessMethodCompiler;
  
  public String mappingClassName(final Entity it) {
    String _typeName = this._typeExtensions.typeName(it);
    String _plus = (_typeName + "+");
    String _plus_1 = (_plus + "DataMapping");
    return _plus_1;
  }
  
  public CharSequence compileModuleFile(final DataSource it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compileModuleImports = this._dataAccessImportHelper.compileModuleImports(it);
    _builder.append(_compileModuleImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@implementation ");
    Entity _resourceType = it.getResourceType();
    String _typeName = this._typeExtensions.typeName(_resourceType);
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
        CharSequence _xifexpression = null;
        boolean _isReturnsMany = it.isReturnsMany();
        if (_isReturnsMany) {
          CharSequence _compileGETLISTMethod = this.compileGETLISTMethod(it);
          _xifexpression = _compileGETLISTMethod;
        } else {
          CharSequence _compileGETMethod = this.compileGETMethod(it);
          _xifexpression = _compileGETMethod;
        }
        _switchResult = _xifexpression;
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
    String _dataAccessMethodName = this._dataAccessMethodCompiler.dataAccessMethodName(it);
    _builder.append(_dataAccessMethodName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[[");
    Entity _resourceType = this._entityDataAccessExtensions.resourceType(it);
    String _apiClientClassName = this._aPIClientClassExtensions.apiClientClassName(_resourceType);
    _builder.append(_apiClientClassName, "\t");
    _builder.append(" sharedClient] GET:");
    String _urlConstantForRESTMethod_1 = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod_1, "\t");
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
    Entity _resourceType_1 = this._entityDataAccessExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName, "\t\t\t");
    _builder.append(" *mappedElement = [[");
    Entity _resourceType_2 = this._entityDataAccessExtensions.resourceType(it);
    String _typeName_1 = this._typeExtensions.typeName(_resourceType_2);
    _builder.append(_typeName_1, "\t\t\t");
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
    _builder.append("if (resultBlock) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resultBlock([result copy], nil);");
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
    _builder.append("if (resultBlock) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resultBlock(@[], error);");
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
  
  public CharSequence compileGETMethod(final DataSourceAccessMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// TODO generate GET method for single items:");
    _builder.newLine();
    _builder.append("// ");
    String _dataAccessMethodName = this._dataAccessMethodCompiler.dataAccessMethodName(it);
    _builder.append(_dataAccessMethodName, "");
    _builder.newLineIfNotEmpty();
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
    String _dataAccessMethodName = this._dataAccessMethodCompiler.dataAccessMethodName(it);
    _builder.append(_dataAccessMethodName, "");
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
    _builder.append(_apiClientClassName, "\t");
    _builder.append(" sharedClient] POST:");
    String _urlConstantForRESTMethod_1 = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod_1, "\t");
    _builder.append(" parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    Entity _resourceType_1 = this._entityDataAccessExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName, "\t\t");
    _builder.append(" *postedElement = responseObject;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if(resultBlock) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resultBlock(postedElement, nil);");
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
    _builder.append("if(resultBlock) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resultBlock(nil, error);");
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
    String _dataAccessMethodName = this._dataAccessMethodCompiler.dataAccessMethodName(it);
    _builder.append(_dataAccessMethodName, "");
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
    _builder.append(_apiClientClassName, "\t");
    _builder.append(" sharedClient] PUT:");
    String _urlConstantForRESTMethod_1 = this.urlConstantForRESTMethod(it);
    _builder.append(_urlConstantForRESTMethod_1, "\t");
    _builder.append(" parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    Entity _resourceType_1 = this._entityDataAccessExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName, "\t\t");
    _builder.append(" *postedElement = responseObject;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if(resultBlock) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resultBlock(postedElement, nil);");
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
    _builder.append("if(resultBlock) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resultBlock(nil, error);");
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
  
  public String composeUrlString(final DataSourceAccessMethod it) {
    String _urlConstantForRESTMethod = this.urlConstantForRESTMethod(it);
    String _plus = ("[NSString stringWithFormat:" + _urlConstantForRESTMethod);
    String _plus_1 = (_plus + 
      ", ");
    String _composeUrlVariables = this.composeUrlVariables(it);
    String _plus_2 = (_plus_1 + _composeUrlVariables);
    String _plus_3 = (_plus_2 + 
      "]");
    return _plus_3;
  }
  
  public String composeUrlVariables(final DataSourceAccessMethod it) {
    String _xblockexpression = null;
    {
      Parameter _parametersInEntity = this._dataAccessMethodCompiler.parametersInEntity(it);
      final String paramInEntity = _parametersInEntity.getName();
      RESTSpecification _restSpecification = it.getRestSpecification();
      RESTURL _path = _restSpecification.getPath();
      Iterable<String> _variables = this._rESTURLExtensions.variables(_path);
      final Function1<String,String> _function = new Function1<String,String>() {
        public String apply(final String it) {
          String _xifexpression = null;
          String _variableName = EntityDataAccessModuleFileCompiler.this.variableName(it);
          boolean _equals = Objects.equal(_variableName, paramInEntity);
          if (_equals) {
            String _variableTail = EntityDataAccessModuleFileCompiler.this.variableTail(it);
            String _plus = ("self" + _variableTail);
            _xifexpression = _plus;
          } else {
            _xifexpression = it;
          }
          return _xifexpression;
        }
      };
      Iterable<String> _map = IterableExtensions.<String, String>map(_variables, _function);
      String _join = IterableExtensions.join(_map, ", ");
      _xblockexpression = (_join);
    }
    return _xblockexpression;
  }
  
  private String variableName(final String variableExpression) {
    String _xblockexpression = null;
    {
      final int dot = variableExpression.indexOf(".");
      String _xifexpression = null;
      if ((dot > 0)) {
        String _substring = variableExpression.substring(0, dot);
        _xifexpression = _substring;
      } else {
        _xifexpression = variableExpression;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  private String variableTail(final String variableExpression) {
    String _xblockexpression = null;
    {
      final int dot = variableExpression.indexOf(".");
      String _xifexpression = null;
      if ((dot > 0)) {
        String _substring = variableExpression.substring(dot);
        _xifexpression = _substring;
      } else {
        _xifexpression = "";
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
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
    String _dataAccessMethodName = this._dataAccessMethodCompiler.dataAccessMethodName(it);
    _builder.append(_dataAccessMethodName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSString *urlString = ");
    String _composeUrlString = this.composeUrlString(it);
    _builder.append(_composeUrlString, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("[[");
    Entity _resourceType = this._entityDataAccessExtensions.resourceType(it);
    String _apiClientClassName = this._aPIClientClassExtensions.apiClientClassName(_resourceType);
    _builder.append(_apiClientClassName, "\t");
    _builder.append(" sharedClient] DELETE:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(resultBlock) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resultBlock(self, nil);");
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
    _builder.append("if(resultBlock) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resultBlock(nil, error);");
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
