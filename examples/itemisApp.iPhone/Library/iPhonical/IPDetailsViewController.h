//
//  IPDetailsViewController.h
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "IPAbstractTableViewController.h"
#import "IPDetailsHeaderView.h"

@interface IPDetailsViewController : IPAbstractTableViewController {

	IPDetailsHeaderView *headerView;
}

@property(nonatomic, retain) IPDetailsHeaderView *headerView;

@end
