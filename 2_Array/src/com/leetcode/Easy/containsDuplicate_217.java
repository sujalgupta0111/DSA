package com.leetcode.Easy;

import java.util.Arrays;

public class containsDuplicate_217 {
public static  boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++)
        {
        	if(nums[i-1]==nums[i])
        		return true;
        }
        return false;
    }
	
public static void main(String[] args) {
	int nums[] = { 1, 7, 3, 6, 5 };
	System.out.println(containsDuplicate(nums));
}
}
