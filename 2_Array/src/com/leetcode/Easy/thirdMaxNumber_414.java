package com.leetcode.Easy;

import java.util.Arrays;

public class thirdMaxNumber_414 {
	/*
	 * public static int thirdMax(int[] nums) { int[] uN =
	 * Arrays.stream(nums).distinct().sorted().toArray();
	 * System.out.println(Arrays.toString(uN)); if (uN.length == 1) { return uN[0];
	 * } else if (uN.length == 2) { return uN[1]; } else { return uN[uN.length - 3];
	 * } }
	 */

	public static int thirdMax(int[] nums) {
		int max1 = Integer.MIN_VALUE;
		int max2 =Integer.MIN_VALUE;
		int max3 =Integer.MIN_VALUE;
		if (nums.length == 1) {
			return nums[0];
		} else if (nums.length == 2) {
			if(nums[0]>nums[1]) {return nums[0];}
			else {return nums[1];}
		}

		for (int i = 0; i < nums.length; i++) {
			
			if(max1!=nums[i] && max2!=nums[i] && max3!=nums[i] ) {
			if (max1 < nums[i]) {
				max3 = max2;
				max2 = max1;
				max1 = nums[i];
			} else if (max2 < nums[i]) {
				max3 = max2;
				max2 = nums[i];

			} else if (max3 < nums[i]) {
				max3 = nums[i];

			}
		}
		}
		return max3 == Integer.MIN_VALUE? (int) max1 : (int) max3;
	}

	public static void main(String[] args) {

		int a[] = {2,2,3,1};

		System.out.println(thirdMax(a));

	}

}
