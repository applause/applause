
#import "CareerViewViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "JobOfferDetailsViewController.h"
 

@implementation CareerViewViewController


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	if(!contentProvider || !contentProvider.content || contentProvider.loading)
		return 0;
	else
    	return 2;
}


- (NSString *)tableView:(UITableView *)tableView titleForHeaderInSection:(NSInteger)section {

	if(section == 0) {
		return @"Links";
	}

else
	if(section == 1) {
		return @"Job Offers";
	}

}


- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider safeValueForKeyPath:@"content.link"] asArray] count];
	} else
	if(section == 1) {
		return [[[contentProvider safeValueForKeyPath:@"content.job"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	id item = [[[contentProvider safeValueForKeyPath:@"content.link"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = [item safeValueForKeyPath:@"title"];
	
	
	return cell;


	} else


	if(indexPath.section == 1) {
	id item = [[[contentProvider safeValueForKeyPath:@"content.job"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [item safeValueForKeyPath:@"location"];
	cell.detailTextLabel.text = [item safeValueForKeyPath:@"title"];
	
	return cell;


	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	
	id item = [[[contentProvider safeValueForKeyPath:@"content.link"]asArray] objectAtIndex: indexPath.row];
		NSString *urlString = [item safeValueForKeyPath:@"url"];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	} else


	if(indexPath.section == 1) {
	
	id item = [[[contentProvider safeValueForKeyPath:@"content.job"]asArray] objectAtIndex: indexPath.row];
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForJobById: [item safeValueForKeyPath:@"id"]];
		JobOfferDetailsViewController *controller = [[JobOfferDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Carreer";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		
		self.headerView.subtitleLabel.text = [contentProvider safeValueForKeyPath:@"content.description"];
		
		
	}	

	[super updateData];
}

@end
