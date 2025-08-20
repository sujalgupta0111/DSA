package com.Maths.leetcode;

public class Count_the_Digits_That_Divide_a_Number_2520 {
	public static int countDigits(int num) {
		int check = num;
		int count = 0;
		if (num < 9)
			return 1;

		while (num != 0) {
			int take = num % 10;
			if (check % take == 0)
				count++;
			num /= 10;
		}

		return count;

	}

	public static void main(String[] args) {

		System.out.println(countDigits(121));

	}

}
