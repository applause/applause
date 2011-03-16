package com.appa.tools.macosx;

import java.io.IOException;

public class Simulator {

	private static final String VERB_QUIT = "quit";
	private static final String VERB_LAUNCH = "launch";

	private static final String[] LAUNCH = { "osascript", "-e",
			"tell app \"iPhone Simulator\" to " + VERB_LAUNCH };
	private static final String[] QUIT = { "osascript", "-e",
			"tell app \"iPhone Simulator\" to " + VERB_QUIT };

	public static void launch() throws IOException {
		Runtime.getRuntime().exec(LAUNCH);
	}

	public static void quit() throws IOException {
		Runtime.getRuntime().exec(QUIT);
	}

}
