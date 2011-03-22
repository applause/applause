
#import "BlogListViewController.h"
#import "NSObject+iPhonical.h"
 

@implementation BlogListViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider valueForKeyPath:@"content"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	
	id item = [self.items objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [item valueForKeyPath:@"creator"];
	cell.detailTextLabel.text = [item valueForKeyPath:@"title"];
	
	return cell;
	
	    
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	id item = [self.items objectAtIndex: indexPath.row];
		NSString *urlString = [item valueForKeyPath:@"link"];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

}

-(void)updateData {
	self.navigationItem.title = @"News";
	
	[super updateData];
}

@end
