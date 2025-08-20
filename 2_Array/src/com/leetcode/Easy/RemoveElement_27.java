package com.leetcode.Easy;

public class RemoveElement_27 {

	public static int removeElement(int[] nums, int val) {
		int count=0;
		
		int j=0;
	
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i]==val)
			{
				nums[j]=nums[i];
			}else
			count++;
			
		}

		return count;

	}

	public static void main(String[] args) {

	}

}
