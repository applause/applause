package org.applause.lang.generator.ios.model;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.model.EntityInterfaceCompiler;
import org.applause.lang.generator.ios.model.EntityModuleCompiler;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class EntityCompiler {
  @Inject
  @Extension
  private EntityInterfaceCompiler _entityInterfaceCompiler;
  
  @Inject
  @Extension
  private EntityModuleCompiler _entityModuleCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_iterable, Entity.class);
    final Procedure1<Entity> _function = new Procedure1<Entity>() {
      public void apply(final Entity it) {
        String _interfaceFileName = EntityCompiler.this._entityInterfaceCompiler.interfaceFileName(it);
        CharSequence _compileInterface = EntityCompiler.this._entityInterfaceCompiler.compileInterface(it);
        fsa.generateFile(_interfaceFileName, _compileInterface);
        String _moduleFileName = EntityCompiler.this._entityModuleCompiler.moduleFileName(it);
        CharSequence _compileModule = EntityCompiler.this._entityModuleCompiler.compileModule(it);
        fsa.generateFile(_moduleFileName, _compileModule);
      }
    };
    IterableExtensions.<Entity>forEach(_filter, _function);
  }
}
