package de.itemis.mobilizer.ui.generator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

public class Generator implements IXtextBuilderParticipant {

	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		AbstractBuildStrategy buildStrategy = BuildStrategyFactory.getBuildStrategy(context);
		buildStrategy.build(monitor);
	}
}
