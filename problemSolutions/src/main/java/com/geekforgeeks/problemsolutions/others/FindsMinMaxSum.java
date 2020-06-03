package com.geekforgeeks.problemsolutions.others;

import java.util.Scanner;

public class FindsMinMaxSum {

	public static int findMaxSum(int arr[], int N, int K) {
		int sum = 0;
		for (int i = 0; i < K; i++) {
			sum += arr[i];

		}
		int max_sum = sum;
		int i;
		int result = max_sum;
		for (i = 1; i <= N - K; i++) {

			max_sum += arr[K + i - 1] - arr[i - 1];
			result = Math.max(max_sum, result);

		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int N = scn.nextInt();
			int K = scn.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = scn.nextInt();
			}
			System.out.println(FindsMinMaxSum.findMaxSum(arr, N, K));
			t--;
		}

	}
}
