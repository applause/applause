package org.applause.specification.data

import com.google.inject.Inject
import org.applause.lang.applauseDsl.ApplauseDslPackage
import org.applause.lang.applauseDsl.Model
import org.eclipse.xtext.junit4.util.ParseHelper

/**
 * This class provides extension methods we use in the `ScalarDataTypes.spec` specification. The reason for 
 * defining the tests here is that we do not want to clutter Jnario's documentation output with the test code.
 */
class ScalarDataTypesValidationTestHelper extends ApplauseValidationTestHelper {
	
	@Inject extension ParseHelper<Model>
	
	def void hasDuplicateDatatype(CharSequence sequence) {
		sequence.parse.assertError(ApplauseDslPackage.eINSTANCE.dataType, null, "Duplicate Type 'String'")
	}
	
}