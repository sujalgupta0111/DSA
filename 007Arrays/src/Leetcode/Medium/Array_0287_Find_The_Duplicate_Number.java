package Leetcode.Medium;

import java.util.*;

public class Array_0287_Find_The_Duplicate_Number {
	  public static  int findDuplicate(int[] nums) {
	        Set col = new HashSet();

	        for(int i=0;i<nums.length;i++){
	            if(col.contains(nums[i])){
	                return nums[i];
	            }
	            col.add(nums[i]);
	        }
	        
	       
	        return 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
