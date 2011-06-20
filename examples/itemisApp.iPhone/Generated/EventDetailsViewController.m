
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
		return [[[[contentProvider valueForKeyPath:@"content.speakers"] componentsSeparatedByString: @","] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = [contentProvider valueForKeyPath:@"content.contact"];
	
	
	return cell;

	

	} else


	if(indexPath.section == 1) {
	id item = [[[[contentProvider valueForKeyPath:@"content.speakers"] componentsSeparatedByString: @","] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = item;
	
	
	return cell;


	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForPersonByName: [contentProvider valueForKeyPath:@"content.contact"]];
		PersonDetailsViewController *controller = [[PersonDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	
	} else


	if(indexPath.section == 1) {
	
	id item = [[[[contentProvider valueForKeyPath:@"content.speakers"] componentsSeparatedByString: @","]asArray] objectAtIndex: indexPath.row];
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForPersonByName: item];
		PersonDetailsViewController *controller = [[PersonDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = [contentProvider valueForKeyPath:@"content.kind"];
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.title"];
		self.headerView.subtitleLabel.text = [NSString stringWithFormat:@"%@%@%@", [contentProvider valueForKeyPath:@"content.date"], @" ", [contentProvider valueForKeyPath:@"content.location"]];
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.description"];
		
	}	

	[super updateData];
}

@end
