package com.tellyouiam.system_package;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemSetOut {
	//https://www.logicbig.com/how-to/code-snippets/jcode-java-system-setout.html
	public static void main(String[] args) {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(stream);
		PrintStream originalPrintStream = System.out;
		System.setOut(ps);
		System.out.println("Print something...");
		
		//set it back
		//standard output stream
		System.setOut(originalPrintStream);
		
		System.out.println("-- retrieving output from stream --");
		String output = new String(stream.toByteArray());
		System.out.println("> " + output);
	}
}
