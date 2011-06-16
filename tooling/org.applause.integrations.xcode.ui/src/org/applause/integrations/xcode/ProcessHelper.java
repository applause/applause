package org.applause.integrations.xcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessHelper {

	public static String startAndWaitFor(ProcessBuilder pb) {
		int exit = 0;
		StringBuilder sbIS = new StringBuilder();
		StringBuilder sbES = new StringBuilder();
		try {
			Process p = pb.start();
			while(true) {
				readInto(sbIS, p.getInputStream());
				readInto(sbES, p.getErrorStream());
				try {
					exit = p.exitValue();
					break;
				} catch (IllegalThreadStateException e) {
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
		if (exit == 0) {
			return sbIS.toString();
		}
		throw new RuntimeException(sbES.toString());
	}

	private static void readInto(StringBuilder sb, InputStream is) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		String line;
		while ((line = reader.readLine()) != null)
			sb.append(line).append("\n");
	}

}
