package problem;

import java.util.*;

public class Single2 {

	public static int singleNumber(int[] nums) {
		Set<Integer> take = new HashSet();
		Set<Integer> store = new HashSet();

		for (int i = 0; i < nums.length; i++) {
			if (!store.contains(nums[i])) {
				if (!take.add(nums[i])) {
					store.add(nums[i]);

					take.remove(nums[i]);

				}
			}
		}

		for (int a : take) {
			System.out.println(a);
		}

		return 7;

	}

	public static void main(String[] args) {

		int arr[] = { 0, 1, 0, 1, 0, 1, 99 };
		singleNumber(arr);

	}

}
