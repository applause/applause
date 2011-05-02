package de.itemis.mobilizer.generator.iphone;

import de.itemis.mobilizer.appModelDsl.Application;
import de.itemis.mobilizer.appModelDsl.CollectionExpression;
import de.itemis.mobilizer.appModelDsl.ComplexProviderConstruction;
import de.itemis.mobilizer.appModelDsl.Constant;
import de.itemis.mobilizer.appModelDsl.ContentProvider;
import de.itemis.mobilizer.appModelDsl.Expression;
import de.itemis.mobilizer.appModelDsl.ObjectReference;
import de.itemis.mobilizer.appModelDsl.ProviderConstruction;
import de.itemis.mobilizer.appModelDsl.ScalarExpression;
import de.itemis.mobilizer.appModelDsl.SimpleProviderConstruction;
import de.itemis.mobilizer.appModelDsl.StringConcat;
import de.itemis.mobilizer.appModelDsl.StringLiteral;
import de.itemis.mobilizer.appModelDsl.StringReplace;
import de.itemis.mobilizer.appModelDsl.StringSplit;
import de.itemis.mobilizer.appModelDsl.StringUrlConform;
import de.itemis.mobilizer.appModelDsl.VariableDeclaration;
import de.itemis.mobilizer.appModelDsl.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Extensions {
  
  public String classRootFilename() {
    return "Generated/";
  }
  
  public String applicationDelegateClassname(final Application app) {
    String _name = app.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "AppDelegate");
    return _operator_plus;
  }
  
  public String filenameApplicationDelegateHeader(final Application app) {
    String _applicationDelegateClassname = this.applicationDelegateClassname(app);
    String _operator_plus = StringExtensions.operator_plus(_applicationDelegateClassname, ".h");
    return _operator_plus;
  }
  
  public String filenameApplicationDelegateModule(final Application app) {
    String _applicationDelegateClassname = this.applicationDelegateClassname(app);
    String _operator_plus = StringExtensions.operator_plus(_applicationDelegateClassname, ".m");
    return _operator_plus;
  }
  
  public String centralProvidersClassName(final Application app) {
    String _name = app.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "Providers");
    return _operator_plus;
  }
  
  public String filenameCentralProvidersHeader(final Application app) {
    String _centralProvidersClassName = this.centralProvidersClassName(app);
    String _operator_plus = StringExtensions.operator_plus(_centralProvidersClassName, ".h");
    return _operator_plus;
  }
  
  public String filenameCentralProvidersModule(final Application app) {
    String _centralProvidersClassName = this.centralProvidersClassName(app);
    String _operator_plus = StringExtensions.operator_plus(_centralProvidersClassName, ".m");
    return _operator_plus;
  }
  
  public String className(final View view) {
    final View typeConverted_view = (View)view;
    String _name = typeConverted_view.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _operator_plus = StringExtensions.operator_plus(_firstUpper, "ViewController");
    return _operator_plus;
  }
  
  public String filenameHeader(final View view) {
    String _className = this.className(view);
    String _operator_plus = StringExtensions.operator_plus(_className, ".h");
    return _operator_plus;
  }
  
  public String filenameModule(final View view) {
    String _className = this.className(view);
    String _operator_plus = StringExtensions.operator_plus(_className, ".m");
    return _operator_plus;
  }
  
  public String _contentProvider(final ProviderConstruction construction, final String providers, final String kvcTarget, final String kvcPrefix) {
    final ProviderConstruction typeConverted_construction = (ProviderConstruction)construction;
    EClass _eClass = typeConverted_construction.eClass();
    String _operator_plus = StringExtensions.operator_plus("<!ERROR!", _eClass);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ">");
    return _operator_plus_1;
  }
  
  public String _contentProvider(final SimpleProviderConstruction c, final String providers, final String kvcTarget, final String kvcPrefix) {
    Expression _expression = c.getExpression();
    String _expression_1 = this.expression(_expression, kvcTarget, kvcPrefix);
    String _operator_plus = StringExtensions.operator_plus("[IPSimpleContentProvider providerWithContent:", _expression_1);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " andProviders:self.contentProvider.providers]");
    return _operator_plus_1;
  }
  
  public String _contentProvider(final ComplexProviderConstruction c, final String providers, final String kvcTarget, final String kvcPrefix) {
    final String typeConverted_providers = (String)providers;
    String _operator_plus = StringExtensions.operator_plus("[", typeConverted_providers);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " providerFor");
    ContentProvider _provider = c.getProvider();
    String _name = _provider.getName();
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _name);
    String _xifexpression = null;
    Expression _argument = c.getArgument();
    boolean _operator_equals = ObjectExtensions.operator_equals(_argument, null);
    if (_operator_equals) {
      _xifexpression = "";
    } else {
      Expression _argument_1 = c.getArgument();
      String _expression = this.expression(_argument_1, kvcTarget, kvcPrefix);
      String _operator_plus_3 = StringExtensions.operator_plus(": ", _expression);
      _xifexpression = _operator_plus_3;
    }
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_2, _xifexpression);
    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, "]");
    return _operator_plus_5;
  }
  
  public String _expression(final Expression e, final String kvcTarget, final String kvcPrefix) {
    final Expression typeConverted_e = (Expression)e;
    EClass _eClass = typeConverted_e.eClass();
    String _operator_plus = StringExtensions.operator_plus("<!ERROR!", _eClass);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ">");
    return _operator_plus_1;
  }
  
  public String _expression(final CollectionExpression e, final String kvcTarget, final String kvcPrefix) {
    final CollectionExpression typeConverted_e = (CollectionExpression)e;
    EClass _eClass = typeConverted_e.eClass();
    String _operator_plus = StringExtensions.operator_plus("<!ERROR!", _eClass);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ">");
    return _operator_plus_1;
  }
  
  public String _expression(final ScalarExpression s, final String kvcTarget, final String kvcPrefix) {
    final ScalarExpression typeConverted_s = (ScalarExpression)s;
    EClass _eClass = typeConverted_s.eClass();
    String _operator_plus = StringExtensions.operator_plus("<!ERROR!", _eClass);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ">");
    return _operator_plus_1;
  }
  
  public String _expression(final StringSplit s, final String kvcTarget, final String kvcPrefix) {
    ScalarExpression _value = s.getValue();
    String _expression = this.expression(_value, kvcTarget, kvcPrefix);
    String _operator_plus = StringExtensions.operator_plus("[", _expression);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " componentsSeparatedByString: ");
    ScalarExpression _delimiter = s.getDelimiter();
    String _expression_1 = this.expression(_delimiter, kvcTarget, kvcPrefix);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _expression_1);
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "]");
    return _operator_plus_3;
  }
  
  public String _expression(final StringLiteral s, final String kvcTarget, final String kvcPrefix) {
    String _value = s.getValue();
    String _operator_plus = StringExtensions.operator_plus("@\"", _value);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "\"");
    return _operator_plus_1;
  }
  
  public String join(final Iterable<? extends CharSequence> s, final String delimiter) {
    {
      final Iterable<? extends CharSequence> typeConverted_s = (Iterable<? extends CharSequence>)s;
      boolean _isEmpty = IterableExtensions.isEmpty(typeConverted_s);
      if (_isEmpty) {
        return "";
      }
      Iterator<? extends CharSequence> _iterator = s.iterator();
      Iterator<? extends CharSequence> iter = _iterator;
      final Iterator<? extends CharSequence> typeConverted_iter = (Iterator<? extends CharSequence>)iter;
      CharSequence _next = typeConverted_iter.next();
      StringBuffer _stringBuffer = new StringBuffer(_next);
      StringBuffer buffer = _stringBuffer;
      boolean _hasNext = iter.hasNext();
      Boolean _xwhileexpression = _hasNext;
      while (_xwhileexpression) {
        StringBuffer _append = buffer.append(delimiter);
        final Iterator<? extends CharSequence> typeConverted_iter_1 = (Iterator<? extends CharSequence>)iter;
        CharSequence _next_1 = typeConverted_iter_1.next();
        _append.append(_next_1);
        boolean _hasNext_1 = iter.hasNext();
        _xwhileexpression = _hasNext_1;
      }
      String _string = buffer.toString();
      return _string;
    }
  }
  
  public String _expression(final StringConcat s, final String kvcTarget, final String kvcPrefix) {
    EList<ScalarExpression> _values = s.getValues();
    final Function1<ScalarExpression,String> _function = new Function1<ScalarExpression,String>() {
        public String apply(ScalarExpression v) {
          return "%@";
        }
      };
    List<String> _map = ListExtensions.<ScalarExpression, String>map(_values, _function);
    String _join = this.join(_map, "");
    String _operator_plus = StringExtensions.operator_plus("[NSString stringWithFormat:@\"", _join);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "\", ");
    EList<ScalarExpression> _values_1 = s.getValues();
    final Function1<ScalarExpression,String> _function_1 = new Function1<ScalarExpression,String>() {
        public String apply(ScalarExpression v_1) {
          final ScalarExpression typeConverted_v_1 = (ScalarExpression)v_1;
          String _expression = Extensions.this.expression(typeConverted_v_1, kvcTarget, kvcPrefix);
          String _string = _expression.toString();
          return _string;
        }
      };
    List<String> _map_1 = ListExtensions.<ScalarExpression, String>map(_values_1, _function_1);
    String _join_1 = this.join(_map_1, ", ");
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _join_1);
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "]");
    return _operator_plus_3;
  }
  
  public String _expression(final StringUrlConform s, final String kvcTarget, final String kvcPrefix) {
    ScalarExpression _value = s.getValue();
    String _expression = this.expression(_value, kvcTarget, kvcPrefix);
    String _operator_plus = StringExtensions.operator_plus("[", _expression);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]");
    return _operator_plus_1;
  }
  
  public String _expression(final StringReplace s, final String kvcTarget, final String kvcPrefix) {
    ScalarExpression _value = s.getValue();
    String _expression = this.expression(_value, kvcTarget, kvcPrefix);
    String _operator_plus = StringExtensions.operator_plus("[", _expression);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " stringByReplacingOccurrencesOfString:");
    ScalarExpression _match = s.getMatch();
    String _expression_1 = this.expression(_match, kvcTarget, kvcPrefix);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _expression_1);
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, " withString:");
    ScalarExpression _replacement = s.getReplacement();
    String _expression_2 = this.expression(_replacement, kvcTarget, kvcPrefix);
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _expression_2);
    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, "]");
    return _operator_plus_5;
  }
  
  public String _expression(final Constant c, final String kvcTarget, final String kvcPrefix) {
    ScalarExpression _value = c.getValue();
    String _expression = this.expression(_value, kvcTarget, kvcPrefix);
    return _expression;
  }
  
  public ArrayList<String> keyPath(final ObjectReference ref) {
    {
      VariableDeclaration _object = ref.getObject();
      String _name = _object.getName();
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_name);
      final ArrayList<String> result = _newArrayList;
      ObjectReference iter = ref;
      ObjectReference _tail = iter.getTail();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_tail, null);
      Boolean _xwhileexpression = _operator_notEquals;
      while (_xwhileexpression) {
        {
          ObjectReference _tail_1 = iter.getTail();
          iter = _tail_1;
          VariableDeclaration _object_1 = iter.getObject();
          String _name_1 = _object_1.getName();
          result.add(_name_1);
        }
        ObjectReference _tail_2 = iter.getTail();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_tail_2, null);
        _xwhileexpression = _operator_notEquals_1;
      }
      return result;
    }
  }
  
  public List<CharSequence> keyPath(final ObjectReference ref, final String kvcPrefix) {
    {
      ArrayList<CharSequence> _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(kvcPrefix);
      if (_isNullOrEmpty) {
        ArrayList<CharSequence> _newArrayList = CollectionLiterals.<CharSequence>newArrayList();
        _xifexpression = _newArrayList;
      } else {
        ArrayList<CharSequence> _newArrayList_1 = CollectionLiterals.<CharSequence>newArrayList(((java.lang.CharSequence) kvcPrefix));
        _xifexpression = _newArrayList_1;
      }
      final List<CharSequence> head = _xifexpression;
      final List<CharSequence> typeConverted_head = (List<CharSequence>)head;
      ArrayList<String> _keyPath = this.keyPath(ref);
      Iterable<String> _tail = IterableExtensions.<String>tail(_keyPath);
      List<String> _list = IterableExtensions.<String>toList(_tail);
      typeConverted_head.addAll(_list);
      final List<CharSequence> typeConverted_head_1 = (List<CharSequence>)head;
      List<CharSequence> _list_1 = IterableExtensions.<CharSequence>toList(typeConverted_head_1);
      return _list_1;
    }
  }
  
  public String _expression(final ObjectReference ref, final String kvcTarget, final String kvcPrefix) {
    String _xifexpression = null;
    VariableDeclaration _object = ref.getObject();
    if ((_object instanceof de.itemis.mobilizer.appModelDsl.Constant)) {
      VariableDeclaration _object_1 = ref.getObject();
      String _expression = this.expression(_object_1, kvcTarget, kvcPrefix);
      _xifexpression = _expression;
    } else {
      String _xblockexpression = null;
      {
        List<CharSequence> _keyPath = this.keyPath(ref, kvcPrefix);
        final List<CharSequence> keyPath = _keyPath;
        String _xifexpression_1 = null;
        boolean _isEmpty = keyPath.isEmpty();
        if (_isEmpty) {
          _xifexpression_1 = kvcTarget;
        } else {
          final String typeConverted_kvcTarget = (String)kvcTarget;
          String _operator_plus = StringExtensions.operator_plus("[", typeConverted_kvcTarget);
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " valueForKeyPath:@\"");
          final List<CharSequence> typeConverted_keyPath = (List<CharSequence>)keyPath;
          String _join = this.join(typeConverted_keyPath, ".");
          String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _join);
          String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "\"]");
          _xifexpression_1 = _operator_plus_3;
        }
        _xblockexpression = (_xifexpression_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public String contentProvider(final ProviderConstruction c, final String providers, final String kvcTarget, final String kvcPrefix) {
    if ((c instanceof ComplexProviderConstruction)
         && (providers instanceof String)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _contentProvider((ComplexProviderConstruction)c, (String)providers, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof SimpleProviderConstruction)
         && (providers instanceof String)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _contentProvider((SimpleProviderConstruction)c, (String)providers, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof ProviderConstruction)
         && (providers instanceof String)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _contentProvider((ProviderConstruction)c, (String)providers, (String)kvcTarget, (String)kvcPrefix);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public String expression(final EObject c, final String kvcTarget, final String kvcPrefix) {
    if ((c instanceof Constant)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _expression((Constant)c, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof StringConcat)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _expression((StringConcat)c, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof StringReplace)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _expression((StringReplace)c, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof StringSplit)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _expression((StringSplit)c, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof StringUrlConform)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _expression((StringUrlConform)c, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof ObjectReference)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _expression((ObjectReference)c, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof StringLiteral)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _expression((StringLiteral)c, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof CollectionExpression)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _expression((CollectionExpression)c, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof Expression)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _expression((Expression)c, (String)kvcTarget, (String)kvcPrefix);
    } else if ((c instanceof ScalarExpression)
         && (kvcTarget instanceof String)
         && (kvcPrefix instanceof String)) {
      return _expression((ScalarExpression)c, (String)kvcTarget, (String)kvcPrefix);
    } else {
      throw new IllegalArgumentException();
    }
  }
}