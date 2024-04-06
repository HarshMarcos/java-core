package com.learning.core.java.day3session2;

import java.util.Map;
import java.util.TreeMap;

public class D03P08h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeMap<Double, Car> carMap = new TreeMap<>();

		 	carMap.put(80050.0, new Car("Bugatti", 80050.0));
	        carMap.put(305000.0, new Car("Swift", 305000.0));
	        carMap.put(600100.0, new Car("Audi", 600100.0));
	        carMap.put(900000.0, new Car("Benz", 900000.0));

	        Map.Entry<Double, Car> greatestEntry = carMap.pollLastEntry();
//	        System.out.println(greatestEntry.getValue());

	        double keyToReplace = 80050.0;
	        carMap.replace(keyToReplace, new Car("Reva", keyToReplace));
	        System.out.println(carMap.get(keyToReplace));
	}

}
