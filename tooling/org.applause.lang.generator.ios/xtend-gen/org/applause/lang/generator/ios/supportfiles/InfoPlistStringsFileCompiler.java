package org.applause.lang.generator.ios.supportfiles;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InfoPlistStringsFileCompiler {
  public final static String PACKAGENAME = "org.applause";
  
  public CharSequence compilePlistStringsFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* Localized versions of Info.plist keys */");
    _builder.newLine();
    return _builder;
  }
}
