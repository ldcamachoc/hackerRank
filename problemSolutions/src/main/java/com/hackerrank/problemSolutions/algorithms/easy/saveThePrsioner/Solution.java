package com.hackerrank.problemSolutions.algorithms.easy.saveThePrsioner;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
    	int result = m % n;
    	int position = (result + s -1) % n;
    	
    	if(position == 0) {
    		return n;
    	}else {
    		return position;
    	}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        StringBuilder builder = new StringBuilder();

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);
            builder.append(result);
            builder.append("\n");

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }
        System.out.println(builder.toString());

//        bufferedWriter.close();

        scanner.close();
    }
}

