package com.Maths.leetcode;

public class Average_Value_of_Even_Numbers_That_Are_Divisible_by_Three_2455 {

	public static int averageValue(int[] nums) {
		int sum = 0, count = 0;

		for (int a : nums) {
			if (a % 6 == 0) {
				count++;
				sum += a;
			}
		}
		if (sum == 0)
			return 0;
		return sum / count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 10, 12, 15 };
		System.out.println(averageValue(arr));

	}

}
