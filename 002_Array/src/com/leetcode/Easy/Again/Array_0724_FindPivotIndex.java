package com.leetcode.Easy.Again;

class Array_0724_FindPivotIndex {

	public static int pivotIndex(int[] nums) {
		 int pivotindex=0;
	        int sumarray=0;
	        int sumafter=0;

	        for(int i:nums)
	        {
	            sumarray+=i;
	        }

	        for(int i =0;i<nums.length;i++){
	            if(sumafter==(sumarray-sumafter-nums[i])){
	                return i;
	                }
	            sumafter+=nums[i];
	        }
	       
	       return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 9, 2, 580 };
		int target = 9;
		System.out.println((pivotIndex(arr)));

	}

}
