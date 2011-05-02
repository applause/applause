#import "itemisAppAppDelegate.h"
#import "IPUIView.h"
#import "itemisAppProviders.h"

#import "BlogListViewController.h"
#import "SessionListViewController.h"
#import "SessionListViewController.h"
#import "SessionListViewController.h"
#import "SpeakersListViewController.h"

@implementation itemisAppAppDelegate

@synthesize window, rootController;

-(UIViewController*)createController {
	itemisAppProviders *providers = [[[itemisAppProviders alloc] init] autorelease];
	UITabBarController *result = [[UITabBarController alloc] init];
	NSMutableArray *controllers = [NSMutableArray array];
	
	UIViewController<IPUIView> *controller;
	UINavigationController *navController;
	IPContentProvider *contentProvider;

	// controller for @"News"
	contentProvider = [providers providerForBlogposts];
	
	controller = [[BlogListViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"News";
	controller.tabBarItem.image = [UIImage imageNamed:@"calendar.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	[controllers addObject: navController];
	[controller release];
	[navController release];
	
	// controller for @"Tue"
	contentProvider = [providers providerForSessionsByDay: @"2011-03-22"];
	
	controller = [[SessionListViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Tue";
	controller.tabBarItem.image = [UIImage imageNamed:@"calendar.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	[controllers addObject: navController];
	[controller release];
	[navController release];
	
	// controller for @"Wed"
	contentProvider = [providers providerForSessionsByDay: @"2011-03-23"];
	
	controller = [[SessionListViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Wed";
	controller.tabBarItem.image = [UIImage imageNamed:@"calendar.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	[controllers addObject: navController];
	[controller release];
	[navController release];
	
	// controller for @"Thu"
	contentProvider = [providers providerForSessionsByDay: @"2011-03-24"];
	
	controller = [[SessionListViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Thu";
	controller.tabBarItem.image = [UIImage imageNamed:@"calendar.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	[controllers addObject: navController];
	[controller release];
	[navController release];
	
	// controller for @"Speakers"
	contentProvider = [providers providerForAllSpeakers];
	
	controller = [[SpeakersListViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Speakers";
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
