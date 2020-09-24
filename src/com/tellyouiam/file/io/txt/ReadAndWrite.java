package com.tellyouiam.file.io.txt;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAndWrite {
	public static void main(String[] args) throws IOException {
		String data = new String(Files.readAllBytes(Paths.get("C:\\Users\\conta\\OneDrive\\Desktop\\myob\\Logbasex-ChartOfAccounts-2020.txt")));
		data = data.replaceAll("\t", ",");
	
		//common io
		FileUtils.writeStringToFile(new File("C:\\Users\\conta\\OneDrive\\Desktop\\myob\\chartOfAccounts.csv"), data, StandardCharsets.UTF_8);
		
	}
}
