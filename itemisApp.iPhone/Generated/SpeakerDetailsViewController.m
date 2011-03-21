
#import "SpeakerDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "IPContentProvider.h"
#import "SessionDetailsViewController.h"
 

@implementation SpeakerDetailsViewController


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	if(!contentProvider || !contentProvider.content || contentProvider.loading)
		return 0;
	else
    	return 2;
}



- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider valueForKeyPath:@"content.sessions"] asArray] count];
	} else
	if(section == 1) {
		return 1 + 1;
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	id item = [[[contentProvider valueForKeyPath:@"content.sessions"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = [item valueForKeyPath:@"title"];
	
	
	return cell;


	} else


	if(indexPath.section == 1 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"mail";
	cell.detailTextLabel.text = @"some address";
	
	return cell;

	

	} else

	if(indexPath.section == 1 && indexPath.row == 1) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"blog";
	cell.detailTextLabel.text = @"blog's url";
	
	return cell;

	

	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	
	id item = [[[contentProvider valueForKeyPath:@"content.sessions"]asArray] objectAtIndex: indexPath.row];
		IPContentProvider *provider = [IPSimpleContentProvider providerWithContent:item andProviders:self.contentProvider.providers];
		SessionDetailsViewController *controller = [[SessionDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	} else


	if(indexPath.section == 1 && indexPath.row == 0) {
	
	
	
	
	
	} else

	if(indexPath.section == 1 && indexPath.row == 1) {
	
	
	
	
	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Speaker";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.name"];
		
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.bio"];
		NSString *imageURL = [NSString stringWithFormat:@"%@%@", @"http://localhost:3000", [contentProvider valueForKeyPath:@"content.pictureurl"]];
		self.headerView.image.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	}	

	[super updateData];
}

@end
