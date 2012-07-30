package org.applause.lang.base

import com.google.inject.Inject
import org.applause.lang.applauseDsl.DataType
import org.applause.lang.applauseDsl.Model
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.applause.lang.applauseDsl.Entity

@InjectWith(typeof(ApplauseDslTestInjectorProvider))
@RunWith(typeof(XtextRunner))
class TypeTests {
	
	@Inject extension TypeExtensions
	
	@Inject ParseHelper<Model> parseHelper
	
	@Test
	def testSimpleDataTypeNames() {
		val model = parseHelper.parse('''
			datatype Foo
			datatype Bar
		''')
		
		val datatypes = model.elements.filter(typeof(DataType))
		assertTrue(datatypes.size == 2)
		
		val fooType = datatypes.findFirst[name == 'Foo']
		assertEquals('Foo', fooType.typeName)
		
		val barType = datatypes.findFirst[name == 'Bar']
		assertEquals('Bar', barType.typeName)
	}
	
	@Test
	def testSimpleEntityTypeNames() {
		val model = parseHelper.parse('''
			entity Bar {}
			entity Foo {}
		''')
		
		val entities = model.elements.filter(typeof(Entity))
		assertTrue(entities.size == 2)
		
		val fooEntity = entities.findFirst[name == 'Foo']
		assertEquals("Foo", fooEntity.typeName)
		
		val barEntity = entities.findFirst[name == 'Bar']
		assertEquals("Bar", barEntity.typeName)
	}
	
}