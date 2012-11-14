package org.applause.util.xcode.project;

public enum IOSVersion {
	
	iOS_51 ("5.1"),
	iOS_60 ("6.0");
	
	private final String version;       

    private IOSVersion(String s) {
    	version = s;
    }

    public String toString(){
       return version;
    }	
	

}
