package org.applause.integrations.xcode;


public class Xcode {

	public static boolean build(String directory, String appName) {
		AppleScript script = new AppleScript();
		script.addLine("tell application 'Xcode'");
		script.addLine("	set targetProject to project of (open 'tmp:mobilizer:%s.xcodeproj')", appName);
		script.addLine("	build targetProject with transcript");
		script.addLine("end tell");

		return script.eval().endsWith("Build succeeded\"\n");
	}
	
	public static void open(String appName) {
		AppleScript script = new AppleScript();
		script.addLine("tell application 'Xcode'");
		script.addLine("	open 'tmp:mobilizer:%s.xcodeproj'", appName);
		script.addLine("end tell");

		script.eval();
	}

	public static void launch(String directory, String appName) {
		AppleScript script = new AppleScript();
		script.addPosixPathVar("projectFile", directory, ":" + appName + ".xcodeproj");
		
		script.addLine("tell application 'Xcode'");
		script.addLine("	set targetProject to project of (open projectFile)");
		script.addLine("	build targetProject");
		script.addLine("	launch");
		script.addLine("end tell");

		script.eval();
	}
	
	public static void updateGroup(String group, String directory, String appDirectory, String appName) {
		AppleScript script = new AppleScript();
		script.addLine("set projectPath to '%s/'", appDirectory);
		script.addLine("set generatedPath to POSIX file (projectPath & '%s')", group);
		script.addLine("set projectFile to POSIX file (projectPath & '%s.xcodeproj')", appName);

		script.addLine("tell application 'Finder'");
		script.addLine("	set filelist to every file of (folder generatedPath)");
		script.addLine("end tell");

		script.addLine("tell application 'Xcode'");
		script.addLine("	set targetProject to project of (open projectFile)");
		script.addLine("	set generatedGroup to group '%s' of targetProject", group);
		script.addLine("	delete every file reference of generatedGroup");
		script.addLine("	tell generatedGroup");
		script.addLine("		repeat with eachFile in filelist");
		script.addLine("			set fileName to name of eachFile");
		script.addLine("			make new file reference with properties {name:fileName, file encoding:macos roman, path type:group relative, path:fileName}");
		script.addLine("		end repeat");
		script.addLine("	end tell");
		script.addLine("end tell");

		script.eval();
	}
	

}
