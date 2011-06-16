package org.applause.lang.ui.builder;

import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;

public class WP7BuildStrategy extends AbstractBuildStrategy {

	@Override
	protected String getGeneratedSourcesFolderName() {
		return "Generated";
	}

	@Override
	protected String getMainTemplateName() {
		return "templates::wp7::Main::main";
	}

	@Override
	protected void configureOutlet(Outlet outlet) {
		// do nothing
	}

}
