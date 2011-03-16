//
//  IPAbstractTableViewController.h
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "IPContentProvider.h"
#import "IPUIView.h"
#import "IPLoadingView.h"

@interface IPAbstractTableViewController : UITableViewController<IPUIView> {
	
	IPContentProvider *contentProvider;
	NSMutableDictionary *loadedImages;
	NSMutableDictionary *errorImageNames;
	IPLoadingView *loadingView;
}

-(void)updateData;
-(void)unbindFromContentProvider;
-(void)bindToContentProvider;
- (UIImage*)getImage:(NSString*) url withLoadingImage:(NSString*)loadingImage andErrorImage:(NSString*)errorImage;

-(UITableViewCell*)cellDefaultForTableView:(UITableView *)tableView;
-(UITableViewCell*)cellDoubleForTableView:(UITableView *)tableView;
-(UITableViewCell*)cellSubtitleForTableView:(UITableView *)tableView;
-(UITableViewCell*)cellDefaultWithDisclosureForTableView:(UITableView *)tableView;
-(UITableViewCell*)cellValue2ForTableView:(UITableView *)tableView;

@property(nonatomic, retain) IPContentProvider *contentProvider;
@property(nonatomic, retain) IPLoadingView *loadingView;

@end
