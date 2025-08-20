package com.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges_228 {

	public static List<String> summaryRanges(int[] nums) {
		final String arrow = "->";
		List<String> ans = new ArrayList<String>();
		if (nums.length == 0)
			return ans;

		

		int p = 0;
		int i = 0;

		for (i = 1; i < nums.length; i++) {
			StringBuilder s = new StringBuilder();

			if (nums[i] - nums[i - 1] != 1) {
				if (p == (i - 1)) {

					s.append(nums[p]);
					
					p = i;
				} else {

					s.append(nums[p]).append("->").append(nums[i - 1]);
					
					p = i;
				}
				ans.add(s.toString());
			}
			

		}
		StringBuilder s = new StringBuilder();
		if ((i - 1) == p) {

			s.append(nums[p]);
			ans.add(s.toString());

		} else {

			s.append(nums[p]).append("->").append(nums[i - 1]);
			ans.add(s.toString());
		}

		return ans;
	}

	public static void main(String... sujal) {

		int[] nums = { 0, 1, 2, 4, 5, 7 };
		System.out.println(nums.length);
		List<String> result = summaryRanges(nums);
		System.out.println(result);

	}

}
