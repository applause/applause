package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.PrecompiledHeaderGeneratorSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Any model will result in the following implementation code for `Application-Prefix.pch`:
 */
@Named("Precompiled Header")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class PrecompiledHeaderGeneratorPrecompiledHeaderSpec extends PrecompiledHeaderGeneratorSpec {
  /**
   * @filter('''|.isGenerated.*)
   */
  @Test
  @Named("Header file")
  @Order(1)
  public void _headerFile() throws Exception {
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
    this.isGeneratedModuleFile(_builder);
  }
}
