package com.Maths.leetcode;

import java.util.HashSet;

public class Happy_number_202_2_hashset {

	public static int ss(int x) {
		int sum = 0;
		while (x != 0) {
			int take = x % 10;
			sum += take * take;
			x = x / 10;
		}
		return sum;
	}

	public static boolean isHappy(int n) {
		HashSet<Integer> s = new HashSet<>();
		while (true) {
			n = ss(n);
			if (n == 1) {
				return true;
			}
			if (!s.add(n)) {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		int a = 121;
		System.out.println(isHappy(a));

	}

}
