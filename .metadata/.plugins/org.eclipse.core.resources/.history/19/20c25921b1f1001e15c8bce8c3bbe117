package com.learning.core.day1session1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class D01P04 {
	
	
	public static void bingoNumber() {
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		int[] array = {7, 25, 5, 19, 30};
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		boolean num1 = false;
		boolean num2 = false;
		
		for(int i=0; i < array.length; i++) {
			if(array[i] == a) {
				num1 = true;
			}
			if(array[i] == b) {
				num2 = true;
			}
		}
		
		if (num1 && num2) {
            System.out.println("Its Bingo");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
		
	}
	
	public static void arrayOperations() {
		 Scanner scanner = new Scanner(System.in);

	        // Create an array of 18 elements
	        int[] A = new int[18];

	        // Prompt the user to enter the elements of the array
	        System.out.println("Enter 18 integers:");
	        for (int i = 0; i < A.length; i++) {
	            A[i] = scanner.nextInt();
	        }

	        // Compute the sum of elements from index 0 to 14 and store it at element 15
	        int sum = 0;
	        for (int i = 0; i < 15; i++) {
	            sum += A[i];
	        }
	        A[15] = sum;

	        // Compute the average of all numbers and store it at element 16
	        double average = (double) sum / A.length;
	        A[16] = (int) average;

	        // Identify the smallest value from the array and store it at element 17
	        int min = A[0];
	        for (int i = 1; i < A.length - 1; i++) {
	            if (A[i] < min) {
	                min = A[i];
	            }
	        }
	        A[17] = min;

	        // Display the elements of the array
	        System.out.println("Array elements after computations:");
	        for (int i = 0; i < A.length; i++) {
	            System.out.print(A[i] + " ");
	        }

	        scanner.close();
	}
	
	public static void firstRepeatingElementIndex() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minIndex = -1;
        int minelement = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    minIndex = i;
                    minelement = arr[i];
                    break;
                }
            }
            if (minIndex != -1) {
                break;
            }
        }
       
        System.out.println("Minimum Element: " + minelement + " " + "Minimum Index: " + minIndex);

        scanner.close();
    }
	
	public static void combinations() {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter the size of array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        
	        System.out.println("Enter elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        int k;
	        System.out.print("Enter value of k: ");
	        k = scanner.nextInt();

	        if (k > arr.length) {
	            return;
	        }
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if ((i != j) && (j - i == k - 1)) {
	                    System.out.println(arr[i] + " " + arr[j]);
	                }
	            }
	        }

	        scanner.close();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		bingoNumber();
//		arrayOperations();
//		firstRepeatingElementIndex();
		combinations();
	}

}
