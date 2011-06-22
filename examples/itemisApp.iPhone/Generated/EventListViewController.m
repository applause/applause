
#import "EventListViewController.h"
#import "NSObject+iPhonical.h"
#import "IPContentProvider.h"
#import "EventDetailsViewController.h"
 

@implementation EventListViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider valueForKeyPath:@"content"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	
	id item = [self.items objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [item valueForKeyPath:@"title"];
	cell.detailTextLabel.text = [item valueForKeyPath:@"date"];
	
	return cell;
	
	    
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	id item = [self.items objectAtIndex: indexPath.row];
		IPContentProvider *provider = [IPSimpleContentProvider providerWithContent:item andProviders:self.contentProvider.providers];
		EventDetailsViewController *controller = [[EventDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

}

-(void)updateData {
	self.navigationItem.title = @"News";
	
	[super updateData];
}

@end
