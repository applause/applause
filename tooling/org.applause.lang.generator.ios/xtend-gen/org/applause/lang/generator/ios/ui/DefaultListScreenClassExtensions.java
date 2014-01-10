package org.applause.lang.generator.ios.ui;

import com.google.common.collect.Iterables;
import java.util.List;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.RESTMethodCall;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenListItemCell;
import org.applause.lang.applauseDsl.ScreenSection;
import org.applause.lang.applauseDsl.ScreenSectionItems;
import org.applause.lang.applauseDsl.UIAction;
import org.applause.lang.applauseDsl.UIActionNavigateAction;
import org.applause.lang.applauseDsl.UIActionSpecification;
import org.applause.lang.applauseDsl.UIComponentMemberConfiguration;
import org.applause.lang.generator.ios.ui.ScreenClassExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DefaultListScreenClassExtensions extends ScreenClassExtensions {
  public Entity resourceType(final Screen it) {
    DataSourceCall _datasource = it.getDatasource();
    DataSource _datasource_1 = _datasource.getDatasource();
    Entity _resourceType = _datasource_1.getResourceType();
    return _resourceType;
  }
  
  public Iterable<UIComponentMemberConfiguration> configurations(final Screen it) {
    EList<ScreenSection> _sections = it.getSections();
    final Function1<ScreenSection,ScreenSectionItems> _function = new Function1<ScreenSection,ScreenSectionItems>() {
      public ScreenSectionItems apply(final ScreenSection it) {
        ScreenSectionItems _items = it.getItems();
        return _items;
      }
    };
    List<ScreenSectionItems> _map = ListExtensions.<ScreenSection, ScreenSectionItems>map(_sections, _function);
    final Function1<ScreenSectionItems,EList<ScreenListItemCell>> _function_1 = new Function1<ScreenSectionItems,EList<ScreenListItemCell>>() {
      public EList<ScreenListItemCell> apply(final ScreenSectionItems it) {
        EList<ScreenListItemCell> _items = it.getItems();
        return _items;
      }
    };
    List<EList<ScreenListItemCell>> _map_1 = ListExtensions.<ScreenSectionItems, EList<ScreenListItemCell>>map(_map, _function_1);
    Iterable<ScreenListItemCell> _flatten = Iterables.<ScreenListItemCell>concat(_map_1);
    final Function1<ScreenListItemCell,EList<UIComponentMemberConfiguration>> _function_2 = new Function1<ScreenListItemCell,EList<UIComponentMemberConfiguration>>() {
      public EList<UIComponentMemberConfiguration> apply(final ScreenListItemCell it) {
        EList<UIComponentMemberConfiguration> _configurations = it.getConfigurations();
        return _configurations;
      }
    };
    Iterable<EList<UIComponentMemberConfiguration>> _map_2 = IterableExtensions.<ScreenListItemCell, EList<UIComponentMemberConfiguration>>map(_flatten, _function_2);
    Iterable<UIComponentMemberConfiguration> _flatten_1 = Iterables.<UIComponentMemberConfiguration>concat(_map_2);
    return _flatten_1;
  }
  
  public ScreenListItemCell defaultCell(final Screen it) {
    EList<ScreenSection> _sections = it.getSections();
    final Function1<ScreenSection,ScreenSectionItems> _function = new Function1<ScreenSection,ScreenSectionItems>() {
      public ScreenSectionItems apply(final ScreenSection it) {
        ScreenSectionItems _items = it.getItems();
        return _items;
      }
    };
    List<ScreenSectionItems> _map = ListExtensions.<ScreenSection, ScreenSectionItems>map(_sections, _function);
    final Function1<ScreenSectionItems,EList<ScreenListItemCell>> _function_1 = new Function1<ScreenSectionItems,EList<ScreenListItemCell>>() {
      public EList<ScreenListItemCell> apply(final ScreenSectionItems it) {
        EList<ScreenListItemCell> _items = it.getItems();
        return _items;
      }
    };
    List<EList<ScreenListItemCell>> _map_1 = ListExtensions.<ScreenSectionItems, EList<ScreenListItemCell>>map(_map, _function_1);
    Iterable<ScreenListItemCell> _flatten = Iterables.<ScreenListItemCell>concat(_map_1);
    ScreenListItemCell _head = IterableExtensions.<ScreenListItemCell>head(_flatten);
    return _head;
  }
  
  public DataSourceAccessMethod restMethod(final Screen it) {
    ScreenListItemCell _defaultCell = this.defaultCell(it);
    RESTMethodCall _restMethod = _defaultCell.getRestMethod();
    DataSourceAccessMethod _restMethod_1 = _restMethod.getRestMethod();
    return _restMethod_1;
  }
  
  public Screen targetNavigationScreen(final Screen it) {
    ScreenListItemCell _defaultCell = this.defaultCell(it);
    EList<UIAction> _actions = _defaultCell.getActions();
    final Function1<UIAction,UIActionSpecification> _function = new Function1<UIAction,UIActionSpecification>() {
      public UIActionSpecification apply(final UIAction it) {
        UIActionSpecification _action = it.getAction();
        return _action;
      }
    };
    List<UIActionSpecification> _map = ListExtensions.<UIAction, UIActionSpecification>map(_actions, _function);
    Iterable<UIActionNavigateAction> _filter = Iterables.<UIActionNavigateAction>filter(_map, UIActionNavigateAction.class);
    UIActionNavigateAction _head = IterableExtensions.<UIActionNavigateAction>head(_filter);
    Screen _targetScreen = _head.getTargetScreen();
    return _targetScreen;
  }
  
  public Screen screen(final UIAction it) {
    Screen _containerOfType = EcoreUtil2.<Screen>getContainerOfType(it, Screen.class);
    return _containerOfType;
  }
}
