//
// Created by Peter Friese on 06.09.13.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Todo : NSObject
@property (nonatomic, strong) NSString *id;
@property (nonatomic, strong) NSString *title;
@property (nonatomic, strong) NSDate *dueDate;
@property (nonatomic) BOOL done;

- (id)initWithAttributes:(NSDictionary *)attributes;
- (NSDictionary *)attributes;

@end