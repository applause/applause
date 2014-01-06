package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.InfoPlistStringsGeneratorSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Any model will result in the following implementation code for `main.m`:
 */
@Named("Plist Strings file")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class InfoPlistStringsGeneratorPlistStringsFileSpec extends InfoPlistStringsGeneratorSpec {
  /**
   * @filter('''|.isGenerated.*)
   */
  @Test
  @Named("Plist Strings file")
  @Order(1)
  public void _plistStringsFile() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* Localized versions of Info.plist keys */");
    _builder.newLine();
    this.isGeneratedModuleFile(_builder);
  }
}
