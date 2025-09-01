package com.Maths.leetcode.important;

import java.util.ArrayList;
import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers_628 {
	public static int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int t = nums.length - 1;
		int max1 = nums[t] * nums[t - 1] * nums[t - 2];
		int max2 = nums[0] * nums[1] * nums[t];

		return Math.max(max1, max2);

	}

	public static void main(String[] args) {
		System.out.println();
	}

}
/*
 * class Solution { public int maximumProduct(int[] nums) { int largest =
 * Integer.MIN_VALUE; int sLargest = Integer.MIN_VALUE; int tLargest =
 * Integer.MIN_VALUE;
 * 
 * int minA = Integer.MAX_VALUE; int minB = Integer.MAX_VALUE;
 * 
 * for (int num : nums) { // Update largest, second-largest, and third-largest
 * if (num > largest) { tLargest = sLargest; sLargest = largest; largest = num;
 * } else if (num > sLargest) { // No need to check `num < largest` tLargest =
 * sLargest; sLargest = num; } else if (num > tLargest) { // No need to check
 * `num < sLargest` tLargest = num; }
 * 
 * // Update smallest and second-smallest if (num < minA) { minB = minA; minA =
 * num; } else if (num < minB) { minB = num; } }
 * 
 * return Math.max(largest * sLargest * tLargest, minA * minB * largest); } }
 */
