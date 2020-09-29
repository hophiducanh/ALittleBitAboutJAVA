package com.tellyouiam.encrypt.md5;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//https://www.baeldung.com/java-md5
//https://stackjava.com/demo/md5-la-gi-code-vi-du-md5-voi-java.html
public class Example {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String password = "Logbasex";
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		String myHash = DatatypeConverter.printHexBinary(md.digest())
				.toUpperCase();
		System.out.println("myHash = " + myHash);
	}
}
