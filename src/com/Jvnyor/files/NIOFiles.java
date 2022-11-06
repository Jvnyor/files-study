package com.Jvnyor.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOFiles {
	public static void main(String[] args) throws IOException {
		Files.write(Paths.get("textFileNIO.txt"), "Test file NIO".getBytes());
	}
}
