//
//  AppDelegate.m
//  TodoMobile
//
//  Created by Peter Friese on 06.09.13.
//  Copyright (c) 2013 Peter Friese. All rights reserved.
//

#import "AppDelegate.h"
#import "TodoListViewController.h"
#import "ListListViewController.h"

@implementation AppDelegate

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
{
	self.window = [[UIWindow alloc] initWithFrame:[[UIScreen mainScreen] bounds]];

//	TodoListViewController *todoListViewController = [[TodoListViewController alloc] init];
//	UINavigationController *navigationController = [[UINavigationController alloc] initWithRootViewController:todoListViewController];

	ListListViewController *listListViewController = [[ListListViewController alloc] init];
	UINavigationController *navigationController = [[UINavigationController alloc] initWithRootViewController:listListViewController];

	self.window.rootViewController = navigationController;

	self.window.backgroundColor = [UIColor whiteColor];
	[self.window makeKeyAndVisible];
	return YES;
}

@end
