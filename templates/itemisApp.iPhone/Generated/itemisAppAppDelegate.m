
#import "itemisAppAppDelegate.h"
#import "IPUIView.h"
#import "itemisAppProviders.h"

#import "CommitListViewController.h"
#import "UserDetailsViewController.h"
#import "UserDetailsViewController.h"

@implementation itemisAppAppDelegate

@synthesize window, rootController;

-(UIViewController*)createController {
	itemisAppProviders *providers = [[[itemisAppProviders alloc] init] autorelease];
	UITabBarController *result = [[UITabBarController alloc] init];
	NSMutableArray *controllers = [NSMutableArray array];
	
	UIViewController<IPUIView> *controller;
	UINavigationController *navController;
	IPContentProvider *contentProvider;


	
	// controller for @"Applause"
	contentProvider = [providers providerForallCommitsByRepository: @"applause/applause"];
	
	controller = [[CommitListViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Applause";
	controller.tabBarItem.image = [UIImage imageNamed:@"trophy.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	[controllers addObject: navController];
	[controller release];
	[navController release];

	
	// controller for @"Peter"
	contentProvider = [providers providerForuserData: @"peterfriese"];
	
	controller = [[UserDetailsViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Peter";
	controller.tabBarItem.image = [UIImage imageNamed:@"person.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	[controllers addObject: navController];
	[controller release];
	[navController release];

	
	// controller for @"Heiko"
	contentProvider = [providers providerForuserData: @"hbehrens"];
	
	controller = [[UserDetailsViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Heiko";
	controller.tabBarItem.image = [UIImage imageNamed:@"person.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	[controllers addObject: navController];
	[controller release];
	[navController release];


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
