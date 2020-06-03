package com.geekforgeeks.problemsolutions.arrays;

public class PushZeroAtFirstOneAtEnd {
	
	private static void pushOneToEnd(int arr[]) {
		
		int count = 0;
		
		for (int index = 0; index < arr.length; index++) {
			if(arr[index]!= 1) {
				arr[count++] = arr[index];
			}
		}
		
		while(count< arr.length) {
			arr[count++] = 1;
		}		
	}
	
	private static void pushZeroToEnd(int arr[]) {
		int lastNoOne = 0;
		
		for (int index = arr.length -1; index >= 0; index--) {
//			if( arr[index] == 1 ) {
//				continue;
//			}
			
			if(lastNoOne ==0) {

				lastNoOne = index;
			}
			
			if(arr[index] !=0) {
				arr[lastNoOne--] = arr[index];
			}
		}
		
		 printArray(arr); 
		
		while(lastNoOne >= 0) {
			arr[lastNoOne--] = 0; 
		}
		
	}
	
	// Driver code 
	public static void main(String args[]) 	{ 
	    int arr[] = { 1, 2, 0, 0, 0, 3, 6 }; 
//	    printArray(arr); 
//	    pushOneToEnd(arr); 
	    printArray(arr); 
	    pushZeroToEnd(arr);
	    printArray(arr);
	  
	} 
	
	
	
	private static void printArray(int arr[]) {
		 for (int i=0; i<arr.length; i++) 
	            System.out.print(arr[i]+" "); 
		 System.out.println();
	}

}
