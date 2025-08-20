package com.Maths.leetcode;

public class Numberof_Common_Factors_2427 {
	public static  int commonFactors(int a, int b) {
		int n=0;
		if (b > a) 
			n=a;
		else
			n=b;
		
		int count=0;
		for(int i=1; i<=n;i++)
		{
			if(a%i==0 && b%i==0)
			{
				count++;
			}
		}
		return count;

	}

	public static void main(String... strings) {
    System.out.println(commonFactors(30,25));
	}
}
