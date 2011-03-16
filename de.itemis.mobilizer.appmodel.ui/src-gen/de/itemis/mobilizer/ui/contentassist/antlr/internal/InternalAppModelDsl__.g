lexer grammar InternalAppModelDsl;
@header {
package de.itemis.mobilizer.ui.contentassist.antlr.internal;

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
T33 : 'type' ;
T34 : 'mapsTo' ;
T35 : 'entity' ;
T36 : 'extends' ;
T37 : 'contentprovider' ;
T38 : 'fetches' ;
T39 : 'XML' ;
T40 : 'from' ;
T41 : 'selects' ;
T42 : 'tableview' ;
T43 : 'detailsview' ;
T44 : 'customview' ;
T45 : 'implementedBy' ;
T46 : 'header' ;
T47 : 'subtitle=' ;
T48 : 'details=' ;
T49 : 'image=' ;
T50 : 'section' ;
T51 : 'cell' ;
T52 : 'foreach' ;
T53 : 'text=' ;
T54 : 'action=' ;
T55 : 'as' ;
T56 : '[]' ;
T57 : 'derived' ;
T58 : 'resolves' ;

// $ANTLR src "../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g" 7920
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g" 7922
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g" 7924
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g" 7926
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g" 7928
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g" 7930
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.itemis.mobilizer.appmodel.ui/src-gen/de/itemis/mobilizer/ui/contentassist/antlr/internal/InternalAppModelDsl.g" 7932
RULE_ANY_OTHER : .;


