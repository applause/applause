package org.applause.lang.ui.builder;

import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

public class EclipseOutputConfigurationProviderExt extends EclipseOutputConfigurationProvider {

	@Inject
	public EclipseOutputConfigurationProviderExt(IOutputConfigurationProvider delegate) {
		super(delegate);
	}

	@Override
	public Set<OutputConfiguration> getOutputConfigurations(IProject project) {
		IPreferenceStore store = getPreferenceStoreAccess().getContextPreferenceStore(project);
		Set<OutputConfiguration> outputConfigurations = Sets.newHashSetWithExpectedSize(getOutputConfigurations()
				.size());
		for (OutputConfiguration output : getOutputConfigurations()) {
			OutputConfiguration configuration = createAndOverlayOutputConfiguration(store, output);
			OutputConfiguration replaced = replaceVariables(configuration, project);
			outputConfigurations.add(replaced);
		}
		return outputConfigurations;
	}
	
	protected OutputConfiguration replaceVariables(final OutputConfiguration configuration, IProject project) {
		OutputConfiguration result = configuration;
		String outputDirectory = configuration.getOutputDirectory();
		String replaced = outputDirectory.replaceAll("\\$PROJECTNAME\\$", project.getName());
		result.setOutputDirectory(replaced);
		return result;
	}

}
