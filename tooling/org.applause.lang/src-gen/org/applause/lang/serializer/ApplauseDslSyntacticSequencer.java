package org.applause.lang.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.applause.lang.services.ApplauseDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ApplauseDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ApplauseDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ScreenListItemCell___ActionsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_Screen___ActionsKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ApplauseDslGrammarAccess) access;
		match_ScreenListItemCell___ActionsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getScreenListItemCellAccess().getActionsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getScreenListItemCellAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getScreenListItemCellAccess().getRightCurlyBracketKeyword_5_3()));
		match_Screen___ActionsKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getScreenAccess().getActionsKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_11_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ScreenListItemCell___ActionsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_ScreenListItemCell___ActionsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Screen___ActionsKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q.equals(syntax))
				emit_Screen___ActionsKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('actions' '{' '}')?
	 */
	protected void emit_ScreenListItemCell___ActionsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('actions' '{' '}')?
	 */
	protected void emit_Screen___ActionsKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
