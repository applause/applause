package org.applause.lang.generator.ios.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Screen
import org.applause.lang.applauseDsl.ScreenListItemCell
import org.applause.lang.generator.ios.ExpressionExtensions
import org.applause.lang.generator.ios.dataaccess.DataAccessClassExtensions
import org.applause.lang.generator.ios.model.EntityClassExtensions
import org.applause.lang.generator.ios.model.TypeExtensions
import org.eclipse.xtext.generator.IFileSystemAccess

import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*
import org.applause.lang.applauseDsl.RESTVerb

class DefaultDetailsScreenCompiler  {
	
	@Inject extension DefaultDetailsScreenHeaderFileCompiler
	@Inject extension DefaultDetailsScreenModuleFileCompiler
	@Inject extension DefaultListScreenClassExtensions
	
	def doGenerate(Screen it, IFileSystemAccess fsa) {
		fsa.generateFile(it.screenHeaderFileName, IOS_OUTPUT_CONTROLLERS, it.compileHeader)
		fsa.generateFile(it.screenModuleFileName, IOS_OUTPUT_CONTROLLERS, it.compileModule)
	}

}

class DefaultDetailsScreenClassExtensions extends ScreenClassExtensions {
	
	def resourceType(Screen it) {
		datasource.datasource.resourceType
	}
	
}


class DefaultDetailsScreenHeaderFileCompiler {
	
	@Inject extension DefaultDetailsScreenClassExtensions
	@Inject extension EntityClassExtensions
	@Inject extension TypeExtensions
	
	def compileHeader(Screen it) '''
		#import <Foundation/Foundation.h>
		#import "QuickDialogController.h"
		#import "«resourceType.entityModelHeaderFileName»"
		
		@interface «controllerClassName» : QuickDialogController
		@property (nonatomic, strong) «resourceType.typeName» *item;
		
		+ (void)presentForAddingNewItemFromParent:(UIViewController *)parent onDone:(void (^)(«resourceType.typeName» *item))doneBlock;
		+ (void)presentForEditingItem:(«resourceType.typeName» *)item fromParent:(UIViewController *)parent onDone:(void (^)(«resourceType.typeName» *editedItem))doneBlock;
		@end
	'''
	
}

class DefaultDetailsScreenModuleFileCompiler {
	
	@Inject extension DefaultDetailsScreenClassExtensions
	@Inject extension TypeExtensions
	@Inject extension ExpressionExtensions
	@Inject extension DataAccessClassExtensions
	
	def configurations(Screen it) {
		sections.map[items].map[items].flatten.map[configurations].flatten
	}
	
	def cells(Screen it) {
		sections.map[items].map[items].flatten
	}
	
	def defaultCell(Screen it) {
		sections.map[items].map[items].flatten.head
	}
	
	def restMethod(Screen it) {
		defaultCell.restMethod.restMethod
	}
	
	def compileModule(Screen it) '''
		#import "«screenHeaderFileName»"
		#import "QRootElement.h"
		#import "QEntryElement.h"
		#import "QBooleanElement.h"
		#import "QDateTimeInlineElement.h"
		#import "QButtonElement.h"
		#import "«resourceType.entityDataAccessCategoryHeaderFileName»"
		
		@interface «controllerClassName» ()
		@property(nonatomic) enum DetailsViewMode mode;
		@property(nonatomic, copy) void (^doneBlock)(«resourceType.typeName» *);
		@end
		
		@implementation «controllerClassName»
		
		enum DetailsViewMode {
			DetailsViewModeAdd,
			DetailsViewModeEdit,
		};
		typedef enum DetailsViewMode DetailsViewMode;
		
		+ (void)presentForAddingNewItemFromParent:(UIViewController *)parent onDone:(void (^)(«resourceType.typeName» *item))doneBlock
		{
			«controllerClassName» *detailsViewController = [[«controllerClassName» alloc] initWithMode:DetailsViewModeAdd];
			detailsViewController.item = [[«resourceType.typeName» alloc] init];
			detailsViewController.doneBlock = ^(«resourceType.typeName» *editedItem)
			{
				[parent dismissViewControllerAnimated:YES completion:nil];
				if (doneBlock) {
					doneBlock(editedItem);
				}
			};
			UINavigationController *navigationController = [[UINavigationController alloc] initWithRootViewController:detailsViewController];
			[parent presentViewController:navigationController animated:YES completion:nil];
		}
		
		+ (void)presentForEditingItem:(«resourceType.typeName» *)item fromParent:(UIViewController *)parent onDone:(void (^)(«resourceType.typeName» *editedItem))doneBlock
		{
			«controllerClassName» *detailsViewController = [[«controllerClassName» alloc] initWithMode:DetailsViewModeEdit];
			detailsViewController.item = item;
			detailsViewController.doneBlock = ^(«resourceType.typeName» *editedItem)
			{
				[parent.navigationController popViewControllerAnimated:YES];
				if (doneBlock) {
					doneBlock(editedItem);
				}
			};
			[parent.navigationController pushViewController:detailsViewController animated:YES];
		}
		
		- (id)initWithMode:(DetailsViewMode)mode
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
			if (self.mode == DetailsViewModeAdd) {
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
			[self.root fetchValueUsingBindingsIntoObject:self.item];
			if (self.mode == DetailsViewModeAdd) {
				«compileCreateNewItemFragment»
			}
			else {
				«compileUpdateItemFragment»
			}
		}
		
		- (void)onCancel
		{
			[self.presentingViewController dismissViewControllerAnimated:YES completion:nil];
		}
		
		- (void)setItem:(«resourceType.typeName» *)item
		{
			_item = item;
			[self.root bindToObject:self.item];
		}
		
		«compileForm»
		
		@end
	'''
	
	def dataAccessMethodNameForUpdate(Screen it) {
		datasource.datasource.methods.findFirst[restSpecification.verb == RESTVerb.PUT].name
	}
	
	def dataAccessMethodNameForCreate(Screen it) {
		datasource.datasource.methods.findFirst[restSpecification.verb == RESTVerb.POST].name
	}
	
	def compileUpdateItemFragment(Screen it) '''
		[self.item «dataAccessMethodNameForUpdate»:^(«resourceType.typeName» *item, NSError *error)
		{
			if(error == nil) {
				if (self.doneBlock) {
					self.doneBlock(item);
				}
			}
			else {
				// use a HUD to display this to the user:
				NSLog(@"Problem saving the «resourceType.typeName.toFirstLower». Try again later.");
			}
		}];
	'''
	
	def compileCreateNewItemFragment(Screen it) '''
		[self.item «dataAccessMethodNameForCreate»:^(«resourceType.typeName» *item, NSError *error)
		{
			if(error == nil) {
				if (self.doneBlock) {
					self.doneBlock(item);
				}
			}
			else {
				// use a HUD to display this to the user:
				NSLog(@"Problem saving the «resourceType.typeName.toFirstLower». Try again later.");
			}
		}];
	'''
	
	def compileForm(Screen it) '''
		- (QRootElement *)createForm
		{
			QRootElement *root = [[QRootElement alloc] init];
			root.controllerName = @"«controllerClassName»";
			root.grouped = YES;
			«IF (title != null)»
			root.title = @"«title»";
			«ENDIF»
		
			QSection *sectionMain = [[QSection alloc] init];

			«FOR it: cells»
				«compileCell»
				
			«ENDFOR»
			[root addSection:sectionMain];
		
			return root;
		}
	'''
	
	def compileCell(ScreenListItemCell it) {
		switch (it.type.name) {
			case 'TextDetailsItemCell': compileTextCell(it)
			case 'ToggleDetailsItemCell': compileBooleanCell(it)
			case 'DateDetailsItemCell': compileDateCell(it)
		}
	}
	
	def labelConfig(ScreenListItemCell it) {
		configurations.findFirst[type.component.name == 'label']
	}
	
	def detailsConfig(ScreenListItemCell it) {
		configurations.findFirst[type.component.name == 'details']
	}
	
	def entryElementName(ScreenListItemCell it) {
		detailsConfig.value.evaluateExpression.toFirstLower + 'Element'
	}
	
	def compileTextCell(ScreenListItemCell it) '''
		QEntryElement *«entryElementName» = [[QEntryElement alloc] init];
		«entryElementName».title = @"«labelConfig.value.evaluateExpression»";
		«entryElementName».key = @"«detailsConfig.value.evaluateExpression»";
		«entryElementName».bind = @"textValue:«detailsConfig.value.evaluateExpression»";
		[sectionMain addElement:«entryElementName»];
	'''
	
	def compileBooleanCell(ScreenListItemCell it) '''
		QBooleanElement *«entryElementName» = [[QBooleanElement alloc] init];
		«entryElementName».title = @"«labelConfig.value.evaluateExpression»";
		«entryElementName».key = @"«detailsConfig.value.evaluateExpression»";
		«entryElementName».bind = @"boolValue:«detailsConfig.value.evaluateExpression»";
		[sectionMain addElement:«entryElementName»];
	'''
	
	def compileDateCell(ScreenListItemCell it) '''
		QDateTimeInlineElement *«entryElementName» = [[QDateTimeInlineElement alloc] init];
		«entryElementName».title = @"«labelConfig.value.evaluateExpression»";
		«entryElementName».mode = UIDatePickerModeDateAndTime;
		«entryElementName».dateValue = [NSDate date]; 
		«entryElementName».key = @"«detailsConfig.value.evaluateExpression»";
		«entryElementName».bind = @"dateValue:«detailsConfig.value.evaluateExpression»";
		[sectionMain addElement:«entryElementName»];
	'''
	
}
