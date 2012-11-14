package org.applause.util.xcode.project;

public enum SDKRoot {
	iPhoneOS ("iphoneos");
	
	private final String name;       

    private SDKRoot(String s) {
        name = s;
    }

    public String toString(){
       return name;
    }	
}
