package org.applause.lang.generator.ios.model;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.model.EntityExtensions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EntityModuleCompiler {
  @Inject
  @Extension
  private EntityExtensions _entityExtensions;
  
  public CharSequence superTypeImportDeclaration(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Entity _superType = it.getSuperType();
      boolean _notEquals = (!Objects.equal(_superType, null));
      if (_notEquals) {
        _builder.append("#import \"");
        Entity _superType_1 = it.getSuperType();
        String _headerFileName = this._entityExtensions.headerFileName(_superType_1);
        _builder.append(_headerFileName, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileModule(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    CharSequence _superTypeImportDeclaration = this.superTypeImportDeclaration(it);
    _builder.append(_superTypeImportDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@implementation ");
    String _name_1 = it.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
