package com.tellyouiam.file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class DifferenceKindOfFilePath {
	public static void main(String[] args) throws IOException { //https://unix.stackexchange.com/questions/249039/what-means-the-dots-on-a-path
		File file = new File("\\conta\\OneDrive\\..\\.\\opening_balance_test");
		File file1 = new File("\\conta\\OneDrive\\..\\..\\opening_balance_test"); // >> diff result
		File file2 = null;
		String text = "Hello world";
		BufferedWriter output = null;
		try {
			file2 = new File("\\Desktop\\a.txt"); // >> diff result
			output = new BufferedWriter(new FileWriter(file));
			output.write(text);
		} catch ( IOException e ) {
			e.printStackTrace();
		} finally {
			if ( output != null ) {
				output.close();
			}
		}
		try {
			String canonical_path_string = file2.getCanonicalPath();
			String absolute_path_string = file2.getAbsolutePath();
			String path_string = file2.getPath();
			
			System.out.println("Canonical Path: " + canonical_path_string);//Canonical Path: C:\conta\opening_balance_test
			System.out.println("Absolute Path: " + absolute_path_string);  //Absolute Path: C:\conta\.\.\opening_balance_test
			System.out.println("Path: " + path_string);                     //Path: \conta\.\.\opening_balance_test
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
