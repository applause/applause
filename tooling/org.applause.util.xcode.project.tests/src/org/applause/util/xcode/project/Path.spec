package org.applause.util.xcode.project

import org.jnario.runner.CreateWith

import static extension org.jnario.lib.Should.*

/**
 * Pbxproj files use `Path`s to describe absolute and relative paths inside Xcode projects.
 */
@CreateWith(typeof(PbxprojSpecCreator))
describe Path {
	
	/**
	 * There are various ways to create paths.
	 */
	context "Creating paths" {
		/**
		 * A path can be created using a regular constructor.
		 */
		fact "Regular constructor" {
			new Path("foo/bar")
		}
		/**
		 * A path can also be created using a static factory method.
		 */
		fact "Factory method" {
			Path::toPath("foo/bar")
		}
	}
	
	context "Querying paths" {
		/**
		 * The `toString()` method returns the string representation of a path
		 */
		fact "String representation" {
			new Path("foo/bar").toString should be "foo/bar"
		}
		
		/**
		 * Retrieving the last segment of a path is interesting, as this often is the file name.
		 */
		fact "Getting the last segment"	{
			val path = new Path("foo/bar.h")
			path.lastSegment should be "bar.h"
		}
		
		fact "Retrieving the beginning of the path" {
			val path = new Path("foo/bar/baz.h")
			path.leadingSegments.size should be 2
		}
		
	}
	
	context "Sizing" {
		/**
		 * Basically, a path can have any number of segments. However, in real life paths 
		 * will have no more than just a few segments. Who wants to dig into a deeply nested
		 * folder structure anyway?
		 */
		fact "The number of segments is not limited" {
			val path = new Path("foo/bar/baz/boom.m")
			path.lastSegment should be "boom.m"
		}
		
		/**
		 * If a path has no segment, retrieving the `lastSegment` returns an empty string.
		 */
		fact "Path without a segment" {
			val path = new Path()
			path.lastSegment should be ""
		}
		
		/**
		 * If a path has no segment, retrieving the `leadingSegemnts` yields an empty array.
		 */
		fact "Path without a segment has an empty beginning" {
			val path = new Path()
			path.leadingSegments.size should be 0
		}
	}

}