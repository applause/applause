lexer grammar InternalApplauseDsl;
@header {
package org.applause.lang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'tabbarApplication' ;
T12 : 'application' ;
T13 : 'returns' ;
T14 : 'Default' ;
T15 : 'DefaultWithDisclosure' ;
T16 : 'Value2' ;
T17 : 'Double' ;
T18 : 'Subtitle' ;
T19 : '.' ;
T20 : '(' ;
T21 : ')' ;
T22 : 'replace(' ;
T23 : ',' ;
T24 : 'urlconform(' ;
T25 : '[' ;
T26 : ']' ;
T27 : 'split(' ;
T28 : '{' ;
T29 : '}' ;
T30 : 'splash=' ;
T31 : 'button' ;
T32 : 'title=' ;
T33 : 'icon=' ;
T34 : 'view=' ;
T35 : 'const' ;
T36 : 'type' ;
T37 : 'mapsTo' ;
T38 : 'entity' ;
T39 : 'extends' ;
T40 : 'contentprovider' ;
T41 : 'fetches' ;
T42 : 'XML' ;
T43 : 'from' ;
T44 : 'selects' ;
T45 : 'tableview' ;
T46 : 'detailsview' ;
T47 : 'customview' ;
T48 : 'implementedBy' ;
T49 : 'header' ;
T50 : 'subtitle=' ;
T51 : 'details=' ;
T52 : 'image=' ;
T53 : 'section' ;
T54 : 'cell' ;
T55 : 'foreach' ;
T56 : 'text=' ;
T57 : 'action=' ;
T58 : 'as' ;
T59 : '[]' ;
T60 : 'derived' ;
T61 : 'resolves' ;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8244
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8246
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8248
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8250
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8252
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8254
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8256
RULE_ANY_OTHER : .;


