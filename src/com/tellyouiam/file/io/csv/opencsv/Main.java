package com.tellyouiam.file.io.csv.opencsv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
	
	private static final String FOLDER_PATH = "C:\\Users\\conta\\OneDrive\\Desktop\\data\\test-data\\";
	
	public static void main(String[] args) throws IOException {
		try (
				Reader reader = Files.newBufferedReader(Paths.get(FOLDER_PATH.concat("opencsv-columnname.csv")));
		) {
			CsvToBean<Visitors> csvToBean = new CsvToBeanBuilder(reader)
					.withType(Visitors.class)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
			
			for (Visitors csvUser : csvToBean) {
				System.out.println(csvUser);
			}
		}
	}
}
