package com.hackerrank.problemSolutions.algorithms.easy.betweentwosets;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    	int start = a.get(a.size()-1);
    	int end   = b.get(0);
    	int countNumberFactor =0;
    	
    	for (int i = start; i <= end; i++) {
			int count =0;
			for (int j = 0; j < b.size(); j++) {
				int numberInB= b.get(j);
				if(numberInB % i == 0) {
					count++;
				}				
			}
			
			if(count == b.size()) {
				int count2 = 0;
				for (int k = 0; k < a.size(); k++) {
					int numberInA  = a.get(k);
					if( i % numberInA == 0) {
						count2++;
					}
					
					if(count2 == a.size()) {
						countNumberFactor++;
					}
				}				
			}
			
		}   	
    	
    	
    	
    	
    	return countNumberFactor;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);
        System.out.println(total);
        
//        bufferedWriter.write(String.valueOf(total));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
