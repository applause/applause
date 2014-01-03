package org.applause.lang.generator.ios;

import com.google.inject.Inject;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.generator.ios.dataaccess.APIClientCompiler;
import org.applause.lang.generator.ios.dataaccess.DataAccessCompiler;
import org.applause.lang.generator.ios.dataaccess.DataMappingCompiler;
import org.applause.lang.generator.ios.model.EntityCompiler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
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
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    CharSequence _stuff = this.stuff();
    fsa.generateFile("ios.txt", IosOutputConfigurationProvider.IOS_DEFAULT_OUTPUT, _stuff);
    this.entityCompiler.doGenerate(resource, fsa);
    this.apiClientCompiler.doGenerate(resource, fsa);
    this.dataAccessCompiler.doGenerate(resource, fsa);
    this.dataMappingCompiler.doGenerate(resource, fsa);
  }
  
  public CharSequence stuff() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hallo Stuff.");
    _builder.newLine();
    return _builder;
  }
}
