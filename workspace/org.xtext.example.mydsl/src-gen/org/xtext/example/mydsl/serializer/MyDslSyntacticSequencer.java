package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_collocated_separated_CollocatedKeyword_0_or_SeparatedKeyword_0;
	protected AbstractElementAlias match_hostedBy_notHostedBy_HostedByKeyword_0_or_NothostedByKeyword_0;
	protected AbstractElementAlias match_hostedBy_notHostedBy___HostedByKeyword_0_or_NothostedByKeyword_0__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_collocated_separated_CollocatedKeyword_0_or_SeparatedKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCollocatedAccess().getCollocatedKeyword_0()), new TokenAlias(false, false, grammarAccess.getSeparatedAccess().getSeparatedKeyword_0()));
		match_hostedBy_notHostedBy_HostedByKeyword_0_or_NothostedByKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getHostedByAccess().getHostedByKeyword_0()), new TokenAlias(false, false, grammarAccess.getNotHostedByAccess().getNothostedByKeyword_0()));
		match_hostedBy_notHostedBy___HostedByKeyword_0_or_NothostedByKeyword_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getHostedByAccess().getHostedByKeyword_0()), new TokenAlias(false, false, grammarAccess.getNotHostedByAccess().getNothostedByKeyword_0()));
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
			if(match_collocated_separated_CollocatedKeyword_0_or_SeparatedKeyword_0.equals(syntax))
				emit_collocated_separated_CollocatedKeyword_0_or_SeparatedKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_hostedBy_notHostedBy_HostedByKeyword_0_or_NothostedByKeyword_0.equals(syntax))
				emit_hostedBy_notHostedBy_HostedByKeyword_0_or_NothostedByKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_hostedBy_notHostedBy___HostedByKeyword_0_or_NothostedByKeyword_0__q.equals(syntax))
				emit_hostedBy_notHostedBy___HostedByKeyword_0_or_NothostedByKeyword_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'collocated' | 'separated'
	 */
	protected void emit_collocated_separated_CollocatedKeyword_0_or_SeparatedKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'hostedBy' | 'nothostedBy'
	 */
	protected void emit_hostedBy_notHostedBy_HostedByKeyword_0_or_NothostedByKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('hostedBy' | 'nothostedBy')?
	 */
	protected void emit_hostedBy_notHostedBy___HostedByKeyword_0_or_NothostedByKeyword_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
