package org.applause.lang.generator.iphone.builder;

import org.applause.lang.ui.builder.AbstractBuildStrategy;
import org.eclipse.core.resources.IFile;
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
		IFile mainFile = getContext().getBuiltProject().getFile("main.m");
		IFile precompiledHeaderFile = getContext().getBuiltProject().getFile(".*\\.pch");
		boolean result = mainFile.exists() || precompiledHeaderFile.exists();
		System.out.println(getContext().getBuiltProject() + " is an iPhone project: " + result);
		return result;
	
	}

	@Override
	protected void configureOutlet(Outlet outlet) {
		// do nothing
	}

}
