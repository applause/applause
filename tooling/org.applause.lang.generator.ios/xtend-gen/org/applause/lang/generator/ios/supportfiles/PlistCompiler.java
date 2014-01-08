package org.applause.lang.generator.ios.supportfiles;

import com.google.inject.Inject;
import org.applause.lang.generator.ios.ICompilerModule;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.generator.ios.supportfiles.PlistFileCompiler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PlistCompiler implements ICompilerModule {
  @Inject
  @Extension
  private PlistFileCompiler _plistFileCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    CharSequence _compilePlistFile = this._plistFileCompiler.compilePlistFile();
    fsa.generateFile("Application-Info.plist", IosOutputConfigurationProvider.IOS_OUTPUT_SUPPORTFILES, _compilePlistFile);
  }
}
