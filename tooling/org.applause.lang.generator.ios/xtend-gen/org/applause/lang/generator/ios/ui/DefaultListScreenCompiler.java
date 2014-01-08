package org.applause.lang.generator.ios.ui;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.generator.ios.ICompilerModule;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.generator.ios.ui.DefaultListScreenHeaderFileCompiler;
import org.applause.lang.generator.ios.ui.DefaultListScreenModuleFileCompiler;
import org.applause.lang.generator.ios.ui.ScreenClassExtensions;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DefaultListScreenCompiler implements ICompilerModule {
  @Inject
  @Extension
  private DefaultListScreenHeaderFileCompiler _defaultListScreenHeaderFileCompiler;
  
  @Inject
  @Extension
  private DefaultListScreenModuleFileCompiler _defaultListScreenModuleFileCompiler;
  
  @Inject
  @Extension
  private ScreenClassExtensions _screenClassExtensions;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Screen> _filter = Iterables.<Screen>filter(_iterable, Screen.class);
    final Procedure1<Screen> _function = new Procedure1<Screen>() {
      public void apply(final Screen it) {
        String _screenHeaderFileName = DefaultListScreenCompiler.this._screenClassExtensions.screenHeaderFileName(it);
        CharSequence _compileHeader = DefaultListScreenCompiler.this._defaultListScreenHeaderFileCompiler.compileHeader(it);
        fsa.generateFile(_screenHeaderFileName, IosOutputConfigurationProvider.IOS_OUTPUT_CONTROLLERS, _compileHeader);
        String _screenModuleFileName = DefaultListScreenCompiler.this._screenClassExtensions.screenModuleFileName(it);
        CharSequence _compileModule = DefaultListScreenCompiler.this._defaultListScreenModuleFileCompiler.compileModule(it);
        fsa.generateFile(_screenModuleFileName, IosOutputConfigurationProvider.IOS_OUTPUT_CONTROLLERS, _compileModule);
      }
    };
    IterableExtensions.<Screen>forEach(_filter, _function);
  }
}
