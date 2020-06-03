package com.geekforgeeks.problemsolutions.others;

public class MaxSum {
	// Returns maximum sum in a subarray of size k.
	public static int maxSum(int arr[], int n, int k) {
		// k must be greater
		if (n < k) {
			System.out.println("Invalid");
			return -1;
		}

		// Compute sum of first window of size k
		int res = 0;
		for (int i = 0; i < k; i++)
			res += arr[i];
		
		System.out.println(res);
		

		// Compute sums of remaining windows by
		// removing first element of previous
		// window and adding last element of
		// current window.
		int curr_sum = res;
		for (int i = k; i < n; i++) {
			System.out.println("------------------------");
			System.out.println("i: "+i+" k:"+k);
			System.out.println("arr[i]: "+arr[i]);
			System.out.println("arr[i - k]: "+arr[i - k]);
			System.out.println("rest: "+(arr[i] - arr[i - k]));
			
			curr_sum += arr[i] - arr[i - k];
			
			System.out.println("curr_sum:" +curr_sum);

			res = Math.max(res, curr_sum);
			
			System.out.println("res:" +res);

			
			System.out.println("------------------------");
		}

		return res;
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
		int k = 4;
		int n = arr.length;
		System.out.println(maxSum(arr, n, k));
	}

}
