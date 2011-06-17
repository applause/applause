package org.applause.lang.generator.android.builder;

import org.applause.lang.ui.builder.AbstractBuildStrategy;
import org.eclipse.core.resources.IFile;
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
		IFile androidManifest = getContext().getBuiltProject().getFile("AndroidManifest.xml");
		System.out.println(getContext().getBuiltProject() + " is an Android project: " + androidManifest.exists());
		return androidManifest.exists();
	}

	@Override
	protected void configureOutlet(Outlet outlet) {
		JavaBeautifier beautifier = new JavaBeautifier();
		outlet.addPostprocessor(beautifier);
	}

}
