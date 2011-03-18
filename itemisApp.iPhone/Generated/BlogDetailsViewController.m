
#import "BlogDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "SpeakerDetailsViewController.h"
 

@implementation BlogDetailsViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return 1 + 1;
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = [contentProvider valueForKeyPath:@"content.creator"];
	
	
	return cell;

	

	} else

	if(indexPath.section == 0 && indexPath.row == 1) {
	
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = @"Open in Browser";
	
	
	return cell;

	

	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForSpeakerByName: [contentProvider valueForKeyPath:@"content.creator"]];
		SpeakerDetailsViewController *controller = [[SpeakerDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	
	} else

	if(indexPath.section == 0 && indexPath.row == 1) {
	
	
		NSString *urlString = [contentProvider valueForKeyPath:@"content.link"];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Post";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.title"];
		
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.description"];
		
	}	

	[super updateData];
}

@end
