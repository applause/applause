package org.applause.lang.generator.ios.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.ListView
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.lang.generator.ios.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource

import static extension org.applause.util.xcode.project.Path.*


class ListViewCompiler {
	
	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	
	@Inject ImportManagerFactory importManagerFactory
	
	// outlet name
	public String UI_OUTPUT = IosOutputConfigurationProvider::OUTPUT_UI
	
	/**
	 * Main entry point for the listview compiler.
	 */
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		val modelGroup = pfsa.mainSourceGroup.createGroup("UI".toPath)
		
		resource.allContents.filter(typeof(ListView)).forEach[
			pfsa.createHeaderFile(modelGroup, UI_OUTPUT, it.headerFileName, it.compileHeader)
			pfsa.createModuleFile(modelGroup, UI_OUTPUT, it.moduleFileName, it.compileModule)
		]
	}
	
	// -- HEADER
	
	/**
	 * Compiles the header file for a list view.
	 */
	def compileHeader(ListView listview) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«val body = listview.compileInterface(importManager)»
		«importManager.imports()»
		«body»
	'''
	
	def compileInterface(ListView listview, ImportManager manager) '''
		@interface «listview.typeName»«listview.extendsClause(manager)»
		@end
	'''
	
	def private imports(ImportManager importManager) '''
		«IF (!importManager.empty)»
		«FOR imprt: importManager.imports»
			#import "«imprt».h"
		«ENDFOR»
		«ENDIF»
		
	'''
	
	def private extendsClause(ListView listview, ImportManager importManager) '''
		: UITableViewController
	'''
	
	
	// -- MODULE	
	
	/** 
	 * Compiles the module file for a list view.
	 */
	def compileModule(ListView listview) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«val body = listview.compileImplementation(importManager)»
		«importManager.imports()»
		«body»
	'''
	
	def compileImplementation(ListView it, ImportManager manager) '''
		@implementation «typeName»
		
		«method_init»
		
		«method_viewWillAppear»
		
		«method_resourcePath»
		
		«method_fetchData»
		
		«compileTableViewDataSource»
		
		@end
	'''
	
	def method_init(ListView it) '''
		- (id)initWithStyle:(UITableViewStyle)style
		{
			self = [super initWithStyle:style];
			if (self) {
				self.title = @"«title»";
				// TODO Table cell setup is dependent on the number of sections and cells,
				//		make sure to factor this out.
				[self.tableView registerClass:[UITableViewCell class] forCellReuseIdentifier:@"Cell"];
			}
			return self;
		}
	'''
	
	def method_viewWillAppear(ListView it) '''
		- (void)viewWillAppear:(BOOL)animated
		{
			[super viewWillAppear:animated];
			[self fetchData];
		}
	'''
	
	def method_resourcePath(ListView it) '''
		- (NSString *)resourcePath
		{
			// TODO Note that we might have multiple data sources in place, so the architecture needs to support this!
			//		In the first iteration, let's go with a simple case.
			return [NSString stringWithFormat:@"/users/%@/repos", @"wwaltersen"];
		}
	'''
	
	def method_fetchData(ListView it) '''
		// TODO This probably needs to be adjusted for RestKit 2
		- (void)fetchData
		{
			[[RKObjectManager sharedManager] loadObjectsAtResourcePath:[self resourcePath] usingBlock:^(RKObjectLoader *loader) {
				[loader setOnDidLoadObjects:^(NSArray *objects) {
					// TODO not sure the name of the field should be repos. Maybe use a generla name, 
					//		but what if we have got multiple data sources? 
					self.repos = objects;
					[self.tableView reloadData];
				}];
				[loader setOnDidFailWithError:^(NSError *error) {
					NSLog(@"Error loading repos for user %@: %@", @"peterfriese", error);
				}];
			}];
		}
	'''
	
	def compileTableViewDataSource(ListView it) '''
		#pragma mark - Table view data source
		«method_numberOfSectionsInRow»
		
		«method_cellForRowAtIndexPath»
	'''
	
	def method_numberOfSectionsInRow(ListView it) '''
		- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
		{
			return [self.repos count];
		}
	'''
	
	def method_cellForRowAtIndexPath(ListView it) '''
		- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
		{
			// TODO this depends on the number of sections and their layout
			static NSString *CellIdentifier = @"Cell";
			UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier forIndexPath:indexPath];
			// Configure the cell...
			GithubRepo *repo = (GithubRepo *)[self.repos objectAtIndex:[indexPath row]];
			cell.textLabel.text = repo.name;
			cell.detailTextLabel.text = repo.open_issues;
			cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
			return cell;
		}
	'''
		
	
}