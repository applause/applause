package org.applause.lang.generator.ios.supportfiles;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PrecompiledHeaderFileCompiler {
  public CharSequence compileHeaderFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Availability.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifndef __IPHONE_3_0");
    _builder.newLine();
    _builder.append("#warning \"This project uses features only available in iOS SDK 3.0 and later.\"");
    _builder.newLine();
    _builder.append("#endif");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifdef __OBJC__");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("#import <UIKit/UIKit.h>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    _builder.append("#endif\t");
    _builder.newLine();
    return _builder;
  }
}
