package org.applause.lang.generator.ios;

import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class IosOutputConfigurationProvider implements IOutputConfigurationProvider {
  public final static String IOS_DEFAULT_OUTPUT = "IOS_DEFAULT_OUTPUT";
  
  public final static String IOS_OUTPUT_MODELS = "IOS_OUTPUT_MODELS";
  
  public final static String IOS_OUTPUT_DATAACCESS = "IOS_OUTPUT_DATAACCESS";
  
  public final static String IOS_OUTPUT_SUPPORTFILES = "IOS_OUTPUT_SUPPORTFILES";
  
  public final static String IOS_OUTPUT_SUPPORTFILES_LOCALIZED_EN = "IOS_OUTPUT_SUPPORTFILES_LOCALIZED_EN";
  
  public final static String IOS_OUTPUT_CONTROLLERS = "IOS_OUTPUT_CONTROLLERS";
  
  public Set<OutputConfiguration> getOutputConfigurations() {
    Set<OutputConfiguration> _xblockexpression = null;
    {
      OutputConfiguration _outputConfiguration = new OutputConfiguration(IosOutputConfigurationProvider.IOS_DEFAULT_OUTPUT);
      final OutputConfiguration defaultOutput = _outputConfiguration;
      final Procedure1<OutputConfiguration> _function = new Procedure1<OutputConfiguration>() {
        public void apply(final OutputConfiguration it) {
          it.setDescription("iOS Output Folder");
          it.setOutputDirectory("../../$PROJECTNAME$-iOS/$PROJECTNAME$");
          it.setOverrideExistingResources(true);
          it.setCreateOutputDirectory(true);
          it.setCleanUpDerivedResources(true);
          it.setSetDerivedProperty(true);
        }
      };
      ObjectExtensions.<OutputConfiguration>operator_doubleArrow(defaultOutput, _function);
      OutputConfiguration _outputConfiguration_1 = new OutputConfiguration(IosOutputConfigurationProvider.IOS_OUTPUT_MODELS);
      final OutputConfiguration modelsOutput = _outputConfiguration_1;
      final Procedure1<OutputConfiguration> _function_1 = new Procedure1<OutputConfiguration>() {
        public void apply(final OutputConfiguration it) {
          it.setDescription("iOS Models Output Folder");
          it.setOutputDirectory("../../$PROJECTNAME$-iOS/$PROJECTNAME$/Models");
          it.setOverrideExistingResources(true);
          it.setCreateOutputDirectory(true);
          it.setCleanUpDerivedResources(true);
          it.setSetDerivedProperty(true);
        }
      };
      ObjectExtensions.<OutputConfiguration>operator_doubleArrow(modelsOutput, _function_1);
      OutputConfiguration _outputConfiguration_2 = new OutputConfiguration(IosOutputConfigurationProvider.IOS_OUTPUT_DATAACCESS);
      final OutputConfiguration dataAccessOutput = _outputConfiguration_2;
      final Procedure1<OutputConfiguration> _function_2 = new Procedure1<OutputConfiguration>() {
        public void apply(final OutputConfiguration it) {
          it.setDescription("iOS Data Access Output Folder");
          it.setOutputDirectory("../../$PROJECTNAME$-iOS/$PROJECTNAME$/DataAccess");
          it.setOverrideExistingResources(true);
          it.setCreateOutputDirectory(true);
          it.setCleanUpDerivedResources(true);
          it.setSetDerivedProperty(true);
        }
      };
      ObjectExtensions.<OutputConfiguration>operator_doubleArrow(dataAccessOutput, _function_2);
      OutputConfiguration _outputConfiguration_3 = new OutputConfiguration(IosOutputConfigurationProvider.IOS_OUTPUT_SUPPORTFILES);
      final OutputConfiguration supportFilesOutput = _outputConfiguration_3;
      final Procedure1<OutputConfiguration> _function_3 = new Procedure1<OutputConfiguration>() {
        public void apply(final OutputConfiguration it) {
          it.setDescription("iOS Support Files Output Folder");
          it.setOutputDirectory("../../$PROJECTNAME$-iOS/$PROJECTNAME$");
          it.setOverrideExistingResources(true);
          it.setCreateOutputDirectory(true);
          it.setCleanUpDerivedResources(true);
          it.setSetDerivedProperty(true);
        }
      };
      ObjectExtensions.<OutputConfiguration>operator_doubleArrow(supportFilesOutput, _function_3);
      OutputConfiguration _outputConfiguration_4 = new OutputConfiguration(IosOutputConfigurationProvider.IOS_OUTPUT_SUPPORTFILES_LOCALIZED_EN);
      final OutputConfiguration localizedSupportFilesOutput = _outputConfiguration_4;
      final Procedure1<OutputConfiguration> _function_4 = new Procedure1<OutputConfiguration>() {
        public void apply(final OutputConfiguration it) {
          it.setDescription("iOS Localized Support Files Output Folder");
          it.setOutputDirectory("../../$PROJECTNAME$-iOS/$PROJECTNAME$/en.lproj");
          it.setOverrideExistingResources(true);
          it.setCreateOutputDirectory(true);
          it.setCleanUpDerivedResources(true);
          it.setSetDerivedProperty(true);
        }
      };
      ObjectExtensions.<OutputConfiguration>operator_doubleArrow(localizedSupportFilesOutput, _function_4);
      OutputConfiguration _outputConfiguration_5 = new OutputConfiguration(IosOutputConfigurationProvider.IOS_OUTPUT_CONTROLLERS);
      final OutputConfiguration contollerFilesOutput = _outputConfiguration_5;
      final Procedure1<OutputConfiguration> _function_5 = new Procedure1<OutputConfiguration>() {
        public void apply(final OutputConfiguration it) {
          it.setDescription("iOS Localized Support Files Output Folder");
          it.setOutputDirectory("../../$PROJECTNAME$-iOS/$PROJECTNAME$/Controllers");
          it.setOverrideExistingResources(true);
          it.setCreateOutputDirectory(true);
          it.setCleanUpDerivedResources(true);
          it.setSetDerivedProperty(true);
        }
      };
      ObjectExtensions.<OutputConfiguration>operator_doubleArrow(contollerFilesOutput, _function_5);
      _xblockexpression = (Collections.<OutputConfiguration>unmodifiableSet(Sets.<OutputConfiguration>newHashSet(defaultOutput, modelsOutput, dataAccessOutput, supportFilesOutput, localizedSupportFilesOutput, contollerFilesOutput)));
    }
    return _xblockexpression;
  }
}
