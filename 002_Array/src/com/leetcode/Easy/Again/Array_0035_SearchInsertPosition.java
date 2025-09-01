package com.leetcode.Easy.Again;

import java.util.Arrays;

public class Array_0035_SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 7, 3, 6, 5 };
		Arrays.sort(nums);
		System.out.println(searchInsert(nums, 5));
	}
}
