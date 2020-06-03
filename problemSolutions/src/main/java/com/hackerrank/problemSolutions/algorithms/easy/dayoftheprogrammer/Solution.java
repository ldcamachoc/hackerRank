package com.hackerrank.problemSolutions.algorithms.easy.dayoftheprogrammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {

	// Complete the dayOfProgrammer function below.
	static String dayOfProgrammer(int year) {
		int numberDays = 0;

		if (year < 1700 && year > 2700) {
			return "";
		} else if (year >= 1700 && year <= 1917) {
			if (year % 4 == 0) {
				numberDays = 244;
			} else {
				numberDays = 243;
			}
		} else if (year >= 1919 && year <= 2700) {
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				numberDays = 244;

			} else {
				numberDays = 243;
			}
		}else if(year == 1918) {
			numberDays = 230;
		}

		int month = 9;
		int day = 256 - numberDays;

		LocalDate localDate = LocalDate.of(year, month, day);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		String dateString = localDate.format(formatter);

		return dateString;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int year = Integer.parseInt(bufferedReader.readLine().trim());

		String result = dayOfProgrammer(year);
		System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

		bufferedReader.close();
//        bufferedWriter.close();
	}
}
