package org.applause.specification.data

import com.google.inject.Inject
import org.applause.lang.applauseDsl.ApplauseDslPackage
import org.applause.lang.applauseDsl.Model
import org.applause.lang.applauseDsl.Platform
import org.applause.lang.applauseDsl.TypeMapping
import org.eclipse.xtext.junit4.util.ParseHelper

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

/**
 * This class provides extension methods we use in the `ScalarDataTypes.spec` specification. The reason for 
 * defining the tests here is that we do not want to clutter Jnario's documentation output with the test code.
 */
class ScalarDataTypesValidationTestHelper extends ApplauseValidationTestHelper {
	
	@Inject extension ParseHelper<Model>
	
	def void hasDuplicateDatatype(CharSequence sequence) {
		sequence.parse.assertError(ApplauseDslPackage.eINSTANCE.dataType, null, "Duplicate NamedElement 'String'")
	}
	
	def void hasPlatform(CharSequence sequence, String platformName) {
		val model = sequence.parse
		val platform = model.elements.head
		assertThat(platform.name, is(platformName)) 		
	}
	
	def void hasPlatformTypeMapping(CharSequence sequence, String typeName, String mappedName) {
		val model = sequence.parse
		val platform = model.elements.filter(typeof(Platform)).head
		val platformMapping = platform.mappings.head as TypeMapping
		assertThat(platformMapping.type.name, is('String'))
		assertThat(platformMapping.simpleName, is('NSString'))		
	}
	
}