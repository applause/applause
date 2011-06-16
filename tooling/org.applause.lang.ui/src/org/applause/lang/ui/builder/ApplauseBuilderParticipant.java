package org.applause.lang.ui.builder;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

public class ApplauseBuilderParticipant implements IXtextBuilderParticipant {

	@Override
	public void build(final IBuildContext context, final IProgressMonitor monitor)
			throws CoreException {
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.applause.lang.ui.buildstrategy");
		try {
			for (IConfigurationElement element : configurationElements) {
				final Object object = element.createExecutableExtension("class");
				if (object instanceof AbstractBuildStrategy) {
					SafeRunner.run(new ISafeRunnable() {
						@Override
						public void run() throws Exception {
							AbstractBuildStrategy buildStrategy = (AbstractBuildStrategy) object;
							buildStrategy.setContext(context);
							buildStrategy.build(monitor);
						}

						@Override
						public void handleException(Throwable exception) {
						}
					});
					
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
//		OLD: 
//		AbstractBuildStrategy buildStrategy = BuildStrategyFactory.getBuildStrategy(context);
//		buildStrategy.build(monitor);
	}

}
