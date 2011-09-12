//
//  ITXMLContentProvider.m
//  sample1
//
//  Created by Heiko Behrens on 19.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "IPXMLContentProvider.h"
#import "TTGlobalNetwork.h"
#import "IPCache.h"

@implementation IPXMLContentProvider

@synthesize url, document, keyPathToContent;

-(id)initWithURL: (NSURL*)u initialContent:(id)c keyPathToContent:(NSString *)kp andProviders:(id)p{
	self = [super initWithContent:c andProviders:p];
	if(self) {
		self.url = u;
		self.keyPathToContent = kp;
	}
	return self;
}

-(void)setRequest:(ASIHTTPRequest*)r {
	if(request.inProgress)
		[request cancel];
	[request release];
	request = [r retain];
	request.delegate = self;
}

-(void)handleData:(NSData*)data {
	self.document = [[CXMLDocument alloc] initWithData: data options:0 error:nil];
	NSLog(@"%@", self.document);
	self.content = [self.document valueForKeyPath:self.keyPathToContent];
	self.request = nil;
}

-(void)requestContent {
	// make usage of cache optional
	NSData *data = [IPCache cachedObjectForURL:self.url.absoluteString];
	if(data)
		[self handleData:data];
	else {
		NSLog(@"Request Data at: %@", [self.url absoluteString]);
		self.request = [ASIHTTPRequest requestWithURL: self.url];
		TTNetworkRequestStarted();
		self.loading = TRUE;
		[request startAsynchronous];
	}
}

-(void)requestContentIfEmpty {
	if(!document && !request)
		[self requestContent];
}

- (void)requestFinished:(ASIHTTPRequest *)req
{
	TTNetworkRequestStopped();
	self.loading = FALSE;
	[IPCache cacheObject:req.responseData forURL: self.url.absoluteString];
	[self handleData: req.responseData];
}

- (void)requestFailed:(ASIHTTPRequest *)req {
	TTNetworkRequestStopped();
	self.loading = FALSE;
	self.request = nil;
}

- (void) dealloc
{
	self.request = nil;
	self.keyPathToContent = nil;
	// order of content and document is important since document releases content
	self.content = nil;
	self.document = nil;
	[super dealloc];
}


@end
