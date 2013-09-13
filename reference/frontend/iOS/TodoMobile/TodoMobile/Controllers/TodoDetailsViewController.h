//
// Created by Peter Friese on 07.09.13.
//
// Copyright (c) 2013 by Peter Friese. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "QuickDialogController.h"
#import "Todo.h"

@interface TodoDetailsViewController : QuickDialogController
@property (nonatomic, strong) Todo *todo;

+ (void)presentForAddingNewTodoFromParent:(UIViewController *)parent onDone:(void (^)(Todo *todo))doneBlock;
+ (void)presentForEditingTodo:(Todo *)todo fromParent:(UIViewController *)parent onDone:(void (^)(Todo *editedTodo))doneBlock;
@end