package com.tellyouiam.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadPoolExample {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for (int i =0; i<100; i++){
			service.submit(new Task(i));
		}
		
		//IntStream.rangeClosed(0,100).forEach(i -> service.submit(new Task(i)));
		
		service.shutdown();
	}
}
