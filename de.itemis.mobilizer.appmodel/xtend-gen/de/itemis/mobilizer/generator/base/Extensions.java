package de.itemis.mobilizer.generator.base;

import de.itemis.mobilizer.appModelDsl.Application;
import de.itemis.mobilizer.appModelDsl.ContentProvider;
import de.itemis.mobilizer.appModelDsl.Model;
import de.itemis.mobilizer.appModelDsl.ModelElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Extensions {
  
  public Model model(final Application app) {
    final Application typeConverted_app = (Application)app;
    EObject _eContainer = typeConverted_app.eContainer();
    return ((de.itemis.mobilizer.appModelDsl.Model) _eContainer);
  }
  
  public EList<ModelElement> modelElements(final Application app) {
    Model _model = this.model(app);
    EList<ModelElement> _elements = _model.getElements();
    return _elements;
  }
  
  public Iterable<ContentProvider> providersWithImplementation(final Application app) {
    EList<ModelElement> _modelElements = this.modelElements(app);
    Iterable<ContentProvider> _filter = IterableExtensions.<ContentProvider>filter(_modelElements, de.itemis.mobilizer.appModelDsl.ContentProvider.class);
    return _filter;
  }
}