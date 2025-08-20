package com.Maths.leetcode;

public class Sqrt_underroot_69 {

	static public int mySqrt(long x) {
		long start = 1;
		long end = x + 1;

		while (start < end) {
			long m = (start + end) / 2;
			if (m > x / m)
				end = m;
			else
				start = m + 1;
		}

		// l := the minimum number s.t. l * l > x
		return (int) start * 1;
	}

	public static void main(String... strings) {
		long x = 9819828;
		System.out.println(mySqrt(x));
		float p = 567.88f;
		System.out.println(++p);
	}

}
