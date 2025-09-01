package com.Maths.leetcode.important;

public class Binary_Search_use_to_findunderroot {

	public static int ur(long x) {
		long start = 1;
		long mid = 0;
		long end = x + 1;
		while (start < end) {
			mid = (start + end) / 2;
			System.out.println(mid);
			if (mid > x / mid) {
				end = mid;
			} else {
				start = mid + 1;

			}

		}
	
		return (int) start;

	}

	public static void main(String... strings) {
		System.out.println(ur(10));
	}
}
