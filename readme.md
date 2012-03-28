# Applause #

Applause is a domain-specific language and a set of code-generators to produce mobile applications for iPhone, Android, Windows Phone and a mobile website on top of Google App Engine. It tightly integrates with Eclipse and comes with IDE support such as error checking, content assist.

Applause is not a web framework, a cross-compiler nor is it an interpreter. Instead, it uses a simple input language explicitly designed for data-driven mobile applications to produce human-readable source code in Objective-C, Java, C# or Python.

Have a look at this [screencast](http://vimeo.com/15018235) or [try out a generated live-demo (minimal website)](http://applause-dsl.appspot.com) to see it in action.

## A word of caution ##

Even though you can build simple mobile applications with this open-source version of Applause, the code you are looking at is far from being a real product ;)

## Directory Layout ##

* tooling
 * org.applause.lang (language definition)
 * org.applause.lang.ui (Eclipse editor and tooling)
 * org.applause.lang.generator.* (generators for iPhone, Android, GAE, WP7)
* examples (sample model and applications for the various platforms)
* assets

## Installation ##

1. Get Eclipse + Xtext 1.0.2:
 * [Windows](http://download.itemis.com/distros/eclipse-SDK-3.6.2-xtext-1.0.2-win32.zip)
 * [Windows 64bit](http://download.itemis.com/distros/eclipse-SDK-3.6.2-xtext-1.0.2-win32-x86_64.zip)
 * [Mac OSX](http://download.itemis.com/distros/eclipse-SDK-3.6.2-xtext-1.0.2-macosx-cocoa.tar.gz)
 * [Mac OSX 64bit](http://download.itemis.com/distros/eclipse-SDK-3.6.2-xtext-1.0.2-macosx-cocoa-x86_64.tar.gz)
 * [Linux Gtk](http://download.itemis.com/distros/eclipse-SDK-3.6.2-xtext-1.0.2-linux-gtk.tar.gz)
 * [Linux Gtk 64bit](http://download.itemis.com/distros/eclipse-SDK-3.6.2-xtext-1.0.2-linux-gtk-x86_64.tar.gz)
2. Clone APPlause
3. Start Eclipse
4. Import all projects in the *tooling* subdirectory into your workspace
5. Right-click on *org.applause.lang* and choose *Run As... -> Eclipse Application*
6. In the run-time workspace, create a new project by selection *File -> New -> Project... -> APPlause -> APPlause Project*
7. Follow the tutorial, as soon as it is done (see issue #11)

## License ##

As long as not otherwise noted (e.g. third-party libraries), all files of the Applause project are licensed under the [EPL](http://www.eclipse.org/legal/epl-v10.html).

## Code of Conduct / Development Guidelines ##

The Applause project follows the development practices of the [Eclipse Development Process](http://www.eclipse.org/projects/dev_process/development_process_2010.php).

## Contributors ##

The following people are the major contributors to Applause:

* Heiko Behrens ([HBehrens](http://github.com/HBehrens))
* Peter Friese ([peterfriese](http://github.com/peterfriese))

We welcome contributions. If you want to contribute, please:

1. Have a look at our [issue tracker](https://github.com/applause/applause/issues) for open, **unassigned** issues and pick one.
2. Clone a local working copy Applause and do your thing.
3. Send us a pull request.

Thanks!

