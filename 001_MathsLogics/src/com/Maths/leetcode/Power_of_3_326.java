package com.Maths.leetcode;

public class Power_of_3_326 {

	public static boolean isPowerOfThree(int n) {
		if (n == 1)
			return true;
		if (n <= 0)
			return false;
		if (n % 3 != 0)
			return false;
		return true == isPowerOfThree(n / 3);

	}

	/*
	 * public static boolean isPowerOfThree(int n) { if (n == 0) { return false; }
	 * else if (n == 1) { return true; }
	 * 
	 * while (n != 1) { if (n % 3 != 0) { return false; } n = n / 3; }
	 * 
	 * return true;
	 * 
	 * }
	 */

	public static void main(String[] args) {
		int c = 81;
		System.out.println(new Power_of_3_326().isPowerOfThree(c));

	}

}
