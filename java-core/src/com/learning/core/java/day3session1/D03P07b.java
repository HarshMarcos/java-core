package com.learning.core.java.day3session1;

import java.util.HashSet;

public class D03P07b {
	
	public static void main(String[] args) {
		HashSet<Product> set = new HashSet<Product>();
		set.add(new Product("P001", "Maruti 800"));
		set.add(new Product("P002", "Maruti Zen"));
		set.add(new Product("P003", "Maruti Dezire"));
		set.add(new Product("P004", "Maruti Alto"));
		
		for(Product product : set) {
			System.out.println(product);
		}
	}
}
