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
			// HACK: Peter 2012-07-25: I had to disable the following call in order to avoid the ooutput configuration
			// to be overridden with valuers from the preference store. Xtext has ben built wiht only ONE builder / generator 
			// in mind, thus it only has ONE preference page and ONE preference store for letting the user modify the output 
			// folder settings. We should either have separate property / preference pages for each individual code generators 
			// for the individual platform projects OR remove configuration for output folder altogether.
			// OutputConfiguration configuration = createAndOverlayOutputConfiguration(store, output);
			OutputConfiguration configuration =  output;
			
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
