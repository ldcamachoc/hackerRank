package com.hackerrank.problemSolutions.algorithms.easy.kangaroo;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	    	
    	if(v2 > v1 && x1 >= x2) {
    		return "NO";
    	}
    	
    	String result = "NO";
    	
    	int resultJumpA =x1;
    	int resultJumpB =x2;
    	
    	while(resultJumpB > resultJumpA) {
    		resultJumpA = resultJumpA + v1;
    		resultJumpB = resultJumpB + v2;
    		
    		if(resultJumpA == resultJumpB) {
    			result = "YES";
    		}
    		
    	}
    	
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
