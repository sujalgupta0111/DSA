package com.Maths.leetcode.Again;

public class Maths_0258_AddDigitsWay2 {


	public static int addDigits(int num) {

		if (num < 9) {
			return num;
		}
		
		return 1+ (num-1)%9;

	}

	public static void main(String[] args) {
		System.out.println(addDigits(999));

	}

}
