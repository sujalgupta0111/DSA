package com.Maths.leetcode;

public class Reverse_integer {
	public static int reverse(int x) {
		long ans = 0;
		// yaha long esliye liya hai kyuki jab reverse hoga tho ho skata hai ki integer
		// ki value ko paar kaar de
		while (x != 0) {
			int temp = x % 10;
			ans = ans * 10 + temp;
			x /= 10;
		}
		// last me compare kara diya agar reverse hone ke baad integer ki value se bahar
		// jaye tho o anhi tho ans
		if (ans > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
			return 0;
		}

		return (int) ans;
	}

	public static void main(String... Sujal) {
		int num = 1534236469;
		System.out.println(reverse(num));
		System.out.println(Integer.MIN_VALUE + "|| 1534236469 > Integer.MAX_VALUE");
		System.out.println(Integer.MAX_VALUE + "|| 1534236469 > Integer.MAX_VALUE");
	}
}
