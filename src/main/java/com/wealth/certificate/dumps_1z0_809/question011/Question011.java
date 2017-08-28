package com.wealth.certificate.dumps_1z0_809.question011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question011 {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product(1, 10), new Product(2, 30), new Product(2, 30));
//		List<Product> products = new ArrayList<>();
		
		System.out.println(products);

		Product p = products.stream().reduce(new Product(4, 0), (p1, p2) -> {
			p1.price += p2.price;
			return new Product(p1.id, p1.price);
		});
		
//		System.out.println("P "+p);

//		products.add(p);
		
		// Accumulate

		products.stream().parallel().reduce((p1, p2) -> p1.price > p2.price ? p1 : p2).ifPresent(System.out::println);
	}

}
