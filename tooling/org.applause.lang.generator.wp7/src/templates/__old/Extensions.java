package templates.__old;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

public class Extensions {
	
	public static EObject getRootContainer(EObject obj) {
		EObject result = EcoreUtil2.getRootContainer(obj);
		return result;
	}
}
