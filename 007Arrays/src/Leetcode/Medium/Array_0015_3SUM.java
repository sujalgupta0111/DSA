package Leetcode.Medium;

import java.util.*;

public class Array_0015_3SUM {

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i < len - 2; i++) {

			// ❌ Galti: agar same element se start karenge to duplicate triplet banenge
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			int start = i + 1;
			int end = len - 1;

			while (start < end) {

				if (nums[start] + nums[end] == (-1 * nums[i])) {
					List<Integer> fill = new ArrayList<>();
					// yahan vo 3 element ka pair daal rhae hai list me
					fill.add(nums[i]);
					fill.add(nums[start]);
					fill.add(nums[end]);
					ans.add(fill);

					start++;
					end--;

					// duplicate elements ko skip nahi kar rahe the
					while (start < end && nums[start] == nums[start - 1])
						start++;
					while (start < end && nums[end] == nums[end + 1])
						end--;

				} else if (nums[start] + nums[end] < (-1 * nums[i])) {
					start++;
				} else {
					end--;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
