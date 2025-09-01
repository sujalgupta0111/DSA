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
		final StringBuilder arrow = new StringBuilder("->");
		List<String> ans = new ArrayList<>();
		int p = 0;
		int p1 = 0;

		for (p = 1; p < nums.length; p++) {
			if (nums[p] - nums[p - 1] != 1) {
				if (nums[p - 1] == nums[p1]) {
					ans.add(new StringBuilder().append(nums[p1]).toString());
				} else {
					ans.add(new StringBuilder().append(nums[p1]).append(arrow).append(nums[p - 1]).toString());
				}
				p1 = p;
			}
		}

		if (nums.length > 0) {
			if (nums[nums.length - 1] == nums[p1]) {
				ans.add(new StringBuilder().append(nums[p1]).toString());
			} else {
				ans.add(new StringBuilder().append(nums[p1]).append(arrow).append(nums[nums.length - 1]).toString());
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 2, 3, 4, 6, 8, 9 };

		System.out.println((summaryRanges(arr).toString()));

	}

}
