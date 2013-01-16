package org.applause.lang.generator.ios.app

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Application
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.base.ScreenflowExtensions
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.lang.generator.ios.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource

class AppDelegateCompiler {
	
	@Inject extension BoilerplateExtensions
	
	@Inject extension ScreenflowExtensions
	
	@Inject extension TypeExtensions
	
	@Inject ImportManagerFactory importManagerFactory
	
	// outlet name
	public String APP_OUTPUT = IosOutputConfigurationProvider::OUTPUT_APP
	
	/**
	 * Main entry point for the entity compiler.
	 */
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		val appGroup = pfsa.mainSourceGroup
		
		resource.allContents.filter(typeof(Application)).forEach[
			pfsa.createHeaderFile(appGroup, APP_OUTPUT, "AppDelegate.h", it.compileHeader)
			pfsa.createModuleFile(appGroup, APP_OUTPUT, "AppDelegate.m", it.compileModule)
		]
	}
	
	// -- HEADER
	
	/**
	 * Compiles the header file for the app delegate
	 */
	def compileHeader(Application app) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«importManager.addImport("<UIKit/UIKit.h>")»
		«val body = app.compileInterface(importManager)»
		«importManager.imports()»
		«body»
	'''
	
	def compileInterface(Application app, ImportManager manager) '''
		@interface AppDelegate : UIResponder <UIApplicationDelegate>
		@property (strong, nonatomic) UIWindow *window;
		@end
	'''
	
	def private imports(ImportManager importManager) '''
		«IF (!importManager.empty)»
		«FOR imprt: importManager.imports»
			#import "«imprt».h"
		«ENDFOR»
		«ENDIF»
		
	'''
	
	// -- MODULE	
	
	/** 
	 * Compiles the module file for the app delegate
	 */
	def compileModule(Application app) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«val body = app.compileImplementation(importManager)»
		«importManager.imports()»
		«body»
	'''
	
	def compileImplementation(Application it, ImportManager manager) '''
		#import "AppDelegate.h"
		#import "RestKit.h"
		#import "GithubObjectMappingProvider.h"

		@interface AppDelegate ()
		@property(nonatomic, strong) UINavigationController *navigationController;
		@end

		@implementation AppDelegate

		- (void)initRestKit
		{
			// Init RestKit
			// ------------------------------
			RKObjectManager *objectManager = [RKObjectManager objectManagerWithBaseURLString:@"https://api.github.com"];
			[objectManager.client setValue:[[[UIDevice currentDevice] identifierForVendor] UUIDString] forHTTPHeaderField:@"X-UDID"];
			objectManager.client.requestQueue.showsNetworkActivityIndicatorWhenBusy = YES;

			objectManager.client.authenticationType = RKRequestAuthenticationTypeHTTPBasic;
			objectManager.serializationMIMEType = RKMIMETypeJSON;
			objectManager.acceptMIMEType = RKMIMETypeJSON;

			// for some reason, ETags don't seem to work properly. RK doesn't fetch although the backend clearly has been updated.
			objectManager.client.cachePolicy = RKRequestCachePolicyDefault; // RKRequestCachePolicyLoadIfOffline | RKRequestCachePolicyTimeout; // | RKRequestCachePolicyEtag

			objectManager.mappingProvider = [GithubObjectMappingProvider mappingProvider];

			[[[RKObjectManager sharedManager] client] setPassword:@"h00gend00bel"];
			[[[RKObjectManager sharedManager] client] setUsername:@"wwaltersen"];

		}

		- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
		{
			self.window = [[UIWindow alloc] initWithFrame:[[UIScreen mainScreen] bounds]];

			[self initRestKit];
			
			«compileRootViewControllerSetup(manager)»

			self.window.backgroundColor = [UIColor whiteColor];
			[self.window makeKeyAndVisible];
			return YES;
		}

		@end
	'''
	
	def private startScreenTypeName(Application it) {
		startScreen.typeName
	}
	
	def private startScreenVariableName(Application it) {
		startScreenTypeName.toFirstLower
	}
	
	def compileRootViewControllerSetup(Application it, ImportManager manager) '''
		«manager.serialize(startScreenTypeName)» *«startScreenVariableName» = [[«startScreenTypeName» alloc] init];
		self.navigationController =  [[UINavigationController alloc] initWithRootViewController:«startScreenVariableName»];
		self.window.rootViewController = self.navigationController;	
	'''

}