package com.Maths.leetcode;

public class Perfect_Number_507 {

	public static boolean checkPerfectNumber(int num) {
		int sum = 0;
		int check = num;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum += i;
		}

		if (check == sum)
			return true;

		return false;

	}

	/*public boolean checkPerfectNumber(int num) {
		return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;

	}*/

	public static void main(String[] args) {
		int a = 7;

		System.out.println(checkPerfectNumber(a));

	}

}
