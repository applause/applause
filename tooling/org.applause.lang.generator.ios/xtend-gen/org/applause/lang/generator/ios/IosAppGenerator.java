package org.applause.lang.generator.ios;

import org.applause.lang.generator.IBuildParticipant;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class IosAppGenerator implements IBuildParticipant {
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    fsa.generateFile("ios.txt", "contents");
  }
}
