package de.itemis.mobilizer.ui.generator;

import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;

public class GaeBuildStrategy extends AbstractBuildStrategy {

	public GaeBuildStrategy(IBuildContext context) {
		super(context);
	}

	@Override
	protected String getGeneratedSourcesFolderName() {
		return "Generated";
	}

	@Override
	protected String getMainTemplateName() {
		return "templates::gae::Main::main";
	}

	@Override
	protected void configureOutlet(Outlet outlet) {
		// do nothing
	}

}
