package de.itemis.mobilizer.generator.iphone

import de.itemis.mobilizer.appModelDsl.Application
import org.eclipse.xtext.generator.IFileSystemAccess
import de.itemis.mobilizer.appModelDsl.TabbarButton


class ApplicationDelegate {
	
	@Inject extension Extensions
	
	// TODO: extract folder from fsa 
	main(Application app, IFileSystemAccess fsa) {
		fsa.generateFile(extensions.classRootFilename + app.filenameApplicationDelegateHeader, app.headerFile)
		fsa.generateFile(extensions.classRootFilename + app.filenameApplicationDelegateModule, app.moduleFile)
	}
	
	headerFile(Application app) '''
		#import <UIKit/UIKit.h>
		
		@interface «app.applicationDelegateClassname» : NSObject <UIApplicationDelegate> {
		    UIWindow *window;
			UIViewController *rootController;
		}
		
		@property (nonatomic, retain) IBOutlet UIWindow *window;
		@property (nonatomic, retain) UIViewController *rootController;
		
		@end
	'''
	
	moduleImportStatements(Application app) '''
		«FOR b:app.buttons»
			«b.moduleImportStatement»
		«ENDFOR»
	'''
	
	moduleImportStatement(TabbarButton button) '''
		#import "«button.view.view.filenameHeader()»"
	'''
	
	moduleFile(Application app) '''
		#import "«app.filenameApplicationDelegateHeader()»"
		#import "IPUIView.h"
		#import "«app.filenameCentralProvidersHeader()»"
		
		«app.moduleImportStatements»
		
		@implementation «app.applicationDelegateClassname()»
		
		@synthesize window, rootController;
		
		-(UIViewController*)createController {
			«app.centralProvidersClassName()» *providers = [[[«app.centralProvidersClassName()» alloc] init] autorelease];
			UITabBarController *result = [[UITabBarController alloc] init];
			NSMutableArray *controllers = [NSMutableArray array];
			
			UIViewController<IPUIView> *controller;
			UINavigationController *navController;
			IPContentProvider *contentProvider;
		
			«FOR b:app.buttons»
				«b.barControllerInstance»
				
			«ENDFOR»
		
			result.viewControllers = controllers;
			return result;
		}
		
		- (void)applicationDidFinishLaunching:(UIApplication *)application {
			self.rootController = [self createController];
			[window addSubview: [self.rootController view]];
			[window makeKeyAndVisible];
		}
		
		- (void)dealloc {
			self.rootController = nil;
			[window release];
			[super dealloc];
		}
		
		
		@end
	'''
	
	barControllerInstance(TabbarButton button) '''
		«IF button.view.provider != null»
		// controller for «button.title.expression('', '')»
		contentProvider = «button.view.provider.contentProvider('providers', '', '')»;
		«ENDIF»
		
		controller = [[«button.view.view.className()» alloc] init];
		[controller setContentProvider: contentProvider];
		controller.tabBarItem.title = «button.title.expression('', '')»;
		controller.tabBarItem.image = [UIImage imageNamed:«button.icon.expression('','')»];
		navController = [[UINavigationController alloc] initWithRootViewController:controller];
		[controllers addObject: navController];
		[controller release];
		[navController release];
	'''
	
	
}