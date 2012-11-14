package org.applause.util.xcode.project;

public enum GCCVersion {
	
	LLVM_41 ("com.apple.compilers.llvm.clang.1_0"),
	LLVM_GCC_42 ("com.apple.compilers.llvmgcc42");
	
	private final String version;       

    private GCCVersion(String s) {
        version = s;
    }

    public String toString(){
       return version;
    }	
}
