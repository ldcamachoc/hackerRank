package com.hackerrank.problemSolutions.algorithms.warmup.compareTheTriplets;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	Iterator<Integer> iter1 = a.iterator();
    	Iterator<Integer> iter2 = b.iterator();
    	int result1 = 0;
    	int result2 = 0;
    	List<Integer> listResults = new ArrayList<>();
    	
    	while(iter1.hasNext() && iter2.hasNext()) {
    		Integer value1 = iter1.next();
    		Integer value2 = iter2.next();
    		
    		if(value1 > value2) {
    			result1 ++;
    		}else if(value1 < value2){
    			result2 ++;
    		}
    	}
    	
    	listResults.add(result1);
    	listResults.add(result2);
    	
    	return listResults;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);
        result.forEach(x -> System.out.println(x));

//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//            + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
