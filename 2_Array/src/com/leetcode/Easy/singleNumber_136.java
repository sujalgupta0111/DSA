package com.leetcode.Easy;

public class singleNumber_136 {

	public static int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int p=0;
        while(p<nums.length)
        {
        	boolean pairmilgaya= true;
        	for(int i=0; i<nums.length;i++)// haar bar
        	{
        		if(i==p)
        			continue;
        		if(nums[p]== nums[i])
        		{
        			p++;
        			pairmilgaya=false;
        			break;
        		}
        	}
        	if(pairmilgaya)
        	{return nums[p];}
        }
        return -1;

    }

	public static void main(String[] args) {
		int nums[] = {2,2,1 };
		System.out.println(singleNumber(nums)); // Output: 1
	}
}
