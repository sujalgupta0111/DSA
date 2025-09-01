package com.Maths.leetcode.important;

public class Valid_perfect_Square_367 {

	/*public static boolean isPerfectSquare(int num) {

		long start = 1;
		long end = num;

		while (start < end) {
			long m = (start + end) / 2;
			if (m >= num / m)
				end = m;
			else
				start = m + 1;
		}

		return start * start == num;
	}*/
	
	
	public static boolean isPerfectSquare(int num) {
	 if(num==1)
		 return true;
	 for(int i=0;i<=num/2;i++ )
	 {
		 if(i*i==num)
			 return true;
		 else if(i*i>num)
		 {
			 break;
		 }
	 }
	 return false;
	}

	public static void main(String[] args) {
		int num = 2147395600;
		System.out.println(isPerfectSquare(num));
	}

}
