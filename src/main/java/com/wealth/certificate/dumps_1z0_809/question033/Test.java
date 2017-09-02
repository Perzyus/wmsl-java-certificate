package com.wealth.certificate.dumps_1z0_809.question033;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("/Pics//pac//MyPic.jpeg");
		
//		System.out.println(p1.getNameCount() + " : " + p1.getName(1) +" : " + p1.getFileName());
		System.out.println(p1.getNameCount());
		System.out.println(p1.getName(0));
		System.out.println(p1.getFileName());
		
		System.out.println(p1.getRoot());
		System.out.println(p1.getParent());
		
	}

}
