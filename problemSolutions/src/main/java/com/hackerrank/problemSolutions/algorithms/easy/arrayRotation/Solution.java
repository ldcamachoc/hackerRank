package com.hackerrank.problemSolutions.algorithms.easy.arrayRotation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    	int arr[] = new int[a.length];
		
//    	String string1 = "";
//    	String string2 = "";
    	
        for(int i=0 ; i<a.length ; i++) {
//        	int sum = i + k;
//        	string1 += sum+ " ";
//        	
//        	int mod = sum % a.length;        	
//        	string2 += mod+ " ";     
        	
            arr[(i+k) % a.length] = a[i];
        }
        
//        System.out.println(string1);
//        System.out.println(string2);
        
        
        for(int i=0 ; i<queries.length ; i++) {
            queries[i] = arr[queries[i]];
       }
							
        return queries;    


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);
        
        
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < result.length; i++) {
        	builder.append(String.valueOf(result[i]));

            if (i != result.length - 1) {
            	builder.append("\n");
            }
        }
        
        System.out.println(builder.toString());

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
