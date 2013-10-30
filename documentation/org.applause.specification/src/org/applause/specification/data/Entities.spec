package org.applause.specification.data

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.jnario.runner.CreateWith

/**
 * Entities represent the data we deal with. At their core, they are a similar to POJOs 
 * or plain C# classes, but with a very stripped-down syntax, which makes for great 
 * readability and allows us to write very efficient code generators.
 */
@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "Entities"{
	
	@Inject extension EntitiesValidationTestHelper
	
	/**
	 * Entities can have any name and can be defined anywhere in your DSL program.
	 */
	describe "Defining Entities" {
		
		/**
		 * Entities can be defined using the `entity` keyword.
		 * @filter('''|.isValid.*)
		 */
		fact "Simple entities" {
			'''
				entity Person {
				}
			'''.isValidEntity
		}
	
		/**
		 * Entities can extend other entities.
		 * @filter('''|.isValid.*)
		 */
		fact "Entity inheritance" {
			'''
				entity Person {
				}
				entity Employee extends Person {
				}
			'''.isValidEntityWithInheritance
		}
		
		/**
		 * If an entity is merely used to specify base attributes for an inheritance hierarchy,
		 * it makes sense to define it as being abstract to make sure it cannot be instantiated.
		 * @filter('''|isValid.*)
		 */
		fact "Abstract Entities" {
			'''
				abstract entity Person {
				}
				entity Employee extends Person {
				}
			'''.isValidAbstractEntityWithInheritance
		}
		
		/**
		 * Entities can have any number of attributes. Attribute types refer to `datatype`s or other
		 * `entity`s.
		 * @filter('''|.isValid.*) 
		 */
		fact "Entity attributes" {
			'''
				datatype String
				datatype Date
				entity Person {
					String name
					Date birthdate
				}
			'''.isValidEntityWithAttributes
		}
		
		/**
		 * Properties can have an optional cardinality, so you can express 1:n relationships.
		 * @filter('''|.isValid.*) 
		 */
		fact "Property cardinality" {
			'''
				entity Person {
					Person[] friends
				}
			'''.isValidEntityWithOneToManyRelationship
		}
		
	}

}