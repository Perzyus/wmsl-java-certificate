package com.wealth.certificate.dumps_1z0_808.question000.c1;

public class DoStaticC1 {

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
	
	public static void dis() {
		System.out.println("sss");
	}
	
	public void dis1() {
		System.out.println("s1");
	}
}
