//
//  PREFIXAppDelegate.h
//  DummyProject
//
//  Created by Peter Friese on 28.12.12.
//  Copyright (c) 2012 Peter Friese. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface PREFIXAppDelegate : UIResponder <UIApplicationDelegate>

@property (strong, nonatomic) UIWindow *window;

@property (readonly, strong, nonatomic) NSManagedObjectContext *managedObjectContext;
@property (readonly, strong, nonatomic) NSManagedObjectModel *managedObjectModel;
@property (readonly, strong, nonatomic) NSPersistentStoreCoordinator *persistentStoreCoordinator;

- (void)saveContext;
- (NSURL *)applicationDocumentsDirectory;

@end
