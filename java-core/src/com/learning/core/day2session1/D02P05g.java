package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05g {
	
	public static int preSufflength(String str) {
		 int n = str.length();
	        int[] lps = new int[n];
	        lps[0] = 0;
	        int len = 0; // Length of the previous longest prefix suffix

	        int i = 1;
	        while (i < n) {
	            if (str.charAt(i) == str.charAt(len)) {
	                len++;
	                lps[i] = len;
	                i++;
	            } else {
	                if (len != 0) {
	                    len = lps[len - 1];
	                } else {
	                    lps[i] = 0;
	                    i++;
	                }
	            }
	        }

	        return lps[n - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String a;
		a = scanner.nextLine();
		scanner.close();
		System.out.println(preSufflength(a));
	}

}
