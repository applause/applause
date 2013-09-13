//
// Created by Peter Friese on 06.09.13.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import "TodoAPIClient.h"

static NSString *const kBaseUrl = @"http://localhost:2403";

@implementation TodoAPIClient

+ (TodoAPIClient *)sharedClient {
	static dispatch_once_t onceToken;
	static TodoAPIClient *defaultInstance = nil;
	dispatch_once(&onceToken, ^{
		defaultInstance = [[TodoAPIClient alloc] initWithBaseURL:[NSURL URLWithString:kBaseUrl]];
	});
	return defaultInstance;
}

- (instancetype)initWithBaseURL:(NSURL *)url
{
	self = [super initWithBaseURL:url];
	if (self) {
//		AFJSONSerializer *responseSerializer = [AFJSONSerializer serializer];
//		responseSerializer.readingOptions = NSJSONReadingAllowFragments;
//		self.responseSerializer = responseSerializer;
//		self.requestSerializer = [AFJSONSerializer serializer];
	}
	return self;
}

@end