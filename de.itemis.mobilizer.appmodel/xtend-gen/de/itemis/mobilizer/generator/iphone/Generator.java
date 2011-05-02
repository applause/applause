package de.itemis.mobilizer.generator.iphone;

import com.google.inject.Inject;
import de.itemis.mobilizer.appModelDsl.Application;
import de.itemis.mobilizer.generator.iphone.ApplicationDelegate;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class Generator {
  @Inject private ApplicationDelegate applicationDelegate;
  
  public void generate(final Application app, final IFileSystemAccess fsa) {
    this.applicationDelegate.main(app, fsa);
  }
}