package com.tellyouiam.file.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

//Read this value: 1.16422E+11
//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
public class ReadExponentialValue {
	
	private static String readLineByLineJava8 (String filePath) {
		StringBuilder contentBuilder = new StringBuilder();
		
		try (Stream<String> stream = Files.lines(Paths.get(filePath),StandardCharsets.UTF_8))
		{
			stream.forEach(s -> contentBuilder.append(s).append("\n"));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return contentBuilder.toString();
	}
	
	public static void main(String[] args) {
		//if column type is general >> it's work fine, another type doesn't guarantee.
		String path = "C:\\Users\\conta\\OneDrive\\Desktop\\data\\t.csv";
		System.out.println(readLineByLineJava8(path));
	}
}
