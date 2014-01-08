package org.applause.lang.generator.ios.ui;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenKind;
import org.applause.lang.generator.ios.ICompilerModule;
import org.applause.lang.generator.ios.ui.DefaultListScreenCompiler;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ScreenCompiler implements ICompilerModule {
  @Inject
  private DefaultListScreenCompiler defaultListScreenCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Screen> _filter = Iterables.<Screen>filter(_iterable, Screen.class);
    final Procedure1<Screen> _function = new Procedure1<Screen>() {
      public void apply(final Screen it) {
        ScreenKind _kind = it.getKind();
        final ScreenKind getKind = _kind;
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(getKind,ScreenKind.DEFAULT_LIST)) {
            _matched=true;
            ScreenCompiler.this.defaultListScreenCompiler.doGenerate(resource, fsa);
          }
        }
      }
    };
    IterableExtensions.<Screen>forEach(_filter, _function);
  }
}
