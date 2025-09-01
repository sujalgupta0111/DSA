package com.Maths.leetcode;

public class Count_Operations_to_Obtain_Zero_2169 {

	public static int countOperations(int num1, int num2) {
		int count = 0;
		while (num1 > 0 && num2 > 0) {
			/*if(num2==0)
				break;
			if(num1==0)
				break;*/

			if (num1 > num2) {
				num1 -= num2;
				
			}else {
				num2 -= num1;
				
			}
			count++;
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(countOperations(2, 2));

	}

}
