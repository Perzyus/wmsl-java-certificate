package com.wealth.certificate.exam_1z0_808.question006.copy;
//import com.wealth.certificate.exam_1z0_808.question006.*; // set 1
//import static com.wealth.certificate.exam_1z0_808.question006.Shirt.getColor; // set 2
class Jean {

	public void doStuff() {
		// n2

//		String color = Shirt.getColor(); // set 1
//		String color = getColor();	// set 2
		if (color.equals("Green")) {
			System.out.println("Match");
		}
	}

}

class Test2 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.doStuff();
	}
}

