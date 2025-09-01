package com.Maths.leetcode;

public class Smallest_even_multiple_2413 {
	
	
   public static  int smallestEvenMultiple(int n) {
	   
	   if(n%4==0)
		   return 4;
	   
	   int take  =n;
	  while(n%2==0)
	  {
		  take = n/2;
		  n/=2;
	  }
	  return take*2;
        
    }

	public static void main(String[] args) {
   System.out.println(smallestEvenMultiple(16));

	}

}
