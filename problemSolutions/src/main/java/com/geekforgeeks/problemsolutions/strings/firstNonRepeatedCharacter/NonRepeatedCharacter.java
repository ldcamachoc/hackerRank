package com.geekforgeeks.problemsolutions.strings.firstNonRepeatedCharacter;

import java.util.HashMap;
import java.util.Map.Entry;

public class NonRepeatedCharacter {

	private static HashMap<Character, CounterIndex> mapCharacterCounter = new HashMap<>();

	public static void main(String... args) {
		String str = "xgeeksxforxgeeksxx";
		int index = firstNonreapeting(str);
		
		System.out.println(index == Integer.MAX_VALUE ? "Either all characters are repeating " + 
	              " or string is empty" : "First non-repeating character is " +  str.charAt(index));
		
		int maxValue=0;
		int index2=0;
		
		for (Entry<Character, CounterIndex> entry: mapCharacterCounter.entrySet()) {
			if(entry.getValue().getCounter() > maxValue) {
				maxValue = entry.getValue().getCounter();
				index2 = entry.getValue().getIndex();
			}			
		}
		
		System.out.println(String.format("The most repeated character is %c with %d times", str.charAt(index2), maxValue));
		
	}

	private static int firstNonreapeting(String str) {
		populateCharacterCounterMap(str);
		
		int resultIndex =Integer.MAX_VALUE;
		
		for (int i = 0; i < str.length(); i++) {
			Character character = str.charAt(i);
			
			if(mapCharacterCounter.get(character).getCounter() == 1 && 
			   resultIndex > mapCharacterCounter.get(character).getIndex()){
			   resultIndex = mapCharacterCounter.get(character).getIndex();
			}
			
		}

		return resultIndex;
	}

	private static void populateCharacterCounterMap(String str) {

		for (int index = 0; index < str.length(); index++) {

			char character = str.charAt(index);

			if (mapCharacterCounter.containsKey(character)) {
				mapCharacterCounter.get(character).incrementCounter();
			} else {
				mapCharacterCounter.put(character, new CounterIndex(index));
			}
		}
	}
}

class CounterIndex {
	private int counter;
	private int index;

	CounterIndex(int index) {
		this.index = index;
		counter = 1;
	}

	public int incrementCounter() {
		return counter++;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String toString() {
		return ""+counter+":"+index;
	}
}
