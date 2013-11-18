package org.applause.lang.generator.ios.dataaccess;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.FileNameExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DataAccessClassExtensions {
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private FileNameExtensions _fileNameExtensions;
  
  private final String categoryName = "DataAccess";
  
  public String entityDataAccessCategoryHeaderFileName(final Entity it) {
    String _typeName = this._typeExtensions.typeName(it);
    String _plus = (_typeName + "+");
    String _plus_1 = (_plus + this.categoryName);
    String _headerFileName = this._fileNameExtensions.headerFileName(_plus_1);
    return _headerFileName;
  }
  
  public String entityDataAccessCategoryModuleFileName(final Entity it) {
    String _typeName = this._typeExtensions.typeName(it);
    String _plus = (_typeName + "+");
    String _plus_1 = (_plus + this.categoryName);
    String _moduleFileName = this._fileNameExtensions.moduleFileName(_plus_1);
    return _moduleFileName;
  }
}
