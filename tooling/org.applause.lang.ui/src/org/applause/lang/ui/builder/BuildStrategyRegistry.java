package org.applause.lang.ui.builder;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;

public class BuildStrategyRegistry {
	
	private static List<AbstractBuildStrategy> buildStrategies;
	
	public static List<AbstractBuildStrategy> getBuildStrategies() {
		if (buildStrategies == null || buildStrategies.size() == 0) {
			buildStrategies = new ArrayList<AbstractBuildStrategy>();
			IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.applause.lang.ui.buildstrategy");
			for (IConfigurationElement element : configurationElements) {
				try {
					final Object object = element.createExecutableExtension("class");
					if (object instanceof AbstractBuildStrategy) {
						AbstractBuildStrategy buildStrategy = (AbstractBuildStrategy) object;
						buildStrategies.add(buildStrategy);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
				

		}
		return buildStrategies;
	}
	
	private static ArrayList<MobilePlatform> supportedMobilePlatforms;
	
	public static List<MobilePlatform> getSupportedMobilePlatforms() {
		if (supportedMobilePlatforms == null || supportedMobilePlatforms.size() == 0) {
			supportedMobilePlatforms = new ArrayList<MobilePlatform>();
			IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.applause.lang.ui.mobileplatform");
			for (IConfigurationElement element : configurationElements) {
				MobilePlatform platform = new MobilePlatform(element.getAttribute("name"));
				platform.setProjectNameSuffix(element.getAttribute("projectNameSuffix"));
				
				String templateProjectValue = element.getAttribute("templateProject");
				if (templateProjectValue != null) {
					URI templateProjectURI = URI.createURI(templateProjectValue);
					if (templateProjectURI.isRelative()) {
						URI pluginURI = URI.createPlatformPluginURI(element.getContributor().getName() + "/", true);
						templateProjectURI = templateProjectURI.resolve(pluginURI);
					}
					platform.setTemplateProjectURI(templateProjectURI);
				}
				supportedMobilePlatforms.add(platform);
			}
		}
		return supportedMobilePlatforms;
	}

}
