//
// Created by Peter Friese on 13.01.14.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//


#import "ListListViewController.h"
#import "List.h"
#import "List+DataAccess.h"
#import "TodoListViewController.h"

@interface ListListViewController()
@property (nonatomic, strong) NSMutableArray *lists;
@end

@implementation ListListViewController

static NSString *kCellIdentifier = @"ListCell";

- (id)initWithStyle:(UITableViewStyle)style
{
	self = [super initWithStyle:style];
	if (self) {
		self.title = @"Lists";

		// register table view cell
		[self.tableView registerClass:[UITableViewCell class] forCellReuseIdentifier:kCellIdentifier];

		[self.tableView setDelegate:self];;

		// refresh control
		self.refreshControl = [[UIRefreshControl alloc] init];
		[self.refreshControl addTarget:self action:@selector(refresh) forControlEvents:UIControlEventValueChanged];

		// register action buttons
		self.navigationItem.rightBarButtonItems = @[
				[[UIBarButtonItem alloc] initWithBarButtonSystemItem:UIBarButtonSystemItemAdd
															  target:self
															  action:@selector(onAddTodo)]
		];
	}
	return self;
}

- (void)viewDidLoad
{
	[super viewDidLoad];
	[self reload];
}

- (void)didReceiveMemoryWarning
{
	[super didReceiveMemoryWarning];
}

#pragma mark - Table view data source

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
{
	return [self.lists count];
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
	UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:kCellIdentifier forIndexPath:indexPath];

	List *todo = self.lists[(NSUInteger) indexPath.row];
	cell.textLabel.text = todo.title;

	return cell;
}

#pragma mark - Table view delegate

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath
{
	List *list = self.lists[(NSUInteger) indexPath.row];
	[self onDisplayItem:list];
}

- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath
{
	List *list = self.lists[indexPath.row];
	[list remove:^(List *list, NSError *error)
	{
		if (error) {
			NSLog(@"Error %@", error);
		}
		else {
			if (indexPath.row < self.lists.count) {
				[self.lists removeObjectAtIndex:indexPath.row];
				[self.tableView deleteRowsAtIndexPaths:@[indexPath] withRowAnimation:UITableViewRowAnimationFade];
			}
		}
	}];
}

#pragma mark - Data access

- (void)refresh
{
	[self reload];
}

- (void)reload
{
	[List allLists:^(NSArray *lists, NSError *error)
	{
		[self.refreshControl endRefreshing];
		if (error) {
			[[[UIAlertView alloc] initWithTitle:NSLocalizedString(@"Error", nil)
										message:[error localizedDescription]
									   delegate:nil
							  cancelButtonTitle:nil
							  otherButtonTitles:NSLocalizedString(@"OK", nil), nil] show];
		}
		else {
			self.lists = [NSMutableArray arrayWithArray:lists];
			[self.tableView reloadData];
		}
	}];
}

#pragma mark - Actions

- (void)onDisplayItem:(List *)list
{
	[TodoListViewController presentForDisplayingTodosOf:list fromParent:self onDone:^(List *list)
	{
		[self refresh];
	}];
}

- (void)onAddTodo
{
//	[ListDetailsViewController presentForAddingNewTodoFromParent:self onDone:^(List list)
//	{
//		[self refresh];
//	}];
}

- (void)onEditTodo:(List *)todo
{
//	[ListDetailsViewController presentForEditingTodo:todo fromParent:self onDone:^(List *editedTodo)
//	{
//		[self refresh];
//	}];
}

@end
