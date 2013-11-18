//
// Created by Peter Friese on 12.11.13.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//


#import <Foundation/Foundation.h>
#import "Todo.h"

@interface Todo (DataMapping)
- (id)initWithAttributes:(NSDictionary *)attributes;

- (NSDictionary *)attributes;
@end