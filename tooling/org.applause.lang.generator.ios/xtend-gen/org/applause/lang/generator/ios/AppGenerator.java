package org.applause.lang.generator.ios;

import com.google.inject.Inject;
import org.applause.lang.generator.ios.dataaccess.APIClientCompiler;
import org.applause.lang.generator.ios.dataaccess.DataAccessCompiler;
import org.applause.lang.generator.ios.dataaccess.DataMappingCompiler;
import org.applause.lang.generator.ios.model.EntityCompiler;
import org.applause.lang.generator.ios.supportfiles.MainClassCompiler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class AppGenerator implements IGenerator {
  @Inject
  private EntityCompiler entityCompiler;
  
  @Inject
  private DataAccessCompiler dataAccessCompiler;
  
  @Inject
  private APIClientCompiler apiClientCompiler;
  
  @Inject
  private DataMappingCompiler dataMappingCompiler;
  
  @Inject
  private MainClassCompiler mainClassCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    this.entityCompiler.doGenerate(resource, fsa);
    this.apiClientCompiler.doGenerate(resource, fsa);
    this.dataAccessCompiler.doGenerate(resource, fsa);
    this.dataMappingCompiler.doGenerate(resource, fsa);
    this.mainClassCompiler.doGenerate(resource, fsa);
  }
}
