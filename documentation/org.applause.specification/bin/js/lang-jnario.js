/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

/**
 * @fileoverview
 * Registers a language handler for Jnario.
 *
 * @author Sebastian Zarnekow
 * @author Sebastian Benz
 */

PR['registerLangHandler'](
    PR['createSimpleLexer'](
            [
             // Whitespace
            [PR['PR_PLAIN'],       /^[\t\n\r \xA0]+/, null, '\t\n\r \xA0'],
            [PR['PR_PUNCTUATION'], /^[!#%&()*+,\-:;<=>?@\[\\\]^{|}~]+/, null,
             '!#%&()*+,-:;<=>?@[\\]^{|}~'],

//            , null]
           ],
           [
            // A double or single quoted, possibly multi-line, string.
            [PR['PR_STRING'],        /^(?:"(?:[^\"\\]|\\.)*"|'(?!\'\')(?:[^\'\\]|\\.)*')/],
            // A symbol literal is a single quote followed by an identifier with no
            // single quote following
            // A character literal has single quotes on either side
            [PR['PR_STRING'],      /^'(?:[^\r\n\\']|\\(?:'|[^\r\n']+))'/],
            [PR['PR_LITERAL'],     /^'[a-zA-Z_$][\w$]*(?!['$\w])/],
            [PR['PR_KEYWORD'],     /^(?:pending|describe|context|fact|facts|this|it|null|abstract|boolean|case|catch|char|class|create|def|default|do|double|else|extends|extension|final|finally|float|for|if|implements|import|int|long|new|override|package|private|protected|return|short|static|super|switch|throw|throws|try|typeof|val|var|void|while|FOR|ENDFOR|IF|ENDIF|ELSEIF|BEFORE|AFTER|SEPARATOR)\b/],
            [PR['PR_LITERAL'],     /^(?:=>|assert|mock|stub|should|be|not|true|false|null|this|it)\b/],
            [PR['PR_LITERAL'],     /^(?:(?:0(?:[0-7]+|X[0-9A-F]+))L?|(?:(?:0|[1-9][0-9]*)(?:(?:\.[0-9]+)?(?:E[+\-]?[0-9]+)?F?|L?))|\\.[0-9]+(?:E[+\-]?[0-9]+)?F?)/i],
            // Treat upper camel case identifiers as types.
            [PR['PR_TYPE'],        /^[$_]*[A-Z][_$A-Z0-9]*[a-z][\w$]*/],
            [PR['PR_PLAIN'],       /^[$a-zA-Z_][\w$]*/],
            [PR['PR_COMMENT'],     /^\/(?:\/.*|\*(?:\/|\**[^*/])*(?:\*+\/?)?)/],
            [PR['PR_PUNCTUATION'], /^(?:\.+|\/)/],
            [PR['PR_STRING'],      /^((\'\'\'|\u00BB)([\s\S]*?)(\'\'\'|\u00AB))/]

           ]),
    ['spec']);
    
PR['registerLangHandler'](
	    PR['createSimpleLexer'](
	            [
	             // Whitespace
	            [PR['PR_PLAIN'],       /^[\t\n\r \xA0]+/, null, '\t\n\r \xA0'],
	            [PR['PR_PUNCTUATION'], /^[!#%&()*+,\-:;<=>?@\[\\\]^{|}~]+/, null,
	             '!#%&()*+,-:;<=>?@[\\]^{|}~'],

//	            , null]
	           ],
	           [
	            // A double or single quoted, possibly multi-line, string.
	            [PR['PR_STRING'],        /^(?:"(?:[^\"\\]|\\.)*"|'(?!\'\')(?:[^\'\\]|\\.)*')/],
	            // A symbol literal is a single quote followed by an identifier with no
	            // single quote following
	            // A character literal has single quotes on either side
	            [PR['PR_STRING'],      /^'(?:[^\r\n\\']|\\(?:'|[^\r\n']+))'/],
	            [PR['PR_LITERAL'],     /^'[a-zA-Z_$][\w$]*(?!['$\w])/],
	            [PR['PR_KEYWORD'],     /^(?:this|it|null|abstract|boolean|case|catch|char|class|create|def|default|do|double|else|extends|extension|final|finally|float|for|if|implements|import|int|long|new|override|package|private|protected|return|short|static|super|switch|throw|throws|try|typeof|val|var|void|while|FOR|ENDFOR|IF|ENDIF|ELSEIF|BEFORE|AFTER|SEPARATOR)\b/],
	            [PR['PR_LITERAL'],     /^(?:=>|true|mock|stub|false|null|this|it|Given|When|Then|And|Feature|Scenario|Background)\b/],
	            [PR['PR_LITERAL'],     /^(?:(?:0(?:[0-7]+|X[0-9A-F]+))L?|(?:(?:0|[1-9][0-9]*)(?:(?:\.[0-9]+)?(?:E[+\-]?[0-9]+)?F?|L?))|\\.[0-9]+(?:E[+\-]?[0-9]+)?F?)/i],
	            [PR['PR_PLAIN'],       /^[$a-zA-Z_][\w$]*/],
	            [PR['PR_COMMENT'],     /^\/(?:\/.*|\*(?:\/|\**[^*/])*(?:\*+\/?)?)/],
	            [PR['PR_PUNCTUATION'], /^(?:\.+|\/)/],
	            [PR['PR_STRING'],      /^((\'\'\'|\u00BB)([\s\S]*?)(\'\'\'|\u00AB))/]

	           ]),
	    ['feature']);


PR['registerLangHandler'](
    PR['createSimpleLexer'](
        [
          // Whitespace
         [PR['PR_PLAIN'],       /^[\t\n\r \xA0]+/, null, '\t\n\r \xA0'],
         [PR['PR_PUNCTUATION'], /^[!#%&()*+,\-:;<=>?@\[\\\]^{|}~]+/, null,
          '!#%&()*+,-:;<=>?@[\\]^{|}~'],

//	    	         , null]
        ],
        [
         // A double or single quoted, possibly multi-line, string.
         [PR['PR_STRING'],        /^(?:"(?:[^\"\\]|\\.)*"|'(?!\'\')(?:[^\'\\]|\\.)*')/],
         // A symbol literal is a single quote followed by an identifier with no
         // single quote following
         // A character literal has single quotes on either side
         [PR['PR_STRING'],      /^'(?:[^\r\n\\']|\\(?:'|[^\r\n']+))'/],
         [PR['PR_LITERAL'],     /^'[a-zA-Z_$][\w$]*(?!['$\w])/],
         [PR['PR_KEYWORD'],     /^(?:import|package)\b/],
         [PR['PR_LITERAL'],     /^(?:(?:0(?:[0-7]+|X[0-9A-F]+))L?|(?:(?:0|[1-9][0-9]*)(?:(?:\.[0-9]+)?(?:E[+\-]?[0-9]+)?F?|L?))|\\.[0-9]+(?:E[+\-]?[0-9]+)?F?)/i],
         [PR['PR_PLAIN'],       /^[$a-zA-Z_][\w$]*/],
         [PR['PR_COMMENT'],     /^\/(?:\/.*|\*(?:\/|\**[^*/])*(?:\*+\/?)?)/],
         [PR['PR_PUNCTUATION'], /^(?:\.+|\/)/],
         [PR['PR_KEYWORD'], 	/^#(?:##(?:[^#\\]|#(?!##))*(?:###|$)|.*)/, null, '#'],
         [PR['PR_STRING'],      /^((\'\'\'|\u00BB)([\s\S]*?)(\'\'\'|\u00AB))/]

        ]),
    ['suite']);

    /**
     * @fileoverview
     * Registers a language handler for Xtend.
     *
     * @author Sebastian Zarnekow
     */

PR['registerLangHandler'](
    PR['createSimpleLexer'](
        [
          // Whitespace
         [PR['PR_PLAIN'],       /^[\t\n\r \xA0]+/, null, '\t\n\r \xA0'],
         [PR['PR_PUNCTUATION'], /^[!#%&()*+,\-:;<=>?@\[\\\]^{|}~]+/, null,
          '!#%&()*+,-:;<=>?@[\\]^{|}~'],

//             , null]
        ],
        [
         // A double or single quoted, possibly multi-line, string.
         [PR['PR_STRING'],        /^(?:"(?:[^\"\\]|\\.)*"|'(?!\'\')(?:[^\'\\]|\\.)*')/],
         // A symbol literal is a single quote followed by an identifier with no
         // single quote following
         // A character literal has single quotes on either side
         [PR['PR_STRING'],      /^'(?:[^\r\n\\']|\\(?:'|[^\r\n']+))'/],
         [PR['PR_LITERAL'],     /^'[a-zA-Z_$][\w$]*(?!['$\w])/],
         [PR['PR_KEYWORD'],     /^(?:this|it|null|abstract|boolean|case|catch|char|class|create|def|default|do|double|else|extends|extension|final|finally|float|for|if|implements|import|int|long|new|override|package|private|protected|return|short|static|super|switch|throw|throws|try|typeof|val|var|void|while|FOR|ENDFOR|IF|ENDIF|ELSEIF|BEFORE|AFTER|SEPARATOR)\b/],
         [PR['PR_LITERAL'],     /^(?:true|false|null|this|it)\b/],
         [PR['PR_LITERAL'],     /^(?:(?:0(?:[0-7]+|X[0-9A-F]+))L?|(?:(?:0|[1-9][0-9]*)(?:(?:\.[0-9]+)?(?:E[+\-]?[0-9]+)?F?|L?))|\\.[0-9]+(?:E[+\-]?[0-9]+)?F?)/i],
         // Treat upper camel case identifiers as types.
         [PR['PR_TYPE'],        /^[$_]*[A-Z][_$A-Z0-9]*[a-z][\w$]*/],
         [PR['PR_PLAIN'],       /^[$a-zA-Z_][\w$]*/],
         [PR['PR_COMMENT'],     /^\/(?:\/.*|\*(?:\/|\**[^*/])*(?:\*+\/?)?)/],
         [PR['PR_PUNCTUATION'], /^(?:\.+|\/)/],
         [PR['PR_STRING'],      /^((\'\'\'|\u00BB)([\s\S]*?)(\'\'\'|\u00AB))/]

        ]),
    ['xtend']);
    
PR['registerLangHandler'](
	    PR['createSimpleLexer'](
	        [
	          // Whitespace
	         [PR['PR_PLAIN'],       /^[\t\n\r \xA0]+/, null, '\t\n\r \xA0'],
	         [PR['PR_PUNCTUATION'], /^[!#%&()*+,\-:;<=>?@\[\\\]^{|}~]+/, null,
	          '!#%&()*+,-:;<=>?@[\\]^{|}~'],

//    	             , null]
	        ],
	        [
	         [PR['PR_STRING'],        /^(?:"(?:[^\"\\]|\\.)*"|'(?!\'\')(?:[^\'\\]|\\.)*')/],
	         [PR['PR_STRING'],      /^'(?:[^\r\n\\']|\\(?:'|[^\r\n']+))'/],
	         [PR['PR_LITERAL'],     /^'[a-zA-Z_$][\w$]*(?!['$\w])/],
	         [PR['PR_LITERAL'],     /^(?:(?:0(?:[0-7]+|X[0-9A-F]+))L?|(?:(?:0|[1-9][0-9]*)(?:(?:\.[0-9]+)?(?:E[+\-]?[0-9]+)?F?|L?))|\\.[0-9]+(?:E[+\-]?[0-9]+)?F?)/i],
	         // Treat upper camel case identifiers as types.
	         [PR['PR_PLAIN'],       /^[$a-zA-Z_][\w$]*/],
	         [PR['PR_COMMENT'],     /^\/(?:\/.*|\*(?:\/|\**[^*/])*(?:\*+\/?)?)/],
	         [PR['PR_PUNCTUATION'], /^(?:\.+|\/)/],
	         [PR['PR_STRING'],      /^((\'\'\'|\u00BB)([\s\S]*?)(\'\'\'|\u00AB))/]

	        ]),
	    ['none']);
		    

