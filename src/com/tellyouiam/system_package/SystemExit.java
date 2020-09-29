package com.tellyouiam.system_package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SystemExit {
	//https://stackoverflow.com/questions/2434592/difference-in-system-exit0-system-exit-1-system-exit1-in-java
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
			System.out.println(br.readLine());
			br.close();
		} catch (IOException e) {
			System.exit(0);
		} finally {
			System.out.println("Exiting the program");
		}
		System.exit(2);
	}
}
