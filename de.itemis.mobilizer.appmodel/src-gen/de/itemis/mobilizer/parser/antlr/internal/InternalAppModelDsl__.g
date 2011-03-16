lexer grammar InternalAppModelDsl;
@header {
package de.itemis.mobilizer.parser.antlr.internal;

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
T22 : '{' ;
T23 : '}' ;
T24 : 'button' ;
T25 : 'title=' ;
T26 : 'icon=' ;
T27 : 'view=' ;
T28 : 'type' ;
T29 : 'mapsTo' ;
T30 : 'entity' ;
T31 : 'extends' ;
T32 : 'derived' ;
T33 : 'contentprovider' ;
T34 : 'returns' ;
T35 : 'resolves' ;
T36 : 'fetches' ;
T37 : 'XML' ;
T38 : 'from' ;
T39 : 'selects' ;
T40 : 'tableview' ;
T41 : 'detailsview' ;
T42 : 'customview' ;
T43 : 'implementedBy' ;
T44 : 'header' ;
T45 : 'subtitle=' ;
T46 : 'details=' ;
T47 : 'image=' ;
T48 : 'section' ;
T49 : 'cell' ;
T50 : 'foreach' ;
T51 : 'text=' ;
T52 : 'action=' ;
T53 : 'as' ;
T54 : 'Default' ;
T55 : 'DefaultWithDisclosure' ;
T56 : 'Value2' ;
T57 : 'Double' ;
T58 : 'Subtitle' ;

// $ANTLR src "../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g" 3160
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g" 3162
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g" 3164
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g" 3166
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g" 3168
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g" 3170
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.itemis.mobilizer.appmodel/src-gen/de/itemis/mobilizer/parser/antlr/internal/InternalAppModelDsl.g" 3172
RULE_ANY_OTHER : .;


