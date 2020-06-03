package com.geekforgeeks.problemsolutions.others;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		String[] strings = {"test","apple","zoo","hail","nature","bones"};
		printInSortedOrder(strings, strings.length);
	}
	
	public static void printInSortedOrder(String[] arr, int size) {
		int[] indexes = new int[size];
		int min=0;
		
		for(int index=0; index< size; index++) {
			indexes[index] = index;
		}
		
		for(int i=0; i< size-1; i++ ) {
			min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[indexes[min]].compareTo(arr[indexes[j]]) > 0) {
					min = j;
				}
			}
			
			if(min!=i) {
				int temp = indexes[min];
				indexes[min] = indexes[i];
				indexes[i] = temp;
			}
			
		}
		
		// printing strings in sorted order 
        for (int i = 0; i < size; i++) { 
            System.out.print(arr[indexes[i]] + " "); 
        } 

	}
	
	public static void printInSortedOrder(String[] strings) {
		Arrays.sort(strings);
		for (String string : strings) {
			System.out.println(string);
		}
	} 

}
