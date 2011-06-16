package org.applause.lang.generator.iphone.builder;

import org.applause.lang.ui.builder.AbstractBuildStrategy;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;

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
	protected void configureOutlet(Outlet outlet) {
		// do nothing
	}

}
