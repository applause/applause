package de.itemis.mobilizer.ui.generator;

import org.eclipse.core.resources.IFile;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;

public class BuildStrategyFactory {
	
	public static AbstractBuildStrategy getBuildStrategy(IBuildContext context) {
		IFile file = context.getBuiltProject().getFile("AndroidManifest.xml");
		if (file.exists()) {
			return new AndroidBuildStrategy(context);
		}
		else {
			return new IPhoneBuildStrategy(context);
		}
	}

}
