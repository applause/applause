
#import "PersonDetailsViewController.h"
#import "NSObject+iPhonical.h"
 

@implementation PersonDetailsViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return 1 + 1;
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"mail";
	cell.detailTextLabel.text = @"some address";
	
	return cell;

	

	} else

	if(indexPath.section == 0 && indexPath.row == 1) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"blog";
	cell.detailTextLabel.text = @"blog's url";
	
	return cell;

	

	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
	
	
	
	} else

	if(indexPath.section == 0 && indexPath.row == 1) {
	
	
	
	
	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Person";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.name"];
		
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.bio"];
		NSString *imageURL = [contentProvider valueForKeyPath:@"content.pictureurl"];
		self.headerView.image.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	}	

	[super updateData];
}

@end
