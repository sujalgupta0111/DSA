package com.Maths.question;
/*A parking lot has enough space for two-wheelers and four-wheelers. 
 * The number of vehicles parked gets doubled every 3rd day starting from the day after it was inaugurated. 
 * Write a function solution(int s, int n) that returns the number of vehicles parked at the end of N number 
 * of days. 
 * S be the number of vehicles on the first day. S, N is to be given as input by the user.

Finish attempt

question

Input: Two integer arguments s and n, s represent the number of vehicles on the first day and n number of days.

Output: An integer - representing the number of vehicles parked after n days.

Answer: (penalty regime: 5, 10, 30, ... %)*/
public class Question1 {
	
	public static int  solution(int s, int n)
	{
		int doub = n/3;
	
		for(int i =1; i<=doub; i++)
		{
			s=s*2;
		}
		
		return s;
	}
     
	public static void main(String[] args) {
	
		
	int s =2;
	int n=10;
	System.out.println(solution(s, n));

	}

}
