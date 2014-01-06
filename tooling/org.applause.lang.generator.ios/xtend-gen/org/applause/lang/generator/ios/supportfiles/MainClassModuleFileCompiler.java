package org.applause.lang.generator.ios.supportfiles;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MainClassModuleFileCompiler {
  public CharSequence compileModuleFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <UIKit/UIKit.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#import \"AppDelegate.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("int main(int argc, char * argv[])");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@autoreleasepool {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return UIApplicationMain(argc, argv, nil, NSStringFromClass([AppDelegate class]));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
