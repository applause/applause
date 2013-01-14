package org.applause.lang.base.importmanager.namespacebased

import org.applause.lang.base.ImportManager
import org.jnario.runner.CreateWith
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.applause.lang.applauseDsl.Model
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.NamespaceDeclaration
import org.applause.lang.applauseDsl.DataType
import org.applause.lang.base.ImportManagerFactory

@CreateWith(typeof(NamespaceBasedSpecCreator))
describe ImportManager {
	
	@Inject ParseHelper<Model> parseHelper
	
	def allNamespaces(Model model) {
		model.eAllContents.filter(typeof(NamespaceDeclaration))
	}
	
	context "Initialization" {
		fact "Initially, the import manager is empty." {
			subject.empty should be true 
		}
	}
	
	context "Adding elements" {
		fact "After adding an element, the import manager is not empty any more." {
			val model = parseHelper.parse('''
				namespace foo.bar {
					entity Baz {
					}
				}
			''')
			val namespaceFooBar = model.allNamespaces.head as NamespaceDeclaration
			var baz = namespaceFooBar.elements.head as Entity
			
			subject.add(baz)
			subject.empty should be false
			subject.imports.size should be 1
		}
		
		fact "Adding the same element multiple times only yields one import" {
			val model = parseHelper.parse('''
				namespace foo.bar {
					entity Baz {
					}
				}
			''')
			val namespaceFooBar = model.allNamespaces.head as NamespaceDeclaration
			var baz = namespaceFooBar.elements.head as Entity
			
			subject.add(baz)
			subject.add(baz)
			subject.empty should be false
			subject.imports.size should be 1
		}
		
		fact "Adding two different elements yields two imports" {
			val model = parseHelper.parse('''
				namespace foo.bar {
					entity Baz {
					}
					entity Boo {
					}
				}
			''')
			val namespaceFooBar = model.allNamespaces.head as NamespaceDeclaration
			var baz = namespaceFooBar.elements.filter(typeof(Entity)).findFirst[name == "Baz"]
			var boo= namespaceFooBar.elements.filter(typeof(Entity)).findFirst[name == "Boo"]
			
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
				datatype Foo
				datatype Zap
				platform FooBar {
					typemapping Foo -> Foo (foo.base)
					typemapping Zap -> zap primitive
				}
			''')
			
			val zapType = model.elements.filter(typeof(DataType)).findFirst[name == 'Zap']
			subject.add(zapType)
			subject.empty should be true
		}
			
	}
	
	/**
	 * Types can be mapped. This is needed in order to be able to use a common type system in the DSL
	 * while being able to use platform-specific types in the code generators for the individual platform.
	 */
	context "Type Mapping" {
	}

	/**
	 * Sometime we need to add a type to the import manager and use the type name at the same time. 
	 * This process is called _serialization_.
	 */
	context "Serialization" {
		
		fact "Serializing a type will return its (possible mapped) simple name" {
			val model = parseHelper.parse('''
				datatype Foo
				datatype Bar
				datatype Zap
				platform FooBar {
					typemapping Foo -> Foo (foo.base)
					typemapping Bar -> Bar (foo.baz)
					typemapping Zap -> zap
				}
			''')
			
			val zapType = model.elements.filter(typeof(DataType)).findFirst[name == 'Zap']
			subject.serialize(zapType) should be 'zap'
	
			val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
			subject.serialize(barType) should be 'Bar'
	
			val fooType = model.elements.filter(typeof(DataType)).findFirst[name == 'Foo']
			subject.serialize(fooType) should be 'Foo'
		}
	} 

	context "Scope" {
		
		@Inject ImportManagerFactory importManagerFactory		
		
		fact "" {
			val model = parseHelper.parse('''
				namespace foo.bar {
					entity Foo {}
					entity Bar {}
				}
			''')
			
			val ns = model.elements.head as NamespaceDeclaration
			val foo = ns.elements.filter(typeof(Entity)).findFirst[name == 'Foo']
			val importManager = importManagerFactory.create(foo);
			
			val bar = ns.elements.filter(typeof(Entity)).findFirst[name == 'Bar']
			importManager.serialize(bar) should be 'Bar'
			importManager.empty should be true			
		}
	}
	
	/**
	 * Well-known classes are classes that are part of the runtime and do not need to be imported, or that 
	 * are part of the runtime and need to be imported using a specific, predefined import.
	 */
	context "Well-known classes" {
		
		fact "Classes from well-known packages are not imported" {
			val model = parseHelper.parse('''
				datatype Foo
				datatype Bar
				platform FooBar {
					typemapping Foo -> Foo (foo.base)
					typemapping Bar -> Bar (foo.baz)
				}
			''')
			
			val fooType = model.elements.filter(typeof(DataType)).findFirst[name == 'Foo']
			subject.add(fooType)
			subject.empty should be true
		}		
		
		fact "Classes from non-well-known packages should be imported" {
			val model = parseHelper.parse('''
				datatype Foo
				datatype Bar
				platform FooBar {
					typemapping Foo -> Foo (foo.base)
					typemapping Bar -> Bar (foo.baz)
				}
			''')
			
			val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
			subject.add(barType)
			subject.empty should be false
		}		
	}
	
	context "Multiplicity" {
		
		@Inject ImportManagerFactory importManagerFactory		

		fact "If an attribute has a cardinality of 1, the regular type will be returned when serializing" {
			val model = parseHelper.parse('''
				namespace foo.bar {
					entity Foo {}
					entity Baz {}
					entity Bar {
						Baz baz
						Foo[] foos
						Bar[] bars
					}
				}
			''')
			
			val ns = model.elements.head as NamespaceDeclaration
			
			val bar = ns.elements.filter(typeof(Entity)).findFirst[name == 'Bar']
			val baz = bar.attributes.findFirst[name == 'baz']
			
			val importManager = importManagerFactory.create(bar);
			
			importManager.serialize(baz.type, baz.many) should be 'Baz'
			importManager.imports.size should be 0
		}
		
		fact "If an attribute is a collection, a typed collection will be returned and a collection type will be imported." {
			val model = parseHelper.parse('''
				namespace foo.bar {
					entity Foo {}
					entity Bar {
						Foo[] foos
					}
				}
			''')
			
			val ns = model.elements.head as NamespaceDeclaration
			
			val bar = ns.elements.filter(typeof(Entity)).findFirst[name == 'Bar']
			val foos = bar.attributes.findFirst[name == 'foos']
			
			val importManager = importManagerFactory.create(bar);
			
			importManager.serialize(foos.type, foos.many) should be 'foo.util.List<Foo>'
			importManager.imports.head should be 'foo.util.List'
			importManager.imports.size should be 1			
		}
		
		fact "If multiple attributes are collection types, the basic list type must only be imported once." {
			val model = parseHelper.parse('''
				namespace foo.bar {
					entity Foo {}
					entity Bar {
						Foo[] foos
						Bar[] bars
					}
				}
			''')
			
			val ns = model.elements.head as NamespaceDeclaration
			
			val bar = ns.elements.filter(typeof(Entity)).findFirst[name == 'Bar']
			val foos = bar.attributes.findFirst[name == 'foos']
			val bars = bar.attributes.findFirst[name == 'bars']
			
			val importManager = importManagerFactory.create(bar);
			
			importManager.serialize(foos.type, foos.many) should be 'foo.util.List<Foo>'
			importManager.serialize(bars.type, bars.many) should be 'foo.util.List<Bar>'
			importManager.imports.head should be 'foo.util.List'
			importManager.imports.size should be 1			
		}
	}
	

}