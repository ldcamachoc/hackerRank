package com.hackerrank.problemSolutions.algorithms.warmup.birthdayCakeCandles;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
    	Map<Integer, Integer> mapResults = new HashMap<Integer, Integer>();
    	
    	for (int index = 0; index < ar.length; index++) {
			int number = ar[index];
			
			if(mapResults.containsKey(number)) {
				mapResults.put(number, mapResults.get(number)+1);
			}else {
				mapResults.put(number, 1);
			}
			
		}
    	
    	int maxCount = 0;
    	int count =0;
    	int heightHandle = 0;
    	
    	for (Map.Entry<Integer, Integer> entrySet : mapResults.entrySet()) {
    		
    		if(count==0) {
    			maxCount = entrySet.getValue();
    			heightHandle = entrySet.getKey();
    			count++;
    		}
    		
			if(entrySet.getKey() > heightHandle) {
				maxCount = entrySet.getValue();
				heightHandle = entrySet.getKey();
			}
		}
    	
    	System.out.println(heightHandle+":"+maxCount);
    	
    	return maxCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}



