
#import "PersonDetailsViewController.h"
#import "NSObject+iPhonical.h"
 

@implementation PersonDetailsViewController


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	if(!contentProvider || !contentProvider.content || contentProvider.loading)
		return 0;
	else
    	return 2;
}



- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return 1 + 1;
	} else
	if(section == 1) {
		return [[[contentProvider safeValueForKeyPath:@"content.webaddresses"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"mail";
	cell.detailTextLabel.text = [contentProvider safeValueForKeyPath:@"content.mail"];
	
	return cell;

	

	} else

	if(indexPath.section == 0 && indexPath.row == 1) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"phone";
	cell.detailTextLabel.text = [contentProvider safeValueForKeyPath:@"content.phone"];
	
	return cell;

	

	} else


	if(indexPath.section == 1) {
	id item = [[[contentProvider safeValueForKeyPath:@"content.webaddresses"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = [item safeValueForKeyPath:@"title"];
	
	
	return cell;


	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
		NSString *urlString = [NSString stringWithFormat:@"%@%@", @"mailto:", [contentProvider safeValueForKeyPath:@"content.mail"]];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	
	} else

	if(indexPath.section == 0 && indexPath.row == 1) {
	
	
		NSString *urlString = [NSString stringWithFormat:@"%@%@", @"tel:", [contentProvider safeValueForKeyPath:@"content.phone"]];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	
	} else


	if(indexPath.section == 1) {
	
	id item = [[[contentProvider safeValueForKeyPath:@"content.webaddresses"]asArray] objectAtIndex: indexPath.row];
		NSString *urlString = [item safeValueForKeyPath:@"url"];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Person";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider safeValueForKeyPath:@"content.name"];
		
		self.headerView.detailsLabel.text = [contentProvider safeValueForKeyPath:@"content.bio"];
		NSString *imageURL = [contentProvider safeValueForKeyPath:@"content.pictureurl"];
		self.headerView.image.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	}	

	[super updateData];
}

@end
