package org.applause.lang.generator.android;

import com.google.inject.Inject;
import org.applause.lang.generator.android.model.EntityCompiler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class AndroidAppGenerator implements IGenerator {
  @Inject
  private EntityCompiler entityCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    this.entityCompiler.doGenerate(resource, fsa);
  }
}
