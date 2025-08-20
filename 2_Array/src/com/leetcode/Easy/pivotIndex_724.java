package com.leetcode.Easy;

public class pivotIndex_724 {

	public static int pivotIndex(int[] nums) {
		
		
		int pivot=0;
		int soa=0;
		int ls=0;
		for(int a : nums)
		{
			soa+=a;
		}

		for(int i=0; i< nums.length;i++)
		{
			if(ls== soa-ls-nums[i])
				return i;
			
		 ls+=nums[i];
		}
		return -1;
		

		/*
		 * int pivot = 0; int rs = 0; int ls = 0; int i = 0; boolean flag = true;
		 * 
		 * while(flag) { rs=0; ls=0; for(i=0;i<nums.length;i++)//ls rs nikalne ke liye
		 * bass { if(i>pivot) { rs+=nums[i]; }else if(i<pivot) { ls+=nums[i]; } }
		 * System.out.println(rs+" "+ls+" "+ pivot); if(ls== rs)// jab index o hoga tho
		 * { return pivot; } pivot++; if(pivot>=nums.length) { flag=false; }
		 * 
		 * }
		 * 
		 * return -1;
		 */

	}

	public static void main(String[] args) {
		int nums[] = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(nums));
	}

}
