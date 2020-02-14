package com.tellyouiam.file.io;

import java.io.File;

public class RemoveLocalFile {
	private static boolean removeLocalFile(String filePath) {
		try {
			File file = new File(filePath); // file merely abstract. If u write data to file >> file exist.
			if (file.exists()) {
				return file.delete();
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		removeLocalFile("text.txt");
//		removeLocalFile("C:\\Users\\conta\\OneDrive\\Desktop\\abc.txt");
	}
}
