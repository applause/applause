package org.applause.util.xcode.project;

public enum CLanguageDialect {
	
	ANSI_C ("ansi"),
	C89 ("c89"),
	GNU89 ("gnu89"),
	C99 ("c99"),
	GNU99 ("gnu99");
	
	private final String dialect;       

    private CLanguageDialect(String s) {
        dialect = s;
    }

    public String toString(){
       return dialect;
    }	
}
