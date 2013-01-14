package org.applause.lang.base.importmanager.classbased

import com.google.inject.Inject
import org.applause.lang.applauseDsl.DataType
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Model
import org.applause.lang.applauseDsl.NamespaceDeclaration
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

import static extension org.jnario.lib.Should.*

/**
 * The class based import manager is intended to be used with languages like **Objective-C** that do not 
 * support namespaces or packages.
 */
@CreateWith(typeof(ClassBasedSpecCreator))
describe ImportManager {
	
	@Inject ParseHelper<Model> parseHelper
	
	context "Initialization" {
		fact "Initially, the import manager is empty." {
			subject.empty should be true 
		}
	}
	
	context "Adding elements" {
		fact "After adding an element, the import manager is not empty any more." {
			val model = parseHelper.parse('''
				entity Baz {
				}
			''')
			var baz = model.elements.head as Entity
			
			subject.add(baz)
			subject.empty should be false
			subject.imports.size should be 1
		}
		
		fact "Adding the same element multiple times only yields one import" {
			val model = parseHelper.parse('''
				entity Baz {
				}
			''')
			var baz = model.elements.head as Entity
			
			subject.add(baz)
			subject.add(baz)
			subject.empty should be false
			subject.imports.size should be 1
		}
		
		// TODO this is namespace-related, remove it!
		def allNamespaces(Model model) {
			model.eAllContents.filter(typeof(NamespaceDeclaration))
		}
		
		fact "Adding two different elements yields two imports" {
			val model = parseHelper.parse('''
				entity Baz {
				}
				entity Boo {
				}
			''')
			var baz = model.elements.filter(typeof(Entity)).findFirst[name == "Baz"]
			var boo= model.elements.filter(typeof(Entity)).findFirst[name == "Boo"]
			
			subject.add(baz)
			subject.add(boo)
			subject.imports.size should be 2
		}
		
	}
	
	context "Types" {
		/**
		 * Primitive types are types that are built in to the host language, such as `int` or `long` 
		 * in Java. 
		 * 
		 * We do not want to import them, as this
		 *  
		 * - unneccesary and 
		 * - illegal in most cases.
		 * 
		 */
		fact "Primitive types must not be imported." {
			val model = parseHelper.parse('''
				datatype Zap
				platform ClassBased {
					typemapping Zap -> zap primitive
				}
			''')
			
			val zapType = model.elements.filter(typeof(DataType)).findFirst[name == 'Zap']
			subject.add(zapType)
			subject.empty should be true
		}
		
//		pending fact "WHat's this?" {
//			val model = parseHelper.parse('''
//				datatype Foo
//				platform ClassBased {
//					typemapping Foo -> Foo (foo.base)
//				}
//			''')
//		}
		
	}
	
	/**
	 * Types can be mapped. This is needed in order to be able to use a common type system in the DSL
	 * while being able to use platform-specific types in the code generators for the individual platform.
	 */
	context "Type Mapping" {
		
		fact "Adding a primitive type must not yield an import, even if the type is mapped." {
			val model = parseHelper.parse('''
				datatype Zap
				platform ClassBased {
					typemapping Zap -> zap primitive
				}
			''')
			
			val zapType = model.elements.filter(typeof(DataType)).findFirst[name == 'Zap']
			subject.add(zapType)
			subject.empty should be true
		}
		
		fact "However, serializing a primitive type must yield the mapped name (and NO import)." {
			val model = parseHelper.parse('''
				datatype Zap
				platform ClassBased {
					typemapping Zap -> zap primitive
				}
			''')
			
			val zapType = model.elements.filter(typeof(DataType)).findFirst[name == 'Zap']
			subject.serialize(zapType) should be 'zap'
			subject.empty should be true
		}
		
		fact "Mapping a regular type should yield the mapped type name as an import." {
			val model = parseHelper.parse('''
				datatype Bar
				platform ClassBased {
					typemapping Bar -> BarClass
				}
			''')
			
			val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
			subject.add(barType)
			subject.imports.head should be 'BarClass'
		}
		
	}

	/**
	 * Sometime we need to add a type to the import manager and use the type name at the same time. 
	 * This process is called _serialization_.
	 */
	context "Serialization" {
		fact "Serializing a primitive type yields its mapped name" {
			val model = parseHelper.parse('''
				datatype Zap
				platform ClassBased {
					typemapping Zap -> zap primitive
				}
			''')
			
			val zapType = model.elements.filter(typeof(DataType)).findFirst[name == 'Zap']
			subject.serialize(zapType) should be 'zap'
		}
		
		fact "Serializing a mapped type yields its mapped name" {
			val model = parseHelper.parse('''
				datatype Foo
				platform ClassBased {
					typemapping Foo -> FooClass
				}
			''')
			
			val fooType = model.elements.filter(typeof(DataType)).findFirst[name == 'Foo']
			subject.serialize(fooType) should be 'FooClass'
		}
		
		fact "Serializing an unmapped type yields its regular name" {
			val model = parseHelper.parse('''
				datatype Bar
			''')
			
			val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
			subject.serialize(barType) should be 'Bar'
		}
	} 

	context "Scope" {
		
		@Inject ImportManagerFactory importManagerFactory
		
		fact "A type must not import itself. Only external types need to be imported." {
			val model = parseHelper.parse('''
				entity Foo { }
				entity Bar extends Foo {}
			''')
			val foo = model.elements.filter(typeof(Entity)).findFirst[name == 'Foo']
			val bar = model.elements.filter(typeof(Entity)).findFirst[name == 'Bar']
			
			val importManager = importManagerFactory.create(bar)
			
			importManager.add(bar)
			importManager.imports.size should be 0
			importManager.serialize(bar) should be 'Bar'
			
			importManager.serialize(foo) should be 'Foo'
			importManager.imports.size should be 1
		}
		
	}
	
	/**
	 * Well-known classes are classes that are part of the runtime and do not need to be imported, or that 
	 * are part of the runtime and need to be imported using a specific, predefined import.
	 */
	context "Well-known classes" {

		@Inject ImportManagerFactory importManagerFactory
		
		/**
		 * Well-known classes can register a specific import. This makes sense for languages that support
		 * having more than one class inside a particular source file. In this case, the name of the import
		 * cannot be derived directly from the name of the class to be imported. Instead, we need to register
		 * an import for each of those classes.
		 */
		fact "Well-known classes can register a specific import" {
			val model = parseHelper.parse('''
				datatype Hubba
				datatype Chuppa
				platform ClassBased {
					typemapping Hubba -> HubbaClass
					typemapping Chuppa -> ChuppaClass
				}
			''')
			val hubba = model.elements.filter(typeof(DataType)).findFirst[name == 'Hubba']
			subject.serialize(hubba) should be 'HubbaClass'
			subject.imports.head should be 'BaseClasses/ChewingGums'
		}
		
		fact "Several well-known classes can register the same specific import" {
			val model = parseHelper.parse('''
				datatype Hubba
				datatype Chuppa
				datatype Bubba
				platform ClassBased {
					typemapping Hubba -> HubbaClass
					typemapping Chuppa -> ChuppaClass
					typemapping Bubba -> BubbaClass
				}
			''')
			val hubba = model.elements.filter(typeof(DataType)).findFirst[name == 'Hubba']
			val bubba = model.elements.filter(typeof(DataType)).findFirst[name == 'Bubba']
			subject.serialize(hubba) should be 'HubbaClass'
			subject.imports.head should be 'BaseClasses/ChewingGums'
			subject.serialize(bubba) should be 'BubbaClass'
			subject.imports.head should be 'BaseClasses/ChewingGums'
		}
		
		fact "Well-known classes must only be imported if they register an import" {
			val model = parseHelper.parse('''
				datatype Hubba
				datatype Chuppa
				platform ClassBased {
					typemapping Hubba -> HubbaClass
					typemapping Chuppa -> ChuppaClass
				}
				entity Bar {
					Hubba bubba
					Chuppa chups
				}
			''')
			
			val bar = model.elements.filter(typeof(Entity)).findFirst[name == 'Bar']
			val importManager = importManagerFactory.create(bar)
			
			val chups = bar.attributes.findFirst[name == 'chups']
			importManager.serialize(chups.type) should be 'ChuppaClass'
			importManager.imports.size should be 0

			val hubba = bar.attributes.findFirst[name == 'bubba']
			importManager.serialize(hubba.type) should be 'HubbaClass'
			importManager.imports.size should be 1
		}
		
	}

} 
