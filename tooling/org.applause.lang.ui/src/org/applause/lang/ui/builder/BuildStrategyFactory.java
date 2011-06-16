package org.applause.lang.ui.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;

public class BuildStrategyFactory {
	
	public static AbstractBuildStrategy getBuildStrategy(IBuildContext context) {
		IFile androidManifest = context.getBuiltProject().getFile("AndroidManifest.xml");
		IFile wp7Solution = context.getBuiltProject().getFile("ItemisAppWP7.csproj");
		IFile gaeYaml = context.getBuiltProject().getFile("src/app.yaml");
		
		AbstractBuildStrategy strategy;
		if (androidManifest.exists()) {
			strategy = new AndroidBuildStrategy();
		}
		else {
			if (wp7Solution.exists()) {
				strategy = new WP7BuildStrategy();
			}
			else {
				if (gaeYaml.exists()) {
					strategy = new GaeBuildStrategy();
				} else
					strategy = new IPhoneBuildStrategy();
			}
		}
		strategy.setContext(context);
		return strategy;
	}

}
