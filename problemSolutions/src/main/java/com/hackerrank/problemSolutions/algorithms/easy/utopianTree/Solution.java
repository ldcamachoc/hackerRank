package com.hackerrank.problemSolutions.algorithms.easy.utopianTree;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
    	int res = 1, i;
    	for(i= 0; i<n;i++) {
    	    res = i%2 ==0 ? res*2 : res+1;
//    	    System.out.println(i+" - "+res);
    	}
    	return res;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        StringBuffer print = new StringBuffer();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);
            print.append(result);
            print.append("\n");
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }
        
        System.out.println(print.toString());

//        bufferedWriter.close();

        scanner.close();
    }
}

