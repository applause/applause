package org.applause.lang.ui.builder;

import org.eclipse.xpand2.output.JavaBeautifier;
import org.eclipse.xpand2.output.Outlet;

public class AndroidBuildStrategy extends AbstractBuildStrategy {

	@Override
	protected String getGeneratedSourcesFolderName() {
		return "src-gen";
	}

	@Override
	protected String getMainTemplateName() {
		return "templates::android::Main::main";
	}

	@Override
	protected void configureOutlet(Outlet outlet) {
		JavaBeautifier beautifier = new JavaBeautifier();
		outlet.addPostprocessor(beautifier);
	}

}
