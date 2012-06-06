package org.applause.lang.generator.ios;

import org.eclipse.xtext.service.AbstractGenericModule;

public class IosGeneratorModule extends AbstractGenericModule {

	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return org.applause.lang.generator.ios.ApplauseDslGenerator.class;
	}

}
