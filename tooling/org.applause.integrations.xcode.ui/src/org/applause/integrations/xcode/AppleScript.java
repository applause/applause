package org.applause.integrations.xcode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// inspired by https://jasconn.dev.java.net/
public class AppleScript {
	
	private final StringBuilder script = new StringBuilder();
	
	public void addLine(String line, Object... args) {
		script.append(String.format(line.replaceAll("'", "\""), args));
		script.append("\n");
	}
	
	public void addPosixPathVar(String varName, String directory, String suffix) {
//		addLine("tell application 'Finder'");
		addLine("set %s to '' & POSIX file '%s' & '%s'", varName, directory, suffix);
//		set projectFile to "" & POSIX file "/Users/behrens/Documents/presentations/1003_eclipsecon/iPhone/workspaces/runtime-EclipseApplication/itemisApp" & "/itemisApp.xcodeproj"
//		addLine("end tell");
	}
	
	public String eval() {
		return AppleScript.eval(script.toString()).toString();
	}
	
	private static final String CMD = "/usr/bin/osascript";
	private static final String FILEEXT = ".scpt";

	private static final String ARGS = "-ss";

	public static String eval(String script) {
		System.out.println("eval " + script);
		File f = save(script);
		if (f != null) {
			try {
				String result = eval(f);
				f.delete();
				return result;
			} catch (Throwable thr) {
				throw new RuntimeException(thr.getMessage());
			}
		}
		throw new RuntimeException("unable to invoke script");
	}
	
	private static File save(String script) {
		File f = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			f = File.createTempFile("script", FILEEXT);
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write(script);
		} catch (Throwable thr) {
			f = null;
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
				}
			}
		}
		return f;
	}

	private static String eval(File f) {
		ProcessBuilder pb = new ProcessBuilder();
		pb.command(CMD, ARGS, f.getAbsolutePath());
		return ProcessHelper.startAndWaitFor(pb);
	}
	
	public static String toPOSIX(String directory) {
		directory = directory.replaceAll("/", ":");
		if(directory.startsWith(":"))
			directory = directory.substring(1);
		return directory;
	}

}
