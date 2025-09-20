package com.Maths.leetcode.Again;

public class Maths_2119_NumberAfterDoubleReversal {

	public static int alternateDigitSum(int n) {
		int t = n;
		int Osum = 0;
		int Esum = 0;
		int count = 0;
		int x = 0;

		while (n != 0) {
			int take = n % 10;
			if (count % 2 == 0) {
				Esum += take;
			} else {
				Osum += take;
			}
			count++;
			x = n;
			n /= 10;
		}
		int ans = Esum - Osum;
		if (count % 2 == 0)
			return ans;

		return ans;
	}

	public static void main(String[] args) {
		System.out.println(alternateDigitSum(271));

	}

}
