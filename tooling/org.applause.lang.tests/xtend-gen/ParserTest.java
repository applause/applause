import com.google.inject.Inject;
import org.applause.lang.ApplauseDslInjectorProvider;
import org.applause.lang.applauseDsl.DataType;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.NamedElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ApplauseDslInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<Model> parser;
  
  @Test
  public void parseDomainModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("datatype String");
      _builder.newLine();
      _builder.append("datatype Integer");
      _builder.newLine();
      final Model model = this.parser.parse(_builder);
      EList<NamedElement> _elements = model.getElements();
      NamedElement _head = IterableExtensions.<NamedElement>head(_elements);
      final DataType dtString = ((DataType) _head);
      String _name = dtString.getName();
      Assert.assertEquals("String", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
