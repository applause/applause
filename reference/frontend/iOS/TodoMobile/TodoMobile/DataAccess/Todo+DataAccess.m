//
// Created by Peter Friese on 06.09.13.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import "Todo+DataAccess.h"
#import "TodoAPIClient.h"
#import "Todo+DataMapping.h"

static NSString *const kAllTodosPath = @"/todos";
static NSString *const kPostTodoPath = @"/todos";
static NSString *const kPutTodoPath = @"/todos";

@implementation Todo (DataAccess)

+ (void)allTodos:(void (^)(NSArray *todos, NSError *error))block
{
	[[TodoAPIClient sharedClient] GET:kAllTodosPath parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
	{
		NSArray *todosFromJSON = responseObject;
		NSMutableArray *todos = [[NSMutableArray alloc] initWithCapacity:[todosFromJSON count]];
		for (NSDictionary *attributes in todosFromJSON) {
			Todo *todo = [[Todo alloc] initWithAttributes:attributes];
			[todos addObject:todo];
		}

		if (block) {
			block([todos copy], nil);
		}
	} failure:^(NSURLSessionDataTask *task, NSError *error)
	{
		if (block) {
			block(@[], error);
		}
	}];
}

- (void)post:(void (^)(Todo *todo, NSError *error))block
{
	NSDictionary *todoDictionary = [self attributes];
	[[TodoAPIClient sharedClient] POST:kPostTodoPath parameters:todoDictionary success:^(NSURLSessionDataTask *task, id responseObject)
	{
		Todo *postedTodo = responseObject;
		if(block) {
			block(postedTodo, nil);
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
	NSDictionary *todoDictionary = [self attributes];
	[[TodoAPIClient sharedClient] PUT:kPutTodoPath parameters:todoDictionary success:^(NSURLSessionDataTask *task, id responseObject)
	{
		Todo *postedTodo = responseObject;
		if(block) {
			block(postedTodo, nil);
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
	NSString *urlString = [NSString stringWithFormat:@"/todos/%@", self.id];
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