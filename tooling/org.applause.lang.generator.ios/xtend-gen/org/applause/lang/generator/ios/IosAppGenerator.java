package org.applause.lang.generator.ios;

import com.google.inject.Inject;
import org.applause.lang.generator.IBuildParticipant;
import org.applause.lang.generator.ios.model.EntityCompiler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class IosAppGenerator implements IBuildParticipant {
  @Inject
  private EntityCompiler entityCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    this.entityCompiler.doGenerate(resource, fsa);
  }
}
