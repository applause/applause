package de.itemis.mobilizer.ui.generator;

import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;

public class AndroidBuildStrategy extends AbstractBuildStrategy {

	public AndroidBuildStrategy(IBuildContext context) {
		super(context);
	}

	@Override
	protected String getGeneratedSourcesFolderName() {
		return "src-gen";
	}

	@Override
	protected String getMainTemplateName() {
		return "templates::android::Main::main";
	}

//	@Override
//	protected void configureOutlet(Outlet outlet) {
////		JavaBeautifier beautifier = new JavaBeautifier();
////		outlet.addPostprocessor(beautifier);
//	}

}
