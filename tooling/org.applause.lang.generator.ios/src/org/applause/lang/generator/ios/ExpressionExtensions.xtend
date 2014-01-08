package org.applause.lang.generator.ios

import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.EntityMemberCall
import org.applause.lang.applauseDsl.EntityMemberCallTail
import org.applause.lang.applauseDsl.StringLiteral

class ExpressionExtensions {
	
	def dispatch String evaluateExpression(StringLiteral it) {
		value
	}
	
	def dispatch String evaluateExpression(EntityMemberCall it) {
		it.head.evaluateExpression + if (tail != null) "memberCall.tail:" + tail.evaluateExpression else ''
	}
	
	def dispatch String evaluateExpression(Attribute it) {
		name
	}
	
	def dispatch String evaluateExpression(EntityMemberCallTail it) { 
		'.' + head.evaluateExpression + if (tail != null) "memberCallTail.tail:" + tail.evaluateExpression else ''
	}	
}