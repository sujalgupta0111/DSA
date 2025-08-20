package com.leetcode.Easy;

public class Greatest_Coomon_Divisor_of_array_1979 {

	static public int findGCD(int[] nums) {
		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
			if (min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println(max+" "+min);

		while (max != 0) {
			int temp = max;
			max = min % max;
			min = temp;

		}
		return min;
	}

	public static void main(String... strings) {
		int[] arr = { 2, 4, 16, 8, 3 };

		System.out.println(findGCD(arr));
	}
}
