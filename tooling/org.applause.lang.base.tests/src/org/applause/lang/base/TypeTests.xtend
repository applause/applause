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

@InjectWith(typeof(ApplauseDslTestInjectorProvider))
@RunWith(typeof(XtextRunner))
class TypeTests {
	
	@Inject extension TypeExtensions
	
	@Inject ParseHelper<Model> parseHelper
	
	@Test
	def testSimpleTypeNames() {
		val model = parseHelper.parse('''
			datatype Foo
			datatype Bar
		''')
		
		val datatypes = model.elements.filter(typeof(DataType))
		assertTrue(datatypes.size == 2)
		
		val fooType = datatypes.findFirst[name == 'Foo']
		assertEquals('Foo', fooType.name)
		
		val barType = datatypes.findFirst[name == 'Bar']
		assertEquals('Bar', barType.name)
	}
	
}