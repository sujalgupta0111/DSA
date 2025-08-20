package com.leetcode;

import java.math.BigInteger;

public class Add_Binary_67 {

    public static void main(String[] args) {

        String a = "001";
        String b = "011";
        System.out.println(binary(a, b));
    }

    public static String binary(String a, String b) {
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        int base = 2,Sum = 0;
        int carry = 0;
        StringBuilder result = new StringBuilder();
System.out.println(1%2);
        while (l1 >= 0 || l2 >= 0) {
            int i = 0, j = 0;
           
            
            if (l1 >= 0) {
                i = a.charAt(l1--) - '0';
                System.out.println(i+" i");
            }
            if (l2 >= 0) {
                j = b.charAt(l2--) - '0';
               
            }
            Sum = i + j;
           

            if(Sum>=base)
            {
            	carry=1;
            	Sum=Sum-base;
            	result.append(Sum);
            	
            	
            }
            else
            {   carry =0;
            	result.append(Sum);
            }
            
            
        }
        if(carry==1)
        {
        	result.append(Sum);
        }
        
        return new String( result.reverse());
    }
}
