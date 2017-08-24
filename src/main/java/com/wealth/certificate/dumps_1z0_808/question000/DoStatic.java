package com.wealth.certificate.dumps_1z0_808.question000;

public class DoStatic {

	{
		x = 20;
		System.out.println("block 1: " + x);

	}

	static {
		System.out.println("Static block 1");

	}

	static {
		x = 10;
		System.out.println("Static block 2 : ");
	}

	{
		x = 50;
		System.out.println("block 2: " + x);
	}

	public static int x;
	
	static void dis() {
		System.out.println("sss");
	}
	
	void dis1() {
		System.out.println("s1");
	}
}
