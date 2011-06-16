package de.itemis.mobilizer.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopedElementsFor;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.collect.Iterables;

import de.itemis.mobilizer.appModelDsl.Entity;
import de.itemis.mobilizer.appModelDsl.ObjectReference;
import de.itemis.mobilizer.appModelDsl.TypeDescription;

public class NestedDeclarationScope extends AbstractScope {

	private final ObjectReference container;

	public NestedDeclarationScope(ObjectReference container) {
		this.container = container;
	}

	public IScope getOuterScope() {
		return IScope.NULLSCOPE;
	}

	@Override
	protected Iterable<IEObjectDescription> internalGetContents() {
		TypeDescription outerType = TypeUtil.getTypeOf(container.getObject());
		if(outerType.getType() instanceof Entity) {
			Entity entity = (Entity) outerType.getType();
			return scopedElementsFor(entity.getProperties());
		} else
			return Iterables.emptyIterable();
	}

}
