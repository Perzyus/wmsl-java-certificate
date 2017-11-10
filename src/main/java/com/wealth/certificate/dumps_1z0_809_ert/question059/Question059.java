package com.wealth.certificate.dumps_1z0_809_ert.question059;

import java.util.Arrays;
import java.util.List;

public class Question059 {
	public static void main(String[] args) {
		List<String> nums = Arrays.asList("EE" , "SE", "SS");
		String ans = nums
//				.parallelStream ()
				.stream()
				.parallel()
				.reduce("Java", (a,b) -> { 
											System.out.print("A: "+a);
											System.out.println(" -- B: "+b);
										return a.concat(b);}) ;
		System.out.print(ans) ;
	}
}
