package org.applause.lang.generator.ios.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.ControllerVerb
import org.applause.lang.applauseDsl.ControllerVerbKind
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.RESTVerb
import org.applause.lang.applauseDsl.Screen
import org.applause.lang.applauseDsl.ScreenListItemCell
import org.applause.lang.generator.ios.ExpressionExtensions
import org.applause.lang.generator.ios.dataaccess.DataAccessClassExtensions
import org.applause.lang.generator.ios.dataaccess.DataAccessMethodCompiler
import org.applause.lang.generator.ios.model.EntityClassExtensions
import org.applause.lang.generator.ios.model.TypeExtensions
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess

import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*
import org.applause.lang.applauseDsl.Parameter

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
	@Inject extension DefaultDetailsScreenControllerCompiler
	@Inject extension DefaultDetailsScreenImportHelper	
	
	def compileHeader(Screen it) '''
		«compileHeaderImports»
		
		@interface «controllerClassName» : QuickDialogController
		
		«compileControllerMethodsHeaders»
		@end
	'''
	
}

class DefaultDetailsScreenModuleFileCompiler {
	
	@Inject extension DefaultDetailsScreenClassExtensions
	@Inject extension TypeExtensions
	@Inject extension ExpressionExtensions
	@Inject extension DefaultDetailsScreenControllerCompiler
	@Inject extension DefaultDetailsScreenImportHelper
	@Inject extension DataAccessMethodCompiler
	
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
		«compileModuleImports»
		
		@interface «controllerClassName» ()
		@property(nonatomic) enum DetailsViewMode mode;
		@property(nonatomic, copy) void (^doneBlock)(«resourceType.typeName» *);
«««		TODO: The following line sucks, there must be a better way to do this: 
		«considerableParameters.map[compile.toString].unique.join()»
		@end
		
		@implementation «controllerClassName»
		
		enum DetailsViewMode {
			DetailsViewModeAdd,
			DetailsViewModeEdit,
			DetailsViewModeDisplay
		};
		typedef enum DetailsViewMode DetailsViewMode;
		
		«compileControllerMethods»
		
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
	
	def dataAccessMethodNameForCreate(Screen it) {
		datasource.datasource.methods.findFirst[restSpecification.verb == RESTVerb.POST].name
	}
	
	def dataAccessMethodCallForCreate(Screen it) {
		datasource.datasource.methods.findFirst[restSpecification.verb == RESTVerb.POST].dataAccessMethodCall
	}
	
	def compileCreateNewItemFragment(Screen it) '''
		[self.item «dataAccessMethodCallForCreate»
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

class DefaultDetailsScreenControllerCompiler {
	
	@Inject extension DefaultDetailsScreenClassExtensions
	@Inject extension TypeExtensions
	
	def compileControllerMethodsHeaders(Screen it) '''
		«FOR verb: verbs»
			«verb.compileControllerMethodHeader»
		«ENDFOR»
	'''

	def compileControllerMethods(Screen it) '''
		#pragma mark - Controller Methods
		
		«FOR verb: verbs»
			«verb.compileControllerMethod»
		«ENDFOR»
	'''
	
	def private screen(ControllerVerb it) {
		EcoreUtil2.getContainerOfType(it, typeof(Screen))
	}
	
	def private purposifiedVerb(ControllerVerb it) {
		switch (it.kind) {
			case ControllerVerbKind.ADD : 'ForAdding'
			case ControllerVerbKind.EDIT: 'ForEditing'
			case ControllerVerbKind.DISPLAY: 'ForDisplaying'
		}
	}
	
	def private parameterClause(ControllerVerb it) {
		'WithParameter:(' + it.declaredParameters.map[it.type.typeName + ' *)' + it.name].join(' and:(')
	}
	
	def controllerMethodName(ControllerVerb it) {
		'+ (void)present' 
		+ purposifiedVerb
		+ if (it.declaredParameters.size == 0)
			'FromParent:(UIViewController *)parentViewController'
		  else {
		  	parameterClause
		  	+ ' fromParent:(UIViewController *)parentViewController'
		  }
		+ ' onDone:(void (^)(' + screen.resourceType.typeName + ' *item))doneBlock'
	}
	
	def private compileControllerMethodHeader(ControllerVerb it) '''
		«controllerMethodName»;
	'''
	
	def private compileControllerMethod(ControllerVerb it) '''
		«controllerMethodName»
		{
			«compileControllerMethodBody»
		}
		
	'''
	
	def private compileControllerMethodBody(ControllerVerb it) {
		switch(it.kind) {
			case ControllerVerbKind.ADD: compileControllerMethodBody_ADD
			case ControllerVerbKind.EDIT: compileControllerMethodBody_EDIT
			case ControllerVerbKind.DISPLAY: compileControllerMethodBody_DISPLAY
		}	
	}
	
	def private considerableParameters(ControllerVerb it) {
		if (kind == ControllerVerbKind.ADD) {
			declaredParameters.filter[param | param.type != it.screen.datasource.datasource.resourceType]
		}
		else {
			declaredParameters
		}
	}
	
	def compile(Parameter it) '''
		«IF type.scalar»
			@property (nonatomic) «typeName» «name»;
		«ELSE»
			@property (nonatomic, strong) «typeName» *«name»;
		«ENDIF»
	'''
	
	def considerableParameters(Screen it) {
		verbs.map[considerableParameters].flatten
	}
	
	def private compileControllerMethodBody_ADD(ControllerVerb it) '''
		«screen.controllerClassName» *detailsViewController = [[«screen.controllerClassName» alloc] initWithMode:DetailsViewModeAdd];
		
		«FOR parameter: considerableParameters»
			detailsViewController.«parameter.name» = «parameter.name»;
		«ENDFOR»
		detailsViewController.item = [[«screen.resourceType.typeName» alloc] init];
		detailsViewController.doneBlock = ^(«screen.resourceType.typeName» *editedItem)
		{
			[parentViewController dismissViewControllerAnimated:YES completion:nil];
			if (doneBlock) {
				doneBlock(editedItem);
			}
		};
		UINavigationController *navigationController = [[UINavigationController alloc] initWithRootViewController:detailsViewController];
		[parentViewController presentViewController:navigationController animated:YES completion:nil];
	'''
	
	def private compileControllerMethodBody_EDIT(ControllerVerb it) '''
		«screen.controllerClassName» *detailsViewController = [[«screen.controllerClassName» alloc] initWithMode:DetailsViewModeEdit];
		detailsViewController.item = item;
		detailsViewController.doneBlock = ^(«screen.resourceType.typeName» *editedItem)
		{
			[parentViewController.navigationController popViewControllerAnimated:YES];
			if (doneBlock) {
				doneBlock(editedItem);
			}
		};
		[parentViewController.navigationController pushViewController:detailsViewController animated:YES];
	'''
	
	def private compileControllerMethodBody_DISPLAY(ControllerVerb it) '''
		«screen.controllerClassName» *detailsViewController = [[«screen.controllerClassName» alloc] initWithMode:DetailsViewModeDisplay];
		detailsViewController.item = item;
		detailsViewController.doneBlock = ^(«screen.resourceType.typeName» *editedItem)
		{
			[parentViewController.navigationController popViewControllerAnimated:YES];
			if (doneBlock) {
				doneBlock(editedItem);
			}
		};
		[parentViewController.navigationController pushViewController:detailsViewController animated:YES];
	'''
	
}

// TODO We really should introduce a full blown import manager
class DefaultDetailsScreenImportHelper {
	
	@Inject extension EntityClassExtensions
	@Inject extension DataAccessClassExtensions	
	@Inject extension DefaultDetailsScreenClassExtensions	
	
	def compileHeaderImports(Screen it) '''
		#import <Foundation/Foundation.h>
		#import "QuickDialogController.h"
		#import "«resourceType.entityModelHeaderFileName»"

		«val importedFileNames = importedHeaderFileForControllerMethods»
		«val uniqueFileNames = importedFileNames.unique»
		«FOR fileName: uniqueFileNames»
			#import "«fileName»"
		«ENDFOR»
	'''
	
	def compileModuleImports(Screen it) '''
		#import "«screenHeaderFileName»"
		#import "QRootElement.h"
		#import "QEntryElement.h"
		#import "QBooleanElement.h"
		#import "QDateTimeInlineElement.h"
		#import "QButtonElement.h"
		#import "«resourceType.entityDataAccessCategoryHeaderFileName»"

		«val importedFileNames = importedHeaderFileForControllerMethods»
		«val uniqueFileNames = importedFileNames.unique»
		«FOR fileName: uniqueFileNames»
			#import "«fileName»"
		«ENDFOR»
	'''
	
	def unique(Iterable<String> strings) {
		val unique = newHashSet()
		unique.addAll(strings)
		unique
	}
	
	def importedHeaderFileForControllerMethods(Screen it) {
		verbs.map[declaredParameters].flatten.map[type].filter(Entity).map[entityModelHeaderFileName]
	}
}
