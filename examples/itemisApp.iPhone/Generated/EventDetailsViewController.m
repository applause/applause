
#import "EventDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "PersonDetailsViewController.h"
 

@implementation EventDetailsViewController


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	if(!contentProvider || !contentProvider.content || contentProvider.loading)
		return 0;
	else
    	return 2;
}



- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return 1;
	} else
	if(section == 1) {
		return [[[contentProvider safeValueForKeyPath:@"content.speakers"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [contentProvider safeValueForKeyPath:@"content.contact"];
	cell.detailTextLabel.text = @"Contact";
	
	return cell;

	

	} else


	if(indexPath.section == 1) {
	id item = [[[contentProvider safeValueForKeyPath:@"content.speakers"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [item safeValueForKeyPath:@"name"];
	cell.detailTextLabel.text = [item safeValueForKeyPath:@"role"];
	
	return cell;


	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForPersonByName: [contentProvider safeValueForKeyPath:@"content.contact"]];
		PersonDetailsViewController *controller = [[PersonDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	
	} else


	if(indexPath.section == 1) {
	
	id item = [[[contentProvider safeValueForKeyPath:@"content.speakers"]asArray] objectAtIndex: indexPath.row];
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForPersonByName: [item safeValueForKeyPath:@"name"]];
		PersonDetailsViewController *controller = [[PersonDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Event";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider safeValueForKeyPath:@"content.title"];
		self.headerView.subtitleLabel.text = [NSString stringWithFormat:@"%@%@%@", [contentProvider safeValueForKeyPath:@"content.date"], @" ", [contentProvider safeValueForKeyPath:@"content.location"]];
		self.headerView.detailsLabel.text = [contentProvider safeValueForKeyPath:@"content.description"];
		
	}	

	[super updateData];
}

@end
