package com.hackerrank.problemSolutions.algorithms.warmup.timeconversion;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		String pattern = "hh:mm:ssa";
		String endPattern = "HH:mm:ss";

		DateTimeFormatter formatterInitial = DateTimeFormatter.ofPattern(pattern);
		LocalTime localTime = LocalTime.parse(s, formatterInitial);
		DateTimeFormatter formatterFinal = DateTimeFormatter.ofPattern(endPattern);

		return localTime.format(formatterFinal);

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);
		System.out.println(result);

//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
	}
}