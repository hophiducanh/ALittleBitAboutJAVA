package com.tellyouiam.file.io.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ConvertFileToByteArrayjava {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\conta\\OneDrive\\Documents\\opening_balance_test");
		try {
			byte[] bytes = Files.readAllBytes(file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
