package org.applause.lang.generator.gae.builder;

import org.applause.lang.ui.builder.AbstractBuildStrategy;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xpand2.output.Outlet;

public class GaeBuildStrategy extends AbstractBuildStrategy {

	@Override
	protected String getGeneratedSourcesFolderName() {
		return "src";
	}

	@Override
	protected String getMainTemplateName() {
		return "templates::Main::main";
	}
	
	@Override
	protected boolean canBuildProject() {
		IFile gaeYaml = getPlatformProject().getFile("src/app.yaml");
		System.out.println(getPlatformProject() + " is a GAE project: " + gaeYaml.exists());		
		return gaeYaml.exists();
	}

	@Override
	protected void configureOutlet(Outlet outlet) {
		// do nothing
	}
	
	@Override
	protected void deletePreviouslyGeneratedFiles(IProgressMonitor monitor,
			IFolder folder) throws CoreException {
		IFolder generatedTemplates = folder.getFolder("templates/generated");
		super.deletePreviouslyGeneratedFiles(monitor, generatedTemplates);
	}

}
