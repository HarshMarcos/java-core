package com.learning.core.day4session2;

import java.util.Scanner;

public class D04P10b {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

      
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

       
        mergeSort(array, 0, size - 1);

        
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
           
            int mid = (left + right) / 2;

         
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);


            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
       
        int size1 = mid - left + 1;
        int size2 = right - mid;

       
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

       
        for (int i = 0; i < size1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < size2; ++j)
            rightArray[j] = array[mid + 1 + j];

       
        int i = 0, j = 0;

       
        int k = left;
        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        
        while (i < size1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        
        while (j < size2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}