package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05a {
	
	public static void vowels(String a, int n) {
		int vcount=0;
		for(int i=0; i < a.length(); i++) {
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
				vcount++;
			}
		}
		if(vcount > n) {
			System.out.println("Mismatch in Vowel Count");
			return;
		}
//		if(count == n) {
//			System.out.println("Vowel count matching");
//		}
		
		StringBuilder matchVowels = new StringBuilder();
		int count = 0;
		for(int i = a.length() - 1; i >= 0; i--) {
			char c = a.charAt(i);
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
				matchVowels.insert(0, c);
				count++;
				if(count == n) {
					break;
				}
			}
		}
		System.out.println(matchVowels.toString());
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String a;
		a = scanner.next();
		a.toLowerCase();
		int n;
		n = scanner.nextInt();
		scanner.close();
		vowels(a, n);
		
	}
}
