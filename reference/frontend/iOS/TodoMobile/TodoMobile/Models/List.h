//
// Created by Peter Friese on 13.01.14.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface List : NSObject
@property (nonatomic, strong) NSString *id;
@property (nonatomic, strong) NSString *title;
@property (nonatomic, strong) NSMutableArray *todos;
@end