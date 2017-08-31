package com.wealth.certificate.dumps_1z0_809.question017;

interface Rideable {
	Car getCar (String name); 
}

public class Car {	
	
	private String name;
	
	public Car () {
		System.out.println("no-args: "+name);
	}
	
	public Car (String name) {
		this.name = name;
		System.out.println("Constructor: "+name);
	}

}
