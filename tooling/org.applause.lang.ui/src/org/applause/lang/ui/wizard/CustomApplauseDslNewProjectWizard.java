package org.applause.lang.ui.wizard;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;

import com.google.inject.Inject;

public class CustomApplauseDslNewProjectWizard extends XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	private GeneratorFragmentSelectionWizardPage generatorFragmentSelectionWizardPage;
	
	@Inject
	private IImageHelper imageHelper;

	@Inject
	public CustomApplauseDslNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New APPlause Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("APPlause Project");
		mainPage.setDescription("Create a new APPlause project.");
		mainPage.setImageDescriptor(ImageDescriptor.createFromImage(imageHelper.getImage("applause-wizard-top.png")));		
		addPage(mainPage);
		
		generatorFragmentSelectionWizardPage = new GeneratorFragmentSelectionWizardPage();
		generatorFragmentSelectionWizardPage.setImageDescriptor(ImageDescriptor.createFromImage(imageHelper.getImage("applause-wizard-top.png")));		
		addPage(generatorFragmentSelectionWizardPage);
	}
	
	@Override
	public boolean canFinish() {
		return generatorFragmentSelectionWizardPage.getSelectedPlatforms().length > 0 ? true : false;
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		org.applause.lang.ui.wizard.ApplauseDslProjectInfo projectInfo = new org.applause.lang.ui.wizard.ApplauseDslProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		projectInfo.setSelectedPlatforms(generatorFragmentSelectionWizardPage.getSelectedPlatforms());
		return projectInfo;
	}

}
