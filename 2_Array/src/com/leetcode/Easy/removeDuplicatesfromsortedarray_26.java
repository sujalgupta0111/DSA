package com.leetcode.Easy;

public class removeDuplicatesfromsortedarray_26 {

	public int removeDuplicates(int[] nums) {
		int point = 0;

		for (int point2 = 1; point2 < nums.length; point2++) {

			if (nums[point] != nums[point2]) {
				point++;
				nums[point] = nums[point2];
			}
		}
		return point++;// ek esliye increase kiya kyoki phli condition me increce nahi hua tha
	}

	public static void main(String[] args) {

	}

}

class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int point = 0; // This will track the unique elements

		// Start iterating from the second element
		for (int point2 = 1; point2 < nums.length; point2++) {
			if (nums[point] != nums[point2]) { // If current element is different from last unique element
				point++; // Move the pointer for the unique element
				nums[point] = nums[point2]; // Update the unique element position
			}
		}

		return point + 1; // The number of unique elements (index + 1)
	}
}
