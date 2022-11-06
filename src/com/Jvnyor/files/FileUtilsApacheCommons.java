package com.Jvnyor.files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileUtilsApacheCommons {

	public static void main(String[] args) throws IOException {
		String TEXT_FILE = "textFileApacheCommons.txt";

//		org.apache.commons.io.FileUtils.touch(new File(TEXT_FILE));
		
		org.apache.commons.io.FileUtils.write(new File(TEXT_FILE), "Test file", Charset.forName("UTF-8"));
	}
}
