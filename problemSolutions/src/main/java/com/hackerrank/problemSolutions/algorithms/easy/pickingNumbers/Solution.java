package com.hackerrank.problemSolutions.algorithms.easy.pickingNumbers;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Result {

	/*
	 * Complete the 'pickingNumbers' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int pickingNumbers(List<Integer> a) {
		Collections.sort(a);

		int[] count = new int[a.size() - 1];

		for (int i = 0; i < a.size() - 1; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(a.get(i));
			for (int j = i + 1; j < a.size(); j++) {
				if (Math.abs(a.get(i) - a.get(j)) == 0 || Math.abs(a.get(i) - a.get(j)) == 1) {
					arr.add(a.get(j));
				}

			}
			count[i] = arr.size();
		}
		Arrays.sort(count);
		return count[count.length - 1];

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		int result = Result.pickingNumbers(a);
		System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

		bufferedReader.close();
//        bufferedWriter.close();
	}
}
