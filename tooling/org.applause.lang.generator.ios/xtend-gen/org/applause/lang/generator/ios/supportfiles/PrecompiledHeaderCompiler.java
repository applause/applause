package org.applause.lang.generator.ios.supportfiles;

import com.google.inject.Inject;
import org.applause.lang.generator.ios.ICompilerModule;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.generator.ios.supportfiles.PrecompiledHeaderFileCompiler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PrecompiledHeaderCompiler implements ICompilerModule {
  @Inject
  @Extension
  private PrecompiledHeaderFileCompiler _precompiledHeaderFileCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    CharSequence _compileHeaderFile = this._precompiledHeaderFileCompiler.compileHeaderFile();
    fsa.generateFile("Application-Prefix.pch", IosOutputConfigurationProvider.IOS_OUTPUT_SUPPORTFILES, _compileHeaderFile);
  }
}
