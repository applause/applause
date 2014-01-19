package org.applause.lang.generator.ios.dataaccess

import org.applause.lang.applauseDsl.AbsoluteRESTURL
import org.applause.lang.applauseDsl.ParameterCall
import org.applause.lang.applauseDsl.ParameterMemberCall
import org.applause.lang.applauseDsl.RESTURL
import org.applause.lang.applauseDsl.RelativeRESTURL
import org.applause.lang.applauseDsl.UrlPathFragment
import org.applause.lang.applauseDsl.Variable

class RESTURLExtensions {
	
	def dispatch String value(AbsoluteRESTURL it) '''http://«host.value»«if (port != 0) ':' + port»/«fragments.map(fragment | fragment.value).join('/')»''' 
	
	def dispatch String value(RelativeRESTURL it) '''/«fragments.map(fragment | fragment.value).join('/')»'''
	
	def dispatch String value(UrlPathFragment it) {
		name
	}
	
	def dispatch String value(Variable it) {
		'%@'
	}
	
	def variables(RESTURL it) {
		fragments.filter(Variable).map[variable]
	}
	
	def dispatch String variable(Variable it) {
		it.parameterReference.variable
	}
	
	def dispatch String variable(ParameterCall it) {
		it.head.name
	}
	
	def dispatch String variable(ParameterMemberCall it) {
		reference.variable + '.' + it.tail.name
	}
	
	def dispatch String variable(UrlPathFragment it) {
	}
	
}