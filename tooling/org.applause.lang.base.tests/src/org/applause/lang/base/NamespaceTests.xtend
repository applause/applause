package org.applause.lang.base

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Model
import org.applause.lang.applauseDsl.NamespaceDeclaration
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.applause.lang.applauseDsl.DataType

@InjectWith(typeof(ApplauseDslTestInjectorProvider))
@RunWith(typeof(XtextRunner))
class NamespaceTests {
	
	@Inject extension TypeExtensions
	
	@Inject ParseHelper<Model> parseHelper

	
	@Test
	def testNoNamespace() {
		val model = parseHelper.parse('''
			entity Bar {}
			entity Foo {}
		''')
		
		val entities = model.elements.filter(typeof(Entity))
		assertTrue(entities.size == 2)
		
		val fooEntity = entities.findFirst[typeName == 'Foo']
		assertEquals("", fooEntity.namespace)
		assertEquals("Foo", fooEntity.fqn)
		
		val barEntity = entities.findFirst[typeName == 'Bar']
		assertEquals("", barEntity.namespace)
		assertEquals("Bar", barEntity.fqn)
	}
	
	@Test
	def testSimpleNamespace() {
		val model = parseHelper.parse('''
			namespace foo {
				entity Bar {}
				entity Foo {}
			}
		''')
		
		val fooNamespace = model.elements.filter(typeof(NamespaceDeclaration)).head
		val entities = fooNamespace.elements.filter(typeof(Entity))
		assertTrue(entities.size == 2)
		
		val fooEntity = entities.findFirst[typeName == 'Foo']
		assertEquals("foo", fooEntity.namespace)
		assertEquals("foo.Foo", fooEntity.fqn)
		
		val barEntity = entities.findFirst[typeName == 'Bar']
		assertEquals("foo", barEntity.namespace)
		assertEquals("foo.Bar", barEntity.fqn)
	}
	
	@Test
	def testFooBarNamespace() {
		val model = parseHelper.parse('''
			namespace foo.bar {
				entity Bar {}
				entity Foo {}
			}
		''')
		
		val fooNamespace = model.elements.filter(typeof(NamespaceDeclaration)).head
		val entities = fooNamespace.elements.filter(typeof(Entity))
		assertTrue(entities.size == 2)
		
		val fooEntity = entities.findFirst[typeName == 'Foo']
		assertEquals("foo.bar", fooEntity.namespace)
		assertEquals("foo.bar.Foo", fooEntity.fqn)
		
		val barEntity = entities.findFirst[typeName == 'Bar']
		assertEquals("foo.bar", barEntity.namespace)
		assertEquals("foo.bar.Bar", barEntity.fqn)
	}
	
	@Test
	def testDataTypeNamespaces() {
		val model = parseHelper.parse('''
			datatype Foo
			datatype Bar
			platform FooBar {
				typemapping Bar -> foo.baz.Bar 
			}
			entity BooBar {
				Bar bar
			}
		''')
		val fooType = model.elements.filter(typeof(DataType)).findFirst[name == 'Foo']
		assertEquals('', fooType.namespace)

		val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
		assertEquals('foo.baz', barType.namespace)
		
		val boobarEntity = model.elements.filter(typeof(Entity)).head
		val barAttribute = boobarEntity.attributes.head
		assertEquals('foo.baz', barAttribute.type.namespace)
		assertEquals('Bar', barAttribute.typeName)
	}
	
	@Test
	def testTypeMappings() {
		val model = parseHelper.parse('''
			datatype Foo
			datatype Bar
			datatype Zap
			platform FooBar {
				typemapping Bar -> foo.baz.BarBu
				typemapping Zap -> zap 
			}
			entity BooBar {
				Bar bar
			}
		''')
		val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
		assertEquals('Bar', barType.name)
		assertEquals('foo.baz', barType.namespace)
		assertEquals('BarBu', barType.typeName)
		
		val boobarEntity = model.elements.filter(typeof(Entity)).head
		val barAttribute = boobarEntity.attributes.head
		assertEquals('Bar', barAttribute.type.name)
		assertEquals('foo.baz', barAttribute.type.namespace)
		assertEquals('BarBu', barAttribute.typeName)
		
		val zapType = model.elements.filter(typeof(DataType)).findFirst[name == 'Zap']
		assertEquals('Zap', zapType.name)
		assertEquals('zap', zapType.fqn)
		assertEquals('zap', zapType.typeName)
	}
	
	@Test
	def testNamespaceMappings() {
		val model = parseHelper.parse('''
			datatype Foo
			datatype Bar
			datatype Zap
			platform FooBar {
				typemapping Bar -> foo.baz.BarBu
				typemapping Zap -> zap
				namespacemapping foo.baz -> Foo.Baz 
			}
			entity BooBar {
				Bar bar
			}
		''')
		val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
		assertEquals('Bar', barType.name)
		assertEquals('Foo.Baz', barType.namespace)
		assertEquals('BarBu', barType.typeName)		
		assertEquals('Foo.Baz.BarBu', barType.fqn)		
	}
	
}