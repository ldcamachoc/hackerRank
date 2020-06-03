package com.hackerrank.problemSolutions.algorithms.easy.appleorange;

import java.util.Scanner;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	
    	int countApplesSuccess  = calculateFruitsInRange(s,t,a,apples);
    	int countOrangesSuccess = calculateFruitsInRange(s,t,b,oranges);;
    	
    	System.out.println(countApplesSuccess);
    	System.out.println(countOrangesSuccess);

    }
    
    private static int calculateFruitsInRange(int s, int t, int positionFruit, int[] fruits) {
    	int countFruitSuccess  = 0;
    	
    	for (int index = 0; index < fruits.length; index++) {
			int fruit = fruits[index];
			
			int resultfruit = positionFruit + fruit;
			boolean isInRange = isInRange(s, t, resultfruit);
			
			if(isInRange) {
				countFruitSuccess++;
			}			
		}
    	
    	return countFruitSuccess;
    }
    
    
    private static boolean isInRange(int s, int t, int value) {
    	
    	if(value >= s && value <= t) {
    		return true;
    	}
    	
    	
    	return false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}

