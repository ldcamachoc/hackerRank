package com.geekforgeeks.problemsolutions.others;

import java.util.HashMap;
import java.util.Map;

public class FrecuencyNumbers {

	public static void main(String[] args) {
		int[] numbers = { 4, 6, 7, 8, 4, 2, 5, 5, 8, 8 };
		mostReapeated(numbers);
		
		// The solution itself
//		HashMap<Integer, Integer> repetitions = new HashMap<Integer, Integer>();
//		int max = numbers[0];
//		int result = 0;
		

//		for (int i = 0; i < numbers.length; ++i) {
//			int item = numbers[i];
//
//			if (repetitions.containsKey(item))
//				repetitions.put(item, repetitions.get(item) + 1);
//			else
//				repetitions.put(item, 1);
//			
//			if(numbers[i] > max) {
//				max = numbers[i];
//				result = i;
//			} 
//			
//		}
//
//		// Now let's print the repetitions out
//		StringBuilder sb = new StringBuilder();
//
//		int overAllCount = 0;
//
//		for (Map.Entry<Integer, Integer> e : repetitions.entrySet()) {
//			if (e.getValue() > 1) {
//				overAllCount += 1;
//
//				sb.append("\n");
//				sb.append(e.getKey());
//				sb.append(": ");
//				sb.append(e.getValue());
//				sb.append(" times");
//			}
//		}
//
//		if (overAllCount > 0) {
//			sb.insert(0, " repeated numbers:");
//			sb.insert(0, overAllCount);
//			sb.insert(0, "There are ");
//		}
//
//		System.out.println(sb.toString());
//		System.out.println("The max number repeated is: "+numbers[result]);

	}
	
	public static void mostReapeated(int[] numbers) {
		Map<Integer, Integer> mappingData = new HashMap<Integer, Integer>();
		int max = numbers[0];
		int result = 0;
		
		for (int index = 0; index < numbers.length; index++) {
			int number = numbers[index];
			
			if(mappingData.containsKey(number)) {
				mappingData.put(number, mappingData.get(number)+1);
			}else {
				mappingData.put(number, 1);
			}
			
			if(numbers[index] > max) {
				max = numbers[index];
				result = index;
			}
			      
		}
		
		mappingData.entrySet().stream().forEach(entry ->{
			System.out.println(entry.getKey()+":"+entry.getValue());
		});
		
		System.out.println("Max numer repeated:"+numbers[result]);
	}

}
