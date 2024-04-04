package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05 {
	
	public static boolean isPalindrome(String a) {
		int i = 0, j = a.length() - 1;
		while(i < j) {
			if(a.charAt(i) != a.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a;
		a = scanner.next();
		
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		
		scanner.close();
		if(isPalindrome(a)) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
	}
}
