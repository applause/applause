//
// Created by Peter Friese on 13.01.14.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import "List+DataMapping.h"

@implementation List (DataMapping)

- (id)initWithAttributes:(NSDictionary *)attributes
{
	self = [super init];
	if (self) {
		self.id = [attributes valueForKeyPath:@"id"];
		self.title = [attributes valueForKeyPath:@"title"];
	}

	return self;
}

- (NSDictionary *)attributes
{
	NSMutableDictionary *attributes = [[NSMutableDictionary alloc] init];
	if (self.id != nil) {
		attributes[@"id"] = self.id;
	}
	if (self.title != nil) {
		attributes[@"title"] = self.title;
	}
	return attributes;
}

@end