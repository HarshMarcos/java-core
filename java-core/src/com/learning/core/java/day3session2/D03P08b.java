package com.learning.core.java.day3session2;

import java.util.HashMap;
import java.util.Scanner;

public class D03P08b {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("Amal", "9987878223");
		hm.put("Manvitha", "937843978");
		hm.put("Joseph", "937843978");
		hm.put("Smith", "938734978");
		hm.put("Kathe", "930000078");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = scanner.nextLine();
		if(hm.containsKey(name)) {
			String number = hm.get(name);
			System.out.println(number);
		}else {
			System.out.println("No Phone Found for "+name);
		}
		scanner.close();
	}

}
