package com.hackerrank.problemSolutions.java.easy.loops1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        IntStream.range(1, 11).forEach(x -> System.out.println(String.format("%d x %d = %d", N, x, N*x)));

        scanner.close();
    }
}
