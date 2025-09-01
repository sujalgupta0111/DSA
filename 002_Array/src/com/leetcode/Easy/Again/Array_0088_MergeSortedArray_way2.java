package com.leetcode.Easy.Again;

class Array_0088_MergeSortedArray_way2 {
	// es question me bass change ho kaar return ho raha hai num1

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int k = 0;
		int j = 0;
		int[] nums1copy = new int[nums1.length];
		System.arraycopy(nums1, 0, nums1copy, 0, nums1.length);
		
		for (int i = 0; i < m + n; i++) {
			if (k >= m) {
				nums1[i] = nums2[j++];
			}
			// If all elements from nums2 are used
			else if (j >= n) {
				nums1[i] = nums1copy[k++];
			}
			// Compare and choose smaller
			else if (nums1copy[k] > nums2[j]) {
				nums1[i] = nums2[j++];
			} else {
				nums1[i] = nums1copy[k++];
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 9, 2, 580 };
		int target = 9;
		// System.out.println((merge(arr)));

	}

}
