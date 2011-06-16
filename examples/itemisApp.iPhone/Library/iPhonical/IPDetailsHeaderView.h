//
//  IPDetailsHeaderView.h
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import <UIKit/UIKit.h>


@interface IPDetailsHeaderView : UIViewController {

	UIImageView *image;
	UILabel *titleLabel;
	UILabel *subtitleLabel;
	UILabel *detailsLabel;
}

-(void) recalcSizes;

@property (nonatomic, retain) IBOutlet UIImageView *image;
@property (nonatomic, retain) IBOutlet UILabel *titleLabel;
@property (nonatomic, retain) IBOutlet UILabel *subtitleLabel;
@property (nonatomic, retain) IBOutlet UILabel *detailsLabel;

@end
