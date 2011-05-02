package de.itemis.mobilizer.generator;

import com.google.inject.Inject;
import de.itemis.mobilizer.generator.iphone.Generator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;

@SuppressWarnings("all")
public class AppModelDslGenerator implements IGenerator {
  @Inject private Generator iPhone;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    for (EObject element : _allContentsIterable) {
      if ((element instanceof de.itemis.mobilizer.appModelDsl.Application)) {
        this.iPhone.generate(((de.itemis.mobilizer.appModelDsl.Application) element), fsa);
      }
    }
  }
}