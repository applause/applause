package de.itemis.mobilizer.generator.iphone

import de.itemis.mobilizer.appModelDsl.Application
import org.eclipse.xtext.generator.IFileSystemAccess
import de.itemis.mobilizer.appModelDsl.ContentProvider

class Provider {
	
	@Inject extension de.itemis.mobilizer.generator.base.Extensions as baseExtensions 
	@Inject extension Extensions
	
	// TODO: extract folder from fsa 
	main(Application app, IFileSystemAccess fsa) {
		fsa.generateFile(extensions.classRootFilename + app.filenameCentralProvidersHeader, app.headerFile)
		fsa.generateFile(extensions.classRootFilename + app.filenameCentralProvidersModule, app.moduleFile)
	}
	
	headerFile(Application app) '''
		#import "IPContentProvider.h"
		
		@interface «app.centralProvidersClassName()» : NSObject {
		
		}
		
		«FOR p : app.providersWithImplementation()»
		«p.methodSignature()»;
		«ENDFOR»
		
		@end
	'''
	
	methodSignature(ContentProvider p) {
		"-(IPContentProvider*)providerFor" + p.name +
			(if(p.parameter != null) ':(id)' + p.parameter.name else '') 
	}
	
	moduleFile(Application app) '''
		#import "«app.filenameCentralProvidersHeader()»"
		#import "IPXMLContentProvider.h"
		
		@implementation «app.centralProvidersClassName()»
		
		«FOR p : app.providersWithImplementation()»
			«p.providerMethodImplementation»
			
		«ENDFOR»
		
		@end
	'''
	
	providerMethodImplementation(ContentProvider p) {
		val kvcTarget = if(p.parameter?.name != null) p.parameter.name else '';  
		return p.methodSignature + '''
			 {
				NSString* url = «p.url.expression(kvcTarget, '')»;
				IPContentProvider *result = [[[IPXMLContentProvider alloc] 
											  initWithURL: [NSURL URLWithString:url] 
											  initialContent: nil
											  keyPathToContent: «p.selection.expression(kvcTarget, '')»
											  andProviders:self] autorelease];
				return result;
			}
		'''		
	}
	
}