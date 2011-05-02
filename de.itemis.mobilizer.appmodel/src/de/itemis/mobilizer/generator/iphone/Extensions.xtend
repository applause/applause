package de.itemis.mobilizer.generator.iphone

import de.itemis.mobilizer.appModelDsl.Application
import de.itemis.mobilizer.appModelDsl.View
import de.itemis.mobilizer.appModelDsl.ProviderConstruction
import de.itemis.mobilizer.appModelDsl.Expression
import de.itemis.mobilizer.appModelDsl.CollectionExpression
import de.itemis.mobilizer.appModelDsl.StringSplit
import de.itemis.mobilizer.appModelDsl.ScalarExpression
import de.itemis.mobilizer.appModelDsl.StringLiteral
import de.itemis.mobilizer.appModelDsl.StringConcat
import de.itemis.mobilizer.appModelDsl.StringUrlConform
import de.itemis.mobilizer.appModelDsl.StringReplace
import java.util.List
import de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction
import de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction

class Extensions {
	// TODO: refactor pattern class+headerfilename+modulefilename
	
	classRootFilename() {
		"Generated/"
	}
	
	applicationDelegateClassname(Application app) {
		app.name + "AppDelegate"
	}
	
	filenameApplicationDelegateHeader(Application app) {
		app.applicationDelegateClassname() + '.h';
	}
	
	filenameApplicationDelegateModule(Application app) {
		app.applicationDelegateClassname() + '.m';
	}
	
	centralProvidersClassName(Application app) {
		app.name + "Providers";
	}
		
	filenameCentralProvidersHeader(Application app) {
		app.centralProvidersClassName() + ".h";
	}
		
	filenameCentralProvidersModule(Application app) {
		app.centralProvidersClassName() + ".m";
	}
	
	className(View view) {
		view.name.toFirstUpper() + "ViewController";
	}

	filenameHeader(View view) {
		view.className() + ".h";
	}
	
	filenameModule(View view) {
		view.className() + ".m";
	}
	
	// -----------------------------------
	
	dispatch contentProvider(ProviderConstruction construction, String providers, String kvcTarget, String kvcPrefix) {
		"<!ERROR!" + construction.eClass + ">";
	}
	
	dispatch contentProvider(SimpleProviderConstruction c, String providers, String kvcTarget, String kvcPrefix) {
		'[IPSimpleContentProvider providerWithContent:' +
		c.expression.expression(kvcTarget, kvcPrefix) +
	 	' andProviders:self.contentProvider.providers]';
 	}
	 
	dispatch contentProvider(ComplexProviderConstruction c, String providers, String kvcTarget, String kvcPrefix) {
		'[' + providers + ' providerFor' + c.provider.name + 
			(if (c.argument == null) '' else ': ' + c.argument.expression(kvcTarget, kvcPrefix))
		+ ']';
	}
	
	// -----------------------------------
	
	dispatch expression(Expression e, String kvcTarget, String kvcPrefix) {
		"<!ERROR!" + e.eClass + ">";
	}
	
	dispatch expression(CollectionExpression e, String kvcTarget, String kvcPrefix) {
		"<!ERROR!" + e.eClass + ">";
	}
	
	dispatch expression(ScalarExpression s, String kvcTarget, String kvcPrefix) {
		"<!ERROR!" + s.eClass + ">";
	}
	
	dispatch expression(StringSplit s, String kvcTarget, String kvcPrefix) {
		"[" + expression(s.value, kvcTarget, kvcPrefix) + " componentsSeparatedByString: " + expression(s.delimiter, kvcTarget, kvcPrefix) + "]";
	}

	dispatch expression(StringLiteral s, String kvcTarget, String kvcPrefix) {
		'@"' + s.value + '"';
	}
	
	// http://stackoverflow.com/questions/63150/whats-the-best-way-to-build-a-string-of-delimited-items-in-java/63201#63201
	String join(Iterable<? extends CharSequence> s, String delimiter) {
    	if (s.isEmpty()) return "";
    	var iter = s.iterator();
    	var buffer = new StringBuffer(iter.next());
    	while (iter.hasNext()) buffer.append(delimiter).append(iter.next());
    	return buffer.toString();
	}
	
	dispatch expression(StringConcat s, String kvcTarget, String kvcPrefix) {
		'[NSString stringWithFormat:@"'
		+ s.values.map(v|"%@").join("") + '", '
		+ s.values.map(v|v.expression(kvcTarget, kvcPrefix).toString).join(", ") + "]";
	}
		
	dispatch expression(StringUrlConform s, String kvcTarget, String kvcPrefix) {
		'[' + s.value.expression(kvcTarget, kvcPrefix) + ' stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]';
	}
	
	dispatch expression(StringReplace s, String kvcTarget, String kvcPrefix) {
		'[' + 
		s.value.expression(kvcTarget, kvcPrefix) +
		' stringByReplacingOccurrencesOfString:' + 
		s.match.expression(kvcTarget, kvcPrefix) +
		' withString:' +
		s.replacement.expression(kvcTarget, kvcPrefix) +
		']';
	}
	
	
	
	
	
}