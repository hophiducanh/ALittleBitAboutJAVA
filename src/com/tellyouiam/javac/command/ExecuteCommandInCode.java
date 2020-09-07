package com.tellyouiam.javac.command;

import java.io.IOException;

//https://stackoverflow.com/questions/12402547/how-to-execute-javac-and-java-commands-from-java-program
public class ExecuteCommandInCode {
	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("javac");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
