package com.hackerrank.problemSolutions.algorithms.easy.viralAdvertising;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the viralAdvertising function below.
	static int viralAdvertising(int day) {
		int cumulative = 0;
		int received   = 5;
		
		for(int i=0; i<=day; i++) {
			received /= 2;
			cumulative += received; 
			received *= 3;
			
		}
		
		
		return cumulative;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int result = viralAdvertising(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
