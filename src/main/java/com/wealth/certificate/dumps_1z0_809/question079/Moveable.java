package com.wealth.certificate.dumps_1z0_809.question079;

// This Class is FunctionalInterface
public interface Moveable<Integer> {	
	
	public default void walk(Integer distance) {System.out.println("Walking");}		// this is a default method and implemented

	public void run(Integer distance);	
	
	//public Integer run(Integer distance);
}