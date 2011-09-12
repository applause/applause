
#import "RepositoryListViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "CommitListViewController.h"
 

@implementation RepositoryListViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider safeValueForKeyPath:@"content"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	id item = [[[contentProvider safeValueForKeyPath:@"content"] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [item safeValueForKeyPath:@"name"];
	cell.detailTextLabel.text = [item safeValueForKeyPath:@"description"];
	
	return cell;


	} else
		return nil;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	
	id item = [[[contentProvider safeValueForKeyPath:@"content"]asArray] objectAtIndex: indexPath.row];
		IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForallCommitsByRepository: [NSString stringWithFormat:@"%@%@%@", [item safeValueForKeyPath:@"owner"], @"/", [item safeValueForKeyPath:@"name"]]];
		CommitListViewController *controller = [[CommitListViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

	
	} else
		return;
}

-(void)updateData {
	self.navigationItem.title = @"Repositories";
	
	[super updateData];
}

@end
