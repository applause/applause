package org.applause.lang.generator.ios;

import com.google.common.collect.Iterables;
import org.applause.lang.generator.ios.ICompilerModule;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class AbstractCompilerModule<T extends Object> implements ICompilerModule {
  public abstract String headerFileName(final T it);
  
  public abstract String moduleFileName(final T it);
  
  public abstract CharSequence compileHeaderFile(final T it);
  
  public abstract CharSequence compileModuleFile(final T it);
  
  public abstract Class<T> clazz();
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Class<T> _clazz = this.clazz();
    Iterable<T> _filter = Iterables.<T>filter(_iterable, _clazz);
    final Procedure1<T> _function = new Procedure1<T>() {
      public void apply(final T it) {
        String _headerFileName = AbstractCompilerModule.this.headerFileName(it);
        CharSequence _compileHeaderFile = AbstractCompilerModule.this.compileHeaderFile(it);
        fsa.generateFile(_headerFileName, _compileHeaderFile);
        String _moduleFileName = AbstractCompilerModule.this.moduleFileName(it);
        CharSequence _compileModuleFile = AbstractCompilerModule.this.compileModuleFile(it);
        fsa.generateFile(_moduleFileName, _compileModuleFile);
      }
    };
    IterableExtensions.<T>forEach(_filter, _function);
  }
}
