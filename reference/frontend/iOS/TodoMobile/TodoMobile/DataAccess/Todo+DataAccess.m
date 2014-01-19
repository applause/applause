//
// Created by Peter Friese on 06.09.13.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import "Todo+DataAccess.h"
#import "TodoAPIClient.h"
#import "Todo+DataMapping.h"
#import "List.h"

static NSString *const kAllTodosPath = @"/todos";
static NSString *const kAllTodosOfPath = @"/todos";
static NSString *const kPostTodoPath = @"/todos";
static NSString *const kPutTodoPath = @"/todos";
static NSString *const kDeleteTodoPath = @"/todos/%@";

@implementation Todo (DataAccess)

+ (void)allTodosOf:(List *)list result:(void (^)(NSArray *todos, NSError *error))block
{
	NSDictionary *parameters = @{
			@"parent": list.id
	};

	[[TodoAPIClient sharedClient] GET:kAllTodosPath parameters:parameters success:^(NSURLSessionDataTask *task, id responseObject)
	{
		NSArray *elementsFromJSON = responseObject;
		NSMutableArray *result = [[NSMutableArray alloc] initWithCapacity:[elementsFromJSON count]];
		for (NSDictionary *attributes in elementsFromJSON) {
			Todo *mappedElement = [[Todo alloc] initWithAttributes:attributes];
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

+ (void)allTodos:(void (^)(NSArray *todos, NSError *error))block
{
	[[TodoAPIClient sharedClient] GET:kAllTodosPath parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
	{
		NSArray *elementsFromJSON = responseObject;
		NSMutableArray *result = [[NSMutableArray alloc] initWithCapacity:[elementsFromJSON count]];
		for (NSDictionary *attributes in elementsFromJSON) {
			Todo *mappedElement = [[Todo alloc] initWithAttributes:attributes];
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

- (void)postForList:(List *)list result:(void (^)(Todo *todo, NSError *error))block
{
	NSMutableDictionary *elementDictionary = [[self attributes] mutableCopy];
	elementDictionary[@"parent"] = list.id;

	[[TodoAPIClient sharedClient] POST:kPostTodoPath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
	{
		Todo *postedElement = responseObject;
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

- (void)post:(void (^)(Todo *todo, NSError *error))block
{
	NSDictionary *elementDictionary = [self attributes];
	[[TodoAPIClient sharedClient] POST:kPostTodoPath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
	{
		Todo *postedElement = responseObject;
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

- (void)put:(void (^)(Todo *todo, NSError *error))block
{
	NSDictionary *elementDictionary = [self attributes];
	[[TodoAPIClient sharedClient] PUT:kPutTodoPath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
	{
		Todo *postedElement = responseObject;
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

- (void)remove:(void (^)(Todo *todo, NSError *error))block
{
	NSString *urlString = [NSString stringWithFormat:kDeleteTodoPath, self.id];
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