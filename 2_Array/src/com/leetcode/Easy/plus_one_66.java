package com.leetcode.Easy;

import java.util.Arrays;

public class plus_one_66 {
 public static void main(String ...strings )
 { 
	 int arr[] =  {7,9,9};
	 System.out.println(Arrays.toString(plusOne(arr))); 
 }
 public static int[] plusOne(int[] digits) {

 for (int i = digits.length - 1; i >= 0; i--) 
 {
	//jaab sare ke sare 9 honge tabhi posiibile ki array increment ka chance bane 
	 //ex[900]-->[9001]
	 //ex[899]-->[900]
	 //ex[999]-->[1000]
	 
	 //tho hum kiya karte hai ki check karte hai last se ki value agar se kaam hui tho seedha return kara denge 
	 //agar nahi hui  tho us case mee jis i paar 9 hai use 0 kaar denge fir decrement hoga i usse then usse phela ki valu increment hogi aur return ho jayegi 
	 //agar 999 hua tho mtlb sirf array ke 0 paar 1 hoga baki jagha zero so hum new array banayege aur 0 paar 1 rakh kaar return kara denge 
	 if (digits[i] < 9)
		      { 
		        ++digits[i];
		        return digits;
		      }
		      digits[i] = 0;
 }

int[] ans = new int[digits.length + 1];
		    ans[0] = 1;
		    return ans;
		  
		
	    
	   
  }
}


