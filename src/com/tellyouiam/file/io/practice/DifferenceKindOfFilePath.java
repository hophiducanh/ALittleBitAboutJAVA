package com.tellyouiam.file.io.practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DifferenceKindOfFilePath {
	public static void main(String[] args) throws IOException { //https://unix.stackexchange.com/questions/249039/what-means-the-dots-on-a-path
		File file = new File("\\conta\\OneDrive\\..\\.\\opening_balance_test");
		File file1 = new File("\\conta\\OneDrive\\..\\..\\opening_balance_test"); // >> diff result
		File file2 = null;
		String text = "Hello world";
		BufferedWriter output = null;
		try {
			file2 = new File("C:\\Users\\.\\conta\\Desktop\\a.txt"); //if use relative path with \\.\\ possible don't work.
			output = new BufferedWriter(new FileWriter(file2));
			output.write(text);
		} catch ( IOException e ) {
			e.printStackTrace();
		} finally {
			if ( output != null ) {
				output.close();
			}
		}
		try {
			String canonical_path_string = file.getCanonicalPath();
			String absolute_path_string = file.getAbsolutePath();
			String path_string = file.getPath();
			
			File directory = new File(".\\");
			System.out.println(directory.getAbsolutePath());
			
			System.out.println("Canonical Path: " + canonical_path_string);//Canonical Path: C:\conta\opening_balance_test
			System.out.println("Absolute Path: " + absolute_path_string);  //Absolute Path: C:\conta\.\.\opening_balance_test
			System.out.println("Path: " + path_string);                     //Path: \conta\.\.\opening_balance_test
			
			String file3 = new File("", "prism_media").getAbsolutePath();
			System.out.println("file3: " + file3);
			
			String file4 = new File("").getAbsolutePath();
			System.out.println("file4: " + file4);
			System.out.println(System.getenv("SystemDrive"));
			//System.out.println(Arrays.toString(FileSystemView.getFileSystemView().getRoots()));
			
			File file5 = new File("", "hello.txt"); //access denied: On recent versions of Windows, you cannot write to the root folder of the system drive without elevated privileges.
//			file5.createNewFile();
			
			File file6 = new File("C:\\Users\\conta\\Desktop\\b.txt");
			file6.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
