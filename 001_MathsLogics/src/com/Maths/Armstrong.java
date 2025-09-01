package com.Maths;
import java.lang.*;
import java.util.*;
public class Armstrong {
	
	public static int digit(int n)
	{
        int count=0;
		while (n!=0)
		{
			n=n/10;
			count++;
	    }
		return count;
	}
	
	public static boolean arm(int n)
	{
		int sum=0; int check = n;
		int digit = digit(n);
		 while (n!=0)
		 {
			 int od = n%10;
			 sum = (int) (sum + Math.pow(od,digit ));//pow method return value in double
			 n=n/10;
		 }
		 
		 if(sum == check)
		 {   
			 return true;  
		 }
		    return false;
	}
	public static int sod(int n)
	{
		int sum=0;
		while (n!=0)
		{
		 int od = n%10;
		 sum = sum+od;
		 n= n/10;
		}
		return sum;
	}
	
 public static void main(String ... strings)
 {
	 Scanner in = new Scanner(System.in);
	 int sum = 0;
	 System.out.println("Enter the start num"); 
	 int start = in.nextInt();
	 System.out.println("Enter the end num"); 
	 int end = in.nextInt();
	 
	 for (int i = start;i<=end;i++)
	 {
		 if(arm(i))
		 {
			System.out.println(i); 
		   sum = sum + sod(i); 
		 }
		
	 }
	 System.out.println("Sum of all is :- "+sum); 
	 
 }
}
