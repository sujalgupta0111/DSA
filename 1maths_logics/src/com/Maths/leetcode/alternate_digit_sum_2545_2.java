package com.Maths.leetcode;

public class alternate_digit_sum_2545_2 {

	public static int alternateDigitSum(int n) {

		int even = 0;
		int odd = 0;
		int check = 0;

		while (n != 0) {
			int take = n % 10;

			if (check % 2 == 0) {

				even += take;
				check++;
			} else {

				odd -= take;
				check++;
			}

			n /= 10;
		}

		if (check % 2 == 0)
			return -1 * (odd + even);
		return odd + even;

	}

	public static void main(String... strings) {

		System.out.println(alternateDigitSum(111));
	}

}
/*
 * 521 111 886996
 */