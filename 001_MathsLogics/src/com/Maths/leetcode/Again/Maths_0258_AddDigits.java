package com.Maths.leetcode.Again;

public class Maths_0258_AddDigits {
	public static int add(int num) {
		int sum = 0;

		while (num != 0) {
			int take = num % 10;
			sum = sum + take;
			num /= 10;
		}
		return sum;

	}

	public static int addDigits(int num) {

		if (num < 9) {
			return num;
		}
		while (true) {

			num = add(num);
			if (num < 9)
				break;

		}
		return num;

	}

	public static void main(String[] args) {
		System.out.println(addDigits(38));

	}

}
