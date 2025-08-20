package com.Maths.leetcode;

public class Find_the_Sum_of_EncryptedIntegers {

	public static int sum(int num) {
		if (num <= 9)
			return num;
		if (num == 1000)
			return 1111;
		int arr[] = { 11, 111 };
		int max = 0;
		int count = 0;
		int check = num;
		while (num != 0) {
			count++;
			int take = num % 10;
			if (max < take)
				max = take;
			num /= 10;
		}

		if (count == 2)
			return max * arr[0];
		else
			return max * arr[1];
	}

	public static int sumOfEncryptedInt(int[] nums) {
		int sum = 0;

		for (int i : nums) {
			sum += sum(i);
		}
		return sum;

	}

	public static void main(String... strings) {
		int sum[] = { 1, 2, 3 };

		System.out.println(sumOfEncryptedInt(sum));
	}
}
