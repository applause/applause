package org.applause.lang.scoping;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.applause.lang.applauseDsl.ApplauseDslFactory;
import org.applause.lang.applauseDsl.CollectionIterator;
import org.applause.lang.applauseDsl.CollectionLiteral;
import org.applause.lang.applauseDsl.ComplexProviderConstruction;
import org.applause.lang.applauseDsl.ContentProvider;
import org.applause.lang.applauseDsl.Expression;
import org.applause.lang.applauseDsl.ObjectReference;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Property;
import org.applause.lang.applauseDsl.ProviderConstruction;
import org.applause.lang.applauseDsl.ScalarExpression;
import org.applause.lang.applauseDsl.SimpleProviderConstruction;
import org.applause.lang.applauseDsl.SimpleType;
import org.applause.lang.applauseDsl.StringConcat;
import org.applause.lang.applauseDsl.StringFunction;
import org.applause.lang.applauseDsl.StringLiteral;
import org.applause.lang.applauseDsl.StringReplace;
import org.applause.lang.applauseDsl.StringSplit;
import org.applause.lang.applauseDsl.StringUrlConform;
import org.applause.lang.applauseDsl.Type;
import org.applause.lang.applauseDsl.TypeDescription;
import org.applause.lang.applauseDsl.VariableDeclaration;
import org.applause.lang.applauseDsl.util.ApplauseDslSwitch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

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

	private static ApplauseDslSwitch<TypeDescription> typeOf = new ApplauseDslSwitch<TypeDescription>() {
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
			return createDesc(doGetTypeOf(object.getCollection()).getType(), false);
		};

		public TypeDescription caseObjectReference(ObjectReference object) {
			while (object.getTail() != null)
				object = object.getTail();

			return doGetTypeOf(object.getObject());
		};
		
		public Type getStringType(EObject object) {
			EObject model = EcoreUtil.getRootContainer(object);
			List<SimpleType> allSimpleTypes = EcoreUtil2.getAllContentsOfType(model, SimpleType.class);
			Predicate<SimpleType> stringTypePredicate = new Predicate<SimpleType>() {
				public boolean apply(SimpleType input) {
					return "String".equals(input.getName());
				}
			};

			try {
				return Iterables.getOnlyElement(Iterables.filter(allSimpleTypes, stringTypePredicate));
			} catch(NoSuchElementException ex) {
				return null;
			}
		}
		
		public TypeDescription caseStringLiteral(StringLiteral object) {
			return createStringDesc(object);
		}
		
		public TypeDescription caseStringFunction(StringFunction object) {
			return createStringDesc(object);
		};
		
		public TypeDescription caseStringSplit(StringSplit object) {
			return createDesc(getStringType(object), true);
		};
		
		private TypeDescription createStringDesc(EObject object) {
			return createDesc(getStringType(object), false);
		};

		private TypeDescription createDesc(Type type, boolean isMany) {
			TypeDescription result = ApplauseDslFactory.eINSTANCE.createTypeDescription();
			result.setMany(isMany);
			result.setType(type);
			return result;
		};
		
		public TypeDescription caseCollectionLiteral(CollectionLiteral object) {
			return createDesc(doGetTypeOf(object.getItems().get(0)).getType(), true);
		};
		
		public TypeDescription caseComplexProviderConstruction(ComplexProviderConstruction object) {
			ContentProvider p = object.getProvider();
			if(p==null)
				return null;
			
			return createDesc(p.getType(), p.isMany());
		};
		
		public TypeDescription caseSimpleProviderConstruction(SimpleProviderConstruction object) {
			return doGetTypeOf(object.getExpression());
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
	
	public static TypeDescription getTypeOf(ScalarExpression expression) {
		return doGetTypeOf(expression);
	}
	
	public static TypeDescription getTypeOf(VariableDeclaration declaration) {
		return doGetTypeOf(declaration);
	}
	
	public static TypeDescription getTypeOf(Expression expression) {
		return doGetTypeOf(expression);
	}
	
	public static TypeDescription getTypeOf(ProviderConstruction construction) {
		return doGetTypeOf(construction);
	}
	
	public static ApplauseDslSwitch<Iterable<ObjectReference>> referencesIn = new ApplauseDslSwitch<Iterable<ObjectReference>>() {
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
	
	

	public static boolean isAssignable(TypeDescription target,
			TypeDescription value) {
		if(target == null || value == null)
			return false;
		return isAssignable(target.getType(), value.getType()) && (target.isMany() == value.isMany());  
	}

	private static boolean isAssignable(Type target, Type value) {
		if(target == null || value == null)
			return false;
		
		// look at type hierarchy
		return target == value;
	}

	public static String asReadableString(TypeDescription desc) {
		if(desc==null || desc.getType() == null)
			return "unknown";

		return desc.getType().getName() + (desc.isMany()?"[]":"");
	}

}
