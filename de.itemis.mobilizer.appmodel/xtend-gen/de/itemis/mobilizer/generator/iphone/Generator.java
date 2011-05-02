package de.itemis.mobilizer.generator.iphone;

import de.itemis.mobilizer.appModelDsl.Application;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class Generator {
  
  public void generate(final Application app, final IFileSystemAccess fsa) {
    String _name = app.getName();
    fsa.generateFile("iphone_test.txt", _name);
  }
}