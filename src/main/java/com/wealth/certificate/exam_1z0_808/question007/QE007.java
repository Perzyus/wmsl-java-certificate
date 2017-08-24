package com.wealth.certificate.exam_1z0_808.question007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QE007 {

	@SuppressWarnings("unchecked")
	public static void main(String args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		List list = Arrays.asList(arr);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("list: "+list.getClass());
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (Integer integer : list2) {
			System.out.println(integer);
		}
//		System.out.println(list2.size());
//		System.out.println(list2);
		
		System.out.println("list2: "+list2.getClass());
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		System.out.println("list3: "+list3.getClass());
 		list3.removeIf(p -> p % 3 == 0);
//		if(list.removeIf(e -> {return e.equals(list);}/*{
//			if (e % 2 == 0) {
//				return true;
//			} else {
//				return false;
//			}
//		}*/
//		));

	// answer : compile error

	}
	
	void  display() {
		
	}

}
