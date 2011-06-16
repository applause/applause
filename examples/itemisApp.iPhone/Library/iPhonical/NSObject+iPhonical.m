//
//  NSObject+iPhonical.m
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "NSObject+iPhonical.h"


@implementation NSObject(iPhonical)

-(NSArray*)asArray {
	if([self isKindOfClass:NSArray.class])
		return (NSArray*)self;
	else
		return [NSArray arrayWithObject: self];
}

@end
