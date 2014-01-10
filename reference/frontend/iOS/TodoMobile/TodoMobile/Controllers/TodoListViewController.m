//
//  TodoListViewController.m
//  TodoMobile
//
//  Created by Peter Friese on 06.09.13.
//  Copyright (c) 2013 Peter Friese. All rights reserved.
//

#import "TodoListViewController.h"
#import "Todo+DataAccess.h"
#import "TodoDetailsViewController.h"

@interface TodoListViewController ()

@property(nonatomic, strong) NSMutableArray *todos;
@end

@implementation TodoListViewController

static NSString *kCellIdentifier = @"TodoCell";

- (id)initWithStyle:(UITableViewStyle)style
{
    self = [super initWithStyle:style];
    if (self) {
		self.title = @"Todos";

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
	return [self.todos count];
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:kCellIdentifier forIndexPath:indexPath];
    
	Todo *todo = self.todos[(NSUInteger) indexPath.row];
	cell.textLabel.text = todo.title;

    return cell;
}

#pragma mark - Table view delegate

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath
{
	Todo *todo = self.todos[(NSUInteger) indexPath.row];
	[self onEditTodo:todo];
}

- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath
{
	Todo *todo = self.todos[indexPath.row];
	[todo remove:^(Todo *todo, NSError *error)
	{
		if (error) {
			NSLog(@"Error %@", error);
		}
		else {
			if (indexPath.row < self.todos.count) {
				[self.todos removeObjectAtIndex:indexPath.row];
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
	[Todo allTodos:^(NSArray *todos, NSError *error)
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
			self.todos = [NSMutableArray arrayWithArray:todos];
			[self.tableView reloadData];
		}
	}];
}

#pragma mark - Actions

- (void)onAddTodo
{
	[TodoDetailsViewController presentForAddingNewTodoFromParent:self onDone:^(Todo *todo)
	{
		[self refresh];
	}];
}

- (void)onEditTodo:(Todo *)todo
{
	[TodoDetailsViewController presentForEditingTodo:todo fromParent:self onDone:^(Todo *editedTodo)
	{
		[self refresh];
	}];

}

@end
