package com.tellyouiam.systems;

import java.io.Console;

public class SystemConsole {
	//https://www.baeldung.com/java-system-console-vs-system-out
	public static void main(String[] args) {
		Console console = System.console();
		//don't show password when I type it.
		char[] password = console.readPassword("Enter password: ");
		console.printf(String.valueOf(password));
	}
}