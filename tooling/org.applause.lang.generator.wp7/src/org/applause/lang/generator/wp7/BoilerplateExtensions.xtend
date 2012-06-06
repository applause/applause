package org.applause.lang.generator.wp7

class BoilerplateExtensions {
	
	def fileHeader() '''
		«fileHeader(copyright, license, true)»
	'''
	
	def String license() '''
		* All rights reserved. This program and the accompanying materials
		* are made available under the terms of the Eclipse Public License v1.0
		* which accompanies this distribution, and is available at
		* http://www.eclipse.org/legal/epl-v10.html
	'''

	def String copyright() '''
		* (c) 2012 Peter Friese (http://www.peterfriese.de) and others.
	'''

	
	def fileHeader(String copyright, String license, Boolean generatedWarning) '''
		/*
		 «copyright»
		 * 
		 «license»
		 «IF generatedWarning»
		 *
		 * WARNING! Generated file - do not change!
		 «ENDIF»
		 */
	'''
	
}