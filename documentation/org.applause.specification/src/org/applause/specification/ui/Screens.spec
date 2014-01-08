package org.applause.specification.ui

import com.google.inject.Inject
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.jnario.runner.CreateWith

/**
 * Screens represent a full screen UI in Applause. 
 */
@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "Screens"{
	
	@Inject extension ScreensValidationTestHelper

	describe "Defining Screens" {

		/**
		 * Screens can be defined using the `screen` keyword. A screen can either be a list screen or a details screen,
		 * which is indicated by either specifying `DefaultList` or `DefaultDetails`. Each screen is identified by its name,
		 * which needs to be unique.
		 * @filter('''|.valid.*)
		 */
		fact "Simple screens" {
			'''
				screen DefaultList PersonList {
				}
				screen DefaultDetails PersonDetails {
				}
			'''.validScreen
		}
		
		/**
		 * Screens must be unique. Currently, this means they must be unique across the board and __cannot__
		 * be namespaced.
		 * @filter('''|.hasDuplicateScreen)
		 */
		fact "Screens must be unique" {
			'''
				screen DefaultList PersonList {
				}
				screen DefaultList PersonList {
				}
			'''.hasDuplicateScreen
		}
		
		/**
		 * Screens can have an optional title, which will be displayed in the title area of a screen.
		 * @filter('''|.hasTitle.*)
		 */
		fact "Screens can have an optional title" {
			'''
				screen DefaultList PersonList {
					title = "Persons"
				}
			'''.hasTitle("Person")			
		}
		
		/**
		 * Screens can be linked to a data source, which can then be used to fetch data to be displayed on the screen.
		 * @filter('''|hasDataSource.*)
		 */
		fact "Screens can have an optional data source" {
			'''
				entity Person {}
				datasource PersonDataSource {
					baseUrl: http://localhost/persons
					resource: Person
				}
				screen DefaultList PersonList {
					title = "Persons"
					datasource = PersonDataSource
				}
			'''.hasDataSource			
		}
	}

}