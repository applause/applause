package org.applause.lang.generator.ios.dataaccess;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.EntityExtensions;
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessExtensions;
import org.applause.lang.generator.ios.model.EntityModelExtensions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EntityDataAccessHeaderFileCompiler {
  @Inject
  @Extension
  private EntityModelExtensions _entityModelExtensions;
  
  @Inject
  @Extension
  private EntityExtensions _entityExtensions;
  
  @Inject
  @Extension
  private EntityDataAccessExtensions _entityDataAccessExtensions;
  
  public CharSequence compileHeaderFile(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    _builder.append("#import \"");
    String _headerFileName = this._entityModelExtensions.headerFileName(it);
    _builder.append(_headerFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@interface ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(" (DataAccess)");
    _builder.newLineIfNotEmpty();
    _builder.append("+ (void)");
    String _listAllMethodName = this._entityDataAccessExtensions.listAllMethodName(it);
    _builder.append(_listAllMethodName, "");
    _builder.append(":(void (^)(NSArray *");
    String _parameterName = this._entityDataAccessExtensions.parameterName(it);
    String _plural = this._entityDataAccessExtensions.plural(_parameterName);
    _builder.append(_plural, "");
    _builder.append(", NSError *error))block;");
    _builder.newLineIfNotEmpty();
    _builder.append("- (void)post:(void (^)(");
    String _modelClassName = this._entityExtensions.modelClassName(it);
    _builder.append(_modelClassName, "");
    _builder.append(" *");
    String _parameterName_1 = this._entityDataAccessExtensions.parameterName(it);
    _builder.append(_parameterName_1, "");
    _builder.append(", NSError *error))block;");
    _builder.newLineIfNotEmpty();
    _builder.append("- (void)put:(void (^)(");
    String _modelClassName_1 = this._entityExtensions.modelClassName(it);
    _builder.append(_modelClassName_1, "");
    _builder.append(" *");
    String _parameterName_2 = this._entityDataAccessExtensions.parameterName(it);
    _builder.append(_parameterName_2, "");
    _builder.append(", NSError *error))block;");
    _builder.newLineIfNotEmpty();
    _builder.append("- (void)remove:(void (^)(");
    String _modelClassName_2 = this._entityExtensions.modelClassName(it);
    _builder.append(_modelClassName_2, "");
    _builder.append(" *");
    String _parameterName_3 = this._entityDataAccessExtensions.parameterName(it);
    _builder.append(_parameterName_3, "");
    _builder.append(", NSError *error))block;");
    _builder.newLineIfNotEmpty();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
