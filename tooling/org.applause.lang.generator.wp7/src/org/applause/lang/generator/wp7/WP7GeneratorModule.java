package org.applause.lang.generator.wp7;

import org.eclipse.xtext.service.AbstractGenericModule;

public class WP7GeneratorModule extends AbstractGenericModule {

	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return org.applause.lang.generator.wp7.WP7AppGenerator.class;
	}

}
