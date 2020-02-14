package com.tellyouiam.file.io.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsGetMethod {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\conta\\OneDrive\\", "desktop", "data");
		System.out.println(path);
	}
}
