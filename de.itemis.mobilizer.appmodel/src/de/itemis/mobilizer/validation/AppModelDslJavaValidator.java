package de.itemis.mobilizer.validation;

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

import de.itemis.mobilizer.appModelDsl.AppModelDslPackage;
import de.itemis.mobilizer.appModelDsl.ContentProvider;
import de.itemis.mobilizer.appModelDsl.Model;
import de.itemis.mobilizer.appModelDsl.ObjectReference;
import de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction;
import de.itemis.mobilizer.appModelDsl.StringLiteral;
import de.itemis.mobilizer.appModelDsl.TabbarButton;
import de.itemis.mobilizer.appModelDsl.View;
import de.itemis.mobilizer.scoping.TypeUtil;


public class AppModelDslJavaValidator extends AbstractAppModelDslJavaValidator {

	public static final String VIEW_NAME_UPPERCASE = "viewname_uppercase";

//	@Check
//	void appHasOneHomeView(Model model) {
//		if (!with(model.getElements())
//			.filter(isHomeView())
//			.exactlyOnce()) {
//			error("You need to specify exactly one home view.", AppModelDslPackage.APPLICATION);
//		}
//	}
	
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
//			System.out.println("uri " + uri);
//			System.out.println("exists " + exists);
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
		
		Set<ObjectReference> references = ImmutableSet.copyOf(TypeUtil.getReferencesIn(provider.getUrl()));
		if(references.size()<=0)
			error("Resolver must use an attribute", AppModelDslPackage.CONTENT_PROVIDER__URL);
		if(references.size()==1) {
			// TODO: Ensure simple attribute type
		}
		if(references.size()>1)
			error("Resolver must not use more than one attribute", AppModelDslPackage.CONTENT_PROVIDER__URL);
	}
	
	void resolverExistsForDirectViewcall(SimpleProviderConstruction construction) {
		// TODO: implement
	}

	
}
