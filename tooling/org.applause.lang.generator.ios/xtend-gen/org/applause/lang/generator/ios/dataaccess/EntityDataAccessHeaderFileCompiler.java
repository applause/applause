package org.applause.lang.generator.ios.dataaccess;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.dataaccess.DataAccessImportHelper;
import org.applause.lang.generator.ios.dataaccess.DataAccessMethodCompiler;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EntityDataAccessHeaderFileCompiler {
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private DataAccessMethodCompiler _dataAccessMethodCompiler;
  
  @Inject
  @Extension
  private DataAccessImportHelper _dataAccessImportHelper;
  
  public CharSequence compileHeaderFile(final DataSource it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compileHeaderImports = this._dataAccessImportHelper.compileHeaderImports(it);
    _builder.append(_compileHeaderImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@interface ");
    Entity _resourceType = it.getResourceType();
    String _typeName = this._typeExtensions.typeName(_resourceType);
    _builder.append(_typeName, "");
    _builder.append(" (DataAccess)");
    _builder.newLineIfNotEmpty();
    {
      EList<DataSourceAccessMethod> _methods = it.getMethods();
      for(final DataSourceAccessMethod method : _methods) {
        String _dataAccessMethodName = this._dataAccessMethodCompiler.dataAccessMethodName(method);
        _builder.append(_dataAccessMethodName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
