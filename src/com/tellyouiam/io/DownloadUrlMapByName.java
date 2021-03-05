package com.tellyouiam.io;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;

public class DownloadUrlMapByName {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader("urls.csv"));
		List<String> data = reader.lines().collect(Collectors.toList());
		data.forEach(i -> {
			String[] line = i.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
			String name = line[0];
			String urlStr = line[1];
			try(InputStream in = new URL(urlStr).openStream()){
				Files.copy(in, Paths.get(name), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
