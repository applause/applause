package de.itemis.mobilizer.validation;

import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

import de.itemis.mobilizer.appModelDsl.AppModelDslPackage;
import de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction;
import de.itemis.mobilizer.appModelDsl.Constant;
import de.itemis.mobilizer.appModelDsl.ContentProvider;
import de.itemis.mobilizer.appModelDsl.Entity;
import de.itemis.mobilizer.appModelDsl.Model;
import de.itemis.mobilizer.appModelDsl.ObjectReference;
import de.itemis.mobilizer.appModelDsl.Parameter;
import de.itemis.mobilizer.appModelDsl.ProviderConstruction;
import de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction;
import de.itemis.mobilizer.appModelDsl.StringLiteral;
import de.itemis.mobilizer.appModelDsl.TabbarButton;
import de.itemis.mobilizer.appModelDsl.TypeDescription;
import de.itemis.mobilizer.appModelDsl.VariableDeclaration;
import de.itemis.mobilizer.appModelDsl.View;
import de.itemis.mobilizer.appModelDsl.ViewCall;
import de.itemis.mobilizer.scoping.TypeUtil;


public class AppModelDslJavaValidator extends AbstractAppModelDslJavaValidator {

	public static final String VIEW_NAME_UPPERCASE = "viewname_uppercase";

	@Check
	void viewNamesShouldStartWithCapital(View view) {
		if (!Character.isUpperCase(view.getName().charAt(0))) {
			error("View names should start with an uppercase letter.", AppModelDslPackage.VIEW__NAME, VIEW_NAME_UPPERCASE);
		}
	}
	
	@Check
	void iconExists(TabbarButton button) {
		if (button.getIcon() instanceof StringLiteral) {
			String filename = ((StringLiteral) button.getIcon()).getValue();
			Resource res = button.eResource();
			
			URI uri = res.getURI().appendSegment("..").appendSegment("Images").appendSegment(filename);
			boolean exists = (res.getResourceSet().getURIConverter().exists(uri, null));
			if(!exists)
				error("File does not exist.", AppModelDslPackage.TABBAR_BUTTON__ICON);
		}
	}
	
	@Check(CheckType.FAST)
	void oneResolverPerType(final ContentProvider provider) {
		if(!provider.isResolver())
			return;
		
		Model model = (Model) provider.eContainer();
		Iterable<ContentProvider> allProviders = Iterables.filter(model.getElements(), ContentProvider.class);
		
		Predicate<ContentProvider> otherProviderOfSameType = new Predicate<ContentProvider>() {
			public boolean apply(ContentProvider cp) {
				return cp.isResolver() && cp != provider && cp.getType() == provider.getType();
			}
		};
		
		if(Iterables.any(allProviders, otherProviderOfSameType)) {
			error("Only one resolver per type allowed", AppModelDslPackage.CONTENT_PROVIDER__TYPE);
		}
	}
	
	@Check(CheckType.FAST)
	void resolverMustNotReturnLists(ContentProvider provider) {
		if(provider.isResolver() && provider.isMany()) {
			error("Resolver must not return lists", AppModelDslPackage.CONTENT_PROVIDER__MANY);
		}
	}
	
	@Check(CheckType.FAST)
	void resolverMustReferToExactlyOneSimpleAttribute(ContentProvider provider) {
		if(!provider.isResolver()) 
			return;
		
		
		Function<? super ObjectReference, ? extends VariableDeclaration> objRefToDeclaration = new Function<ObjectReference, VariableDeclaration>() {
			public VariableDeclaration apply(ObjectReference from) {
				return from.getObject();
			}
		};
		Iterable<VariableDeclaration> allDeclarations = Iterables.transform(TypeUtil.getReferencesIn(provider.getUrl()), objRefToDeclaration); 
		Iterable<VariableDeclaration> withoutConstants = Iterables.filter(allDeclarations, new Predicate<VariableDeclaration>() {
			public boolean apply(VariableDeclaration d) {
				return !(d instanceof Constant);
			}
		});
		
		Set<VariableDeclaration> declarations = ImmutableSet.copyOf(withoutConstants);
		if(declarations.size()<=0)
			error("Resolver must use an attribute", AppModelDslPackage.CONTENT_PROVIDER__URL);
		if(declarations.size()>1)
			error("Resolver must not use more than one attribute", AppModelDslPackage.CONTENT_PROVIDER__URL);
	}
	
	@Check
	void resolversInAndOutIdentical(ContentProvider cp) {
		if(cp.isResolver() && !(
				cp.getType() == cp.getParameter().getDescription().getType() &&
				cp.isMany() == cp.getParameter().getDescription().isMany()))
			error("Resolvers input and output types must match", AppModelDslPackage.CONTENT_PROVIDER__TYPE);
	}
	
	public static ContentProvider findResolver(SimpleProviderConstruction construction) {
		TypeDescription typeDescription = TypeUtil.getTypeOf(construction.getExpression());
		TypeUtil.getTypeOf(construction.getExpression());
		final Entity e = (Entity) typeDescription.getType();
		
		Model model = (Model) e.eContainer();
		Iterable<ContentProvider> allProviders = Iterables.filter(model.getElements(), ContentProvider.class);
		
		Predicate<ContentProvider> matchingResolvers = new Predicate<ContentProvider>() {
			public boolean apply(ContentProvider cp) {
				return cp.isResolver() && cp.getType() == e && !cp.isMany(); 
			}
		};
		
		try {
			return Iterables.find(allProviders, matchingResolvers);
		} catch(NoSuchElementException exception) {
			return null;
		}
	}
	
	@Check
	void resolverExistsForDirectViewcall(SimpleProviderConstruction construction) {
		TypeDescription typeDescription = TypeUtil.getTypeOf(construction.getExpression());
		if (typeDescription.getType() instanceof Entity) {
				if(findResolver(construction) == null)
					error("No matching resolver found for " + typeDescription.getType().getName(), AppModelDslPackage.SIMPLE_PROVIDER_CONSTRUCTION__EXPRESSION);
		}
	}
	
	@Check
	void contentProvidersSelectIsLiteral(ContentProvider provider) {
		if(!(provider.getSelection() instanceof StringLiteral))
			error("selection must be a string literal", AppModelDslPackage.CONTENT_PROVIDER__SELECTION);
	}
	
	
	private void errorIfNotAssignable(TypeDescription actualType,
			TypeDescription expectedType, int feature) {
		if(!TypeUtil.isAssignable(expectedType, actualType)) {
			error("Type mismatch: cannot covert from " + TypeUtil.asReadableString(actualType) 
					+ " to " + TypeUtil.asReadableString(expectedType),
					feature);
		}
	}
	
	boolean errorIfCountOfArgumentsDontMatch(boolean expected, boolean actual, int feature) {
		if(expected && !actual)
			error("Expects argument but nothing was passed", feature);
		if(!expected && actual)
			error("No argument expected but an argument was passed", feature);
		return expected != actual;
	}
	
	@Check
	void viewsArgumentOfCorrectType(ViewCall vc) {
		Parameter formalParameter = vc.getView().getContent();
		ProviderConstruction actualParameter = vc.getProvider();
		
		if(! errorIfCountOfArgumentsDontMatch(formalParameter!=null, actualParameter!=null, AppModelDslPackage.VIEW_CALL__PROVIDER) ) {
			TypeDescription expectedType = formalParameter.getDescription();
			TypeDescription actualType = TypeUtil.getTypeOf(vc.getProvider());
			errorIfNotAssignable(actualType, expectedType, AppModelDslPackage.VIEW_CALL__PROVIDER);
		}
	}

	@Check
	void contentProvidersArgumentOfCorrectType(ComplexProviderConstruction pc) {
		ContentProvider p = pc.getProvider();
		if(! errorIfCountOfArgumentsDontMatch(p.getParameter() != null, pc.getArgument() != null, AppModelDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT)) {
			TypeDescription expectedType = TypeUtil.getTypeOf(p.getParameter());
			TypeDescription actualType = TypeUtil.getTypeOf(pc.getArgument());
			errorIfNotAssignable(actualType, expectedType, AppModelDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT);
		}
	}
	

	
}
