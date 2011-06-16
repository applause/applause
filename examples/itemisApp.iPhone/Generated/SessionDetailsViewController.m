
#import "SessionDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "SpeakerDetailsViewController.h"
 

@implementation SessionDetailsViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider valueForKeyPath:@"content.speakers"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	id item = [[[contentProvider valueForKeyPath:@"content.speakers"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellDefaultWithDisclosureForTableView:tableView];
	cell.textLabel.text = [item valueForKeyPath:@"name"];
	
	NSString *imageURL = [NSString stringWithFormat:@"%@%@", @"http://eclipsecon2011-data.webbyapp.com", [item valueForKeyPath:@"pictureurl"]];
	cell.imageView.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	return cell;


	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	
	id item = [[[contentProvider valueForKeyPath:@"content.speakers"]asArray] objectAtIndex: indexPath.row];
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForSpeakerByName: [item valueForKeyPath:@"name"]];
		SpeakerDetailsViewController *controller = [[SpeakerDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Session";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.title"];
		self.headerView.subtitleLabel.text = [NSString stringWithFormat:@"%@%@%@", [contentProvider valueForKeyPath:@"content.date"], @" / ", [contentProvider valueForKeyPath:@"content.timeslot"]];
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.description"];
		
	}	

	[super updateData];
}

@end
