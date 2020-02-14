package com.tellyouiam.file.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileAndFolder {
	
	private static final String WINDOW_OUTPUT_FILE_PATH = "C:\\Users\\conta\\OneDrive\\Desktop\\data\\";
	private static final String UNIX_OUTPUT_FILE_PATH = "/home/logbasex/Desktop/data/";
	
	private static String getOutputFolderPath() {
		String os = System.getProperty("os.name").toLowerCase();
		
		if (os.contains("win")) {
			return WINDOW_OUTPUT_FILE_PATH;
		} else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
			return UNIX_OUTPUT_FILE_PATH;
		}
		return null;
	}
	
	private static void createOutputFolder(String dirName) {
		String path = getOutputFolderPath() + dirName + File.separator + "submit";
		Path outputDirPath = Paths.get(path);
		boolean dirExists = Files.exists(outputDirPath);
		if (!dirExists) {
			try {
				Files.createDirectories(outputDirPath);
			} catch (IOException io) {
				System.out.println("Error");
			}
		}
	}
	
	public static void main(String[] args) {
		createOutputFolder("Aquagait");
	}
}
