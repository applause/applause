package org.applause.lang.generator.ios.dataaccess;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.model.EntityClassExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EntityDataMappingHeaderFileCompiler {
  @Inject
  @Extension
  private EntityClassExtensions _entityClassExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  public CharSequence compileHeaderFile(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    _builder.append("#import \"");
    String _entityModelHeaderFileName = this._entityClassExtensions.entityModelHeaderFileName(it);
    _builder.append(_entityModelHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@interface ");
    String _typeName = this._typeExtensions.typeName(it);
    _builder.append(_typeName, "");
    _builder.append(" (DataMapping)");
    _builder.newLineIfNotEmpty();
    _builder.append("- (id)initWithAttributes:(NSDictionary *)attributes;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (NSDictionary *)attributes;");
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
