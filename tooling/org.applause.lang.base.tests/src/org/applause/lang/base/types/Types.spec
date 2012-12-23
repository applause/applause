package org.applause.lang.base.types

import org.jnario.runner.CreateWith
import org.applause.lang.base.ApplauseDslSpecCreator
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.applause.lang.applauseDsl.Model
import org.applause.lang.base.TypeExtensions

@CreateWith(typeof(ApplauseDslSpecCreator))
describe "Types" {
	
	@Inject ParseHelper<Model> parseHelper
	@Inject extension TypeExtensions
	
	fact "Datatypes have a name" {
		val model = parseHelper.parse('''
			datatype Foo
		''')
		
		val fooType = model.elements.head
		fooType.typeName should be 'Foo'
	}
	
	fact "Entities have a name" {
		val model = parseHelper.parse('''
			entity Bar {}
		''')
		
		val barType = model.elements.head
		barType.typeName should be 'Bar'
	}

}