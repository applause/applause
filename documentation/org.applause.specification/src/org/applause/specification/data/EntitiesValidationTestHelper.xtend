package org.applause.specification.data

import com.google.inject.Inject
import org.applause.lang.applauseDsl.ApplauseDslPackage
import org.applause.lang.applauseDsl.Model
import org.eclipse.xtext.junit4.util.ParseHelper
import org.applause.lang.applauseDsl.Entity
import static org.junit.Assert.*
import static org.hamcrest.CoreMatchers.*

/**
 * This class provides extension methods we use in the `Entities.spec` specification. The reason for defining the
 * tests here is that we do not want to clutter Jnario's documentation output with the test code.
 */
class EntitiesValidationTestHelper extends ApplauseValidationTestHelper {
	
	@Inject extension ParseHelper<Model>
	
	def void isValidEntity(CharSequence sequence) {
		val model = sequence.parse
		val entity = model.elements.head as Entity
		assertNotNull(entity.name)
	}
	
	def void hasDuplicateEntity(CharSequence sequence) {
		sequence.parse.assertError(ApplauseDslPackage.eINSTANCE.entity, null, "Duplicate Type 'Person'")
	}
	
	
	def void isValidEntityWithInheritance(CharSequence sequence) {
		val model = sequence.parse
		val person = model.elements.head as Entity
		val employee = model.elements.last as Entity
		
		assertThat(employee.superType, is(person))
	}

	def void isValidAbstractEntityWithInheritance(CharSequence sequence) {
		val model = sequence.parse
		val person = model.elements.head as Entity
		val employee = model.elements.last as Entity
		
		assertThat(person.abstract, is(true))
		assertThat(employee.superType, is(person))
	}
	
	def void isValidEntityWithAttributes(CharSequence sequence) {
		val model = sequence.parse
		
		val entity = model.elements.filter(typeof(Entity)).head
		val attributes = entity.attributes
		assertThat(attributes.size, is(2))
		
		val dateType = model.elements.findFirst[name == 'Date']
		val stringType = model.elements.findFirst[name == 'String']
		
		val firstAttribute = attributes.head
		assertThat(firstAttribute.name, is("name"))
		assertThat(firstAttribute.type, is(stringType))
		
		val secondAttribute = attributes.last
		assertThat(secondAttribute.name, is("birthdate"))
		assertThat(secondAttribute.type, is(dateType))
	}
	
	def void isValidEntityWithOneToManyRelationship(CharSequence sequence) {
		val model = sequence.parse
		val person = model.elements.filter(typeof(Entity)).head
		
		val friends = person.attributes.head
		assertThat(friends.many, is(true))
	}
	
}