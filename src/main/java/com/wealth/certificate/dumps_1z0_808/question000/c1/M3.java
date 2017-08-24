package com.wealth.certificate.dumps_1z0_808.question000.c1;

import com.wealth.certificate.dumps_1z0_808.question000.Motorcycle;

public class M3 extends Motorcycle{
	public static void main(String[] args) {
		Motorcycle m = new Motorcycle();
		m.displayProtected();
		m.displayPublic();
//		m cannot access through displayPrivatePackage()
	}
	

}
