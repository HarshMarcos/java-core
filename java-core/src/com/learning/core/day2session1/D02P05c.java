package com.learning.core.day2session1;

import java.util.Scanner;

//Problem Minimum number of deletion to make string palindrome
public class D02P05c {
	
	public static int minDeletionToPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return s.length() - dp[0][s.length() - 1];
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a;
		a = scanner.next();
		scanner.close();
		System.out.println(minDeletionToPalindrome(a));
	}
}
