package com.geekforgeeks.problemsolutions.others;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Solution {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
	long[] longs = Arrays.stream(arr).asLongStream().toArray();

	Arrays.sort(longs);
	long sum = LongStream.of(longs).sum();

	long min = sum - longs[4];
	long max = sum - longs[0];

	System.out.println(min + " " + max);
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


