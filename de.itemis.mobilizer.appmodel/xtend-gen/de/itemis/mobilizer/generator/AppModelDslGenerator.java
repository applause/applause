package de.itemis.mobilizer.generator;

import com.google.inject.Inject;
import de.itemis.mobilizer.generator.iphone.Generator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class AppModelDslGenerator implements IGenerator {
  @Inject private Generator iPhone;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
  }
}