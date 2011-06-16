lexer grammar InternalApplauseDsl;
@header {
package org.applause.lang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'returns' ;
T12 : 'Default' ;
T13 : 'DefaultWithDisclosure' ;
T14 : 'Value2' ;
T15 : 'Double' ;
T16 : 'Subtitle' ;
T17 : '.' ;
T18 : '(' ;
T19 : ')' ;
T20 : 'replace(' ;
T21 : ',' ;
T22 : 'urlconform(' ;
T23 : '[' ;
T24 : ']' ;
T25 : 'split(' ;
T26 : 'tabbarApplication' ;
T27 : '{' ;
T28 : '}' ;
T29 : 'button' ;
T30 : 'title=' ;
T31 : 'icon=' ;
T32 : 'view=' ;
T33 : 'const' ;
T34 : 'type' ;
T35 : 'mapsTo' ;
T36 : 'entity' ;
T37 : 'extends' ;
T38 : 'contentprovider' ;
T39 : 'fetches' ;
T40 : 'XML' ;
T41 : 'from' ;
T42 : 'selects' ;
T43 : 'tableview' ;
T44 : 'detailsview' ;
T45 : 'customview' ;
T46 : 'implementedBy' ;
T47 : 'header' ;
T48 : 'subtitle=' ;
T49 : 'details=' ;
T50 : 'image=' ;
T51 : 'section' ;
T52 : 'cell' ;
T53 : 'foreach' ;
T54 : 'text=' ;
T55 : 'action=' ;
T56 : 'as' ;
T57 : '[]' ;
T58 : 'derived' ;
T59 : 'resolves' ;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8111
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8113
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8115
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8117
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8119
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8121
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8123
RULE_ANY_OTHER : .;


