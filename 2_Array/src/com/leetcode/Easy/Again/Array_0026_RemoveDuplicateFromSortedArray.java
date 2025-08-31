package com.leetcode.Easy.Again;

class Array_0026_RemoveDuplicateFromSortedArray {

	static {
		int nums[] = { 0, 0 };
		for (int i = 0; i < 500; i++) {
			removeDuplicates(nums);

		}

	}

	public static int removeDuplicates(int[] nums) {
		int p2 = 0;
		int p = 0;
		int count = 0;
		for (p = 0; p < nums.length; p++) {
			if (nums[p2] != nums[p]) {
				nums[++p2] = nums[p];
				count++;
			}
		}

		return ++count;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 9, 2, 580 };
		int target = 9;
		 System.out.println((removeDuplicates(arr)));

	}

}
