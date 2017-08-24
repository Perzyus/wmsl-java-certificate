package com.wealth.certificate.dumps_1z0_808.question000;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Do {

	public static void main(String[] args) {
		Boolean b1 = new Boolean(Boolean.valueOf("TruE"));
		System.out.println(Boolean.valueOf("TruE") instanceof Boolean);
		System.out.println(b1);
		
		InterfaceOne obj = new ImIn();
		obj.display();
	
		
		List<Vehicle> listV = new ArrayList<>();
		listV.add(new Motorcycle());
		
		
		System.out.println(LocalDate.of(2017, 8, 31).format(DateTimeFormatter.ISO_DATE_TIME));
		
		for (int i = 0; i < args.length; i++) {
//			String string = args[i];
			
			if (i == 0) {
				continue;
//				break;
			}
			else {
				
				break;
				
			}
			
			System.out.println();
		}
		
		
	}
}
