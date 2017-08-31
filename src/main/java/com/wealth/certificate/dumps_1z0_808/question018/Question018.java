package com.wealth.certificate.dumps_1z0_808.question018;

class X {
	int x1 , x2 , x3;
	X() {
		System.out.println("X");
	}
}

class Y extends X {
	int y1;
	Y() {
		System.out.println("Z");
		x1 = 1;
		x2 = 2;
		y1 = 10;
	}
}

class Z extends Y {
	int z1;
	Z() {
		System.out.println("Y");
		x1 = 3;
		y1 = 20;
		z1 = 100;
	}
}

public class Question018 {
	public static void main(String[] args) {
		Z obj = new Z();
		System.out.println("MAIN");
		System.out.println(obj.x3 + ", " + obj.y1 + ", " + obj.z1);
	}
}
