package com.hackerrank.problemSolutions.algorithms.easy.gradestudents;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

class Resolution {

	/*
	 * Complete the 'gradingStudents' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY grades as parameter.
	 */

	public static List<Integer> gradingStudents(List<Integer> grades) {
		
		List<Integer> results = grades.stream().map(grade ->{
			
			int gradeRound = (grade + 4) / 5 * 5;
			int gradeResult = gradeRound - grade;
			int gradeFinal = 0;
			
			if(gradeResult < 3 && grade >=38) {
				gradeFinal = gradeRound;
			}else {
				gradeFinal = grade;
			}			
			
			return gradeFinal;
		}).collect(toList());
		
		
		return results;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		List<Integer> result = Resolution.gradingStudents(grades);
		
		result.forEach(grade -> System.out.println(grade));

//		bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
//		bufferedWriter.close();
	}

	private static List<Integer> gradingStudents(List<Integer> grades) {
		// TODO Auto-generated method stub
		return null;
	}
}