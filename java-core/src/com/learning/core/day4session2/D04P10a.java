package com.learning.core.day4session2;

import java.util.Scanner;

public class D04P10a {

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
		
		quickSort(array, 0, n-1);
		System.out.println("Sorted Array");
		scanner.nextLine();
		for(int x:array) {
			System.out.println(x + " ");
		}
		
	}
	
	public static void quickSort(int[] array, int low, int high) {
		if(low < high) {
			int pi = partition(array, low, high);
			
			quickSort(array, low, pi-1);
			quickSort(array, pi+1, high);
		}
	}

	private static int partition(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = array[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++) {
			if(array[j] <= pivot) {
				i++;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
		return i + 1;
	}

}
