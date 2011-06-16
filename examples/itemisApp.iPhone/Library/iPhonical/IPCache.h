//
//  IPCache.h
//  itemisApp
//
//  Created by Heiko Behrens on 25.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//


@interface IPCache : NSObject {

}

+(void)purgeCache;
+(id)cachedObjectForURL:(NSString*)url;
+(void)cacheObject:(id)obj forURL:(NSString*)url;

@end
