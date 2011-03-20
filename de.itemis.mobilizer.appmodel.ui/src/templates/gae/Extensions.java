package templates.gae;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction;
import de.itemis.mobilizer.appModelDsl.ContentProvider;
import de.itemis.mobilizer.appModelDsl.View;
import de.itemis.mobilizer.appModelDsl.ViewCall;

public class Extensions {

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
