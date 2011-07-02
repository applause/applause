lexer grammar InternalApplauseDsl;
@header {
package org.applause.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '[]' ;
T12 : '.' ;
T13 : '(' ;
T14 : ')' ;
T15 : 'replace(' ;
T16 : ',' ;
T17 : 'urlconform(' ;
T18 : '[' ;
T19 : ']' ;
T20 : 'split(' ;
T21 : 'tabbarApplication' ;
T22 : 'application' ;
T23 : '{' ;
T24 : 'splash=' ;
T25 : '}' ;
T26 : 'button' ;
T27 : 'title=' ;
T28 : 'icon=' ;
T29 : 'view=' ;
T30 : 'const' ;
T31 : 'type' ;
T32 : 'mapsTo' ;
T33 : 'entity' ;
T34 : 'extends' ;
T35 : 'derived' ;
T36 : 'contentprovider' ;
T37 : 'returns' ;
T38 : 'resolves' ;
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
T57 : 'Default' ;
T58 : 'DefaultWithDisclosure' ;
T59 : 'Value2' ;
T60 : 'Double' ;
T61 : 'Subtitle' ;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3289
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3291
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3293
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3295
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3297
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3299
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3301
RULE_ANY_OTHER : .;


