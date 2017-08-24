package com.wealth.certificate.dumps_1z0_808.question000.c1;

import com.wealth.certificate.dumps_1z0_808.question000.InterfaceOne;

public class MfromAbsOne extends AbsOne implements InterfaceOne{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void displayMOne() {
		System.out.println("displayMOne");
	}

	@Override
	public void displayOne() {
		System.out.println("display from class that extended AbsOne");
	}

	@Override
	protected void displayTwo() {
		System.out.println("displayTwo from class that extended AbsOne");
	}

	@Override
	public void disInterface() {
		System.out.println("This method from InterfaceOne");
		
	}

	@Override
	public void displayInterface() {
		// TODO Auto-generated method stub
		
	}

}
