package org.applause.specification.codegen.ios;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.generator.ios.supportfiles.InfoPlistStringsFileCompiler;
import org.applause.specification.ApplauseDslInjectorProvider;
import org.applause.specification.ApplauseDslTestCreator;
import org.applause.specification.codegen.ios.InfoPlistStringsGeneratorPlistStringsFileSpec;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.Assert;
import org.junit.runner.RunWith;

@Contains(InfoPlistStringsGeneratorPlistStringsFileSpec.class)
@Named("Info Plist Strings Generator")
@RunWith(ExampleGroupRunner.class)
@InjectWith(ApplauseDslInjectorProvider.class)
@CreateWith(ApplauseDslTestCreator.class)
@SuppressWarnings("all")
public class InfoPlistStringsGeneratorSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public InfoPlistStringsFileCompiler _infoPlistStringsFileCompiler;
  
  public void isGeneratedModuleFile(final CharSequence expectedGeneratedCode) {
    final CharSequence result = this._infoPlistStringsFileCompiler.compilePlistStringsFile();
    String _string = result.toString();
    String _string_1 = expectedGeneratedCode.toString();
    Matcher<String> _equalTo = CoreMatchers.<String>equalTo(_string_1);
    Assert.<String>assertThat(_string, _equalTo);
  }
}
