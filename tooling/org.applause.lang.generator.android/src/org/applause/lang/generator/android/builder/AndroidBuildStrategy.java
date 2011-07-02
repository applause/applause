package org.applause.lang.generator.android.builder;

import org.applause.lang.applauseDsl.Application;
import org.applause.lang.ui.builder.AbstractBuildStrategy;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xpand2.output.JavaBeautifier;
import org.eclipse.xpand2.output.Outlet;

public class AndroidBuildStrategy extends AbstractBuildStrategy {

	@Override
	protected String getGeneratedSourcesFolderName() {
		return "src-gen";
	}

	@Override
	protected String getMainTemplateName() {
		return "templates::Main::main";
	}
	
	@Override
	protected boolean canBuildProject() {
		IFile androidManifest = getPlatformProject().getFile("AndroidManifest.xml");
		System.out.println(getPlatformProject() + " is an Android project: " + androidManifest.exists());
		return androidManifest.exists();
	}

	@Override
	protected void configureOutlet(Outlet outlet) {
		JavaBeautifier beautifier = new JavaBeautifier();
		outlet.addPostprocessor(beautifier);
	}

	@Override
	public String getName() {
		return "Android";
	}

	@Override
	protected void copyResources(Application app, IFolder folder)
			throws CoreException {
		// TODO Auto-generated method stub
		
	}

}
