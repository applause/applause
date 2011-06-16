//
//  IPDetailsViewController.m
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "IPDetailsViewController.h"


@implementation IPDetailsViewController

@synthesize headerView;

-(id)init {
	id result = [super initWithStyle:UITableViewStyleGrouped];
	self.headerView = [[IPDetailsHeaderView alloc] initWithNibName:@"IPDetailsHeaderView" bundle:nil];
	UIView *v = self.headerView.view;
	self.tableView.tableHeaderView = v;
	return result;
}

-(void)updateData {
	[self.headerView recalcSizes];
	self.tableView.tableHeaderView = self.headerView.view;
	[super updateData];
}

- (void)dealloc {
    [super dealloc];
}


@end

