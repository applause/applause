package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.MainClassGeneratorSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Any model will result in the following implementation code for `main.m`:
 */
@Named("Main class")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class MainClassGeneratorMainClassSpec extends MainClassGeneratorSpec {
  /**
   * @filter('''|.isGenerated.*)
   */
  @Test
  @Named("Implementation file")
  @Order(1)
  public void _implementationFile() throws Exception {
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
    this.isGeneratedModuleFile(_builder);
  }
}
