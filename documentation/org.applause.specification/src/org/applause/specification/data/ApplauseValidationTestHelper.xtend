package org.applause.specification.data

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Model
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

class ApplauseValidationTestHelper extends ValidationTestHelper {
	
	@Inject extension ParseHelper<Model>	
	
	def isValid(CharSequence sequence) {
		val model = sequence.parse
		model.assertNoErrors
		model
	}
}