
#import "JobOfferDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "PersonDetailsViewController.h"
 

@implementation JobOfferDetailsViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return 1;
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [contentProvider valueForKeyPath:@"content.contact"];
	cell.detailTextLabel.text = @"Contact";
	
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
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Job Offer";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.title"];
		
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.description"];
		
	}	

	[super updateData];
}

@end
