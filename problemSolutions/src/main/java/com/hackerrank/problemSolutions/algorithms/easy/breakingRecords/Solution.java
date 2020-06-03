package com.hackerrank.problemSolutions.algorithms.easy.breakingRecords;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	int maxValue = scores[0];
    	int minValue = scores[0];
    	int countMaxValue = 0;
    	int countMinValue = 0;
    	
    	
    	for (int index = 1; index < scores.length; index++) {
			int number = scores[index];
			
			if(maxValue > number) {
				maxValue = number;
				countMaxValue++;
			}
			
			if(minValue < number) {
				minValue = number;
				countMinValue++;
			}			
		}
    	
    	return new int[] {countMinValue, countMaxValue};

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
        
       for (int i : result) {
    	   System.out.print(i+" ");
       }
        
        

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
