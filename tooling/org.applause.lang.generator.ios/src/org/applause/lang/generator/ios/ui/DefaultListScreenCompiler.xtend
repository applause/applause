package org.applause.lang.generator.ios.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Screen
import org.applause.lang.applauseDsl.UIComponentMemberConfiguration
import org.applause.lang.generator.ios.ExpressionExtensions
import org.applause.lang.generator.ios.ICompilerModule
import org.applause.lang.generator.ios.dataaccess.DataAccessClassExtensions
import org.applause.lang.generator.ios.model.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*

class DefaultListScreenCompiler implements ICompilerModule {
	
	@Inject extension DefaultListScreenHeaderFileCompiler
	@Inject extension DefaultListScreenModuleFileCompiler
	@Inject extension ScreenClassExtensions
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Screen)).forEach [
			fsa.generateFile(it.screenHeaderFileName, IOS_OUTPUT_CONTROLLERS, it.compileHeader)
			fsa.generateFile(it.screenModuleFileName, IOS_OUTPUT_CONTROLLERS, it.compileModule)
		]
	}

}

class ScreenClassExtensions {
	
	def controllerClassName(Screen it) {
		name + 'ViewController'
	}
	
	def screenHeaderFileName(Screen it) {
		controllerClassName + '.h'
	}
	
	def screenModuleFileName(Screen it) {
		controllerClassName + '.m'
	}
	
}


class DefaultListScreenHeaderFileCompiler {
	
	@Inject extension ScreenClassExtensions
	
	def compileHeader(Screen it) '''
		#import <UIKit/UIKit.h>
		
		@interface «controllerClassName» : UITableViewController
		
		@end
	'''
	
}

class DefaultListScreenModuleFileCompiler {
	
	@Inject extension ScreenClassExtensions
	@Inject extension TypeExtensions
	@Inject extension ExpressionExtensions
	@Inject extension DataAccessClassExtensions
	
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
	
	def compileModule(Screen it) '''
		#import "«screenHeaderFileName»"
		#import "«resourceType.entityDataAccessCategoryHeaderFileName»"
		
		@interface «controllerClassName» ()
		@property(nonatomic, strong) NSArray *items;		
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
					self.items = items;
					[self.tableView reloadData];
				}
			}];
		}
		
		@end
	'''
	
	def compileConfiguration(UIComponentMemberConfiguration it) '''
		cell.«type.component.name».«type.member.name» = item.«value.evaluateExpression»;
	'''
	
}
