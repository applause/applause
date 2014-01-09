package org.applause.lang.generator.ios.ui

import org.applause.lang.applauseDsl.Screen

class ScreenClassExtensions {
	def controllerClassName(Screen it) {
		name + 'ViewController'
	}
	
	def screenHeaderFileName(Screen it) {
		controllerClassName + '.h'
	}
	
	def screenModuleFileName(Screen it) {
		controllerClassName + '.m'
	}
}