package org.applause.lang.generator.ios.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.RESTVerb
import org.applause.lang.applauseDsl.Screen
import org.applause.lang.applauseDsl.UIAction
import org.applause.lang.applauseDsl.UIActionDeleteAction
import org.applause.lang.applauseDsl.UIActionNavigateAction
import org.applause.lang.applauseDsl.UIComponentMemberConfiguration
import org.applause.lang.generator.ios.ExpressionExtensions
import org.applause.lang.generator.ios.dataaccess.DataAccessClassExtensions
import org.applause.lang.generator.ios.model.TypeExtensions
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess

import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*

class DefaultListScreenCompiler {
	
	@Inject extension DefaultListScreenHeaderFileCompiler
	@Inject extension DefaultListScreenModuleFileCompiler
	@Inject extension DefaultListScreenClassExtensions
	
	def doGenerate(Screen it, IFileSystemAccess fsa) {
		fsa.generateFile(it.screenHeaderFileName, IOS_OUTPUT_CONTROLLERS, it.compileHeader)
		fsa.generateFile(it.screenModuleFileName, IOS_OUTPUT_CONTROLLERS, it.compileModule)
	}

}

class DefaultListScreenClassExtensions extends ScreenClassExtensions {
	
	def resourceType(Screen it) {
		datasource.datasource.resourceType
	}
	
	def configurations(Screen it) {
		sections.map[items].map[items].flatten.map[configurations].flatten
	}
	
	def defaultCell(Screen it) {
		sections.map[items].map[items].flatten.head
	}
	
	def restMethod(Screen it) {
		defaultCell.restMethod.restMethod
	}
	
	def targetNavigationScreen(Screen it) {
		defaultCell.actions.map[action].filter(typeof(UIActionNavigateAction)).head.targetScreen
	}
	
	def screen(UIAction it) {
		EcoreUtil2.getContainerOfType(it, Screen)
	}
	
}


class DefaultListScreenHeaderFileCompiler {
	
	@Inject extension DefaultListScreenClassExtensions
	
	def compileHeader(Screen it) '''
		#import <UIKit/UIKit.h>
		
		@interface «controllerClassName» : UITableViewController
		
		@end
	'''
	
}

class DefaultListScreenModuleFileCompiler {
	
	@Inject extension DefaultListScreenClassExtensions
	@Inject extension TypeExtensions
	@Inject extension ExpressionExtensions
	@Inject extension DataAccessClassExtensions
	@Inject extension DefaultListScreenActionCompiler
	@Inject extension DefaultListScreenEditActionCompiler
	
	def compileModule(Screen it) '''
		#import "«screenHeaderFileName»"
		#import "«resourceType.entityDataAccessCategoryHeaderFileName»"
		#import "«targetNavigationScreen.screenHeaderFileName»"
		
		@interface «controllerClassName» ()
		@property(nonatomic, strong) NSMutableArray *items;		
		@end
		
		@implementation «controllerClassName»
		
		static NSString *kCellIdentifier = @"«datasource.datasource.resourceType.typeName»Cell";
		
		- (id)initWithStyle:(UITableViewStyle)style
		{
		    self = [super initWithStyle:style];
		    if (self) {
				«IF title != null»
					self.title = @"«title»";
				«ENDIF»
				// register table view cell
				[self.tableView registerClass:[UITableViewCell class] forCellReuseIdentifier:kCellIdentifier];
		
				[self.tableView setDelegate:self];;
		
				// refresh control
				self.refreshControl = [[UIRefreshControl alloc] init];
				[self.refreshControl addTarget:self action:@selector(refresh) forControlEvents:UIControlEventValueChanged];
				
				«compileActionButtons»
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
			return [self.items count];
		}
		
		- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
		{
		    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:kCellIdentifier forIndexPath:indexPath];
		    
			«resourceType.typeName» *item = self.items[(NSUInteger) indexPath.row];
			«FOR it: configurations»
				«compileConfiguration»
			«ENDFOR»
		
		    return cell;
		}
		
		#pragma mark - Table view delegate
		
		- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath
		{
			«resourceType.typeName» *item = self.items[(NSUInteger) indexPath.row];
			[self onEditItem:item];
		}
		
		«IF supportsDeleteAction»
			«compileCommitEditing»
		«ENDIF»
		
		#pragma mark - Data access
		
		- (void)refresh
		{
			[self reload];
		}
		
		- (void)reload
		{
			[«resourceType.typeName» «restMethod.name»:^(NSArray *items, NSError *error)
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
					self.items = [NSMutableArray arrayWithArray:items];
					[self.tableView reloadData];
				}
			}];
		}
		
		#pragma mark - Actions
		
		«compileActionMethods»
		
		@end
	'''
	
	def compileConfiguration(UIComponentMemberConfiguration it) '''
		cell.«type.component.name».«type.member.name» = item.«value.evaluateExpression»;
	'''
	
}

class DefaultListScreenEditActionCompiler {
	
	@Inject extension DefaultListScreenClassExtensions
	@Inject extension TypeExtensions
	
	def supportsDeleteAction(Screen it) {
		defaultCell.actions.map[action].filter(typeof(UIActionDeleteAction)).size > 0
	}
	
	def deleteAction(Screen it) {
		defaultCell.actions.map[action].filter(typeof(UIActionDeleteAction)).head
	}
	
	def deleteMethod(Screen it) {
		it.datasource.datasource.methods.filter[restSpecification.verb == RESTVerb.DELETE].head
	}
	
	def compileCommitEditing(Screen it) '''
		- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath
		{
			«resourceType.typeName» *item= self.items[indexPath.row];
			[item «deleteMethod.name»:^(«resourceType.typeName» *item, NSError *error)
			{
				if (error) {
					NSLog(@"Error %@", error);
				}
				else {
					if (indexPath.row < self.items.count) {
						[self.items removeObjectAtIndex:indexPath.row];
						[self.tableView deleteRowsAtIndexPaths:@[indexPath] withRowAnimation:UITableViewRowAnimationFade];
					}
				}
			}];
		}
	'''
	
}

class DefaultListScreenActionCompiler {
	
	@Inject extension DefaultListScreenClassExtensions
	@Inject extension TypeExtensions
	
	def compileActionButtons(Screen it) '''
		// register action buttons
		self.navigationItem.rightBarButtonItems = @[
			«FOR action: actions»
				«action.compileActionButton»
			«ENDFOR»
		];
	'''
	
	private def compileActionButton(UIAction it) {
//		if (it.action instanceof UIActionNavigateAction) {
//			switch ((it.action as UIActionNavigateAction).actionVerb) {
//				case ActionVerb.ADD: screen.compileActionButton_AddItem
//			}
//		}	
	}
	
	private def compileActionButton_AddItem(Screen it) '''
		[[UIBarButtonItem alloc] initWithBarButtonSystemItem:UIBarButtonSystemItemAdd
													  target:self
													  action:@selector(onAddItem)]
	'''
	
	def compileActionMethods(Screen it) '''
		«FOR action: defaultCell.actions + actions»
			«action.compileActionMethod»
		«ENDFOR»
	'''

	private def compileActionMethod(UIAction it) {
//		if (it.action instanceof UIActionNavigateAction) {
//			switch ((it.action as UIActionNavigateAction).actionVerb) {
//				case ActionVerb.ADD: screen.compileActionMethod_AddItem
//				case ActionVerb.EDIT: screen.compileActionMethod_EditItem
//			}
//		}	
	}
	
	private def compileActionMethod_AddItem(Screen it) '''
		- (void)onAddItem
		{
			[«targetNavigationScreen.controllerClassName» presentForAddingNewItemFromParent:self onDone:^(«resourceType.typeName» *item)
			{
				[self refresh];
			}];
		}
	'''
	
	private def compileActionMethod_EditItem(Screen it) '''
		- (void)onEditItem:(«resourceType.typeName» *)item
		{
			[«targetNavigationScreen.controllerClassName» presentForEditingItem:item fromParent:self onDone:^(«resourceType.typeName» *editedItem)
			{
				[self refresh];
			}];
		
		}
	'''
}
