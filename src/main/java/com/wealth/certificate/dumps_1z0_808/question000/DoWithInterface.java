package com.wealth.certificate.dumps_1z0_808.question000;

interface A {
	void doA();
}

interface B extends A {
	void doB();
}

class X {
	void methOfX ( ) {
		System.out.println("super X");
	}
}

class Y extends X{
	void methOfX() {
		System.out.println("override X");
	}
}

abstract class AbsZ extends X{
	abstract void methOfAbsZ ();
	void methOfAbsZNew () {
		System.out.println("absZ");
	}
}

abstract class AbsZX extends AbsZ implements A {
	abstract void methOfAbsZX();
}

class ZZ extends AbsZ {
	@Override
	void methOfAbsZ() {
		System.out.println("Override from abs class(AbsZ)");
	}
	
	void methOfAbsZNew () {
		System.out.println("sss");
	}
}

public class DoWithInterface extends AbsZX {
	public static void main(String[] args) {
//		X refX = new Y();
//		refX.methOfX();
//		
//		AbsZ absZ = new ZZ();
//		absZ.methOfAbsZNew();
		
		ZZ zz =  new ZZ();
		zz.methOfX();
		zz.methOfAbsZ();
		zz.methOfAbsZNew();
		
	}

	@Override
	void methOfAbsZ() {
		// TODO Auto-generated method stub
	}

	@Override
	public void doA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void methOfAbsZX() {
		// TODO Auto-generated method stub
		
	}
}