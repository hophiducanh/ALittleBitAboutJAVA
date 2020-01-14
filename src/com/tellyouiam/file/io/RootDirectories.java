package com.tellyouiam.file.io;

import java.io.File;

public class RootDirectories {
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root.getAbsolutePath());
		}
	}
}
