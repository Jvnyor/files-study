package com.Jvnyor.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOAndNIOFiles {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = Files.newBufferedWriter(Paths.get("textFileIOAndNIO.txt"));
		bw.write("Test file IO And NIO");
		bw.newLine();
		bw.write("2 line");
		bw.flush();
		bw.close();
	}
}
