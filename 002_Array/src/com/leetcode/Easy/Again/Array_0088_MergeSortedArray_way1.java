package com.leetcode.Easy.Again;

import java.util.Arrays;

class Array_0088_MergeSortedArray_way1 {
	//es question me bass change ho kaar return ho raha hai num1

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		for (int i = 0; i < m + n; i++) {
			if (i < m) {

			} else {
				nums1[i] = nums2[i - m];
			}

		}
		Arrays.sort(nums1);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 9, 2, 580 };
		int target = 9;
		//System.out.println((merge(arr)));

	}

}
