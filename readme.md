# Introduction

Applause is a mobile development toolkit for building truely native applications for iOS, Android and Windows Phone. 

Unlike other cross-platform mobile development toolkits, it does not use an HTML/Javascript based approach to allow apps to run on the different platforms. Instead, Applause build upon a custom language for defining mobile apps in a concise and effincient way. Code written in this language is then translated into code for the respective target platforms, resulting in truely native applications that deliver a really native experience for users.

# Architecture

![Applause architecture](https://raw.github.com/applause/applause/applause2/documentation/Applause%20Overview.png "Applause architecture")


# Roadmap

Applause 2 is the upcoming version of Applause, currently under active development. Here is the roadmap for Applause 2:

## M1
* Build native apps for a simple data-drive application
* Derive suitable meta model and DSL
	* The DSL should support the following concepts
		* App
		* Screens / Views
		* Various types of screens, perferrably provided by pluggable DSL / generator plug-ins
		* Data entities
		* Data sources
* Develop code generator capable of generating the sample apps.
