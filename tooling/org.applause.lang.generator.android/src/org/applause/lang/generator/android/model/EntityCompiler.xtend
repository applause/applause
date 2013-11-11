package org.applause.lang.generator.android.model

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Attribute
import com.google.inject.Inject

class EntityCompiler {
	
	@Inject extension AttributeExtensions
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.fileName, it.compile)
		]
	}
	
	def fileName(Entity entity) {
		entity.name + ".java"
	}
	def compile(Entity it) '''
		public class «name» {
			«FOR attribute: attributes»
				«attribute.compile»
			«ENDFOR»
		}
	'''
	
	def compile(Attribute it) '''
		private «typeName» «name»;
		
		public void «setterName»(«typeName» «name») {
			this.«name» = «name»;
		}
		
		public «typeName» «getterName»() {
			return this.«name»;
		}
	'''
	
}