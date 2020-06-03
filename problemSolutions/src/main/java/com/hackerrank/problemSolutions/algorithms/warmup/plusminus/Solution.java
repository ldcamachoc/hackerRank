package com.hackerrank.problemSolutions.algorithms.warmup.plusminus;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	AtomicInteger positives = new AtomicInteger(0);
    	AtomicInteger negatives = new AtomicInteger(0);
    	AtomicInteger zeros = new AtomicInteger(0);
    	double totalElements = arr.length;
    	
    	List<Integer> array = Arrays.stream(arr).boxed().collect(Collectors.toList());
    	
    	array.stream().forEach(number ->{
    		if(number >0) {
    			positives.getAndIncrement();
    		}else if(number < 0) {
    			negatives.getAndIncrement();
    		}else {
    			zeros.getAndIncrement();
    		}
    	});
    	
    	System.out.println(positives.get()/totalElements);
    	System.out.println(negatives.get()/totalElements);
    	System.out.println(zeros.get()/totalElements);
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
