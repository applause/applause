package org.applause.lang.generator.ios.ui;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenHeaderFileCompiler;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenModuleFileCompiler;
import org.applause.lang.generator.ios.ui.DefaultListScreenClassExtensions;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DefaultDetailsScreenCompiler {
  @Inject
  @Extension
  private DefaultDetailsScreenHeaderFileCompiler _defaultDetailsScreenHeaderFileCompiler;
  
  @Inject
  @Extension
  private DefaultDetailsScreenModuleFileCompiler _defaultDetailsScreenModuleFileCompiler;
  
  @Inject
  @Extension
  private DefaultListScreenClassExtensions _defaultListScreenClassExtensions;
  
  public void doGenerate(final Screen it, final IFileSystemAccess fsa) {
    String _screenHeaderFileName = this._defaultListScreenClassExtensions.screenHeaderFileName(it);
    CharSequence _compileHeader = this._defaultDetailsScreenHeaderFileCompiler.compileHeader(it);
    fsa.generateFile(_screenHeaderFileName, IosOutputConfigurationProvider.IOS_OUTPUT_CONTROLLERS, _compileHeader);
    String _screenModuleFileName = this._defaultListScreenClassExtensions.screenModuleFileName(it);
    CharSequence _compileModule = this._defaultDetailsScreenModuleFileCompiler.compileModule(it);
    fsa.generateFile(_screenModuleFileName, IosOutputConfigurationProvider.IOS_OUTPUT_CONTROLLERS, _compileModule);
  }
}
