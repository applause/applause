//
// Created by Peter Friese on 13.01.14.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "List.h"

@interface List (DataAccess)
+ (void)allLists:(void (^)(NSArray *lists, NSError *error))block;
- (void)create:(void (^)(List *list, NSError *error))block;
- (void)update:(void (^)(List *list, NSError *error))block;
- (void)remove:(void (^)(List *list, NSError *error))block;
@end