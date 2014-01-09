package org.applause.lang.generator.ios.ui;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.generator.ios.model.EntityClassExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenClassExtensions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DefaultDetailsScreenHeaderFileCompiler {
  @Inject
  @Extension
  private DefaultDetailsScreenClassExtensions _defaultDetailsScreenClassExtensions;
  
  @Inject
  @Extension
  private EntityClassExtensions _entityClassExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  public CharSequence compileHeader(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    _builder.append("#import \"QuickDialogController.h\"");
    _builder.newLine();
    _builder.append("#import \"");
    Entity _resourceType = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _entityModelHeaderFileName = this._entityClassExtensions.entityModelHeaderFileName(_resourceType);
    _builder.append(_entityModelHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@interface ");
    String _controllerClassName = this._defaultDetailsScreenClassExtensions.controllerClassName(it);
    _builder.append(_controllerClassName, "");
    _builder.append(" : QuickDialogController");
    _builder.newLineIfNotEmpty();
    _builder.append("@property (nonatomic, strong) ");
    Entity _resourceType_1 = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName, "");
    _builder.append(" *item;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("+ (void)presentForAddingNewItemFromParent:(UIViewController *)parent onDone:(void (^)(");
    Entity _resourceType_2 = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _typeName_1 = this._typeExtensions.typeName(_resourceType_2);
    _builder.append(_typeName_1, "");
    _builder.append(" *item))doneBlock;");
    _builder.newLineIfNotEmpty();
    _builder.append("+ (void)presentForEditingItem:(");
    Entity _resourceType_3 = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _typeName_2 = this._typeExtensions.typeName(_resourceType_3);
    _builder.append(_typeName_2, "");
    _builder.append(" *)item fromParent:(UIViewController *)parent onDone:(void (^)(");
    Entity _resourceType_4 = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _typeName_3 = this._typeExtensions.typeName(_resourceType_4);
    _builder.append(_typeName_3, "");
    _builder.append(" *editedItem))doneBlock;");
    _builder.newLineIfNotEmpty();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
