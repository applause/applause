//
//  ITXMLContentProvider.h
//  sample1
//
//  Created by Heiko Behrens on 19.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "IPContentProvider.h"
#import "ASIHTTPRequest.h"
#import "TouchXML.h"

@interface IPXMLContentProvider : IPContentProvider {
	
	NSURL *url;
	ASIHTTPRequest *request;
	CXMLDocument *document;
	NSString *keyPathToContent;

}

-(id)initWithURL: (NSURL*)u initialContent:(id)c keyPathToContent:(NSString *)kp andProviders:(id)p;

@property(nonatomic, copy) NSURL *url;
@property(nonatomic, copy) CXMLDocument *document;
@property(nonatomic, copy) NSString *keyPathToContent;

@end
