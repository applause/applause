package org.applause.lang.ui.wizard;

import org.applause.lang.ui.builder.MobilePlatform;
import org.eclipse.xtext.ui.wizard.DefaultProjectInfo;

public class ApplauseDslProjectInfo extends DefaultProjectInfo {

	private MobilePlatform[] selectedPlatforms;

	public void setSelectedPlatforms(MobilePlatform[] selectedPlatforms) {
		this.selectedPlatforms = selectedPlatforms;
	}
	
	public MobilePlatform[] getSelectedPlatforms() {
		return selectedPlatforms;
	}

}
