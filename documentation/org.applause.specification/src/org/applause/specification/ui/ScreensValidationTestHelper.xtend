package org.applause.specification.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.ApplauseDslPackage
import org.applause.lang.applauseDsl.Model
import org.applause.lang.applauseDsl.Screen
import org.applause.specification.data.ApplauseValidationTestHelper
import org.eclipse.xtext.junit4.util.ParseHelper

import static org.junit.Assert.*

/**
 * This class provides extension methods we use in the `Screens.spec` specification. The reason for defining the
 * tests here is that we do not want to clutter Jnario's documentation output with the test code.
 */
class ScreensValidationTestHelper extends ApplauseValidationTestHelper {
	
	@Inject extension ParseHelper<Model>
	
	def void isValidScreen(CharSequence sequence) {
		val model = sequence.parse
		val screen = model.elements.head as Screen
		assertNotNull(screen.name)
	}
	
	def void hasDuplicateScreen(CharSequence sequence) {
		sequence.parse.assertError(ApplauseDslPackage.eINSTANCE.screen, null, "Duplicate NamedElement 'PersonList'")
	}
	
	def void hasTitle(CharSequence sequence, String expectedTitle) {
		val model = sequence.parse
		val screen = model.elements.head as Screen
		assertNotNull(screen.title)
	}
	
	def void hasDataSource(CharSequence sequence) {
		val model = sequence.parse
		val screen = model.elements.filter(typeof(Screen)).head
		assertNotNull(screen.datasource)
	}
	
	
	
}