package com.Maths.leetcode.important;

import java.util.Arrays;

public class Missing_Number_268 {

	// by bit manupilation by xor operator also perform

	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int sumofl = n * (n + 1) / 2;

		return sumofl - Arrays.stream(nums).sum();
	}

	/*
	 * public static int missingNumber(int[] nums) { int n= nums.length; int sumofl=
	 * n*(n+1)/2; int sumofa=0; for(int i=0;i<n;i++) { sumofa+=nums[i]; } return
	 * sumofl-sumofa; }
	 */
	public static void main(String[] args) {

		int a[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(a));
	}

}
