package de.itemis.mobilizer.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopedElementsFor;

import java.util.ArrayList;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import de.itemis.mobilizer.appModelDsl.Entity;
import de.itemis.mobilizer.appModelDsl.ObjectReference;
import de.itemis.mobilizer.appModelDsl.TypeDescription;

public class NestedDeclarationScope extends AbstractScope {

	private final ObjectReference container;

	public NestedDeclarationScope(ObjectReference container) {
		super(IScope.NULLSCOPE, false);
		this.container = container;
	}

	@Override
	public IScope getParent() {
		return IScope.NULLSCOPE;
	}
	
	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		TypeDescription outerType = TypeUtil.getTypeOf(container.getObject());
		if(outerType != null && outerType.getType() instanceof Entity) {
			Entity entity = (Entity) outerType.getType();
			return scopedElementsFor(entity.getProperties());
		} else
			// TODO: find out better way such as removed Iterables.emptyIterable()
			return new ArrayList<IEObjectDescription>();
	}

}
