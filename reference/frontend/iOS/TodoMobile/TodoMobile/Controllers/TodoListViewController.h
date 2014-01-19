//
//  TodoListViewController.h
//  TodoMobile
//
//  Created by Peter Friese on 06.09.13.
//  Copyright (c) 2013 Peter Friese. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "ListListViewController.h"
#import "List.h"

@interface TodoListViewController : UITableViewController
+ (void)presentForDisplayingTodosOf:(List *)list fromParent:(ListListViewController *)parent onDone:(void (^)(List *))done;
@end
