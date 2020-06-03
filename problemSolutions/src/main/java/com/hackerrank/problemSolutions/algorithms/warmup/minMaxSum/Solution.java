package com.hackerrank.problemSolutions.algorithms.warmup.minMaxSum;

import java.util.Scanner;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	int totalElements = arr.length;
    	long minValue = 0;
    	long maxValue = 0;
    	
    	for (int i = 0; i < totalElements; i++) {
    		long sum = 0;
			for (int j = 0; j < totalElements; j++) {
				if(i == j) {
					continue;
				}else {
					sum += arr[j];
				}
			}	
			
			if(sum < minValue || i == 0) {
				minValue = sum;
			}
			
			if(sum > maxValue) {
				maxValue = sum;
			}			
		}
    	
    	System.out.println(minValue+" "+maxValue);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
