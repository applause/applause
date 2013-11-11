package org.applause.lang.generator.ios.model;

import org.applause.lang.applauseDsl.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityInterfaceCompiler {
  public String interfaceFileName(final Entity it) {
    String _name = it.getName();
    String _plus = (_name + ".h");
    return _plus;
  }
  
  public CharSequence compileInterface(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@interface ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(": NSObject");
    _builder.newLineIfNotEmpty();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
