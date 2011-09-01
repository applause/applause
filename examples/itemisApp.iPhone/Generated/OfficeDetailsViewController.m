
#import "OfficeDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "PersonDetailsViewController.h"
 

@implementation OfficeDetailsViewController


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	if(!contentProvider || !contentProvider.content || contentProvider.loading)
		return 0;
	else
    	return 2;
}



- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return 1;
	} else
	if(section == 1) {
		return 1 + 1 + 1;
	} else
		return 0;
}


-(CGFloat) tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath {

	if(indexPath.section == 1 && indexPath.row == 0)
		return 88;


	return self.tableView.rowHeight;
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [contentProvider safeValueForKeyPath:@"content.contact.name"];
	cell.detailTextLabel.text = [contentProvider safeValueForKeyPath:@"content.contact.role"];
	
	return cell;

	

	} else


	if(indexPath.section == 1 && indexPath.row == 0) {
	
	
    IPTableViewCellMap *cell = [self cellMapForTableView:tableView];
	cell.textLabel.text = [contentProvider safeValueForKeyPath:@"content.address"];
	
	cell.queryString = [contentProvider safeValueForKeyPath:@"content.geo"];
	NSString *imageURL = cell.imageUrl;
	cell.imageView.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	return cell;

	

	} else

	if(indexPath.section == 1 && indexPath.row == 1) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"phone";
	cell.detailTextLabel.text = [contentProvider safeValueForKeyPath:@"content.phone"];
	
	return cell;

	

	} else

	if(indexPath.section == 1 && indexPath.row == 2) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"mail";
	cell.detailTextLabel.text = [contentProvider safeValueForKeyPath:@"content.mail"];
	
	return cell;

	

	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForPersonByName: [contentProvider safeValueForKeyPath:@"content.contact.name"]];
		PersonDetailsViewController *controller = [[PersonDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	
	} else


	if(indexPath.section == 1 && indexPath.row == 0) {
	
	
		NSString *urlString = [NSString stringWithFormat:@"%@%@", @"http://maps.google.de/maps?q=", [[contentProvider safeValueForKeyPath:@"content.geo"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	
	} else

	if(indexPath.section == 1 && indexPath.row == 1) {
	
	
		NSString *urlString = [NSString stringWithFormat:@"%@%@", @"tel:", [contentProvider safeValueForKeyPath:@"content.phone"]];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	
	} else

	if(indexPath.section == 1 && indexPath.row == 2) {
	
	
		NSString *urlString = [NSString stringWithFormat:@"%@%@", @"mailto:", [contentProvider safeValueForKeyPath:@"content.mail"]];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Office";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider safeValueForKeyPath:@"content.location"];
		
		self.headerView.detailsLabel.text = [contentProvider safeValueForKeyPath:@"content.summary"];
		
	}	

	[super updateData];
}

@end
