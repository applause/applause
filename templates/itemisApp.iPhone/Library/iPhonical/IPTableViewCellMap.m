//
//  IPTableViewCellMap.m
//  itemisApp
//
//  Created by Heiko Behrens on 25.07.11.
//  Copyright 2011 itemis AG. All rights reserved.
//

#import "IPTableViewCellMap.h"
#import <QuartzCore/QuartzCore.h>


@implementation IPTableViewCellMap

@synthesize queryString;

-(id) initWithStyle:(UITableViewCellStyle)style reuseIdentifier:(NSString *)reuseIdentifier {
	self = [super initWithStyle:style reuseIdentifier:reuseIdentifier];
	if(self) {
		self.queryString = @"Kiel, Knooperweg";
		self.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		self.textLabel.lineBreakMode = UILineBreakModeWordWrap;
		self.textLabel.numberOfLines = 4;
		self.textLabel.font = [UIFont systemFontOfSize:14.0];
		self.imageView.layer.masksToBounds = YES;
		self.imageView.layer.cornerRadius = 10.0;
	}
	return self;
}

-(NSString*)imageUrl {
	bool retina = ([[UIScreen mainScreen] respondsToSelector:@selector(scale)] && [[UIScreen mainScreen] scale] == 2);
	NSString *encodedQuery= [self.queryString stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding];
	NSString *sizeParams = retina ? @"size=176x176&zoom=15" : @"size=88x88&zoom=14";

	return [NSString stringWithFormat:@"http://maps.google.com/maps/api/staticmap?center=%@&maptype=roadmap&sensor=false&%@",
			encodedQuery, sizeParams];
}

@end
