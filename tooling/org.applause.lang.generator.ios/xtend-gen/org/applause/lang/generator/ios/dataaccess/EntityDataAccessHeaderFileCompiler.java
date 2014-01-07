package org.applause.lang.generator.ios.dataaccess;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.RESTSpecification;
import org.applause.lang.applauseDsl.RESTVerb;
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessExtensions;
import org.applause.lang.generator.ios.model.EntityClassExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EntityDataAccessHeaderFileCompiler {
  @Inject
  @Extension
  private EntityClassExtensions _entityClassExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private EntityDataAccessExtensions _entityDataAccessExtensions;
  
  public CharSequence compileHeaderFile(final DataSource it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    _builder.append("#import \"");
    Entity _resourceType = it.getResourceType();
    String _entityModelHeaderFileName = this._entityClassExtensions.entityModelHeaderFileName(_resourceType);
    _builder.append(_entityModelHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@interface ");
    Entity _resourceType_1 = it.getResourceType();
    String _typeName = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName, "");
    _builder.append(" (DataAccess)");
    _builder.newLineIfNotEmpty();
    {
      EList<DataSourceAccessMethod> _methods = it.getMethods();
      for(final DataSourceAccessMethod method : _methods) {
        CharSequence _compileRESTMethod = this.compileRESTMethod(method);
        _builder.append(_compileRESTMethod, "");
        _builder.newLineIfNotEmpty();
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
  
  public CharSequence compileGETLISTMethod(final DataSourceAccessMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("+ (void)");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(":(void (^)(NSArray *");
    Entity _resourceType = this._entityDataAccessExtensions.resourceType(it);
    String _parameterName = this._entityDataAccessExtensions.parameterName(_resourceType);
    String _plural = this._entityDataAccessExtensions.plural(_parameterName);
    _builder.append(_plural, "");
    _builder.append(", NSError *error))block;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilePOSTMethod(final DataSourceAccessMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- (void)");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(":(void (^)(");
    String _parameterList = this._entityDataAccessExtensions.parameterList(it);
    _builder.append(_parameterList, "");
    _builder.append(", NSError *error))block;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilePUTMethod(final DataSourceAccessMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- (void)");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(":(void (^)(");
    String _parameterList = this._entityDataAccessExtensions.parameterList(it);
    _builder.append(_parameterList, "");
    _builder.append(", NSError *error))block;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileDELETEMethod(final DataSourceAccessMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- (void)");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(":(void (^)(");
    String _parameterList = this._entityDataAccessExtensions.parameterList(it);
    _builder.append(_parameterList, "");
    _builder.append(", NSError *error))block;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
