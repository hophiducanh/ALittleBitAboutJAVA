package com.tellyouiam.file.io.csv.opencsv;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Visitors {
	
	@CsvBindByName
	private String firstName;
	
	@CsvBindByName
	private String lastName;
	
	@CsvBindByName
	private int visitsToWebsite;
}
