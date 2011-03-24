package de.itemis.mobilizer.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit.AbstractXtextTests;

import de.itemis.mobilizer.AppModelDslStandaloneSetup;
import de.itemis.mobilizer.appModelDsl.Model;

public class SomeTests extends AbstractXtextTests {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(AppModelDslStandaloneSetup.class);
	}
	
	public void testVariableDeclaration() throws Exception {
		String stringModel = 
			"tabbarApplication app {} \n" +
			"const VALUE 'foo' \n" +
			"entity E {} \n" +
			"contentprovider P returns E fetches XML from VALUE selects 'path' \n";
		
		// throws an LinkingError Exception if constant cannot be resolved
		Model model = (Model) this.getModel(stringModel);
		assertNotNull(model);
	}
}
