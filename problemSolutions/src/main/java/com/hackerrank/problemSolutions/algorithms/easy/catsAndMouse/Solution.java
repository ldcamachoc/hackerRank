package com.hackerrank.problemSolutions.algorithms.easy.catsAndMouse;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    	
    	String result = "";   	
    	
    	int resultX = 0;
    	int resultY = 0;
    	
    	if(z > x) {
    		resultX = Math.abs(z - x);
    	}else {
    		resultX = Math.abs(x - z);
    	}
    	
    	if(z > y) {
    		resultY = Math.abs(z - y);
    	}else {
    		resultY = Math.abs(y - z);
    	}
    	
    	if(resultX == resultY) {
    		result = "Mouse C";
    	}else if(resultX < resultY) {
    		result = "Cat A";
    	}else {
    		result = "Cat B";
    	}
    	
    	return result;

    }
    
	

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	StringBuilder result = new StringBuilder();
    	
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            result.append((catAndMouse(x, y, z))) ;
            result.append("\n");
            
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }
        System.out.print(result);

//        bufferedWriter.close();

        scanner.close();
    }
}
