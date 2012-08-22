package org.applause.lang.base.importmanager.classbased

import com.google.inject.Inject
import com.google.inject.Provider
import org.applause.lang.applauseDsl.DataType
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Model
import org.applause.lang.applauseDsl.NamespaceDeclaration
import org.applause.lang.base.ImportManager
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.applause.lang.base.ImportManagerFactory

@InjectWith(typeof(InjectorProvider))
@RunWith(typeof(XtextRunner))
class ImportManagerTest {
	
	@Inject ParseHelper<Model> parseHelper
	
	@Inject Provider<ImportManager> importManagerProvider
	
	@Test
	def ensureImportManagerCorrectlyConfiguredViaGuiceProvider() {
		val importManager = importManagerProvider.get
		assertTrue(importManager.empty)
	}
	
	@Test 
	def ensureIsEmptyBeforeAdding() {
		val importManager = importManagerProvider.get
		assertTrue(importManager.empty)
	}
	
	def allNamespaces(Model model) {
		model.eAllContents.filter(typeof(NamespaceDeclaration))
	}
	
	@Test
	def ensureIsNotEmptyAfterAdding() {
		val importManager = importManagerProvider.get
		
		val model = parseHelper.parse('''
			entity Baz {
			}
		''')
		var baz = model.elements.head as Entity
		
		importManager.add(baz)
		assertFalse(importManager.empty)
	}

	@Test
	def ensureAddingTwoEntitiesYieldsTwoImports() {
		val importManager = importManagerProvider.get
		
		val model = parseHelper.parse('''
			entity Baz {
			}
			entity Boo {
			}
		''')
		var baz = model.elements.filter(typeof(Entity)).findFirst[name == "Baz"]
		var boo= model.elements.filter(typeof(Entity)).findFirst[name == "Boo"]
		
		importManager.add(baz)
		importManager.add(boo)
		assertTrue(importManager.imports.size == 2)
	}

	@Test
	def ensureAddingEntityTwiceYieldsOnlyOneImports() {
		val importManager = importManagerProvider.get
		
		val model = parseHelper.parse('''
			namespace foo.bar {
				entity Baz {
				}
				entity Boo {
				}
			}
		''')
		val namespaceFooBar = model.allNamespaces.head as NamespaceDeclaration
		var boo= namespaceFooBar.elements.filter(typeof(Entity)).findFirst[name == "Boo"]
		
		importManager.add(boo)
		importManager.add(boo)
		assertTrue(importManager.imports.size == 1)
	}
	
	@Test
	def ensurePrimitiveTypesAreIgnored() {
		val importManager = importManagerProvider.get
		
		val model = parseHelper.parse('''
			datatype Foo
			datatype Zap
			platform ClassBased {
				typemapping Foo -> foo.base.Foo
				typemapping Zap -> zap primitive
			}
		''')
		
		val zapType = model.elements.filter(typeof(DataType)).findFirst[name == 'Zap']
		importManager.add(zapType)
		assertTrue(importManager.empty)
	}
	
	@Test
	def testSerialization() {
		val importManager = importManagerProvider.get
		
		val model = parseHelper.parse('''
			datatype Foo
			datatype Bar
			datatype Zap
			platform ClassBased {
				typemapping Foo -> FooClass
				typemapping Bar -> BarClass
				typemapping Zap -> zap primitive
			}
		''')
		
		val zapType = model.elements.filter(typeof(DataType)).findFirst[name == 'Zap']
		assertEquals('zap', importManager.serialize(zapType))

		val barType = model.elements.filter(typeof(DataType)).findFirst[name == 'Bar']
		assertEquals('BarClass', importManager.serialize(barType))

		val fooType = model.elements.filter(typeof(DataType)).findFirst[name == 'Foo']
		assertEquals('FooClass', importManager.serialize(fooType))
	}
	
	@Inject ImportManagerFactory importManagerFactory
	
	@Test
	def testImportListContainsClassnamesOnly() {
		val model = parseHelper.parse('''
			entity Foo { }
			entity Bar extends Foo {}
		''')
		
		val foo = model.elements.filter(typeof(Entity)).findFirst[name == 'Foo']
		val bar = model.elements.filter(typeof(Entity)).findFirst[name == 'Bar']
		val importManager = importManagerFactory.create(bar)
		assertEquals('Foo', importManager.serialize(foo))
		assertEquals(1, importManager.imports.size)
		
	}
	
	@Test def testImportsForWellknownTypes() {
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
		val hubba = bar.attributes.findFirst[name == 'bubba']
		val chups = bar.attributes.findFirst[name == 'chups']
		val importManager = importManagerFactory.create(bar)
		
		assertEquals('HubbaClass', importManager.serialize(hubba.type))
		assertEquals('BaseClasses/ChewingGums', importManager.imports.head)
		
		assertEquals('ChuppaClass', importManager.serialize(chups.type))
		assertEquals(1, importManager.imports.size)
	}
	
}