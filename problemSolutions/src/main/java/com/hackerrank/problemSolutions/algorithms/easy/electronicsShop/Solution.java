package com.hackerrank.problemSolutions.algorithms.easy.electronicsShop;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboardsArray, int[] drives, int b) {
    	TreeSet<Integer> listSuma = new TreeSet<>();    
    	
//    	int indexKeyboard = keyboards.length -1;
//    	int indexDrives   = drives.length -1 ;  	
//    	
//    	for(int i = indexKeyboard; i >= 0; i--) {
//    		for(int j = indexDrives; j>= 0; j--) {
//        		int sum = keyboards[i] + drives [j];
//        		
//        		if(sum <= b) {
//        			listSuma.add(sum);
//        		}
//        	}
//    	}
//    	
//    	int maxSum = 0;
//    	
//    	if(listSuma.size() == 0) {
//    		maxSum = -1;
//    	}else {
//    		 maxSum = listSuma.last();
//    	}
    	
    	Integer[] keyboards = Arrays.stream(keyboardsArray).boxed().toArray(Integer[]::new);
    	
    	 Arrays.sort(keyboards, Collections.reverseOrder());//Descending order
         Arrays.sort(drives);//Ascending order
         
         int max = -1;
         for(int i = 0, j = 0; i < keyboards.length; i++){
             for(; j < drives.length; j++){
                 if(keyboards[i]+drives[j] > b) break; //This prevents j from incrementing
                 if(keyboards[i]+drives[j] > max)
                     max = keyboards[i]+drives[j];
             }
         }
    	
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] bnm = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);

//        bufferedWriter.write(String.valueOf(moneySpent));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
