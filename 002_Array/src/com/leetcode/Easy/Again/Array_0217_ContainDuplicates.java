package com.leetcode.Easy.Again;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class Array_0217_ContainDuplicates {

	public static boolean containsDuplicate(int[] nums) {

		Set<Integer> a = new HashSet();
		for (int i : nums) {
			if (!a.add(i))
				return true;
		}
		return false;
	}

//		public  static boolean containsDuplicate(int[] nums) {
//			Arrays.sort(nums); // Sort the array
//			for (int i = 0; i < nums.length - 1; i++) { // Compare adjacent elements
//				if (nums[i] == nums[i + 1]) {
//					return true;
//				}
//			}
//			return false;
//
//		}
//		

	public static void main(String[] args) {
		int arr[] = { 2, 7, 9, 2, 580 };
		int target = 9;
		System.out.println((containsDuplicate(arr)));

	}

}
