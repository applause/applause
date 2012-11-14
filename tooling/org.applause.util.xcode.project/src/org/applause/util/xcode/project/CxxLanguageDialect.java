package org.applause.util.xcode.project;

public enum CxxLanguageDialect {
	
	CXX_98 ("c++98"),
	GNUXX_98 ("gnu++98"),
	CXX_11 ("c++0x"),
	GNUXX_11 ("gnu++0x");
	
	private final String dialect;       

    private CxxLanguageDialect(String s) {
        dialect = s;
    }

    public String toString(){
       return dialect;
    }	
}
