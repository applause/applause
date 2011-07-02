package org.applause.lang.generator.iphone.builder;

import org.applause.lang.applauseDsl.Application;
import org.applause.lang.ui.builder.AbstractBuildStrategy;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.xpand2.output.Outlet;

public class IPhoneBuildStrategy extends AbstractBuildStrategy {

	@Override
	protected String getGeneratedSourcesFolderName() {
		return "Generated";
	}

	@Override
	protected String getMainTemplateName() {
		return "templates::Main::main";
	}
	
	@Override
	protected boolean canBuildProject() {
		IFile mainFile = getPlatformProject().getFile("main.m");
		IFile precompiledHeaderFile = getPlatformProject().getFile(".*\\.pch");
		boolean result = mainFile.exists() || precompiledHeaderFile.exists();
		System.out.println(getPlatformProject() + " is an iPhone project: " + result);
		return result;
	
	}

	@Override
	protected void configureOutlet(Outlet outlet) {
	}

	@Override
	public String getName() {
		return "iPhone";
	}

	@Override
	protected void copyResources(Application app, IFolder folder) throws CoreException {
		String splash = app.getSplash();
		IFile splashFile = getModelProject().getFile("Images/" + splash);
		IPath targetPath = folder.getFullPath().append("Default.png");
		splashFile.copy(targetPath, true, null);
	}

}
