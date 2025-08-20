package com.leetcode.Easy;

import java.util.Arrays;

public class twoSum_1 {

	public static int[] twoSum(int[] nums, int target) {

		
int count =0;
		for (int i = 1; i < nums.length; i++) {
			
            for (int j = i; j < nums.length; j++) {
            	count++;
            	System.out.println("**************"+count+"******************");
            	System.out.println((j-i)+" j-->  "+j+" i->"+i);
            	System.out.println(nums[j-i]+"  "+nums[j]);
            	
                if (nums[j] + nums[j - i] == target) {
                	
                	
                       return new int[] { j - i, j };
                }
            }
		}
		
			

		return new int[] { -1, -1 };

	}

	public static void main(String[] args) {
		int nums[] = {11,2,15,7};
		int target = 9;

		System.out.println(Arrays.toString(twoSum(nums, target)));

	}

}
