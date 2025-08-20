package com.Maths.leetcode;

public class Ugly_number_2_264 {

	public static boolean isUgly(int n) {
		int i = 0;
		boolean flag = false;
		int[] div = { 2, 3, 5 };

		if (n == 1 )
		return true;
		if (n==0)
			return false;

		while (n != 1) {
			if (i >= 3)
				return false;

			if (n % div[i] == 0) {
				flag = true;
			System.out.println(	n /= div[i]);
			} else {
				i++;
			}

		}
		return flag;

	}

	public static void main(String[] args) {
   System.out.println(isUgly(0));
	}

}
