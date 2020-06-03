package com.hackerrank.problemSolutions.algorithms.easy.angryProfesor;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
    	    	
    	long totalAsistence = Arrays.stream(a)
    		.boxed()
    		.filter(x -> x <= 0)
    		.count();    	
    	
    	return k <= totalAsistence ? "NO": "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        StringBuilder builder = new StringBuilder();

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            String result = angryProfessor(k, a);
            builder.append(result);
            builder.append("\n");
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }
        
        System.out.println(builder.toString());

//        bufferedWriter.close();

        scanner.close();
    }
}