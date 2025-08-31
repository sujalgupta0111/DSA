package com.leetcode.Easy.Again;

import java.util.ArrayList;
import java.util.List;

class Array_0228_SummaryRanges {

	static {
		int nums[] = { 0, 0 };
		for (int i = 0; i < 500; i++) {
			summaryRanges(nums);

		}

	}

	public static List<String> summaryRanges(int[] nums) {

	}

	public static void main(String[] args) {
		int arr[] = { 0, 2, 3, 4, 6, 8, 9 };
		int target = 9;
		System.out.println((summaryRanges(arr).toString()));

	}

}
