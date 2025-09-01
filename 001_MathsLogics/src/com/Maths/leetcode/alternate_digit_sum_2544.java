package com.Maths.leetcode;

public class alternate_digit_sum_2544 {

	public static int reverse(int x) {
		int sum = 0;
		while (x != 0) {
			int take = x % 10;
			sum = sum * 10 + take;
			x /= 10;
		}
		return sum;
	}

	public static int alternateDigitSum(int x) {
		int n = reverse(x);
		System.out.println(n);
		int ans = 0;
		int check = 0;

		while (n != 0) {
			int take = n % 10;
			System.out.println(take);
			if (check % 2 == 0) {

				ans += take;
				check++;
			} else {

				ans -= take;
				check++;
			}

			n /= 10;
		}
		if (ans < 0)
			return ans;

		return ans;

	}

	public static void main(String... strings) {

		System.out.println(alternateDigitSum(25));
	}

}
/*
 * 521 111 886996
 */