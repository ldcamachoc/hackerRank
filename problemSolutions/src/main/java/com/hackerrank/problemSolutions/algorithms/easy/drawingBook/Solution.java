package com.hackerrank.problemSolutions.algorithms.easy.drawingBook;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int page1 = Math.abs(p / 2);
        
        if( n % 2 == 0) {
        	n++;
        }
        
        System.out.println(page1);
    	
        int page2 = Math.abs( (p - n) / 2);
        
        System.out.println(page2);

        return page1 < page2 ? page1 : page2;   	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
