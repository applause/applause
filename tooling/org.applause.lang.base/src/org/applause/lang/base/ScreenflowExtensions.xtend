package org.applause.lang.base

import org.applause.lang.applauseDsl.Application
import org.applause.lang.applauseDsl.ScreenFlow

class ScreenflowExtensions {
	
	def startScreen(Application app) {
		// get the first screenflow definition in the model
		// later we will support multiple screenflow elements, for example for each platform
		app.eResource.allContents.filter(typeof(ScreenFlow)).head.startscreen.screen
	}
	
}