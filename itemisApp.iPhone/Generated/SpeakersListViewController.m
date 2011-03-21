
#import "SpeakersListViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "SpeakerDetailsViewController.h"
 

@implementation SpeakersListViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider valueForKeyPath:@"content"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	
	id item = [self.items objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = [item valueForKeyPath:@"name"];
	
	NSString *imageURL = [NSString stringWithFormat:@"%@%@", @"http://localhost:3000", [item valueForKeyPath:@"pictureurl"]];
	cell.imageView.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	return cell;
	
	    
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	id item = [self.items objectAtIndex: indexPath.row];
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForSpeakerByName: [item valueForKeyPath:@"name"]];
		SpeakerDetailsViewController *controller = [[SpeakerDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

}

-(void)updateData {
	self.navigationItem.title = @"Speakers";
	
	[super updateData];
}

@end
