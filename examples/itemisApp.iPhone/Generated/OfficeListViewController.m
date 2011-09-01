
#import "OfficeListViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "OfficeDetailsViewController.h"
 

@implementation OfficeListViewController



- (NSString *)tableView:(UITableView *)tableView titleForHeaderInSection:(NSInteger)section {

	if(section == 0) {
		return @"Offices";
	}

}


- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider safeValueForKeyPath:@"content.office"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	id item = [[[contentProvider safeValueForKeyPath:@"content.office"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = [item safeValueForKeyPath:@"location"];
	
	
	return cell;


	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	
	id item = [[[contentProvider safeValueForKeyPath:@"content.office"]asArray] objectAtIndex: indexPath.row];
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForOfficeById: [item safeValueForKeyPath:@"id"]];
		OfficeDetailsViewController *controller = [[OfficeDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Company";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = @"itemis";
		self.headerView.subtitleLabel.text = [contentProvider safeValueForKeyPath:@"content.description"];
		
		
	}	

	[super updateData];
}

@end
