package org.applause.lang.generator.ios;

@SuppressWarnings("all")
public class FileNameExtensions {
  public String headerFileName(final String className) {
    String _plus = (className + ".h");
    return _plus;
  }
  
  public String moduleFileName(final String className) {
    String _plus = (className + ".m");
    return _plus;
  }
}
