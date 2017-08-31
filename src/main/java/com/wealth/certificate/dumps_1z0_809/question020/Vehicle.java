package com.wealth.certificate.dumps_1z0_809.question020;

class Vehicle {
	int distance;// line n1

//	static class CarStatic {
//		int value = 0;
//		
//		static class CarStaticInner {
//			int value = 0;
//		}
//		
//		class CarInner {
//			int value = 0;
//		}
//	}
//	
//	class CarMember {
//		int value = 0;
//				
//		class CarMemberInner {
//			int value = 0;
//		}
//	}
	
	
	Vehicle(int x) {
		this.distance = x;
	}

	public void increSpeed(int time) {// line n2
		int timeTravel = time;// line n3		// Effectively final >>  ถ้าจะเอาไปใช้ใน Inner Class จะเป็น final ทันทีและ assign ค่าใหม่ไม่ได้  

//		new CarStatic().new CarInner();
//		new CarMember().new CarMemberInner();
		
		class Car {
			int value = 0;

			public void speed() {
				value = distance / timeTravel;
				System.out.println("Velocity with new speed" + value + "kmph");
			}
		}
		
		new Car().speed();
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle(100);
		v.increSpeed(60);
	}
}

/*
What is the result?
A. Velocity with new speed <-- Velocity with new speed1kmph
B. A compilation error occurs at line n1.
C. A compilation error occurs at line n2.
D. A compilation error occurs at line n3.

Answer: A
*/
