package templates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.applause.lang.applauseDsl.ComplexProviderConstruction;
import org.applause.lang.applauseDsl.ContentProvider;
import org.applause.lang.applauseDsl.View;
import org.applause.lang.applauseDsl.ViewCall;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;

import com.google.common.collect.Iterables;

public class Extensions {
	
	public static EObject getRootContainer(EObject obj) {
		EObject result = EcoreUtil2.getRootContainer(obj);
		return result;
	}

	private static Pair<View, ContentProvider> key(ViewCall call) {
		ContentProvider cp = null;
		if (call.getProvider() instanceof ComplexProviderConstruction) {
			ComplexProviderConstruction construction = (ComplexProviderConstruction) call.getProvider();
			cp = construction.getProvider();
		}
		return Tuples.create(call.getView(), cp);
	}
	
	@SuppressWarnings("rawtypes")
	public static List<ViewCall> withoutConceptionalDuplicates(List calls) {
		System.out.println(calls);
		Set<Pair<View, ContentProvider>> keys = new HashSet<Pair<View,ContentProvider>>();
		List<ViewCall> result = new ArrayList<ViewCall>();
		
		for(ViewCall vc : Iterables.filter(calls, ViewCall.class))
			if(keys.add(key(vc)))
				result.add(vc);
		
		return result;
	}
}
