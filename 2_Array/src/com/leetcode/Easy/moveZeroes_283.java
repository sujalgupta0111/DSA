package com.leetcode.Easy;

class moveZeroes_283 {
   public void moveZeroes(int[] nums) {
		if (nums.length == 1) {
		} else {
			int p1 = 0;
			int p2 = 0;

			for (p1 = 0; p1 < nums.length; p1++) {
				if (p2 > nums.length)
					break;

				if (nums[p2] != 0) {
					p2++;
				} else {
					if (nums[p1] != 0) {
						nums[p2] = nums[p1];
						nums[p1] = 0;
						p2++;
					}
				}
			}
		}

	}
   
   
   public static void main(String ...strings )
   {
	   
   }
}