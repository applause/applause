package org.applause.lang.generator.ios.dataaccess;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.FileNameExtensions;
import org.applause.lang.generator.ios.ICompilerModule;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.generator.ios.dataaccess.APIClientClassExtensions;
import org.applause.lang.generator.ios.dataaccess.APIClientHeaderFileCompiler;
import org.applause.lang.generator.ios.dataaccess.APIClientModuleFileCompiler;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class APIClientCompiler implements ICompilerModule {
  @Inject
  @Extension
  private FileNameExtensions _fileNameExtensions;
  
  @Inject
  @Extension
  private APIClientClassExtensions _aPIClientClassExtensions;
  
  @Inject
  @Extension
  private APIClientHeaderFileCompiler _aPIClientHeaderFileCompiler;
  
  @Inject
  @Extension
  private APIClientModuleFileCompiler _aPIClientModuleFileCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_iterable, Entity.class);
    final Procedure1<Entity> _function = new Procedure1<Entity>() {
      public void apply(final Entity it) {
        String _apiClientClassName = APIClientCompiler.this._aPIClientClassExtensions.apiClientClassName(it);
        String _headerFileName = APIClientCompiler.this._fileNameExtensions.headerFileName(_apiClientClassName);
        CharSequence _compileHeaderFile = APIClientCompiler.this._aPIClientHeaderFileCompiler.compileHeaderFile(it);
        fsa.generateFile(_headerFileName, IosOutputConfigurationProvider.IOS_OUTPUT_DATAACCESS, _compileHeaderFile);
        String _apiClientClassName_1 = APIClientCompiler.this._aPIClientClassExtensions.apiClientClassName(it);
        String _moduleFileName = APIClientCompiler.this._fileNameExtensions.moduleFileName(_apiClientClassName_1);
        CharSequence _compileModuleFile = APIClientCompiler.this._aPIClientModuleFileCompiler.compileModuleFile(it);
        fsa.generateFile(_moduleFileName, IosOutputConfigurationProvider.IOS_OUTPUT_DATAACCESS, _compileModuleFile);
      }
    };
    IterableExtensions.<Entity>forEach(_filter, _function);
  }
}
