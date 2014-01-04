package org.applause.lang.generator.ios.supportfiles;

import com.google.inject.Inject;
import org.applause.lang.generator.ios.ICompilerModule;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.generator.ios.supportfiles.MainClassModuleFileCompiler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class MainClassCompiler implements ICompilerModule {
  @Inject
  @Extension
  private MainClassModuleFileCompiler _mainClassModuleFileCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    CharSequence _compileModuleFile = this._mainClassModuleFileCompiler.compileModuleFile();
    fsa.generateFile("main.m", IosOutputConfigurationProvider.IOS_OUTPUT_SUPPORTFILES, _compileModuleFile);
  }
}
