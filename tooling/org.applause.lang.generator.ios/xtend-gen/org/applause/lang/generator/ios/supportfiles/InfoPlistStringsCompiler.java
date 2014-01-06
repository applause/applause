package org.applause.lang.generator.ios.supportfiles;

import com.google.inject.Inject;
import org.applause.lang.generator.ios.ICompilerModule;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.generator.ios.supportfiles.InfoPlistStringsFileCompiler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class InfoPlistStringsCompiler implements ICompilerModule {
  @Inject
  @Extension
  private InfoPlistStringsFileCompiler _infoPlistStringsFileCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    CharSequence _compilePlistStringsFile = this._infoPlistStringsFileCompiler.compilePlistStringsFile();
    fsa.generateFile("InfoPlist.strings", IosOutputConfigurationProvider.IOS_OUTPUT_SUPPORTFILES_LOCALIZED_EN, _compilePlistStringsFile);
  }
}
