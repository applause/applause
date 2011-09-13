package templates.views;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.applause.lang.applauseDsl.ComplexProviderConstruction;
import org.applause.lang.applauseDsl.ContentProvider;
import org.applause.lang.applauseDsl.SectionCell;
import org.applause.lang.applauseDsl.TypeDescription;
import org.applause.lang.applauseDsl.View;
import org.applause.lang.applauseDsl.ViewCall;
import org.applause.lang.scoping.TypeUtil;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;

import com.google.common.collect.Iterables;

public class Extensions {
	
	private static Pair<View, ContentProvider> key(ViewCall call) {
		ContentProvider cp = null;
		if (call.getProvider() instanceof ComplexProviderConstruction) {
			ComplexProviderConstruction construction = (ComplexProviderConstruction) call.getProvider();
			cp = construction.getProvider();
		}
		return Tuples.create(call.getView(), cp);
	}
	
	public static List<ViewCall> withoutConceptionalDuplicates(@SuppressWarnings("rawtypes") List calls) {
		Set<Pair<View, ContentProvider>> keys = new HashSet<Pair<View,ContentProvider>>();
		List<ViewCall> result = new ArrayList<ViewCall>();
		
		for(ViewCall vc : Iterables.filter(calls, ViewCall.class))
			if(keys.add(key(vc)))
				result.add(vc);
		
		return result;
	}
	
	private static Pair<String, String> key(SectionCell cell) {
		TypeDescription textType = org.applause.lang.scoping.TypeUtil.getTypeOf(cell.getText());
		TypeDescription cellType = TypeUtil.getTypeOf(cell.getIterator());
		System.out.println("Tuple: " + textType.getType().getName() + "::" + cellType.getType().getName());
		return Tuples.create(cellType.getType().getName(), textType.getType().getName());
	}
	
	public static List<SectionCell> uniqueSectionCells(@SuppressWarnings("rawtypes") List cells) {
		List<SectionCell> result = new ArrayList<SectionCell>();
		Set<Pair<String, String>> keys = new HashSet<Pair<String, String>>();
		
		for(SectionCell cell: Iterables.filter(cells, SectionCell.class)) {
			if(keys.add(key(cell))) {
				System.out.println("Adding");
				result.add(cell);
			}
		}
		
		return result;
	}
	
	
}

