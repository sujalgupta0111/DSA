package com.Maths.leetcode;

public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {

	public static int sum(int a) {
		int sum = 0;
		while (a != 0) {
			int take = a % 10;
			sum += take;
			a /= 10;

		}
		return sum;
	}

	public static int differenceOfSum(int[] nums) {
		int sumofdigi = 0;
		int sumofnum = 0;
		
	/*	for(int num : nums)
		{
			sumofnum = num;
			if (num<= 9) {
				sumofdigi += num;
			} else {
				sumofdigi+=sum(num);
			}
		}*/
		
		
		
		for (int i = 0; i < nums.length; i++) {
			sumofnum += nums[i];
			if (nums[i] <= 9) {
				sumofdigi += nums[i];
			} else {
				sumofdigi+=sum(nums[i]);
			}

		}
        if(sumofnum-sumofdigi<0)
        return (sumofnum-sumofdigi)*-1;
		return (sumofnum-sumofdigi);
	}

	public static void main(String[] args) {
System.out.println(sum(55));
	}

}
