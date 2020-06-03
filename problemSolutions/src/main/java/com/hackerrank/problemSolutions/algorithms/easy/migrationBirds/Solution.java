package com.hackerrank.problemSolutions.algorithms.easy.migrationBirds;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
//    	Map<Integer, Long> mappingData = 
//    			arr.stream()
//    			.collect(Collectors.groupingBy(w -> w, Collectors.counting()));
//    	
//    	System.out.println(mappingData);
//    	int minMaxValue = Collections.max(
//    			mappingData.values()
//    				.stream()
//    				.map(Long::intValue)    				
//    				.collect(Collectors.toList()));
//    	System.out.println(minMaxValue);
//    	int keyMinMaxValue = 0;
//    	
//    	for (Entry<Integer, Long> entrySet: mappingData.entrySet()) {
//			if(entrySet.getValue().intValue() == minMaxValue) {
//				keyMinMaxValue = entrySet.getKey();
//				break;
//			}
//		}
    	
    	Map<Integer, Long> mappingData = 
    			arr.stream()
    			.collect(Collectors.groupingBy(x ->x, Collectors.counting()));    	
    	
    	System.out.println(mappingData);
    	
    	long max = mappingData.values().stream().max(Comparator.naturalOrder()).get().longValue();
    	System.out.println(max);
    	
    	int key  = mappingData.entrySet().stream()
    			.filter(e -> e.getValue().longValue() == max)    		
    			.map(Map.Entry::getKey)
    			.findFirst()
    			.get();
    			
    		
    	
    	return key;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}

