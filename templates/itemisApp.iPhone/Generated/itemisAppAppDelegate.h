
#import <UIKit/UIKit.h>

@interface itemisAppAppDelegate : NSObject <UIApplicationDelegate> {
    UIWindow *window;
	UIViewController *rootController;
}

@property (nonatomic, retain) IBOutlet UIWindow *window;
@property (nonatomic, retain) UIViewController *rootController;

@end
