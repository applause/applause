
#import "UserDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "RepositoryListViewController.h"
 

@implementation UserDetailsViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return 1;
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellDefaultWithDisclosureForTableView:tableView];
	cell.textLabel.text = [NSString stringWithFormat:@"%@%@", [contentProvider safeValueForKeyPath:@"content.repos"], @" public repositories"];
	
	
	return cell;

	

	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForallRepositoriesByUser: [contentProvider safeValueForKeyPath:@"content.login"]];
		RepositoryListViewController *controller = [[RepositoryListViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = [contentProvider safeValueForKeyPath:@"content.name"];
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider safeValueForKeyPath:@"content.name"];
		self.headerView.subtitleLabel.text = [contentProvider safeValueForKeyPath:@"content.location"];
		self.headerView.detailsLabel.text = [NSString stringWithFormat:@"%@%@", [contentProvider safeValueForKeyPath:@"content.followers"], @" followers"];
		
	}	

	[super updateData];
}

@end
