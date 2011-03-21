package de.itemis.mobilizer.scoping;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

import de.itemis.mobilizer.appModelDsl.AppModelDslFactory;
import de.itemis.mobilizer.appModelDsl.CollectionIterator;
import de.itemis.mobilizer.appModelDsl.CollectionLiteral;
import de.itemis.mobilizer.appModelDsl.Expression;
import de.itemis.mobilizer.appModelDsl.ObjectReference;
import de.itemis.mobilizer.appModelDsl.Parameter;
import de.itemis.mobilizer.appModelDsl.Property;
import de.itemis.mobilizer.appModelDsl.ScalarExpression;
import de.itemis.mobilizer.appModelDsl.StringConcat;
import de.itemis.mobilizer.appModelDsl.StringReplace;
import de.itemis.mobilizer.appModelDsl.StringUrlConform;
import de.itemis.mobilizer.appModelDsl.Type;
import de.itemis.mobilizer.appModelDsl.TypeDescription;
import de.itemis.mobilizer.appModelDsl.VariableDeclaration;
import de.itemis.mobilizer.appModelDsl.util.AppModelDslSwitch;

public class TypeUtil {
	
//	public class TypeDesc {
//		private final Type type;
//		private final boolean many;
//		
//		public TypeDesc(Type type, boolean many) {
//			this.type = type;
//			this.many = many;
//		}
//		
//		public Type getType() {
//			return type;
//		}
//		public boolean isMany() {
//			return many;
//		}
//	}

	private static AppModelDslSwitch<TypeDescription> typeOf = new AppModelDslSwitch<TypeDescription>() {
		public TypeDescription caseProperty(Property object) {
			return object.getDescription();
		};
		
		public TypeDescription caseVariableDeclaration(VariableDeclaration object) {
			return null;
		};

		public TypeDescription caseParameter(Parameter object) {
			return object.getDescription();
		};

		public TypeDescription caseCollectionIterator(CollectionIterator object) {
			// TODO: return isMany==false
			return doGetTypeOf(object.getCollection());
		};

		public TypeDescription caseObjectReference(ObjectReference object) {
			while (object.getTail() != null)
				object = object.getTail();

			return doGetTypeOf(object.getObject());
		};
		
		public TypeDescription caseCollectionLiteral(CollectionLiteral object) {
			TypeDescription result = AppModelDslFactory.eINSTANCE.createTypeDescription();
			result.setMany(true);
			Type type = doGetTypeOf(object.getItems().get(0)).getType();
			result.setType(type);
			return result;
		};
		
	};
	
	private static TypeDescription doGetTypeOf(EObject object) {
//		System.out.println("doGetTypeOf: " + object.eClass().getName());
		TypeDescription result = typeOf.doSwitch(object);
		if(result == null) {
			typeOf.doSwitch(object);
		}
		return result;
	}
	
	public static TypeDescription getTypeOf(VariableDeclaration declaration) {
		return doGetTypeOf(declaration);
	}
	
	public static TypeDescription getTypeOf(Expression expression) {
		return doGetTypeOf(expression);
	}
	
	public static AppModelDslSwitch<Iterable<ObjectReference>> referencesIn = new AppModelDslSwitch<Iterable<ObjectReference>>() {
		public Iterable<ObjectReference> caseScalarExpression(ScalarExpression object) {
			return Iterables.emptyIterable();
		};
		
		public Iterable<ObjectReference> caseObjectReference(ObjectReference object) {
			return Arrays.asList(object);
		};
		
		public Iterable<ObjectReference> caseStringConcat(StringConcat sc) {
			Iterable<ObjectReference> result = Iterables.emptyIterable();
			for(ScalarExpression e : sc.getValues()) {
				result = Iterables.concat(result, getReferencesIn(e));
			}
			return result;
		};
		
		public Iterable<ObjectReference> caseStringUrlConform(StringUrlConform object) {
			return getReferencesIn(object.getValue());
		};
		
		@SuppressWarnings("unchecked")
		public Iterable<ObjectReference> caseStringReplace(StringReplace object) {
			return Iterables.concat(
					getReferencesIn(object.getValue()),
					getReferencesIn(object.getMatch()),
					getReferencesIn(object.getReplacement())
					);
		};
		
		
	};

	public static List<ObjectReference> getReferencesIn(ScalarExpression e) {
		return ImmutableList.copyOf(referencesIn.doSwitch(e));
	}

}
