package com.tellyouiam.file.io.csv.opencsv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try {
			List<Object> beans = new CsvToBeanBuilder<>(new FileReader("yourfile.csv"))
					.withType(Visitors.class).build().parse();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
