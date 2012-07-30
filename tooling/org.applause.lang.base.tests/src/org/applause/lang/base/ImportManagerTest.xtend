package org.applause.lang.base

import com.google.inject.Inject
import com.google.inject.Provider
import org.applause.lang.ApplauseDslInjectorProvider
import org.applause.lang.applauseDsl.DataType
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Model
import org.applause.lang.applauseDsl.NamespaceDeclaration
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@InjectWith(typeof(ApplauseDslInjectorProvider))
@RunWith(typeof(XtextRunner))
class ImportManagerTest {
	
//	@Inject extension TypeExtensions
//	
//	@Inject ParseHelper<Model> parseHelper
//	
//	@Inject Provider<ImportManager> importManagerProvider
//	
//	@Test
//	def ensureImportManagerCorrectlyConfiguredViaGuiceProvider() {
//		val importManager = importManagerProvider.get
//		assertTrue(importManager.empty)
//	}
//	
//	@Test 
//	def ensureIsEmptyBeforeAdding() {
//		val importManager = importManagerProvider.get
//		assertTrue(importManager.empty)
//	}
//	
//	def allNamespaces(Model model) {
//		model.eAllContents.filter(typeof(NamespaceDeclaration))
//	}
//	
//	def helpfulSnippets() {
//		val importManager = importManagerProvider.get
//		
//		val model = parseHelper.parse('''
//			datatype String
//			platform Android {
//				typemapping String -> java.lang.String
//			}
//			namespace foo.bar {
//				entity Baz {
//				}
//				entity Hugendoobel {
//				}
//			}
//		''')
//		val datatypeString = model.elements.filter(typeof(DataType)).findFirst[name == "String"]
//		System::out.println(datatypeString.fqn)
//		
//		val namespaceFooBar = model.allNamespaces.head as NamespaceDeclaration
//		assertEquals(2, namespaceFooBar.elements.size)
//		
//		var baz = namespaceFooBar.elements.filter(typeof(Entity)).findFirst[name == "Baz"]
//		System::out.println(baz.fqn)
//		
//		importManager.add(baz)
//		assertTrue(!importManager.empty)		
//	}
//	
//	@Test
//	def ensureIsNotEmptyAfterAdding() {
//		val importManager = importManagerProvider.get
//		
//		val model = parseHelper.parse('''
//			namespace foo.bar {
//				entity Baz {
//				}
//			}
//		''')
//		val namespaceFooBar = model.allNamespaces.head as NamespaceDeclaration
//		var baz = namespaceFooBar.elements.head as Entity
//		
//		importManager.add(baz)
//		assertTrue(!importManager.empty)
//	}
//
//	@Test
//	def ensureAddingTwoEntitiesInSameNameSpaceYieldsTwoImports() {
//		val importManager = importManagerProvider.get
//		
//		val model = parseHelper.parse('''
//			namespace foo.bar {
//				entity Baz {
//				}
//				entity Boo {
//				}
//			}
//		''')
//		val namespaceFooBar = model.allNamespaces.head as NamespaceDeclaration
//		var baz = namespaceFooBar.elements.filter(typeof(Entity)).findFirst[name == "Baz"]
//		var boo= namespaceFooBar.elements.filter(typeof(Entity)).findFirst[name == "Boo"]
//		
//		importManager.add(baz)
//		importManager.add(boo)
//		assertTrue(importManager.imports.size == 2)
//	}
//
//	@Test
//	def ensureAddingEntityTwiceYieldsOnlyOneImports() {
//		val importManager = importManagerProvider.get
//		
//		val model = parseHelper.parse('''
//			namespace foo.bar {
//				entity Baz {
//				}
//				entity Boo {
//				}
//			}
//		''')
//		val namespaceFooBar = model.allNamespaces.head as NamespaceDeclaration
//		var boo= namespaceFooBar.elements.filter(typeof(Entity)).findFirst[name == "Boo"]
//		
//		importManager.add(boo)
//		importManager.add(boo)
//		assertTrue(importManager.imports.size == 1)
//	}
//	
//	@Test
//	def ensureWellknownPackagesAreIgnored() {
//		val importManager = importManagerProvider.get
//		
//		val model = parseHelper.parse('''
//			datatype String
//			platform Android {
//				typemapping String -> java.lang.String
//			}
//		''')
//		
//		val stringType = model.elements.filter(typeof(DataType)).head
//		importManager.add(stringType)
//		assertTrue(importManager.empty)
//	}

	
}