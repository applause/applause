//
// Created by Peter Friese on 06.09.13.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "AFHTTPSessionManager.h"

@interface TodoAPIClient : AFHTTPSessionManager
+ (TodoAPIClient *)sharedClient;
@end