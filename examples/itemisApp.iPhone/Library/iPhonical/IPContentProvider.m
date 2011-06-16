//
//  IPContentProvider.m
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "IPContentProvider.h"


@implementation IPContentProvider

@synthesize content, providers, loading;

-(void)requestContent {
	[NSException raise:NSInternalInconsistencyException 
				format:@"You must override %@ in a subclass", NSStringFromSelector(_cmd)];
}

-(void)requestContentIfEmpty {
	if(!content)
		[self requestContent];
}

-(id) initWithContent:(id)aContent andProviders:(id)aProviders{
	self = [super init];
	if(self) {
		self.content = aContent;
		self.providers = aProviders;
	}
	return self;
}


+(id) providerWithContent: (id)aContent andProviders:(id)aProviders {
	return [[[self alloc] initWithContent:aContent andProviders:aProviders]autorelease];
}

- (void) dealloc
{
	self.content = nil;
	self.providers = nil;
	[super dealloc];
}

@end

@implementation IPSimpleContentProvider

-(void)requestContent {
	[self willChangeValueForKey:@"content"];
    [self didChangeValueForKey:@"content"];
}

@end
