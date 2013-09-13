//
// Created by Peter Friese on 06.09.13.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Todo.h"

@interface Todo (DataAccess)
+ (void)allTodos:(void (^)(NSArray *todos, NSError *error))block;
- (void)post:(void (^)(Todo *todo, NSError *error))block;
- (void)put:(void (^)(Todo *todo, NSError *error))block;
- (void)remove:(void (^)(Todo *todo, NSError *error))block;
@end