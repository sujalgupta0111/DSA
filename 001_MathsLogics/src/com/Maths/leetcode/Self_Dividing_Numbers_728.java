package com.Maths.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Self_Dividing_Numbers_728 {

	public static boolean self(int a) {
		int store = a;
		if (a <= 9)
			return true;
		if (a % 10 == 0)
			return false;
		while (a != 0) {
			int take = a % 10;
			if (take == 0)
				return false;
			if (store % take != 0) {
				return false;
			}
			a /= 10;
		}
		return true;
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> a = new ArrayList<>();

		for (int i = left; i <= right; i++) {
			if (self(i)) {
				a.add(i);
			}

		}

		return a;

	}

	public static void main(String[] args) {
		System.out.println(self(708));
	}

}
