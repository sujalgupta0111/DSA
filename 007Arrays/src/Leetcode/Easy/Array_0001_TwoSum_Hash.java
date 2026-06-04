package Leetcode.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Array_0001_TwoSum_Hash {
	public static int[] twoSum(int[] nums, int target) {
		HashMap< Integer, Integer>  record = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length;i++) {
			int difference = target -nums[i];
			
			if(record.containsKey(difference)) {
				return new int[] {record.get(difference),i};
			}
			record.put(nums[i],i );
		}

		

		return new int[2];

	}

	public static void main(String[] args) {
		int arr[]= {2,7,11,15};
		int target =9;
		System.out.println(Arrays.toString(twoSum(arr,target)));

	}

}


