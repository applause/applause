package org.applause.lang.generator.ios.ui;

import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.generator.ios.ui.ScreenClassExtensions;

@SuppressWarnings("all")
public class DefaultDetailsScreenClassExtensions extends ScreenClassExtensions {
  public Entity resourceType(final Screen it) {
    DataSourceCall _datasource = it.getDatasource();
    DataSource _datasource_1 = _datasource.getDatasource();
    Entity _resourceType = _datasource_1.getResourceType();
    return _resourceType;
  }
}
