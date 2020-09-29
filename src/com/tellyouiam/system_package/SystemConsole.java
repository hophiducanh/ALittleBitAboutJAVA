package com.tellyouiam.system_package;

import org.apache.commons.collections4.MapUtils;

import java.io.Console;

public class SystemConsole {
	//https://stackoverflow.com/questions/4644415/java-how-to-get-input-from-system-console
	public static void main(String[] args) {
		Console console = System.console();
		System.out.print("Enter something:");
		if (console != null) {
			console.readLine();
		}
		
		MapUtils.verbosePrint(System.out, "ENV", System.getenv());
	}
}
