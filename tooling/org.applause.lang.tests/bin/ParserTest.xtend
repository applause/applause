import org.eclipse.xtext.junit4.InjectWith
import org.applause.lang.ApplauseDslInjectorProvider
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import com.google.inject.Inject
import org.applause.lang.applauseDsl.Model
import org.applause.lang.applauseDsl.DataType
import static org.junit.Assert.*
import org.junit.Test

@InjectWith(ApplauseDslInjectorProvider)
@RunWith(XtextRunner)
class ParserTest {
	
	@Inject ParseHelper<Model> parser;
	
	@Test
	def void parseDomainModel() {
		val model = parser.parse(
			'''
				datatype String
				datatype Integer
			'''
		)
		val dtString = model.elements.head as DataType
		assertEquals("String", dtString.name)
	}
	 
}