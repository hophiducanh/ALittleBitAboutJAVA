package com.tellyouiam.java8.enums.operations;

public class Pizza {

	// TODO
	//https://www.baeldung.com/a-guide-to-java-enums#using-enum-types-in-switch-statements
	//https://stackoverflow.com/questions/4709175/what-are-enums-and-why-are-they-useful
	private PizzaStatus status;
	public enum PizzaStatus {
		ORDERED (5){
			@Override
			public boolean isOrdered() {
				return true;
			}
		},
		READY (2){
			@Override
			public boolean isReady() {
				return true;
			}
		},
		DELIVERED (0){
			@Override
			public boolean isDelivered() {
				return true;
			}
		};
		
		private int timeToDelivery;
		
		public boolean isOrdered() {return false;}
		
		public boolean isReady() {return false;}
		
		public boolean isDelivered(){return false;}
		
		public int getTimeToDelivery() {
			return timeToDelivery;
		}
		
		PizzaStatus (int timeToDelivery) {
			this.timeToDelivery = timeToDelivery;
		}
	}
	
	public boolean isDeliverable() {
		return this.status.isReady();
	}
	
	public void printTimeToDeliver() {
		System.out.println("Time to delivery is " +
				this.getStatus().getTimeToDelivery());
	}
	
	public PizzaStatus getStatus() {
		return status;
	}
	
	public void setStatus(PizzaStatus status) {
		this.status = status;
	}
	
	public static void main(String[] args) {
		Pizza testPz = new Pizza();
		testPz.setStatus(Pizza.PizzaStatus.READY);
		System.out.println(testPz.isDeliverable());
	}
}
