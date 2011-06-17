package org.applause.lang.ui.builder;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderImpl;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

public class ApplauseBuilderParticipant implements IXtextBuilderParticipant {
	
	protected List<IProject> findDependentPlatformProjects(IProject builtProject) throws CoreException {
		List<IProject> dependentProjects = new ArrayList<IProject>();
		IProject[] allWorkspaceProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : allWorkspaceProjects) {
			if (project.isOpen()) {
				IProject[] referencedProjects = project.getDescription().getReferencedProjects();
				for (IProject referencedProject : referencedProjects) {
					if (referencedProject.equals(builtProject)) {
						dependentProjects.add(project);
					}
				}
			}
		}
		
		return dependentProjects;
	}
	
	private List<AbstractBuildStrategy> buildStrategies;
	
	protected List<AbstractBuildStrategy> getBuildStrategies() {
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

	@Override
	public void build(final IBuildContext context, final IProgressMonitor monitor)
			throws CoreException {
		
		List<IProject> platformProjects = findDependentPlatformProjects(context.getBuiltProject());
		List<AbstractBuildStrategy> strategies = getBuildStrategies();
		for (final IProject platformProject : platformProjects) {
			for (final AbstractBuildStrategy buildStrategy : strategies) {
				SafeRunner.run(new ISafeRunnable() {
					@Override
					public void run() throws Exception {
						ResourceLoaderFactory.setCurrentThreadResourceLoader(new ResourceLoaderImpl(buildStrategy.getClass().getClassLoader()));						
						buildStrategy.setContext(context);
						buildStrategy.setPlatformProject(platformProject);
						buildStrategy.build(monitor);						
					}
					@Override
					public void handleException(Throwable exception) {
						exception.printStackTrace();
					}
				});
			}
		}		
	}

}
