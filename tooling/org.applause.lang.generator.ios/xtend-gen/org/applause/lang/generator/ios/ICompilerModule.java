package org.applause.lang.generator.ios;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public interface ICompilerModule {
  public abstract void doGenerate(final Resource resource, final IFileSystemAccess fsa);
}
