package org.applause.lang.ui.builder;


public interface IBuildStrategy {
	
	/**
	 * Returns true if the build strategy can build the given project. Implementations should analyze 
	 * the given project for the existence of special marker files to decide if they are responsible 
	 * for generating code for this project.
	 */
	public boolean canBuildProject();

}
