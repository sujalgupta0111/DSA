package com.Maths.leetcode;

public class isPowerOfFour_342 {

	public boolean isPowerOfFour(int n) {

		if (n <= 0) {
			return false;
		} else if (n == 1) {
			return true;
		}

		while (n % 4 == 0) {
			n = n / 4;
		}

		return n==1;

	}

	public static void main(String[] args) {
		int n =16;
System.out.println(new isPowerOfFour_342().isPowerOfFour(n));
	}

}
