package com.leetcode.Easy;

import java.util.Arrays;

public class searchInsert_35_binary_search {

	public static  int searchInsert(int[] nums, int target) {

		int start = 0;
		int end = nums.length;
		int mid = (start + end ) / 2;

		for (int i = 0; i < nums.length; i++) {
			if (nums[mid] == target) {
				return mid;

			}
			if (nums[mid] < target) {
				start = mid + 1; // Move right
			} else {
				end = mid - 1; // Move left
			}
		}
		return 1;

	}

	public static void main(String[] args) {
		int nums[] = { 1, 7, 3, 6, 5 };
		Arrays.sort(nums);
		System.out.println(searchInsert(nums,5));
	}
	}

