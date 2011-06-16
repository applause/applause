package org.applause.lang.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopedElementsFor;

import org.applause.lang.applauseDsl.VariableDeclaration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

public class VariableDeclarationScope extends AbstractScope {

	protected final EObject context;
	
	public VariableDeclarationScope(EObject context) {
		Preconditions.checkNotNull(context);
		this.context = context;
	}

	public IScope getOuterScope() {
		if(context.eContainer() == null)
			return IScope.NULLSCOPE;
		else
			return new VariableDeclarationScope(context.eContainer());
	}

	@Override
	protected Iterable<IEObjectDescription> internalGetContents() {
		Iterable<VariableDeclaration> declarations = Iterables.filter(context.eContents(), VariableDeclaration.class);
		return scopedElementsFor(declarations);
	}

}
