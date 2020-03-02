package com.tellyouiam.concurrency;

public class Task implements Runnable {
	
	private int taskId;
	private int userId;
	
	Task(int id) {
		this.taskId = id;
	}
	@Override
	public void run() {
		System.out.println("Task ID : " + this.taskId + " performed by " + Thread.currentThread().getName());
	}
}
