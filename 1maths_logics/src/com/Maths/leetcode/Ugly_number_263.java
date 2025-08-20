package com.Maths.leetcode;

/*Some optimal solutions */
public class Ugly_number_263 {

	public static boolean isUgly(int n) {
		if (n == 0)
			return false;
		while (n % 2 == 0)
			n /= 2;
		while (n % 3 == 0)
			n /= 3;
		while (n % 5 == 0)
			n /= 5;
		if (n == 1) {
			return true;
		}
		return false;
	}

	/*
	 * public static boolean isUgly(int n) { if (n == 0) return false;
	 * 
	 * for (final int prime : new int[] {2, 3, 5}) while (n % prime == 0) n /=
	 * prime;
	 * 
	 * return n == 1;
	 */

	public static void main(String[] args) {
		System.out.println(isUgly(18));
	}

}
