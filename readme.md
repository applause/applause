# Overview

Applause is a domain-specific language and a set of code-generators to produce mobile applications for iPhone, Android, Windows Phone and a mobile website on top of Google App Engine. It comes with IDE supports such as error checking, content assist and integrates into Eclipse.

Applause is not a web framework, a cross-compiler nor is it an interpreter. Instead, it uses a simple input language explicitily designed for data-driven mobile applications to produce human-readable source code in Objective-C, Java, C# or Python.

Have a look at this [3-minutescreencast](http://vimeo.com/15018235) to see it in action.

### Please Note

Even though you can build simple mobile applications with this open-source version of Applause, the code you are looking at is far from being a real product ;)

## directory layout

* tools
 * org.applause.lang (language definition)
 * org.applause.lang.ui (Eclipse editor and tooling)
 * org.applause.lang.generator.* (generators for iPhone, Android, GAE, WP7)
* examples (sample model and applications for the various platforms)
* assets