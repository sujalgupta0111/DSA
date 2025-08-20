package com.Maths.leetcode;

public class Three_Divisior_1952 {

	public static boolean isThree(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;

			}
		}
		if (count == 3) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		int n = 7;
		boolean t = isThree(n);
		System.out.println(45 / 2);

	}

}
