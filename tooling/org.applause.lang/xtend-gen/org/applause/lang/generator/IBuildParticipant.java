package org.applause.lang.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public interface IBuildParticipant {
  public abstract void doGenerate(final Resource input, final IFileSystemAccess fsa);
}
