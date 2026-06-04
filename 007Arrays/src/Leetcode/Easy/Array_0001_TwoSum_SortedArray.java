package Leetcode.Easy;

import java.util.Arrays;

public class Array_0001_TwoSum_SortedArray {
	public static int[] twoSum(int[] nums, int target) {
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length - 1;

		while (start < end) {
			int sum = nums[start] + nums[end];

			if (sum > target) {
				end--;
			} else if (sum < target) {
				start++;
			} else if (sum == target) {
				return new int[] { start, end };
			}

		}
		return new int[2];

	}

	public static void main(String[] args) {
		int arr[] = { 3,2,4};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(arr, target)));

	}

}
