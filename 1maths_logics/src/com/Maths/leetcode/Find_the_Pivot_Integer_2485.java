package com.Maths.leetcode;

public class Find_the_Pivot_Integer_2485 {

	public static int pivotInteger(int n) {
		int sumofn = n * (n + 1) / 2;
		int x = 1;
		while (true) {
			int sumofx = x * (x + 1) / 2;
			int check = (sumofn - sumofx) + x;
			if (check == sumofx) {
				return x;
			}
			x++;
			if (x >= n)
				return -1;

		}

	}
	/*
	 * //this code time complexity is high public static int pivotInteger(int n){
	 * int x=1; while(true){ int sum=0; int sum2=0; for(int i=1;i<=x;i++){ sum+=i; }
	 * for(int i=x;i<=n;i++){ sum2+=i; } if(sum==sum2){ return x; } x++; if(x>=n)
	 * return -1; } }
	 */

	public static void main(String[] args) {
		System.out.println(pivotInteger(8));
	}

}
