package org.applause.lang.generator.ios.model;

import org.applause.lang.applauseDsl.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityModuleCompiler {
  public String moduleFileName(final Entity it) {
    String _name = it.getName();
    String _plus = (_name + ".m");
    return _plus;
  }
  
  public CharSequence compileModule(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.append("@implementation ");
    String _name_1 = it.getName();
    _builder.append(_name_1, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
