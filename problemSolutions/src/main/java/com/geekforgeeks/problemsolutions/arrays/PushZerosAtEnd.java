package com.geekforgeeks.problemsolutions.arrays;

public class PushZerosAtEnd {
	
	static void pushZerosToEnd(int arr[], int size) {
		int count = 0;
		
		for (int index = 0; index < size; index++) {
			if(arr[index] != 0) {
				arr[count++] = arr[index];
			}
		}
		
		printArray(arr);
		
		while(count < size) {
			arr[count++] = 0;
		}
	}
	
	public static void main (String[] args) 
    { 
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        printArray(arr);
        int n = arr.length; 
        pushZerosToEnd(arr, n); 
        System.out.println("Array after pushing zeros to the back: "); 
        printArray(arr); 
    } 
	
	private static void printArray(int arr[]) {
		 for (int i=0; i<arr.length; i++) 
	            System.out.print(arr[i]+" "); 
		 System.out.println();
	}
}
