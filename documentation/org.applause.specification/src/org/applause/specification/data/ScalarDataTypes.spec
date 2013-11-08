package org.applause.specification.data

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Model
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

/**
 * Scalar data types make up the core of the Applause DSL. They are one of the central building blocks
 * for most of the other concepts in the Applause DSL. 
 */
 @InjectWith(ApplauseDslInjectorProvider)
 @CreateWith(typeof(ApplauseDslTestCreator))
describe "Scalar Data Types"{
	
	@Inject extension ParseHelper<Model>
	@Inject extension ApplauseValidationTestHelper
	@Inject extension ScalarDataTypesValidationTestHelper
	
	/**
	 * Data types can have any name and can be defined anywhere in your DSL program.
	 */
	describe "Defining data types"{
		/**
		 * New data types can be defined using the `datatype` keyword.
		 * @filter('''|.isValid)
		 */
		fact "Simple data types" {
			'''
				datatype String
				datatype Integer
			'''.isValid
		}
	
		/**
		 * Data types must be unique. Currently, this means they must be unique across the board and __cannot__
		 * be namespaced.
		 * @filter('''|.hasDuplicateDatatype)
		 */
		fact "Data types must be unique" {
			'''
				datatype String
				datatype String // <-- invalid
			'''.hasDuplicateDatatype
		}
	
	}
	
	/**
	 * Applause supports mapping data types to platform types.
	 */
	describe "Platform Mapping" {
		
		/**
		 * The `platform` keyword can be used to define a platform.
		 * @filter('''|.hasPlatform.*)
		 */
		fact "Defining platforms" {
			'''
				platform iOS {
					// platform-specific configurations
				}
			'''.hasPlatform('iOS')
		}
		
		/**
		 * This makes sense when you want to support multiple platforms. This way, you can use the
		 * platform-independent data type name and do not need to care about what's the right type 
		 * on the target platform.
		 * @filter('''|.hasPlatformTypeMapping.*)
		 */
		fact "A data type can be mapped to a different type" {
			'''
				datatype String
				platform iOS {
					typemapping String -> NSString
				}
			'''.hasPlatformTypeMapping('String', 'NSString')
		}
		
//		/**
//		 * Applause comes with a number of pre-defined platform mappings for the supported platforms. 
//		 */
//		describe "Pre-defined platform mappings" {
//			
//			/**
//			 * @filter(''')
//			 */
//			fact "Scalar data type mappings for iOS" {
//				'''
//					platform iOS {
//					    typemapping String -> NSString
//					    typemapping Integer -> NSNumber
//					}			
//				'''.isValid
//			}
//			
//			/**
//			 * @filter(''')
//			 */
//			fact "Scalar data type mappings for Android" {
//				'''
//					platform Android {
//					    typemapping Integer -> java.lang.Integer
//					    typemapping String -> java.lang.String
//					    typemapping Date -> java.util.Date
//					    typemapping Bool -> boolean
//					}				
//				'''.isValid
//			}
//			
//			/**
//			 * @filter(''')
//			 */
//			fact "Scalar data type mappings for Windows Phone" {
//				'''
//					platform WP {
//						typemapping Integer -> int
//						typemapping String -> string
//						typemapping Bool -> bool
//					}				
//				'''.isValid
//			}
//			
//		}
		
	}
}