package org.applause.lang.ui.quickfix

import org.applause.lang.validation.ApplauseDslXtendValidator
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.applause.lang.applauseDsl.ListItemCell
import org.applause.lang.applauseDsl.LoopKind

class ApplauseDslXtendQuickfixProvider extends ApplauseDslQuickfixProvider {
	
//	@Fix(MyJavaValidator.INVALID_NAME)
//	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
//			public void apply(IModificationContext context) throws BadLocationException {
//				IXtextDocument xtextDocument = context.getXtextDocument();
//				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
//				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
//			}
//		});
//	}

	
	@Fix(ApplauseDslXtendValidator::ENTITY_NAME_MUST_BE_UPPERCASE)
	def capitalizeEntityName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize name", "Capitalize the entity name", "upcase.png", [
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
		])
	}
	
	@Fix(ApplauseDslXtendValidator::FOR_LOOP_SINGLE_INSTANCE)
	def changeForLoopToForeachLoop(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Change loop type from for to foreach.", "Change the loop kind.", "loopkind.png", [element, it|
			(element as ListItemCell).loop = LoopKind::FOREACH
		])
	}
	
	@Fix(ApplauseDslXtendValidator::FOREACH_LOOP_COLLECTION)
	def changeForeachLoopToForLoop(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Change loop type from foreach to for.", "Change the loop kind.", "loopkind.png", [element, it|
			(element as ListItemCell).loop = LoopKind::^FOR
		])
	}
}