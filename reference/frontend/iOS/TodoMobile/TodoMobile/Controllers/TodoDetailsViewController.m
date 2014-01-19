//
// Created by Peter Friese on 07.09.13.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import "TodoDetailsViewController.h"
#import "QRootElement.h"
#import "QEntryElement.h"
#import "QBooleanElement.h"
#import "QDateTimeInlineElement.h"
#import "QButtonElement.h"
#import "Todo+DataAccess.h"

@interface TodoDetailsViewController ()
@property(nonatomic) enum TodoDetailsViewMode mode;
@property(nonatomic, copy) void (^doneBlock)(Todo *);
@property(nonatomic, strong) List *list;
@end

@implementation TodoDetailsViewController

enum TodoDetailsViewMode {
	TodoDetailsViewModeAdd,
	TodoDetailsViewModeEdit,
};
typedef enum TodoDetailsViewMode TodoDetailsViewMode;

+ (void)presentForAddingNewTodoForList:(List *)list fromParent:(UIViewController *)parent onDone:(void (^)(Todo *todo))doneBlock
{
	TodoDetailsViewController *todoDetailsViewController = [[TodoDetailsViewController alloc] initWithMode:TodoDetailsViewModeAdd];
	todoDetailsViewController.list = list;
	todoDetailsViewController.todo = [[Todo alloc] init];
	todoDetailsViewController.doneBlock = ^(Todo *editedTodo)
	{
		[parent dismissViewControllerAnimated:YES completion:nil];
		if (doneBlock) {
			doneBlock(editedTodo);
		}
	};
	UINavigationController *navigationController = [[UINavigationController alloc] initWithRootViewController:todoDetailsViewController];
	[parent presentViewController:navigationController animated:YES completion:nil];
}

+ (void)presentForAddingNewTodoFromParent:(UIViewController *)parent onDone:(void (^)(Todo *todo))doneBlock
{
	TodoDetailsViewController *todoDetailsViewController = [[TodoDetailsViewController alloc] initWithMode:TodoDetailsViewModeAdd];
	todoDetailsViewController.todo = [[Todo alloc] init];
	todoDetailsViewController.doneBlock = ^(Todo *editedTodo)
	{
		[parent dismissViewControllerAnimated:YES completion:nil];
		if (doneBlock) {
			doneBlock(editedTodo);
		}
	};
	UINavigationController *navigationController = [[UINavigationController alloc] initWithRootViewController:todoDetailsViewController];
	[parent presentViewController:navigationController animated:YES completion:nil];
}

+ (void)presentForEditingTodo:(Todo *)todo fromParent:(UIViewController *)parent onDone:(void (^)(Todo *editedTodo))doneBlock
{
	TodoDetailsViewController *todoDetailsViewController = [[TodoDetailsViewController alloc] initWithMode:TodoDetailsViewModeEdit];
	todoDetailsViewController.todo = todo;
	todoDetailsViewController.doneBlock = ^(Todo *editedTodo)
	{
		[parent.navigationController popViewControllerAnimated:YES];
		if (doneBlock) {
			doneBlock(editedTodo);
		}
	};
	[parent.navigationController pushViewController:todoDetailsViewController animated:YES];
}

- (id)initWithMode:(TodoDetailsViewMode)mode
{
	self = [super initWithRoot:[self createForm]];
	if (self) {
		self.mode = mode;
		[self createActionButtons];
	}
	return self;
}

- (void)createActionButtons
{
	if (self.mode == TodoDetailsViewModeAdd) {
		self.navigationItem.leftBarButtonItem = [[UIBarButtonItem alloc] initWithBarButtonSystemItem:UIBarButtonSystemItemCancel
																							  target:self
																							  action:@selector(onCancel)];
	}
	self.navigationItem.rightBarButtonItem = [[UIBarButtonItem alloc] initWithBarButtonSystemItem:UIBarButtonSystemItemDone
																						   target:self
																						   action:@selector(onDone)];
}

- (void)onDone
{
	[self.root fetchValueUsingBindingsIntoObject:self.todo];
	if (self.mode == TodoDetailsViewModeAdd) {
		[self.todo postForList:self.list result:^(Todo *todo, NSError *error)
		{
			if(error == nil) {
				if (self.doneBlock) {
					self.doneBlock(todo);
				}
			}
			else {
				// use a HUD to display this to the user:
				NSLog(@"Problem saving the todo. Try later.");
			}
		}];
	}
	else {
		[self.todo put:^(Todo *todo, NSError *error)
		{
			if(error == nil) {
				if (self.doneBlock) {
					self.doneBlock(todo);
				}
			}
			else {
				// use a HUD to display this to the user:
				NSLog(@"Problem saving the todo. Try later.");
			}
		}];
	}
}

- (void)onCancel
{
	[self.presentingViewController dismissViewControllerAnimated:YES completion:nil];
}

- (QRootElement *)createForm
{
	QRootElement *root = [[QRootElement alloc] init];
	root.controllerName = @"TodoDetailsViewController";
	root.grouped = YES;
	root.title = @"Todo";

	QSection *sectionMain = [[QSection alloc] init];

	QEntryElement *title = [[QEntryElement alloc] init];
	title.title = @"Title";
	title.key = @"title";
	title.bind = @"textValue:title";
	[sectionMain addElement:title];

	QBooleanElement *boolCompleted = [[QBooleanElement alloc] initWithTitle:@"Completed" BoolValue:NO];
	// uncomment this to perform an action every time the user toggles the switch:
//	completed.controllerAction = @"exampleAction:";
	boolCompleted.key = @"completed";
	boolCompleted.bind = @"boolValue:done";
	[sectionMain addElement:boolCompleted];

	QDateTimeInlineElement *dateDue = [[QDateTimeInlineElement alloc] initWithTitle:@"Due Date" date:[NSDate date] andMode:UIDatePickerModeDateAndTime];
	dateDue.key = @"dueDate";
	dateDue.bind = @"dateValue:dueDate";
	[sectionMain addElement:dateDue];

	[root addSection:sectionMain];

	// uncomment this section to display an "Add" button at the end of the form:
//    QSection *sectionActions = [[QSection alloc] init];
//    QButtonElement *btnAddIssue = [[QButtonElement alloc] init];
//	btnAddIssue.title = @"Add";
//    btnAddIssue.controllerAction = @"onAddTodo:";
//	[sectionActions addElement:btnAddIssue];
//
//	[root addSection:sectionActions];

	return root;
}

- (void)setTodo:(Todo *)todo
{
	_todo = todo;
	[self.root bindToObject:todo];
}

@end