package de.itemis.mobilizer.ui.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;

public class GaeBuildStrategy extends AbstractBuildStrategy {

	public GaeBuildStrategy(IBuildContext context) {
		super(context);
	}

	@Override
	protected String getGeneratedSourcesFolderName() {
		return "src";
	}

	@Override
	protected String getMainTemplateName() {
		return "templates::gae::Main::main";
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
