package com.learning.core.java.day3session1;

import java.util.ArrayList;
import java.util.Scanner;

public class D03P07a {
	
	
	public static void searchStudents(){
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Add Name");
		while(true) {
			String name = scanner.nextLine();
			if(name.equals("done"))
				break;
			al.add(name);		
		}
		
		System.out.println("Search Name: ");
		String searchName = scanner.nextLine();
		if(al.contains(searchName)) {
			System.out.println(searchName + " Found");
		}else {
			System.out.println( searchName +" Does not exist");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searchStudents();
	}

}
