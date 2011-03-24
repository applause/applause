package de.itemis.mobilizer.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopedElementsFor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

import de.itemis.mobilizer.appModelDsl.VariableDeclaration;

public class VariableDeclarationScope extends AbstractScope {

	protected final EObject context;
	
	public VariableDeclarationScope(EObject context) {
		super(IScope.NULLSCOPE, false);
		Preconditions.checkNotNull(context);
		this.context = context;
	}

	@Override
	public IScope getParent() {
		if(context.eContainer() == null)
			return IScope.NULLSCOPE;
		else
			return new VariableDeclarationScope(context.eContainer());
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		Iterable<VariableDeclaration> declarations = Iterables.filter(context.eContents(), VariableDeclaration.class);
		return scopedElementsFor(declarations);
	}
	
}
