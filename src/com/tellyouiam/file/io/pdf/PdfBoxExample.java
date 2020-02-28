package com.tellyouiam.file.io.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

//https://www.javatpoint.com/pdfbox-extracting-phone-number
public class PdfBoxExample {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\conta\\OneDrive\\Desktop\\data\\POB-467-Swettenham Stud\\Data to import\\master-data\\Horse Categories.pdf"); //image can't read.
		PDDocument doc = PDDocument.load(file);
		
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		
		String text = pdfTextStripper.getText(doc);
		System.out.println(text);
	}
}
