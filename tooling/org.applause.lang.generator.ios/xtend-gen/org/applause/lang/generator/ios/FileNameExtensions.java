package org.applause.lang.generator.ios;

@SuppressWarnings("all")
public class FileNameExtensions {
  public String headerFileName(final String className) {
    return (className + ".h");
  }
  
  public String moduleFileName(final String className) {
    return (className + ".m");
  }
}
