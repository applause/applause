//
// Created by Peter Friese on 06.09.13.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import "Todo.h"

@implementation Todo

- (id)initWithAttributes:(NSDictionary *)attributes
{
	self = [super init];
	if (self) {
		_id = [attributes valueForKeyPath:@"id"];
		_title = [attributes valueForKeyPath:@"title"];

		NSDateFormatter *dateFormatter = [[NSDateFormatter alloc] init];
		[dateFormatter setTimeStyle:NSDateFormatterNoStyle];
		[dateFormatter setDateStyle:NSDateFormatterShortStyle];
		_dueDate = [dateFormatter dateFromString:[attributes valueForKeyPath:@"dueDate"]];

		_done = [[attributes valueForKeyPath:@"done"] boolValue];
	}

	return self;
}

- (NSDictionary *)attributes
{

	NSDateFormatter *dateFormatter = [[NSDateFormatter alloc] init];
	[dateFormatter setTimeStyle:NSDateFormatterNoStyle];
	[dateFormatter setDateStyle:NSDateFormatterShortStyle];
	NSString *dueDateString = [dateFormatter stringFromDate:self.dueDate];

	NSMutableDictionary *attributes = [[NSMutableDictionary alloc] init];
	if (self.id != nil) {
		attributes[@"id"] = self.id;
	}
	if (self.title != nil) {
		attributes[@"title"] = self.title;
	}
	if (dueDateString != nil) {
		attributes[@"dueDate"] = dueDateString;
	}
	attributes[@"done"] = [NSNumber numberWithBool:self.done];
	return attributes;
}

@end