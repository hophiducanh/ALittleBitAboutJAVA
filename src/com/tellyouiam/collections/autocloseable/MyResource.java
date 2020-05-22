package com.tellyouiam.collections.autocloseable;

public class MyResource implements AutoCloseable {
	//https://ajayiyengar.com/2020/05/09/java-autocloseable-how-does-it-work/
	public void openConnection(){
		System.out.println("Opening expensive resource...");
	}
	
	public static void main(String[] args) throws Exception{
		
		try(MyResource myResource = new MyResource()){
			myResource.openConnection();
		}
	}
	
	//call open connection outside try with resource doesn't invoke close() method
	public static void main1(String args[]) {
		MyResource myResource = new MyResource();
		myResource.openConnection();
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Releasing expensive resource...");
	}
}
