package com.wealth.certificate.dumps_1z0_809.question017;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Q17 {

	public static void main(String[] args) {
		
		//A
		//Car auto = Car ("MyCar")::new;		// ตัวหน้าจะต้องเป็น Class
		
		//B
		//Car auto = Car::new;	// Car จะต้องเป็น FunctionalInterface และจะรับด้วย Function<T, R>
		//Car vehicle = auto : : getCar("MyCar");
		/*
		Supplier<Car> sup = Car::new;
		Function<String, Car> func = Car::new;
		Consumer<String> cons = Car::new;
		Runnable runn = Car::new;
		
		Car car_1 = sup.get();
		Car car_2 = func.apply("Function");
		cons.accept("Consumner");
		runn.run();
		*/
		
		//C
		Rideable rider = Car::new;	// Rideable is FunctionalInterface
		Car vehicle = rider.getCar("MyCar");
		
		//D
//		Car vehicle = Rideable :: new :: getCar("MyCar");		// should be only one  " :: "
		
		Car car_1 = ((Function<String, Car>)(Car::new)).apply("from function");
		
		Car car_2 = ((Rideable)(Car::new)).getCar("from interface (FunctionalInterface)");
		
		Function<String, Car> funcLamb = c -> new Car(c);
		Car car_3 = funcLamb.apply("from Lambda");
		
		Rideable r1 = c -> new Car(c);
		Car car_4 = r1.getCar("from Interface assign with Lambda");
		
		System.out.println(car_1);
		System.out.println(car_2);
		System.out.println(car_3);
		System.out.println(car_4);
	}

}


/*

P. note

Rideable rider = Car::new;




*/

