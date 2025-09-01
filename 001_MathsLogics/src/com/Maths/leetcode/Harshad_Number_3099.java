package com.Maths.leetcode;

public class Harshad_Number_3099 {

	public static int sumOfTheDigitsOfHarshadNumber(int x) {
		if (x < 10)
			return x;

		int check = x;
		int sum = 0;
		
		while(x!=0)
		{
			int take = x%10;
			sum+=take;
			x/=10;
		}
		
		
		if(check%sum==0) 
			return sum;
		return -1;
		
		

	}

	public static void main(String... strings) {

	}
}
