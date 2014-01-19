//
// Created by Peter Friese on 13.01.14.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import "List+DataAccess.h"
#import "TodoAPIClient.h"
#import "List+DataMapping.h"

@implementation List (DataAccess)

static NSString *const kAllListsPath = @"/lists";
static NSString *const kPostListPath = @"/lists";
static NSString *const kPutListPath = @"/lists";
static NSString *const kDeleteListPath = @"/lists/%@";


+ (void)allLists:(void (^)(NSArray *lists, NSError *error))block
{
	[[TodoAPIClient sharedClient] GET:kAllListsPath parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
	{
		NSArray *elementsFromJSON = responseObject;
		NSMutableArray *result = [[NSMutableArray alloc] initWithCapacity:[elementsFromJSON count]];
		for (NSDictionary *attributes in elementsFromJSON) {
			List *mappedElement = [[List alloc] initWithAttributes:attributes];
			[result addObject:mappedElement];
		}

		if (block) {
			block([result copy], nil);
		}
	} failure:^(NSURLSessionDataTask *task, NSError *error)
	{
		if (block) {
			block(@[], error);
		}
	}];
}

- (void)create:(void (^)(List *list, NSError *error))block
{
	NSDictionary *elementDictionary = [self attributes];
	[[TodoAPIClient sharedClient] POST:kPostListPath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
	{
		List *postedElement = responseObject;
		if(block) {
			block(postedElement, nil);
		}
	} failure:^(NSURLSessionDataTask *task, NSError *error)
	{
		if(block) {
			block(nil, error);
		}
	}];
}

- (void)update:(void (^)(List *list, NSError *error))block
{
	NSDictionary *elementDictionary = [self attributes];
	[[TodoAPIClient sharedClient] PUT:kPutListPath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
	{
		List *postedElement = responseObject;
		if(block) {
			block(postedElement, nil);
		}
	} failure:^(NSURLSessionDataTask *task, NSError *error)
	{
		if(block) {
			block(nil, error);
		}
	}];
}

- (void)remove:(void (^)(List *list, NSError *error))block
{
	NSString *urlString = [NSString stringWithFormat:kDeleteListPath, self.id];
	[[TodoAPIClient sharedClient] DELETE:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
	{
		if(block) {
			block(self, nil);
		}
	} failure:^(NSURLSessionDataTask *task, NSError *error)
	{
		if(block) {
			block(nil, error);
		}
	}];
}

@end