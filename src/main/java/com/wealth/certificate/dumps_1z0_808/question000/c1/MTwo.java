package com.wealth.certificate.dumps_1z0_808.question000.c1;

public class MTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbsOne absO = new MfromAbsOne();
		absO.displayTwo();
		absO.displayOne();

		AbsOne absO2 = new AbsOne() {
			
			@Override
			protected void displayTwo() {
				System.out.println("2");
				
			}
			
			@Override
			public void displayOne() {
				System.out.println("1");
				
			}
		};
		
		absO2.displayOne();
		absO2.displayTwo();
	}

}
