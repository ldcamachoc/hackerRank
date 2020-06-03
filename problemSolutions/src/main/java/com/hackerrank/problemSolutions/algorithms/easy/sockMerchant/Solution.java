package com.hackerrank.problemSolutions.algorithms.easy.sockMerchant;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {    	
    	   	    	
    	Map<Integer, Long> mappingData = Arrays
    			.stream(ar)
    			.boxed()    				
    			.collect(Collectors.groupingBy(x ->x, Collectors.counting()));
    	
//    	System.out.println(mappingData);
    	
    	int total = mappingData
    			.entrySet()
    			.stream()
    			.filter(entry -> entry.getValue() > 1)
    			.map( entry -> (int)Math.floorDiv( entry.getValue(), 2 ) )
    			.reduce(0, Integer::sum);
    	
//    	System.out.println(total);
    	
    	return total;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
