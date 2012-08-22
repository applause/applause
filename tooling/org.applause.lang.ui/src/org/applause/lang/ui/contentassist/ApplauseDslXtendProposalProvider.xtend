package org.applause.lang.ui.contentassist

import org.applause.lang.applauseDsl.Attribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

class ApplauseDslXtendProposalProvider extends ApplauseDslProposalProvider {
	
	override complete_ID(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof Attribute) {
			// intentionally left blank - we want to be able to control ID proposals individually
		}
		else {
			super.complete_ID(model, ruleCall, context, acceptor)
		}
	}
	
	def private camelTails(String word) {
		val tail = word.replaceFirst("([A-Z][a-z]*)", "");
		if (tail.length > 0) {
			var list = newArrayList(word.toFirstLower)
			list.addAll(tail.camelTails)
			list
		}
		else
			newArrayList(word.toFirstLower)
	}
	
	override completeAttribute_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val attribute = model as Attribute
		val attributeName = attribute.type.name
		val proposalTexts = attributeName.camelTails
		for(proposalText: proposalTexts) {
			acceptor.accept(createCompletionProposal(proposalText, context))
		}
	}
	
}