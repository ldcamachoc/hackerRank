package com.hackerrank.problemSolutions.algorithms.easy.designerPDFViewer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
    	Map<Character, Integer> mappingData = new HashMap<Character, Integer>();
    	
    	int index= 0;
    	
    	for(char character='a'; character <= 'z'; character++) {
    		mappingData.put(character, h[index]);
    		index++;
    	}    	
    	
    	int max = mappingData.get(word.charAt(0));    	
    	
    	for (char character: word.toCharArray()) {
			int valueCharacter= mappingData.get(character);
			
			if(valueCharacter > max) {
				max = valueCharacter;
			}
		}
    	
    	return max * word.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

