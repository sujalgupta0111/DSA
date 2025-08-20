package com.Maths.leetcode;

public class dobule_reversal_2119 {

	static int rverse(int num) {
		int take, sum = 0, check;

		check = num;
		while (num != 0) {
			take = num % 10;
			sum = sum * 10 + take;
			num = num / 10;
		}

		return sum;

	}

	public static boolean isSameAfterReversals(int num) {
		int check = num;
		System.out.println(check);
		int a = rverse(num);
		System.out.println(a);
		System.out.println();
		int b = rverse(a);
		System.out.println(b);
		System.out.println(a == b);
		if (a == b)
			return true;
		return false;

	}

	public static void main(String[] args) {
		System.out.println(isSameAfterReversals(526));

	}

}
