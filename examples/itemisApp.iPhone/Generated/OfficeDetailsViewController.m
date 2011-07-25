
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
	
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = [contentProvider valueForKeyPath:@"content.contact"];
	
	
	return cell;

	

	} else


	if(indexPath.section == 1 && indexPath.row == 0) {
	
	
    IPTableViewCellMap *cell = [self cellMapForTableView:tableView];
	cell.textLabel.text = [contentProvider valueForKeyPath:@"content.address"];
	
	cell.queryString = [contentProvider valueForKeyPath:@"content.address"];
	NSString *imageURL = cell.imageUrl;
	cell.imageView.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	return cell;

	

	} else

	if(indexPath.section == 1 && indexPath.row == 1) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"phone";
	cell.detailTextLabel.text = [contentProvider valueForKeyPath:@"content.phone"];
	
	return cell;

	

	} else

	if(indexPath.section == 1 && indexPath.row == 2) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"mail";
	cell.detailTextLabel.text = [contentProvider valueForKeyPath:@"content.mail"];
	
	return cell;

	

	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForPersonByName: [contentProvider valueForKeyPath:@"content.contact"]];
		PersonDetailsViewController *controller = [[PersonDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	
	} else


	if(indexPath.section == 1 && indexPath.row == 0) {
	
	
		NSString *urlString = [NSString stringWithFormat:@"%@%@", @"http://maps.google.de/maps?q=", [[contentProvider valueForKeyPath:@"content.address"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	
	} else

	if(indexPath.section == 1 && indexPath.row == 1) {
	
	
		NSString *urlString = [NSString stringWithFormat:@"%@%@", @"tel:", [contentProvider valueForKeyPath:@"content.phone"]];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	
	} else

	if(indexPath.section == 1 && indexPath.row == 2) {
	
	
		NSString *urlString = [NSString stringWithFormat:@"%@%@", @"mailto:", [contentProvider valueForKeyPath:@"content.mail"]];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Office";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.location"];
		self.headerView.subtitleLabel.text = [contentProvider valueForKeyPath:@"content.address"];
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.summary"];
		
	}	

	[super updateData];
}

@end
