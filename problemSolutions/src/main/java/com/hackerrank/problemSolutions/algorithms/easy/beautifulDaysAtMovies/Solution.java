package com.hackerrank.problemSolutions.algorithms.easy.beautifulDaysAtMovies;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, final int k) {
    	
    	 long finalResult = IntStream
    		.range(i, j+1)
    		.filter(index -> {
    			String reverse = new StringBuilder(String.valueOf(index)).reverse().toString();
    			int numberReverse = Integer.valueOf(reverse);
    			
    			double result = Math.abs(((double)index - numberReverse) / k);
    			
    			boolean isBeautifulDay = result % 1 == 0 ? true : false;
    			
    			return isBeautifulDay == true;
    			
    		}).count();
    	 
    	 return (int)finalResult;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

