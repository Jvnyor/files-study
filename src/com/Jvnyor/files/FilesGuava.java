package com.Jvnyor.files;

import java.io.File;
import java.io.IOException;

public class FilesGuava {
	public static void main(String[] args) throws IOException {
		String TEXT_FILE = "textFileGuava.txt";

//		com.google.common.io.Files.touch(new File(TEXT_FILE));
		com.google.common.io.Files.write("Test file".getBytes(), new File(TEXT_FILE));
	}
}
