package org.applause.lang.generator.ios.dataaccess;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.ICompilerModule;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.generator.ios.dataaccess.DataAccessClassExtensions;
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessHeaderFileCompiler;
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessModuleFileCompiler;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DataAccessCompiler implements ICompilerModule {
  @Inject
  @Extension
  private EntityDataAccessHeaderFileCompiler _entityDataAccessHeaderFileCompiler;
  
  @Inject
  @Extension
  private EntityDataAccessModuleFileCompiler _entityDataAccessModuleFileCompiler;
  
  @Inject
  @Extension
  private DataAccessClassExtensions _dataAccessClassExtensions;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<DataSource> _filter = Iterables.<DataSource>filter(_iterable, DataSource.class);
    final Procedure1<DataSource> _function = new Procedure1<DataSource>() {
      public void apply(final DataSource it) {
        Entity _resourceType = it.getResourceType();
        String _entityDataAccessCategoryHeaderFileName = DataAccessCompiler.this._dataAccessClassExtensions.entityDataAccessCategoryHeaderFileName(_resourceType);
        CharSequence _compileHeaderFile = DataAccessCompiler.this._entityDataAccessHeaderFileCompiler.compileHeaderFile(it);
        fsa.generateFile(_entityDataAccessCategoryHeaderFileName, IosOutputConfigurationProvider.IOS_OUTPUT_DATAACCESS, _compileHeaderFile);
        Entity _resourceType_1 = it.getResourceType();
        String _entityDataAccessCategoryModuleFileName = DataAccessCompiler.this._dataAccessClassExtensions.entityDataAccessCategoryModuleFileName(_resourceType_1);
        CharSequence _compileModuleFile = DataAccessCompiler.this._entityDataAccessModuleFileCompiler.compileModuleFile(it);
        fsa.generateFile(_entityDataAccessCategoryModuleFileName, IosOutputConfigurationProvider.IOS_OUTPUT_DATAACCESS, _compileModuleFile);
      }
    };
    IterableExtensions.<DataSource>forEach(_filter, _function);
  }
}
