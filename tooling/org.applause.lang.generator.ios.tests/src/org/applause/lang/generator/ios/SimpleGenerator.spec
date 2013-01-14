package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Model
import org.applause.lang.base.ApplauseDslSpecCreator
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

@CreateWith(typeof(ApplauseDslSpecCreator))
describe "Simple Generator" {
	
	@Inject extension ParseHelper<Model> parseHelper
	
	@Inject IGenerator generator
	
	fact "Simple generator" {
		val model = '''
			application GithubBrowser
			screenflow {
				startscreen GithubBrowser.View.SomeOtherList
			}
			datatype String		
			platform iOS {
				typemapping String -> NSString
				typemapping Integer -> NSNumber
				typemapping Date -> NSDate
				typemapping Bool -> BOOL primitive
			}
			entity CommitUser {
				String date
				String name
				String email
			}
		'''.parse
		
		val fsa = new InMemoryFileSystemAccess()
		generator.doGenerate(model.eResource, fsa)
		
		println(fsa.files)
	}

}