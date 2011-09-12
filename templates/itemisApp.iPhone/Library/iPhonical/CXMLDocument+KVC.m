//
//  CXMLDocument+KVC.m
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "TouchXML.h"

@implementation CXMLElement (Private)

-(NSArray*)childElements {
	NSMutableArray *result = [NSMutableArray arrayWithArray: 0];
	for(CXMLNode *n in self.children)
		if(n.kind == XML_ELEMENT_NODE)
			[result addObject:n];
	return result;
}

- (id)valueForKey:(NSString *)key
{
	NSLog(@"%@", self.name);
	NSArray *elements = [self elementsForName: key];
	switch (elements.count) {
		case 0:
			return [super valueForKey:key];
		case 1: {
			CXMLElement *onlyElement = [elements objectAtIndex:0];
			if([onlyElement childElements].count == 0)
				return [onlyElement.stringValue stringByTrimmingCharactersInSet:
						[NSCharacterSet whitespaceAndNewlineCharacterSet]];
			else
				return onlyElement;
		}
		default:
			return elements;
	}
}

@end

@implementation CXMLDocument (Private)

- (id)valueForKey:(NSString *)key
{
	if([self.rootElement.name isEqual: key])
		return self.rootElement;
	else
		return [super valueForKey:key];
}

@end
