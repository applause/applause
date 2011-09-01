
#import "EventListViewController.h"
#import "NSObject+iPhonical.h"
#import "IPContentProvider.h"
#import "EventDetailsViewController.h"
 

@implementation EventListViewController


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	if(!contentProvider || !contentProvider.content || contentProvider.loading)
		return 0;
	else
    	return 3;
}


- (NSString *)tableView:(UITableView *)tableView titleForHeaderInSection:(NSInteger)section {

	if(section == 0) {
		return @"News";
	}

else
	if(section == 1) {
		return @"Events";
	}

else
	if(section == 2) {
		return @"Workshops";
	}

}


- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider safeValueForKeyPath:@"content.news"] asArray] count];
	} else
	if(section == 1) {
		return [[[contentProvider safeValueForKeyPath:@"content.activity"] asArray] count];
	} else
	if(section == 2) {
		return [[[contentProvider safeValueForKeyPath:@"content.workshop"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	id item = [[[contentProvider safeValueForKeyPath:@"content.news"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [item safeValueForKeyPath:@"title"];
	cell.detailTextLabel.text = [item safeValueForKeyPath:@"date"];
	
	return cell;


	} else


	if(indexPath.section == 1) {
	id item = [[[contentProvider safeValueForKeyPath:@"content.activity"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [item safeValueForKeyPath:@"title"];
	cell.detailTextLabel.text = [item safeValueForKeyPath:@"date"];
	
	return cell;


	} else


	if(indexPath.section == 2) {
	id item = [[[contentProvider safeValueForKeyPath:@"content.workshop"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [item safeValueForKeyPath:@"title"];
	cell.detailTextLabel.text = [item safeValueForKeyPath:@"date"];
	
	return cell;


	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	
	id item = [[[contentProvider safeValueForKeyPath:@"content.news"]asArray] objectAtIndex: indexPath.row];
		IPContentProvider *provider = [IPSimpleContentProvider providerWithContent:item andProviders:self.contentProvider.providers];
		EventDetailsViewController *controller = [[EventDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	} else


	if(indexPath.section == 1) {
	
	id item = [[[contentProvider safeValueForKeyPath:@"content.activity"]asArray] objectAtIndex: indexPath.row];
		IPContentProvider *provider = [IPSimpleContentProvider providerWithContent:item andProviders:self.contentProvider.providers];
		EventDetailsViewController *controller = [[EventDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	} else


	if(indexPath.section == 2) {
	
	id item = [[[contentProvider safeValueForKeyPath:@"content.workshop"]asArray] objectAtIndex: indexPath.row];
		IPContentProvider *provider = [IPSimpleContentProvider providerWithContent:item andProviders:self.contentProvider.providers];
		EventDetailsViewController *controller = [[EventDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"News";
	
	[super updateData];
}

@end
