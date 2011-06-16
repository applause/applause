//
//  IPContentProvider.h
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import <Foundation/Foundation.h>


@interface IPContentProvider : NSObject {
	id content;
	id providers;
	BOOL loading;
}

-(void)requestContent;
-(void)requestContentIfEmpty;

-(id) initWithContent:(id)aContent andProviders:(id)aProviders;
+(id) providerWithContent: (id)aContent andProviders:(id)aProviders;

@property (nonatomic, retain) id content;
@property (nonatomic, retain) id providers;
@property (nonatomic, assign) BOOL loading;

@end

@interface IPSimpleContentProvider : IPContentProvider {
}

@end
