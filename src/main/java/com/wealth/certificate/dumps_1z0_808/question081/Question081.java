package com.wealth.certificate.dumps_1z0_808.question081;

public class Question081 {
	
	static char a;

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1 = s3;
		s3 = s2;
		s2 = null;
		
		System.out.println(a);
	}

}

class Student {
	String name;
	int age;
}
