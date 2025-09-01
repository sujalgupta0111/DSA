package com.Maths.leetcode;

public class K_Items_With_the_Maximum_Sum_2600 {

	public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

		if (numNegOnes != 0) {
			if (k > numZeros + numOnes) {
				int take = k - (numZeros + numOnes);

				return numOnes - take;
			} else {
				if (k > numOnes)
					return numOnes;
				else
					return k;

			}

		} else {
			if (k > numOnes)
				return numOnes;
			else
				return k;
		}

	}

	public static void main(String[] args) {
		System.out.println(kItemsWithMaximumSum(6, 6, 6, 13));
	}

}
