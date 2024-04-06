package com.learning.core.day3session2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class D03P08f {
	
	public static void main(String[] args) {
		TreeMap<Car, String> carDetails = new TreeMap<>(Comparator.reverseOrder());

        
        Car car1 = new Car("Buggati", 80050.0);
        Car car2 = new Car("Swift", 305000.0);
        Car car3 = new Car("Audi", 600100.0);
        Car car4 = new Car("Benz", 900000.0);

       
        carDetails.put(car1, "Luxury");
        carDetails.put(car2, "Super Car");
        carDetails.put(car3, "Premium");
        carDetails.put(car4, "Economy");

        
        for (Map.Entry<Car, String> entry : carDetails.entrySet()) {
            System.out.println(entry.getKey());
        }
	}
}
