package org.applause.lang.ui.builder;

import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;

public class IPhoneBuildStrategy extends AbstractBuildStrategy {

	@Override
	protected String getGeneratedSourcesFolderName() {
		return "Generated";
	}

	@Override
	protected String getMainTemplateName() {
		return "templates::iphone::Main::main";
	}

	@Override
	protected void configureOutlet(Outlet outlet) {
		// do nothing
	}

}
