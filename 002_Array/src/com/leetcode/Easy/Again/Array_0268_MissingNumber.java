package com.leetcode.Easy.Again;

class Array_0268_MissingNumber {

	public static int missingNumber(int[] nums) {
		int len = nums.length;
		int sumofArray = 0;
		int sumofn = (len * (len + 1)) / 2;
		for (int i = 0; i < len; i++) {
			sumofArray += nums[i];
		}
		return sumofn - sumofArray;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 9, 2, 580 };
		int target = 9;
		System.out.println((missingNumber(arr)));

	}

}
