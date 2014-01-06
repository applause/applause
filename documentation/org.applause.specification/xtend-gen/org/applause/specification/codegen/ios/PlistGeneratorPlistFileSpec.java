package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.PlistGeneratorSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Any model will result in the following implementation code for `main.m`:
 */
@Named("Plist file")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class PlistGeneratorPlistFileSpec extends PlistGeneratorSpec {
  /**
   * @filter('''|.isGenerated.*)
   */
  @Test
  @Named("Plist file")
  @Order(1)
  public void _plistFile() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">");
    _builder.newLine();
    _builder.append("<plist version=\"1.0\">");
    _builder.newLine();
    _builder.append("<dict>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleDevelopmentRegion</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>en</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleDisplayName</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>${PRODUCT_NAME}</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleExecutable</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>${EXECUTABLE_NAME}</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleIdentifier</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>org.applause.${PRODUCT_NAME:rfc1034identifier}</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleInfoDictionaryVersion</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>6.0</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleName</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>${PRODUCT_NAME}</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundlePackageType</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>APPL</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleShortVersionString</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>1.0</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleSignature</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>????</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleVersion</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>1.0</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>LSRequiresIPhoneOS</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<true/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>UIRequiredDeviceCapabilities</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<array>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>armv7</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</array>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>UISupportedInterfaceOrientations</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<array>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>UIInterfaceOrientationPortrait</string>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>UIInterfaceOrientationLandscapeLeft</string>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>UIInterfaceOrientationLandscapeRight</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</array>");
    _builder.newLine();
    _builder.append("</dict>");
    _builder.newLine();
    _builder.append("</plist>");
    _builder.newLine();
    this.isGeneratedModuleFile(_builder);
  }
}
