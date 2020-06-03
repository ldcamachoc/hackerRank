package com.geekforgeeks.problemsolutions.others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicInteger;

public class Priorities {
	
	public static void main(String[] args) {
		//int[] array = new int[]{10, 5, 10, 2, 3, 4};
		int[] array = new int[]{15, 6, 12, 20, 21, 4, 5,6,15,20,1,7,8};
		int[] arrayCopy = Arrays.copyOf(array, array.length);
		
		Arrays.sort(arrayCopy); // --> 2,3,4,5,10,10
		Map<Integer, Integer> priorities = new HashMap<>();
		AtomicInteger integer = new AtomicInteger(1);
		
		for (int index = 0; index < arrayCopy.length; index++) {
			int actualValue       = arrayCopy[index];			
			
			if(priorities.containsKey(actualValue)) {
				
			}else {
				priorities.put(actualValue, integer.getAndAdd(1));
			}			
		}
		
		
		StringJoiner originalStringArray = new StringJoiner(",", "{", "}");
		StringJoiner priorityStringArray = new StringJoiner(",", "{", "}");
		for (int actualOriginValue : array) {
			originalStringArray.add(actualOriginValue+"");
			priorityStringArray.add(priorities.get(actualOriginValue)+"");			
		}
		
		System.out.println(originalStringArray.toString());
		System.out.println(priorityStringArray.toString());
		
		
	}

}

//class Priority {
//	private int priority;
//	private int value;
//	
//	public Priority(Integer priority, Integer value) {
//		this.priority = priority;
//		this.value = value;
//	}
//	
//	public int getPriority() {
//		return priority;
//	}
//	
//	public int getValue() {
//		return value;
//	}
//	
//	
//}

