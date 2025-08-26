package com.leetcode.Easy.Again;

class Array_1979_GreatestCommonDivisor {

	public static int findGCD(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
			if (nums[i] < min)
				min = nums[i];
		}

		while (max != 0) {
			int temp = max;
			max = min % max;
			min = temp;
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 9, 2, 580 };
		int target = 9;
		System.out.println((findGCD(arr)));

	}

}
