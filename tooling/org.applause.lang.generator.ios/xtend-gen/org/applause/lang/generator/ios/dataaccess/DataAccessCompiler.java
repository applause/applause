package org.applause.lang.generator.ios.dataaccess;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.ICompilerModule;
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
    Iterable<Entity> _filter = Iterables.<Entity>filter(_iterable, Entity.class);
    final Procedure1<Entity> _function = new Procedure1<Entity>() {
      public void apply(final Entity it) {
        String _entityDataAccessCategoryHeaderFileName = DataAccessCompiler.this._dataAccessClassExtensions.entityDataAccessCategoryHeaderFileName(it);
        CharSequence _compileHeaderFile = DataAccessCompiler.this._entityDataAccessHeaderFileCompiler.compileHeaderFile(it);
        fsa.generateFile(_entityDataAccessCategoryHeaderFileName, _compileHeaderFile);
        String _entityDataAccessCategoryModuleFileName = DataAccessCompiler.this._dataAccessClassExtensions.entityDataAccessCategoryModuleFileName(it);
        CharSequence _compileModuleFile = DataAccessCompiler.this._entityDataAccessModuleFileCompiler.compileModuleFile(it);
        fsa.generateFile(_entityDataAccessCategoryModuleFileName, _compileModuleFile);
      }
    };
    IterableExtensions.<Entity>forEach(_filter, _function);
  }
}
