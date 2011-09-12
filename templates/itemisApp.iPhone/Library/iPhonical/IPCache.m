//
//  IPCache.m
//  itemisApp
//
//  Created by Heiko Behrens on 25.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "IPCache.h"


@implementation IPCache

static NSMutableDictionary *cache = nil;

+(void)purgeCache {
	cache = nil;
}

+(NSMutableDictionary*)cache {
	if(!cache)
		cache = [[NSMutableDictionary alloc] init];
	return cache;
}

+(id)cachedObjectForURL:(NSString*)url {
	return [[self cache] objectForKey: url];
}

+(void)cacheObject:(id)obj forURL:(NSString*)url {
	[[self cache] setObject:obj	forKey:url];
}

@end
