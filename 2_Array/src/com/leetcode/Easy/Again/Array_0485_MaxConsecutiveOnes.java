package com.leetcode.Easy.Again;

class Array_0485_MaxConsecutiveOnes {

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}
		if (count > max) {
			max = count;
		}
		return max;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 9, 2, 580 };
		int target = 9;
		System.out.println((findMaxConsecutiveOnes(arr)));
		String s = new String("sujal");
		String s1 = s.toLowerCase();
		String s2 = s.toUpperCase();
		String s3 = s.toString();
		System.out.println(s==s1);
		System.out.println(s==s3);

	}

}
