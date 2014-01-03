package org.applause.lang.generator.ios.dataaccess;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.ICompilerModule;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.generator.ios.dataaccess.DataMappingExtensions;
import org.applause.lang.generator.ios.dataaccess.EntityDataMappingHeaderFileCompiler;
import org.applause.lang.generator.ios.dataaccess.EntityDataMappingModuleFileCompiler;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DataMappingCompiler implements ICompilerModule {
  @Inject
  @Extension
  private DataMappingExtensions _dataMappingExtensions;
  
  @Inject
  @Extension
  private EntityDataMappingHeaderFileCompiler _entityDataMappingHeaderFileCompiler;
  
  @Inject
  @Extension
  private EntityDataMappingModuleFileCompiler _entityDataMappingModuleFileCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_iterable, Entity.class);
    final Procedure1<Entity> _function = new Procedure1<Entity>() {
      public void apply(final Entity it) {
        String _dataMappingHeaderFileName = DataMappingCompiler.this._dataMappingExtensions.dataMappingHeaderFileName(it);
        CharSequence _compileHeaderFile = DataMappingCompiler.this._entityDataMappingHeaderFileCompiler.compileHeaderFile(it);
        fsa.generateFile(_dataMappingHeaderFileName, IosOutputConfigurationProvider.IOS_DEFAULT_OUTPUT, _compileHeaderFile);
        String _dataMappingModuleFileName = DataMappingCompiler.this._dataMappingExtensions.dataMappingModuleFileName(it);
        CharSequence _compileModuleFile = DataMappingCompiler.this._entityDataMappingModuleFileCompiler.compileModuleFile(it);
        fsa.generateFile(_dataMappingModuleFileName, IosOutputConfigurationProvider.IOS_DEFAULT_OUTPUT, _compileModuleFile);
      }
    };
    IterableExtensions.<Entity>forEach(_filter, _function);
  }
}
