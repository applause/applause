package org.applause.specification.data

import com.google.inject.Inject
import org.applause.lang.applauseDsl.DataSource
import org.applause.lang.applauseDsl.Model
import org.applause.lang.generator.ios.dataaccess.RESTURLExtensions
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "REST URLs" {
	
	@Inject extension ParseHelper<Model>
	@Inject extension RESTURLExtensions
	
	describe "Absolute REST URLs" {
		
		def void baseUrlShouldBe(CharSequence sequence, String url) {
			val model = sequence.parse
			val datasource = model.elements.filter(typeof(DataSource)).head
			val baseUrl = datasource.baseUrl
			
			assertThat(baseUrl.value, is(url))
		}
		
		/**
		 * Absolute REST URLs start with `http://`, continue with a hostname, and end with a resource path
		 * @filter('''|.baseUrlShouldBe.*)
		 */
		fact "Simple absolute REST URLS" {
			'''
				entity Person {}
				datasource PersonDataSource {
					baseUrl: http://localhost/persons
					resource: Person
				}
			'''.baseUrlShouldBe("http://localhost/persons")			
		}
		
		/**
		 * An absolute REST URL can contain a port.
		 * @filter('''|.baseUrlShouldBe.*)
		 */
		fact "Simple absolute REST URLS with port" {
			'''
				entity Person {}
				datasource PersonDataSource {
					baseUrl: http://localhost:2403/persons
					resource: Person
				}
			'''.baseUrlShouldBe("http://localhost:2403/persons")			
		}
		
		/**
		 * An absolute REST URL can have a full domain name, a port and a deep path.
		 * @filter('''|.baseUrlShouldBe.*)
		 */
		fact "Absolute REST URL with full domain name, port and deep path" {
			'''
				entity Person {}
				datasource PersonDataSource {
					baseUrl: http://www.foobar.com:2403/foo/bar/baz
					resource: Person
				}
			'''.baseUrlShouldBe("http://www.foobar.com:2403/foo/bar/baz")			
		}
		
	}
	
	describe "Relative REST URLs" {
		
		def void dataSourceAccessMethodUrlShouldBe(CharSequence sequence, String url) {
			val model = sequence.parse
			val datasource = model.elements.filter(typeof(DataSource)).head
			val method = datasource.methods.head
			
			assertThat(method.restSpecification.path.value, is(url))
		}
		
		/**
		 * Relative REST URLs start with `/`, and continue with a resource path
		 * @filter('''|.dataSourceAccessMethodUrlShouldBe.*)
		 */
		fact "Simple relative REST URL" {
			'''
				entity Person {}
				datasource PersonDataSource {
					baseUrl: http://localhost/persons
					resource: Person
					post(Person person) GET /persons
				}
			'''.dataSourceAccessMethodUrlShouldBe("/persons")			
		}
		
		/**
		 * Relative REST URLs start with `/`, and continue with a resource path
		 * @filter('''|.dataSourceAccessMethodUrlShouldBe.*)
		 */
		fact "More complex relative REST URL" {
			'''
				entity Person {}
				datasource PersonDataSource {
					baseUrl: http://localhost/persons
					resource: Person
					post(Person person) GET /boo/bar/baz/persons
				}
			'''.dataSourceAccessMethodUrlShouldBe("/boo/bar/baz/persons")			
		}
		
		
	}

}