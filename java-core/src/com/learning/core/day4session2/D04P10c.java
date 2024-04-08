package com.learning.core.day4session2;

import java.util.Scanner;

public class D04P10c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<n;i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter element to search");
		int x = scanner.nextInt();
		int result = linearSearch(array, x);
		
		if(result != -1)
			System.out.println("Element is present");
		else
			System.out.println("Elemnet is not present");
	}

	private static int linearSearch(int[] array, int x) {
		// TODO Auto-generated method stub
		for(int i = 0; i < array.length; i++) {
			if(array[i] == x)
				return i;
		}
		return -1;
	}

}
