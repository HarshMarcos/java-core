package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05d {
	
	public static String replaceSpaces(String a) {
        
        a = a.trim();
        
        
        StringBuilder sb = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a;
		a = scanner.nextLine();
		scanner.close();
		
		System.out.println(replaceSpaces(a));
	}
}
