package com.wealth.certificate.dumps_1z0_808.question206;

public class DerivedB extends DerivedA {
	public void test() {
		System.out.println("DerivedB from Base");
	}
	public void testA() {
		System.out.println("DerivedB from A");
	}
	public void testB() {
		System.out.println("DerivedB ");
	}
	public static void main(String[] args) {
//		Base b1 = new DerivedB();
//		Base b2 = new DerivedA();
//		Base b3 = new DerivedB();
//		b1 = (Base) b3;
//		
//		Base b4 = (DerivedA) b3;
//		b1.test();
//		b4.test();
		
		
//		Base baseforB;
//		Base baseNewB = new DerivedB();
//		baseforB = (Base)baseNewB;
//		baseforB.test();
//		
//		Base baseforA1;
//		Base baseNewA = new DerivedA();
//		baseforA1 = (Base)baseNewA;
//		baseforA1.test();
//		
//		DerivedA baseforA2;
//		baseforA2 = (DerivedB)baseNewA;
//		baseforA2.testA();
		
		
		Base base = new Base();
		base.test();
//		base = (DerivedA)base;		// java.lang.ClassCastException
//		base = (DerivedB)base;		// java.lang.ClassCastException
		
		System.out.println("-----------------------");
		
		Base baseA = new DerivedA();
		baseA.test();
		
		baseA = (Base)baseA;
		baseA.test();
		
		baseA = (DerivedA)baseA;
		baseA.test();
		
//		baseA = (DerivedB)baseA;		// java.lang.ClassCastException
//		baseA.test();
		
		
		System.out.println("-----------------------");
		
		Base baseB = new DerivedB();
		baseB.test();
		
		baseB = (Base)baseB;
		baseB.test();
		
		baseB = (DerivedA)baseB;
		baseB.test();
		
		baseB = (DerivedB)baseB;
		baseB.test();
		
		System.out.println("-----------------------");
		
		DerivedA derA = new DerivedA();
		derA.test();
		derA.testA();
		
//		derA = (DerivedB)derA;	// java.lang.ClassCastException
		derA = new DerivedB();	
		derA.test();
		derA.testA();
		
		System.out.println("-----------------------");
		
		DerivedB derB = new DerivedB(); 
		derB.test();
		derB.testA();
		derB.testB();
		
//		derB = (DerivedB) new DerivedA();	// java.lang.ClassCastException
//		derB = (DerivedB) new Base();	// java.lang.ClassCastException
		
		// SubClass cannot new SupperClass
		// - new <SuperClass()>;
		// - (<Self>) new <SuperClass()>;
		
//		SupperClass can new all of SubClass
//		and can use Override method ()
		
		
		
		
	}

}

class Base {
	public void test() {
		System.out.println("Base ");
	}
}

class DerivedA extends Base {
	public void test() {
		System.out.println("DerivedA from Base");
	}
	
	public void testA() {
		System.out.println("DerivedA ");
	}
}
