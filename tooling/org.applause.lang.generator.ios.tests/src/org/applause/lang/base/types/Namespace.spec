package org.applause.lang.base.types

import org.jnario.runner.CreateWith
import org.applause.lang.base.ApplauseDslSpecCreator
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.applause.lang.applauseDsl.Model
import org.applause.lang.base.TypeExtensions
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.NamespaceDeclaration
import org.applause.lang.applauseDsl.DataType

@CreateWith(typeof(ApplauseDslSpecCreator))
describe "Namespaces" {
	
	@Inject ParseHelper<Model> parseHelper
	
	context "Default namespace" {
		
		@Inject extension TypeExtensions
			
		
		fact "The namespace of an entity without a namespace is empty" {
			val model = parseHelper.parse('''
				entity Bar {}
			''')
			
			val entities = model.elements.filter(typeof(Entity))
			
			val barEntity = entities.findFirst[typeName == 'Bar']
			barEntity.namespace should be ''
		}
		
		fact "The FQN of an entity without a namespace is the plain name of the entity" {
			val model = parseHelper.parse('''
				entity Bar {}
			''')
			
			val entities = model.elements.filter(typeof(Entity))
			
			val barEntity = entities.findFirst[typeName == 'Bar']
			barEntity.fqn should be 'Bar'
		}
	}
	
	context "Simple namespace" {
		
		@Inject extension TypeExtensions		
		
		fact "The namespace of an entity in a simple namespace is the name of the namespace" {
			val model = parseHelper.parse('''
				namespace foo {
					entity Bar
				}
			''')
			
			val fooNamespace = model.elements.filter(typeof(NamespaceDeclaration)).head
			fooNamespace.name should be 'foo'
			
			val entities = fooNamespace.elements.filter(typeof(Entity))
			val barEntity = entities.findFirst[typeName == 'Bar']
			barEntity.namespace should be 'foo'
		}
		
		fact "The FQN of an entity in a simple namespace is the name of the namespace plus the name of the entity" {
			val model = parseHelper.parse('''
				namespace foo {
					entity Bar
				}
			''')
			
			val fooNamespace = model.elements.filter(typeof(NamespaceDeclaration)).head
			fooNamespace.name should be 'foo'
			
			val entities = fooNamespace.elements.filter(typeof(Entity))
			val barEntity = entities.findFirst[typeName == 'Bar']
			barEntity.fqn should be 'foo.Bar'
		}
	}
	
	context "Nested namespaces" {
		
		@Inject extension TypeExtensions		
		
		fact "The namespace of an entity in a nested namespace is the qualified name of the namespace" {
			val model = parseHelper.parse('''
				namespace foo.bar {
					entity Bar
				}
			''')
			
			val fooNamespace = model.elements.filter(typeof(NamespaceDeclaration)).head
			fooNamespace.name should be 'foo.bar'
			
			val entities = fooNamespace.elements.filter(typeof(Entity))
			val barEntity = entities.findFirst[typeName == 'Bar']
			barEntity.namespace should be 'foo.bar'
		}
		
		fact "The FQN of an entity in a nested namespace is the qualified name of the namespace plus the name of the entity" {
			val model = parseHelper.parse('''
				namespace foo.bar {
					entity Bar
				}
			''')
			
			val fooNamespace = model.elements.filter(typeof(NamespaceDeclaration)).head
			fooNamespace.name should be 'foo.bar'
			
			val entities = fooNamespace.elements.filter(typeof(Entity))
			val barEntity = entities.findFirst[typeName == 'Bar']
			barEntity.fqn should be 'foo.bar.Bar'
		}
	}
	
	context "Mapping classes to namespaces" {
		
		@Inject extension TypeExtensions
		
		fact "Types can be mapped to namespaces" {
			val model = parseHelper.parse('''
				datatype Bar
				platform FooBar {
					typemapping Bar -> Bar (foo.baz) 
				}
			''')
			val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
			barType.namespace should be 'foo.baz'
		}
		
		fact "Mapped types can be used in attributes" {
			val model = parseHelper.parse('''
				datatype Bar
				platform FooBar {
					typemapping Bar -> Bar (foo.baz) 
				}
				entity BooBar {
					Bar bar
				}
			''')
			val boobarEntity = model.elements.filter(typeof(Entity)).head
			val barAttribute = boobarEntity.attributes.head
			barAttribute.type.namespace should be 'foo.baz'
			barAttribute.typeName should be 'Bar'
		}
		
		fact "Type mappings" {
			val model = parseHelper.parse('''
				datatype Foo
				datatype Bar
				datatype Zap
				platform FooBar {
					typemapping Bar -> BarBu (foo.baz)
					typemapping Zap -> zap 
				}
				entity BooBar {
					Bar bar
				}
			''')
			val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
			barType.name should be 'Bar'
			barType.namespace should be 'foo.baz'
			barType.typeName should be 'BarBu'
			
			val boobarEntity = model.elements.filter(typeof(Entity)).head
			val barAttribute = boobarEntity.attributes.head
			barAttribute.type.name should be 'Bar'
			barAttribute.type.namespace should be 'foo.baz'
			barAttribute.typeName should be 'BarBu'
			
			val zapType = model.elements.filter(typeof(DataType)).findFirst[name == 'Zap']
			zapType.name = 'Zap'
			zapType.fqn should be 'zap'
			zapType.typeName should be 'zap'
		}		
		
		fact "Namespaces can be mapped" {
			val model = parseHelper.parse('''
				datatype Foo
				datatype Bar
				datatype Zap
				platform FooBar {
					typemapping Bar -> BarBu (foo.baz)
					typemapping Zap -> zap
					namespacemapping foo.baz -> Foo.Baz 
				}
				entity BooBar {
					Bar bar
				}
			''')
			val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
			barType.name should be 'Bar'
			barType.namespace should be 'Foo.Baz'
			barType.typeName should be 'BarBu'		
			barType.fqn should be 'Foo.Baz.BarBu'		
		}
		
	}
	
	

}