package com.Maths.leetcode;

public class Happy_number_202_floyd_cyclic_detection_algorithm {

	static public boolean isHappy(int n) {
		int slow = squaredSum(n);
		int fast = squaredSum(squaredSum(n));

		while (slow != fast) {
			slow = squaredSum(slow);
			fast = squaredSum(squaredSum(fast));
		}

		return slow == 1;
	}

	static int squaredSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += Math.pow(n % 10, 2);
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 1;
		boolean t = isHappy(n);
		System.out.println(t);

	}

}
