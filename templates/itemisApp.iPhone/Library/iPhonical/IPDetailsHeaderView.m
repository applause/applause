//
//  IPDetailsHeaderView.m
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "IPDetailsHeaderView.h"


@implementation IPDetailsHeaderView

@synthesize titleLabel, subtitleLabel, detailsLabel, image;

-(int)heightOf:(UILabel*)label {
	//Calculate the expected size based on the font and linebreak mode of your label
	CGSize maximumLabelSize = CGSizeMake(label.frame.size.width,9999);
	
	CGSize expectedLabelSize = [label.text sizeWithFont:label.font 
									  constrainedToSize:maximumLabelSize 
										  lineBreakMode:label.lineBreakMode]; 
	return expectedLabelSize.height;
}

-(void) recalcSizes {
	int BORDER = 20;
	int MARGIN = 5;
	// title
	int x = image.image ? CGRectGetMaxX(image.frame) + MARGIN: BORDER;
	CGRect newFrame = CGRectMake(x, BORDER, self.view.frame.size.width - x - BORDER, 0);
	newFrame.size.height = [self heightOf:self.titleLabel];
	if(image.image)
		newFrame.size.height = MAX(newFrame.size.height, CGRectGetHeight(image.frame));
	self.titleLabel.frame = newFrame;
	
	// subtitle
	newFrame.origin.y = CGRectGetMaxY(newFrame);
	newFrame.size.height = [self heightOf:subtitleLabel];
	subtitleLabel.frame = newFrame;
	
	// details
	int y = CGRectGetMaxY(self.subtitleLabel.frame);
	if(image.image)
		y = MAX(y, CGRectGetMaxY(image.frame));
	newFrame = CGRectMake(BORDER, y + MARGIN, self.view.frame.size.width - 2*BORDER, 0);
	newFrame.size.height = [self heightOf:self.detailsLabel];
	detailsLabel.frame = newFrame;
	
	// self
	newFrame = self.view.frame;
	newFrame.size.height = CGRectGetMaxY(detailsLabel.frame);
	self.view.frame = newFrame;
}

- (void) dealloc
{
	self.titleLabel = nil;
	self.subtitleLabel = nil;
	self.image = nil;
	self.detailsLabel = nil;
	[super dealloc];
}


@end
