package com.tellyouiam.io;

import com.google.common.base.Stopwatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferAndUnBufferIO {
	/**
	 * @param file is a file which already exists and can be read.
	 */
	static public void readWithBuffer(File file) {
		try (Reader input = new BufferedReader(new FileReader(file))) {
			int data = 0;
			while ((data = input.read()) != -1) {
				System.out.println(data);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * @param file is an existing file which can be read.
	 */
	static public void readWithoutBuffer(File file) {
		try (Reader input = new FileReader(file)) {
			int data = 0;
			while ((data = input.read()) != -1) {
				System.out.println(data);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//https://ars.els-cdn.com/content/image/1-s2.0-S0092640X00908349-mmc02.txt
		//http://www.javapractices.com/topic/TopicAction.do?Id=122
		File file = new File("/home/logbasex/Desktop/example.txt");
		
		Stopwatch stopwatch = Stopwatch.createStarted();

		readWithBuffer(file);
		stopwatch.stop();
		System.out.println("With buffering: " + stopwatch);

		stopwatch.start();
		readWithoutBuffer(file);
		stopwatch.stop();
		System.out.println("Without buffering: " + stopwatch);
	}
}
