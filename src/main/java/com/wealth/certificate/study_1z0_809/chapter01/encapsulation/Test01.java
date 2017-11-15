package com.wealth.certificate.study_1z0_809.chapter01.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Integer> list = new ArrayList<>(10);
		List<Integer> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		list.add(1, 100);
//		list.add(1000);

//		System.out.println(list.lastIndexOf(12000));
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.isEmpty());

	}

}
