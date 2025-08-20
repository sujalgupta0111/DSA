package com.Maths.leetcode.important;

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
		return (int) start ;
	}

	public static void main(String... strings) {
		//long x = 9819828;
		long x = 10;
		
		System.out.println(mySqrt(x));
		
	}

}
