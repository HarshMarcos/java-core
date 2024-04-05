package com.learning.core.java.day3session1;

import java.util.HashSet;
import java.util.Scanner;

public class D03P07c {
	
	public static void main(String[] args) {
		HashSet<Product> set = new HashSet<Product>();
		set.add(new Product("P001", "Maruti 800"));
		set.add(new Product("P002", "Maruti Zen"));
		set.add(new Product("P003", "Maruti Dezire"));
		set.add(new Product("P004", "Maruti Alto"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Search Product here... ");
		String productId = scanner.nextLine();
		boolean found = false;
		
		for(Product product: set) {
			if(product.getProductId().equalsIgnoreCase(productId)) {
				System.out.println(product);
				found = true;
				break;
			}
			
		}
		if(!found)
			System.out.println("Product doest not exist with Id: "+productId);
		
	}
}
